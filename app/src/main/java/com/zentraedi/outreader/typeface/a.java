package com.zentraedi.outreader.typeface;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.zentraedi.outreader.model.TypefaceM;
import fo.k;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class a {
    private static final Class<?> d = a.class;
    public final ArrayList<TypefaceM> a;
    public final Handler b;
    public final ArrayList<com.zentraedi.outreader.typeface.b> c;

    /* JADX INFO: renamed from: com.zentraedi.outreader.typeface.a$a, reason: collision with other inner class name */
    class C0152a implements Callback {
        final /* synthetic */ TypefaceM a;

        /* JADX INFO: renamed from: com.zentraedi.outreader.typeface.a$a$a, reason: collision with other inner class name */
        class RunnableC0153a implements Runnable {
            RunnableC0153a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.zentraedi.basic.function.ui.toast.a.z(com.zentraedi.basic.function.utils.a.a(), "Connection Exception");
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.typeface.a$a$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.zentraedi.basic.function.ui.toast.a.y(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.q.wg1);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.typeface.a$a$c */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.zentraedi.basic.function.ui.toast.a.z(com.zentraedi.basic.function.utils.a.a(), "Exception");
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.typeface.a$a$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.zentraedi.basic.function.ui.toast.a.z(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.rf3));
            }
        }

        C0152a(final TypefaceM val$downloadJob) {
            this.a = val$downloadJob;
        }

        public void onFailure(@k Call call, @k IOException e) {
            if ((e instanceof ConnectException) || (e instanceof UnknownHostException)) {
                a.this.b.post(new RunnableC0153a());
            } else {
                a.this.b.post(new b());
            }
            this.a.setDownloadState(5);
        }

        public void onResponse(@k Call call, @k Response response) throws Throwable {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                return;
            }
            byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            long jContentLength = responseBodyBody.contentLength();
            File file = new File(gh.a.a, this.a.getName() + ".otf");
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
                    try {
                        this.a.setDownloadState(2);
                        this.a.setDownloadedSize(randomAccessFile2.length());
                        randomAccessFile2.seek(randomAccessFile2.length());
                        if (jContentLength > 0) {
                            this.a.setTotalSize(jContentLength + randomAccessFile2.length());
                        }
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(responseBodyBody.byteStream());
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1 || this.a.getDownloadState() != 2) {
                                break;
                            }
                            randomAccessFile2.write(bArr, 0, i);
                            this.a.setDownloadedSize(file.length());
                        }
                        com.zentraedi.outreader.util.c.a(randomAccessFile2);
                        if (this.a.getDownloadedSize() < this.a.getTotalSize()) {
                            return;
                        }
                        this.a.setDownloadState(4);
                        try {
                            this.a.setTypeface(Typeface.createFromFile(file));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        a.this.g(this.a);
                        a.this.b.post(new d());
                    } catch (Exception unused) {
                        randomAccessFile = randomAccessFile2;
                        this.a.setDownloadState(5);
                        a.this.b.post(new c());
                        com.zentraedi.outreader.util.c.a(randomAccessFile);
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        com.zentraedi.outreader.util.c.a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused2) {
            }
        }
    }

    private static class b {
        public static final a a = new a(null);

        private b() {
        }
    }

    /* synthetic */ a(C0152a c0152a) {
        this();
    }

    public static a c() {
        return b.a;
    }

    public void a(@n0 TypefaceM downloadJob) {
        if (downloadJob.getDownloadState() == 2 || downloadJob.getDownloadState() == 4) {
            return;
        }
        if (!this.a.contains(downloadJob)) {
            this.a.add(downloadJob);
        }
        h(downloadJob);
    }

    public ArrayList<TypefaceM> b() {
        return this.a;
    }

    public synchronized void d() {
        Iterator<com.zentraedi.outreader.typeface.b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().n0(this);
        }
    }

    public void e(@n0 TypefaceM downloadJob) {
        downloadJob.setDownloadState(3);
    }

    public synchronized void f(com.zentraedi.outreader.typeface.b observer) {
        this.c.add(observer);
    }

    public void g(@n0 TypefaceM downloadJob) {
        if (this.a.contains(downloadJob)) {
            try {
                this.a.remove(downloadJob);
            } catch (Exception unused) {
            }
        }
    }

    public void h(@n0 final TypefaceM downloadJob) {
        String downloadUrl = downloadJob.getDownloadUrl();
        File file = new File(gh.a.a);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file2 = new File(gh.a.a, downloadJob.getName() + ".otf");
        long length = file2.exists() ? file2.length() : 0L;
        new OkHttpClient().newCall(new Request.Builder().url(downloadUrl).header("RANGE", "bytes=" + length + "-").build()).enqueue(new C0152a(downloadJob));
    }

    public synchronized void i(com.zentraedi.outreader.typeface.b observer) {
        this.c.remove(observer);
    }

    private a() {
        this.a = new ArrayList<>();
        this.c = new ArrayList<>();
        this.b = new Handler(Looper.getMainLooper());
    }
}
