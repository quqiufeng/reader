package com.zentraedi.outreader.util;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class g extends TimerTask {
    final int a;
    private final Handler b;

    public g(Handler handler, int iMsg) {
        this.a = iMsg;
        this.b = handler;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Message message = new Message();
        message.what = this.a;
        this.b.sendMessage(message);
    }
}
