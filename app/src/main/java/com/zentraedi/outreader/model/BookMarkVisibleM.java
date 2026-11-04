package com.zentraedi.outreader.model;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class BookMarkVisibleM implements Serializable {
    private boolean isVisible;
    private int pagePosition;
    private int section;

    public int getPagePosition() {
        return this.pagePosition;
    }

    public int getSection() {
        return this.section;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setPagePosition(int pagePosition) {
        this.pagePosition = pagePosition;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }
}
