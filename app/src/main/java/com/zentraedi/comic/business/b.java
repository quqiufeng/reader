package com.zentraedi.comic.business;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.zentraedi.business.FileConstant;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.v8;
import com.zentraedi.business.utils.x4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicAddContentBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicAddContentBusiness.kt\ncom/zentraedi/comic/business/ComicAddContentBusiness\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FilePathConvertUtils.kt\ncom/zentraedi/business/utils/FilePathConvertUtils$Companion\n*L\n1#1,68:1\n1617#2,9:69\n1869#2:78\n1870#2:80\n1626#2:81\n1563#2:82\n1634#2,2:83\n1636#2:86\n1#3:79\n1#3:85\n586#4:87\n*S KotlinDebug\n*F\n+ 1 ComicAddContentBusiness.kt\ncom/zentraedi/comic/business/ComicAddContentBusiness\n*L\n52#1:69,9\n52#1:78\n52#1:80\n52#1:81\n54#1:82\n54#1:83,2\n54#1:86\n52#1:79\n65#1:87\n*E\n"})
public final class b {

    @fo.l
    private Function0<Unit> a;

    @fo.k
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.d(this.a);
        }
    });

    public static final class a implements com.zentraedi.business.fileselect.f0.k {
        a() {
        }

        public void a(com.zentraedi.business.fileselect.f0 f0Var, List<String> list) {
        }

        public void onDismiss(androidx.fragment.app.m mVar) {
        }

        public void onSuccess(List<FileInfoModel> list) {
            Function0 function0 = b.this.a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    private final com.zentraedi.business.fileselect.s c() {
        return (com.zentraedi.business.fileselect.s) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.fileselect.s d(b bVar) {
        com.zentraedi.business.fileselect.s sVar = new com.zentraedi.business.fileselect.s();
        sVar.L0(bVar.new a());
        return sVar;
    }

    private final String e(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        String strS = v8.S(x4.g(str));
        d5.a aVar = d5.a;
        Intrinsics.checkNotNull(strS);
        return aVar.z(strS.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(b bVar, FragmentActivity fragmentActivity, View view, String str, List list, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        bVar.f(fragmentActivity, view, str2, list, function0);
    }

    public final void f(@fo.k FragmentActivity activity, @fo.k View view, @fo.l String str, @fo.k List<String> selectedList, @fo.k Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
        re.a.a.d(str);
        c().f0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Lt2));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = selectedList.iterator();
        while (it.hasNext()) {
            String strE = e((String) it.next());
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        List<String> listDistinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        for (String str2 : listDistinct) {
            FileInfoModel fileInfoModel = new FileInfoModel();
            fileInfoModel.setPath(str2);
            arrayList2.add(fileInfoModel);
        }
        c().U0(new com.zentraedi.business.fileselect.s.a().b(activity).Y(view).a(FileConstant.DialogOptionActionType.COMIC_ADD_RESOURCE).X(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.YO0)).z((String) null).A((String) null).x(0).W((String) null).y((String) null).R(arrayList2));
    }
}
