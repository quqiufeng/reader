package com.zentraedi.outreader.event;

import com.zentraedi.business.message.event.BaseMessageEvent;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class MsgLoadChapterContentEvent extends BaseMessageEvent {
    public static final String LOAD_CHAPTER_CONTENT = "load_chapter_content";
    public static final String RELOAD_CHAPTER_CONTENT = "reload_chapter_content";
    private int mChapterIndex;

    public MsgLoadChapterContentEvent(String message) {
        ((BaseMessageEvent) this).mMessage = message;
    }

    public int getmChapterIndex() {
        return this.mChapterIndex;
    }

    public MsgLoadChapterContentEvent(String message, int chapterIndex) {
        ((BaseMessageEvent) this).mMessage = message;
        this.mChapterIndex = chapterIndex;
    }
}
