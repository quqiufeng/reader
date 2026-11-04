package com.zentraedi.outreader.adapter;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class i extends androidx.viewpager2.adapter.a {

    @fo.k
    private final List<String> m;

    @fo.k
    private final List<Fragment> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@fo.k Fragment fm) {
        super(fm);
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.m = CollectionsKt.listOf((Object[]) new String[]{com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UA2), "书签"});
        this.n = new ArrayList();
    }

    @fo.k
    public Fragment F(int i) {
        Fragment fragment = (Fragment) CollectionsKt.getOrNull(this.n, i);
        if (fragment != null) {
            return fragment;
        }
        if (i == 0) {
            Fragment fragmentA = com.zentraedi.outreader.fragment.f.w.a();
            this.n.add(0, fragmentA);
            return fragmentA;
        }
        Fragment fragmentA2 = com.zentraedi.outreader.v2.fragment.h.q.a();
        this.n.add(i, fragmentA2);
        return fragmentA2;
    }

    @fo.l
    public final com.zentraedi.outreader.v2.fragment.h Z() {
        Object orNull = CollectionsKt.getOrNull(this.n, 1);
        if (orNull instanceof com.zentraedi.outreader.v2.fragment.h) {
            return (com.zentraedi.outreader.v2.fragment.h) orNull;
        }
        return null;
    }

    @fo.l
    public final com.zentraedi.outreader.fragment.f a0() {
        Object orNull = CollectionsKt.getOrNull(this.n, 0);
        if (orNull instanceof com.zentraedi.outreader.fragment.f) {
            return (com.zentraedi.outreader.fragment.f) orNull;
        }
        return null;
    }

    @fo.k
    public final List<String> b0() {
        return this.m;
    }

    public int getItemCount() {
        return this.m.size();
    }
}
