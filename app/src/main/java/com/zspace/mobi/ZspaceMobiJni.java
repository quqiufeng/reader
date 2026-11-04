package com.zspace.mobi;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes11.dex */
class ZspaceMobiJni {
    public static final int ERROR = 1;
    public static final int SUCCESS = 0;

    static {
        System.loadLibrary("zspace-mobi");
    }

    ZspaceMobiJni() {
    }

    public static native String bookInfo(String mobiPath);

    public static native int convertToEpub(String mobiPath, String targetFile);

    public static native void mobiDebug(boolean debug);
}
