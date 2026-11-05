#include <mupdf/fitz.h>
#include <mupdf/ucdn.h>

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <sys/time.h>
#include <dirent.h>
#include <unistd.h>
#include <limits.h>
#include <time.h>
#include <strings.h>

#define STB_IMAGE_WRITE_IMPLEMENTATION
#include "stb_image_write.h"

typedef struct rd_doc {
    fz_context *ctx;
    fz_document *doc;
} rd_doc;

int reader_mobi_to_epub(const char *src, const char *out);
static int mobi_to_epub(const char *src, char *out, size_t outsz);
static void books_cache_trim(const char *cache_root, const char *keep);

static fz_context *font_cache_ctx = NULL;
static fz_font *font_cache_regular = NULL;
static fz_font *font_cache_bold = NULL;

static void clear_font_cache(fz_context *ctx)
{
    if (font_cache_ctx != ctx) return;
    if (font_cache_regular) fz_drop_font(ctx, font_cache_regular);
    if (font_cache_bold) fz_drop_font(ctx, font_cache_bold);
    font_cache_regular = font_cache_bold = NULL;
    font_cache_ctx = NULL;
}

static fz_font *tsanger_font(fz_context *ctx, int bold)
{
    if (font_cache_ctx != ctx) {
        if (font_cache_ctx) {
            if (font_cache_regular)
                fz_drop_font(font_cache_ctx, font_cache_regular);
            if (font_cache_bold)
                fz_drop_font(font_cache_ctx, font_cache_bold);
        }
        font_cache_regular = font_cache_bold = NULL;
        font_cache_ctx = ctx;
    }

    fz_font **slot = bold ? &font_cache_bold : &font_cache_regular;
    if (*slot) return fz_keep_font(ctx, *slot);

    const char *env = bold ? getenv("READER_FONT_BOLD") : getenv("READER_FONT");
    const char *path = env && env[0] ? env :
        (bold ? "assets/fonts/TsangerJinKai02-W05.ttf"
              : "assets/fonts/TsangerJinKai02-W04.ttf");
    fz_font *font = NULL;
    fz_try(ctx) {
        font = fz_new_font_from_file(ctx, "TsangerJinKai02", path, 0, 0);
    }
    fz_catch(ctx) {
        font = NULL;
    }
    if (font) *slot = fz_keep_font(ctx, font);
    return font;
}

static fz_font *rd_load_system_font(fz_context *ctx, const char *name,
                                    int bold, int italic, int needs_exact_metrics)
{
    (void)italic;
    (void)needs_exact_metrics;
    if (name && (strstr(name, "Symbol") || strstr(name, "Math") ||
                 strstr(name, "Emoji") || strstr(name, "Dingbat") ||
                 strstr(name, "Wingding")))
        return NULL;
    return tsanger_font(ctx, bold);
}

static fz_font *rd_load_cjk_font(fz_context *ctx, const char *name,
                                 int ordering, int serif)
{
    (void)name;
    (void)ordering;
    (void)serif;
    return tsanger_font(ctx, 0);
}

static fz_font *rd_load_fallback_font(fz_context *ctx, int script, int language,
                                      int serif, int bold, int italic)
{
    (void)language;
    (void)serif;
    (void)italic;
    if (script == UCDN_SCRIPT_HAN || script == UCDN_SCRIPT_HIRAGANA ||
        script == UCDN_SCRIPT_KATAKANA || script == UCDN_SCRIPT_HANGUL ||
        script == UCDN_SCRIPT_BOPOMOFO)
        return tsanger_font(ctx, bold);
    return NULL;
}

static int has_ext(const char *path, const char *ext)
{
    size_t n = strlen(path), m = strlen(ext);
    if (n < m) return 0;
    for (size_t i = 0; i < m; i++) {
        char a = path[n - m + i];
        char b = ext[i];
        if (a >= 'A' && a <= 'Z') a = (char)(a - 'A' + 'a');
        if (b >= 'A' && b <= 'Z') b = (char)(b - 'A' + 'a');
        if (a != b) return 0;
    }
    return 1;
}

int rd_detect_format(const char *path)
{
    if (!path) return 0;
    if (has_ext(path, ".pdf")) return 1;
    if (has_ext(path, ".epub")) return 2;
    if (has_ext(path, ".mobi")) return 3;
    if (has_ext(path, ".azw3")) return 4;
    if (has_ext(path, ".txt")) return 5;
    if (has_ext(path, ".chm")) return 6;
    if (has_ext(path, ".cbz") || has_ext(path, ".cbr")) return 7;

    FILE *f = fopen(path, "rb");
    if (!f) return 0;
    unsigned char head[68];
    size_t n = fread(head, 1, sizeof(head), f);
    fclose(f);

    if (n >= 4 && memcmp(head, "%PDF", 4) == 0) return 1;
    if (n >= 2 && head[0] == 'P' && head[1] == 'K') return 2;
    if (n >= 68 && memcmp(head + 60, "BOOKMOBI", 8) == 0) return 3;
    if (n >= 4 && memcmp(head, "ITSF", 4) == 0) return 6;
    return 0;
}

static void path_basename_noext(const char *path, char *out, size_t outsz)
{
    const char *base = strrchr(path, '/');
    base = base ? base + 1 : path;
    const char *dot = strrchr(base, '.');
    size_t n = dot ? (size_t)(dot - base) : strlen(base);
    if (n >= outsz) n = outsz - 1;
    memcpy(out, base, n);
    out[n] = 0;
}

