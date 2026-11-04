package com.zentraedi.outreader.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.zentraedi.business.activity.BaseEditTxtActivity;
import com.zentraedi.business.reader.ReaderEvent;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.m6;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class LocalTxtActivity extends BaseEditTxtActivity {

    @fo.k
    public static final a d0 = new a(null);

    @fo.k
    private static final String e0 = "KEY_LOCAL_PATH";

    @fo.l
    private String c0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.l String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) LocalTxtActivity.class);
            intent.putExtra(LocalTxtActivity.e0, str);
            activity.startActivity(intent);
            activity.overridePendingTransition(com.zentraedi.outreader.d.a.R0, com.zentraedi.outreader.d.a.s);
        }

        private a() {
        }
    }

    public static final class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 0) {
                return false;
            }
            LocalTxtActivity.this.r4().F.setCursorVisible(true);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(LocalTxtActivity localTxtActivity, View view) {
        localTxtActivity.W4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(LocalTxtActivity localTxtActivity, View view) {
        if (Intrinsics.areEqual(localTxtActivity.t4().rightNavTextEnable.get(), Boolean.FALSE)) {
            return;
        }
        localTxtActivity.U4();
    }

    private final void U4() {
        String strValueOf = String.valueOf(r4().F.getText());
        t4().rightNavTextEnable.set(Boolean.FALSE);
        h4(r4().I, com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.eu1));
        V4(strValueOf);
        F4(strValueOf);
        E4();
    }

    private final void V4(String str) {
        if (str == null) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.bv2), false);
        } else {
            l5.L(this.c0, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W4() {
        I4(true);
        if (Intrinsics.areEqual(t4().rightNavTextEnable.get(), Boolean.FALSE)) {
            finish();
        } else {
            U4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X4() {
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) this, com.zentraedi.outreader.d.l.U2, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.outreader.d.i.wO)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.bv2));
        ((TextView) bVar.b(com.zentraedi.outreader.d.i.PL)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.NB2));
        TextView textView = (TextView) bVar.b(com.zentraedi.outreader.d.i.OL);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ox1));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalTxtActivity.Y4(this.a, bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.outreader.d.i.AL);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ey));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalTxtActivity.Z4(bVar, this, view);
            }
        });
        bVar.d(17);
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(LocalTxtActivity localTxtActivity, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        localTxtActivity.I4(false);
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void Z4(com.zentraedi.basic.function.ui.dialog.b bVar, LocalTxtActivity localTxtActivity, View view) {
        bVar.dismiss();
        localTxtActivity.finish();
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ReaderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventId() == 1) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        String stringExtra = getIntent().getStringExtra(e0);
        this.c0 = stringExtra;
        if (stringExtra != null) {
            String strA = l5.A();
            Intrinsics.checkNotNullExpressionValue(strA, "getSDCardPath(...)");
            if (StringsKt.startsWith$default(stringExtra, strA, false, 2, (Object) null)) {
                org.greenrobot.eventbus.c.f().v(this);
                t4().navTitle.set(l5.r(this.c0));
                t4().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocalTxtActivity.S4(this.a, view);
                    }
                });
                t4().setRightTextOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocalTxtActivity.T4(this.a, view);
                    }
                });
                if (new File(this.c0).exists()) {
                    C4(this.c0);
                    return;
                }
                return;
            }
        }
        com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.YA2, this.c0), false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void s3() {
        r4().E1(t4());
        r4().F.setCursorVisible(false);
        r4().F.setOnTouchListener(new b());
        r4().G.setVisibility(8);
    }
}
