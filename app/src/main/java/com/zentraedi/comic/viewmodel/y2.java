package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.Bookmark;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.DownLoadFileState;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicImageReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicImageReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicImageReaderViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n1878#2,3:261\n1869#2,2:264\n1669#2,8:266\n1669#2,8:274\n1669#2,8:282\n*S KotlinDebug\n*F\n+ 1 ComicImageReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicImageReaderViewModel\n*L\n56#1:261,3\n112#1:264,2\n119#1:266,8\n123#1:274,8\n127#1:282,8\n*E\n"})
public final class y2 extends androidx.lifecycle.i2 implements gg.a {

    @fo.l
    private l6 b;

    @fo.l
    private Activity f;

    @fo.k
    private final ArrayList<l6> a = new ArrayList<>();

    @fo.k
    private final com.zentraedi.comic.adapter.v c = new com.zentraedi.comic.adapter.v();

    @fo.k
    private final com.zentraedi.comic.adapter.y d = new com.zentraedi.comic.adapter.y();

    @fo.k
    private final a0 e = new a0();
    private int g = -1;
    private int h = -1;

    @fo.k
    private final RecyclerView.OnScrollListener i = new c();

    public static final class a implements com.zentraedi.comic.adapter.b0 {
        final /* synthetic */ Function2<Integer, String, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Integer, ? super String, Unit> function2) {
            this.b = function2;
        }

