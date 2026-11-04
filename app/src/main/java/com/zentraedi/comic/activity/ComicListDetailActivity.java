package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.event.ComicDisplayModeChangeEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicListDetailActivity extends ComicBaseListActivity {

    @fo.k
    public static final a e0 = new a(null);

    @fo.k
    public static final String f0 = "KEY_IS_SHELF";

    @fo.l
    private com.zentraedi.comic.fragment.e2 b0;

    @fo.k
    private final String T = "ComicListDetailActivity";

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.e1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.t5(this.a);
        }
    });

    @fo.k
    private final Lazy V = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.f1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.y5();
        }
    });

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.g1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.w5();
        }
    });

    @fo.k
    private final Lazy X = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.h1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.z5();
        }
    });

    @fo.k
    private final Lazy Y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.i1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.x5();
        }
    });

    @fo.k
    private final Lazy Z = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.j1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.v5();
        }
    });

    @fo.k
    private final Lazy a0 = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.k1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicListDetailActivity.u5();
        }
    });

    @fo.k
    private String c0 = com.zentraedi.comic.constant.a.e.Af.a();
    private int d0 = 7;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) ComicListDetailActivity.class);
            intent.putExtra("KEY_IS_SHELF", i);
            activity.startActivity(intent);
        }

        private a() {
        }
    }

    public static final class b implements com.zentraedi.comic.business.z1.a {
        b() {
        }

        @Override // com.zentraedi.comic.business.z1.a
        public void a() {
            ComicListDetailActivity comicListDetailActivity = ComicListDetailActivity.this;
            comicListDetailActivity.A5((String) comicListDetailActivity.b5().getSortBy().get(), (String) ComicListDetailActivity.this.b5().getOrder().get());
            ComicListDetailActivity.this.b5().W();
        }
    }

    public static final class c extends androidx.databinding.u.a {
        c() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            ComicListDetailActivity.this.b5().V().set(Intrinsics.areEqual(ComicListDetailActivity.this.h5().editModel.get(), Boolean.TRUE));
        }
    }

    public static final class d extends androidx.databinding.u.a {
        d() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            ObservableField<String> numDesc = ComicListDetailActivity.this.b5().getNumDesc();
            Integer numValueOf = Integer.valueOf(com.zentraedi.comic.q.C0124q.j62);
            Integer num = (Integer) ComicListDetailActivity.this.h5().getTotalNum().get();
            numDesc.set(com.zentraedi.basic.function.utils.l.f(numValueOf, "num", Integer.valueOf(num != null ? num.intValue() : 0)));
        }
    }

    private final void E5(final com.zentraedi.comic.viewmodel.i6 i6Var) {
        if (this.b0 == null) {
            return;
        }
        com.zentraedi.comic.business.a1 a1VarY4 = Y4();
        View root = X4().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String str = (String) i6Var.l0().get();
        boolean z = com.zentraedi.business.utils.i5.a.f((String) i6Var.u0().get()) == -1;
        String str2 = (String) i6Var.m0().get();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarY4.I0(root, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : str2, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(z), (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : comicInfoModelY0 != null ? Boolean.valueOf(comicInfoModelY0.isOnShelf()) : null, (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(i6Var.o0().get() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.F5(this.a, i6Var);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.H5(i6Var, this);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.I5(this.a, i6Var);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.K5(i6Var);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.L5(i6Var, this);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.O5(this.a, i6Var);
            }
        }, (1130496 & 262144) == 0 ? (String) i6Var.u0().get() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(i6Var.y0() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F5(final ComicListDetailActivity comicListDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarZ4 = comicListDetailActivity.Z4();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        String id2 = comicInfoModelY0 != null ? comicInfoModelY0.getId() : null;
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        boolean z = false;
        if (comicInfoModelY1 != null && !comicInfoModelY1.isOnShelf()) {
            z = true;
        }
        x1VarZ4.F(id2, Boolean.valueOf(z), new Function1() { // from class: com.zentraedi.comic.activity.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.G5(this.a, i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G5(ComicListDetailActivity comicListDetailActivity, com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        int i = 0;
        if (z) {
            if (comicListDetailActivity.d0 != 7) {
                ComicInfoModel comicInfoModelY0 = i6Var.y0();
                if (comicInfoModelY0 != null) {
                    ComicInfoModel comicInfoModelY1 = i6Var.y0();
                    if (comicInfoModelY1 != null && comicInfoModelY1.isOnShelf()) {
                        i = 1;
                    }
                    comicInfoModelY0.setOnShelf(i ^ 1);
                }
                ObservableField<Boolean> observableFieldQ0 = i6Var.q0();
                ComicInfoModel comicInfoModelY2 = i6Var.y0();
                observableFieldQ0.set(comicInfoModelY2 != null ? Boolean.valueOf(comicInfoModelY2.isOnShelf()) : null);
            } else {
                org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
                ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
                comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_REMOVE_FROM_SHELF);
                comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
                cVarF.q(comicListDeleteEvent);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H5(com.zentraedi.comic.viewmodel.i6 i6Var, ComicListDetailActivity comicListDetailActivity) {
        ComicDirModel dir;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 != null && (dir = comicInfoModelY0.getDir()) != null) {
            comicListDetailActivity.Y4().B0(dir);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I5(ComicListDetailActivity comicListDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarZ4 = comicListDetailActivity.Z4();
        View root = comicListDetailActivity.X4().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        x1VarZ4.u0(root, i6Var.y0(), new Function0() { // from class: com.zentraedi.comic.activity.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.J5(i6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J5(com.zentraedi.comic.viewmodel.i6 i6Var) {
        ObservableField<String> observableFieldL0 = i6Var.l0();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        observableFieldL0.set(comicInfoModelY0 != null ? comicInfoModelY0.getName() : null);
        ObservableField<String> observableFieldM0 = i6Var.m0();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        observableFieldM0.set(comicInfoModelY1 != null ? comicInfoModelY1.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K5(com.zentraedi.comic.viewmodel.i6 i6Var) {
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
    public static final Unit L5(final com.zentraedi.comic.viewmodel.i6 i6Var, ComicListDetailActivity comicListDetailActivity) {
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (i6Var.z0()) {
            if ((comicInfoModelY0 != null ? comicInfoModelY0.getDir() : null) == null) {
                comicListDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.n1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComicListDetailActivity.N5(i6Var, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                ComicDirModel dir = comicInfoModelY0.getDir();
                if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                    Object obj = i6Var.u0().get();
                    ComicDirModel dir2 = comicInfoModelY0.getDir();
                    if (Intrinsics.areEqual(obj, dir2 != null ? dir2.getPath() : null)) {
                        comicListDetailActivity.Y4().a0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), comicInfoModelY0.getDir(), new Function1() { // from class: com.zentraedi.comic.activity.m1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ComicListDetailActivity.M5(i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    } else {
                        comicListDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.n1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ComicListDetailActivity.N5(i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    comicListDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.n1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComicListDetailActivity.N5(i6Var, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            comicListDetailActivity.Y4().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ComicListDetailActivity.N5(i6Var, ((Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M5(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N5(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    private final void O4() {
        com.zentraedi.comic.constant.a.e.C0115a c0115a = com.zentraedi.comic.constant.a.e.Af;
        String strA = Intrinsics.areEqual(c0115a.b(), this.c0) ? c0115a.a() : c0115a.b();
        this.c0 = strA;
        com.zentraedi.comic.fragment.e2 e2Var = this.b0;
        if (e2Var != null) {
            e2Var.Q2(strA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O5(ComicListDetailActivity comicListDetailActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.a1 a1VarY4 = comicListDetailActivity.Y4();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarY4.Y(comicInfoModelY0 != null ? comicInfoModelY0.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.activity.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.P5(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    private final void P4() {
        com.zentraedi.comic.viewmodel.c3 c3VarH3;
        com.zentraedi.comic.viewmodel.c3 c3VarH4;
        com.zentraedi.comic.fragment.e2 e2Var = this.b0;
        if (e2Var != null && (c3VarH4 = e2Var.h3()) != null) {
            c3VarH4.X((String) b5().getSortBy().get());
        }
        com.zentraedi.comic.fragment.e2 e2Var2 = this.b0;
        if (e2Var2 == null || (c3VarH3 = e2Var2.h3()) == null) {
            return;
        }
        c3VarH3.V((String) b5().getOrder().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P5(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    private final void Q4(com.zentraedi.comic.impl.m mVar) {
        mVar.P(new Function1() { // from class: com.zentraedi.comic.activity.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.R4(this.a, (com.zentraedi.business.addfile.n) obj);
            }
        });
        mVar.N(new Function1() { // from class: com.zentraedi.comic.activity.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.S4(this.a, (com.zentraedi.comic.viewmodel.i6) obj);
            }
        });
        mVar.R(new Function0() { // from class: com.zentraedi.comic.activity.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicListDetailActivity.T4(this.a);
            }
        });
        mVar.Q(new Function1() { // from class: com.zentraedi.comic.activity.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.U4(this.a, (com.zentraedi.comic.viewmodel.i6) obj);
            }
        });
    }

    private final void Q5() {
        f5().p(X4().getRoot(), b5().getSortBy(), b5().getOrder(), b5().T(), true, this.d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R4(ComicListDetailActivity comicListDetailActivity, com.zentraedi.business.addfile.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.zentraedi.comic.fragment.e2 e2Var = comicListDetailActivity.b0;
        if (e2Var != null) {
            e2Var.s3(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S4(ComicListDetailActivity comicListDetailActivity, com.zentraedi.comic.viewmodel.i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicListDetailActivity.E5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T4(ComicListDetailActivity comicListDetailActivity) {
        if (Intrinsics.areEqual(comicListDetailActivity.h5().editModel.get(), Boolean.FALSE)) {
            comicListDetailActivity.h5().editModel.set(Boolean.TRUE);
            com.zentraedi.comic.fragment.e2 e2Var = comicListDetailActivity.b0;
            if (e2Var != null) {
                e2Var.U2(true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U4(ComicListDetailActivity comicListDetailActivity, final com.zentraedi.comic.viewmodel.i6 vm) {
        String id2;
        Intrinsics.checkNotNullParameter(vm, "vm");
        com.zentraedi.comic.business.a1 a1VarY4 = comicListDetailActivity.Y4();
        ComicInfoModel comicInfoModelY0 = vm.y0();
        if (comicInfoModelY0 == null || (id2 = comicInfoModelY0.getId()) == null) {
            id2 = "";
        }
        a1VarY4.k0(id2, new Function1() { // from class: com.zentraedi.comic.activity.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicListDetailActivity.V4(vm, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V4(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2));
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_READ_RECORD);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    private final void W4() {
        h5().editModel.set(Boolean.FALSE);
        com.zentraedi.comic.fragment.e2 e2Var = this.b0;
        if (e2Var != null) {
            e2Var.U2(false);
        }
    }

    private final com.zentraedi.comic.business.x1 Z4() {
        return (com.zentraedi.comic.business.x1) this.Z.getValue();
    }

    public static /* synthetic */ void d5() {
    }

    private final com.zentraedi.comic.business.z1 f5() {
        return (com.zentraedi.comic.business.z1) this.Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.a3 h5() {
        return (com.zentraedi.comic.viewmodel.a3) this.X.getValue();
    }

    private final void j5() {
        AppBarLayout appBarLayout = X4().E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        TextView tvNavTitle = X4().M.L;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        View tvTitle = X4().O;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        aVar.i(new View[]{tvTitle});
        appBarLayout.e(aVar);
    }

    private final void k5() {
        com.zentraedi.comic.fragment.e2 e2Var = new com.zentraedi.comic.fragment.e2();
        this.b0 = e2Var;
        e2Var.l3(false);
        com.zentraedi.comic.fragment.e2 e2Var2 = this.b0;
        if (e2Var2 != null) {
            e2Var2.E3(this.d0);
        }
        P4();
        com.zentraedi.comic.impl.m mVar = new com.zentraedi.comic.impl.m(this.d0);
        mVar.b0(h5().getTotalNum());
        Q4(mVar);
        mVar.S(new WeakReference<>(h5()));
        mVar.a0(new WeakReference<>(g5()));
        com.zentraedi.comic.fragment.e2 e2Var3 = this.b0;
        if (e2Var3 != null) {
            e2Var3.F3(mVar);
        }
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        com.zentraedi.comic.fragment.e2 e2Var4 = this.b0;
        if (e2Var4 != null) {
            t0VarW.f(com.zentraedi.comic.q.i.d8, e2Var4);
        }
        try {
            t0VarW.r();
        } catch (Exception e) {
            nd.a.c(this.T, "fragment commit error " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    private final void l5() {
        X4().M.L.setTextSize(2, 16.0f);
        X4().M.L.setTypeface(Typeface.DEFAULT);
        X4().M.J.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        X4().M.I.setVisibility(8);
        X4().I.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.xl));
        X4().I.G.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.K3));
        X4().I.F.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.f.Vd));
        if (this.d0 == 6) {
            b5().Q().set(Boolean.FALSE);
        }
    }

    private final void m5() {
        h5().setCloseEditOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.n5(this.a, view);
            }
        });
        h5().setSelectOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.o5(this.a, view);
            }
        });
        this.c0 = com.zentraedi.comic.util.h.a.a();
        b5().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), this.c0));
        b5().M().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.p5(this.a, view);
            }
        });
        b5().R().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.q5(this.a, view);
            }
        });
        b5().N().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.r5(this.a, view);
            }
        });
        b5().O().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicListDetailActivity.s5(this.a, view);
            }
        });
        f5().k(new b());
        h5().editModel.addOnPropertyChangedCallback(new c());
        h5().getTotalNum().addOnPropertyChangedCallback(new d());
        b5().W();
        b5().U(this.d0);
        X4().C1(h5());
        X4().L.C1(b5());
        X4().K.C1(g5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(ComicListDetailActivity comicListDetailActivity, View view) {
        comicListDetailActivity.W4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(ComicListDetailActivity comicListDetailActivity, View view) {
        if (Intrinsics.areEqual(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB), (String) comicListDetailActivity.h5().rightEditTextObserver.get())) {
            com.zentraedi.comic.fragment.e2 e2Var = comicListDetailActivity.b0;
            if (e2Var != null) {
                e2Var.u3();
                return;
            }
            return;
        }
        com.zentraedi.comic.fragment.e2 e2Var2 = comicListDetailActivity.b0;
        if (e2Var2 != null) {
            e2Var2.H3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(ComicListDetailActivity comicListDetailActivity, View view) {
        org.greenrobot.eventbus.c.f().q(new ComicDisplayModeChangeEvent());
        comicListDetailActivity.O4();
        comicListDetailActivity.b5().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), comicListDetailActivity.c0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(ComicListDetailActivity comicListDetailActivity, View view) {
        comicListDetailActivity.Q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(ComicListDetailActivity comicListDetailActivity, View view) {
        comicListDetailActivity.f5().b(comicListDetailActivity.b5().getSortBy(), comicListDetailActivity.b5().getOrder(), comicListDetailActivity.b5().T(), comicListDetailActivity.d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s5(ComicListDetailActivity comicListDetailActivity, View view) {
        comicListDetailActivity.h5().editModel.set(Boolean.TRUE);
        com.zentraedi.comic.fragment.e2 e2Var = comicListDetailActivity.b0;
        if (e2Var != null) {
            e2Var.U2(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.k t5(ComicListDetailActivity comicListDetailActivity) {
        return (com.zentraedi.comic.databinding.k) androidx.databinding.m.l(comicListDetailActivity, com.zentraedi.comic.q.l.N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 u5() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 v5() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.b3 w5() {
        return new com.zentraedi.comic.viewmodel.b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.z1 x5() {
        return new com.zentraedi.comic.business.z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.d3 y5() {
        return new com.zentraedi.comic.viewmodel.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.a3 z5() {
        return new com.zentraedi.comic.viewmodel.a3();
    }

    public final void A5(@fo.l String str, @fo.l String str2) {
        com.zentraedi.comic.viewmodel.c3 c3VarH3;
        com.zentraedi.comic.viewmodel.c3 c3VarH4;
        com.zentraedi.comic.fragment.e2 e2Var = this.b0;
        if (e2Var != null && (c3VarH4 = e2Var.h3()) != null) {
            c3VarH4.X(str);
        }
        com.zentraedi.comic.fragment.e2 e2Var2 = this.b0;
        if (e2Var2 != null && (c3VarH3 = e2Var2.h3()) != null) {
            c3VarH3.V(str2);
        }
        com.zentraedi.comic.fragment.e2 e2Var3 = this.b0;
        if (e2Var3 != null) {
            e2Var3.b();
        }
    }

    public final void B5(@fo.l com.zentraedi.comic.fragment.e2 e2Var) {
        this.b0 = e2Var;
    }

    public final void C5(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c0 = str;
    }

    public final void D5(int i) {
        this.d0 = i;
    }

    @fo.k
    public final com.zentraedi.comic.databinding.k X4() {
        Object value = this.U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.k) value;
    }

    @fo.k
    public final com.zentraedi.comic.business.a1 Y4() {
        return (com.zentraedi.comic.business.a1) this.a0.getValue();
    }

    @fo.l
    public final com.zentraedi.comic.fragment.e2 a5() {
        return this.b0;
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.b3 b5() {
        return (com.zentraedi.comic.viewmodel.b3) this.W.getValue();
    }

    @fo.k
    public final String c5() {
        return this.c0;
    }

    public final int e5() {
        return this.d0;
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.d3 g5() {
        return (com.zentraedi.comic.viewmodel.d3) this.V.getValue();
    }

    @fo.k
    public final String i5() {
        return this.T;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicListDeleteEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(h5().editModel.get(), Boolean.TRUE)) {
            W4();
        }
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public boolean onKeyDown(int i, @fo.k KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i != 4 || event.getRepeatCount() != 0 || !Intrinsics.areEqual(h5().editModel.get(), Boolean.TRUE)) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, event);
        }
        W4();
        return true;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ComicListEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getMessage(), ComicListEvent.Companion.a())) {
            W4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        String strN;
        org.greenrobot.eventbus.c.f().v(this);
        this.d0 = getIntent().getIntExtra("KEY_IS_SHELF", 7);
        ObservableField<String> observableField = h5().navTitle;
        int i = this.d0;
        if (i == 6) {
            strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.e81);
        } else if (i != 7) {
            strN = i != 8 ? com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.yu1) : com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.jK);
        } else {
            strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bb1);
        }
        observableField.set(strN);
    }

    protected void s3() {
        l5();
        m5();
        k5();
        j5();
    }
}