static int ensure_dir(const char *path)
{
    struct stat st;
    if (stat(path, &st) == 0) return S_ISDIR(st.st_mode) ? 0 : -1;
    return mkdir(path, 0700);
}

typedef struct cache_entry {
    char *path;
    time_t used;
    long size;
} cache_entry;

static void cache_touch(const char *path)
{
    struct stat st;
    if (stat(path, &st) != 0) return;
    struct timeval tv[2];
    tv[0].tv_sec = time(NULL);
    tv[0].tv_usec = 0;
    tv[1].tv_sec = st.st_mtime;
    tv[1].tv_usec = 0;
    utimes(path, tv);
}

static long cache_max_bytes(void)
{
    const char *env = getenv("READER_CACHE_MAX_MB");
    long mb = env && env[0] ? atol(env) : 4096;
    if (mb < 64) mb = 64;
    return mb * 1024L * 1024L;
}

static int cache_entry_oldest(const void *a, const void *b)
{
    const cache_entry *x = (const cache_entry *)a;
    const cache_entry *y = (const cache_entry *)b;
    if (x->used != y->used) return x->used < y->used ? -1 : 1;
    return 0;
}

static void cache_trim(const char *dir, long max_bytes)
{
    DIR *d = opendir(dir);
    if (!d) return;
    cache_entry *arr = NULL;
    size_t n = 0, cap = 0;
    long total = 0;
    struct dirent *de;
    while ((de = readdir(d)) != NULL) {
        if (de->d_name[0] == '.') continue;
        size_t len = strlen(de->d_name);
        if (len < 6 || strcasecmp(de->d_name + len - 5, ".epub") != 0) continue;
        char path[PATH_MAX];
        snprintf(path, sizeof(path), "%s/%s", dir, de->d_name);
        struct stat st;
        if (stat(path, &st) != 0 || !S_ISREG(st.st_mode)) continue;
        if (n == cap) {
            size_t ncap = cap ? cap * 2 : 64;
            cache_entry *tmp = (cache_entry *)realloc(arr, ncap * sizeof(*arr));
            if (!tmp) break;
            arr = tmp;
            cap = ncap;
        }
        arr[n].path = strdup(path);
        if (!arr[n].path) break;
        arr[n].used = st.st_atime > st.st_mtime ? st.st_atime : st.st_mtime;
        arr[n].size = (long)st.st_size;
        total += (long)st.st_size;
        n++;
    }
    closedir(d);
    if (n > 0 && total > max_bytes) {
        qsort(arr, n, sizeof(*arr), cache_entry_oldest);
        for (size_t i = 0; i < n && total > max_bytes; i++) {
            if (unlink(arr[i].path) == 0) total -= arr[i].size;
        }
    }
    for (size_t i = 0; i < n; i++) free(arr[i].path);
    free(arr);
}

static int safe_entry_name(const char *name)
{
    if (!name || !name[0]) return 0;
    if (name[0] == '/') return 0;
    if (strstr(name, "..")) return 0;
    if (strchr(name, '\\')) return 0;
    return 1;
}

int rd_extract_book(const char *path, const char *out_dir)
{
    if (!path || !out_dir) return -1;
    fz_context *ctx = fz_new_context(NULL, NULL, FZ_STORE_DEFAULT);
    if (!ctx) return -2;
    fz_register_document_handlers(ctx);
    char epub_path[PATH_MAX];
    const char *src = path;
    int fmt = rd_detect_format(path);
    if (fmt == 3 || fmt == 4) {
        if (mobi_to_epub(path, epub_path, sizeof(epub_path)) != 0) {
            fz_drop_context(ctx);
            return -3;
        }
        src = epub_path;
    } else if (fmt != 2) {
        fz_drop_context(ctx);
        return -4;
    }
    if (ensure_dir(out_dir) != 0) {
        fz_drop_context(ctx);
        return -5;
    }

    int count = 0;
    fz_archive *arch = NULL;
    fz_buffer *buf = NULL;
    fz_try(ctx) {
        arch = fz_open_archive(ctx, src);
        int n = fz_count_archive_entries(ctx, arch);
        for (int i = 0; i < n; i++) {
            const char *name = fz_list_archive_entry(ctx, arch, i);
            if (!safe_entry_name(name)) continue;
            size_t nlen = strlen(name);
            if (nlen && name[nlen - 1] == '/') continue;
            char dst[PATH_MAX];
            if (snprintf(dst, sizeof(dst), "%s/%s", out_dir, name)
                >= (int)sizeof(dst)) continue;
            for (char *p = dst + strlen(out_dir) + 1; *p; p++) {
                if (*p != '/') continue;
                *p = 0;
                ensure_dir(dst);
                *p = '/';
            }
            fz_drop_buffer(ctx, buf);
            buf = NULL;
            buf = fz_read_archive_entry(ctx, arch, name);
            unsigned char *data = NULL;
            size_t blen = fz_buffer_storage(ctx, buf, &data);
            FILE *f = fopen(dst, "wb");
            if (!f) continue;
            size_t w = fwrite(data, 1, blen, f);
            fclose(f);
            if (w == blen) count++;
        }
    }
    fz_catch(ctx) {
        count = -6;
    }
    fz_drop_buffer(ctx, buf);
    fz_drop_archive(ctx, arch);
    fz_drop_context(ctx);
    if (count > 0) {
        char parent[PATH_MAX];
        snprintf(parent, sizeof(parent), "%s", out_dir);
        char *slash = strrchr(parent, '/');
        if (slash) {
            *slash = 0;
            books_cache_trim(parent, out_dir);
        }
    }
    return count;
}

