cmake_minimum_required(VERSION 3.20)
project(native_reader C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

find_package(PkgConfig REQUIRED)
pkg_check_modules(SDL2 REQUIRED sdl2)
pkg_check_modules(LUAJIT REQUIRED luajit)

add_library(reader_native SHARED src/shim/reader_api.c)
target_include_directories(reader_native PRIVATE
    /opt/mupdf/include
    ${CMAKE_SOURCE_DIR}/third_party/stb)
target_link_libraries(reader_native PRIVATE
    /opt/mupdf/build/release/libmupdf.a
    /opt/mupdf/build/release/libmupdf-third.a
    m dl pthread)
set_target_properties(reader_native PROPERTIES
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}
    OUTPUT_NAME reader_native)

add_library(reader_ctl SHARED src/ctl/reader_ctl.c)
set_target_properties(reader_ctl PROPERTIES
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}
    OUTPUT_NAME reader_ctl)

add_executable(native-reader src/main.c)
target_include_directories(native-reader PRIVATE ${LUAJIT_INCLUDE_DIRS})
target_link_libraries(native-reader PRIVATE
    ${LUAJIT_LIBRARIES}
    ${SDL2_LIBRARIES}
    m dl pthread)
target_link_options(native-reader PRIVATE -rdynamic)
