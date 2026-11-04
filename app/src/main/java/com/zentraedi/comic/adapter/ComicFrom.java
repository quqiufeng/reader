package com.zentraedi.comic.adapter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public enum ComicFrom {
    COMIC_ITEM_FROM_IMAGE(65536),
    COMIC_ITEM_FROM_PDF(65537),
    COMIC_ITEM_FROM_EPUB(65538),
    COMIC_ITEM_FROM_ZIP(65539);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    ComicFrom(int i) {
    }

    @fo.k
    public static EnumEntries<ComicFrom> getEntries() {
        return $ENTRIES;
    }
}