static long tree_size(const char *path)
{
    struct stat st;
    if (lstat(path, &st) != 0) return 0;
    if (!S_ISDIR(st.st_mode)) return (long)st.st_size;
    DIR *d = opendir(path);
    if (!d) return 0;
    long total = 0;
    struct dirent *de;
    while ((de = readdir(d)) != NULL) {
        if (de->d_name[0] == '.' &&
            (de->d_name[1] == 0 || (de->d_name[1] == '.' && de->d_name[2] == 0)))
            continue;
        char p[PATH_MAX];
        if (snprintf(p, sizeof(p), "%s/%s", path, de->d_name) >= (int)sizeof(p))
            continue;
        total += tree_size(p);
    }
    closedir(d);
    return total;
}

static int tree_remove(const char *path)
{
    struct stat st;
    if (lstat(path, &st) != 0) return -1;
    if (!S_ISDIR(st.st_mode)) return unlink(path);
    DIR *d = opendir(path);
    if (!d) return -1;
    struct dirent *de;
    while ((de = readdir(d)) != NULL) {
        if (de->d_name[0] == '.' &&
            (de->d_name[1] == 0 || (de->d_name[1] == '.' && de->d_name[2] == 0)))
            continue;
        char p[PATH_MAX];
        if (snprintf(p, sizeof(p), "%s/%s", path, de->d_name) >= (int)sizeof(p))
            continue;
        tree_remove(p);
    }
    closedir(d);
    return rmdir(path);
}

typedef struct bookcache_entry {
    char *path;
    time_t used;
    long size;
} bookcache_entry;

static int bookcache_oldest(const void *a, const void *b)
{
    const bookcache_entry *x = (const bookcache_entry *)a;
    const bookcache_entry *y = (const bookcache_entry *)b;
    if (x->used != y->used) return x->used < y->used ? -1 : 1;
    return 0;
}

static void books_cache_trim(const char *cache_root, const char *keep)
{
    long max_bytes = cache_max_bytes();
    DIR *d = opendir(cache_root);
    if (!d) return;
    bookcache_entry *arr = NULL;
    size_t n = 0, cap = 0;
    long total = 0;
    struct dirent *de;
    while ((de = readdir(d)) != NULL) {
        if (strncmp(de->d_name, "book_", 5) != 0) continue;
        char path[PATH_MAX];
        if (snprintf(path, sizeof(path), "%s/%s", cache_root, de->d_name)
            >= (int)sizeof(path)) continue;
        struct stat st;
        if (stat(path, &st) != 0 || !S_ISDIR(st.st_mode)) continue;
        if (n == cap) {
            size_t ncap = cap ? cap * 2 : 16;
            bookcache_entry *tmp = (bookcache_entry *)realloc(arr, ncap * sizeof(*arr));
            if (!tmp) break;
            arr = tmp;
            cap = ncap;
        }
        arr[n].path = strdup(path);
        if (!arr[n].path) break;
        arr[n].used = st.st_mtime;
        arr[n].size = tree_size(path);
        total += arr[n].size;
        n++;
    }
    closedir(d);
    if (n > 0 && total > max_bytes) {
        qsort(arr, n, sizeof(*arr), bookcache_oldest);
        for (size_t i = 0; i < n && total > max_bytes; i++) {
            if (keep && strcmp(arr[i].path, keep) == 0) continue;
            if (tree_remove(arr[i].path) == 0) total -= arr[i].size;
        }
    }
    for (size_t i = 0; i < n; i++) free(arr[i].path);
    free(arr);
}

int rd_touch_path(const char *path)
{
    if (!path) return -1;
    struct timeval tv[2];
    tv[0].tv_sec = time(NULL);
    tv[0].tv_usec = 0;
    tv[1].tv_sec = tv[0].tv_sec;
    tv[1].tv_usec = 0;
    return utimes(path, tv);
}

static const char *epub_cache_dir(void)
{
    static const char *chosen = NULL;
    if (chosen) return chosen;
    const char *dirs[] = {
        "/dev/shm/native-reader-cache",
        "/tmp/native-reader-cache",
    };
    for (size_t i = 0; i < sizeof(dirs) / sizeof(dirs[0]); i++) {
        if (ensure_dir(dirs[i]) == 0) {
            chosen = dirs[i];
            return chosen;
        }
    }
    return NULL;
}

static int mobi_to_epub(const char *src, char *out, size_t outsz)
{
    const char *cache = epub_cache_dir();
    if (!cache) return -1;

    char name[512];
    path_basename_noext(src, name, sizeof(name));
    snprintf(out, outsz, "%s/%s.epub", cache, name);

    struct stat ss, es;
    if (stat(out, &es) == 0 && stat(src, &ss) == 0 &&
        es.st_mtime >= ss.st_mtime && es.st_size > 0) {
        return 0;
    }

    int rc = reader_mobi_to_epub(src, out);
    if (rc != 0) return -2;

    if (stat(out, &es) != 0 || es.st_size == 0) return -3;
    return 0;
}


