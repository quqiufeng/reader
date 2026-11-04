package com.zentraedi.comic.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.LruCache;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u2;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicTiledImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,527:1\n1869#2,2:528\n1869#2,2:530\n1193#2,2:532\n1267#2,2:534\n1270#2:537\n1740#2,3:540\n1869#2,2:551\n1869#2,2:560\n1#3:536\n216#4,2:538\n216#4,2:543\n216#4,2:545\n216#4,2:547\n216#4,2:549\n488#5,7:553\n*S KotlinDebug\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView\n*L\n125#1:528,2\n187#1:530,2\n239#1:532,2\n239#1:534,2\n239#1:537\n248#1:540,3\n285#1:551,2\n302#1:560,2\n246#1:538,2\n262#1:543,2\n266#1:545,2\n275#1:547,2\n279#1:549,2\n300#1:553,7\n*E\n"})
public final class ComicTiledImageView extends ImageView {
    private static final int v = 512;
    private static final int w = 4;
    private static final int x = 3;

    @fo.l
    private e0 a;
    private float b;

    @fo.l
    private c c;

    @fo.k
    private q0 d;
    private int e;
    private int f;

    @fo.k
    private final Map<b, k2> g;

    @fo.k
    private final h h;

    @fo.l
    private d i;

    @fo.k
    private final Map<b, Bitmap> j;

    @fo.l
    private d k;

    @fo.k
    private final Map<b, Bitmap> l;

    @fo.k
    private final Map<b, Integer> m;

    @fo.k
    private final Map<b, Long> n;

    @fo.l
    private d o;

    @fo.k
    private final Handler p;

    @fo.k
    private final Paint q;

    @fo.k
    private RectF r;
    private float s;
    private boolean t;

    @fo.k
    public static final a u = new a(null);

    @fo.k
    private static final kotlinx.coroutines.sync.h y = kotlinx.coroutines.sync.l.b(2, 0, 2, (Object) null);

    @fo.k
    private static final q0 z = r0.a(k3.c((k2) null, 1, (Object) null).plus(g1.c()));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            return (int) RangesKt.coerceAtLeast(Math.min(8388608L, Runtime.getRuntime().maxMemory() / 32), 4194304L);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public static /* synthetic */ b f(b bVar, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = bVar.a;
            }
            if ((i5 & 2) != 0) {
                i2 = bVar.b;
            }
            if ((i5 & 4) != 0) {
                i3 = bVar.c;
            }
            if ((i5 & 8) != 0) {
                i4 = bVar.d;
            }
            return bVar.e(i, i2, i3, i4);
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        @fo.k
        public final b e(int i, int i2, int i3, int i4) {
            return new b(i, i2, i3, i4);
        }

        public boolean equals(@fo.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int g() {
            return this.b;
        }

        public final int h() {
            return this.a;
        }

        public int hashCode() {
            return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
        }

        public final int i() {
            return this.d;
        }

        public final int j() {
            return this.c;
        }

        @fo.k
        public String toString() {
            return "TileKey(level=" + this.a + ", column=" + this.b + ", row=" + this.c + ", renderZoomTenth=" + this.d + ')';
        }
    }

    public interface c {

        public static final class a {
            @Deprecated
            public static void a(@fo.k c cVar) {
                n.a(cVar);
            }
        }

        @fo.l
        Bitmap a(@fo.k Rect rect, int i, int i2);

        void close();

        int getHeight();

