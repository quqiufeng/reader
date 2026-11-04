package com.zentraedi.comic;

import android.content.Context;
import android.view.View;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.view.ComicLinearLayoutManager;
import com.zentraedi.comic.view.e0;
import com.zentraedi.comic.viewmodel.PageOver;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class w {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadModel.values().length];
            try {
                iArr[ReadModel.MANGA_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadModel.SCROLL_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends LinearSmoothScroller {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, Context context) {
            super(context);
            this.a = z;
        }

        protected int getHorizontalSnapPreference() {
            return this.a ? 1 : -1;
        }
    }

    public static final class c extends LinearSmoothScroller {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z, Context context) {
            super(context);
            this.a = z;
        }

        protected int getVerticalSnapPreference() {
            return this.a ? 1 : -1;
        }
    }

    public static /* synthetic */ void A(RecyclerView recyclerView, PageOver pageOver, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        z(recyclerView, pageOver, z);
    }

    public static final void B(@fo.k RecyclerView recyclerView, @fo.k ReadSetting readSetting, @fo.k PageOver pageOver) {
        View viewFindViewByPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        boolean z = readSetting.k() == ReadModel.MANGA_READ;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        int width2 = viewFindViewByPosition.getWidth();
        int decoratedLeft = linearLayoutManager.getDecoratedLeft(viewFindViewByPosition);
        int decoratedRight = linearLayoutManager.getDecoratedRight(viewFindViewByPosition);
        int i = width + 5;
        if (width2 > i) {
            if (z) {
                if (decoratedLeft < -5 && readSetting.p()) {
                    s(recyclerView, -Math.min(-decoratedLeft, width), pageOver);
                    return;
                }
                int i2 = iFindFirstVisibleItemPosition + 1;
                if (i2 < itemCount) {
                    l(recyclerView, i2, pageOver, false);
                    return;
                }
                return;
            }
            if (decoratedRight > i && readSetting.p()) {
                s(recyclerView, Math.min(decoratedRight - width, width), pageOver);
                return;
            }
            int i3 = iFindFirstVisibleItemPosition + 1;
            if (i3 < itemCount) {
                l(recyclerView, i3, pageOver, false);
                return;
            }
            return;
        }
        int i4 = width - 5;
        if (width2 >= i4) {
            if (z ? decoratedRight < i4 : decoratedLeft > 5) {
                l(recyclerView, iFindFirstVisibleItemPosition, pageOver, false);
                return;
            }
            int i5 = iFindFirstVisibleItemPosition + 1;
            if (i5 < itemCount) {
                l(recyclerView, i5, pageOver, false);
                return;
            }
            return;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
        if (!z) {
            if (iFindLastVisibleItemPosition > linearLayoutManager.findLastCompletelyVisibleItemPosition() && iFindLastVisibleItemPosition != -1) {
                l(recyclerView, iFindLastVisibleItemPosition, pageOver, false);
                return;
            }
            int i6 = iFindLastVisibleItemPosition + 1;
            if (i6 >= itemCount || i6 < 0) {
                return;
            }
            l(recyclerView, i6, pageOver, false);
            return;
        }
        int iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
        View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition2);
        if (viewFindViewByPosition2 != null) {
            viewFindViewByPosition = viewFindViewByPosition2;
        }
        int decoratedLeft2 = linearLayoutManager.getDecoratedLeft(viewFindViewByPosition);
        if (decoratedLeft2 < -5 || decoratedLeft2 > 5) {
            l(recyclerView, iFindLastVisibleItemPosition2, pageOver, true);
            return;
        }
        int i7 = iFindLastVisibleItemPosition2 + 1;
        if (i7 < itemCount) {
            l(recyclerView, i7, pageOver, true);
        }
    }

    public static final void C(@fo.k RecyclerView recyclerView, @fo.k PageOver pageOver, boolean z) {
        View viewFindViewByPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int height = (recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        int decoratedBottom = linearLayoutManager.getDecoratedBottom(viewFindViewByPosition) - height;
        if (decoratedBottom > 10 && z) {
            u(recyclerView, Math.min(decoratedBottom, height), pageOver);
            return;
        }
        int i = iFindFirstVisibleItemPosition + 1;
        if (i < itemCount) {
            p(recyclerView, i, pageOver, false);
        }
    }

    public static /* synthetic */ void D(RecyclerView recyclerView, PageOver pageOver, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        C(recyclerView, pageOver, z);
    }

    public static final boolean f(@fo.k RecyclerView recyclerView, @fo.k ReadSetting readSetting, boolean z) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        if (readSetting.k() == ReadModel.SCROLL_READ) {
            if (readSetting.p()) {
                return recyclerView.canScrollVertically(1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return false;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            return linearLayoutManager.findFirstVisibleItemPosition() < (adapter != null ? adapter.getItemCount() : 0) - 1;
        }
        boolean zCanScrollHorizontally = readSetting.k() == ReadModel.MANGA_READ ? recyclerView.canScrollHorizontally(-1) : recyclerView.canScrollHorizontally(1);
        if (!readSetting.p() && zCanScrollHorizontally) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager != null) {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
                if (itemCount <= 0) {
                    return false;
                }
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    return viewFindViewByPosition.getWidth() <= ((recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) + 5 || iFindFirstVisibleItemPosition < itemCount - 1;
                }
            }
        }
        return zCanScrollHorizontally;
    }

    public static final boolean g(@fo.k RecyclerView recyclerView, @fo.k ReadSetting readSetting, boolean z) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        if (readSetting.k() == ReadModel.SCROLL_READ) {
            if (readSetting.p()) {
                return recyclerView.canScrollVertically(-1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            return linearLayoutManager != null && linearLayoutManager.findFirstVisibleItemPosition() > 0;
        }
        boolean zCanScrollHorizontally = readSetting.k() == ReadModel.MANGA_READ ? recyclerView.canScrollHorizontally(1) : recyclerView.canScrollHorizontally(-1);
        if (!readSetting.p() && zCanScrollHorizontally) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition <= 0) {
                    return false;
                }
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    return viewFindViewByPosition.getWidth() <= ((recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) + 5 || iFindFirstVisibleItemPosition > 0;
                }
            }
        }
        return zCanScrollHorizontally;
    }

    public static final void h(@fo.k RecyclerView recyclerView, @fo.l ReadSetting readSetting, @fo.k ObservableField<PageOver> mPageOver) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(mPageOver, "mPageOver");
        if (readSetting == null) {
            return;
        }
        PageOver pageOver = (PageOver) mPageOver.get();
        if (pageOver == null) {
            pageOver = PageOver.NO;
        }
        int i = a.$EnumSwitchMapping$0[readSetting.k().ordinal()];
        if (i == 1) {
            B(recyclerView, readSetting, pageOver);
        } else if (i != 2) {
            y(recyclerView, readSetting, pageOver);
        } else {
            z(recyclerView, pageOver, readSetting.p());
        }
    }

    public static final void i(@fo.k RecyclerView recyclerView, @fo.l ReadSetting readSetting, @fo.k ObservableField<PageOver> mPageOver) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(mPageOver, "mPageOver");
        if (readSetting == null) {
            return;
        }
        PageOver pageOver = (PageOver) mPageOver.get();
        if (pageOver == null) {
            pageOver = PageOver.NO;
        }
        int i = a.$EnumSwitchMapping$0[readSetting.k().ordinal()];
        if (i == 1) {
            y(recyclerView, readSetting, pageOver);
        } else if (i != 2) {
            B(recyclerView, readSetting, pageOver);
        } else {
            C(recyclerView, pageOver, readSetting.p());
        }
    }

    public static final int j(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return 0;
        }
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return layoutManager.findFirstVisibleItemPosition();
    }

    public static final int k(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return 0;
        }
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return layoutManager.findLastVisibleItemPosition();
    }

    private static final void l(final RecyclerView recyclerView, final int i, PageOver pageOver, boolean z) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i < 0 || i >= itemCount) {
            return;
        }
        recyclerView.stopScroll();
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean reverseLayout = linearLayoutManager.getReverseLayout();
        if (iFindFirstVisibleItemPosition != -1 && i != iFindFirstVisibleItemPosition) {
            e0 e0Var = recyclerView instanceof e0 ? (e0) recyclerView : null;
            if (e0Var != null) {
                e0Var.l();
            }
        }
        if (pageOver != PageOver.NO) {
            b bVar = new b(z, recyclerView.getContext());
            bVar.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(bVar);
        } else {
            if (reverseLayout) {
                if (!z) {
                    linearLayoutManager.scrollToPositionWithOffset(i, 0);
                    return;
                } else {
                    linearLayoutManager.scrollToPositionWithOffset(i, 0);
                    recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.n(linearLayoutManager, i, recyclerView);
                        }
                    });
                    return;
                }
            }
            if (!z) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0);
            } else {
                linearLayoutManager.scrollToPositionWithOffset(i, 0);
                recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.o(linearLayoutManager, i, recyclerView);
                    }
                });
            }
        }
    }

    static /* synthetic */ void m(RecyclerView recyclerView, int i, PageOver pageOver, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        l(recyclerView, i, pageOver, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LinearLayoutManager linearLayoutManager, int i, RecyclerView recyclerView) {
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, recyclerView.getWidth() - viewFindViewByPosition.getWidth());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(LinearLayoutManager linearLayoutManager, int i, RecyclerView recyclerView) {
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, recyclerView.getWidth() - viewFindViewByPosition.getWidth());
        }
    }

    private static final void p(final RecyclerView recyclerView, final int i, PageOver pageOver, boolean z) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i < 0 || i >= itemCount) {
            return;
        }
        recyclerView.stopScroll();
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (pageOver != PageOver.NO) {
            c cVar = new c(z, recyclerView.getContext());
            cVar.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(cVar);
        } else if (!z) {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        } else {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
            recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.t
                @Override // java.lang.Runnable
                public final void run() {
                    w.r(linearLayoutManager, i, recyclerView);
                }
            });
        }
    }

    static /* synthetic */ void q(RecyclerView recyclerView, int i, PageOver pageOver, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        p(recyclerView, i, pageOver, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(LinearLayoutManager linearLayoutManager, int i, RecyclerView recyclerView) {
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, recyclerView.getHeight() - viewFindViewByPosition.getHeight());
        }
    }

    private static final void s(final RecyclerView recyclerView, final int i, PageOver pageOver) {
        if (i == 0) {
            return;
        }
        recyclerView.stopScroll();
        if (pageOver == PageOver.NO) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.r
                @Override // java.lang.Runnable
                public final void run() {
                    w.t(recyclerView, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(RecyclerView recyclerView, int i) {
        recyclerView.smoothScrollBy(i, 0);
    }

    private static final void u(final RecyclerView recyclerView, final int i, PageOver pageOver) {
        if (i == 0) {
            return;
        }
        recyclerView.stopScroll();
        if (pageOver == PageOver.NO) {
            recyclerView.scrollBy(0, i);
        } else {
            recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.s
                @Override // java.lang.Runnable
                public final void run() {
                    w.v(recyclerView, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(RecyclerView recyclerView, int i) {
        recyclerView.smoothScrollBy(0, i);
    }

    public static final boolean w(@fo.k RecyclerView recyclerView, int i, @fo.l ReadSetting readSetting, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (i == (adapter != null ? adapter.getItemCount() : 0) || i < 0) {
            return false;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (i < (adapter2 != null ? adapter2.getItemCount() : 0)) {
            ComicLinearLayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.zentraedi.comic.view.ComicLinearLayoutManager");
            x(layoutManager, i, readSetting, true, i2);
        }
        return true;
    }

    public static final void x(@fo.k ComicLinearLayoutManager layoutManager, int i, @fo.l ReadSetting readSetting, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        layoutManager.scrollToPositionWithOffset(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r3 <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        l(r13, r3 - 1, r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(@fo.k androidx.recyclerview.widget.RecyclerView r13, @fo.k com.zentraedi.comic.viewmodel.ReadSetting r14, @fo.k com.zentraedi.comic.viewmodel.PageOver r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.w.y(androidx.recyclerview.widget.RecyclerView, com.zentraedi.comic.viewmodel.ReadSetting, com.zentraedi.comic.viewmodel.PageOver):void");
    }

    public static final void z(@fo.k RecyclerView recyclerView, @fo.k PageOver pageOver, boolean z) {
        View viewFindViewByPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int height = (recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        int decoratedTop = linearLayoutManager.getDecoratedTop(viewFindViewByPosition);
        if (decoratedTop < -10 && z) {
            u(recyclerView, -Math.min(-decoratedTop, height), pageOver);
            return;
        }
        int i = iFindFirstVisibleItemPosition - 1;
        if (i >= 0) {
            p(recyclerView, i, pageOver, true);
        }
    }
}
