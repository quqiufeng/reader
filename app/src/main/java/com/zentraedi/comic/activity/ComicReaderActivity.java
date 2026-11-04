package com.zentraedi.comic.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.basic.component.networkmonitor.NetWorkState;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.event.CloseComicCompressionEvent;
import com.zentraedi.business.event.CloseComicReaderEvent;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.request.Bookmark;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.comic.DownLoadFileState;
import com.zentraedi.comic.adapter.ComicItemType;
import com.zentraedi.comic.data.ComicZipModel;
import com.zentraedi.comic.event.ReadRecordUpdateEvent;
import com.zentraedi.comic.view.ComicLinearLayoutManager;
import com.zentraedi.comic.view.ComicPullToRefreshRecyclerView;
import com.zentraedi.comic.viewmodel.ComicApplyScope;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.OverallReadSetting;
import com.zentraedi.comic.viewmodel.PageOver;
import com.zentraedi.comic.viewmodel.PageTurning;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ReadSetting;
import com.zentraedi.comic.viewmodel.ScreenOrganize;
import com.zentraedi.comic.viewmodel.ZoomType;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicReaderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReaderActivity.kt\ncom/zentraedi/comic/activity/ComicReaderActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2140:1\n13#2:2141\n13#2:2142\n13#2:2143\n13#2:2144\n13#2:2145\n1#3:2146\n360#4,7:2147\n360#4,7:2154\n360#4,7:2163\n360#4,7:2170\n360#4,7:2177\n360#4,7:2184\n360#4,7:2191\n1400#5,2:2161\n*S KotlinDebug\n*F\n+ 1 ComicReaderActivity.kt\ncom/zentraedi/comic/activity/ComicReaderActivity\n*L\n96#1:2141\n97#1:2142\n98#1:2143\n99#1:2144\n100#1:2145\n491#1:2147,7\n496#1:2154,7\n1089#1:2163,7\n1127#1:2170,7\n1164#1:2177,7\n1453#1:2184,7\n1455#1:2191,7\n553#1:2161,2\n*E\n"})
public final class ComicReaderActivity extends BaseActivity {

    @fo.k
    public static final String A5 = "sp_comic_reader_apply_all_comic";

    @fo.k
    public static final String B5 = "sp_comic_guide_image_key_orientation";

    @fo.k
    public static final String C5 = "sp_comic_guide_pdf_key";

    @fo.k
    public static final String D5 = "ComicReaderActivity";

    @fo.k
    public static final String E5 = "sp_comic_guide_mange_key";

    @fo.k
    public static final String F5 = "sp_comic_guide_pdf_key_orientation";

    @fo.k
    private static final String G5 = "intent_comic_from";

    @fo.k
    private static final String H5 = "intent_is_comic";

    @fo.k
    private static final String I5 = "intent_comic_comic";

    @fo.k
    private static final String J5 = "intent_comic_file_from";

    @fo.k
    private static final String K5 = "intent_comic_zip_from";

    @fo.k
    private static final String L5 = "intent_comic_reading_Record_Json_String";

    @fo.k
    public static final a x5 = new a(null);

    @fo.k
    public static final String y5 = "sp_comic_key_page_new";

    @fo.k
    public static final String z5 = "sp_comic_reader_apply_scope";
    private int A3;

    @fo.l
    private ComicZipModel A4;
    private int M2;

    @fo.l
    private BaseModel M4;

    @fo.l
    private FileInfoModel P3;
    private int Q2;
    private com.zentraedi.comic.databinding.o T;
    private int T2;

    @fo.l
    private ComicInfoModel T3;

    @fo.l
    private gg.a Z;

    @fo.l
    private FileInfoModel Z2;

    @fo.l
    private com.zentraedi.comic.view.a a1;
    private boolean a2;

    @fo.l
    private ComicItemType e0;
    private boolean f0;
    private boolean g0;

    @fo.l
    private TaskFileData j0;
    private boolean n0;
    private boolean r1;
    private int w5;

    @fo.k
    private final Lazy U = LazyKt.lazy(new p(this));

    @fo.k
    private final Lazy V = LazyKt.lazy(new q(this));

    @fo.k
    private final Lazy W = LazyKt.lazy(new r(this));

    @fo.k
    private final Lazy X = LazyKt.lazy(new s(this));

    @fo.k
    private final Lazy Y = LazyKt.lazy(new t(this));

