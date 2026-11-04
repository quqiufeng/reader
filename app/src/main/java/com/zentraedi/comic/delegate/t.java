package com.zentraedi.comic.delegate;

import android.app.Activity;
import com.artifex.mupdf.fitz.Document;
import com.zentraedi.business.model.FileInfoModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class t {

    @fo.l
    private static com.zentraedi.reader.pdf.h b;

    @fo.k
    public static final t a = new t();

    @fo.k
    private static String c = "";

    @SourceDebugExtension({"SMAP\nPDFComicDataDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFComicDataDelegate.kt\ncom/zentraedi/comic/delegate/PDFComicDataDelegate$openDocument$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    public static final class a extends com.zentraedi.reader.pdf.h.b {
        final /* synthetic */ Ref.ObjectRef<Document> a;
        final /* synthetic */ String b;
        final /* synthetic */ Function1<Document, Unit> c;

        a(Ref.ObjectRef<Document> objectRef, String str, Function1<? super Document, Unit> function1) {
            this.a = objectRef;
            this.b = str;
            this.c = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zentraedi.reader.pdf.h.b
        public void a() {
            T tOpenDocument;
            Ref.ObjectRef<Document> objectRef = this.a;
            try {
                tOpenDocument = Document.openDocument(this.b);
            } catch (Exception unused) {
                tOpenDocument = Document.openDocument(this.b);
            }
            objectRef.element = tOpenDocument;
        }

        @Override // com.zentraedi.reader.pdf.h.b, java.lang.Runnable
        public void run() {
            t.a.q(this.b);
            Document document = this.a.element;
            if (document != null) {
                this.c.invoke(document);
            }
        }
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(FileInfoModel fileInfoModel, Function0 function0, t ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        fileInfoModel.setLocalPath(com.zentraedi.comic.m.s(fileInfoModel));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final Function0 function0, final FileInfoModel fileInfoModel, final Function0 function1, final Function1 function2, int i) {
        if (i == 0) {
            pe.i.q(a, new Function1() { // from class: com.zentraedi.comic.delegate.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.j(function0, (t) obj);
                }
            });
            return;
        }
        if (i == 1) {
            pe.i.q(a, new Function1() { // from class: com.zentraedi.comic.delegate.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.l(fileInfoModel, function2, (t) obj);
                }
            });
        } else if (i == 2) {
            pe.i.q(a, new Function1() { // from class: com.zentraedi.comic.delegate.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.k(fileInfoModel, function1, (t) obj);
                }
            });
        } else {
            if (i != 3) {
                return;
            }
            pe.i.q(a, new Function1() { // from class: com.zentraedi.comic.delegate.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.m(function0, (t) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0, t ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        function0.invoke();
        com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ky1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(FileInfoModel fileInfoModel, Function0 function0, t ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        fileInfoModel.setLocalPath(com.zentraedi.comic.m.s(fileInfoModel));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(FileInfoModel fileInfoModel, Function1 function1, t ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        fileInfoModel.setLocalPath(com.zentraedi.comic.m.s(fileInfoModel));
        function1.invoke(fileInfoModel.getLocalPath());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function0 function0, t ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        function0.invoke();
        com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ky1));
        return Unit.INSTANCE;
    }

    public final void g(@fo.k final FileInfoModel fileInfoModel, @fo.k Activity context, @fo.k final Function0<Unit> success, @fo.k final Function0<Unit> failed, @fo.k final Function1<? super String, Unit> startProcess) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failed, "failed");
        Intrinsics.checkNotNullParameter(startProcess, "startProcess");
        String strS = com.zentraedi.comic.m.s(fileInfoModel);
        if (strS == null) {
            strS = "";
        }
        if (new File(strS).exists()) {
            pe.i.q(this, new Function1() { // from class: com.zentraedi.comic.delegate.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.h(fileInfoModel, success, (t) obj);
                }
            });
        } else {
            com.zentraedi.business.reader.d.d(fileInfoModel, strS, new gd.a() { // from class: com.zentraedi.comic.delegate.o
                @Override // gd.a
                public final void complete(int i) {
                    t.i(failed, fileInfoModel, success, startProcess, i);
                }
            });
        }
    }

    @fo.k
    public final String n() {
        return c;
    }

    @fo.l
    public final com.zentraedi.reader.pdf.h o() {
        return b;
    }

    public final void p(@fo.k String localPath, @fo.k Activity activity, @fo.k Function1<? super Document, Unit> callback) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (b == null) {
            com.zentraedi.reader.pdf.h hVar = new com.zentraedi.reader.pdf.h(activity);
            b = hVar;
            Intrinsics.checkNotNull(hVar);
            hVar.b();
        }
        com.zentraedi.reader.pdf.h hVar2 = b;
        if (hVar2 != null) {
            hVar2.a(new a(objectRef, localPath, callback));
        }
    }

    public final void q(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c = str;
    }

    public final void r(@fo.l com.zentraedi.reader.pdf.h hVar) {
        b = hVar;
    }

    public final void s() {
        com.zentraedi.reader.pdf.h hVar = b;
        if (hVar != null) {
            hVar.c();
        }
        b = null;
    }
}
