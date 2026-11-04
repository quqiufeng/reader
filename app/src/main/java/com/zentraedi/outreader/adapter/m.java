package com.zentraedi.outreader.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class m extends b {
    public m(FragmentManager fm) {
        super(fm);
        s();
        q(fm);
    }

    private void q(FragmentManager fm) {
        com.zentraedi.outreader.fragment.f fVarD3 = null;
        if (fm != null) {
            fm.N0();
            if (fm.N0().size() > 0) {
                for (Fragment fragment : fm.N0()) {
                    if (fragment instanceof com.zentraedi.outreader.fragment.f) {
                        fVarD3 = (com.zentraedi.outreader.fragment.f) fragment;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (fVarD3 == null) {
            fVarD3 = com.zentraedi.outreader.fragment.f.d3();
        }
        arrayList.add(fVarD3);
        o(arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UA2));
        arrayList.add("书签");
        p(arrayList);
    }
}
