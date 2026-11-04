#include <lua.h>
#include <lauxlib.h>
#include <lualib.h>

#include <stdio.h>
#include <string.h>

static void set_global(lua_State *L, const char *name, const char *value)
{
    lua_pushstring(L, value ? value : "");
    lua_setglobal(L, name);
}

int main(int argc, char **argv)
{
    const char *book = "";
    const char *shot = "";
    const char *page = "";
    const char *zoom = "1.2";
    const char *frames = "0";

    for (int i = 1; i < argc; i++) {
        if (strcmp(argv[i], "--screenshot") == 0 && i + 1 < argc) {
            shot = argv[++i];
        } else if (strcmp(argv[i], "--page") == 0 && i + 1 < argc) {
            page = argv[++i];
        } else if (strcmp(argv[i], "--zoom") == 0 && i + 1 < argc) {
            zoom = argv[++i];
        } else if (strcmp(argv[i], "--frames") == 0 && i + 1 < argc) {
            frames = argv[++i];
        } else if (argv[i][0] != '-') {
            book = argv[i];
        }
    }

    lua_State *L = luaL_newstate();
    if (!L) {
        fprintf(stderr, "cannot create Lua state\n");
        return 1;
    }
    luaL_openlibs(L);

    set_global(L, "READER_BOOK", book);
    set_global(L, "READER_SCREENSHOT", shot);
    set_global(L, "READER_PAGE", page);
    set_global(L, "READER_ZOOM", zoom);
    set_global(L, "READER_FRAMES", frames);

    lua_getglobal(L, "package");
    lua_getfield(L, -1, "path");
    const char *oldpath = lua_tostring(L, -1);
    char newpath[8192];
    snprintf(newpath, sizeof(newpath), "./lua/?.lua;./lua/?/init.lua;%s",
             oldpath ? oldpath : "");
    lua_pop(L, 1);
    lua_pushstring(L, newpath);
    lua_setfield(L, -2, "path");
    lua_pop(L, 1);

    if (luaL_dofile(L, "lua/ui/app.lua") != LUA_OK) {
        fprintf(stderr, "lua error: %s\n", lua_tostring(L, -1));
        lua_close(L);
        return 1;
    }

    lua_close(L);
    return 0;
}
