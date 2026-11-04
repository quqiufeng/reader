#include <mupdf/fitz.h>

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <unistd.h>
#include <limits.h>
#include <time.h>

#define STB_IMAGE_WRITE_IMPLEMENTATION
#include "stb_image_write.h"

typedef struct rd_doc {
    fz_context *ctx;
    fz_document *doc;
} rd_doc;

int reader_mobi_to_epub(const char *src, const char *out);

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

static int mobi_to_epub(const char *src, char *out, size_t outsz)
{
    const char *cache = "/tmp/native-reader-cache";
    if (ensure_dir(cache) != 0) return -1;

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

void *rd_open(const char *path, int *err)
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
    fz_register_document_handlers(h->ctx);
    fz_set_user_css(h->ctx,
        "body{margin:0;padding:0;}"
        "p{margin:0 0 0.8em 0;line-height:1.6;text-align:justify;}"
        "div,section{width:auto!important;max-width:100%!important;}"
        "img{max-width:100%!important;height:auto!important;}"
        "table{max-width:100%!important;}"
        "a{color:#1B365D;text-decoration:none;}"
        "pre,code{white-space:pre-wrap;}");

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
            fz_layout_document(h->ctx, h->doc, 600, 800, 12);
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

void rd_close(void *handle)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h) return;
    if (h->doc) fz_drop_document(h->ctx, h->doc);
    if (h->ctx) fz_drop_context(h->ctx);
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
        fz_try(ctx) {
            page = fz_page_number_from_location(ctx, doc, o->page);
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

char *rd_search(void *handle, const char *query, int start_page, int max_hits)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !query || query[0] == 0) return NULL;

    int total = 0;
    fz_try(h->ctx) {
        total = fz_count_pages(h->ctx, h->doc);
    }
    fz_catch(h->ctx) {
        return NULL;
    }
    if (total <= 0) return NULL;
    if (start_page < 0 || start_page >= total) start_page = 0;
    if (max_hits <= 0) max_hits = 50;

    char *buf = NULL;
    size_t len = 0, cap = 0;
    int hits = 0;
    clock_t t0 = clock();

    fz_try(h->ctx) {
        for (int k = 0; k < total && hits < max_hits; k++) {
            int p = (start_page + k) % total;
            int marks[16];
            fz_quad quads[16];
            int n = fz_search_page_number(h->ctx, h->doc, p, query,
                                          marks, quads, 16);
            if (n > 0) {
                char line[64];
                snprintf(line, sizeof(line), "%d\t%d\n", p, n);
                buf_append(&buf, &len, &cap, line);
                hits += n;
            }
            if ((clock() - t0) * 1000 / CLOCKS_PER_SEC > 5000) break;
        }
    }
    fz_catch(h->ctx) {
        /* return partial results */
    }

    if (!buf) {
        buf = (char *)malloc(1);
        if (buf) buf[0] = 0;
    }
    return buf;
}

int rd_render_page(void *handle, int page_no, float zoom,
                   uint8_t **out, int *out_w, int *out_h, int *out_stride)
{
    rd_doc *h = (rd_doc *)handle;
    if (!h || !h->doc || !out || !out_w || !out_h || !out_stride) return -1;

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
                dst[x * 4 + 0] = src[x * n + 0];
                dst[x * 4 + 1] = src[x * n + 1];
                dst[x * 4 + 2] = src[x * n + 2];
                dst[x * 4 + 3] = src[x * n + 3];
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

int rd_save_png(const char *path, int w, int h, const uint8_t *rgba)
{
    if (!path || !rgba || w <= 0 || h <= 0) return -1;
    return stbi_write_png(path, w, h, 4, rgba, w * 4) ? 0 : -2;
}