        @Override // com.zentraedi.comic.adapter.b0
        public void a(int i) {
            if (i < 0 || i >= y2.this.R().size()) {
                return;
            }
            this.b.invoke(Integer.valueOf(i), y2.this.R().get(i).getFileName());
        }
    }

    public static final class b extends RecyclerView.ItemDecoration {
        b() {
        }

        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            outRect.right = com.zentraedi.basic.function.utils.m0.b(10.0f);
        }
    }

    public static final class c extends RecyclerView.OnScrollListener {
        c() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if ((recyclerView instanceof com.zentraedi.comic.view.e0) && com.zentraedi.comic.w.j(recyclerView) != -1 && com.zentraedi.comic.w.j(recyclerView) < y2.this.R().size()) {
                y2 y2Var = y2.this;
                y2Var.b = y2Var.R().get(com.zentraedi.comic.w.j(recyclerView));
            }
        }
    }

    private final void O(androidx.databinding.w<FileInfoModel> wVar, int i, int i2, int i3, FileInfoModel fileInfoModel) {
        if (wVar != null) {
            int i4 = 0;
            for (Object obj : wVar) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                FileInfoModel fileInfoModel2 = (FileInfoModel) obj;
                Intrinsics.checkNotNull(fileInfoModel2);
                Lazy<l6> lazyB = com.zentraedi.comic.delegate.c.b(fileInfoModel2, i3, false, i4, wVar.size());
                if (Intrinsics.areEqual(fileInfoModel != null ? fileInfoModel.getPath() : null, fileInfoModel2.getPath())) {
                    this.g = i4;
                }
                this.a.add(P(lazyB));
                i4 = i5;
            }
        }
    }

    private static final l6 P(Lazy<l6> lazy) {
        return lazy.getValue();
    }

    private final void T(final RecyclerView recyclerView, final int i) {
        recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.viewmodel.w2
            @Override // java.lang.Runnable
            public final void run() {
                y2.U(i, this, recyclerView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(int i, y2 y2Var, RecyclerView recyclerView) {
        if (i < 0 || i >= y2Var.a.size()) {
            return;
        }
        recyclerView.scrollToPosition(i);
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        layoutManager.scrollToPositionWithOffset(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(int i, y2 y2Var, RecyclerView recyclerView) {
        if (i < 0 || i >= y2Var.d.getItemCount()) {
            return;
        }
        recyclerView.scrollToPosition(i);
    }

    @Override // gg.a
    public void C(@fo.l FileInfoModel fileInfoModel, int i, @fo.k Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // gg.a
    public void H() {
        this.c.notifyDataSetChanged();
    }

    @Override // gg.a
    public void I(@fo.k RecyclerView recyclerView, int i, @fo.k Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (i < 0 || i >= this.a.size()) {
            callback.invoke(Boolean.FALSE, "");
        } else {
            T(recyclerView, i);
            callback.invoke(Boolean.TRUE, this.a.get(i).getFileName());
        }
    }

    public final int Q() {
        return this.h;
    }

    @fo.k
    public final ArrayList<l6> R() {
        return this.a;
    }

    public final int S() {
        return this.g;
    }

    public final void V(int i) {
        this.h = i;
    }

    public final void W(int i) {
        this.g = i;
    }

    @Override // gg.a
    public int b(int i) {
        return i;
    }

    @Override // gg.a
    @fo.k
    public com.zentraedi.comic.adapter.a d() {
        return this.c;
    }

    @Override // gg.a
    public void destroy() {
        this.c.Q();
        this.a.clear();
        this.b = null;
        this.f = null;
    }

    @Override // gg.a
    public void f(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.addOnScrollListener(this.i);
    }

    @Override // gg.a
    @fo.k
    public a0 g() {
        return this.e;
    }

    @Override // gg.a
    public void h(@fo.k final RecyclerView bottomMenuRecyclerView, int i) {
        Intrinsics.checkNotNullParameter(bottomMenuRecyclerView, "bottomMenuRecyclerView");
        if (this.d.getItemCount() <= 0) {
            com.zentraedi.comic.adapter.y yVar = this.d;
            ArrayList<l6> arrayList = this.a;
            Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.databinding.BaseObservable>");
            yVar.L(arrayList);
        }
        final int itemCount = (i * this.d.getItemCount()) / 100;
        if (itemCount < 0 || itemCount >= this.d.getItemCount()) {
            return;
        }
        bottomMenuRecyclerView.post(new Runnable() { // from class: com.zentraedi.comic.viewmodel.x2
            @Override // java.lang.Runnable
            public final void run() {
                y2.X(itemCount, this, bottomMenuRecyclerView);
            }
        });
    }

    @Override // gg.a
    public void i(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (layout == Layout.SINGLE) {
            ArrayList arrayList = new ArrayList();
            for (l6 l6Var : this.a) {
                arrayList.add(l6Var);
                arrayList.add(l6Var);
            }
            this.a.clear();
            this.a.addAll(arrayList);
        } else if (layout == Layout.DOUBLE_REVERSAL) {
            ArrayList<l6> arrayList2 = this.a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add(((l6) obj).h())) {
                    arrayList3.add(obj);
                }
            }
            this.a.clear();
            this.a.addAll(arrayList3);
        } else if (layout == Layout.DOUBLE) {
            ArrayList<l6> arrayList4 = this.a;
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (hashSet2.add(((l6) obj2).h())) {
                    arrayList5.add(obj2);
                }
            }
            this.a.clear();
            this.a.addAll(arrayList5);
        } else {
            ArrayList<l6> arrayList6 = this.a;
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (hashSet3.add(((l6) obj3).h())) {
                    arrayList7.add(obj3);
                }
            }
            this.a.clear();
            this.a.addAll(arrayList7);
        }
        this.e.o0(com.zentraedi.comic.m.o(this.a.size()));
        this.d.L(this.a);
    }

    @Override // gg.a
    public void k(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setAdapter(this.d);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f, 0, false));
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(0L);
        }
        SimpleItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator5, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator5.setSupportsChangeAnimations(false);
        recyclerView.addItemDecoration(new b());
    }

    @Override // gg.a
    @fo.k
    public FileInfoModel n() {
        FileInfoModel fileInfoModel = new FileInfoModel();
        l6 l6Var = this.b;
        fileInfoModel.setFileId(l6Var != null ? l6Var.getFileId() : null);
        l6 l6Var2 = this.b;
        fileInfoModel.setName(l6Var2 != null ? l6Var2.getFileName() : null);
        l6 l6Var3 = this.b;
        fileInfoModel.setPath(l6Var3 != null ? l6Var3.h() : null);
        return fileInfoModel;
    }

    @Override // gg.a
    @fo.k
    public NasReadingRecordModule q() {
        String fileId;
        l6 l6Var = this.b;
        int position = l6Var != null ? l6Var.getPosition() : 0;
        l6 l6Var2 = this.b;
        if (l6Var2 == null || (fileId = l6Var2.getFileId()) == null) {
            fileId = "";
        }
        int size = this.a.size();
        NasReadingRecordModule nasReadingRecordModule = new NasReadingRecordModule();
        nasReadingRecordModule.setPosition(position);
        nasReadingRecordModule.setFilePath(fileId);
        nasReadingRecordModule.setCount(size);
        nasReadingRecordModule.setReadModel(0);
        nasReadingRecordModule.setCurrentPath("");
        nasReadingRecordModule.setTime(System.currentTimeMillis());
        return nasReadingRecordModule;
    }

    @Override // gg.a
    public void r(@fo.l androidx.databinding.w<FileInfoModel> wVar, int i, int i2, @fo.k Activity activity, @fo.k Function1<? super DownLoadFileState, Unit> callback, @fo.k Function1<? super String, Unit> downloadProgress, @fo.l FileInfoModel fileInfoModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(downloadProgress, "downloadProgress");
        this.f = activity;
        this.a.clear();
        StringBuilder sb = new StringBuilder();
        sb.append("dataChangeOnItemRangeInserted start senderSize=");
        sb.append(wVar != null ? wVar.size() : 0);
        sb.append(" currentFile=");
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" from=");
        sb.append(this.h);
        nd.a.e("ComicImageReaderVM", sb.toString());
        O(wVar, i, i2, this.h, fileInfoModel);
        nd.a.e("ComicImageReaderVM", "dataChangeOnItemRangeInserted parsedCount=" + this.a.size() + " scrollToPos=" + this.g);
        if (this.g == -1) {
            callback.invoke(DownLoadFileState.LOADMORE);
        } else {
            callback.invoke(DownLoadFileState.SUCCESS);
        }
    }

    @Override // gg.a
    public void s(@fo.k RecyclerView recyclerView, @fo.k Function2<? super Integer, ? super String, Unit> itemClick, @fo.k Function1<? super Bookmark, Unit> deleteBookmark, @fo.k ArrayList<Bookmark> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(deleteBookmark, "deleteBookmark");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<l6> arrayList = this.a;
        if (arrayList != null) {
            this.c.N(arrayList);
            this.e.o0(com.zentraedi.comic.m.o(arrayList.size()));
        }
        this.c.i1(recyclerView instanceof com.zentraedi.comic.view.e0 ? (com.zentraedi.comic.view.e0) recyclerView : null);
        recyclerView.setAdapter(this.c);
        this.e.i0(deleteBookmark);
        this.e.j0(itemClick);
        this.e.n0(list);
        this.d.M(new a(itemClick));
        if (this.g != -1) {
            int size = this.a.size();
            int i = this.g;
            if (i < 0 || i >= size) {
                return;
            }
            itemClick.invoke(Integer.valueOf(i), this.a.get(this.g).getFileName());
        }
    }

    @Override // gg.a
    public void u(@fo.l FileInfoModel fileInfoModel, int i, @fo.k Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // gg.a
    public void v(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.e.v(recyclerView);
    }
}
