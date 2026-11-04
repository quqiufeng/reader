package com.zentraedi.comic.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.v6;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.databinding.y2;
import com.zentraedi.comic.view.ComicTiledImageView;
import com.zentraedi.comic.viewmodel.Clip;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ReadSetting;
import com.zentraedi.comic.viewmodel.ZoomType;
import com.zentraedi.comic.viewmodel.l6;
import com.zentraedi.comic.viewmodel.o4;
import com.zentraedi.photo.model.AlbumAllTagModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.w0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nImageComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageComicAdapter.kt\ncom/zentraedi/comic/adapter/ImageComicAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1059:1\n1869#2,2:1060\n1669#2,8:1062\n1669#2,8:1070\n1563#2:1090\n1634#2,3:1091\n1617#2,9:1094\n1869#2:1103\n1870#2:1105\n1626#2:1106\n1869#2,2:1107\n1563#2:1109\n1634#2,3:1110\n1617#2,9:1113\n1869#2:1122\n1870#2:1124\n1626#2:1125\n1869#2,2:1126\n1869#2,2:1128\n1#3:1078\n1#3:1104\n1#3:1123\n426#4,11:1079\n*S KotlinDebug\n*F\n+ 1 ImageComicAdapter.kt\ncom/zentraedi/comic/adapter/ImageComicAdapter\n*L\n122#1:1060,2\n133#1:1062,8\n141#1:1070,8\n856#1:1090\n856#1:1091,3\n857#1:1094,9\n857#1:1103\n857#1:1105\n857#1:1106\n858#1:1107,2\n867#1:1109\n867#1:1110,3\n868#1:1113,9\n868#1:1122\n868#1:1124\n868#1:1125\n869#1:1126,2\n871#1:1128,2\n857#1:1104\n868#1:1123\n486#1:1079,11\n*E\n"})
public final class v extends com.zentraedi.comic.adapter.a {

    @fo.k
    private static final a q = new a(null);

    @fo.k
    private static final String r = "ComicOOM";
    private static final long s = 4;
    private static final long t = 314572800;
    private static final long u = 12582912;
    private static final long v = 8388608;
    private static final long w = 4194304;
    private static final int x = 8192;
    private float f = 1.0f;

    @fo.l
    private ReadSetting g;

    @fo.k
    private final kotlinx.coroutines.a0 h;

    @fo.k
    private final q0 i;

    @fo.k
    private final Map<Integer, k2> j;

    @fo.k
    private final Map<Integer, Object> k;

    @fo.k
    private final WeakHashMap<ImageView, com.bumptech.glide.request.target.e<Bitmap>> l;

    @fo.k
    private final n m;

