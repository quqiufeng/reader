package com.zentraedi.reader.pdf;

import android.os.AsyncTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class a<Params, Result> {
    private static final Class<?> c = a.class;
    private final AsyncTask<Params, Void, Result> a;
    private final b<Params, Result> b;

    /* JADX INFO: renamed from: com.zentraedi.reader.pdf.a$a, reason: collision with other inner class name */
    private static class AsyncTaskC0204a<Params, Result> extends AsyncTask<Params, Void, Result> {
        private final b<Params, Result> a;
        private final a<Params, Result> b;

        public AsyncTaskC0204a(a<Params, Result> aVar, b<Params, Result> bVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // android.os.AsyncTask
        @SafeVarargs
        protected final Result doInBackground(Params... paramsArr) {
            return this.a.c(paramsArr);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled(Result result) {
            this.a.b();
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(Result result) {
            this.b.c(result);
            this.a.b();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.b.d();
        }
    }

    public a(b<Params, Result> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = bVar;
        this.a = new AsyncTaskC0204a(this, bVar);
    }

    public void a() {
        this.a.cancel(true);
        this.b.a();
        try {
            this.a.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    @SafeVarargs
    public final void b(Params... paramsArr) {
        this.a.execute(paramsArr);
    }

    public void c(Result result) {
    }

    public void d() {
    }
}
