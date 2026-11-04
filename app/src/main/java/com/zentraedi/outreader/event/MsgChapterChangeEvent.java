package com.zentraedi.outreader.event;

import com.zentraedi.business.message.event.BaseMessageEvent;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class MsgChapterChangeEvent extends BaseMessageEvent {
    public static final String MSG_CHAPTER_CHANGE = "chapter_change";
    public static final String MSG_CHAPTER_CHANGE_QUICK = "chapter_change_quick";
    public static final int TYPE_MSG_CHAPTER_CHANGE = 0;
    public static final int TYPE_MSG_CHAPTER_CHANGE_BY_SIZE = 3;
    public static final int TYPE_MSG_CHAPTER_CHANGE_FIRST_INTER = 2;
    public static final int TYPE_MSG_CHAPTER_CHANGE_QUICK = 1;
    private String mChapterId;
    private String mChapterName;
    private int mPageIndex;

    public MsgChapterChangeEvent(String message) {
        super(message);
        this.mPageIndex = 0;
    }

    public int getPageIndex() {
        return this.mPageIndex;
    }

    public String getmChapterId() {
        return this.mChapterId;
    }

    public String getmChapterName() {
        return this.mChapterName;
    }

    public void setPageIndex(int index) {
        this.mPageIndex = index;
    }

    public MsgChapterChangeEvent(String message, String chapterId, String chapterName) {
        super(message);
        this.mPageIndex = 0;
        this.mChapterId = chapterId;
        this.mChapterName = chapterName;
    }
}
