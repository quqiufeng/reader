package com.zentraedi.comic.impl;

import android.text.TextUtils;
import androidx.databinding.ObservableField;
import com.google.gson.Gson;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.business.l2;
import com.zentraedi.comic.fragment.e2;
import com.zentraedi.comic.model.ComicListModel;
import com.zentraedi.comic.request.ComicShelfRequest;
import com.zentraedi.comic.viewmodel.d3;
import com.zentraedi.comic.viewmodel.i6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHomeDetailListImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHomeDetailListImpl.kt\ncom/zentraedi/comic/impl/ComicHomeDetailListImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1563#2:155\n1634#2,2:156\n774#2:158\n865#2,2:159\n1636#2:161\n*S KotlinDebug\n*F\n+ 1 ComicHomeDetailListImpl.kt\ncom/zentraedi/comic/impl/ComicHomeDetailListImpl\n*L\n128#1:155\n128#1:156,2\n130#1:158\n130#1:159,2\n128#1:161\n*E\n"})
public final class m extends j {

    @fo.k
    private final Lazy k;

    @fo.l
    private WeakReference<d3> l;

    @fo.l
    private ObservableField<Integer> m;

    @SourceDebugExtension({"SMAP\nComicHomeDetailListImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHomeDetailListImpl.kt\ncom/zentraedi/comic/impl/ComicHomeDetailListImpl$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1869#2,2:155\n1869#2,2:157\n*S KotlinDebug\n*F\n+ 1 ComicHomeDetailListImpl.kt\ncom/zentraedi/comic/impl/ComicHomeDetailListImpl$loadData$1\n*L\n114#1:155,2\n106#1:157,2\n*E\n"})
    public static final class a extends com.zentraedi.business.http.b<ComicListModel> {
        final /* synthetic */ int a;
        final /* synthetic */ m b;
        final /* synthetic */ e2.b c;

