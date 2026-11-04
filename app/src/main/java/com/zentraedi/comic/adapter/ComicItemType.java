package com.zentraedi.comic.adapter;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public enum ComicItemType {
    COMIC_ITEM_TYPE_IMAGE(65536),
    COMIC_ITEM_TYPE_PDF(65537),
    COMIC_ITEM_TYPE_EPUB(65538),
    COMIC_ITEM_TYPE_ZIP(65539);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    ComicItemType(int i) {
    }

    @fo.k
    public static EnumEntries<ComicItemType> getEntries() {
        return $ENTRIES;
    }
}
