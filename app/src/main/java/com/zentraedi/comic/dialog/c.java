package com.zentraedi.comic.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.m2;
import androidx.lifecycle.r2;
import com.zentraedi.business.view.BaseEditText;
import com.zentraedi.comic.databinding.w0;
import com.zentraedi.comic.model.ComicCodeBook;
import com.zentraedi.comic.viewmodel.ComicCodeBookOperate;
import com.zentraedi.comic.viewmodel.k0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicACodeBookOperateDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicACodeBookOperateDialog.kt\ncom/zentraedi/comic/dialog/ComicACodeBookOperateDialog\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,126:1\n13#2:127\n*S KotlinDebug\n*F\n+ 1 ComicACodeBookOperateDialog.kt\ncom/zentraedi/comic/dialog/ComicACodeBookOperateDialog\n*L\n26#1:127\n*E\n"})
public final class c {

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b a;

    @fo.l
    private w0 b;

    @fo.k
    private final Lazy c;

    public static final class a extends androidx.databinding.u.a {
        a() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            BaseEditText baseEditText;
            BaseEditText baseEditText2;
            w0 w0Var;
            BaseEditText baseEditText3;
            int i2 = c.this.f().getMEditTextActionChange().get();
            if (i2 == 1) {
                w0 w0Var2 = c.this.b;
                if (w0Var2 != null && (baseEditText = w0Var2.I) != null) {
                    baseEditText.setInputType(145);
                }
            } else if (i2 == 2 && (w0Var = c.this.b) != null && (baseEditText3 = w0Var.I) != null) {
                baseEditText3.setInputType(129);
            }
            w0 w0Var3 = c.this.b;
            if (w0Var3 == null || (baseEditText2 = w0Var3.I) == null) {
                return;
            }
            String str = (String) c.this.f().getPassword().get();
            baseEditText2.setSelection(str != null ? str.length() : 0);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class b implements Function0<k0> {
        final /* synthetic */ r2 a;

        public b(r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.k0] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return new m2(this.a).c(k0.class);
        }
    }

    public c() {
        AppCompatActivity appCompatActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(appCompatActivityE, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.c = LazyKt.lazy(new b(appCompatActivityE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 f() {
        return (k0) this.c.getValue();
    }

    private final void g() {
        BaseEditText baseEditText;
        f().b0(new Function0() { // from class: com.zentraedi.comic.dialog.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.h(this.a);
            }
        });
        f().c0(new Function0() { // from class: com.zentraedi.comic.dialog.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.i(this.a);
            }
        });
        w0 w0Var = this.b;
        if (w0Var != null && (baseEditText = w0Var.I) != null) {
            baseEditText.setInputType(129);
        }
        f().getMEditTextActionChange().addOnPropertyChangedCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(c cVar) {
        com.zentraedi.basic.function.ui.dialog.b bVar = cVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
        cVar.b = null;
        cVar.a = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(c cVar) {
        com.zentraedi.basic.function.ui.dialog.b bVar = cVar.a;
        if (bVar != null) {
            bVar.dismiss();
        }
        cVar.b = null;
        cVar.a = null;
        return Unit.INSTANCE;
    }

    public final void e() {
        if (this.b == null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            w0 w0Var = (w0) androidx.databinding.m.j(LayoutInflater.from(activityE), com.zentraedi.comic.q.l.z3, (ViewGroup) null, false);
            this.b = w0Var;
            if (w0Var != null) {
                w0Var.E1(f());
            }
            f().Z(null);
            f().e0(ComicCodeBookOperate.CREATE);
            f().getPassword().set("");
            f().W().set("");
            w0 w0Var2 = this.b;
            Intrinsics.checkNotNull(w0Var2);
            com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, w0Var2.getRoot());
            this.a = bVar;
            bVar.d(17);
            com.zentraedi.basic.function.ui.dialog.b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.setCanceledOnTouchOutside(true);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar3 = this.a;
            if (bVar3 != null) {
                bVar3.setCancelable(true);
            }
            g();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar4 = this.a;
        if (bVar4 != null) {
            bVar4.show();
        }
    }

    public final void j(@fo.k ComicCodeBook comicCodeBook) {
        TextView textView;
        Intrinsics.checkNotNullParameter(comicCodeBook, "comicCodeBook");
        if (this.b == null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            w0 w0Var = (w0) androidx.databinding.m.j(LayoutInflater.from(activityE), com.zentraedi.comic.q.l.z3, (ViewGroup) null, false);
            this.b = w0Var;
            if (w0Var != null) {
                w0Var.E1(f());
            }
            w0 w0Var2 = this.b;
            if (w0Var2 != null && (textView = w0Var2.K) != null) {
                textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xS1));
            }
            f().Z(comicCodeBook);
            f().e0(ComicCodeBookOperate.DELETE);
            f().getPassword().set(comicCodeBook.getSecret());
            f().W().set(comicCodeBook.getTitle());
            w0 w0Var3 = this.b;
            Intrinsics.checkNotNull(w0Var3);
            com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, w0Var3.getRoot());
            this.a = bVar;
            bVar.d(17);
            com.zentraedi.basic.function.ui.dialog.b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.c(com.zentraedi.comic.q.r.Kp);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar3 = this.a;
            if (bVar3 != null) {
                bVar3.setCanceledOnTouchOutside(true);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar4 = this.a;
            if (bVar4 != null) {
                bVar4.setCancelable(true);
            }
            g();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar5 = this.a;
        if (bVar5 != null) {
            bVar5.show();
        }
    }

    public final void k(@fo.k ComicCodeBook comicCodeBook) {
        TextView textView;
        Intrinsics.checkNotNullParameter(comicCodeBook, "comicCodeBook");
        if (this.b == null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            w0 w0Var = (w0) androidx.databinding.m.j(LayoutInflater.from(activityE), com.zentraedi.comic.q.l.z3, (ViewGroup) null, false);
            this.b = w0Var;
            if (w0Var != null) {
                w0Var.E1(f());
            }
            w0 w0Var2 = this.b;
            if (w0Var2 != null && (textView = w0Var2.K) != null) {
                textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xy));
            }
            f().Z(comicCodeBook);
            f().e0(ComicCodeBookOperate.EDIT);
            f().getPassword().set(comicCodeBook.getSecret());
            f().W().set(comicCodeBook.getTitle());
            w0 w0Var3 = this.b;
            Intrinsics.checkNotNull(w0Var3);
            this.a = new com.zentraedi.basic.function.ui.dialog.b(activityE, w0Var3.getRoot());
            g();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = this.a;
        if (bVar != null) {
            bVar.show();
        }
    }
}