static void build_user_css(char *css, size_t n, float em, float lf, float margin)
{
    if (em < 4) em = 22;
    if (lf < 1) lf = 1.6;
    if (margin < 0) margin = 0;
    snprintf(css, n,
        "body{margin:0;padding:0 %.0fpx;font-size:%.0fpt !important;font-style:normal !important;}"
        "p{font-size:%.0fpt !important;font-style:normal !important;margin:0 0 0.8em 0;line-height:%.2f !important;text-align:justify;}"
        "i,em{font-style:normal !important;}"
        "*{font-family:sans-serif !important;font-style:normal !important;}"
        "p,div,section,li,blockquote,td{font-size:%.0fpt !important;line-height:%.2f !important;}"
        "div,section{width:auto!important;max-width:100%%!important;}"
        "img{max-width:100%%!important;height:auto!important;}"
        "table{max-width:100%%!important;}"
        "a{color:#1B365D;text-decoration:none;}"
        "pre,code{white-space:pre-wrap;}",
        margin, em, em, lf, em, lf);
}

static void *rd_open_impl(const char *path, int *err, float em, float lf, float margin)
{
    if (err) *err = 0;
    if (!path) {
        if (err) *err = -1;
        return NULL;
    }

    rd_doc *h = (rd_doc *)calloc(1, sizeof(rd_doc));
    if (!h) {
        if (err) *err = -2;
        return NULL;
    }

    h->ctx = fz_new_context(NULL, NULL, FZ_STORE_UNLIMITED);
    if (!h->ctx) {
        free(h);
        if (err) *err = -3;
        return NULL;
    }
    fz_install_load_system_font_funcs(h->ctx, rd_load_system_font,
                                      rd_load_cjk_font, rd_load_fallback_font);
    fz_register_document_handlers(h->ctx);
    if (em > 0) {
        char css[1024];
        build_user_css(css, sizeof(css), em, lf, margin);
        fz_set_user_css(h->ctx, css);
    } else {
        fz_set_user_css(h->ctx,
            "body{margin:0;padding:0;font-style:normal !important;}"
            "p{margin:0 0 0.8em 0;line-height:1.6;text-align:justify;font-style:normal !important;}"
            "i,em{font-style:normal !important;}"
            "div,section{width:auto!important;max-width:100%!important;}"
            "img{max-width:100%!important;height:auto!important;}"
            "table{max-width:100%!important;}"
            "a{color:#1B365D;text-decoration:none;}"
            "*{font-family:sans-serif !important;font-style:normal !important;}"
            "pre,code{white-space:pre-wrap;}");
    }

    char epub_path[PATH_MAX];
    const char *open_path = path;
    int fmt = rd_detect_format(path);
    if (fmt == 3 || fmt == 4) {
        if (mobi_to_epub(path, epub_path, sizeof(epub_path)) != 0) {
            if (err) *err = -5;
            fz_drop_context(h->ctx);
            free(h);
            return NULL;
        }
        open_path = epub_path;
    }

    fz_try(h->ctx) {
        h->doc = fz_open_document(h->ctx, open_path);
        if (fz_is_document_reflowable(h->ctx, h->doc)) {
            fz_layout_document(h->ctx, h->doc, 600, 800, em > 0 ? em : 12);
        }
    }
    fz_catch(h->ctx) {
        if (err) *err = -4;
        fz_drop_context(h->ctx);
        free(h);
        return NULL;
    }
    return h;
}

void *rd_open(const char *path, int *err)
{
    return rd_open_impl(path, err, 0, 0, 0);
}

void *rd_open_styled(const char *path, float em, float lf, float margin, int *err)
{
    return rd_open_impl(path, err, em, lf, margin);
}

void rd_close(void *handle)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h) return;
    if (h->doc) fz_drop_document(h->ctx, h->doc);
    if (h->ctx) {
        clear_font_cache(h->ctx);
        fz_drop_context(h->ctx);
    }
    free(h);
}

int rd_page_count(void *handle)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return 0;
    int n = 0;
    fz_try(h->ctx) {
        n = fz_count_pages(h->ctx, h->doc);
    }
    fz_catch(h->ctx) {
        n = 0;
    }
    return n;
}

int rd_page_size(void *handle, int page_no, float *out_w, float *out_h)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !out_w || !out_h) return -1;

    fz_page *page = NULL;
    fz_rect bounds = { 0, 0, 0, 0 };

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        bounds = fz_bound_page(h->ctx, page);
    }
    fz_catch(h->ctx) {
        if (page) fz_drop_page(h->ctx, page);
        return -2;
    }

    fz_drop_page(h->ctx, page);
    float w = bounds.x1 - bounds.x0;
    float hh = bounds.y1 - bounds.y0;
    if (w <= 0 || hh <= 0) return -3;
    *out_w = w;
    *out_h = hh;
    return 0;
}

static void buf_append(char **buf, size_t *len, size_t *cap, const char *s)
{
    size_t n = strlen(s);
    if (*len + n + 1 > *cap) {
        size_t nc = *cap ? *cap : 4096;
        while (nc < *len + n + 1) nc *= 2;
        char *nb = (char *)realloc(*buf, nc);
        if (!nb) return;
        *buf = nb;
        *cap = nc;
    }
    memcpy(*buf + *len, s, n + 1);
    *len += n;
}

