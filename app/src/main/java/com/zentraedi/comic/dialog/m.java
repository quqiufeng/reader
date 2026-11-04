package com.zentraedi.comic.dialog;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import androidx.databinding.ObservableField;
import androidx.lifecycle.m2;
import androidx.lifecycle.r2;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.comic.databinding.i0;
import com.zentraedi.comic.viewmodel.n6;
import com.zentraedi.comic.viewmodel.q3;
import java.text.DecimalFormat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicFilterBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicFilterBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicFilterBottomDialog\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,161:1\n13#2:162\n13#2:163\n*S KotlinDebug\n*F\n+ 1 ComicFilterBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicFilterBottomDialog\n*L\n23#1:162\n24#1:163\n*E\n"})
public final class m extends com.zentraedi.basic.function.ui.dialog.a {

    @fo.k
    private final BaseActivity b;

    @fo.k
    private final Lazy c;

    @fo.k
    private final Lazy d;
    private i0 e;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                m mVar = m.this;
                int progress = seekBar.getProgress();
                mVar.p().K0().set(Integer.valueOf(progress));
                String str = new DecimalFormat("#.##").format(((double) (progress / 100.0f)) + 0.45d);
                mVar.p().L0().set(str.toString());
                n6 n6VarP = mVar.p();
                Intrinsics.checkNotNull(str);
                n6VarP.H1(Float.parseFloat(str));
            }
        }
    }

    public static final class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                m mVar = m.this;
                int progress = seekBar.getProgress();
                String str = new DecimalFormat("#.#").format(Float.valueOf(progress / 10.0f));
                mVar.p().d1().set(Integer.valueOf(progress));
                mVar.p().e1().set(str.toString());
                n6 n6VarP = mVar.p();
                Intrinsics.checkNotNull(str);
                n6VarP.f2(Float.parseFloat(str));
            }
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                m mVar = m.this;
                int progress = seekBar.getProgress();
                mVar.p().D0().set(Integer.valueOf(progress));
                String str = new DecimalFormat("#.#").format(Float.valueOf(progress / 10.0f));
                mVar.p().E0().set(str.toString());
                n6 n6VarP = mVar.p();
                Intrinsics.checkNotNull(str);
                n6VarP.v1(Float.parseFloat(str));
            }
        }
    }

    public static final class d extends androidx.databinding.u.a {
        d() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            m.this.p().E1(Intrinsics.areEqual(m.this.p().I0().get(), Boolean.TRUE));
        }
    }

    public static final class e extends androidx.databinding.u.a {
        e() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            m.this.p().C1(Intrinsics.areEqual(m.this.p().H0().get(), Boolean.TRUE));
        }
    }

    public static final class f extends androidx.databinding.u.a {
        f() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            m.this.p().G1(Intrinsics.areEqual(m.this.p().J0().get(), Boolean.TRUE));
        }
    }

    public static final class g extends androidx.databinding.u.a {
        g() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            m.this.p().A1(Intrinsics.areEqual(m.this.p().G0().get(), Boolean.TRUE));
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class h implements Function0<q3> {
        final /* synthetic */ r2 a;

        public h(r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.q3] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q3 invoke() {
            return new m2(this.a).c(q3.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class i implements Function0<n6> {
        final /* synthetic */ r2 a;

        public i(r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.n6] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n6 invoke() {
            return new m2(this.a).c(n6.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@fo.k BaseActivity mContext) {
        super(mContext, com.zentraedi.comic.q.r.is);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.b = mContext;
        this.c = LazyKt.lazy(new h(mContext));
        this.d = LazyKt.lazy(new i(mContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m mVar, View view) {
        ObservableField<Boolean> observableFieldI0 = mVar.p().I0();
        Boolean bool = Boolean.FALSE;
        observableFieldI0.set(bool);
        mVar.p().Z0().w(false);
        mVar.p().H0().set(bool);
        mVar.p().K0().set(55);
        mVar.p().L0().set("1.0");
        mVar.p().Z0().v(false);
        mVar.p().Z0().y(1.0f);
        mVar.p().J0().set(bool);
        mVar.p().d1().set(0);
        mVar.p().e1().set("0");
        mVar.p().Z0().x(false);
        mVar.p().Z0().E(0.0f);
        mVar.p().G0().set(bool);
        mVar.p().D0().set(0);
        mVar.p().E0().set("0");
        mVar.p().Z0().u(false);
        mVar.p().Z0().r(0.0f);
        mVar.p().m1();
    }

    private final q3 n() {
        return (q3) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n6 p() {
        return (n6) this.d.getValue();
    }

    public final void l() {
        i0 i0Var = this.e;
        i0 i0Var2 = null;
        if (i0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            i0Var = null;
        }
        i0Var.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.m(this.a, view);
            }
        });
        i0 i0Var3 = this.e;
        if (i0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            i0Var3 = null;
        }
        i0Var3.H.setOnSeekBarChangeListener(new a());
        i0 i0Var4 = this.e;
        if (i0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            i0Var4 = null;
        }
        i0Var4.M.setOnSeekBarChangeListener(new b());
        i0 i0Var5 = this.e;
        if (i0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            i0Var2 = i0Var5;
        }
        i0Var2.E.setOnSeekBarChangeListener(new c());
    }

    @fo.k
    public final BaseActivity o() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zentraedi.basic.function.ui.dialog.a
    protected void onCreate(@fo.l Bundle bundle) {
        super.onCreate(bundle);
        i0 i0VarA1 = i0.A1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i0VarA1, "inflate(...)");
        this.e = i0VarA1;
        q();
        l();
        i0 i0Var = this.e;
        i0 i0Var2 = null;
        if (i0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            i0Var = null;
        }
        i0Var.G1(p());
        i0 i0Var3 = this.e;
        if (i0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            i0Var3 = null;
        }
        i0Var3.F1(n());
        i0 i0Var4 = this.e;
        if (i0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            i0Var2 = i0Var4;
        }
        setContentView(i0Var2.getRoot());
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        getBehavior().p1(k0.a(this.b, 480));
    }

    public final void q() {
        p().I0().addOnPropertyChangedCallback(new d());
        p().H0().addOnPropertyChangedCallback(new e());
        p().J0().addOnPropertyChangedCallback(new f());
        p().G0().addOnPropertyChangedCallback(new g());
    }
}
