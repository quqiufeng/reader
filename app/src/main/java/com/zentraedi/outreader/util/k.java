package com.zentraedi.outreader.util;

import android.os.Message;
import androidx.annotation.n0;
import com.zentraedi.basic.function.utils.j0;
import java.util.ArrayList;
import java.util.Timer;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class k {
    public static final Class<?> i = k.class;
    public static final int j = 0;
    public static final int k = 1;
    public boolean b;
    public g c;
    public g e;
    public int f;
    public final com.zentraedi.outreader.util.a<k> a = new a(this);
    public int d = 18000;
    public int g = 0;
    private final ArrayList<b> h = new ArrayList<>();

    static class a extends com.zentraedi.outreader.util.a<k> {
        public a(@n0 k hostObject) {
            super(hostObject);
        }

        @Override // com.zentraedi.outreader.util.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@n0 k host, @n0 Message msg) {
            int i = msg.what;
            if (i == 0) {
                int i2 = host.f;
                if (i2 <= 0) {
                    host.f();
                    return;
                }
                int i3 = i2 - 1;
                host.f = i3;
                host.g(i3);
                return;
            }
            if (i != 1) {
                return;
            }
            int i4 = host.d;
            if (i4 > 0) {
                host.d = i4 - 1;
                return;
            }
            host.g = 0;
            host.f = 0;
            host.i();
        }
    }

    public interface b {
        void T(int time);

        void l1();
    }

    public k() {
    }

    public void a(b observer) {
        this.h.add(observer);
    }

    public void b() {
        this.h.clear();
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public boolean e() {
        return this.b;
    }

    public void f() {
        if (j0.l(this.h)) {
            return;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.get(i2).l1();
        }
    }

    public void g(int time) {
        if (j0.l(this.h)) {
            return;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.get(i2).T(time);
        }
    }

    public void h() {
        try {
            g gVar = this.e;
            if (gVar != null) {
                gVar.cancel();
                this.e = null;
            }
            if (this.a.hasMessages(0)) {
                this.a.removeMessages(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void i() {
        try {
            g gVar = this.c;
            if (gVar != null) {
                gVar.cancel();
                this.c = null;
            }
            if (this.a.hasMessages(1)) {
                this.a.removeMessages(1);
            }
            this.d = 18000;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void j(boolean isChange) {
        this.b = isChange;
    }

    public void k(int time) {
        this.f = time;
    }

    public void l(int type) {
        this.g = type;
    }

    public void m() {
        try {
            if (this.f <= 0) {
                return;
            }
            h();
            if (this.e == null) {
                this.e = new g(this.a, 0);
                new Timer().schedule(this.e, 0L, 1000L);
            }
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public void n() {
        try {
            if (this.d <= 0) {
                return;
            }
            i();
            if (this.c == null) {
                this.c = new g(this.a, 1);
                new Timer().schedule(this.c, 0L, 1000L);
            }
        } catch (Error unused) {
        }
    }

    public k(int time) {
        this.f = time;
    }
}
