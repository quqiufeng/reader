package com.zentraedi.comic.util;

import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.g0;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.manager.placeholder.PlaceholderLoader;
import com.zentraedi.business.utils.i5;
import com.zentraedi.comic.m;
import com.zentraedi.comic.q;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class e {
    private static final int a = m0.b(5.0f);

    public static final class a extends PlaceholderLoader.b {
        final /* synthetic */ ImageView a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;

        a(ImageView imageView, String str, String str2, boolean z, int i) {
            this.a = imageView;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ImageView imageView, boolean z, int i) {
            e.d(imageView, z ? q.h.Hm : q.h.sm, i);
        }

        public void a(PlaceholderLoader.Builder builder, int i) {
            super.a(builder, i);
            final ImageView imageView = this.a;
            final boolean z = this.d;
            final int i2 = this.e;
            imageView.post(new Runnable() { // from class: com.zentraedi.comic.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.d(imageView, z, i2);
                }
            });
            c.a.b(this.b, this.c);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"comicCoverPath", "comicFilePath", "useBigIcon", "roundingRadius", "isDir", "isFolderMode"})
    public static final void a(@fo.k ImageView imageView, @fo.l String str, @fo.l String str2, @fo.l Boolean bool, @fo.l Integer num, @fo.l Boolean bool2, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        int iIntValue = num != null ? num.intValue() : a;
        if (str2 == null) {
            str2 = "";
        }
        int iF = i5.a.f(str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "_")) {
            new PlaceholderLoader.Builder().url(str).view(imageView).from("pub_album").roundingRadius(iIntValue).load();
            return;
        }
        String strY = m.y(str2);
        if ((8 == iF || 26 == iF || iF == 10 || iF == 33) && new File(strY).exists()) {
            new PlaceholderLoader.Builder().url(strY).scaleType(ImageView.ScaleType.CENTER_CROP).from("pub_album").roundingRadius(iIntValue).view(imageView);
            return;
        }
        if (3 == iF) {
            new PlaceholderLoader.Builder().url(str2).view(imageView).roundingRadius(iIntValue).load();
            return;
        }
        if (10 == iF) {
            d(imageView, z ? q.h.Mm : q.h.xm, iIntValue);
            return;
        }
        if (8 == iF) {
            d(imageView, z ? q.h.Km : q.h.vm, iIntValue);
            return;
        }
        if (26 == iF) {
            d(imageView, z ? q.h.Gm : q.h.rm, iIntValue);
            return;
        }
        if (33 == iF) {
            d(imageView, z ? q.h.Jm : q.h.um, iIntValue);
        } else if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
            e(imageView, str2, iIntValue, z);
        } else {
            d(imageView, z ? q.h.Lm : q.h.wm, iIntValue);
        }
    }

    public static /* synthetic */ void b(ImageView imageView, String str, String str2, Boolean bool, Integer num, Boolean bool2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = Boolean.TRUE;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            bool2 = Boolean.FALSE;
        }
        Boolean bool4 = bool2;
        if ((i & 64) != 0) {
            z = false;
        }
        a(imageView, str, str2, bool3, num2, bool4, z);
    }

    public static final int c() {
        return a;
    }

    public static final void d(@fo.k ImageView imageView, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.c.F(imageView.getContext()).J(com.zentraedi.basic.function.utils.a.g(i)).S0(new com.bumptech.glide.load.i[]{new com.bumptech.glide.load.resource.bitmap.m(), new g0(i2)}).s().r1(imageView);
    }

    private static final void e(ImageView imageView, String str, int i, boolean z) {
        c cVar = c.a;
        String strD = cVar.d(str);
        if (TextUtils.isEmpty(strD)) {
            d(imageView, z ? q.h.Hm : q.h.sm, i);
            return;
        }
        if (3 == i5.a.f(strD)) {
            new PlaceholderLoader.Builder().url(strD).view(imageView).from("pub_album").roundingRadius(i).callback(new a(imageView, str, strD, z, i)).load();
            return;
        }
        Intrinsics.checkNotNull(strD);
        String strY = m.y(strD);
        if (!StringsKt.startsWith$default(strY, "/storage/emulated/0", false, 2, (Object) null)) {
            d(imageView, z ? q.h.Hm : q.h.sm, i);
            cVar.b(str, strD);
        } else if (new File(strY).exists()) {
            Intrinsics.checkNotNull(com.bumptech.glide.c.F(imageView.getContext()).u().A1(strY).S0(new com.bumptech.glide.load.i[]{new com.bumptech.glide.load.resource.bitmap.m(), new g0(i)}).x(z ? q.h.Hm : q.h.sm).r1(imageView));
        } else {
            d(imageView, z ? q.h.Hm : q.h.sm, i);
            cVar.b(str, strD);
        }
    }
}
