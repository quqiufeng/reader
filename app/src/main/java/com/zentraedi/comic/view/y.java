package com.zentraedi.comic.view;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class y {

    @fo.k
    public static final y a = new y();

    public static final class a implements ViewPager2.PageTransformer {

        @fo.k
        public static final C0127a a = new C0127a(null);
        private static final float b = 0.75f;

        /* JADX INFO: renamed from: com.zentraedi.comic.view.y$a$a, reason: collision with other inner class name */
        public static final class C0127a {
            public /* synthetic */ C0127a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0127a() {
            }
        }

        public void transformPage(@fo.k View page, float f) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (f < -1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            if (f <= 0.0f) {
                page.setAlpha(1.0f);
                page.setTranslationX(0.0f);
                page.setScaleX(1.0f);
                page.setScaleY(1.0f);
                return;
            }
            if (f > 1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            float f2 = 1;
            page.setAlpha(f2 - f);
            page.setTranslationX((-page.getWidth()) * f);
            float fAbs = ((f2 - Math.abs(f)) * 0.25f) + b;
            page.setScaleX(fAbs);
            page.setScaleY(fAbs);
        }
    }

    public static final class b implements ViewPager2.PageTransformer {
        public void transformPage(@fo.k View page, float f) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (f <= -1.0f || f >= 1.0f) {
                page.setAlpha(0.0f);
            } else if (f == 0.0f) {
                page.setAlpha(1.0f);
            } else {
                page.setAlpha(1 - Math.abs(f));
            }
        }
    }

    public static final class c implements ViewPager2.PageTransformer {

        @fo.k
        public static final a a = new a(null);
        private static final float b = 15.0f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public void transformPage(@fo.k View page, float f) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (f < -1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            if (f > 1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            page.setAlpha(1 - (Math.abs(f) * 0.3f));
            page.setPivotX(page.getWidth() * 0.5f);
            page.setPivotY(page.getHeight() * 0.5f);
            page.setRotationY((-f) * 15.0f);
        }
    }

    public static final class d implements ViewPager2.PageTransformer {

        @fo.k
        public static final a a = new a(null);
        private static final float b = 0.85f;
        private static final float c = 0.5f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public void transformPage(@fo.k View page, float f) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (f < -1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            if (f > 1.0f) {
                page.setAlpha(0.0f);
                return;
            }
            float fMax = Math.max(b, 1 - Math.abs(f));
            page.setScaleX(fMax);
            page.setScaleY(fMax);
            page.setAlpha((((fMax - b) / 0.14999998f) * c) + c);
        }
    }

    private y() {
    }
}
