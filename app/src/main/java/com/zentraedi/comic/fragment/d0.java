package com.zentraedi.comic.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.m6;
import com.zentraedi.comic.activity.ComicSearchActivity;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicInfoEditEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicShelfChangedEvent;
import com.zentraedi.comic.event.ReadRecordUpdateEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.viewmodel.i6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHomeFragemt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHomeFragemt.kt\ncom/zentraedi/comic/fragment/ComicHomeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n774#2:359\n865#2,2:360\n*S KotlinDebug\n*F\n+ 1 ComicHomeFragemt.kt\ncom/zentraedi/comic/fragment/ComicHomeFragment\n*L\n310#1:359\n310#1:360,2\n*E\n"})
public final class d0 extends com.zentraedi.business.fragment.a {
    private com.zentraedi.comic.databinding.q1 n;

    @fo.l
    private SmartRefreshLayout p;

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.D3();
        }
    });

    @fo.k
    private final Lazy q = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.a3();
        }
    });

    @fo.k
    private final Lazy r = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.B3();
        }
    });

    @fo.k
    private final Lazy s = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.A3();
        }
    });

    @fo.k
    private final Lazy t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.C3();
        }
    });

    @fo.k
    private final com.zentraedi.basic.component.handler.a u = new com.zentraedi.basic.component.handler.a();
    private boolean v = true;

    public static final class a extends GridLayoutManager.SpanSizeLookup {
        a() {
        }

        public int getSpanSize(int i) {
            com.zentraedi.basic.function.viewmodel.f fVar = (com.zentraedi.basic.function.viewmodel.f) d0.this.v3().q0().getItem(i);
            Integer numValueOf = fVar != null ? Integer.valueOf(fVar.getViewType()) : null;
            int iD = com.zentraedi.comic.constant.a.b.f9if.d();
            if (numValueOf != null && numValueOf.intValue() == iD) {
                return 1;
            }
            return d0.this.v3().y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 A3() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 B3() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.p2 C3() {
        return new com.zentraedi.comic.business.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.b1 D3() {
        return new com.zentraedi.comic.viewmodel.b1();
    }

    private final void E3() {
        v3().M0(com.zentraedi.business.utils.p0.K(getActivity()) ? m6.a.a() : 3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), v3().y0());
        gridLayoutManager.setSpanSizeLookup(new a());
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        q1Var.F.setLayoutManager(gridLayoutManager);
    }

    private final void F3(final i6 i6Var) {
        com.zentraedi.comic.business.a1 a1VarS3 = s3();
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        View root = q1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String str = (String) i6Var.l0().get();
        boolean z = i5.a.f((String) i6Var.u0().get()) == -1;
        String str2 = (String) i6Var.m0().get();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarS3.I0(root, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : str2, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(z), (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : comicInfoModelY0 != null ? Boolean.valueOf(comicInfoModelY0.isOnShelf()) : null, (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(i6Var.o0().get() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.G3(this.a, i6Var);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.H3(i6Var, this);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.I3(this.a, i6Var);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.K3(i6Var);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.L3(i6Var, this);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : null, (1130496 & 262144) == 0 ? (String) i6Var.u0().get() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : null, (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G3(d0 d0Var, i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarT3 = d0Var.t3();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        String id2 = comicInfoModelY0 != null ? comicInfoModelY0.getId() : null;
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        boolean z = false;
        if (comicInfoModelY1 != null && !comicInfoModelY1.isOnShelf()) {
            z = true;
        }
        com.zentraedi.comic.business.x1.G(x1VarT3, id2, Boolean.valueOf(z), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3(i6 i6Var, d0 d0Var) {
        ComicDirModel dir;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 != null && (dir = comicInfoModelY0.getDir()) != null) {
            d0Var.s3().B0(dir);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I3(d0 d0Var, final i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarT3 = d0Var.t3();
        com.zentraedi.comic.databinding.q1 q1Var = d0Var.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        View root = q1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        x1VarT3.u0(root, i6Var.y0(), new Function0() { // from class: com.zentraedi.comic.fragment.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.J3(i6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(i6 i6Var) {
        ObservableField<String> observableFieldL0 = i6Var.l0();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        observableFieldL0.set(comicInfoModelY0 != null ? comicInfoModelY0.getName() : null);
        ObservableField<String> observableFieldM0 = i6Var.m0();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        observableFieldM0.set(comicInfoModelY1 != null ? comicInfoModelY1.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K3(i6 i6Var) {
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
    public static final Unit L3(final i6 i6Var, final d0 d0Var) {
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (i6Var.z0()) {
            if ((comicInfoModelY0 != null ? comicInfoModelY0.getDir() : null) == null) {
                d0Var.s3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.N3(i6Var, d0Var, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                ComicDirModel dir = comicInfoModelY0.getDir();
                if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                    Object obj = i6Var.u0().get();
                    ComicDirModel dir2 = comicInfoModelY0.getDir();
                    if (Intrinsics.areEqual(obj, dir2 != null ? dir2.getPath() : null)) {
                        d0Var.s3().a0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), comicInfoModelY0.getDir(), new Function1() { // from class: com.zentraedi.comic.fragment.x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return d0.M3(i6Var, d0Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    } else {
                        d0Var.s3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return d0.N3(i6Var, d0Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    d0Var.s3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return d0.N3(i6Var, d0Var, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            d0Var.s3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d0.N3(i6Var, d0Var, ((Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M3(i6 i6Var, d0 d0Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), null, 2, null));
            x3(d0Var, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N3(i6 i6Var, d0 d0Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), null, 2, null));
            x3(d0Var, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void O3(final i6 i6Var) {
        com.zentraedi.comic.business.p2 p2VarU3 = u3();
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        View root = q1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        p2VarU3.l(root, (String) i6Var.l0().get(), (String) i6Var.m0().get(), Boolean.valueOf(i5.a.f((String) i6Var.u0().get()) == -1), new Function0() { // from class: com.zentraedi.comic.fragment.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.P3(this.a, i6Var);
            }
        }, (String) i6Var.u0().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P3(d0 d0Var, final i6 i6Var) {
        d0Var.u3().e(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.Q3(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q3(i6 i6Var, boolean z) {
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
    public static final com.zentraedi.comic.business.b a3() {
        return new com.zentraedi.comic.business.b();
    }

    private final void b3() {
        w3(true);
    }

    private final void c3() {
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        com.zentraedi.comic.databinding.q1 q1Var2 = null;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        q1Var.F.setAdapter(v3().q0());
        E3();
        com.zentraedi.comic.databinding.q1 q1Var3 = this.n;
        if (q1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q1Var2 = q1Var3;
        }
        SmartRefreshLayout smartRefreshLayout = q1Var2.E;
        this.p = smartRefreshLayout;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setEnableLoadMore(true);
        }
        SmartRefreshLayout smartRefreshLayout2 = this.p;
        if (smartRefreshLayout2 != null) {
            smartRefreshLayout2.setEnableLoadMore(false);
        }
        SmartRefreshLayout smartRefreshLayout3 = this.p;
        if (smartRefreshLayout3 != null) {
            smartRefreshLayout3.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.fragment.m
                public final void z0(sc.j jVar) {
                    d0.d3(this.a, jVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(d0 d0Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        x3(d0Var, false, 1, null);
    }

    private final void e3() {
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        com.zentraedi.comic.databinding.q1 q1Var2 = null;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        q1Var.L.setOnScrollChangeListener(new NestedScrollView.e() { // from class: com.zentraedi.comic.fragment.h
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                d0.f3(this.a, nestedScrollView, i, i2, i3, i4);
            }
        });
        com.zentraedi.comic.databinding.q1 q1Var3 = this.n;
        if (q1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var3 = null;
        }
        q1Var3.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.g3(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.q1 q1Var4 = this.n;
        if (q1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q1Var2 = q1Var4;
        }
        q1Var2.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.h3(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(d0 d0Var, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        int[] iArr = new int[2];
        com.zentraedi.comic.databinding.q1 q1Var = d0Var.n;
        com.zentraedi.comic.databinding.q1 q1Var2 = null;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        q1Var.M.getLocationInWindow(iArr);
        if (iArr[1] < g8.a(Float.valueOf(44.0f))) {
            com.zentraedi.comic.databinding.q1 q1Var3 = d0Var.n;
            if (q1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                q1Var2 = q1Var3;
            }
            q1Var2.N.setVisibility(0);
            return;
        }
        com.zentraedi.comic.databinding.q1 q1Var4 = d0Var.n;
        if (q1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q1Var2 = q1Var4;
        }
        q1Var2.N.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(d0 d0Var, View view) {
        Activity activity;
        if (com.zentraedi.business.utils.m.c() || (activity = d0Var.getActivity()) == null) {
            return;
        }
        ComicSearchActivity.a0.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(d0 d0Var, View view) {
        FragmentActivity activity;
        if (com.zentraedi.business.utils.m.c() || (activity = d0Var.getActivity()) == null) {
            return;
        }
        com.zentraedi.business.l0.g().z(activity);
    }

    private final void i3() {
        j3();
        c3();
        e3();
    }

    private final void j3() {
        v3().navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fz));
        ObservableField<Boolean> observableFieldQ = v3().Q();
        Boolean bool = Boolean.TRUE;
        observableFieldQ.set(bool);
        v3().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.k3(this.a, view);
            }
        });
        v3().hideRightNavIcon.set(bool);
        v3().K0(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.l3(this.a, view);
            }
        });
        v3().O0(new Function2() { // from class: com.zentraedi.comic.fragment.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0.n3(this.a, (i6) obj, ((Integer) obj2).intValue());
            }
        });
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        q1Var.C1(v3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(d0 d0Var, View view) {
        BaseActivity activity = d0Var.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity != null) {
            baseActivity.X3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(d0 d0Var, View view) {
        com.zentraedi.comic.business.b bVarR3 = d0Var.r3();
        FragmentActivity fragmentActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(fragmentActivityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = fragmentActivityE;
        com.zentraedi.comic.databinding.q1 q1Var = d0Var.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        View root = q1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        com.zentraedi.comic.business.b.g(bVarR3, fragmentActivity, root, null, null, new Function0() { // from class: com.zentraedi.comic.fragment.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.m3();
            }
        }, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m3() {
        org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(null, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(d0 d0Var, i6 bookVM, int i) {
        Intrinsics.checkNotNullParameter(bookVM, "bookVM");
        if (i != 4) {
            d0Var.F3(bookVM);
        } else {
            d0Var.O3(bookVM);
        }
        return Unit.INSTANCE;
    }

    private final void o3(final long j) {
        this.u.postDelayed(new Runnable() { // from class: com.zentraedi.comic.fragment.g
            @Override // java.lang.Runnable
            public final void run() {
                d0.q3(j, this);
            }
        }, j);
    }

    static /* synthetic */ void p3(d0 d0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        d0Var.o3(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(long j, d0 d0Var) {
        nd.a.c("delayedRefresh", "delayMillis ===== " + j);
        x3(d0Var, false, 1, null);
    }

    private final com.zentraedi.comic.business.b r3() {
        return (com.zentraedi.comic.business.b) this.q.getValue();
    }

    private final com.zentraedi.comic.business.a1 s3() {
        return (com.zentraedi.comic.business.a1) this.s.getValue();
    }

    private final com.zentraedi.comic.business.x1 t3() {
        return (com.zentraedi.comic.business.x1) this.r.getValue();
    }

    private final com.zentraedi.comic.business.p2 u3() {
        return (com.zentraedi.comic.business.p2) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.b1 v3() {
        return (com.zentraedi.comic.viewmodel.b1) this.o.getValue();
    }

    private final void w3(final boolean z) {
        if (z) {
            com.zentraedi.comic.databinding.q1 q1Var = this.n;
            if (q1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q1Var = null;
            }
            x2(q1Var.getRoot());
        }
        v3().I0(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.fragment.k
            public final void continueDo() {
                d0.y3(this.a, z);
            }
        });
    }

    static /* synthetic */ void x3(d0 d0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        d0Var.w3(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(final d0 d0Var, final boolean z) {
        d0Var.v3().H0(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.fragment.u
            public final void continueDo() {
                d0.z3(this.a, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(d0 d0Var, boolean z) {
        if (Intrinsics.areEqual(d0Var.v3().showEmpty.get(), Boolean.FALSE)) {
            d0Var.v3().G0();
        }
        SmartRefreshLayout smartRefreshLayout = d0Var.p;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.finishRefresh();
        }
        d0Var.v = false;
        if (z) {
            com.zentraedi.comic.databinding.q1 q1Var = d0Var.n;
            if (q1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q1Var = null;
            }
            d0Var.t2(q1Var.getRoot());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o2() {
        super/*com.zentraedi.basic.function.ui.fragment.a*/.o2();
        if (this.v) {
            return;
        }
        if (Intrinsics.areEqual(v3().showEmpty.get(), Boolean.TRUE)) {
            p3(this, 0L, 1, null);
            return;
        }
        List data = v3().q0().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((com.zentraedi.basic.function.viewmodel.f) obj) instanceof com.zentraedi.comic.viewmodel.m0) {
                arrayList.add(obj);
            }
        }
        if (com.zentraedi.basic.function.utils.j0.l(arrayList) || arrayList.size() != 3) {
            return;
        }
        p3(this, 0L, 1, null);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFilesDeleteEvent(@fo.k ComicFilesDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getFromHouse(), Boolean.TRUE)) {
            o3(4000L);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicHouseAddedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(v3().showEmpty.get(), Boolean.TRUE)) {
            p3(this, 0L, 1, null);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoEditEvent(@fo.k ComicInfoEditEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p3(this, 0L, 1, null);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicShelfChangedEvent(@fo.k ComicShelfChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p3(this, 0L, 1, null);
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(newConfig);
        E3();
        p3(this, 0L, 1, null);
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        org.greenrobot.eventbus.c.f().v(this);
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.U5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        this.n = (com.zentraedi.comic.databinding.q1) c0VarJ;
        i3();
        b3();
        com.zentraedi.comic.databinding.q1 q1Var = this.n;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q1Var = null;
        }
        View root = q1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p3(this, 0L, 1, null);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateEvent(@fo.k ReadRecordUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p3(this, 0L, 1, null);
    }
}
