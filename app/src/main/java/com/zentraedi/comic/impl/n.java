package com.zentraedi.comic.impl;

import androidx.databinding.ObservableField;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.fragment.e2;
import com.zentraedi.comic.model.ComicListModel;
import com.zentraedi.comic.request.ComicShelfRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class n extends j {

    @fo.l
    private String k;

    @fo.l
    private Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> l;

    @fo.l
    private ObservableField<Integer> m;

    @SourceDebugExtension({"SMAP\nComicHouseListImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListImpl.kt\ncom/zentraedi/comic/impl/ComicHouseListImpl$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1869#2,2:66\n*S KotlinDebug\n*F\n+ 1 ComicHouseListImpl.kt\ncom/zentraedi/comic/impl/ComicHouseListImpl$loadData$1\n*L\n45#1:66,2\n*E\n"})
    public static final class a extends com.zentraedi.business.http.b<ComicListModel> {
        final /* synthetic */ e2.b b;

        a(e2.b bVar) {
            this.b = bVar;
        }

        public void onResult(ResponseData<ComicListModel> responseData) {
            if (!Intrinsics.areEqual(responseData != null ? responseData.getCode() : null, "200")) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Au1, responseData != null ? responseData.getCode() : null, responseData != null ? responseData.getMsg() : null), false);
                return;
            }
            ObservableField<Integer> observableFieldW = n.this.W();
            if (observableFieldW != null) {
                observableFieldW.set(Integer.valueOf(responseData.getData().getTotal()));
            }
            List<ComicInfoModel> list = responseData.getData().getList();
            List<ComicInfoModel> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                e2.b bVar = this.b;
                if (bVar != null) {
                    bVar.onResult(CollectionsKt.emptyList());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            n nVar = n.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(nVar.o((ComicInfoModel) it.next()));
            }
            e2.b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.onResult(arrayList);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vu1), false);
        }
    }

    public n(int i, @fo.l String str) {
        super(i);
        this.k = str;
    }

    public final void T() {
        m();
    }

    @fo.l
    public final Function2<List<com.zentraedi.business.addfile.n>, List<com.zentraedi.business.addfile.n>, Unit> U() {
        return this.l;
    }

    @fo.l
    public final String V() {
        return this.k;
    }

    @fo.l
    public final ObservableField<Integer> W() {
        return this.m;
    }

    public final void X(@fo.l Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> function2) {
        this.l = function2;
    }

    public final void Y(@fo.l String str) {
        this.k = str;
    }

    public final void Z(@fo.l ObservableField<Integer> observableField) {
        this.m = observableField;
    }

    @Override // com.zentraedi.comic.impl.j, com.zentraedi.comic.fragment.e2.a
    public void a(@fo.l WeakReference<e2> weakReference) {
        e2 e2Var;
        Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> function2;
        if (weakReference == null || (e2Var = weakReference.get()) == null || (function2 = this.l) == null) {
            return;
        }
        function2.invoke(e2Var.f3().b(), e2Var.f3().d());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfRequest] */
    @Override // com.zentraedi.comic.fragment.e2.a
    public void c(int i, @fo.l String str, @fo.l String str2, @fo.l e2.b bVar) {
        ?? comicShelfRequest = new ComicShelfRequest();
        comicShelfRequest.setCateId(this.k);
        com.zentraedi.comic.util.g gVar = com.zentraedi.comic.util.g.a;
        comicShelfRequest.setSortby(gVar.e());
        comicShelfRequest.setOrder(gVar.d());
        comicShelfRequest.setWithoutMasked("1");
        comicShelfRequest.setPage(i);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicShelfRequest, new a(bVar));
    }
}
