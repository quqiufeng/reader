package com.zentraedi.reader.event;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class f extends c {
    private final a e;

    public static final class a {
        private int a;
        private int b;
        private int c;
        private String d;
        private a e;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public a a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.a;
        }

        public void f(a aVar) {
            this.e = aVar;
        }

        public void g(int i) {
            this.b = i;
        }

        public void h(int i) {
            this.c = i;
        }

        public void i(String str) {
            this.d = str;
        }

        public void j(int i) {
            this.a = i;
        }
    }

    public f(a aVar) {
        super(9);
        this.e = aVar;
    }

    public a a() {
        return this.e;
    }
}
