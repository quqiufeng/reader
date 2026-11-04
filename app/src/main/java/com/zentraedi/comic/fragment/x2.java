package com.zentraedi.comic.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.m6;
import com.zentraedi.comic.activity.ComicSearchDetailActivity;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.viewmodel.d6;
import com.zentraedi.comic.viewmodel.i6;
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
@SourceDebugExtension({"SMAP\nComicSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSearchFragment.kt\ncom/zentraedi/comic/fragment/ComicSearchFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public final class x2 extends com.zentraedi.business.fragment.a {
    private com.zentraedi.comic.databinding.y1 n;
    private d6 o;

    @fo.l
    private SmartRefreshLayout p;

    @fo.k
    private final Lazy q = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.p2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x2.p3();
        }
    });

    @fo.k
    private final Lazy r = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.q2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x2.o3();
        }
    });

    public static final class a extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
        }

        public int getSpanSize(int i) {
            d6 d6Var = x2.this.o;
            if (d6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var = null;
            }
            if (d6Var.getItems().get(i) instanceof com.zentraedi.comic.viewmodel.l0) {
                return this.b;
            }
            return 1;
        }
    }

    private final void S2() {
        q3();
        com.zentraedi.comic.databinding.y1 y1Var = this.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        SmartRefreshLayout smartRefreshLayout = y1Var.E;
        this.p = smartRefreshLayout;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.fragment.r2
                public final void z0(sc.j jVar) {
                    x2.T2(this.a, jVar);
                }
            });
        }
        SmartRefreshLayout smartRefreshLayout2 = this.p;
        if (smartRefreshLayout2 != null) {
            smartRefreshLayout2.setOnLoadMoreListener(new tc.b() { // from class: com.zentraedi.comic.fragment.s2
                public final void h1(sc.j jVar) {
                    x2.U2(this.a, jVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(x2 x2Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        x2Var.m3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(x2 x2Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        x2Var.m3(false);
    }

    private final void V2() {
        this.o = new androidx.lifecycle.m2(this).c(d6.class);
        W2();
        S2();
    }

    private final void W2() {
        d6 d6Var = this.o;
        d6 d6Var2 = null;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.B1(new Function2() { // from class: com.zentraedi.comic.fragment.m2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x2.X2(this.a, (i6) obj, ((Integer) obj2).intValue());
            }
        });
        d6 d6Var3 = this.o;
        if (d6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var3 = null;
        }
        d6Var3.J0().set(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x2.j3(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.y1 y1Var = this.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        d6 d6Var4 = this.o;
        if (d6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            d6Var2 = d6Var4;
        }
        y1Var.C1(d6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X2(final x2 x2Var, final i6 bookVM, int i) {
        Intrinsics.checkNotNullParameter(bookVM, "bookVM");
        com.zentraedi.comic.business.a1 a1VarK3 = x2Var.k3();
        com.zentraedi.comic.databinding.y1 y1Var = x2Var.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        View root = y1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String str = (String) bookVM.l0().get();
        boolean z = i5.a.f((String) bookVM.u0().get()) == -1;
        boolean z2 = bookVM.y0() != null;
        String str2 = (String) bookVM.m0().get();
        ComicInfoModel comicInfoModelY0 = bookVM.y0();
        a1VarK3.I0(root, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : str2, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(z), (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0 ? true : z2, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : comicInfoModelY0 != null ? Boolean.valueOf(comicInfoModelY0.isOnShelf()) : null, (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(bookVM.o0().get() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.Y2(this.a, bookVM);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.a3(bookVM, x2Var);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.b3(this.a, bookVM);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.d3(bookVM);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.e3(bookVM, x2Var);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.h3(this.a, bookVM);
            }
        }, (1130496 & 262144) == 0 ? (String) bookVM.u0().get() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(bookVM.y0() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y2(final x2 x2Var, i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarL3 = x2Var.l3();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        String id2 = comicInfoModelY0 != null ? comicInfoModelY0.getId() : null;
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        boolean z = false;
        if (comicInfoModelY1 != null && !comicInfoModelY1.isOnShelf()) {
            z = true;
        }
        x1VarL3.F(id2, Boolean.valueOf(z), new Function1() { // from class: com.zentraedi.comic.fragment.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x2.Z2(this.a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z2(x2 x2Var, boolean z) {
        if (z) {
            x2Var.m3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a3(i6 i6Var, x2 x2Var) {
        ComicDirModel dir;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 != null && (dir = comicInfoModelY0.getDir()) != null) {
            x2Var.k3().B0(dir);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b3(x2 x2Var, final i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarL3 = x2Var.l3();
        com.zentraedi.comic.databinding.y1 y1Var = x2Var.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        View root = y1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        x1VarL3.u0(root, i6Var.y0(), new Function0() { // from class: com.zentraedi.comic.fragment.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x2.c3(i6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c3(i6 i6Var) {
        ObservableField<String> observableFieldL0 = i6Var.l0();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        observableFieldL0.set(comicInfoModelY0 != null ? comicInfoModelY0.getName() : null);
        ObservableField<String> observableFieldM0 = i6Var.m0();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        observableFieldM0.set(comicInfoModelY1 != null ? comicInfoModelY1.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d3(i6 i6Var) {
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
    public static final Unit e3(i6 i6Var, final x2 x2Var) {
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (i6Var.z0()) {
            if ((comicInfoModelY0 != null ? comicInfoModelY0.getDir() : null) == null) {
                x2Var.k3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.l2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x2.g3(this.a, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                ComicDirModel dir = comicInfoModelY0.getDir();
                if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                    Object obj = i6Var.u0().get();
                    ComicDirModel dir2 = comicInfoModelY0.getDir();
                    if (Intrinsics.areEqual(obj, dir2 != null ? dir2.getPath() : null)) {
                        x2Var.k3().a0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), comicInfoModelY0.getDir(), new Function1() { // from class: com.zentraedi.comic.fragment.k2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return x2.f3(this.a, ((Boolean) obj2).booleanValue());
                            }
                        });
                    } else {
                        x2Var.k3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.l2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return x2.g3(this.a, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    x2Var.k3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.l2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return x2.g3(this.a, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            x2Var.k3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.l2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x2.g3(this.a, ((Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f3(x2 x2Var, boolean z) {
        if (z) {
            x2Var.m3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g3(x2 x2Var, boolean z) {
        if (z) {
            x2Var.m3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h3(final x2 x2Var, i6 i6Var) {
        com.zentraedi.comic.business.a1 a1VarK3 = x2Var.k3();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarK3.Y(comicInfoModelY0 != null ? comicInfoModelY0.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.fragment.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x2.i3(this.a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i3(x2 x2Var, boolean z) {
        if (z) {
            x2Var.m3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(x2 x2Var, View view) {
        Activity activity = x2Var.getActivity();
        if (activity != null) {
            ComicSearchDetailActivity.a aVar = ComicSearchDetailActivity.Y;
            d6 d6Var = x2Var.o;
            if (d6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var = null;
            }
            aVar.a(activity, d6Var.L0());
        }
    }

    private final com.zentraedi.comic.business.a1 k3() {
        return (com.zentraedi.comic.business.a1) this.r.getValue();
    }

    private final com.zentraedi.comic.business.x1 l3() {
        return (com.zentraedi.comic.business.x1) this.q.getValue();
    }

    private final void m3(final boolean z) {
        d6 d6Var = null;
        if (z) {
            d6 d6Var2 = this.o;
            if (d6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                d6Var2 = null;
            }
            d6Var2.getShowLoadingView().set(true);
        }
        d6 d6Var3 = this.o;
        if (d6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            d6Var = d6Var3;
        }
        d6Var.Z0(z, new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.fragment.j2
            public final void continueDo() {
                x2.n3(z, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(boolean z, x2 x2Var) {
        if (!z) {
            SmartRefreshLayout smartRefreshLayout = x2Var.p;
            if (smartRefreshLayout != null) {
                smartRefreshLayout.finishLoadMore();
                return;
            }
            return;
        }
        d6 d6Var = x2Var.o;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        d6Var.getShowLoadingView().set(false);
        SmartRefreshLayout smartRefreshLayout2 = x2Var.p;
        if (smartRefreshLayout2 != null) {
            smartRefreshLayout2.finishRefresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 o3() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 p3() {
        return new com.zentraedi.comic.business.x1();
    }

    private final void q3() {
        int iA = com.zentraedi.business.utils.p0.K(getActivity()) ? m6.a.a() : 3;
        com.zentraedi.comic.databinding.y1 y1Var = this.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        RecyclerView recyclerView = y1Var.F;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), iA);
        gridLayoutManager.setSpanSizeLookup(new a(iA));
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(newConfig);
        q3();
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        org.greenrobot.eventbus.c.f().v(this);
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.Y5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        this.n = (com.zentraedi.comic.databinding.y1) c0VarJ;
        V2();
        com.zentraedi.comic.databinding.y1 y1Var = this.n;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            y1Var = null;
        }
        View root = y1Var.getRoot();
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
        m3(true);
    }

    public final void r3(@fo.l String str) {
        d6 d6Var = this.o;
        if (d6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            d6Var = null;
        }
        if (str == null) {
            str = "";
        }
        d6Var.z1(str);
        m3(true);
    }
}
