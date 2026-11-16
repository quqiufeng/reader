cmake_minimum_required(VERSION 3.20)
project(native_reader C CXX)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

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

# ---------------------------------------------------------------- OCR (CPU) --
# PP-OCRv4 (DBNet det + CRNN rec) over ONNX Runtime, exposed through the
# src/shim/ocr_api.cpp C ABI and driven from lua/ffi/ocr.lua.
set(READER_OCR "ON" CACHE BOOL "Build the CPU OCR helper (reader_ocr)")
set(READER_OCR_MODEL_DIR "/data/models/ocr" CACHE PATH "Default PP-OCRv4 model directory")
set(ORT_ROOT "" CACHE PATH "ONNX Runtime root (include/ + lib/)")
find_path(ORT_INCLUDE onnxruntime_cxx_api.h
    PATHS "${ORT_ROOT}/include"
          /data/venv/onnxruntime-linux-x64-gpu-1.20.1/include
          /venv/onnxruntime-linux-x64-gpu-1.26.0/include
          /usr/local/include /usr/include)
find_library(ORT_LIB NAMES onnxruntime libonnxruntime.so.1
    PATHS "${ORT_ROOT}/lib" /usr/local/lib /usr/lib/x86_64-linux-gnu)
if(READER_OCR AND ORT_INCLUDE AND ORT_LIB)
    add_library(reader_ocr SHARED src/shim/ocr_api.cpp src/ocr/ocr.cpp)
    target_compile_definitions(reader_ocr PRIVATE
        READER_OCR_MODEL_DIR="${READER_OCR_MODEL_DIR}")
    target_include_directories(reader_ocr PRIVATE ${ORT_INCLUDE} ${CMAKE_SOURCE_DIR}/src/ocr)
    # Vendored stb headers are noisy; keep the project warning-clean.
    set_source_files_properties(src/ocr/ocr.cpp PROPERTIES COMPILE_OPTIONS "-w")
    target_link_libraries(reader_ocr PRIVATE ${ORT_LIB} m)
    set_target_properties(reader_ocr PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}
        OUTPUT_NAME reader_ocr
        INSTALL_RPATH "$ORIGIN:/usr/local/lib"
        BUILD_WITH_INSTALL_RPATH TRUE)
    message(STATUS "OCR: enabled (CPU) ort=${ORT_LIB} models=${READER_OCR_MODEL_DIR}")
else()
    message(STATUS "OCR: disabled (set ORT_ROOT / ORT_INCLUDE / ORT_LIB to enable)")
endif()

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
