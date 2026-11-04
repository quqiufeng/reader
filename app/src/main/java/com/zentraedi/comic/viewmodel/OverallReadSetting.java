package com.zentraedi.comic.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@xl.g
public final class OverallReadSetting implements Parcelable {

    @fo.k
    public static final Parcelable.Creator<OverallReadSetting> CREATOR = new a();
    private final int a;
    private final boolean b;
    private final long c;
    private final int d;
    private final int e;
    private final boolean f;

    @fo.k
    private final PageTurning g;
    private boolean h;
    private final int i;

    @fo.k
    private final PageOver j;

    public static final class a implements Parcelable.Creator<OverallReadSetting> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverallReadSetting createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
                z = true;
            } else {
                z = true;
            }
            long j = parcel.readLong();
            boolean z3 = z;
            int i2 = parcel.readInt();
            boolean z4 = z3;
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z4 = z2;
            }
            return new OverallReadSetting(i, z2, j, i2, i3, z4, PageTurning.valueOf(parcel.readString()), parcel.readInt() != 0 ? z4 : false, parcel.readInt(), PageOver.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OverallReadSetting[] newArray(int i) {
            return new OverallReadSetting[i];
        }
    }

    public OverallReadSetting(int i, boolean z, long j, int i2, int i3, boolean z2, @fo.k PageTurning pageTurn, boolean z3, int i4, @fo.k PageOver pageOver) {
        Intrinsics.checkNotNullParameter(pageTurn, "pageTurn");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = pageTurn;
        this.h = z3;
        this.i = i4;
        this.j = pageOver;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.e;
    }

    public final boolean c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.h;
    }

    @fo.k
    public final PageOver g() {
        return this.j;
    }

    public final int h() {
        return this.i;
    }

    @fo.k
    public final PageTurning j() {
        return this.g;
    }

    public final boolean l() {
        return this.f;
    }

    public final int m() {
        return this.d;
    }

    public final void n(boolean z) {
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@fo.k Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.a);
        dest.writeInt(this.b ? 1 : 0);
        dest.writeLong(this.c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.g.name());
        dest.writeInt(this.h ? 1 : 0);
        dest.writeInt(this.i);
        dest.writeString(this.j.name());
    }

    public /* synthetic */ OverallReadSetting(int i, boolean z, long j, int i2, int i3, boolean z2, PageTurning pageTurning, boolean z3, int i4, PageOver pageOver, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, j, i2, i3, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? PageTurning.SINGLE : pageTurning, (i5 & 128) != 0 ? false : z3, (i5 & 256) != 0 ? 0 : i4, (i5 & 512) != 0 ? PageOver.SCROLL : pageOver);
    }
}
