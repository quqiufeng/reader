package com.zentraedi.comic.activity;

import android.content.Intent;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.model.ComicInfoModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class ComicBaseListActivity extends BaseLandscapeActivity {
    /* JADX WARN: Multi-variable type inference failed */
    protected void onActivityResult(int i, int i2, @fo.l Intent intent) {
        ComicInfoModel serializableExtra;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (i2 != 2023 || intent == null || (serializableExtra = intent.getSerializableExtra("info")) == null) {
            return;
        }
        new com.zentraedi.comic.business.a1().w0(serializableExtra.getPath(), this);
    }
}
