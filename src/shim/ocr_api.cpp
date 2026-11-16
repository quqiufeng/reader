// ocr_api.cpp — C ABI over the vendored PP-OCRv4 engine (src/ocr/ocr.cpp).
//
// CPU only. Designed for LuaJIT FFI:
//   int   rd_ocr_init(const char *model_dir);   /* 0 = ok, NULL dir = auto */
//   char *rd_ocr_text(const char *image_path);  /* malloc'd UTF-8, NULL on error */
//   char *rd_ocr_boxes(const char *image_path); /* malloc'd JSON array */
//   void  rd_ocr_free(char *p);
//   const char *rd_ocr_provider(void);          /* "CPU" */
//   const char *rd_ocr_error(void);             /* last error, never NULL */
//   const char *rd_ocr_model_dir(void);         /* resolved model dir */
//
// Text layout: boxes are grouped into lines by vertical overlap, joined with a
// space when the horizontal gap exceeds a fraction of the line height and the
// boundary characters are not CJK (PP-OCR recognition is per-line and drops
// intra-line spaces for Latin script).

#include "../ocr/ocr.hpp"

#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <mutex>
#include <string>
#include <vector>

namespace {

std::mutex g_mutex;
ocr::Ocr *g_engine = nullptr;
std::string g_dir;
std::string g_err = "not initialized";

void SetErr(const std::string &e) { g_err = e; }

// UTF-8 decode of one codepoint; returns 0 on malformed input.
unsigned Decode(const std::string &s, size_t at, size_t *len) {
    if (at >= s.size()) return 0;
    unsigned char c = static_cast<unsigned char>(s[at]);
    if (c < 0x80) { *len = 1; return c; }
    int n = 0;
    unsigned cp = 0;
    if ((c & 0xE0) == 0xC0) { n = 2; cp = c & 0x1F; }
    else if ((c & 0xF0) == 0xE0) { n = 3; cp = c & 0x0F; }
    else if ((c & 0xF8) == 0xF0) { n = 4; cp = c & 0x07; }
    else { *len = 1; return 0; }
    if (at + n > s.size()) { *len = 1; return 0; }
    for (int i = 1; i < n; ++i) {
        unsigned char cc = static_cast<unsigned char>(s[at + i]);
        if ((cc & 0xC0) != 0x80) { *len = 1; return 0; }
        cp = (cp << 6) | (cc & 0x3F);
    }
    *len = static_cast<size_t>(n);
    return cp;
}

unsigned FirstCp(const std::string &s) {
    size_t l = 0;
    return Decode(s, 0, &l);
}

unsigned LastCp(const std::string &s) {
    size_t i = s.size();
    while (i > 0) {
        // walk back over continuation bytes
        size_t n = 1;
        for (size_t k = 1; k <= 4 && k <= i; ++k) {
            size_t at = i - k;
            unsigned char c = static_cast<unsigned char>(s[at]);
            if ((c & 0xC0) != 0x80) {
                size_t l = 0;
                Decode(s, at, &l);
                if (l == k) return Decode(s, at, &l);
                break;
            }
            n = k + 1;
        }
        (void)n;
        return 0;
    }
    return 0;
}

bool IsCJK(unsigned cp) {
    if (cp == 0) return false;
    return (cp >= 0x2E80 && cp <= 0x9FFF) ||   // CJK radicals, kana, unified ideographs
           (cp >= 0xA960 && cp <= 0xA97F) ||   // hangul jamo extended
           (cp >= 0xAC00 && cp <= 0xD7AF) ||   // hangul syllables
           (cp >= 0xF900 && cp <= 0xFAFF) ||   // compatibility ideographs
           (cp >= 0xFE30 && cp <= 0xFE4F) ||   // CJK compatibility forms
           (cp >= 0xFF00 && cp <= 0xFF60);     // fullwidth forms
}

struct Line {
    int y = 0, h = 0;
    std::vector<ocr::TextBox> boxes;
};

// Group boxes into visual lines, then join with newlines; insert intra-line
// spaces when the gap is wide enough to be a word break.
std::string Layout(const std::vector<ocr::TextBox> &boxes) {
    std::vector<ocr::TextBox> sorted = boxes;
    for (auto &b : sorted)
        for (size_t i = 0; i < b.text.size(); ++i)
            if (b.text[i] == '\n' || b.text[i] == '\r' || b.text[i] == '\t') b.text[i] = ' ';
    std::sort(sorted.begin(), sorted.end(), [](const ocr::TextBox &a, const ocr::TextBox &b) {
        if (std::abs(a.y - b.y) > std::max(4, std::min(a.h, b.h) / 2)) return a.y < b.y;
        return a.x < b.x;
    });

    std::vector<Line> lines;
    for (auto &b : sorted) {
        bool placed = false;
        for (auto &ln : lines) {
            int top = std::max(ln.y, b.y);
            int bot = std::min(ln.y + ln.h, b.y + b.h);
            if (bot - top > std::min(ln.h, b.h) / 2) {
                ln.boxes.push_back(b);
                ln.y = std::min(ln.y, b.y);
                ln.h = std::max(ln.y + ln.h, b.y + b.h) - ln.y;
                placed = true;
                break;
            }
        }
        if (!placed) {
            Line ln;
            ln.y = b.y;
            ln.h = b.h;
            ln.boxes.push_back(b);
            lines.push_back(ln);
        }
    }

    std::string out;
    for (size_t li = 0; li < lines.size(); ++li) {
        auto &ln = lines[li];
        std::sort(ln.boxes.begin(), ln.boxes.end(),
                  [](const ocr::TextBox &a, const ocr::TextBox &b) { return a.x < b.x; });
        if (li) out += '\n';
        int right = -1;
        int refh = 0;
        for (auto &b : ln.boxes) {
            if (b.text.empty()) continue;
            if (right >= 0) {
                int gap = b.x - right;
                // Reference height: the taller of the two neighbours.
                int hh = std::max(refh, b.h);
                if (hh <= 0) hh = b.h;
                bool wide = gap > static_cast<int>(0.28f * static_cast<float>(hh));
                if (wide && !IsCJK(LastCp(out)) && !IsCJK(FirstCp(b.text))) out += ' ';
            }
            out += b.text;
            if (b.x + b.w > right) right = b.x + b.w;
            refh = b.h;
        }
    }
    return out;
}

std::string ResolveDir(const char *dir) {
    if (dir && dir[0]) return dir;
    if (const char *e = std::getenv("READER_OCR_MODEL_DIR"))
        if (e[0]) return e;
#ifdef READER_OCR_MODEL_DIR
    return READER_OCR_MODEL_DIR;
#else
    return "/data/models/ocr";
#endif
}

// Caller must hold g_mutex.
ocr::Ocr *Get(const std::string &dir) {
    if (g_engine && g_dir == dir) return g_engine;
    delete g_engine;
    g_engine = nullptr;
    std::string det = dir + "/ch_PP-OCRv4_det_infer.onnx";
    std::string rec = dir + "/ch_PP-OCRv4_rec_infer.onnx";
    std::string dict = dir + "/ppocr_keys_v1.txt";
    FILE *f = std::fopen(det.c_str(), "rb");
    if (!f) {
        SetErr("model not found: " + det);
        return nullptr;
    }
    std::fclose(f);
    try {
        g_engine = new ocr::Ocr(det, rec, dict, /*use_cuda=*/false);
        g_dir = dir;
        g_err.clear();
    } catch (const std::exception &e) {
        SetErr(std::string("init failed: ") + e.what());
        g_engine = nullptr;
    } catch (...) {
        SetErr("init failed: unknown error");
        g_engine = nullptr;
    }
    return g_engine;
}

char *Dup(const std::string &s) {
    char *p = static_cast<char *>(std::malloc(s.size() + 1));
    if (!p) return nullptr;
    std::memcpy(p, s.data(), s.size());
    p[s.size()] = '\0';
    return p;
}

std::vector<ocr::TextBox> RunLocked(const char *path) {
    std::vector<ocr::TextBox> boxes;
    if (!path || !path[0]) {
        SetErr("empty path");
        return boxes;
    }
    ocr::Ocr *e = Get(ResolveDir(nullptr));
    if (!e) return boxes;
    try {
        boxes = e->Run(path);
        g_err.clear();
    } catch (const std::exception &ex) {
        SetErr(std::string("run failed: ") + ex.what());
        boxes.clear();
    } catch (...) {
        SetErr("run failed: unknown error");
        boxes.clear();
    }
    return boxes;
}

}  // namespace

