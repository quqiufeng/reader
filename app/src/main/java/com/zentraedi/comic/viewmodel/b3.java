package com.zentraedi.comic.viewmodel;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.zentraedi.business.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b3 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableBoolean a;

    @fo.k
    private final ObservableField<String> b;

    @fo.k
    private final ObservableField<String> c;

    @fo.k
    private final ObservableField<Boolean> d;

    @fo.k
    private final ObservableField<Drawable> e;

    @fo.k
    private final ObservableField<String> f;

    @fo.k
    private final ObservableField<String> g;

    @fo.k
    private final ObservableField<View.OnClickListener> h;

    @fo.k
    private final ObservableField<View.OnClickListener> i;

    @fo.k
    private final ObservableField<View.OnClickListener> j;

    @fo.k
    private final ObservableBoolean k;

    @fo.k
    private ObservableField<View.OnClickListener> l;

    @fo.k
    private final ObservableBoolean m;

    public b3() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = new ObservableBoolean(true);
        this.b = new ObservableField<>();
        this.c = new ObservableField<>();
        this.d = new ObservableField<>(Boolean.TRUE);
        this.e = new ObservableField<>(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
        this.f = new ObservableField<>("ctime");
        this.g = new ObservableField<>("desc");
        this.h = new ObservableField<>();
        this.i = new ObservableField<>();
        this.j = new ObservableField<>();
        this.k = new ObservableBoolean(true);
        this.l = new ObservableField<>();
        this.m = new ObservableBoolean();
    }

    private final void X() {
        if (Intrinsics.areEqual("name", this.f.get())) {
            if (Intrinsics.areEqual("asc", this.g.get())) {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("ctime", this.f.get())) {
            if (Intrinsics.areEqual("asc", this.g.get())) {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("uptime", this.f.get())) {
            if (Intrinsics.areEqual("asc", this.g.get())) {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
            } else {
                this.e.set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
            }
        }
    }

    @fo.k
    public final ObservableBoolean L() {
        return this.a;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> M() {
        return this.h;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> N() {
        return this.j;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> O() {
        return this.l;
    }

    @fo.k
    public final ObservableBoolean P() {
        return this.k;
    }

    @fo.k
    public final ObservableField<Boolean> Q() {
        return this.d;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> R() {
        return this.i;
    }

    @fo.k
    public final ObservableField<String> S() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Drawable> T() {
        return this.e;
    }

    public final void U(int i) {
        if (i == 7) {
            ObservableField<String> observableField = this.f;
            com.zentraedi.comic.util.h hVar = com.zentraedi.comic.util.h.a;
            observableField.set(hVar.e());
            this.g.set(hVar.d());
        } else if (i == 8) {
            ObservableField<String> observableField2 = this.f;
            com.zentraedi.comic.util.h hVar2 = com.zentraedi.comic.util.h.a;
            observableField2.set(hVar2.c());
            this.g.set(hVar2.b());
        }
        W();
        X();
    }

    @fo.k
    public final ObservableBoolean V() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    public final void W() {
        String strN;
        String str = (String) this.f.get();
        if (str == null) {
            strN = "";
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -838362136) {
                if (iHashCode != 3373707) {
                    if (iHashCode == 94988720 && str.equals("ctime")) {
                        strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.td3);
                    } else {
                        strN = "";
                    }
                } else if (str.equals("name")) {
                    strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sy0);
                } else {
                    strN = "";
                }
            } else if (str.equals("uptime")) {
                strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fJ);
            } else {
                strN = "";
            }
        }
        this.b.set(strN);
    }

    public final void Y(@fo.k ObservableField<View.OnClickListener> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.l = observableField;
    }

    @fo.k
    public final ObservableField<String> getNumDesc() {
        return this.c;
    }

    @fo.k
    public final ObservableField<String> getOrder() {
        return this.g;
    }

    @fo.k
    public final ObservableField<String> getSortBy() {
        return this.f;
    }
}
