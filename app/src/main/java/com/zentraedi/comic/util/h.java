package com.zentraedi.comic.util;

import com.zentraedi.business.utils.t7;
import com.zentraedi.business.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class h {

    @fo.k
    public static final h a = new h();

    @fo.k
    private static final String b = "sp_key_comic_detail_display_mode";

    @fo.k
    private static final String c = "sp_comic_shelf_list_show_sort";

    @fo.k
    private static final String d = "sp_comic_shelf_list_show_order";

    @fo.k
    private static final String e = "sp_comic_edited_list_show_sort";

    @fo.k
    private static final String f = "sp_comic_edited_list_show_order";

    private h() {
    }

    @fo.k
    public final String a() {
        Object objD = t7.d(b + w0.a + w0.c + w0.F(), com.zentraedi.comic.constant.a.e.Af.a());
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String b() {
        Object objD = t7.d(f + w0.a + w0.c + w0.e, "desc");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String c() {
        Object objD = t7.d(e + w0.a + w0.c + w0.F(), "uptime");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String d() {
        Object objD = t7.d(d + w0.a + w0.c + w0.e, "desc");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String e() {
        Object objD = t7.d(c + w0.a + w0.c + w0.F(), "ctime");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    public final void f(@fo.k String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        t7.j(b + w0.a + w0.c + w0.F(), mode);
    }

    public final void g(@fo.k String order) {
        Intrinsics.checkNotNullParameter(order, "order");
        t7.j(f + w0.a + w0.c + w0.e, order);
    }

    public final void h(@fo.k String sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        t7.j(e + w0.a + w0.c + w0.F(), sort);
    }

    public final void i(@fo.k String order) {
        Intrinsics.checkNotNullParameter(order, "order");
        t7.j(d + w0.a + w0.c + w0.e, order);
    }

    public final void j(@fo.k String sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        t7.j(c + w0.a + w0.c + w0.F(), sort);
    }
}
