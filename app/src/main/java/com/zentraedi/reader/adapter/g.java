package com.zentraedi.reader.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import com.zentraedi.basic.function.utils.j0;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class g extends a {
    private static final Class<?> f = g.class;
    private List<com.zentraedi.reader.reader.m> a;
    private final Context b;
    private final com.zentraedi.reader.c c;
    private final com.zentraedi.reader.d d;
    private final d e;

    public g(Context context, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar, d dVar2) {
        this.b = context;
        this.c = cVar;
        this.d = dVar;
        this.e = dVar2;
    }

    public void destroyItem(@n0 ViewGroup viewGroup, int i, @n0 Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public void f(int i, List<com.zentraedi.reader.reader.m> list) {
        this.a.addAll(i, list);
        notifyDataSetChanged();
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public com.zentraedi.reader.reader.m g(int i) {
        List<com.zentraedi.reader.reader.m> list;
        if (i < 0 || i >= getCount() || (list = this.a) == null) {
            return null;
        }
        return list.get(i);
    }

    public int getCount() {
        List<com.zentraedi.reader.reader.m> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public List<com.zentraedi.reader.reader.m> getData() {
        return this.a;
    }

    @Override // com.zentraedi.reader.reader.a
    public int getItemCount() {
        return j0.i(this.a);
    }

    public int getItemPosition(@n0 Object obj) {
        com.zentraedi.reader.reader.m mVar = (com.zentraedi.reader.reader.m) ((View) obj).getTag();
        if (mVar == null) {
            return -2;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (mVar.equals(this.a.get(i))) {
                return i;
            }
        }
        return -2;
    }

    @n0
    public Object instantiateItem(@n0 ViewGroup viewGroup, int i) {
        System.currentTimeMillis();
        com.zentraedi.reader.reader.m mVarG = g(i);
        e eVarA = this.e.a(mVarG.o(), this.b, this.c, this.d);
        View viewM = eVarA.m();
        if (viewM.getParent() != null) {
            ((ViewGroup) viewM.getParent()).removeView(viewM);
        }
        viewGroup.addView(viewM);
        eVarA.z(mVarG);
        viewM.setTag(mVarG);
        return viewM;
    }

    public boolean isViewFromObject(@n0 View view, @n0 Object obj) {
        return view == obj;
    }

    @Override // com.zentraedi.reader.adapter.a
    public void n() {
    }

    @Override // com.zentraedi.reader.adapter.a
    public void o(List<com.zentraedi.reader.reader.m> list) {
        this.a = list;
        notifyDataSetChanged();
    }
}
