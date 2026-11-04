package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.databinding.ObservableField;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.activity.ComicCompressionBrowserActivity;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.activity.ComicSettingActivity;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.activity.OfflineComicDetailActivity;
import com.zentraedi.comic.event.ComicShelfChangedEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessEvent;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.request.ComicDirListRequest;
import com.zentraedi.comic.request.ComicShelfEditRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n774#2:595\n865#2,2:596\n*S KotlinDebug\n*F\n+ 1 ComicReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderViewModel\n*L\n542#1:595\n542#1:596,2\n*E\n"})
public final class ComicReaderViewModel extends com.zentraedi.basic.function.viewmodel.d {

    @fo.k
    private final ObservableField<Boolean> B;

    @fo.k
    private final ObservableField<Boolean> C;

    @fo.k
    private final ObservableField<Boolean> D;

    @fo.k
    private final ObservableField<Boolean> E;

    @fo.k
    private final ObservableField<Boolean> F;

    @fo.k
    private final ObservableField<Boolean> G;

    @fo.k
    private final ObservableField<Boolean> H;

    @fo.k
    private final ObservableField<Boolean> I;

    @fo.k
    private final ObservableField<Boolean> J;

    @fo.k
    private final ObservableField<Boolean> K;

    @fo.k
    private final ObservableField<String> L;

    @fo.k
    private final ObservableField<String> M;

    @fo.k
    private final ObservableField<String> N;

    @fo.k
    private final ObservableField<String> O;

    @fo.k
    private final ObservableField<Boolean> P;

    @fo.k
    private final ObservableField<Boolean> Q;

    @fo.k
    private ObservableField<Boolean> R;

    @fo.k
    private ObservableField<Boolean> S;

    @fo.k
    private ObservableField<Boolean> T;
    private int U;

    @fo.l
    private String V;

    @fo.l
    private Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> W;

    @fo.l
    private Function0<Boolean> X;

    @fo.l
    private Function0<Unit> Y;

    @fo.l
    private Function0<Unit> Z;

    @fo.l
    private Function0<Unit> a0;

    @fo.l
    private Function0<Boolean> b0;

    @fo.l
    private Function0<Unit> c0;

    @fo.l
    private Function0<Unit> d0;

    @fo.l
    private Function0<Unit> e0;

    @fo.l
    private Function0<Unit> f0;

    @fo.l
    private Function0<Unit> g0;

    @fo.l
    private Function1<? super Integer, Unit> h0;

    @fo.l
    private com.zentraedi.comic.dialog.o i0;

    @fo.l
    private gg.a j0;

    @fo.k
    private ObservableField<BottomMenu> k0;

    @fo.l
    private ComicInfoModel l0;

    @fo.l
    private Integer m0;

    public enum BottomMenu {
        FILE,
        SETTING,
        MORE,
        CATALOG,
        NODE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @fo.k
        public static EnumEntries<BottomMenu> getEntries() {
            return $ENTRIES;
        }
    }

