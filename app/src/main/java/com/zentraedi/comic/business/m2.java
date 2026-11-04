package com.zentraedi.comic.business;

import androidx.fragment.app.FragmentManager;
import com.zentraedi.comic.fragment.i3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicMainFragmentBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicMainFragmentBusiness.kt\ncom/zentraedi/comic/business/ComicMainFragmentBusiness\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class m2 {

    @fo.k
    public static final a j = new a(null);

    @fo.k
    public static final String k = "BookMainFragmentBusiness";

    @fo.l
    private FragmentManager d;

    @fo.l
    private List<com.zentraedi.business.fragment.a> e;

    @fo.l
    private com.zentraedi.comic.fragment.d0 f;

    @fo.l
    private com.zentraedi.comic.fragment.m1 g;

    @fo.l
    private i3 h;
    private final int a = 1;
    private final int b = 2;
    private final int c = 3;
    private int i = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a() {
        if (com.zentraedi.basic.function.utils.j0.l(this.e)) {
            this.e = new ArrayList();
            com.zentraedi.comic.fragment.d0 d0Var = new com.zentraedi.comic.fragment.d0();
            this.f = d0Var;
            List<com.zentraedi.business.fragment.a> list = this.e;
            if (list != null) {
                list.add(d0Var);
            }
            com.zentraedi.comic.fragment.m1 m1Var = new com.zentraedi.comic.fragment.m1();
            this.g = m1Var;
            List<com.zentraedi.business.fragment.a> list2 = this.e;
            if (list2 != null) {
                list2.add(m1Var);
            }
            i3 i3Var = new i3();
            this.h = i3Var;
            List<com.zentraedi.business.fragment.a> list3 = this.e;
            if (list3 != null) {
                list3.add(i3Var);
            }
            b();
        }
    }

    private final void b() {
        if (this.d == null || com.zentraedi.basic.function.utils.j0.l(this.e)) {
            return;
        }
        FragmentManager fragmentManager = this.d;
        androidx.fragment.app.t0 t0VarW = fragmentManager != null ? fragmentManager.w() : null;
        List<com.zentraedi.business.fragment.a> arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (com.zentraedi.business.fragment.a aVar : arrayList) {
            if (aVar != null && t0VarW != null) {
                t0VarW.f(com.zentraedi.comic.q.i.d8, aVar);
            }
        }
        if (t0VarW != null) {
            j(t0VarW);
        }
        if (t0VarW != null) {
            try {
                t0VarW.r();
            } catch (Exception unused) {
                nd.a.c("BookMainFragmentBusiness", "Failed to add fragments");
                this.e = null;
            }
        }
    }

    private final void j(androidx.fragment.app.t0 t0Var) {
        if (this.d == null || com.zentraedi.basic.function.utils.j0.l(this.e)) {
            return;
        }
        List<com.zentraedi.business.fragment.a> arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (com.zentraedi.business.fragment.a aVar : arrayList) {
            if (aVar != null) {
                t0Var.y(aVar);
            }
        }
    }

    private final void q(com.zentraedi.business.fragment.a aVar) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager == null) {
            return;
        }
        Intrinsics.checkNotNull(fragmentManager);
        androidx.fragment.app.t0 t0VarW = fragmentManager.w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        j(t0VarW);
        if (aVar != null) {
            t0VarW.U(aVar);
        }
        try {
            t0VarW.r();
        } catch (Exception unused) {
        }
    }

    public final int c() {
        return this.i;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.c;
    }

    @fo.l
    public final com.zentraedi.comic.fragment.d0 g() {
        return this.f;
    }

    @fo.l
    public final com.zentraedi.comic.fragment.m1 h() {
        return this.g;
    }

    @fo.l
    public final i3 i() {
        return this.h;
    }

    public final void k(int i) {
        this.i = i;
    }

    public final void l(@fo.l FragmentManager fragmentManager) {
        this.d = fragmentManager;
    }

    public final void m(@fo.l com.zentraedi.comic.fragment.d0 d0Var) {
        this.f = d0Var;
    }

    public final void n(@fo.l com.zentraedi.comic.fragment.m1 m1Var) {
        this.g = m1Var;
    }

    public final void o(@fo.l i3 i3Var) {
        this.h = i3Var;
    }

    public final void p(int i) {
        if (com.zentraedi.basic.function.utils.j0.l(this.e)) {
            a();
        }
        this.i = i;
        if (i == this.a) {
            q(this.f);
        } else if (i == this.b) {
            q(this.g);
        } else if (i == this.c) {
            q(this.h);
        }
    }
}
