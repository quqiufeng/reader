package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableField;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class n6 extends com.zentraedi.basic.function.viewmodel.d {

    @fo.k
    private ObservableField<ReadModel> B;

    @fo.k
    private ObservableField<ScreenOrganize> C;

    @fo.k
    private ObservableField<ZoomType> D;

    @fo.k
    private ObservableField<Clip> E;

    @fo.k
    private ObservableField<Layout> F;

    @fo.k
    private ObservableField<ReadModel> G;

    @fo.k
    private ReadSetting H;

    @fo.l
    private Function1<? super ReadSetting, Unit> I;

    @fo.l
    private Function0<Unit> J;

    @fo.l
    private Function1<? super ReadSetting, Unit> K;

    @fo.l
    private Function0<Unit> L;

    @fo.l
    private Function0<Unit> M;

    @fo.l
    private Function1<? super ReadSetting, Unit> N;

    @fo.l
    private Function1<? super ReadSetting, Unit> O;

    @fo.l
    private Function1<? super ReadSetting, Unit> P;

    @fo.l
    private Function1<? super ReadSetting, Unit> Q;

    @fo.l
    private View.OnClickListener R;

    @fo.l
    private Function1<? super Float, Unit> S;

    @fo.k
    private ObservableField<Boolean> T;

    @fo.k
    private ObservableField<Boolean> U;

    @fo.k
    private ObservableField<Integer> V;

    @fo.k
    private ObservableField<String> W;

    @fo.k
    private ObservableField<Boolean> X;

    @fo.k
    private ObservableField<Integer> Y;

    @fo.k
    private ObservableField<String> Z;

    @fo.k
    private ObservableField<Boolean> a0;

    @fo.k
    private ObservableField<Integer> b0;

    @fo.k
    private ObservableField<String> c0;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadModel.values().length];
            try {
                iArr[ReadModel.NORMAL_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadModel.MANGA_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadModel.SCROLL_READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n6() {
        ReadModel readModel = ReadModel.NORMAL_NULL;
        this.B = new ObservableField<>(readModel);
        this.C = new ObservableField<>(com.zentraedi.business.utils.m6.a.e() ? ScreenOrganize.NORMAL : ScreenOrganize.VERTICAL);
        this.D = new ObservableField<>(ZoomType.WIDTH);
        this.E = new ObservableField<>(Clip.NORMAL);
        this.F = new ObservableField<>(Layout.COMMON);
        this.G = new ObservableField<>(readModel);
        this.H = new ReadSetting();
        Boolean bool = Boolean.FALSE;
        this.T = new ObservableField<>(bool);
        this.U = new ObservableField<>(bool);
        this.V = new ObservableField<>(55);
        this.W = new ObservableField<>("1.0");
        this.X = new ObservableField<>(bool);
        this.Y = new ObservableField<>(0);
        this.Z = new ObservableField<>("0");
        this.a0 = new ObservableField<>(bool);
        this.b0 = new ObservableField<>(0);
        this.c0 = new ObservableField<>("0");
    }

    public final void A1(boolean z) {
        this.H.u(z);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void B1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.U = observableField;
    }

    public final void C0() {
        Function0<Unit> function0;
        if (this.H.b() == Clip.CUSTOM || (function0 = this.L) == null) {
            return;
        }
        function0.invoke();
    }

    public final void C1(boolean z) {
        this.H.v(z);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.k
    public final ObservableField<Integer> D0() {
        return this.b0;
    }

    public final void D1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.T = observableField;
    }

    @fo.k
    public final ObservableField<String> E0() {
        return this.c0;
    }

    public final void E1(boolean z) {
        this.H.w(z);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.l
    public final View.OnClickListener F0() {
        return this.R;
    }

    public final void F1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.X = observableField;
    }

    @fo.k
    public final ObservableField<Boolean> G0() {
        return this.a0;
    }

    public final void G1(boolean z) {
        this.H.x(z);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.k
    public final ObservableField<Boolean> H0() {
        return this.U;
    }

    public final void H1(float f) {
        this.H.y(f);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.k
    public final ObservableField<Boolean> I0() {
        return this.T;
    }

    public final void I1(@fo.k ObservableField<Integer> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.V = observableField;
    }

    @fo.k
    public final ObservableField<Boolean> J0() {
        return this.X;
    }

    public final void J1(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.W = observableField;
    }

    @fo.k
    public final ObservableField<Integer> K0() {
        return this.V;
    }

    public final void K1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.O = function1;
    }

    @fo.k
    public final ObservableField<String> L0() {
        return this.W;
    }

    public final void L1() {
        Object obj = this.F.get();
        Layout layout = Layout.DOUBLE;
        if (obj == layout) {
            return;
        }
        this.F.set(layout);
        this.H.A(layout);
        Function1<? super ReadSetting, Unit> function1 = this.P;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.l
    public final Function1<ReadSetting, Unit> M0() {
        return this.O;
    }

    public final void M1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.P = function1;
    }

    @fo.l
    public final Function1<ReadSetting, Unit> N0() {
        return this.P;
    }

    public final void N1() {
        Object obj = this.F.get();
        Layout layout = Layout.DOUBLE_REVERSAL;
        if (obj == layout) {
            L1();
            return;
        }
        this.F.set(layout);
        this.H.A(layout);
        Function1<? super ReadSetting, Unit> function1 = this.Q;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.l
    public final Function1<ReadSetting, Unit> O0() {
        return this.Q;
    }

    public final void O1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.Q = function1;
    }

    @fo.l
    public final Function1<ReadSetting, Unit> P0() {
        return this.N;
    }

    public final void P1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.N = function1;
    }

    @fo.k
    public final ObservableField<Clip> Q0() {
        return this.E;
    }

    public final void Q1(float f) {
        Function1<? super Float, Unit> function1 = this.S;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
        this.H.C(f);
        Function1<? super ReadSetting, Unit> function2 = this.K;
        if (function2 != null) {
            function2.invoke(this.H);
        }
    }

    @fo.k
    public final ObservableField<Layout> R0() {
        return this.F;
    }

    public final void R1(@fo.k ObservableField<Clip> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.E = observableField;
    }

    @fo.k
    public final ObservableField<ReadModel> S0() {
        return this.G;
    }

    public final void S1(@fo.k ObservableField<Layout> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.F = observableField;
    }

    @fo.k
    public final ObservableField<ReadModel> T0() {
        return this.B;
    }

    public final void T1(@fo.k ObservableField<ReadModel> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.G = observableField;
    }

    @fo.k
    public final ObservableField<ScreenOrganize> U0() {
        return this.C;
    }

    public final void U1(@fo.k ObservableField<ReadModel> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.B = observableField;
    }

    @fo.k
    public final ObservableField<ZoomType> V0() {
        return this.D;
    }

    public final void V1(@fo.k ObservableField<ScreenOrganize> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.C = observableField;
    }

    @fo.l
    public final Function0<Unit> W0() {
        return this.J;
    }

    public final void W1(@fo.k ObservableField<ZoomType> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.D = observableField;
    }

    @fo.l
    public final Function1<ReadSetting, Unit> X0() {
        return this.I;
    }

    public final void X1(@fo.l Function0<Unit> function0) {
        this.J = function0;
    }

    @fo.l
    public final Function1<ReadSetting, Unit> Y0() {
        return this.K;
    }

    public final void Y1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.I = function1;
    }

    @fo.k
    public final ReadSetting Z0() {
        return this.H;
    }

    public final void Z1(@fo.l Function1<? super ReadSetting, Unit> function1) {
        this.K = function1;
    }

    @fo.l
    public final Function0<Unit> a1() {
        return this.L;
    }

    public final void a2(@fo.k ReadModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.G.set(model);
        if (this.H.k() == model) {
            return;
        }
        this.H.B(model);
        if (a.$EnumSwitchMapping$0[model.ordinal()] == 3) {
            this.F.set(Layout.SINGLE);
        }
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    @fo.l
    public final Function0<Unit> b1() {
        return this.M;
    }

    public final void b2(@fo.k ReadSetting readSetting) {
        Intrinsics.checkNotNullParameter(readSetting, "<set-?>");
        this.H = readSetting;
    }

    @fo.l
    public final Function1<Float, Unit> c1() {
        return this.S;
    }

    public final void c2(@fo.l Function0<Unit> function0) {
        this.L = function0;
    }

    @fo.k
    public final ObservableField<Integer> d1() {
        return this.Y;
    }

    public final void d2(@fo.l Function0<Unit> function0) {
        this.M = function0;
    }

    @fo.k
    public final ObservableField<String> e1() {
        return this.Z;
    }

    public final void e2(@fo.l Function1<? super Float, Unit> function1) {
        this.S = function1;
    }

    public final void f1(@fo.k ReadSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.H = setting;
        this.D.set(setting.q());
        this.E.set(setting.b());
        this.F.set(setting.j());
        this.G.set(setting.k());
        this.C.set(setting.m());
        this.U.set(Boolean.valueOf(setting.e()));
        this.W.set(String.valueOf(setting.h()));
        this.V.set(Integer.valueOf(n1(setting.h())));
        this.X.set(Boolean.valueOf(setting.g()));
        this.Z.set(String.valueOf(o1(setting.n())));
        this.Y.set(Integer.valueOf(o1(setting.n())));
        this.T.set(Boolean.valueOf(setting.f()));
        this.a0.set(Boolean.valueOf(setting.d()));
        this.c0.set(String.valueOf(setting.a()));
        this.b0.set(Integer.valueOf(o1(setting.a())));
        if (setting.l() == 0.0f) {
            return;
        }
        Q1(setting.l());
    }

    public final void f2(float f) {
        this.H.E(f);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final boolean g1() {
        return this.H.k() == ReadModel.SCROLL_READ;
    }

    public final void g2(@fo.k ObservableField<Integer> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.Y = observableField;
    }

    public final void h1() {
        Object obj = this.F.get();
        Layout layout = Layout.COMMON;
        if (obj == layout) {
            return;
        }
        this.F.set(layout);
        this.H.A(layout);
        Function1<? super ReadSetting, Unit> function1 = this.O;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void h2(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.Z = observableField;
    }

    public final void i1() {
        if (g1()) {
            return;
        }
        Object obj = this.F.get();
        Layout layout = Layout.SINGLE;
        if (obj == layout) {
            return;
        }
        this.F.set(layout);
        this.H.A(layout);
        Function1<? super ReadSetting, Unit> function1 = this.N;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void i2(@fo.l ReadSetting.Stretcher stretcher) {
        if (stretcher == null || stretcher.g() == 0.0f || stretcher.h() == 0.0f) {
            return;
        }
        this.H.F(stretcher);
        j2(ZoomType.CUSTOM);
    }

    public final void j2(@fo.k ZoomType zoomType) {
        Intrinsics.checkNotNullParameter(zoomType, "zoomType");
        this.H.H(zoomType);
        this.D.set(zoomType);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void k1() {
        a2(ReadModel.MANGA_READ);
    }

    public final void k2(@fo.k ScreenOrganize screenOrganize) {
        Intrinsics.checkNotNullParameter(screenOrganize, "screenOrganize");
        if (this.H.m() == screenOrganize) {
            return;
        }
        this.C.set(screenOrganize);
        this.H.D(screenOrganize);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void l1() {
        a2(ReadModel.NORMAL_READ);
    }

    public final void l2() {
        Function0<Unit> function0 = this.M;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void m1() {
        this.H.w(false);
        this.H.v(false);
        this.H.x(false);
        this.H.u(false);
        this.H.y(1.0f);
        this.H.E(0.0f);
        this.H.r(0.0f);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void m2() {
        j2(ZoomType.HEIGHT);
    }

    public final int n1(float f) {
        return (int) ((((double) f) - 0.45d) * ((double) 100));
    }

    public final void n2() {
        j2(ZoomType.WIDTH);
    }

    public final int o1(float f) {
        return (int) (((double) f) * ((double) 100));
    }

    public final void p1() {
        k2(ScreenOrganize.LANDSCAPE);
    }

    public final void q1() {
        k2(ScreenOrganize.NORMAL);
    }

    public final void r1() {
        k2(ScreenOrganize.VERTICAL);
    }

    public final void s1() {
        a2(ReadModel.SCROLL_READ);
    }

    public final void t1(@fo.k ObservableField<Integer> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.b0 = observableField;
    }

    public final void u1(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.c0 = observableField;
    }

    public final void v1(float f) {
        this.H.r(f);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void w1(@fo.k Clip clip) {
        Intrinsics.checkNotNullParameter(clip, "clip");
        if (this.H.b() == clip) {
            return;
        }
        this.H.s(clip);
        this.E.set(clip);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void x1(@fo.l View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public final void y1(@fo.l ReadSetting.Coordinate coordinate) {
        ObservableField<Clip> observableField = this.E;
        Clip clip = Clip.CUSTOM;
        observableField.set(clip);
        this.H.s(clip);
        this.H.t(coordinate);
        Function1<? super ReadSetting, Unit> function1 = this.I;
        if (function1 != null) {
            function1.invoke(this.H);
        }
    }

    public final void z1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.a0 = observableField;
    }
}
