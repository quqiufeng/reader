package com.zentraedi.reader.event;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class a {
    private final SparseArray<List<e>> a;

    private static class b {
        public static final a a = new a();

        private b() {
        }
    }

    public static a a() {
        return b.a;
    }

    public void b(c cVar) {
        List<e> list;
        if (cVar == null || (list = this.a.get(cVar.c)) == null) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            it.next().onEvent(cVar);
        }
    }

    public void c(int i, e eVar) {
        if (eVar == null) {
            return;
        }
        List<e> arrayList = this.a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(i, arrayList);
        }
        if (arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
    }

    public void d(int i, e eVar) {
        List<e> list;
        if (eVar == null || (list = this.a.get(i)) == null) {
            return;
        }
        list.remove(eVar);
    }

    private a() {
        this.a = new SparseArray<>();
    }
}
