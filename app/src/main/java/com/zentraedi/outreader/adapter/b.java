package com.zentraedi.outreader.adapter;

import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class b extends n0 {
    private final List<Fragment> j;
    private final List<String> k;

    public b(FragmentManager fm) {
        super(fm);
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    public int getCount() {
        return this.j.size();
    }

    @androidx.annotation.n0
    public Fragment getItem(int i) {
        return this.j.get(i);
    }

    @p0
    public CharSequence getPageTitle(int position) {
        if (position < this.k.size()) {
            return this.k.get(position);
        }
        return null;
    }

    public void o(List<Fragment> fragments) {
        if (fragments != null) {
            this.j.addAll(fragments);
        }
    }

    public void p(List<String> titles) {
        if (titles != null) {
            this.k.addAll(titles);
        }
    }

    public b(FragmentManager fragmentManager, List<Fragment> fragments, List<String> titles) {
        super(fragmentManager);
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.k = arrayList2;
        if (fragments != null) {
            arrayList.addAll(fragments);
        }
        if (titles != null) {
            arrayList2.addAll(titles);
        }
    }
}
