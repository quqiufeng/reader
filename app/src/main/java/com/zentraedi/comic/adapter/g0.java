package com.zentraedi.comic.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.business.utils.g8;
import com.zentraedi.comic.databinding.y2;
import com.zentraedi.comic.view.ComicTiledImageView;
import com.zentraedi.comic.viewmodel.Clip;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ReadSetting;
import com.zentraedi.comic.viewmodel.ZoomType;
import com.zentraedi.comic.viewmodel.m6;
import com.zentraedi.outreader.reader.PDFTronZReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nPDFComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n1869#2,2:623\n1669#2,8:625\n1669#2,8:633\n1869#2,2:642\n1869#2,2:644\n1#3:641\n*S KotlinDebug\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter\n*L\n89#1:623,2\n101#1:625,8\n109#1:633,8\n589#1:642,2\n598#1:644,2\n*E\n"})
public final class g0 extends com.zentraedi.comic.adapter.a {

    @fo.l
    private com.zentraedi.outreader.reader.h f;

    @fo.l
    private Activity g;

    @fo.l
    private com.zentraedi.comic.view.e0 h;

    @fo.l
    private ReadSetting k;

    @fo.k
    private final q0 i = r0.a(k3.c((k2) null, 1, (Object) null).plus(g1.e()));

