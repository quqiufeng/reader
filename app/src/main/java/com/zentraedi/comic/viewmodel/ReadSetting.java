package com.zentraedi.comic.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ReadSetting {

    @fo.k
    private ReadModel a = ReadModel.NORMAL_NULL;
    private int b = 1;

    @fo.k
    private Layout c = Layout.COMMON;

    @fo.k
    private ScreenOrganize d;

    @fo.k
    private ZoomType e;

    @fo.k
    private Clip f;

    @fo.l
    private Coordinate g;

    @fo.l
    private Stretcher h;
    private float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private float m;
    private boolean n;
    private float o;
    private boolean p;
    private float q;

    public ReadSetting() {
        this.d = com.zentraedi.business.utils.m6.a.e() ? ScreenOrganize.NORMAL : ScreenOrganize.VERTICAL;
        this.e = ZoomType.WIDTH;
        this.f = Clip.NORMAL;
        this.j = true;
        this.m = 1.0f;
    }

    public final void A(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "<set-?>");
        this.c = layout;
    }

    public final void B(@fo.k ReadModel readModel) {
        Intrinsics.checkNotNullParameter(readModel, "<set-?>");
        this.a = readModel;
    }

    public final void C(float f) {
        this.i = f;
    }

    public final void D(@fo.k ScreenOrganize screenOrganize) {
        Intrinsics.checkNotNullParameter(screenOrganize, "<set-?>");
        this.d = screenOrganize;
    }

    public final void E(float f) {
        this.o = f;
    }

    public final void F(@fo.l Stretcher stretcher) {
        this.h = stretcher;
    }

    public final void G(boolean z) {
        this.j = z;
    }

    public final void H(@fo.k ZoomType zoomType) {
        Intrinsics.checkNotNullParameter(zoomType, "<set-?>");
        this.e = zoomType;
    }

    public final float a() {
        return this.q;
    }

    @fo.k
    public final Clip b() {
        return this.f;
    }

    @fo.l
    public final Coordinate c() {
        return this.g;
    }

    public final boolean d() {
        return this.p;
    }

    public final boolean e() {
        return this.l;
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.n;
    }

    public final float h() {
        return this.m;
    }

    public final int i() {
        return this.b;
    }

    @fo.k
    public final Layout j() {
        return this.c;
    }

    @fo.k
    public final ReadModel k() {
        return this.a;
    }

    public final float l() {
        return this.i;
    }

    @fo.k
    public final ScreenOrganize m() {
        return this.d;
    }

    public final float n() {
        return this.o;
    }

    @fo.l
    public final Stretcher o() {
        return this.h;
    }

    public final boolean p() {
        return this.j;
    }

    @fo.k
    public final ZoomType q() {
        return this.e;
    }

    public final void r(float f) {
        this.q = f;
    }

    public final void s(@fo.k Clip clip) {
        Intrinsics.checkNotNullParameter(clip, "<set-?>");
        this.f = clip;
    }

    public final void t(@fo.l Coordinate coordinate) {
        this.g = coordinate;
    }

    public final void u(boolean z) {
        this.p = z;
    }

    public final void v(boolean z) {
        this.l = z;
    }

    public final void w(boolean z) {
        this.k = z;
    }

    public final void x(boolean z) {
        this.n = z;
    }

    public final void y(float f) {
        this.m = f;
    }

    public final void z(int i) {
        this.b = i;
    }

    @xl.g
    public static final class Coordinate implements Parcelable {

        @fo.k
        public static final Parcelable.Creator<Coordinate> CREATOR = new a();
        private final float a;
        private final float b;
        private final float c;
        private final float d;
        private final boolean e;

        public static final class a implements Parcelable.Creator<Coordinate> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Coordinate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Coordinate(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Coordinate[] newArray(int i) {
                return new Coordinate[i];
            }
        }

        public Coordinate(float f, float f2, float f3, float f4, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
        }

        public static /* synthetic */ Coordinate h(Coordinate coordinate, float f, float f2, float f3, float f4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = coordinate.a;
            }
            if ((i & 2) != 0) {
                f2 = coordinate.b;
            }
            if ((i & 4) != 0) {
                f3 = coordinate.c;
            }
            if ((i & 8) != 0) {
                f4 = coordinate.d;
            }
            if ((i & 16) != 0) {
                z = coordinate.e;
            }
            boolean z2 = z;
            float f5 = f3;
            return coordinate.g(f, f2, f5, f4, z2);
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(@fo.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) obj;
            return Float.compare(this.a, coordinate.a) == 0 && Float.compare(this.b, coordinate.b) == 0 && Float.compare(this.c, coordinate.c) == 0 && Float.compare(this.d, coordinate.d) == 0 && this.e == coordinate.e;
        }

        @fo.k
        public final Coordinate g(float f, float f2, float f3, float f4, boolean z) {
            return new Coordinate(f, f2, f3, f4, z);
        }

        public int hashCode() {
            return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + androidx.compose.animation.w.a(this.e);
        }

        public final float j() {
            return this.d;
        }

        public final float l() {
            return this.a;
        }

        public final float m() {
            return this.b;
        }

        public final float n() {
            return this.c;
        }

        public final boolean o() {
            return this.e;
        }

        @fo.k
        public String toString() {
            return "Coordinate(left=" + this.a + ", right=" + this.b + ", top=" + this.c + ", bottom=" + this.d + ", isWidth=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@fo.k Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.a);
            dest.writeFloat(this.b);
            dest.writeFloat(this.c);
            dest.writeFloat(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public /* synthetic */ Coordinate(float f, float f2, float f3, float f4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4, (i & 16) != 0 ? true : z);
        }
    }

    @xl.g
    public static final class Stretcher implements Parcelable {

        @fo.k
        public static final Parcelable.Creator<Stretcher> CREATOR = new a();
        private final float a;
        private final float b;
        private final boolean c;

        public static final class a implements Parcelable.Creator<Stretcher> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Stretcher createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stretcher(parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Stretcher[] newArray(int i) {
                return new Stretcher[i];
            }
        }

        public Stretcher(float f, float f2, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = z;
        }

        public static /* synthetic */ Stretcher e(Stretcher stretcher, float f, float f2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = stretcher.a;
            }
            if ((i & 2) != 0) {
                f2 = stretcher.b;
            }
            if ((i & 4) != 0) {
                z = stretcher.c;
            }
            return stretcher.d(f, f2, z);
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        @fo.k
        public final Stretcher d(float f, float f2, boolean z) {
            return new Stretcher(f, f2, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@fo.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stretcher)) {
                return false;
            }
            Stretcher stretcher = (Stretcher) obj;
            return Float.compare(this.a, stretcher.a) == 0 && Float.compare(this.b, stretcher.b) == 0 && this.c == stretcher.c;
        }

        public final float g() {
            return this.a;
        }

        public final float h() {
            return this.b;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + androidx.compose.animation.w.a(this.c);
        }

        public final boolean j() {
            return this.c;
        }

        @fo.k
        public String toString() {
            return "Stretcher(height=" + this.a + ", width=" + this.b + ", isWidth=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@fo.k Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.a);
            dest.writeFloat(this.b);
            dest.writeInt(this.c ? 1 : 0);
        }

        public /* synthetic */ Stretcher(float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, (i & 4) != 0 ? true : z);
        }
    }
}
