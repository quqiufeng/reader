package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class d {
    private static final Class<?> e = d.class;
    protected final int a = -1;
    protected int b = -1;
    protected final e c = new e();
    protected final e d = new e();

    public void a() {
        this.c.b();
        this.d.b();
        int i = this.b;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.b = -1;
        }
    }

    public int b() {
        return this.b;
    }

    protected void c() {
        nd.a.a(e.getName(), "");
    }

    public d d(Context context, int i, int i2) throws Throwable {
        try {
            this.c.a(context, 35633, i);
            this.d.a(context, 35632, i2);
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.b = iGlCreateProgram;
            if (iGlCreateProgram == 0) {
                this.c.b();
                this.d.b();
                throw new PageFlipException("Can't create texture program");
            }
            GLES20.glAttachShader(iGlCreateProgram, this.c.c());
            GLES20.glAttachShader(this.b, this.d.c());
            GLES20.glLinkProgram(this.b);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.b, 35714, iArr, 0);
            if (iArr[0] == 0) {
                a();
                throw new PageFlipException("Can't link program");
            }
            GLES20.glUseProgram(this.b);
            c();
            return this;
        } catch (PageFlipException e2) {
            this.c.b();
            this.d.b();
            throw e2;
        }
    }
}
