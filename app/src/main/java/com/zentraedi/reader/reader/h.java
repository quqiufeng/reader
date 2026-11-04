package com.zentraedi.reader.reader;

import com.zentraedi.basic.function.utils.j0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class h {
    public static final Class<?> a = h.class;
    public static final int b = 1;

    private static List<m> a(int i, List<m> list, int i2, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (j0.i(list) - 1 == i) {
            return d(list, arrayList);
        }
        arrayList.add(list.get(i).a());
        int i3 = 0;
        for (int i4 = i + 1; i4 < list.size(); i4++) {
            i3++;
            m mVarA = list.get(i4).a();
            if (!j(fVar, mVarA)) {
                i3 = 0;
            } else if (i3 == i2) {
                mVarA.u(true);
                i3 = 0;
            }
            arrayList.add(mVarA);
        }
        m mVar = (m) arrayList.get(arrayList.size() - 1);
        if (i3 == i2 && j(fVar, mVar)) {
            mVar.u(true);
        }
        arrayList.addAll(0, list.subList(0, i));
        return arrayList;
    }

    private static List<m> b(int i, List<m> list, int i2, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            return d(list, arrayList);
        }
        int i3 = 0;
        boolean z = false;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            i3++;
            m mVarA = list.get(i4).a();
            if (!j(fVar, mVarA)) {
                i3 = 0;
                z = false;
            } else if (z) {
                mVarA.u(true);
                z = false;
            }
            arrayList.add(0, mVarA);
            if (i3 == i2) {
                i3 = 0;
                z = true;
            }
        }
        arrayList.addAll(list.subList(i, list.size()));
        return arrayList;
    }

    private static int c(int i, int i2, List<m> list, int i3, List<m> list2) {
        if (list2 == null || j0.l(list2)) {
            return i3;
        }
        int i4 = i3;
        for (int i5 = 0; i5 < list2.size(); i5++) {
            m mVar = list2.get(i5);
            boolean z = mVar.l() == i && mVar.h() == i2;
            int iH = j0.l(list) ? mVar.h() : mVar.l() != list.get(list.size() - 1).l() ? 0 : list.get(list.size() - 1).h() + 1;
            mVar.v(iH);
            list.add(mVar);
            if (mVar.s()) {
                mVar.u(false);
                list.add(e(mVar.l() != list.get(list.size() - 1).l() ? 0 : list.get(list.size() - 1).h() + 1, mVar.k(), mVar.l(), mVar.p(), mVar.m(), mVar.f(), mVar.n()));
            }
            if (z) {
                i4 = iH;
            }
        }
        return i4;
    }

    private static List<m> d(List<m> list, List<m> list2) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i).a());
        }
        return list2;
    }

    public static m e(int i, k kVar, int i2, int i3, int i4, int i5, int i6) {
        m mVarA = new m.b().j(i).e(new ArrayList()).l(kVar).m(i2).p(i3).c(false).n(i4).d(i4).h(i5).o(1).a();
        mVarA.x(i6);
        return mVarA;
    }

    public static int f(int i, int i2, List<m> list, int i3) {
        if (!j0.l(list)) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (list.get(i4).l() == i && list.get(i4).h() == i2) {
                    return i4;
                }
            }
        }
        return i3;
    }

    private static List<m> g(List<m> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            m mVar = list.get(i);
            mVar.v(j0.l(arrayList) ? mVar.h() : ((m) arrayList.get(arrayList.size() - 1)).h() + 1);
            arrayList.add(mVar);
            if (mVar.s()) {
                mVar.u(false);
                arrayList.add(e(((m) arrayList.get(arrayList.size() - 1)).h() + 1, mVar.k(), mVar.l(), mVar.p(), mVar.m(), mVar.f(), mVar.n()));
            }
        }
        return arrayList;
    }

    public static void h(int i, a aVar, i iVar, int i2, f fVar) {
        int i3;
        if (aVar == null || iVar == null) {
            return;
        }
        List<m> data = aVar.getData();
        int iL = ((m) j0.j(data, j0.i(data) - 1)).l();
        if (iL - i >= 1) {
            return;
        }
        List<m> listD = iVar.d(iL + 1);
        if (j0.l(listD)) {
            return;
        }
        if (j(fVar, listD.get(0)) && i2 > 0) {
            if (j(fVar, (m) j0.j(data, j0.i(data) - 1))) {
                int size = data.size() - 1;
                i3 = 0;
                while (size >= 0) {
                    int i4 = i3 + 1;
                    if (data.get(size).o() == 1) {
                        break;
                    }
                    size--;
                    i3 = i4;
                }
            } else {
                i3 = 0;
            }
            ArrayList arrayList = new ArrayList();
            if (i3 > i2) {
                i3 = 0;
            }
            for (int i5 = 0; i5 < listD.size(); i5++) {
                i3++;
                m mVarA = listD.get(i5).a();
                if (i3 == i2) {
                    mVarA.u(true);
                    i3 = 0;
                }
                arrayList.add(mVarA);
            }
            if (i3 == i2) {
                ((m) arrayList.get(arrayList.size() - 1)).u(true);
            }
            listD = g(arrayList);
        }
        aVar.f(aVar.getItemCount(), listD);
    }

    public static void i(int i, a aVar, i iVar, int i2, f fVar) {
        int i3;
        boolean z;
        if (aVar == null || iVar == null) {
            return;
        }
        List<m> data = aVar.getData();
        int iL = data.get(0).l();
        if (i - iL >= 1) {
            return;
        }
        List<m> listD = iVar.d(iL - 1);
        if (j0.l(listD)) {
            return;
        }
        if (j(fVar, listD.get(0)) && i2 > 0) {
            if (j(fVar, data.get(0))) {
                int i4 = 0;
                i3 = 0;
                while (i4 < data.size()) {
                    int i5 = i3 + 1;
                    if (data.get(i4).o() == 1) {
                        break;
                    }
                    i4++;
                    i3 = i5;
                }
            } else {
                i3 = 0;
            }
            ArrayList arrayList = new ArrayList();
            if (i3 > i2) {
                i3 = 0;
                z = false;
            } else if (i3 == i2) {
                i3 = 0;
                z = true;
            } else {
                z = false;
            }
            for (int size = listD.size() - 1; size >= 0; size--) {
                i3++;
                m mVarA = listD.get(size).a();
                if (z) {
                    mVarA.u(true);
                    z = false;
                }
                arrayList.add(0, mVarA);
                if (i3 == i2) {
                    i3 = 0;
                    z = true;
                }
            }
            listD = g(arrayList);
        }
        aVar.f(0, listD);
    }

    private static boolean j(f fVar, m mVar) {
        return fVar.j(mVar.l());
    }

    public static int k(int i, int i2, List<m> list, List<m> list2, int i3, f fVar) {
        if (i3 <= 0) {
            return -1;
        }
        int iF = f(i, i2, list, 0);
        return c(i, i2, list2, -1, new ArrayList(b(iF, a(iF, list, i3, fVar), i3, fVar)));
    }
}
