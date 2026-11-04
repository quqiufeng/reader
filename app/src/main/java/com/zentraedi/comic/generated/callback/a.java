package com.zentraedi.comic.generated.callback;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {
    final InterfaceC0119a a;
    final int b;

    /* JADX INFO: renamed from: com.zentraedi.comic.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0119a {
        void b(int i, CompoundButton compoundButton, boolean z);
    }

    public a(InterfaceC0119a interfaceC0119a, int i) {
        this.a = interfaceC0119a;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, compoundButton, z);
    }
}
