package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.zentraedi.business.R;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.comic.event.ComicHouseDisplayChangedEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class m2 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableBoolean a;

    @fo.k
    private final ObservableField<String> b;

    @fo.k
    private final ObservableField<String> c;

    @fo.k
    private final ObservableField<Drawable> d;

    @fo.k
    private final ObservableField<String> e;

    @fo.k
    private final ObservableField<String> f;

    @fo.k
    private final ObservableBoolean g;

    @fo.k
    private final ObservableBoolean h;

    @fo.l
    private View.OnClickListener i;

    @fo.l
    private String j;

    public m2() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = new ObservableBoolean(true);
        this.b = new ObservableField<>();
        this.c = new ObservableField<>();
        this.d = new ObservableField<>(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
        this.e = new ObservableField<>("ctime");
        this.f = new ObservableField<>(FileListRequest.ORDER_BY_DESC);
        this.g = new ObservableBoolean();
        this.h = new ObservableBoolean(true);
    }

    public static /* synthetic */ void T(m2 m2Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m2Var.S(str);
    }

    private final void V() {
        Y();
        Z();
        if (TextUtils.isEmpty(this.j)) {
            com.zentraedi.comic.util.g gVar = com.zentraedi.comic.util.g.a;
            gVar.k(String.valueOf(this.e.get()));
            gVar.j(String.valueOf(this.f.get()));
        } else {
            com.zentraedi.comic.util.g gVar2 = com.zentraedi.comic.util.g.a;
            gVar2.m(this.j, String.valueOf(this.e.get()));
            gVar2.l(this.j, String.valueOf(this.f.get()));
        }
        org.greenrobot.eventbus.c.f().q(ComicHouseDisplayChangedEvent.Companion.b(this.j));
    }

    private final void Z() {
        if (Intrinsics.areEqual("name", this.e.get())) {
            if (Intrinsics.areEqual(FileListRequest.ORDER_BY_ASC, this.f.get())) {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("size", this.e.get())) {
            if (Intrinsics.areEqual(FileListRequest.ORDER_BY_ASC, this.f.get())) {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("ctime", this.e.get())) {
            if (Intrinsics.areEqual(FileListRequest.ORDER_BY_ASC, this.f.get())) {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("type", this.e.get())) {
            if (Intrinsics.areEqual(FileListRequest.ORDER_BY_ASC, this.f.get())) {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("mtime", this.e.get())) {
            if (Intrinsics.areEqual(FileListRequest.ORDER_BY_ASC, this.f.get())) {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
            } else {
                this.d.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(m2 m2Var, String sort, boolean z) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        m2Var.e.set(sort);
        m2Var.f.set(z ? "asc" : "desc");
        m2Var.V();
        return Unit.INSTANCE;
    }

    public final void M() {
        if (Intrinsics.areEqual("ctime", this.e.get()) && Intrinsics.areEqual(FileListRequest.ORDER_BY_DESC, this.f.get())) {
            return;
        }
        this.e.set("ctime");
        this.f.set(FileListRequest.ORDER_BY_DESC);
        V();
    }

    @fo.k
    public final ObservableBoolean N() {
        return this.a;
    }

    @fo.l
    public final View.OnClickListener O() {
        return this.i;
    }

    @fo.k
    public final ObservableBoolean P() {
        return this.h;
    }

    @fo.k
    public final ObservableField<String> Q() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Drawable> R() {
        return this.d;
    }

    public final void S(@fo.l String str) {
        this.j = str;
        if (TextUtils.isEmpty(str)) {
            ObservableField<String> observableField = this.e;
            com.zentraedi.comic.util.g gVar = com.zentraedi.comic.util.g.a;
            observableField.set(gVar.e());
            this.f.set(gVar.d());
        } else {
            ObservableField<String> observableField2 = this.e;
            com.zentraedi.comic.util.g gVar2 = com.zentraedi.comic.util.g.a;
            observableField2.set(gVar2.g(str));
            this.f.set(gVar2.f(str));
        }
        Y();
        Z();
        this.a.set(Intrinsics.areEqual(com.zentraedi.comic.util.g.a.b(), com.zentraedi.comic.constant.a.e.Af.b()));
    }

    @fo.k
    public final ObservableBoolean U() {
        return this.g;
    }

    public final void W() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (this.a.get()) {
            this.a.set(false);
            com.zentraedi.comic.util.g.a.i(com.zentraedi.comic.constant.a.e.Af.a());
        } else {
            this.a.set(true);
            com.zentraedi.comic.util.g.a.i(com.zentraedi.comic.constant.a.e.Af.b());
        }
        org.greenrobot.eventbus.c.f().q(ComicHouseDisplayChangedEvent.Companion.a());
    }

    public final void X() {
        if (Intrinsics.areEqual(this.f.get(), "asc")) {
            this.f.set("desc");
        } else {
            this.f.set("asc");
        }
        V();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    public final void Y() {
        String strN;
        String str = (String) this.e.get();
        if (str != null) {
            switch (str) {
                case "name":
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sy0);
                    break;
                case "size":
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ty0);
                    break;
                case "type":
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.uy0);
                    break;
                case "ctime":
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.td3);
                    break;
                case "mtime":
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ry0);
                    break;
                default:
                    strN = "";
                    break;
            }
        } else {
            strN = "";
        }
        this.b.set(strN);
    }

    public final void b0(@fo.l View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void c0() {
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        com.zentraedi.business.dialog.e0 e0Var = new com.zentraedi.business.dialog.e0(activityE);
        if (TextUtils.isEmpty(this.j)) {
            String strN = com.zentraedi.basic.function.utils.a.n(R.string.nz2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            String strN2 = com.zentraedi.basic.function.utils.a.n(R.string.oz2);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            e0Var.g("ctime", strN, strN2);
            String strN3 = com.zentraedi.basic.function.utils.a.n(R.string.xy3);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            String strN4 = com.zentraedi.basic.function.utils.a.n(R.string.ly3);
            Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
            e0Var.g("name", strN3, strN4);
        } else {
            String strN5 = com.zentraedi.basic.function.utils.a.n(R.string.xy3);
            Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
            String strN6 = com.zentraedi.basic.function.utils.a.n(R.string.ly3);
            Intrinsics.checkNotNullExpressionValue(strN6, "getString(...)");
            e0Var.g("name", strN5, strN6);
            String strN7 = com.zentraedi.basic.function.utils.a.n(R.string.Hw2);
            Intrinsics.checkNotNullExpressionValue(strN7, "getString(...)");
            String strN8 = com.zentraedi.basic.function.utils.a.n(R.string.Gw2);
            Intrinsics.checkNotNullExpressionValue(strN8, "getString(...)");
            e0Var.g("size", strN7, strN8);
            String strN9 = com.zentraedi.basic.function.utils.a.n(R.string.ac3);
            Intrinsics.checkNotNullExpressionValue(strN9, "getString(...)");
            String strN10 = com.zentraedi.basic.function.utils.a.n(R.string.bc3);
            Intrinsics.checkNotNullExpressionValue(strN10, "getString(...)");
            e0Var.g("type", strN9, strN10);
            String strN11 = com.zentraedi.basic.function.utils.a.n(R.string.Ew2);
            Intrinsics.checkNotNullExpressionValue(strN11, "getString(...)");
            String strN12 = com.zentraedi.basic.function.utils.a.n(R.string.Dw2);
            Intrinsics.checkNotNullExpressionValue(strN12, "getString(...)");
            e0Var.g("mtime", strN11, strN12);
        }
        String str = (String) this.e.get();
        e0Var.j(str != null ? str : "name", Intrinsics.areEqual(this.f.get(), "asc"), new Function2() { // from class: com.zentraedi.comic.viewmodel.l2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m2.d0(this.a, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    @fo.k
    public final ObservableField<String> getNumDesc() {
        return this.c;
    }

    @fo.k
    public final ObservableField<String> getOrder() {
        return this.f;
    }

    @fo.l
    public final String getPath() {
        return this.j;
    }

    @fo.k
    public final ObservableField<String> getSortBy() {
        return this.e;
    }

    public final void setPath(@fo.l String str) {
        this.j = str;
    }
}
