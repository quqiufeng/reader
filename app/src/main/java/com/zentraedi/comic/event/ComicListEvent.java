package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicListEvent extends BaseMessageEvent {

    @k
    public static final a Companion = new a(null);

    @k
    private static final String MESSAGE_IN_EDIT = "MESSAGE_IN_EDIT";

    @k
    private static final String MESSAGE_QUIT_EDIT = "MESSAGE_QUIT_EDIT";

    @k
    private static final String MESSAGE_GOTO_FINISH_EDIT = "MESSAGE_GOTO_FINISH_EDIT";

    @k
    private static final String MESSAGE_REFRESH = "MESSAGE_REFRESH";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final String a() {
            return ComicListEvent.MESSAGE_GOTO_FINISH_EDIT;
        }

        @k
        public final String b() {
            return ComicListEvent.MESSAGE_IN_EDIT;
        }

        @k
        public final String c() {
            return ComicListEvent.MESSAGE_QUIT_EDIT;
        }

        @k
        public final String d() {
            return ComicListEvent.MESSAGE_REFRESH;
        }

        private a() {
        }
    }

    public ComicListEvent() {
    }

    public ComicListEvent(@l String str) {
        super(str);
    }
}
