package com.zentraedi.comic.view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class p extends a {
    @Override // com.zentraedi.comic.view.a
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewFindViewByPosition;
        nd.a.a("CustomSnapHelper", "velocityX= " + i + " findTargetSnapPosition  ");
        this.f = false;
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = this.b ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null || viewFindViewByPosition.getWidth() < layoutManager.getWidth()) {
            return -1;
        }
        int left = viewFindViewByPosition.getLeft();
        int right = viewFindViewByPosition.getRight();
        layoutManager.getWidth();
        nd.a.a("CustomSnapHelper", "currentPositionOffset= " + left);
        nd.a.a("CustomSnapHelper", "currentPositionOffsetRight= " + right);
        nd.a.a("CustomSnapHelper", "currentPosition= " + iFindFirstVisibleItemPosition);
        if (i > 0 && this.b && (right <= 20 || Math.abs(i) > viewFindViewByPosition.getWidth())) {
            StringBuilder sb = new StringBuilder();
            sb.append("currentPosition += ");
            int i3 = iFindFirstVisibleItemPosition + 1;
            sb.append(i3);
            nd.a.a("CustomSnapHelper", sb.toString());
            return Math.min(i3, layoutManager.getItemCount() - 1);
        }
        if (i >= 0 || this.b || (left < -20 && Math.abs(i) <= viewFindViewByPosition.getWidth())) {
            return -1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("currentPosition -= ");
        int i4 = iFindFirstVisibleItemPosition - 1;
        sb2.append(i4);
        nd.a.a("CustomSnapHelper", sb2.toString());
        return Math.max(i4, 0);
    }
}
