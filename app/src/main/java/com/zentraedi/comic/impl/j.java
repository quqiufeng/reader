package com.zentraedi.comic.impl;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.ObservableField;
import com.google.gson.Gson;
import com.zentraedi.basic.function.utils.u0;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.n4;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.fragment.e2;
import com.zentraedi.comic.viewmodel.i6;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class j implements e2.a {
    private final int a;
    private int c;

    @fo.l
    private WeakReference<com.zentraedi.basic.function.viewmodel.a> i;

    @fo.k
    private final ArrayList<FileInfoModel> b = new ArrayList<>();

    @fo.k
    private Function1<? super com.zentraedi.business.addfile.n, Unit> d = new Function1() { // from class: com.zentraedi.comic.impl.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j.J((com.zentraedi.business.addfile.n) obj);
        }
    };

    @fo.k
    private Function0<Unit> e = new Function0() { // from class: com.zentraedi.comic.impl.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.L();
        }
    };

    @fo.k
    private Function1<? super i6, Unit> f = new Function1() { // from class: com.zentraedi.comic.impl.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j.I((i6) obj);
        }
    };

    @fo.k
    private Function1<? super i6, Unit> g = new Function1() { // from class: com.zentraedi.comic.impl.h
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j.H((i6) obj);
        }
    };

    @fo.k
    private Function1<? super i6, Unit> h = new Function1() { // from class: com.zentraedi.comic.impl.i
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j.K((i6) obj);
        }
    };

    @fo.k
    private final ObservableField<String> j = new ObservableField<>();

    public static final class a implements n4.j {
        a() {
        }

        public void confirmClick() {
        }
    }

    public j(int i) {
        this.a = i;
    }

    private final String F(NasReadingRecordModule nasReadingRecordModule) {
        int position = (int) ((nasReadingRecordModule.getPosition() / nasReadingRecordModule.getCount()) * 100);
        StringBuilder sb = new StringBuilder();
        sb.append(position);
        sb.append('%');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(com.zentraedi.business.addfile.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(i6 i6Var, j jVar, ComicInfoModel comicInfoModel, View view) {
        if (((com.zentraedi.business.addfile.n) i6Var).x.get()) {
            jVar.d.invoke(i6Var);
            return;
        }
        jVar.j.set(i6Var.t0());
        if (jVar.a != 9) {
            com.zentraedi.comic.delegate.m.a.u(i6Var);
            return;
        }
        int iF = i5.a.f(comicInfoModel.getPath());
        comicInfoModel.setOfflineData(true);
        comicInfoModel.createNewProgress(comicInfoModel.getPath());
        jVar.n(iF, comicInfoModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(i6 i6Var, j jVar, View view) {
        if (((com.zentraedi.business.addfile.n) i6Var).x.get()) {
            jVar.d.invoke(i6Var);
        } else {
            jVar.g.invoke(i6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(j jVar, i6 i6Var, View view) {
        jVar.h.invoke(i6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(j jVar, View view) {
        jVar.e.invoke();
        return true;
    }

    private final String u(String str) {
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.removeSuffix(d5.a.r(str), "/"), "/");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(strRemovePrefix, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return StringsKt.removePrefix(strRemovePrefix, "/");
        }
        String strSubstring = strRemovePrefix.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int iLastIndexOf$default2 = StringsKt.lastIndexOf$default(strSubstring, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default2 == -1) {
            return StringsKt.removePrefix(strSubstring, "/");
        }
        String strSubstring2 = strSubstring.substring(0, iLastIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    private final String v(String str) {
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.removeSuffix(d5.a.r(str), "/"), "/");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(strRemovePrefix, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return StringsKt.removePrefix(strRemovePrefix, "/");
        }
        String strSubstring = strRemovePrefix.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int iLastIndexOf$default2 = StringsKt.lastIndexOf$default(strSubstring, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default2 == -1) {
            return StringsKt.removePrefix(strSubstring, "/");
        }
        String strSubstring2 = strSubstring.substring(0, iLastIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    @fo.k
    public final Function1<i6, Unit> A() {
        return this.f;
    }

    @fo.k
    public final Function1<com.zentraedi.business.addfile.n, Unit> B() {
        return this.d;
    }

    @fo.k
    public final Function1<i6, Unit> C() {
        return this.h;
    }

    @fo.k
    public final Function0<Unit> D() {
        return this.e;
    }

    @fo.l
    public final WeakReference<com.zentraedi.basic.function.viewmodel.a> E() {
        return this.i;
    }

    public void G(int i, @fo.k ComicInfoModel comic) {
        String id2;
        ComicCategory category;
        Intrinsics.checkNotNullParameter(comic, "comic");
        ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        ComicDirModel dir = comic.getDir();
        if (dir == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
            id2 = "0";
        }
        String str = id2;
        ComicDirModel dir2 = comic.getDir();
        String id3 = dir2 != null ? dir2.getId() : null;
        ComicDirModel dir3 = comic.getDir();
        ComicSubDirActivity.a.b(aVar, activityE, str, id3, dir3 != null ? dir3.getPath() : null, comic.getPath(), null, comic, 32, null);
    }

    protected void M(int i) {
        this.c = i;
    }

    public final void N(@fo.k Function1<? super i6, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.g = function1;
    }

    public final void O(@fo.k Function1<? super i6, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f = function1;
    }

    public final void P(@fo.k Function1<? super com.zentraedi.business.addfile.n, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.d = function1;
    }

    public final void Q(@fo.k Function1<? super i6, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.h = function1;
    }

    public final void R(@fo.k Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.e = function0;
    }

    public final void S(@fo.l WeakReference<com.zentraedi.basic.function.viewmodel.a> weakReference) {
        this.i = weakReference;
    }

    @Override // com.zentraedi.comic.fragment.e2.a
    public void a(@fo.l WeakReference<e2> weakReference) {
        com.zentraedi.basic.function.viewmodel.a aVar;
        e2 e2Var;
        WeakReference<com.zentraedi.basic.function.viewmodel.a> weakReference2 = this.i;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null || weakReference == null || (e2Var = weakReference.get()) == null) {
            return;
        }
        int size = e2Var.f3().d().size();
        int size2 = e2Var.f3().b().size();
        M(size2);
        if (size != size2) {
            ObservableField<String> observableField = aVar.rightEditTextObserver;
            if (observableField != null) {
                observableField.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
            }
        } else {
            ObservableField<String> observableField2 = aVar.rightEditTextObserver;
            if (observableField2 != null) {
                observableField2.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
            }
        }
        if (size == 0) {
            ObservableField<String> observableField3 = aVar.editNavObserver;
            if (observableField3 != null) {
                observableField3.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Lt2));
                return;
            }
            return;
        }
        ObservableField<String> observableField4 = aVar.editNavObserver;
        if (observableField4 != null) {
            observableField4.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.ex1, Integer.valueOf(size)));
        }
    }

    @Override // com.zentraedi.comic.fragment.e2.a
    @fo.l
    public List<com.zentraedi.business.addfile.n> b(@fo.l List<? extends com.zentraedi.business.addfile.n> list, @fo.l String str) {
        if (list == null) {
            return null;
        }
        if (Intrinsics.areEqual(str, com.zentraedi.comic.constant.a.e.Af.b())) {
            Iterator<? extends com.zentraedi.business.addfile.n> it = list.iterator();
            while (it.hasNext()) {
                it.next().viewType = com.zentraedi.comic.constant.a.b.f9if.e();
            }
        } else {
            Iterator<? extends com.zentraedi.business.addfile.n> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().viewType = com.zentraedi.comic.constant.a.b.f9if.d();
            }
        }
        return list;
    }

    public final void m() {
        this.j.set((Object) null);
    }

    public final void n(int i, @fo.k ComicInfoModel comic) {
        Intrinsics.checkNotNullParameter(comic, "comic");
        if (i != 3 && i != 8) {
            if (i == 10) {
                n4 n4VarA = n4.c.a();
                Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
                Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
                String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
                Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
                String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tM);
                Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
                String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.cz);
                Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
                n4VarA.h2(activityE, strN, strN2, strN3, new a());
                return;
            }
            if (i != 26 && i != 33 && i != 57) {
                G(i, comic);
                return;
            }
        }
        ComicReaderActivity.a aVar = ComicReaderActivity.x5;
        Activity activityE2 = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE2, "getCurActivity(...)");
        aVar.a(activityE2, comic);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.zentraedi.basic.function.viewmodel.f, com.zentraedi.business.addfile.n, com.zentraedi.comic.viewmodel.i6] */
    @fo.k
    protected final i6 o(@fo.k final ComicInfoModel comic) {
        String name;
        ComicCategory category;
        Intrinsics.checkNotNullParameter(comic, "comic");
        final ?? i6Var = new i6();
        i6Var.viewType = com.zentraedi.comic.constant.a.b.f9if.d();
        if (this.a != 11) {
            ObservableField<String> observableFieldH0 = i6Var.h0();
            ComicDirModel dir = comic.getDir();
            if (dir == null || (category = dir.getCategory()) == null || (name = category.getName()) == null) {
                name = "";
            }
            observableFieldH0.set(name);
        }
        i6Var.G0(Integer.valueOf(this.a));
        if (this.a != 6 || TextUtils.isEmpty(comic.getProgress())) {
            i6Var.m0().set(comic.getCover());
            i6Var.l0().set(comic.getName());
            i6Var.u0().set(comic.getPath());
            int i = this.a;
            if (i == 9) {
                File file = new File(comic.getPath());
                if (file.isDirectory()) {
                    i6Var.x0().set(u0.o(file.lastModified()));
                } else {
                    i6Var.x0().set(l5.R(file.length()));
                }
            } else if (i != 4) {
                ObservableField<String> observableFieldX0 = i6Var.x0();
                d5.a aVar = d5.a;
                observableFieldX0.set(aVar.r(aVar.m(comic.getPath())));
            }
        } else {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comic.getProgress(), NasReadingRecordModule.class);
            if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
                i5 i5Var = i5.a;
                int iF = i5Var.f(comic.getPath());
                if (iF != 10) {
                    iF = i5Var.f(comic.getPath());
                }
                if (iF == 3) {
                    i6Var.l0().set(com.zentraedi.comic.m.x(comic.getPath()));
                } else {
                    i6Var.l0().set(com.zentraedi.comic.m.x(d5.a.m(comic.getPath())));
                }
                i6Var.x0().set(v(comic.getPath()));
                i6Var.m0().set(comic.getCover());
                i6Var.u0().set(comic.getPath());
                if (3 != i5Var.f(comic.getPath())) {
                    ObservableField<String> observableFieldV0 = i6Var.v0();
                    int i2 = com.zentraedi.comic.q.C0124q.xM;
                    Intrinsics.checkNotNull(nasReadingRecordModule);
                    observableFieldV0.set(com.zentraedi.basic.function.utils.a.p(i2, F(nasReadingRecordModule)));
                }
            } else {
                i5 i5Var2 = i5.a;
                int iF2 = i5Var2.f(comic.getPath());
                int iF3 = iF2 == 10 ? iF2 : i5Var2.f(nasReadingRecordModule.getFilePath());
                if (iF3 == 3 || iF2 == -1) {
                    i6Var.l0().set(com.zentraedi.comic.m.x(comic.getPath()));
                } else {
                    i6Var.l0().set(com.zentraedi.comic.m.x(d5.a.m(comic.getPath())));
                }
                if (iF3 != 10) {
                    comic.setPath(nasReadingRecordModule.getFilePath());
                }
                i6Var.x0().set(v(comic.getPath()));
                i6Var.m0().set(comic.getCover());
                i6Var.u0().set(comic.getPath());
                i6Var.v0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                if (3 != i5Var2.f(nasReadingRecordModule.getFilePath())) {
                    ObservableField<String> progress = i6Var.getProgress();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" I ");
                    Intrinsics.checkNotNull(nasReadingRecordModule);
                    sb.append(F(nasReadingRecordModule));
                    progress.set(sb.toString());
                    i6Var.i0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()) + " I " + F(nasReadingRecordModule));
                } else {
                    i6Var.i0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                }
            }
        }
        i6Var.setClickItemPath(this.j);
        int i3 = this.a;
        if (i3 == 6 || i3 == 11) {
            i6Var.q0().set(Boolean.valueOf(comic.isOnShelf()));
        }
        i6Var.o0().set(!com.zentraedi.comic.util.f.a.i(comic) ? 1 : 0);
        i6Var.s0().set(Boolean.valueOf(this.a == 6));
        i6Var.r0().set(Boolean.valueOf(this.a != 6));
        i6Var.L0(comic);
        i6Var.C0(new View.OnClickListener() { // from class: com.zentraedi.comic.impl.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.p(i6Var, this, comic, view);
            }
        });
        i6Var.D0(new View.OnClickListener() { // from class: com.zentraedi.comic.impl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.q(i6Var, this, view);
            }
        });
        i6Var.E0(new View.OnClickListener() { // from class: com.zentraedi.comic.impl.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.r(this.a, i6Var, view);
            }
        });
        i6Var.setLongListener(new View.OnLongClickListener() { // from class: com.zentraedi.comic.impl.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return j.s(this.a, view);
            }
        });
        return i6Var;
    }

    @fo.k
    public final ObservableField<String> t() {
        return this.j;
    }

    @fo.k
    protected ArrayList<FileInfoModel> w() {
        return this.b;
    }

    public final int x() {
        return this.a;
    }

    protected int y() {
        return this.c;
    }

    @fo.k
    public final Function1<i6, Unit> z() {
        return this.g;
    }
}