static void buf_append_title(char **buf, size_t *len, size_t *cap, const char *title)
{
    char tmp[1024];
    size_t j = 0;
    for (const char *p = title; p && *p && j < sizeof(tmp) - 1; p++) {
        char c = *p;
        if (c == '\n' || c == '\r' || c == '\t') c = ' ';
        tmp[j++] = c;
    }
    tmp[j] = 0;
    buf_append(buf, len, cap, tmp);
}

static void append_outline(fz_context *ctx, fz_document *doc, fz_outline *o,
                           int level, char **buf, size_t *len, size_t *cap)
{
    for (; o; o = o->next) {
        int page = -1;
        fz_location loc = o->page;
        if (o->uri && o->uri[0]) {
            fz_try(ctx) {
                fz_location resolved =
                    fz_resolve_link(ctx, doc, o->uri, NULL, NULL);
                if (resolved.chapter >= 0 && resolved.page >= 0)
                    loc = resolved;
            }
            fz_catch(ctx) {
            }
        }
        fz_try(ctx) {
            page = fz_page_number_from_location(ctx, doc, loc);
        }
        fz_catch(ctx) {
            page = -1;
        }
        char line[64];
        snprintf(line, sizeof(line), "%d\t%d\t", page, level);
        buf_append(buf, len, cap, line);
        buf_append_title(buf, len, cap, o->title ? o->title : "");
        buf_append(buf, len, cap, "\n");
        if (o->down) {
            append_outline(ctx, doc, o->down, level + 1, buf, len, cap);
        }
    }
}

char *rd_toc(void *handle)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return NULL;

    fz_outline *outline = NULL;
    fz_try(h->ctx) {
        outline = fz_load_outline(h->ctx, h->doc);
    }
    fz_catch(h->ctx) {
        outline = NULL;
    }
    if (!outline) {
        char *empty = (char *)malloc(1);
        if (empty) empty[0] = 0;
        return empty;
    }

    char *buf = NULL;
    size_t len = 0, cap = 0;
    append_outline(h->ctx, h->doc, outline, 0, &buf, &len, &cap);
    fz_drop_outline(h->ctx, outline);
    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

int rd_layout(void *handle, float w, float h, float em,
              float line_factor, float margin)
{
    rd_doc *d = (rd_doc *)handle;
    if (!d || !d->doc) return -1;

    if (w < 100) w = 600;
    if (h < 100) h = 800;
    if (em < 4) em = 12;
    if (line_factor < 1) line_factor = 1.6;
    if (margin < 0) margin = 0;

    char css[1024];
    build_user_css(css, sizeof(css), em, line_factor, margin);
    int n = -1;
    fz_try(d->ctx) {
        fz_set_user_css(d->ctx, css);
        if (fz_is_document_reflowable(d->ctx, d->doc))
            fz_layout_document(d->ctx, d->doc, w, h, em);
        n = fz_count_pages(d->ctx, d->doc);
    }
    fz_catch(d->ctx) {
        n = -1;
    }
    return n;
}

int rd_link_at(void *handle, int page_no, float nx, float ny,
               int *out_page, float *out_x, float *out_y)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !out_page) return -1;

    fz_page *page = NULL;
    fz_link *links = NULL;
    int found = 0;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        fz_rect bounds = fz_bound_page(h->ctx, page);
        float px = bounds.x0 + nx * (bounds.x1 - bounds.x0);
        float py = bounds.y0 + ny * (bounds.y1 - bounds.y0);
        links = fz_load_links(h->ctx, page);
        for (fz_link *l = links; l; l = l->next) {
            if (px < l->rect.x0 || px > l->rect.x1 ||
                py < l->rect.y0 || py > l->rect.y1)
                continue;
            if (!l->uri || !l->uri[0]) continue;
            fz_link_dest dest =
                fz_resolve_link_dest(h->ctx, h->doc, l->uri);
            int target = fz_page_number_from_location(h->ctx, h->doc, dest.loc);
            if (target >= 0) {
                float tx = 0, ty = 0;
                fz_page *target_page = NULL;
                fz_try(h->ctx) {
                    target_page = fz_load_page(h->ctx, h->doc, target);
                    fz_rect tb = fz_bound_page(h->ctx, target_page);
                    float tw = tb.x1 - tb.x0;
                    float th = tb.y1 - tb.y0;
                    if (tw > 0) tx = (dest.x - tb.x0) / tw;
                    if (th > 0) ty = (dest.y - tb.y0) / th;
                }
                fz_catch(h->ctx) {
                    tx = ty = 0;
                }
                if (target_page) fz_drop_page(h->ctx, target_page);
                if (tx < 0) tx = 0; if (tx > 1) tx = 1;
                if (ty < 0) ty = 0; if (ty > 1) ty = 1;
                *out_page = target;
                if (out_x) *out_x = tx;
                if (out_y) *out_y = ty;
                found = 1;
                break;
            }
        }
    }
    fz_catch(h->ctx) {
        found = 0;
    }

    if (links) fz_drop_link(h->ctx, links);
    if (page) fz_drop_page(h->ctx, page);
    return found ? 1 : 0;
}

