cmake_minimum_required(VERSION 3.20)
project(native_reader C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

set(MUPDF_ROOT "/opt/mupdf" CACHE PATH "MuPDF root")
set(MUPDF_LIB "${MUPDF_ROOT}/build/shared-release/libmupdf.so" CACHE FILEPATH "MuPDF library")
file(REAL_PATH "${MUPDF_LIB}" MUPDF_REAL)
set(LIBMOBI_ROOT "/opt/libmobi" CACHE PATH "libmobi root")

find_package(PkgConfig REQUIRED)
pkg_check_modules(SDL2 REQUIRED sdl2)
pkg_check_modules(LIBZIP REQUIRED libzip)
pkg_check_modules(LIBXML2 REQUIRED libxml-2.0)

add_library(reader_native SHARED
    src/shim/reader_api.c
    src/shim/mobi_epub.c)
target_include_directories(reader_native PRIVATE
    ${MUPDF_ROOT}/include
    ${LIBMOBI_ROOT}/src
    ${CMAKE_SOURCE_DIR}/third_party/stb
    ${LIBXML2_INCLUDE_DIRS})
target_link_options(reader_native PRIVATE -Wl,--exclude-libs,ALL)
target_link_libraries(reader_native PRIVATE
    ${MUPDF_LIB}
    ${LIBMOBI_ROOT}/src/.libs/libmobi.a
    ${LIBXML2_LIBRARIES}
    ${LIBZIP_LIBRARIES}
    z m dl pthread)
set_target_properties(reader_native PROPERTIES
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}
    OUTPUT_NAME reader_native
    INSTALL_RPATH "$ORIGIN"
    BUILD_WITH_INSTALL_RPATH TRUE)

add_library(reader_ctl SHARED src/ctl/reader_ctl.c)
set_target_properties(reader_ctl PROPERTIES
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}
    OUTPUT_NAME reader_ctl
    INSTALL_RPATH "$ORIGIN"
    BUILD_WITH_INSTALL_RPATH TRUE)

# Vendored LuaJIT: build the bundled static library, no system luajit.
set(LUAJIT_DIR "${CMAKE_SOURCE_DIR}/third_party/luajit")
set(LUAJIT_LIB "${LUAJIT_DIR}/src/libluajit.a")
add_custom_command(
    OUTPUT ${LUAJIT_LIB}
    COMMAND ${CMAKE_MAKE_PROGRAM} -C ${LUAJIT_DIR} BUILDMODE=static
    COMMENT "Building bundled LuaJIT (static)"
    VERBATIM)
add_custom_target(luajit_static DEPENDS ${LUAJIT_LIB})

add_executable(native-reader src/main.c)
target_include_directories(native-reader PRIVATE ${LUAJIT_DIR}/src)
target_link_libraries(native-reader PRIVATE
    ${LUAJIT_LIB}
    ${SDL2_LIBRARIES}
    m dl pthread)
target_link_options(native-reader PRIVATE -rdynamic)
set_target_properties(native-reader PROPERTIES
    INSTALL_RPATH "$ORIGIN/lib:$ORIGIN"
    BUILD_WITH_INSTALL_RPATH TRUE)
add_dependencies(native-reader luajit_static)

add_custom_command(TARGET reader_native POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E create_symlink
        "${MUPDF_REAL}" "$<TARGET_FILE_DIR:reader_native>/libmupdf.so.28.0"
    VERBATIM)
