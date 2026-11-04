package com.zentraedi.reader.pdf;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class h implements Runnable {
    private static final Class<?> d = h.class;
    protected final Activity a;
    protected final LinkedBlockingQueue<b> b = new LinkedBlockingQueue<>();
    protected boolean c;

    class a implements Runnable {
        final /* synthetic */ Throwable a;

        a(Throwable th2) {
            this.a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(h.this.a, this.a.getMessage(), 0).show();
        }
    }

    public static class b implements Runnable {
        public void a() {
            nd.a.a(com.zentraedi.reader.f.a, "work()");
        }

        @Override // java.lang.Runnable
        public void run() {
            nd.a.a(com.zentraedi.reader.f.a, "run()");
        }
    }

    public h(Activity activity) {
        this.a = activity;
    }

    public void a(b bVar) {
        try {
            this.b.put(bVar);
        } catch (InterruptedException e) {
            Log.e("MuPDF Worker", "", e);
            Thread.currentThread().interrupt();
        }
    }

    public void b() {
        this.c = true;
        new Thread(this).start();
    }

    public void c() {
        this.c = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.c) {
            try {
                b bVarTake = this.b.take();
                bVarTake.a();
                this.a.runOnUiThread(bVarTake);
            } catch (Throwable th2) {
                Log.e("MuPDF Worker", "", th2);
                this.a.runOnUiThread(new a(th2));
            }
        }
    }
}
