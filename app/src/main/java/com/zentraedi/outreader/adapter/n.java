package com.zentraedi.outreader.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.model.TypefaceM;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class n extends com.chad.library.adapter.base.c<TypefaceM, com.chad.library.adapter.base.e> {
    private g V;
    private final Context W;
    private long X;
    private boolean Y;

    class a implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        a(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.m2() || n.this.V == null) {
                return;
            }
            n.this.V.d(v, this.a);
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        b(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.m2() || n.this.V == null) {
                return;
            }
            n.this.V.b(v, this.a);
        }
    }

    class c implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        c(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.V != null) {
                n.this.V.c(v, this.a);
            }
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        d(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.m2() || n.this.V == null) {
                return;
            }
            n.this.V.d(v, this.a);
        }
    }

    class e implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        e(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.m2() || n.this.V == null) {
                return;
            }
            n.this.V.d(v, this.a);
        }
    }

    class f implements View.OnClickListener {
        final /* synthetic */ TypefaceM a;

        f(final TypefaceM val$item) {
            this.a = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (n.this.V != null) {
                n.this.V.a(v, this.a);
            }
        }
    }

    public interface g {
        void a(View view, TypefaceM item);

        void b(View view, TypefaceM item);

        void c(View view, TypefaceM item);

        void d(View view, TypefaceM item);
    }

    public n(Context context) {
        super(com.zentraedi.outreader.d.l.Ib);
        this.Y = false;
        this.W = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void d0(final com.chad.library.adapter.base.e helper, final TypefaceM item) {
        if (item == null) {
            return;
        }
        helper.N(com.zentraedi.outreader.d.i.CO, item.getName());
        int downloadState = item.getDownloadState();
        if (downloadState == 1) {
            helper.k(com.zentraedi.outreader.d.i.BO).setVisibility(0);
            helper.M(com.zentraedi.outreader.d.i.BO, com.zentraedi.outreader.d.q.my);
            helper.k(com.zentraedi.outreader.d.i.BO).setOnClickListener(new a(item));
            helper.k(com.zentraedi.outreader.d.i.jM).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.kk).setVisibility(8);
            helper.N(com.zentraedi.outreader.d.i.jM, this.W.getString(com.zentraedi.outreader.d.q.Fh4, l5.R(item.getTotalSize())));
        } else if (downloadState == 2) {
            helper.k(com.zentraedi.outreader.d.i.BO).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.jM).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.kk).setVisibility(8);
            helper.M(com.zentraedi.outreader.d.i.BO, com.zentraedi.outreader.d.q.ax);
            helper.k(com.zentraedi.outreader.d.i.BO).setOnClickListener(new b(item));
            helper.N(com.zentraedi.outreader.d.i.jM, new SpannableString(l5.R(item.getDownloadedSize()) + ("/" + l5.R(item.getTotalSize()))));
        } else if (downloadState == 3) {
            helper.k(com.zentraedi.outreader.d.i.BO).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.jM).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.kk).setVisibility(8);
            helper.M(com.zentraedi.outreader.d.i.BO, com.zentraedi.outreader.d.q.my);
            helper.k(com.zentraedi.outreader.d.i.BO).setOnClickListener(new d(item));
            helper.N(com.zentraedi.outreader.d.i.jM, new SpannableString(l5.R(item.getDownloadedSize()) + ("/" + l5.R(item.getTotalSize()))));
        } else if (downloadState == 4) {
            helper.k(com.zentraedi.outreader.d.i.BO).setVisibility(8);
            helper.k(com.zentraedi.outreader.d.i.jM).setVisibility(8);
            helper.k(com.zentraedi.outreader.d.i.kk).setVisibility(8);
            ((TextView) helper.k(com.zentraedi.outreader.d.i.CO)).setTypeface(item.getTypeface());
            helper.k(com.zentraedi.outreader.d.i.WK).setOnClickListener(new c(item));
        } else if (downloadState == 5) {
            helper.k(com.zentraedi.outreader.d.i.BO).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.jM).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.kk).setVisibility(0);
            helper.M(com.zentraedi.outreader.d.i.BO, com.zentraedi.outreader.d.q.IB);
            helper.k(com.zentraedi.outreader.d.i.BO).setOnClickListener(new e(item));
            helper.N(com.zentraedi.outreader.d.i.jM, new SpannableString(l5.R(item.getDownloadedSize()) + ("/" + l5.R(item.getTotalSize()))));
        }
        if (item.isSelect()) {
            helper.k(com.zentraedi.outreader.d.i.YK).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.YK).setVisibility(0);
            helper.k(com.zentraedi.outreader.d.i.WK).setVisibility(8);
        } else {
            helper.k(com.zentraedi.outreader.d.i.YK).setVisibility(8);
            helper.k(com.zentraedi.outreader.d.i.WK).setVisibility(this.Y ? 8 : 0);
        }
        helper.k(com.zentraedi.outreader.d.i.l5).setVisibility((this.Y && item.isCustom() && !item.isSelect()) ? 0 : 8);
        helper.s(com.zentraedi.outreader.d.i.l5, item.isDeleteSelect());
        helper.k(com.zentraedi.outreader.d.i.Tn).setOnClickListener(new f(item));
    }

    public boolean m2() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.X <= ((long) 1000);
        this.X = jCurrentTimeMillis;
        return z;
    }

    public boolean n2() {
        return this.Y;
    }

    public void o2(boolean selectMode) {
        this.Y = selectMode;
        notifyDataSetChanged();
    }

    public void p2(g mOnItemClickListener) {
        this.V = mOnItemClickListener;
    }
}
