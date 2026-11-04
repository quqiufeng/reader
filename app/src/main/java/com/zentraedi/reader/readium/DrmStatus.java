package com.zentraedi.reader.readium;

import fo.k;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public enum DrmStatus {
    NONE,
    RESOURCE_ENCRYPTED,
    CONTENT_ENCRYPTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @k
    public static EnumEntries<DrmStatus> getEntries() {
        return $ENTRIES;
    }
}
