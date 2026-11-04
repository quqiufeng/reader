package com.zentraedi.comic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class s extends RecyclerView.ItemDecoration {
    private final Drawable a;
    private final int b;

    public s(Context context, int i) {
        Drawable drawable = context.getResources().getDrawable(i);
        this.a = drawable;
        this.b = drawable.getIntrinsicHeight();
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
            this.a.setBounds(right, paddingTop, this.b + right, height);
            this.a.draw(canvas);
        }
    }
}
