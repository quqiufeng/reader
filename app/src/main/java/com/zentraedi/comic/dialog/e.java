package com.zentraedi.comic.dialog;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.graphics.d0;
import androidx.core.view.a2;
import androidx.core.view.e1;
import androidx.core.view.q3;
import androidx.core.view.s2;
import androidx.core.view.v4;
import androidx.lifecycle.m2;
import androidx.lifecycle.r2;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.utils.g8;
import com.zentraedi.comic.databinding.f0;
import com.zentraedi.comic.viewmodel.t4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicAutoReadBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicAutoReadBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicAutoReadBottomDialog\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,123:1\n13#2:124\n*S KotlinDebug\n*F\n+ 1 ComicAutoReadBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicAutoReadBottomDialog\n*L\n31#1:124\n*E\n"})
public final class e extends com.zentraedi.basic.function.ui.dialog.a {

    @fo.k
    private final BaseActivity b;

    @fo.k
    private final Lazy c;
    private f0 d;
    private int e;

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class a implements Function0<t4> {
        final /* synthetic */ r2 a;

        public a(r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.t4] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t4 invoke() {
            return new m2(this.a).c(t4.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@fo.k BaseActivity mContext) {
        super(mContext, com.zentraedi.comic.q.r.is);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.b = mContext;
        this.c = LazyKt.lazy(new a(mContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k() {
        if (p()) {
            Window window = getWindow();
            Intrinsics.checkNotNull(window);
            View viewFindViewById = window.getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            r(viewFindViewById);
        }
    }

    private final t4 n() {
        return (t4) this.c.getValue();
    }

    private final boolean p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    private final void r(View view) {
        try {
            a2.l2(view, new e1() { // from class: com.zentraedi.comic.dialog.d
                public final q3 onApplyWindowInsets(View view2, q3 q3Var) {
                    return e.s(this.a, view2, q3Var);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q3 s(e eVar, View v, q3 insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        d0 d0VarF = insets.f(q3.p.i() | q3.p.c());
        Intrinsics.checkNotNullExpressionValue(d0VarF, "getInsets(...)");
        eVar.e = d0VarF.c;
        if (k0.t(eVar.b)) {
            f0 f0Var = eVar.d;
            f0 f0Var2 = null;
            if (f0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                f0Var = null;
            }
            LinearLayout linearLayout = f0Var.G;
            ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = k0.a(eVar.b, 375) + g8.h();
            }
            if (eVar.e == 0) {
                if (layoutParams2 != null) {
                    layoutParams2.setMarginEnd(g8.h());
                }
            } else if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(0);
            }
            f0 f0Var3 = eVar.d;
            if (f0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                f0Var2 = f0Var3;
            }
            LinearLayout linearLayout2 = f0Var2.G;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams2);
            }
        }
        return insets;
    }

    public final int l() {
        return this.e;
    }

    @fo.k
    public final BaseActivity m() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void o() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        s2.c(window, false);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setStatusBarColor(0);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        window3.setNavigationBarColor(0);
        Window window4 = getWindow();
        Intrinsics.checkNotNull(window4);
        Window window5 = getWindow();
        Intrinsics.checkNotNull(window5);
        v4 v4VarA = s2.a(window4, window5.getDecorView());
        Intrinsics.checkNotNullExpressionValue(v4VarA, "getInsetsController(...)");
        v4VarA.i(true);
        v4VarA.h(true);
        v4VarA.d(q3.p.i());
        v4VarA.j(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zentraedi.basic.function.ui.dialog.a
    protected void onCreate(@fo.l Bundle bundle) {
        super.onCreate(bundle);
        f0 f0VarZ1 = f0.z1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(f0VarZ1, "inflate(...)");
        this.d = f0VarZ1;
        f0 f0Var = null;
        if (f0VarZ1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            f0VarZ1 = null;
        }
        f0VarZ1.E1(n());
        f0 f0Var2 = this.d;
        if (f0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            f0Var2 = null;
        }
        setContentView(f0Var2.getRoot());
        if (k0.t(this.b)) {
            Window window = getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            getBehavior().p1(k0.a(this.b, g8.d()));
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -2);
            }
            getBehavior().p1(k0.a(this.b, 480));
        }
        k();
        f0 f0Var3 = this.d;
        if (f0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            f0Var = f0Var3;
        }
        f0Var.H.setOnSeekBarChangeListener(n().j0());
    }

    protected void onStart() {
        super.onStart();
        if (!k0.t(this.b) || p()) {
            return;
        }
        f0 f0Var = this.d;
        f0 f0Var2 = null;
        if (f0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            f0Var = null;
        }
        LinearLayout linearLayout = f0Var.G;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = k0.a(this.b, 375) + g8.h();
        }
        if (layoutParams2 != null) {
            layoutParams2.setMarginEnd(g8.h());
        }
        f0 f0Var3 = this.d;
        if (f0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            f0Var2 = f0Var3;
        }
        LinearLayout linearLayout2 = f0Var2.G;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(layoutParams2);
        }
    }

    public final void q(int i) {
        this.e = i;
    }
}
