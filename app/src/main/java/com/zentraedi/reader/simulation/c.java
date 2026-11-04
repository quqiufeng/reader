package com.zentraedi.reader.simulation;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import androidx.annotation.n0;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.reader.f;
import com.zentraedi.reader.pageflip.PageFlipException;
import com.zentraedi.reader.pageflip.g;
import com.zentraedi.reader.pageflip.h;
import com.zentraedi.reader.pageflip.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class c extends GLSurfaceView implements GLSurfaceView.Renderer {
    private static final Class<?> g = c.class;
    int a;
    Handler b;
    j c;
    d d;
    ReentrantLock e;
    private com.zentraedi.reader.simulation.b f;

    class a implements h {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean a() {
            h hVar = this.a;
            if (hVar != null) {
                return hVar.a();
            }
            return false;
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean b() {
            h hVar = this.a;
            if (hVar == null) {
                return false;
            }
            if (hVar.b()) {
                c.this.c.A().B();
            }
            return this.a.b();
        }
    }

    public interface b {
        void a(boolean z);

        void onCancel();
    }

    /* JADX INFO: renamed from: com.zentraedi.reader.simulation.c$c, reason: collision with other inner class name */
    static class HandlerC0206c extends Handler {
        final WeakReference<c> a;

        HandlerC0206c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler
        public void handleMessage(@n0 Message message) {
            c cVar = this.a.get();
            if (cVar != null && message.what == 1) {
                cVar.e.lock();
                try {
                    d dVar = cVar.d;
                    if (dVar != null && dVar.c(message.arg1)) {
                        cVar.requestRender();
                    }
                } finally {
                    cVar.e.unlock();
                }
            }
        }
    }

    public c(Context context, @n0 com.zentraedi.reader.simulation.b bVar) {
        super(context);
        this.f = bVar;
        c(context);
    }

    private void c(Context context) {
        d();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.a = defaultSharedPreferences.getInt(com.zentraedi.reader.simulation.a.b, 1000);
        int i = defaultSharedPreferences.getInt(com.zentraedi.reader.simulation.a.a, 10);
        boolean z = defaultSharedPreferences.getBoolean(com.zentraedi.reader.simulation.a.c, false);
        j jVar = new j(context);
        this.c = jVar;
        jVar.U(0.8f).T(i).Z(0.32f).a0(0.1f).y(z);
        setEGLContextClientVersion(2);
        this.e = new ReentrantLock();
        this.d = new e(context, this.c, this.b, 0, this.f);
        setRenderer(this);
        setRenderMode(0);
    }

    private void d() {
        this.b = new HandlerC0206c(this);
    }

    public void a() {
        float fL = k0.l() - 10;
        float fI = k0.i() / 2;
        e(fL, fI);
        g(fL, fI);
    }

    public void b() {
        float f = 10;
        float fI = k0.i() / 2;
        e(f, fI);
        g(f, fI);
    }

    public void e(float f, float f2) {
        if (this.c.H() || this.c.A() == null) {
            return;
        }
        this.c.L(f, f2);
    }

    public void f(float f, float f2) {
        if (this.c.H()) {
            return;
        }
        if (this.c.c(f, f2)) {
            g(f, f2);
            return;
        }
        if (this.c.M(f, f2)) {
            try {
                this.e.lock();
                d dVar = this.d;
                if (dVar != null && dVar.d(f, f2)) {
                    requestRender();
                }
            } finally {
                this.e.unlock();
            }
        }
    }

    public void g(float f, float f2) {
        if (this.c.H()) {
            return;
        }
        this.c.N(f, f2, this.a);
        try {
            this.e.lock();
            d dVar = this.d;
            if (dVar != null && dVar.e(f, f2)) {
                requestRender();
            }
        } finally {
            this.e.unlock();
        }
    }

    public int getAnimateDuration() {
        return this.a;
    }

    public int getPixelsOfMesh() {
        return this.c.C();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        try {
            this.e.lock();
            d dVar = this.d;
            if (dVar != null) {
                dVar.b();
            }
        } finally {
            this.e.unlock();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.c.O(i, i2);
        d dVar = this.d;
        if (!(dVar instanceof e)) {
            dVar.g();
            this.d = new e(getContext(), this.c, this.b, 0, this.f);
        }
        this.d.f(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.c.P();
        } catch (PageFlipException unused) {
            nd.a.c(f.a, "Failed to run PageFlipFlipRender:onSurfaceCreated");
        }
    }

    public void setAnimateDuration(int i) {
        this.a = i;
    }

    public void setListener(h hVar) {
        j jVar = this.c;
        if (jVar != null) {
            jVar.Q(new a(hVar));
        }
    }

    public void setNightMode(boolean z) {
        if (z) {
            this.c.V(0.03f, 0.7f, 0.03f, 0.0f).W(0.03f, 0.5f, 0.03f, 0.0f).Y(5.0f, 30.0f, 0.3f).X(5.0f, 120.0f, 0.5f);
        } else {
            this.c.V(0.0f, 0.25f, 0.0f, 0.0f).W(0.0f, 0.12f, 0.0f, 0.0f).Y(5.0f, 30.0f, 0.3f).X(5.0f, 120.0f, 0.5f);
        }
    }

    public void setOnPageAnimationListener(b bVar) {
        d dVar = this.d;
        if (dVar != null) {
            dVar.h(bVar);
        }
    }

    public void setOnPageClickListener(g gVar) {
        this.c.S(gVar);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }
}
