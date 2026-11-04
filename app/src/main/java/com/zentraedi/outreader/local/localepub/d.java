package com.zentraedi.outreader.local.localepub;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class d {
    private static final Class<?> a = d.class;

    public static File a(Context context) {
        File file = new File(c(context), "epub");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    private static File b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "files");
        if (file.exists()) {
            return file;
        }
        if (!file.mkdirs()) {
            return null;
        }
        try {
            new File(file, ".nomedia").createNewFile();
            return file;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File c(Context context) {
        File fileB = Environment.getExternalStorageState().equals("mounted") ? b(context) : null;
        return fileB == null ? context.getFilesDir() : fileB;
    }

    public static List<String> d(Context mContext) {
        StorageManager storageManager = (StorageManager) mContext.getSystemService("storage");
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getPath", new Class[0]);
            cls.getMethod("isRemovable", new Class[0]);
            Object objInvoke = method.invoke(storageManager, new Object[0]);
            if (objInvoke != null) {
                int length = Array.getLength(objInvoke);
                for (int i = 0; i < length; i++) {
                    arrayList.add((String) method2.invoke(Array.get(objInvoke, i), new Object[0]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static File e(Context context) {
        File file = new File(c(context), "pdf");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File f(Context context) {
        File file = new File(c(context), "zip");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }
}
