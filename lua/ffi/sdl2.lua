local ffi = require("ffi")

ffi.cdef [[
typedef struct SDL_Window SDL_Window;
typedef struct SDL_Renderer SDL_Renderer;
typedef struct SDL_Texture SDL_Texture;
typedef struct SDL_Surface SDL_Surface;
typedef struct SDL_Rect { int x, y, w, h; } SDL_Rect;

typedef union SDL_Event {
    uint32_t type;
    struct {
        uint32_t type, timestamp, windowID;
        uint8_t state, repeat, padding2, padding3;
        int32_t scancode, sym;
        uint16_t mod;
        uint32_t unused;
    } key;
    struct {
        uint32_t type, timestamp, windowID, which;
        uint8_t button, state, clicks, padding;
        int32_t x, y;
    } button;
    struct {
        uint32_t type, timestamp, windowID;
        char text[32];
    } text;
    uint8_t padding[56];
} SDL_Event;

int SDL_Init(uint32_t flags);
void SDL_Quit(void);
SDL_Window *SDL_CreateWindow(const char *title, int x, int y, int w, int h, uint32_t flags);
typedef struct SDL_RWops SDL_RWops;
SDL_RWops *SDL_RWFromFile(const char *file, const char *mode);
SDL_Surface *SDL_LoadBMP_RW(SDL_RWops *src, int freesrc);
void SDL_SetWindowIcon(SDL_Window *win, SDL_Surface *icon);
SDL_Renderer *SDL_CreateRenderer(SDL_Window *win, int index, uint32_t flags);
SDL_Texture *SDL_CreateTexture(SDL_Renderer *r, uint32_t format, int access, int w, int h);
SDL_Texture *SDL_CreateTextureFromSurface(SDL_Renderer *r, SDL_Surface *s);
void SDL_FreeSurface(SDL_Surface *s);
int SDL_UpdateTexture(SDL_Texture *t, const SDL_Rect *rect, const void *pixels, int pitch);
int SDL_RenderClear(SDL_Renderer *r);
int SDL_RenderFillRect(SDL_Renderer *r, const SDL_Rect *rect);
int SDL_RenderDrawRect(SDL_Renderer *r, const SDL_Rect *rect);
int SDL_RenderCopy(SDL_Renderer *r, SDL_Texture *t, const SDL_Rect *src, const SDL_Rect *dst);
void SDL_RenderPresent(SDL_Renderer *r);
int SDL_SetRenderDrawColor(SDL_Renderer *r, uint8_t red, uint8_t green, uint8_t blue, uint8_t alpha);
int SDL_RenderReadPixels(SDL_Renderer *r, const SDL_Rect *rect, uint32_t format, void *pixels, int pitch);
int SDL_PollEvent(SDL_Event *e);
void SDL_StartTextInput(void);
void SDL_StopTextInput(void);
void SDL_Delay(uint32_t ms);
void SDL_DestroyTexture(SDL_Texture *t);
void SDL_DestroyRenderer(SDL_Renderer *r);
void SDL_DestroyWindow(SDL_Window *w);
]]

local lib = ffi.load("SDL2")

local M = {}
M.INIT_VIDEO = 0x20
M.WINDOWPOS_CENTERED = 0x2FFF0000
M.WINDOW_SHOWN = 0x4
M.RENDERER_ACCELERATED = 0x2
M.RENDERER_SOFTWARE = 0x1
M.TEXTUREACCESS_STREAMING = 1
M.PIXELFORMAT_ABGR8888 = 376840196

M.QUIT = 0x100
M.KEYDOWN = 0x300
M.TEXTINPUT = 0x303
M.MOUSEBUTTONDOWN = 0x401

M.SDLK_ESCAPE = 27
M.SDLK_LEFT = 0x40000050
M.SDLK_RIGHT = 0x4000004F
M.SDLK_PAGEUP = 0x4000004B
M.SDLK_PAGEDOWN = 0x4000004E
M.SDLK_HOME = 0x4000004A
M.SDLK_END = 0x4000004D
M.SDLK_F12 = 0x40000045
M.SDLK_RETURN = 13
M.SDLK_UP = 0x40000052
M.SDLK_DOWN = 0x40000051
M.SDLK_T = 116
M.SDLK_A = 97
M.SDLK_B = 98
M.SDLK_S = 115
M.SDLK_DELETE = 127
M.SDLK_BACKSPACE = 8
M.SDLK_SLASH = 47
M.SDLK_F = 102
M.SDLK_Q = 113

function M.init()
    return lib.SDL_Init(M.INIT_VIDEO) == 0
end

function M.quit()
    lib.SDL_Quit()
end

function M.create_window(title, w, h)
    return lib.SDL_CreateWindow(title, M.WINDOWPOS_CENTERED, M.WINDOWPOS_CENTERED,
        w, h, M.WINDOW_SHOWN)
end

function M.load_bmp(path)
    local rw = lib.SDL_RWFromFile(path, "rb")
    if rw == nil then return nil end
    return lib.SDL_LoadBMP_RW(rw, 1)
end

function M.set_window_icon(win, icon)
    lib.SDL_SetWindowIcon(win, icon)
end

function M.create_renderer(win)
    local r = lib.SDL_CreateRenderer(win, -1, M.RENDERER_ACCELERATED)
    if r == nil then
        r = lib.SDL_CreateRenderer(win, -1, M.RENDERER_SOFTWARE)
    end
    return r
end

function M.create_texture(ren, w, h)
    return lib.SDL_CreateTexture(ren, M.PIXELFORMAT_ABGR8888,
        M.TEXTUREACCESS_STREAMING, w, h)
end

function M.create_texture_from_surface(ren, surf)
    return lib.SDL_CreateTextureFromSurface(ren, surf)
end

function M.free_surface(surf)
    lib.SDL_FreeSurface(surf)
end

function M.update_texture(tex, pixels, pitch)
    return lib.SDL_UpdateTexture(tex, nil, pixels, pitch)
end

function M.set_draw_color(ren, red, green, blue, alpha)
    return lib.SDL_SetRenderDrawColor(ren, red, green, blue, alpha)
end

function M.render_clear(ren)
    return lib.SDL_RenderClear(ren)
end

function M.render_fill_rect(ren, rect)
    return lib.SDL_RenderFillRect(ren, rect)
end

function M.render_draw_rect(ren, rect)
    return lib.SDL_RenderDrawRect(ren, rect)
end

function M.render_copy(ren, tex, src, dst)
    return lib.SDL_RenderCopy(ren, tex, src, dst)
end

function M.render_present(ren)
    lib.SDL_RenderPresent(ren)
end

function M.poll_event(ev)
    return lib.SDL_PollEvent(ev)
end

function M.start_text_input()
    lib.SDL_StartTextInput()
end

function M.stop_text_input()
    lib.SDL_StopTextInput()
end

function M.delay(ms)
    lib.SDL_Delay(ms)
end

function M.destroy_texture(tex)
    lib.SDL_DestroyTexture(tex)
end

function M.destroy_renderer(ren)
    lib.SDL_DestroyRenderer(ren)
end

function M.destroy_window(win)
    lib.SDL_DestroyWindow(win)
end

function M.capture(ren, w, h, path, rd)
    local buf = ffi.new("uint8_t[?]", w * h * 4)
    local rc = lib.SDL_RenderReadPixels(ren, nil, M.PIXELFORMAT_ABGR8888, buf, w * 4)
    if rc ~= 0 then return false end
    return rd.save_png(path, w, h, buf) == 0
end

return M
