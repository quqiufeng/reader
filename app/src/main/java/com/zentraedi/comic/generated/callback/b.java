package com.zentraedi.comic.generated.callback;

import android.view.View;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b implements View.OnClickListener {
    final a a;
    final int b;

    public interface a {
        void a(int i, View view);
    }

    public b(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a(this.b, view);
    }
}
