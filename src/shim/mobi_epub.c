#include <mobi.h>
#include <zip.h>

#include <limits.h>
#include <stdint.h>
#include <stdio.h>
#include <string.h>

#define EPUB_MIMETYPE "application/epub+zip"

static const char EPUB_CONTAINER[] =
    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
    "<container version=\"1.0\" xmlns=\"urn:oasis:names:tc:opendocument:xmlns:container\">\n"
    "  <rootfiles>\n"
    "    <rootfile full-path=\"OEBPS/content.opf\" media-type=\"application/oebps-package+xml\"/>\n"
    "  </rootfiles>\n"
    "</container>";

static int add_mem(zip_t *z, const char *name, const void *data, size_t len, int store)
{
    zip_source_t *s = zip_source_buffer(z, data, len, 0);
    if (!s) return -1;
    zip_int64_t idx = zip_file_add(z, name, s, ZIP_FL_OVERWRITE | ZIP_FL_ENC_UTF_8);
    if (idx < 0) {
        zip_source_free(s);
        return -1;
    }
    if (store) {
        zip_set_file_compression(z, idx, ZIP_CM_STORE, 0);
    }
    return 0;
}

static int create_epub(const MOBIRawml *rawml, const char *out)
{
    int err = 0;
    zip_t *z = zip_open(out, ZIP_CREATE | ZIP_TRUNCATE, &err);
    if (!z) return -1;

    if (add_mem(z, "mimetype", EPUB_MIMETYPE,
                sizeof(EPUB_MIMETYPE) - 1, 1) != 0) {
        zip_discard(z);
        return -1;
    }
    if (add_mem(z, "META-INF/container.xml", EPUB_CONTAINER,
                sizeof(EPUB_CONTAINER) - 1, 0) != 0) {
        zip_discard(z);
        return -1;
    }

    char name[PATH_MAX];

    for (MOBIPart *p = rawml->markup; p != NULL; p = p->next) {
        MOBIFileMeta meta = mobi_get_filemeta_by_type(p->type);
        snprintf(name, sizeof(name), "OEBPS/part%05zu.%s", p->uid, meta.extension);
        if (add_mem(z, name, p->data, p->size, 0) != 0) {
            zip_discard(z);
            return -1;
        }
    }

    int first = 1;
    for (MOBIPart *p = rawml->flow; p != NULL; p = p->next) {
        if (first) {
            first = 0;
            continue;
        }
        MOBIFileMeta meta = mobi_get_filemeta_by_type(p->type);
        snprintf(name, sizeof(name), "OEBPS/flow%05zu.%s", p->uid, meta.extension);
        if (add_mem(z, name, p->data, p->size, 0) != 0) {
            zip_discard(z);
            return -1;
        }
    }

    for (MOBIPart *p = rawml->resources; p != NULL; p = p->next) {
        if (p->size == 0) continue;
        if (p->type == T_OPF) {
            snprintf(name, sizeof(name), "OEBPS/content.opf");
        } else {
            MOBIFileMeta meta = mobi_get_filemeta_by_type(p->type);
            snprintf(name, sizeof(name), "OEBPS/resource%05zu.%s", p->uid, meta.extension);
        }
        if (add_mem(z, name, p->data, p->size, 0) != 0) {
            zip_discard(z);
            return -1;
        }
    }

    if (zip_close(z) != 0) return -2;
    return 0;
}

int reader_mobi_to_epub(const char *src, const char *out)
{
    if (!src || !out) return -1;

    MOBIData *m = mobi_init();
    if (!m) return -2;

    MOBI_RET r = mobi_load_filename(m, src);
    if (r != MOBI_SUCCESS) {
        mobi_free(m);
        return -3;
    }

    MOBIRawml *rawml = mobi_init_rawml(m);
    if (!rawml) {
        mobi_free(m);
        return -4;
    }

    r = mobi_parse_rawml(rawml, m);
    if (r != MOBI_SUCCESS) {
        mobi_free_rawml(rawml);
        mobi_free(m);
        return -5;
    }

    int rc = create_epub(rawml, out);
    mobi_free_rawml(rawml);
    mobi_free(m);
    return rc;
}
