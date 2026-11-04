#include <mupdf/fitz.h>
#include <mupdf/ucdn.h>

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <dirent.h>
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
    fz_install_load_system_font_funcs(h->ctx, rd_load_system_font,
                                      rd_load_cjk_font, rd_load_fallback_font);
    fz_register_document_handlers(h->ctx);
    fz_set_user_css(h->ctx,
        "body{margin:0;padding:0;font-style:normal !important;}"
        "p{margin:0 0 0.8em 0;line-height:1.6;text-align:justify;font-style:normal !important;}"
        "i,em{font-style:normal !important;}"
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

    char css[768];
    snprintf(css, sizeof(css),
        "body{margin:0;padding:0 %.0fpx;font-style:normal !important;}"
        "p{margin:0 0 0.8em 0;line-height:%.2f;text-align:justify;font-style:normal !important;}"
        "i,em{font-style:normal !important;}"
        "div,section{width:auto!important;max-width:100%%!important;}"
        "img{max-width:100%%!important;height:auto!important;}"
        "table{max-width:100%%!important;}"
        "a{color:#1B365D;text-decoration:none;}"
        "pre,code{white-space:pre-wrap;}",
        margin, line_factor);

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
