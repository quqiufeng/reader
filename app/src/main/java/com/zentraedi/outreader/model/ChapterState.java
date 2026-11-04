package com.zentraedi.outreader.model;

import com.zentraedi.basic.function.server.BaseModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class ChapterState extends BaseModel {
    public static final int STATE_HAS_READ = 1;
    private String chapterId;
    private int state;

    public ChapterState(String chapterId, int state) {
        this.chapterId = chapterId;
        this.state = state;
    }

    public String getChapterId() {
        return this.chapterId;
    }

    public int getState() {
        return this.state;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public void setState(int state) {
        this.state = state;
    }
}