char *rd_page_links(void *handle, int page_no)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return NULL;

    fz_page *page = NULL;
    fz_link *links = NULL;
    char *buf = NULL;
    size_t len = 0, cap = 0;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        fz_rect sb = fz_bound_page(h->ctx, page);
        float sw = sb.x1 - sb.x0;
        float sh = sb.y1 - sb.y0;
        links = fz_load_links(h->ctx, page);
        for (fz_link *l = links; l; l = l->next) {
            if (!l->uri || !l->uri[0]) continue;
            fz_link_dest dest = fz_resolve_link_dest(h->ctx, h->doc, l->uri);
            int target = fz_page_number_from_location(h->ctx, h->doc, dest.loc);
            if (target < 0) continue;

            float ty = 0;
            float x0 = sw > 0 ? (l->rect.x0 - sb.x0) / sw : 0;
            float y0 = sh > 0 ? (l->rect.y0 - sb.y0) / sh : 0;
            float x1 = sw > 0 ? (l->rect.x1 - sb.x0) / sw : 0;
            float y1 = sh > 0 ? (l->rect.y1 - sb.y0) / sh : 0;
            char line[160];
            snprintf(line, sizeof(line), "%.6f\t%.6f\t%.6f\t%.6f\t%d\t%.6f\n",
                     x0, y0, x1, y1, target, ty);
            buf_append(&buf, &len, &cap, line);
        }
    }
    fz_catch(h->ctx) {
    }

    if (links) fz_drop_link(h->ctx, links);
    if (page) fz_drop_page(h->ctx, page);
    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

char *rd_page_images(void *handle, int page_no)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return NULL;

    fz_page *page = NULL;
    fz_stext_page *text = NULL;
    char *buf = NULL;
    size_t len = 0, cap = 0;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        fz_rect sb = fz_bound_page(h->ctx, page);
        float sw = sb.x1 - sb.x0;
        float sh = sb.y1 - sb.y0;
        fz_stext_options opts = { 0 };
        opts.flags = FZ_STEXT_PRESERVE_IMAGES;
        text = fz_new_stext_page_from_page(h->ctx, page, &opts);
        if (sw > 0 && sh > 0) {
            for (fz_stext_block *b = text->first_block; b; b = b->next) {
                if (b->type != FZ_STEXT_BLOCK_IMAGE) continue;
                float x0 = (b->bbox.x0 - sb.x0) / sw;
                float y0 = (b->bbox.y0 - sb.y0) / sh;
                float x1 = (b->bbox.x1 - sb.x0) / sw;
                float y1 = (b->bbox.y1 - sb.y0) / sh;
                if (x1 - x0 <= 0.002f || y1 - y0 <= 0.002f) continue;
                char line[128];
                snprintf(line, sizeof(line), "%.6f\t%.6f\t%.6f\t%.6f\n",
                         x0, y0, x1, y1);
                buf_append(&buf, &len, &cap, line);
            }
        }
    }
    fz_catch(h->ctx) {
    }

    if (text) fz_drop_stext_page(h->ctx, text);
    if (page) fz_drop_page(h->ctx, page);
    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

int rd_render_region(void *handle, int page_no,
                     float x0, float y0, float x1, float y1,
                     int max_w, int max_h,
                     uint8_t **out, int *out_w, int *out_h, int *out_stride)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !out || !out_w || !out_h || !out_stride) return -1;
    if (max_w < 16) max_w = 1024;
    if (max_h < 16) max_h = 1024;
    if (x0 < 0) x0 = 0;
    if (y0 < 0) y0 = 0;
    if (x1 > 1) x1 = 1;
    if (y1 > 1) y1 = 1;

    fz_page *page = NULL;
    fz_pixmap *pix = NULL;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        fz_rect b = fz_bound_page(h->ctx, page);
        float sw = b.x1 - b.x0, sh = b.y1 - b.y0;
        if (sw <= 0 || sh <= 0) fz_throw(h->ctx, FZ_ERROR_ARGUMENT, "bad page");
        float rx0 = b.x0 + x0 * sw, ry0 = b.y0 + y0 * sh;
        float rx1 = b.x0 + x1 * sw, ry1 = b.y0 + y1 * sh;
        float rw = rx1 - rx0, rh = ry1 - ry0;
        if (rw <= 0 || rh <= 0) fz_throw(h->ctx, FZ_ERROR_ARGUMENT, "bad region");

        float needw = (float)max_w / rw, needh = (float)max_h / rh;
        float zoom = needw < needh ? needw : needh;
        if (zoom < 0.1f) zoom = 0.1f;
        if (zoom > 8.0f) zoom = 8.0f;
        float cap = 3000.0f / (sw > sh ? sw : sh);
        if (zoom > cap) zoom = cap;
        if (zoom < 0.1f) zoom = 0.1f;

        pix = fz_new_pixmap_from_page(h->ctx, page, fz_scale(zoom, zoom),
                                      fz_device_rgb(h->ctx), 1);
    }
    fz_catch(h->ctx) {
        if (pix) fz_drop_pixmap(h->ctx, pix);
        if (page) fz_drop_page(h->ctx, page);
        return -2;
    }

    fz_rect b = fz_bound_page(h->ctx, page);
    float sw = b.x1 - b.x0, sh = b.y1 - b.y0;
    float rx0 = b.x0 + x0 * sw, ry0 = b.y0 + y0 * sh;
    float rx1 = b.x0 + x1 * sw, ry1 = b.y0 + y1 * sh;
    float needw = (float)max_w / (rx1 - rx0), needh = (float)max_h / (ry1 - ry0);
    float zoom = needw < needh ? needw : needh;
    if (zoom < 0.1f) zoom = 0.1f;
    if (zoom > 8.0f) zoom = 8.0f;
    float cap = 3000.0f / (sw > sh ? sw : sh);
    if (zoom > cap) zoom = cap;

    int ox = (int)(rx0 * zoom + 0.5f) - pix->x;
    int oy = (int)(ry0 * zoom + 0.5f) - pix->y;
    int ow = (int)((rx1 - rx0) * zoom + 0.999f);
    int oh = (int)((ry1 - ry0) * zoom + 0.999f);
    if (ox < 0) { ow += ox; ox = 0; }
    if (oy < 0) { oh += oy; oy = 0; }
    if (ox + ow > pix->w) ow = pix->w - ox;
    if (oy + oh > pix->h) oh = pix->h - oy;
    if (ow < 1 || oh < 1) {
        fz_drop_pixmap(h->ctx, pix);
        fz_drop_page(h->ctx, page);
        return -3;
    }

    int n = pix->n;
    int pstride = (int)pix->stride;
    uint8_t *buf = (uint8_t *)malloc((size_t)ow * (size_t)oh * 4);
    if (!buf) {
        fz_drop_pixmap(h->ctx, pix);
        fz_drop_page(h->ctx, page);
        return -4;
    }
    for (int y = 0; y < oh; y++) {
        const uint8_t *src = pix->samples + (size_t)(oy + y) * (size_t)pstride + (size_t)ox * n;
        uint8_t *dst = buf + (size_t)y * (size_t)ow * 4;
        if (n >= 4) {
            for (int x = 0; x < ow; x++) {
                uint8_t a = src[x * n + 3];
                int inv = 255 - a;
                dst[x * 4 + 0] = (uint8_t)(src[x * n + 0] + (255 * inv + 127) / 255);
                dst[x * 4 + 1] = (uint8_t)(src[x * n + 1] + (255 * inv + 127) / 255);
                dst[x * 4 + 2] = (uint8_t)(src[x * n + 2] + (255 * inv + 127) / 255);
                dst[x * 4 + 3] = 255;
            }
        } else {
            for (int x = 0; x < ow; x++) {
                uint8_t v = src[x * n];
                dst[x * 4 + 0] = v;
                dst[x * 4 + 1] = v;
                dst[x * 4 + 2] = v;
                dst[x * 4 + 3] = 255;
            }
        }
    }
    fz_drop_pixmap(h->ctx, pix);
    fz_drop_page(h->ctx, page);
    *out = buf;
    *out_w = ow;
    *out_h = oh;
    *out_stride = ow * 4;
    return 0;
}

