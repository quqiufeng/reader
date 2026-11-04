package com.zentraedi.comic.impl;

import android.app.Activity;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.p7;
import com.zentraedi.comic.activity.OfflineComicDetailActivity;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class r extends j {

    @fo.l
    private String k;

    @fo.l
    private String l;

    @fo.l
    private ComicInfoModel m;

    @fo.k
    private final Lazy n;

    @fo.l
    private WeakReference<d3> o;

    @fo.k
    private List<i6> p;
    private int q;

    @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicSubFilesImpl$loadData$1", f = "OfflineComicSubFilesImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String d;
        final /* synthetic */ int e;
        final /* synthetic */ e2.b f;

        /* JADX INFO: renamed from: com.zentraedi.comic.impl.r$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicSubFilesImpl$loadData$1$1", f = "OfflineComicSubFilesImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0122a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ int b;
            final /* synthetic */ r c;
            final /* synthetic */ e2.b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0122a(int i, r rVar, e2.b bVar, Continuation<? super C0122a> continuation) {
                super(2, continuation);
                this.b = i;
                this.c = rVar;
                this.d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0122a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iY = this.b * this.c.Y();
                int iY2 = this.c.Y() + iY;
                if (this.c.W().size() < iY2) {
                    iY2 = this.c.W().size();
                }
                e2.b bVar = this.d;
                if (bVar != null) {
                    List<? extends com.zentraedi.business.addfile.n> listSlice = CollectionsKt.slice((List) this.c.W(), RangesKt.until(iY, iY2));
                    Intrinsics.checkNotNull(listSlice, "null cannot be cast to non-null type kotlin.collections.List<com.zentraedi.business.addfile.EditableNasItemViewModel>");
                    bVar.onResult(listSlice);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0122a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicSubFilesImpl$loadData$1$2", f = "OfflineComicSubFilesImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ e2.b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e2.b bVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
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
                    bVar.onResult(null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicSubFilesImpl$loadData$1$3", f = "OfflineComicSubFilesImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ r b;
            final /* synthetic */ ArrayList<i6> c;
            final /* synthetic */ e2.b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(r rVar, ArrayList<i6> arrayList, e2.b bVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = rVar;
                this.c = arrayList;
                this.d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.e0(this.c);
                int size = this.b.W().size() < this.b.Y() ? this.b.W().size() : this.b.Y();
                e2.b bVar = this.d;
                if (bVar != null) {
                    List<? extends com.zentraedi.business.addfile.n> listSlice = CollectionsKt.slice((List) this.b.W(), RangesKt.until(0, size));
                    Intrinsics.checkNotNull(listSlice, "null cannot be cast to non-null type kotlin.collections.List<com.zentraedi.business.addfile.EditableNasItemViewModel>");
                    bVar.onResult(listSlice);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.impl.OfflineComicSubFilesImpl$loadData$1$4", f = "OfflineComicSubFilesImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class d extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ e2.b b;
            final /* synthetic */ Exception c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e2.b bVar, Exception exc, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
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
                    bVar.onError("-10003", this.c.getLocalizedMessage());
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class e implements Comparator<File> {
            e() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                String name;
                String name2;
                p7 p7Var = p7.a;
                String str = "";
                if (file == null || (name = file.getName()) == null) {
                    name = "";
                }
                if (file2 != null && (name2 = file2.getName()) != null) {
                    str = name2;
                }
                return p7Var.a(name, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i, e2.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = i;
            this.f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = r.this.new a(this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iF;
            q0 q0Var = (q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (!r.this.W().isEmpty()) {
                    kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new C0122a(this.e, r.this, this.f, null), 2, (Object) null);
                    return Unit.INSTANCE;
                }
                String strA0 = r.this.a0();
                if (strA0 == null) {
                    strA0 = "";
                }
                File[] fileArrListFiles = new File(strA0).listFiles();
                if (fileArrListFiles == null) {
                    kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new b(this.f, null), 2, (Object) null);
                    return Unit.INSTANCE;
                }
                List<File> list = ArraysKt.toList(fileArrListFiles);
                e eVar = new e();
                if (Intrinsics.areEqual(this.d, "asc")) {
                    Collections.sort(list, eVar);
                } else {
                    Collections.sort(list, Collections.reverseOrder(eVar));
                }
                ArrayList arrayList = new ArrayList();
                for (File file : list) {
                    if (!file.isFile() || (iF = i5.a.f(file.getPath())) == 3 || iF == 10 || iF == 26 || iF == 8 || iF == 57) {
                        r rVar = r.this;
                        Intrinsics.checkNotNull(file);
                        i6 i6VarO = rVar.o(rVar.V(file));
                        arrayList.add(i6VarO);
                        i6VarO.o0().set(0);
                    }
                }
                kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new c(r.this, arrayList, this.f, null), 2, (Object) null);
                return Unit.INSTANCE;
            } catch (Exception e2) {
                kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new d(this.f, e2, null), 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public r(int i) {
        super(i);
        this.n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.impl.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.d0();
            }
        });
        this.p = new ArrayList();
        this.q = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComicInfoModel V(File file) {
        String name;
        String id2;
        String id3;
        String progress;
        ComicDirModel dir;
        ComicCategory category;
        ComicDirModel dir2;
        ComicCategory category2;
        ComicCategory comicCategory = new ComicCategory();
        ComicInfoModel comicInfoModel = this.m;
        String str = "";
        if (comicInfoModel == null || (dir2 = comicInfoModel.getDir()) == null || (category2 = dir2.getCategory()) == null || (name = category2.getName()) == null) {
            name = "";
        }
        comicCategory.setName(name);
        ComicInfoModel comicInfoModel2 = this.m;
        if (comicInfoModel2 == null || (dir = comicInfoModel2.getDir()) == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
            id2 = "";
        }
        comicCategory.setId(id2);
        ComicDirModel comicDirModel = new ComicDirModel();
        comicDirModel.setCategory(comicCategory);
        ComicInfoModel comicInfoModel3 = new ComicInfoModel();
        comicInfoModel3.setDir(comicDirModel);
        comicInfoModel3.setCover("");
        comicInfoModel3.setOnShelf(0);
        comicInfoModel3.setName(file.getName());
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        comicInfoModel3.setPath(path);
        ComicInfoModel comicInfoModel4 = this.m;
        if (comicInfoModel4 == null || (id3 = comicInfoModel4.getId()) == null) {
            id3 = "";
        }
        comicInfoModel3.setId(id3);
        ComicInfoModel comicInfoModel5 = this.m;
        if (comicInfoModel5 != null && (progress = comicInfoModel5.getProgress()) != null) {
            str = progress;
        }
        comicInfoModel3.setProgress(str);
        comicInfoModel3.setOfflineDataTopLevelPath(this.k);
        return comicInfoModel3;
    }

    private final t2 X() {
        return (t2) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 d0() {
        return new t2();
    }

    @Override // com.zentraedi.comic.impl.j
    public void G(int i, @fo.k ComicInfoModel comic) {
        Intrinsics.checkNotNullParameter(comic, "comic");
        OfflineComicDetailActivity.a aVar = OfflineComicDetailActivity.f0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.b(activityE, comic.getPath(), this.k);
    }

    @fo.k
    public final List<i6> W() {
        return this.p;
    }

    public final int Y() {
        return this.q;
    }

    @fo.l
    public final ComicInfoModel Z() {
        return this.m;
    }

    @Override // com.zentraedi.comic.impl.j, com.zentraedi.comic.fragment.e2.a
    public void a(@fo.l WeakReference<e2> weakReference) {
        d3 d3Var;
        e2 e2Var;
        super.a(weakReference);
        WeakReference<d3> weakReference2 = this.o;
        if (weakReference2 == null || (d3Var = weakReference2.get()) == null || weakReference == null || (e2Var = weakReference.get()) == null) {
            return;
        }
        X().m(d3Var, e2Var.f3().d().size());
        X().o(e2Var.f3().d());
    }

    @fo.l
    public final String a0() {
        return this.l;
    }

    @fo.l
    public final WeakReference<d3> b0() {
        return this.o;
    }

    @Override // com.zentraedi.comic.fragment.e2.a
    public void c(int i, @fo.l String str, @fo.l String str2, @fo.l e2.b bVar) {
        if (i == 0) {
            this.p.clear();
        }
        kotlinx.coroutines.i.e(a2.a, g1.c(), (CoroutineStart) null, new a(str2, i, bVar, null), 2, (Object) null);
    }

    @fo.l
    public final String c0() {
        return this.k;
    }

    public final void e0(@fo.k List<i6> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.p = list;
    }

    public final void f0(int i) {
        this.q = i;
    }

    public final void g0(@fo.l ComicInfoModel comicInfoModel) {
        this.m = comicInfoModel;
    }

    public final void h0(@fo.l String str) {
        this.l = str;
    }

    public final void i0(@fo.l WeakReference<d3> weakReference) {
        d3 d3Var;
        this.o = weakReference;
        t2 t2VarX = X();
        WeakReference<d3> weakReference2 = this.o;
        if (weakReference2 == null || (d3Var = weakReference2.get()) == null) {
            return;
        }
        t2VarX.d(d3Var, null, x());
    }

    public final void j0(@fo.l String str) {
        this.k = str;
    }
}
