package com.zentraedi.comic.manager;

import android.app.Activity;
import com.zentraedi.basic.component.networkmonitor.NetWorkState;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.model.BasicFileInterface;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.widget.n2;
import com.zentraedi.comic.business.p;
import com.zentraedi.comic.business.u;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.q;
import fo.k;
import fo.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDownloadManager {

    @k
    public static final a c = new a(null);

    @l
    private static ComicDownloadManager d = null;

    @k
    private static final String e = "ComicDownloadManager";

    @k
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: hg.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicDownloadManager.o();
        }
    });

    @k
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: hg.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicDownloadManager.n();
        }
    });

    public static final class ComicFileInfo extends BaseModel implements BasicFileInterface {
        private boolean isFolder;

        @l
        private String path;

        @k
        public String getId() {
            String str = this.path;
            return str == null ? "" : str;
        }

        public int getIsDir() {
            return this.isFolder ? 1 : 0;
        }

        @k
        public String getName() {
            String strR = l5.r(this.path);
            Intrinsics.checkNotNullExpressionValue(strR, "getFileName(...)");
            return strR;
        }

        @l
        public final String getPath() {
            return this.path;
        }

        public final boolean isFolder() {
            return this.isFolder;
        }

        public final void setFolder(boolean z) {
            this.isFolder = z;
        }

        public final void setPath(@l String str) {
            this.path = str;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final ComicDownloadManager a() {
            if (ComicDownloadManager.d == null) {
                ComicDownloadManager.d = new ComicDownloadManager();
            }
            ComicDownloadManager comicDownloadManager = ComicDownloadManager.d;
            Intrinsics.checkNotNull(comicDownloadManager, "null cannot be cast to non-null type com.zentraedi.comic.manager.ComicDownloadManager");
            return comicDownloadManager;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(ComicDownloadManager comicDownloadManager, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        comicDownloadManager.h(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(List list, ComicDownloadManager comicDownloadManager, ComicInfoModel comicInfoModel) {
        boolean zC;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            BasicFileInterface basicFileInterface = (BasicFileInterface) it.next();
            if (basicFileInterface.getIsDir() == 1) {
                p pVarL = comicDownloadManager.l();
                String id2 = basicFileInterface.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                zC = pVarL.d(id2, comicInfoModel);
            } else {
                p pVarL2 = comicDownloadManager.l();
                String id3 = basicFileInterface.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                zC = pVarL2.c(id3, comicInfoModel);
            }
            if (zC) {
                z = true;
            }
        }
        if (z) {
            n2.g(com.zentraedi.basic.function.utils.a.n(q.C0124q.Vj4), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(List list, ComicDownloadManager comicDownloadManager, Function1 function1) {
        boolean zC;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (!j0.l((List) pair.getSecond())) {
                for (BasicFileInterface basicFileInterface : (List) pair.getSecond()) {
                    if (basicFileInterface.getIsDir() == 1) {
                        p pVarL = comicDownloadManager.l();
                        String id2 = basicFileInterface.getId();
                        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                        zC = pVarL.d(id2, (ComicInfoModel) pair.getFirst());
                    } else {
                        p pVarL2 = comicDownloadManager.l();
                        String id3 = basicFileInterface.getId();
                        Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                        zC = pVarL2.c(id3, (ComicInfoModel) pair.getFirst());
                    }
                    if (zC) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            n2.g(com.zentraedi.basic.function.utils.a.n(q.C0124q.Vj4), 3);
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    private final p l() {
        return (p) this.b.getValue();
    }

    private final u m() {
        return (u) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p n() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u o() {
        return new u();
    }

    public final void g(@k final ComicInfoModel comicModel, @k final List<? extends BasicFileInterface> files) {
        Intrinsics.checkNotNullParameter(comicModel, "comicModel");
        Intrinsics.checkNotNullParameter(files, "files");
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (com.zentraedi.business.permission.a.d(activityE, com.zentraedi.business.permission.a.i)) {
            if (j0.l(files)) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(q.C0124q.XJ), false);
                return;
            }
            com.zentraedi.business.listener.l lVar = new com.zentraedi.business.listener.l() { // from class: hg.b
                public final void continueDo() {
                    ComicDownloadManager.j(files, this, comicModel);
                }
            };
            if (com.zentraedi.basic.function.utils.a.h().i() == NetWorkState.WIFI) {
                u uVarM = m();
                Intrinsics.checkNotNull(activityE);
                uVarM.e(activityE, lVar);
            } else {
                u uVarM2 = m();
                Intrinsics.checkNotNull(activityE);
                uVarM2.h(activityE, lVar);
            }
        }
    }

    public final void h(@k final List<? extends Pair<ComicInfoModel, ? extends List<? extends BasicFileInterface>>> list, @l final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "list");
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (!com.zentraedi.business.permission.a.d(activityE, com.zentraedi.business.permission.a.i)) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        com.zentraedi.business.listener.l lVar = new com.zentraedi.business.listener.l() { // from class: hg.a
            public final void continueDo() {
                ComicDownloadManager.k(list, this, function1);
            }
        };
        if (com.zentraedi.basic.function.utils.a.h().i() == NetWorkState.WIFI) {
            u uVarM = m();
            Intrinsics.checkNotNull(activityE);
            uVarM.e(activityE, lVar);
        } else {
            u uVarM2 = m();
            Intrinsics.checkNotNull(activityE);
            uVarM2.h(activityE, lVar);
        }
    }
}
