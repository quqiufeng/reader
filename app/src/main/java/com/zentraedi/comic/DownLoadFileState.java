package com.zentraedi.comic;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public enum DownLoadFileState {
    SUCCESS,
    FAIL,
    WAIT,
    LOADMORE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @fo.k
    public static EnumEntries<DownLoadFileState> getEntries() {
        return $ENTRIES;
    }
}
