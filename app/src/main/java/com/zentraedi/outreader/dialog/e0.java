package com.zentraedi.outreader.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.zentraedi.outreader.activity.ReaderSettingActivity;
import com.zentraedi.outreader.databinding.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class e0 {

    @fo.k
    private final Context a;

    @fo.k
    private final g0 b;

    @fo.k
    private Function1<? super Long, Unit> c;

    public e0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(context), com.zentraedi.outreader.d.l.rb, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        this.b = (g0) c0VarJ;
        this.c = new Function1() { // from class: com.zentraedi.outreader.dialog.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.f(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(e0 e0Var, com.zentraedi.basic.function.ui.dialog.b bVar, RadioGroup group, int i) {
        Intrinsics.checkNotNullParameter(group, "group");
        if (i == com.zentraedi.outreader.d.i.Q5) {
            e0Var.c.invoke(Long.valueOf(ReaderSettingActivity.c0));
        } else if (i == com.zentraedi.outreader.d.i.S5) {
            e0Var.c.invoke(Long.valueOf(ReaderSettingActivity.d0));
        } else if (i == com.zentraedi.outreader.d.i.P5) {
            e0Var.c.invoke(Long.valueOf(ReaderSettingActivity.e0));
        } else if (i == com.zentraedi.outreader.d.i.R5) {
            e0Var.c.invoke(Long.valueOf(ReaderSettingActivity.f0));
        }
        bVar.dismiss();
    }

    @fo.k
    public final Context d() {
        return this.a;
    }

    @fo.k
    public final Function1<Long, Unit> e() {
        return this.c;
    }

    public final void g(@fo.k Function1<? super Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.c = function1;
    }

    @fo.k
    public final e0 h(long j) {
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(this.a, this.b.getRoot(), com.zentraedi.outreader.d.r.Or);
        this.b.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0.i(bVar, view);
            }
        });
        if (j == ReaderSettingActivity.c0) {
            this.b.J.check(com.zentraedi.outreader.d.i.Q5);
        } else if (j == ReaderSettingActivity.d0) {
            this.b.J.check(com.zentraedi.outreader.d.i.S5);
        } else if (j == ReaderSettingActivity.e0) {
            this.b.J.check(com.zentraedi.outreader.d.i.P5);
        } else if (j == ReaderSettingActivity.f0) {
            this.b.J.check(com.zentraedi.outreader.d.i.R5);
        }
        this.b.J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.dialog.c0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                e0.j(this.a, bVar, radioGroup, i);
            }
        });
        bVar.d(80);
        bVar.setCanceledOnTouchOutside(true);
        bVar.c(com.zentraedi.outreader.d.r.Bp);
        bVar.show();
        return this;
    }
}
