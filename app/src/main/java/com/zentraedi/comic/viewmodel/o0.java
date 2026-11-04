package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.Bookmark;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.DownLoadFileState;
import com.zentraedi.comic.adapter.ComicItemType;
import com.zentraedi.outreader.reader.ComicEpubZReader;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class o0 extends androidx.lifecycle.i2 implements gg.a {

    @fo.l
    private com.zentraedi.comic.view.e0 c;

    @fo.l
    private FileInfoModel d;

    @fo.k
    private final i4 a = new i4();

    @fo.k
    private final a0 b = new a0();

    @fo.k
    private com.zentraedi.comic.adapter.k0 e = new com.zentraedi.comic.adapter.k0();
    private int f = -1;

    public static final class a implements com.zentraedi.comic.adapter.b0 {
        final /* synthetic */ Function2<Integer, String, Unit> a;
        final /* synthetic */ o0 b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Integer, ? super String, Unit> function2, o0 o0Var) {
            this.a = function2;
            this.b = o0Var;
        }

        @Override // com.zentraedi.comic.adapter.b0
        public void a(int i) {
            String name;
            Function2<Integer, String, Unit> function2 = this.a;
            Integer numValueOf = Integer.valueOf(i);
            FileInfoModel fileInfoModelP = this.b.P();
            if (fileInfoModelP == null || (name = fileInfoModelP.getName()) == null) {
                name = "";
            }
            function2.invoke(numValueOf, name);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicEpubReaderViewModel$dataChangeOnItemRangeInserted$2", f = "ComicEpubReaderViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ FileInfoModel b;
        final /* synthetic */ o0 c;
        final /* synthetic */ Function1<String, Unit> d;
        final /* synthetic */ Activity e;
        final /* synthetic */ Function1<DownLoadFileState, Unit> f;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicEpubReaderViewModel$dataChangeOnItemRangeInserted$2$1$1", f = "ComicEpubReaderViewModel.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
        @SourceDebugExtension({"SMAP\nComicEpubReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicEpubReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicEpubReaderViewModel$dataChangeOnItemRangeInserted$2$1$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,202:1\n179#2,8:203\n*S KotlinDebug\n*F\n+ 1 ComicEpubReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicEpubReaderViewModel$dataChangeOnItemRangeInserted$2$1$1\n*L\n86#1:203,8\n*E\n"})
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ String c;
            final /* synthetic */ Function1<DownLoadFileState, Unit> d;
            final /* synthetic */ o0 e;
            final /* synthetic */ Activity f;

            /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.o0$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicEpubReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicEpubReaderViewModel$dataChangeOnItemRangeInserted$2$1$1\n*L\n1#1,778:1\n87#2,8:779\n*E\n"})
            public static final class C0133a implements Function0<Unit> {
                final /* synthetic */ Object a;
                final /* synthetic */ com.zentraedi.outreader.reader.h b;
                final /* synthetic */ String c;
                final /* synthetic */ Function1 d;
                final /* synthetic */ o0 e;
                final /* synthetic */ Activity f;

                public C0133a(Object obj, com.zentraedi.outreader.reader.h hVar, String str, Function1 function1, o0 o0Var, Activity activity) {
                    this.a = obj;
                    this.b = hVar;
                    this.c = str;
                    this.d = function1;
                    this.e = o0Var;
                    this.f = activity;
                }

                public final void a() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("openComic result=");
                    com.zentraedi.outreader.reader.h hVar = this.b;
                    sb.append(hVar != null ? hVar.getClass().getSimpleName() : null);
                    sb.append(" path=");
                    sb.append(this.c);
                    nd.a.e("ComicEpubReaderVM", sb.toString());
                    this.d.invoke(DownLoadFileState.SUCCESS);
                    nd.a.c("analysisEpub", "epub open success");
                    if (this.b instanceof ComicEpubZReader) {
                        this.e.a.z0(this.b, this.f, 0, ComicItemType.COMIC_ITEM_TYPE_EPUB, this.e.c);
                        nd.a.e("ComicEpubReaderVM", "initPDFAdapter done pageCount=" + ((ComicEpubZReader) this.b).b() + " path=" + this.c);
                        this.e.b.o0(com.zentraedi.comic.m.o(((ComicEpubZReader) this.b).b()));
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(String str, Function1<? super DownLoadFileState, Unit> function1, o0 o0Var, Activity activity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = str;
                this.d = function1;
                this.e = o0Var;
                this.f = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, this.e, this.f, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.comic.util.k kVar = com.zentraedi.comic.util.k.a;
                    String str = this.c;
                    ComicItemType comicItemType = ComicItemType.COMIC_ITEM_TYPE_EPUB;
                    this.b = q0Var;
                    this.a = 1;
                    obj = kVar.a(str, comicItemType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.zentraedi.outreader.reader.h hVar = (com.zentraedi.outreader.reader.h) obj;
                String str2 = this.c;
                Function1<DownLoadFileState, Unit> function1 = this.d;
                o0 o0Var = this.e;
                Activity activity = this.f;
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("openComic result=");
                    sb.append(hVar != null ? hVar.getClass().getSimpleName() : null);
                    sb.append(" path=");
                    sb.append(str2);
                    nd.a.e("ComicEpubReaderVM", sb.toString());
                    function1.invoke(DownLoadFileState.SUCCESS);
                    nd.a.c("analysisEpub", "epub open success");
                    if (hVar instanceof ComicEpubZReader) {
                        o0Var.a.z0(hVar, activity, 0, ComicItemType.COMIC_ITEM_TYPE_EPUB, o0Var.c);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("initPDFAdapter done pageCount=");
                        ComicEpubZReader comicEpubZReader = (ComicEpubZReader) hVar;
                        sb2.append(comicEpubZReader.b());
                        sb2.append(" path=");
                        sb2.append(str2);
                        nd.a.e("ComicEpubReaderVM", sb2.toString());
                        o0Var.b.o0(com.zentraedi.comic.m.o(comicEpubZReader.b()));
                    }
                } else {
                    pe.i.r(new C0133a(q0Var, hVar, str2, function1, o0Var, activity));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FileInfoModel fileInfoModel, o0 o0Var, Function1<? super String, Unit> function1, Activity activity, Function1<? super DownLoadFileState, Unit> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = fileInfoModel;
            this.c = o0Var;
            this.d = function1;
            this.e = activity;
            this.f = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(FileInfoModel fileInfoModel, o0 o0Var, Function1 function1, Activity activity, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("analysisEpub success path=");
            sb.append(str);
            sb.append(" currentFile=");
            sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
            nd.a.e("ComicEpubReaderVM", sb.toString());
            kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(o0Var), (CoroutineContext) null, (CoroutineStart) null, new a(str, function1, o0Var, activity, null), 3, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(FileInfoModel fileInfoModel, Function1 function1) {
            StringBuilder sb = new StringBuilder();
            sb.append("analysisEpub failed currentFile=");
            sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
            nd.a.c("ComicEpubReaderVM", sb.toString());
            function1.invoke(DownLoadFileState.FAIL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(FileInfoModel fileInfoModel, Function1 function1, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("analysisEpub waiting download currentFile=");
            sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
            nd.a.a("ComicEpubReaderVM", sb.toString());
            function1.invoke(DownLoadFileState.WAIT);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileInfoModel fileInfoModel = this.b;
                int iQ = this.c.Q();
                final FileInfoModel fileInfoModel2 = this.b;
                final o0 o0Var = this.c;
                final Function1<DownLoadFileState, Unit> function1 = this.f;
                final Activity activity = this.e;
                Function1 function2 = new Function1() { // from class: com.zentraedi.comic.viewmodel.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o0.b.g(fileInfoModel2, o0Var, function1, activity, (String) obj2);
                    }
                };
                final FileInfoModel fileInfoModel3 = this.b;
                final Function1<DownLoadFileState, Unit> function3 = this.f;
                Function0 function0 = new Function0() { // from class: com.zentraedi.comic.viewmodel.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o0.b.h(fileInfoModel3, function3);
                    }
                };
                final FileInfoModel fileInfoModel4 = this.b;
                final Function1<DownLoadFileState, Unit> function4 = this.f;
                Function1 function5 = new Function1() { // from class: com.zentraedi.comic.viewmodel.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o0.b.j(fileInfoModel4, function4, (String) obj2);
                    }
                };
                Function1<String, Unit> function6 = this.d;
                Activity activity2 = this.e;
                this.a = 1;
                if (com.zentraedi.comic.m.g(fileInfoModel, iQ, function2, function0, function5, function6, activity2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class c extends RecyclerView.ItemDecoration {
        c() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(RecyclerView recyclerView, int i, o0 o0Var) {
        recyclerView.scrollToPosition((int) ((i / 100.0f) * (o0Var.e.getItemCount() - 1)));
    }

    @Override // gg.a
    public void C(@fo.l FileInfoModel fileInfoModel, int i, @fo.k Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // gg.a
    public void H() {
        this.a.H();
    }

    @Override // gg.a
    public void I(@fo.k RecyclerView recyclerView, int i, @fo.k Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.I(recyclerView, i, callback);
    }

    @fo.l
    public final FileInfoModel P() {
        return this.d;
    }

    public final int Q() {
        return this.f;
    }

    @fo.k
    public final com.zentraedi.comic.adapter.k0 R() {
        return this.e;
    }

    public final void S(@fo.l FileInfoModel fileInfoModel) {
        this.d = fileInfoModel;
    }

    public final void T(int i) {
        this.f = i;
    }

    public final void U(@fo.k com.zentraedi.comic.adapter.k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<set-?>");
        this.e = k0Var;
    }

    @Override // gg.a
    public int b(int i) {
        return this.a.b(i);
    }

    @Override // gg.a
    @fo.k
    public com.zentraedi.comic.adapter.a d() {
        return this.a.d();
    }

    @Override // gg.a
    public void destroy() {
        this.e.O();
        this.a.destroy();
    }

    @Override // gg.a
    public void f(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView instanceof com.zentraedi.comic.view.e0) {
            this.c = (com.zentraedi.comic.view.e0) recyclerView;
        }
        this.a.f(recyclerView);
    }

    @Override // gg.a
    @fo.k
    public a0 g() {
        return this.b;
    }

    @Override // gg.a
    public void h(@fo.k final RecyclerView bottomMenuRecyclerView, final int i) {
        Intrinsics.checkNotNullParameter(bottomMenuRecyclerView, "bottomMenuRecyclerView");
        if (!Intrinsics.areEqual(this.e.P(), this.a.u0().l0())) {
            this.e.O();
            this.e.T(this.a.q0(), this.a.u0().l0());
            com.zentraedi.comic.adapter.k0 k0Var = this.e;
            i4 i4Var = this.a;
            com.zentraedi.outreader.reader.h hVarL0 = i4Var.u0().l0();
            ArrayList<m6> arrayListJ0 = i4Var.j0(hVarL0 != null ? hVarL0.b() : 0);
            Intrinsics.checkNotNull(arrayListJ0, "null cannot be cast to non-null type kotlin.collections.List<androidx.databinding.BaseObservable>");
            k0Var.L(arrayListJ0);
        }
        bottomMenuRecyclerView.post(new Runnable() { // from class: com.zentraedi.comic.viewmodel.n0
            @Override // java.lang.Runnable
            public final void run() {
                o0.V(bottomMenuRecyclerView, i, this);
            }
        });
    }

    @Override // gg.a
    public void i(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.a.i(layout);
    }

    @Override // gg.a
    public void k(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setAdapter(this.e);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
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
        recyclerView.addItemDecoration(new c());
    }

    @Override // gg.a
    @fo.l
    public FileInfoModel n() {
        return this.a.n();
    }

    @Override // gg.a
    @fo.k
    public NasReadingRecordModule q() {
        String id2;
        NasReadingRecordModule nasReadingRecordModuleQ = this.a.q();
        FileInfoModel fileInfoModel = this.d;
        if (fileInfoModel == null || (id2 = fileInfoModel.getId()) == null) {
            id2 = "";
        }
        nasReadingRecordModuleQ.setFilePath(id2);
        return nasReadingRecordModuleQ;
    }

    @Override // gg.a
    public void r(@fo.l androidx.databinding.w<FileInfoModel> wVar, int i, int i2, @fo.k Activity activity, @fo.k Function1<? super DownLoadFileState, Unit> callback, @fo.k Function1<? super String, Unit> downloadProgress, @fo.l FileInfoModel fileInfoModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(downloadProgress, "downloadProgress");
        this.a.I0(activity);
        this.d = fileInfoModel;
        StringBuilder sb = new StringBuilder();
        sb.append("dataChangeOnItemRangeInserted start senderSize=");
        sb.append(wVar != null ? wVar.size() : 0);
        sb.append(" currentFile=");
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" from=");
        sb.append(this.f);
        nd.a.e("ComicEpubReaderVM", sb.toString());
        if (fileInfoModel != null) {
            this.a.x0().addLast(fileInfoModel);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("epub open start currentFile=");
            sb2.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
            nd.a.c("analysisEpub", sb2.toString());
            kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(this), (CoroutineContext) null, (CoroutineStart) null, new b(fileInfoModel, this, downloadProgress, activity, callback, null), 3, (Object) null);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("dataChangeOnItemRangeInserted exception currentFile=");
            sb3.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
            nd.a.d("ComicEpubReaderVM", sb3.toString(), e);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CK), false);
            callback.invoke(DownLoadFileState.SUCCESS);
            activity.finish();
        }
    }

    @Override // gg.a
    public void s(@fo.k RecyclerView recyclerView, @fo.k Function2<? super Integer, ? super String, Unit> itemClick, @fo.k Function1<? super Bookmark, Unit> deleteBookmark, @fo.k ArrayList<Bookmark> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(deleteBookmark, "deleteBookmark");
        Intrinsics.checkNotNullParameter(list, "list");
        this.a.s(recyclerView, itemClick, deleteBookmark, list);
        this.b.j0(itemClick);
        this.b.i0(deleteBookmark);
        this.b.n0(list);
        this.e.M(new a(itemClick, this));
    }

    @Override // gg.a
    public void u(@fo.l FileInfoModel fileInfoModel, int i, @fo.k Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // gg.a
    public void v(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.b.v(recyclerView);
    }
}
