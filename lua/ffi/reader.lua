local ffi = require("ffi")

ffi.cdef [[
void *rd_open(const char *path, int *err);
void  rd_close(void *handle);
int   rd_page_count(void *handle);
int   rd_render_page(void *handle, int page, float zoom,
                     uint8_t **out, int *w, int *h, int *stride);
void  rd_free(void *p);
int   rd_save_png(const char *path, int w, int h, const uint8_t *rgba);
int   rd_detect_format(const char *path);
char *rd_toc(void *handle);
char *rd_search(void *handle, const char *query, int start_page, int max_hits);
]]

local root = os.getenv("READER_ROOT") or "."
local lib = ffi.load(root .. "/build/libreader_native.so")

local M = {}

function M.detect(path)
    return tonumber(lib.rd_detect_format(path))
end

function M.open(path)
    local err = ffi.new("int[1]")
    local h = lib.rd_open(path, err)
    if h == nil then return nil, tonumber(err[0]) end
    return h
end

function M.close(h)
    lib.rd_close(h)
end

function M.page_count(h)
    return tonumber(lib.rd_page_count(h))
end

function M.render_page(h, page, zoom)
    local out = ffi.new("uint8_t*[1]")
    local w = ffi.new("int[1]")
    local hh = ffi.new("int[1]")
    local stride = ffi.new("int[1]")
    local rc = lib.rd_render_page(h, page, zoom, out, w, hh, stride)
    if rc ~= 0 then return nil, rc end
    return out[0], tonumber(w[0]), tonumber(hh[0]), tonumber(stride[0])
end

function M.free(p)
    lib.rd_free(p)
end

function M.save_png(path, w, h, pixels)
    return lib.rd_save_png(path, w, h, pixels)
end

function M.toc(h)
    local p = lib.rd_toc(h)
    if p == nil then return {} end
    local s = ffi.string(p)
    lib.rd_free(p)
    local out = {}
    for page, level, title in s:gmatch("(%-?%d+)\t(%d+)\t([^\n]*)\n") do
        out[#out + 1] = {
            page = tonumber(page),
            level = tonumber(level),
            title = title,
        }
    end
    return out
end

function M.search(h, query, start_page, max_hits)
    local p = lib.rd_search(h, query, start_page or 0, max_hits or 50)
    if p == nil then return {} end
    local s = ffi.string(p)
    lib.rd_free(p)
    local out = {}
    for page, count in s:gmatch("(%d+)\t(%d+)\n") do
        out[#out + 1] = { page = tonumber(page), count = tonumber(count) }
    end
    return out
end

return M
