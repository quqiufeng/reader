package com.zentraedi.comic.viewmodel;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.comic.model.ComicCodeBook;
import com.zentraedi.comic.request.ComicAddCodeBookRequest;
import com.zentraedi.comic.request.ComicDeleteCodeBookRequest;
import com.zentraedi.comic.request.ComicEditorCodeBookRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCreateCodeBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCreateCodeBookViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCreateCodeBookViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
public final class k0 extends com.zentraedi.basic.function.viewmodel.e {

    @fo.k
    public static final a i = new a(null);
    public static final int j = 1;
    public static final int k = 2;

    @fo.l
    private Function0<Unit> d;

    @fo.l
    private Function0<Unit> e;

    @fo.l
    private Function0<Unit> f;

    @fo.l
    private ComicCodeBook h;

    @fo.k
    private final ObservableField<String> a = new ObservableField<>("");

    @fo.k
    private final ObservableField<String> b = new ObservableField<>("");

    @fo.k
    private ObservableInt c = new ObservableInt(0);

    @fo.k
    private ComicCodeBookOperate g = ComicCodeBookOperate.CREATE;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComicCodeBookOperate.values().length];
            try {
                iArr[ComicCodeBookOperate.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComicCodeBookOperate.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComicCodeBookOperate.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends com.zentraedi.business.http.b<Object> {
        c() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            Function0<Unit> function0U = k0.this.U();
            if (function0U != null) {
                function0U.invoke();
            }
            Function0<Unit> function0V = k0.this.V();
            if (function0V != null) {
                function0V.invoke();
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ul2));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class d extends com.zentraedi.business.http.b<Object> {
        d() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            Function0<Unit> function0U = k0.this.U();
            if (function0U != null) {
                function0U.invoke();
            }
            Function0<Unit> function0V = k0.this.V();
            if (function0V != null) {
                function0V.invoke();
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class e extends com.zentraedi.business.http.b<Object> {
        e() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            Function0<Unit> function0U = k0.this.U();
            if (function0U != null) {
                function0U.invoke();
            }
            Function0<Unit> function0V = k0.this.V();
            if (function0V != null) {
                function0V.invoke();
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class f extends com.zentraedi.business.http.b<Object> {
        f() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            Function0<Unit> function0U = k0.this.U();
            if (function0U != null) {
                function0U.invoke();
            }
            Function0<Unit> function0V = k0.this.V();
            if (function0V != null) {
                function0V.invoke();
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vl2));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    private final void M() {
        com.zentraedi.business.http.a aVarB = com.zentraedi.business.http.a.b();
        String str = (String) this.b.get();
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.a.get();
        aVarB.h(new ComicAddCodeBookRequest(str, str2 != null ? str2 : "", null, 4, null), new c());
    }

    private final void P(ComicCodeBook comicCodeBook) {
        com.zentraedi.business.http.a.b().h(new ComicDeleteCodeBookRequest(comicCodeBook.getId()), new d());
    }

    private final void R(ComicCodeBook comicCodeBook) {
        com.zentraedi.business.http.a aVarB = com.zentraedi.business.http.a.b();
        String id2 = comicCodeBook.getId();
        String str = (String) this.b.get();
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.a.get();
        aVarB.h(new ComicEditorCodeBookRequest(id2, str, str2 != null ? str2 : ""), new f());
    }

    public final void L() {
        this.a.set("");
    }

    public final void N() {
        Function0<Unit> function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void O() {
        int i2 = b.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i2 == 1) {
            M();
            return;
        }
        if (i2 == 2) {
            ComicCodeBook comicCodeBook = this.h;
            if (comicCodeBook != null) {
                R(comicCodeBook);
                return;
            }
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ComicCodeBook comicCodeBook2 = this.h;
        if (comicCodeBook2 != null) {
            P(comicCodeBook2);
        }
    }

    public final void Q(@fo.k String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        com.zentraedi.business.http.a.b().h(new ComicDeleteCodeBookRequest(ids), new e());
    }

    @fo.l
    public final ComicCodeBook S() {
        return this.h;
    }

    @fo.l
    public final Function0<Unit> T() {
        return this.e;
    }

    @fo.l
    public final Function0<Unit> U() {
        return this.d;
    }

    @fo.l
    public final Function0<Unit> V() {
        return this.f;
    }

    @fo.k
    public final ObservableField<String> W() {
        return this.b;
    }

    @fo.k
    public final ComicCodeBookOperate X() {
        return this.g;
    }

    public final void Y() {
        Function0<Unit> function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void Z(@fo.l ComicCodeBook comicCodeBook) {
        this.h = comicCodeBook;
    }

    public final void b0(@fo.l Function0<Unit> function0) {
        this.e = function0;
    }

    public final void c0(@fo.l Function0<Unit> function0) {
        this.d = function0;
    }

    public final void d0(@fo.l Function0<Unit> function0) {
        this.f = function0;
    }

    public final void e0(@fo.k ComicCodeBookOperate comicCodeBookOperate) {
        Intrinsics.checkNotNullParameter(comicCodeBookOperate, "<set-?>");
        this.g = comicCodeBookOperate;
    }

    public final void editTextActionChanged(int i2) {
        this.c.set(i2);
    }

    @fo.k
    public final ObservableInt getMEditTextActionChange() {
        return this.c;
    }

    @fo.k
    public final ObservableField<String> getPassword() {
        return this.a;
    }

    public final void setMEditTextActionChange(@fo.k ObservableInt observableInt) {
        Intrinsics.checkNotNullParameter(observableInt, "<set-?>");
        this.c = observableInt;
    }
}
