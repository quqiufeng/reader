package com.zentraedi.comic.dialog;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zentraedi.comic.databinding.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class v {

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b a;

    @fo.l
    private t0 b;

    @fo.l
    private String c;

    @fo.l
    private Function0<Unit> d;

    @fo.l
    private Function0<Unit> e;

    @fo.l
    private Function0<Unit> f;

    @fo.l
    private Function0<Unit> g;

    @fo.l
    private Function0<Unit> h;

    private final void m(t0 t0Var) {
        t0Var.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.n(this.a, view);
            }
        });
        t0Var.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.o(this.a, view);
            }
        });
        t0Var.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.p(this.a, view);
            }
        });
        t0Var.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.q(this.a, view);
            }
        });
        t0Var.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.r(this.a, view);
            }
        });
        t0Var.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.s(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(v vVar, View view) {
        Function0<Unit> function0;
        if (!com.zentraedi.business.utils.m.c() && (function0 = vVar.d) != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(v vVar, View view) {
        Function0<Unit> function0;
        if (!com.zentraedi.business.utils.m.c() && (function0 = vVar.e) != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(v vVar, View view) {
        Function0<Unit> function0;
        if (!com.zentraedi.business.utils.m.c() && (function0 = vVar.f) != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(v vVar, View view) {
        Function0<Unit> function0;
        if (!com.zentraedi.business.utils.m.c() && (function0 = vVar.h) != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(v vVar, View view) {
        Function0<Unit> function0;
        if (!com.zentraedi.business.utils.m.c() && (function0 = vVar.g) != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(v vVar, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = vVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @fo.l
    public final Function0<Unit> g() {
        return this.e;
    }

    @fo.l
    public final Function0<Unit> h() {
        return this.d;
    }

    @fo.l
    public final Function0<Unit> i() {
        return this.g;
    }

    @fo.l
    public final Function0<Unit> j() {
        return this.h;
    }

    @fo.l
    public final Function0<Unit> k() {
        return this.f;
    }

    @fo.l
    public final String l() {
        return this.c;
    }

    public final void t(@fo.l Function0<Unit> function0) {
        this.e = function0;
    }

    public final void u(@fo.l Function0<Unit> function0) {
        this.d = function0;
    }

    public final void v(@fo.l Function0<Unit> function0) {
        this.g = function0;
    }

    public final void w(@fo.l Function0<Unit> function0) {
        this.h = function0;
    }

    public final void x(@fo.l Function0<Unit> function0) {
        this.f = function0;
    }

    public final void y(@fo.l String str) {
        this.c = str;
    }

    public final void z(@fo.k String sortBy, @fo.k String order) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(order, "order");
        if (this.b == null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            t0 t0Var = (t0) androidx.databinding.m.j(LayoutInflater.from(activityE), com.zentraedi.comic.q.l.V2, (ViewGroup) null, false);
            this.b = t0Var;
            Intrinsics.checkNotNull(t0Var);
            m(t0Var);
            t0 t0Var2 = this.b;
            Intrinsics.checkNotNull(t0Var2);
            com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, t0Var2.getRoot());
            this.a = bVar;
            bVar.d(80);
            com.zentraedi.basic.function.ui.dialog.b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.c(com.zentraedi.comic.q.r.Kp);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar3 = this.a;
            if (bVar3 != null) {
                bVar3.setCanceledOnTouchOutside(true);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar4 = this.a;
            if (bVar4 != null) {
                bVar4.setCancelable(true);
            }
        }
        if (TextUtils.isEmpty(this.c)) {
            t0 t0Var3 = this.b;
            if (t0Var3 != null && (linearLayout8 = t0Var3.H) != null) {
                linearLayout8.setVisibility(8);
            }
            t0 t0Var4 = this.b;
            if (t0Var4 != null && (linearLayout7 = t0Var4.I) != null) {
                linearLayout7.setVisibility(8);
            }
            t0 t0Var5 = this.b;
            if (t0Var5 != null && (linearLayout6 = t0Var5.J) != null) {
                linearLayout6.setVisibility(8);
            }
            t0 t0Var6 = this.b;
            if (t0Var6 != null && (linearLayout5 = t0Var6.F) != null) {
                linearLayout5.setVisibility(0);
            }
        } else {
            t0 t0Var7 = this.b;
            if (t0Var7 != null && (linearLayout4 = t0Var7.H) != null) {
                linearLayout4.setVisibility(0);
            }
            t0 t0Var8 = this.b;
            if (t0Var8 != null && (linearLayout3 = t0Var8.I) != null) {
                linearLayout3.setVisibility(0);
            }
            t0 t0Var9 = this.b;
            if (t0Var9 != null && (linearLayout2 = t0Var9.J) != null) {
                linearLayout2.setVisibility(0);
            }
            t0 t0Var10 = this.b;
            if (t0Var10 != null && (linearLayout = t0Var10.F) != null) {
                linearLayout.setVisibility(8);
            }
        }
        t0 t0Var11 = this.b;
        if (t0Var11 != null) {
            t0Var11.setSortBy(sortBy);
        }
        t0 t0Var12 = this.b;
        if (t0Var12 != null) {
            t0Var12.setOrder(order);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar5 = this.a;
        if (bVar5 != null) {
            bVar5.show();
        }
    }
}
