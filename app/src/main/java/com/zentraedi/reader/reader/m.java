package com.zentraedi.reader.reader;

import android.util.SparseBooleanArray;
import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class m implements Cloneable {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 4;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 358;
    private static final Class<?> I = m.class;
    public static final String s = "chapter_no_data";
    public static final String t = "chapter_on_control";
    public static final String u = "chapter_other_error";
    public static final int v = -1;
    public static final int w = -2;
    public static final int x = -3;
    public static final int y = 0;
    public static final int z = 1;
    private k a;
    private int b;
    private int c;
    private List<String> d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private SparseBooleanArray m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private boolean r;

    public static class b {
        private int a;
        private int b;
        private List<String> c;
        private k d;
        private int e;
        private int f;
        private boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private boolean l;
        private int m;
        private int n;
        private SparseBooleanArray o;

        public m a() {
            return new m(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.b);
        }

        public b b(int i) {
            this.b = i;
            return this;
        }

        public b c(boolean z) {
            this.g = z;
            return this;
        }

        public b d(int i) {
            this.i = i;
            return this;
        }

        public b e(List<String> list) {
            this.c = list;
            return this;
        }

        public b f(SparseBooleanArray sparseBooleanArray) {
            this.o = sparseBooleanArray;
            return this;
        }

        public b g(boolean z) {
            this.l = z;
            return this;
        }

        public b h(int i) {
            this.k = i;
            return this;
        }

        public b i(int i) {
            this.j = i;
            return this;
        }

        public b j(int i) {
            this.a = i;
            return this;
        }

        public b k(int i) {
            this.n = i;
            return this;
        }

        public b l(k kVar) {
            this.d = kVar;
            return this;
        }

        public b m(int i) {
            this.e = i;
            return this;
        }

        public b n(int i) {
            this.h = i;
            return this;
        }

        public b o(int i) {
            this.m = i;
            return this;
        }

        public b p(int i) {
            this.f = i;
            return this;
        }
    }

    public m a() {
        try {
            return (m) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.k;
    }

    @n0
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SparseBooleanArray d() {
        return this.m;
    }

    public List<String> e() {
        return this.d;
    }

    public int f() {
        return this.o;
    }

    public int g() {
        return this.n;
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.l;
    }

    public k k() {
        return this.a;
    }

    public int l() {
        return this.b;
    }

    public int m() {
        return this.j;
    }

    public int n() {
        return this.f;
    }

    public int o() {
        return this.q;
    }

    public int p() {
        return this.e;
    }

    public boolean q() {
        return this.i;
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.r;
    }

    public void t(int i) {
        this.g = i;
    }

    public void u(boolean z2) {
        this.r = z2;
    }

    public void v(int i) {
        this.c = i;
    }

    public void w(int i) {
        this.h = i;
    }

    public void x(int i) {
        this.f = i;
    }

    private m() {
    }

    private m(int i, List<String> list, k kVar, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, boolean z3, int i8, int i9, SparseBooleanArray sparseBooleanArray, int i10) {
        v(i);
        if (list != null) {
            this.d = new ArrayList(list);
        } else {
            this.d = new ArrayList();
        }
        this.b = i2;
        this.i = z2;
        this.q = i8;
        this.m = sparseBooleanArray;
        this.a = kVar;
        this.e = i3;
        this.j = i4;
        this.k = i5;
        this.n = i6;
        this.o = i7;
        this.p = z3;
        this.l = i9;
        this.g = i10;
    }
}
