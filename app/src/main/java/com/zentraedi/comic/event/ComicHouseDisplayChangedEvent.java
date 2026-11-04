package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicHouseDisplayChangedEvent extends BaseMessageEvent {

    @k
    public static final a Companion = new a(null);
    private boolean displayChanged;

    @l
    private String sortPath;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ComicHouseDisplayChangedEvent c(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return aVar.b(str);
        }

        @k
        public final ComicHouseDisplayChangedEvent a() {
            ComicHouseDisplayChangedEvent comicHouseDisplayChangedEvent = new ComicHouseDisplayChangedEvent();
            comicHouseDisplayChangedEvent.setDisplayChanged(true);
            return comicHouseDisplayChangedEvent;
        }

        @k
        public final ComicHouseDisplayChangedEvent b(@l String str) {
            ComicHouseDisplayChangedEvent comicHouseDisplayChangedEvent = new ComicHouseDisplayChangedEvent();
            comicHouseDisplayChangedEvent.setSortPath(str);
            return comicHouseDisplayChangedEvent;
        }

        private a() {
        }
    }

    public final boolean getDisplayChanged() {
        return this.displayChanged;
    }

    @l
    public final String getSortPath() {
        return this.sortPath;
    }

    public final void setDisplayChanged(boolean z) {
        this.displayChanged = z;
    }

    public final void setSortPath(@l String str) {
        this.sortPath = str;
    }
}
