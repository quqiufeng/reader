package com.zentraedi.reader.reader;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class j {
    private ValueAnimator a;
    private long b = 60000;
    private boolean c = false;
    private float d;

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            j.this.d = f;
            return f;
        }
    }

    public j() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatCount(-1);
    }

    private void e() {
        this.a.resume();
    }

    public void b(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.addUpdateListener(animatorUpdateListener);
    }

    public void c() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.a.removeAllUpdateListeners();
        this.a = null;
    }

    public void d() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.pause();
    }

    public void f(long j) {
        ValueAnimator valueAnimator;
        if (this.b <= 0 || (valueAnimator = this.a) == null || valueAnimator.isRunning()) {
            return;
        }
        this.b = j;
        this.a.setDuration(j);
        this.a.setInterpolator(new a());
    }

    public void g() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isStarted()) {
            e();
            return;
        }
        if (this.c) {
            this.c = false;
            this.a.setCurrentPlayTime((long) (this.b * this.d));
        }
        this.a.start();
    }
}
