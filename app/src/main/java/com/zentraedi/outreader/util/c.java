package com.zentraedi.outreader.util;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class c {
    private static final Class<?> a = c.class;

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