    @fo.k
    private final Map<Integer, k2> j = new LinkedHashMap();
    private float l = 1.0f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Layout.values().length];
            try {
                iArr[Layout.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Layout.DOUBLE_REVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ZoomType.values().length];
            try {
                iArr2[ZoomType.WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ZoomType.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ReadModel.values().length];
            try {
                iArr3[ReadModel.SCROLL_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1", f = "PDFComicAdapter.kt", i = {1, 2, 2, 2, 3, 3, 4, 4}, l = {137, 139, 146, 167, 175}, m = "invokeSuspend", n = {"bitmap1", "bitmap1", "bitmap2", "mergedBitmap", "bitmap1", "bitmap2", "bitmap1", "bitmap2"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        int d;
        final /* synthetic */ com.zentraedi.outreader.reader.h f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ com.zentraedi.comic.adapter.d j;
        final /* synthetic */ y2 k;
        final /* synthetic */ Object l;

        @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1$1", f = "PDFComicAdapter.kt", i = {1}, l = {154, 156}, m = "invokeSuspend", n = {"newBitmap"}, s = {"L$0"}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            Object a;
            int b;
            final /* synthetic */ g0 c;
            final /* synthetic */ int d;
            final /* synthetic */ Pair<Bitmap, Bitmap> e;
            final /* synthetic */ com.zentraedi.comic.adapter.d f;
            final /* synthetic */ y2 g;
            final /* synthetic */ Object h;
            final /* synthetic */ com.zentraedi.outreader.reader.h i;

            /* JADX INFO: renamed from: com.zentraedi.comic.adapter.g0$b$a$a, reason: collision with other inner class name */
            @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1$1$1", f = "PDFComicAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class C0105a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ g0 b;
                final /* synthetic */ com.zentraedi.comic.adapter.d c;
                final /* synthetic */ y2 d;
                final /* synthetic */ int e;
                final /* synthetic */ Object f;
                final /* synthetic */ com.zentraedi.outreader.reader.h g;
                final /* synthetic */ Bitmap h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0105a(g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap, Continuation<? super C0105a> continuation) {
                    super(2, continuation);
                    this.b = g0Var;
                    this.c = dVar;
                    this.d = y2Var;
                    this.e = i;
                    this.f = obj;
                    this.g = hVar;
                    this.h = bitmap;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0105a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.b.o0(this.c, this.d, this.e, this.f, this.g)) {
                        this.b.p0(this.h.getWidth(), this.h.getHeight(), this.d);
                        this.d.E.setImageBitmap(this.h);
                        this.d.E.setTag(this.h);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                    return ((C0105a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, int i, Pair<Bitmap, Bitmap> pair, com.zentraedi.comic.adapter.d dVar, y2 y2Var, Object obj, com.zentraedi.outreader.reader.h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = g0Var;
                this.d = i;
                this.e = pair;
                this.f = dVar;
                this.g = y2Var;
                this.h = obj;
                this.i = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x014e, code lost:
            
                if (kotlinx.coroutines.i.h(r13, r3, r12) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 340
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.adapter.g0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.adapter.g0$b$b, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1$2", f = "PDFComicAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0106b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ g0 b;
            final /* synthetic */ com.zentraedi.comic.adapter.d c;
            final /* synthetic */ y2 d;
            final /* synthetic */ int e;
            final /* synthetic */ Object f;
            final /* synthetic */ com.zentraedi.outreader.reader.h g;
            final /* synthetic */ Bitmap h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0106b(g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap, Continuation<? super C0106b> continuation) {
                super(2, continuation);
                this.b = g0Var;
                this.c = dVar;
                this.d = y2Var;
                this.e = i;
                this.f = obj;
                this.g = hVar;
                this.h = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0106b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.o0(this.c, this.d, this.e, this.f, this.g)) {
                    this.b.p0(this.h.getWidth(), this.h.getHeight(), this.d);
                    this.d.E.setImageBitmap(this.h);
                    this.d.E.setTag(this.h);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0106b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1$3", f = "PDFComicAdapter.kt", i = {0, 1, 1}, l = {com.zentraedi.reader.a.G2, 189}, m = "invokeSuspend", n = {"bitmapForPipeline", "bitmapForPipeline", "newBitmap"}, s = {"L$0", "L$0", "L$1"}, v = 1)
        @SourceDebugExtension({"SMAP\nPDFComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadAndMergeTwoPages$job$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n1#2:623\n*E\n"})
        static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            Object a;
            Object b;
            int c;
            final /* synthetic */ g0 d;
            final /* synthetic */ Bitmap e;
            final /* synthetic */ int f;
            final /* synthetic */ com.zentraedi.comic.adapter.d g;
            final /* synthetic */ y2 h;
            final /* synthetic */ Object i;
            final /* synthetic */ com.zentraedi.outreader.reader.h j;

            @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadAndMergeTwoPages$job$1$3$1", f = "PDFComicAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ g0 b;
                final /* synthetic */ com.zentraedi.comic.adapter.d c;
                final /* synthetic */ y2 d;
                final /* synthetic */ int e;
                final /* synthetic */ Object f;
                final /* synthetic */ com.zentraedi.outreader.reader.h g;
                final /* synthetic */ Bitmap h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = g0Var;
                    this.c = dVar;
                    this.d = y2Var;
                    this.e = i;
                    this.f = obj;
                    this.g = hVar;
                    this.h = bitmap;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.b.o0(this.c, this.d, this.e, this.f, this.g)) {
                        this.b.p0(this.h.getWidth(), this.h.getHeight(), this.d);
                        this.d.E.setImageBitmap(this.h);
                        this.d.E.setTag(this.h);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                    return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g0 g0Var, Bitmap bitmap, int i, com.zentraedi.comic.adapter.d dVar, y2 y2Var, Object obj, com.zentraedi.outreader.reader.h hVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.d = g0Var;
                this.e = bitmap;
                this.f = i;
                this.g = dVar;
                this.h = y2Var;
                this.i = obj;
                this.j = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0181, code lost:
            
                if (kotlinx.coroutines.i.h(r13, r3, r12) == r0) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 391
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.adapter.g0.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.zentraedi.outreader.reader.h hVar, int i, int i2, int i3, com.zentraedi.comic.adapter.d dVar, y2 y2Var, Object obj, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f = hVar;
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = dVar;
            this.k = y2Var;
            this.l = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00cc A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:10:0x0021, B:19:0x004b, B:30:0x007f, B:33:0x0085, B:37:0x00cc, B:39:0x00d4, B:42:0x00ff, B:21:0x0052, B:27:0x006b, B:24:0x005b), top: B:48:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:10:0x0021, B:19:0x004b, B:30:0x007f, B:33:0x0085, B:37:0x00cc, B:39:0x00d4, B:42:0x00ff, B:21:0x0052, B:27:0x006b, B:24:0x005b), top: B:48:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:10:0x0021, B:19:0x004b, B:30:0x007f, B:33:0x0085, B:37:0x00cc, B:39:0x00d4, B:42:0x00ff, B:21:0x0052, B:27:0x006b, B:24:0x005b), top: B:48:0x000d }] */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
        
            if (kotlinx.coroutines.i.h(r2, r7, r24) == r0) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.adapter.g0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadPageBitmap$2", f = "PDFComicAdapter.kt", i = {0}, l = {623}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, s = {"I$1"}, v = 1)
    @SourceDebugExtension({"SMAP\nPDFComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadPageBitmap$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,622:1\n426#2,11:623\n*S KotlinDebug\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadPageBitmap$2\n*L\n214#1:623,11\n*E\n"})
    static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Bitmap>, Object> {
        Object a;
        int b;
        int c;
        int d;
        final /* synthetic */ com.zentraedi.outreader.reader.h e;
        final /* synthetic */ int f;

        public static final class a implements com.zentraedi.reader.g {
            final /* synthetic */ kotlinx.coroutines.n<Bitmap> a;

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.n<? super Bitmap> nVar) {
                this.a = nVar;
            }

            @Override // com.zentraedi.reader.g
            public void a(int i, int i2, int i3) {
            }

            @Override // com.zentraedi.reader.g
            public void b(int i, Bitmap bitmap) {
                if (this.a.isActive()) {
                    kotlinx.coroutines.n<Bitmap> nVar = this.a;
                    Result.Companion companion = Result.Companion;
                    nVar.resumeWith(Result.m6constructorimpl(bitmap));
                }
            }
        }

        static final class b implements Function1<Throwable, Unit> {
            public static final b a = new b();

            b() {
            }

            public final void a(Throwable th2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.zentraedi.outreader.reader.h hVar, int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.e = hVar;
            this.f = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.outreader.reader.h hVar = this.e;
                    int i2 = this.f;
                    this.a = hVar;
                    this.b = i2;
                    this.c = 0;
                    this.d = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt.intercepted(this), 1);
                    pVar.Z();
                    hVar.k(i2 + 1, new a(pVar));
                    pVar.S(b.a);
                    obj = pVar.u();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (Bitmap) obj;
            } catch (Exception e) {
                nd.a.c("PDFComicAdapter", "Error loading page bitmap: " + e.getMessage());
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Bitmap> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d implements com.zentraedi.reader.g {
        final /* synthetic */ com.zentraedi.comic.adapter.d b;
        final /* synthetic */ y2 c;
        final /* synthetic */ int d;
        final /* synthetic */ Object e;
        final /* synthetic */ com.zentraedi.outreader.reader.h f;

        @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1", f = "PDFComicAdapter.kt", i = {0}, l = {392}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
        @SourceDebugExtension({"SMAP\nPDFComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,622:1\n179#2,8:623\n179#2,8:631\n*S KotlinDebug\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1\n*L\n382#1:623,8\n409#1:631,8\n*E\n"})
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ g0 c;
            final /* synthetic */ com.zentraedi.comic.adapter.d d;
            final /* synthetic */ y2 e;
            final /* synthetic */ int f;
            final /* synthetic */ Object g;
            final /* synthetic */ com.zentraedi.outreader.reader.h h;
            final /* synthetic */ Bitmap i;

            /* JADX INFO: renamed from: com.zentraedi.comic.adapter.g0$d$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1\n*L\n1#1,778:1\n383#2,6:779\n*E\n"})
            public static final class C0107a implements Function0<Unit> {
                final /* synthetic */ Object a;
                final /* synthetic */ g0 b;
                final /* synthetic */ com.zentraedi.comic.adapter.d c;
                final /* synthetic */ y2 d;
                final /* synthetic */ int e;
                final /* synthetic */ Object f;
                final /* synthetic */ com.zentraedi.outreader.reader.h g;
                final /* synthetic */ Bitmap h;

                public C0107a(Object obj, g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj2, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap) {
                    this.a = obj;
                    this.b = g0Var;
                    this.c = dVar;
                    this.d = y2Var;
                    this.e = i;
                    this.f = obj2;
                    this.g = hVar;
                    this.h = bitmap;
                }

                public final void a() {
                    if (this.b.o0(this.c, this.d, this.e, this.f, this.g)) {
                        this.d.E.setTag(this.h);
                        this.b.p0(this.h.getWidth(), this.h.getHeight(), this.d);
                        this.d.E.setImageBitmap(this.h);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.INSTANCE;
                }
            }

            @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1\n*L\n1#1,778:1\n411#2,7:779\n*E\n"})
            public static final class b implements Function0<Unit> {
                final /* synthetic */ Object a;
                final /* synthetic */ g0 b;
                final /* synthetic */ com.zentraedi.comic.adapter.d c;
                final /* synthetic */ y2 d;
                final /* synthetic */ int e;
                final /* synthetic */ Object f;
                final /* synthetic */ com.zentraedi.outreader.reader.h g;
                final /* synthetic */ Bitmap h;

                public b(Object obj, g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj2, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap) {
                    this.a = obj;
                    this.b = g0Var;
                    this.c = dVar;
                    this.d = y2Var;
                    this.e = i;
                    this.f = obj2;
                    this.g = hVar;
                    this.h = bitmap;
                }

                public final void a() {
                    if (this.b.o0(this.c, this.d, this.e, this.f, this.g)) {
                        this.d.E.setTag(this.h);
                        this.b.p0(this.h.getWidth(), this.h.getHeight(), this.d);
                        this.d.E.setImageBitmap(this.h);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.zentraedi.comic.adapter.PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1$newBitmap$1", f = "PDFComicAdapter.kt", i = {0}, l = {TBSOneErrorCodes.CLASS_NOT_FOUND}, m = "invokeSuspend", n = {"bitmapForPipeline"}, s = {"L$0"}, v = 1)
            @SourceDebugExtension({"SMAP\nPDFComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicAdapter.kt\ncom/zentraedi/comic/adapter/PDFComicAdapter$loadSinglePage$1$onPageDrawBitmap$job$1$newBitmap$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n1#2:623\n*E\n"})
            static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Bitmap>, Object> {
                Object a;
                int b;
                final /* synthetic */ g0 c;
                final /* synthetic */ Bitmap d;
                final /* synthetic */ int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(g0 g0Var, Bitmap bitmap, int i, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.c = g0Var;
                    this.d = bitmap;
                    this.e = i;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Bitmap bitmapCopy;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.c.D0()) {
                        Bitmap.Config config = this.d.getConfig();
                        if (config == null || (bitmapCopy = this.d.copy(config, true)) == null) {
                            return null;
                        }
                    } else {
                        bitmapCopy = this.d;
                    }
                    com.zentraedi.comic.imageprocess.g gVar = new com.zentraedi.comic.imageprocess.g();
                    Layout layoutH = this.c.H();
                    ReadSetting readSetting = this.c.k;
                    Intrinsics.checkNotNull(readSetting);
                    com.zentraedi.comic.imageprocess.g gVarA = gVar.a(new com.zentraedi.comic.imageprocess.j(layoutH, readSetting.k(), this.e));
                    ReadSetting readSetting2 = this.c.k;
                    Intrinsics.checkNotNull(readSetting2);
                    ZoomType zoomTypeQ = readSetting2.q();
                    ReadSetting readSetting3 = this.c.k;
                    Intrinsics.checkNotNull(readSetting3);
                    com.zentraedi.comic.imageprocess.g gVarA2 = gVarA.a(new com.zentraedi.comic.imageprocess.k(zoomTypeQ, readSetting3.o()));
                    ReadSetting readSetting4 = this.c.k;
                    Intrinsics.checkNotNull(readSetting4);
                    Clip clipB = readSetting4.b();
                    ReadSetting readSetting5 = this.c.k;
                    Intrinsics.checkNotNull(readSetting5);
                    com.zentraedi.comic.imageprocess.g gVarA3 = gVarA2.a(new com.zentraedi.comic.imageprocess.a(clipB, readSetting5.c()));
                    ReadSetting readSetting6 = this.c.k;
                    Intrinsics.checkNotNull(readSetting6);
                    boolean zE = readSetting6.e();
                    ReadSetting readSetting7 = this.c.k;
                    Intrinsics.checkNotNull(readSetting7);
                    float fH = readSetting7.h();
                    Context contextF = this.c.F();
                    Intrinsics.checkNotNull(contextF);
                    AssetManager assets = contextF.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    com.zentraedi.comic.imageprocess.g gVarA4 = gVarA3.a(new com.zentraedi.comic.imageprocess.d(zE, fH, assets));
                    ReadSetting readSetting8 = this.c.k;
                    Intrinsics.checkNotNull(readSetting8);
                    boolean zF = readSetting8.f();
                    Context contextF2 = this.c.F();
                    Intrinsics.checkNotNull(contextF2);
                    AssetManager assets2 = contextF2.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets2, "getAssets(...)");
                    com.zentraedi.comic.imageprocess.g gVarA5 = gVarA4.a(new com.zentraedi.comic.imageprocess.e(zF, assets2));
                    ReadSetting readSetting9 = this.c.k;
                    Intrinsics.checkNotNull(readSetting9);
                    boolean zG = readSetting9.g();
                    ReadSetting readSetting10 = this.c.k;
                    Intrinsics.checkNotNull(readSetting10);
                    float fN = readSetting10.n();
                    Context contextF3 = this.c.F();
                    Intrinsics.checkNotNull(contextF3);
                    AssetManager assets3 = contextF3.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets3, "getAssets(...)");
                    com.zentraedi.comic.imageprocess.g gVarA6 = gVarA5.a(new com.zentraedi.comic.imageprocess.h(zG, fN, assets3));
                    this.a = SpillingKt.nullOutSpilledVariable(bitmapCopy);
                    this.b = 1;
                    Object objB = gVarA6.b(bitmapCopy, this);
                    return objB == coroutine_suspended ? coroutine_suspended : objB;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q0 q0Var, Continuation<? super Bitmap> continuation) {
                    return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar, Bitmap bitmap, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = g0Var;
                this.d = dVar;
                this.e = y2Var;
                this.f = i;
                this.g = obj;
                this.h = hVar;
                this.i = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                q0 q0Var = (q0) this.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.c.A0()) {
                            g0 g0Var = this.c;
                            com.zentraedi.comic.adapter.d dVar = this.d;
                            y2 y2Var = this.e;
                            int i2 = this.f;
                            Object obj2 = this.g;
                            com.zentraedi.outreader.reader.h hVar = this.h;
                            Bitmap bitmap = this.i;
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                pe.i.r(new C0107a(q0Var, g0Var, dVar, y2Var, i2, obj2, hVar, bitmap));
                            } else if (g0Var.o0(dVar, y2Var, i2, obj2, hVar)) {
                                y2Var.E.setTag(bitmap);
                                g0Var.p0(bitmap.getWidth(), bitmap.getHeight(), y2Var);
                                y2Var.E.setImageBitmap(bitmap);
                            }
                            return Unit.INSTANCE;
                        }
                        m0 m0VarA = g1.a();
                        c cVar = new c(this.c, this.i, this.f, null);
                        this.b = q0Var;
                        this.a = 1;
                        obj = kotlinx.coroutines.i.h(m0VarA, cVar, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Bitmap bitmap2 = (Bitmap) obj;
                    if (bitmap2 == null) {
                        return Unit.INSTANCE;
                    }
                    g0 g0Var2 = this.c;
                    com.zentraedi.comic.adapter.d dVar2 = this.d;
                    y2 y2Var2 = this.e;
                    int i3 = this.f;
                    Object obj3 = this.g;
                    com.zentraedi.outreader.reader.h hVar2 = this.h;
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        pe.i.r(new b(q0Var, g0Var2, dVar2, y2Var2, i3, obj3, hVar2, bitmap2));
                    } else if (g0Var2.o0(dVar2, y2Var2, i3, obj3, hVar2)) {
                        y2Var2.E.setTag(bitmap2);
                        g0Var2.p0(bitmap2.getWidth(), bitmap2.getHeight(), y2Var2);
                        y2Var2.E.setImageBitmap(bitmap2);
                    }
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    nd.a.c("PDFComicAdapter", "Error processing bitmap: " + e.getMessage());
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        d(com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar) {
            this.b = dVar;
            this.c = y2Var;
            this.d = i;
            this.e = obj;
            this.f = hVar;
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, Bitmap bitmap) {
            if (bitmap == null || !g0.this.o0(this.b, this.c, this.d, this.e, this.f)) {
                return;
            }
            g0.this.j.put(Integer.valueOf(this.d), kotlinx.coroutines.i.e(g0.this.i, (CoroutineContext) null, (CoroutineStart) null, new a(g0.this, this.b, this.c, this.d, this.e, this.f, bitmap, null), 3, (Object) null));
        }
    }

    public static final class e implements com.zentraedi.reader.g {
        final /* synthetic */ y2 a;
        final /* synthetic */ Ref.BooleanRef b;
        final /* synthetic */ com.zentraedi.comic.adapter.d c;
        final /* synthetic */ int d;
        final /* synthetic */ Object e;
        final /* synthetic */ g0 f;
        final /* synthetic */ PDFTronZReader g;
        final /* synthetic */ Layout h;
        final /* synthetic */ ReadModel i;

        e(y2 y2Var, Ref.BooleanRef booleanRef, com.zentraedi.comic.adapter.d dVar, int i, Object obj, g0 g0Var, PDFTronZReader pDFTronZReader, Layout layout, ReadModel readModel) {
            this.a = y2Var;
            this.b = booleanRef;
            this.c = dVar;
            this.d = i;
            this.e = obj;
            this.f = g0Var;
            this.g = pDFTronZReader;
            this.h = layout;
            this.i = readModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(com.zentraedi.comic.adapter.d dVar, int i, y2 y2Var, Object obj, g0 g0Var, PDFTronZReader pDFTronZReader, Bitmap bitmap, Layout layout, ReadModel readModel) {
            if (Intrinsics.areEqual(((RecyclerView.ViewHolder) dVar).itemView.getTag(), Integer.valueOf(i)) && y2Var.E.getTag(com.zentraedi.comic.q.i.aJ) == obj && g0Var.l0() == pDFTronZReader && !bitmap.isRecycled()) {
                if (layout != Layout.SINGLE) {
                    y2Var.E.setImageBitmap(bitmap);
                } else {
                    Rect rectA = com.zentraedi.comic.view.o.a(bitmap.getWidth(), bitmap.getHeight(), i, readModel);
                    y2Var.E.setImageBitmap(Bitmap.createBitmap(bitmap, rectA.left, rectA.top, rectA.width(), rectA.height()));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Ref.BooleanRef booleanRef, com.zentraedi.comic.adapter.d dVar, int i, y2 y2Var, Object obj, g0 g0Var, PDFTronZReader pDFTronZReader, Layout layout, int i2, int i3) {
            if (!booleanRef.element && Intrinsics.areEqual(((RecyclerView.ViewHolder) dVar).itemView.getTag(), Integer.valueOf(i)) && y2Var.E.getTag(com.zentraedi.comic.q.i.aJ) == obj && g0Var.l0() == pDFTronZReader) {
                if (layout == Layout.SINGLE) {
                    i2 /= 2;
                }
                g0Var.p0(RangesKt.coerceAtLeast(i2, 1), i3, y2Var);
            }
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, final int i2, final int i3) {
            if (i2 <= 0 || i3 <= 0) {
                return;
            }
            final y2 y2Var = this.a;
            ComicTiledImageView comicTiledImageView = y2Var.E;
            final Ref.BooleanRef booleanRef = this.b;
            final com.zentraedi.comic.adapter.d dVar = this.c;
            final int i4 = this.d;
            final Object obj = this.e;
            final g0 g0Var = this.f;
            final PDFTronZReader pDFTronZReader = this.g;
            final Layout layout = this.h;
            comicTiledImageView.post(new Runnable() { // from class: com.zentraedi.comic.adapter.h0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.f(booleanRef, dVar, i4, y2Var, obj, g0Var, pDFTronZReader, layout, i2, i3);
                }
            });
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, final Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            final y2 y2Var = this.a;
            ComicTiledImageView comicTiledImageView = y2Var.E;
            final com.zentraedi.comic.adapter.d dVar = this.c;
            final int i2 = this.d;
            final Object obj = this.e;
            final g0 g0Var = this.f;
            final PDFTronZReader pDFTronZReader = this.g;
            final Layout layout = this.h;
            final ReadModel readModel = this.i;
            comicTiledImageView.post(new Runnable() { // from class: com.zentraedi.comic.adapter.i0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.e(dVar, i2, y2Var, obj, g0Var, pDFTronZReader, bitmap, layout, readModel);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0() {
        ReadSetting readSetting = this.k;
        if (readSetting == null) {
            return false;
        }
        return H() != Layout.COMMON || readSetting.q() == ZoomType.CUSTOM || readSetting.b() != Clip.NORMAL || D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D0() {
        ReadSetting readSetting = this.k;
        if (readSetting == null) {
            return false;
        }
        return readSetting.e() || readSetting.f() || readSetting.g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void j0() {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ComicTiledImageView comicTiledImageView = (ComicTiledImageView) recyclerView.getChildAt(i).findViewById(com.zentraedi.comic.q.i.zx);
                if (comicTiledImageView != null) {
                    comicTiledImageView.setImageDrawable(null);
                    comicTiledImageView.u();
                    comicTiledImageView.setTag(com.zentraedi.comic.q.i.aJ, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o0(com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, com.zentraedi.outreader.reader.h hVar) {
        return Intrinsics.areEqual(((RecyclerView.ViewHolder) dVar).itemView.getTag(), Integer.valueOf(i)) && y2Var.E.getTag(com.zentraedi.comic.q.i.aJ) == obj && this.f == hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i, int i2, y2 y2Var) {
        int i3;
        int iG = g8.g(g8.h());
        int iD = com.zentraedi.basic.function.utils.a.a().getResources().getConfiguration().orientation == 2 ? g8.d() : g8.d() - g8.h();
        ViewGroup.LayoutParams layoutParams = y2Var.E.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = y2Var.F.getLayoutParams();
        layoutParams2.removeRule(20);
        layoutParams2.removeRule(10);
        layoutParams2.removeRule(21);
        layoutParams2.removeRule(12);
        layoutParams2.removeRule(13);
        layoutParams2.removeRule(14);
        layoutParams2.removeRule(15);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        ReadSetting readSetting = this.k;
        ReadModel readModelK = readSetting != null ? readSetting.k() : null;
        if ((readModelK == null ? -1 : a.$EnumSwitchMapping$2[readModelK.ordinal()]) == 1) {
            ReadSetting readSetting2 = this.k;
            ZoomType zoomTypeQ = readSetting2 != null ? readSetting2.q() : null;
            i3 = zoomTypeQ != null ? a.$EnumSwitchMapping$1[zoomTypeQ.ordinal()] : -1;
            if (i3 == 1) {
                float f = iG / i;
                this.l = f;
                layoutParams2.width = iG;
                int i4 = (int) (i2 * f);
                layoutParams2.height = i4;
                layoutParams3.width = iG;
                layoutParams3.height = i4;
                com.zentraedi.comic.view.e0 e0Var = this.h;
                if (e0Var != null) {
                    e0Var.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var2 = this.h;
                if (e0Var2 != null) {
                    e0Var2.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(13);
            } else if (i3 != 2) {
                float f2 = i;
                float f3 = i2;
                float fMin = Math.min(iG / f2, iD / f3);
                int i5 = (int) (f2 * fMin);
                layoutParams2.width = i5;
                int i6 = (int) (f3 * fMin);
                layoutParams2.height = i6;
                layoutParams3.width = i5;
                layoutParams3.height = i6;
                layoutParams2.addRule(13);
                com.zentraedi.comic.view.e0 e0Var3 = this.h;
                if (e0Var3 != null) {
                    e0Var3.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var4 = this.h;
                if (e0Var4 != null) {
                    e0Var4.setCanMoveY(0.0f);
                }
            } else {
                float f4 = iD / i2;
                this.l = f4;
                layoutParams2.height = iD;
                int i7 = (int) (i * f4);
                layoutParams2.width = i7;
                if (i7 <= iG) {
                    i7 = iG;
                }
                layoutParams3.width = i7;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var5 = this.h;
                if (e0Var5 != null) {
                    int i8 = layoutParams2.width;
                    e0Var5.setCanMoveX(i8 > iG ? i8 - iG : 0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var6 = this.h;
                if (e0Var6 != null) {
                    e0Var6.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(13);
            }
        } else {
            ReadSetting readSetting3 = this.k;
            ZoomType zoomTypeQ2 = readSetting3 != null ? readSetting3.q() : null;
            i3 = zoomTypeQ2 != null ? a.$EnumSwitchMapping$1[zoomTypeQ2.ordinal()] : -1;
            if (i3 == 1) {
                float f5 = iG / i;
                this.l = f5;
                layoutParams2.width = iG;
                int i9 = (int) (i2 * f5);
                layoutParams2.height = i9;
                layoutParams3.width = iG;
                if (i9 <= iD) {
                    i9 = iD;
                }
                layoutParams3.height = i9;
                com.zentraedi.comic.view.e0 e0Var7 = this.h;
                if (e0Var7 != null) {
                    e0Var7.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var8 = this.h;
                if (e0Var8 != null) {
                    int i10 = layoutParams2.height;
                    e0Var8.setCanMoveY(i10 > iD ? i10 - iD : 0.0f);
                }
                layoutParams2.addRule(10);
                layoutParams2.addRule(14);
            } else if (i3 != 2) {
                float f6 = i;
                float f7 = i2;
                float fMin2 = Math.min(iG / f6, iD / f7);
                int i11 = (int) (f6 * fMin2);
                layoutParams2.width = i11;
                layoutParams2.height = (int) (f7 * fMin2);
                this.l = fMin2;
                layoutParams3.width = i11;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var9 = this.h;
                if (e0Var9 != null) {
                    e0Var9.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var10 = this.h;
                if (e0Var10 != null) {
                    e0Var10.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(14);
                layoutParams2.addRule(10);
            } else {
                float f8 = iD / i2;
                this.l = f8;
                layoutParams2.height = iD;
                int i12 = (int) (i * f8);
                layoutParams2.width = i12;
                layoutParams3.width = i12;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var11 = this.h;
                if (e0Var11 != null) {
                    e0Var11.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var12 = this.h;
                if (e0Var12 != null) {
                    e0Var12.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(10);
                layoutParams2.addRule(14);
            }
        }
        y2Var.E.setLayoutParams(layoutParams2);
        y2Var.F.setLayoutParams(layoutParams3);
    }

    private final void r0(com.zentraedi.comic.adapter.d dVar, int i, int i2, int i3, y2 y2Var, Object obj) {
        com.zentraedi.outreader.reader.h hVar;
        if (i3 < G().size() && (hVar = this.f) != null) {
            this.j.put(Integer.valueOf(i), kotlinx.coroutines.i.e(this.i, g1.e(), (CoroutineStart) null, new b(hVar, i2, i3, i, dVar, y2Var, obj, null), 2, (Object) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(com.zentraedi.outreader.reader.h hVar, int i, Continuation<? super Bitmap> continuation) {
        return kotlinx.coroutines.i.h(g1.c(), new c(hVar, i, null), continuation);
    }

    private final void t0(y2 y2Var, m6 m6Var, int i, com.zentraedi.comic.adapter.d dVar, Object obj) {
        com.zentraedi.outreader.reader.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.k(m6Var.getPosition() + 1, new d(dVar, y2Var, i, obj, hVar));
    }

    private final void u0(final y2 y2Var, final int i, final int i2, com.zentraedi.comic.adapter.d dVar) {
        ReadModel readModelK;
        com.zentraedi.outreader.reader.h hVar = this.f;
        final PDFTronZReader pDFTronZReader = hVar instanceof PDFTronZReader ? (PDFTronZReader) hVar : null;
        if (pDFTronZReader == null) {
            return;
        }
        final Layout layoutH = H();
        ReadSetting readSetting = this.k;
        if (readSetting == null || (readModelK = readSetting.k()) == null) {
            readModelK = ReadModel.NORMAL_NULL;
        }
        final ReadModel readModel = readModelK;
        final Object obj = new Object();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        y2Var.E.setTag(com.zentraedi.comic.q.i.aJ, obj);
        y2Var.E.setZoomRecyclerView(this.h);
        y2Var.E.setTileQuality(1.0f);
        y2Var.E.s(new Function0() { // from class: com.zentraedi.comic.adapter.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.v0(pDFTronZReader, i, layoutH, i2, readModel);
            }
        }, new Function2() { // from class: com.zentraedi.comic.adapter.d0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return g0.w0(y2Var, obj, booleanRef, this, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        pDFTronZReader.g(i, new e(y2Var, booleanRef, dVar, i2, obj, this, pDFTronZReader, layoutH, readModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicTiledImageView.c v0(PDFTronZReader pDFTronZReader, int i, Layout layout, int i2, ReadModel readModel) {
        com.zentraedi.comic.view.f fVar = new com.zentraedi.comic.view.f(pDFTronZReader, i);
        return layout == Layout.SINGLE ? new com.zentraedi.comic.view.h(fVar, com.zentraedi.comic.view.o.a(fVar.getWidth(), fVar.getHeight(), i2, readModel)) : fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(y2 y2Var, Object obj, Ref.BooleanRef booleanRef, g0 g0Var, int i, int i2) {
        if (y2Var.E.getTag(com.zentraedi.comic.q.i.aJ) == obj) {
            booleanRef.element = true;
            g0Var.p0(i, i2, y2Var);
        }
        return Unit.INSTANCE;
    }

    private final void x0(final y2 y2Var, final int i, final int i2, final int i3, final com.zentraedi.comic.adapter.d dVar, final Object obj) {
        com.zentraedi.outreader.reader.h hVar = this.f;
        final PDFTronZReader pDFTronZReader = hVar instanceof PDFTronZReader ? (PDFTronZReader) hVar : null;
        if (pDFTronZReader == null) {
            return;
        }
        final Layout layoutH = H();
        y2Var.E.setZoomRecyclerView(this.h);
        y2Var.E.setTileQuality(1.0f);
        y2Var.E.s(new Function0() { // from class: com.zentraedi.comic.adapter.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.y0(pDFTronZReader, i, i2, layoutH);
            }
        }, new Function2() { // from class: com.zentraedi.comic.adapter.f0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return g0.z0(this.a, dVar, y2Var, i3, obj, pDFTronZReader, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicTiledImageView.c y0(PDFTronZReader pDFTronZReader, int i, int i2, Layout layout) {
        com.zentraedi.comic.view.f fVar = new com.zentraedi.comic.view.f(pDFTronZReader, i);
        com.zentraedi.comic.view.f fVar2 = new com.zentraedi.comic.view.f(pDFTronZReader, i2);
        return layout == Layout.DOUBLE_REVERSAL ? new com.zentraedi.comic.view.e(fVar2, fVar) : new com.zentraedi.comic.view.e(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(g0 g0Var, com.zentraedi.comic.adapter.d dVar, y2 y2Var, int i, Object obj, PDFTronZReader pDFTronZReader, int i2, int i3) {
        if (g0Var.o0(dVar, y2Var, i, obj, pDFTronZReader)) {
            g0Var.p0(i2, i3, y2Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: Exception -> 0x0127, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0127, blocks: (B:35:0x00d3, B:38:0x00df, B:58:0x011b, B:42:0x00ef, B:47:0x00f9), top: B:95:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x00cd, B:40:0x00e7, B:60:0x0122, B:44:0x00f3, B:49:0x00fd, B:51:0x0101, B:52:0x0105, B:54:0x0109, B:56:0x010f, B:62:0x012a, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0142, B:74:0x0146, B:76:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x0166, B:83:0x0171, B:84:0x0187), top: B:92:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0134 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x00cd, B:40:0x00e7, B:60:0x0122, B:44:0x00f3, B:49:0x00fd, B:51:0x0101, B:52:0x0105, B:54:0x0109, B:56:0x010f, B:62:0x012a, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0142, B:74:0x0146, B:76:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x0166, B:83:0x0171, B:84:0x0187), top: B:92:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x00cd, B:40:0x00e7, B:60:0x0122, B:44:0x00f3, B:49:0x00fd, B:51:0x0101, B:52:0x0105, B:54:0x0109, B:56:0x010f, B:62:0x012a, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0142, B:74:0x0146, B:76:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x0166, B:83:0x0171, B:84:0x0187), top: B:92:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x00cd, B:40:0x00e7, B:60:0x0122, B:44:0x00f3, B:49:0x00fd, B:51:0x0101, B:52:0x0105, B:54:0x0109, B:56:0x010f, B:62:0x012a, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0142, B:74:0x0146, B:76:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x0166, B:83:0x0171, B:84:0x0187), top: B:92:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0187 A[Catch: Exception -> 0x019d, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x00cd, B:40:0x00e7, B:60:0x0122, B:44:0x00f3, B:49:0x00fd, B:51:0x0101, B:52:0x0105, B:54:0x0109, B:56:0x010f, B:62:0x012a, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0142, B:74:0x0146, B:76:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x0166, B:83:0x0171, B:84:0x0187), top: B:92:0x00cd }] */
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.comic.adapter.d holder, @SuppressLint({"RecyclerView"}) int i) {
        y2 y2Var;
        ReadSetting readSetting;
        ZoomType zoomTypeQ;
        ReadSetting readSetting2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Layout layoutH = H();
        Layout layout = Layout.DOUBLE;
        androidx.databinding.a aVar = (layoutH == layout || H() == Layout.DOUBLE_REVERSAL) ? G().get(Math.min(i * 2, G().size() - 1)) : G().get(i);
        androidx.databinding.a aVar2 = (H() == layout || H() == Layout.DOUBLE_REVERSAL) ? G().get(Math.min((i * 2) + 1, G().size() - 1)) : null;
        if ((aVar instanceof m6) && (y2Var = (y2) androidx.databinding.m.a(((RecyclerView.ViewHolder) holder).itemView)) != null) {
            Object tag = ((RecyclerView.ViewHolder) holder).itemView.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                k2 k2VarRemove = this.j.remove(Integer.valueOf(num.intValue()));
                if (k2VarRemove != null) {
                    k2.a.b(k2VarRemove, (CancellationException) null, 1, (Object) null);
                }
            }
            k2 k2VarRemove2 = this.j.remove(Integer.valueOf(i));
            if (k2VarRemove2 != null) {
                k2.a.b(k2VarRemove2, (CancellationException) null, 1, (Object) null);
            }
            y2Var.E.setImageBitmap(null);
            y2Var.E.u();
            Object obj = new Object();
            y2Var.E.setTag(com.zentraedi.comic.q.i.aJ, obj);
            ((RecyclerView.ViewHolder) holder).itemView.setTag(Integer.valueOf(i));
            try {
                if (H() != layout) {
                    try {
                        if (H() == Layout.DOUBLE_REVERSAL) {
                            if (!(aVar2 instanceof m6)) {
                                return;
                            }
                            readSetting = this.k;
                            if (readSetting != null) {
                                zoomTypeQ = readSetting.q();
                            } else {
                                zoomTypeQ = null;
                            }
                            if (zoomTypeQ == ZoomType.CUSTOM) {
                                try {
                                    r0(holder, i, ((m6) aVar).getPosition(), ((m6) aVar2).getPosition(), y2Var, obj);
                                    y2Var = y2Var;
                                } catch (Exception unused) {
                                    y2Var = y2Var;
                                }
                            } else {
                                readSetting2 = this.k;
                                if ((readSetting2 != null ? readSetting2.b() : null) == Clip.NORMAL || D0() || !(this.f instanceof PDFTronZReader)) {
                                    r0(holder, i, ((m6) aVar).getPosition(), ((m6) aVar2).getPosition(), y2Var, obj);
                                    y2Var = y2Var;
                                } else if (((m6) aVar).getPosition() == ((m6) aVar2).getPosition()) {
                                    u0(y2Var, ((m6) aVar).getPosition() + 1, i, holder);
                                } else {
                                    x0(y2Var, ((m6) aVar).getPosition() + 1, ((m6) aVar2).getPosition() + 1, i, holder, obj);
                                }
                            }
                        } else if (H() == Layout.COMMON || H() == Layout.SINGLE) {
                            ReadSetting readSetting3 = this.k;
                            if ((readSetting3 != null ? readSetting3.q() : null) == ZoomType.CUSTOM) {
                                t0(y2Var, (m6) aVar, i, holder, obj);
                            } else {
                                ReadSetting readSetting4 = this.k;
                                if ((readSetting4 != null ? readSetting4.b() : null) != Clip.NORMAL || D0()) {
                                    t0(y2Var, (m6) aVar, i, holder, obj);
                                } else {
                                    u0(y2Var, ((m6) aVar).getPosition() + 1, i, holder);
                                }
                            }
                        } else {
                            t0(y2Var, (m6) aVar, i, holder, obj);
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    if (!(aVar2 instanceof m6)) {
                        return;
                    }
                    readSetting = this.k;
                    if (readSetting != null) {
                        zoomTypeQ = readSetting.q();
                    } else {
                        zoomTypeQ = null;
                    }
                    if (zoomTypeQ == ZoomType.CUSTOM) {
                        r0(holder, i, ((m6) aVar).getPosition(), ((m6) aVar2).getPosition(), y2Var, obj);
                        y2Var = y2Var;
                    } else {
                        readSetting2 = this.k;
                        if ((readSetting2 != null ? readSetting2.b() : null) == Clip.NORMAL) {
                            r0(holder, i, ((m6) aVar).getPosition(), ((m6) aVar2).getPosition(), y2Var, obj);
                            y2Var = y2Var;
                        } else {
                            r0(holder, i, ((m6) aVar).getPosition(), ((m6) aVar2).getPosition(), y2Var, obj);
                            y2Var = y2Var;
                        }
                    }
                }
            } catch (Exception unused3) {
            }
            y2Var.u();
        }
    }

    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@fo.k com.zentraedi.comic.adapter.d holder) {
        ComicTiledImageView comicTiledImageView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object tag = ((RecyclerView.ViewHolder) holder).itemView.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            k2 k2VarRemove = this.j.remove(Integer.valueOf(num.intValue()));
            if (k2VarRemove != null) {
                k2.a.b(k2VarRemove, (CancellationException) null, 1, (Object) null);
            }
        }
        y2 y2Var = (y2) androidx.databinding.m.g(((RecyclerView.ViewHolder) holder).itemView);
        if (y2Var != null && (comicTiledImageView = y2Var.E) != null) {
            comicTiledImageView.setImageDrawable(null);
            comicTiledImageView.u();
            comicTiledImageView.setTag(com.zentraedi.comic.q.i.aJ, null);
        }
        super.onViewRecycled(holder);
    }

    @Override // com.zentraedi.comic.adapter.a
    public void D(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        List<? extends androidx.databinding.a> arrayList = new ArrayList<>();
        int i = a.$EnumSwitchMapping$0[layout.ordinal()];
        if (i == 1) {
            for (androidx.databinding.a aVar : G()) {
                arrayList.add(aVar);
                arrayList.add(aVar);
            }
            S(layout);
            U(arrayList);
            return;
        }
        if (i == 2) {
            S(layout);
            List<androidx.databinding.a> listG = G();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listG) {
                androidx.databinding.a aVar2 = (androidx.databinding.a) obj;
                Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.PDFComicReaderItemViewModel");
                if (hashSet.add(Integer.valueOf(((m6) aVar2).getPosition()))) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            U(arrayList);
            return;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (H() != Layout.SINGLE) {
            S(layout);
            notifyDataSetChanged();
            return;
        }
        S(layout);
        List<androidx.databinding.a> listG2 = G();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listG2) {
            androidx.databinding.a aVar3 = (androidx.databinding.a) obj2;
            Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.PDFComicReaderItemViewModel");
            if (hashSet2.add(Integer.valueOf(((m6) aVar3).getPosition()))) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(CollectionsKt.toMutableList((Collection) arrayList3));
        U(arrayList);
    }

    public final void E0() {
        Iterator<T> it = this.j.values().iterator();
        while (it.hasNext()) {
            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.j.clear();
        j0();
        com.zentraedi.outreader.reader.h hVar = this.f;
        if (hVar != null) {
            hVar.onDestroy();
        }
        this.f = null;
    }

    public final void F0(@fo.l Activity activity, @fo.l com.zentraedi.outreader.reader.h hVar, @fo.l com.zentraedi.comic.view.e0 e0Var) {
        E0();
        if (e0Var != null) {
            this.h = e0Var;
        }
        this.f = hVar;
        if (activity != null) {
            R(activity);
        }
        notifyDataSetChanged();
    }

    public final void G0(@fo.l com.zentraedi.outreader.reader.h hVar) {
        this.f = hVar;
    }

    public final void H0(float f) {
        this.l = f;
    }

    @Override // com.zentraedi.comic.adapter.a
    @fo.l
    public ReadSetting J() {
        return this.k;
    }

    @Override // com.zentraedi.comic.adapter.a
    public float L() {
        return this.l;
    }

    @Override // com.zentraedi.comic.adapter.a
    public void V(@fo.l ReadSetting readSetting) {
        this.k = readSetting;
    }

    @Override // com.zentraedi.comic.adapter.a
    public void W(float f) {
        this.l = f;
    }

    public final void k0() {
        Iterator<T> it = this.j.values().iterator();
        while (it.hasNext()) {
            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.j.clear();
        r0.f(this.i, (CancellationException) null, 1, (Object) null);
        j0();
        com.zentraedi.outreader.reader.h hVar = this.f;
        if (hVar != null) {
            hVar.onDestroy();
        }
        this.f = null;
    }

    @fo.l
    public final com.zentraedi.outreader.reader.h l0() {
        return this.f;
    }

    public final float m0() {
        return this.l;
    }

    public final void n0(@fo.k Activity context, @fo.l com.zentraedi.outreader.reader.h hVar, @fo.k ComicItemType comicItemType, @fo.l com.zentraedi.comic.view.e0 e0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(comicItemType, "comicItemType");
        this.g = context;
        this.f = hVar;
        R(context);
        if (e0Var == null) {
            return;
        }
        this.h = e0Var;
    }
}
