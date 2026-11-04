package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.GridLayoutManager;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicSearchDetailActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a Y = new a(null);

    @fo.k
    public static final String Z = "key_search_content";
    private com.zentraedi.comic.databinding.s T;
    private com.zentraedi.comic.viewmodel.z4 U;

    @fo.l
    private SmartRefreshLayout V;

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.y4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSearchDetailActivity.c5();
        }
    });

    @fo.k
    private final Lazy X = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.z4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSearchDetailActivity.b5();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.k String searchContent) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(searchContent, "searchContent");
            Intent intent = new Intent(activity, (Class<?>) ComicSearchDetailActivity.class);
            intent.putExtra(ComicSearchDetailActivity.Z, searchContent);
            activity.startActivity(intent);
        }

        private a() {
        }
    }

    private final void D4() {
        d5();
        com.zentraedi.comic.databinding.s sVar = this.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        SmartRefreshLayout smartRefreshLayout = sVar.E;
        this.V = smartRefreshLayout;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.activity.t4
                public final void z0(sc.j jVar) {
                    ComicSearchDetailActivity.E4(this.a, jVar);
                }
            });
        }
        SmartRefreshLayout smartRefreshLayout2 = this.V;
        if (smartRefreshLayout2 != null) {
            smartRefreshLayout2.setOnLoadMoreListener(new tc.b() { // from class: com.zentraedi.comic.activity.u4
                public final void h1(sc.j jVar) {
                    ComicSearchDetailActivity.F4(this.a, jVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(ComicSearchDetailActivity comicSearchDetailActivity, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicSearchDetailActivity.a5(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(ComicSearchDetailActivity comicSearchDetailActivity, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicSearchDetailActivity.a5(false);
    }

    private final void G4() {
        com.zentraedi.comic.databinding.s sVar = this.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        sVar.J.setOnScrollChangeListener(new NestedScrollView.e() { // from class: com.zentraedi.comic.activity.w4
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                ComicSearchDetailActivity.H4(this.a, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(ComicSearchDetailActivity comicSearchDetailActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        int[] iArr = new int[2];
        com.zentraedi.comic.databinding.s sVar = comicSearchDetailActivity.T;
        com.zentraedi.comic.databinding.s sVar2 = null;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        sVar.K.getLocationInWindow(iArr);
        if (iArr[1] < com.zentraedi.business.utils.g8.a(Float.valueOf(44.0f))) {
            com.zentraedi.comic.databinding.s sVar3 = comicSearchDetailActivity.T;
            if (sVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                sVar2 = sVar3;
            }
            sVar2.L.setVisibility(0);
            return;
        }
        com.zentraedi.comic.databinding.s sVar4 = comicSearchDetailActivity.T;
        if (sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            sVar2 = sVar4;
        }
        sVar2.L.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void I4(ComicSearchDetailActivity comicSearchDetailActivity, View view) {
        comicSearchDetailActivity.finish();
    }

    private final void J4() {
        com.zentraedi.comic.viewmodel.z4 z4Var = this.U;
        com.zentraedi.comic.viewmodel.z4 z4Var2 = null;
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            z4Var = null;
        }
        z4Var.B1(new Function2() { // from class: com.zentraedi.comic.activity.l4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComicSearchDetailActivity.K4(this.a, (com.zentraedi.comic.viewmodel.i6) obj, ((Integer) obj2).intValue());
            }
        });
        com.zentraedi.comic.viewmodel.z4 z4Var3 = this.U;
        if (z4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            z4Var3 = null;
        }
        z4Var3.N1(new Function2() { // from class: com.zentraedi.comic.activity.v4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComicSearchDetailActivity.W4(this.a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        com.zentraedi.comic.databinding.s sVar = this.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        com.zentraedi.comic.viewmodel.z4 z4Var4 = this.U;
        if (z4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            z4Var2 = z4Var4;
        }
        sVar.C1(z4Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K4(final ComicSearchDetailActivity comicSearchDetailActivity, final com.zentraedi.comic.viewmodel.i6 bookVM, int i) {
        Intrinsics.checkNotNullParameter(bookVM, "bookVM");
        com.zentraedi.comic.business.a1 a1VarY4 = comicSearchDetailActivity.Y4();
        com.zentraedi.comic.databinding.s sVar = comicSearchDetailActivity.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        View root = sVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String str = (String) bookVM.l0().get();
        boolean z = com.zentraedi.business.utils.i5.a.f((String) bookVM.u0().get()) == -1;
        boolean z2 = bookVM.y0() != null;
        String str2 = (String) bookVM.m0().get();
        ComicInfoModel comicInfoModelY0 = bookVM.y0();
        a1VarY4.I0(root, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : str2, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(z), (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0 ? true : z2, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : comicInfoModelY0 != null ? Boolean.valueOf(comicInfoModelY0.isOnShelf()) : null, (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(bookVM.o0().get() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.b5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.L4(this.a, bookVM);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.c5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.N4(bookVM, comicSearchDetailActivity);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.d5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.O4(this.a, bookVM);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.m4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.Q4(bookVM);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.R4(bookVM, comicSearchDetailActivity);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.o4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.U4(this.a, bookVM);
            }
        }, (1130496 & 262144) == 0 ? (String) bookVM.u0().get() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(bookVM.y0() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L4(ComicSearchDetailActivity comicSearchDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarZ4 = comicSearchDetailActivity.Z4();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        String id2 = comicInfoModelY0 != null ? comicInfoModelY0.getId() : null;
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        boolean z = false;
        if (comicInfoModelY1 != null && !comicInfoModelY1.isOnShelf()) {
            z = true;
        }
        x1VarZ4.F(id2, Boolean.valueOf(z), new Function1() { // from class: com.zentraedi.comic.activity.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSearchDetailActivity.M4(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M4(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            ComicInfoModel comicInfoModelY0 = i6Var.y0();
            if (comicInfoModelY0 != null) {
                ComicInfoModel comicInfoModelY1 = i6Var.y0();
                int i = 0;
                if (comicInfoModelY1 != null && comicInfoModelY1.isOnShelf()) {
                    i = 1;
                }
                comicInfoModelY0.setOnShelf(i ^ 1);
            }
            ObservableField<Boolean> observableFieldQ0 = i6Var.q0();
            ComicInfoModel comicInfoModelY2 = i6Var.y0();
            observableFieldQ0.set(comicInfoModelY2 != null ? Boolean.valueOf(comicInfoModelY2.isOnShelf()) : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N4(com.zentraedi.comic.viewmodel.i6 i6Var, ComicSearchDetailActivity comicSearchDetailActivity) {
        ComicDirModel dir;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 != null && (dir = comicInfoModelY0.getDir()) != null) {
            comicSearchDetailActivity.Y4().B0(dir);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O4(ComicSearchDetailActivity comicSearchDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarZ4 = comicSearchDetailActivity.Z4();
        com.zentraedi.comic.databinding.s sVar = comicSearchDetailActivity.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        View root = sVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        x1VarZ4.u0(root, i6Var.y0(), new Function0() { // from class: com.zentraedi.comic.activity.x4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSearchDetailActivity.P4(i6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P4(com.zentraedi.comic.viewmodel.i6 i6Var) {
        ObservableField<String> observableFieldL0 = i6Var.l0();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        observableFieldL0.set(comicInfoModelY0 != null ? comicInfoModelY0.getName() : null);
        ObservableField<String> observableFieldM0 = i6Var.m0();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        observableFieldM0.set(comicInfoModelY1 != null ? comicInfoModelY1.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q4(com.zentraedi.comic.viewmodel.i6 i6Var) {
        String path;
        ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 == null || (path = comicInfoModelY0.getPath()) == null) {
            return Unit.INSTANCE;
        }
        comicFileInfo.setPath(path);
        comicFileInfo.setFolder(i6Var.z0());
        ComicDownloadManager comicDownloadManagerA = ComicDownloadManager.c.a();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        if (comicInfoModelY1 == null) {
            return Unit.INSTANCE;
        }
        comicDownloadManagerA.g(comicInfoModelY1, CollectionsKt.listOf(comicFileInfo));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    public static final Unit R4(final com.zentraedi.comic.viewmodel.i6 i6Var, final ComicSearchDetailActivity comicSearchDetailActivity) {
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (i6Var.z0()) {
            if ((comicInfoModelY0 != null ? comicInfoModelY0.getDir() : null) == null) {
                comicSearchDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.q4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComicSearchDetailActivity.T4(this.a, i6Var, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                ComicDirModel dir = comicInfoModelY0.getDir();
                if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                    Object obj = i6Var.u0().get();
                    ComicDirModel dir2 = comicInfoModelY0.getDir();
                    if (Intrinsics.areEqual(obj, dir2 != null ? dir2.getPath() : null)) {
                        comicSearchDetailActivity.Y4().a0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), comicInfoModelY0.getDir(), new Function1() { // from class: com.zentraedi.comic.activity.p4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ComicSearchDetailActivity.S4(this.a, i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    } else {
                        comicSearchDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.q4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ComicSearchDetailActivity.T4(this.a, i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    comicSearchDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.q4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComicSearchDetailActivity.T4(this.a, i6Var, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            comicSearchDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.q4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ComicSearchDetailActivity.T4(this.a, i6Var, ((Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S4(ComicSearchDetailActivity comicSearchDetailActivity, com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            com.zentraedi.comic.viewmodel.z4 z4Var = comicSearchDetailActivity.U;
            com.zentraedi.comic.viewmodel.z4 z4Var2 = null;
            if (z4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var = null;
            }
            z4Var.getItems().remove(i6Var);
            com.zentraedi.comic.viewmodel.z4 z4Var3 = comicSearchDetailActivity.U;
            if (z4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var3 = null;
            }
            z4Var3.O1(z4Var3.L1() - 1);
            com.zentraedi.comic.viewmodel.z4 z4Var4 = comicSearchDetailActivity.U;
            if (z4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var4 = null;
            }
            ObservableField<String> observableFieldM0 = z4Var4.M0();
            Integer numValueOf = Integer.valueOf(com.zentraedi.comic.q.C0124q.oz0);
            com.zentraedi.comic.viewmodel.z4 z4Var5 = comicSearchDetailActivity.U;
            if (z4Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                z4Var2 = z4Var5;
            }
            observableFieldM0.set(com.zentraedi.basic.function.utils.l.g(numValueOf, MapsKt.mapOf(TuplesKt.to("total", Integer.valueOf(z4Var2.L1())))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T4(ComicSearchDetailActivity comicSearchDetailActivity, com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            com.zentraedi.comic.viewmodel.z4 z4Var = comicSearchDetailActivity.U;
            com.zentraedi.comic.viewmodel.z4 z4Var2 = null;
            if (z4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var = null;
            }
            z4Var.getItems().remove(i6Var);
            com.zentraedi.comic.viewmodel.z4 z4Var3 = comicSearchDetailActivity.U;
            if (z4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var3 = null;
            }
            z4Var3.O1(z4Var3.L1() - 1);
            com.zentraedi.comic.viewmodel.z4 z4Var4 = comicSearchDetailActivity.U;
            if (z4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var4 = null;
            }
            ObservableField<String> observableFieldM0 = z4Var4.M0();
            Integer numValueOf = Integer.valueOf(com.zentraedi.comic.q.C0124q.oz0);
            com.zentraedi.comic.viewmodel.z4 z4Var5 = comicSearchDetailActivity.U;
            if (z4Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                z4Var2 = z4Var5;
            }
            observableFieldM0.set(com.zentraedi.basic.function.utils.l.g(numValueOf, MapsKt.mapOf(TuplesKt.to("total", Integer.valueOf(z4Var2.L1())))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U4(final ComicSearchDetailActivity comicSearchDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.a1 a1VarY4 = comicSearchDetailActivity.Y4();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarY4.Y(comicInfoModelY0 != null ? comicInfoModelY0.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.activity.r4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSearchDetailActivity.V4(this.a, i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V4(ComicSearchDetailActivity comicSearchDetailActivity, com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            com.zentraedi.comic.viewmodel.z4 z4Var = comicSearchDetailActivity.U;
            com.zentraedi.comic.viewmodel.z4 z4Var2 = null;
            if (z4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var = null;
            }
            z4Var.getItems().remove(i6Var);
            com.zentraedi.comic.viewmodel.z4 z4Var3 = comicSearchDetailActivity.U;
            if (z4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var3 = null;
            }
            z4Var3.O1(z4Var3.L1() - 1);
            com.zentraedi.comic.viewmodel.z4 z4Var4 = comicSearchDetailActivity.U;
            if (z4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var4 = null;
            }
            ObservableField<String> observableFieldM0 = z4Var4.M0();
            Integer numValueOf = Integer.valueOf(com.zentraedi.comic.q.C0124q.oz0);
            com.zentraedi.comic.viewmodel.z4 z4Var5 = comicSearchDetailActivity.U;
            if (z4Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                z4Var2 = z4Var5;
            }
            observableFieldM0.set(com.zentraedi.basic.function.utils.l.g(numValueOf, MapsKt.mapOf(TuplesKt.to("total", Integer.valueOf(z4Var2.L1())))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W4(ComicSearchDetailActivity comicSearchDetailActivity, boolean z, boolean z2) {
        com.zentraedi.comic.databinding.s sVar = null;
        if (z) {
            com.zentraedi.comic.viewmodel.z4 z4Var = comicSearchDetailActivity.U;
            if (z4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var = null;
            }
            z4Var.getShowLoadingView().set(false);
            SmartRefreshLayout smartRefreshLayout = comicSearchDetailActivity.V;
            if (smartRefreshLayout != null) {
                smartRefreshLayout.finishRefresh();
            }
        } else {
            SmartRefreshLayout smartRefreshLayout2 = comicSearchDetailActivity.V;
            if (smartRefreshLayout2 != null) {
                smartRefreshLayout2.finishLoadMore();
            }
        }
        com.zentraedi.comic.databinding.s sVar2 = comicSearchDetailActivity.T;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            sVar = sVar2;
        }
        sVar.G.setNoMoreData(!z2);
        return Unit.INSTANCE;
    }

    private final void X4(ComicListDeleteEvent comicListDeleteEvent) {
        com.zentraedi.comic.viewmodel.z4 z4Var = this.U;
        com.zentraedi.comic.viewmodel.z4 z4Var2 = null;
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            z4Var = null;
        }
        z4Var.getItems().removeAll(CollectionsKt.toSet(comicListDeleteEvent.getComicThumbItemViewModels()));
        com.zentraedi.comic.viewmodel.z4 z4Var3 = this.U;
        if (z4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            z4Var3 = null;
        }
        ObservableBoolean observableBooleanO0 = z4Var3.O0();
        com.zentraedi.comic.viewmodel.z4 z4Var4 = this.U;
        if (z4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            z4Var2 = z4Var4;
        }
        observableBooleanO0.set(com.zentraedi.basic.function.utils.j0.l(z4Var2.getItems()));
    }

    private final com.zentraedi.comic.business.a1 Y4() {
        return (com.zentraedi.comic.business.a1) this.X.getValue();
    }

    private final com.zentraedi.comic.business.x1 Z4() {
        return (com.zentraedi.comic.business.x1) this.W.getValue();
    }

    private final void a5(boolean z) {
        com.zentraedi.comic.viewmodel.z4 z4Var = null;
        if (z) {
            com.zentraedi.comic.viewmodel.z4 z4Var2 = this.U;
            if (z4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                z4Var2 = null;
            }
            z4Var2.getShowLoadingView().set(true);
        }
        com.zentraedi.comic.viewmodel.z4 z4Var3 = this.U;
        if (z4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            z4Var = z4Var3;
        }
        z4Var.M1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 b5() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 c5() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d5() {
        int iA = com.zentraedi.business.utils.p0.K(this) ? com.zentraedi.business.utils.m6.a.a() : 3;
        com.zentraedi.comic.databinding.s sVar = this.T;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        sVar.F.setLayoutManager(new GridLayoutManager(this, iA));
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicListDeleteEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getOption(), ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE)) {
            X4(event);
        }
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*com.zentraedi.business.activity.BaseActivity*/.onConfigurationChanged(newConfig);
        d5();
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        org.greenrobot.eventbus.c.f().v(this);
        com.zentraedi.comic.viewmodel.z4 z4VarC = new androidx.lifecycle.m2(this).c(com.zentraedi.comic.viewmodel.z4.class);
        this.U = z4VarC;
        if (z4VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            z4VarC = null;
        }
        String stringExtra = getIntent().getStringExtra(Z);
        if (stringExtra == null) {
            stringExtra = "";
        }
        z4VarC.z1(stringExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        androidx.databinding.c0 c0VarL = androidx.databinding.m.l(this, com.zentraedi.comic.q.l.R);
        Intrinsics.checkNotNullExpressionValue(c0VarL, "setContentView(...)");
        com.zentraedi.comic.databinding.s sVar = (com.zentraedi.comic.databinding.s) c0VarL;
        this.T = sVar;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            sVar = null;
        }
        sVar.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSearchDetailActivity.I4(this.a, view);
            }
        });
        J4();
        D4();
        G4();
        a5(true);
    }
}
