-- 当前书籍会话：文档状态、打开/关章、TXT 分页与进度入口。
local ffi = require("ffi")
pcall(ffi.cdef, "unsigned int getuid(void);")

local M = {}
M.__index = M

local function url_decode(s)
    return (s:gsub("%%(%x%x)", function(h)
        return string.char(tonumber(h, 16))
    end))
end

function M.new(ctx)
    return setmetatable({
        ctx = ctx,
        book = nil,
        doc = nil,
        total = 0,
        page = 0,
        pages = nil,
        is_txt = false,
        chapters = nil,
        chapter_idx = 1,
        chapter_mode = false,
    }, M)
end

function M:open_doc(path)
    local ctx = self.ctx
    local s = ctx.settings
    return ctx.rd.open(path, s.font_size, s.line_factor, s.margin)
end

function M:restyle()
    if not self.doc or self.is_txt then return false end
    local ctx = self.ctx
    local path
    if self.chapter_mode and self.chapters and self.chapters[self.chapter_idx] then
        path = self.chapters[self.chapter_idx].path
    else
        path = self.book
    end
    if not path then return false end
    local h, err = self:open_doc(path)
    if not h then return false, err end
    ctx.rd.close(self.doc)
    self.doc = h
    self.total = ctx.rd.page_count(h)
    ctx.teardown_pages()
    ctx.v.layout:reset()
    ctx.v.content_sig_value = nil
    ctx.v.pending_layout = true
    self.page = math.max(0, math.min(self.total - 1, self.page))
    return ctx.load_page(self.page)
end

function M:normalize(path)
    if not path or path == "" or path:sub(1, 1) == "/" then return path end
    local ctx = self.ctx
    local ffi = ctx.ffi
    local uid = tonumber(ffi.C.getuid()) or 1000
    local gvfs = string.format("/run/user/%d/gvfs/", uid)
    local p = path

    if p:sub(1, 7) == "file://" then
        local q = url_decode(p:sub(8))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
        return path
    end

    local scheme, host, port, rest = p:match("^(davs?)://([^/:]+):?(%d*)(/.*)$")
    if scheme then
        local ssl = (scheme == "davs") and "true" or "false"
        local base
        if port and port ~= "" then
            base = string.format("%sdav:host=%s,port=%s,ssl=%s",
                gvfs, host, port, ssl)
        else
            base = string.format("%sdav:host=%s,ssl=%s", gvfs, host, ssl)
        end
        local q = base .. url_decode(rest)
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end

    local smb_host, share, srest = p:match("^smb://([^/]+)/([^/]+)(/.*)$")
    if smb_host then
        local q = string.format("%ssmb-share:server=%s,share=%s%s",
            gvfs, smb_host, share, url_decode(srest))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end

    local shost, srest2 = p:match("^sftp://([^/]+)(/.*)$")
    if shost then
        local q = string.format("%ssftp:host=%s%s",
            gvfs, shost, url_decode(srest2))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end
    return path
end

function M:close()
    if self.doc then
        self.ctx.rd.close(self.doc)
        self.doc = nil
    end
    self.book = nil
    self.total = 0
    self.page = 0
    self.pages = nil
    self.is_txt = false
    self.chapters = nil
    self.chapter_idx = 1
    self.chapter_mode = false
end

function M:build_txt(path)
    local ctx = self.ctx
    local S = ctx.S
    local settings = ctx.settings
    local pgs, tot, err = ctx.txtmod.paginate(path, {
        ttf = ctx.ttf, font = ctx.get_font_body(),
        width = ctx.get_w(), height = ctx.get_h(), top = S(96), bottom = S(80),
        margin = S(settings.margin), font_size = S(settings.font_size),
        line_factor = settings.line_factor, utf8_chars = ctx.utf8_chars,
    })
    if not pgs then return false, err end
    self.pages = pgs
    self.total = tot
    return true
end

function M:open_chapter(idx, local_page)
    if not self.chapters or not self.chapters[idx] then return false, "no chapter" end
    local ctx = self.ctx
    local h, err = self:open_doc(self.chapters[idx].path)
    if not h then return false, err end
    local nt = ctx.rd.page_count(h)
    if nt <= 0 then ctx.rd.close(h); return false, "no pages" end
    if self.doc then ctx.rd.close(self.doc) end
    self.doc = h
    self.chapter_idx = idx
    self.total = nt
    ctx.teardown_pages()
    ctx.v.layout:reset()
    ctx.v.content_sig_value = nil
    ctx.v.pending_layout = true
    local p = local_page or 0
    if p < 0 then p = self.total - 1 end
    p = math.max(0, math.min(self.total - 1, p))
    self.page = p
    return ctx.load_page(p)
end

function M:open_book(path, start_page)
    if not path or path == "" then return false, "empty path" end
    local ctx = self.ctx
    local v = ctx.v
    path = self:normalize(path)
    ctx.close_panels()
    ctx.reset_book()
    self.book = path
    v.layout:reset()
    v.content_sig_value = nil
    v.last_browse_dir = path:match("^(.*)/[^/]*$")
    local fmt = ctx.rd.detect(path)
    self.is_txt = fmt == 5
    v.reflow = fmt == 2 or fmt == 3 or fmt == 4

    local name = path:match("([^/]+)$") or path
    name = name:gsub("%.%w+$", "")
    ctx.set_title(ctx.truncate_utf8(name, 14))
    v.zoom = 1.0
    v.pan_x = 0

    if self.is_txt then
        local ok, err = self:build_txt(path)
        if not ok then return false, err end
    elseif v.reflow then
        local root = "/dev/shm/native-reader-cache/book_" .. ctx.epub.hash(path)
        local probe = root .. "/META-INF/container.xml"
        local pf = io.open(probe, "rb")
        if pf then
            pf:close()
            ctx.rd.touch_path(root)
        else
            ctx.rd.extract_book(path, root)
        end
        self.chapters = ctx.epub.parse(root)
        if self.chapters and #self.chapters > 0 then
            self.chapter_mode = true
            local rec = ctx.get_progress()[path]
            local sc, sp = 1, 0
            if start_page ~= nil then
                sp = start_page
            elseif rec and rec.chapter then
                sc, sp = rec.chapter, rec.page or 0
            elseif rec and rec.page then
                sp = rec.page
            end
            sc = math.max(1, math.min(#self.chapters, sc))
            if self:open_chapter(sc, sp) then
                ctx.refresh_text()
                ctx.save_progress()
                return true
            end
            self.chapter_mode = false
            self.chapters = nil
        end
        local err
        self.doc, err = self:open_doc(path)
        if not self.doc then return false, "open failed: " .. tostring(err) end
        self.total = ctx.rd.page_count(self.doc)
        if self.total <= 0 then return false, "no pages" end
    else
        local err
        self.doc, err = self:open_doc(path)
        if not self.doc then return false, "open failed: " .. tostring(err) end
        self.total = ctx.rd.page_count(self.doc)
        if self.total <= 0 then return false, "no pages" end
    end

    local start = start_page
    if start == nil then
        local rec = ctx.get_progress()[path]
        start = rec and rec.page or 0
    end
    start = math.max(0, math.min(self.total - 1, start or 0))
    v.pending_layout = v.reflow

    self.page = 0
    ctx.refresh_text()
    if not ctx.load_page(start) then return false, "render failed" end
    ctx.refresh_text()
    ctx.save_progress()
    return true
end

return M
