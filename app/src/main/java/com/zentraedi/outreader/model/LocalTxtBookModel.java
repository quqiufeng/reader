package com.zentraedi.outreader.model;

import com.zentraedi.basic.function.server.BaseModel;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class LocalTxtBookModel extends BaseModel {
    private List<LocalTxtChapterModel> chapterInfoList;
    private String name;
    private long words;

    public static class LocalTxtChapterModel extends BaseModel {
        private String chapterId;
        private transient String content;
        private String name;
        private long words;

        public String getChapterId() {
            return this.chapterId;
        }

        public String getContent() {
            return this.content;
        }

        public String getName() {
            return this.name;
        }

        public long getWords() {
            return this.words;
        }

        public void setChapterId(String chapterId) {
            this.chapterId = chapterId;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWords(long words) {
            this.words = words;
        }
    }

    public List<LocalTxtChapterModel> getChapterInfoList() {
        return this.chapterInfoList;
    }

    public String getName() {
        return this.name;
    }

    public long getWords() {
        return this.words;
    }

    public void setChapterInfoList(List<LocalTxtChapterModel> chapterInfoList) {
        this.chapterInfoList = chapterInfoList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWords(long words) {
        this.words = words;
    }
}
