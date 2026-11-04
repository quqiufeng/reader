package com.zentraedi.comic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableBoolean;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.event.ComicStartFlushEvent;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c extends com.zentraedi.business.fragment.a {
    private com.zentraedi.comic.databinding.o1 n;

    @fo.l
    private com.zentraedi.comic.viewmodel.q o;

    private final void B2() {
        com.zentraedi.comic.viewmodel.q qVar = this.o;
        if (qVar != null) {
            qVar.y0();
        }
        com.zentraedi.comic.viewmodel.q qVar2 = this.o;
        if (qVar2 != null) {
            com.zentraedi.comic.databinding.o1 o1Var = this.n;
            if (o1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                o1Var = null;
            }
            RecyclerView rv = o1Var.F;
            Intrinsics.checkNotNullExpressionValue(rv, "rv");
            qVar2.p0(rv);
        }
    }

    private final void C2() {
        com.zentraedi.comic.databinding.o1 o1Var = this.n;
        if (o1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            o1Var = null;
        }
        o1Var.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.D2(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(final c cVar, View view) {
        com.zentraedi.comic.delegate.a.a.g(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.fragment.b
            public final void continueDo() {
                c.E2(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(c cVar) {
        ObservableBoolean observableBooleanI0;
        com.zentraedi.comic.viewmodel.q qVar = cVar.o;
        if (qVar == null || (observableBooleanI0 = qVar.I0()) == null) {
            return;
        }
        observableBooleanI0.set(false);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicStartFlushEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.zentraedi.comic.viewmodel.q qVar = this.o;
        if (qVar != null) {
            String dirIds = event.getDirIds();
            if (dirIds == null) {
                dirIds = "";
            }
            qVar.P0(dirIds);
        }
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        org.greenrobot.eventbus.c.f().v(this);
        com.zentraedi.comic.databinding.o1 o1VarY1 = com.zentraedi.comic.databinding.o1.y1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o1VarY1, "inflate(...)");
        this.n = o1VarY1;
        FragmentActivity activity = getActivity();
        com.zentraedi.comic.databinding.o1 o1Var = null;
        this.o = activity != null ? (com.zentraedi.comic.viewmodel.q) androidx.lifecycle.p2.c(activity).c(com.zentraedi.comic.viewmodel.q.class) : null;
        com.zentraedi.comic.databinding.o1 o1Var2 = this.n;
        if (o1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            o1Var2 = null;
        }
        o1Var2.C1(this.o);
        com.zentraedi.comic.databinding.o1 o1Var3 = this.n;
        if (o1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            o1Var = o1Var3;
        }
        View root = o1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        B2();
        C2();
    }
}
