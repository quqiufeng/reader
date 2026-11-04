package com.zentraedi.comic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.zentraedi.comic.viewmodel.PageOver;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicPullToRefreshRecyclerView extends PullToRefreshBase<e0> {

    @fo.l
    private e0 L;

    @fo.l
    private PullToRefreshBase.Orientation M;

    @fo.l
    private ReadModel N;

    @fo.k
    private PageOver O;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PullToRefreshBase.Orientation.values().length];
            try {
                iArr[PullToRefreshBase.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullToRefreshBase.Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComicPullToRefreshRecyclerView(@fo.k Context context, @fo.l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.N = ReadModel.SCROLL_READ;
        this.O = PageOver.NO;
    }

    private final int getFirstVisiblePosition() {
        LinearLayoutManager layoutManager = ((e0) ((PullToRefreshBase) this).j).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager.findFirstVisibleItemPosition();
        }
        return 0;
    }

    private final int getLastVisiblePosition() {
        LinearLayoutManager layoutManager = ((e0) ((PullToRefreshBase) this).j).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager.findLastVisibleItemPosition();
        }
        return 0;
    }

    protected boolean B() {
        if (this.O != PageOver.SCROLL) {
            return false;
        }
        return this.N == ReadModel.MANGA_READ ? e0() : d0();
    }

    protected boolean C() {
        if (this.O != PageOver.SCROLL) {
            return false;
        }
        return this.N == ReadModel.MANGA_READ ? c0() : b0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @fo.k
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public e0 v(@fo.k Context context, @fo.l AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        e0 e0Var = new e0(context, attributeSet);
        this.L = e0Var;
        Intrinsics.checkNotNull(e0Var);
        return e0Var;
    }

    public final boolean b0() {
        View childAt;
        RecyclerView.Adapter adapter = ((e0) ((PullToRefreshBase) this).j).getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        if (getFirstVisiblePosition() < 1 && (childAt = ((e0) ((PullToRefreshBase) this).j).getChildAt(0)) != null) {
            if (this.M == PullToRefreshBase.Orientation.HORIZONTAL) {
                Log.d("PullToRefresh", " firstVisibleChild.left----" + childAt.getLeft() + " mRefreshableView.left----" + ((e0) ((PullToRefreshBase) this).j).getLeft());
                return childAt.getLeft() >= ((e0) ((PullToRefreshBase) this).j).getLeft();
            }
            Log.d("PullToRefresh", " firstVisibleChild.top----" + childAt.getTop() + " mRefreshableView.top----" + ((e0) ((PullToRefreshBase) this).j).getTop());
            if (childAt.getTop() >= ((e0) ((PullToRefreshBase) this).j).getTop()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c0() {
        View childAt;
        RecyclerView.Adapter adapter = ((e0) ((PullToRefreshBase) this).j).getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        if (getFirstVisiblePosition() < 1 && (childAt = ((e0) ((PullToRefreshBase) this).j).getChildAt(0)) != null) {
            if (this.M == PullToRefreshBase.Orientation.HORIZONTAL) {
                Log.d("PullToRefresh", " firstVisibleChild.right----" + childAt.getRight() + " mRefreshableView.right----" + ((e0) ((PullToRefreshBase) this).j).getRight());
                return childAt.getRight() <= ((e0) ((PullToRefreshBase) this).j).getRight();
            }
            Log.d("PullToRefresh", " firstVisibleChild.top----" + childAt.getTop() + " mRefreshableView.top----" + ((e0) ((PullToRefreshBase) this).j).getTop());
            if (childAt.getTop() >= ((e0) ((PullToRefreshBase) this).j).getTop()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d0() {
        RecyclerView.Adapter adapter = ((e0) ((PullToRefreshBase) this).j).getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int lastVisiblePosition = getLastVisiblePosition();
        if (lastVisiblePosition >= itemCount) {
            View childAt = ((e0) ((PullToRefreshBase) this).j).getChildAt(lastVisiblePosition - getFirstVisiblePosition());
            if (childAt != null) {
                if (this.M == PullToRefreshBase.Orientation.HORIZONTAL) {
                    Log.d("PullToRefresh", " lastVisibleChild.right ----" + childAt.getRight() + " mRefreshableView.left----" + ((e0) ((PullToRefreshBase) this).j).getRight());
                    return childAt.getRight() <= ((e0) ((PullToRefreshBase) this).j).getRight();
                }
                Log.d("PullToRefresh", "lastVisibleChild.bottom----" + childAt.getBottom() + "mRefreshableView.bottom----" + ((e0) ((PullToRefreshBase) this).j).getBottom());
                if (childAt.getBottom() <= ((e0) ((PullToRefreshBase) this).j).getBottom()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e0() {
        RecyclerView.Adapter adapter = ((e0) ((PullToRefreshBase) this).j).getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int lastVisiblePosition = getLastVisiblePosition();
        if (lastVisiblePosition >= itemCount) {
            View childAt = ((e0) ((PullToRefreshBase) this).j).getChildAt(lastVisiblePosition - getFirstVisiblePosition());
            if (childAt != null) {
                if (this.M == PullToRefreshBase.Orientation.HORIZONTAL) {
                    Log.d("PullToRefresh", " lastVisibleChild.left ----" + childAt.getLeft() + " mRefreshableView.left----" + ((e0) ((PullToRefreshBase) this).j).getLeft());
                    return childAt.getLeft() >= ((e0) ((PullToRefreshBase) this).j).getLeft();
                }
                Log.d("PullToRefresh", "lastVisibleChild.bottom----" + childAt.getBottom() + "mRefreshableView.bottom----" + ((e0) ((PullToRefreshBase) this).j).getBottom());
                if (childAt.getBottom() <= ((e0) ((PullToRefreshBase) this).j).getBottom()) {
                    return true;
                }
            }
        }
        return false;
    }

    @fo.l
    public final PullToRefreshBase.Orientation getMOrientation() {
        return this.M;
    }

    @fo.l
    public final e0 getMZoomRecyclerView() {
        return this.L;
    }

    @fo.k
    public final PageOver getPageOver() {
        return this.O;
    }

    @fo.k
    public PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        PullToRefreshBase.Orientation orientation = this.M;
        return orientation == null ? PullToRefreshBase.Orientation.VERTICAL : orientation;
    }

    @fo.l
    /* JADX INFO: renamed from: getReadModel, reason: collision with other method in class */
    public final ReadModel m0getReadModel() {
        return this.N;
    }

    public final void setMOrientation(@fo.l PullToRefreshBase.Orientation orientation) {
        this.M = orientation;
    }

    public final void setMZoomRecyclerView(@fo.l e0 e0Var) {
        this.L = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOrientationAndRef(@fo.k PullToRefreshBase.Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.M = orientation;
        int i = a.$EnumSwitchMapping$0[getPullToRefreshScrollDirection().ordinal()];
        if (i == 1) {
            setOrientation(0);
        } else if (i != 2) {
            setOrientation(1);
        } else {
            setOrientation(1);
        }
        setGravity(17);
        Z();
    }

    public final void setPageOver(@fo.k PageOver pageOver) {
        Intrinsics.checkNotNullParameter(pageOver, "<set-?>");
        this.O = pageOver;
    }

    public final void setReadModel(@fo.l ReadModel readModel) {
        this.N = readModel;
        Z();
    }

    public int getReadModel() {
        ReadModel readModel = this.N;
        return !Intrinsics.areEqual(readModel != null ? readModel.name() : null, "MANGA_READ") ? 1 : 0;
    }
}
