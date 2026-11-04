package com.zentraedi.comic.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b extends RecyclerView.ItemDecoration {
    public static final int d = 0;
    public static final int e = 1;
    public static final int[] f = {R.attr.listDivider};
    private Context a;
    private Drawable b;
    private int c;

    public b(Context context, int i) {
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f);
        this.b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i);
    }

    public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.b.setBounds(paddingLeft, bottom, width, this.b.getIntrinsicHeight() + bottom);
            this.b.draw(canvas);
        }
    }

    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
            this.b.setBounds(right, paddingTop, this.b.getIntrinsicWidth() + right, height);
            this.b.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.c == 0) {
            rect.set(0, 0, 0, this.b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.b.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.c == 0) {
            b(canvas, recyclerView, state);
        } else {
            a(canvas, recyclerView, state);
        }
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.c = i;
    }
}
