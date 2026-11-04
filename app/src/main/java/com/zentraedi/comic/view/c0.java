package com.zentraedi.comic.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.bugly.crashreport.CrashReport;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c0 {

    @fo.k
    public static final a d = new a(null);

    @fo.k
    private static final ArrayMap<String, b> e = new ArrayMap<>();

    @fo.k
    private final View a;
    private final Context b;

    @fo.k
    private final d c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nViewShapeMaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewShapeMaker.kt\ncom/zentraedi/comic/view/ViewShapeMaker$IdWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
    private static final class b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;
        private final int p;
        private final int q;

        @fo.k
        private final int[] r;
        private final String s;

        public b(@fo.k View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.s = view.getContext().getPackageName();
            Object objQ = q(view.getClass().getSimpleName());
            int[] iArr = objQ instanceof int[] ? (int[]) objQ : null;
            this.r = iArr == null ? new int[0] : iArr;
            Object objQ2 = q(view.getClass().getSimpleName() + "_td_dashWidth");
            Intrinsics.checkNotNull(objQ2, "null cannot be cast to non-null type kotlin.Int");
            this.a = ((Integer) objQ2).intValue();
            Object objQ3 = q(view.getClass().getSimpleName() + "_td_dashGap");
            Intrinsics.checkNotNull(objQ3, "null cannot be cast to non-null type kotlin.Int");
            this.b = ((Integer) objQ3).intValue();
            Object objQ4 = q(view.getClass().getSimpleName() + "_td_radius");
            Intrinsics.checkNotNull(objQ4, "null cannot be cast to non-null type kotlin.Int");
            this.c = ((Integer) objQ4).intValue();
            Object objQ5 = q(view.getClass().getSimpleName() + "_td_stroke");
            Intrinsics.checkNotNull(objQ5, "null cannot be cast to non-null type kotlin.Int");
            this.d = ((Integer) objQ5).intValue();
            Object objQ6 = q(view.getClass().getSimpleName() + "_td_solid_color");
            Intrinsics.checkNotNull(objQ6, "null cannot be cast to non-null type kotlin.Int");
            this.e = ((Integer) objQ6).intValue();
            Object objQ7 = q(view.getClass().getSimpleName() + "_td_stroke_color");
            Intrinsics.checkNotNull(objQ7, "null cannot be cast to non-null type kotlin.Int");
            this.f = ((Integer) objQ7).intValue();
            Object objQ8 = q(view.getClass().getSimpleName() + "_td_gradient_startColor");
            Intrinsics.checkNotNull(objQ8, "null cannot be cast to non-null type kotlin.Int");
            this.g = ((Integer) objQ8).intValue();
            Object objQ9 = q(view.getClass().getSimpleName() + "_td_gradient_centerColor");
            Intrinsics.checkNotNull(objQ9, "null cannot be cast to non-null type kotlin.Int");
            this.h = ((Integer) objQ9).intValue();
            Object objQ10 = q(view.getClass().getSimpleName() + "_td_gradient_endColor");
            Intrinsics.checkNotNull(objQ10, "null cannot be cast to non-null type kotlin.Int");
            this.i = ((Integer) objQ10).intValue();
            Object objQ11 = q(view.getClass().getSimpleName() + "_td_gradient_orientation");
            Intrinsics.checkNotNull(objQ11, "null cannot be cast to non-null type kotlin.Int");
            this.j = ((Integer) objQ11).intValue();
            Object objQ12 = q(view.getClass().getSimpleName() + "_td_shape");
            Intrinsics.checkNotNull(objQ12, "null cannot be cast to non-null type kotlin.Int");
            this.k = ((Integer) objQ12).intValue();
            Object objQ13 = q(view.getClass().getSimpleName() + "_td_topLeftRadius");
            Intrinsics.checkNotNull(objQ13, "null cannot be cast to non-null type kotlin.Int");
            this.l = ((Integer) objQ13).intValue();
            Object objQ14 = q(view.getClass().getSimpleName() + "_td_topRightRadius");
            Intrinsics.checkNotNull(objQ14, "null cannot be cast to non-null type kotlin.Int");
            this.m = ((Integer) objQ14).intValue();
            Object objQ15 = q(view.getClass().getSimpleName() + "_td_bottomRightRadius");
            Intrinsics.checkNotNull(objQ15, "null cannot be cast to non-null type kotlin.Int");
            this.n = ((Integer) objQ15).intValue();
            Object objQ16 = q(view.getClass().getSimpleName() + "_td_bottomLeftRadius");
            Intrinsics.checkNotNull(objQ16, "null cannot be cast to non-null type kotlin.Int");
            this.o = ((Integer) objQ16).intValue();
            Object objQ17 = q(view.getClass().getSimpleName() + "_td_rippleColor");
            Intrinsics.checkNotNull(objQ17, "null cannot be cast to non-null type kotlin.Int");
            this.p = ((Integer) objQ17).intValue();
            Object objQ18 = q(view.getClass().getSimpleName() + "_td_background");
            Intrinsics.checkNotNull(objQ18, "null cannot be cast to non-null type kotlin.Int");
            this.q = ((Integer) objQ18).intValue();
        }

        private final Object q(String str) {
            try {
                Class<?> cls = Class.forName(this.s + ".R$styleable");
                if (str != null) {
                    return cls.getField(str).get(cls);
                }
                return null;
            } catch (Throwable th2) {
                CrashReport.postCatchedException(th2);
                return 0;
            }
        }

        public final int a() {
            return this.q;
        }

        public final int b() {
            return this.o;
        }

        public final int c() {
            return this.n;
        }

        public final int d() {
            return this.h;
        }

        public final int e() {
            return this.i;
        }

        public final int f() {
            return this.j;
        }

        public final int g() {
            return this.g;
        }

        public final int h() {
            return this.c;
        }

        public final int i() {
            return this.p;
        }

        public final int j() {
            return this.k;
        }

        public final int k() {
            return this.e;
        }

        public final int l() {
            return this.d;
        }

        public final int m() {
            return this.f;
        }

        public final int n() {
            return this.l;
        }

        public final int o() {
            return this.m;
        }

        public final String p() {
            return this.s;
        }

        @fo.k
        public final int[] r() {
            return this.r;
        }

        public final int s() {
            return this.b;
        }

        public final int t() {
            return this.a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface c {
    }

    private static final class d {
        private float a;
        private float b;
        private float c;
        private int d;
        private int e;

        @androidx.annotation.l
        private int f;

        @androidx.annotation.l
        private int g;

        @androidx.annotation.l
        private int h;

        @androidx.annotation.l
        private int i;

        @androidx.annotation.l
        private int j;
        private int k;
        private int l;
        private float m;
        private float n;
        private float o;
        private float p;

        @androidx.annotation.l
        private int q;

        public d(@fo.k TypedArray typedArray, @fo.k b idWrapper) {
            Intrinsics.checkNotNullParameter(typedArray, "typedArray");
            Intrinsics.checkNotNullParameter(idWrapper, "idWrapper");
            this.a = typedArray.getDimension(idWrapper.t(), 0.0f);
            this.b = typedArray.getDimension(idWrapper.s(), 0.0f);
            this.c = typedArray.getDimension(idWrapper.h(), 0.0f);
            this.d = typedArray.getDimensionPixelSize(idWrapper.l(), 0);
            this.e = typedArray.getResourceId(idWrapper.a(), 0);
            this.f = typedArray.getColor(idWrapper.k(), 0);
            this.g = typedArray.getColor(idWrapper.m(), 0);
            this.h = typedArray.getColor(idWrapper.g(), 0);
            this.i = typedArray.getColor(idWrapper.d(), 0);
            this.j = typedArray.getColor(idWrapper.e(), 0);
            this.k = typedArray.getInt(idWrapper.f(), GradientDrawable.Orientation.TOP_BOTTOM.ordinal());
            this.l = typedArray.getInt(idWrapper.j(), 0);
            this.m = typedArray.getDimension(idWrapper.n(), 0.0f);
            this.n = typedArray.getDimension(idWrapper.o(), 0.0f);
            this.o = typedArray.getDimension(idWrapper.c(), 0.0f);
            this.p = typedArray.getDimension(idWrapper.b(), 0.0f);
            this.q = typedArray.getColor(idWrapper.i(), Color.parseColor("#33000000"));
        }

        private final ColorStateList k(int i, int i2) {
            return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_activated}, new int[0]}, new int[]{i2, i2, i2, i});
        }

        public static /* synthetic */ void o() {
        }

        public final void A(int i) {
            this.j = i;
        }

        public final void B(int i) {
            this.k = i;
        }

        public final void C(int i) {
            this.h = i;
        }

        public final void D(float f) {
            this.c = f;
        }

        public final void E(int i) {
            this.q = i;
        }

        public final void F(int i) {
            this.l = i;
        }

        public final void G(int i) {
            this.f = i;
        }

        public final void H(int i) {
            this.d = i;
        }

        public final void I(int i) {
            this.g = i;
        }

        public final void J(float f) {
            this.m = f;
        }

        public final void K(float f) {
            this.n = f;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        public final void a(@fo.k View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.d <= 0 && this.f == 0 && this.h == 0 && this.j == 0 && this.i == 0) {
                if (this.e != 0) {
                    view.setBackground(view.getResources().getDrawable(this.e));
                    return;
                } else {
                    view.setBackground(null);
                    return;
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(this.l);
            float f = this.a;
            if (f > 0.0f) {
                float f2 = this.b;
                if (f2 > 0.0f) {
                    gradientDrawable.setStroke(this.d, this.g, f, f2);
                } else {
                    gradientDrawable.setStroke(this.d, this.g);
                }
            } else {
                gradientDrawable.setStroke(this.d, this.g);
            }
            int i = this.f;
            if (i != 0) {
                gradientDrawable.setColor(i);
            } else {
                int i2 = this.h;
                if (i2 != 0 || this.j != 0 || this.i != 0) {
                    int i3 = this.i;
                    if (i3 != 0) {
                        gradientDrawable.setColors(new int[]{i2, i3, this.j});
                    } else {
                        gradientDrawable.setColors(new int[]{i2, this.j});
                    }
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.values()[this.k]);
                }
            }
            gradientDrawable.setCornerRadius(this.c);
            float f3 = this.m;
            if (f3 > 0.0f || this.n > 0.0f || this.p > 0.0f || this.o > 0.0f) {
                float f4 = this.c;
                if (f3 != f4 || this.n != f4 || this.p != f4 || this.o != f4) {
                    float f5 = this.n;
                    float f6 = this.o;
                    float f7 = this.p;
                    gradientDrawable.setCornerRadii(new float[]{f3, f3, f5, f5, f6, f6, f7, f7});
                }
            }
            view.setBackground(new RippleDrawable(k(0, this.q), gradientDrawable, null));
        }

        public final int b() {
            return this.e;
        }

        public final float c() {
            return this.p;
        }

        public final float d() {
            return this.o;
        }

        public final float e() {
            return this.b;
        }

        public final float f() {
            return this.a;
        }

        public final int g() {
            return this.i;
        }

        public final int h() {
            return this.j;
        }

        public final int i() {
            return this.k;
        }

        public final int j() {
            return this.h;
        }

        public final float l() {
            return this.c;
        }

        public final int m() {
            return this.q;
        }

        public final int n() {
            return this.l;
        }

        public final int p() {
            return this.f;
        }

        public final int q() {
            return this.d;
        }

        public final int r() {
            return this.g;
        }

        public final float s() {
            return this.m;
        }

        public final float t() {
            return this.n;
        }

        public final void u(int i) {
            this.e = i;
        }

        public final void v(float f) {
            this.p = f;
        }

        public final void w(float f) {
            this.o = f;
        }

        public final void x(float f) {
            this.b = f;
        }

        public final void y(float f) {
            this.a = f;
        }

        public final void z(int i) {
            this.i = i;
        }
    }

    public c0(@fo.k View view, @fo.l AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        Context context = view.getContext();
        this.b = context;
        ArrayMap<String, b> arrayMap = e;
        b bVar = arrayMap.get(view.getClass().getSimpleName());
        if (bVar == null) {
            bVar = new b(view);
            arrayMap.put(view.getClass().getSimpleName(), bVar);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bVar.r());
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        d dVar = new d(typedArrayObtainStyledAttributes, bVar);
        this.c = dVar;
        typedArrayObtainStyledAttributes.recycle();
        dVar.a(view);
    }

    public final void a() {
        this.c.a(this.a);
    }

    @fo.k
    public final View b() {
        return this.a;
    }

    @fo.k
    public final c0 c(float f) {
        this.c.v(f);
        return this;
    }

    @fo.k
    public final c0 d(float f) {
        this.c.w(f);
        return this;
    }

    @fo.k
    public final c0 e(float f) {
        this.c.x(f);
        return this;
    }

    @fo.k
    public final c0 f(float f) {
        this.c.y(f);
        return this;
    }

    @fo.k
    public final c0 g(@androidx.annotation.l int i) {
        this.c.z(i);
        return this;
    }

    @fo.k
    public final c0 h(@androidx.annotation.l int i) {
        this.c.A(i);
        return this;
    }

    @fo.k
    public final c0 i(@fo.k GradientDrawable.Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.c.B(orientation.ordinal());
        return this;
    }

    @fo.k
    public final c0 j(@androidx.annotation.l int i) {
        this.c.C(i);
        return this;
    }

    @fo.k
    public final c0 k(float f) {
        this.c.D(f);
        return this;
    }

    @fo.k
    public final c0 l(@androidx.annotation.l int i) {
        this.c.E(i);
        return this;
    }

    @fo.k
    public final c0 m(int i) {
        this.c.F(i);
        return this;
    }

    @fo.k
    public final c0 n(@androidx.annotation.l int i) {
        this.c.G(i);
        return this;
    }

    @fo.k
    public final c0 o(int i) {
        this.c.H(i);
        return this;
    }

    @fo.k
    public final c0 p(@androidx.annotation.l int i) {
        this.c.I(i);
        return this;
    }

    @fo.k
    public final c0 q(int i) {
        this.c.u(i);
        return this;
    }

    @fo.k
    public final c0 r(float f) {
        this.c.J(f);
        return this;
    }

    @fo.k
    public final c0 s(float f) {
        this.c.K(f);
        return this;
    }
}
