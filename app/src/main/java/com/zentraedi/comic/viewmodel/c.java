package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class c extends com.zentraedi.basic.function.viewmodel.a {

    @fo.k
    private final ObservableField<Boolean> a = new ObservableField<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c cVar, View view) {
        cVar.editModel.set(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(c cVar, View view) {
        cVar.editModel.set(Boolean.FALSE);
    }

    public final void N() {
        setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.O(this.a, view);
            }
        });
        setCloseEditOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.P(this.a, view);
            }
        });
    }

    @fo.k
    public final ObservableField<Boolean> Q() {
        return this.a;
    }
}
