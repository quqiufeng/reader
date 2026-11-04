package com.zentraedi.reader.reader;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class LocalPdfBookModel implements Serializable {
    public static final String MUPDF_VERSION = "1.18";

    public static class LocalPdfChapter implements Serializable {
        private boolean addByDefault;
        private int level;
        private String mupdfVersion;
        private int page;
        private String title;

        public int getLevel() {
            return this.level;
        }

        public String getMupdfVersion() {
            return this.mupdfVersion;
        }

        public int getPage() {
            return this.page;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean isAddByDefault() {
            return this.addByDefault;
        }

        public void setAddByDefault(boolean z) {
            this.addByDefault = z;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public void setMupdfVersion(String str) {
            this.mupdfVersion = str;
        }

        public void setPage(int i) {
            this.page = i;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "LocalPdfChapter{page=" + this.page + ", level=" + this.level + ", title='" + this.title + "'}";
        }
    }
}
