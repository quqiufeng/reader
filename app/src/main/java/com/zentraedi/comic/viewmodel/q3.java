package com.zentraedi.comic.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.zentraedi.business.activity.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class q3 extends com.zentraedi.basic.function.viewmodel.e {

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b a;

    @fo.l
    private n6 b;
    public Context c;

    @fo.l
    private com.zentraedi.comic.dialog.m d;

    @fo.k
    private View.OnClickListener e = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.i3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.k0(this.a, view);
        }
    };

    @fo.k
    private View.OnClickListener f = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.j3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.q0(this.a, view);
        }
    };

    @fo.k
    private View.OnClickListener g = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.k3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.o0(this.a, view);
        }
    };

    @fo.k
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.l3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.m0(this.a, view);
        }
    };

    @fo.k
    private View.OnClickListener i = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.m3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.i0(this.a, view);
        }
    };

    @fo.k
    private View.OnClickListener j = new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.n3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q3.h0(this.a, view);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(q3 q3Var, View view) {
        q3Var.C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(final q3 q3Var, View view) {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(q3Var.W()), com.zentraedi.comic.q.l.N4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.comic.databinding.a1 a1Var = (com.zentraedi.comic.databinding.a1) c0VarJ;
        n6 n6Var = q3Var.b;
        if (n6Var != null) {
            n6Var.x1(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.h3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q3.j0(this.a, view2);
                }
            });
        }
        a1Var.C1(q3Var.b);
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(q3Var.W(), a1Var.getRoot());
        q3Var.a = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = q3Var.a;
        if (bVar2 != null) {
            bVar2.d(17);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = q3Var.a;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(true);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = q3Var.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(q3 q3Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = q3Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(final q3 q3Var, View view) {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(q3Var.W()), com.zentraedi.comic.q.l.O4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.comic.databinding.c1 c1Var = (com.zentraedi.comic.databinding.c1) c0VarJ;
        n6 n6Var = q3Var.b;
        if (n6Var != null) {
            n6Var.x1(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.o3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q3.l0(this.a, view2);
                }
            });
        }
        c1Var.C1(q3Var.b);
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(q3Var.W(), c1Var.getRoot());
        q3Var.a = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = q3Var.a;
        if (bVar2 != null) {
            bVar2.d(17);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = q3Var.a;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(true);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = q3Var.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(q3 q3Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = q3Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(final q3 q3Var, View view) {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(q3Var.W()), com.zentraedi.comic.q.l.S4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.comic.databinding.k1 k1Var = (com.zentraedi.comic.databinding.k1) c0VarJ;
        n6 n6Var = q3Var.b;
        if (n6Var != null) {
            n6Var.x1(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.p3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q3.n0(this.a, view2);
                }
            });
        }
        k1Var.C1(q3Var.b);
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(q3Var.W(), k1Var.getRoot());
        q3Var.a = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = q3Var.a;
        if (bVar2 != null) {
            bVar2.d(17);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = q3Var.a;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(true);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = q3Var.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(q3 q3Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = q3Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(final q3 q3Var, View view) {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(q3Var.W()), com.zentraedi.comic.q.l.Q4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.comic.databinding.g1 g1Var = (com.zentraedi.comic.databinding.g1) c0VarJ;
        n6 n6Var = q3Var.b;
        if (n6Var != null) {
            n6Var.x1(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.g3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q3.p0(this.a, view2);
                }
            });
        }
        g1Var.C1(q3Var.b);
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(q3Var.W(), g1Var.getRoot());
        q3Var.a = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = q3Var.a;
        if (bVar2 != null) {
            bVar2.d(17);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = q3Var.a;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(true);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = q3Var.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(q3 q3Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = q3Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(final q3 q3Var, View view) {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(q3Var.W()), com.zentraedi.comic.q.l.R4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.comic.databinding.i1 i1Var = (com.zentraedi.comic.databinding.i1) c0VarJ;
        n6 n6Var = q3Var.b;
        if (n6Var != null) {
            n6Var.x1(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.f3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q3.r0(this.a, view2);
                }
            });
        }
        i1Var.C1(q3Var.b);
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(q3Var.W(), i1Var.getRoot());
        q3Var.a = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = q3Var.a;
        if (bVar2 != null) {
            bVar2.d(17);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = q3Var.a;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(true);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = q3Var.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(q3 q3Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = q3Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public final void A0(@fo.l n6 n6Var) {
        this.b = n6Var;
    }

    public final void B0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.f = onClickListener;
    }

    public final void C0() {
        BaseActivity baseActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(baseActivityE, "null cannot be cast to non-null type com.zentraedi.business.activity.BaseActivity");
        com.zentraedi.comic.dialog.m mVar = new com.zentraedi.comic.dialog.m(baseActivityE);
        this.d = mVar;
        mVar.show();
    }

    @fo.k
    public final Context W() {
        Context context = this.c;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException(com.umeng.analytics.pro.d.R);
        return null;
    }

    @fo.l
    public final com.zentraedi.comic.dialog.m X() {
        return this.d;
    }

    @fo.l
    public final com.zentraedi.basic.function.ui.dialog.b Y() {
        return this.a;
    }

    @fo.k
    public final View.OnClickListener Z() {
        return this.j;
    }

    @fo.k
    public final View.OnClickListener b0() {
        return this.i;
    }

    @fo.k
    public final View.OnClickListener c0() {
        return this.e;
    }

    public final void closeDialog() {
        com.zentraedi.comic.dialog.m mVar = this.d;
        if (mVar != null) {
            mVar.dismiss();
        }
    }

    @fo.k
    public final View.OnClickListener d0() {
        return this.h;
    }

    @fo.k
    public final View.OnClickListener e0() {
        return this.g;
    }

    @fo.l
    public final n6 f0() {
        return this.b;
    }

    @fo.k
    public final View.OnClickListener g0() {
        return this.f;
    }

    public final void s0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void t0(@fo.l com.zentraedi.comic.dialog.m mVar) {
        this.d = mVar;
    }

    public final void u0(@fo.l com.zentraedi.basic.function.ui.dialog.b bVar) {
        this.a = bVar;
    }

    public final void v0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.j = onClickListener;
    }

    public final void w0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.i = onClickListener;
    }

    public final void x0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.e = onClickListener;
    }

    public final void y0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.h = onClickListener;
    }

    public final void z0(@fo.k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
        this.g = onClickListener;
    }
}