    public enum ResultStatus {
        LEFT,
        RIGHT,
        CENTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @fo.k
        public static EnumEntries<ResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResultStatus.values().length];
            try {
                iArr[ResultStatus.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultStatus.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultStatus.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends com.zentraedi.business.http.b<ComicDirListResponse> {
        final /* synthetic */ String b;

        b(String str) {
            this.b = str;
        }

        public void onResult(ResponseData<ComicDirListResponse> responseData) {
            if (Intrinsics.areEqual(responseData != null ? responseData.getCode() : null, "200")) {
                ComicReaderViewModel.this.J0(responseData.getData().getList(), this.b);
            } else {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Au1, responseData != null ? responseData.getCode() : null, responseData != null ? responseData.getMsg() : null), false);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vu1), false);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicReaderViewModel$saveReadRecord$1", f = "ComicReaderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ ComicInfoModel c;
        final /* synthetic */ NasReadingRecordModule d;
        final /* synthetic */ ComicReaderViewModel e;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicReaderViewModel$saveReadRecord$1$2", f = "ComicReaderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ ComicInfoModel b;
            final /* synthetic */ Ref.ObjectRef<ReadingRecord> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComicInfoModel comicInfoModel, Ref.ObjectRef<ReadingRecord> objectRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = comicInfoModel;
                this.c = objectRef;
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
                org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
                String id2 = this.b.getId();
                String progress = this.c.element.getProgress();
                if (progress == null) {
                    progress = "";
                }
                cVarF.q(new ReadRecordUpdateSuccessEvent(id2, progress));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ComicInfoModel comicInfoModel, NasReadingRecordModule nasReadingRecordModule, ComicReaderViewModel comicReaderViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = comicInfoModel;
            this.d = nasReadingRecordModule;
            this.e = comicReaderViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, this.e, continuation);
            cVar.b = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [T, com.zentraedi.business.database.ReadingRecord] */
        /* JADX WARN: Type inference failed for: r7v2, types: [T, com.zentraedi.business.database.ReadingRecord] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String id2;
            ComicInfoModel comicInfoModelH1;
            ComicCategory category;
            String id3;
            ComicCategory category2;
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ig.k kVar = ig.k.a;
            String id4 = this.c.getId();
            ComicDirModel dir = this.c.getDir();
            if (dir == null || (category2 = dir.getCategory()) == null || (id2 = category2.getId()) == null) {
                id2 = "";
            }
            ?? E = kVar.E(id4, id2);
            objectRef.element = E;
            if (E == 0) {
                String id5 = this.c.getId();
                ComicDirModel dir2 = this.c.getDir();
                String str = (dir2 == null || (category = dir2.getCategory()) == null || (id3 = category.getId()) == null) ? "" : id3;
                String cover = this.c.getCover();
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                Intrinsics.checkNotNullExpressionValue(strLoginUserName, "loginUserName(...)");
                String nasId = NasConnectManager.getInstance().getNasId();
                Intrinsics.checkNotNullExpressionValue(nasId, "getNasId(...)");
                ?? readingRecord = new ReadingRecord(id5, str, cover, strLoginUserName, nasId, this.c.getName(), this.c.getPath(), 0, 0, true, 0L);
                readingRecord.setComicNasPath(this.c.getComicMainPath());
                objectRef.element = readingRecord;
            }
            ReadingRecord readingRecord2 = (ReadingRecord) objectRef.element;
            NasReadingRecordModule nasReadingRecordModule = this.d;
            readingRecord2.setProgress(nasReadingRecordModule != null ? nasReadingRecordModule.toJsonStr() : null);
            kVar.H(CollectionsKt.arrayListOf(objectRef.element));
            if (NasConnectManager.getInstance().isOfflineLogin() || ((comicInfoModelH1 = this.e.h1()) != null && comicInfoModelH1.isOfflineData())) {
                kotlinx.coroutines.i.e(q0Var, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new a(this.c, objectRef, null), 2, (Object) null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ int a;
        final /* synthetic */ ComicReaderViewModel b;
        final /* synthetic */ ComicShelfEditRequest c;

        d(int i, ComicReaderViewModel comicReaderViewModel, ComicShelfEditRequest comicShelfEditRequest) {
            this.a = i;
            this.b = comicReaderViewModel;
            this.c = comicShelfEditRequest;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(this.a == 1 ? com.zentraedi.comic.q.C0124q.Qv2 : com.zentraedi.comic.q.C0124q.lx2));
            this.b.O0().set(Boolean.valueOf(this.a == 1));
            org.greenrobot.eventbus.c.f().q(new ComicShelfChangedEvent(this.c.getOn_shelf(), this.c.getComic_ids()));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class e implements com.zentraedi.business.utils.n4.j {
        e() {
        }

        public void confirmClick() {
        }
    }

    public ComicReaderViewModel() {
        Boolean bool = Boolean.FALSE;
        this.B = new ObservableField<>(bool);
        Boolean bool2 = Boolean.TRUE;
        this.C = new ObservableField<>(bool2);
        this.D = new ObservableField<>(bool2);
        this.E = new ObservableField<>(bool2);
        this.F = new ObservableField<>(bool2);
        this.G = new ObservableField<>(bool);
        this.H = new ObservableField<>(bool2);
        this.I = new ObservableField<>(bool);
        this.J = new ObservableField<>(bool2);
        this.K = new ObservableField<>(bool);
        this.L = new ObservableField<>("");
        this.M = new ObservableField<>("(0%)");
        this.N = new ObservableField<>("");
        this.O = new ObservableField<>("0%");
        this.P = new ObservableField<>(bool);
        this.Q = new ObservableField<>(bool);
        this.R = new ObservableField<>(bool);
        this.S = new ObservableField<>(bool);
        this.T = new ObservableField<>(bool);
        this.U = -1;
        this.k0 = new ObservableField<>(BottomMenu.NODE);
    }

