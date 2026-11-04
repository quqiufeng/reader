package com.zentraedi.comic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class DashedLineView extends View {

    @fo.l
    private Paint a;

    public DashedLineView(@fo.l Context context) {
        super(context);
        a();
    }

    private final void a() {
        Paint paint = new Paint(1);
        this.a = paint;
        Intrinsics.checkNotNull(paint);
        paint.setColor(-16777216);
        Paint paint2 = this.a;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeWidth(2.0f);
        Paint paint3 = this.a;
        Intrinsics.checkNotNull(paint3);
        paint3.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
    }

    @Override // android.view.View
    protected void onDraw(@fo.k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float width = getWidth();
        float height2 = getHeight() / 2.0f;
        Paint paint = this.a;
        Intrinsics.checkNotNull(paint);
        canvas.drawLine(0.0f, height, width, height2, paint);
    }

    public DashedLineView(@fo.l Context context, @fo.l @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public DashedLineView(@fo.l Context context, @fo.l @p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
