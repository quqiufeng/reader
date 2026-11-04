package com.zentraedi.reader.reader;

import android.util.SparseArray;
import com.zentraedi.basic.function.utils.j0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class i {
    private final e a;
    private SparseArray<List<m>> b;

    public i(e eVar) {
        this.a = eVar;
    }

    private void b(int i, int i2) {
        List<m> listZ;
        if (this.b == null) {
            this.b = new SparseArray<>();
        }
        if (this.a == null) {
            return;
        }
        if (this.b.get(i) == null && (listZ = this.a.z(i)) != null) {
            this.b.put(i, listZ);
        }
        if (i2 < 1) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            int i5 = i4 + 1;
            if (this.a.s(i4) && this.b.get(i5) == null) {
                List<m> listZ2 = this.a.z(i5);
                if (listZ2 != null) {
                    this.b.put(i5, listZ2);
                } else {
                    this.a.x(i4);
                }
            }
            int i6 = i - i3;
            int i7 = i6 - 1;
            if (this.a.t(i6) && this.b.get(i7) == null) {
                List<m> listZ3 = this.a.z(i7);
                if (listZ3 != null) {
                    this.b.put(i7, listZ3);
                } else {
                    this.a.y(i6);
                }
            }
        }
    }

    private List<m> f(List<m> list, int i, int i2) {
        List<m> list2;
        List<m> listH;
        List<m> list3;
        List<m> listH2;
        List<m> listH3;
        ArrayList arrayList = new ArrayList();
        List<m> list4 = this.b.get(i);
        if (list4 != null && list4.size() != 0) {
            if (list != null && !j0.l(list) && (listH3 = h(list, i)) != null && !j0.l(listH3)) {
                list4 = listH3;
            }
            arrayList.addAll(list4);
            for (int i3 = i + 1; i3 <= i2 + i && (list3 = this.b.get(i3)) != null; i3++) {
                if (list != null && !j0.l(list) && (listH2 = h(list, i3)) != null && !j0.l(listH2)) {
                    list3 = listH2;
                }
                arrayList.addAll(list3);
            }
            for (int i4 = i - 1; i4 >= i - i2 && (list2 = this.b.get(i4)) != null; i4--) {
                if (list != null && !j0.l(list) && (listH = h(list, i4)) != null && !j0.l(listH)) {
                    list2 = listH;
                }
                arrayList.addAll(0, list2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    private List<m> h(List<m> list, int i) {
        int size;
        if (j0.l(list)) {
            return null;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                i2 = -1;
                break;
            }
            if (list.get(i2).l() == i) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get((list.size() - 1) - i3).l() == i) {
                size = (list.size() - 1) - i3;
                if (size == -1) {
                    return null;
                }
                return j0.o(list, i2, size + 1);
            }
        }
        size = -1;
        if (size == -1) {
            return null;
        }
        return j0.o(list, i2, size + 1);
    }

    private void k(int i, int i2) {
        if (this.b == null) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        int i3 = i - i2;
        for (int i4 = 0; i4 < (i2 * 2) + 1; i4++) {
            int i5 = i3 + i4;
            List<m> list = this.b.get(i5);
            if (list != null) {
                sparseArray.put(i5, list);
            }
        }
        this.b.clear();
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            int iKeyAt = sparseArray.keyAt(i6);
            this.b.put(iKeyAt, (List) sparseArray.get(iKeyAt));
        }
    }

    public void a(int i) {
        nd.a.e("nas_book", "PageViewCache->cachePages section=" + i);
        b(i, 2);
    }

    public void c() {
        SparseArray<List<m>> sparseArray = this.b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
    }

    public List<m> d(int i) {
        return this.b.get(i);
    }

    public List<m> e(List<m> list, int i) {
        return f(list, i, 2);
    }

    public int g(int i, int i2) {
        return this.a.k(i, i2, this.b.get(i));
    }

    public boolean i(int i) {
        return !j0.l(this.b.get(i));
    }

    public void j(int i) {
        SparseArray<List<m>> sparseArray = this.b;
        if (sparseArray != null && sparseArray.get(i) != null) {
            this.b.remove(i);
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i);
        }
    }
}
