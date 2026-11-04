package com.zentraedi.comic.business;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.zentraedi.business.R;
import com.zentraedi.business.utils.m6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class u {

    @fo.l
    private com.zentraedi.business.dialog.k a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.zentraedi.basic.function.ui.dialog.b bVar, com.zentraedi.business.listener.l lVar, View view) {
        bVar.dismiss();
        lVar.continueDo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(com.zentraedi.business.listener.l lVar, com.zentraedi.business.dialog.k kVar, View view) {
        lVar.continueDo();
        kVar.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(com.zentraedi.business.dialog.k kVar, View view) {
        kVar.cancel();
    }

    public final void e(@fo.k Activity activity, @fo.k final com.zentraedi.business.listener.l continueListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(continueListener, "continueListener");
        com.zentraedi.business.widget.j0 j0Var = new com.zentraedi.business.widget.j0(activity);
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) activity, (View) j0Var, m6.a.e());
        j0Var.setTitleText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vy));
        j0Var.setContentText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sM));
        j0Var.setRightButtonText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        j0Var.setRightButtonClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.f(bVar, continueListener, view);
            }
        });
        j0Var.setLeftButtonText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        j0Var.setLeftButtonClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.g(bVar, view);
            }
        });
        bVar.d(17);
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.show();
    }

    public final void h(@fo.k Activity activity, @fo.k final com.zentraedi.business.listener.l continueListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(continueListener, "continueListener");
        final com.zentraedi.business.dialog.k kVar = new com.zentraedi.business.dialog.k(activity);
        kVar.n(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vy));
        kVar.l(com.zentraedi.basic.function.utils.a.n(R.string.dx), new View.OnClickListener() { // from class: com.zentraedi.comic.business.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.i(continueListener, kVar, view);
            }
        }).j(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx), new View.OnClickListener() { // from class: com.zentraedi.comic.business.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.j(kVar, view);
            }
        }).w(com.zentraedi.basic.function.utils.a.n(R.string.Sn1));
        this.a = kVar;
        kVar.show();
    }
}
