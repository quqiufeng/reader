package com.zentraedi.comic.viewmodel;

import android.content.Context;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.model.ComicCodeBook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCodeBookItemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCodeBookItemViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCodeBookItemViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class b0 {

    @fo.l
    private ComicCodeBook a;

    @fo.k
    private ObservableField<Boolean> b;

    @fo.k
    private ObservableField<Boolean> c;

    @fo.k
    private ObservableField<String> d;

    @fo.k
    private ObservableField<String> e;

    @fo.l
    private Function2<? super Context, ? super ComicCodeBook, Unit> f;

    @fo.l
    private Function1<? super ComicCodeBook, Unit> g;

    public b0() {
        Boolean bool = Boolean.FALSE;
        this.b = new ObservableField<>(bool);
        this.c = new ObservableField<>(bool);
        this.d = new ObservableField<>("");
        this.e = new ObservableField<>("");
    }

    public final void a(@fo.k ComicCodeBook comicCodeBook) {
        Intrinsics.checkNotNullParameter(comicCodeBook, "comicCodeBook");
        this.a = comicCodeBook;
        this.d.set(comicCodeBook != null ? comicCodeBook.getTitle() : null);
        ObservableField<String> observableField = this.e;
        ComicCodeBook comicCodeBook2 = this.a;
        observableField.set(comicCodeBook2 != null ? comicCodeBook2.getSecret() : null);
    }

    public final void b() {
        Function1<? super ComicCodeBook, Unit> function1;
        ObservableField<Boolean> observableField = this.b;
        Boolean bool = (Boolean) observableField.get();
        observableField.set(Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)));
        ComicCodeBook comicCodeBook = this.a;
        if (comicCodeBook == null || (function1 = this.g) == null) {
            return;
        }
        function1.invoke(comicCodeBook);
    }

    public final void c(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Function2<? super Context, ? super ComicCodeBook, Unit> function2 = this.f;
        if (function2 != null) {
            function2.invoke(context, this.a);
        }
    }

    @fo.l
    public final Function2<Context, ComicCodeBook, Unit> d() {
        return this.f;
    }

    @fo.l
    public final Function1<ComicCodeBook, Unit> e() {
        return this.g;
    }

    @fo.l
    public final ComicCodeBook f() {
        return this.a;
    }

    @fo.k
    public final ObservableField<String> g() {
        return this.e;
    }

    @fo.k
    public final ObservableField<Boolean> h() {
        return this.c;
    }

    @fo.k
    public final ObservableField<Boolean> i() {
        return this.b;
    }

    @fo.k
    public final ObservableField<String> j() {
        return this.d;
    }

    public final void k(boolean z) {
        this.c.set(Boolean.valueOf(z));
    }

    public final void l(@fo.l Function2<? super Context, ? super ComicCodeBook, Unit> function2) {
        this.f = function2;
    }

    public final void m(@fo.l Function1<? super ComicCodeBook, Unit> function1) {
        this.g = function1;
    }

    public final void n(@fo.l ComicCodeBook comicCodeBook) {
        this.a = comicCodeBook;
    }

    public final void o(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.e = observableField;
    }

    public final void p(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.c = observableField;
    }

    public final void q(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.b = observableField;
    }

    public final void r(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.d = observableField;
    }
}
