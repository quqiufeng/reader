package com.zentraedi.comic.adapter;

import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.comic.activity.OfflineComicMainActivity;
import com.zentraedi.comic.business.t2;
import com.zentraedi.comic.fragment.e2;
import com.zentraedi.comic.viewmodel.b3;
import com.zentraedi.comic.viewmodel.c3;
import com.zentraedi.comic.viewmodel.d3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a0 extends r0 {

    @fo.k
    private final ComicCategory a;

    @fo.k
    private final List<ComicCategory> b;

    @fo.k
    private final HashMap<String, e2> c;

    @fo.l
    private WeakReference<OfflineComicMainActivity> d;

    @fo.k
    private final Lazy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@fo.k FragmentManager manager) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        ComicCategory comicCategory = new ComicCategory();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.FH);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        comicCategory.setName(strN);
        comicCategory.setId("0");
        this.a = comicCategory;
        this.b = new ArrayList();
        this.c = new HashMap<>();
        this.e = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.adapter.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.z();
            }
        });
    }

    private final t2 w() {
        return (t2) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 z() {
        return new t2();
    }

    public final void A(@fo.l WeakReference<OfflineComicMainActivity> weakReference) {
        this.d = weakReference;
    }

    public final void B(@fo.k List<ComicCategory> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.b.clear();
        this.b.add(this.a);
        this.b.addAll(list);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.b.size();
    }

    @fo.k
    public Fragment getItem(int i) {
        return u(i);
    }

    public int getItemPosition(@fo.k Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        return -2;
    }

    @fo.k
    public CharSequence getPageTitle(int i) {
        return this.b.get(i).getName();
    }

    public final void o(@fo.k String listType) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        Iterator<Map.Entry<String, e2>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().Q2(listType);
        }
    }

    public final void p(boolean z) {
        Iterator<Map.Entry<String, e2>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().U2(z);
        }
    }

    @fo.k
    public final ComicCategory q() {
        return this.a;
    }

    @fo.k
    public final List<ComicCategory> s() {
        return this.b;
    }

    @fo.k
    public final e2 u(int i) {
        OfflineComicMainActivity offlineComicMainActivity;
        OfflineComicMainActivity offlineComicMainActivity2;
        OfflineComicMainActivity offlineComicMainActivity3;
        OfflineComicMainActivity offlineComicMainActivity4;
        b3 b3VarQ4;
        ObservableField<String> order;
        OfflineComicMainActivity offlineComicMainActivity5;
        b3 b3VarQ5;
        ObservableField<String> sortBy;
        String id2 = this.b.get(i).getId();
        e2 e2Var = this.c.get(id2);
        if (e2Var == null) {
            e2Var = new e2();
            this.c.put(id2, e2Var);
        }
        e2Var.l3(false);
        e2Var.E3(9);
        c3 c3VarH3 = e2Var.h3();
        d3 d3VarV4 = null;
        if (c3VarH3 != null) {
            WeakReference<OfflineComicMainActivity> weakReference = this.d;
            c3VarH3.X((weakReference == null || (offlineComicMainActivity5 = weakReference.get()) == null || (b3VarQ5 = offlineComicMainActivity5.Q4()) == null || (sortBy = b3VarQ5.getSortBy()) == null) ? null : (String) sortBy.get());
        }
        c3 c3VarH4 = e2Var.h3();
        if (c3VarH4 != null) {
            WeakReference<OfflineComicMainActivity> weakReference2 = this.d;
            c3VarH4.V((weakReference2 == null || (offlineComicMainActivity4 = weakReference2.get()) == null || (b3VarQ4 = offlineComicMainActivity4.Q4()) == null || (order = b3VarQ4.getOrder()) == null) ? null : (String) order.get());
        }
        com.zentraedi.comic.impl.p pVar = new com.zentraedi.comic.impl.p(9);
        pVar.Z(id2);
        WeakReference<OfflineComicMainActivity> weakReference3 = this.d;
        if (weakReference3 != null && (offlineComicMainActivity3 = weakReference3.get()) != null) {
            offlineComicMainActivity3.J4(e2Var, pVar);
        }
        WeakReference<OfflineComicMainActivity> weakReference4 = this.d;
        pVar.S(new WeakReference<>((weakReference4 == null || (offlineComicMainActivity2 = weakReference4.get()) == null) ? null : offlineComicMainActivity2.W4()));
        WeakReference<OfflineComicMainActivity> weakReference5 = this.d;
        if (weakReference5 != null && (offlineComicMainActivity = weakReference5.get()) != null) {
            d3VarV4 = offlineComicMainActivity.V4();
        }
        pVar.b0(new WeakReference<>(d3VarV4));
        pVar.a0(new WeakReference<>(w()));
        e2Var.F3(pVar);
        return e2Var;
    }

    @fo.k
    public final HashMap<String, e2> v() {
        return this.c;
    }

    @fo.l
    public final WeakReference<OfflineComicMainActivity> x() {
        return this.d;
    }
}
