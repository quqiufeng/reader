package com.zentraedi.comic.business;

import android.app.Activity;
import android.view.View;
import com.zentraedi.business.operationpopup.OperationItemViewModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class v {
    private int a;

    @fo.l
    private com.zentraedi.business.operationpopup.b b;

    private final void a(List<? extends OperationItemViewModel> list, int i) {
        int i2 = 0;
        for (OperationItemViewModel operationItemViewModel : list) {
            int i3 = i2 + 1;
            if (i2 == i) {
                operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Jk));
            } else {
                operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Ok));
            }
            i2 = i3;
        }
    }

    private final int c(Activity activity, int i) {
        return com.zentraedi.basic.function.utils.k0.a(activity, (i * 60) + 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(v vVar, Activity activity, View view, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        vVar.d(activity, view, str2, i3, function0);
    }

    public final void b() {
        com.zentraedi.business.operationpopup.b bVar = this.b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void d(@fo.l Activity activity, @fo.l View view, @fo.k String title, int i, @fo.l Function0<? extends List<? extends OperationItemViewModel>> function0) {
        List<? extends OperationItemViewModel> listInvoke;
        Intrinsics.checkNotNullParameter(title, "title");
        if (activity == null || view == null) {
            return;
        }
        this.a = 0;
        if (function0 == null || (listInvoke = function0.invoke()) == null) {
            return;
        }
        com.zentraedi.business.operationpopup.d dVar = new com.zentraedi.business.operationpopup.d();
        com.zentraedi.business.operationpopup.c cVar = new com.zentraedi.business.operationpopup.c();
        cVar.U1(listInvoke);
        dVar.N(cVar);
        dVar.navTitle.set(title);
        a(listInvoke, i);
        dVar.O(c(activity, this.a));
        com.zentraedi.business.operationpopup.b bVar = new com.zentraedi.business.operationpopup.b(activity, dVar);
        this.b = bVar;
        bVar.k();
        com.zentraedi.business.operationpopup.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.e(view);
        }
    }
}
