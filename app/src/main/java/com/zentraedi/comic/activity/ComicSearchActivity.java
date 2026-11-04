package com.zentraedi.comic.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicSearchActivity extends ComicBaseListActivity {

    @fo.k
    public static final a a0 = new a(null);

    @fo.k
    public static final String b0 = "_search_comic_history";
    private com.zentraedi.comic.databinding.q T;
    private com.zentraedi.comic.viewmodel.d6 U;

    @fo.l
    private com.zentraedi.comic.adapter.p V;

    @fo.l
    private com.zentraedi.comic.fragment.x2 Y;
    private final int W = 10;

    @fo.k
    private List<String> X = new ArrayList();

    @fo.k
    private String Z = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) ComicSearchActivity.class));
        }

        private a() {
        }
    }

    public static final class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (3 != i && i != 0) {
                return false;
            }
            com.zentraedi.comic.viewmodel.d6 d6Var = ComicSearchActivity.this.U;
            com.zentraedi.comic.viewmodel.d6 d6Var2 = null;
            if (d6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var = null;
            }
            String str = (String) d6Var.G0().get();
            if (TextUtils.isEmpty(str != null ? StringsKt.trim(str).toString() : null)) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.jI1), false);
                return false;
            }
            ComicSearchActivity comicSearchActivity = ComicSearchActivity.this;
            com.zentraedi.comic.viewmodel.d6 d6Var3 = comicSearchActivity.U;
            if (d6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var3 = null;
            }
            String str2 = (String) d6Var3.G0().get();
            if (str2 == null) {
                str2 = "";
            }
            comicSearchActivity.Z = str2;
            com.zentraedi.comic.viewmodel.d6 d6Var4 = ComicSearchActivity.this.U;
            if (d6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                d6Var2 = d6Var4;
            }
            d6Var2.z1(ComicSearchActivity.this.Z);
            ComicSearchActivity.this.J4();
            return true;
        }
    }

    public static final class c extends TypeToken<List<? extends String>> {
        c() {
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            com.zentraedi.comic.viewmodel.d6 d6Var = ComicSearchActivity.this.U;
            com.zentraedi.comic.databinding.q qVar = null;
            if (d6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var = null;
            }
            if (TextUtils.isEmpty((CharSequence) d6Var.G0().get())) {
                com.zentraedi.comic.databinding.q qVar2 = ComicSearchActivity.this.T;
                if (qVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    qVar = qVar2;
                }
                qVar.K.setVisibility(0);
                return;
            }
            com.zentraedi.comic.databinding.q qVar3 = ComicSearchActivity.this.T;
            if (qVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                qVar = qVar3;
            }
            qVar.K.setVisibility(8);
        }
    }

    public static final class e implements com.zentraedi.business.utils.n4.j {
        e() {
        }

        public void confirmClick() {
            ComicSearchActivity.this.w4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(ComicSearchActivity comicSearchActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.comic.viewmodel.d6 d6Var = comicSearchActivity.U;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        String str = (String) d6Var.G0().get();
        if (str == null) {
            str = "";
        }
        comicSearchActivity.Z = str;
        comicSearchActivity.J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(ComicSearchActivity comicSearchActivity, View view) {
        comicSearchActivity.I4();
    }

    private final List<com.zentraedi.comic.viewmodel.a5> C4() {
        ArrayList arrayList = new ArrayList();
        com.zentraedi.comic.viewmodel.d6 d6Var = null;
        if (com.zentraedi.basic.function.utils.j0.l(this.X)) {
            com.zentraedi.comic.viewmodel.d6 d6Var2 = this.U;
            if (d6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                d6Var = d6Var2;
            }
            d6Var.T0().set(true);
            return arrayList;
        }
        com.zentraedi.comic.viewmodel.d6 d6Var3 = this.U;
        if (d6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            d6Var = d6Var3;
        }
        d6Var.T0().set(false);
        for (final String str : this.X) {
            Application applicationC = com.zentraedi.basic.function.utils.a.c();
            Intrinsics.checkNotNullExpressionValue(applicationC, "getApplication(...)");
            com.zentraedi.comic.viewmodel.a5 a5Var = new com.zentraedi.comic.viewmodel.a5(applicationC);
            a5Var.M().set(str);
            a5Var.N(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.j4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ComicSearchActivity.D4(this.a, str, view);
                }
            });
            arrayList.add(a5Var);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D4(ComicSearchActivity comicSearchActivity, String str, View view) {
        com.zentraedi.comic.viewmodel.d6 d6Var = comicSearchActivity.U;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.G0().set(str);
        comicSearchActivity.Z = str;
        comicSearchActivity.J4();
    }

    private final void E4() {
        com.zentraedi.comic.databinding.q qVar = this.T;
        com.zentraedi.comic.databinding.q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        qVar.F.addTextChangedListener(new d());
        com.zentraedi.comic.databinding.q qVar3 = this.T;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qVar2 = qVar3;
        }
        qVar2.F.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.k4
            @Override // java.lang.Runnable
            public final void run() {
                ComicSearchActivity.F4(this.a);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void F4(ComicSearchActivity comicSearchActivity) {
        com.zentraedi.comic.databinding.q qVar = comicSearchActivity.T;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        com.zentraedi.basic.function.utils.p0.f(comicSearchActivity, qVar.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void G4() {
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setJustifyContent(0);
        com.zentraedi.comic.adapter.p pVar = new com.zentraedi.comic.adapter.p();
        this.V = pVar;
        pVar.U1(C4());
        com.zentraedi.comic.databinding.q qVar = this.T;
        com.zentraedi.comic.databinding.q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        qVar.G.setLayoutManager(flexboxLayoutManager);
        com.zentraedi.comic.databinding.q qVar3 = this.T;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qVar2 = qVar3;
        }
        qVar2.G.setAdapter(this.V);
    }

    private final void H4() {
        if (this.Y == null) {
            this.Y = new com.zentraedi.comic.fragment.x2();
        }
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        com.zentraedi.comic.fragment.x2 x2Var = this.Y;
        if (x2Var != null) {
            t0VarW.C(com.zentraedi.comic.q.i.BE, x2Var).r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void I4() {
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.go1);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gi0);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        n4VarA.S2(this, strN, strN2, strN3, strN4, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J4() {
        com.zentraedi.business.utils.o7.e.a().e(this);
        com.zentraedi.comic.databinding.q qVar = this.T;
        com.zentraedi.comic.viewmodel.d6 d6Var = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        qVar.F.clearFocus();
        if (!TextUtils.isEmpty(this.Z)) {
            if (this.X.contains(this.Z)) {
                this.X.remove(this.Z);
            }
            this.X.add(0, this.Z);
            int size = this.X.size();
            int i = this.W;
            if (size > i) {
                this.X.remove(i);
            }
        }
        com.zentraedi.business.utils.t7.j(com.zentraedi.business.w0.a + com.zentraedi.business.w0.e + b0, new Gson().toJson(this.X));
        com.zentraedi.comic.adapter.p pVar = this.V;
        if (pVar != null) {
            pVar.U1(C4());
        }
        com.zentraedi.comic.viewmodel.d6 d6Var2 = this.U;
        if (d6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var2 = null;
        }
        d6Var2.V0().set(true);
        com.zentraedi.comic.viewmodel.d6 d6Var3 = this.U;
        if (d6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            d6Var = d6Var3;
        }
        d6Var.z1(this.Z);
        com.zentraedi.comic.fragment.x2 x2Var = this.Y;
        if (x2Var != null) {
            x2Var.r3(this.Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w4() {
        this.X.clear();
        com.zentraedi.comic.adapter.p pVar = this.V;
        if (pVar != null) {
            pVar.U1(new ArrayList());
        }
        com.zentraedi.comic.viewmodel.d6 d6Var = this.U;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.T0().set(true);
        com.zentraedi.business.utils.t7.j(com.zentraedi.business.w0.a + com.zentraedi.business.w0.e + b0, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void y4(ComicSearchActivity comicSearchActivity, View view) {
        comicSearchActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(ComicSearchActivity comicSearchActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.comic.viewmodel.d6 d6Var = comicSearchActivity.U;
        com.zentraedi.comic.viewmodel.d6 d6Var2 = null;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.G0().set("");
        com.zentraedi.comic.viewmodel.d6 d6Var3 = comicSearchActivity.U;
        if (d6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            d6Var2 = d6Var3;
        }
        d6Var2.V0().set(false);
    }

    protected void r3() {
        this.U = new androidx.lifecycle.m2(this).c(com.zentraedi.comic.viewmodel.d6.class);
        String str = (String) com.zentraedi.business.utils.t7.d(com.zentraedi.business.w0.a + com.zentraedi.business.w0.e + b0, "");
        if (!TextUtils.isEmpty(str)) {
            List list = (List) com.zentraedi.basic.component.utils.a.b().fromJson(str, new c().getType());
            List<String> list2 = this.X;
            Intrinsics.checkNotNull(list);
            list2.addAll(list);
        }
        com.zentraedi.comic.viewmodel.d6 d6Var = this.U;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.T0().set(com.zentraedi.basic.function.utils.j0.l(this.X));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        androidx.databinding.c0 c0VarL = androidx.databinding.m.l(this, com.zentraedi.comic.q.l.Q);
        Intrinsics.checkNotNullExpressionValue(c0VarL, "setContentView(...)");
        com.zentraedi.comic.databinding.q qVar = (com.zentraedi.comic.databinding.q) c0VarL;
        this.T = qVar;
        com.zentraedi.comic.databinding.q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        com.zentraedi.comic.viewmodel.d6 d6Var = this.U;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        qVar.C1(d6Var);
        com.zentraedi.comic.databinding.q qVar3 = this.T;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qVar2 = qVar3;
        }
        qVar2.u();
        G4();
        H4();
        x4();
        E4();
    }

    public final void x4() {
        com.zentraedi.comic.databinding.q qVar = this.T;
        com.zentraedi.comic.databinding.q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar = null;
        }
        qVar.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSearchActivity.y4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.q qVar3 = this.T;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar3 = null;
        }
        qVar3.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSearchActivity.z4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.q qVar4 = this.T;
        if (qVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar4 = null;
        }
        qVar4.F.setOnEditorActionListener(new b());
        com.zentraedi.comic.databinding.q qVar5 = this.T;
        if (qVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qVar5 = null;
        }
        qVar5.L.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.h4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSearchActivity.A4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.q qVar6 = this.T;
        if (qVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qVar2 = qVar6;
        }
        qVar2.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.i4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSearchActivity.B4(this.a, view);
            }
        });
    }
}