    @fo.l
    private com.zentraedi.comic.view.e0 n;
    private int o;
    private int p;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            return "RenderTarget(sourceWidth=" + this.a + ", sourceHeight=" + this.b + ", targetWidth=" + this.c + ", targetHeight=" + this.d + ')';
        }
    }

    public static final /* synthetic */ class c {
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

    static final class d implements Function1<Throwable, Unit> {
        final /* synthetic */ Handler a;
        final /* synthetic */ Context b;
        final /* synthetic */ e c;

        static final class a implements Runnable {
            final /* synthetic */ Context a;
            final /* synthetic */ e b;

            a(Context context, e eVar) {
                this.a = context;
                this.b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.bumptech.glide.c.F(this.a.getApplicationContext()).z(this.b);
            }
        }

        d(Handler handler, Context context, e eVar) {
            this.a = handler;
            this.b = context;
            this.c = eVar;
        }

        public final void a(Throwable th2) {
            this.a.post(new a(this.b, this.c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends com.bumptech.glide.request.target.e<Bitmap> {
        final /* synthetic */ String e;
        final /* synthetic */ b f;
        final /* synthetic */ kotlinx.coroutines.n<Bitmap> g;
        final /* synthetic */ Handler h;
        final /* synthetic */ Context i;
        final /* synthetic */ Pair<Integer, Integer> j;

        static final class a implements Runnable {
            final /* synthetic */ Context a;
            final /* synthetic */ e b;

            a(Context context, e eVar) {
                this.a = context;
                this.b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.bumptech.glide.c.F(this.a.getApplicationContext()).z(this.b);
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ Context a;
            final /* synthetic */ e b;

            b(Context context, e eVar) {
                this.a = context;
                this.b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.bumptech.glide.c.F(this.a.getApplicationContext()).z(this.b);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(String str, b bVar, kotlinx.coroutines.n<? super Bitmap> nVar, Handler handler, Context context, Pair<Integer, Integer> pair) {
            this.e = str;
            this.f = bVar;
            this.g = nVar;
            this.h = handler;
            this.i = context;
            this.j = pair;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void g(Bitmap resource, com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            Handler handler;
            b bVar;
            Intrinsics.checkNotNullParameter(resource, "resource");
            v.this.Y0("loadBitmapSuspend-onResourceReady", this.e, null, resource, this.f);
            try {
                try {
                    Bitmap bitmapCopy = resource.copy(Bitmap.Config.ARGB_8888, false);
                    if (this.g.isActive()) {
                        kotlinx.coroutines.n<Bitmap> nVar = this.g;
                        Result.Companion companion = Result.Companion;
                        nVar.resumeWith(Result.m6constructorimpl(bitmapCopy));
                    } else {
                        bitmapCopy.recycle();
                    }
                    this.h.post(new b(this.i, this));
                } catch (Exception e) {
                    if (this.g.isActive()) {
                        kotlinx.coroutines.n<Bitmap> nVar2 = this.g;
                        Result.Companion companion2 = Result.Companion;
                        nVar2.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(e)));
                    }
                    handler = this.h;
                    bVar = new b(this.i, this);
                    handler.post(bVar);
                } catch (OutOfMemoryError e2) {
                    if (this.g.isActive()) {
                        kotlinx.coroutines.n<Bitmap> nVar3 = this.g;
                        Result.Companion companion3 = Result.Companion;
                        nVar3.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(e2)));
                    }
                    handler = this.h;
                    bVar = new b(this.i, this);
                    handler.post(bVar);
                }
            } catch (Throwable th2) {
                this.h.post(new b(this.i, this));
                throw th2;
            }
        }

        public void f(Drawable drawable) {
            if (this.g.isActive()) {
                kotlinx.coroutines.n<Bitmap> nVar = this.g;
                Result.Companion companion = Result.Companion;
                nVar.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(new Exception("加载被清除"))));
            }
        }

        public void o(Drawable drawable) {
            super.o(drawable);
            StringBuilder sb = new StringBuilder();
            sb.append("Glide load failed in loadBitmapSuspend path=");
            sb.append(this.e);
            sb.append(" request=");
            Pair<Integer, Integer> pair = this.j;
            sb.append(pair != null ? pair.getFirst() : null);
            sb.append('x');
            Pair<Integer, Integer> pair2 = this.j;
            sb.append(pair2 != null ? pair2.getSecond() : null);
            sb.append(" heap=");
            sb.append(v.this.K0());
            nd.a.c(v.r, sb.toString());
            if (this.g.isActive()) {
                kotlinx.coroutines.n<Bitmap> nVar = this.g;
                Result.Companion companion = Result.Companion;
                nVar.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(new Exception("加载失败"))));
            }
            this.h.post(new a(this.i, this));
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadImageBitmap$1", f = "ImageComicAdapter.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ y2 e;
        final /* synthetic */ b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i, int i2, y2 y2Var, b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = y2Var;
            this.f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new f(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v vVar = v.this;
                String str = vVar.K().get(Boxing.boxInt(this.c));
                String str2 = v.this.K().get(Boxing.boxInt(this.d));
                y2 y2Var = this.e;
                b bVar = this.f;
                this.a = 1;
                if (vVar.X0(str, str2, y2Var, bVar, this) == coroutine_suspended) {
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
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class g extends com.bumptech.glide.request.target.e<Bitmap> {
        final /* synthetic */ ComicTiledImageView e;
        final /* synthetic */ int f;
        final /* synthetic */ Object g;
        final /* synthetic */ String h;
        final /* synthetic */ b i;
        final /* synthetic */ ReadSetting j;
        final /* synthetic */ Layout k;
        final /* synthetic */ y2 l;
        final /* synthetic */ String m;
        final /* synthetic */ Pair<Integer, Integer> n;

        g(ComicTiledImageView comicTiledImageView, int i, Object obj, String str, b bVar, ReadSetting readSetting, Layout layout, y2 y2Var, String str2, Pair<Integer, Integer> pair) {
            this.e = comicTiledImageView;
            this.f = i;
            this.g = obj;
            this.h = str;
            this.i = bVar;
            this.j = readSetting;
            this.k = layout;
            this.l = y2Var;
            this.m = str2;
            this.n = pair;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void g(Bitmap resource, com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            if (v.this.M0(this.e, this.f, this.g, this)) {
                v.this.Y0("loadImageBitmap-onResourceReady", this.h, Integer.valueOf(this.f), resource, this.i);
                try {
                    if (!v.this.Z0(this.j, this.k)) {
                        v.this.N0(resource.getWidth(), resource.getHeight(), this.l);
                        this.e.setImageBitmap(resource);
                        this.e.setTag(resource);
                        return;
                    }
                    Bitmap bitmapCopy = resource.copy(Bitmap.Config.ARGB_8888, v.this.f1(this.j));
                    if (bitmapCopy != null) {
                        v.this.e1(bitmapCopy, this.l, this.m, this.i, this.j, this.k, this.g);
                        return;
                    }
                    nd.a.c(v.r, "resource.copy returned null position=" + this.f + " config=" + resource.getConfig() + " path=" + this.h);
                } catch (OutOfMemoryError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OOM while copying bitmap position=");
                    sb.append(this.f);
                    sb.append(" source=");
                    sb.append(resource.getWidth());
                    sb.append('x');
                    sb.append(resource.getHeight());
                    sb.append(" sourceBytes=");
                    v vVar = v.this;
                    sb.append(vVar.E0(Long.valueOf(vVar.h1(resource))));
                    sb.append(" request=");
                    Pair<Integer, Integer> pair = this.n;
                    sb.append(pair != null ? pair.getFirst() : null);
                    sb.append('x');
                    Pair<Integer, Integer> pair2 = this.n;
                    sb.append(pair2 != null ? pair2.getSecond() : null);
                    sb.append(" heap=");
                    sb.append(v.this.K0());
                    sb.append(" path=");
                    sb.append(this.h);
                    nd.a.d(v.r, sb.toString(), e);
                }
            }
        }

        public void f(Drawable drawable) {
            if (v.this.l.get(this.e) == this) {
                this.e.setImageDrawable(null);
                v.this.l.remove(this.e);
            }
        }
    }

    public static final class h extends com.bumptech.glide.request.target.e<Bitmap> {
        final /* synthetic */ ComicTiledImageView e;
        final /* synthetic */ int f;
        final /* synthetic */ Object g;
        final /* synthetic */ Layout h;
        final /* synthetic */ ReadSetting i;

        h(ComicTiledImageView comicTiledImageView, int i, Object obj, Layout layout, ReadSetting readSetting) {
            this.e = comicTiledImageView;
            this.f = i;
            this.g = obj;
            this.h = layout;
            this.i = readSetting;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void g(Bitmap resource, com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            if (v.this.M0(this.e, this.f, this.g, this)) {
                if (this.h != Layout.SINGLE) {
                    this.e.setImageBitmap(resource);
                } else {
                    Rect rectA = com.zentraedi.comic.view.o.a(resource.getWidth(), resource.getHeight(), this.f, this.i.k());
                    this.e.setImageBitmap(Bitmap.createBitmap(resource, rectA.left, rectA.top, rectA.width(), rectA.height()));
                }
            }
        }

        public void f(Drawable drawable) {
            if (v.this.l.get(this.e) == this) {
                this.e.setImageDrawable(null);
                v.this.l.remove(this.e);
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter", f = "ImageComicAdapter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {430, 442, 457, 464}, m = "loadTwoBitMaps", n = {ComicSubDirActivity.k0, "pathTow", "itemComicImageBinding", "renderTarget", "readSetting", "layout", "assets", "expectedFirstPos", "expectedSecondPos", "expectedRequestToken", "cacheKey", "cachedBitmap", ComicSubDirActivity.k0, "pathTow", "itemComicImageBinding", "renderTarget", "readSetting", "layout", "assets", "expectedFirstPos", "expectedSecondPos", "expectedRequestToken", "cacheKey", "cachedBitmap", ComicSubDirActivity.k0, "pathTow", "itemComicImageBinding", "renderTarget", "readSetting", "layout", "assets", "expectedFirstPos", "expectedSecondPos", "expectedRequestToken", "cacheKey", "cachedBitmap", "bitmap1", "bitmap2", ComicSubDirActivity.k0, "pathTow", "itemComicImageBinding", "renderTarget", "readSetting", "layout", "assets", "expectedFirstPos", "expectedSecondPos", "expectedRequestToken", "cacheKey", "cachedBitmap", "bitmap1", "bitmap2", "newBitmap"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14"}, v = 1)
    static final class i extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Object m;
        Object n;
        Object o;
        /* synthetic */ Object p;
        int r;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.p = obj;
            this.r |= IntCompanionObject.MIN_VALUE;
            return v.this.X0(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadTwoBitMaps$2", f = "ImageComicAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class j extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ y2 c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Integer e;
        final /* synthetic */ Object f;
        final /* synthetic */ Bitmap g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(y2 y2Var, Integer num, Integer num2, Object obj, Bitmap bitmap, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = y2Var;
            this.d = num;
            this.e = num2;
            this.f = obj;
            this.g = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new j(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            v vVar = v.this;
            ComicTiledImageView pvPic = this.c.E;
            Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
            if (!vVar.L0(pvPic, this.d, this.e, this.f)) {
                return Unit.INSTANCE;
            }
            v.this.N0(this.g.getWidth(), this.g.getHeight(), this.c);
            this.c.E.setImageBitmap(this.g);
            this.c.E.setTag(this.g);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((j) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadTwoBitMaps$3", f = "ImageComicAdapter.kt", i = {0, 0, 0, 1, 1, 1}, l = {445, 445}, m = "invokeSuspend", n = {"$this$coroutineScope", "deferred1", "deferred2", "$this$coroutineScope", "deferred1", "deferred2"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 1)
    static final class k extends SuspendLambda implements Function2<q0, Continuation<? super Pair<? extends Bitmap, ? extends Bitmap>>, Object> {
        Object a;
        Object b;
        Object c;
        int d;
        private /* synthetic */ Object e;
        final /* synthetic */ String g;
        final /* synthetic */ b h;
        final /* synthetic */ String i;

        @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadTwoBitMaps$3$deferred1$1", f = "ImageComicAdapter.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Bitmap>, Object> {
            int a;
            final /* synthetic */ v b;
            final /* synthetic */ String c;
            final /* synthetic */ b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, String str, b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = vVar;
                this.c = str;
                this.d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                v vVar = this.b;
                String str = this.c;
                b bVar = this.d;
                this.a = 1;
                Object objO0 = vVar.O0(str, bVar, this);
                return objO0 == coroutine_suspended ? coroutine_suspended : objO0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Bitmap> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadTwoBitMaps$3$deferred2$1", f = "ImageComicAdapter.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Bitmap>, Object> {
            int a;
            final /* synthetic */ v b;
            final /* synthetic */ String c;
            final /* synthetic */ b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v vVar, String str, b bVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = vVar;
                this.c = str;
                this.d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                v vVar = this.b;
                String str = this.c;
                b bVar = this.d;
                this.a = 1;
                Object objO0 = vVar.O0(str, bVar, this);
                return objO0 == coroutine_suspended ? coroutine_suspended : objO0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Bitmap> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, b bVar, String str2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.g = str;
            this.h = bVar;
            this.i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = v.this.new k(this.g, this.h, this.i, continuation);
            kVar.e = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Continuation<? super Pair<? extends Bitmap, ? extends Bitmap>> continuation) {
            return invoke2(q0Var, (Continuation<? super Pair<Bitmap, Bitmap>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w0 w0VarB;
            w0 w0Var;
            Object obj2;
            q0 q0Var = (q0) this.e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    w0VarB = (w0) this.b;
                    w0Var = (w0) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.c;
                    ResultKt.throwOnFailure(obj);
                }
                return new Pair(obj2, obj);
            }
            ResultKt.throwOnFailure(obj);
            w0 w0VarB2 = kotlinx.coroutines.i.b(q0Var, (CoroutineContext) null, (CoroutineStart) null, new a(v.this, this.g, this.h, null), 3, (Object) null);
            w0VarB = kotlinx.coroutines.i.b(q0Var, (CoroutineContext) null, (CoroutineStart) null, new b(v.this, this.i, this.h, null), 3, (Object) null);
            this.e = SpillingKt.nullOutSpilledVariable(q0Var);
            this.a = SpillingKt.nullOutSpilledVariable(w0VarB2);
            this.b = w0VarB;
            this.d = 1;
            Object objX = w0VarB2.x(this);
            if (objX != coroutine_suspended) {
                w0Var = w0VarB2;
                obj = objX;
            }
            return coroutine_suspended;
            this.e = SpillingKt.nullOutSpilledVariable(q0Var);
            this.a = SpillingKt.nullOutSpilledVariable(w0Var);
            this.b = SpillingKt.nullOutSpilledVariable(w0VarB);
            this.c = obj;
            this.d = 2;
            Object objX2 = w0VarB.x(this);
            if (objX2 != coroutine_suspended) {
                obj2 = obj;
                obj = objX2;
                return new Pair(obj2, obj);
            }
            return coroutine_suspended;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, Continuation<? super Pair<Bitmap, Bitmap>> continuation) {
            return ((k) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$loadTwoBitMaps$4", f = "ImageComicAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class l extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ y2 c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Integer e;
        final /* synthetic */ Object f;
        final /* synthetic */ Bitmap g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(y2 y2Var, Integer num, Integer num2, Object obj, Bitmap bitmap, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = y2Var;
            this.d = num;
            this.e = num2;
            this.f = obj;
            this.g = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new l(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            v vVar = v.this;
            ComicTiledImageView pvPic = this.c.E;
            Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
            if (!vVar.L0(pvPic, this.d, this.e, this.f)) {
                return Unit.INSTANCE;
            }
            v.this.N0(this.g.getWidth(), this.g.getHeight(), this.c);
            this.c.E.setImageBitmap(this.g);
            this.c.E.setTag(this.g);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((l) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.adapter.ImageComicAdapter$processImage$1", f = "ImageComicAdapter.kt", i = {0}, l = {585}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nImageComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageComicAdapter.kt\ncom/zentraedi/comic/adapter/ImageComicAdapter$processImage$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,1059:1\n179#2,8:1060\n*S KotlinDebug\n*F\n+ 1 ImageComicAdapter.kt\ncom/zentraedi/comic/adapter/ImageComicAdapter$processImage$1\n*L\n588#1:1060,8\n*E\n"})
    static final class m extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ Layout c;
        final /* synthetic */ ReadSetting d;
        final /* synthetic */ int e;
        final /* synthetic */ AssetManager f;
        final /* synthetic */ Bitmap g;
        final /* synthetic */ v h;
        final /* synthetic */ String i;
        final /* synthetic */ b j;
        final /* synthetic */ ComicTiledImageView k;
        final /* synthetic */ Object l;
        final /* synthetic */ y2 m;

        @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ImageComicAdapter.kt\ncom/zentraedi/comic/adapter/ImageComicAdapter$processImage$1\n*L\n1#1,778:1\n589#2,9:779\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ Object a;
            final /* synthetic */ ComicTiledImageView b;
            final /* synthetic */ int c;
            final /* synthetic */ Object d;
            final /* synthetic */ v e;
            final /* synthetic */ Bitmap f;
            final /* synthetic */ y2 g;

            public a(Object obj, ComicTiledImageView comicTiledImageView, int i, Object obj2, v vVar, Bitmap bitmap, y2 y2Var) {
                this.a = obj;
                this.b = comicTiledImageView;
                this.c = i;
                this.d = obj2;
                this.e = vVar;
                this.f = bitmap;
                this.g = y2Var;
            }

            public final void a() {
                if (Intrinsics.areEqual(this.b.getTag(com.zentraedi.comic.q.i.YI), Integer.valueOf(this.c)) && this.b.getTag(com.zentraedi.comic.q.i.aJ) == this.d) {
                    this.e.N0(this.f.getWidth(), this.f.getHeight(), this.g);
                    this.b.setImageBitmap(this.f);
                    this.b.setTag(this.f);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Layout layout, ReadSetting readSetting, int i, AssetManager assetManager, Bitmap bitmap, v vVar, String str, b bVar, ComicTiledImageView comicTiledImageView, Object obj, y2 y2Var, Continuation<? super m> continuation) {
            super(2, continuation);
            this.c = layout;
            this.d = readSetting;
            this.e = i;
            this.f = assetManager;
            this.g = bitmap;
            this.h = vVar;
            this.i = str;
            this.j = bVar;
            this.k = comicTiledImageView;
            this.l = obj;
            this.m = y2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = new m(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, continuation);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q0 q0Var = (q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.comic.imageprocess.g gVarA = new com.zentraedi.comic.imageprocess.g().a(new com.zentraedi.comic.imageprocess.j(this.c, this.d.k(), this.e)).a(new com.zentraedi.comic.imageprocess.k(this.d.q(), this.d.o())).a(new com.zentraedi.comic.imageprocess.a(this.d.b(), this.d.c())).a(new com.zentraedi.comic.imageprocess.d(this.d.e(), this.d.h(), this.f)).a(new com.zentraedi.comic.imageprocess.e(this.d.f(), this.f)).a(new com.zentraedi.comic.imageprocess.h(this.d.g(), this.d.n(), this.f));
                    Bitmap bitmap = this.g;
                    this.b = q0Var;
                    this.a = 1;
                    obj = gVarA.b(bitmap, this);
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
                this.h.Y0("processImage-output", this.i, Boxing.boxInt(this.e), bitmap2, this.j);
                this.h.m.put(this.i, bitmap2);
                ComicTiledImageView comicTiledImageView = this.k;
                int i2 = this.e;
                Object obj2 = this.l;
                v vVar = this.h;
                y2 y2Var = this.m;
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    pe.i.r(new a(q0Var, comicTiledImageView, i2, obj2, vVar, bitmap2, y2Var));
                } else if (Intrinsics.areEqual(comicTiledImageView.getTag(com.zentraedi.comic.q.i.YI), Boxing.boxInt(i2)) && comicTiledImageView.getTag(com.zentraedi.comic.q.i.aJ) == obj2) {
                    vVar.N0(bitmap2.getWidth(), bitmap2.getHeight(), y2Var);
                    comicTiledImageView.setImageBitmap(bitmap2);
                    comicTiledImageView.setTag(bitmap2);
                }
            } catch (Exception e) {
                nd.a.d("ImageComicAdapter", "processImage failed position=" + this.e, e);
            } catch (OutOfMemoryError e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("OOM in processImage position=");
                sb.append(this.e);
                sb.append(" input=");
                sb.append(this.g.getWidth());
                sb.append('x');
                sb.append(this.g.getHeight());
                sb.append(" inputBytes=");
                v vVar2 = this.h;
                sb.append(vVar2.E0(Boxing.boxLong(vVar2.h1(this.g))));
                sb.append(" zoom=");
                ReadSetting readSetting = this.h.g;
                sb.append(readSetting != null ? readSetting.q() : null);
                sb.append(" imageQuality=");
                ReadSetting readSetting2 = this.h.g;
                sb.append(readSetting2 != null ? Boxing.boxInt(readSetting2.i()) : null);
                sb.append(" target=");
                sb.append(this.j.j());
                sb.append('x');
                sb.append(this.j.i());
                sb.append(" heap=");
                sb.append(this.h.K0());
                nd.a.d(v.r, sb.toString(), e2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((m) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class n extends LruCache<String, Bitmap> {
        n(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount() / WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
        }
    }

    static final class o implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public v() {
        kotlinx.coroutines.a0 a0VarC = k3.c((k2) null, 1, (Object) null);
        this.h = a0VarC;
        this.i = r0.a(a0VarC.plus(g1.c()));
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new WeakHashMap<>();
        this.m = new n((int) ((Runtime.getRuntime().maxMemory() / ((long) WXMediaMessage.DESCRIPTION_LENGTH_LIMIT)) / ((long) 8)));
        this.o = com.zentraedi.basic.function.utils.k0.l();
        this.p = com.zentraedi.basic.function.utils.k0.i();
    }

    private final String A0(String str, int i2, b bVar) {
        return "single|" + str + '|' + z0(i2, bVar);
    }

    private final void B0(ImageView imageView, boolean z) {
        Object tag;
        String string;
        imageView.setImageDrawable(null);
        ComicTiledImageView comicTiledImageView = imageView instanceof ComicTiledImageView ? (ComicTiledImageView) imageView : null;
        if (comicTiledImageView != null) {
            comicTiledImageView.u();
        }
        C0(imageView);
        Object tag2 = imageView.getTag(com.zentraedi.comic.q.i.dJ);
        e1 e1Var = tag2 instanceof e1 ? (e1) tag2 : null;
        Object tag3 = imageView.getTag(com.zentraedi.comic.q.i.cJ);
        d1 d1Var = tag3 instanceof d1 ? (d1) tag3 : null;
        if (e1Var != null && d1Var != null) {
            d1Var.p(e1Var);
        }
        if (z && (tag = imageView.getTag(com.zentraedi.comic.q.i.ZI)) != null && (string = tag.toString()) != null) {
            com.zentraedi.comic.b0.a.h(string);
        }
        Object tag4 = imageView.getTag(com.zentraedi.comic.q.i.YI);
        Integer num = tag4 instanceof Integer ? (Integer) tag4 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            k2 k2VarRemove = this.j.remove(Integer.valueOf(iIntValue));
            if (k2VarRemove != null) {
                k2.a.b(k2VarRemove, (CancellationException) null, 1, (Object) null);
            }
            this.k.remove(Integer.valueOf(iIntValue));
        }
        imageView.setTag(null);
        imageView.setTag(com.zentraedi.comic.q.i.ZI, null);
        imageView.setTag(com.zentraedi.comic.q.i.YI, null);
        imageView.setTag(com.zentraedi.comic.q.i.bJ, null);
        imageView.setTag(com.zentraedi.comic.q.i.dJ, null);
        imageView.setTag(com.zentraedi.comic.q.i.cJ, null);
        imageView.setTag(com.zentraedi.comic.q.i.aJ, null);
    }

    private final void C0(ImageView imageView) {
        com.bumptech.glide.request.target.e<Bitmap> eVarRemove = this.l.remove(imageView);
        if (eVarRemove != null) {
            com.bumptech.glide.c.F(imageView.getContext()).z(eVarRemove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D0(int i2, int i3) {
        return ((long) i2) * ((long) i3) * 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E0(Long l2) {
        if (l2 == null) {
            return "null";
        }
        long jLongValue = l2.longValue();
        if (jLongValue <= 0) {
            return "0B";
        }
        if (jLongValue >= 1073741824) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2fGB", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / 1073741824)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (jLongValue >= 1048576) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2fMB", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / 1048576)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (jLongValue >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.2fKB", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jLongValue);
        sb.append('B');
        return sb.toString();
    }

    private final void I0(l6 l6Var, y2 y2Var, b bVar) {
        String str = com.zentraedi.comic.m.z() + com.zentraedi.basic.function.utils.r.a(l6Var.w()) + File.separator + l6Var.getFileName();
        if (!new File(str).exists()) {
            com.zentraedi.comic.m.m(l6Var);
            y2Var.E.setTag(com.zentraedi.comic.q.i.ZI, l6Var.getFileId());
            a1(l6Var, y2Var, str, bVar);
        } else {
            if (H() == Layout.DOUBLE || H() == Layout.DOUBLE_REVERSAL) {
                K().put(Integer.valueOf(l6Var.getPosition()), str);
            }
            P0(str, y2Var, bVar);
        }
    }

    private final void J0(l6 l6Var, y2 y2Var, b bVar) {
        String path;
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.comic.m.z());
        com.zentraedi.comic.b0 b0Var = com.zentraedi.comic.b0.a;
        CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
        if (compressionBrowserResponseT == null || (path = compressionBrowserResponseT.getPath()) == null) {
            path = "";
        }
        sb.append(l5.y(com.zentraedi.comic.m.k(path)));
        sb.append(File.separator);
        sb.append(l6Var.getPath());
        String string = sb.toString();
        if (new File(string).exists()) {
            if (H() == Layout.DOUBLE || H() == Layout.DOUBLE_REVERSAL) {
                K().put(Integer.valueOf(l6Var.getPosition()), string);
            }
            P0(string, y2Var, bVar);
            return;
        }
        Function1<Continuation<? super Unit>, Object> function1K = b0Var.k(l6Var.getPath());
        nd.a.c("zip down", l6Var.getPath());
        b0Var.r(l6Var.getPath(), function1K, 0, l6Var.u());
        y2Var.E.setTag(com.zentraedi.comic.q.i.ZI, string);
        a1(l6Var, y2Var, string, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String K0() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long j2 = runtime.totalMemory();
        long jFreeMemory = runtime.freeMemory();
        return "max=" + E0(Long.valueOf(jMaxMemory)) + " used=" + E0(Long.valueOf(j2 - jFreeMemory)) + " free=" + E0(Long.valueOf(jFreeMemory)) + " cache=" + E0(Long.valueOf(((long) this.m.size()) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L0(ImageView imageView, Integer num, Integer num2, Object obj) {
        return Intrinsics.areEqual(imageView.getTag(com.zentraedi.comic.q.i.YI), num) && Intrinsics.areEqual(imageView.getTag(com.zentraedi.comic.q.i.bJ), num2) && imageView.getTag(com.zentraedi.comic.q.i.aJ) == obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0(ImageView imageView, int i2, Object obj, com.bumptech.glide.request.target.e<Bitmap> eVar) {
        return this.l.get(imageView) == eVar && Intrinsics.areEqual(imageView.getTag(com.zentraedi.comic.q.i.YI), Integer.valueOf(i2)) && imageView.getTag(com.zentraedi.comic.q.i.aJ) == obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b N0(int i2, int i3, y2 y2Var) {
        int i4;
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
        ReadSetting readSetting = this.g;
        ReadModel readModelK = readSetting != null ? readSetting.k() : null;
        if ((readModelK == null ? -1 : c.$EnumSwitchMapping$2[readModelK.ordinal()]) == 1) {
            ReadSetting readSetting2 = this.g;
            ZoomType zoomTypeQ = readSetting2 != null ? readSetting2.q() : null;
            i4 = zoomTypeQ != null ? c.$EnumSwitchMapping$1[zoomTypeQ.ordinal()] : -1;
            if (i4 == 1) {
                float f2 = iG / i2;
                this.f = f2;
                layoutParams2.width = iG;
                int i5 = (int) (i3 * f2);
                layoutParams2.height = i5;
                layoutParams3.width = iG;
                layoutParams3.height = i5;
                com.zentraedi.comic.view.e0 e0Var = this.n;
                if (e0Var != null) {
                    e0Var.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var2 = this.n;
                if (e0Var2 != null) {
                    e0Var2.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(13);
            } else if (i4 != 2) {
                float f3 = i2;
                float f4 = i3;
                float fMin = Math.min(iG / f3, iD / f4);
                int i6 = (int) (f3 * fMin);
                layoutParams2.width = i6;
                int i7 = (int) (f4 * fMin);
                layoutParams2.height = i7;
                layoutParams3.width = i6;
                layoutParams3.height = i7;
                layoutParams2.addRule(13);
                com.zentraedi.comic.view.e0 e0Var3 = this.n;
                if (e0Var3 != null) {
                    e0Var3.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var4 = this.n;
                if (e0Var4 != null) {
                    e0Var4.setCanMoveY(0.0f);
                }
            } else {
                float f5 = iD / i3;
                this.f = f5;
                layoutParams2.height = iD;
                int i8 = (int) (i2 * f5);
                layoutParams2.width = i8;
                if (i8 <= iG) {
                    i8 = iG;
                }
                layoutParams3.width = i8;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var5 = this.n;
                if (e0Var5 != null) {
                    int i9 = layoutParams2.width;
                    e0Var5.setCanMoveX(i9 > iG ? i9 - iG : 0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var6 = this.n;
                if (e0Var6 != null) {
                    e0Var6.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(13);
            }
        } else {
            ReadSetting readSetting3 = this.g;
            ZoomType zoomTypeQ2 = readSetting3 != null ? readSetting3.q() : null;
            i4 = zoomTypeQ2 != null ? c.$EnumSwitchMapping$1[zoomTypeQ2.ordinal()] : -1;
            if (i4 == 1) {
                float f6 = iG / i2;
                this.f = f6;
                layoutParams2.width = iG;
                int i10 = (int) (i3 * f6);
                layoutParams2.height = i10;
                layoutParams3.width = iG;
                if (i10 <= iD) {
                    i10 = iD;
                }
                layoutParams3.height = i10;
                com.zentraedi.comic.view.e0 e0Var7 = this.n;
                if (e0Var7 != null) {
                    e0Var7.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var8 = this.n;
                if (e0Var8 != null) {
                    int i11 = layoutParams2.height;
                    e0Var8.setCanMoveY(i11 > iD ? i11 - iD : 0.0f);
                }
                layoutParams2.addRule(10);
                layoutParams2.addRule(14);
            } else if (i4 != 2) {
                float f7 = i2;
                float f8 = i3;
                float fMin2 = Math.min(iG / f7, iD / f8);
                int i12 = (int) (f7 * fMin2);
                layoutParams2.width = i12;
                layoutParams2.height = (int) (f8 * fMin2);
                this.f = fMin2;
                layoutParams3.width = i12;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var9 = this.n;
                if (e0Var9 != null) {
                    e0Var9.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var10 = this.n;
                if (e0Var10 != null) {
                    e0Var10.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(14);
                layoutParams2.addRule(10);
            } else {
                float f9 = iD / i3;
                this.f = f9;
                layoutParams2.height = iD;
                int i13 = (int) (i2 * f9);
                layoutParams2.width = i13;
                layoutParams3.width = i13;
                layoutParams3.height = iD;
                com.zentraedi.comic.view.e0 e0Var11 = this.n;
                if (e0Var11 != null) {
                    e0Var11.setCanMoveX(0.0f);
                }
                com.zentraedi.comic.view.e0 e0Var12 = this.n;
                if (e0Var12 != null) {
                    e0Var12.setCanMoveY(0.0f);
                }
                layoutParams2.addRule(10);
                layoutParams2.addRule(14);
            }
        }
        y2Var.E.setLayoutParams(layoutParams2);
        y2Var.F.setLayoutParams(layoutParams3);
        int i14 = layoutParams2.width;
        this.o = i14;
        this.p = layoutParams2.height;
        b bVar = new b(i2, i3, RangesKt.coerceAtLeast(i14, 1), RangesKt.coerceAtLeast(layoutParams2.height, 1));
        Pair<Integer, Integer> pairG1 = g1(bVar);
        Long lValueOf = pairG1 != null ? Long.valueOf(D0(pairG1.getFirst().intValue(), pairG1.getSecond().intValue())) : null;
        ReadSetting readSetting4 = this.g;
        if ((readSetting4 != null ? readSetting4.q() : null) != ZoomType.HEIGHT && !l1(lValueOf)) {
            return bVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("layoutForBitmap zoom=");
        ReadSetting readSetting5 = this.g;
        sb.append(readSetting5 != null ? readSetting5.q() : null);
        sb.append(" readModel=");
        ReadSetting readSetting6 = this.g;
        sb.append(readSetting6 != null ? readSetting6.k() : null);
        sb.append(" imageQuality=");
        ReadSetting readSetting7 = this.g;
        sb.append(readSetting7 != null ? Integer.valueOf(readSetting7.i()) : null);
        sb.append(" source=");
        sb.append(i2);
        sb.append('x');
        sb.append(i3);
        sb.append(" scale=");
        sb.append(this.f);
        sb.append(" target=");
        sb.append(bVar.j());
        sb.append('x');
        sb.append(bVar.i());
        sb.append(" screen=");
        sb.append(iG);
        sb.append('x');
        sb.append(iD);
        sb.append(" request=");
        sb.append(pairG1 != null ? pairG1.getFirst() : null);
        sb.append('x');
        sb.append(pairG1 != null ? pairG1.getSecond() : null);
        sb.append(" requestBytes=");
        sb.append(E0(lValueOf));
        sb.append(" heap=");
        sb.append(K0());
        sb.append(" pathTag=");
        sb.append(y2Var.E.getTag(com.zentraedi.comic.q.i.ZI));
        nd.a.c(r, sb.toString());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O0(String str, b bVar, Continuation<? super Bitmap> continuation) {
        Context contextF = F();
        if (contextF == null) {
            throw new IllegalStateException("Comic image context is unavailable");
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt.intercepted(continuation), 1);
        pVar.Z();
        Handler handler = new Handler(Looper.getMainLooper());
        Pair pairG1 = g1(bVar);
        Long lBoxLong = pairG1 != null ? Boxing.boxLong(D0(((Number) pairG1.getFirst()).intValue(), ((Number) pairG1.getSecond()).intValue())) : null;
        e eVar = new e(str, bVar, pVar, handler, contextF, pairG1);
        ReadSetting readSetting = this.g;
        if ((readSetting != null ? readSetting.q() : null) == ZoomType.HEIGHT || l1(lBoxLong)) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadBitmapSuspend request zoom=");
            ReadSetting readSetting2 = this.g;
            sb.append(readSetting2 != null ? readSetting2.q() : null);
            sb.append(" imageQuality=");
            ReadSetting readSetting3 = this.g;
            sb.append(readSetting3 != null ? Boxing.boxInt(readSetting3.i()) : null);
            sb.append(" path=");
            sb.append(str);
            sb.append(" target=");
            sb.append(bVar.j());
            sb.append('x');
            sb.append(bVar.i());
            sb.append(" request=");
            sb.append(pairG1 != null ? (Integer) pairG1.getFirst() : null);
            sb.append('x');
            sb.append(pairG1 != null ? (Integer) pairG1.getSecond() : null);
            sb.append(" requestBytes=");
            sb.append(E0(lBoxLong));
            sb.append(" heap=");
            sb.append(K0());
            nd.a.c(r, sb.toString());
        }
        if (v6.o(str)) {
            com.bumptech.glide.k kVarX0 = com.bumptech.glide.c.F(contextF).u().A1(str).X0(x0());
            Intrinsics.checkNotNullExpressionValue(kVarX0, "apply(...)");
            if (pairG1 != null) {
                kVarX0.x0(((Number) pairG1.getFirst()).intValue(), ((Number) pairG1.getSecond()).intValue());
            }
            kVarX0.o1(eVar);
        } else {
            com.bumptech.glide.k kVarX1 = com.bumptech.glide.c.F(contextF).u().z1(v6.k(str, true)).X0(x0());
            Intrinsics.checkNotNullExpressionValue(kVarX1, "apply(...)");
            if (pairG1 != null) {
                kVarX1.x0(((Number) pairG1.getFirst()).intValue(), ((Number) pairG1.getSecond()).intValue());
            }
            kVarX1.o1(eVar);
        }
        pVar.S(new d(handler, contextF, eVar));
        Object objU = pVar.u();
        if (objU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objU;
    }

    private final void P0(String str, y2 y2Var, b bVar) {
        Object tag;
        ReadSetting readSettingC;
        ReadSetting readSettingC2;
        int i2 = c.$EnumSwitchMapping$0[H().ordinal()];
        if (i2 == 3 || i2 == 4) {
            if ((y2Var.E.getTag(com.zentraedi.comic.q.i.bJ) instanceof Integer) && (y2Var.E.getTag(com.zentraedi.comic.q.i.YI) instanceof Integer)) {
                Object tag2 = y2Var.E.getTag(com.zentraedi.comic.q.i.YI);
                Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) tag2;
                int iIntValue = num.intValue();
                Object tag3 = y2Var.E.getTag(com.zentraedi.comic.q.i.bJ);
                Intrinsics.checkNotNull(tag3, "null cannot be cast to non-null type kotlin.Int");
                Integer num2 = (Integer) tag3;
                int iIntValue2 = num2.intValue();
                if (TextUtils.isEmpty(K().get(num)) || TextUtils.isEmpty(K().get(num2)) || (tag = y2Var.E.getTag(com.zentraedi.comic.q.i.aJ)) == null || this.k.get(num) == tag) {
                    return;
                }
                this.k.put(num, tag);
                k2 k2VarRemove = this.j.remove(num);
                if (k2VarRemove != null) {
                    k2.a.b(k2VarRemove, (CancellationException) null, 1, (Object) null);
                }
                ReadSetting readSetting = this.g;
                if (readSetting == null || (readSettingC = o4.c(readSetting)) == null) {
                    return;
                }
                if (readSettingC.q() == ZoomType.CUSTOM || readSettingC.b() != Clip.NORMAL || f1(readSettingC)) {
                    this.j.put(num, kotlinx.coroutines.i.e(this.i, (CoroutineContext) null, (CoroutineStart) null, new f(iIntValue, iIntValue2, y2Var, bVar, null), 3, (Object) null));
                    return;
                }
                String str2 = K().get(num);
                Intrinsics.checkNotNull(str2);
                String str3 = K().get(num2);
                Intrinsics.checkNotNull(str3);
                U0(str2, str3, y2Var, iIntValue, iIntValue2, tag, H(), readSettingC);
                return;
            }
            return;
        }
        ComicTiledImageView pvPic = y2Var.E;
        Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
        Object tag4 = pvPic.getTag(com.zentraedi.comic.q.i.YI);
        Integer num3 = tag4 instanceof Integer ? (Integer) tag4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            Object tag5 = pvPic.getTag(com.zentraedi.comic.q.i.aJ);
            if (tag5 == null) {
                return;
            }
            pvPic.setImageDrawable(null);
            C0(pvPic);
            ReadSetting readSetting2 = this.g;
            if (readSetting2 == null || (readSettingC2 = o4.c(readSetting2)) == null) {
                return;
            }
            Layout layoutH = H();
            if ((layoutH == Layout.COMMON || layoutH == Layout.SINGLE) && readSettingC2.q() != ZoomType.CUSTOM && readSettingC2.b() == Clip.NORMAL && !f1(readSettingC2)) {
                R0(str, y2Var, bVar, iIntValue3, tag5, layoutH, readSettingC2);
                return;
            }
            String strA0 = A0(str, iIntValue3, bVar);
            Bitmap bitmap = this.m.get(strA0);
            if (bitmap != null && !bitmap.isRecycled()) {
                N0(bitmap.getWidth(), bitmap.getHeight(), y2Var);
                pvPic.setImageBitmap(bitmap);
                pvPic.setTag(bitmap);
                return;
            }
            Pair<Integer, Integer> pairG1 = g1(bVar);
            Long lValueOf = pairG1 != null ? Long.valueOf(D0(pairG1.getFirst().intValue(), pairG1.getSecond().intValue())) : null;
            ReadSetting readSetting3 = this.g;
            if ((readSetting3 != null ? readSetting3.q() : null) == ZoomType.HEIGHT || l1(lValueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append("loadImageBitmap request position=");
                sb.append(iIntValue3);
                sb.append(" zoom=");
                ReadSetting readSetting4 = this.g;
                sb.append(readSetting4 != null ? readSetting4.q() : null);
                sb.append(" readModel=");
                ReadSetting readSetting5 = this.g;
                sb.append(readSetting5 != null ? readSetting5.k() : null);
                sb.append(" imageQuality=");
                ReadSetting readSetting6 = this.g;
                sb.append(readSetting6 != null ? Integer.valueOf(readSetting6.i()) : null);
                sb.append(" layout=");
                sb.append(H());
                sb.append(" path=");
                sb.append(str);
                sb.append(" target=");
                sb.append(bVar.j());
                sb.append('x');
                sb.append(bVar.i());
                sb.append(" request=");
                sb.append(pairG1 != null ? pairG1.getFirst() : null);
                sb.append('x');
                sb.append(pairG1 != null ? pairG1.getSecond() : null);
                sb.append(" requestBytes=");
                sb.append(E0(lValueOf));
                sb.append(" heap=");
                sb.append(K0());
                nd.a.c(r, sb.toString());
            }
            g gVar = new g(pvPic, iIntValue3, tag5, str, bVar, readSettingC2, layoutH, y2Var, strA0, pairG1);
            this.l.put(pvPic, gVar);
            com.bumptech.glide.k kVarX0 = com.bumptech.glide.c.F(pvPic.getContext()).u().A1(str).X0(x0());
            Intrinsics.checkNotNullExpressionValue(kVarX0, "apply(...)");
            if (pairG1 != null) {
                kVarX0.x0(pairG1.getFirst().intValue(), pairG1.getSecond().intValue());
            }
            Intrinsics.checkNotNull(kVarX0.o1(gVar));
        }
    }

    private final void Q0(l6 l6Var, y2 y2Var, b bVar) {
        if (new File(l6Var.getPath()).exists()) {
            if (H() == Layout.DOUBLE || H() == Layout.DOUBLE_REVERSAL) {
                K().put(Integer.valueOf(l6Var.getPosition()), l6Var.getPath());
            }
            P0(l6Var.getPath(), y2Var, bVar);
            return;
        }
        if (Integer.parseInt(l6Var.j()) == 10) {
            J0(l6Var, y2Var, bVar);
        } else {
            I0(l6Var, y2Var, bVar);
        }
    }

    private final void R0(final String str, final y2 y2Var, b bVar, final int i2, final Object obj, final Layout layout, final ReadSetting readSetting) {
        final ComicTiledImageView pvPic = y2Var.E;
        Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
        pvPic.setZoomRecyclerView(this.n);
        pvPic.setTileQuality(m1(readSetting.i()));
        pvPic.s(new Function0() { // from class: com.zentraedi.comic.adapter.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.S0(str, layout, i2, readSetting);
            }
        }, new Function2() { // from class: com.zentraedi.comic.adapter.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return v.T0(pvPic, obj, this, y2Var, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        Pair<Integer, Integer> pairW0 = w0(bVar.j(), bVar.i());
        h hVar = new h(pvPic, i2, obj, layout, readSetting);
        this.l.put(pvPic, hVar);
        com.bumptech.glide.c.F(pvPic.getContext()).u().A1(str).X0(x0()).x0(pairW0.getFirst().intValue(), pairW0.getSecond().intValue()).o1(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicTiledImageView.c S0(String str, Layout layout, int i2, ReadSetting readSetting) {
        com.zentraedi.comic.view.c cVar = new com.zentraedi.comic.view.c(str);
        return layout == Layout.SINGLE ? new com.zentraedi.comic.view.h(cVar, com.zentraedi.comic.view.o.a(cVar.getWidth(), cVar.getHeight(), i2, readSetting.k())) : cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T0(ComicTiledImageView comicTiledImageView, Object obj, v vVar, y2 y2Var, int i2, int i3) {
        if (comicTiledImageView.getTag(com.zentraedi.comic.q.i.aJ) == obj) {
            vVar.N0(i2, i3, y2Var);
        }
        return Unit.INSTANCE;
    }

    private final void U0(final String str, final String str2, final y2 y2Var, final int i2, final int i3, final Object obj, final Layout layout, ReadSetting readSetting) {
        final ComicTiledImageView pvPic = y2Var.E;
        Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
        pvPic.setZoomRecyclerView(this.n);
        pvPic.setTileQuality(m1(readSetting.i()));
        pvPic.s(new Function0() { // from class: com.zentraedi.comic.adapter.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.V0(str, str2, layout);
            }
        }, new Function2() { // from class: com.zentraedi.comic.adapter.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return v.W0(this.a, pvPic, i2, i3, obj, y2Var, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicTiledImageView.c V0(String str, String str2, Layout layout) {
        com.zentraedi.comic.view.c cVar = new com.zentraedi.comic.view.c(str);
        try {
            com.zentraedi.comic.view.c cVar2 = new com.zentraedi.comic.view.c(str2);
            return layout == Layout.DOUBLE_REVERSAL ? new com.zentraedi.comic.view.e(cVar2, cVar) : new com.zentraedi.comic.view.e(cVar, cVar2);
        } catch (Throwable th2) {
            cVar.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W0(v vVar, ComicTiledImageView comicTiledImageView, int i2, int i3, Object obj, y2 y2Var, int i4, int i5) {
        if (vVar.L0(comicTiledImageView, Integer.valueOf(i2), Integer.valueOf(i3), obj)) {
            vVar.N0(i4, i5, y2Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:135:0x046c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0471  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:95:0x0368  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0411, code lost:
    
        if (kotlinx.coroutines.i.h(r0, r0, r11) == r12) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        if (kotlinx.coroutines.i.h(r14, r0, r11) == r12) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(java.lang.String r24, java.lang.String r25, com.zentraedi.comic.databinding.y2 r26, com.zentraedi.comic.adapter.v.b r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.adapter.v.X0(java.lang.String, java.lang.String, com.zentraedi.comic.databinding.y2, com.zentraedi.comic.adapter.v$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(String str, String str2, Integer num, Bitmap bitmap, b bVar) {
        long jH1 = h1(bitmap);
        ReadSetting readSetting = this.g;
        if ((readSetting != null ? readSetting.q() : null) == ZoomType.HEIGHT || l1(Long.valueOf(jH1))) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" position=");
            sb.append(num);
            sb.append(" zoom=");
            ReadSetting readSetting2 = this.g;
            sb.append(readSetting2 != null ? readSetting2.q() : null);
            sb.append(" imageQuality=");
            ReadSetting readSetting3 = this.g;
            sb.append(readSetting3 != null ? Integer.valueOf(readSetting3.i()) : null);
            sb.append(" path=");
            sb.append(str2);
            sb.append(" bitmap=");
            sb.append(bitmap.getWidth());
            sb.append('x');
            sb.append(bitmap.getHeight());
            sb.append(" bytes=");
            sb.append(E0(Long.valueOf(jH1)));
            sb.append(" target=");
            sb.append(bVar.j());
            sb.append('x');
            sb.append(bVar.i());
            sb.append(" heap=");
            sb.append(K0());
            nd.a.c(r, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z0(ReadSetting readSetting, Layout layout) {
        return layout != Layout.COMMON || readSetting.q() == ZoomType.CUSTOM || readSetting.b() != Clip.NORMAL || f1(readSetting);
    }

    private final void a1(final l6 l6Var, final y2 y2Var, String str, final b bVar) {
        Object tag = y2Var.E.getTag(com.zentraedi.comic.q.i.dJ);
        e1 e1Var = tag instanceof e1 ? (e1) tag : null;
        Object tag2 = y2Var.E.getTag(com.zentraedi.comic.q.i.cJ);
        d1 d1Var = tag2 instanceof d1 ? (d1) tag2 : null;
        if (e1Var != null && d1Var != null) {
            d1Var.p(e1Var);
        }
        d1<Pair<String, String>> d1VarU = l6Var.u();
        p0 p0VarF = F();
        Intrinsics.checkNotNull(p0VarF, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        d1VarU.k(p0VarF, new o(new Function1() { // from class: com.zentraedi.comic.adapter.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.b1(y2Var, this, l6Var, bVar, (Pair) obj);
            }
        }));
        y2Var.E.setTag(com.zentraedi.comic.q.i.dJ, Unit.INSTANCE);
        y2Var.E.setTag(com.zentraedi.comic.q.i.cJ, l6Var.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(y2 y2Var, v vVar, l6 l6Var, b bVar, Pair pair) {
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        if (!Intrinsics.areEqual(str, AlbumAllTagModel.b.Hg)) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(y2Var.E.getTag(com.zentraedi.comic.q.i.ZI), str2)) {
            return Unit.INSTANCE;
        }
        if (new File(str2).exists()) {
            nd.a.c("zip down success", str2);
            if (vVar.H() == Layout.DOUBLE || vVar.H() == Layout.DOUBLE_REVERSAL) {
                vVar.K().put(Integer.valueOf(l6Var.getPosition()), str2);
            }
            vVar.P0(str2, y2Var, bVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(Bitmap bitmap, y2 y2Var, String str, b bVar, ReadSetting readSetting, Layout layout, Object obj) {
        AssetManager assets;
        ComicTiledImageView pvPic = y2Var.E;
        Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
        Object tag = pvPic.getTag(com.zentraedi.comic.q.i.YI);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            int iIntValue = num.intValue();
            Context contextF = F();
            if (contextF == null || (assets = contextF.getAssets()) == null) {
                return;
            }
            Bitmap bitmap2 = this.m.get(str);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                N0(bitmap2.getWidth(), bitmap2.getHeight(), y2Var);
                pvPic.setImageBitmap(bitmap2);
                pvPic.setTag(bitmap2);
            } else {
                k2 k2VarRemove = this.j.remove(num);
                if (k2VarRemove != null) {
                    k2.a.b(k2VarRemove, (CancellationException) null, 1, (Object) null);
                }
                this.j.put(num, kotlinx.coroutines.i.e(this.i, (CoroutineContext) null, (CoroutineStart) null, new m(layout, readSetting, iIntValue, assets, bitmap, this, str, bVar, pvPic, obj, y2Var, null), 3, (Object) null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f1(ReadSetting readSetting) {
        return readSetting.e() || readSetting.f() || readSetting.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Integer> g1(b bVar) {
        Pair pair;
        Integer numValueOf = Integer.valueOf(bVar.j());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Integer numValueOf2 = Integer.valueOf(bVar.i());
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                ReadSetting readSetting = this.g;
                int i2 = readSetting != null ? readSetting.i() : 1;
                if (i2 != 0) {
                    pair = i2 != 1 ? TuplesKt.to(Float.valueOf(0.75f), Long.valueOf(w)) : TuplesKt.to(Float.valueOf(1.0f), Long.valueOf(v));
                } else {
                    pair = TuplesKt.to(Float.valueOf(1.0f), Long.valueOf(u));
                }
                float fFloatValue = ((Number) pair.component1()).floatValue();
                long jLongValue = ((Number) pair.component2()).longValue();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(iIntValue * fFloatValue), 1);
                int iCoerceAtLeast2 = RangesKt.coerceAtLeast(MathKt.roundToInt(iIntValue2 * fFloatValue), 1);
                int iMin = Math.min(iCoerceAtLeast, RangesKt.coerceAtLeast(bVar.h(), 1));
                int iMin2 = Math.min(iCoerceAtLeast2, RangesKt.coerceAtLeast(bVar.g(), 1));
                long j2 = ((long) iMin) * ((long) iMin2);
                if (j2 > jLongValue) {
                    double dSqrt = Math.sqrt(jLongValue / j2);
                    iMin = RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iMin) * dSqrt), 1);
                    iMin2 = RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iMin2) * dSqrt), 1);
                }
                double dMin = Math.min(1.0d, 8192.0d / ((double) Math.max(iMin, iMin2)));
                if (dMin < 1.0d) {
                    iMin = RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iMin) * dMin), 1);
                    iMin2 = RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iMin2) * dMin), 1);
                }
                return new Pair<>(Integer.valueOf(iMin), Integer.valueOf(iMin2));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long h1(Bitmap bitmap) {
        try {
            return bitmap.getByteCount();
        } catch (Exception unused) {
            return D0(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l1(Long l2) {
        return (l2 != null ? l2.longValue() : 0L) >= t;
    }

    private final float m1(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? 0.5f : 0.75f;
        }
        return 1.0f;
    }

    private final Pair<Integer, Integer> w0(int i2, int i3) {
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, 1);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i3, 1);
        double dMin = Math.min(1.0d, Math.min(Math.sqrt(2000000.0d / (((long) iCoerceAtLeast) * ((long) iCoerceAtLeast2))), 4096.0d / ((double) Math.max(iCoerceAtLeast, iCoerceAtLeast2))));
        return TuplesKt.to(Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iCoerceAtLeast) * dMin), 1)), Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(((double) iCoerceAtLeast2) * dMin), 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bumptech.glide.request.h x0() {
        com.bumptech.glide.request.h hVarP = new com.bumptech.glide.request.h().u(DownsampleStrategy.b).p();
        Intrinsics.checkNotNullExpressionValue(hVarP, "disallowHardwareConfig(...)");
        return hVarP;
    }

    private final String y0(String str, String str2, b bVar) {
        return "double|" + str + '|' + str2 + '|' + z0(0, bVar);
    }

    private final String z0(int i2, b bVar) {
        String strName;
        String strName2;
        Clip clipB;
        String strName3;
        ZoomType zoomTypeQ;
        ReadModel readModelK;
        ReadSetting readSetting = this.g;
        ReadSetting.Coordinate coordinateC = readSetting != null ? readSetting.c() : null;
        ReadSetting.Stretcher stretcherO = readSetting != null ? readSetting.o() : null;
        String strName4 = H().name();
        Integer numValueOf = Integer.valueOf(i2);
        String str = "";
        if (readSetting == null || (readModelK = readSetting.k()) == null || (strName = readModelK.name()) == null) {
            strName = "";
        }
        if (readSetting == null || (zoomTypeQ = readSetting.q()) == null || (strName2 = zoomTypeQ.name()) == null) {
            strName2 = "";
        }
        if (readSetting != null && (clipB = readSetting.b()) != null && (strName3 = clipB.name()) != null) {
            str = strName3;
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOf(strName4, numValueOf, strName, strName2, str, Integer.valueOf(readSetting != null ? readSetting.i() : 1), Float.valueOf(coordinateC != null ? coordinateC.l() : -1.0f), Float.valueOf(coordinateC != null ? coordinateC.m() : -1.0f), Float.valueOf(coordinateC != null ? coordinateC.n() : -1.0f), Float.valueOf(coordinateC != null ? coordinateC.j() : -1.0f), Float.valueOf(stretcherO != null ? stretcherO.h() : -1.0f), Float.valueOf(stretcherO != null ? stretcherO.g() : -1.0f), Boolean.valueOf(readSetting != null ? readSetting.e() : false), Float.valueOf(readSetting != null ? readSetting.h() : 1.0f), Boolean.valueOf(readSetting != null ? readSetting.f() : false), Boolean.valueOf(readSetting != null ? readSetting.g() : false), Float.valueOf(readSetting != null ? readSetting.n() : 0.0f), Integer.valueOf(bVar.j()), Integer.valueOf(bVar.i())), "|", null, null, 0, null, null, 62, null);
    }

    @Override // com.zentraedi.comic.adapter.a
    public void D(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        List<? extends androidx.databinding.a> arrayList = new ArrayList<>();
        int i2 = c.$EnumSwitchMapping$0[layout.ordinal()];
        if (i2 == 1) {
            for (androidx.databinding.a aVar : G()) {
                arrayList.add(aVar);
                arrayList.add(aVar);
            }
            S(layout);
            U(arrayList);
            return;
        }
        if (i2 == 2) {
            S(layout);
            List<androidx.databinding.a> listG = G();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listG) {
                androidx.databinding.a aVar2 = (androidx.databinding.a) obj;
                Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ImageComicReaderItemViewModel");
                if (hashSet.add(((l6) aVar2).h())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            U(arrayList);
            return;
        }
        if (i2 != 3 && i2 != 4) {
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
            Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ImageComicReaderItemViewModel");
            if (hashSet2.add(((l6) aVar3).h())) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(CollectionsKt.toMutableList((Collection) arrayList3));
        U(arrayList);
    }

    @fo.l
    public final com.zentraedi.comic.view.e0 F0() {
        return this.n;
    }

    public final int G0() {
        return this.p;
    }

    public final int H0() {
        return this.o;
    }

    @Override // com.zentraedi.comic.adapter.a
    @fo.l
    public ReadSetting J() {
        return this.g;
    }

    @Override // com.zentraedi.comic.adapter.a
    public float L() {
        return this.f;
    }

    @Override // com.zentraedi.comic.adapter.a
    public void P(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m2.v(this.h, (CancellationException) null, 1, (Object) null);
        this.j.clear();
        this.k.clear();
        this.m.evictAll();
        IntRange intRangeUntil = RangesKt.until(0, recyclerView.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ImageView imageView = (ImageView) ((View) it2.next()).findViewById(com.zentraedi.comic.q.i.zx);
            if (imageView != null) {
                arrayList2.add(imageView);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            B0((ImageView) it3.next(), false);
        }
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
    @Override // com.zentraedi.comic.adapter.a
    public void Q() {
        k2.a.b(this.h, (CancellationException) null, 1, (Object) null);
        this.j.clear();
        this.k.clear();
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            IntRange intRangeUntil = RangesKt.until(0, recyclerView.getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ImageView imageView = (ImageView) ((View) it2.next()).findViewById(com.zentraedi.comic.q.i.zx);
                if (imageView != null) {
                    arrayList2.add(imageView);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                B0((ImageView) it3.next(), false);
            }
        }
        Set<ImageView> setKeySet = this.l.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Iterator it4 = CollectionsKt.toList(setKeySet).iterator();
        while (it4.hasNext()) {
            C0((ImageView) it4.next());
        }
        this.l.clear();
        this.m.evictAll();
        K().clear();
        this.n = null;
        R(null);
    }

    @Override // com.zentraedi.comic.adapter.a
    public void V(@fo.l ReadSetting readSetting) {
        this.g = readSetting;
    }

    @Override // com.zentraedi.comic.adapter.a
    public void W(float f2) {
        this.f = f2;
    }

    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.comic.adapter.d holder, int i2) {
        androidx.databinding.a aVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Layout layoutH = H();
        Layout layout = Layout.DOUBLE;
        androidx.databinding.a aVar2 = (layoutH == layout || H() == Layout.DOUBLE_REVERSAL) ? G().get(Math.min(i2 * 2, G().size() - 1)) : G().get(i2);
        if (aVar2 instanceof l6) {
            if (H() == layout || H() == Layout.DOUBLE_REVERSAL) {
                aVar = G().get(Math.min((i2 * 2) + 1, G().size() - 1));
            } else {
                aVar = null;
            }
            y2 y2Var = (y2) androidx.databinding.m.a(((RecyclerView.ViewHolder) holder).itemView);
            if (y2Var != null) {
                ComicTiledImageView pvPic = y2Var.E;
                Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
                B0(pvPic, false);
                y2Var.E.setTag(com.zentraedi.comic.q.i.YI, Integer.valueOf(i2));
                y2Var.E.setTag(com.zentraedi.comic.q.i.aJ, new Object());
                l6 l6Var = (l6) aVar2;
                b bVarN0 = N0(Integer.parseInt(l6Var.m()) > 0 ? Integer.parseInt(l6Var.m()) : g8.g(g8.h()), Integer.parseInt(l6Var.g()) > 0 ? Integer.parseInt(l6Var.g()) : g8.g(g8.h()), y2Var);
                if (H() != layout && H() != Layout.DOUBLE_REVERSAL) {
                    Q0(l6Var, y2Var, bVarN0);
                } else if (aVar instanceof l6) {
                    y2Var.E.setTag(com.zentraedi.comic.q.i.YI, Integer.valueOf(l6Var.getPosition()));
                    l6 l6Var2 = (l6) aVar;
                    y2Var.E.setTag(com.zentraedi.comic.q.i.bJ, Integer.valueOf(l6Var2.getPosition()));
                    Q0(l6Var2, y2Var, bVarN0);
                    Q0(l6Var, y2Var, bVarN0);
                }
                y2Var.u();
            }
        }
    }

    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@fo.k com.zentraedi.comic.adapter.d holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            ImageView imageView = (ImageView) ((RecyclerView.ViewHolder) holder).itemView.findViewById(com.zentraedi.comic.q.i.zx);
            Intrinsics.checkNotNull(imageView);
            B0(imageView, true);
        } catch (Exception e2) {
            nd.a.d("ImageComicAdapter", "Error in onViewRecycled", e2);
        }
        super.onViewRecycled(holder);
    }

    public final void i1(@fo.l com.zentraedi.comic.view.e0 e0Var) {
        this.n = e0Var;
    }

    public final void j1(int i2) {
        this.p = i2;
    }

    public final void k1(int i2) {
        this.o = i2;
    }
}
