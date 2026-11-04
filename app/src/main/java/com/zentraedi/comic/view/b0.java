package com.zentraedi.comic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.business.utils.g8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b0 extends AppCompatSeekBar {
    private int b;
    private int c;

    @fo.l
    private SeekBar.OnSeekBarChangeListener d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private boolean k;

    @fo.l
    private RecyclerView l;

    @fo.k
    private final b m;

    @fo.k
    private final a n;

    @fo.k
    private final c o;

    public static final class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        public void onChanged() {
            super.onChanged();
            b0.this.m();
        }

        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            b0.this.m();
        }

        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            b0.this.m();
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                b0.this.i = false;
            } else {
                if (i != 1) {
                    return;
                }
                b0.this.i = true;
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            b0.this.j += i2;
            b0 b0Var = b0.this;
            b0Var.setProgress(b0Var.h + ((b0.this.j / b0.this.e) * 100));
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            RecyclerView recyclerView;
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = b0.this.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
            if (b0.this.i || (recyclerView = b0.this.l) == null) {
                return;
            }
            recyclerView.smoothScrollBy(0, b0.this.o(i));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = b0.this.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = b0.this.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fo.k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = true;
        this.k = true;
        this.m = new b();
        this.n = new a();
        this.o = new c();
        p();
    }

    private final void l() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.l;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(this.n);
        }
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.g = this.f;
        RecyclerView recyclerView = this.l;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.view.a0
                @Override // java.lang.Runnable
                public final void run() {
                    b0.n(this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(b0 b0Var) {
        b0Var.e = b0Var.getMeasuredHeight();
        int iD = g8.d() / k0.a(b0Var.getContext(), 35);
        int i = b0Var.e;
        b0Var.f = iD * i;
        int i2 = b0Var.g;
        if (i2 == 0) {
            return;
        }
        b0Var.setProgress(((i2 * b0Var.h) / i) * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int i) {
        int i2 = (i - this.h) * this.f;
        this.h = i;
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        super/*android.widget.SeekBar*/.setOnSeekBarChangeListener(this.o);
    }

    @fo.l
    public final SeekBar.OnSeekBarChangeListener getMOnSeekBarChangeListener() {
        return this.d;
    }

    public final int getMaximumValue() {
        return this.c;
    }

    public final int getMinimumValue() {
        return this.b;
    }

    public final void k(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.l = recyclerView;
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@fo.k Canvas c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        c2.rotate(-90.0f);
        c2.translate(-getHeight(), 0.0f);
        super.onDraw(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected synchronized void onMeasure(int i, int i2) {
        super/*android.widget.SeekBar*/.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.SeekBar*/.onSizeChanged(i2, i, i4, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@fo.k MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.d;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(this);
            }
        } else if (action == 1) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.d;
            if (onSeekBarChangeListener2 != null) {
                onSeekBarChangeListener2.onStopTrackingTouch(this);
            }
        } else if (action == 2) {
            setProgress((int) (getMax() - ((getMax() * event.getY()) / getHeight())));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public final void setMOnSeekBarChangeListener(@fo.l SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMax(int i) {
        this.c = i;
        super/*android.widget.SeekBar*/.setMax(i - this.b);
    }

    public final void setMaximumValue(int i) {
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMin(int i) {
        this.b = i;
        super/*android.widget.SeekBar*/.setMax(this.c - i);
    }

    public final void setMinimumValue(int i) {
        this.b = i;
    }

    public void setOnSeekBarChangeListener(@fo.l SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setProgress(int i) {
        super/*android.widget.SeekBar*/.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fo.k Context context, @fo.l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = true;
        this.k = true;
        this.m = new b();
        this.n = new a();
        this.o = new c();
        p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fo.k Context context, @fo.l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = true;
        this.k = true;
        this.m = new b();
        this.n = new a();
        this.o = new c();
        p();
    }
}
