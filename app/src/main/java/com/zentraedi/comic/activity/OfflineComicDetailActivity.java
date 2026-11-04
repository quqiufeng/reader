package com.zentraedi.comic.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.event.ComicDisplayModeChangeEvent;
import com.zentraedi.comic.event.ComicFinishSubDirEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessEvent;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class OfflineComicDetailActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a f0 = new a(null);

    @fo.k
    public static final String g0 = "KEY_PARENT_PATH";

    @fo.k
    public static final String h0 = "KEY_TOP_PATH";

    @fo.k
    public static final String i0 = "KEY_RECORD_ENTITY";

    @fo.l
    private ComicInfoModel b0;

    @fo.l
    private String c0;

    @fo.l
    private String d0;

    @fo.k
    private final String T = "OfflineComicMainActivity";

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.t7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.l5(this.a);
        }
    });

    @fo.k
    private final Lazy V = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.u7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.n5();
        }
    });

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.v7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.q5();
        }
    });

    @fo.k
    private final Lazy X = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.w7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.r5();
        }
    });

    @fo.k
    private final Lazy Y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.x7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.p5();
        }
    });

    @fo.k
    private final Lazy Z = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.y7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.m5();
        }
    });

    @fo.k
    private final Lazy a0 = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.z7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicDetailActivity.o5();
        }
    });

    @fo.k
    private String e0 = com.zentraedi.comic.constant.a.e.Af.a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.k String parentPath, @fo.l ComicInfoModel comicInfoModel, @fo.l String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(parentPath, "parentPath");
            Intent intent = new Intent(activity, (Class<?>) OfflineComicDetailActivity.class);
            intent.putExtra(OfflineComicDetailActivity.g0, parentPath);
            intent.putExtra(OfflineComicDetailActivity.h0, str);
            if (comicInfoModel != null) {
                intent.putExtra(OfflineComicDetailActivity.i0, (Serializable) comicInfoModel);
            }
            activity.startActivity(intent);
        }

        public final void b(@fo.k Activity activity, @fo.k String parentPath, @fo.l String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(parentPath, "parentPath");
            a(activity, parentPath, null, str);
        }

        private a() {
        }
    }

    public static final class b implements com.zentraedi.comic.business.z1.a {
        b() {
        }

        @Override // com.zentraedi.comic.business.z1.a
        public void a() {
            OfflineComicDetailActivity offlineComicDetailActivity = OfflineComicDetailActivity.this;
            offlineComicDetailActivity.s5((String) offlineComicDetailActivity.Q4().getSortBy().get(), (String) OfflineComicDetailActivity.this.Q4().getOrder().get());
            OfflineComicDetailActivity.this.Q4().W();
        }
    }

    public static final class c extends androidx.databinding.u.a {
        c() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            OfflineComicDetailActivity.this.Q4().V().set(Intrinsics.areEqual(OfflineComicDetailActivity.this.W4().editModel.get(), Boolean.TRUE));
        }
    }

    private final void G4() {
        com.zentraedi.comic.constant.a.e.C0115a c0115a = com.zentraedi.comic.constant.a.e.Af;
        this.e0 = Intrinsics.areEqual(c0115a.b(), this.e0) ? c0115a.a() : c0115a.b();
        P4().Q2(this.e0);
    }

    private final void H4() {
        Q4().getSortBy().set("name");
        Q4().getOrder().set("asc");
        P4().h3().X((String) Q4().getSortBy().get());
        P4().h3().V((String) Q4().getOrder().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J4(com.zentraedi.comic.fragment.e2 e2Var, com.zentraedi.business.addfile.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (e2Var != null) {
            e2Var.s3(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K4(OfflineComicDetailActivity offlineComicDetailActivity, com.zentraedi.comic.viewmodel.i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlineComicDetailActivity.u5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L4(OfflineComicDetailActivity offlineComicDetailActivity, com.zentraedi.comic.fragment.e2 e2Var) {
        if (Intrinsics.areEqual(offlineComicDetailActivity.W4().editModel.get(), Boolean.FALSE)) {
            offlineComicDetailActivity.W4().editModel.set(Boolean.TRUE);
            if (e2Var != null) {
                e2Var.U2(true);
            }
        }
        return Unit.INSTANCE;
    }

    private final void M4() {
        W4().editModel.set(Boolean.FALSE);
        P4().U2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit N4(OfflineComicDetailActivity offlineComicDetailActivity, boolean z) {
        if (z) {
            String strZ = com.zentraedi.business.utils.l5.z(offlineComicDetailActivity.c0);
            a aVar = f0;
            Intrinsics.checkNotNull(strZ);
            aVar.b(offlineComicDetailActivity, strZ, offlineComicDetailActivity.d0);
            offlineComicDetailActivity.overridePendingTransition(com.zentraedi.comic.q.a.t, com.zentraedi.comic.q.a.G0);
        }
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.fragment.e2 P4() {
        return (com.zentraedi.comic.fragment.e2) this.Z.getValue();
    }

    public static /* synthetic */ void S4() {
    }

    private final com.zentraedi.comic.business.z1 U4() {
        return (com.zentraedi.comic.business.z1) this.Y.getValue();
    }

    private final void Y4() {
        P4().l3(false);
        P4().E3(9);
        H4();
        com.zentraedi.comic.impl.r rVar = new com.zentraedi.comic.impl.r(9);
        rVar.j0(this.d0);
        rVar.h0(this.c0);
        rVar.g0(this.b0);
        I4(P4(), rVar);
        rVar.S(new WeakReference<>(W4()));
        rVar.i0(new WeakReference<>(V4()));
        P4().F3(rVar);
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        t0VarW.f(com.zentraedi.comic.q.i.d8, P4());
        try {
            t0VarW.r();
        } catch (Exception e) {
            nd.a.c(this.T, "fragment commit error " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    private final void Z4() {
        ComicInfoModel comicInfoModel = this.b0;
        if (comicInfoModel != null) {
            if (!TextUtils.isEmpty(comicInfoModel != null ? comicInfoModel.getProgress() : null)) {
                ComicInfoModel comicInfoModel2 = this.b0;
                if (comicInfoModel2 != null) {
                    NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel2.getProgress(), NasReadingRecordModule.class);
                    if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
                        W4().T().set(false);
                        return;
                    } else {
                        O4().K.F.setText(com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                        W4().T().set(true);
                        return;
                    }
                }
                return;
            }
        }
        W4().T().set(false);
    }

    private final void a5() {
        O4().L.J.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        O4().L.L.setTextSize(2, 16.0f);
        O4().L.L.setTypeface(Typeface.DEFAULT);
        O4().L.F.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Gi));
        W4().hideRightNavIcon.set(Boolean.TRUE);
        O4().L.I.setVisibility(8);
        O4().H.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.xl));
        O4().H.I.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.K3));
        O4().H.G.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.K3));
        O4().H.F.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.f.Vd));
        O4().L.E.setVisibility(0);
        O4().L.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.r7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.b5(view);
            }
        });
        O4().K.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.s7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.c5(this.a, view);
            }
        });
        O4().L.L.setMaxLines(1);
        O4().L.L.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.LayoutParams layoutParams = O4().L.L.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = com.zentraedi.basic.function.utils.m0.b(100.0f);
        layoutParams2.rightMargin = com.zentraedi.basic.function.utils.m0.b(100.0f);
        Y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(View view) {
        org.greenrobot.eventbus.c.f().q(new ComicFinishSubDirEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        ComicInfoModel comicInfoModel = offlineComicDetailActivity.b0;
        if (comicInfoModel != null) {
            comicInfoModel.setOfflineData(true);
        }
        ComicReaderActivity.a aVar = ComicReaderActivity.x5;
        ComicInfoModel comicInfoModel2 = offlineComicDetailActivity.b0;
        aVar.a(offlineComicDetailActivity, comicInfoModel2 != null ? comicInfoModel2.fake() : null);
    }

    private final void d5() {
        W4().U().set(Boolean.TRUE);
        W4().setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.e5(this.a, view);
            }
        });
        W4().setCloseEditOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.g7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.f5(this.a, view);
            }
        });
        W4().setSelectOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.h7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.g5(this.a, view);
            }
        });
        this.e0 = com.zentraedi.comic.util.h.a.a();
        Q4().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), this.e0));
        Q4().M().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.i7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.h5(this.a, view);
            }
        });
        Q4().R().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.j7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.i5(this.a, view);
            }
        });
        Q4().O().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.k7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.j5(this.a, view);
            }
        });
        Q4().N().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.l7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicDetailActivity.k5(this.a, view);
            }
        });
        U4().k(new b());
        W4().editModel.addOnPropertyChangedCallback(new c());
        Q4().W();
        Q4().U(9);
        V4().R().set(false);
        V4().U().set(false);
        O4().C1(W4());
        O4().J.C1(Q4());
        O4().I.C1(V4());
        AppBarLayout appBarLayout = O4().E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        TextView tvTitle = O4().N;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        View root = O4().K.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        aVar.i(new View[]{tvTitle, root});
        TextView tvNavTitle = O4().L.L;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        appBarLayout.e(aVar);
        Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        offlineComicDetailActivity.W4().editModel.set(Boolean.TRUE);
        offlineComicDetailActivity.P4().U2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        offlineComicDetailActivity.M4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        if (Intrinsics.areEqual(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB), (String) offlineComicDetailActivity.W4().rightEditTextObserver.get())) {
            offlineComicDetailActivity.P4().u3();
        } else {
            offlineComicDetailActivity.P4().H3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        org.greenrobot.eventbus.c.f().q(new ComicDisplayModeChangeEvent());
        offlineComicDetailActivity.G4();
        offlineComicDetailActivity.Q4().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), offlineComicDetailActivity.e0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        offlineComicDetailActivity.x5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        offlineComicDetailActivity.W4().editModel.set(Boolean.TRUE);
        offlineComicDetailActivity.P4().U2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k5(OfflineComicDetailActivity offlineComicDetailActivity, View view) {
        offlineComicDetailActivity.U4().b(offlineComicDetailActivity.Q4().getSortBy(), offlineComicDetailActivity.Q4().getOrder(), offlineComicDetailActivity.Q4().T(), 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.y l5(OfflineComicDetailActivity offlineComicDetailActivity) {
        return (com.zentraedi.comic.databinding.y) androidx.databinding.m.l(offlineComicDetailActivity, com.zentraedi.comic.q.l.C0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.fragment.e2 m5() {
        return new com.zentraedi.comic.fragment.e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.b3 n5() {
        return new com.zentraedi.comic.viewmodel.b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.p2 o5() {
        return new com.zentraedi.comic.business.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.z1 p5() {
        return new com.zentraedi.comic.business.z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.d3 q5() {
        return new com.zentraedi.comic.viewmodel.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.a3 r5() {
        return new com.zentraedi.comic.viewmodel.a3();
    }

    private final void u5(final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.p2 p2VarT4 = T4();
        View root = O4().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        p2VarT4.l(root, (String) i6Var.l0().get(), (String) i6Var.m0().get(), Boolean.valueOf(com.zentraedi.business.utils.i5.a.f((String) i6Var.u0().get()) == -1), new Function0() { // from class: com.zentraedi.comic.activity.q7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OfflineComicDetailActivity.v5(this.a, i6Var);
            }
        }, (String) i6Var.u0().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v5(OfflineComicDetailActivity offlineComicDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        offlineComicDetailActivity.T4().e(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.p7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicDetailActivity.w5(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w5(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    private final void x5() {
        U4().p(O4().getRoot(), Q4().getSortBy(), Q4().getOrder(), Q4().T(), true, 9);
    }

    public final void I4(@fo.k final com.zentraedi.comic.fragment.e2 comicFragment, @fo.k com.zentraedi.comic.impl.j impl) {
        Intrinsics.checkNotNullParameter(comicFragment, "comicFragment");
        Intrinsics.checkNotNullParameter(impl, "impl");
        impl.P(new Function1() { // from class: com.zentraedi.comic.activity.m7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicDetailActivity.J4(comicFragment, (com.zentraedi.business.addfile.n) obj);
            }
        });
        impl.N(new Function1() { // from class: com.zentraedi.comic.activity.n7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicDetailActivity.K4(this.a, (com.zentraedi.comic.viewmodel.i6) obj);
            }
        });
        impl.R(new Function0() { // from class: com.zentraedi.comic.activity.o7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OfflineComicDetailActivity.L4(this.a, comicFragment);
            }
        });
    }

    @fo.k
    public final com.zentraedi.comic.databinding.y O4() {
        Object value = this.U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.y) value;
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.b3 Q4() {
        return (com.zentraedi.comic.viewmodel.b3) this.V.getValue();
    }

    @fo.k
    public final String R4() {
        return this.e0;
    }

    @fo.k
    public final com.zentraedi.comic.business.p2 T4() {
        return (com.zentraedi.comic.business.p2) this.a0.getValue();
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.d3 V4() {
        return (com.zentraedi.comic.viewmodel.d3) this.W.getValue();
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.a3 W4() {
        return (com.zentraedi.comic.viewmodel.a3) this.X.getValue();
    }

    @fo.k
    public final String X4() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        com.zentraedi.comic.util.l.a.c(this.c0, new Function1() { // from class: com.zentraedi.comic.activity.f7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicDetailActivity.N4(this.a, ((Boolean) obj).booleanValue());
            }
        });
        super/*android.app.Activity*/.finish();
        overridePendingTransition(com.zentraedi.comic.q.a.n0, com.zentraedi.comic.q.a.G0);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFinishSubDirEvent(@fo.k ComicFinishSubDirEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        finish();
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public boolean onKeyDown(int i, @fo.k KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i != 4 || event.getRepeatCount() != 0 || !Intrinsics.areEqual(W4().editModel.get(), Boolean.TRUE)) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, event);
        }
        M4();
        return true;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ComicListEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getMessage(), ComicListEvent.Companion.a())) {
            W4().editModel.set(Boolean.FALSE);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateSuccessEvent(@fo.k ReadRecordUpdateSuccessEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ComicInfoModel comicInfoModel = this.b0;
        if (TextUtils.equals(comicInfoModel != null ? comicInfoModel.getId() : null, event.getComicId())) {
            ComicInfoModel comicInfoModel2 = this.b0;
            if (comicInfoModel2 != null) {
                comicInfoModel2.setProgress(event.getProgress());
            }
            Z4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SdCardPath"})
    protected void r3() {
        String filePath;
        String path;
        ComicInfoModel comicInfoModel;
        org.greenrobot.eventbus.c.f().v(this);
        Intent intent = getIntent();
        this.c0 = intent != null ? intent.getStringExtra(g0) : null;
        Intent intent2 = getIntent();
        this.d0 = intent2 != null ? intent2.getStringExtra(h0) : null;
        W4().navTitle.set(com.zentraedi.business.utils.l5.r(this.c0));
        Intent intent3 = getIntent();
        ComicInfoModel comicInfoModel2 = (ComicInfoModel) (intent3 != null ? intent3.getSerializableExtra(i0) : null);
        this.b0 = comicInfoModel2;
        if (comicInfoModel2 != null && (path = comicInfoModel2.getPath()) != null) {
            com.zentraedi.comic.util.f fVar = com.zentraedi.comic.util.f.a;
            String strB = fVar.b();
            Intrinsics.checkNotNullExpressionValue(strB, "<get-FOLDER_PATH_ABSOLUTE>(...)");
            if (!StringsKt.startsWith$default(path, strB, false, 2, (Object) null) && (comicInfoModel = this.b0) != null) {
                String id2 = comicInfoModel != null ? comicInfoModel.getId() : null;
                ComicInfoModel comicInfoModel3 = this.b0;
                comicInfoModel.setPath(fVar.h(id2, comicInfoModel3 != null ? comicInfoModel3.getPath() : null));
            }
        }
        ComicInfoModel comicInfoModel4 = this.b0;
        if (!TextUtils.isEmpty(comicInfoModel4 != null ? comicInfoModel4.getProgress() : null)) {
            Gson gsonB = com.zentraedi.basic.component.utils.a.b();
            ComicInfoModel comicInfoModel5 = this.b0;
            Intrinsics.checkNotNull(comicInfoModel5);
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) gsonB.fromJson(comicInfoModel5.getProgress(), NasReadingRecordModule.class);
            if (!TextUtils.isEmpty(nasReadingRecordModule != null ? nasReadingRecordModule.getFilePath() : null) && nasReadingRecordModule != null && (filePath = nasReadingRecordModule.getFilePath()) != null) {
                com.zentraedi.comic.util.f fVar2 = com.zentraedi.comic.util.f.a;
                String strB2 = fVar2.b();
                Intrinsics.checkNotNullExpressionValue(strB2, "<get-FOLDER_PATH_ABSOLUTE>(...)");
                if (!StringsKt.startsWith$default(filePath, strB2, false, 2, (Object) null)) {
                    ComicInfoModel comicInfoModel6 = this.b0;
                    String strH = fVar2.h(comicInfoModel6 != null ? comicInfoModel6.getId() : null, nasReadingRecordModule.getFilePath());
                    if (strH == null) {
                        strH = "";
                    }
                    nasReadingRecordModule.setFilePath(strH);
                    ComicInfoModel comicInfoModel7 = this.b0;
                    if (comicInfoModel7 != null) {
                        String jsonStr = nasReadingRecordModule.toJsonStr();
                        Intrinsics.checkNotNullExpressionValue(jsonStr, "toJsonStr(...)");
                        comicInfoModel7.setProgress(jsonStr);
                    }
                }
            }
        }
        com.zentraedi.comic.util.l.a.e(this.d0, this.c0);
    }

    protected void s3() {
        O4();
        a5();
        d5();
    }

    public final void s5(@fo.l String str, @fo.l String str2) {
        P4().h3().X(str);
        P4().h3().V(str2);
        P4().b();
    }

    public final void t5(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.e0 = str;
    }
}
