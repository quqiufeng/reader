package com.zentraedi.comic.util;

import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.business.utils.t7;
import com.zentraedi.business.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class g {

    @fo.k
    public static final g a = new g();

    @fo.k
    private static final String b = "sp_comic_house_display_mode_";

    @fo.k
    private static final String c = "sp_comic_house_list_sort_";

    @fo.k
    private static final String d = "sp_comic_house_list_order_";

    @fo.k
    private static final String e = "sp_comic_house_sub_list_sort_";

    @fo.k
    private static final String f = "sp_comic_house_sub_list_order_";

    private g() {
    }

    private final String a() {
        return b + w0.a + '_' + w0.F();
    }

    private final String c(String str) {
        if (str == null) {
            str = "";
        }
        String strA = r.a(str);
        Intrinsics.checkNotNullExpressionValue(strA, "md5(...)");
        return strA;
    }

    private final String h() {
        return d + w0.a + '_' + w0.F();
    }

    private final String n() {
        return c + w0.a + '_' + w0.F();
    }

    private final String o(String str) {
        return d + c(str) + w0.a + '_' + w0.F();
    }

    private final String p(String str) {
        return c + c(str) + w0.a + '_' + w0.F();
    }

    @fo.k
    public final String b() {
        Object objD = t7.d(a(), com.zentraedi.comic.constant.a.e.Af.a());
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String d() {
        Object objD = t7.d(h(), FileListRequest.ORDER_BY_DESC);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String e() {
        Object objD = t7.d(n(), "ctime");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String f(@fo.l String str) {
        Object objD = t7.d(o(str), FileListRequest.ORDER_BY_ASC);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    @fo.k
    public final String g(@fo.l String str) {
        Object objD = t7.d(p(str), "name");
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return (String) objD;
    }

    public final void i(@fo.k String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        t7.j(a(), mode);
    }

    public final void j(@fo.k String order) {
        Intrinsics.checkNotNullParameter(order, "order");
        t7.j(h(), order);
    }

    public final void k(@fo.k String sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        t7.j(n(), sort);
    }

    public final void l(@fo.l String str, @fo.k String order) {
        Intrinsics.checkNotNullParameter(order, "order");
        t7.j(o(str), order);
    }

    public final void m(@fo.l String str, @fo.k String sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        t7.j(p(str), sort);
    }
}
