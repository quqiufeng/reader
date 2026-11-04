-- 测试样本清单。
--
-- 真实电子书放在 READER_BOOK_DIR（默认 /home/quqiufeng/Downloads/book），
-- 不复制进仓库，避免体积和版权问题。可用环境变量覆盖：
--
--   READER_BOOK_DIR=/path/to/books luajit tools/auto_smoke.lua

return {
  root = os.getenv("READER_BOOK_DIR") or "/home/quqiufeng/Downloads/book",
  samples = {
    { format = "pdf",  file = "Algorithms-JeffE.pdf",                        pages = 472, drm = false },
    { format = "pdf",  file = "Software.Design.for.Python.Programmers.2026.1.pdf", pages = 458, drm = false },
    { format = "epub", file = "Web.Development.with.Django.6.3rd.2026.3.epub", drm = false },
    { format = "mobi", file = "一站式学习C编程.mobi",                          drm = false },
    { format = "mobi", file = "耶路撒冷三千年.mobi",                            drm = false },
    { format = "azw3", file = "A01075. Linux内核API完全参考手册.B009WMAZ02.azw3", drm = false },
    { format = "txt",  file = "sample.txt", path = "testdata/sample.txt", drm = false },
  },
}
