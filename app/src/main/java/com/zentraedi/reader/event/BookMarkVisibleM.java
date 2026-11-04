package com.zentraedi.reader.event;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
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

    public void setPagePosition(int i) {
        this.pagePosition = i;
    }

    public void setSection(int i) {
        this.section = i;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }
}
