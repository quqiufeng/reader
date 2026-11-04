package com.zentraedi.outreader.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReadPageTurnModeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadPageTurnModeDialog.kt\ncom/zentraedi/outreader/dialog/ReadPageTurnModeDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,107:1\n257#2,2:108\n257#2,2:110\n257#2,2:112\n257#2,2:114\n257#2,2:116\n*S KotlinDebug\n*F\n+ 1 ReadPageTurnModeDialog.kt\ncom/zentraedi/outreader/dialog/ReadPageTurnModeDialog\n*L\n47#1:108,2\n48#1:110,2\n49#1:112,2\n50#1:114,2\n51#1:116,2\n*E\n"})
public final class a0 {

    @fo.k
    private final Context a;

    @fo.k
    private final com.zentraedi.outreader.databinding.e0 b;

    @fo.k
    private Function1<? super Integer, Unit> c;

    @fo.k
    private Function1<? super Boolean, Unit> d;

    public a0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(context), com.zentraedi.outreader.d.l.qb, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        this.b = (com.zentraedi.outreader.databinding.e0) c0VarJ;
        this.c = new Function1() { // from class: com.zentraedi.outreader.dialog.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.k(((Integer) obj).intValue());
            }
        };
        this.d = new Function1() { // from class: com.zentraedi.outreader.dialog.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.j(((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Ref.BooleanRef booleanRef, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        booleanRef.element = true;
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(a0 a0Var, com.zentraedi.basic.function.ui.dialog.b bVar, RadioGroup group, int i) {
        Intrinsics.checkNotNullParameter(group, "group");
        if (i == com.zentraedi.outreader.d.i.O5) {
            a0Var.c.invoke(1);
        } else if (i == com.zentraedi.outreader.d.i.V5) {
            a0Var.c.invoke(3);
        } else if (i == com.zentraedi.outreader.d.i.W5) {
            a0Var.c.invoke(2);
        } else if (i == com.zentraedi.outreader.d.i.U5) {
            a0Var.c.invoke(4);
        } else {
            a0Var.c.invoke(5);
        }
        bVar.dismiss();
        a0Var.d.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a0 a0Var, Ref.BooleanRef booleanRef, DialogInterface dialogInterface) {
        a0Var.d.invoke(Boolean.valueOf(booleanRef.element));
    }

    @fo.k
    public final Context g() {
        return this.a;
    }

    @fo.k
    public final Function1<Boolean, Unit> h() {
        return this.d;
    }

    @fo.k
    public final Function1<Integer, Unit> i() {
        return this.c;
    }

    public final void l(@fo.k Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.d = function1;
    }

    public final void m(@fo.k Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.c = function1;
    }

    @fo.k
    public final a0 n(int i, @fo.k List<Integer> supportPageModes) {
        int i2;
        Intrinsics.checkNotNullParameter(supportPageModes, "supportPageModes");
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(this.a, this.b.getRoot(), com.zentraedi.outreader.d.r.Or);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.b.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.o(booleanRef, bVar, view);
            }
        });
        this.b.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.p(bVar, view);
            }
        });
        RadioButton checkboxCover = this.b.E;
        Intrinsics.checkNotNullExpressionValue(checkboxCover, "checkboxCover");
        checkboxCover.setVisibility(supportPageModes.contains(1) ? 0 : 8);
        RadioButton checkboxSlide = this.b.H;
        Intrinsics.checkNotNullExpressionValue(checkboxSlide, "checkboxSlide");
        checkboxSlide.setVisibility(supportPageModes.contains(3) ? 0 : 8);
        RadioButton checkboxVertically = this.b.I;
        Intrinsics.checkNotNullExpressionValue(checkboxVertically, "checkboxVertically");
        checkboxVertically.setVisibility(supportPageModes.contains(2) ? 0 : 8);
        RadioButton checkboxSimulation = this.b.G;
        Intrinsics.checkNotNullExpressionValue(checkboxSimulation, "checkboxSimulation");
        checkboxSimulation.setVisibility(supportPageModes.contains(4) ? 0 : 8);
        RadioButton checkboxNone = this.b.F;
        Intrinsics.checkNotNullExpressionValue(checkboxNone, "checkboxNone");
        checkboxNone.setVisibility(supportPageModes.contains(5) ? 0 : 8);
        if (i == 1) {
            i2 = com.zentraedi.outreader.d.i.O5;
        } else if (i == 2) {
            i2 = com.zentraedi.outreader.d.i.W5;
        } else if (i != 3) {
            i2 = i != 4 ? com.zentraedi.outreader.d.i.T5 : com.zentraedi.outreader.d.i.U5;
        } else {
            i2 = com.zentraedi.outreader.d.i.V5;
        }
        this.b.L.check(i2);
        this.b.L.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.dialog.w
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                a0.q(this.a, bVar, radioGroup, i3);
            }
        });
        bVar.d(80);
        bVar.setCanceledOnTouchOutside(true);
        bVar.c(com.zentraedi.outreader.d.r.Bp);
        Window window = bVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        bVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.zentraedi.outreader.dialog.x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a0.r(this.a, booleanRef, dialogInterface);
            }
        });
        bVar.show();
        return this;
    }
}
