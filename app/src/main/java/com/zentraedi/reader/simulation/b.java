package com.zentraedi.reader.simulation;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import androidx.viewpager.widget.V4ViewPager;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.reader.f;
import com.zentraedi.reader.reader.m;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class b {
    public static final Class<?> f = b.class;
    private final Context a;
    private V4ViewPager b;
    private final SparseArray<Bitmap> c = new SparseArray<>(3);
    private final LruCache<String, Bitmap> d = new a(3);
    private com.zentraedi.reader.c e;

    class a extends LruCache<String, Bitmap> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, str, bitmap, bitmap2);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public b(Context context) {
        this.a = context;
    }

    private Bitmap c(View view) {
        view.setDrawingCacheEnabled(true);
        com.zentraedi.reader.c cVar = this.e;
        if (cVar != null) {
            view.setDrawingCacheBackgroundColor(cVar.getPageBackgroundColor());
        }
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap bitmapCopy = drawingCache.copy(Bitmap.Config.RGB_565, false);
        view.destroyDrawingCache();
        return bitmapCopy;
    }

    public static String e(m mVar) {
        return mVar.l() + "_" + mVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    public void a() {
        int i;
        V4ViewPager v4ViewPager = this.b;
        if (v4ViewPager == null || v4ViewPager.getAdapter() == null) {
            return;
        }
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        int childCount = this.b.getChildCount();
        m mVarG = ((com.zentraedi.reader.adapter.a) this.b.getAdapter()).g(this.b.getCurrentItem());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.b.getChildAt(i2);
            if (childAt == null) {
                nd.a.c(f.a, " view == null");
            } else if (childAt.getTag() instanceof m) {
                m mVar = (m) childAt.getTag();
                String strE = e(mVar);
                if (mVar.l() == mVarG.l() && mVar.h() == mVarG.h()) {
                    i = 1;
                } else if (mVar.l() < mVarG.l()) {
                    i = 0;
                } else {
                    i = 2;
                    if (mVar.l() <= mVarG.l() && mVar.h() <= mVarG.h()) {
                        i = 0;
                    }
                }
                Bitmap bitmapC = this.d.get(strE);
                if (bitmapC == null) {
                    if (z) {
                        bitmapC = c(childAt);
                    } else {
                        nd.a.a(f.a, "");
                    }
                    if (bitmapC != null) {
                        this.d.put(strE, bitmapC);
                    }
                }
                h(i, bitmapC);
            }
        }
    }

    public void b() {
        this.d.evictAll();
        this.c.clear();
    }

    public void d() {
        b();
    }

    public Bitmap f(int i) {
        Bitmap bitmap = this.c.get(i);
        if ((bitmap != null && !bitmap.isRecycled()) || this.e == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(k0.m(this.a), k0.j(this.a), Bitmap.Config.RGB_565);
        bitmapCreateBitmap.eraseColor(this.e.getPageBackgroundColor());
        return bitmapCreateBitmap;
    }

    public void g(String str) {
        this.d.remove(str);
    }

    public void h(int i, Bitmap bitmap) {
        this.c.put(i, bitmap);
    }

    public void i(com.zentraedi.reader.c cVar) {
        this.e = cVar;
    }

    public void j(V4ViewPager v4ViewPager) {
        this.b = v4ViewPager;
    }
}