        /* JADX INFO: renamed from: com.zentraedi.comic.impl.m$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.impl.ComicHomeDetailListImpl$loadData$1$onResult$1$2", f = "ComicHomeDetailListImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0121a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ e2.b b;
            final /* synthetic */ ArrayList<i6> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0121a(e2.b bVar, ArrayList<i6> arrayList, Continuation<? super C0121a> continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0121a(this.b, this.c, continuation);
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
                return ((C0121a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        a(int i, m mVar, e2.b bVar) {
            this.a = i;
            this.b = mVar;
            this.c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(m mVar, List list, ArrayList arrayList, e2.b bVar, List list2) {
            List listV = mVar.V(list2, list);
            if (listV != null) {
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    arrayList.add(mVar.o((ComicInfoModel) it.next()));
                }
            }
            kotlinx.coroutines.i.e(a2.a, g1.e(), (CoroutineStart) null, new C0121a(bVar, arrayList, null), 2, (Object) null);
            return Unit.INSTANCE;
        }

        public void onResult(ResponseData<ComicListModel> responseData) {
            ObservableField<Integer> observableFieldY;
            if (!Intrinsics.areEqual(responseData != null ? responseData.getCode() : null, "200")) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Au1, responseData != null ? responseData.getCode() : null, responseData != null ? responseData.getMsg() : null), false);
                return;
            }
            final List<ComicInfoModel> list = responseData.getData().getList();
            if (this.a == 0 && (observableFieldY = this.b.Y()) != null) {
                observableFieldY.set(Integer.valueOf(responseData.getData().getTotal()));
            }
            List<ComicInfoModel> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                e2.b bVar = this.c;
                if (bVar != null) {
                    bVar.onResult(CollectionsKt.emptyList());
                    return;
                }
                return;
            }
            final ArrayList arrayList = new ArrayList();
            if (this.b.x() == 6) {
                ig.k kVar = ig.k.a;
                final m mVar = this.b;
                final e2.b bVar2 = this.c;
                kVar.m(new Function1() { // from class: com.zentraedi.comic.impl.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.a.b(mVar, list, arrayList, bVar2, (List) obj);
                    }
                });
                return;
            }
            m mVar2 = this.b;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mVar2.o((ComicInfoModel) it.next()));
            }
            e2.b bVar3 = this.c;
            if (bVar3 != null) {
                bVar3.onResult(arrayList);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vu1), false);
        }
    }

    public m(int i) {
        super(i);
        this.k = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.impl.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.Z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComicInfoModel> V(List<ReadingRecord> list, List<ComicInfoModel> list2) {
        ArrayList arrayList;
        if (list2 == null) {
            return null;
        }
        List<ComicInfoModel> list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (ComicInfoModel comicInfoModel : list3) {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((ReadingRecord) obj).getComicId(), comicInfoModel.getId())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                ReadingRecord readingRecord = (ReadingRecord) arrayList.get(0);
                NasReadingRecordModule nasReadingRecordModule2 = (NasReadingRecordModule) new Gson().fromJson(readingRecord.getProgress(), NasReadingRecordModule.class);
                if (nasReadingRecordModule2 != null && nasReadingRecordModule != null && nasReadingRecordModule2.getTime() > nasReadingRecordModule.getTime() && !TextUtils.isEmpty(readingRecord.getProgress())) {
                    nasReadingRecordModule2.setFilePath(nasReadingRecordModule.getFilePath());
                    String json = new Gson().toJson(nasReadingRecordModule2);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    comicInfoModel.setProgress(json);
                }
            }
            arrayList2.add(comicInfoModel);
        }
        return arrayList2;
    }

    private final l2 W() {
        return (l2) this.k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 Z() {
        return new l2();
    }

    @fo.l
    public final WeakReference<d3> X() {
        return this.l;
    }

    @fo.l
    public final ObservableField<Integer> Y() {
        return this.m;
    }

    @Override // com.zentraedi.comic.impl.j, com.zentraedi.comic.fragment.e2.a
    public void a(@fo.l WeakReference<e2> weakReference) {
        d3 d3Var;
        e2 e2Var;
        super.a(weakReference);
        WeakReference<d3> weakReference2 = this.l;
        if (weakReference2 == null || (d3Var = weakReference2.get()) == null || weakReference == null || (e2Var = weakReference.get()) == null) {
            return;
        }
        W().D(d3Var, e2Var.f3().d().size());
        W().F(e2Var.f3().d());
    }

    public final void a0(@fo.l WeakReference<d3> weakReference) {
        d3 d3Var;
        this.l = weakReference;
        l2 l2VarW = W();
        WeakReference<d3> weakReference2 = this.l;
        if (weakReference2 == null || (d3Var = weakReference2.get()) == null) {
            return;
        }
        l2VarW.k(d3Var, null, x());
    }

    public final void b0(@fo.l ObservableField<Integer> observableField) {
        this.m = observableField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zentraedi.comic.fragment.e2.a
    public void c(int i, @fo.l String str, @fo.l String str2, @fo.l e2.b bVar) {
        com.zentraedi.basic.component.http.i iVar;
        int iX = x();
        if (iX == 6) {
            ComicShelfRequest comicShelfRequest = new ComicShelfRequest();
            comicShelfRequest.setProgressed(1);
            comicShelfRequest.setSortby("ptime");
            comicShelfRequest.setOrder("desc");
            comicShelfRequest.setPage(i);
            iVar = comicShelfRequest;
        } else if (iX == 7) {
            ComicShelfRequest comicShelfRequest2 = new ComicShelfRequest();
            comicShelfRequest2.setOnShelf(1);
            comicShelfRequest2.setSortby(str);
            comicShelfRequest2.setOrder(str2);
            comicShelfRequest2.setPage(i);
            iVar = comicShelfRequest2;
        } else if (iX != 8) {
            ComicShelfRequest comicShelfRequest3 = new ComicShelfRequest();
            comicShelfRequest3.setSortby(str);
            comicShelfRequest3.setOrder(str2);
            iVar = comicShelfRequest3;
        } else {
            ComicShelfRequest comicShelfRequest4 = new ComicShelfRequest();
            comicShelfRequest4.setEdited(1);
            comicShelfRequest4.setSortby(str);
            comicShelfRequest4.setOrder(str2);
            comicShelfRequest4.setPage(i);
            iVar = comicShelfRequest4;
        }
        com.zentraedi.business.http.a.b().h(iVar, new a(i, this, bVar));
    }
}
