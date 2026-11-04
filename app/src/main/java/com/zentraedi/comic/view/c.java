package com.zentraedi.comic.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c implements ComicTiledImageView.c {

    @fo.k
    private final String a;

    @fo.k
    private final BitmapRegionDecoder b;

    @fo.k
    private final Object c;

    public c(@fo.k String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.a = path;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(path, false);
        Intrinsics.checkNotNullExpressionValue(bitmapRegionDecoderNewInstance, "newInstance(...)");
        this.b = bitmapRegionDecoderNewInstance;
        this.c = new Object();
    }

    private static /* synthetic */ void b() {
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    @fo.l
    public Bitmap a(@fo.k Rect region, int i, int i2) {
        Bitmap bitmapCreateScaledBitmap;
        Intrinsics.checkNotNullParameter(region, "region");
        synchronized (this.c) {
            try {
                bitmapCreateScaledBitmap = null;
                if (!this.b.isRecycled()) {
                    int i3 = 1;
                    while (true) {
                        int i4 = i3 * 2;
                        if (region.width() / i4 < i || region.height() / i4 < i2) {
                            break;
                        }
                        i3 = i4;
                    }
                    BitmapRegionDecoder bitmapRegionDecoder = this.b;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = i3;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Unit unit = Unit.INSTANCE;
                    Bitmap bitmapDecodeRegion = bitmapRegionDecoder.decodeRegion(region, options);
                    if (bitmapDecodeRegion != null) {
                        if (bitmapDecodeRegion.getWidth() > i || bitmapDecodeRegion.getHeight() > i2) {
                            try {
                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeRegion, RangesKt.coerceAtMost(bitmapDecodeRegion.getWidth(), i), RangesKt.coerceAtMost(bitmapDecodeRegion.getHeight(), i2), true);
                                Intrinsics.checkNotNull(bitmapCreateScaledBitmap);
                                if (bitmapCreateScaledBitmap != bitmapDecodeRegion) {
                                    bitmapDecodeRegion.recycle();
                                }
                            } catch (Throwable th2) {
                                bitmapDecodeRegion.recycle();
                                throw th2;
                            }
                        } else {
                            bitmapCreateScaledBitmap = bitmapDecodeRegion;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bitmapCreateScaledBitmap;
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public void close() {
        synchronized (this.c) {
            try {
                if (!this.b.isRecycled()) {
                    this.b.recycle();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getWidth() {
        return this.b.getWidth();
    }
}
