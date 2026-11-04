package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.widget.SeekBar;
import androidx.databinding.ObservableField;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.activity.ComicCategoryManagementActivity;
import com.zentraedi.comic.activity.ComicCodeBookManagementActivity;
import com.zentraedi.comic.activity.ComicContentManagementActivity;
import com.zentraedi.comic.activity.ComicReadSettingActivity;
import com.zentraedi.comic.activity.ComicReaderActivity;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class t4 extends com.zentraedi.basic.function.viewmodel.e {
    public static final int A = 1;
    public static final int B = 6;

    @fo.k
    public static final a y = new a(null);
    public static final int z = 0;

    @fo.l
    private com.zentraedi.comic.dialog.e a;

    @fo.k
    private ObservableField<PageTurning> b = new ObservableField<>(PageTurning.RIGHT);

    @fo.k
    private ObservableField<PageOver> c = new ObservableField<>(PageOver.SCROLL);

    @fo.k
    private final ObservableField<String> d = new ObservableField<>(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.Ov0), "num", 5));

    @fo.k
    private final ObservableField<String> e = new ObservableField<>(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.Ov0), "num", 10));

    @fo.k
    private final ObservableField<Boolean> f;

    @fo.k
    private final ObservableField<Boolean> g;

    @fo.k
    private final ObservableField<Integer> h;

    @fo.k
    private final ObservableField<Integer> i;

    @fo.k
    private final ObservableField<Long> j;

    @fo.k
    private final ObservableField<Integer> k;

    @fo.k
    private final ObservableField<String> l;

    @fo.k
    private final ObservableField<Integer> m;

    @fo.k
    private final ObservableField<Integer> n;

    @fo.k
    private final ObservableField<Integer> o;

    @fo.k
    private final ObservableField<Boolean> p;

    @fo.k
    private final ObservableField<String> q;

    @fo.l
    private Function1<? super OverallReadSetting, Unit> r;

    @fo.k
    private final ObservableField<ComicApplyScope> s;

    @fo.l
    private Function1<? super ComicApplyScope, Unit> t;
    private boolean u;

    @fo.l
    private Function1<? super Integer, Unit> v;

    @fo.l
    private Integer w;

    @fo.k
    private final SeekBar.OnSeekBarChangeListener x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements com.zentraedi.business.utils.n4.j {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(t4 t4Var) {
            t4Var.U().set("0M");
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.en2));
        }

        public void confirmClick() {
            com.zentraedi.comic.util.i iVar = com.zentraedi.comic.util.i.a;
            final t4 t4Var = t4.this;
            iVar.a(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.viewmodel.u4
                public final void continueDo() {
                    t4.b.b(t4Var);
                }
            });
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            t4.this.S().set(Integer.valueOf(i));
            t4.this.R().set(Integer.valueOf(i));
            Integer num = (Integer) t4.this.T().get();
            int iIntValue = num != null ? num.intValue() : 0;
            Boolean bool = (Boolean) t4.this.X().get();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Long l = (Long) t4.this.b0().get();
            long jLongValue = l != null ? l.longValue() : 0L;
            Integer num2 = (Integer) t4.this.n0().get();
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) t4.this.W().get();
            int iIntValue3 = num3 != null ? num3.intValue() : 1;
            Boolean bool2 = (Boolean) t4.this.m0().get();
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            PageTurning pageTurning = (PageTurning) t4.this.g0().get();
            if (pageTurning == null) {
                pageTurning = PageTurning.SINGLE;
            }
            PageTurning pageTurning2 = pageTurning;
            Boolean bool3 = (Boolean) t4.this.k0().get();
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            Integer num4 = (Integer) t4.this.R().get();
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            PageOver pageOver = (PageOver) t4.this.f0().get();
            if (pageOver == null) {
                pageOver = PageOver.SCROLL;
            }
            OverallReadSetting overallReadSetting = new OverallReadSetting(iIntValue, zBooleanValue, jLongValue, iIntValue2, iIntValue3, zBooleanValue2, pageTurning2, zBooleanValue3, iIntValue4, pageOver);
            Function1<OverallReadSetting, Unit> function1H0 = t4.this.h0();
            if (function1H0 != null) {
                function1H0.invoke(overallReadSetting);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class d implements com.zentraedi.basic.component.easythread.b<Long> {
        d() {
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Long l) {
            if ((l != null ? l.longValue() : 0L) == 0) {
                t4.this.U().set("0B");
            } else {
                t4.this.U().set(com.zentraedi.business.utils.l5.R(l != null ? l.longValue() : 0L));
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable th2) {
        }
    }

    public t4() {
        Boolean bool = Boolean.TRUE;
        this.f = new ObservableField<>(bool);
        this.g = new ObservableField<>(Boolean.FALSE);
        this.h = new ObservableField<>(0);
        this.i = new ObservableField<>(0);
        this.j = new ObservableField<>(0L);
        this.k = new ObservableField<>(0);
        this.l = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.aM));
        this.m = new ObservableField<>(0);
        this.n = new ObservableField<>(0);
        this.o = new ObservableField<>(1);
        this.p = new ObservableField<>(bool);
        this.q = new ObservableField<>("0M");
        this.s = new ObservableField<>(ComicApplyScope.THIS_COMIC);
        this.u = true;
        this.x = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long A0(File file) {
        return Long.valueOf(com.zentraedi.business.utils.l5.w(file));
    }

    private final void v0() {
        Integer num = (Integer) this.m.get();
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) this.f.get();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l = (Long) this.j.get();
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num2 = (Integer) this.n.get();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) this.o.get();
        int iIntValue3 = num3 != null ? num3.intValue() : 1;
        Boolean bool2 = (Boolean) this.p.get();
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        PageTurning pageTurning = (PageTurning) this.b.get();
        if (pageTurning == null) {
            pageTurning = PageTurning.SINGLE;
        }
        Boolean bool3 = (Boolean) this.g.get();
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Integer num4 = (Integer) this.h.get();
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        PageOver pageOver = (PageOver) this.c.get();
        if (pageOver == null) {
            pageOver = PageOver.SCROLL;
        }
        OverallReadSetting overallReadSetting = new OverallReadSetting(iIntValue, zBooleanValue, jLongValue, iIntValue2, iIntValue3, zBooleanValue2, pageTurning, zBooleanValue3, iIntValue4, pageOver);
        Function1<? super OverallReadSetting, Unit> function1 = this.r;
        if (function1 != null) {
            function1.invoke(overallReadSetting);
        }
        if (this.u) {
            t7.j(ComicReaderActivity.y5, overallReadSetting);
        }
    }

    public final void B0(@fo.l Integer num) {
        this.w = num;
    }

    public final void C0() {
        ObservableField<Boolean> observableField = this.f;
        Object obj = observableField.get();
        Intrinsics.checkNotNull(obj);
        observableField.set(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        v0();
    }

    public final void D0(int i) {
        long j = ((long) (i * 60)) * 1000;
        if (i == Integer.MAX_VALUE) {
            this.k.set(1);
        } else {
            this.k.set(Integer.valueOf(i));
        }
        this.j.set(Long.valueOf(j));
        v0();
    }

    public final void E0(@fo.l com.zentraedi.comic.dialog.e eVar) {
        this.a = eVar;
    }

    public final void F0(@fo.k ObservableField<PageOver> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.c = observableField;
    }

    public final void G0(@fo.k ObservableField<PageTurning> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.b = observableField;
    }

    public final void H0(@fo.l Function1<? super OverallReadSetting, Unit> function1) {
        this.r = function1;
    }

    public final void I0(@fo.l Function1<? super ComicApplyScope, Unit> function1) {
        this.t = function1;
    }

    public final void J0() {
        ObservableField<Boolean> observableField = this.g;
        Object obj = observableField.get();
        Intrinsics.checkNotNull(obj);
        observableField.set(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        Integer num = (Integer) this.m.get();
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) this.f.get();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l = (Long) this.j.get();
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num2 = (Integer) this.n.get();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) this.o.get();
        int iIntValue3 = num3 != null ? num3.intValue() : 1;
        Boolean bool2 = (Boolean) this.p.get();
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        PageTurning pageTurning = (PageTurning) this.b.get();
        if (pageTurning == null) {
            pageTurning = PageTurning.SINGLE;
        }
        PageTurning pageTurning2 = pageTurning;
        Boolean bool3 = (Boolean) this.g.get();
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Integer num4 = (Integer) this.h.get();
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        PageOver pageOver = (PageOver) this.c.get();
        if (pageOver == null) {
            pageOver = PageOver.SCROLL;
        }
        OverallReadSetting overallReadSetting = new OverallReadSetting(iIntValue, zBooleanValue, jLongValue, iIntValue2, iIntValue3, zBooleanValue2, pageTurning2, zBooleanValue3, iIntValue4, pageOver);
        Function1<? super OverallReadSetting, Unit> function1 = this.r;
        if (function1 != null) {
            function1.invoke(overallReadSetting);
        }
    }

    public final void K0(@fo.l Function1<? super Integer, Unit> function1) {
        this.v = function1;
    }

    public final void L0(@fo.k PageOver pageOver) {
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        if (this.c.get() == pageOver) {
            return;
        }
        this.c.set(pageOver);
        v0();
    }

    public final void M() {
        Q0(ComicApplyScope.ALL_COMIC, true);
    }

    public final void M0(@fo.k PageTurning pageTurning) {
        Intrinsics.checkNotNullParameter(pageTurning, "pageTurning");
        if (this.b.get() == pageTurning) {
            return;
        }
        this.b.set(pageTurning);
        v0();
    }

    public final void N() {
        Q0(ComicApplyScope.THIS_COMIC, true);
    }

    public final void N0(boolean z2) {
        this.u = z2;
    }

    public final void O() {
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.IK));
            return;
        }
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.lI);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.QL);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        n4VarA.S2(activityE, strN, strN2, strN3, strN4, new b());
    }

    public final void O0() {
        BaseActivity baseActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(baseActivityE, "null cannot be cast to non-null type com.zentraedi.business.activity.BaseActivity");
        com.zentraedi.comic.dialog.e eVar = new com.zentraedi.comic.dialog.e(baseActivityE);
        this.a = eVar;
        eVar.show();
    }

    public final void P(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.IK));
        } else {
            ComicContentManagementActivity.W.a((Activity) context);
        }
    }

    public final void P0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.IK));
        } else {
            ComicCategoryManagementActivity.X.a((Activity) context);
        }
    }

    @fo.k
    public final ObservableField<ComicApplyScope> Q() {
        return this.s;
    }

    public final void Q0(@fo.k ComicApplyScope scope, boolean z2) {
        Function1<? super ComicApplyScope, Unit> function1;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.s.get() == scope) {
            return;
        }
        this.s.set(scope);
        if (!z2 || (function1 = this.t) == null) {
            return;
        }
        function1.invoke(scope);
    }

    @fo.k
    public final ObservableField<Integer> R() {
        return this.h;
    }

    @fo.k
    public final ObservableField<Integer> S() {
        return this.i;
    }

    @fo.k
    public final ObservableField<Integer> T() {
        return this.m;
    }

    @fo.k
    public final ObservableField<String> U() {
        return this.q;
    }

    @fo.l
    public final Integer V() {
        return this.w;
    }

    @fo.k
    public final ObservableField<Integer> W() {
        return this.o;
    }

    @fo.k
    public final ObservableField<Boolean> X() {
        return this.f;
    }

    @fo.k
    public final ObservableField<String> Y() {
        return this.e;
    }

    @fo.k
    public final ObservableField<String> Z() {
        return this.d;
    }

    @fo.k
    public final ObservableField<Long> b0() {
        return this.j;
    }

    @fo.k
    public final ObservableField<String> c0() {
        return this.l;
    }

    public final void closeDialog() {
        com.zentraedi.comic.dialog.e eVar = this.a;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    @fo.k
    public final ObservableField<Integer> d0() {
        return this.k;
    }

    @fo.l
    public final com.zentraedi.comic.dialog.e e0() {
        return this.a;
    }

    @fo.k
    public final ObservableField<PageOver> f0() {
        return this.c;
    }

    @fo.k
    public final ObservableField<PageTurning> g0() {
        return this.b;
    }

    @fo.l
    public final Function1<OverallReadSetting, Unit> h0() {
        return this.r;
    }

    @fo.l
    public final Function1<ComicApplyScope, Unit> i0() {
        return this.t;
    }

    @fo.k
    public final SeekBar.OnSeekBarChangeListener j0() {
        return this.x;
    }

    @fo.k
    public final ObservableField<Boolean> k0() {
        return this.g;
    }

    @fo.l
    public final Function1<Integer, Unit> l0() {
        return this.v;
    }

    @fo.k
    public final ObservableField<Boolean> m0() {
        return this.p;
    }

    @fo.k
    public final ObservableField<Integer> n0() {
        return this.n;
    }

    public final boolean o0() {
        return this.u;
    }

    public final void p0(int i) {
        this.m.set(Integer.valueOf(i));
    }

    public final void q0(boolean z2) {
        this.f.set(Boolean.valueOf(z2));
    }

    public final void r0(int i) {
        long j = ((long) (i * 60)) * 1000;
        if (i == Integer.MAX_VALUE) {
            this.k.set(1);
        } else {
            this.k.set(Integer.valueOf(i));
        }
        this.j.set(Long.valueOf(j));
    }

    public final void s0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ComicReadSettingActivity.V.a((Activity) context);
    }

    public final void t0(int i) {
        Function1<? super Integer, Unit> function1 = this.v;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public final void u0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.IK));
        } else {
            ComicCodeBookManagementActivity.X.a((Activity) context);
        }
    }

    public final void w0(int i) {
        this.m.set(Integer.valueOf(i));
        v0();
    }

    public final void x0() {
        this.m.set(0);
        v0();
    }

    public final void y0() {
        this.m.set(1);
        v0();
    }

    public final void z0() {
        String strSubstring = com.zentraedi.comic.m.z().substring(0, com.zentraedi.comic.m.z().length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        final File file = new File(strSubstring);
        wd.b.c().a(new Callable() { // from class: com.zentraedi.comic.viewmodel.s4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4.A0(file);
            }
        }, new d());
    }
}
