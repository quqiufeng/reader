package com.zentraedi.outreader.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class b implements o0 {

    @fo.k
    private final Lifecycle a;

    @fo.l
    private Timer b;

    @fo.l
    private TimerTask c;

    @fo.l
    private Function0<Boolean> d;
    private boolean e;

    public static final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Function0<Boolean> function0B = b.this.b();
            if (function0B != null ? function0B.invoke().booleanValue() : false) {
                return;
            }
            b.this.f();
        }
    }

    public b(@fo.k Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.a = lifecycle;
        lifecycle.c(this);
    }

    private final TimerTask a() {
        return new a();
    }

    @fo.l
    public final Function0<Boolean> b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final void d(@fo.l Function0<Boolean> function0) {
        this.d = function0;
    }

    public final void e(long j) {
        if (this.e) {
            f();
        }
        this.b = new Timer();
        TimerTask timerTaskA = a();
        this.c = timerTaskA;
        Timer timer = this.b;
        if (timer != null) {
            timer.schedule(timerTaskA, j, j);
        }
        this.e = true;
    }

    public final void f() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
        }
        this.b = null;
        TimerTask timerTask = this.c;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.c = null;
        this.e = false;
    }

    public final void g(long j) {
        if (this.e) {
            f();
            e(j);
        }
    }

    @f1(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        f();
        this.a.g(this);
    }
}
