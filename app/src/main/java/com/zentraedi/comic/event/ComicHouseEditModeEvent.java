package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicHouseEditModeEvent extends BaseMessageEvent {

    @k
    private String cid;
    private boolean inEdit;
    private boolean isFolderMode;

    public ComicHouseEditModeEvent(boolean z, boolean z2, @k String cid) {
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.inEdit = z;
        this.isFolderMode = z2;
        this.cid = cid;
    }

    @k
    public final String getCid() {
        return this.cid;
    }

    public final boolean getInEdit() {
        return this.inEdit;
    }

    public final boolean isFolderMode() {
        return this.isFolderMode;
    }

    public final void setCid(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cid = str;
    }

    public final void setFolderMode(boolean z) {
        this.isFolderMode = z;
    }

    public final void setInEdit(boolean z) {
        this.inEdit = z;
    }

    public /* synthetic */ ComicHouseEditModeEvent(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str);
    }
}
