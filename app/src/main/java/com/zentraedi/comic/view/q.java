package com.zentraedi.comic.view;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class q extends a {
    @Override // com.zentraedi.comic.view.a
    public View b(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.getChildCount() == 0) {
            return null;
        }
        return linearLayoutManager.findViewByPosition(this.b ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition());
    }

    @Override // com.zentraedi.comic.view.a
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Log.d("CustomSnapHelper", "linearLayoutManager.findFirstVisibleItemPosition()==" + linearLayoutManager.findFirstVisibleItemPosition());
        Log.d("CustomSnapHelper", "linearLayoutManager.findLastVisibleItemPosition()==" + linearLayoutManager.findLastVisibleItemPosition());
        int iFindFirstVisibleItemPosition = this.b ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition();
        View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            this.f = false;
            return super.findSnapView(layoutManager);
        }
        Log.d("CustomSnapHelper", "viewItem left===" + viewFindViewByPosition.getLeft());
        Log.d("CustomSnapHelper", "viewItem  right===" + viewFindViewByPosition.getRight());
        Log.d("CustomSnapHelper", "viewItem  location===" + iFindFirstVisibleItemPosition);
        if (this.b && viewFindViewByPosition.getLeft() * this.e > linearLayoutManager.getWidth()) {
            iFindFirstVisibleItemPosition++;
        }
        View viewFindViewByPosition2 = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition2 == null) {
            this.f = false;
            return super.findSnapView(layoutManager);
        }
        Log.d("CustomSnapHelper", "viewItem left===" + viewFindViewByPosition2.getLeft());
        Log.d("CustomSnapHelper", "viewItem  right===" + viewFindViewByPosition2.getRight());
        Log.d("CustomSnapHelper", "viewItem  location===" + iFindFirstVisibleItemPosition);
        if (linearLayoutManager.getWidth() > (viewFindViewByPosition2.getWidth() * this.e) + 10.0f) {
            this.f = false;
            return b(linearLayoutManager);
        }
        this.f = this.g == viewFindViewByPosition2;
        this.g = viewFindViewByPosition2;
        return viewFindViewByPosition2;
    }

    @Override // com.zentraedi.comic.view.a
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewFindViewByPosition;
        nd.a.a("CustomSnapHelper", "velocityX= " + i + " findTargetSnapPosition  ");
        this.f = false;
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindLastVisibleItemPosition = this.b ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindLastVisibleItemPosition == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition)) == null || viewFindViewByPosition.getWidth() < layoutManager.getWidth()) {
            return -1;
        }
        int left = viewFindViewByPosition.getLeft();
        int right = viewFindViewByPosition.getRight();
        layoutManager.getWidth();
        nd.a.a("CustomSnapHelper", "currentPositionOffset= " + left);
        nd.a.a("CustomSnapHelper", "currentPositionOffsetRight= " + right);
        nd.a.a("CustomSnapHelper", "currentPosition= " + iFindLastVisibleItemPosition);
        if (i > 0 && this.b) {
            nd.a.a("CustomSnapHelper", "currentPosition += " + (iFindLastVisibleItemPosition + 1));
            return Math.min(iFindLastVisibleItemPosition - 1, layoutManager.getItemCount() - 1);
        }
        if (i >= 0 || this.b) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("currentPosition -= ");
        sb.append(iFindLastVisibleItemPosition - 1);
        nd.a.a("CustomSnapHelper", sb.toString());
        return Math.max(iFindLastVisibleItemPosition + 1, 0);
    }
}
