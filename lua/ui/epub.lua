-- EPUB 解包后的章节解析工具（纯函数，不依赖 UI）。
local M = {}

function M.read_text(p)
    local f = io.open(p, "rb")
    if not f then return nil end
    local s = f:read("*a")
    f:close()
    return s
end

function M.unescape(s)
    s = s:gsub("&lt;", "<"):gsub("&gt;", ">"):gsub("&quot;", '"')
         :gsub("&apos;", "'"):gsub("&nbsp;", " ")
    s = s:gsub("&#(%d+);", function(d)
        local n = tonumber(d)
        if n and n < 128 then return string.char(n) end
        return ""
    end)
    return (s:gsub("&amp;", "&"))
end

function M.strip(s)
    s = s:gsub("<[^>]*>", "")
    s = s:gsub("%s+", " ")
    return (s:gsub("^%s+", ""):gsub("%s+$", ""))
end

function M.join(base, rel)
    if not rel or rel == "" then return base end
    if rel:sub(1, 1) == "/" then return rel end
    local parts = {}
    for seg in (base .. "/" .. rel):gmatch("[^/]+") do
        if seg == ".." then
            table.remove(parts)
        elseif seg ~= "." and seg ~= "" then
            parts[#parts + 1] = seg
        end
    end
    return "/" .. table.concat(parts, "/")
end

function M.hash(s)
    local h = 5381
    for i = 1, #s do h = (h * 33 + s:byte(i)) % 4294967296 end
    return string.format("%08x", h)
end

function M.chapter_title(path)
    local s = M.read_text(path)
    if not s then return nil end
    local t = s:match("<h1[^>]*>(.-)</h1>")
        or s:match("<h2[^>]*>(.-)</h2>")
        or s:match("<h3[^>]*>(.-)</h3>")
    if not t then return nil end
    t = M.strip(M.unescape(t))
    if t == "" or #t > 60 then return nil end
    return t
end

function M.parse(root)
    local container = M.read_text(root .. "/META-INF/container.xml")
    local opf_rel = container and container:match('full%-path="([^"]+)"')
    if not opf_rel then return nil end
    local opf_path = M.join(root, opf_rel)
    local opf = M.read_text(opf_path)
    if not opf then return nil end
    local opf_dir = opf_path:match("^(.*)/[^/]*$") or root

    local manifest, ncx_href = {}, nil
    for tag in opf:gmatch("<item%s+[^>]*>") do
        local id = tag:match('id="([^"]*)"')
        local href = tag:match('href="([^"]*)"')
        local mt = tag:match('media%-type="([^"]*)"')
        if href then
            href = M.unescape(href)
            if id then manifest[id] = href end
            if (mt and mt:find("dtbncx", 1, true)) or href:lower():match("%.ncx$") then
                ncx_href = href
            end
        end
    end

    local spine = opf:match("<spine[^>]*>(.-)</spine>") or ""
    local list = {}
    for idref in spine:gmatch('<itemref[^>]-idref="([^"]-)"') do
        local href = manifest[idref]
        if href then
            local clean = href:gsub("#.*$", "")
            list[#list + 1] = { href = clean, path = M.join(opf_dir, clean) }
        end
    end
    if #list == 0 then return nil end

    local titles = {}
    if ncx_href then
        local ncx = M.read_text(M.join(opf_dir, ncx_href))
        if ncx then
            local nav = ncx:match("<navMap[^>]*>(.*)</navMap>") or ncx
            nav = nav:gsub("%s+", " ")
            for text, src in nav:gmatch("<text[^>]*>(.-)</text>.-<content[^>]-src=\"([^\"]*)\"") do
                local href = M.unescape(src):gsub("#.*$", "")
                titles[href] = M.strip(M.unescape(text))
            end
        end
    end

    for i, ch in ipairs(list) do
        ch.title = titles[ch.href]
        if not ch.title or ch.title == "" then
            ch.title = M.chapter_title(ch.path)
        end
        if not ch.title or ch.title == "" then
            ch.title = string.format("第 %d 章", i)
        end
    end
    return list
end

return M
