package com.zentraedi.outreader.v2.fragment;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.litao.slider.NiftySlider;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class v1 extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a q = new a(null);
    private com.zentraedi.outreader.databinding.j1 o;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.i1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v1.P2(this.a);
        }
    });
    private Boolean p = (Boolean) t7.d(gh.b.p, Boolean.TRUE);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final v1 a() {
            return new v1();
        }

        private a() {
        }
    }

    private final com.zentraedi.outreader.viewmodel.d M2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    private final int N2() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = M2().M();
        return aVar.c(bookModelM != null ? bookModelM.getBookFileType() : null);
    }

    private final void O2(boolean z, boolean z2) {
        nd.a.e("nas_book", "ReaderMenuThemeFragment->lightSelectState isSystemBrightnessSelect=" + z + " isNight=" + z2);
        com.zentraedi.outreader.databinding.j1 j1Var = null;
        if (!z) {
            com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
            if (j1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j1Var2 = null;
            }
            j1Var2.X.setCompoundDrawables(null, null, null, null);
            com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
            if (j1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j1Var3 = null;
            }
            j1Var3.X.setTextColor(androidx.core.content.e.g(requireContext(), com.zentraedi.outreader.d.f.Qx));
            com.zentraedi.outreader.databinding.j1 j1Var4 = this.o;
            if (j1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                j1Var = j1Var4;
            }
            j1Var.X.setBackgroundResource(com.zentraedi.outreader.d.h.GZ);
            return;
        }
        Drawable drawableG = com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.nj);
        if (drawableG != null) {
            drawableG.setBounds(0, 0, drawableG.getIntrinsicWidth(), drawableG.getIntrinsicHeight());
            com.zentraedi.outreader.databinding.j1 j1Var5 = this.o;
            if (j1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j1Var5 = null;
            }
            j1Var5.X.setCompoundDrawables(drawableG, null, null, null);
        }
        com.zentraedi.outreader.databinding.j1 j1Var6 = this.o;
        if (j1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var6 = null;
        }
        j1Var6.X.setTextColor(androidx.core.content.e.g(requireContext(), com.zentraedi.outreader.d.f.Nx));
        com.zentraedi.outreader.databinding.j1 j1Var7 = this.o;
        if (j1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            j1Var = j1Var7;
        }
        j1Var.X.setBackgroundResource(com.zentraedi.outreader.d.h.HZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d P2(v1 v1Var) {
        FragmentActivity fragmentActivityRequireActivity = v1Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        com.zentraedi.basic.function.utils.e.c(com.zentraedi.basic.function.utils.a.h().e(), i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R2(v1 v1Var, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean bool = Boolean.FALSE;
        v1Var.p = bool;
        Object objD = t7.d(gh.b.A, bool);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        v1Var.O2(false, ((Boolean) objD).booleanValue());
        t7.j(gh.b.p, v1Var.p);
        t7.j(gh.b.o, Integer.valueOf(MathKt.roundToInt(it.getValue())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(5);
        Object objF = v1Var.M2().T().f();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(objF, bool)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(2);
            }
        }
        v1Var.M2().T().r(bool);
        t7.j(gh.b.A, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(6);
        if (Intrinsics.areEqual(v1Var.M2().T().f(), Boolean.TRUE)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(1);
            }
        }
        androidx.lifecycle.d1<Boolean> d1VarT = v1Var.M2().T();
        Boolean bool = Boolean.FALSE;
        d1VarT.r(bool);
        t7.j(gh.b.A, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(v1 v1Var, View view) {
        v1Var.p = Boolean.valueOf(!v1Var.p.booleanValue());
        Boolean bool = (Boolean) t7.d(gh.b.A, Boolean.FALSE);
        Boolean isSystemBrightnessSelect = v1Var.p;
        Intrinsics.checkNotNullExpressionValue(isSystemBrightnessSelect, "isSystemBrightnessSelect");
        boolean zBooleanValue = isSystemBrightnessSelect.booleanValue();
        Intrinsics.checkNotNull(bool);
        v1Var.O2(zBooleanValue, bool.booleanValue());
        t7.j(gh.b.p, v1Var.p);
        v1Var.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(v1 v1Var, View view) {
        v1Var.e3(1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(v1 v1Var, View view) {
        v1Var.e3(2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(v1 v1Var, View view) {
        v1Var.e3(3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(1);
        if (Intrinsics.areEqual(v1Var.M2().T().f(), Boolean.TRUE)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(1);
            }
        }
        androidx.lifecycle.d1<Boolean> d1VarT = v1Var.M2().T();
        Boolean bool = Boolean.FALSE;
        d1VarT.r(bool);
        t7.j(gh.b.A, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(2);
        if (Intrinsics.areEqual(v1Var.M2().T().f(), Boolean.TRUE)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(1);
            }
        }
        androidx.lifecycle.d1<Boolean> d1VarT = v1Var.M2().T();
        Boolean bool = Boolean.FALSE;
        d1VarT.r(bool);
        t7.j(gh.b.A, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(3);
        if (Intrinsics.areEqual(v1Var.M2().T().f(), Boolean.TRUE)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(1);
            }
        }
        androidx.lifecycle.d1<Boolean> d1VarT = v1Var.M2().T();
        Boolean bool = Boolean.FALSE;
        d1VarT.r(bool);
        t7.j(gh.b.A, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(v1 v1Var, View view) {
        androidx.appcompat.app.g gVarY2;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        v1Var.c3(4);
        if (Intrinsics.areEqual(v1Var.M2().T().f(), Boolean.TRUE)) {
            BaseActivity activity = v1Var.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
            if (baseActivity != null && (gVarY2 = baseActivity.Y2()) != null) {
                gVarY2.d0(1);
            }
        }
        androidx.lifecycle.d1<Boolean> d1VarT = v1Var.M2().T();
        Boolean bool = Boolean.FALSE;
        d1VarT.r(bool);
        t7.j(gh.b.A, bool);
    }

    private final void c3(int i) {
        int iN2;
        if (i == 0) {
            iN2 = N2();
        } else {
            ReaderUtils.a aVar = ReaderUtils.a;
            BookModel bookModelM = M2().M();
            aVar.B(bookModelM != null ? bookModelM.getBookFileType() : null, i);
            iN2 = i;
        }
        com.zentraedi.outreader.databinding.j1 j1Var = this.o;
        if (j1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var = null;
        }
        int i2 = 0;
        j1Var.F.setSelected(iN2 == 1);
        com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
        if (j1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var2 = null;
        }
        j1Var2.R.setSelected(iN2 == 2);
        com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
        if (j1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var3 = null;
        }
        j1Var3.U.setSelected(iN2 == 3);
        com.zentraedi.outreader.databinding.j1 j1Var4 = this.o;
        if (j1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var4 = null;
        }
        j1Var4.J.setSelected(iN2 == 4);
        com.zentraedi.outreader.databinding.j1 j1Var5 = this.o;
        if (j1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var5 = null;
        }
        j1Var5.E.setSelected(iN2 == 5);
        com.zentraedi.outreader.databinding.j1 j1Var6 = this.o;
        if (j1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var6 = null;
        }
        j1Var6.S.setSelected(iN2 == 6);
        switch (iN2) {
            case 1:
                com.zentraedi.outreader.databinding.j1 j1Var7 = this.o;
                if (j1Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var7 = null;
                }
                if (!j1Var7.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var8 = this.o;
                    if (j1Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var8 = null;
                    }
                    if (j1Var8.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.dT;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.VQ;
                }
                break;
            case 2:
                com.zentraedi.outreader.databinding.j1 j1Var9 = this.o;
                if (j1Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var9 = null;
                }
                if (!j1Var9.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var10 = this.o;
                    if (j1Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var10 = null;
                    }
                    if (j1Var10.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.eT;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.WQ;
                }
                break;
            case 3:
                com.zentraedi.outreader.databinding.j1 j1Var11 = this.o;
                if (j1Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var11 = null;
                }
                if (!j1Var11.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var12 = this.o;
                    if (j1Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var12 = null;
                    }
                    if (j1Var12.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.aT;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.SQ;
                }
                break;
            case 4:
                com.zentraedi.outreader.databinding.j1 j1Var13 = this.o;
                if (j1Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var13 = null;
                }
                if (!j1Var13.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var14 = this.o;
                    if (j1Var14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var14 = null;
                    }
                    if (j1Var14.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.cT;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.UQ;
                }
                break;
            case 5:
                com.zentraedi.outreader.databinding.j1 j1Var15 = this.o;
                if (j1Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var15 = null;
                }
                if (!j1Var15.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var16 = this.o;
                    if (j1Var16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var16 = null;
                    }
                    if (j1Var16.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.bT;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.TQ;
                }
                break;
            case 6:
                com.zentraedi.outreader.databinding.j1 j1Var17 = this.o;
                if (j1Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var17 = null;
                }
                if (!j1Var17.N.isSelected()) {
                    com.zentraedi.outreader.databinding.j1 j1Var18 = this.o;
                    if (j1Var18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j1Var18 = null;
                    }
                    if (j1Var18.O.isSelected()) {
                        i2 = com.zentraedi.outreader.d.h.ZS;
                    }
                } else {
                    i2 = com.zentraedi.outreader.d.h.RQ;
                }
                break;
        }
        f3();
        if (i != 0) {
            ReaderUtils.a aVar2 = ReaderUtils.a;
            BookModel bookModelM2 = M2().M();
            int iC = aVar2.c(bookModelM2 != null ? bookModelM2.getBookFileType() : null);
            com.zentraedi.reader.i iVarY = M2().Y();
            com.zentraedi.outreader.reader.c cVar = iVarY instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY : null;
            if (cVar != null) {
                cVar.setBackgroundColor(iC);
            }
            com.zentraedi.reader.i iVarY2 = M2().Y();
            com.zentraedi.outreader.reader.c cVar2 = iVarY2 instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY2 : null;
            if (cVar2 != null) {
                cVar2.j(i2);
            }
        }
    }

    private final void d3() {
        com.zentraedi.outreader.databinding.j1 j1Var = null;
        if (this.p.booleanValue()) {
            int iA = com.zentraedi.basic.function.utils.e.a(com.zentraedi.basic.function.utils.a.h().e());
            com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
            if (j1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                j1Var = j1Var2;
            }
            j1Var.T.j0(iA, false);
            t7.j(gh.b.o, Integer.valueOf(iA));
            com.zentraedi.basic.function.utils.e.d(com.zentraedi.basic.function.utils.a.h().e());
            return;
        }
        Integer num = (Integer) t7.d(gh.b.o, Integer.valueOf(com.zentraedi.basic.function.utils.e.a(com.zentraedi.basic.function.utils.a.h().e())));
        com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
        if (j1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            j1Var = j1Var3;
        }
        j1Var.T.j0(num.intValue(), false);
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(num);
        com.zentraedi.basic.function.utils.e.c(activityE, num.intValue());
    }

    private final void e3(int i, boolean z) {
        int iN2 = N2();
        com.zentraedi.outreader.databinding.j1 j1Var = this.o;
        if (j1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var = null;
        }
        int i2 = 0;
        j1Var.K.setSelected(i == 1);
        com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
        if (j1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var2 = null;
        }
        j1Var2.N.setSelected(i == 2);
        com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
        if (j1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var3 = null;
        }
        j1Var3.O.setSelected(i == 3);
        com.zentraedi.outreader.databinding.j1 j1Var4 = this.o;
        if (j1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var4 = null;
        }
        j1Var4.Z.setBackgroundResource(i == 1 ? com.zentraedi.outreader.d.h.BV : com.zentraedi.outreader.d.h.CV);
        com.zentraedi.outreader.databinding.j1 j1Var5 = this.o;
        if (j1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var5 = null;
        }
        j1Var5.a0.setBackgroundResource(i == 2 ? com.zentraedi.outreader.d.h.BV : com.zentraedi.outreader.d.h.CV);
        com.zentraedi.outreader.databinding.j1 j1Var6 = this.o;
        if (j1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var6 = null;
        }
        j1Var6.b0.setBackgroundResource(i == 3 ? com.zentraedi.outreader.d.h.BV : com.zentraedi.outreader.d.h.CV);
        if (z) {
            ReaderUtils.a aVar = ReaderUtils.a;
            BookModel bookModelM = M2().M();
            aVar.C(bookModelM != null ? bookModelM.getBookFileType() : null, i);
        }
        if (i != 1) {
            if (i == 2) {
                switch (iN2) {
                    case 1:
                        i2 = com.zentraedi.outreader.d.h.VQ;
                        break;
                    case 2:
                        i2 = com.zentraedi.outreader.d.h.WQ;
                        break;
                    case 3:
                        i2 = com.zentraedi.outreader.d.h.SQ;
                        break;
                    case 4:
                        i2 = com.zentraedi.outreader.d.h.UQ;
                        break;
                    case 5:
                        i2 = com.zentraedi.outreader.d.h.TQ;
                        break;
                    case 6:
                        i2 = com.zentraedi.outreader.d.h.RQ;
                        break;
                }
            } else if (i == 3) {
                switch (iN2) {
                    case 1:
                        i2 = com.zentraedi.outreader.d.h.dT;
                        break;
                    case 2:
                        i2 = com.zentraedi.outreader.d.h.eT;
                        break;
                    case 3:
                        i2 = com.zentraedi.outreader.d.h.aT;
                        break;
                    case 4:
                        i2 = com.zentraedi.outreader.d.h.cT;
                        break;
                    case 5:
                        i2 = com.zentraedi.outreader.d.h.bT;
                        break;
                    case 6:
                        i2 = com.zentraedi.outreader.d.h.ZS;
                        break;
                }
            }
        }
        if (z) {
            ReaderUtils.a aVar2 = ReaderUtils.a;
            BookModel bookModelM2 = M2().M();
            int iC = aVar2.c(bookModelM2 != null ? bookModelM2.getBookFileType() : null);
            com.zentraedi.reader.i iVarY = M2().Y();
            com.zentraedi.outreader.reader.c cVar = iVarY instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY : null;
            if (cVar != null) {
                cVar.setBackgroundColor(iC);
            }
            com.zentraedi.reader.i iVarY2 = M2().Y();
            com.zentraedi.outreader.reader.c cVar2 = iVarY2 instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY2 : null;
            if (cVar2 != null) {
                cVar2.j(i2);
            }
        }
    }

    private final void f3() {
        com.zentraedi.outreader.databinding.j1 j1Var = null;
        switch (N2()) {
            case 1:
                com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
                if (j1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var2 = null;
                }
                j1Var2.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.yv));
                com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
                if (j1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var3 = null;
                }
                j1Var3.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.X60));
                com.zentraedi.outreader.databinding.j1 j1Var4 = this.o;
                if (j1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var4;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.b70));
                break;
            case 2:
                com.zentraedi.outreader.databinding.j1 j1Var5 = this.o;
                if (j1Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var5 = null;
                }
                j1Var5.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.zv));
                com.zentraedi.outreader.databinding.j1 j1Var6 = this.o;
                if (j1Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var6 = null;
                }
                j1Var6.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.h70));
                com.zentraedi.outreader.databinding.j1 j1Var7 = this.o;
                if (j1Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var7;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.i70));
                break;
            case 3:
                com.zentraedi.outreader.databinding.j1 j1Var8 = this.o;
                if (j1Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var8 = null;
                }
                j1Var8.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.vv));
                com.zentraedi.outreader.databinding.j1 j1Var9 = this.o;
                if (j1Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var9 = null;
                }
                j1Var9.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.S60));
                com.zentraedi.outreader.databinding.j1 j1Var10 = this.o;
                if (j1Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var10;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.T60));
                break;
            case 4:
                com.zentraedi.outreader.databinding.j1 j1Var11 = this.o;
                if (j1Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var11 = null;
                }
                j1Var11.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.xv));
                com.zentraedi.outreader.databinding.j1 j1Var12 = this.o;
                if (j1Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var12 = null;
                }
                j1Var12.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.Z60));
                com.zentraedi.outreader.databinding.j1 j1Var13 = this.o;
                if (j1Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var13;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.a70));
                break;
            case 5:
                com.zentraedi.outreader.databinding.j1 j1Var14 = this.o;
                if (j1Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var14 = null;
                }
                j1Var14.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.wv));
                com.zentraedi.outreader.databinding.j1 j1Var15 = this.o;
                if (j1Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var15 = null;
                }
                j1Var15.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.V60));
                com.zentraedi.outreader.databinding.j1 j1Var16 = this.o;
                if (j1Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var16;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.W60));
                break;
            case 6:
                com.zentraedi.outreader.databinding.j1 j1Var17 = this.o;
                if (j1Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var17 = null;
                }
                j1Var17.K.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.uv));
                com.zentraedi.outreader.databinding.j1 j1Var18 = this.o;
                if (j1Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    j1Var18 = null;
                }
                j1Var18.N.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.P60));
                com.zentraedi.outreader.databinding.j1 j1Var19 = this.o;
                if (j1Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    j1Var = j1Var19;
                }
                j1Var.O.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.Q60));
                break;
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.ve, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.j1 j1Var = (com.zentraedi.outreader.databinding.j1) c0VarJ;
        this.o = j1Var;
        if (j1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var = null;
        }
        return j1Var.getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.zentraedi.outreader.databinding.j1 j1Var = null;
        if (M2().Y() instanceof com.zentraedi.outreader.reader.f) {
            com.zentraedi.outreader.databinding.j1 j1Var2 = this.o;
            if (j1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j1Var2 = null;
            }
            j1Var2.Y.setVisibility(8);
            com.zentraedi.outreader.databinding.j1 j1Var3 = this.o;
            if (j1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j1Var3 = null;
            }
            j1Var3.P.setVisibility(8);
        }
        Boolean bool = (Boolean) t7.d(gh.b.A, Boolean.FALSE);
        Boolean isSystemBrightnessSelect = this.p;
        Intrinsics.checkNotNullExpressionValue(isSystemBrightnessSelect, "isSystemBrightnessSelect");
        boolean zBooleanValue = isSystemBrightnessSelect.booleanValue();
        Intrinsics.checkNotNull(bool);
        O2(zBooleanValue, bool.booleanValue());
        d3();
        c3(0);
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = M2().M();
        e3(aVar.e(bookModelM != null ? bookModelM.getBookFileType() : null), false);
        com.zentraedi.outreader.databinding.j1 j1Var4 = this.o;
        if (j1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var4 = null;
        }
        j1Var4.T.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.m1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return v1.Q2((NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var5 = this.o;
        if (j1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var5 = null;
        }
        j1Var5.T.M0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.R2(this.a, (NiftySlider) obj);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var6 = this.o;
        if (j1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var6 = null;
        }
        j1Var6.X.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.U2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var7 = this.o;
        if (j1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var7 = null;
        }
        j1Var7.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.V2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var8 = this.o;
        if (j1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var8 = null;
        }
        j1Var8.N.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.W2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var9 = this.o;
        if (j1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var9 = null;
        }
        j1Var9.O.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.X2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var10 = this.o;
        if (j1Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var10 = null;
        }
        j1Var10.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.Y2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var11 = this.o;
        if (j1Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var11 = null;
        }
        j1Var11.R.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.Z2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var12 = this.o;
        if (j1Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var12 = null;
        }
        j1Var12.U.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.a3(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var13 = this.o;
        if (j1Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var13 = null;
        }
        j1Var13.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.b3(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var14 = this.o;
        if (j1Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j1Var14 = null;
        }
        j1Var14.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.S2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.j1 j1Var15 = this.o;
        if (j1Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            j1Var = j1Var15;
        }
        j1Var.S.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v1.T2(this.a, view2);
            }
        });
    }
}
