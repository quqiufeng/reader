package com.zentraedi.outreader.util;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.n0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class a<T> extends Handler {
    final WeakReference<T> a;

    public a(@n0 T hostObject) {
        this.a = new WeakReference<>(hostObject);
    }

    public abstract void a(@n0 T t, @n0 Message msg);

    @Override // android.os.Handler
    public void handleMessage(@n0 Message msg) {
        super.handleMessage(msg);
        T t = this.a.get();
        if (t == null) {
            return;
        }
        a(t, msg);
    }
}
