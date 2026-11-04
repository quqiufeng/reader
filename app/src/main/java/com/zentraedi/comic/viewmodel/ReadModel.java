package com.zentraedi.comic.viewmodel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public enum ReadModel {
    NORMAL_NULL(-1),
    NORMAL_READ(1),
    MANGA_READ(2),
    SCROLL_READ(0);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    ReadModel(int i) {
    }

    @fo.k
    public static EnumEntries<ReadModel> getEntries() {
        return $ENTRIES;
    }
}
