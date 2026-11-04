package com.zentraedi.comic.impl;

import android.app.Activity;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.database.ComicLibCategoryEntity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.p7;
import com.zentraedi.comic.activity.OfflineComicDetailActivity;
import com.zentraedi.comic.activity.OfflineComicMainActivity;
import com.zentraedi.comic.business.t2;
import com.zentraedi.comic.fragment.e2;
import com.zentraedi.comic.viewmodel.d3;
import com.zentraedi.comic.viewmodel.i6;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nOfflineComicListImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineComicListImpl.kt\ncom/zentraedi/comic/impl/OfflineComicListImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n*S KotlinDebug\n*F\n+ 1 OfflineComicListImpl.kt\ncom/zentraedi/comic/impl/OfflineComicListImpl\n*L\n115#1:141\n115#1:142,2\n*E\n"})
public final class p extends j {

    @fo.l
    private String k;

    @fo.l
    private WeakReference<t2> l;

    @fo.l
    private WeakReference<d3> m;

    @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicListImpl$loadData$callback$1$1", f = "OfflineComicListImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ e2.b b;
        final /* synthetic */ ArrayList<i6> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e2.b bVar, ArrayList<i6> arrayList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = bVar;
            this.c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e2.b bVar = this.b;
            if (bVar != null) {
                ArrayList<i6> arrayList = this.c;
                Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.zentraedi.business.addfile.EditableNasItemViewModel>");
                bVar.onResult(arrayList);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class b implements Comparator<ReadingRecord> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ReadingRecord readingRecord, ReadingRecord readingRecord2) {
            String comicFileName;
            String comicFileName2;
            p7 p7Var = p7.a;
            String str = "";
            if (readingRecord == null || (comicFileName = readingRecord.getComicFileName()) == null) {
                comicFileName = "";
            }
            if (readingRecord2 != null && (comicFileName2 = readingRecord2.getComicFileName()) != null) {
                str = comicFileName2;
            }
            return p7Var.a(comicFileName, str);
        }
    }

    public p(int i) {
        super(i);
    }

    private final ComicInfoModel U(ReadingRecord readingRecord) {
        ComicCategory comicCategory = new ComicCategory();
        comicCategory.setId(readingRecord.getCateId());
        List<ComicLibCategoryEntity> listA = OfflineComicMainActivity.d0.a();
        if (listA != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (Intrinsics.areEqual(((ComicLibCategoryEntity) obj).getCategoryId(), readingRecord.getCateId())) {
                    arrayList.add(obj);
                }
            }
            if (j0.l(arrayList)) {
                comicCategory.setName("");
            } else {
                comicCategory.setName(((ComicLibCategoryEntity) arrayList.get(0)).getName());
            }
        }
        ComicDirModel comicDirModel = new ComicDirModel();
        comicDirModel.setCategory(comicCategory);
        ComicInfoModel comicInfoModel = new ComicInfoModel();
        comicInfoModel.setDir(comicDirModel);
        comicInfoModel.setCover(readingRecord.getComicThumb());
        comicInfoModel.setOnShelf(0);
        comicInfoModel.setName(readingRecord.getComicFileName());
        comicInfoModel.setPath(com.zentraedi.comic.util.f.a.h(readingRecord.getComicId(), readingRecord.getComicNasPath()));
        String progress = readingRecord.getProgress();
        comicInfoModel.setProgress(progress != null ? progress : "");
        comicInfoModel.setId(readingRecord.getComicId());
        return comicInfoModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(String str, p pVar, e2.b bVar, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            List<ReadingRecord> list2 = CollectionsKt.toList(list);
            b bVar2 = new b();
            if (Intrinsics.areEqual(str, "asc")) {
                Collections.sort(list2, bVar2);
            } else {
                Collections.sort(list2, Collections.reverseOrder(bVar2));
            }
            for (ReadingRecord readingRecord : list2) {
                if (readingRecord.getComicPath() != null && readingRecord.getLocalDownload()) {
                    File file = new File(com.zentraedi.comic.util.f.a.h(readingRecord.getComicId(), readingRecord.getComicNasPath()));
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] fileArrListFiles = file.listFiles();
                            if ((fileArrListFiles != null ? fileArrListFiles.length : 0) == 0) {
                            }
                        }
                        i6 i6VarO = pVar.o(pVar.U(readingRecord));
                        arrayList.add(i6VarO);
                        i6VarO.o0().set(0);
                    }
                }
            }
        }
        kotlinx.coroutines.i.e(a2.a, g1.e(), (CoroutineStart) null, new a(bVar, arrayList, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.comic.impl.j
    public void G(int i, @fo.k ComicInfoModel comic) {
        Intrinsics.checkNotNullParameter(comic, "comic");
        OfflineComicDetailActivity.a aVar = OfflineComicDetailActivity.f0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.a(activityE, comic.getPath(), comic, comic.getPath());
    }

    @fo.l
    public final String V() {
        return this.k;
    }

    @fo.l
    public final WeakReference<t2> W() {
        return this.l;
    }

    @fo.l
    public final WeakReference<d3> X() {
        return this.m;
    }

    public final void Z(@fo.l String str) {
        this.k = str;
    }

    @Override // com.zentraedi.comic.impl.j, com.zentraedi.comic.fragment.e2.a
    public void a(@fo.l WeakReference<e2> weakReference) {
        d3 d3Var;
        e2 e2Var;
        t2 t2Var;
        t2 t2Var2;
        super.a(weakReference);
        WeakReference<d3> weakReference2 = this.m;
        if (weakReference2 == null || (d3Var = weakReference2.get()) == null || weakReference == null || (e2Var = weakReference.get()) == null) {
            return;
        }
        int size = e2Var.f3().d().size();
        WeakReference<t2> weakReference3 = this.l;
        if (weakReference3 != null && (t2Var2 = weakReference3.get()) != null) {
            t2Var2.m(d3Var, size);
        }
        WeakReference<t2> weakReference4 = this.l;
        if (weakReference4 == null || (t2Var = weakReference4.get()) == null) {
            return;
        }
        t2Var.o(e2Var.f3().d());
    }

    public final void a0(@fo.l WeakReference<t2> weakReference) {
        t2 t2Var;
        WeakReference<d3> weakReference2;
        d3 d3Var;
        this.l = weakReference;
        if (weakReference == null || (t2Var = weakReference.get()) == null || (weakReference2 = this.m) == null || (d3Var = weakReference2.get()) == null) {
            return;
        }
        t2Var.d(d3Var, null, x());
    }

    public final void b0(@fo.l WeakReference<d3> weakReference) {
        this.m = weakReference;
    }

    @Override // com.zentraedi.comic.fragment.e2.a
    public void c(int i, @fo.l String str, @fo.l final String str2, @fo.l final e2.b bVar) {
        String str3;
        if (i != 0) {
            if (bVar != null) {
                bVar.onResult(null);
                return;
            }
            return;
        }
        Function1<? super List<ReadingRecord>, Unit> function1 = new Function1() { // from class: com.zentraedi.comic.impl.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.Y(str2, this, bVar, (List) obj);
            }
        };
        if (Intrinsics.areEqual(this.k, "0") || (str3 = this.k) == null) {
            ig.k.a.m(function1);
            return;
        }
        ig.k kVar = ig.k.a;
        Intrinsics.checkNotNull(str3);
        kVar.v(str3, function1);
    }
}
