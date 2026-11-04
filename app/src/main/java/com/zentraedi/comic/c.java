package com.zentraedi.comic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.zentraedi.business.utils.l5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c {
    @fo.k
    public static final Bitmap a(@fo.k Bitmap bitmap, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, new Rect(i, i2, i3, i4), new Rect(0, 0, i5, i6), (Paint) null);
        return bitmapCreateBitmap;
    }

    public static final void b(@fo.l String str, @fo.k Bitmap bm, @fo.k Context mContext, @fo.k Function1<? super String, Unit> saveCallBack) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(saveCallBack, "saveCallBack");
        String str2 = mContext.getFilesDir() + "/images/";
        if (!l5.k(str2)) {
            saveCallBack.invoke("");
            return;
        }
        File file = new File(str2, str);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bm.getWidth(), bm.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(bm, 0.0f, 0.0f, (Paint) null);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            saveCallBack.invoke(str2 + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @fo.k
    public static final Bitmap c(float f, @fo.k Bitmap bm) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        int width = bm.getWidth();
        int height = bm.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
