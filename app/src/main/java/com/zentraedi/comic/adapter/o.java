package com.zentraedi.comic.adapter;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.utils.v8;
import com.zentraedi.comic.fragment.b4;
import com.zentraedi.comic.viewmodel.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHouseCategoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseCategoryAdapter.kt\ncom/zentraedi/comic/adapter/ComicHouseCategoryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,125:1\n774#2:126\n865#2,2:127\n1869#2,2:129\n1563#2:131\n1634#2,3:132\n1869#2,2:135\n126#3:137\n153#3,3:138\n*S KotlinDebug\n*F\n+ 1 ComicHouseCategoryAdapter.kt\ncom/zentraedi/comic/adapter/ComicHouseCategoryAdapter\n*L\n73#1:126\n73#1:127,2\n84#1:129,2\n102#1:131\n102#1:132,3\n103#1:135,2\n121#1:137\n121#1:138,3\n*E\n"})
public final class o extends r0 {

    @fo.k
    private final ComicCategory a;

    @fo.k
    private final ArrayList<ComicCategory> b;

    @fo.k
    private final HashMap<String, b4> c;

    @fo.l
    private Function0<Unit> d;

    @fo.l
    private Function1<? super List<l0>, Unit> e;

    @fo.l
    private Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@fo.k FragmentManager manager) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        ComicCategory comicCategory = new ComicCategory();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.FH);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        comicCategory.setName(strN);
        comicCategory.setId("0");
        this.a = comicCategory;
        this.b = new ArrayList<>();
        this.c = new HashMap<>();
    }

    @fo.l
    public final Function1<List<l0>, Unit> A() {
        return this.e;
    }

    public final void B(@fo.k String seq, @fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(seq, "seq");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!TextUtils.isEmpty(seq) && StringsKt.contains$default(seq, ",", false, 2, (Object) null) && StringsKt.contains$default(seq, ":", false, 2, (Object) null)) {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(this.a);
            List listSplit$default = StringsKt.split$default(seq, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add((String) StringsKt.split$default((String) it.next(), new String[]{":"}, false, 0, 6, (Object) null).get(0));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIndexOf = this.b.indexOf(ComicCategory.Companion.fake((String) it2.next()));
                if (iIndexOf >= 0) {
                    arrayListArrayListOf.add(this.b.get(iIndexOf));
                }
            }
            this.b.clear();
            this.b.addAll(arrayListArrayListOf);
            notifyDataSetChanged();
            callback.invoke();
        }
    }

    public final void C(@fo.l Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> function2) {
        this.f = function2;
    }

    public final void D(@fo.l Function0<Unit> function0) {
        this.d = function0;
    }

    public final void E(boolean z) {
        this.g = z;
    }

    public final void F(boolean z) {
        this.g = z;
    }

    public final void G(@fo.l Function1<? super List<l0>, Unit> function1) {
        this.e = function1;
    }

    public final void H(@fo.k List<ComicCategory> list) {
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
        return v(i);
    }

    public int getItemPosition(@fo.k Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        return -2;
    }

    @fo.k
    public CharSequence getPageTitle(int i) {
        String name = this.b.get(i).getName();
        String strB0 = v8.b0(name, 16);
        if (v8.K(name) <= 16) {
            Intrinsics.checkNotNull(strB0);
            return strB0;
        }
        return strB0 + "...";
    }

    public final void n(boolean z) {
        this.g = z;
        HashMap<String, b4> map = this.c;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, b4>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().S2(z);
            arrayList.add(Unit.INSTANCE);
        }
    }

    public final void o(@fo.k String cateId, @fo.k Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(cateId, "cateId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList<ComicCategory> arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (TextUtils.equals(cateId, ((ComicCategory) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(CollectionsKt.toSet(arrayList2));
        this.c.remove(cateId);
        notifyDataSetChanged();
        callback.invoke(Integer.valueOf(this.b.size()));
    }

    public final void p(@fo.k String cateId, @fo.k String name, @fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(cateId, "cateId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        for (ComicCategory comicCategory : this.b) {
            if (TextUtils.equals(comicCategory.getId(), cateId)) {
                comicCategory.setName(name);
                callback.invoke();
                return;
            }
        }
    }

    @fo.k
    public final ComicCategory q() {
        return this.a;
    }

    @fo.k
    public final ArrayList<ComicCategory> s() {
        return this.b;
    }

    @fo.l
    public final Function2<List<com.zentraedi.business.addfile.n>, List<com.zentraedi.business.addfile.n>, Unit> u() {
        return this.f;
    }

    @fo.k
    public final b4 v(int i) {
        String id2 = this.b.get(i).getId();
        b4 b4Var = this.c.get(id2);
        if (b4Var != null) {
            return b4Var;
        }
        b4 b4VarB = b4.a.b(b4.z, id2, false, Boolean.TRUE, 2, null);
        b4VarB.u3(this.d);
        b4VarB.t3(this.e);
        b4VarB.x3(this.f);
        this.c.put(id2, b4VarB);
        return b4VarB;
    }

    @fo.k
    public final HashMap<String, b4> w() {
        return this.c;
    }

    @fo.l
    public final Function0<Unit> x() {
        return this.d;
    }

    public final boolean z() {
        return this.g;
    }
}
