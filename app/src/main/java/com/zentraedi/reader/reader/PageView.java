package com.zentraedi.reader.reader;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.BatteryManager;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.V4ViewPager;
import com.artifex.mupdf.fitz.Document;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.function.utils.f0;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.s0;
import com.zentraedi.reader.BatteryView;
import com.zentraedi.reader.NovelRecycleView;
import com.zentraedi.reader.NovelViewPager;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;
import com.zentraedi.reader.adapter.view.NovelRelativeLayout;
import com.zentraedi.reader.event.BookMarkVisibleM;
import com.zentraedi.reader.view.CircleProgressBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class PageView extends RelativeLayout implements com.zentraedi.reader.c, com.zentraedi.reader.d, o0 {
    public static final int M5 = 1;
    public static final int N5 = 2;
    public static final int O5 = 3;
    public static final int P5 = 4;
    public static final int Q5 = 5;
    public static final int R5 = 0;
    public static final int S5 = 1;
    public static final int T5 = 2;
    public static final int U5 = 2;
    private static final Class<?> V5 = PageView.class;
    private int A;
    private TextView A3;
    private BatteryView A4;
    private final Runnable A5;
    private final int B;
    private final Runnable B5;
    private int C;
    private Paint C5;
    private String D;
    private com.zentraedi.reader.event.f.a D5;
    private String E;
    private final com.zentraedi.reader.reader.j E5;
    private boolean F;
    private boolean F5;
    private final Context G;
    private final ValueAnimator.AnimatorUpdateListener G5;
    private RecyclerView H;
    private View.OnClickListener H5;
    private int I;
    private int I5;
    private final com.zentraedi.reader.reader.i J;
    private boolean J5;
    private w K;
    private com.zentraedi.reader.simulation.b K5;
    private boolean L;
    private long L5;
    private boolean M;
    private int M1;
    private int M2;
    private final BroadcastReceiver M4;
    private boolean N;
    private final com.zentraedi.reader.event.e O;
    private long P;
    private boolean P2;
    private TextView P3;
    private TextView P4;
    private com.zentraedi.reader.adapter.d Q;
    private final com.zentraedi.reader.adapter.e.InterfaceC0201e Q2;
    private CircleProgressBar Q4;
    private List<LocalPdfBookModel.LocalPdfChapter> R;
    private boolean S;
    private int T;
    private View T2;
    private TextView T3;
    private int U;
    private int V;
    private Handler W;
    private View Z2;
    private ImageView Z4;
    final ImageView a;
    private Runnable a0;
    private com.zentraedi.reader.adapter.h a1;
    private boolean a2;
    NovelLinearLayout.a b;
    private com.zentraedi.reader.i b0;
    com.zentraedi.reader.reader.b c;
    private int c0;
    final x d;
    private int d0;
    private NovelViewPager e;
    private int e0;
    private NovelRelativeLayout f;
    private int f0;
    private com.zentraedi.reader.adapter.a g;
    private int g0;
    private final com.zentraedi.reader.reader.e h;
    private View.OnTouchListener h0;
    private int i;
    private int i0;
    private Typeface j;
    private String j0;
    private int k;
    private HashMap<Integer, ArrayList<Integer>> k0;
    private int l;
    private boolean l0;
    private int m;
    private boolean m0;
    private int n;
    private boolean n0;
    private int o;
    private boolean p;
    private v q;
    private com.zentraedi.reader.reader.d r;
    private com.zentraedi.reader.reader.m r1;
    private u s;
    private com.zentraedi.reader.pdf.d t;
    private RectF u;
    private TextView u5;
    private int v;
    private RelativeLayout v5;
    private int w;
    private int w5;
    private final int x;
    private RecyclerView.OnScrollListener x5;
    private final int y;
    private final Runnable y5;
    private final int z;
    private final Runnable z5;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageView.this.T1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PageView.this.H5 != null) {
                PageView.this.H5.onClick(view);
            }
        }
    }

    class c extends LinearLayoutManager {
        c(Context context) {
            super(context);
        }

        public boolean canScrollVertically() {
            return PageView.this.P2 && PageView.this.p;
        }
    }

    class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (PageView.this.s != null && PageView.this.s.b()) {
                PageView.this.s.a();
                return super.onSingleTapUp(motionEvent);
            }
            if (PageView.this.u.contains(x, y) && PageView.this.s != null) {
                PageView.this.s.a();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    class e extends RecyclerView.OnScrollListener {
        int a;
        boolean b;

        e() {
        }

        public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (PageView.this.x5 != null) {
                PageView.this.x5.onScrollStateChanged(recyclerView, i);
            }
            if (i == 0) {
                if (PageView.this.r1 != null && PageView.this.n2()) {
                    PageView pageView = PageView.this;
                    pageView.z1(pageView.M2, PageView.this.r1.l(), PageView.this.r1.h());
                }
                if (this.b) {
                    LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager == null) {
                        return;
                    }
                    if ((layoutManager instanceof LinearLayoutManager ? layoutManager.findLastVisibleItemPosition() : -1) == layoutManager.getItemCount() - 1) {
                        PageView.this.R1();
                    }
                }
            }
            PageView.this.L0();
        }

        public void onScrolled(@n0 RecyclerView recyclerView, int i, int i2) {
            this.b = false;
            if (PageView.this.x5 != null) {
                PageView.this.x5.onScrolled(recyclerView, i, i2);
            }
            LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            if (!recyclerView.canScrollVertically(-1)) {
                if (i2 != 0) {
                    this.a = 1;
                    int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
                    PageView pageView = PageView.this;
                    pageView.S1(1, pageView.a1.g(iFindFirstVisibleItemPosition));
                    if (PageView.this.r1 == null || PageView.this.h.t(PageView.this.r1.l()) || PageView.this.r1 == null || PageView.this.r1.h() != 0) {
                        return;
                    }
                    com.zentraedi.basic.function.ui.toast.a.y(PageView.this.getContext(), com.zentraedi.reader.h.q.zz2);
                    return;
                }
                return;
            }
            if (!recyclerView.canScrollVertically(1)) {
                if (i2 == 0) {
                    this.b = true;
                    return;
                }
                this.a = 2;
                int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
                PageView pageView2 = PageView.this;
                pageView2.S1(2, pageView2.a1.g(iFindLastVisibleItemPosition));
                if (PageView.this.r1 == null || PageView.this.h.s(PageView.this.r1.l())) {
                    return;
                }
                this.b = true;
                PageView.this.R1();
                return;
            }
            if (i2 != 0) {
                if (i2 < 0) {
                    this.a = 1;
                } else {
                    this.a = 2;
                }
                LinearLayoutManager linearLayoutManager = layoutManager;
                int iFindFirstVisibleItemPosition2 = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
                int i3 = iFindFirstVisibleItemPosition2;
                while (true) {
                    if (i3 > iFindLastVisibleItemPosition2) {
                        i3 = -1;
                        break;
                    } else if (PageView.this.a1.g(i3).o() == 1 || PageView.this.a1.g(i3).o() == 2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (PageView.this.r1 != null) {
                    for (int i4 = iFindFirstVisibleItemPosition2; i4 <= iFindLastVisibleItemPosition2; i4++) {
                        if (PageView.this.a1.g(i4).l() == PageView.this.r1.l() && PageView.this.a1.g(i4).h() == PageView.this.r1.h()) {
                            View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition2);
                            if (viewFindViewByPosition != null) {
                                int i5 = this.a;
                                if (i5 != 2) {
                                    if (i5 != 1) {
                                        break;
                                    }
                                    PageView.this.M1 = (int) viewFindViewByPosition.getY();
                                    break;
                                }
                                PageView.this.M1 = viewFindViewByPosition.getHeight() + ((int) viewFindViewByPosition.getY());
                                break;
                            }
                            return;
                        }
                    }
                } else {
                    PageView.this.M1 = 0;
                }
                if (i3 != -1) {
                    PageView pageView3 = PageView.this;
                    pageView3.S1(this.a, pageView3.a1.g(i3));
                    return;
                }
                View viewFindViewByPosition2 = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition2);
                if (viewFindViewByPosition2 == null) {
                    return;
                }
                if (viewFindViewByPosition2.getHeight() + viewFindViewByPosition2.getY() > (PageView.this.w * 2) / 3) {
                    PageView pageView4 = PageView.this;
                    pageView4.S1(this.a, pageView4.a1.g(iFindFirstVisibleItemPosition2));
                }
                int i6 = iFindFirstVisibleItemPosition2 + 1;
                View viewFindViewByPosition3 = layoutManager.findViewByPosition(i6);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3.getY() < PageView.this.w / 3) {
                    PageView pageView5 = PageView.this;
                    pageView5.S1(this.a, pageView5.a1.g(i6));
                }
            }
        }
    }

    class f implements com.zentraedi.reader.reader.b {
        f() {
        }

        @Override // com.zentraedi.reader.reader.b
        public void a() {
            if (PageView.this.s != null) {
                PageView.this.s.a();
            }
        }

        @Override // com.zentraedi.reader.reader.b
        public void b() {
            if (PageView.this.s != null && PageView.this.s.b()) {
                PageView.this.s.a();
            } else if (PageView.this.s != null) {
                PageView.this.s.c(PageView.this.J5, 2);
                PageView.this.v1();
            }
        }

        @Override // com.zentraedi.reader.reader.b
        public void c() {
            PageView.this.P1();
        }

        @Override // com.zentraedi.reader.reader.b
        public void d() {
            PageView.this.v1();
        }

        @Override // com.zentraedi.reader.reader.b
        public void e() {
            if (PageView.this.s != null && PageView.this.s.b()) {
                PageView.this.s.a();
                return;
            }
            if (PageView.this.s != null) {
                if (PageView.this.N) {
                    PageView.this.s.c(PageView.this.J5, 2);
                    PageView.this.v1();
                } else {
                    PageView.this.s.c(PageView.this.J5, 1);
                    PageView.this.P1();
                }
            }
        }
    }

    class g implements NovelLinearLayout.a {
        g() {
        }

        @Override // com.zentraedi.reader.adapter.view.NovelLinearLayout.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (PageView.this.I == 4) {
                return false;
            }
            if (!PageView.this.p && motionEvent.getAction() != 0) {
                return true;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (((PageView.this.f0 == 0 && PageView.this.g0 == 0) || Math.abs(PageView.this.f0 - PageView.this.d0) < PageView.this.x) && (PageView.this.d0 != 0 || PageView.this.e0 != 0)) {
                        if (PageView.this.u.contains(x, y)) {
                            if (PageView.this.s != null) {
                                PageView.this.s.a();
                            }
                            PageView.this.d0 = 0;
                            PageView.this.e0 = 0;
                            return true;
                        }
                        if (!PageView.this.n2()) {
                            if (PageView.this.s == null || !PageView.this.s.b()) {
                                PageView pageView = PageView.this;
                                if (!pageView.m1(pageView.d0, PageView.this.e0)) {
                                    PageView pageView2 = PageView.this;
                                    if (pageView2.l1(pageView2.d0, PageView.this.e0) && PageView.this.s != null) {
                                        PageView.this.s.c(PageView.this.J5, 2);
                                        PageView.this.v1();
                                    }
                                } else if (PageView.this.s != null) {
                                    if (PageView.this.N) {
                                        PageView.this.s.c(PageView.this.J5, 2);
                                        PageView.this.v1();
                                    } else {
                                        PageView.this.s.c(PageView.this.J5, 1);
                                        PageView.this.P1();
                                    }
                                }
                            } else {
                                PageView.this.s.a();
                            }
                        }
                    }
                    float x2 = motionEvent.getX() - PageView.this.d0;
                    float y2 = motionEvent.getY() - PageView.this.e0;
                    if (Math.abs(x2) > 100.0f && Math.abs(y2) < 200.0f) {
                        if (x2 > 0.0f) {
                            nd.a.e("nas_book", "PageView 右滑了");
                            PageView.this.P1();
                        } else {
                            nd.a.e("nas_book", "PageView 左滑了");
                            PageView.this.v1();
                        }
                    }
                    PageView.this.d0 = 0;
                    PageView.this.e0 = 0;
                } else if (action == 2) {
                    PageView.this.f0 = x;
                    PageView.this.g0 = y;
                    PageView pageView3 = PageView.this;
                    pageView3.d.a = pageView3.f0 - PageView.this.d0 > 0 ? 1 : 2;
                }
            } else {
                PageView.this.f0 = 0;
                PageView.this.g0 = 0;
                PageView.this.d0 = x;
                PageView.this.e0 = y;
            }
            return true;
        }
    }

    class h implements com.zentraedi.reader.pageflip.h {
        h() {
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean a() {
            List currentSectionList;
            com.zentraedi.reader.reader.m currentPage = PageView.this.getCurrentPage();
            if (currentPage == null || PageView.this.h.s(currentPage.l()) || (currentSectionList = PageView.this.getCurrentSectionList()) == null || j0.l(currentSectionList) || currentPage.h() != j0.i(currentSectionList) - 1) {
                return true;
            }
            PageView.this.R1();
            return false;
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean b() {
            com.zentraedi.reader.reader.m currentPage = PageView.this.getCurrentPage();
            if (currentPage == null || currentPage.l() != 0 || currentPage.h() != 0) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PageView.this.L5 <= 1000) {
                return false;
            }
            nd.a.a(com.zentraedi.reader.f.a, "mNoPreChapterToastDismiss 没有前一章了");
            com.zentraedi.basic.function.ui.toast.a.y(PageView.this.getContext(), com.zentraedi.reader.h.q.zz2);
            PageView.this.L5 = jCurrentTimeMillis;
            return false;
        }
    }

    class i implements com.zentraedi.reader.simulation.c.b {
        i() {
        }

        @Override // com.zentraedi.reader.simulation.c.b
        public void a(boolean z) {
            if (z) {
                PageView.this.w1(false);
            } else {
                PageView.this.Q1(false);
            }
        }

        @Override // com.zentraedi.reader.simulation.c.b
        public void onCancel() {
            nd.a.a(com.zentraedi.reader.f.a, "onCancel()");
        }
    }

    class j implements V4ViewPager.j {
        int a;
        int b = -1;
        int c = -1;

        j() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0048  */
        /* JADX WARN: Code duplicated, block: B:22:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0067  */
        public void onPageScrollStateChanged(int i) {
            PageView pageView;
            if (i != 0) {
                if (i == 1) {
                    PageView.this.M = false;
                    PageView.this.L0();
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    PageView.this.M = true;
                    return;
                }
            }
            PageView.this.L0();
            if (!PageView.this.M && PageView.this.getCurrentSectionPos() >= 0) {
                if (PageView.this.e.getCurrentItem() == 0) {
                    PageView pageView2 = PageView.this;
                    if (pageView2.d.a == 1) {
                        pageView2.u1();
                    } else if (PageView.this.e.getCurrentItem() == PageView.this.g.getCount() - 1) {
                        pageView = PageView.this;
                        if (pageView.d.a == 2) {
                            pageView.t1();
                        }
                    }
                } else if (PageView.this.e.getCurrentItem() == PageView.this.g.getCount() - 1) {
                    pageView = PageView.this;
                    if (pageView.d.a == 2) {
                        pageView.t1();
                    }
                }
            }
            PageView.this.M = true;
        }

        public void onPageScrolled(int i, float f, int i2) {
            PageView pageView = PageView.this;
            if (pageView.a != null && pageView.I != 4) {
                PageView pageView2 = PageView.this;
                pageView2.a.setTranslationX(pageView2.e.getWidth() - i2);
            }
            if (i2 != 0) {
                if (PageView.this.I == 3) {
                    PageView.this.p = false;
                    return;
                }
                return;
            }
            if (PageView.this.I == 3) {
                PageView.this.p = true;
            }
            if (PageView.this.getCurrentSectionPos() != -1 && PageView.this.L) {
                PageView.this.L = false;
                com.zentraedi.reader.reader.m mVarG = PageView.this.g.g(i);
                if (mVarG != null) {
                    PageView.this.z1(this.a, mVarG.l(), mVarG.h());
                }
            }
        }

        public void onPageSelected(int i) {
            com.zentraedi.reader.reader.m mVarG;
            if (PageView.this.S && (mVarG = PageView.this.g.g(i)) != null) {
                if (PageView.this.r1 == null) {
                    this.a = 0;
                } else if (mVarG.l() > PageView.this.r1.l()) {
                    this.a = 2;
                } else if (mVarG.l() != PageView.this.r1.l()) {
                    this.a = 1;
                } else if (mVarG.h() > PageView.this.r1.h()) {
                    this.a = 2;
                } else if (mVarG.h() == PageView.this.r1.h()) {
                    nd.a.a(com.zentraedi.reader.f.a, "page.getPosition() == mCurrentTxtPage.getPosition()");
                } else {
                    this.a = 1;
                }
                if (PageView.this.L) {
                    PageView.this.L = false;
                    PageView.this.z1(this.a, this.c, this.b);
                }
                PageView.this.L = true;
                this.c = mVarG.l();
                this.b = mVarG.h();
                PageView.this.S1(this.a, mVarG);
                if (PageView.this.I == 4) {
                    if (mVarG.o() == 1) {
                        PageView.this.e2(150L);
                    } else if (mVarG.o() == 2) {
                        PageView.this.e2(200L);
                    } else {
                        PageView.this.J0();
                    }
                }
            }
        }
    }

    class k implements com.zentraedi.reader.event.e {
        k() {
        }

        @Override // com.zentraedi.reader.event.e
        public void onEvent(com.zentraedi.reader.event.c cVar) {
            if (PageView.this.I == 4) {
                Object obj = cVar.b;
                if (obj instanceof com.zentraedi.reader.reader.m) {
                    com.zentraedi.reader.reader.m mVar = (com.zentraedi.reader.reader.m) obj;
                    if (PageView.this.K5 != null) {
                        PageView.this.K5.g(com.zentraedi.reader.simulation.b.e(mVar));
                    }
                }
            }
        }
    }

    class l implements com.zentraedi.reader.pdf.d {
        l() {
        }

        @Override // com.zentraedi.reader.pdf.d
        public void a() {
            nd.a.a(com.zentraedi.reader.f.a, "toggleUI()");
        }

        @Override // com.zentraedi.reader.pdf.d
        public void b() {
            nd.a.a(com.zentraedi.reader.f.a, "goBackward()");
        }

        @Override // com.zentraedi.reader.pdf.d
        public void c(String str) {
        }

        @Override // com.zentraedi.reader.pdf.d
        public void d(float f) {
            if (PageView.this.g == null) {
                return;
            }
            if (PageView.this.g instanceof com.zentraedi.reader.adapter.k) {
                com.zentraedi.reader.adapter.k kVar = (com.zentraedi.reader.adapter.k) PageView.this.g;
                if (Math.abs(f - kVar.z()) < 1.0E-6d) {
                    return;
                }
                kVar.D(f);
                kVar.q(PageView.this.e.getCurrentItem());
                kVar.notifyDataSetChanged();
                kVar.u();
                return;
            }
            if (PageView.this.g instanceof com.zentraedi.reader.adapter.m) {
                com.zentraedi.reader.adapter.m mVar = (com.zentraedi.reader.adapter.m) PageView.this.g;
                if (Math.abs(f - mVar.A()) < 1.0E-6d) {
                    return;
                }
                mVar.E(f);
                mVar.q(PageView.this.e.getCurrentItem());
                mVar.notifyDataSetChanged();
                mVar.v();
            }
        }

        @Override // com.zentraedi.reader.pdf.d
        public void e(int i, int i2) {
            nd.a.a(com.zentraedi.reader.f.a, "onPageViewSizeChanged()");
        }

        @Override // com.zentraedi.reader.pdf.d
        public void f() {
            nd.a.a(com.zentraedi.reader.f.a, "goForward()");
        }

        @Override // com.zentraedi.reader.pdf.d
        public void g(String str) {
            nd.a.a(com.zentraedi.reader.f.a, "gotoURI()");
        }
    }

    class m implements com.zentraedi.reader.adapter.e.InterfaceC0201e {
        m() {
        }

        @Override // com.zentraedi.reader.adapter.e.InterfaceC0201e
        public void a() {
            RecyclerView.Adapter adapter;
            PageView.this.P2 = true;
            if (!PageView.this.n2() || (adapter = PageView.this.H.getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }

        @Override // com.zentraedi.reader.adapter.e.InterfaceC0201e
        public void b() {
            PageView.this.P2 = false;
        }

        @Override // com.zentraedi.reader.adapter.e.InterfaceC0201e
        public void c() {
            PageView.this.P2 = true;
        }
    }

    class n extends BroadcastReceiver {
        n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                PageView.this.U1((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1));
            } else if ("android.intent.action.TIME_TICK".equals(action)) {
                PageView.this.a2();
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageView.this.I0();
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PageView.this.f != null) {
                PageView.this.f.setPageFlipViewVisible(false);
            }
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageView.this.I0();
            if (PageView.this.f != null) {
                PageView.this.f.f(PageView.this.K5);
            }
            PageView.this.W.removeCallbacks(PageView.this.z5);
            PageView.this.W.postDelayed(PageView.this.z5, 20L);
        }
    }

    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageView.this.O0();
        }
    }

    class s implements ValueAnimator.AnimatorUpdateListener {
        s() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PageView.this.m2((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f));
        }
    }

    class t implements Animator.AnimatorListener {
        final /* synthetic */ ObjectAnimator a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PageView.this.u5 != null) {
                    PageView.this.u5.setTextColor(PageView.this.getRewardTextColor());
                }
                PageView.this.b();
            }
        }

        t(ObjectAnimator objectAnimator) {
            this.a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "onAnimationCancel()");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            new Handler().postDelayed(new a(), 1000L);
            this.a.pause();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "onAnimationRepeat()");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "onAnimationStart()");
        }
    }

    public interface u {
        void a();

        boolean b();

        void c(boolean z, int i);

        void cancel();

        void d();
    }

    public interface v {
        void a(int i, int i2, int i3, Typeface typeface);
    }

    private class w implements com.zentraedi.reader.event.e {
        private w() {
        }

        @Override // com.zentraedi.reader.event.e
        public void onEvent(com.zentraedi.reader.event.c cVar) {
            if (PageView.this.getPageMode() != 4) {
                PageView.this.O0();
            } else {
                nd.a.a(com.zentraedi.reader.f.a, String.format("refreshBitmap messageId: %d ", Integer.valueOf(cVar.c)));
                PageView.this.e2(150L);
            }
        }

        /* synthetic */ w(PageView pageView, k kVar) {
            this();
        }
    }

    private static class x {
        int a;

        private x() {
        }

        /* synthetic */ x(k kVar) {
            this();
        }
    }

    public PageView(Context context) {
        this(context, null);
    }

    private void A1(int i2, int i3) {
        System.currentTimeMillis();
        com.zentraedi.reader.reader.d dVar = this.r;
        if (dVar != null) {
            dVar.F1(i2, i3);
        }
        TextView textView = this.P3;
        if (textView != null) {
            textView.setText(f(this.r1));
        }
    }

    private void E1(int i2, int i3, float f2) {
        List<LocalPdfBookModel.LocalPdfChapter> listW;
        com.zentraedi.reader.reader.m mVarG;
        if (this.g == null) {
            c1();
            this.e.setAdapter(this.g);
        }
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar instanceof com.zentraedi.reader.adapter.k) {
            listW = ((com.zentraedi.reader.adapter.k) aVar).v();
        } else {
            listW = aVar instanceof com.zentraedi.reader.adapter.m ? ((com.zentraedi.reader.adapter.m) aVar).w() : new ArrayList<>();
        }
        if (listW != null && i2 >= 0 && i2 < listW.size()) {
            i3 += listW.get(i2).getPage();
        }
        this.S = true;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e.setCurrentItemQuick(i4);
            mVarG = this.g.g(i4);
        } else {
            this.e.setCurrentItemQuick(i3);
            mVarG = this.g.g(i3);
        }
        if (mVarG != null) {
            S1(0, mVarG);
            z1(0, mVarG.l(), mVarG.h());
        }
    }

    private void F1(int i2, int i3) {
        com.zentraedi.reader.reader.m mVarG;
        if (this.F) {
            return;
        }
        List<LocalPdfBookModel.LocalPdfChapter> list = this.R;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            i3 += list.get(i2).getPage();
        }
        this.S = true;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.H.scrollToPosition(i4);
            mVarG = this.a1.g(i4);
        } else {
            this.H.scrollToPosition(i3);
            mVarG = this.a1.g(i3);
        }
        if (mVarG != null) {
            S1(0, mVarG);
            z1(0, mVarG.l(), mVarG.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        com.zentraedi.reader.simulation.b bVar;
        if (this.I != 4 || (bVar = this.K5) == null) {
            return;
        }
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        if (this.W == null) {
            this.W = new Handler();
        }
        this.W.removeCallbacks(this.y5);
        this.W.postDelayed(this.y5, 100L);
    }

    private void J1(int i2, int i3, float f2) {
        if (this.F) {
            return;
        }
        if (n2()) {
            this.M1 = 0;
            N1(i2, i3);
            return;
        }
        if (this.g == null) {
            c1();
            k1();
            this.e.setAdapter(this.g);
        }
        if (s1()) {
            E1(i2, i3, f2);
            return;
        }
        List<com.zentraedi.reader.reader.m> listE = this.J.e(null, i2);
        if (listE == null || listE.size() == 0) {
            return;
        }
        if (i3 < -1) {
            i3 = 0;
        }
        List<com.zentraedi.reader.reader.m> listW0 = W0(listE, i2);
        if (listW0 != null && listW0.size() > 0 && (i3 >= listW0.size() || i3 == -1)) {
            i3 = listW0.size() - 1;
        }
        int i4 = i3;
        ArrayList arrayList = new ArrayList();
        int iK = com.zentraedi.reader.reader.h.k(i2, i4, listE, arrayList, getMidAdOffset(), this.h.e());
        if (iK >= 0) {
            i4 = iK;
        }
        if (!j0.l(arrayList)) {
            listE = arrayList;
        }
        int iF = com.zentraedi.reader.reader.h.f(i2, i4, listE, 0);
        this.S = false;
        setData(listE);
        this.S = true;
        int currentItem = this.e.getCurrentItem();
        this.e.setCurrentItemQuick(iF);
        if (iF == 0 || currentItem == iF) {
            e2(150L);
            com.zentraedi.reader.reader.m mVarG = this.g.g(iF);
            if (mVarG != null) {
                S1(0, mVarG);
                z1(0, mVarG.l(), mVarG.h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        int currentSectionPos;
        com.zentraedi.reader.reader.a aVar = n2() ? this.a1 : this.g;
        this.J.a(getCurrentSectionPos());
        if (aVar == null || j0.l(aVar.getData()) || (currentSectionPos = getCurrentSectionPos()) < 0) {
            return;
        }
        if (this.h.t(currentSectionPos)) {
            com.zentraedi.reader.reader.h.i(currentSectionPos, aVar, this.J, getMidAdOffset(), this.h.e());
        }
        if (this.h.s(currentSectionPos)) {
            com.zentraedi.reader.reader.h.h(currentSectionPos, aVar, this.J, getMidAdOffset(), this.h.e());
        }
    }

    private void N1(int i2, int i3) {
        if (this.F) {
            return;
        }
        h1();
        if (s1()) {
            F1(i2, i3);
            return;
        }
        List<com.zentraedi.reader.reader.m> listE = this.J.e(null, i2);
        if (listE == null || listE.size() == 0) {
            return;
        }
        if (i3 < -1) {
            i3 = 0;
        }
        List<com.zentraedi.reader.reader.m> listW0 = W0(listE, i2);
        if (listW0 != null && listW0.size() > 0 && (i3 >= listW0.size() || i3 == -1)) {
            i3 = listW0.size() - 1;
        }
        int i4 = i3;
        ArrayList arrayList = new ArrayList();
        int iK = com.zentraedi.reader.reader.h.k(i2, i4, listE, arrayList, getMidAdOffset(), this.h.e());
        if (iK >= 0) {
            i4 = iK;
        }
        if (!j0.l(arrayList)) {
            listE = arrayList;
        }
        int iF = com.zentraedi.reader.reader.h.f(i2, i4, listE, 0);
        if (iF < 0) {
            iF = 0;
        }
        this.a1.H(listE);
        this.H.scrollToPosition(iF);
        LinearLayoutManager layoutManager = this.H.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPositionWithOffset(iF, this.M1);
        S1(0, this.a1.g(iF));
        z1(0, this.a1.g(iF).l(), this.a1.g(iF).h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        com.zentraedi.reader.simulation.b bVar = this.K5;
        if (bVar != null) {
            bVar.b();
        }
        NovelRelativeLayout novelRelativeLayout = this.f;
        if (novelRelativeLayout != null) {
            novelRelativeLayout.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1(boolean z) {
        RecyclerView recyclerView;
        if (this.F || n1()) {
            return;
        }
        NovelViewPager novelViewPager = this.e;
        if (novelViewPager == null) {
            if (!n2() || (recyclerView = this.H) == null) {
                return;
            }
            recyclerView.smoothScrollBy(0, -getViewRect()[1]);
            return;
        }
        if (novelViewPager.getCurrentItem() - 1 >= 0) {
            NovelViewPager novelViewPager2 = this.e;
            novelViewPager2.W(novelViewPager2.getCurrentItem() - 1, z);
            return;
        }
        int itemCount = this.g.getItemCount();
        L0();
        if (this.g.getItemCount() > itemCount) {
            NovelViewPager novelViewPager3 = this.e;
            novelViewPager3.W(novelViewPager3.getCurrentItem() - 1, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.P > 300) {
            this.P = jCurrentTimeMillis;
            u uVar = this.s;
            if (uVar != null) {
                uVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1(int i2, com.zentraedi.reader.reader.m mVar) {
        com.zentraedi.reader.reader.m mVar2;
        if (mVar == null || mVar == (mVar2 = this.r1)) {
            return;
        }
        if (mVar2 == null || mVar.l() != this.r1.l()) {
            this.r1 = mVar;
            y1(i2, mVar.l());
            A1(i2, mVar.h());
            this.M2 = i2;
            this.a2 = false;
            return;
        }
        if (this.r1 != mVar) {
            this.r1 = mVar;
            A1(i2, mVar.h());
            this.M2 = i2;
            this.a2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[PHI: r2
      0x00e6: PHI (r2v5 int) = (r2v4 int), (r2v4 int), (r2v4 int), (r2v6 int) binds: [B:27:0x0099, B:29:0x009f, B:31:0x00ac, B:42:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    public void T1() {
        long jL;
        int iG = 0;
        this.J.c();
        O0();
        if (this.r1 == null || getCurrentSectionPos() == -1) {
            return;
        }
        int iF = this.r1.f();
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar == null || eVar.i() == null) {
            jL = 0;
        } else {
            jL = this.h.i().l(this.r1.l(), iF);
            this.h.i().m();
        }
        int currentSectionPos = getCurrentSectionPos();
        this.J.a(currentSectionPos);
        nd.a.a(com.zentraedi.reader.f.a, String.format("currentTxtPage viewType = %d", Integer.valueOf(this.r1.o())));
        if (this.r1.o() != 3) {
            com.zentraedi.reader.reader.e eVar2 = this.h;
            if (eVar2 == null || eVar2.e() == null || this.h.e().o(currentSectionPos) != 0 || this.C == 1) {
                com.zentraedi.reader.reader.e eVar3 = this.h;
                if (eVar3 == null || eVar3.e() == null || this.h.e().o(currentSectionPos) != 2) {
                    iG = iF;
                } else {
                    if (this.h.i() == null) {
                        nd.a.h(com.zentraedi.reader.f.a, "rebuild  mPageLoader.getMupdfCache() == null");
                        return;
                    }
                    int iK = this.h.i().k(jL, currentSectionPos);
                    if (iK >= 0) {
                        iF = iK;
                    }
                    if (this.h.e() != null ? this.h.e().i(this.r1.l()) : false) {
                        iG = iF + 1;
                    } else {
                        iG = iF;
                    }
                }
            } else {
                iG = this.J.g(currentSectionPos, this.r1.m());
            }
        }
        this.r1 = null;
        J1(currentSectionPos, iG, -1.0f);
        e2(150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(int i2) {
        if (i2 > 100) {
            i2 = 100;
        }
        if (this.i0 == i2) {
            return;
        }
        this.i0 = i2;
        com.zentraedi.reader.event.c cVar = new com.zentraedi.reader.event.c();
        cVar.c = 1;
        cVar.a = i2;
        com.zentraedi.reader.event.a.a().b(cVar);
        BatteryView batteryView = this.A4;
        if (batteryView != null) {
            batteryView.setPower(i2);
        }
    }

    private List<com.zentraedi.reader.reader.m> V0(int i2) {
        if (this.g == null && this.a1 == null) {
            return new ArrayList();
        }
        return W0(n2() ? this.a1.getData() : this.g.getData(), i2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    private List<com.zentraedi.reader.reader.m> W0(List<com.zentraedi.reader.reader.m> list, int i2) {
        int size;
        if (j0.l(list)) {
            return null;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                i3 = -1;
                break;
            }
            if (list.get(i3).l() == i2) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            return null;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (list.get((list.size() - 1) - i4).l() == i2) {
                size = (list.size() - 1) - i4;
                if (size == -1) {
                    return null;
                }
                return j0.o(list, i3, size + 1);
            }
        }
        size = -1;
        if (size == -1) {
            return null;
        }
        return j0.o(list, i3, size + 1);
    }

    private void W1() {
        com.zentraedi.reader.reader.m mVar;
        if (this.T2 == null || this.Z2 == null) {
            return;
        }
        RelativeLayout relativeLayout = this.v5;
        if (relativeLayout != null) {
            relativeLayout.setBackground(getRewardBgResource());
            this.Q4.b(getRewardProgressNormalColor(), getRewardProgressColor());
            com.zentraedi.reader.event.f.a aVar = this.D5;
            int iC = aVar != null ? aVar.c() : 1;
            if (com.zentraedi.reader.reader.c.k(this.D5)) {
                this.v5.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(0);
                this.v5.findViewById(com.zentraedi.reader.h.i.X6).setBackground(d(4));
            } else {
                this.v5.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(8);
                this.Z4.setImageDrawable(d(iC));
            }
            this.u5.setTextColor(getRewardTextColor());
        }
        this.P3.setTextColor(getTipsPaint().getColor());
        this.A3.setTextColor(getTipsPaint().getColor());
        this.T3.setTextColor(getTipsPaint().getColor());
        this.P4.setTextColor(getTipsPaint().getColor());
        this.A4.setPaint(getBatteryPaint());
        if (getPageBackgroundResource() != 0) {
            this.T2.setBackgroundColor(androidx.core.content.e.g(this.G, com.zentraedi.reader.h.f.Zq));
            this.Z2.setBackgroundColor(androidx.core.content.e.g(this.G, com.zentraedi.reader.h.f.Zq));
        } else {
            this.T2.setBackgroundColor(getPageBackgroundColor());
            this.Z2.setBackgroundColor(getPageBackgroundColor());
        }
        if (this.A3 == null || (mVar = this.r1) == null || mVar == null || mVar.k() == null) {
            return;
        }
        this.A3.setText(this.r1.k().e);
    }

    private void Z1(boolean z, int i2, boolean z2) {
        com.zentraedi.reader.reader.e eVar;
        if (this.m0 == z && this.V == i2 && !z2) {
            return;
        }
        if (this.I == 4) {
            e2(650L);
        } else {
            O0();
        }
        NovelRelativeLayout novelRelativeLayout = this.f;
        if (novelRelativeLayout != null) {
            novelRelativeLayout.setNightMode(z);
        }
        if (this.m0 != z && (eVar = this.h) != null) {
            eVar.G(z);
            if (this.h.i() != null) {
                this.h.i().f();
                T1();
            }
        }
        this.m0 = z;
        this.V = i2;
        ImageView imageView = this.a;
        if (imageView != null) {
            if (z) {
                imageView.setBackgroundResource(com.zentraedi.reader.h.n.g);
            } else {
                imageView.setBackgroundResource(com.zentraedi.reader.h.n.f);
            }
            if (this.a.getParent() != null) {
                ((ViewGroup) this.a.getParent()).removeView(this.a);
            }
            addView(this.a, new RelativeLayout.LayoutParams(20, -1));
        }
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.c(3));
        if (n2()) {
            W1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.c(2));
        if (this.T3 != null) {
            this.T3.setText(s0.f(System.currentTimeMillis(), com.zentraedi.basic.function.utils.h.k));
        }
    }

    private void c1() {
        int i2 = this.C;
        if (i2 == 0) {
            this.g = new com.zentraedi.reader.adapter.g(getContext(), this, this, this.Q);
        } else if (i2 != 1) {
            nd.a.h(com.zentraedi.reader.f.a, "not handle");
        } else {
            this.g = new com.zentraedi.reader.adapter.k(getContext(), getPdfScaleListener(), this.b0, this, this, this.R, this.c0);
        }
    }

    private void c2() {
        if (this.l0) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        getContext().registerReceiver(this.M4, intentFilter);
        this.l0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2(long j2) {
        if (this.I == 4) {
            if (this.W == null) {
                this.W = new Handler();
            }
            this.W.removeCallbacks(this.B5);
            this.W.removeCallbacks(this.A5);
            this.W.removeCallbacks(this.z5);
            this.W.postDelayed(this.B5, 80L);
            this.W.postDelayed(this.A5, j2);
        }
    }

    private void f1() {
        com.zentraedi.reader.event.f.a aVar;
        this.T2 = LayoutInflater.from(this.G).inflate(com.zentraedi.reader.h.l.A8, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.G.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.bc));
        layoutParams.addRule(10);
        addView(this.T2, layoutParams);
        this.A3 = (TextView) this.T2.findViewById(com.zentraedi.reader.h.i.zj);
        this.Z4 = (ImageView) this.T2.findViewById(com.zentraedi.reader.h.i.G9);
        this.u5 = (TextView) this.T2.findViewById(com.zentraedi.reader.h.i.zq);
        this.Q4 = (CircleProgressBar) this.T2.findViewById(com.zentraedi.reader.h.i.m3);
        RelativeLayout relativeLayout = (RelativeLayout) this.T2.findViewById(com.zentraedi.reader.h.i.n3);
        this.v5 = relativeLayout;
        relativeLayout.setOnClickListener(new b());
        this.Z2 = LayoutInflater.from(this.G).inflate(com.zentraedi.reader.h.l.z8, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.G.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.C9));
        layoutParams2.addRule(12);
        addView(this.Z2, layoutParams2);
        this.P3 = (TextView) this.Z2.findViewById(com.zentraedi.reader.h.i.Yg);
        this.T3 = (TextView) this.Z2.findViewById(com.zentraedi.reader.h.i.x4);
        this.A4 = (BatteryView) this.Z2.findViewById(com.zentraedi.reader.h.i.M1);
        this.P4 = (TextView) this.Z2.findViewById(com.zentraedi.reader.h.i.Xq);
        W1();
        a2();
        b2(this.j0);
        BatteryView batteryView = this.A4;
        if (batteryView != null) {
            batteryView.setPower(this.i0);
        }
        CircleProgressBar circleProgressBar = this.Q4;
        if (circleProgressBar != null && this.v5 != null && (aVar = this.D5) != null) {
            circleProgressBar.c(aVar.b(), "");
            this.v5.setVisibility(this.D5.e());
            if (!TextUtils.isEmpty(this.D5.d())) {
                this.u5.setText(this.D5.d());
            }
        }
        this.P3.setText(f(this.r1));
    }

    private void g1() {
        int i2 = this.C;
        if (i2 == 0) {
            this.a1 = new com.zentraedi.reader.adapter.h(this.G, this, this, this.Q);
            return;
        }
        if (i2 != 1) {
            nd.a.h(com.zentraedi.reader.f.a, "not handle");
        } else {
            if (this.b0 == null || this.R == null || this.c0 == 0) {
                return;
            }
            this.a1 = new com.zentraedi.reader.adapter.i(this.G, this.b0, this, this, this.R, this.c0);
        }
    }

    private int getBatteryLevelSystem() {
        try {
            return ((BatteryManager) getContext().getSystemService("batterymanager")).getIntProperty(4);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.zentraedi.reader.reader.m> getCurrentSectionList() {
        return V0(getCurrentSectionPos());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentSectionPos() {
        com.zentraedi.reader.reader.m currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.l();
        }
        nd.a.h(com.zentraedi.reader.f.a, "current == null");
        return -1;
    }

    private void h1() {
        if (this.w == 0) {
            return;
        }
        if (this.H != null) {
            if (s1()) {
                this.H.getLayoutParams().height = -1;
                ((RelativeLayout.LayoutParams) this.H.getLayoutParams()).removeRule(3);
            }
            if (this.a1 == null) {
                g1();
                this.H.setAdapter(this.a1);
                return;
            }
            return;
        }
        if (this.e != null) {
            removeView(this.f);
            this.f.removeAllViews();
            this.g = null;
            this.e = null;
            this.f = null;
        }
        f1();
        this.H = LayoutInflater.from(this.G).inflate(com.zentraedi.reader.h.l.E8, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.w - this.y) - this.z);
        layoutParams.addRule(3, this.T2.getId());
        addView(this.H, layoutParams);
        this.H.setLayoutManager(new c(this.G));
        ((NovelRecycleView) this.H).setSimpleOnGestureListener(new d());
        g1();
        this.H.setAdapter(this.a1);
        this.H.addOnScrollListener(new e());
    }

    private void i1() {
        com.zentraedi.reader.adapter.d dVar = new com.zentraedi.reader.adapter.d();
        this.Q = dVar;
        dVar.b(new com.zentraedi.reader.adapter.c());
        this.d.a = 0;
        this.c = new f();
        this.b = new g();
    }

    private void k1() {
        NovelViewPager novelViewPager = this.e;
        if (novelViewPager != null) {
            novelViewPager.setNotIntercept(this.I == 5);
            this.f.setPageMode(this.I);
            return;
        }
        RecyclerView recyclerView = this.H;
        if (recyclerView != null) {
            removeView(recyclerView);
            this.H = null;
            removeView(this.T2);
            this.T2 = null;
            removeView(this.Z2);
            this.Z2 = null;
        }
        NovelRelativeLayout novelRelativeLayout = (NovelRelativeLayout) LayoutInflater.from(this.G).inflate(com.zentraedi.reader.h.l.D8, (ViewGroup) null);
        this.f = novelRelativeLayout;
        novelRelativeLayout.setPageMode(this.I);
        this.f.setClickLeftGoNext(this.N);
        NovelViewPager novelViewPager2 = (NovelViewPager) this.f.findViewById(com.zentraedi.reader.h.i.Kf);
        this.e = novelViewPager2;
        novelViewPager2.setNotIntercept(this.I == 5);
        addView(this.f);
        this.f.setTouchListener(this.s);
        this.f.setOnTouchListener(this.h0);
        this.f.setOnPageFlipListener(new h());
        com.zentraedi.reader.simulation.b bVar = new com.zentraedi.reader.simulation.b(this.G);
        this.K5 = bVar;
        bVar.j(this.e);
        this.f.setOnPageAnimationListener(new i());
        com.zentraedi.reader.event.a.a().c(101, this.O);
        this.K5.i(this);
        this.e.g(new j());
        this.t = new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l1(int i2, int i3) {
        int i4 = this.v;
        int i5 = this.A;
        if (i2 > (i4 + i5) / 2) {
            return true;
        }
        return i2 > (i4 - i5) / 2 && i3 > (this.w + this.B) / 2;
    }

    private void l2() {
        if (this.l0) {
            getContext().unregisterReceiver(this.M4);
            this.l0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m1(int i2, int i3) {
        int i4 = this.v;
        int i5 = this.A;
        if (i2 < (i4 - i5) / 2) {
            return true;
        }
        return i2 < (i4 + i5) / 2 && i3 < (this.w - this.B) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(int i2) {
        RelativeLayout relativeLayout;
        com.zentraedi.reader.event.f.a aVar = this.D5;
        if (aVar != null && i2 == aVar.b() && this.D5.e() == 0) {
            return;
        }
        if (this.D5 == null) {
            this.D5 = new com.zentraedi.reader.event.f.a(0, i2);
        }
        this.D5.g(i2);
        this.D5.j(0);
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.f(this.D5));
        if (this.Q4 == null || (relativeLayout = this.v5) == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        this.Q4.c(this.D5.b(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n2() {
        if (this.I != 2) {
            return false;
        }
        int i2 = this.C;
        return i2 == 0 || i2 == 1;
    }

    private static void o1() {
    }

    private void setData(List<com.zentraedi.reader.reader.m> list) {
        setPagesToAdapter(list);
    }

    private void setPagesToAdapter(List<com.zentraedi.reader.reader.m> list) {
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar != null) {
            aVar.o(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t1() {
        if (getCurrentSectionPos() == -1) {
            return false;
        }
        if (s1()) {
            if (this.e.getCurrentItem() == this.g.getCount() - 1) {
                R1();
            }
        } else if (this.h.s(getCurrentSectionPos())) {
            this.J.a(getCurrentSectionPos());
            if (this.J.i(getCurrentSectionPos() + 1)) {
                return true;
            }
            if (f0.h(getContext())) {
                com.zentraedi.basic.function.ui.toast.a.y(getContext(), com.zentraedi.reader.h.q.uz2);
            } else {
                com.zentraedi.basic.function.ui.toast.a.y(getContext(), com.zentraedi.reader.h.q.Bx2);
            }
        } else {
            R1();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1() {
        if (getCurrentSectionPos() == -1) {
            return;
        }
        if (!this.h.t(getCurrentSectionPos())) {
            nd.a.a(com.zentraedi.reader.f.a, "没有前一章了");
            com.zentraedi.basic.function.ui.toast.a.y(getContext(), com.zentraedi.reader.h.q.zz2);
            return;
        }
        this.J.a(getCurrentSectionPos());
        if (this.J.i(getCurrentSectionPos() - 1)) {
            nd.a.a(com.zentraedi.reader.f.a, "page view has cache");
        } else if (f0.h(getContext())) {
            com.zentraedi.basic.function.ui.toast.a.y(getContext(), com.zentraedi.reader.h.q.uz2);
        } else {
            com.zentraedi.basic.function.ui.toast.a.y(getContext(), com.zentraedi.reader.h.q.Bx2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w1(boolean z) {
        if (this.F || n1()) {
            return false;
        }
        NovelViewPager novelViewPager = this.e;
        if (novelViewPager != null) {
            if (this.g == null) {
                return false;
            }
            if (novelViewPager.getCurrentItem() + 1 >= this.g.getCount()) {
                int itemCount = this.g.getItemCount();
                L0();
                return this.g.getItemCount() > itemCount;
            }
            NovelViewPager novelViewPager2 = this.e;
            novelViewPager2.W(novelViewPager2.getCurrentItem() + 1, z);
        } else if (n2()) {
            this.H.smoothScrollBy(0, getViewRect()[1]);
            return this.H.canScrollVertically(1);
        }
        return true;
    }

    private void y1(int i2, int i3) {
        com.zentraedi.reader.reader.m mVar;
        System.currentTimeMillis();
        com.zentraedi.reader.reader.d dVar = this.r;
        if (dVar != null) {
            dVar.m1(i2, i3);
        }
        this.J.a(i3);
        if (this.A3 == null || (mVar = this.r1) == null || mVar.k() == null) {
            return;
        }
        this.A3.setText(this.r1.k().e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(int i2, int i3, int i4) {
        if (this.a2) {
            return;
        }
        System.currentTimeMillis();
        com.zentraedi.reader.reader.d dVar = this.r;
        if (dVar != null) {
            dVar.L0(i2, i3, i4);
        }
        this.a2 = true;
    }

    public void C1(int i2, int i3) {
        if (this.F) {
            return;
        }
        J1(i2, i3, -1.0f);
    }

    public void G1(int i2, int i3, List<com.zentraedi.reader.reader.k> list, float f2) {
        if (!this.F && i2 >= 0 && i3 >= -1 && list != null && !list.isEmpty() && i2 <= list.size() - 1) {
            this.n0 = true;
            this.r1 = null;
            this.h.B(list);
            this.J.c();
            this.J.a(i2);
            J1(i2, i3, f2);
            if (this.I == 4) {
                e2(250L);
            } else {
                O0();
            }
        }
    }

    public void H0() {
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof com.zentraedi.reader.adapter.k) {
            com.zentraedi.reader.adapter.k kVar = (com.zentraedi.reader.adapter.k) aVar;
            kVar.q(this.e.getCurrentItem());
            kVar.notifyDataSetChanged();
            kVar.u();
            return;
        }
        if (aVar instanceof com.zentraedi.reader.adapter.m) {
            com.zentraedi.reader.adapter.m mVar = (com.zentraedi.reader.adapter.m) aVar;
            mVar.q(this.e.getCurrentItem());
            mVar.notifyDataSetChanged();
            mVar.v();
        }
    }

    public void I1(int i2, int i3, List<com.zentraedi.reader.reader.k> list) {
        if (!this.F && i2 >= 0 && i3 >= 0 && list != null && list.size() != 0 && i2 <= list.size() - 1) {
            if (s1()) {
                C1(i2, i3);
                return;
            }
            this.n0 = true;
            this.r1 = null;
            this.h.B(list);
            this.J.c();
            this.J.a(i2);
            J1(i2, this.J.g(i2, i3), -1.0f);
            if (this.I == 4) {
                e2(200L);
            } else {
                O0();
            }
        }
    }

    public void M0(com.zentraedi.reader.adapter.b bVar) {
        com.zentraedi.reader.adapter.d dVar = this.Q;
        if (dVar != null) {
            dVar.b(bVar);
        }
    }

    public void N0(com.zentraedi.reader.reader.m mVar) {
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.d(-1, -1, mVar));
    }

    public void O1() {
        if (this.F) {
            return;
        }
        this.E5.d();
    }

    public void P0() {
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof com.zentraedi.reader.adapter.k) {
            ((com.zentraedi.reader.adapter.k) aVar).s();
        } else if (aVar instanceof com.zentraedi.reader.adapter.m) {
            ((com.zentraedi.reader.adapter.m) aVar).s();
        }
    }

    public void P1() {
        List<com.zentraedi.reader.reader.m> currentSectionList;
        if (n1()) {
            return;
        }
        int i2 = this.I;
        if (i2 != 4) {
            Q1(i2 != 5);
            return;
        }
        com.zentraedi.reader.reader.m currentPage = getCurrentPage();
        if (currentPage == null) {
            return;
        }
        if (this.h.t(currentPage.l()) || (currentSectionList = getCurrentSectionList()) == null || j0.l(currentSectionList) || currentPage.h() != 0) {
            this.f.setPageFlipViewVisible(true);
            this.f.getPageFlipView().b();
        }
    }

    public void Q0() {
        this.F = true;
        this.n0 = false;
        this.J.c();
        O0();
        setAdapter(null);
        setOnPageChangeListener(null);
        setOnThemeChangeListener(null);
        setOnTouchListener(null);
        setTouchListener(null);
        com.zentraedi.reader.adapter.d dVar = this.Q;
        if (dVar != null) {
            dVar.c();
            this.Q = null;
        }
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.W = null;
        }
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar != null) {
            aVar.n();
        }
        this.E5.c();
        com.zentraedi.reader.event.a.a().d(101, this.O);
        com.zentraedi.reader.simulation.b bVar = this.K5;
        if (bVar != null) {
            bVar.d();
        }
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar == null || eVar.i() == null) {
            return;
        }
        this.h.i().f();
    }

    public List<com.zentraedi.reader.reader.m> S0(int i2) {
        return V0(i2);
    }

    public String T0(int i2) {
        List<com.zentraedi.reader.reader.m> currentSectionList = getCurrentSectionList();
        StringBuilder sb = new StringBuilder();
        if (currentSectionList == null || currentSectionList.size() <= i2) {
            nd.a.h(com.zentraedi.reader.f.a, "pages == null || pages.size() <= pos");
            return "";
        }
        List<String> listE = currentSectionList.get(i2).e();
        if (listE == null || listE.size() == 0) {
            nd.a.h(com.zentraedi.reader.f.a, "lines == null || lines.size() == 0");
            return "";
        }
        sb.append(listE.get(0));
        if (listE.size() > 1) {
            sb.append(listE.get(1));
        }
        return sb.toString();
    }

    public String U0(int i2) {
        List<com.zentraedi.reader.reader.m> currentSectionList = getCurrentSectionList();
        if (currentSectionList == null || currentSectionList.size() <= i2) {
            nd.a.h(com.zentraedi.reader.f.a, "mCurPageList == null || mCurPageList.size() <= pos");
            return "";
        }
        List<String> listE = currentSectionList.get(i2).e();
        StringBuilder sb = new StringBuilder();
        if (listE == null || listE.size() == 0) {
            nd.a.h(com.zentraedi.reader.f.a, "pageContent == null || pageContent.size() == 0");
            return "";
        }
        if (listE.size() >= 2) {
            sb.append(listE.get(listE.size() - 2));
        }
        sb.append(listE.get(listE.size() - 1));
        return sb.toString();
    }

    public void V1(BookMarkVisibleM bookMarkVisibleM) {
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.c(8, bookMarkVisibleM));
        e2(150L);
    }

    public com.zentraedi.reader.reader.m X0(int i2) {
        List<com.zentraedi.reader.reader.m> currentSectionList = getCurrentSectionList();
        if (currentSectionList == null || i2 < 0 || currentSectionList.size() <= i2) {
            return null;
        }
        return currentSectionList.get(i2);
    }

    public com.zentraedi.reader.reader.m Y0(int i2, int i3) {
        List<com.zentraedi.reader.reader.m> listV0 = V0(i2);
        if (listV0 == null || i3 < 0 || listV0.size() <= i3) {
            return null;
        }
        return listV0.get(i3);
    }

    public void Y1(boolean z, int i2) {
        Z1(z, i2, false);
    }

    @Override // com.zentraedi.reader.c
    public void a(int i2, String str) {
        if (this.D5 == null) {
            this.D5 = new com.zentraedi.reader.event.f.a(8, 0);
        }
        this.D5.h(i2);
        this.D5.i(str);
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.f(this.D5));
        if (!n2() || this.u5 == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.D5.d())) {
            this.u5.setText(this.D5.d());
        }
        if (i2 == 3) {
            this.u5.setTextColor(androidx.core.content.e.g(this.G, com.zentraedi.reader.h.f.e6));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.u5, "translationY", 200.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.removeAllListeners();
            objectAnimatorOfFloat.addListener(new t(objectAnimatorOfFloat));
            objectAnimatorOfFloat.start();
        }
        if (com.zentraedi.reader.reader.c.k(this.D5)) {
            this.v5.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(0);
            this.v5.findViewById(com.zentraedi.reader.h.i.X6).setBackground(d(4));
        } else {
            this.v5.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(8);
            this.Z4.setImageDrawable(d(i2));
        }
    }

    public void a1() {
        if (this.F) {
            return;
        }
        RelativeLayout relativeLayout = this.v5;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (this.D5 == null) {
            this.D5 = new com.zentraedi.reader.event.f.a(8, 0);
        }
        this.D5.j(8);
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.f(this.D5));
    }

    @Override // com.zentraedi.reader.c
    public void b() {
        int i2;
        if (this.F) {
            return;
        }
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.reader.h.q.Ty2);
        com.zentraedi.reader.event.f.a aVarA = this.D5.a();
        if (aVarA != null) {
            int iC = aVarA.c();
            String strD = aVarA.d();
            i2 = iC;
            strN = strD;
        } else {
            i2 = 2;
        }
        TextView textView = this.u5;
        if (textView != null) {
            textView.setText(strN);
        }
        a(i2, strN);
    }

    public void b1(com.zentraedi.reader.reader.m mVar, int i2, int i3) {
        if (mVar == null || i2 < 0 || i3 <= 0 || i2 >= i3) {
            return;
        }
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.d(i2, i3, mVar));
    }

    public void b2(String str) {
        this.j0 = str;
        if (!n2()) {
            com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.c(7, str));
            return;
        }
        if (this.P4 == null || this.G == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || IdentifierConstant.OAID_STATE_DEFAULT.equals(str)) {
            this.P4.setVisibility(8);
        } else {
            this.P4.setVisibility(0);
            this.P4.setText(this.G.getString(com.zentraedi.reader.h.q.ox2, str));
        }
    }

    @Override // com.zentraedi.reader.c
    public boolean c() {
        return this.m0;
    }

    @Override // com.zentraedi.reader.c
    public Drawable d(int i2) {
        if (i2 == 4) {
            return this.m0 ? androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.n.m) : androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.n.l);
        }
        return this.m0 ? androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.n.k) : androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.n.j);
    }

    public void d1(TxtAttribute txtAttribute) {
        nd.a.e("nas_book", "PageView->initAttribute attribute=" + txtAttribute);
        this.i = txtAttribute.getTextSizePx();
        this.j = txtAttribute.getFontTypeface();
        this.U = txtAttribute.getPageMargin();
        this.T = txtAttribute.getLineSpace();
        this.I5 = txtAttribute.getParagraphSpace();
        setPageMode(txtAttribute.getPageMode());
        this.k = txtAttribute.getTextColor();
        i2(txtAttribute.getBackgroundColorId(), txtAttribute.getBackgroundImageId());
        setClickLeftGoNext(txtAttribute.getClickLeftGoNext());
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.J(this.i);
            this.h.M(this.j);
            this.h.D(this.T);
            this.h.H(this.I5);
            this.h.I(this.k);
            this.h.L(this.k);
            this.h.K(this.k);
            this.h.F(this.U);
        }
    }

    @Override // com.zentraedi.reader.d
    public boolean e(int i2, int i3) {
        HashMap<Integer, ArrayList<Integer>> map = this.k0;
        if (map != null && !j0.l(map.get(Integer.valueOf(i2)))) {
            ArrayList<Integer> arrayList = this.k0.get(Integer.valueOf(i2));
            List<com.zentraedi.reader.reader.m> listS0 = S0(i2);
            if (j0.l(listS0) || arrayList == null) {
                return false;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (i3 == this.h.l(i2, arrayList.get(i4).intValue(), listS0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.zentraedi.reader.c
    @n0
    public String f(com.zentraedi.reader.reader.m mVar) {
        if (mVar == null) {
            nd.a.h(com.zentraedi.reader.f.a, "page == null");
            return "";
        }
        if (s1()) {
            return com.zentraedi.reader.reader.c.c(mVar.i() + 1.0f, mVar.n());
        }
        if (mVar.k() != null && mVar.k().c == 5) {
            return com.zentraedi.reader.reader.c.d(mVar.l() + 1.0f, this.h.p().size(), mVar.f() + 1.0f, mVar.n());
        }
        if (this.h.s(getCurrentSectionPos())) {
            return com.zentraedi.reader.reader.c.c(mVar.p(), mVar.k().h);
        }
        List<com.zentraedi.reader.reader.m> listS0 = S0(getCurrentSectionPos());
        com.zentraedi.reader.reader.m mVar2 = (com.zentraedi.reader.reader.m) j0.j(listS0, j0.i(listS0) - 1);
        return (mVar2 != null && mVar2.h() == mVar.h() && mVar2.l() == mVar.l()) ? com.zentraedi.reader.reader.c.c(mVar.k().h, mVar.k().h) : com.zentraedi.reader.reader.c.c(mVar.p(), mVar.k().h);
    }

    public void f2(List<LocalPdfBookModel.LocalPdfChapter> list) {
        this.R = list;
        com.zentraedi.reader.adapter.a aVar = this.g;
        if (aVar instanceof com.zentraedi.reader.adapter.k) {
            com.zentraedi.reader.adapter.k kVar = (com.zentraedi.reader.adapter.k) aVar;
            kVar.A();
            kVar.v();
            int i2 = this.c0;
            if (i2 != 0) {
                kVar.x(i2);
                return;
            }
            return;
        }
        if (aVar instanceof com.zentraedi.reader.adapter.m) {
            com.zentraedi.reader.adapter.m mVar = (com.zentraedi.reader.adapter.m) aVar;
            mVar.B();
            mVar.w();
            int i3 = this.c0;
            if (i3 != 0) {
                mVar.z(i3);
            }
        }
    }

    public boolean g2(int i2) {
        if (i2 > 0 && n2()) {
            this.H.smoothScrollBy(0, i2);
            com.zentraedi.reader.reader.m mVar = this.r1;
            if (mVar != null) {
                return this.h.s(mVar.l()) || this.H.canScrollVertically(1);
            }
        }
        return false;
    }

    @Override // com.zentraedi.reader.d
    public int getBatteryLevel() {
        return this.i0;
    }

    @Override // com.zentraedi.reader.c
    public Paint getBatteryPaint() {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            return eVar.f();
        }
        return null;
    }

    @Override // com.zentraedi.reader.c
    public int getBookmarkResource() {
        return this.o;
    }

    @Override // com.zentraedi.reader.c
    public com.zentraedi.reader.adapter.e.InterfaceC0201e getColorAnimationListener() {
        return this.Q2;
    }

    public String getContentProgress() {
        return f(getCurrentPage());
    }

    @Override // com.zentraedi.reader.c
    public com.zentraedi.reader.reader.g getContentProperty() {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            return eVar.g();
        }
        return null;
    }

    @Override // com.zentraedi.reader.c
    public int getContentTextColor() {
        return this.k;
    }

    public int getCountPages() {
        return this.c0;
    }

    public com.zentraedi.reader.reader.m getCurrentPage() {
        return this.r1;
    }

    public Document getDocument() {
        return null;
    }

    public int getHeaderViewHeight() {
        if (n2()) {
            return this.G.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.bc);
        }
        return com.zentraedi.reader.reader.c.f(this.G) ? this.G.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Kc) : this.G.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Kb);
    }

    @Override // com.zentraedi.reader.c
    public Paint getHighlightPaint() {
        return this.C5;
    }

    @Override // com.zentraedi.reader.d
    public NovelLinearLayout.a getInnerOnTouchListener() {
        return this.b;
    }

    @Override // com.zentraedi.reader.c
    public int getMarginWidth() {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            return eVar.h();
        }
        nd.a.h(com.zentraedi.reader.f.a, "mPageLoader == null");
        return 0;
    }

    public int getMidAdOffset() {
        return this.w5;
    }

    @Override // com.zentraedi.reader.c
    public com.zentraedi.reader.pdf.f getMupdfCache() {
        return this.h.i();
    }

    @Override // com.zentraedi.reader.d
    public View.OnTouchListener getOnTouchListener() {
        return this.h0;
    }

    @Override // com.zentraedi.reader.c
    public int getPageBackgroundColor() {
        return this.m;
    }

    @Override // com.zentraedi.reader.c
    public int getPageBackgroundResource() {
        return this.n;
    }

    @Override // com.zentraedi.reader.d
    public com.zentraedi.reader.reader.b getPageClickEvent() {
        return this.c;
    }

    @Override // com.zentraedi.reader.c
    public int getPageMode() {
        return this.I;
    }

    @Override // com.zentraedi.reader.d
    public com.zentraedi.reader.pdf.d getPdfScaleListener() {
        return this.t;
    }

    public List<String> getPreTwoLineContent() {
        ArrayList arrayList = new ArrayList();
        com.zentraedi.reader.reader.m currentPage = getCurrentPage();
        if (currentPage != null && currentPage.e() != null) {
            int i2 = 0;
            for (String str : currentPage.e()) {
                if (i2 >= 2) {
                    break;
                }
                if (str.trim().length() > 0) {
                    arrayList.add(str);
                    i2++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.zentraedi.reader.c
    public View.OnClickListener getProgressOnClickListener() {
        return this.H5;
    }

    @Override // com.zentraedi.reader.c
    public com.zentraedi.reader.event.f.a getProgressState() {
        return this.D5;
    }

    public com.zentraedi.reader.i getReaderDraw() {
        return this.b0;
    }

    @Override // com.zentraedi.reader.c
    public Drawable getRewardBgResource() {
        return this.m0 ? androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.C0203h.hV) : androidx.core.content.e.l(getContext(), com.zentraedi.reader.h.C0203h.gV);
    }

    @Override // com.zentraedi.reader.c
    public int getRewardProgressColor() {
        return this.m0 ? androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.V1) : androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.F1);
    }

    @Override // com.zentraedi.reader.c
    public int getRewardProgressNormalColor() {
        return this.m0 ? androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.l1) : androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.q1);
    }

    @Override // com.zentraedi.reader.c
    public int getRewardTextColor() {
        return this.m0 ? androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.t3) : androidx.core.content.e.g(getContext(), com.zentraedi.reader.h.f.w2);
    }

    public int getTextColor() {
        return this.k;
    }

    public int getTextSize() {
        return this.i;
    }

    @Override // com.zentraedi.reader.c
    public Paint getTipsPaint() {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            return eVar.q();
        }
        return null;
    }

    public int getTitleColor() {
        return this.l;
    }

    @Override // com.zentraedi.reader.c
    public com.zentraedi.reader.reader.g getTitleProperty() {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            return eVar.r();
        }
        return null;
    }

    @Override // com.zentraedi.reader.d
    public String getTypefaceDownloadProgress() {
        return this.j0;
    }

    @Override // com.zentraedi.reader.c
    public int getViewMode() {
        return this.V;
    }

    @Override // com.zentraedi.reader.c
    public int[] getViewRect() {
        return new int[]{this.v, (this.w - this.y) - this.z};
    }

    public void h2(int i2, String str) {
        if (this.F) {
            return;
        }
        if (this.D5 == null) {
            this.D5 = new com.zentraedi.reader.event.f.a(8, 0);
        }
        com.zentraedi.reader.event.f.a aVarA = this.D5.a();
        if (aVarA == null) {
            aVarA = new com.zentraedi.reader.event.f.a(8, 0);
            this.D5.f(aVarA);
        }
        aVarA.h(i2);
        aVarA.i(str);
    }

    public void i2(int i2, int i3) {
        if (i2 == this.m && this.n == i3) {
            return;
        }
        nd.a.e("nas_book", "PageView->setPageBackgroundColorAndResource color=" + i2 + " resId=" + i3);
        O0();
        this.m = i2;
        this.n = i3;
        setBackgroundResource(i3);
        if (i3 == 0) {
            setBackgroundColor(this.m);
        }
        v vVar = this.q;
        if (vVar != null) {
            vVar.a(this.k, this.m, this.i, this.j);
        }
        Z1(this.m0, this.V, true);
    }

    public void j2() {
        RelativeLayout relativeLayout;
        if (this.F) {
            return;
        }
        if (this.D5 == null) {
            this.D5 = new com.zentraedi.reader.event.f.a(0, 0);
        }
        this.D5.j(0);
        com.zentraedi.reader.event.a.a().b(new com.zentraedi.reader.event.f(this.D5));
        if (this.Q4 == null || (relativeLayout = this.v5) == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        this.Q4.c(this.D5.b(), "");
    }

    public void k2() {
        if (this.F) {
            return;
        }
        if (!this.F5) {
            this.E5.b(this.G5);
            this.F5 = true;
        }
        this.E5.g();
    }

    public boolean n1() {
        return this.J5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2();
    }

    @f1(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        this.K = new w(this, null);
        com.zentraedi.reader.event.a.a().c(6, this.K);
        com.zentraedi.reader.event.a.a().c(105, this.K);
    }

    @f1(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        com.zentraedi.reader.event.a.a().d(6, this.K);
        com.zentraedi.reader.event.a.a().d(105, this.K);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l2();
    }

    @f1(Lifecycle.Event.ON_RESUME)
    void onResume() {
        if (!this.F && this.n0) {
            a2();
            e2(100L);
            int batteryLevelSystem = getBatteryLevelSystem();
            if (batteryLevelSystem > 0) {
                U1(batteryLevelSystem);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.v = (i2 - getLeft()) - getPaddingRight();
        int paddingBottom = (i3 - getPaddingBottom()) - getPaddingTop();
        this.w = paddingBottom;
        int i6 = this.v;
        this.A = i6 / 3;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.C(i6, (paddingBottom - this.y) - this.z);
        }
        int i7 = this.v;
        int i8 = this.A;
        this.u = new RectF((i7 - i8) / 2.0f, 0.0f, (i7 + i8) / 2.0f, this.w);
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        if (i3 == i5 && i2 == i4) {
            return;
        }
        if (this.W == null) {
            this.W = new Handler();
        }
        if (this.a0 == null) {
            this.a0 = new a();
        }
        this.W.postDelayed(this.a0, 100L);
    }

    public boolean p1() {
        return this.n0;
    }

    public boolean q1() {
        com.zentraedi.reader.reader.m mVar = this.r1;
        return mVar != null && mVar.o() == 3;
    }

    public boolean s1() {
        int i2 = this.C;
        return i2 == 1 || i2 == 2;
    }

    public void setAdapter(com.zentraedi.reader.reader.f fVar) {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.A(fVar);
        }
    }

    public void setBookMarkMap(HashMap<Integer, ArrayList<Integer>> map) {
        this.k0 = map;
    }

    public void setBookMarkResource(int i2) {
        this.o = i2;
    }

    public void setCanTouch(boolean z) {
        this.p = z;
    }

    public void setClickLeftGoNext(boolean z) {
        this.N = z;
        NovelRelativeLayout novelRelativeLayout = this.f;
        if (novelRelativeLayout != null) {
            novelRelativeLayout.setClickLeftGoNext(z);
        }
    }

    public void setCountPages(int i2) {
        this.c0 = i2;
    }

    public void setCoverPath(String str) {
        this.D = str;
    }

    public void setDocument(Document document) {
    }

    public void setFilePath(String str) {
        this.E = str;
    }

    public void setFileType(int i2) {
        this.C = i2;
    }

    public void setForbiddenChangePage(boolean z) {
        this.J5 = z;
    }

    public void setHighLightColor(int i2) {
        if (this.C5 == null) {
            this.C5 = new Paint();
        }
        this.C5.setColor(getResources().getColor(i2));
    }

    public void setLineSpacing(int i2) {
        if (this.F || i2 == this.T) {
            return;
        }
        this.T = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.D(i2);
        }
        T1();
    }

    public void setOnPageChangeListener(com.zentraedi.reader.reader.d dVar) {
        this.r = dVar;
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.x5 = onScrollListener;
    }

    public void setOnThemeChangeListener(v vVar) {
        this.q = vVar;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.h0 = onTouchListener;
        NovelRelativeLayout novelRelativeLayout = this.f;
        if (novelRelativeLayout != null) {
            novelRelativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    public void setPageMargin(int i2) {
        if (this.F || this.U == i2) {
            return;
        }
        this.U = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.F(i2);
        }
        T1();
    }

    public void setPageMode(int i2) {
        int iL;
        int iH;
        o1();
        if (i2 == this.I) {
            return;
        }
        com.zentraedi.reader.reader.m currentPage = getCurrentPage();
        if (currentPage != null) {
            iL = currentPage.l();
            iH = currentPage.h();
            List<com.zentraedi.reader.reader.m> listS0 = S0(iL);
            if (listS0 != null && !j0.l(listS0)) {
                for (int i3 = 0; i3 < listS0.size(); i3++) {
                    com.zentraedi.reader.reader.m mVar = listS0.get(i3);
                    if (mVar.h() <= iH && mVar.o() == 1) {
                        iH--;
                    }
                }
            }
        } else {
            iL = -1;
            iH = -1;
        }
        this.I = i2;
        if (i2 == 1) {
            k1();
            this.e.a0(true, new com.zentraedi.reader.viewpagertransformers.c());
        } else if (i2 == 2) {
            h1();
        } else if (i2 == 3) {
            k1();
            this.e.a0(true, new com.zentraedi.reader.viewpagertransformers.b());
        } else if (i2 == 4) {
            k1();
        } else if (i2 != 5) {
            this.I = 1;
            k1();
            this.e.a0(true, new com.zentraedi.reader.viewpagertransformers.c());
        } else {
            k1();
            this.e.a0(true, new com.zentraedi.reader.viewpagertransformers.b());
        }
        if (currentPage != null && iL >= 0 && iH >= 0) {
            J1(iL, iH, -1.0f);
        }
        if (i2 == 4) {
            e2(150L);
        } else {
            O0();
        }
    }

    public void setParagraphSize(int i2) {
        if (this.F || this.I5 == i2) {
            return;
        }
        this.I5 = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.H(i2);
        }
        T1();
    }

    public void setProgressDuration(long j2) {
        if (this.F) {
            return;
        }
        this.E5.f(j2);
    }

    public void setProgressOnClickListener(View.OnClickListener onClickListener) {
        this.H5 = onClickListener;
    }

    public void setReaderDraw(com.zentraedi.reader.i iVar) {
        this.b0 = iVar;
    }

    public void setTextColor(int i2) {
        this.k = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.I(i2);
        }
        v vVar = this.q;
        if (vVar != null) {
            vVar.a(this.k, this.m, this.i, this.j);
        }
    }

    public void setTextSize(int i2) {
        this.i = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.J(i2);
        }
        T1();
        v vVar = this.q;
        if (vVar != null) {
            vVar.a(this.k, this.m, this.i, this.j);
        }
    }

    public void setTipColor(int i2) {
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.K(i2);
        }
        v vVar = this.q;
        if (vVar != null) {
            vVar.a(this.k, this.m, this.i, this.j);
        }
    }

    public void setTitleColor(int i2) {
        this.l = i2;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.L(i2);
        }
    }

    public void setTouchListener(u uVar) {
        this.s = uVar;
        NovelRelativeLayout novelRelativeLayout = this.f;
        if (novelRelativeLayout != null) {
            novelRelativeLayout.setTouchListener(uVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        this.j = typeface;
        com.zentraedi.reader.reader.e eVar = this.h;
        if (eVar != null) {
            eVar.M(typeface);
        }
        T1();
        v vVar = this.q;
        if (vVar != null) {
            vVar.a(this.k, this.m, this.i, this.j);
        }
    }

    public boolean v1() {
        List<com.zentraedi.reader.reader.m> currentSectionList;
        if (n1()) {
            return false;
        }
        int i2 = this.I;
        if (i2 != 4) {
            return w1(i2 != 5);
        }
        com.zentraedi.reader.reader.m currentPage = getCurrentPage();
        if (currentPage == null) {
            return false;
        }
        if (!this.h.s(currentPage.l()) && (currentSectionList = getCurrentSectionList()) != null && !j0.l(currentSectionList) && currentPage.h() == j0.i(currentSectionList) - 1) {
            R1();
            return false;
        }
        if (this.f.getPageFlipView() != null) {
            this.f.setPageFlipViewVisible(true);
            this.f.getPageFlipView().a();
        }
        return true;
    }

    public void x1(int i2) {
        List<com.zentraedi.reader.reader.m> data;
        if (this.F) {
            return;
        }
        this.J.j(i2);
        if (getCurrentSectionPos() == -1) {
            return;
        }
        com.zentraedi.reader.reader.a aVar = n2() ? this.a1 : this.g;
        if (aVar == null || (data = aVar.getData()) == null || data.size() <= 0 || i2 < data.get(0).l() || i2 > data.get(data.size() - 1).l()) {
            return;
        }
        Iterator<com.zentraedi.reader.reader.m> it = data.iterator();
        while (it.hasNext()) {
            if (it.next().l() == i2) {
                this.J.a(getCurrentSectionPos());
                if (this.r1 != null) {
                    J1(getCurrentSectionPos(), this.r1.h(), -1.0f);
                    return;
                }
                return;
            }
        }
    }

    public PageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageView(Context context, AttributeSet attributeSet, int i2) {
        Resources resources;
        int i3;
        super(context, attributeSet, i2);
        this.d = new x(null);
        this.i = 40;
        this.k = -14606047;
        this.l = -16777216;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = true;
        this.u = null;
        this.v = 0;
        this.w = 0;
        this.C = 0;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = new k();
        this.P = 0L;
        this.R = null;
        this.V = -1;
        this.b0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.k0 = new HashMap<>(1);
        this.n0 = false;
        this.M2 = -1;
        this.P2 = true;
        this.Q2 = new m();
        this.M4 = new n();
        this.y5 = new o();
        this.z5 = new p();
        this.A5 = new q();
        this.B5 = new r();
        this.E5 = new com.zentraedi.reader.reader.j();
        this.G5 = new s();
        this.L5 = 0L;
        this.G = context;
        this.x = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        com.zentraedi.reader.reader.e eVar = new com.zentraedi.reader.reader.e(this);
        this.h = eVar;
        this.J = new com.zentraedi.reader.reader.i(eVar);
        this.a = new ImageView(context);
        i1();
        if (com.zentraedi.reader.reader.c.f(context)) {
            resources = context.getResources();
            i3 = com.zentraedi.reader.h.g.Kc;
        } else {
            resources = context.getResources();
            i3 = com.zentraedi.reader.h.g.Kb;
        }
        this.y = resources.getDimensionPixelOffset(i3);
        this.z = context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.C9);
        this.A = context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.D5);
        this.B = context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.ea);
    }
}
