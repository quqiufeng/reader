package com.zentraedi.comic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.event.CategoryViewModeChangeEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.viewmodel.i6;
import com.zentraedi.comic.viewmodel.p6;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nWrapComicListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapComicListFragment.kt\ncom/zentraedi/comic/fragment/WrapComicListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
public final class b4 extends com.zentraedi.business.fragment.a {

    @fo.k
    private static final String A = "cate_id";

    @fo.k
    private static final String B = "is_folder_mode";

    @fo.k
    private static final String C = "fromHouse";

    @fo.k
    public static final a z = new a(null);

    @fo.l
    private e2 n;

    @fo.l
    private Function0<Unit> o;

    @fo.l
    private Function1<? super List<com.zentraedi.comic.viewmodel.l0>, Unit> p;

    @fo.l
    private Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> q;

    @fo.l
    private u1 r;

    @fo.l
    private com.zentraedi.comic.databinding.c2 s;

    @fo.l
    private String u;
    private boolean v;

    @fo.l
    private Fragment w;

    @fo.k
    private final Lazy t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.n3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b4.p3();
        }
    });

    @fo.k
    private final Lazy x = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.o3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b4.o3();
        }
    });

    @fo.k
    private final Lazy y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.p3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b4.n3();
        }
    });

    @SourceDebugExtension({"SMAP\nWrapComicListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapComicListFragment.kt\ncom/zentraedi/comic/fragment/WrapComicListFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b4 b(a aVar, String str, boolean z, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.a(str, z, bool);
        }

        @fo.k
        public final b4 a(@fo.l String str, boolean z, @fo.l Boolean bool) {
            b4 b4Var = new b4();
            Bundle bundle = new Bundle();
            bundle.putString("cate_id", str);
            bundle.putBoolean(b4.B, z);
            if (bool != null) {
                bundle.putBoolean(b4.C, bool.booleanValue());
            }
            b4Var.setArguments(bundle);
            return b4Var;
        }

        private a() {
        }
    }

    public static final class b implements n4.f {
        final /* synthetic */ i6 b;

        b(i6 i6Var) {
            this.b = i6Var;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), bool2);
            }
            b4.this.q3(this.b);
        }
    }

    private final void B3(final i6 i6Var) {
        com.zentraedi.comic.databinding.c2 c2Var;
        final View root;
        if (this.n == null || (c2Var = this.s) == null || (root = c2Var.getRoot()) == null) {
            return;
        }
        d3().I0(root, (1130496 & 2) != 0 ? null : (String) i6Var.l0().get(), (1130496 & 4) != 0 ? null : (String) i6Var.m0().get(), (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(i5.a.f((String) i6Var.u0().get()) == -1), (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0 ? true : true, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : (Boolean) i6Var.q0().get(), (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(i6Var.o0().get() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.u3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.C3(this.a, i6Var);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.v3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.E3(i6Var, this);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.w3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.F3(this.a, root, i6Var);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.x3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.H3(i6Var);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.y3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.I3(i6Var, this);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.z3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.L3(this.a, i6Var);
            }
        }, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.fragment.a4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.M3(this.a, i6Var);
            }
        }, (1130496 & 262144) == 0 ? (String) i6Var.u0().get() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(i6Var.y0() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : Boolean.valueOf(true ^ com.zentraedi.business.n.a.S(d5.a.m((String) i6Var.u0().get()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C3(b4 b4Var, final i6 i6Var) {
        com.zentraedi.comic.business.x1 x1VarE3 = b4Var.e3();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        x1VarE3.F(comicInfoModelY0 != null ? comicInfoModelY0.getId() : null, Boolean.valueOf(Intrinsics.areEqual(i6Var.q0().get(), Boolean.FALSE)), new Function1() { // from class: com.zentraedi.comic.fragment.r3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.D3(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D3(i6 i6Var, boolean z2) {
        if (z2) {
            i6Var.q0().set(Boolean.valueOf(Intrinsics.areEqual(i6Var.q0().get(), Boolean.FALSE)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E3(i6 i6Var, b4 b4Var) {
        ComicDirModel dir;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (comicInfoModelY0 != null && (dir = comicInfoModelY0.getDir()) != null) {
            b4Var.d3().B0(dir);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F3(b4 b4Var, View view, final i6 i6Var) {
        b4Var.e3().u0(view, i6Var.y0(), new Function0() { // from class: com.zentraedi.comic.fragment.j3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b4.G3(i6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G3(i6 i6Var) {
        ObservableField<String> observableFieldL0 = i6Var.l0();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        observableFieldL0.set(comicInfoModelY0 != null ? comicInfoModelY0.getName() : null);
        ObservableField<String> observableFieldM0 = i6Var.m0();
        ComicInfoModel comicInfoModelY1 = i6Var.y0();
        observableFieldM0.set(comicInfoModelY1 != null ? comicInfoModelY1.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3(i6 i6Var) {
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
    public static final Unit I3(final i6 i6Var, b4 b4Var) {
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        if (i6Var.z0()) {
            if ((comicInfoModelY0 != null ? comicInfoModelY0.getDir() : null) == null) {
                b4Var.d3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.m3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b4.K3(i6Var, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                ComicDirModel dir = comicInfoModelY0.getDir();
                if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                    Object obj = i6Var.u0().get();
                    ComicDirModel dir2 = comicInfoModelY0.getDir();
                    if (Intrinsics.areEqual(obj, dir2 != null ? dir2.getPath() : null)) {
                        b4Var.d3().a0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), comicInfoModelY0.getDir(), new Function1() { // from class: com.zentraedi.comic.fragment.l3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return b4.J3(i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    } else {
                        b4Var.d3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.m3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return b4.K3(i6Var, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    b4Var.d3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.m3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return b4.K3(i6Var, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            b4Var.d3().b0(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.fragment.m3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b4.K3(i6Var, ((Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(i6 i6Var, boolean z2) {
        if (z2) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K3(i6 i6Var, boolean z2) {
        if (z2) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L3(b4 b4Var, i6 i6Var) {
        FragmentActivity activity = b4Var.getActivity();
        if (activity != null) {
            n4 n4VarA = n4.c.a();
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            int i = com.zentraedi.comic.q.C0124q.QJ;
            d5.a aVar = d5.a;
            String strP = com.zentraedi.basic.function.utils.a.p(i, aVar.n(aVar.m((String) i6Var.u0().get())));
            Intrinsics.checkNotNullExpressionValue(strP, "getString(...)");
            String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
            Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
            n4VarA.r3(activity, strN, strP, strN2, false, strN3, strN4, b4Var.new b(i6Var));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M3(final b4 b4Var, final i6 i6Var) {
        com.zentraedi.comic.business.a1 a1VarD3 = b4Var.d3();
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        a1VarD3.Y(comicInfoModelY0 != null ? comicInfoModelY0.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.fragment.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.N3(this.a, i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N3(b4 b4Var, i6 i6Var, boolean z2) {
        if (z2) {
            ObservableField<Integer> totalNum = b4Var.j3().getTotalNum();
            Integer num = (Integer) b4Var.j3().getTotalNum().get();
            totalNum.set(num != null ? Integer.valueOf(num.intValue() - 1) : null);
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    private final void T2(com.zentraedi.comic.impl.n nVar) {
        nVar.P(new Function1() { // from class: com.zentraedi.comic.fragment.s3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.U2(this.a, (com.zentraedi.business.addfile.n) obj);
            }
        });
        nVar.N(new Function1() { // from class: com.zentraedi.comic.fragment.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.V2(this.a, (i6) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U2(b4 b4Var, com.zentraedi.business.addfile.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e2 e2Var = b4Var.n;
        if (e2Var != null) {
            e2Var.s3(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(b4 b4Var, i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        b4Var.B3(it);
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.business.x1 e3() {
        return (com.zentraedi.comic.business.x1) this.x.getValue();
    }

    private final p6 j3() {
        return (p6) this.t.getValue();
    }

    private final void l3() {
        e2 e2Var = new e2();
        this.n = e2Var;
        e2Var.l3(true);
        e2 e2Var2 = this.n;
        if (e2Var2 != null) {
            e2Var2.E3(11);
        }
        com.zentraedi.comic.impl.n nVar = new com.zentraedi.comic.impl.n(11, this.u);
        T2(nVar);
        nVar.Z(j3().getTotalNum());
        nVar.X(this.q);
        e2 e2Var3 = this.n;
        if (e2Var3 != null) {
            e2Var3.F3(nVar);
        }
        e2 e2Var4 = this.n;
        if (e2Var4 != null) {
            e2Var4.A3(this.o);
        }
        e2 e2Var5 = this.n;
        if (e2Var5 != null) {
            e2Var5.x3(true);
        }
        u1 u1VarB = u1.a.b(u1.u, this.u, null, null, null, null, Boolean.TRUE, 30, null);
        u1VarB.a3(this.p);
        this.r = u1VarB;
        u1VarB.Z2(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 n3() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 o3() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6 p3() {
        return new p6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(i6 i6Var) {
        ComicDirModel dir;
        com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
        ComicInfoModel comicInfoModelY0 = i6Var.y0();
        com.zentraedi.comic.delegate.m.k(mVar, String.valueOf((comicInfoModelY0 == null || (dir = comicInfoModelY0.getDir()) == null) ? null : dir.getRootDirId()), d5.a.m((String) i6Var.u0().get()), null, new Function1() { // from class: com.zentraedi.comic.fragment.q3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.r3(this.a, (ComicInfoModel) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r3(b4 b4Var, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Kl2), true);
            org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(b4Var.u));
        }
        return Unit.INSTANCE;
    }

    public final void A3(boolean z2) {
        this.v = z2;
    }

    public final void O3() {
        Fragment fragment = this.v ? this.r : this.n;
        if (fragment == null || fragment == this.w) {
            return;
        }
        androidx.fragment.app.t0 t0VarW = getChildFragmentManager().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        if (fragment.isAdded()) {
            Fragment fragment2 = this.w;
            if (fragment2 == null) {
                t0VarW.U(fragment).q();
            } else {
                Intrinsics.checkNotNull(fragment2);
                t0VarW.y(fragment2).U(fragment).q();
            }
        } else {
            Fragment fragment3 = this.w;
            if (fragment3 == null) {
                t0VarW.f(com.zentraedi.comic.q.i.d8, fragment).q();
            } else {
                Intrinsics.checkNotNull(fragment3);
                t0VarW.y(fragment3).f(com.zentraedi.comic.q.i.d8, fragment).q();
            }
        }
        this.w = fragment;
    }

    public final void P3() {
        if (this.v) {
            u1 u1Var = this.r;
            if (u1Var != null) {
                u1Var.W2(false);
                return;
            }
            return;
        }
        e2 e2Var = this.n;
        if (e2Var != null) {
            e2Var.H3();
        }
    }

    public final void S2(boolean z2) {
        this.v = z2;
        O3();
    }

    public final void W2(@fo.k ObservableArrayList<com.zentraedi.comic.viewmodel.l0> selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        u1 u1Var = this.r;
        if (u1Var != null) {
            u1Var.H2(selectedItems);
        }
    }

    @fo.k
    public final List<String> X2() {
        List<String> listI2;
        ArrayList arrayList = new ArrayList();
        u1 u1Var = this.r;
        if (u1Var != null && (listI2 = u1Var.I2()) != null) {
            arrayList.addAll(listI2);
        }
        return arrayList;
    }

    public final int Y2() {
        List<String> listI2;
        if (!this.v) {
            e2 e2Var = this.n;
            if (e2Var != null) {
                return e2Var.a3();
            }
            return 0;
        }
        u1 u1Var = this.r;
        if (u1Var == null || (listI2 = u1Var.I2()) == null) {
            return 0;
        }
        return listI2.size();
    }

    @fo.l
    public final Function1<List<com.zentraedi.comic.viewmodel.l0>, Unit> Z2() {
        return this.p;
    }

    @fo.l
    public final Function0<Unit> a3() {
        return this.o;
    }

    @fo.l
    public final String b3() {
        return this.u;
    }

    @fo.l
    public final u1 c3() {
        return this.r;
    }

    @fo.k
    public final com.zentraedi.comic.business.a1 d3() {
        return (com.zentraedi.comic.business.a1) this.y.getValue();
    }

    @fo.l
    public final Function2<List<com.zentraedi.business.addfile.n>, List<com.zentraedi.business.addfile.n>, Unit> f3() {
        return this.q;
    }

    @fo.l
    public final e2 g3() {
        return this.n;
    }

    @fo.l
    public final Fragment h3() {
        return this.w;
    }

    public final boolean i3() {
        return this.v;
    }

    public final int k3() {
        if (this.v) {
            u1 u1Var = this.r;
            if (u1Var != null) {
                return u1Var.O2();
            }
            return 0;
        }
        Integer num = (Integer) j3().getTotalNum().get();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean m3() {
        if (this.v) {
            u1 u1Var = this.r;
            if (u1Var != null) {
                return u1Var.T2();
            }
            return false;
        }
        e2 e2Var = this.n;
        if (e2Var != null) {
            return e2Var.k3();
        }
        return false;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k CategoryViewModeChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(this.u, event.getCid())) {
            this.v = event.isFolderViewMode();
            O3();
        }
    }

    public void onCreate(@fo.l Bundle bundle) {
        super.onCreate(bundle);
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.zentraedi.comic.databinding.c2 c2Var = (com.zentraedi.comic.databinding.c2) androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.l7, viewGroup, false);
        this.s = c2Var;
        if (c2Var != null) {
            c2Var.C1(j3());
        }
        com.zentraedi.comic.databinding.c2 c2Var2 = this.s;
        if (c2Var2 != null) {
            return c2Var2.getRoot();
        }
        return null;
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        org.greenrobot.eventbus.c.f().v(this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("cate_id")) == null) {
            string = "0";
        }
        this.u = string;
        Object objD = t7.d(com.zentraedi.business.utils.k0.d0(com.zentraedi.comic.constant.a.d, string), Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        this.v = ((Boolean) objD).booleanValue();
        l3();
        O3();
    }

    public final void s3() {
        if (this.v) {
            u1 u1Var = this.r;
            if (u1Var != null) {
                u1Var.W2(true);
                return;
            }
            return;
        }
        e2 e2Var = this.n;
        if (e2Var != null) {
            e2Var.u3();
        }
    }

    public final void t3(@fo.l Function1<? super List<com.zentraedi.comic.viewmodel.l0>, Unit> function1) {
        this.p = function1;
    }

    public final void u3(@fo.l Function0<Unit> function0) {
        this.o = function0;
    }

    public final void v3(@fo.l String str) {
        this.u = str;
    }

    public final void w3(@fo.l u1 u1Var) {
        this.r = u1Var;
    }

    public final void x3(@fo.l Function2<? super List<com.zentraedi.business.addfile.n>, ? super List<com.zentraedi.business.addfile.n>, Unit> function2) {
        this.q = function2;
    }

    public final void y3(@fo.l e2 e2Var) {
        this.n = e2Var;
    }

    public final void z3(@fo.l Fragment fragment) {
        this.w = fragment;
    }
}
