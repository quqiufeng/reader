package com.zentraedi.outreader.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.activity.ReaderSettingActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nScreenLockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenLockManager.kt\ncom/zentraedi/outreader/util/ScreenLockManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class j implements o0 {

    @fo.k
    public static final a f = new a(null);

    @fo.l
    private static volatile j g;

    @fo.k
    private Handler a;

    @fo.l
    private Runnable b;

    @fo.l
    private Activity c;

    @fo.l
    private PowerManager.WakeLock d;
    private long e;

    @SourceDebugExtension({"SMAP\nScreenLockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenLockManager.kt\ncom/zentraedi/outreader/util/ScreenLockManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final j a() {
            j jVar;
            j jVar2 = j.g;
            if (jVar2 != null) {
                return jVar2;
            }
            synchronized (this) {
                jVar = j.g;
                if (jVar == null) {
                    jVar = new j(null);
                    a aVar = j.f;
                    j.g = jVar;
                }
            }
            return jVar;
        }

        private a() {
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void d() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        wakeLock.acquire();
    }

    private final void e(Activity activity) {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        long j = this.e;
        if (j == ReaderSettingActivity.e0) {
            d();
        } else if (j == ReaderSettingActivity.f0) {
            i();
        } else {
            d();
            j();
        }
    }

    private final void g(Activity activity) {
        Object systemService = activity.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.d = ((PowerManager) systemService).newWakeLock(536870922, "OutReader:ScreenLock");
    }

    private final void h(Context context) {
        Long l = (Long) t7.d(gh.b.d0, Long.valueOf(ReaderSettingActivity.f0));
        this.e = l != null ? l.longValue() : ReaderSettingActivity.c0;
    }

    private final void i() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j jVar) {
        jVar.i();
    }

    public final void f(@fo.k Activity activity, @fo.k Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.c = activity;
        lifecycle.c(this);
        h(activity);
        g(activity);
        e(activity);
    }

    public final void j() {
        if (this.e <= 0) {
            return;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.zentraedi.outreader.util.i
            @Override // java.lang.Runnable
            public final void run() {
                j.k(this.a);
            }
        };
        this.b = runnable2;
        Handler handler = this.a;
        Intrinsics.checkNotNull(runnable2);
        handler.postDelayed(runnable2, this.e);
    }

    @f1(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        i();
        this.c = null;
    }

    @f1(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        i();
    }

    @f1(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Activity activity = this.c;
        if (activity != null) {
            g(activity);
            e(activity);
        }
    }

    private j() {
        this.a = new Handler(Looper.getMainLooper());
        this.e = ReaderSettingActivity.c0;
    }
}