char *rd_list_dir(const char *path)
{
    DIR *dir = opendir(path ? path : ".");
    if (!dir) {
        char *empty = (char *)malloc(1);
        if (empty) empty[0] = 0;
        return empty;
    }

    char *buf = NULL;
    size_t len = 0, cap = 0;
    struct dirent *e;
    while ((e = readdir(dir)) != NULL) {
        if (strcmp(e->d_name, ".") == 0 || strcmp(e->d_name, "..") == 0)
            continue;
        char full[PATH_MAX];
        snprintf(full, sizeof(full), "%s/%s", path ? path : ".", e->d_name);
        struct stat st;
        if (stat(full, &st) != 0) continue;
        const char *type = S_ISDIR(st.st_mode) ? "d" : "f";
        buf_append(&buf, &len, &cap, type);
        buf_append(&buf, &len, &cap, "\t");
        buf_append(&buf, &len, &cap, e->d_name);
        buf_append(&buf, &len, &cap, "\n");
    }
    closedir(dir);
    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

char *rd_page_fonts(void *handle, int page_no)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return NULL;

    fz_page *page = NULL;
    fz_stext_page *text = NULL;
    char *buf = NULL;
    size_t len = 0, cap = 0;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        text = fz_new_stext_page_from_page(h->ctx, page, NULL);
        for (fz_stext_block *b = text->first_block; b; b = b->next) {
            if (b->type != FZ_STEXT_BLOCK_TEXT) continue;
            for (fz_stext_line *line = b->u.t.first_line; line; line = line->next) {
                for (fz_stext_char *ch = line->first_char; ch; ch = ch->next) {
                    const char *name = ch->font ? fz_font_name(h->ctx, ch->font) : NULL;
                    if (!name) continue;
                    char line[512];
                    snprintf(line, sizeof(line), "%s\t%d\n", name,
                             ch->font ? fz_font_is_italic(h->ctx, ch->font) : 0);
                    buf_append(&buf, &len, &cap, line);
                }
            }
        }
    }
    fz_catch(h->ctx) {
    }

    if (text) fz_drop_stext_page(h->ctx, text);
    if (page) fz_drop_page(h->ctx, page);
    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

char *rd_page_text(void *handle, int page_no)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc) return NULL;

    fz_page *page = NULL;
    fz_stext_page *text = NULL;
    fz_buffer *buf = NULL;
    fz_output *out = NULL;
    char *result = NULL;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        text = fz_new_stext_page_from_page(h->ctx, page, NULL);
        buf = fz_new_buffer(h->ctx, 4096);
        out = fz_new_output_with_buffer(h->ctx, buf);
        fz_print_stext_page_as_text(h->ctx, out, text);
        fz_close_output(h->ctx, out);
    }
    fz_catch(h->ctx) {
        result = NULL;
    }

    if (out) fz_drop_output(h->ctx, out);
    if (text) fz_drop_stext_page(h->ctx, text);
    if (page) fz_drop_page(h->ctx, page);

    if (buf) {
        unsigned char *data = NULL;
        size_t len = fz_buffer_extract(h->ctx, buf, &data);
        if (data) {
            result = (char *)malloc(len + 1);
            if (result) {
                memcpy(result, data, len);
                result[len] = 0;
            }
            fz_free(h->ctx, data);
        }
        fz_drop_buffer(h->ctx, buf);
    }
    return result;
}

