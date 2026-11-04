package com.zentraedi.comic.viewmodel;

import android.text.TextUtils;
import androidx.databinding.ObservableField;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicDirViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicDirViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicDirViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class l0 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.l
    private final String a;

    @fo.k
    private final ObservableField<Boolean> b;

    @fo.k
    private final ObservableField<Boolean> c;

    @fo.k
    private final ObservableField<Boolean> d;

    @fo.k
    private ObservableField<String> e;

    @fo.k
    private ObservableField<String> f;

    @fo.l
    private String g;

    @fo.l
    private String h;

    @fo.k
    private String i;

    @fo.k
    private ObservableField<String> j;

    @fo.l
    private ComicDirModel k;

    @fo.k
    private final ObservableField<Integer> l;

    @fo.k
    private ObservableField<String> m;
    private boolean n;

    @fo.k
    private ObservableField<String> o;

    /* JADX WARN: Multi-variable type inference failed */
    public l0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void L() {
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null) {
            comicDirModel.setComic((ComicInfoModel) null);
        }
    }

    public final void M(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (TextUtils.equals(path, this.g)) {
            p0(Q());
        }
    }

    @fo.k
    public final ObservableField<String> N() {
        return this.j;
    }

    @fo.l
    public final String O() {
        return this.a;
    }

    @fo.l
    public final ComicDirModel P() {
        return this.k;
    }

    @fo.l
    public final ComicInfoModel Q() {
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null) {
            return comicDirModel.getComic();
        }
        return null;
    }

    @fo.k
    public final ObservableField<String> R() {
        return this.f;
    }

    @fo.k
    public final String S() {
        return this.i;
    }

    @fo.k
    public final ObservableField<Integer> T() {
        return this.l;
    }

    @fo.k
    public final String U() {
        StringBuilder sb = new StringBuilder();
        ComicDirModel comicDirModel = this.k;
        sb.append(comicDirModel != null ? comicDirModel.getId() : null);
        sb.append(' ');
        ComicDirModel comicDirModel2 = this.k;
        sb.append(comicDirModel2 != null ? comicDirModel2.getPath() : null);
        return sb.toString();
    }

    @fo.k
    public final ObservableField<String> V() {
        return this.m;
    }

    @fo.k
    public final ObservableField<Boolean> W() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Boolean> X() {
        return this.c;
    }

    @fo.l
    public final String Y() {
        return this.h;
    }

    public final void Z(@fo.k ComicDirModel dir) {
        String strR;
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.k = dir;
        this.g = dir.getPath();
        if (this.n) {
            if (b0()) {
                String modifyTime = dir.getModifyTime();
                strR = modifyTime != null ? com.zentraedi.basic.function.utils.h.E(Long.valueOf(Long.parseLong(modifyTime) * ((long) 1000))) : null;
            } else {
                String size = dir.getSize();
                strR = com.zentraedi.business.utils.l5.R(size != null ? Long.parseLong(size) : 0L);
            }
            this.h = strR;
        } else {
            String strR2 = com.zentraedi.business.utils.d5.a.r(dir.getPath());
            if (StringsKt.startsWith$default(strR2, "/", false, 2, (Object) null)) {
                strR2 = strR2.substring(1);
                Intrinsics.checkNotNullExpressionValue(strR2, "substring(...)");
            }
            this.h = strR2;
            this.h = com.zentraedi.business.utils.l5.z(strR2);
            if (TextUtils.isEmpty(this.a) || Intrinsics.areEqual(this.a, "0")) {
                ObservableField<String> observableField = this.j;
                ComicCategory category = dir.getCategory();
                observableField.set(category != null ? category.getName() : null);
            }
        }
        q0(com.zentraedi.business.utils.l5.r(dir.getPath()));
        ObservableField<Boolean> observableField2 = this.d;
        ComicInfoModel comic = dir.getComic();
        observableField2.set(Boolean.valueOf(comic != null ? comic.isOnShelf() : false));
        ComicInfoModel comic2 = dir.getComic();
        o0(comic2 != null ? comic2.getCover() : null);
        p0(dir.getComic());
    }

    public final boolean b0() {
        ComicDirModel comicDirModel = this.k;
        return TextUtils.equals("1", comicDirModel != null ? comicDirModel.isDir() : null);
    }

    @fo.k
    public final ObservableField<Boolean> c0() {
        return this.d;
    }

    public final boolean d0() {
        return this.n;
    }

    public final boolean e0() {
        if (b0()) {
            return true;
        }
        Integer num = (Integer) this.l.get();
        return num != null && num.intValue() == 1;
    }

    public final void f0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.j = observableField;
    }

    public final void g0(@fo.l ComicDirModel comicDirModel) {
        this.k = comicDirModel;
    }

    @fo.k
    public final ObservableField<String> getClickItemPath() {
        return this.o;
    }

    @fo.l
    public final String getPath() {
        return this.g;
    }

    @fo.k
    public final ObservableField<String> getTitle() {
        return this.e;
    }

    public final void h0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.f = observableField;
    }

    public final void i0(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.i = str;
    }

    public final void j0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.m = observableField;
    }

    public final void k0(boolean z) {
        this.n = z;
    }

    public final void l0(@fo.l String str) {
        this.h = str;
    }

    public final void m0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.e = observableField;
    }

    public final void n0(@fo.k ComicInfoModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null) {
            comicDirModel.setComic(model);
        }
        q0(model.getName());
        this.d.set(Boolean.valueOf(model.isOnShelf()));
        o0(model.getCover());
    }

    public final void o0(@fo.l String str) {
        ComicInfoModel comic;
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null && (comic = comicDirModel.getComic()) != null) {
            comic.setCover(str);
        }
        this.f.set(str);
    }

    public final void p0(@fo.l ComicInfoModel comicInfoModel) {
        ComicInfoModel parentComic;
        if (b0() || com.zentraedi.business.utils.i5.a.n(this.g)) {
            if (comicInfoModel != null) {
                this.l.set(Integer.valueOf(!com.zentraedi.comic.util.f.a.i(comicInfoModel) ? 1 : 0));
                return;
            } else {
                this.l.set(1);
                return;
            }
        }
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel == null || (parentComic = comicDirModel.getParentComic()) == null) {
            this.l.set(1);
        } else {
            this.l.set(Integer.valueOf(!com.zentraedi.comic.util.f.a.i(parentComic) ? 1 : 0));
        }
    }

    public final void q0(@fo.l String str) {
        ComicInfoModel comic;
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null && (comic = comicDirModel.getComic()) != null) {
            comic.setName(str);
        }
        this.e.set(str);
    }

    public final void r0(int i) {
        ComicInfoModel comic;
        ComicInfoModel comic2;
        ComicDirModel comicDirModel = this.k;
        if (comicDirModel != null && (comic2 = comicDirModel.getComic()) != null) {
            comic2.setOnShelf(i);
        }
        ObservableField<Boolean> observableField = this.d;
        ComicDirModel comicDirModel2 = this.k;
        observableField.set((comicDirModel2 == null || (comic = comicDirModel2.getComic()) == null) ? null : Boolean.valueOf(comic.isOnShelf()));
    }

    public final void setClickItemPath(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.o = observableField;
    }

    public final void setPath(@fo.l String str) {
        this.g = str;
    }

    public l0(@fo.l String str) {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = str;
        Boolean bool = Boolean.FALSE;
        this.b = new ObservableField<>(bool);
        this.c = new ObservableField<>(bool);
        this.d = new ObservableField<>(bool);
        this.e = new ObservableField<>();
        this.f = new ObservableField<>();
        this.i = com.zentraedi.comic.constant.a.e.Af.b();
        this.j = new ObservableField<>();
        this.l = new ObservableField<>();
        this.m = new ObservableField<>("");
        this.o = new ObservableField<>();
    }

    public /* synthetic */ l0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