    private final void G1(final boolean z) {
        final ComicInfoModel comicInfoModel = this.l0;
        if (comicInfoModel == null || com.zentraedi.business.utils.i5.a.f(comicInfoModel.getPath()) != 10) {
            return;
        }
        com.zentraedi.comic.util.l.a.f(comicInfoModel, new Function1() { // from class: com.zentraedi.comic.viewmodel.x4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicReaderViewModel.I1(z, this, comicInfoModel, ((Boolean) obj).booleanValue());
            }
        });
    }

    static /* synthetic */ void H1(ComicReaderViewModel comicReaderViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        comicReaderViewModel.G1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(boolean z, ComicReaderViewModel comicReaderViewModel, ComicInfoModel comicInfoModel, boolean z2) {
        String path;
        List list;
        FileInfoModel fileInfoModel;
        if (z2) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            if (z) {
                path = comicReaderViewModel.V;
            } else {
                CompressionBrowserResponse compressionBrowserResponseT = com.zentraedi.comic.b0.a.t();
                path = (compressionBrowserResponseT == null || (list = compressionBrowserResponseT.getList()) == null || (fileInfoModel = (FileInfoModel) list.get(0)) == null) ? null : fileInfoModel.getPath();
            }
            String strM = (path == null || !StringsKt.contains$default(path, '/', false, 2, (Object) null)) ? null : com.zentraedi.business.utils.d5.a.m(path);
            com.zentraedi.comic.b0 b0Var = com.zentraedi.comic.b0.a;
            CompressionBrowserResponse compressionBrowserResponseT2 = b0Var.t();
            String pwd = compressionBrowserResponseT2 != null ? compressionBrowserResponseT2.getPwd() : null;
            CompressionBrowserResponse compressionBrowserResponseT3 = b0Var.t();
            String charset = compressionBrowserResponseT3 != null ? compressionBrowserResponseT3.getCharset() : null;
            ComicCompressionBrowserActivity.a aVar = ComicCompressionBrowserActivity.b0;
            Intrinsics.checkNotNull(activityE);
            aVar.a(activityE, comicInfoModel, com.zentraedi.business.utils.l0.d(com.zentraedi.business.utils.l0.a, strM, pwd, charset, (Integer) null, 8, (Object) null));
        }
        comicReaderViewModel.L0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(List<ComicDirModel> list, String str) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.startsWith$default(str, ((ComicDirModel) obj).getPath(), false, 2, (Object) null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            p2();
        } else {
            com.zentraedi.comic.delegate.m.k(com.zentraedi.comic.delegate.m.a, ((ComicDirModel) arrayList.get(0)).getId(), str, null, new Function1() { // from class: com.zentraedi.comic.viewmodel.y4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ComicReaderViewModel.K0(this.a, (ComicInfoModel) obj2);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(ComicReaderViewModel comicReaderViewModel, ComicInfoModel comicInfoModel) {
        if (comicInfoModel == null) {
            comicReaderViewModel.p2();
            return Unit.INSTANCE;
        }
        if (!comicInfoModel.isOnShelf()) {
            comicReaderViewModel.n2(comicInfoModel.getId(), 1);
            return Unit.INSTANCE;
        }
        comicReaderViewModel.S.set(Boolean.TRUE);
        com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qv2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(Context context, ComicInfoModel comicInfoModel, String str, ComicInfoModel comicInfoModel2, ComicReaderViewModel comicReaderViewModel, boolean z) {
        if (z) {
            ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            ComicDirModel dir = comicInfoModel.getDir();
            String rootDirId = dir != null ? dir.getRootDirId() : null;
            ComicDirModel dir2 = comicInfoModel.getDir();
            ComicSubDirActivity.a.b(aVar, activity, "0", rootDirId, dir2 != null ? dir2.getPath() : null, str, null, comicInfoModel2, 32, null);
        }
        comicReaderViewModel.L0();
        return Unit.INSTANCE;
    }

    private final void L1(final Context context) {
        final ComicInfoModel comicInfoModel = this.l0;
        if (comicInfoModel != null) {
            com.zentraedi.comic.util.l.a.f(comicInfoModel, new Function1() { // from class: com.zentraedi.comic.viewmodel.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderViewModel.M1(context, comicInfoModel, this, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(Context context, ComicInfoModel comicInfoModel, ComicReaderViewModel comicReaderViewModel, boolean z) {
        if (z) {
            OfflineComicDetailActivity.a aVar = OfflineComicDetailActivity.f0;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            aVar.a((Activity) context, com.zentraedi.business.utils.d5.a.m(comicInfoModel.getPath()), comicInfoModel, comicInfoModel.getOfflineDataTopLevelPath());
        }
        comicReaderViewModel.L0();
        return Unit.INSTANCE;
    }

    private final void p2() {
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.oH);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pH);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.cz);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        n4VarA.Z1(activityE, strN, strN2, strN3, false, new e());
    }

    private final NasReadingRecordModule q() {
        gg.a aVar = this.j0;
        if (aVar != null) {
            return aVar.q();
        }
        return null;
    }

    @fo.l
    public final Integer A1() {
        return this.m0;
    }

    @fo.k
    public final ObservableField<Boolean> B1() {
        return this.J;
    }

    public final void C1(int i) {
        if (i == 1) {
            Boolean bool = Boolean.TRUE;
            t7.j(ComicReaderActivity.F5, bool);
            this.D.set(bool);
            this.C.set(bool);
            return;
        }
        if (i != 2) {
            return;
        }
        Boolean bool2 = Boolean.TRUE;
        t7.j(ComicReaderActivity.C5, bool2);
        this.D.set(bool2);
        this.C.set(bool2);
    }

    public final void D1() {
        Function0<Boolean> function0 = this.b0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void E1() {
        Function0<Boolean> function0 = this.X;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void F1() {
        Function0<Unit> function0 = this.f0;
        if (function0 != null) {
            function0.invoke();
        }
        this.B.set(Boolean.FALSE);
        this.k0.set(BottomMenu.CATALOG);
    }

    public final void H0() {
        Function0<Unit> function0 = this.a0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void I0() {
        Function0<Unit> function0 = this.Z;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void J1(@fo.k final Context context) {
        ComicInfoModel comicInfoModel;
        Intrinsics.checkNotNullParameter(context, "context");
        final ComicInfoModel comicInfoModel2 = this.l0;
        if (comicInfoModel2 != null) {
            if (NasConnectManager.getInstance().isOfflineLogin() || ((comicInfoModel = this.l0) != null && comicInfoModel.isOfflineData())) {
                L1(context);
                return;
            }
            int iF = com.zentraedi.business.utils.i5.a.f(comicInfoModel2.getPath());
            if (iF == 10) {
                H1(this, false, 1, null);
                return;
            }
            final ComicInfoModel comicInfoModel3 = (iF == 26 || iF == 33) ? null : comicInfoModel2;
            final String path = iF == -1 ? comicInfoModel2.getPath() : com.zentraedi.business.utils.d5.a.m(comicInfoModel2.getPath());
            com.zentraedi.comic.util.l.a.f(comicInfoModel3 == null ? comicInfoModel2 : comicInfoModel3, new Function1() { // from class: com.zentraedi.comic.viewmodel.v4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderViewModel.K1(context, comicInfoModel2, path, comicInfoModel3, this, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void L0() {
        Function0<Unit> function0 = this.Y;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void M0() {
        this.K.set(Boolean.FALSE);
    }

    public final void N0() {
        String str;
        nd.a.a("ComicReaderVM", "continueReade clicked: lastLocation=" + this.U + ", path=" + this.V);
        if (this.U == -1 && (str = this.V) != null && str.length() != 0) {
            nd.a.h("ComicReaderVM", "Index is -1 but path exists, requesting fallback match");
        }
        this.K.set(Boolean.FALSE);
        Function1<? super Integer, Unit> function1 = this.h0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.U));
        }
    }

    public final void N1(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.k0.set(BottomMenu.MORE);
        ComicSettingActivity.U.a((Activity) context, this.m0);
    }

    @fo.k
    public final ObservableField<Boolean> O0() {
        return this.S;
    }

    public final void O1(@fo.k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.k0.set(BottomMenu.SETTING);
        if (i != 2) {
            ObservableField<Boolean> observableField = this.Q;
            Object obj = observableField.get();
            Intrinsics.checkNotNull(obj);
            observableField.set(Boolean.valueOf(!((Boolean) obj).booleanValue()));
            return;
        }
        Function0<Unit> function0 = this.g0;
        if (function0 != null) {
            function0.invoke();
        }
        this.B.set(Boolean.FALSE);
        this.k0.set(BottomMenu.NODE);
    }

    @fo.l
    public final Function0<Unit> P0() {
        return this.a0;
    }

    public final void P1() {
        Function0<Unit> function0 = this.e0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @fo.k
    public final ObservableField<Boolean> Q0() {
        return this.T;
    }

    public final void Q1(@fo.l ComicInfoModel comicInfoModel, @fo.k NasReadingRecordModule nasReadingRecordModule) {
        Intrinsics.checkNotNullParameter(nasReadingRecordModule, "nasReadingRecordModule");
        if (comicInfoModel == null) {
            return;
        }
        kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(this), kotlinx.coroutines.g1.c(), (CoroutineStart) null, new c(comicInfoModel, nasReadingRecordModule, this, null), 2, (Object) null);
    }

    @fo.l
    public final Function0<Unit> R0() {
        return this.Z;
    }

    public final void R1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.S = observableField;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicDirListRequest] */
    public final void S0(@fo.l String str, @fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (str != null) {
            n2(str, 1);
            return;
        }
        ?? comicDirListRequest = new ComicDirListRequest(null, 1, null);
        comicDirListRequest.setSortBy("name");
        comicDirListRequest.setOrder(FileListRequest.ORDER_BY_ASC);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicDirListRequest, new b(path));
    }

    public final void S1(@fo.l Function0<Unit> function0) {
        this.a0 = function0;
    }

    @fo.l
    public final gg.a T0() {
        return this.j0;
    }

    public final void T1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.T = observableField;
    }

    @fo.k
    public final ObservableField<Boolean> U0() {
        return this.G;
    }

    public final void U1(@fo.l Function0<Unit> function0) {
        this.Z = function0;
    }

    @fo.k
    public final ObservableField<Boolean> V0() {
        return this.H;
    }

    public final void V1(@fo.l gg.a aVar) {
        this.j0 = aVar;
    }

    @fo.l
    public final Function0<Unit> W0() {
        return this.d0;
    }

    public final void W1(@fo.l Function0<Unit> function0) {
        this.d0 = function0;
    }

    @fo.l
    public final ResultStatus X0(@fo.k Context context, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        int i = point.x / 2;
        int i2 = i / 4;
        int i3 = i - i2;
        int i4 = i2 + i;
        if (f > i3 && f < i4) {
            return ResultStatus.CENTER;
        }
        float f3 = i;
        if (f < f3) {
            return ResultStatus.LEFT;
        }
        if (f > f3) {
            return ResultStatus.RIGHT;
        }
        return null;
    }

    public final void X1(@fo.l Function0<Unit> function0) {
        this.c0 = function0;
    }

    @fo.l
    public final Function0<Unit> Y0() {
        return this.c0;
    }

    public final void Y1(@fo.l Function0<Unit> function0) {
        this.Y = function0;
    }

    @fo.l
    public final Function0<Unit> Z0() {
        return this.Y;
    }

    public final void Z1(@fo.l com.zentraedi.comic.dialog.o oVar) {
        this.i0 = oVar;
    }

    @fo.l
    public final com.zentraedi.comic.dialog.o a1() {
        return this.i0;
    }

    public final void a2(@fo.l Function1<? super Integer, Unit> function1) {
        this.h0 = function1;
    }

    @fo.l
    public final Function1<Integer, Unit> b1() {
        return this.h0;
    }

    public final void b2(@fo.l Function0<Boolean> function0) {
        this.b0 = function0;
    }

    @fo.k
    public final ObservableField<String> c1() {
        return this.M;
    }

    public final void c2(int i) {
        this.U = i;
    }

    @fo.l
    public final Function0<Boolean> d1() {
        return this.b0;
    }

    public final void d2(@fo.l String str) {
        this.V = str;
    }

    public final int e1() {
        return this.U;
    }

    public final void e2(@fo.l ComicInfoModel comicInfoModel) {
        ObservableField<Boolean> observableField = this.S;
        boolean z = false;
        if (comicInfoModel != null && comicInfoModel.isOnShelf()) {
            z = true;
        }
        observableField.set(Boolean.valueOf(z));
        this.l0 = comicInfoModel;
    }

    @fo.l
    public final String f1() {
        return this.V;
    }

    public final void f2(@fo.k ObservableField<BottomMenu> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.k0 = observableField;
    }

    @fo.k
    public final ObservableField<String> g1() {
        return this.L;
    }

    public final void g2(@fo.l Function0<Boolean> function0) {
        this.X = function0;
    }

    @fo.k
    public final ObservableField<Boolean> getShowLoading() {
        return this.F;
    }

    @fo.l
    public final ComicInfoModel h1() {
        return this.l0;
    }

    public final void h2(@fo.l Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        this.W = function4;
    }

    @fo.k
    public final ObservableField<BottomMenu> i1() {
        return this.k0;
    }

    public final void i2(@fo.l Function0<Unit> function0) {
        this.e0 = function0;
    }

    public final void j2(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.R = observableField;
    }

    @fo.l
    public final Function0<Boolean> k1() {
        return this.X;
    }

    public final void k2(@fo.l Function0<Unit> function0) {
        this.f0 = function0;
    }

    @fo.l
    public final Function4<Integer, Integer, Integer, Integer, Unit> l1() {
        return this.W;
    }

    public final void l2(@fo.l Function0<Unit> function0) {
        this.g0 = function0;
    }

    @fo.k
    public final ObservableField<Boolean> m1() {
        return this.I;
    }

    public final void m2(@fo.l Integer num) {
        this.m0 = num;
    }

    @fo.l
    public final Function0<Unit> n1() {
        return this.e0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfEditRequest] */
    public final void n2(@fo.k String comicId, int i) {
        Intrinsics.checkNotNullParameter(comicId, "comicId");
        ?? comicShelfEditRequest = new ComicShelfEditRequest(comicId, Integer.valueOf(i));
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicShelfEditRequest, new d(i, this, comicShelfEditRequest));
    }

    @fo.k
    public final ObservableField<String> o1() {
        return this.N;
    }

    public final void o2(int i) {
        if (i == 1) {
            this.C.set(t7.d(ComicReaderActivity.F5, Boolean.FALSE));
        } else {
            if (i != 2) {
                return;
            }
            this.D.set(t7.d(ComicReaderActivity.C5, Boolean.FALSE));
        }
    }

    @fo.k
    public final ObservableField<String> p1() {
        return this.O;
    }

    @fo.k
    public final ObservableField<Boolean> q1() {
        return this.R;
    }

    public final void q2(@fo.k ResultStatus resultStatus, @fo.k ReadSetting readSetting) {
        Function0<Unit> function0;
        Function0<Unit> function1;
        Intrinsics.checkNotNullParameter(resultStatus, "resultStatus");
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        int i = a.$EnumSwitchMapping$0[resultStatus.ordinal()];
        if (i == 1) {
            if (readSetting.k() == ReadModel.SCROLL_READ || (function0 = this.c0) == null) {
                return;
            }
            function0.invoke();
            return;
        }
        if (i == 2) {
            ObservableField<Boolean> observableField = this.B;
            Object obj = observableField.get();
            Intrinsics.checkNotNull(obj);
            observableField.set(Boolean.valueOf(!((Boolean) obj).booleanValue()));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (readSetting.k() == ReadModel.SCROLL_READ || (function1 = this.d0) == null) {
            return;
        }
        function1.invoke();
    }

    @fo.l
    public final Function0<Unit> r1() {
        return this.f0;
    }

    @fo.k
    public final ObservableField<Boolean> s1() {
        return this.P;
    }

    @fo.k
    public final ObservableField<Boolean> t1() {
        return this.C;
    }

    @fo.k
    public final ObservableField<Boolean> u1() {
        return this.D;
    }

    @fo.k
    public final ObservableField<Boolean> v1() {
        return this.E;
    }

    @fo.l
    public final Function0<Unit> w1() {
        return this.g0;
    }

    @fo.k
    public final ObservableField<Boolean> x1() {
        return this.K;
    }

    @fo.k
    public final ObservableField<Boolean> y1() {
        return this.B;
    }

    @fo.k
    public final ObservableField<Boolean> z1() {
        return this.Q;
    }
}
