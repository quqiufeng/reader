package com.zentraedi.outreader.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class j extends n0 {

    @fo.k
    private String[] j;

    @fo.k
    private final List<Fragment> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@fo.k FragmentManager fm) {
        super(fm);
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.j = new String[]{com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UA2), com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.IG)};
        this.k = new ArrayList();
    }

    public void destroyItem(@fo.k View container, int i, @fo.k Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
    }

    public int getCount() {
        return this.j.length;
    }

    @fo.k
    public Fragment getItem(int i) {
        Fragment fragment = (Fragment) CollectionsKt.getOrNull(this.k, i);
        if (fragment != null) {
            return fragment;
        }
        if (i == 0) {
            Fragment fragmentA = com.zentraedi.outreader.fragment.f.w.a();
            this.k.add(0, fragmentA);
            return fragmentA;
        }
        Fragment fragmentA2 = com.zentraedi.outreader.v2.fragment.h.q.a();
        this.k.add(i, fragmentA2);
        return fragmentA2;
    }

    public int getItemPosition(@fo.k Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        return -2;
    }

    @fo.k
    public CharSequence getPageTitle(int i) {
        String str = this.j[i];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    @fo.k
    public Object instantiateItem(@fo.k ViewGroup container, int i) {
        Intrinsics.checkNotNullParameter(container, "container");
        Object objInstantiateItem = super.instantiateItem(container, i);
        Intrinsics.checkNotNullExpressionValue(objInstantiateItem, "instantiateItem(...)");
        return objInstantiateItem;
    }

    @fo.l
    public final com.zentraedi.outreader.v2.fragment.h o() {
        Object orNull = CollectionsKt.getOrNull(this.k, 1);
        if (orNull instanceof com.zentraedi.outreader.v2.fragment.h) {
            return (com.zentraedi.outreader.v2.fragment.h) orNull;
        }
        return null;
    }

    @fo.l
    public final com.zentraedi.outreader.fragment.f p() {
        Object orNull = CollectionsKt.getOrNull(this.k, 0);
        if (orNull instanceof com.zentraedi.outreader.fragment.f) {
            return (com.zentraedi.outreader.fragment.f) orNull;
        }
        return null;
    }

    @fo.k
    public final String[] q() {
        return this.j;
    }

    public final void s(@fo.k String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.j = strArr;
    }

    public void destroyItem(@fo.k ViewGroup container, int i, @fo.k Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
    }
}
