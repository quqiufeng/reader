package com.zentraedi.outreader.business;

import android.app.Activity;
import android.view.View;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.business.interval.IntervalViewModel;
import com.zentraedi.business.operationpopup.OperationItemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class c {
    public static int c = 0;
    public static int d = 1;
    public static int e = 2;
    public static int f = 3;
    public static int g = 4;
    private com.zentraedi.business.operationpopup.b a;
    private b b;

    class a implements View.OnClickListener {
        final /* synthetic */ int a;

        a(final int val$index) {
            this.a = val$index;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (c.this.b != null) {
                c.this.b.complete(this.a);
            }
            c.this.a.b();
        }
    }

    public interface b {
        void complete(int index);
    }

    private void c(OperationItemViewModel vm, final int index) {
        vm.itemOnClickListener = new a(index);
    }

    private OperationItemViewModel d() {
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.OA2));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.hf));
        c(operationItemViewModel, d);
        return operationItemViewModel;
    }

    private OperationItemViewModel e() {
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Wx));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.jn));
        c(operationItemViewModel, f);
        return operationItemViewModel;
    }

    private OperationItemViewModel f() {
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.WB));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.Dn));
        c(operationItemViewModel, g);
        return operationItemViewModel;
    }

    private int g(Activity activity, int listCount) {
        return k0.a(activity, (listCount * 60) + 62);
    }

    private OperationItemViewModel h() {
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.iL));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.iE));
        c(operationItemViewModel, e);
        return operationItemViewModel;
    }

    private OperationItemViewModel i() {
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.wA));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.oE));
        c(operationItemViewModel, c);
        return operationItemViewModel;
    }

    private List<OperationItemViewModel> j(String from, boolean isAddShelf) {
        ArrayList arrayList = new ArrayList();
        new OperationItemViewModel().setViewType(OperationItemViewModel.LIGHT_SEPARATE_LINE);
        if ("FILE_MANAGE".equals(from)) {
            arrayList.add(i());
            arrayList.add(e());
            arrayList.add(f());
            return arrayList;
        }
        if ("BOOK_LIB".equals(from)) {
            return arrayList;
        }
        "BOOK_SHELF".equals(from);
        return arrayList;
    }

    public void k(b listener) {
        this.b = listener;
    }

    public void l(Activity activity, View rootView, String from, boolean isAddShelf) {
        new IntervalViewModel().setViewType(OperationItemViewModel.LIGHT_SEPARATE_LINE);
        List<OperationItemViewModel> listJ = j(from, isAddShelf);
        com.zentraedi.business.operationpopup.d dVar = new com.zentraedi.business.operationpopup.d();
        com.zentraedi.business.operationpopup.c cVar = new com.zentraedi.business.operationpopup.c();
        cVar.U1(listJ);
        dVar.N(cVar);
        dVar.navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.pA2));
        dVar.O(g(activity, listJ.size()));
        com.zentraedi.business.operationpopup.b bVar = new com.zentraedi.business.operationpopup.b(activity, dVar);
        this.a = bVar;
        bVar.e(rootView);
    }
}
