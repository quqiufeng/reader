-- 主事件循环：输入、启动同步、尺寸适配、预取与重绘。
local M = {}
M.__index = M

function M.new(ctx)
    return setmetatable({ ctx = ctx }, M)
end

function M:run()
    local ctx = self.ctx
    local sdl, ffi, v = ctx.sdl, ctx.ffi, ctx.v
    local ev = ffi.new("SDL_Event[1]")

    while ctx.is_running() do
        local server = ctx.get_server()
        if server then server:poll() end

        while sdl.poll_event(ev) ~= 0 do
            if ev[0].type ~= sdl.MOUSEMOTION then v.had_event = true end
            ctx.input:handle(ev[0])
        end

        local now = v.now()
        ctx.toast:tick(now)
        if ctx.filedialog:poll(now) then v.dirty = true end
        if v.save_pending and now >= v.save_due then
            ctx.save_state()
            v.save_pending = false
            v.save_due = 0
        end

        if v.startup_sync and now >= v.startup_at then
            v.startup_sync = false
            local nw, nh = v.window_target_size()
            if nw and nh and nw > 0 and nh > 0 then ctx.set_wh(nw, nh) end
            ctx.rebuild_header()
            local pending = v.pending_initial
            v.pending_initial = nil
            if pending then
                if pending.book and pending.book ~= "" then
                    local ok, err = ctx.open_book(pending.book, pending.page)
                    if not ok then error("open failed: " .. tostring(err)) end
                else
                    ctx.lib:show()
                end
            else
                if ctx.lib and ctx.lib.open then ctx.lib:refresh() end
                v.sy = 0
                v.pending_layout = v.reflow
                local R = ctx.get_reader()
                if R.book then ctx.load_page(R.page) end
                ctx.refresh_text()
            end
            v.dirty = true
        end

        if not v.resize_pending and now >= (v.sync_at or 0) then
            v.sync_at = now + 0.5
            if ctx.apply_resize() then v.dirty = true end
            if v.ensure_content_size() then v.dirty = true end
        end

        if v.resize_pending and v.now() >= v.resize_due then
            local nw, nh = v.resize_target_w, v.resize_target_h
            if not nw or not nh then nw, nh = v.window_target_size() end
            if nw and nh and nw > 0 and nh > 0 then
                if v.resize_last_w ~= nw or v.resize_last_h ~= nh then
                    v.resize_target_w, v.resize_target_h = nw, nh
                    v.resize_last_w, v.resize_last_h = nw, nh
                    v.resize_due = v.now() + 0.10
                else
                    v.resize_pending = false
                    ctx.apply_resize(nw, nh)
                    v.dirty = true
                end
            else
                v.resize_pending = false
            end
        end

        if v.had_event then
            v.dirty = true
            v.had_event = false
        end

        if not v.dirty and v.prefetch then
            local P = v.prefetch
            v.prefetch = nil
            local R = ctx.get_reader()
            if R.doc and not R.is_txt and P.sig == v.content_sig() and P.page < R.total then
                local key = P.sig .. ":" .. P.page
                if not v.pcache.map[key] then
                    local t, w, h = v.render_into(P.page, P.target_w)
                    if t then v.pcache:put(key, { tex = t, w = w, h = h }) end
                end
            end
        end

        v.drew = false
        if v.dirty then
            ctx.draw()
            v.dirty = false
            v.drew = true
        end
        sdl.delay(v.drew and 16 or 30)
    end
end

return M
