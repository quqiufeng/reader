package com.zentraedi.comic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.operationpopup.OperationItemViewModel;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.viewmodel.OverallReadSetting;
import com.zentraedi.comic.viewmodel.t4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSettingFragment.kt\ncom/zentraedi/comic/fragment/ComicSettingFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
public final class i3 extends com.zentraedi.business.fragment.a {
    private com.zentraedi.comic.databinding.w1 n;

    @fo.l
    private t4 o;

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.z2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i3.K2();
        }
    });

    public static final class a extends androidx.databinding.u.a {
        a() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            String string;
            ObservableField<String> observableFieldC0;
            ObservableField<Long> observableFieldB0;
            Long l;
            t4 t4Var = i3.this.o;
            long jLongValue = (t4Var == null || (observableFieldB0 = t4Var.b0()) == null || (l = (Long) observableFieldB0.get()) == null) ? 0L : l.longValue();
            if (jLongValue == 300000) {
                string = com.zentraedi.basic.function.utils.u0.c(5);
            } else if (jLongValue == 600000) {
                string = com.zentraedi.basic.function.utils.u0.c(10);
            } else {
                string = jLongValue == -60000 ? i3.this.getString(com.zentraedi.comic.q.C0124q.KH) : i3.this.getString(com.zentraedi.comic.q.C0124q.aM);
            }
            t4 t4Var2 = i3.this.o;
            if (t4Var2 == null || (observableFieldC0 = t4Var2.c0()) == null) {
                return;
            }
            observableFieldC0.set(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.v K2() {
        return new com.zentraedi.comic.business.v();
    }

    private final com.zentraedi.comic.business.v L2() {
        return (com.zentraedi.comic.business.v) this.p.getValue();
    }

    private final void M2() {
        ObservableField<Integer> observableFieldT;
        Integer numV;
        ObservableField<Boolean> observableFieldM0;
        ObservableField<Integer> observableFieldW;
        ObservableField<Integer> observableFieldN0;
        ObservableField<Long> observableFieldB0;
        ObservableField<Boolean> observableFieldX;
        OverallReadSetting overallReadSetting = (OverallReadSetting) t7.d(ComicReaderActivity.y5, new OverallReadSetting(0, true, 0L, 0, 1, true, null, false, 0, null, 960, null));
        t4 t4Var = this.o;
        if (t4Var != null && (observableFieldX = t4Var.X()) != null) {
            observableFieldX.set(Boolean.valueOf(overallReadSetting.c()));
        }
        t4 t4Var2 = this.o;
        if (t4Var2 != null && (observableFieldB0 = t4Var2.b0()) != null) {
            observableFieldB0.set(Long.valueOf(overallReadSetting.d()));
        }
        t4 t4Var3 = this.o;
        if (t4Var3 != null && (observableFieldN0 = t4Var3.n0()) != null) {
            observableFieldN0.set(Integer.valueOf(overallReadSetting.m()));
        }
        t4 t4Var4 = this.o;
        if (t4Var4 != null && (observableFieldW = t4Var4.W()) != null) {
            observableFieldW.set(Integer.valueOf(overallReadSetting.b()));
        }
        t4 t4Var5 = this.o;
        if (t4Var5 != null && (observableFieldM0 = t4Var5.m0()) != null) {
            observableFieldM0.set(Boolean.valueOf(overallReadSetting.l()));
        }
        int iA = overallReadSetting.a();
        t4 t4Var6 = this.o;
        if (t4Var6 != null && (numV = t4Var6.V()) != null) {
            iA = numV.intValue();
        }
        t4 t4Var7 = this.o;
        if (t4Var7 == null || (observableFieldT = t4Var7.T()) == null) {
            return;
        }
        observableFieldT.set(Integer.valueOf(iA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(i3 i3Var, View view) {
        BaseActivity activity = i3Var.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity != null) {
            baseActivity.X3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    public static final Unit O2(final i3 i3Var, View view, final int i) {
        String string;
        ObservableField<Integer> observableFieldT;
        Integer num;
        int i2;
        ObservableField<Long> observableFieldB0;
        Long l;
        int iIntValue = 1;
        if (i != 0) {
            string = i != 1 ? i3Var.getString(com.zentraedi.comic.q.C0124q.aK) : i3Var.getString(com.zentraedi.comic.q.C0124q.aK);
        } else {
            string = i3Var.getString(com.zentraedi.comic.q.C0124q.dL);
        }
        String str = string;
        Intrinsics.checkNotNull(str);
        if (i != 0) {
            if (i != 1) {
                iIntValue = -1;
            } else {
                t4 t4Var = i3Var.o;
                long jLongValue = (t4Var == null || (observableFieldB0 = t4Var.b0()) == null || (l = (Long) observableFieldB0.get()) == null) ? 0L : l.longValue();
                if (jLongValue == 300000) {
                    i2 = 0;
                } else if (jLongValue != 600000) {
                    iIntValue = jLongValue == -60000 ? 2 : 3;
                }
            }
            i2 = iIntValue;
        } else {
            t4 t4Var2 = i3Var.o;
            if (t4Var2 == null || (observableFieldT = t4Var2.T()) == null || (num = (Integer) observableFieldT.get()) == null) {
                i2 = 0;
            } else {
                iIntValue = num.intValue();
                i2 = iIntValue;
            }
        }
        i3Var.L2().d(com.zentraedi.basic.function.utils.a.h().e(), view, str, i2, new Function0() { // from class: com.zentraedi.comic.fragment.y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i3.P2(i, i3Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List P2(int i, final i3 i3Var) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
            operationItemViewModel.setViewType(OperationItemViewModel.ALBUM_ITEM);
            operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UH));
            operationItemViewModel.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i3.Q2(this.a, view);
                }
            };
            arrayList.add(operationItemViewModel);
            OperationItemViewModel operationItemViewModel2 = new OperationItemViewModel();
            operationItemViewModel2.setViewType(OperationItemViewModel.ALBUM_ITEM);
            operationItemViewModel2.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.BM));
            operationItemViewModel2.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.d3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i3.R2(this.a, view);
                }
            };
            arrayList.add(operationItemViewModel2);
            return arrayList;
        }
        if (i != 1) {
            return arrayList;
        }
        OperationItemViewModel operationItemViewModel3 = new OperationItemViewModel();
        operationItemViewModel3.setViewType(OperationItemViewModel.ALBUM_ITEM);
        operationItemViewModel3.title.set(com.zentraedi.basic.function.utils.u0.c(5));
        operationItemViewModel3.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i3.S2(this.a, view);
            }
        };
        arrayList.add(operationItemViewModel3);
        OperationItemViewModel operationItemViewModel4 = new OperationItemViewModel();
        operationItemViewModel4.setViewType(OperationItemViewModel.ALBUM_ITEM);
        operationItemViewModel4.title.set(com.zentraedi.basic.function.utils.u0.c(10));
        operationItemViewModel4.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.f3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i3.T2(this.a, view);
            }
        };
        arrayList.add(operationItemViewModel4);
        OperationItemViewModel operationItemViewModel5 = new OperationItemViewModel();
        operationItemViewModel5.setViewType(OperationItemViewModel.ALBUM_ITEM);
        operationItemViewModel5.title.set(i3Var.getString(com.zentraedi.comic.q.C0124q.KH));
        operationItemViewModel5.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i3.U2(this.a, view);
            }
        };
        arrayList.add(operationItemViewModel5);
        OperationItemViewModel operationItemViewModel6 = new OperationItemViewModel();
        operationItemViewModel6.setViewType(OperationItemViewModel.ALBUM_ITEM);
        operationItemViewModel6.title.set(i3Var.getString(com.zentraedi.comic.q.C0124q.aM));
        operationItemViewModel6.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.h3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i3.V2(this.a, view);
            }
        };
        arrayList.add(operationItemViewModel6);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(i3 i3Var, View view) {
        ObservableField<Integer> observableFieldT;
        t4 t4Var = i3Var.o;
        if (t4Var != null && (observableFieldT = t4Var.T()) != null) {
            observableFieldT.set(0);
        }
        i3Var.L2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(i3 i3Var, View view) {
        ObservableField<Integer> observableFieldT;
        t4 t4Var = i3Var.o;
        if (t4Var != null && (observableFieldT = t4Var.T()) != null) {
            observableFieldT.set(1);
        }
        i3Var.L2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(i3 i3Var, View view) {
        t4 t4Var = i3Var.o;
        if (t4Var != null) {
            t4Var.D0(5);
        }
        i3Var.L2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(i3 i3Var, View view) {
        t4 t4Var = i3Var.o;
        if (t4Var != null) {
            t4Var.D0(10);
        }
        i3Var.L2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(i3 i3Var, View view) {
        t4 t4Var = i3Var.o;
        if (t4Var != null) {
            t4Var.D0(IntCompanionObject.MAX_VALUE);
        }
        i3Var.L2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(i3 i3Var, View view) {
        t4 t4Var = i3Var.o;
        if (t4Var != null) {
            t4Var.D0(0);
        }
        i3Var.L2().b();
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.zentraedi.comic.databinding.w1 w1VarY1 = com.zentraedi.comic.databinding.w1.y1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(w1VarY1, "inflate(...)");
        this.n = w1VarY1;
        FragmentActivity activity = getActivity();
        com.zentraedi.comic.databinding.w1 w1Var = null;
        this.o = activity != null ? (t4) androidx.lifecycle.p2.c(activity).c(t4.class) : null;
        com.zentraedi.comic.databinding.w1 w1Var2 = this.n;
        if (w1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            w1Var2 = null;
        }
        w1Var2.C1(this.o);
        com.zentraedi.comic.databinding.w1 w1Var3 = this.n;
        if (w1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            w1Var = w1Var3;
        }
        View root = w1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public void onResume() {
        M2();
        t4 t4Var = this.o;
        if (t4Var != null) {
            t4Var.z0();
        }
        super.onResume();
    }

    public void onViewCreated(@fo.k final View view, @fo.l Bundle bundle) {
        ObservableField<Long> observableFieldB0;
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.zentraedi.comic.databinding.w1 w1Var = this.n;
        if (w1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            w1Var = null;
        }
        w1Var.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i3.N2(this.a, view2);
            }
        });
        t4 t4Var = this.o;
        if (t4Var != null && (observableFieldB0 = t4Var.b0()) != null) {
            observableFieldB0.addOnPropertyChangedCallback(new a());
        }
        t4 t4Var2 = this.o;
        if (t4Var2 != null) {
            t4Var2.K0(new Function1() { // from class: com.zentraedi.comic.fragment.b3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i3.O2(this.a, view, ((Integer) obj).intValue());
                }
            });
        }
    }
}
