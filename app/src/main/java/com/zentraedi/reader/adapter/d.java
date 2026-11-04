package com.zentraedi.reader.adapter;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class d implements b {
    private final List<b> a = new ArrayList();

    @Override // com.zentraedi.reader.adapter.b
    public e a(int i, Context context, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVarA = this.a.get(i2).a(i, context, cVar, dVar);
            if (eVarA != null) {
                return eVarA;
            }
        }
        nd.a.h(com.zentraedi.reader.f.a, " no type match type: " + i);
        return null;
    }

    public void b(b bVar) {
        if (bVar == null || this.a.contains(bVar)) {
            return;
        }
        this.a.add(bVar);
    }

    public void c() {
        this.a.clear();
    }

    public void d(b bVar) {
        if (bVar == null) {
            return;
        }
        this.a.remove(bVar);
    }
}
