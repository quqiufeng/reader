package com.zentraedi.reader.pageflip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class k {
    public static int a(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width / 3;
        int i3 = height / 3;
        if (i > i2) {
            i = i2;
        }
        if (i <= i3) {
            i3 = i;
        }
        int i4 = width - i3;
        int i5 = height - i3;
        int i6 = i4 / 2;
        int i7 = i5 / 2;
        int iRed = 0;
        int iBlue = 0;
        int iGreen = 0;
        int iAlpha = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int pixel = bitmap.getPixel(i8, i8);
            int iRed2 = iRed + Color.red(pixel);
            int iBlue2 = iBlue + Color.blue(pixel);
            int iGreen2 = iGreen + Color.green(pixel);
            int iAlpha2 = iAlpha + Color.alpha(pixel);
            int pixel2 = bitmap.getPixel(i6 + i8, i7 + i8);
            int iRed3 = iRed2 + Color.red(pixel2);
            int iBlue3 = iBlue2 + Color.blue(pixel2);
            int iGreen3 = iGreen2 + Color.green(pixel2);
            int iAlpha3 = iAlpha2 + Color.alpha(pixel2);
            int i9 = i4 + i8;
            int pixel3 = bitmap.getPixel(i9, i8);
            int iRed4 = iRed3 + Color.red(pixel3);
            int iBlue4 = iBlue3 + Color.blue(pixel3);
            int iGreen4 = iGreen3 + Color.green(pixel3);
            int iAlpha4 = iAlpha3 + Color.alpha(pixel3);
            int i10 = i5 + i8;
            int pixel4 = bitmap.getPixel(i8, i10);
            int iRed5 = iRed4 + Color.red(pixel4);
            int iBlue5 = iBlue4 + Color.blue(pixel4);
            int iGreen5 = iGreen4 + Color.green(pixel4);
            int iAlpha5 = iAlpha4 + Color.alpha(pixel4);
            int pixel5 = bitmap.getPixel(i9, i10);
            iRed = iRed5 + Color.red(pixel5);
            iBlue = iBlue5 + Color.blue(pixel5);
            iGreen = iGreen5 + Color.green(pixel5);
            iAlpha = iAlpha5 + Color.alpha(pixel5);
        }
        int i11 = i3 * 5;
        return Color.argb(iAlpha / i11, iRed / i11, iGreen / i11, iBlue / i11);
    }

    public static Bitmap b() {
        Canvas canvas = new Canvas();
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 1, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 256.0f, 0.0f, new int[]{16777215, 603979776, 605032464, 1207959552}, new float[]{0.5f, 0.9f, 0.94f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 256.0f, 1.0f, paint);
        return bitmapCreateBitmap;
    }
}
