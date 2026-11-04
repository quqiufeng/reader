package com.zentraedi.comic.view;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class x implements View.OnTouchListener {

    @fo.k
    private final RecyclerView a;

    @fo.l
    private final ReadSetting b;
    private final float c;
    private float d;
    private float e;
    private boolean f;
    private final int g;

    public x(@fo.k RecyclerView recyclerView, @fo.l ReadSetting readSetting, float f) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.a = recyclerView;
        this.b = readSetting;
        this.c = f;
        this.g = recyclerView.getWidth() / 3;
    }

    private final int a() {
        return (int) (this.e - this.d);
    }

    private final void b() {
        View viewFindViewByPosition;
        LinearLayoutManager layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition())) == null) {
            return;
        }
        this.a.smoothScrollBy(viewFindViewByPosition.getLeft(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@fo.l View view, @fo.k MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            float x = event.getX();
            this.d = x;
            this.e = x;
            this.f = false;
        } else if (actionMasked == 1) {
            if (!this.f) {
                return false;
            }
            event.getX();
            this.f = false;
        } else if (actionMasked == 2) {
            float x2 = event.getX() - this.e;
            if (!this.f && Math.abs(event.getX() - this.d) > 10.0f) {
                this.f = true;
            }
            if (this.f) {
                this.a.scrollBy((int) (-x2), 0);
            }
            this.e = event.getX();
        } else if (actionMasked == 3) {
            if (!this.f) {
                return false;
            }
            event.getX();
            this.f = false;
        }
        return true;
    }

    public /* synthetic */ x(RecyclerView recyclerView, ReadSetting readSetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, readSetting, (i & 4) != 0 ? 1.0f : f);
    }
}