extern "C" {

int rd_ocr_init(const char *model_dir) {
    std::lock_guard<std::mutex> lock(g_mutex);
    return Get(ResolveDir(model_dir)) ? 0 : -1;
}

const char *rd_ocr_provider(void) { return "CPU"; }

const char *rd_ocr_model_dir(void) {
    static std::string dir;
    dir = ResolveDir(nullptr);
    return dir.c_str();
}

const char *rd_ocr_error(void) { return g_err.empty() ? "" : g_err.c_str(); }

char *rd_ocr_text(const char *image_path) {
    std::lock_guard<std::mutex> lock(g_mutex);
    std::vector<ocr::TextBox> boxes = RunLocked(image_path);
    if (boxes.empty()) return nullptr;
    return Dup(Layout(boxes));
}

char *rd_ocr_boxes(const char *image_path) {
    std::lock_guard<std::mutex> lock(g_mutex);
    std::vector<ocr::TextBox> boxes = RunLocked(image_path);
    std::string out = "[";
    for (size_t i = 0; i < boxes.size(); ++i) {
        auto &b = boxes[i];
        if (i) out += ',';
        char buf[128];
        std::snprintf(buf, sizeof buf, "{\"x\":%d,\"y\":%d,\"w\":%d,\"h\":%d,\"score\":%.2f,\"text\":\"",
                      b.x, b.y, b.w, b.h, b.score);
        out += buf;
        for (char c : b.text) {
            if (c == '"' || c == '\\') out += '\\';
            if (static_cast<unsigned char>(c) < 0x20) continue;
            out += c;
        }
        out += "\"}";
    }
    out += "]";
    return Dup(out);
}

void rd_ocr_free(char *p) { std::free(p); }

}  // extern "C"
