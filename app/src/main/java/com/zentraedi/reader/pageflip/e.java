package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class e {
    private static final Class<?> c = e.class;
    private final int b = -1;
    int a = -1;

    public e a(Context context, int i, int i2) throws Throwable {
        String strD = d(context, i2);
        if (strD.length() < 1) {
            throw new PageFlipException("Empty GLSL shader for resource id:" + i2);
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        this.a = iGlCreateShader;
        if (iGlCreateShader == -1) {
            throw new PageFlipException("Can't create shader. Error: " + GLES20.glGetError());
        }
        GLES20.glShaderSource(iGlCreateShader, strD);
        GLES20.glCompileShader(this.a);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(this.a, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return this;
        }
        Class<?> cls = c;
        nd.a.c(cls.getName(), "Can'top compile shader for type: " + i + "Error: " + GLES20.glGetError());
        String name = cls.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("Compile shader error: ");
        sb.append(GLES20.glGetShaderInfoLog(this.a));
        nd.a.c(name, sb.toString());
        GLES20.glDeleteShader(this.a);
        throw new PageFlipException("Can't compile shader fortype: " + i);
    }

    public void b() {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteShader(i);
            this.a = -1;
        }
    }

    public int c() {
        return this.a;
    }

    String d(Context context, int i) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb.append(line);
                            sb.append("\n");
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new PageFlipException("Could not open resource: " + i, e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return sb.toString();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }
}
