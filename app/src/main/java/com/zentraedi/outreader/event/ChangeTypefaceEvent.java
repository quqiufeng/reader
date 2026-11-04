package com.zentraedi.outreader.event;

import android.graphics.Typeface;
import com.zentraedi.business.message.event.BaseMessageEvent;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class ChangeTypefaceEvent extends BaseMessageEvent {
    private String mType;
    private Typeface mTypeface;

    public ChangeTypefaceEvent(Typeface typeface) {
        this.mTypeface = typeface;
    }

    public String getType() {
        return this.mType;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public void setType(String type) {
        this.mType = type;
    }
}