int rd_render_page(void *handle, int page_no, float zoom,
                   int bg_r, int bg_g, int bg_b,
                   uint8_t **out, int *out_w, int *out_h, int *out_stride)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !out || !out_w || !out_h || !out_stride) return -1;

    if (bg_r < 0) bg_r = 255;
    if (bg_g < 0) bg_g = 255;
    if (bg_b < 0) bg_b = 255;
    if (bg_r > 255) bg_r = 255;
    if (bg_g > 255) bg_g = 255;
    if (bg_b > 255) bg_b = 255;

    fz_page *page = NULL;
    fz_pixmap *pix = NULL;

    fz_try(h->ctx) {
        page = fz_load_page(h->ctx, h->doc, page_no);
        fz_matrix ctm = fz_scale(zoom, zoom);
        pix = fz_new_pixmap_from_page(h->ctx, page, ctm, fz_device_rgb(h->ctx), 1);
    }
    fz_catch(h->ctx) {
        if (page) fz_drop_page(h->ctx, page);
        return -2;
    }

    int w = pix->w;
    int hh = pix->h;
    int n = pix->n;
    int stride = (int)pix->stride;
    if (w <= 0 || hh <= 0) {
        fz_drop_pixmap(h->ctx, pix);
        fz_drop_page(h->ctx, page);
        return -3;
    }

    uint8_t *buf = (uint8_t *)malloc((size_t)w * (size_t)hh * 4);
    if (!buf) {
        fz_drop_pixmap(h->ctx, pix);
        fz_drop_page(h->ctx, page);
        return -4;
    }

    for (int y = 0; y < hh; y++) {
        const uint8_t *src = pix->samples + (size_t)y * (size_t)stride;
        uint8_t *dst = buf + (size_t)y * (size_t)w * 4;
        if (n >= 4) {
            for (int x = 0; x < w; x++) {
                uint8_t a = src[x * n + 3];
                int inv = 255 - a;
                dst[x * 4 + 0] = (uint8_t)(src[x * n + 0] + (bg_r * inv + 127) / 255);
                dst[x * 4 + 1] = (uint8_t)(src[x * n + 1] + (bg_g * inv + 127) / 255);
                dst[x * 4 + 2] = (uint8_t)(src[x * n + 2] + (bg_b * inv + 127) / 255);
                dst[x * 4 + 3] = 255;
            }
        } else if (n == 3) {
            for (int x = 0; x < w; x++) {
                dst[x * 4 + 0] = src[x * 3 + 0];
                dst[x * 4 + 1] = src[x * 3 + 1];
                dst[x * 4 + 2] = src[x * 3 + 2];
                dst[x * 4 + 3] = 255;
            }
        } else {
            for (int x = 0; x < w; x++) {
                uint8_t v = src[x];
                dst[x * 4 + 0] = v;
                dst[x * 4 + 1] = v;
                dst[x * 4 + 2] = v;
                dst[x * 4 + 3] = 255;
            }
        }
    }

    fz_drop_pixmap(h->ctx, pix);
    fz_drop_page(h->ctx, page);

    *out = buf;
    *out_w = w;
    *out_h = hh;
    *out_stride = w * 4;
    return 0;
}

void rd_free(void *p)
{
    free(p);
}

int rd_save_pages_png(const char *path,
                      const uint8_t *a, int aw, int ah,
                      const uint8_t *b, int bw, int bh,
                      int br, int bg, int bb, int gap)
{
    if (!path || !a || aw <= 0 || ah <= 0) return -1;
    if (gap < 0) gap = 0;
    int total_w = aw + (b ? gap + bw : 0);
    int total_h = ah > bh ? ah : bh;
    uint8_t *out = (uint8_t *)malloc((size_t)total_w * (size_t)total_h * 4);
    if (!out) return -2;

    for (int i = 0; i < total_w * total_h; i++) {
        out[i * 4 + 0] = (uint8_t)br;
        out[i * 4 + 1] = (uint8_t)bg;
        out[i * 4 + 2] = (uint8_t)bb;
        out[i * 4 + 3] = 255;
    }
    for (int y = 0; y < ah; y++) {
        memcpy(out + (size_t)y * total_w * 4, a + (size_t)y * aw * 4,
               (size_t)aw * 4);
    }
    if (b) {
        for (int y = 0; y < bh; y++) {
            memcpy(out + (size_t)y * total_w * 4 + (size_t)(aw + gap) * 4,
                   b + (size_t)y * bw * 4, (size_t)bw * 4);
        }
    }
    int ok = stbi_write_png(path, total_w, total_h, 4, out, total_w * 4);
    free(out);
    return ok ? 0 : -3;
}

int rd_save_png(const char *path, int w, int h, const uint8_t *rgba)
{
    if (!path || !rgba || w <= 0 || h <= 0) return -1;
    return stbi_write_png(path, w, h, 4, rgba, w * 4) ? 0 : -2;
}
