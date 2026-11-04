package com.zentraedi.comic.util;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a {

    @fo.k
    public static final a a = new a();
    private static boolean b;

    private a() {
    }

    public final boolean a() {
        return b;
    }

    public final void b(@fo.k String tagName, @fo.k String msg) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (b) {
            nd.a.a(tagName, msg);
        }
    }

    public final void c(boolean z) {
        b = z;
    }
}
