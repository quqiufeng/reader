package com.zentraedi.reader.adapter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i0;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.function.utils.s0;
import com.zentraedi.reader.BatteryView;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;
import com.zentraedi.reader.event.BookMarkVisibleM;
import com.zentraedi.reader.view.CircleProgressBar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public abstract class e {
    private static final Class<?> u = e.class;
    protected final Context a;
    protected NovelLinearLayout b;
    protected final com.zentraedi.reader.c c;
    protected final com.zentraedi.reader.d d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    protected BatteryView i;
    protected com.zentraedi.reader.reader.m k;
    protected int l;
    private ImageView m;
    private RelativeLayout n;
    private CircleProgressBar o;
    private ImageView p;
    private TextView q;
    private final List<Integer> r;
    private int s;
    private boolean t = false;
    protected final com.zentraedi.reader.event.e j = new a();

    class a implements com.zentraedi.reader.event.e {
        a() {
        }

        @Override // com.zentraedi.reader.event.e
        public void onEvent(com.zentraedi.reader.event.c cVar) {
            if (cVar == null) {
                return;
            }
            int i = cVar.c;
            if (i == 1) {
                e.this.p(cVar.a);
                return;
            }
            if (i == 2) {
                e.this.s();
                return;
            }
            if (i == 3) {
                e eVar = e.this;
                eVar.w(eVar.c.getColorAnimationListener());
                return;
            }
            if (i == 7) {
                e.this.t((String) cVar.b);
                return;
            }
            if (i == 8) {
                Object obj = cVar.b;
                if ((obj instanceof BookMarkVisibleM) && e.this.k != null && ((BookMarkVisibleM) obj).getSection() == e.this.k.l() && ((BookMarkVisibleM) cVar.b).getPagePosition() == e.this.k.h()) {
                    e.this.q(((BookMarkVisibleM) cVar.b).isVisible());
                    return;
                }
                return;
            }
            if (i != 9) {
                e.this.onEvent(cVar);
            } else if (cVar instanceof com.zentraedi.reader.event.f) {
                e.this.r(((com.zentraedi.reader.event.f) cVar).a());
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (e.this.c.getProgressOnClickListener() != null) {
                e.this.c.getProgressOnClickListener().onClick(view);
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (e.this.r != null) {
                for (int i = 0; i < e.this.r.size(); i++) {
                    com.zentraedi.reader.event.a.a().c(((Integer) e.this.r.get(i)).intValue(), e.this.j);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (e.this.r != null) {
                for (int i = 0; i < e.this.r.size(); i++) {
                    com.zentraedi.reader.event.a.a().d(((Integer) e.this.r.get(i)).intValue(), e.this.j);
                }
            }
        }
    }

    class d implements Animator.AnimatorListener {
        final /* synthetic */ ObjectAnimator a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.c.b();
                e.this.q.setTextColor(e.this.c.getRewardTextColor());
                e.this.t = false;
            }
        }

        d(ObjectAnimator objectAnimator) {
            this.a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            new Handler().postDelayed(new a(), 1000L);
            this.a.pause();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            nd.a.a(com.zentraedi.reader.f.a, "");
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.reader.adapter.e$e, reason: collision with other inner class name */
    public interface InterfaceC0201e {
        void a();

        void b();

        void c();
    }

    public e(Context context, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar, @i0 int i) {
        this.a = context;
        this.c = cVar;
        this.d = dVar;
        o(i);
        this.r = new ArrayList();
        x(1);
        x(2);
        x(3);
        x(7);
        x(8);
        x(102);
        x(9);
    }

    private void o(int i) {
        Context context;
        NovelLinearLayout novelLinearLayout = (NovelLinearLayout) LayoutInflater.from(this.a).inflate(com.zentraedi.reader.h.l.C8, (ViewGroup) null);
        this.b = novelLinearLayout;
        novelLinearLayout.setClickable(true);
        RelativeLayout relativeLayout = (RelativeLayout) this.b.findViewById(com.zentraedi.reader.h.i.Y3);
        if (this.d.getOnTouchListener() != null) {
            this.b.setOnTouchListener(this.d.getOnTouchListener());
        }
        if (this.c.getPageMode() != 2) {
            this.b.setInnerOnTouchListener(this.d.getInnerOnTouchListener());
        }
        relativeLayout.addView(LayoutInflater.from(this.a).inflate(i, (ViewGroup) null));
        RelativeLayout relativeLayout2 = (RelativeLayout) this.b.findViewById(com.zentraedi.reader.h.i.t7);
        this.m = (ImageView) this.b.findViewById(com.zentraedi.reader.h.i.a9);
        this.e = (TextView) this.b.findViewById(com.zentraedi.reader.h.i.zj);
        this.f = (TextView) this.b.findViewById(com.zentraedi.reader.h.i.Yg);
        this.g = (TextView) this.b.findViewById(com.zentraedi.reader.h.i.Xq);
        this.h = (TextView) this.b.findViewById(com.zentraedi.reader.h.i.x4);
        this.i = (BatteryView) this.b.findViewById(com.zentraedi.reader.h.i.M1);
        this.p = (ImageView) this.b.findViewById(com.zentraedi.reader.h.i.G9);
        this.q = (TextView) this.b.findViewById(com.zentraedi.reader.h.i.zq);
        this.n = (RelativeLayout) this.b.findViewById(com.zentraedi.reader.h.i.n3);
        this.o = (CircleProgressBar) this.b.findViewById(com.zentraedi.reader.h.i.m3);
        this.n.setOnClickListener(new b());
        this.b.addOnAttachStateChangeListener(new c());
        v();
        this.l = this.c.getContentTextColor();
        if (relativeLayout2 == null || (context = this.a) == null || this.n == null) {
            return;
        }
        if (com.zentraedi.reader.reader.c.f(context)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
            layoutParams.height = this.a.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Kc);
            relativeLayout2.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
            layoutParams2.addRule(11);
            this.n.setLayoutParams(layoutParams2);
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams3.height = this.a.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Kb);
        relativeLayout2.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
        layoutParams4.addRule(0, com.zentraedi.reader.h.i.a9);
        this.n.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i) {
        BatteryView batteryView = this.i;
        if (batteryView != null) {
            batteryView.setPower(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z) {
        if (!z || l() == 2) {
            this.b.findViewById(com.zentraedi.reader.h.i.a9).setVisibility(8);
        } else {
            this.b.findViewById(com.zentraedi.reader.h.i.a9).setBackgroundResource(this.c.getBookmarkResource());
            this.b.findViewById(com.zentraedi.reader.h.i.a9).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(com.zentraedi.reader.event.f.a aVar) {
        if (l() == 2 || aVar == null) {
            return;
        }
        if (com.zentraedi.reader.reader.c.k(aVar)) {
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(0);
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setBackground(this.c.d(4));
        } else {
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(8);
            this.p.setImageDrawable(this.c.d(aVar.c()));
        }
        this.n.setVisibility(aVar.e());
        this.o.c(aVar.b(), "");
        this.q.setText(aVar.d());
        if (aVar.c() != 3 || this.t) {
            return;
        }
        this.t = true;
        this.q.setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.e6));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.q, "translationY", 200.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.removeAllListeners();
        objectAnimatorOfFloat.addListener(new d(objectAnimatorOfFloat));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.h != null) {
            this.h.setText(s0.f(System.currentTimeMillis(), com.zentraedi.basic.function.utils.h.k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        if (this.g == null || this.a == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || IdentifierConstant.OAID_STATE_DEFAULT.equals(str)) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(this.a.getString(com.zentraedi.reader.h.q.ox2, str));
        }
    }

    private void v() {
        y();
        this.f.setTextColor(this.c.getTipsPaint().getColor());
        this.e.setTextColor(this.c.getTipsPaint().getColor());
        this.h.setTextColor(this.c.getTipsPaint().getColor());
        this.g.setTextColor(this.c.getTipsPaint().getColor());
        this.i.setPaint(this.c.getBatteryPaint());
        this.m.setBackgroundResource(this.c.getBookmarkResource());
        this.o.b(this.c.getRewardProgressNormalColor(), this.c.getRewardProgressColor());
        int iC = this.c.getProgressState() != null ? this.c.getProgressState().c() : 1;
        if (com.zentraedi.reader.reader.c.k(this.c.getProgressState())) {
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(0);
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setBackground(this.c.d(4));
        } else {
            this.b.findViewById(com.zentraedi.reader.h.i.X6).setVisibility(8);
            this.p.setImageDrawable(this.c.d(iC));
        }
        this.n.setBackground(this.c.getRewardBgResource());
        this.q.setTextColor(this.c.getRewardTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(InterfaceC0201e interfaceC0201e) {
        try {
            this.l = this.c.getContentTextColor();
            u(this.c.c(), this.c.getViewMode());
            v();
            if (interfaceC0201e != null) {
                interfaceC0201e.a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void y() {
        if (this.c.getPageBackgroundResource() == 0) {
            this.b.setBackgroundResource(0);
            this.b.setBackgroundColor(this.c.getPageBackgroundColor());
        } else if (l() == 2) {
            this.b.setBackgroundColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.Zq));
        } else {
            this.b.setBackgroundResource(this.c.getPageBackgroundResource());
        }
    }

    protected void A() {
        this.b.findViewById(com.zentraedi.reader.h.i.U6).setVisibility(8);
    }

    protected void B() {
        this.b.findViewById(com.zentraedi.reader.h.i.t7).setVisibility(8);
    }

    public void j() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.h;
        if (textView3 != null) {
            textView3.setText("");
        }
    }

    public abstract void k(com.zentraedi.reader.reader.m mVar);

    public int l() {
        return this.c.getPageMode();
    }

    public View m() {
        return this.b;
    }

    public void n() {
        if (l() == 2) {
            B();
            A();
            this.b.setPadding(0, 0, 0, 0);
        }
    }

    public abstract void onEvent(com.zentraedi.reader.event.c cVar);

    public abstract void u(boolean z, int i);

    public void x(int i) {
        this.r.add(Integer.valueOf(i));
    }

    protected final void z(com.zentraedi.reader.reader.m mVar) {
        j();
        this.k = mVar;
        k(mVar);
        s();
        t(this.d.getTypefaceDownloadProgress());
        p(this.d.getBatteryLevel());
        q(l() != 2 && this.d.e(mVar.l(), mVar.h()));
        if (l() == 2) {
            this.n.setVisibility(8);
        } else {
            r(this.c.getProgressState());
        }
        this.e.setText(mVar.k().e);
        this.f.setText(this.c.f(mVar));
        v();
    }
}
