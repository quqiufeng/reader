package com.zentraedi.reader.adapter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.p0;
import com.zentraedi.reader.NovelViewPager;
import com.zentraedi.reader.pageflip.g;
import com.zentraedi.reader.pageflip.h;
import com.zentraedi.reader.reader.PageView;
import com.zentraedi.reader.reader.m;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class NovelRelativeLayout extends RelativeLayout {
    public static final Class<?> o = NovelRelativeLayout.class;
    private PageView.u a;
    private int b;
    private final int c;
    private int d;
    private int e;
    private com.zentraedi.reader.simulation.c f;
    private RelativeLayout g;
    private com.zentraedi.reader.simulation.c.b h;
    private int i;
    private boolean j;
    private NovelViewPager k;
    private h l;
    private boolean m;
    private boolean n;

    class a implements com.zentraedi.reader.simulation.c.b {
        a() {
        }

        @Override // com.zentraedi.reader.simulation.c.b
        public void a(boolean z) {
            NovelRelativeLayout.this.g.setVisibility(8);
            if (NovelRelativeLayout.this.h != null) {
                NovelRelativeLayout.this.h.a(z);
            }
        }

        @Override // com.zentraedi.reader.simulation.c.b
        public void onCancel() {
            NovelRelativeLayout.this.g.setVisibility(8);
        }
    }

    class b implements g {
        b() {
        }

        @Override // com.zentraedi.reader.pageflip.g
        public void a() {
            if (NovelRelativeLayout.this.a != null) {
                NovelRelativeLayout.this.a.a();
            }
            NovelRelativeLayout.this.g.setVisibility(8);
        }

        @Override // com.zentraedi.reader.pageflip.g
        public boolean b() {
            if (NovelRelativeLayout.this.a == null || !NovelRelativeLayout.this.a.b()) {
                return false;
            }
            NovelRelativeLayout.this.a.a();
            return true;
        }
    }

    class c implements h {
        c() {
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean a() {
            if (NovelRelativeLayout.this.l != null) {
                return NovelRelativeLayout.this.l.a();
            }
            return false;
        }

        @Override // com.zentraedi.reader.pageflip.h
        public boolean b() {
            if (NovelRelativeLayout.this.l != null) {
                return NovelRelativeLayout.this.l.b();
            }
            return false;
        }
    }

    public NovelRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        NovelLinearLayout novelLinearLayout;
        return (this.i != 4 || (novelLinearLayout = getNovelLinearLayout()) == null || novelLinearLayout.dispatchTouchEvent(motionEvent)) ? super.dispatchTouchEvent(motionEvent) : onTouchEvent(motionEvent);
    }

    public void e() {
        com.zentraedi.reader.simulation.c cVar = this.f;
        if (cVar != null) {
            this.g.removeView(cVar);
            this.f = null;
            this.g.setVisibility(8);
        }
    }

    public void f(com.zentraedi.reader.simulation.b bVar) {
        if (this.f == null) {
            com.zentraedi.reader.simulation.c cVar = new com.zentraedi.reader.simulation.c(getContext(), bVar);
            this.f = cVar;
            cVar.setOnPageAnimationListener(new a());
            this.f.setOnPageClickListener(new b());
            this.f.setListener(new c());
            this.f.getHolder().setFormat(-3);
            this.f.setNightMode(this.j);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(com.zentraedi.reader.h.i.If);
            this.g = relativeLayout;
            relativeLayout.addView(this.f, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.g.setVisibility(0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public NovelLinearLayout getNovelLinearLayout() {
        if (this.k == null) {
            this.k = (NovelViewPager) findViewById(com.zentraedi.reader.h.i.Kf);
        }
        int childCount = this.k.getChildCount();
        m mVarG = ((com.zentraedi.reader.adapter.a) this.k.getAdapter()).g(this.k.getCurrentItem());
        for (int i = 0; i < childCount; i++) {
            View childAt = this.k.getChildAt(i);
            if (childAt.getTag() instanceof m) {
                m mVar = (m) childAt.getTag();
                if (mVar.l() == mVarG.l() && mVar.h() == mVarG.h()) {
                    return (NovelLinearLayout) childAt;
                }
            }
        }
        return null;
    }

    public com.zentraedi.reader.simulation.c getPageFlipView() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = (i - getLeft()) - getPaddingRight();
        this.e = (i2 - getPaddingBottom()) - getPaddingTop();
        this.b = (int) (((double) this.d) * 0.36d);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i != 4) {
            return super.onTouchEvent(motionEvent);
        }
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = this.d;
        int i2 = this.b;
        if (x > (i - i2) / 2.0f && x < (i + i2) / 2.0f && y < (this.e - this.c) / 2.0f) {
            x = ((i - i2) / 2.0f) - 5.0f;
        }
        if (x < (i + i2) / 2.0f && x > (i - i2) / 2.0f && y > (this.e + this.c) / 2.0f) {
            x = ((i + i2) / 2.0f) + 5.0f;
        }
        if (motionEvent.getAction() == 0) {
            if (x > 0.0f) {
                int i3 = this.d;
                int i4 = this.b;
                if (x >= (i3 - i4) / 2.0f || !this.m) {
                    this.n = false;
                } else {
                    x += (i3 + i4) / 2.0f;
                    this.n = true;
                }
            } else {
                this.n = false;
            }
        }
        if (this.n && (motionEvent.getAction() == 1 || motionEvent.getAction() == 2)) {
            x += (this.d + this.b) / 2.0f;
        }
        if (this.f != null) {
            if (motionEvent.getAction() == 0) {
                this.f.e(x, y);
            } else if (motionEvent.getAction() == 2) {
                this.f.f(x, y);
            } else if (motionEvent.getAction() == 1) {
                this.f.g(x, y);
            }
        }
        return true;
    }

    public void setClickLeftGoNext(boolean z) {
        this.m = z;
    }

    public void setNightMode(boolean z) {
        this.j = z;
        com.zentraedi.reader.simulation.c cVar = this.f;
        if (cVar != null) {
            cVar.setNightMode(z);
        }
    }

    public void setOnPageAnimationListener(com.zentraedi.reader.simulation.c.b bVar) {
        this.h = bVar;
    }

    public void setOnPageFlipListener(h hVar) {
        this.l = hVar;
    }

    public void setPageFlipViewVisible(boolean z) {
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    public void setPageMode(int i) {
        this.i = i;
    }

    public void setTouchListener(PageView.u uVar) {
        this.a = uVar;
    }

    public NovelRelativeLayout(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NovelRelativeLayout(Context context, @p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = 0;
        this.i = -1;
        this.m = false;
        this.n = false;
        this.c = context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.ea);
    }
}
