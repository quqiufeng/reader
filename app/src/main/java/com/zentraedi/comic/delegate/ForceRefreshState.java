package com.zentraedi.comic.delegate;

import com.zentraedi.comic.viewmodel.t2;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public enum ForceRefreshState {
    WAITING("waiting"),
    RUNNING("running"),
    DONE("done"),
    CANCEL(t2.F);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @fo.k
    private final String value;

    ForceRefreshState(String str) {
        this.value = str;
    }

    @fo.k
    public static EnumEntries<ForceRefreshState> getEntries() {
        return $ENTRIES;
    }

    @fo.k
    public final String getValue() {
        return this.value;
    }
}
