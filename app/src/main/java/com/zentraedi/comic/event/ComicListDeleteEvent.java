package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.comic.viewmodel.i6;
import fo.k;
import fo.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicListDeleteEvent extends BaseMessageEvent {

    @k
    public static final a Companion = new a(null);

    @k
    public static final String OPTION_TYPE_DELETE_FILE = "delete_file";

    @k
    public static final String OPTION_TYPE_DELETE_READ_RECORD = "delete_read_record";

    @k
    public static final String OPTION_TYPE_REMOVE_FROM_SHELF = "remove_from_shelf";

    @k
    private List<i6> comicThumbItemViewModels = new ArrayList();

    @l
    private String option;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @k
    public final List<i6> getComicThumbItemViewModels() {
        return this.comicThumbItemViewModels;
    }

    @l
    public final String getOption() {
        return this.option;
    }

    public final void setComicThumbItemViewModels(@k List<i6> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.comicThumbItemViewModels = list;
    }

    public final void setOption(@l String str) {
        this.option = str;
    }
}
