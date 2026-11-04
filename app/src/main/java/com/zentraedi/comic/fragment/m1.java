package com.zentraedi.comic.fragment;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.base.FragmentBackPressHandler;
import com.zentraedi.business.event.ComicStartFlushEvent;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.utils.i8;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.t7;
import com.zentraedi.business.view.NoScrollViewPager;
import com.zentraedi.comic.activity.ComicCategoryContentManagementActivity;
import com.zentraedi.comic.activity.ComicContentManagementActivity;
import com.zentraedi.comic.activity.ComicSearchActivity;
import com.zentraedi.comic.event.CategoryViewModeChangeEvent;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseDisplayChangedEvent;
import com.zentraedi.comic.event.ComicHouseEditModeEvent;
import com.zentraedi.comic.event.ComicHouseRefreshedEvent;
import com.zentraedi.comic.event.ComicJumpLastestAddEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHouseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,519:1\n1#2:520\n1563#3:521\n1634#3,3:522\n*S KotlinDebug\n*F\n+ 1 ComicHouseFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseFragment\n*L\n314#1:521\n314#1:522,3\n*E\n"})
public final class m1 extends com.zentraedi.business.fragment.a {

    @fo.l
    private com.zentraedi.comic.databinding.a2 n;

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.e0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.e4();
        }
    });

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.p0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.d4();
        }
    });

    @fo.k
    private final Lazy q = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.a1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.X3(this.a);
        }
    });

    @fo.k
    private final Lazy r = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.f1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.c4();
        }
    });

    @fo.k
    private final Lazy s = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.g1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.a4();
        }
    });

    @fo.k
    private final Lazy t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.h1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m1.b4();
        }
    });

    @fo.l
    private String u;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ RecyclerView a;
        final /* synthetic */ m1 b;

        a(RecyclerView recyclerView, m1 m1Var) {
            this.a = recyclerView;
            this.b = m1Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.a.getChildCount() > 0) {
                this.b.q4();
            }
        }
    }

    public static final class b extends ClickableSpan {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(m1 m1Var) {
            m1Var.B3().I0(m1Var.B3().o0());
            return Unit.INSTANCE;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            if (Intrinsics.areEqual(m1.this.B3().m0().get(), com.zentraedi.comic.viewmodel.t2.A)) {
                m1.this.B3().I0(m1.this.B3().o0());
                return;
            }
            i8.a aVar = i8.a;
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.BJ2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            SpannableStringBuilder spannableStringBuilderH = aVar.h(strN, com.zentraedi.comic.q.f.n1, m1.this.B3().s0(), com.zentraedi.comic.q.f.y8, "", com.zentraedi.comic.q.f.n1);
            n4 n4VarA = n4.c.a();
            FragmentActivity activity = m1.this.getActivity();
            String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JB);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.cz);
            Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
            Function0 function0 = new Function0() { // from class: com.zentraedi.comic.fragment.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m1.b.c();
                }
            };
            final m1 m1Var = m1.this;
            n4VarA.R2(activity, strN2, spannableStringBuilderH, strN3, strN4, function0, new Function0() { // from class: com.zentraedi.comic.fragment.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m1.b.d(m1Var);
                }
            });
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
        }
    }

    public static final class c extends com.zentraedi.business.listener.f {
        final /* synthetic */ com.zentraedi.comic.databinding.a2 b;

        c(com.zentraedi.comic.databinding.a2 a2Var) {
            this.b = a2Var;
        }

        public void onPageSelected(int i) {
            m1.this.v3(this.b);
            m1.this.q3();
            m1.this.W3();
        }
    }

    @SourceDebugExtension({"SMAP\nComicHouseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseFragment$initView$15\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
    public static final class d extends androidx.databinding.u.a {
        d() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0076  */
        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            NoScrollViewPager noScrollViewPager;
            int iY2;
            NoScrollViewPager noScrollViewPager2;
            Boolean bool = (Boolean) m1.this.B3().editModel.get();
            ObservableBoolean observableBooleanU = m1.this.A3().U();
            Boolean bool2 = Boolean.TRUE;
            observableBooleanU.set(Intrinsics.areEqual(bool, bool2));
            org.greenrobot.eventbus.c.f().q(new ComicHouseEditModeEvent(Intrinsics.areEqual(bool, bool2), Intrinsics.areEqual(m1.this.B3().h0().get(), bool2), m1.this.u3()));
            if (Intrinsics.areEqual(bool, bool2)) {
                com.zentraedi.comic.viewmodel.t2 t2VarB3 = m1.this.B3();
                com.zentraedi.comic.databinding.a2 a2Var = m1.this.n;
                if (a2Var == null || (noScrollViewPager2 = a2Var.e0) == null) {
                    iY2 = 0;
                } else {
                    b4 b4VarV = m1.this.w3().v(noScrollViewPager2.getCurrentItem());
                    if (b4VarV != null) {
                        iY2 = b4VarV.Y2();
                    } else {
                        iY2 = 0;
                    }
                }
                t2VarB3.R0(iY2);
            }
            com.zentraedi.comic.databinding.a2 a2Var2 = m1.this.n;
            if (a2Var2 == null || (noScrollViewPager = a2Var2.e0) == null) {
                return;
            }
            noScrollViewPager.setScroll(Intrinsics.areEqual(bool, Boolean.FALSE));
        }
    }

    public static final class e extends androidx.databinding.u.a {
        e() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            m1.this.B3().y0().set(m1.this.s3());
            String str = (String) m1.this.B3().m0().get();
            if (str != null) {
                switch (str.hashCode()) {
                    case -1335530905:
                        str.equals(com.zentraedi.comic.viewmodel.t2.A);
                        return;
                    case -123173735:
                        if (!str.equals(com.zentraedi.comic.viewmodel.t2.F)) {
                            return;
                        }
                        break;
                    case 3089282:
                        if (!str.equals("done")) {
                            return;
                        }
                        break;
                    case 96784904:
                        if (str.equals("error")) {
                            m1.this.B3().x0().set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Lr));
                            return;
                        }
                        return;
                    case 1550783935:
                        str.equals("running");
                        return;
                    default:
                        return;
                }
                m1.this.B3().x0().set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.gM));
            }
        }
    }

    static final class f implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof androidx.lifecycle.e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.m2 A3() {
        return (com.zentraedi.comic.viewmodel.m2) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.t2 B3() {
        return (com.zentraedi.comic.viewmodel.t2) this.o.getValue();
    }

    private final void C3() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        ComicSearchActivity.a aVar = ComicSearchActivity.a0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.a(activityE);
    }

    private final void D3() {
        new FragmentBackPressHandler(this, FragmentBackPressHandler.Mode.ALWAYS, new Function0() { // from class: com.zentraedi.comic.fragment.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(m1.E3(this.a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E3(m1 m1Var) {
        if (!Intrinsics.areEqual(m1Var.B3().editModel.get(), Boolean.TRUE)) {
            return false;
        }
        m1Var.t3();
        return true;
    }

    private final void F3(final com.zentraedi.comic.databinding.a2 a2Var) {
        TextView textView;
        a2Var.U.J.setBackgroundColor(-1);
        a2Var.U.F.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Vy));
        a2Var.U.G.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.zM));
        a2Var.U.H.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.DM));
        a2Var.U.I.setVisibility(8);
        a2Var.e0.setScroll(true);
        a2Var.e0.setAdapter(w3());
        a2Var.W.setViewPager(a2Var.e0);
        a2Var.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.G3(this.a, view);
            }
        });
        a2Var.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.H3(this.a, a2Var, view);
            }
        });
        a2Var.N.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.N3(this.a, a2Var, view);
            }
        });
        a2Var.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.O3(this.a, view);
            }
        });
        a2Var.L.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.P3(this.a, view);
            }
        });
        a2Var.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.Q3(view);
            }
        });
        B3().setCloseEditOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.S3(this.a, view);
            }
        });
        B3().setSelectOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.T3(this.a, view);
            }
        });
        B3().N0(new Function1() { // from class: com.zentraedi.comic.fragment.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1.U3(a2Var, this, (List) obj);
            }
        });
        B3().T0(new Function0() { // from class: com.zentraedi.comic.fragment.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.V3(this.a);
            }
        });
        B3().setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.I3(this.a, a2Var, view);
            }
        });
        B3().h0().set((Boolean) t7.d(com.zentraedi.business.utils.k0.d0(com.zentraedi.comic.constant.a.d, "0"), Boolean.FALSE));
        a2Var.e0.addOnPageChangeListener(new c(a2Var));
        A3().b0(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m1.L3(this.a, view);
            }
        });
        z3().r0().k(requireActivity(), new f(new Function1() { // from class: com.zentraedi.comic.fragment.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1.M3(this.a, (fg.a) obj);
            }
        }));
        B3().editModel.addOnPropertyChangedCallback(new d());
        com.zentraedi.comic.databinding.a2 a2Var2 = this.n;
        if (a2Var2 != null && (textView = a2Var2.c0) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        B3().m0().addOnPropertyChangedCallback(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(m1 m1Var, View view) {
        m1Var.B3().z0().set(Boolean.FALSE);
        m1Var.B3().V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(m1 m1Var, com.zentraedi.comic.databinding.a2 a2Var, View view) {
        ObservableField<Boolean> observableFieldH0 = m1Var.B3().h0();
        Boolean bool = Boolean.FALSE;
        observableFieldH0.set(bool);
        String id2 = m1Var.w3().s().get(a2Var.e0.getCurrentItem()).getId();
        t7.j(com.zentraedi.business.utils.k0.d0(com.zentraedi.comic.constant.a.d, id2), bool);
        org.greenrobot.eventbus.c.f().q(new CategoryViewModeChangeEvent(id2, false));
        m1Var.q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(final m1 m1Var, final com.zentraedi.comic.databinding.a2 a2Var, View view) {
        com.zentraedi.comic.business.a1 a1VarZ3 = m1Var.z3();
        View root = a2Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        a1VarZ3.E0(root, Intrinsics.areEqual(m1Var.B3().mIsCurrentFragmentEmpty.get(), Boolean.TRUE), new Function0() { // from class: com.zentraedi.comic.fragment.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.J3(this.a, a2Var);
            }
        }, new Function0() { // from class: com.zentraedi.comic.fragment.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.K3(this.a, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(m1 m1Var, com.zentraedi.comic.databinding.a2 a2Var) {
        m1Var.o4(a2Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K3(m1 m1Var, com.zentraedi.comic.databinding.a2 a2Var) {
        ComicCategory comicCategory = m1Var.w3().s().get(a2Var.e0.getCurrentItem());
        Intrinsics.checkNotNullExpressionValue(comicCategory, "get(...)");
        ComicCategory comicCategory2 = comicCategory;
        if (Intrinsics.areEqual(comicCategory2.getId(), "0")) {
            Activity activity = m1Var.getActivity();
            if (activity != null) {
                ComicContentManagementActivity.W.a(activity);
            }
        } else {
            Activity activity2 = m1Var.getActivity();
            if (activity2 != null) {
                ComicCategoryContentManagementActivity.W.a(activity2, comicCategory2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(m1 m1Var, View view) {
        m1Var.B3().editModel.set(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M3(m1 m1Var, fg.a aVar) {
        if (aVar.d()) {
            m1Var.u = aVar.b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(m1 m1Var, com.zentraedi.comic.databinding.a2 a2Var, View view) {
        ObservableField<Boolean> observableFieldH0 = m1Var.B3().h0();
        Boolean bool = Boolean.TRUE;
        observableFieldH0.set(bool);
        String id2 = m1Var.w3().s().get(a2Var.e0.getCurrentItem()).getId();
        t7.j(com.zentraedi.business.utils.k0.d0(com.zentraedi.comic.constant.a.d, id2), bool);
        org.greenrobot.eventbus.c.f().q(new CategoryViewModeChangeEvent(id2, true));
        m1Var.q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(m1 m1Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (Intrinsics.areEqual(m1Var.B3().h0().get(), Boolean.TRUE)) {
            m1Var.i4();
        } else {
            m1Var.B3().Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(m1 m1Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (Intrinsics.areEqual(m1Var.B3().h0().get(), Boolean.TRUE)) {
            m1Var.k4();
        } else {
            m1Var.B3().b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.comic.delegate.a.a.g(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.fragment.i1
            public final void continueDo() {
                m1.R3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(m1 m1Var, View view) {
        m1Var.t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(m1 m1Var, View view) {
        NoScrollViewPager noScrollViewPager;
        NoScrollViewPager noScrollViewPager2;
        if (com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB) == m1Var.B3().rightEditTextObserver.get()) {
            com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
            if (a2Var == null || (noScrollViewPager2 = a2Var.e0) == null) {
                return;
            }
            b4 b4VarV = m1Var.w3().v(noScrollViewPager2.getCurrentItem());
            if (b4VarV != null) {
                b4VarV.s3();
                return;
            }
            return;
        }
        com.zentraedi.comic.databinding.a2 a2Var2 = m1Var.n;
        if (a2Var2 == null || (noScrollViewPager = a2Var2.e0) == null) {
            return;
        }
        b4 b4VarV2 = m1Var.w3().v(noScrollViewPager.getCurrentItem());
        if (b4VarV2 != null) {
            b4VarV2.P3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U3(com.zentraedi.comic.databinding.a2 a2Var, m1 m1Var, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a2Var.e0.setOffscreenPageLimit(it.size());
        m1Var.w3().E(Intrinsics.areEqual(m1Var.B3().h0().get(), Boolean.TRUE));
        m1Var.w3().H(it);
        a2Var.W.r();
        String str = m1Var.u;
        if (str != null) {
            for (IndexedValue indexedValue : CollectionsKt.withIndex(m1Var.w3().s())) {
                if (indexedValue.getIndex() > 0 && TextUtils.equals(str, ((ComicCategory) indexedValue.getValue()).getName())) {
                    a2Var.e0.setCurrentItem(indexedValue.getIndex());
                    break;
                }
            }
            m1Var.u = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V3(m1 m1Var) {
        m1Var.W3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W3() {
        String strU3 = u3();
        if (Intrinsics.areEqual(strU3, "0") || com.zentraedi.basic.function.utils.j0.l(B3().r0())) {
            B3().g0().set(Boolean.TRUE);
        } else {
            B3().g0().set(Boolean.valueOf(B3().r0().contains(strU3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.adapter.o X3(final m1 m1Var) {
        FragmentManager childFragmentManager = m1Var.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        com.zentraedi.comic.adapter.o oVar = new com.zentraedi.comic.adapter.o(childFragmentManager);
        oVar.D(new Function0() { // from class: com.zentraedi.comic.fragment.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.Y3(this.a);
            }
        });
        oVar.G(new Function1() { // from class: com.zentraedi.comic.fragment.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1.Z3(this.a, (List) obj);
            }
        });
        oVar.C(m1Var.B3().f0());
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y3(m1 m1Var) {
        m1Var.q3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z3(m1 m1Var, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m1Var.B3().f1(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.b a4() {
        return new com.zentraedi.comic.business.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 b4() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 c4() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.m2 d4() {
        return new com.zentraedi.comic.viewmodel.m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.t2 e4() {
        return new com.zentraedi.comic.viewmodel.t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f4(m1 m1Var, int i) {
        SlidingTabLayout slidingTabLayout;
        NoScrollViewPager noScrollViewPager;
        com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
        if (a2Var != null && (noScrollViewPager = a2Var.e0) != null) {
            noScrollViewPager.setOffscreenPageLimit(i);
        }
        com.zentraedi.comic.databinding.a2 a2Var2 = m1Var.n;
        if (a2Var2 != null && (slidingTabLayout = a2Var2.W) != null) {
            slidingTabLayout.r();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g4(m1 m1Var) {
        SlidingTabLayout slidingTabLayout;
        com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
        if (a2Var != null && (slidingTabLayout = a2Var.W) != null) {
            slidingTabLayout.r();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h4(m1 m1Var) {
        SlidingTabLayout slidingTabLayout;
        com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
        if (a2Var != null && (slidingTabLayout = a2Var.W) != null) {
            slidingTabLayout.r();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i4() {
        ObservableArrayList<com.zentraedi.comic.viewmodel.l0> observableArrayListV0 = B3().v0();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(observableArrayListV0, 10));
        Iterator it = observableArrayListV0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((com.zentraedi.comic.viewmodel.l0) it.next()).getPath()));
        }
        nd.a.e(this.i, "onDeleteClick " + arrayList);
        y3().b0(arrayList, new Function1() { // from class: com.zentraedi.comic.fragment.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1.j4(this.a, arrayList, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j4(m1 m1Var, List list, boolean z) {
        NoScrollViewPager noScrollViewPager;
        if (z) {
            com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
            if (a2Var != null && (noScrollViewPager = a2Var.e0) != null) {
                b4 b4VarV = m1Var.w3().v(noScrollViewPager.getCurrentItem());
                if (b4VarV != null) {
                    b4VarV.W2(m1Var.B3().v0());
                }
            }
            m1Var.t3();
            Object obj = m1Var.B3().editModel.get();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(obj, bool)) {
                org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(list, bool));
            }
        }
        return Unit.INSTANCE;
    }

    private final void k4() {
        if (com.zentraedi.business.permission.a.d(getActivity(), com.zentraedi.business.permission.a.i)) {
            com.zentraedi.comic.databinding.a2 a2Var = this.n;
            y2(a2Var != null ? a2Var.getRoot() : null, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CI));
            B3().E0(new Function1() { // from class: com.zentraedi.comic.fragment.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1.l4(this.a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l4(m1 m1Var, boolean z) {
        com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
        m1Var.t2(a2Var != null ? a2Var.getRoot() : null);
        if (z) {
            m1Var.t3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(m1 m1Var, View view) {
        BaseActivity activity = m1Var.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity != null) {
            baseActivity.X3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(m1 m1Var, View view) {
        m1Var.C3();
    }

    private final void o4(com.zentraedi.comic.databinding.a2 a2Var) {
        List<String> arrayList;
        final String id2 = w3().s().get(a2Var.e0.getCurrentItem()).getId();
        b4 b4Var = w3().w().get(id2);
        if (b4Var == null || (arrayList = b4Var.X2()) == null) {
            arrayList = new ArrayList<>();
        }
        List<String> list = arrayList;
        com.zentraedi.comic.business.b bVarX3 = x3();
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(activityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        View root = a2Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        bVarX3.f((FragmentActivity) activityE, root, id2, list, new Function0() { // from class: com.zentraedi.comic.fragment.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.p4(id2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p4(String str) {
        org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3() {
        com.zentraedi.comic.databinding.a2 a2Var;
        NoScrollViewPager noScrollViewPager;
        com.zentraedi.comic.databinding.a2 a2Var2 = this.n;
        if (a2Var2 != null) {
            B3().mIsCurrentFragmentEmpty.set(Boolean.valueOf(w3().v(a2Var2.e0.getCurrentItem()).m3()));
            int iK3 = w3().v(a2Var2.e0.getCurrentItem()).k3();
            if (iK3 != 0) {
                A3().getNumDesc().set(com.zentraedi.outreader.util.e.h(iK3));
            }
            if (((Boolean) t7.d("SP_KEY_NAS_COMIC_BOOK_TAG", Boolean.FALSE)).booleanValue() || (a2Var = this.n) == null || (noScrollViewPager = a2Var.e0) == null) {
                return;
            }
            noScrollViewPager.post(new Runnable() { // from class: com.zentraedi.comic.fragment.d1
                @Override // java.lang.Runnable
                public final void run() {
                    m1.r3(this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q4() {
        com.zentraedi.comic.databinding.a2 a2Var;
        View root;
        RecyclerView recyclerViewFindViewById;
        RelativeLayout relativeLayout;
        NoScrollViewPager noScrollViewPager;
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if ((activity != null && activity.isFinishing()) || (a2Var = this.n) == null || (root = a2Var.getRoot()) == null || (recyclerViewFindViewById = root.findViewById(com.zentraedi.comic.q.i.KD)) == null || recyclerViewFindViewById.getChildCount() <= 0) {
                return;
            }
            com.zentraedi.comic.databinding.a2 a2Var2 = this.n;
            if (a2Var2 != null && (noScrollViewPager = a2Var2.e0) != null) {
                b4 b4VarV = w3().v(noScrollViewPager.getCurrentItem());
                if (b4VarV != null && b4VarV.m3()) {
                    return;
                }
            }
            com.zentraedi.comic.databinding.a2 a2Var3 = this.n;
            ViewGroup.LayoutParams layoutParams = (a2Var3 == null || (relativeLayout = a2Var3.V) == null) ? null : relativeLayout.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            int[] iArr = new int[2];
            recyclerViewFindViewById.getChildAt(0).getLocationOnScreen(iArr);
            if (layoutParams2 != null) {
                layoutParams2.topMargin = iArr[1] - com.zentraedi.basic.function.utils.k0.a(getActivity(), 50);
            }
            B3().w0().set(Boolean.valueOf(true ^ com.zentraedi.basic.function.utils.a.h().y()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(m1 m1Var) {
        View root;
        com.zentraedi.comic.databinding.a2 a2Var = m1Var.n;
        RecyclerView recyclerViewFindViewById = (a2Var == null || (root = a2Var.getRoot()) == null) ? null : root.findViewById(com.zentraedi.comic.q.i.KD);
        if (recyclerViewFindViewById != null) {
            if (recyclerViewFindViewById.getChildCount() > 0) {
                m1Var.q4();
            } else {
                recyclerViewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new a(recyclerViewFindViewById, m1Var));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x009a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00b5, please report this as an issue */
    public final SpannableStringBuilder s3() {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        String str = (String) B3().m0().get();
        if (str != null) {
            switch (str.hashCode()) {
                case -1335530905:
                    if (str.equals(com.zentraedi.comic.viewmodel.t2.A)) {
                        spannableStringBuilder = new SpannableStringBuilder(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gH));
                        if (Intrinsics.areEqual(B3().m0().get(), com.zentraedi.comic.viewmodel.t2.A)) {
                            spannableStringBuilder2 = new SpannableStringBuilder("  " + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pD3));
                        } else {
                            spannableStringBuilder2 = new SpannableStringBuilder("  " + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pD3) + "  ");
                        }
                        b bVar = new b();
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.l4)), 0, spannableStringBuilder2.length(), 17);
                        spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 17);
                        if (Intrinsics.areEqual(B3().m0().get(), "error")) {
                            Drawable drawableG = com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.wj);
                            drawableG.setBounds(0, 0, drawableG.getIntrinsicWidth(), drawableG.getIntrinsicHeight());
                            Intrinsics.checkNotNull(drawableG);
                            spannableStringBuilder2.setSpan(new com.zentraedi.business.utils.z(drawableG), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
                        }
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        return spannableStringBuilder;
                    }
                    break;
                case -123173735:
                    if (str.equals(com.zentraedi.comic.viewmodel.t2.F)) {
                        return new SpannableStringBuilder(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wB3));
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        return new SpannableStringBuilder(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.px2));
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        spannableStringBuilder = new SpannableStringBuilder(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.PH));
                        if (Intrinsics.areEqual(B3().m0().get(), com.zentraedi.comic.viewmodel.t2.A)) {
                            spannableStringBuilder2 = new SpannableStringBuilder("  " + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pD3));
                        } else {
                            spannableStringBuilder2 = new SpannableStringBuilder("  " + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pD3) + "  ");
                        }
                        b bVar2 = new b();
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.l4)), 0, spannableStringBuilder2.length(), 17);
                        spannableStringBuilder2.setSpan(bVar2, 0, spannableStringBuilder2.length(), 17);
                        if (Intrinsics.areEqual(B3().m0().get(), "error")) {
                            Drawable drawableG2 = com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.wj);
                            drawableG2.setBounds(0, 0, drawableG2.getIntrinsicWidth(), drawableG2.getIntrinsicHeight());
                            Intrinsics.checkNotNull(drawableG2);
                            spannableStringBuilder2.setSpan(new com.zentraedi.business.utils.z(drawableG2), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
                        }
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        return spannableStringBuilder;
                    }
                    break;
                case 1550783935:
                    if (str.equals("running")) {
                        return new SpannableStringBuilder(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bH));
                    }
                    break;
            }
        }
        return new SpannableStringBuilder("");
    }

    private final void t3() {
        B3().editModel.set(Boolean.FALSE);
        B3().v0().clear();
        B3().l0().clear();
        B3().X0(new ArrayList());
        B3().refreshAfterSelect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(com.zentraedi.comic.databinding.a2 a2Var) {
        String id2 = w3().s().get(a2Var.e0.getCurrentItem()).getId();
        Boolean bool = (Boolean) t7.d(com.zentraedi.business.utils.k0.d0(com.zentraedi.comic.constant.a.d, id2), Boolean.FALSE);
        B3().h0().set(bool);
        org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
        Intrinsics.checkNotNull(bool);
        cVarF.q(new CategoryViewModeChangeEvent(id2, bool.booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.adapter.o w3() {
        return (com.zentraedi.comic.adapter.o) this.q.getValue();
    }

    private final com.zentraedi.comic.business.b x3() {
        return (com.zentraedi.comic.business.b) this.s.getValue();
    }

    private final com.zentraedi.comic.business.a1 y3() {
        return (com.zentraedi.comic.business.a1) this.t.getValue();
    }

    private final com.zentraedi.comic.business.a1 z3() {
        return (com.zentraedi.comic.business.a1) this.r.getValue();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onCancelComicInfoEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q3();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicCategoryEvent(@fo.k fg.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.d() || event.g()) {
            B3().d0();
            return;
        }
        if (event.e()) {
            w3().o(event.a(), new Function1() { // from class: com.zentraedi.comic.fragment.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1.f4(this.a, ((Integer) obj).intValue());
                }
            });
        } else if (event.f()) {
            w3().p(event.a(), event.b(), new Function0() { // from class: com.zentraedi.comic.fragment.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m1.g4(this.a);
                }
            });
        } else if (event.g()) {
            w3().B(event.c(), new Function0() { // from class: com.zentraedi.comic.fragment.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m1.h4(this.a);
                }
            });
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicJumpLastestAddEvent event) {
        NoScrollViewPager noScrollViewPager;
        Intrinsics.checkNotNullParameter(event, "event");
        com.zentraedi.comic.databinding.a2 a2Var = this.n;
        if (a2Var != null && (noScrollViewPager = a2Var.e0) != null) {
            noScrollViewPager.setCurrentItem(0);
        }
        A3().M();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicHouseDisplayChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.isEmpty(event.getSortPath())) {
            com.zentraedi.comic.viewmodel.m2.T(A3(), null, 1, null);
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.zentraedi.comic.databinding.a2 a2Var = (com.zentraedi.comic.databinding.a2) androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.Z5, viewGroup, false);
        this.n = a2Var;
        if (a2Var != null) {
            a2Var.E1(B3());
        }
        com.zentraedi.comic.databinding.a2 a2Var2 = this.n;
        if (a2Var2 != null) {
            a2Var2.D1(A3());
        }
        org.greenrobot.eventbus.c.f().v(this);
        D3();
        com.zentraedi.comic.databinding.a2 a2Var3 = this.n;
        if (a2Var3 != null) {
            return a2Var3.getRoot();
        }
        return null;
    }

    public void onDestroyView() {
        org.greenrobot.eventbus.c.f().A(this);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.zentraedi.comic.databinding.a2 a2Var = this.n;
        if (a2Var != null) {
            F3(a2Var);
        }
        B3().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m1.m4(this.a, view2);
            }
        });
        B3().mIsCurrentFragmentEmpty.set(Boolean.TRUE);
        B3().editNavObserver.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Lt2));
        ObservableField<String> observableField = B3().rightEditTextObserver;
        if (observableField != null) {
            observableField.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
        }
        com.zentraedi.comic.viewmodel.m2.T(A3(), null, 1, null);
        B3().d0();
        B3().A0();
        B3().setRightIconTwoOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m1.n4(this.a, view2);
            }
        });
        B3().hideRightTwoNavIcon.set(Boolean.FALSE);
    }

    @fo.k
    public final String u3() {
        NoScrollViewPager noScrollViewPager;
        String id2;
        com.zentraedi.comic.databinding.a2 a2Var = this.n;
        if (a2Var == null || (noScrollViewPager = a2Var.e0) == null) {
            return "0";
        }
        ComicCategory comicCategory = w3().s().get(noScrollViewPager.getCurrentItem());
        return (comicCategory == null || (id2 = comicCategory.getId()) == null) ? "0" : id2;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicHouseAddedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        B3().K0(Boolean.FALSE);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicHouseRefreshedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        B3().A0();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicStartFlushEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        B3().I0(event.getDirIds());
    }
}
