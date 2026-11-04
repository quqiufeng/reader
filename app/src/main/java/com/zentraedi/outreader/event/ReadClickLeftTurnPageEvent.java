package com.zentraedi.outreader.event;

import com.zentraedi.business.message.event.BaseMessageEvent;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class ReadClickLeftTurnPageEvent extends BaseMessageEvent {
    private final boolean leftClick;

    public ReadClickLeftTurnPageEvent(boolean z) {
        this.leftClick = z;
    }

    public final boolean getLeftClick() {
        return this.leftClick;
    }
}