    @fo.k
    private final kotlinx.coroutines.q0 a0 = kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e());

    @fo.k
    private final com.zentraedi.comic.viewmodel.k6<gg.a> b0 = new com.zentraedi.comic.viewmodel.k6<>();
    private int c0 = -1;
    private int d0 = 10;

    @fo.k
    private final ArrayList<Bookmark> h0 = new ArrayList<>();

    @fo.k
    private final com.zentraedi.basic.component.handler.a i0 = new com.zentraedi.basic.component.handler.a();

    @fo.k
    private Layout k0 = Layout.COMMON;

    @fo.k
    private ReadModel l0 = ReadModel.NORMAL_NULL;

    @fo.k
    private ScreenOrganize m0 = ScreenOrganize.NORMAL;
    private int M1 = 1;
    private int P2 = 6000;

    @fo.k
    private String P4 = "";

    @fo.k
    private ComicApplyScope Q4 = ComicApplyScope.THIS_COMIC;

    @fo.k
    private final androidx.databinding.u.a Z4 = new o();

    @fo.k
    private final i u5 = new i();

    @fo.k
    private final c v5 = new c();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@fo.k Activity activity, @fo.l BaseModel baseModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) ComicReaderActivity.class);
            intent.putExtra(ComicReaderActivity.I5, baseModel);
            activity.startActivity(intent);
            com.zentraedi.comic.util.l.a.g();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ComicItemType.values().length];
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_EPUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_ZIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DownLoadFileState.values().length];
            try {
                iArr2[DownLoadFileState.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DownLoadFileState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DownLoadFileState.WAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DownLoadFileState.LOADMORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PageTurning.values().length];
            try {
                iArr3[PageTurning.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PageTurning.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PageTurning.SINGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ScreenOrganize.values().length];
            try {
                iArr4[ScreenOrganize.LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ScreenOrganize.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ScreenOrganize.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Intrinsics.areEqual(ComicReaderActivity.this.n6().y1().get(), Boolean.TRUE)) {
                return;
            }
            ComicReaderActivity.this.K7();
            if (ComicReaderActivity.this.p6().f0().get() == PageOver.SCROLL) {
                ComicReaderActivity.this.i0.postDelayed(this, 10L);
            } else {
                ComicReaderActivity.this.i0.postDelayed(this, ComicReaderActivity.this.P2);
            }
        }
    }

    public static final class d extends androidx.databinding.u.a {
        d() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            com.zentraedi.comic.databinding.o oVar = ComicReaderActivity.this.T;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            View view = oVar.E;
            double d = 0.2f;
            Integer num = (Integer) ComicReaderActivity.this.o6().D0().get();
            view.setAlpha((float) (d + (((double) ((num != null ? num.intValue() : 0) / 100.0f)) * 0.3d)));
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.activity.ComicReaderActivity$getData$1", f = "ComicReaderActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        @DebugMetadata(c = "com.zentraedi.comic.activity.ComicReaderActivity$getData$1$1", f = "ComicReaderActivity.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ ComicReaderActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComicReaderActivity comicReaderActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = comicReaderActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.comic.viewmodel.m4 m4VarM6 = this.b.m6();
                    ComicZipModel comicZipModel = this.b.A4;
                    Intrinsics.checkNotNull(comicZipModel);
                    ComicItemType comicItemType = this.b.e0;
                    this.a = 1;
                    if (m4VarM6.O0(comicZipModel, comicItemType, this) == coroutine_suspended) {
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
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = ComicReaderActivity.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.i.b(q0Var, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new a(ComicReaderActivity.this, null), 2, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.activity.ComicReaderActivity$getData$2", f = "ComicReaderActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        @DebugMetadata(c = "com.zentraedi.comic.activity.ComicReaderActivity$getData$2$1", f = "ComicReaderActivity.kt", i = {0}, l = {408}, m = "invokeSuspend", n = {TbsReaderView.m}, s = {"L$0"}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            Object a;
            int b;
            final /* synthetic */ ComicReaderActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComicReaderActivity comicReaderActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = comicReaderActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String path;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
                    FileInfoModel fileInfoModel = this.c.Z2;
                    if (fileInfoModel == null || (path = fileInfoModel.getPath()) == null) {
                        path = "";
                    }
                    String strM = aVar.m(path);
                    com.zentraedi.comic.viewmodel.m4 m4VarM6 = this.c.m6();
                    ComicItemType comicItemType = this.c.e0;
                    this.a = SpillingKt.nullOutSpilledVariable(strM);
                    this.b = 1;
                    if (m4VarM6.L0(strM, comicItemType, this) == coroutine_suspended) {
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
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = ComicReaderActivity.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.i.b(q0Var, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new a(ComicReaderActivity.this, null), 2, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class g implements PullToRefreshBase.h<com.zentraedi.comic.view.e0> {
        g() {
        }

        public void a(PullToRefreshBase<com.zentraedi.comic.view.e0> refreshView) {
            Intrinsics.checkNotNullParameter(refreshView, "refreshView");
            ComicReaderActivity.this.D7(refreshView);
        }

        public void b(PullToRefreshBase<com.zentraedi.comic.view.e0> refreshView) {
            Intrinsics.checkNotNullParameter(refreshView, "refreshView");
            ComicReaderActivity.this.A7(refreshView);
        }
    }

    public static final class h extends androidx.databinding.u.a {
        h() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            if (Intrinsics.areEqual(ComicReaderActivity.this.n6().y1().get(), Boolean.FALSE) && ComicReaderActivity.this.g0) {
                ComicReaderActivity.this.z8();
            }
        }
    }

    public static final class i extends androidx.databinding.w.a<androidx.databinding.w<FileInfoModel>> {
        i() {
        }

        public void a(androidx.databinding.w<FileInfoModel> wVar) {
        }

        public void f(androidx.databinding.w<FileInfoModel> wVar, int i, int i2) {
        }

        public void g(androidx.databinding.w<FileInfoModel> wVar, int i, int i2) {
            ComicReaderActivity.this.a6(wVar, i, i2);
        }

        public void h(androidx.databinding.w<FileInfoModel> wVar, int i, int i2, int i3) {
        }

        public void i(androidx.databinding.w<FileInfoModel> wVar, int i, int i2) {
        }
    }

    public static final class j implements SeekBar.OnSeekBarChangeListener {
        j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ComicReaderActivity.this.v8(i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            if (Intrinsics.areEqual(ComicReaderActivity.this.n6().y1().get(), Boolean.TRUE)) {
                ComicReaderActivity.this.i6().setVisibility(0);
            } else {
                ComicReaderActivity.this.i6().setVisibility(8);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class k implements SeekBar.OnSeekBarChangeListener {
        k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ComicReaderActivity.this.o6().Q1(i / 100.0f);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class l implements com.zentraedi.comic.view.e0.c {
        l() {
        }

        @Override // com.zentraedi.comic.view.e0.c
        public void a(MotionEvent motionEvent) {
            if (motionEvent == null || Intrinsics.areEqual(ComicReaderActivity.this.n6().y1().get(), Boolean.TRUE)) {
                ComicReaderActivity.this.O7();
                return;
            }
            ComicReaderViewModel comicReaderViewModelN6 = ComicReaderActivity.this.n6();
            ComicReaderViewModel.ResultStatus resultStatusX0 = ComicReaderActivity.this.n6().X0(ComicReaderActivity.this, motionEvent.getX(), motionEvent.getY());
            Intrinsics.checkNotNull(resultStatusX0);
            comicReaderViewModelN6.q2(resultStatusX0, ComicReaderActivity.this.o6().Z0());
        }
    }

    public static final class m extends com.zentraedi.comic.view.v {
        m() {
        }

        @Override // com.zentraedi.comic.view.v
        public void a() {
            ReadSetting readSettingZ0 = ComicReaderActivity.this.o6().Z0();
            PageOver pageOver = (PageOver) ComicReaderActivity.this.p6().f0().get();
            if (pageOver == null) {
                pageOver = PageOver.NO;
            }
            if (readSettingZ0.k() == ReadModel.SCROLL_READ) {
                if (pageOver == PageOver.SCROLL) {
                    return;
                }
                if (com.zentraedi.comic.w.f(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                    com.zentraedi.comic.w.C(ComicReaderActivity.this.q6(), pageOver, readSettingZ0.p());
                    return;
                } else {
                    ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_END);
                    return;
                }
            }
            if (readSettingZ0.k() == ReadModel.NORMAL_READ) {
                if (com.zentraedi.comic.w.f(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                    com.zentraedi.comic.w.B(ComicReaderActivity.this.q6(), readSettingZ0, pageOver);
                    return;
                } else {
                    ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_END);
                    return;
                }
            }
            if (com.zentraedi.comic.w.g(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                com.zentraedi.comic.w.y(ComicReaderActivity.this.q6(), readSettingZ0, pageOver);
            } else {
                ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_START);
            }
        }

        @Override // com.zentraedi.comic.view.v
        public void b() {
            ReadSetting readSettingZ0 = ComicReaderActivity.this.o6().Z0();
            PageOver pageOver = (PageOver) ComicReaderActivity.this.p6().f0().get();
            if (pageOver == null) {
                pageOver = PageOver.NO;
            }
            if (readSettingZ0.k() == ReadModel.SCROLL_READ) {
                if (pageOver == PageOver.SCROLL) {
                    return;
                }
                if (com.zentraedi.comic.w.g(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                    com.zentraedi.comic.w.z(ComicReaderActivity.this.q6(), pageOver, readSettingZ0.p());
                    return;
                } else {
                    ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_START);
                    return;
                }
            }
            if (readSettingZ0.k() == ReadModel.NORMAL_READ) {
                if (com.zentraedi.comic.w.g(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                    com.zentraedi.comic.w.y(ComicReaderActivity.this.q6(), readSettingZ0, pageOver);
                    return;
                } else {
                    ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_START);
                    return;
                }
            }
            if (com.zentraedi.comic.w.f(ComicReaderActivity.this.q6(), readSettingZ0, true)) {
                com.zentraedi.comic.w.B(ComicReaderActivity.this.q6(), readSettingZ0, pageOver);
            } else {
                ComicReaderActivity.this.p8(PullToRefreshBase.Mode.PULL_FROM_END);
            }
        }
    }

    public static final class n extends RecyclerView.OnScrollListener {
        n() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            nd.a.a("onScrollStateChanged", "newState" + i);
            if (ComicReaderActivity.this.q6().getAdapter() != null) {
                RecyclerView.Adapter adapter = ComicReaderActivity.this.q6().getAdapter();
                if ((adapter != null ? adapter.getItemCount() : 0) <= 0) {
                    return;
                }
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    ComicReaderActivity.this.f6();
                    return;
                }
                ComicReaderActivity.this.i8();
                int iJ = com.zentraedi.comic.w.j(ComicReaderActivity.this.q6());
                RecyclerView.LayoutManager layoutManager = ComicReaderActivity.this.q6().getLayoutManager();
                View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(iJ) : null;
                StringBuilder sb = new StringBuilder();
                sb.append("--left");
                sb.append(viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getLeft()) : null);
                sb.append("----right");
                sb.append(viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getRight()) : null);
                nd.a.a("onScrollStateChanged", sb.toString());
                if (Intrinsics.areEqual(ComicReaderActivity.this.n6().getShowLoading().get(), Boolean.TRUE)) {
                    return;
                }
                ComicReaderActivity.this.n6().getShowLoading().set(Boolean.FALSE);
                ComicReaderActivity.this.a8();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FileInfoModel fileInfoModelN;
            FileInfoModel fileInfoModelN2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            nd.a.a(ComicReaderActivity.D5, "onScrolled dx" + i + "dy" + i2);
            if (ComicReaderActivity.this.q6().getAdapter() == null) {
                return;
            }
            ComicReaderActivity comicReaderActivity = ComicReaderActivity.this;
            comicReaderActivity.Q2 = com.zentraedi.comic.w.j(comicReaderActivity.q6());
            FileInfoModel fileInfoModel = ComicReaderActivity.this.Z2;
            String path = fileInfoModel != null ? fileInfoModel.getPath() : null;
            gg.a aVar = ComicReaderActivity.this.Z;
            if (!Intrinsics.areEqual(path, (aVar == null || (fileInfoModelN2 = aVar.n()) == null) ? null : fileInfoModelN2.getPath())) {
                gg.a aVar2 = ComicReaderActivity.this.Z;
                if (!TextUtils.isEmpty((aVar2 == null || (fileInfoModelN = aVar2.n()) == null) ? null : fileInfoModelN.getName())) {
                    ComicReaderActivity comicReaderActivity2 = ComicReaderActivity.this;
                    gg.a aVar3 = comicReaderActivity2.Z;
                    comicReaderActivity2.Z2 = aVar3 != null ? aVar3.n() : null;
                    ObservableField<String> observableFieldT = ComicReaderActivity.this.n6().T();
                    FileInfoModel fileInfoModel2 = ComicReaderActivity.this.Z2;
                    observableFieldT.set(fileInfoModel2 != null ? fileInfoModel2.getName() : null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onScrolled");
                    FileInfoModel fileInfoModel3 = ComicReaderActivity.this.Z2;
                    sb.append(fileInfoModel3 != null ? fileInfoModel3.getName() : null);
                    nd.a.a(ComicReaderActivity.D5, sb.toString());
                }
            }
            ComicReaderActivity.this.h8();
        }
    }

    public static final class o extends androidx.databinding.u.a {
        o() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            com.zentraedi.comic.adapter.a aVarD;
            com.zentraedi.comic.adapter.a aVarD2;
            com.zentraedi.comic.adapter.a aVarD3;
            Object obj = ComicReaderActivity.this.n6().y1().get();
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(obj, bool)) {
                ComicReaderActivity.this.n6().z1().set(bool);
                ComicReaderActivity.this.n6().i1().set(ComicReaderViewModel.BottomMenu.NODE);
                if (com.zentraedi.comic.w.j(ComicReaderActivity.this.q6()) != 0) {
                    gg.a aVar = ComicReaderActivity.this.Z;
                    if (aVar == null || (aVarD3 = aVar.d()) == null || aVarD3.getItemCount() != 0) {
                        com.zentraedi.comic.databinding.o oVar = ComicReaderActivity.this.T;
                        com.zentraedi.comic.databinding.o oVar2 = null;
                        if (oVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oVar = null;
                        }
                        AppCompatSeekBar appCompatSeekBar = oVar.I.M;
                        int iJ = com.zentraedi.comic.w.j(ComicReaderActivity.this.q6()) * 100;
                        gg.a aVar2 = ComicReaderActivity.this.Z;
                        int itemCount = 1;
                        appCompatSeekBar.setProgress(iJ / ((aVar2 == null || (aVarD2 = aVar2.d()) == null) ? 1 : aVarD2.getItemCount()));
                        com.zentraedi.comic.databinding.o oVar3 = ComicReaderActivity.this.T;
                        if (oVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oVar2 = oVar3;
                        }
                        AppCompatSeekBar appCompatSeekBar2 = oVar2.I.N;
                        int iJ2 = com.zentraedi.comic.w.j(ComicReaderActivity.this.q6()) * 100;
                        gg.a aVar3 = ComicReaderActivity.this.Z;
                        if (aVar3 != null && (aVarD = aVar3.d()) != null) {
                            itemCount = aVarD.getItemCount();
                        }
                        appCompatSeekBar2.setProgress(iJ2 / itemCount);
                        ComicReaderActivity.this.i6().setVisibility(8);
                    }
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class p implements Function0<ComicReaderViewModel> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public p(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.ComicReaderViewModel] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComicReaderViewModel invoke() {
            return new androidx.lifecycle.m2(this.a).c(ComicReaderViewModel.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class q implements Function0<com.zentraedi.comic.viewmodel.n6> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public q(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.n6] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.n6 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.n6.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class r implements Function0<com.zentraedi.comic.viewmodel.t4> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public r(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.t4] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.t4 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.t4.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class s implements Function0<com.zentraedi.comic.viewmodel.q3> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public s(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.q3] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.q3 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.q3.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class t implements Function0<com.zentraedi.comic.viewmodel.m4> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public t(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.m4] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.m4 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.m4.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A6(ComicReaderActivity comicReaderActivity, String str) {
        if (str != null) {
            comicReaderActivity.n6().c1().set('(' + str + ')');
            com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
            comicPullToRefreshRecyclerView.setProgress('(' + str + ')');
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void A7(final PullToRefreshBase<com.zentraedi.comic.view.e0> pullToRefreshBase) {
        int iIndexOf = m6().Q0().indexOf(this.P3);
        com.zentraedi.comic.databinding.o oVar = null;
        if (iIndexOf == -1) {
            Iterator it = m6().Q0().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                String path = ((FileInfoModel) it.next()).getPath();
                FileInfoModel fileInfoModel = this.P3;
                if (Intrinsics.areEqual(path, fileInfoModel != null ? fileInfoModel.getPath() : null)) {
                    iIndexOf = i2;
                    break;
                }
                i2++;
            }
        }
        int i3 = iIndexOf + 1;
        if (i3 < m6().Q0().size()) {
            final FileInfoModel fileInfoModel2 = (FileInfoModel) m6().Q0().get(i3);
            gg.a aVar = this.Z;
            if (aVar != null) {
                aVar.u(fileInfoModel2, i3, new Function1() { // from class: com.zentraedi.comic.activity.x2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComicReaderActivity.B7(pullToRefreshBase, this, fileInfoModel2, (DownLoadFileState) obj);
                    }
                });
                return;
            }
            return;
        }
        com.zentraedi.comic.databinding.o oVar2 = this.T;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar2;
        }
        ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
        Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
        comicPullToRefreshRecyclerView.setNoMoreData(true);
        pullToRefreshBase.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B6(final ComicReaderActivity comicReaderActivity, DownLoadFileState downLoadFile) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(downLoadFile, "downLoadFile");
        com.zentraedi.comic.databinding.o oVar = null;
        if (downLoadFile == DownLoadFileState.SUCCESS) {
            com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar2 = null;
            }
            oVar2.P.g();
            com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar3 = null;
            }
            TextView textView = oVar3.N.G;
            FileInfoModel fileInfoModel = comicReaderActivity.P3;
            textView.setText(fileInfoModel != null ? fileInfoModel.getName() : null);
            gg.a aVar = comicReaderActivity.Z;
            comicReaderActivity.d8(((aVar == null || (aVarD = aVar.d()) == null) ? 1 : aVarD.getItemCount()) - 1);
            com.zentraedi.comic.databinding.o oVar4 = comicReaderActivity.T;
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar4;
            }
            RecyclerView mZoomRecyclerView = oVar.P.getMZoomRecyclerView();
            if (mZoomRecyclerView != null) {
                mZoomRecyclerView.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.b3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComicReaderActivity.C6(this.a);
                    }
                }, 200L);
            }
            FileInfoModel fileInfoModel2 = comicReaderActivity.P3;
            if (fileInfoModel2 != null) {
                comicReaderActivity.l8(fileInfoModel2);
            }
        } else {
            com.zentraedi.comic.databinding.o oVar5 = comicReaderActivity.T;
            if (oVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar5;
            }
            oVar.P.g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B7(PullToRefreshBase pullToRefreshBase, ComicReaderActivity comicReaderActivity, FileInfoModel fileInfoModel, DownLoadFileState downLoadFileState) {
        Intrinsics.checkNotNullParameter(downLoadFileState, "downLoadFileState");
        int i2 = b.$EnumSwitchMapping$1[downLoadFileState.ordinal()];
        if (i2 != 1) {
            com.zentraedi.comic.databinding.o oVar = null;
            if (i2 == 2) {
                pullToRefreshBase.g();
                comicReaderActivity.P3 = fileInfoModel;
                com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
                if (oVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar2 = null;
                }
                TextView textView = oVar2.N.G;
                FileInfoModel fileInfoModel2 = comicReaderActivity.P3;
                textView.setText(fileInfoModel2 != null ? fileInfoModel2.getName() : null);
                comicReaderActivity.d8(0);
                Intrinsics.checkNotNull(fileInfoModel);
                comicReaderActivity.l8(fileInfoModel);
            } else if (i2 == 3) {
                comicReaderActivity.A3 = -1;
                com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
                if (oVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    oVar = oVar3;
                }
                ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
                Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
                comicPullToRefreshRecyclerView.setProgress("(0%)");
                comicReaderActivity.n6().c1().set("(0%)");
                comicReaderActivity.P3 = fileInfoModel;
            }
        } else {
            pullToRefreshBase.g();
        }
        return Unit.INSTANCE;
    }

    private final void B8(String str) {
        int i2;
        if (str.length() == 0) {
            return;
        }
        String strY8 = y8(str);
        Iterator it = m6().Q0().iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            FileInfoModel fileInfoModel = (FileInfoModel) it.next();
            if (Intrinsics.areEqual(y8(fileInfoModel.getPath()), strY8) || Intrinsics.areEqual(fileInfoModel.getFileId(), str)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            for (FileInfoModel fileInfoModel2 : m6().P0()) {
                if (Intrinsics.areEqual(y8(fileInfoModel2.getPath()), strY8) || Intrinsics.areEqual(fileInfoModel2.getFileId(), str)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            i4 = i2;
        }
        nd.a.a(((BaseActivity) this).J, "matchReadingLocation path: " + strY8 + ", found index: " + i4);
        n6().c2(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.h8();
    }

    private final com.zentraedi.comic.viewmodel.o6 C7(String str) {
        String str2 = (String) com.zentraedi.business.utils.t7.d(str, "");
        if (str2 != null && str2.length() != 0) {
            try {
                return (com.zentraedi.comic.viewmodel.o6) new Gson().fromJson(str2, com.zentraedi.comic.viewmodel.o6.class);
            } catch (Exception e2) {
                nd.a.c(D5, "SaveReadSetting deserialization failed: " + e2.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void D7(final PullToRefreshBase<com.zentraedi.comic.view.e0> pullToRefreshBase) {
        int iIndexOf = m6().Q0().indexOf(this.P3);
        if (iIndexOf == -1) {
            Iterator it = m6().Q0().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                String path = ((FileInfoModel) it.next()).getPath();
                FileInfoModel fileInfoModel = this.P3;
                if (Intrinsics.areEqual(path, fileInfoModel != null ? fileInfoModel.getPath() : null)) {
                    iIndexOf = i2;
                    break;
                }
                i2++;
            }
        }
        int i3 = iIndexOf - 1;
        if (i3 < 0) {
            pullToRefreshBase.g();
            return;
        }
        final FileInfoModel fileInfoModel2 = (FileInfoModel) m6().Q0().get(i3);
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.C(fileInfoModel2, i3, new Function1() { // from class: com.zentraedi.comic.activity.p3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.E7(pullToRefreshBase, this, fileInfoModel2, (DownLoadFileState) obj);
                }
            });
        }
    }

    private final void E6() {
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        ObservableField<String> observableFieldB0;
        com.zentraedi.comic.viewmodel.a0 a0VarG2;
        String cover;
        StringBuilder sb = new StringBuilder();
        sb.append("initContentsUi itemType=");
        sb.append(this.e0);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicPath=");
        ComicInfoModel comicInfoModel = this.T3;
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        nd.a.e(D5, sb.toString());
        n6().m2(1);
        n6().k2(new Function0() { // from class: com.zentraedi.comic.activity.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.F6(this.a);
            }
        });
        gg.a aVar = this.Z;
        if (aVar != null && (a0VarG2 = aVar.g()) != null) {
            ComicInfoModel comicInfoModel2 = this.T3;
            if (comicInfoModel2 == null || (cover = comicInfoModel2.getCover()) == null) {
                cover = "";
            }
            com.zentraedi.comic.databinding.o oVar2 = this.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar2 = null;
            }
            ImageView ivIcon = oVar2.Q.F;
            Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
            a0VarG2.h0(cover, ivIcon);
        }
        gg.a aVar2 = this.Z;
        if (aVar2 != null && (a0VarG = aVar2.g()) != null && (observableFieldB0 = a0VarG.b0()) != null) {
            ComicInfoModel comicInfoModel3 = this.T3;
            observableFieldB0.set(comicInfoModel3 != null ? comicInfoModel3.getName() : null);
        }
        gg.a aVar3 = this.Z;
        if (aVar3 != null) {
            aVar3.s(q6(), new Function2() { // from class: com.zentraedi.comic.activity.i3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComicReaderActivity.G6(this.a, ((Integer) obj).intValue(), (String) obj2);
                }
            }, new Function1() { // from class: com.zentraedi.comic.activity.j3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.H6(this.a, (Bookmark) obj);
                }
            }, this.h0);
        }
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        if (oVar3.G.isDrawerOpen(8388611)) {
            com.zentraedi.comic.databinding.o oVar4 = this.T;
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar4;
            }
            oVar.G.closeDrawer(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E7(PullToRefreshBase pullToRefreshBase, ComicReaderActivity comicReaderActivity, FileInfoModel fileInfoModel, DownLoadFileState downLoadFileState) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(downLoadFileState, "downLoadFileState");
        int i2 = b.$EnumSwitchMapping$1[downLoadFileState.ordinal()];
        if (i2 != 1) {
            com.zentraedi.comic.databinding.o oVar = null;
            if (i2 == 2) {
                pullToRefreshBase.g();
                comicReaderActivity.P3 = fileInfoModel;
                com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
                if (oVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar2 = null;
                }
                TextView textView = oVar2.N.G;
                FileInfoModel fileInfoModel2 = comicReaderActivity.P3;
                textView.setText(fileInfoModel2 != null ? fileInfoModel2.getName() : null);
                gg.a aVar = comicReaderActivity.Z;
                comicReaderActivity.d8(((aVar == null || (aVarD = aVar.d()) == null) ? 1 : aVarD.getItemCount()) - 1);
                Intrinsics.checkNotNull(fileInfoModel);
                comicReaderActivity.l8(fileInfoModel);
            } else if (i2 == 3) {
                comicReaderActivity.A3 = 1;
                com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
                if (oVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    oVar = oVar3;
                }
                ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
                Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
                comicPullToRefreshRecyclerView.setProgress("(0%)");
                comicReaderActivity.n6().c1().set("(0%)");
                comicReaderActivity.P3 = fileInfoModel;
            }
        } else {
            pullToRefreshBase.g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F6(ComicReaderActivity comicReaderActivity) {
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        com.zentraedi.comic.databinding.m1 m1Var = oVar.Q;
        gg.a aVar = comicReaderActivity.Z;
        m1Var.C1(aVar != null ? aVar.g() : null);
        com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.G.openDrawer(8388611);
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null && (a0VarG = aVar2.g()) != null) {
            a0VarG.f0(comicReaderActivity.Q2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G6(ComicReaderActivity comicReaderActivity, int i2, String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        comicReaderActivity.d8(i2);
        comicReaderActivity.i6().setVisibility(8);
        ObservableField<Boolean> observableFieldQ0 = comicReaderActivity.n6().Q0();
        Iterator<T> it = comicReaderActivity.h0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Bookmark) next).getPosition() != i2);
        observableFieldQ0.set(Boolean.valueOf(next != null));
        return Unit.INSTANCE;
    }

    private final void G7() {
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H6(ComicReaderActivity comicReaderActivity, Bookmark bookmark) {
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        comicReaderActivity.s8(bookmark);
        return Unit.INSTANCE;
    }

    private final void H7(boolean z, CompoundButton compoundButton) {
        if (z) {
            int i2 = Settings.System.getInt(compoundButton.getContext().getContentResolver(), "screen_brightness", 0);
            com.zentraedi.comic.databinding.o oVar = this.T;
            com.zentraedi.comic.databinding.o oVar2 = null;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            int i3 = (int) ((i2 / 255.0f) * 100);
            oVar.I.E.H.setProgress(i3);
            com.zentraedi.comic.databinding.o oVar3 = this.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar2 = oVar3;
            }
            oVar2.H.H.setProgress(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void I6() {
        StringBuilder sb = new StringBuilder();
        sb.append("initEpubData currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicPath=");
        ComicInfoModel comicInfoModel = this.T3;
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" loadState=");
        sb.append(this.A3);
        nd.a.e(D5, sb.toString());
        n6().getShowLoading().set(Boolean.TRUE);
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.r(null, 0, 0, this, new Function1() { // from class: com.zentraedi.comic.activity.c3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.J6(this.a, (DownLoadFileState) obj);
                }
            }, new Function1() { // from class: com.zentraedi.comic.activity.d3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.L6(this.a, (String) obj);
                }
            }, this.Z2);
        }
    }

    private final j I7() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J6(ComicReaderActivity comicReaderActivity, DownLoadFileState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("initEpubData callback state=");
        sb.append(it);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel = comicReaderActivity.Z2;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        nd.a.a(D5, sb.toString());
        if (it == DownLoadFileState.FAIL) {
            pe.i.v(comicReaderActivity, 500L, new Function1() { // from class: com.zentraedi.comic.activity.w3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.K6((ComicReaderActivity) obj);
                }
            });
            return Unit.INSTANCE;
        }
        if (it == DownLoadFileState.SUCCESS) {
            comicReaderActivity.t6();
            comicReaderActivity.h8();
            comicReaderActivity.n6().getShowLoading().set(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final k J7() {
        return new k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit K6(ComicReaderActivity ktxRunOnUiDelay) {
        Intrinsics.checkNotNullParameter(ktxRunOnUiDelay, "$this$ktxRunOnUiDelay");
        if (!ktxRunOnUiDelay.isFinishing()) {
            ktxRunOnUiDelay.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K7() {
        Function0<Boolean> function0K1 = n6().k1();
        if (function0K1 != null) {
            function0K1.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L6(ComicReaderActivity comicReaderActivity, String str) {
        if (str != null) {
            comicReaderActivity.n6().c1().set('(' + str + "%)");
            com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
            comicPullToRefreshRecyclerView.setProgress('(' + str + "%)");
        }
        return Unit.INSTANCE;
    }

    private final void L7(com.zentraedi.comic.viewmodel.e3 e3Var) {
        ReadSetting readSettingC;
        ReadSetting readSettingG;
        String strS7 = S7(this, null, 1, null);
        com.zentraedi.comic.viewmodel.o6 o6VarC7 = C7(strS7);
        String strF = com.zentraedi.business.w0.F();
        if (o6VarC7 == null || (readSettingG = o6VarC7.g()) == null || (readSettingC = com.zentraedi.comic.viewmodel.o4.c(readSettingG)) == null) {
            readSettingC = com.zentraedi.comic.viewmodel.o4.c(o6().Z0());
        }
        c8(strS7, new com.zentraedi.comic.viewmodel.o6(strF, readSettingC, com.zentraedi.comic.viewmodel.o4.a(e3Var)));
    }

    private final void M6() {
        StringBuilder sb = new StringBuilder();
        sb.append("initEpubState currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicPath=");
        ComicInfoModel comicInfoModel = this.T3;
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        nd.a.e(D5, sb.toString());
        gg.a aVarC = new androidx.lifecycle.m2(this, this.b0).c(com.zentraedi.comic.viewmodel.o0.class);
        this.Z = aVarC;
        Intrinsics.checkNotNull(aVarC, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicEpubReaderViewModel");
        ((com.zentraedi.comic.viewmodel.o0) aVarC).T(this.c0);
        gg.a aVar = this.Z;
        if (aVar != null) {
            com.zentraedi.comic.databinding.o oVar2 = this.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar2;
            }
            RecyclerView chapterRecycler = oVar.Q.E;
            Intrinsics.checkNotNullExpressionValue(chapterRecycler, "chapterRecycler");
            aVar.v(chapterRecycler);
        }
        gg.a aVar2 = this.Z;
        if (aVar2 != null) {
            aVar2.k(i6());
        }
        E6();
        I6();
    }

    private final void M7(ReadSetting readSetting) {
        com.zentraedi.comic.viewmodel.e3 e3VarF;
        com.zentraedi.comic.viewmodel.e3 e3VarA = null;
        String strS7 = S7(this, null, 1, null);
        com.zentraedi.comic.viewmodel.o6 o6VarC7 = C7(strS7);
        String strF = com.zentraedi.business.w0.F();
        ReadSetting readSettingC = com.zentraedi.comic.viewmodel.o4.c(readSetting);
        if (o6VarC7 != null && (e3VarF = o6VarC7.f()) != null) {
            e3VarA = com.zentraedi.comic.viewmodel.o4.a(e3VarF);
        }
        c8(strS7, new com.zentraedi.comic.viewmodel.o6(strF, readSettingC, e3VarA));
    }

    private final void N6() {
        androidx.databinding.w<FileInfoModel> wVarP0 = m6().P0();
        StringBuilder sb = new StringBuilder();
        sb.append("initImageState currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" listSize=");
        sb.append(wVarP0.size());
        nd.a.e(D5, sb.toString());
        wVarP0.addOnListChangedCallback(this.u5);
        m6().c1(new Function1() { // from class: com.zentraedi.comic.activity.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.O6(this.a, ((Boolean) obj).booleanValue());
            }
        });
        gg.a aVarC = new androidx.lifecycle.m2(this, this.b0).c(com.zentraedi.comic.viewmodel.y2.class);
        this.Z = aVarC;
        Intrinsics.checkNotNull(aVarC, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicImageReaderViewModel");
        ((com.zentraedi.comic.viewmodel.y2) aVarC).V(this.c0);
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.k(i6());
        }
        gg.a aVar2 = this.Z;
        if (aVar2 != null) {
            com.zentraedi.comic.databinding.o oVar2 = this.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar2;
            }
            RecyclerView chapterRecycler = oVar.Q.E;
            Intrinsics.checkNotNullExpressionValue(chapterRecycler, "chapterRecycler");
            aVar2.v(chapterRecycler);
        }
        E6();
        if (wVarP0.isEmpty()) {
            return;
        }
        this.u5.g(wVarP0, 0, wVarP0.size());
    }

    private final void N7() {
        com.zentraedi.comic.view.e0 e0VarQ6 = q6();
        RecyclerView.ItemAnimator itemAnimator = e0VarQ6.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = e0VarQ6.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = e0VarQ6.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator4 = e0VarQ6.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(0L);
        }
        com.zentraedi.comic.databinding.o oVar = null;
        q6().setItemAnimator((RecyclerView.ItemAnimator) null);
        q6().setItemViewCacheSize(5);
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 5);
        q6().setRecycledViewPool(recycledViewPool);
        com.zentraedi.comic.databinding.o oVar2 = this.T;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar2;
        }
        com.zentraedi.comic.view.e0 mZoomRecyclerView = oVar.P.getMZoomRecyclerView();
        Intrinsics.checkNotNull(mZoomRecyclerView, "null cannot be cast to non-null type com.zentraedi.comic.view.ZoomRecyclerView");
        mZoomRecyclerView.setMPageClickListener(new l());
        q6().setMOnRecyclerViewListener(new m());
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.f(q6());
        }
        q6().addOnScrollListener(new n());
        Q6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O6(ComicReaderActivity comicReaderActivity, boolean z) {
        if (z) {
            comicReaderActivity.m6().U0(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void O7() {
        ObservableField<Boolean> observableFieldY1 = n6().y1();
        Boolean bool = (Boolean) n6().y1().get();
        observableFieldY1.set(Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)));
        Boolean bool2 = (Boolean) n6().y1().get();
        com.zentraedi.basic.function.utils.b.C(this, bool2 != null ? bool2.booleanValue() : false);
    }

    private final void P6() {
        androidx.databinding.w<FileInfoModel> wVarQ0 = m6().Q0();
        StringBuilder sb = new StringBuilder();
        sb.append("initPDFState currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" listSize=");
        sb.append(wVarQ0.size());
        nd.a.e(D5, sb.toString());
        wVarQ0.addOnListChangedCallback(this.u5);
        gg.a aVarC = new androidx.lifecycle.m2(this, this.b0).c(com.zentraedi.comic.viewmodel.i4.class);
        this.Z = aVarC;
        Intrinsics.checkNotNull(aVarC, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicPdfReaderViewModel");
        ((com.zentraedi.comic.viewmodel.i4) aVarC).L0(this.c0);
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.k(i6());
        }
        gg.a aVar2 = this.Z;
        if (aVar2 != null) {
            com.zentraedi.comic.databinding.o oVar2 = this.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar2;
            }
            RecyclerView chapterRecycler = oVar.Q.E;
            Intrinsics.checkNotNullExpressionValue(chapterRecycler, "chapterRecycler");
            aVar2.v(chapterRecycler);
        }
        E6();
        if (wVarQ0.isEmpty()) {
            return;
        }
        this.u5.g(wVarQ0, 0, wVarQ0.size());
    }

    private final void P7() {
        String name;
        com.zentraedi.comic.adapter.a aVarD;
        n6().m2(null);
        StringBuilder sb = new StringBuilder();
        sb.append("resetRead begin from=");
        sb.append(this.c0);
        sb.append(" itemType=");
        sb.append(this.e0);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicPath=");
        ComicInfoModel comicInfoModel = this.T3;
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        nd.a.e(D5, sb.toString());
        ComicItemType comicItemType = this.e0;
        int i2 = comicItemType == null ? -1 : b.$EnumSwitchMapping$0[comicItemType.ordinal()];
        if (i2 == 1) {
            P6();
        } else if (i2 == 2) {
            N6();
        } else if (i2 == 3) {
            M6();
        } else if (i2 == 4) {
            x7();
        }
        R6();
        m8(o6().Z0(), false);
        k6();
        n6().getShowLoading().set(Boolean.TRUE);
        ObservableField<String> observableFieldT = n6().T();
        FileInfoModel fileInfoModel2 = this.Z2;
        if (fileInfoModel2 == null || (name = fileInfoModel2.getName()) == null) {
            name = "";
        }
        observableFieldT.set(name);
        gg.a aVar = this.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            PageOver pageOver = (PageOver) p6().f0().get();
            if (pageOver == null) {
                pageOver = PageOver.NO;
            }
            aVarD.T(pageOver);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resetRead");
        FileInfoModel fileInfoModel3 = this.Z2;
        sb2.append(fileInfoModel3 != null ? fileInfoModel3.getName() : null);
        nd.a.a(D5, sb2.toString());
    }

    private final void Q6() {
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.P.setOnRefreshListener(new g());
    }

    private final void Q7() {
        com.zentraedi.comic.view.e0 e0VarQ6 = q6();
        Intrinsics.checkNotNull(e0VarQ6, "null cannot be cast to non-null type com.zentraedi.comic.view.ZoomRecyclerView");
        e0VarQ6.getRecycledViewPool().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R6() {
        ReadModel readModel;
        com.zentraedi.comic.databinding.o oVar = this.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.I.G1(o6());
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        oVar3.I.E.C1(p6());
        com.zentraedi.comic.databinding.o oVar4 = this.T;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar4 = null;
        }
        oVar4.H.C1(p6());
        int i2 = Settings.System.getInt(getContentResolver(), "screen_brightness", 0);
        com.zentraedi.comic.databinding.o oVar5 = this.T;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar5 = null;
        }
        int i3 = (int) ((i2 / 255.0f) * 100);
        oVar5.I.E.H.setProgress(i3);
        com.zentraedi.comic.databinding.o oVar6 = this.T;
        if (oVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar6 = null;
        }
        oVar6.H.H.setProgress(i3);
        com.zentraedi.comic.databinding.o oVar7 = this.T;
        if (oVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar7 = null;
        }
        oVar7.I.E.H.setOnSeekBarChangeListener(J7());
        com.zentraedi.comic.databinding.o oVar8 = this.T;
        if (oVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar8 = null;
        }
        oVar8.H.H.setOnSeekBarChangeListener(J7());
        com.zentraedi.comic.databinding.o oVar9 = this.T;
        if (oVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar9 = null;
        }
        oVar9.I.E.E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.comic.activity.y2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ComicReaderActivity.S6(this.a, compoundButton, z);
            }
        });
        com.zentraedi.comic.databinding.o oVar10 = this.T;
        if (oVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar10 = null;
        }
        oVar10.H.E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.comic.activity.z2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ComicReaderActivity.T6(this.a, compoundButton, z);
            }
        });
        try {
            this.Q4 = z7();
            p6().Q0(this.Q4, false);
            com.zentraedi.comic.viewmodel.o6 o6VarC7 = C7(S7(this, null, 1, null));
            if (o6VarC7 == null) {
                o6VarC7 = Z5();
            }
            com.zentraedi.comic.viewmodel.e3 e3VarF = o6VarC7.f();
            if (e3VarF != null) {
                T5(e3VarF);
            }
            ReadSetting readSettingC = com.zentraedi.comic.viewmodel.o4.c(o6VarC7.g());
            readSettingC.z(this.M1);
            readSettingC.G(this.a2);
            if (readSettingC.k() == ReadModel.NORMAL_NULL) {
                int i4 = this.M2;
                if (i4 == 0) {
                    readModel = ReadModel.SCROLL_READ;
                } else if (i4 != 1) {
                    readModel = i4 != 2 ? ReadModel.SCROLL_READ : ReadModel.MANGA_READ;
                } else {
                    readModel = ReadModel.NORMAL_READ;
                }
                readSettingC.B(readModel);
            }
            j8(readSettingC.j());
            o6().f1(readSettingC);
            com.zentraedi.comic.databinding.o oVar11 = this.T;
            if (oVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar2 = oVar11;
            }
            oVar2.P.setReadModel(readSettingC.k());
        } catch (Exception e2) {
            nd.a.c(D5, "initReadSetting exception: " + e2.getMessage());
        }
    }

    private final String R7(ComicApplyScope comicApplyScope) {
        return comicApplyScope == ComicApplyScope.ALL_COMIC ? g6() : j6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S6(ComicReaderActivity comicReaderActivity, CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        comicReaderActivity.H7(z, buttonView);
    }

    static /* synthetic */ String S7(ComicReaderActivity comicReaderActivity, ComicApplyScope comicApplyScope, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            comicApplyScope = comicReaderActivity.Q4;
        }
        return comicReaderActivity.R7(comicApplyScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T5(com.zentraedi.comic.viewmodel.e3 e3Var) {
        com.zentraedi.comic.adapter.a aVarD;
        com.zentraedi.comic.x.a.a(this, e3Var.l());
        this.r1 = e3Var.k();
        p6().X().set(Boolean.valueOf(this.r1));
        com.zentraedi.comic.databinding.o oVar = this.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.F.setBackgroundColor(e3Var.j() == 0 ? -16777216 : -1);
        Integer numA1 = n6().A1();
        if (numA1 != null && numA1.intValue() != e3Var.j()) {
            n6().m2(null);
        }
        p6().T().set(Integer.valueOf(e3Var.j()));
        int iL = (int) ((e3Var.l() / ((long) 60)) / ((long) 1000));
        if (iL == Integer.MAX_VALUE || iL < 0) {
            p6().d0().set(1);
        } else {
            p6().d0().set(Integer.valueOf(iL));
        }
        p6().b0().set(Long.valueOf(e3Var.l()));
        p6().g0().set(e3Var.p());
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.P.setPageOver(e3Var.n());
        q6().setPageOver(e3Var.n());
        gg.a aVar = this.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.T(e3Var.n());
        }
        this.g0 = e3Var.m();
        p6().k0().set(Boolean.valueOf(this.g0));
        p6().f0().set(e3Var.n());
        if (!this.g0) {
            this.i0.removeCallbacks(this.v5);
            p6().R().set(Integer.valueOf(e3Var.o()));
            p6().S().set(Integer.valueOf(e3Var.o()));
            return;
        }
        A8();
        int iO = e3Var.n() == PageOver.SCROLL ? 100 - e3Var.o() : e3Var.o();
        int i2 = (int) ((iO / 100.0f) * 6 * 1000);
        this.P2 = i2;
        if (i2 == 0) {
            this.P2 = 1000;
        }
        p6().R().set(Integer.valueOf(iO));
        p6().S().set(Integer.valueOf(iO));
        z8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T6(ComicReaderActivity comicReaderActivity, CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        comicReaderActivity.H7(z, buttonView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.zentraedi.comic.view.e0] */
    private final void T7(final int i2, long j2) {
        final ?? Q6 = q6();
        final Function0 function0 = new Function0() { // from class: com.zentraedi.comic.activity.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.V7(this.a, i2, Q6);
            }
        };
        if (j2 > 0) {
            Q6.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.t2
                @Override // java.lang.Runnable
                public final void run() {
                    ComicReaderActivity.X7(function0);
                }
            }, j2);
        } else if (Q6.isLayoutRequested() || !Q6.isAttachedToWindow()) {
            Q6.post(new Runnable() { // from class: com.zentraedi.comic.activity.e3
                @Override // java.lang.Runnable
                public final void run() {
                    ComicReaderActivity.Y7(function0);
                }
            });
        } else {
            function0.invoke();
        }
    }

    private final com.zentraedi.comic.viewmodel.e3 U5() {
        Integer num = (Integer) p6().T().get();
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) p6().X().get();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Long l2 = (Long) p6().b0().get();
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        PageTurning pageTurning = (PageTurning) p6().g0().get();
        if (pageTurning == null) {
            pageTurning = PageTurning.SINGLE;
        }
        boolean zAreEqual = Intrinsics.areEqual(p6().k0().get(), Boolean.TRUE);
        Integer num2 = (Integer) p6().R().get();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        PageOver pageOver = (PageOver) p6().f0().get();
        if (pageOver == null) {
            pageOver = PageOver.SCROLL;
        }
        return new com.zentraedi.comic.viewmodel.e3(iIntValue, zBooleanValue, jLongValue, pageTurning, zAreEqual, iIntValue2, pageOver);
    }

    private final void U6() {
        n6().y1().addOnPropertyChangedCallback(new h());
        n6().Y1(new Function0() { // from class: com.zentraedi.comic.activity.c4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.V6(this.a);
            }
        });
        p6().H0(new Function1() { // from class: com.zentraedi.comic.activity.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.W6(this.a, (OverallReadSetting) obj);
            }
        });
        p6().I0(new Function1() { // from class: com.zentraedi.comic.activity.l2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.h7(this.a, (ComicApplyScope) obj);
            }
        });
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.M.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicReaderActivity.n7(view);
            }
        });
        n6().U1(new Function0() { // from class: com.zentraedi.comic.activity.n2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.o7(this.a);
            }
        });
        n6().S1(new Function0() { // from class: com.zentraedi.comic.activity.o2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.p7(this.a);
            }
        });
        n6().setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicReaderActivity.s7(view);
            }
        });
        n6().a2(new Function1() { // from class: com.zentraedi.comic.activity.q2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.t7(this.a, ((Integer) obj).intValue());
            }
        });
        n6().X1(new Function0() { // from class: com.zentraedi.comic.activity.r2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.v7(this.a);
            }
        });
        n6().W1(new Function0() { // from class: com.zentraedi.comic.activity.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.w7(this.a);
            }
        });
        n6().b2(new Function0() { // from class: com.zentraedi.comic.activity.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ComicReaderActivity.X6(this.a));
            }
        });
        n6().g2(new Function0() { // from class: com.zentraedi.comic.activity.e4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ComicReaderActivity.Y6(this.a));
            }
        });
        n6().i2(new Function0() { // from class: com.zentraedi.comic.activity.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.Z6(this.a);
            }
        });
        o6().Y1(new Function1() { // from class: com.zentraedi.comic.activity.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.a7(this.a, (ReadSetting) obj);
            }
        });
        o6().Z1(new Function1() { // from class: com.zentraedi.comic.activity.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.b7(this.a, (ReadSetting) obj);
            }
        });
        n6().l2(new Function0() { // from class: com.zentraedi.comic.activity.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.c7(this.a);
            }
        });
        o6().K1(new Function1() { // from class: com.zentraedi.comic.activity.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.d7(this.a, (ReadSetting) obj);
            }
        });
        o6().M1(new Function1() { // from class: com.zentraedi.comic.activity.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.e7(this.a, (ReadSetting) obj);
            }
        });
        o6().O1(new Function1() { // from class: com.zentraedi.comic.activity.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.f7(this.a, (ReadSetting) obj);
            }
        });
        o6().P1(new Function1() { // from class: com.zentraedi.comic.activity.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.g7(this.a, (ReadSetting) obj);
            }
        });
        o6().c2(new Function0() { // from class: com.zentraedi.comic.activity.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.i7(this.a);
            }
        });
        o6().d2(new Function0() { // from class: com.zentraedi.comic.activity.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicReaderActivity.k7(this.a);
            }
        });
        o6().e2(new Function1() { // from class: com.zentraedi.comic.activity.k2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderActivity.m7(this.a, ((Float) obj).floatValue());
            }
        });
    }

    static /* synthetic */ void U7(ComicReaderActivity comicReaderActivity, int i2, long j2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j2 = 0;
        }
        comicReaderActivity.T7(i2, j2);
    }

    private final com.zentraedi.comic.viewmodel.o6 V5() {
        return new com.zentraedi.comic.viewmodel.o6(com.zentraedi.business.w0.F(), com.zentraedi.comic.viewmodel.o4.c(o6().Z0()), U5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V6(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit V7(final ComicReaderActivity comicReaderActivity, int i2, final com.zentraedi.comic.view.e0 e0Var) {
        com.zentraedi.comic.adapter.a aVarD;
        if (!comicReaderActivity.isFinishing()) {
            gg.a aVar = comicReaderActivity.Z;
            int itemCount = (aVar == null || (aVarD = aVar.d()) == null) ? 0 : aVarD.getItemCount();
            nd.a.a(D5, "safeScrollToPosition execute: pos=" + i2 + ", adapterCount=" + itemCount);
            if (i2 < 0 || i2 >= itemCount) {
                i2 = itemCount > 0 ? 0 : -1;
            }
            if (i2 != -1) {
                comicReaderActivity.Q2 = i2;
                e0Var.scrollToPosition(i2);
                LinearLayoutManager layoutManager = e0Var.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i2, 0);
                }
                e0Var.post(new Runnable() { // from class: com.zentraedi.comic.activity.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComicReaderActivity.W7(this.a, e0Var);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    private final void W5() {
        com.zentraedi.comic.view.a aVar = this.a1;
        if (aVar != null) {
            aVar.g(false);
        }
        com.zentraedi.comic.view.a aVar2 = this.a1;
        if (aVar2 != null) {
            aVar2.f(true);
        }
        ReadModel readModelK = o6().Z0().k();
        PageTurning pageTurning = (PageTurning) p6().g0().get();
        if (pageTurning == null) {
            pageTurning = PageTurning.SINGLE;
        }
        D6(readModelK, pageTurning, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W6(ComicReaderActivity comicReaderActivity, OverallReadSetting overallReadSetting) {
        Intrinsics.checkNotNullParameter(overallReadSetting, "overallReadSetting");
        comicReaderActivity.o8(overallReadSetting);
        comicReaderActivity.L7(comicReaderActivity.U5());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void W7(ComicReaderActivity comicReaderActivity, com.zentraedi.comic.view.e0 e0Var) {
        if (comicReaderActivity.isFinishing()) {
            return;
        }
        if (e0Var.canScrollVertically(1)) {
            e0Var.scrollBy(0, 1);
            e0Var.scrollBy(0, -1);
        } else if (e0Var.canScrollVertically(-1)) {
            e0Var.scrollBy(0, -1);
            e0Var.scrollBy(0, 1);
        } else if (e0Var.canScrollHorizontally(1)) {
            e0Var.scrollBy(1, 0);
            e0Var.scrollBy(-1, 0);
        } else if (e0Var.canScrollHorizontally(-1)) {
            e0Var.scrollBy(-1, 0);
            e0Var.scrollBy(1, 0);
        }
        comicReaderActivity.h8();
        comicReaderActivity.i8();
    }

    private final void X5() {
        com.zentraedi.comic.view.a aVar = this.a1;
        if (aVar != null) {
            aVar.g(true);
        }
        com.zentraedi.comic.view.a aVar2 = this.a1;
        if (aVar2 != null) {
            aVar2.f(true);
        }
        ReadModel readModelK = o6().Z0().k();
        PageTurning pageTurning = (PageTurning) p6().g0().get();
        if (pageTurning == null) {
            pageTurning = PageTurning.SINGLE;
        }
        D6(readModelK, pageTurning, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X6(ComicReaderActivity comicReaderActivity) {
        ReadSetting readSettingZ0 = comicReaderActivity.o6().Z0();
        PageOver pageOver = (PageOver) comicReaderActivity.p6().f0().get();
        if (pageOver == null) {
            pageOver = PageOver.NO;
        }
        if (readSettingZ0.k() == ReadModel.SCROLL_READ) {
            com.zentraedi.comic.w.z(comicReaderActivity.q6(), pageOver, readSettingZ0.p());
            return false;
        }
        com.zentraedi.comic.w.y(comicReaderActivity.q6(), readSettingZ0, pageOver);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X7(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y6(ComicReaderActivity comicReaderActivity) {
        if (!com.zentraedi.comic.w.f(comicReaderActivity.q6(), comicReaderActivity.o6().Z0(), true)) {
            return false;
        }
        int i2 = (int) (comicReaderActivity.d0 * ((comicReaderActivity.P2 / 1000) / 6.0f));
        int i3 = i2 > 0 ? i2 : 1;
        PageOver pageOver = (PageOver) comicReaderActivity.p6().f0().get();
        if (pageOver == null) {
            pageOver = PageOver.NO;
        }
        if (comicReaderActivity.p6().f0().get() != PageOver.SCROLL || !comicReaderActivity.g0) {
            if (comicReaderActivity.o6().Z0().k() == ReadModel.SCROLL_READ) {
                com.zentraedi.comic.w.C(comicReaderActivity.q6(), pageOver, comicReaderActivity.o6().Z0().p());
            } else {
                com.zentraedi.comic.w.B(comicReaderActivity.q6(), comicReaderActivity.o6().Z0(), pageOver);
            }
            return false;
        }
        if (comicReaderActivity.o6().Z0().k() == ReadModel.SCROLL_READ) {
            comicReaderActivity.q6().scrollBy(0, i3);
        }
        if (comicReaderActivity.o6().Z0().k() == ReadModel.MANGA_READ) {
            comicReaderActivity.q6().scrollBy(-i3, 0);
        }
        if (comicReaderActivity.o6().Z0().k() == ReadModel.NORMAL_READ) {
            comicReaderActivity.q6().scrollBy(i3, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y7(Function0 function0) {
        function0.invoke();
    }

    private final com.zentraedi.comic.viewmodel.o6 Z5() {
        ReadModel readModel;
        ReadSetting readSettingB = com.zentraedi.comic.viewmodel.o4.b();
        readSettingB.G(this.a2);
        readSettingB.z(this.M1);
        int i2 = this.M2;
        if (i2 == 0) {
            readModel = ReadModel.SCROLL_READ;
        } else if (i2 != 1) {
            readModel = i2 != 2 ? ReadModel.SCROLL_READ : ReadModel.MANGA_READ;
        } else {
            readModel = ReadModel.NORMAL_READ;
        }
        readSettingB.B(readModel);
        return new com.zentraedi.comic.viewmodel.o6(com.zentraedi.business.w0.F(), readSettingB, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z6(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.setRequestedOrientation(!Intrinsics.areEqual(comicReaderActivity.n6().B1().get(), Boolean.TRUE) ? 1 : 0);
        return Unit.INSTANCE;
    }

    private final void Z7(ComicApplyScope comicApplyScope) {
        com.zentraedi.business.utils.t7.j(h6(), comicApplyScope.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a6(androidx.databinding.w<FileInfoModel> wVar, int i2, int i3) {
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.r(wVar, i2, i3, this, new Function1() { // from class: com.zentraedi.comic.activity.y3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.b6(this.a, (DownLoadFileState) obj);
                }
            }, new Function1() { // from class: com.zentraedi.comic.activity.z3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.e6(this.a, (String) obj);
                }
            }, this.Z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicReaderActivity.b8(it);
        com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        if (oVar.G.isDrawerOpen(8388613)) {
            com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar2 = oVar3;
            }
            oVar2.G.closeDrawer(8388613);
        }
        comicReaderActivity.m8(it, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a8() {
        Object next;
        String id2;
        ComicInfoModel comicInfoModel;
        int i2;
        gg.a aVar = this.Z;
        NasReadingRecordModule nasReadingRecordModuleQ = aVar != null ? aVar.q() : null;
        if (nasReadingRecordModuleQ != null) {
            nasReadingRecordModuleQ.setBookmarks(this.h0);
        }
        ObservableField<Boolean> observableFieldQ0 = n6().Q0();
        Iterator<T> it = this.h0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Bookmark) next).getPosition() != this.Q2);
        observableFieldQ0.set(Boolean.valueOf(next != null));
        if (nasReadingRecordModuleQ != null) {
            Layout layout = this.k0;
            if (layout == Layout.SINGLE) {
                i2 = 1;
            } else if (layout == Layout.DOUBLE) {
                i2 = 2;
            } else {
                i2 = layout == Layout.DOUBLE_REVERSAL ? 3 : 0;
            }
            nasReadingRecordModuleQ.setDevideMode(i2);
        }
        if (nasReadingRecordModuleQ != null) {
            nasReadingRecordModuleQ.setReadModel(o6().Z0().k().ordinal());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onBackPressed--save-readModel");
        sb.append(nasReadingRecordModuleQ != null ? Integer.valueOf(nasReadingRecordModuleQ.getReadModel()) : null);
        nd.a.a(D5, sb.toString());
        ComicInfoModel comicInfoModel2 = this.T3;
        if (comicInfoModel2 != null && (id2 = comicInfoModel2.getId()) != null && !Intrinsics.areEqual(id2, "")) {
            com.zentraedi.comic.util.l.a.i(id2, new Gson().toJson(nasReadingRecordModuleQ));
            if (!NasConnectManager.getInstance().isOfflineLogin() && (comicInfoModel = this.T3) != null && !comicInfoModel.isOfflineData() && this.w5 == 5) {
                com.zentraedi.comic.viewmodel.m4 m4VarM6 = m6();
                String json = new Gson().toJson(nasReadingRecordModuleQ);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                m4VarM6.G0(id2, json);
                this.w5 = 0;
            }
            if (nasReadingRecordModuleQ != null) {
                this.w5++;
                n6().Q1(this.T3, nasReadingRecordModuleQ);
            }
        }
        ComicInfoModel comicInfoModel3 = this.T3;
        if (comicInfoModel3 != null) {
            String json2 = new Gson().toJson(nasReadingRecordModuleQ);
            if (TextUtils.isEmpty(comicInfoModel3.getId())) {
                com.zentraedi.comic.util.l.a.j(comicInfoModel3.getPath(), json2);
            } else {
                com.zentraedi.comic.util.l.a.i(comicInfoModel3.getId(), json2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit b6(final ComicReaderActivity comicReaderActivity, DownLoadFileState downLoadFileState) {
        Intrinsics.checkNotNullParameter(downLoadFileState, "downLoadFileState");
        int i2 = b.$EnumSwitchMapping$1[downLoadFileState.ordinal()];
        if (i2 != 1) {
            com.zentraedi.comic.databinding.o oVar = null;
            if (i2 == 2) {
                if (comicReaderActivity.c0 == 3) {
                    comicReaderActivity.n6().c1().set("(100%)");
                    com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
                    if (oVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        oVar = oVar2;
                    }
                    ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
                    Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
                    comicPullToRefreshRecyclerView.setProgress("(100%)");
                }
                comicReaderActivity.n6().getShowLoading().set(Boolean.FALSE);
                gg.a aVar = comicReaderActivity.Z;
                if (aVar != null) {
                    aVar.s(comicReaderActivity.q6(), new Function2() { // from class: com.zentraedi.comic.activity.a4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ComicReaderActivity.c6(this.a, ((Integer) obj).intValue(), (String) obj2);
                        }
                    }, new Function1() { // from class: com.zentraedi.comic.activity.b4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ComicReaderActivity.d6(this.a, (Bookmark) obj);
                        }
                    }, comicReaderActivity.h0);
                }
                comicReaderActivity.t6();
                comicReaderActivity.h8();
                FileInfoModel fileInfoModel = comicReaderActivity.Z2;
                if (fileInfoModel != null) {
                    comicReaderActivity.l8(fileInfoModel);
                }
            } else if (i2 == 3) {
                comicReaderActivity.n6().c1().set("(0%)");
                com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
                if (oVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    oVar = oVar3;
                }
                ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView2 = oVar.P;
                Intrinsics.checkNotNull(comicPullToRefreshRecyclerView2, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
                comicPullToRefreshRecyclerView2.setProgress("(0%)");
                comicReaderActivity.A3 = 0;
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            comicReaderActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicReaderActivity.M7(it);
        return Unit.INSTANCE;
    }

    private final void b8(ReadSetting readSetting) {
        M7(readSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c6(ComicReaderActivity comicReaderActivity, int i2, String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        comicReaderActivity.d8(i2);
        comicReaderActivity.i6().setVisibility(8);
        ObservableField<Boolean> observableFieldQ0 = comicReaderActivity.n6().Q0();
        Iterator<T> it = comicReaderActivity.h0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Bookmark) next).getPosition() != i2);
        observableFieldQ0.set(Boolean.valueOf(next != null));
        comicReaderActivity.n6().T().set(name);
        nd.a.a(D5, "dataChangeOnItemRangeInserted" + name + "pos" + i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c7(ComicReaderActivity comicReaderActivity) {
        com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        if (oVar.G.isDrawerOpen(8388613)) {
            com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar2 = oVar3;
            }
            oVar2.G.closeDrawer(8388613);
        } else {
            com.zentraedi.comic.databinding.o oVar4 = comicReaderActivity.T;
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar2 = oVar4;
            }
            oVar2.G.openDrawer(8388613);
        }
        return Unit.INSTANCE;
    }

    private final void c8(String str, com.zentraedi.comic.viewmodel.o6 o6Var) {
        if (str.length() == 0) {
            return;
        }
        try {
            com.zentraedi.business.utils.t7.j(str, new Gson().toJson(o6Var));
        } catch (Exception e2) {
            nd.a.c(D5, "SaveReadSetting serialization failed: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d6(ComicReaderActivity comicReaderActivity, Bookmark bookmark) {
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        comicReaderActivity.s8(bookmark);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(it, "it");
        Layout layout = Layout.COMMON;
        comicReaderActivity.k0 = layout;
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.D(layout);
        }
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null) {
            aVar2.i(layout);
        }
        comicReaderActivity.Q2 /= 2;
        comicReaderActivity.q6().invalidate();
        comicReaderActivity.d8(comicReaderActivity.Q2);
        comicReaderActivity.b8(it);
        return Unit.INSTANCE;
    }

    private final void d8(int i2) {
        U7(this, i2, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e6(ComicReaderActivity comicReaderActivity, String str) {
        if (str != null) {
            comicReaderActivity.n6().c1().set('(' + str + ')');
            com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
            comicPullToRefreshRecyclerView.setProgress('(' + str + ')');
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(it, "it");
        Layout layout = comicReaderActivity.k0;
        if (layout == Layout.COMMON) {
            comicReaderActivity.Q2 /= 2;
        } else if (layout != Layout.DOUBLE_REVERSAL && layout == Layout.SINGLE) {
            comicReaderActivity.Q2 /= 4;
        }
        Layout layout2 = Layout.DOUBLE;
        comicReaderActivity.k0 = layout2;
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.D(layout2);
        }
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null) {
            aVar2.i(layout2);
        }
        comicReaderActivity.q6().invalidate();
        comicReaderActivity.d8(comicReaderActivity.Q2);
        comicReaderActivity.b8(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object] */
    private final void e8() {
        String id2;
        ComicCategory category;
        List bookmarks;
        if (!this.f0 || this.T3 == null) {
            return;
        }
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ComicInfoModel comicInfoModel = this.T3;
            String progress = comicInfoModel != null ? comicInfoModel.getProgress() : null;
            if (progress != null && progress.length() != 0) {
                Gson gson = new Gson();
                ComicInfoModel comicInfoModel2 = this.T3;
                objectRef.element = gson.fromJson(comicInfoModel2 != null ? comicInfoModel2.getProgress() : null, NasReadingRecordModule.class);
            }
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) objectRef.element;
            if (nasReadingRecordModule != null && (bookmarks = nasReadingRecordModule.getBookmarks()) != null) {
                this.h0.addAll(bookmarks);
            }
            ig.k kVar = ig.k.a;
            ComicInfoModel comicInfoModel3 = this.T3;
            Intrinsics.checkNotNull(comicInfoModel3);
            String id3 = comicInfoModel3.getId();
            ComicInfoModel comicInfoModel4 = this.T3;
            Intrinsics.checkNotNull(comicInfoModel4);
            ComicDirModel dir = comicInfoModel4.getDir();
            if (dir == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
                id2 = "0";
            }
            kVar.r(id3, id2, new Function1() { // from class: com.zentraedi.comic.activity.m3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.f8(objectRef, this, (ReadingRecord) obj);
                }
            });
        } catch (Exception e2) {
            nd.a.c(((BaseActivity) this).J, "searchReadingRecord exception: " + e2.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f6() {
        Object obj = n6().y1().get();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.areEqual(obj, bool)) {
            return;
        }
        n6().y1().set(bool);
        i6().setVisibility(8);
        Boolean bool2 = (Boolean) n6().y1().get();
        com.zentraedi.basic.function.utils.b.C(this, bool2 != null ? bool2.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(it, "it");
        Layout layout = comicReaderActivity.k0;
        if (layout == Layout.COMMON) {
            comicReaderActivity.Q2 /= 2;
        } else if (layout != Layout.DOUBLE && layout == Layout.SINGLE) {
            comicReaderActivity.Q2 /= 4;
        }
        comicReaderActivity.b8(it);
        Layout layout2 = Layout.DOUBLE_REVERSAL;
        comicReaderActivity.k0 = layout2;
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.D(layout2);
        }
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null) {
            aVar2.i(layout2);
        }
        comicReaderActivity.q6().invalidate();
        comicReaderActivity.d8(comicReaderActivity.Q2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.zentraedi.business.request.NasReadingRecordModule] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.zentraedi.business.request.NasReadingRecordModule] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final Unit f8(Ref.ObjectRef objectRef, final ComicReaderActivity comicReaderActivity, ReadingRecord readingRecord) {
        ?? r0 = 0;
        r0 = 0;
        String progress = readingRecord != null ? readingRecord.getProgress() : null;
        if (progress != null && progress.length() != 0) {
            r0 = (NasReadingRecordModule) new Gson().fromJson(readingRecord != null ? readingRecord.getProgress() : null, NasReadingRecordModule.class);
        }
        if (r0 != 0) {
            if (objectRef.element != 0) {
                long time = r0.getTime();
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) objectRef.element;
                if (time <= (nasReadingRecordModule != null ? nasReadingRecordModule.getTime() : 0L)) {
                    if (objectRef.element != 0) {
                        ComicReaderViewModel comicReaderViewModelN6 = comicReaderActivity.n6();
                        ComicInfoModel comicInfoModel = comicReaderActivity.T3;
                        T t2 = objectRef.element;
                        Intrinsics.checkNotNull(t2);
                        comicReaderViewModelN6.Q1(comicInfoModel, (NasReadingRecordModule) t2);
                    }
                }
            }
            objectRef.element = r0;
        } else if (objectRef.element != 0) {
            ComicReaderViewModel comicReaderViewModelN7 = comicReaderActivity.n6();
            ComicInfoModel comicInfoModel2 = comicReaderActivity.T3;
            T t3 = objectRef.element;
            Intrinsics.checkNotNull(t3);
            comicReaderViewModelN7.Q1(comicInfoModel2, (NasReadingRecordModule) t3);
        }
        final NasReadingRecordModule nasReadingRecordModule2 = (NasReadingRecordModule) objectRef.element;
        if (nasReadingRecordModule2 == null) {
            return Unit.INSTANCE;
        }
        comicReaderActivity.runOnUiThread(new Runnable() { // from class: com.zentraedi.comic.activity.x1
            @Override // java.lang.Runnable
            public final void run() {
                ComicReaderActivity.g8(nasReadingRecordModule2, comicReaderActivity);
            }
        });
        return Unit.INSTANCE;
    }

    private final String g6() {
        return com.zentraedi.business.utils.k0.e0(A5, (String) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g7(ComicReaderActivity comicReaderActivity, ReadSetting it) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(it, "it");
        Layout layout = Layout.SINGLE;
        comicReaderActivity.k0 = layout;
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.D(layout);
        }
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null) {
            aVar2.i(layout);
        }
        comicReaderActivity.Q2 *= 2;
        comicReaderActivity.q6().invalidate();
        comicReaderActivity.d8(comicReaderActivity.Q2);
        comicReaderActivity.b8(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g8(NasReadingRecordModule nasReadingRecordModule, ComicReaderActivity comicReaderActivity) {
        String filePath = nasReadingRecordModule.getFilePath();
        comicReaderActivity.n6().d2(filePath);
        FileInfoModel fileInfoModel = comicReaderActivity.Z2;
        if (Intrinsics.areEqual(filePath, fileInfoModel != null ? fileInfoModel.getPath() : null) || TextUtils.isEmpty(filePath)) {
            comicReaderActivity.n6().x1().set(Boolean.FALSE);
            return;
        }
        comicReaderActivity.n6().x1().set(Boolean.TRUE);
        comicReaderActivity.n6().g1().set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.UJ, com.zentraedi.business.utils.l5.r(filePath)));
        comicReaderActivity.B8(filePath);
    }

    private final String h6() {
        return com.zentraedi.business.utils.k0.e0(z5, (String) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h7(ComicReaderActivity comicReaderActivity, ComicApplyScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        comicReaderActivity.u6(scope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h8() {
        com.zentraedi.comic.adapter.a aVarD;
        com.zentraedi.comic.adapter.a aVarD2;
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        ObservableField<String> observableFieldC0;
        RecyclerView.Adapter adapter = q6().getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) == 0) {
            return;
        }
        int itemCount = 1;
        int iJ = com.zentraedi.comic.w.j(q6()) + 1;
        ObservableField<String> observableFieldO1 = n6().o1();
        StringBuilder sb = new StringBuilder();
        sb.append(iJ);
        sb.append(" / ");
        RecyclerView.Adapter adapter2 = q6().getAdapter();
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(adapter2 != null ? Integer.valueOf(adapter2.getItemCount()) : null);
        observableFieldO1.set(sb.toString());
        gg.a aVar = this.Z;
        if (aVar != null && (a0VarG = aVar.g()) != null && (observableFieldC0 = a0VarG.c0()) != null) {
            StringBuilder sb2 = new StringBuilder();
            float f2 = iJ * 100.0f;
            RecyclerView.Adapter adapter3 = q6().getAdapter();
            sb2.append(f2 / (adapter3 != null ? adapter3.getItemCount() : 1));
            sb2.append('%');
            observableFieldC0.set(sb2.toString());
        }
        ObservableField<String> observableFieldP1 = n6().p1();
        StringBuilder sb3 = new StringBuilder();
        int i2 = iJ * 100;
        RecyclerView.Adapter adapter4 = q6().getAdapter();
        sb3.append(i2 / (adapter4 != null ? adapter4.getItemCount() : 1));
        sb3.append('%');
        observableFieldP1.set(sb3.toString());
        com.zentraedi.comic.databinding.o oVar2 = this.T;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar2 = null;
        }
        AppCompatSeekBar appCompatSeekBar = oVar2.I.M;
        gg.a aVar2 = this.Z;
        appCompatSeekBar.setProgress(i2 / ((aVar2 == null || (aVarD2 = aVar2.d()) == null) ? 1 : aVarD2.getItemCount()));
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar3;
        }
        AppCompatSeekBar appCompatSeekBar2 = oVar.I.N;
        gg.a aVar3 = this.Z;
        if (aVar3 != null && (aVarD = aVar3.d()) != null) {
            itemCount = aVarD.getItemCount();
        }
        appCompatSeekBar2.setProgress(i2 / itemCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView i6() {
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        RecyclerView recyclerThumb = oVar.I.L;
        Intrinsics.checkNotNullExpressionValue(recyclerThumb, "recyclerThumb");
        return recyclerThumb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit i7(final ComicReaderActivity comicReaderActivity) {
        try {
            if (comicReaderActivity.q6().getAdapter() instanceof com.zentraedi.comic.adapter.a) {
                RecyclerView.Adapter adapter = comicReaderActivity.q6().getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.zentraedi.comic.adapter.BaseComicAdapter");
                View viewM = ((com.zentraedi.comic.adapter.a) adapter).M(comicReaderActivity.q6(), com.zentraedi.comic.w.j(comicReaderActivity.q6()), com.zentraedi.comic.q.i.zx);
                Object tag = viewM != null ? viewM.getTag() : null;
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type android.graphics.Bitmap");
                com.zentraedi.comic.c.b("intent_date.png", (Bitmap) tag, comicReaderActivity, new Function1() { // from class: com.zentraedi.comic.activity.a3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComicReaderActivity.j7(this.a, (String) obj);
                    }
                });
            }
        } catch (Exception e2) {
            nd.a.c("comicActivity", e2.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i8() {
        n6().U0().set(Boolean.valueOf(com.zentraedi.comic.w.g(q6(), o6().Z0(), false)));
        n6().V0().set(Boolean.valueOf(com.zentraedi.comic.w.f(q6(), o6().Z0(), false)));
    }

    private final String j6() {
        String path;
        String path2;
        if (this.c0 == 10) {
            ComicZipModel comicZipModel = this.A4;
            return (comicZipModel == null || (path2 = comicZipModel.getPath()) == null) ? "" : path2;
        }
        ComicInfoModel comicInfoModel = this.T3;
        return (comicInfoModel == null || (path = comicInfoModel.getPath()) == null) ? "" : path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit j7(ComicReaderActivity comicReaderActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComicCropImageActivity.U.a(comicReaderActivity, it, comicReaderActivity.getRequestedOrientation(), comicReaderActivity.o6().Z0().c(), comicReaderActivity.c0);
        return Unit.INSTANCE;
    }

    private final void j8(Layout layout) {
        com.zentraedi.comic.adapter.a aVarD;
        gg.a aVar = this.Z;
        if ((aVar != null ? aVar.d() : null) == null || this.k0 == layout) {
            return;
        }
        this.k0 = layout;
        gg.a aVar2 = this.Z;
        if (aVar2 != null && (aVarD = aVar2.d()) != null) {
            aVarD.D(this.k0);
        }
        gg.a aVar3 = this.Z;
        if (aVar3 != null) {
            aVar3.i(this.k0);
        }
        o6().R0().set(this.k0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if ((r0 != null ? r0.isOfflineData() : false) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k6() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.activity.ComicReaderActivity.k6():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit k7(final ComicReaderActivity comicReaderActivity) {
        try {
            if (comicReaderActivity.q6().getAdapter() instanceof com.zentraedi.comic.adapter.a) {
                RecyclerView.Adapter adapter = comicReaderActivity.q6().getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.zentraedi.comic.adapter.BaseComicAdapter");
                View viewM = ((com.zentraedi.comic.adapter.a) adapter).M(comicReaderActivity.q6(), com.zentraedi.comic.w.j(comicReaderActivity.q6()), com.zentraedi.comic.q.i.zx);
                Object tag = viewM != null ? viewM.getTag() : null;
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type android.graphics.Bitmap");
                com.zentraedi.comic.c.b("intent_date.png", (Bitmap) tag, comicReaderActivity, new Function1() { // from class: com.zentraedi.comic.activity.n3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComicReaderActivity.l7(this.a, (String) obj);
                    }
                });
            }
        } catch (Exception e2) {
            nd.a.c("comicActivity", e2.getMessage());
        }
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.viewmodel.q3 l6() {
        return (com.zentraedi.comic.viewmodel.q3) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit l7(ComicReaderActivity comicReaderActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComicStretcherImageActivity.P.a(comicReaderActivity, it, comicReaderActivity.getRequestedOrientation(), comicReaderActivity.o6().Z0().o(), comicReaderActivity.c0);
        return Unit.INSTANCE;
    }

    private final void l8(FileInfoModel fileInfoModel) {
        nd.a.a("ComicReadActivity", "setPullToRefreshUi");
        if (m6().Q0().size() == 0) {
            return;
        }
        nd.a.a("ComicReadActivity", "mCommonPDFs.size != 0");
        int iIndexOf = m6().Q0().indexOf(fileInfoModel);
        if (iIndexOf == -1) {
            Iterator it = m6().Q0().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                } else {
                    if (Intrinsics.areEqual(((FileInfoModel) it.next()).getPath(), fileInfoModel.getPath())) {
                        iIndexOf = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        nd.a.a("ComicReadActivity", "currentFileLocation= " + iIndexOf);
        com.zentraedi.comic.databinding.o oVar = null;
        if (iIndexOf == 0) {
            com.zentraedi.comic.databinding.o oVar2 = this.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar2 = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar2.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
            comicPullToRefreshRecyclerView.getHeaderLayout().setNoMoreData(true);
        } else {
            FileInfoModel fileInfoModel2 = (FileInfoModel) m6().Q0().get(iIndexOf - 1);
            com.zentraedi.comic.databinding.o oVar3 = this.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar3 = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView2 = oVar3.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView2, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
            comicPullToRefreshRecyclerView2.getHeaderLayout().setNoMoreData(false);
            com.zentraedi.comic.databinding.o oVar4 = this.T;
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar4 = null;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView3 = oVar4.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView3, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
            comicPullToRefreshRecyclerView3.getHeaderLayout().setPullLabel(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.YK) + ": " + com.zentraedi.business.utils.l5.r(fileInfoModel2.getPath()));
        }
        nd.a.a("ComicReadActivity", "mComicNetWorkViewModel.mCommonPDFs= " + m6().Q0().size());
        if (iIndexOf == m6().Q0().size() - 1) {
            nd.a.a("ComicReadActivity", "currentFileLocation= 最后一个pdf");
            com.zentraedi.comic.databinding.o oVar5 = this.T;
            if (oVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar5;
            }
            ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView4 = oVar.P;
            Intrinsics.checkNotNull(comicPullToRefreshRecyclerView4, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
            comicPullToRefreshRecyclerView4.getFooterLayout().setNoMoreData(true);
            return;
        }
        int i3 = iIndexOf + 1;
        nd.a.a("ComicReadActivity", "currentFileLocation= 不是最后一个pdf" + i3);
        FileInfoModel fileInfoModel3 = (FileInfoModel) m6().Q0().get(i3);
        com.zentraedi.comic.databinding.o oVar6 = this.T;
        if (oVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar6 = null;
        }
        ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView5 = oVar6.P;
        Intrinsics.checkNotNull(comicPullToRefreshRecyclerView5, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
        comicPullToRefreshRecyclerView5.getFooterLayout().setNoMoreData(false);
        com.zentraedi.comic.databinding.o oVar7 = this.T;
        if (oVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar7;
        }
        ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView6 = oVar.P;
        Intrinsics.checkNotNull(comicPullToRefreshRecyclerView6, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<*>");
        comicPullToRefreshRecyclerView6.getFooterLayout().setPullLabel(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.qK) + ": " + com.zentraedi.business.utils.l5.r(fileInfoModel3.getPath()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.m4 m6() {
        return (com.zentraedi.comic.viewmodel.m4) this.Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit m7(ComicReaderActivity comicReaderActivity, float f2) {
        WindowManager.LayoutParams attributes = comicReaderActivity.getWindow().getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
        attributes.screenBrightness = f2;
        comicReaderActivity.getWindow().setAttributes(attributes);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m8(ReadSetting readSetting, boolean z) {
        com.zentraedi.comic.adapter.a aVarD;
        Integer num;
        int i2;
        com.zentraedi.comic.adapter.a aVarD2;
        this.T2 = this.Q2;
        com.zentraedi.comic.view.e0 e0VarQ6 = q6();
        ReadModel readModelK = readSetting.k();
        ReadModel readModel = ReadModel.SCROLL_READ;
        boolean z2 = false;
        e0VarQ6.setReadScrollModel(readModelK == readModel);
        com.zentraedi.comic.databinding.o oVar = null;
        if (this.l0 != readSetting.k()) {
            if (readSetting.k() == ReadModel.NORMAL_NULL) {
                readSetting.B(readModel);
            }
            o6().T0().set(readSetting.k());
            if (readSetting.k() == readModel) {
                ObservableField<Layout> observableFieldR0 = o6().R0();
                Layout layout = Layout.COMMON;
                observableFieldR0.set(layout);
                this.k0 = layout;
                gg.a aVar = this.Z;
                if (aVar != null && (aVarD2 = aVar.d()) != null) {
                    aVarD2.D(layout);
                }
                q6().requestLayout();
                gg.a aVar2 = this.Z;
                if (aVar2 != null) {
                    aVar2.i(layout);
                }
            }
            int i3 = readSetting.k() == readModel ? 1 : 0;
            ReadModel readModelK2 = readSetting.k();
            ReadModel readModel2 = ReadModel.MANGA_READ;
            boolean z3 = readModelK2 == readModel2;
            com.zentraedi.comic.view.e0 e0VarQ7 = q6();
            Intrinsics.checkNotNull(e0VarQ7, "null cannot be cast to non-null type com.zentraedi.comic.view.ZoomRecyclerView");
            q6().setLayoutManager(new ComicLinearLayoutManager(this, i3, z3, e0VarQ7));
            i6().setLayoutManager(new LinearLayoutManager(this, 0, readSetting.k() == readModel2));
            if (readSetting.k() == readModel2) {
                com.zentraedi.comic.databinding.o oVar2 = this.T;
                if (oVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar2 = null;
                }
                oVar2.I.M.setLayoutDirection(1);
                com.zentraedi.comic.databinding.o oVar3 = this.T;
                if (oVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar3 = null;
                }
                oVar3.I.N.setLayoutDirection(1);
            } else {
                com.zentraedi.comic.databinding.o oVar4 = this.T;
                if (oVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar4 = null;
                }
                oVar4.I.M.setLayoutDirection(0);
                com.zentraedi.comic.databinding.o oVar5 = this.T;
                if (oVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar5 = null;
                }
                oVar5.I.N.setLayoutDirection(0);
            }
            if (readSetting.k() == readModel) {
                com.zentraedi.comic.databinding.o oVar6 = this.T;
                if (oVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar6 = null;
                }
                oVar6.P.setOrientationAndRef(PullToRefreshBase.Orientation.VERTICAL);
            } else {
                com.zentraedi.comic.databinding.o oVar7 = this.T;
                if (oVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar7 = null;
                }
                oVar7.P.setOrientationAndRef(PullToRefreshBase.Orientation.HORIZONTAL);
            }
            Q7();
            n6().m1().set(Boolean.valueOf(readSetting.k() != readModel));
            this.l0 = readSetting.k();
            com.zentraedi.comic.databinding.o oVar8 = this.T;
            if (oVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar8 = null;
            }
            RecyclerView mZoomRecyclerView = oVar8.P.getMZoomRecyclerView();
            if (mZoomRecyclerView != null) {
                mZoomRecyclerView.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.k3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComicReaderActivity.n8(this.a);
                    }
                }, 200L);
            }
        }
        if (this.m0 != readSetting.m()) {
            int i4 = b.$EnumSwitchMapping$3[readSetting.m().ordinal()];
            if (i4 == 1) {
                num = 2;
            } else if (i4 == 2) {
                num = 1;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                num = null;
            }
            if (readSetting.m() == ScreenOrganize.LANDSCAPE) {
                n6().z1().set(Boolean.FALSE);
                com.zentraedi.comic.databinding.o oVar9 = this.T;
                if (oVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar9 = null;
                }
                if (oVar9.G.isDrawerOpen(8388613)) {
                    com.zentraedi.comic.databinding.o oVar10 = this.T;
                    if (oVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oVar10 = null;
                    }
                    oVar10.G.closeDrawer(8388613);
                }
                f6();
                i2 = 0;
            } else {
                i2 = readSetting.m() == ScreenOrganize.VERTICAL ? 1 : 4;
            }
            setRequestedOrientation(i2);
            if (num != null) {
                if (num.intValue() != getResources().getConfiguration().orientation) {
                    z2 = true;
                }
            }
            this.n0 = z2;
            this.m0 = readSetting.m();
        }
        com.zentraedi.comic.databinding.o oVar11 = this.T;
        if (oVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar11;
        }
        oVar.P.setReadModel(readSetting.k());
        gg.a aVar3 = this.Z;
        if (aVar3 != null && (aVarD = aVar3.d()) != null) {
            aVarD.V(readSetting);
        }
        if (readSetting.q() == ZoomType.HEIGHT || readSetting.i() <= 1) {
            nd.a.c(D5, "ComicOOM setReadSet layout=" + this.k0 + " readModel=" + readSetting.k() + " zoomType=" + readSetting.q() + " imageQuality=" + readSetting.i() + " clip=" + readSetting.b() + " screen=" + com.zentraedi.basic.function.utils.k0.l() + 'x' + com.zentraedi.basic.function.utils.k0.i() + " statusBar=" + com.zentraedi.business.utils.g8.h() + " orientation=" + getResources().getConfiguration().orientation);
        }
        if (!z || this.n0) {
            return;
        }
        G7();
        nd.a.a(D5, "setReadSet" + this.T2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComicReaderViewModel n6() {
        return (ComicReaderViewModel) this.U.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n8(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.d8(comicReaderActivity.T2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.n6 o6() {
        return (com.zentraedi.comic.viewmodel.n6) this.V.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o7(ComicReaderActivity comicReaderActivity) {
        String id2;
        String path;
        String path2;
        ComicInfoModel comicInfoModel;
        ComicZipModel comicZipModel = comicReaderActivity.A4;
        if (comicZipModel == null || (comicInfoModel = comicZipModel.getComicInfoModel()) == null || (id2 = comicInfoModel.getId()) == null) {
            ComicInfoModel comicInfoModel2 = comicReaderActivity.T3;
            id2 = comicInfoModel2 != null ? comicInfoModel2.getId() : null;
        }
        if (comicReaderActivity.c0 == 3) {
            com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
            FileInfoModel fileInfoModel = comicReaderActivity.Z2;
            if (fileInfoModel == null || (path2 = fileInfoModel.getPath()) == null) {
                path2 = "";
            }
            path = aVar.m(path2);
        } else {
            FileInfoModel fileInfoModel2 = comicReaderActivity.Z2;
            if (fileInfoModel2 == null || (path = fileInfoModel2.getPath()) == null) {
                path = "";
            }
        }
        if (Intrinsics.areEqual(comicReaderActivity.n6().O0().get(), Boolean.TRUE)) {
            ComicReaderViewModel comicReaderViewModelN6 = comicReaderActivity.n6();
            if (id2 == null) {
                id2 = "";
            }
            comicReaderViewModelN6.n2(id2, 0);
        } else {
            comicReaderActivity.n6().S0(id2, path);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o8(OverallReadSetting overallReadSetting) {
        PageTurning pageTurningJ;
        PageOver pageOverG;
        PageOver pageOverG2;
        com.zentraedi.comic.adapter.a aVarD;
        PageOver pageOverG3;
        com.zentraedi.comic.x.a.a(this, overallReadSetting != null ? overallReadSetting.d() : 0L);
        this.r1 = overallReadSetting != null ? overallReadSetting.c() : true;
        this.a2 = overallReadSetting != null ? overallReadSetting.l() : true;
        this.M1 = overallReadSetting != null ? overallReadSetting.b() : 1;
        int iH = 0;
        this.M2 = overallReadSetting != null ? overallReadSetting.m() : 0;
        o6().Z0().G(this.a2);
        o6().Z0().z(this.M1);
        q6().setAllowImageScrollOnTurn(this.a2);
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.F.setBackgroundColor((overallReadSetting == null || overallReadSetting.a() != 0) ? -1 : -16777216);
        Integer numA1 = n6().A1();
        if (numA1 != null) {
            int iIntValue = numA1.intValue();
            if (overallReadSetting == null || iIntValue != overallReadSetting.a()) {
                n6().m2(null);
            }
        }
        p6().X().set(Boolean.valueOf(this.r1));
        p6().n0().set(Integer.valueOf(this.M2));
        p6().W().set(Integer.valueOf(this.M1));
        p6().m0().set(Boolean.valueOf(this.a2));
        ObservableField<PageTurning> observableFieldG0 = p6().g0();
        if (overallReadSetting == null || (pageTurningJ = overallReadSetting.j()) == null) {
            pageTurningJ = PageTurning.SINGLE;
        }
        observableFieldG0.set(pageTurningJ);
        int iD = (int) (((overallReadSetting != null ? overallReadSetting.d() : 0L) / ((long) 60)) / ((long) 1000));
        if (iD == Integer.MAX_VALUE || iD < 0) {
            p6().d0().set(1);
        } else {
            p6().d0().set(Integer.valueOf(iD));
        }
        p6().T().set(Integer.valueOf(overallReadSetting != null ? overallReadSetting.a() : 0));
        com.zentraedi.comic.databinding.o oVar2 = this.T;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar2 = null;
        }
        ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar2.P;
        if (overallReadSetting == null || (pageOverG = overallReadSetting.g()) == null) {
            pageOverG = PageOver.NO;
        }
        comicPullToRefreshRecyclerView.setPageOver(pageOverG);
        gg.a aVar = this.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            if (overallReadSetting == null || (pageOverG3 = overallReadSetting.g()) == null) {
                pageOverG3 = PageOver.NO;
            }
            aVarD.T(pageOverG3);
        }
        this.g0 = overallReadSetting != null && overallReadSetting.e();
        p6().k0().set(Boolean.valueOf(this.g0));
        if (this.g0) {
            A8();
            if ((overallReadSetting != null ? overallReadSetting.g() : null) == PageOver.SCROLL) {
                iH = 100 - overallReadSetting.h();
            } else if (overallReadSetting != null) {
                iH = overallReadSetting.h();
            }
            int i2 = (int) ((iH / 100.0f) * 6 * 1000);
            this.P2 = i2;
            if (i2 == 0) {
                this.P2 = 1000;
            }
            p6().R().set(Integer.valueOf(iH));
            p6().S().set(Integer.valueOf(iH));
            z8();
        } else {
            this.i0.removeCallbacks(this.v5);
            p6().R().set(Integer.valueOf(overallReadSetting != null ? overallReadSetting.h() : 0));
            p6().S().set(Integer.valueOf(overallReadSetting != null ? overallReadSetting.h() : 0));
        }
        p6().f0().set(overallReadSetting != null ? overallReadSetting.g() : null);
        com.zentraedi.comic.view.e0 e0VarQ6 = q6();
        if (overallReadSetting == null || (pageOverG2 = overallReadSetting.g()) == null) {
            pageOverG2 = PageOver.SCROLL;
        }
        e0VarQ6.setPageOver(pageOverG2);
        StringBuilder sb = new StringBuilder();
        sb.append("ComicOOM setReaderSetting imageQuality=");
        sb.append(this.M1);
        sb.append(" readModel=");
        sb.append(this.M2);
        sb.append(" pageTurning=");
        sb.append(this.a2);
        sb.append(" screen=");
        sb.append(com.zentraedi.basic.function.utils.k0.l());
        sb.append('x');
        sb.append(com.zentraedi.basic.function.utils.k0.i());
        sb.append(" orientation=");
        sb.append(getResources().getConfiguration().orientation);
        sb.append(" pageOver=");
        sb.append(overallReadSetting != null ? overallReadSetting.g() : null);
        nd.a.c(D5, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.t4 p6() {
        return (com.zentraedi.comic.viewmodel.t4) this.W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p7(final ComicReaderActivity comicReaderActivity) {
        Object next;
        if (Intrinsics.areEqual(comicReaderActivity.n6().Q0().get(), Boolean.TRUE)) {
            Iterator<T> it = comicReaderActivity.h0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Bookmark) next).getPosition() != comicReaderActivity.Q2);
            Bookmark bookmark = (Bookmark) next;
            if (bookmark == null) {
                return null;
            }
            comicReaderActivity.s8(bookmark);
            return Unit.INSTANCE;
        }
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(comicReaderActivity), com.zentraedi.comic.q.l.P4, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        final com.zentraedi.comic.databinding.e1 e1Var = (com.zentraedi.comic.databinding.e1) c0VarJ;
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) comicReaderActivity, e1Var.getRoot());
        e1Var.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicReaderActivity.q7(bVar, view);
            }
        });
        int i2 = comicReaderActivity.Q2 + 1;
        TextView textView = e1Var.I;
        int i3 = com.zentraedi.comic.q.C0124q.jH;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append('/');
        RecyclerView.Adapter adapter = comicReaderActivity.q6().getAdapter();
        sb.append(adapter != null ? adapter.getItemCount() : 0);
        textView.setText(com.zentraedi.basic.function.utils.a.p(i3, sb.toString()));
        e1Var.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicReaderActivity.r7(this.a, e1Var, bVar, view);
            }
        });
        ViewGroup.LayoutParams layoutParams = e1Var.getRoot().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).height = com.zentraedi.basic.function.utils.m0.b(425.0f);
        bVar.d(17);
        bVar.show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p8(PullToRefreshBase.Mode mode) {
        com.zentraedi.comic.databinding.o oVar = this.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        ((PullToRefreshBase) oVar.P).i = mode;
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.P.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.view.e0 q6() {
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        com.zentraedi.comic.view.e0 mZoomRecyclerView = oVar.P.getMZoomRecyclerView();
        Intrinsics.checkNotNull(mZoomRecyclerView, "null cannot be cast to non-null type com.zentraedi.comic.view.ZoomRecyclerView");
        return mZoomRecyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q7(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void r7(ComicReaderActivity comicReaderActivity, com.zentraedi.comic.databinding.e1 e1Var, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        String string;
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        com.zentraedi.comic.adapter.a aVarD;
        Bookmark bookmark = new Bookmark();
        bookmark.setId(comicReaderActivity.h0.size());
        bookmark.setPosition(comicReaderActivity.Q2);
        if (Intrinsics.areEqual(e1Var.E.getText().toString(), "")) {
            string = comicReaderActivity.getString(com.zentraedi.comic.q.C0124q.l62);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = e1Var.E.getText().toString();
        }
        bookmark.setDesc(string);
        gg.a aVar = comicReaderActivity.Z;
        bookmark.setAllPosition((aVar == null || (aVarD = aVar.d()) == null) ? 0 : aVarD.getItemCount());
        comicReaderActivity.h0.add(bookmark);
        comicReaderActivity.n6().Q0().set(Boolean.TRUE);
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null && (a0VarG = aVar2.g()) != null) {
            a0VarG.n0(comicReaderActivity.h0);
        }
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s8(final Bookmark bookmark) {
        com.zentraedi.comic.adapter.a aVarD;
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) this, com.zentraedi.comic.q.l.j3, com.zentraedi.business.utils.m6.a.e());
        gg.a aVar = this.Z;
        Integer numValueOf = Integer.valueOf((aVar == null || (aVarD = aVar.d()) == null) ? 0 : aVarD.getItemCount());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : bookmark.getAllPosition();
        int position = bookmark.getPosition() + 1;
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gD3);
        String str = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.OG) + strN + position + '/' + iIntValue;
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dH));
        sb.append(strN);
        String desc = bookmark.getDesc();
        if (StringsKt.isBlank(desc)) {
            desc = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.l62);
        }
        sb.append(desc);
        String string = sb.toString();
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.WS);
        Object parent = textView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setBackgroundResource(com.zentraedi.comic.q.h.P2);
        }
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.XG));
        textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.f416qd));
        TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.KP);
        Object parent2 = textView2.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = -1;
            view2.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.width = -1;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(8388611);
        textView2.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.f416qd));
        textView2.setLineSpacing(textView2.getResources().getDimension(com.zentraedi.comic.q.g.d7), 1.0f);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{str, string});
        String strLineSeparator = System.lineSeparator();
        Intrinsics.checkNotNullExpressionValue(strLineSeparator, "lineSeparator(...)");
        textView2.setText(CollectionsKt.joinToString$default(listListOf, strLineSeparator, null, null, 0, null, null, 62, null));
        TextView textView3 = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
        textView3.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        textView3.setBackgroundResource(com.zentraedi.comic.q.h.w00);
        textView3.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.f416qd));
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ComicReaderActivity.t8(bVar, view3);
            }
        });
        TextView textView4 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
        textView4.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        textView4.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.f416qd));
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.w2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ComicReaderActivity.u8(this.a, bookmark, bVar, view3);
            }
        });
        bVar.show();
    }

    private final void t6() {
        ComicInfoModel comicInfoModel = this.T3;
        if (comicInfoModel != null) {
            if (!TextUtils.isEmpty(comicInfoModel != null ? comicInfoModel.getProgress() : null)) {
                Gson gsonB = com.zentraedi.basic.component.utils.a.b();
                ComicInfoModel comicInfoModel2 = this.T3;
                Intrinsics.checkNotNull(comicInfoModel2);
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) gsonB.fromJson(comicInfoModel2.getProgress(), NasReadingRecordModule.class);
                nd.a.a(D5, "goToLastReadLocation restore to:" + nasReadingRecordModule.getPosition());
                T7(nasReadingRecordModule.getPosition(), 200L);
                return;
            }
        }
        U7(this, 0, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t7(final ComicReaderActivity comicReaderActivity, int i2) {
        String strF1;
        if (i2 == -1 && (strF1 = comicReaderActivity.n6().f1()) != null && strF1.length() != 0) {
            String strF2 = comicReaderActivity.n6().f1();
            Intrinsics.checkNotNull(strF2);
            nd.a.a(((BaseActivity) comicReaderActivity).J, "Click fallback scan for path: " + strF2);
            Iterator it = comicReaderActivity.m6().Q0().iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                FileInfoModel fileInfoModel = (FileInfoModel) it.next();
                if (Intrinsics.areEqual(fileInfoModel.getPath(), strF2) || Intrinsics.areEqual(fileInfoModel.getFileId(), strF2)) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                Iterator it2 = comicReaderActivity.m6().P0().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    FileInfoModel fileInfoModel2 = (FileInfoModel) it2.next();
                    if (Intrinsics.areEqual(fileInfoModel2.getPath(), strF2) || Intrinsics.areEqual(fileInfoModel2.getFileId(), strF2)) {
                        break;
                    }
                    i3++;
                }
                i2 = i3;
            } else {
                i2 = i4;
            }
            nd.a.a(((BaseActivity) comicReaderActivity).J, "Fallback match result: " + i2);
        }
        if (i2 != -1) {
            gg.a aVar = comicReaderActivity.Z;
            if (aVar != null) {
                aVar.I(comicReaderActivity.q6(), i2, new Function2() { // from class: com.zentraedi.comic.activity.x3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ComicReaderActivity.u7(this.a, ((Boolean) obj).booleanValue(), (String) obj2);
                    }
                });
            }
        } else {
            nd.a.c(((BaseActivity) comicReaderActivity).J, "Still cannot find index for path after fallback");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t8(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    private final void u6(ComicApplyScope comicApplyScope) {
        if (comicApplyScope == this.Q4) {
            return;
        }
        c8(R7(comicApplyScope), V5());
        this.Q4 = comicApplyScope;
        Z7(comicApplyScope);
        p6().Q0(comicApplyScope, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u7(ComicReaderActivity comicReaderActivity, boolean z, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        comicReaderActivity.n6().T().set(name);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u8(ComicReaderActivity comicReaderActivity, Bookmark bookmark, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        comicReaderActivity.h0.remove(bookmark);
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (a0VarG = aVar.g()) != null) {
            a0VarG.n0(comicReaderActivity.h0);
        }
        if (bookmark.getPosition() == comicReaderActivity.Q2) {
            comicReaderActivity.n6().Q0().set(Boolean.FALSE);
        }
        bVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v6(TaskFileData taskFileData) {
        String path;
        String path2;
        com.zentraedi.comic.adapter.a aVarD;
        com.zentraedi.comic.adapter.a aVarD2;
        if (taskFileData == null || taskFileData.getFileSize() == 0 || TextUtils.isEmpty(taskFileData.getFileId())) {
            nd.a.h(((BaseActivity) this).J, "handleDownloadTask skip taskFileData=" + taskFileData);
            return;
        }
        this.j0 = taskFileData;
        if (!TextUtils.isEmpty(taskFileData.getTargetPath())) {
            long completeSize = (taskFileData.getCompleteSize() * ((long) 100)) / taskFileData.getFileSize();
            nd.a.a(((BaseActivity) this).J, "handleDownloadTask fileId=" + taskFileData.getFileId() + ", targetPath=" + taskFileData.getTargetPath() + ", tempPath=" + taskFileData.getTempPath() + ", fileSize=" + taskFileData.getFileSize() + ", completeSize=" + taskFileData.getCompleteSize() + ", progress=" + completeSize + '%');
            String fileId = taskFileData.getFileId();
            FileInfoModel fileInfoModel = this.P3;
            String str = "";
            if (fileInfoModel == null || (path = fileInfoModel.getPath()) == null) {
                path = "";
            }
            if (Intrinsics.areEqual(fileId, path)) {
                n6().c1().set('(' + completeSize + "%)");
                com.zentraedi.comic.databinding.o oVar = this.T;
                if (oVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    oVar = null;
                }
                ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = oVar.P;
                Intrinsics.checkNotNull(comicPullToRefreshRecyclerView, "null cannot be cast to non-null type com.handmark.pulltorefresh.library.PullToRefreshBase<com.zentraedi.comic.view.ZoomRecyclerView>");
                comicPullToRefreshRecyclerView.setProgress('(' + completeSize + "%)");
            }
            if (completeSize != 100) {
                nd.a.c(((BaseActivity) this).J, "Download Cache Progress" + completeSize);
                return;
            }
            String str2 = ((BaseActivity) this).J;
            StringBuilder sb = new StringBuilder();
            sb.append("handleDownloadTask complete fileId=");
            sb.append(taskFileData.getFileId());
            sb.append(", targetPath=");
            sb.append(taskFileData.getTargetPath());
            sb.append(", tempPath=");
            sb.append(taskFileData.getTempPath());
            sb.append(", targetType=");
            com.zentraedi.business.utils.i5 i5Var = com.zentraedi.business.utils.i5.a;
            sb.append(i5Var.f(taskFileData.getTargetPath()));
            nd.a.e(str2, sb.toString());
            String targetPath = taskFileData.getTargetPath();
            Intrinsics.checkNotNullExpressionValue(targetPath, "getTargetPath(...)");
            if (StringsKt.startsWith$default(targetPath, com.zentraedi.comic.m.z(), false, 2, (Object) null) && 3 == i5Var.f(taskFileData.getTargetPath())) {
                gg.a aVar = this.Z;
                if (aVar != null && (aVarD = aVar.d()) != null) {
                    int itemCount = aVarD.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        androidx.databinding.a aVarE = aVarD.E(i2);
                        if (aVarE instanceof com.zentraedi.comic.viewmodel.l6) {
                            com.zentraedi.comic.viewmodel.l6 l6Var = (com.zentraedi.comic.viewmodel.l6) aVarE;
                            if (Intrinsics.areEqual(l6Var.h(), taskFileData.getFileId())) {
                                String targetPath2 = taskFileData.getTargetPath();
                                Intrinsics.checkNotNullExpressionValue(targetPath2, "getTargetPath(...)");
                                l6Var.p(targetPath2);
                                l6Var.u().o(new Pair("100%", taskFileData.getTargetPath()));
                                gg.a aVar2 = this.Z;
                                if (aVar2 != null && (aVarD2 = aVar2.d()) != null) {
                                    aVarD2.notifyItemChanged(i2);
                                }
                            }
                        }
                    }
                }
            } else {
                String fileId2 = taskFileData.getFileId();
                FileInfoModel fileInfoModel2 = this.P3;
                if (fileInfoModel2 != null && (path2 = fileInfoModel2.getPath()) != null) {
                    str = path2;
                }
                if (Intrinsics.areEqual(fileId2, str)) {
                    int i3 = this.A3;
                    if (i3 == -1) {
                        int iIndexOf = m6().Q0().indexOf(this.P3);
                        gg.a aVar3 = this.Z;
                        if (aVar3 != null) {
                            aVar3.u(this.P3, iIndexOf, new Function1() { // from class: com.zentraedi.comic.activity.o3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ComicReaderActivity.w6(this.a, (DownLoadFileState) obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (i3 == 0) {
                        gg.a aVar4 = this.Z;
                        if (aVar4 != null) {
                            aVar4.r(null, 0, 0, this, new Function1() { // from class: com.zentraedi.comic.activity.q3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ComicReaderActivity.x6(this.a, (DownLoadFileState) obj);
                                }
                            }, new Function1() { // from class: com.zentraedi.comic.activity.r3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ComicReaderActivity.A6(this.a, (String) obj);
                                }
                            }, this.P3);
                        }
                    } else if (i3 == 1) {
                        int iIndexOf2 = m6().Q0().indexOf(this.P3);
                        gg.a aVar5 = this.Z;
                        if (aVar5 != null) {
                            aVar5.C(this.P3, iIndexOf2, new Function1() { // from class: com.zentraedi.comic.activity.s3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ComicReaderActivity.B6(this.a, (DownLoadFileState) obj);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v7(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.X5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v8(int i2) {
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.h(i6(), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w6(ComicReaderActivity comicReaderActivity, DownLoadFileState downLoadFile) {
        Intrinsics.checkNotNullParameter(downLoadFile, "downLoadFile");
        com.zentraedi.comic.databinding.o oVar = null;
        if (downLoadFile == DownLoadFileState.SUCCESS) {
            com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar2 = null;
            }
            oVar2.P.g();
            comicReaderActivity.d8(0);
            com.zentraedi.comic.databinding.o oVar3 = comicReaderActivity.T;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar3 = null;
            }
            TextView textView = oVar3.N.G;
            FileInfoModel fileInfoModel = comicReaderActivity.P3;
            textView.setText(fileInfoModel != null ? fileInfoModel.getName() : null);
            FileInfoModel fileInfoModel2 = comicReaderActivity.P3;
            if (fileInfoModel2 != null) {
                comicReaderActivity.l8(fileInfoModel2);
            }
        } else {
            com.zentraedi.comic.databinding.o oVar4 = comicReaderActivity.T;
            if (oVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar4;
            }
            oVar.P.g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w7(ComicReaderActivity comicReaderActivity) {
        comicReaderActivity.W5();
        return Unit.INSTANCE;
    }

    private final void w8(final int i2) {
        nd.a.a(D5, "scrollToPosition" + i2);
        try {
            this.Q2 = i2;
            q6().smoothScrollToPosition(i2);
            com.zentraedi.comic.databinding.o oVar = this.T;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            RecyclerView mZoomRecyclerView = oVar.P.getMZoomRecyclerView();
            if (mZoomRecyclerView != null) {
                mZoomRecyclerView.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComicReaderActivity.x8(i2, this);
                    }
                }, 200L);
            }
        } catch (Exception e2) {
            nd.a.a(D5, "scrollToPosition" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit x6(final ComicReaderActivity comicReaderActivity, DownLoadFileState downLoadFile) {
        com.zentraedi.comic.viewmodel.a0 a0VarG;
        ObservableField<String> observableFieldB0;
        com.zentraedi.comic.viewmodel.a0 a0VarG2;
        String cover;
        Intrinsics.checkNotNullParameter(downLoadFile, "downLoadFile");
        com.zentraedi.comic.databinding.o oVar = comicReaderActivity.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.P.g();
        if (downLoadFile != DownLoadFileState.SUCCESS) {
            comicReaderActivity.finish();
            return Unit.INSTANCE;
        }
        gg.a aVar = comicReaderActivity.Z;
        if (aVar != null && (a0VarG2 = aVar.g()) != null) {
            ComicInfoModel comicInfoModel = comicReaderActivity.T3;
            if (comicInfoModel == null || (cover = comicInfoModel.getCover()) == null) {
                cover = "";
            }
            com.zentraedi.comic.databinding.o oVar2 = comicReaderActivity.T;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar2 = null;
            }
            ImageView ivIcon = oVar2.Q.F;
            Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
            a0VarG2.h0(cover, ivIcon);
        }
        gg.a aVar2 = comicReaderActivity.Z;
        if (aVar2 != null && (a0VarG = aVar2.g()) != null && (observableFieldB0 = a0VarG.b0()) != null) {
            ComicInfoModel comicInfoModel2 = comicReaderActivity.T3;
            observableFieldB0.set(comicInfoModel2 != null ? comicInfoModel2.getName() : null);
        }
        gg.a aVar3 = comicReaderActivity.Z;
        if (aVar3 != null) {
            aVar3.s(comicReaderActivity.q6(), new Function2() { // from class: com.zentraedi.comic.activity.f3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComicReaderActivity.y6(this.a, ((Integer) obj).intValue(), (String) obj2);
                }
            }, new Function1() { // from class: com.zentraedi.comic.activity.g3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderActivity.z6(this.a, (Bookmark) obj);
                }
            }, comicReaderActivity.h0);
        }
        comicReaderActivity.t6();
        comicReaderActivity.h8();
        comicReaderActivity.n6().getShowLoading().set(Boolean.FALSE);
        FileInfoModel fileInfoModel = comicReaderActivity.P3;
        if (fileInfoModel != null) {
            comicReaderActivity.l8(fileInfoModel);
        }
        return Unit.INSTANCE;
    }

    private final void x7() {
        StringBuilder sb = new StringBuilder();
        sb.append("initZipState currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicZip=");
        ComicZipModel comicZipModel = this.A4;
        sb.append(comicZipModel != null ? comicZipModel.getPath() : null);
        nd.a.e(D5, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x8(int i2, ComicReaderActivity comicReaderActivity) {
        nd.a.a(D5, "post---scrollToPosition" + i2);
        comicReaderActivity.h8();
        comicReaderActivity.i8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y6(ComicReaderActivity comicReaderActivity, int i2, String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        ObservableField<Boolean> observableFieldQ0 = comicReaderActivity.n6().Q0();
        Iterator<T> it = comicReaderActivity.h0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Bookmark) next).getPosition() != i2);
        observableFieldQ0.set(Boolean.valueOf(next != null));
        comicReaderActivity.d8(i2);
        comicReaderActivity.i6().setVisibility(8);
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void y7(@fo.k Activity activity, @fo.l BaseModel baseModel) {
        x5.a(activity, baseModel);
    }

    private final String y8(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            String lowerCase = StringsKt.replace$default(StringsKt.replace$default(strDecode, "\\", "/", false, 4, (Object) null), "//", "/", false, 4, (Object) null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return StringsKt.trim(lowerCase, new char[]{'/'});
        } catch (Exception unused) {
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return StringsKt.trim(lowerCase2, new char[]{'/'});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z6(ComicReaderActivity comicReaderActivity, Bookmark bookmark) {
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        comicReaderActivity.s8(bookmark);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[RETURN] */
    private final ComicApplyScope z7() {
        String str = (String) com.zentraedi.business.utils.t7.d(h6(), "THIS_COMIC");
        for (ComicApplyScope comicApplyScope : ComicApplyScope.values()) {
            if (Intrinsics.areEqual(comicApplyScope.name(), str)) {
                if (comicApplyScope == null) {
                    return ComicApplyScope.THIS_COMIC;
                }
                return comicApplyScope;
            }
        }
        comicApplyScope = null;
        if (comicApplyScope == null) {
            return ComicApplyScope.THIS_COMIC;
        }
        return comicApplyScope;
    }

    public final void A8() {
        this.i0.removeCallbacks(this.v5);
    }

    public final void D6(@fo.k ReadModel readModel, @fo.k PageTurning pageTurning, boolean z) {
        Intrinsics.checkNotNullParameter(readModel, "readModel");
        Intrinsics.checkNotNullParameter(pageTurning, "pageTurning");
        com.zentraedi.comic.view.e0 e0VarQ6 = q6();
        ReadSetting readSettingZ0 = o6().Z0();
        PageOver pageOver = (PageOver) p6().f0().get();
        if (pageOver == null) {
            pageOver = PageOver.NO;
        }
        int i2 = b.$EnumSwitchMapping$2[pageTurning.ordinal()];
        if (i2 == 1) {
            z = !z;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (readModel == ReadModel.SCROLL_READ) {
            if (z) {
                if (com.zentraedi.comic.w.f(e0VarQ6, readSettingZ0, true)) {
                    com.zentraedi.comic.w.C(e0VarQ6, pageOver, readSettingZ0.p());
                    return;
                } else {
                    p8(PullToRefreshBase.Mode.PULL_FROM_END);
                    return;
                }
            }
            if (com.zentraedi.comic.w.g(e0VarQ6, readSettingZ0, true)) {
                com.zentraedi.comic.w.z(e0VarQ6, pageOver, readSettingZ0.p());
                return;
            } else {
                p8(PullToRefreshBase.Mode.PULL_FROM_START);
                return;
            }
        }
        if (z) {
            if (com.zentraedi.comic.w.f(e0VarQ6, readSettingZ0, true)) {
                com.zentraedi.comic.w.B(e0VarQ6, readSettingZ0, pageOver);
                return;
            } else {
                p8(PullToRefreshBase.Mode.PULL_FROM_END);
                return;
            }
        }
        if (com.zentraedi.comic.w.g(e0VarQ6, readSettingZ0, true)) {
            com.zentraedi.comic.w.y(e0VarQ6, readSettingZ0, pageOver);
        } else {
            p8(PullToRefreshBase.Mode.PULL_FROM_START);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.zentraedi.basic.component.networkmonitor.c
    public final void F7(@fo.k NetWorkState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state != NetWorkState.WIFI) {
            com.zentraedi.basic.function.ui.toast.a.t(getString(com.zentraedi.comic.q.C0124q.DI));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y5(@fo.l Intent intent) {
        String stringExtra;
        int iF;
        String path;
        String progress;
        FileInfoModel fileInfoModel;
        String path2;
        FileInfoModel fileInfoModel2;
        FileInfoModel fileInfoModel3;
        FileInfoModel fileInfoModel4;
        String path3;
        String path4;
        String path5;
        this.M4 = (BaseModel) (intent != null ? intent.getSerializableExtra(I5) : null);
        String str = "";
        if (intent == null || (stringExtra = intent.getStringExtra(L5)) == null) {
            stringExtra = "";
        }
        this.P4 = stringExtra;
        StringBuilder sb = new StringBuilder();
        sb.append("configData start baseModel=");
        BaseModel baseModel = this.M4;
        sb.append(baseModel != null ? baseModel.getClass().getSimpleName() : null);
        sb.append(", readingRecordLen=");
        sb.append(this.P4.length());
        nd.a.e(D5, sb.toString());
        FileInfoModel fileInfoModel5 = this.M4;
        if (fileInfoModel5 instanceof FileInfoModel) {
            Intrinsics.checkNotNull(fileInfoModel5, "null cannot be cast to non-null type com.zentraedi.business.model.FileInfoModel");
            FileInfoModel fileInfoModel6 = fileInfoModel5;
            this.Z2 = fileInfoModel6;
            iF = com.zentraedi.business.utils.i5.a.f((fileInfoModel6 == null || (path5 = fileInfoModel6.getPath()) == null) ? null : StringsKt.trim(path5).toString());
            this.c0 = iF;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("configData fileInfo path=");
            FileInfoModel fileInfoModel7 = this.Z2;
            sb2.append(fileInfoModel7 != null ? fileInfoModel7.getPath() : null);
            sb2.append(", name=");
            FileInfoModel fileInfoModel8 = this.Z2;
            sb2.append(fileInfoModel8 != null ? fileInfoModel8.getName() : null);
            sb2.append(", fileId=");
            FileInfoModel fileInfoModel9 = this.Z2;
            sb2.append(fileInfoModel9 != null ? fileInfoModel9.getFileId() : null);
            sb2.append(", type=");
            sb2.append(iF);
            nd.a.e(D5, sb2.toString());
        } else if (fileInfoModel5 instanceof ComicZipModel) {
            Intrinsics.checkNotNull(fileInfoModel5, "null cannot be cast to non-null type com.zentraedi.comic.data.ComicZipModel");
            ComicZipModel comicZipModel = (ComicZipModel) fileInfoModel5;
            this.A4 = comicZipModel;
            this.T3 = comicZipModel != null ? comicZipModel.getComicInfoModel() : null;
            com.zentraedi.business.utils.i5 i5Var = com.zentraedi.business.utils.i5.a;
            ComicZipModel comicZipModel2 = this.A4;
            iF = i5Var.f((comicZipModel2 == null || (fileInfoModel4 = comicZipModel2.getFileInfoModel()) == null || (path3 = fileInfoModel4.getPath()) == null) ? null : StringsKt.trim(path3).toString());
            ComicZipModel comicZipModel3 = this.A4;
            this.Z2 = comicZipModel3 != null ? comicZipModel3.getFileInfoModel() : null;
            this.c0 = 10;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("configData comicZip fileInfoPath=");
            ComicZipModel comicZipModel4 = this.A4;
            sb3.append((comicZipModel4 == null || (fileInfoModel3 = comicZipModel4.getFileInfoModel()) == null) ? null : fileInfoModel3.getPath());
            sb3.append(", fileInfoName=");
            ComicZipModel comicZipModel5 = this.A4;
            sb3.append((comicZipModel5 == null || (fileInfoModel2 = comicZipModel5.getFileInfoModel()) == null) ? null : fileInfoModel2.getName());
            sb3.append(", comicPath=");
            ComicInfoModel comicInfoModel = this.T3;
            sb3.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
            sb3.append(", type=");
            sb3.append(iF);
            nd.a.e(D5, sb3.toString());
        } else if (fileInfoModel5 instanceof ComicInfoModel) {
            Intrinsics.checkNotNull(fileInfoModel5, "null cannot be cast to non-null type com.zentraedi.business.model.ComicInfoModel");
            ComicInfoModel comicInfoModel2 = (ComicInfoModel) fileInfoModel5;
            this.T3 = comicInfoModel2;
            if (TextUtils.isEmpty(comicInfoModel2 != null ? comicInfoModel2.getProgress() : null)) {
                FileInfoModel fileInfoModel10 = new FileInfoModel();
                ComicInfoModel comicInfoModel3 = this.T3;
                Intrinsics.checkNotNull(comicInfoModel3);
                fileInfoModel10.setPath(comicInfoModel3.getPath());
                ComicInfoModel comicInfoModel4 = this.T3;
                Intrinsics.checkNotNull(comicInfoModel4);
                fileInfoModel10.setName(com.zentraedi.business.utils.l5.r(comicInfoModel4.getPath()));
                ComicInfoModel comicInfoModel5 = this.T3;
                Intrinsics.checkNotNull(comicInfoModel5);
                fileInfoModel10.setFileId(comicInfoModel5.getPath());
                this.Z2 = fileInfoModel10;
            } else {
                Gson gsonB = com.zentraedi.basic.component.utils.a.b();
                ComicInfoModel comicInfoModel6 = this.T3;
                if (comicInfoModel6 == null || (progress = comicInfoModel6.getProgress()) == null) {
                    progress = "";
                }
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) gsonB.fromJson(progress, NasReadingRecordModule.class);
                if (TextUtils.isEmpty(nasReadingRecordModule != null ? nasReadingRecordModule.getCurrentPath() : null)) {
                    FileInfoModel fileInfoModel11 = new FileInfoModel();
                    ComicInfoModel comicInfoModel7 = this.T3;
                    Intrinsics.checkNotNull(comicInfoModel7);
                    fileInfoModel11.setPath(comicInfoModel7.getPath());
                    ComicInfoModel comicInfoModel8 = this.T3;
                    Intrinsics.checkNotNull(comicInfoModel8);
                    fileInfoModel11.setName(com.zentraedi.business.utils.l5.r(comicInfoModel8.getPath()));
                    ComicInfoModel comicInfoModel9 = this.T3;
                    Intrinsics.checkNotNull(comicInfoModel9);
                    fileInfoModel11.setFileId(comicInfoModel9.getPath());
                    this.Z2 = fileInfoModel11;
                } else {
                    FileInfoModel fileInfoModel12 = new FileInfoModel();
                    fileInfoModel12.setPath(nasReadingRecordModule != null ? nasReadingRecordModule.getCurrentPath() : null);
                    fileInfoModel12.setName(com.zentraedi.business.utils.l5.r(nasReadingRecordModule != null ? nasReadingRecordModule.getCurrentPath() : null));
                    fileInfoModel12.setFileId(nasReadingRecordModule != null ? nasReadingRecordModule.getCurrentPath() : null);
                    this.Z2 = fileInfoModel12;
                }
                com.zentraedi.business.utils.i5 i5Var2 = com.zentraedi.business.utils.i5.a;
                FileInfoModel fileInfoModel13 = this.Z2;
                if (i5Var2.f((fileInfoModel13 == null || (path2 = fileInfoModel13.getPath()) == null) ? null : StringsKt.trim(path2).toString()) == -1 && !TextUtils.isEmpty(nasReadingRecordModule.getFilePath()) && (fileInfoModel = this.Z2) != null) {
                    fileInfoModel.setPath(nasReadingRecordModule.getFilePath());
                }
            }
            com.zentraedi.business.utils.i5 i5Var3 = com.zentraedi.business.utils.i5.a;
            FileInfoModel fileInfoModel14 = this.Z2;
            iF = i5Var3.f((fileInfoModel14 == null || (path = fileInfoModel14.getPath()) == null) ? null : StringsKt.trim(path).toString());
            this.c0 = iF;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("configData comicInfo path=");
            ComicInfoModel comicInfoModel10 = this.T3;
            sb4.append(comicInfoModel10 != null ? comicInfoModel10.getPath() : null);
            sb4.append(", currentPath=");
            FileInfoModel fileInfoModel15 = this.Z2;
            sb4.append(fileInfoModel15 != null ? fileInfoModel15.getPath() : null);
            sb4.append(", currentName=");
            FileInfoModel fileInfoModel16 = this.Z2;
            sb4.append(fileInfoModel16 != null ? fileInfoModel16.getName() : null);
            sb4.append(", type=");
            sb4.append(iF);
            nd.a.e(D5, sb4.toString());
        } else {
            iF = 3;
        }
        n6().e2(this.T3);
        ObservableField<Boolean> observableFieldQ1 = n6().q1();
        ComicInfoModel comicInfoModel11 = this.T3;
        observableFieldQ1.set(Boolean.valueOf((comicInfoModel11 != null ? comicInfoModel11.isOfflineData() : false) || NasConnectManager.getInstance().isOfflineLogin()));
        this.f0 = this.T3 != null;
        this.P3 = this.Z2;
        if (iF == 3) {
            this.e0 = ComicItemType.COMIC_ITEM_TYPE_IMAGE;
        } else if (iF == 8) {
            this.e0 = ComicItemType.COMIC_ITEM_TYPE_PDF;
        } else if (iF == 10) {
            this.e0 = ComicItemType.COMIC_ITEM_TYPE_ZIP;
        } else if (iF == 26 || iF == 33 || iF == 57) {
            this.e0 = ComicItemType.COMIC_ITEM_TYPE_EPUB;
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("configData unsupported type=");
            sb5.append(iF);
            sb5.append(", currentFilePath=");
            FileInfoModel fileInfoModel17 = this.Z2;
            sb5.append(fileInfoModel17 != null ? fileInfoModel17.getPath() : null);
            sb5.append(", currentFileName=");
            FileInfoModel fileInfoModel18 = this.Z2;
            sb5.append(fileInfoModel18 != null ? fileInfoModel18.getName() : null);
            sb5.append(", comicPath=");
            ComicInfoModel comicInfoModel12 = this.T3;
            sb5.append(comicInfoModel12 != null ? comicInfoModel12.getPath() : null);
            nd.a.c(D5, sb5.toString());
            finish();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("configData done from=");
        sb6.append(this.c0);
        sb6.append(", itemType=");
        sb6.append(this.e0);
        sb6.append(", loadPath=");
        FileInfoModel fileInfoModel19 = this.P3;
        sb6.append(fileInfoModel19 != null ? fileInfoModel19.getPath() : null);
        sb6.append(", loadName=");
        FileInfoModel fileInfoModel20 = this.P3;
        sb6.append(fileInfoModel20 != null ? fileInfoModel20.getName() : null);
        sb6.append(", comicPath=");
        ComicInfoModel comicInfoModel13 = this.T3;
        sb6.append(comicInfoModel13 != null ? comicInfoModel13.getPath() : null);
        nd.a.e(D5, sb6.toString());
        com.zentraedi.comic.viewmodel.m4 m4VarM6 = m6();
        com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
        FileInfoModel fileInfoModel21 = this.Z2;
        if (fileInfoModel21 != null && (path4 = fileInfoModel21.getPath()) != null) {
            str = path4;
        }
        m4VarM6.a1(aVar.m(str));
    }

    public boolean b4() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@fo.k MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            com.zentraedi.comic.x xVar = com.zentraedi.comic.x.a;
            Object objD = com.zentraedi.business.utils.t7.d(com.zentraedi.comic.x.b, 0L);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            xVar.a(this, ((Number) objD).longValue());
            int actionMasked = ev.getActionMasked();
            if (actionMasked == 0) {
                A8();
            } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                z8();
            }
            return super/*android.app.Activity*/.dispatchTouchEvent(ev);
        } catch (Exception unused) {
            return true;
        }
    }

    public final void k8(int i2) {
        com.zentraedi.comic.databinding.o oVar = this.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        ViewGroup.LayoutParams layoutParams = oVar.G.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.topMargin = 0;
        }
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.G.setLayoutParams(layoutParams);
    }

    protected void onActivityResult(int i2, int i3, @fo.l Intent intent) {
        com.zentraedi.comic.viewmodel.e3 e3VarF;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i2, i3, intent);
        if (intent == null) {
            return;
        }
        if (i3 == 17) {
            o6().y1((ReadSetting.Coordinate) intent.getParcelableExtra("intent_comic_bitmap_path_result"));
        }
        if (i3 == 20) {
            o6().i2((ReadSetting.Stretcher) intent.getParcelableExtra("intent_comic_bitmap_path_result"));
        }
        if (i3 == 19) {
            o8((OverallReadSetting) intent.getParcelableExtra("START_ACTIVITY_RESULT"));
            com.zentraedi.comic.viewmodel.o6 o6VarC7 = C7(S7(this, null, 1, null));
            if (o6VarC7 == null || (e3VarF = o6VarC7.f()) == null) {
                return;
            }
            T5(e3VarF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        q6().stopScroll();
        if (com.zentraedi.comic.w.j(q6()) == -1) {
            nd.a.a(D5, "onBackPressed--getShowFirstItemLocation()");
            finish();
        } else {
            if (!this.f0) {
                nd.a.a(D5, "onBackPressed--isComic()");
                finish();
                return;
            }
            this.w5 = 5;
            nd.a.a(D5, "onBackPressed--save");
            a8();
            org.greenrobot.eventbus.c.f().q(new ReadRecordUpdateEvent());
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onCloseComicReaderEvent(@fo.k CloseComicReaderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ComicInfoModel comicInfoModel = this.T3;
        if (comicInfoModel != null) {
            org.greenrobot.eventbus.c.f().q(new CloseComicCompressionEvent(comicInfoModel.getId(), comicInfoModel.getPath(), 2));
        }
        finish();
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        com.zentraedi.comic.adapter.a aVarD;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.n0 = false;
        gg.a aVar = this.Z;
        if (aVar != null && (aVarD = aVar.d()) != null) {
            aVarD.P(q6());
        }
        int i2 = getResources().getConfiguration().orientation;
        if (i2 == 1) {
            r8(com.zentraedi.business.utils.g8.h());
            Q7();
            n6().B1().set(Boolean.TRUE);
            com.zentraedi.comic.view.a aVar2 = this.a1;
            if (aVar2 != null) {
                aVar2.h(true);
            }
        } else if (i2 == 2) {
            n6().B1().set(Boolean.FALSE);
            k8(com.zentraedi.business.utils.g8.h());
            Q7();
            com.zentraedi.comic.view.a aVar3 = this.a1;
            if (aVar3 != null) {
                aVar3.h(false);
            }
        }
        n6().x1().set(Boolean.FALSE);
        n6().o2(getResources().getConfiguration().orientation);
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.P.requestLayout();
        G7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@fo.l Bundle bundle) {
        Bundle extras;
        Set<String> setKeySet;
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate extras=");
        Intent intent = getIntent();
        sb.append((intent == null || (extras = intent.getExtras()) == null || (setKeySet = extras.keySet()) == null) ? null : CollectionsKt.joinToString$default(setKeySet, null, null, null, 0, null, null, 63, null));
        nd.a.e(D5, sb.toString());
        P3();
    }

    protected void onDestroy() {
        m6().P0().removeOnListChangedCallback(this.u5);
        kotlinx.coroutines.r0.f(this.a0, (CancellationException) null, 1, (Object) null);
        A8();
        n6().y1().removeOnPropertyChangedCallback(this.Z4);
        m6().Q0().removeOnListChangedCallback(this.u5);
        gg.a aVar = this.Z;
        if (aVar != null) {
            aVar.destroy();
        }
        com.zentraedi.business.task.g gVarD = com.zentraedi.business.task.g.D();
        TaskFileData taskFileData = this.j0;
        gVarD.X(taskFileData != null ? taskFileData.getFileId() : null);
        com.zentraedi.comic.databinding.o oVar = this.T;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        RecyclerView mZoomRecyclerView = oVar.P.getMZoomRecyclerView();
        if (mZoomRecyclerView != null) {
            mZoomRecyclerView.removeCallbacks(null);
        }
        com.zentraedi.comic.delegate.t.a.s();
        com.zentraedi.basic.component.networkmonitor.e.d().m(this);
        com.zentraedi.comic.b0.a.i();
        com.zentraedi.comic.x.a.b();
        org.greenrobot.eventbus.c.f().A(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, @fo.l KeyEvent keyEvent) {
        if (i2 == 24) {
            if (!this.r1) {
                return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i2, keyEvent);
            }
            Function0<Boolean> function0D1 = n6().d1();
            if (function0D1 != null) {
                function0D1.invoke();
            }
            return true;
        }
        if (i2 != 25) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i2, keyEvent);
        }
        if (!this.r1) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i2, keyEvent);
        }
        Function0<Boolean> function0K1 = n6().k1();
        if (function0K1 != null) {
            function0K1.invoke();
        }
        return true;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.l FileDownloadProgressEvent fileDownloadProgressEvent) {
        if (fileDownloadProgressEvent != null) {
            v6(fileDownloadProgressEvent.mBaseTask.getFileData());
        }
    }

    protected void onNewIntent(@fo.k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        Y5(intent);
        P7();
    }

    protected void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        com.zentraedi.comic.x.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        super.onResume();
        com.zentraedi.comic.x xVar = com.zentraedi.comic.x.a;
        Object objD = com.zentraedi.business.utils.t7.d(com.zentraedi.comic.x.b, 0L);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        xVar.a(this, ((Number) objD).longValue());
    }

    public final void q8(@fo.l com.zentraedi.comic.view.a aVar) {
        this.a1 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        Y5(getIntent());
    }

    @fo.k
    public final androidx.databinding.u.a r6() {
        return this.Z4;
    }

    public final void r8(int i2) {
        com.zentraedi.comic.databinding.o oVar = this.T;
        com.zentraedi.comic.databinding.o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        ViewGroup.LayoutParams layoutParams = oVar.G.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.G.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        OverallReadSetting overallReadSetting;
        StringBuilder sb = new StringBuilder();
        sb.append("configUI start from=");
        sb.append(this.c0);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel = this.Z2;
        com.zentraedi.comic.databinding.o oVar = null;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" comicPath=");
        ComicInfoModel comicInfoModel = this.T3;
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" zipPath=");
        ComicZipModel comicZipModel = this.A4;
        sb.append(comicZipModel != null ? comicZipModel.getPath() : null);
        nd.a.e(D5, sb.toString());
        org.greenrobot.eventbus.c.f().v(this);
        com.zentraedi.comic.databinding.o oVarZ1 = com.zentraedi.comic.databinding.o.z1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oVarZ1, "inflate(...)");
        this.T = oVarZ1;
        if (oVarZ1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVarZ1 = null;
        }
        setContentView(oVarZ1.getRoot());
        com.zentraedi.comic.databinding.o oVar2 = this.T;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar2 = null;
        }
        oVar2.E1(n6());
        com.zentraedi.comic.databinding.o oVar3 = this.T;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        oVar3.N.C1(n6());
        com.zentraedi.comic.databinding.o oVar4 = this.T;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar4 = null;
        }
        oVar4.M.C1(n6());
        com.zentraedi.comic.databinding.o oVar5 = this.T;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar5 = null;
        }
        oVar5.I.F1(n6());
        l6().s0(this);
        l6().A0(o6());
        com.zentraedi.comic.databinding.o oVar6 = this.T;
        if (oVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar6 = null;
        }
        oVar6.O.E1(l6());
        com.zentraedi.comic.databinding.o oVar7 = this.T;
        if (oVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar7 = null;
        }
        oVar7.O.D1(o6());
        com.zentraedi.comic.databinding.o oVar8 = this.T;
        if (oVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar8 = null;
        }
        oVar8.D1(o6());
        p6().N0(false);
        com.zentraedi.comic.databinding.o oVar9 = this.T;
        if (oVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar9 = null;
        }
        oVar9.u();
        com.zentraedi.comic.databinding.o oVar10 = this.T;
        if (oVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar10 = null;
        }
        oVar10.G.setDrawerLockMode(1);
        com.zentraedi.comic.databinding.o oVar11 = this.T;
        if (oVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar11 = null;
        }
        oVar11.G.closeDrawer(8388611);
        com.zentraedi.comic.databinding.o oVar12 = this.T;
        if (oVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar12 = null;
        }
        oVar12.G.closeDrawer(8388613);
        n6().o2(getResources().getConfiguration().orientation);
        n6().o2(getResources().getConfiguration().orientation);
        try {
            overallReadSetting = (OverallReadSetting) com.zentraedi.business.utils.t7.d(y5, new OverallReadSetting(0, true, 0L, 0, 1, true, null, false, 0, null, 960, null));
        } catch (Exception e2) {
            nd.a.c(D5, "OverallReadSetting load error, using default: " + e2.getMessage());
            overallReadSetting = new OverallReadSetting(0, true, 0L, 0, 1, true, null, false, 0, null, 960, null);
        }
        overallReadSetting.n(false);
        o8(overallReadSetting);
        P7();
        n6().y1().addOnPropertyChangedCallback(this.Z4);
        e8();
        N7();
        U6();
        com.zentraedi.basic.component.networkmonitor.e.d().l(this);
        com.zentraedi.comic.databinding.o oVar13 = this.T;
        if (oVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar13 = null;
        }
        oVar13.I.M.setOnSeekBarChangeListener(I7());
        com.zentraedi.comic.databinding.o oVar14 = this.T;
        if (oVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar = oVar14;
        }
        oVar.I.N.setOnSeekBarChangeListener(I7());
        o6().D0().addOnPropertyChangedCallback(new d());
        r8(com.zentraedi.business.utils.g8.h());
        Boolean bool = (Boolean) n6().y1().get();
        com.zentraedi.basic.function.utils.b.C(this, bool != null ? bool.booleanValue() : false);
    }

    @fo.l
    public final com.zentraedi.comic.view.a s6() {
        return this.a1;
    }

    protected void u3() {
    }

    public final void z8() {
        if (this.g0) {
            this.i0.post(this.v5);
        }
    }
}