        int getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {
        private final int a;
        private final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static /* synthetic */ d d(d dVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = dVar.a;
            }
            if ((i3 & 2) != 0) {
                i2 = dVar.b;
            }
            return dVar.c(i, i2);
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @fo.k
        public final d c(int i, int i2) {
            return new d(i, i2);
        }

        public final int e() {
            return this.a;
        }

        public boolean equals(@fo.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int f() {
            return this.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        @fo.k
        public String toString() {
            return "TileVariant(level=" + this.a + ", renderZoomTenth=" + this.b + ')';
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.view.ComicTiledImageView$bindTileSource$1", f = "ComicTiledImageView.kt", i = {0}, l = {80}, m = "invokeSuspend", n = {"opened"}, s = {"L$0"}, v = 1)
    static final class e extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ Function0<c> c;
        final /* synthetic */ int d;
        final /* synthetic */ ComicTiledImageView e;
        final /* synthetic */ Function2<Integer, Integer, Unit> f;

        @DebugMetadata(c = "com.zentraedi.comic.view.ComicTiledImageView$bindTileSource$1$1", f = "ComicTiledImageView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicTiledImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView$bindTileSource$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ int b;
            final /* synthetic */ ComicTiledImageView c;
            final /* synthetic */ Ref.ObjectRef<c> d;
            final /* synthetic */ Function2<Integer, Integer, Unit> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(int i, ComicTiledImageView comicTiledImageView, Ref.ObjectRef<c> objectRef, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = i;
                this.c = comicTiledImageView;
                this.d = objectRef;
                this.e = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Function2<Integer, Integer, Unit> function2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b == this.c.e) {
                    this.c.c = this.d.element;
                    this.d.element = null;
                    c cVar = this.c.c;
                    if (cVar != null && (function2 = this.e) != null) {
                        function2.invoke(Boxing.boxInt(cVar.getWidth()), Boxing.boxInt(cVar.getHeight()));
                    }
                    this.c.invalidate();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function0<? extends c> function0, int i, ComicTiledImageView comicTiledImageView, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = function0;
            this.d = i;
            this.e = comicTiledImageView;
            this.f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.c, this.d, this.e, this.f, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0054 A[PHI: r10
          0x0054: PHI (r10v13 com.zentraedi.comic.view.ComicTiledImageView$c) = (r10v11 com.zentraedi.comic.view.ComicTiledImageView$c), (r10v15 com.zentraedi.comic.view.ComicTiledImageView$c) binds: [B:30:0x006e, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x0063 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {all -> 0x0014, blocks: (B:6:0x0010, B:26:0x005f, B:28:0x0063), top: B:38:0x0007 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            Ref.ObjectRef objectRef;
            Exception exc;
            Ref.ObjectRef objectRef2;
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    try {
                        objectRef3.element = this.c.invoke();
                        u2 u2VarE = g1.e();
                        a aVar = new a(this.d, this.e, objectRef3, this.f, null);
                        this.a = objectRef3;
                        this.b = 1;
                        if (kotlinx.coroutines.i.h(u2VarE, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef3;
                        cVar = (c) objectRef2.element;
                        if (cVar != null) {
                            cVar.close();
                        }
                    } catch (Exception e) {
                        exc = e;
                        objectRef2 = objectRef3;
                        if (!(exc instanceof CancellationException)) {
                            nd.a.d("ComicTiles", "open tile source failed", exc);
                        }
                        cVar = (c) objectRef2.element;
                        if (cVar != null) {
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        objectRef = objectRef3;
                        c cVar2 = (c) objectRef.element;
                        if (cVar2 == null) {
                            throw th2;
                        }
                        cVar2.close();
                        throw th2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        cVar = (c) objectRef2.element;
                        if (cVar != null) {
                            cVar.close();
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (!(exc instanceof CancellationException)) {
                            nd.a.d("ComicTiles", "open tile source failed", exc);
                        }
                        cVar = (c) objectRef2.element;
                        if (cVar != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th2 = th4;
                objectRef = i;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.view.ComicTiledImageView$clearTileSource$1", f = "ComicTiledImageView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.close();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.view.ComicTiledImageView$requestTile$1", f = "ComicTiledImageView.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {528, 354}, m = "invokeSuspend", n = {"$this$launch", "outOfMemory", "$this$withPermit$iv", "$i$f$withPermit", "$this$launch", "outOfMemory", "bitmap", "requestJob", "requestActive"}, s = {"L$0", "L$1", "L$2", "I$2", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicTiledImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView$requestTile$1\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,527:1\n81#2,6:528\n*S KotlinDebug\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView$requestTile$1\n*L\n341#1:528,6\n*E\n"})
    static final class g extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        int f;
        int g;
        boolean h;
        int i;
        private /* synthetic */ Object j;
        final /* synthetic */ Rect k;
        final /* synthetic */ c l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;
        final /* synthetic */ ComicTiledImageView o;
        final /* synthetic */ b p;
        final /* synthetic */ int q;
        final /* synthetic */ int r;

        @DebugMetadata(c = "com.zentraedi.comic.view.ComicTiledImageView$requestTile$1$1", f = "ComicTiledImageView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicTiledImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView$requestTile$1$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n488#2,7:528\n1869#3,2:535\n*S KotlinDebug\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicTiledImageView$requestTile$1$1\n*L\n375#1:528,7\n375#1:535,2\n*E\n"})
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ ComicTiledImageView b;
            final /* synthetic */ b c;
            final /* synthetic */ k2 d;
            final /* synthetic */ boolean e;
            final /* synthetic */ int f;
            final /* synthetic */ int g;
            final /* synthetic */ c h;
            final /* synthetic */ Bitmap i;
            final /* synthetic */ Ref.BooleanRef j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComicTiledImageView comicTiledImageView, b bVar, k2 k2Var, boolean z, int i, int i2, c cVar, Bitmap bitmap, Ref.BooleanRef booleanRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = comicTiledImageView;
                this.c = bVar;
                this.d = k2Var;
                this.e = z;
                this.f = i;
                this.g = i2;
                this.h = cVar;
                this.i = bitmap;
                this.j = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.b.g.get(this.c) == this.d;
                if (z) {
                    this.b.g.remove(this.c);
                    if (!this.e) {
                        this.b.invalidate();
                    }
                }
                if (z && this.e && this.f == this.b.e && this.g == this.b.f && this.b.c == this.h) {
                    Bitmap bitmap = this.i;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.b.m.remove(this.c);
                        this.b.n.remove(this.c);
                        this.b.h.put(this.c, this.i);
                        this.b.invalidate();
                    } else if (this.j.element) {
                        ComicTiledImageView comicTiledImageView = this.b;
                        comicTiledImageView.o = comicTiledImageView.w(this.c);
                        this.b.m.put(this.c, Boxing.boxInt(3));
                        this.b.n.remove(this.c);
                        this.b.l.clear();
                        this.b.h.evictAll();
                        Map map = this.b.g;
                        ComicTiledImageView comicTiledImageView2 = this.b;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (Intrinsics.areEqual(comicTiledImageView2.w((b) entry.getKey()), comicTiledImageView2.o)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
                        }
                        this.b.invalidate();
                    } else {
                        Integer num = (Integer) this.b.m.get(this.c);
                        int iIntValue = (num != null ? num.intValue() : 0) + 1;
                        this.b.m.put(this.c, Boxing.boxInt(iIntValue));
                        if (iIntValue < 3) {
                            long j = ((long) (iIntValue * iIntValue)) * 250;
                            this.b.n.put(this.c, Boxing.boxLong(SystemClock.uptimeMillis() + j));
                            this.b.postInvalidateDelayed(j);
                        } else {
                            this.b.n.remove(this.c);
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Rect rect, c cVar, int i, int i2, ComicTiledImageView comicTiledImageView, b bVar, int i3, int i4, Continuation<? super g> continuation) {
            super(2, continuation);
            this.k = rect;
            this.l = cVar;
            this.m = i;
            this.n = i2;
            this.o = comicTiledImageView;
            this.p = bVar;
            this.q = i3;
            this.r = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
            gVar.j = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r11.e(r24) == r3) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
        
            if (kotlinx.coroutines.i.h(r0, r13, r24) == r3) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
        
            return r3;
         */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x00af: IPUT (r6v0 ?? I:boolean), (r12 I:kotlin.jvm.internal.Ref$BooleanRef) (LINE:176) kotlin.jvm.internal.Ref.BooleanRef.element boolean, block:B:33:0x00af */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.view.ComicTiledImageView.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((g) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class h extends LruCache<b, Bitmap> {
        h(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(b key, Bitmap value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComicTiledImageView(@fo.k Context context, @fo.l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = 1.0f;
        this.d = r0.a(k3.c((k2) null, 1, (Object) null).plus(g1.c()));
        this.g = new LinkedHashMap();
        this.h = new h(u.b());
        this.j = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new Paint(2);
        this.r = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(ComicTiledImageView comicTiledImageView, d dVar, RectF rectF, b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(comicTiledImageView.w(key), dVar) && comicTiledImageView.x(key, rectF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(ComicTiledImageView comicTiledImageView, b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return comicTiledImageView.m.containsKey(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(ComicTiledImageView comicTiledImageView, RectF rectF, b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return comicTiledImageView.x(it, rectF);
    }

    private final void E() {
        if (this.g.isEmpty() && this.h.size() == 0 && this.j.isEmpty() && this.i == null && this.l.isEmpty() && this.k == null && this.m.isEmpty() && this.o == null) {
            return;
        }
        this.f++;
        Iterator<T> it = this.g.values().iterator();
        while (it.hasNext()) {
            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.g.clear();
        this.h.evictAll();
        this.j.clear();
        this.i = null;
        this.l.clear();
        this.k = null;
        this.m.clear();
        this.n.clear();
        this.o = null;
        this.r.setEmpty();
        this.s = 0.0f;
        this.t = false;
        invalidate();
    }

    private final void F(c cVar, b bVar, RectF rectF) {
        Rect rect = new Rect((int) Math.floor((rectF.left / getWidth()) * cVar.getWidth()), (int) Math.floor((rectF.top / getHeight()) * cVar.getHeight()), (int) Math.ceil((rectF.right / getWidth()) * cVar.getWidth()), (int) Math.ceil((rectF.bottom / getHeight()) * cVar.getHeight()));
        rect.intersect(0, 0, cVar.getWidth(), cVar.getHeight());
        if (rect.isEmpty()) {
            return;
        }
        float fI = bVar.i() / 10.0f;
        this.g.put(bVar, kotlinx.coroutines.i.e(this.d, (CoroutineContext) null, (CoroutineStart) null, new g(rect, cVar, RangesKt.coerceIn((int) Math.ceil(rectF.width() * fI * this.b), 1, 512), RangesKt.coerceIn((int) Math.ceil(rectF.height() * fI * this.b), 1, 512), this, bVar, this.e, this.f, null), 3, (Object) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(ComicTiledImageView comicTiledImageView, Function0 function0, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        comicTiledImageView.s(function0, function2);
    }

    private final void v(Canvas canvas, b bVar, Bitmap bitmap) {
        float fH = 512.0f / bVar.h();
        RectF rectF = new RectF(bVar.g() * fH, bVar.j() * fH, Math.min(getWidth(), (bVar.g() + 1) * fH), Math.min(getHeight(), (bVar.j() + 1) * fH));
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d w(b bVar) {
        return new d(bVar.h(), bVar.i());
    }

    private final boolean x(b bVar, RectF rectF) {
        float fH = 512.0f / bVar.h();
        float fG = bVar.g() * fH;
        float fJ = bVar.j() * fH;
        return fG < rectF.right && fG + fH > rectF.left && fJ < rectF.bottom && fJ + fH > rectF.top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ComicTiledImageView comicTiledImageView) {
        if (comicTiledImageView.isAttachedToWindow()) {
            return;
        }
        comicTiledImageView.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(ComicTiledImageView comicTiledImageView, d dVar, RectF rectF, b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(comicTiledImageView.w(key), dVar) && comicTiledImageView.x(key, rectF);
    }

    public final void D() {
        if (this.c == null) {
            return;
        }
        RectF rectF = new RectF();
        e0 e0Var = this.a;
        if (e0Var == null || !e0Var.g(this, rectF)) {
            E();
            return;
        }
        e0 e0Var2 = this.a;
        float mScaleFactor = e0Var2 != null ? e0Var2.getMScaleFactor() : 1.0f;
        e0 e0Var3 = this.a;
        boolean z2 = false;
        if (e0Var3 != null && e0Var3.i()) {
            z2 = true;
        }
        if (z2) {
            this.r = rectF;
            this.s = mScaleFactor;
            this.t = true;
        } else {
            if (Intrinsics.areEqual(rectF, this.r) && mScaleFactor == this.s && z2 == this.t) {
                return;
            }
            this.r = rectF;
            this.s = mScaleFactor;
            this.t = z2;
            invalidate();
        }
    }

    public final float getTileQuality() {
        return this.b;
    }

    @fo.l
    public final e0 getZoomRecyclerView() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c != null) {
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.post(new Runnable() { // from class: com.zentraedi.comic.view.i
            @Override // java.lang.Runnable
            public final void run() {
                ComicTiledImageView.y(this.a);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:174:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0218  */
    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@fo.k Canvas canvas) {
        float f2;
        c cVar;
        int i;
        c cVar2;
        Bitmap bitmap;
        Bitmap bitmap2;
        e0 e0Var;
        float f3;
        int i2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        c cVar3 = this.c;
        if (cVar3 != null && getWidth() > 0 && getHeight() > 0 && cVar3.getWidth() > 0 && cVar3.getHeight() > 0) {
            final RectF rectF = new RectF();
            e0 e0Var2 = this.a;
            if (e0Var2 == null) {
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            } else if (e0Var2 == null || !e0Var2.g(this, rectF)) {
                return;
            }
            if (rectF.isEmpty()) {
                return;
            }
            e0 e0Var3 = this.a;
            float fCoerceAtLeast = RangesKt.coerceAtLeast(e0Var3 != null ? e0Var3.getMScaleFactor() : 1.0f, 1.0f);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(10 * fCoerceAtLeast), 10);
            int i3 = 1;
            while (true) {
                f2 = i3;
                if (f2 >= fCoerceAtLeast || i3 >= 16) {
                    break;
                } else {
                    i3 *= 2;
                }
            }
            float f4 = 512.0f / f2;
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) Math.floor(rectF.left / f4), 0);
            int iFloor = (int) Math.floor((rectF.right - 0.01f) / f4);
            int iCoerceAtLeast3 = RangesKt.coerceAtLeast((int) Math.floor(rectF.top / f4), 0);
            int iFloor2 = (int) Math.floor((rectF.bottom - 0.01f) / f4);
            final d dVar = new d(i3, iCoerceAtLeast);
            if (!Intrinsics.areEqual(this.o, dVar)) {
                this.o = null;
            }
            ArrayList<Pair> arrayList = new ArrayList();
            if (iCoerceAtLeast3 <= iFloor2) {
                while (true) {
                    if (iCoerceAtLeast2 <= iFloor) {
                        int i4 = iCoerceAtLeast2;
                        while (true) {
                            f3 = f4;
                            i2 = iCoerceAtLeast2;
                            cVar = cVar3;
                            int i5 = i4 + 1;
                            RectF rectF2 = new RectF(i4 * f4, iCoerceAtLeast3 * f3, Math.min(getWidth(), i5 * f3), Math.min(getHeight(), (iCoerceAtLeast3 + 1) * f3));
                            if (!rectF2.isEmpty()) {
                                arrayList.add(TuplesKt.to(new b(i3, i4, iCoerceAtLeast3, iCoerceAtLeast), rectF2));
                            }
                            if (i4 == iFloor) {
                                break;
                            }
                            f4 = f3;
                            iCoerceAtLeast2 = i2;
                            cVar3 = cVar;
                            i4 = i5;
                        }
                    } else {
                        cVar = cVar3;
                        f3 = f4;
                        i2 = iCoerceAtLeast2;
                    }
                    if (iCoerceAtLeast3 == iFloor2) {
                        break;
                    }
                    iCoerceAtLeast3++;
                    f4 = f3;
                    iCoerceAtLeast2 = i2;
                    cVar3 = cVar;
                }
                i = 10;
            } else {
                cVar = cVar3;
                i = 10;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, i)), 16));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((Pair) it.next()).component1();
                Bitmap bitmap3 = this.h.get(bVar);
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    bitmap3 = null;
                }
                Pair pair = TuplesKt.to(bVar, bitmap3);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            if (!Intrinsics.areEqual(this.k, dVar)) {
                this.l.clear();
                this.k = dVar;
            }
            CollectionsKt.retainAll(this.l.keySet(), new Function1() { // from class: com.zentraedi.comic.view.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComicTiledImageView.z(this.a, dVar, rectF, (ComicTiledImageView.b) obj));
                }
            });
            if (Intrinsics.areEqual(this.i, dVar)) {
                this.l.clear();
            } else {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    b bVar2 = (b) entry.getKey();
                    Bitmap bitmap4 = (Bitmap) entry.getValue();
                    if (bitmap4 != null) {
                        this.l.put(bVar2, bitmap4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.isEmpty()) {
                        e0Var = this.a;
                        if (e0Var != null || !e0Var.i()) {
                            this.i = dVar;
                            this.j.clear();
                            this.j.putAll(this.l);
                            this.l.clear();
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Bitmap bitmap5 = this.l.get((b) ((Pair) it2.next()).component1());
                                if (bitmap5 == null || bitmap5.isRecycled()) {
                                }
                            } else {
                                e0Var = this.a;
                                if (e0Var != null) {
                                    this.i = dVar;
                                    this.j.clear();
                                    this.j.putAll(this.l);
                                    this.l.clear();
                                } else {
                                    this.i = dVar;
                                    this.j.clear();
                                    this.j.putAll(this.l);
                                    this.l.clear();
                                }
                            }
                        }
                    }
                }
            }
            CollectionsKt.retainAll(this.m.keySet(), new Function1() { // from class: com.zentraedi.comic.view.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComicTiledImageView.A(this.a, dVar, rectF, (ComicTiledImageView.b) obj));
                }
            });
            CollectionsKt.retainAll(this.n.keySet(), new Function1() { // from class: com.zentraedi.comic.view.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComicTiledImageView.B(this.a, (ComicTiledImageView.b) obj));
                }
            });
            CollectionsKt.retainAll(this.j.keySet(), new Function1() { // from class: com.zentraedi.comic.view.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComicTiledImageView.C(this.a, rectF, (ComicTiledImageView.b) obj));
                }
            });
            if (Intrinsics.areEqual(this.i, dVar)) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    b bVar3 = (b) entry2.getKey();
                    Bitmap bitmap6 = (Bitmap) entry2.getValue();
                    if (bitmap6 != null) {
                        this.j.put(bVar3, bitmap6);
                    }
                }
            } else if (this.i != null) {
                Map<b, Bitmap> mapSnapshot = this.h.snapshot();
                Intrinsics.checkNotNullExpressionValue(mapSnapshot, "snapshot(...)");
                for (Map.Entry<b, Bitmap> entry3 : mapSnapshot.entrySet()) {
                    b key = entry3.getKey();
                    Bitmap value = entry3.getValue();
                    Intrinsics.checkNotNull(key);
                    if (Intrinsics.areEqual(w(key), this.i) && x(key, rectF) && !value.isRecycled()) {
                        this.j.put(key, value);
                    }
                }
            }
            if (this.i == null) {
                for (Map.Entry<b, Bitmap> entry4 : this.l.entrySet()) {
                    b key2 = entry4.getKey();
                    Bitmap value2 = entry4.getValue();
                    if (!value2.isRecycled()) {
                        v(canvas, key2, value2);
                    }
                }
            } else {
                for (Map.Entry<b, Bitmap> entry5 : this.j.entrySet()) {
                    b key3 = entry5.getKey();
                    Bitmap value3 = entry5.getValue();
                    if (!value3.isRecycled()) {
                        v(canvas, key3, value3);
                    }
                }
            }
            e0 e0Var4 = this.a;
            if (e0Var4 == null || !e0Var4.i()) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                for (Pair pair2 : arrayList) {
                    b bVar4 = (b) pair2.component1();
                    RectF rectF3 = (RectF) pair2.component2();
                    boolean z2 = (!Intrinsics.areEqual(this.i, dVar) || (bitmap2 = this.j.get(bVar4)) == null || bitmap2.isRecycled()) ? false : true;
                    boolean z3 = (Intrinsics.areEqual(this.i, dVar) || (bitmap = this.l.get(bVar4)) == null || bitmap.isRecycled()) ? false : true;
                    if (linkedHashMap.get(bVar4) != null || z2 || z3 || Intrinsics.areEqual(this.o, dVar)) {
                        cVar2 = cVar;
                    } else {
                        Integer num = this.m.get(bVar4);
                        if ((num != null ? num.intValue() : 0) >= 3) {
                            cVar2 = cVar;
                        } else {
                            Long l = this.n.get(bVar4);
                            if (jUptimeMillis < (l != null ? l.longValue() : 0L) || this.g.containsKey(bVar4) || this.g.size() >= 4) {
                                cVar2 = cVar;
                            } else {
                                cVar2 = cVar;
                                F(cVar2, bVar4, rectF3);
                            }
                        }
                    }
                    cVar = cVar2;
                }
            }
            Map<b, k2> map = this.g;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<b, k2> entry6 : map.entrySet()) {
                b key4 = entry6.getKey();
                if ((x(key4, rectF) && Intrinsics.areEqual(w(key4), dVar)) ? false : true) {
                    linkedHashMap2.put(entry6.getKey(), entry6.getValue());
                }
            }
            Iterator it3 = linkedHashMap2.values().iterator();
            while (it3.hasNext()) {
                k2.a.b((k2) it3.next(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f++;
        Iterator<T> it = this.g.values().iterator();
        while (it.hasNext()) {
            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.g.clear();
        this.h.evictAll();
        this.j.clear();
        this.i = null;
        this.l.clear();
        this.k = null;
        this.m.clear();
        this.n.clear();
        this.o = null;
        this.r.setEmpty();
        this.s = 0.0f;
        this.t = false;
    }

    public final void s(@fo.k Function0<? extends c> factory, @fo.l Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        u();
        kotlinx.coroutines.i.e(this.d, (CoroutineContext) null, (CoroutineStart) null, new e(factory, this.e, this, function2, null), 3, (Object) null);
    }

    public final void setTileQuality(float f2) {
        this.b = f2;
    }

    public final void setZoomRecyclerView(@fo.l e0 e0Var) {
        this.a = e0Var;
    }

    public final void u() {
        this.e++;
        this.f++;
        r0.f(this.d, (CancellationException) null, 1, (Object) null);
        this.d = r0.a(k3.c((k2) null, 1, (Object) null).plus(g1.c()));
        this.g.clear();
        this.h.evictAll();
        this.j.clear();
        this.i = null;
        this.l.clear();
        this.k = null;
        this.m.clear();
        this.n.clear();
        this.o = null;
        this.r.setEmpty();
        this.s = 0.0f;
        this.t = false;
        c cVar = this.c;
        this.c = null;
        if (cVar != null) {
            kotlinx.coroutines.i.e(z, (CoroutineContext) null, (CoroutineStart) null, new f(cVar, null), 3, (Object) null);
        }
        invalidate();
    }
}
