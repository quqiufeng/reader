package com.zentraedi.comic;

import android.content.Context;
import android.os.PowerManager;
import com.zentraedi.business.utils.t7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class x {

    @fo.k
    public static final x a = new x();

    @fo.k
    public static final String b = "SCREEN_BRIGHTNESS_TIME";

    @fo.l
    private static PowerManager.WakeLock c;

    private x() {
    }

    public final void a(@fo.k Context context, long j) {
        PowerManager.WakeLock wakeLock;
        PowerManager.WakeLock wakeLock2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (j <= 0 && (wakeLock2 = c) != null && wakeLock2.isHeld()) {
            b();
            return;
        }
        if (j <= 0) {
            return;
        }
        t7.j(b, Long.valueOf(j));
        if (c == null) {
            Object systemService = context.getSystemService("power");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            c = ((PowerManager) systemService).newWakeLock(10, x.class.getCanonicalName());
        }
        PowerManager.WakeLock wakeLock3 = c;
        if (wakeLock3 != null && wakeLock3.isHeld() && (wakeLock = c) != null) {
            wakeLock.release();
        }
        PowerManager.WakeLock wakeLock4 = c;
        if (wakeLock4 != null) {
            wakeLock4.acquire(j);
        }
    }

    public final void b() {
        PowerManager.WakeLock wakeLock = c;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        PowerManager.WakeLock wakeLock2 = c;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        c = null;
    }
}
