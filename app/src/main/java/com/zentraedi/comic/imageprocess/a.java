package com.zentraedi.comic.imageprocess;

import com.zentraedi.comic.viewmodel.Clip;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a implements f {

    @fo.k
    private final Clip a;

    @fo.l
    private final ReadSetting.Coordinate b;

    /* JADX INFO: renamed from: com.zentraedi.comic.imageprocess.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0120a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Clip.values().length];
            try {
                iArr[Clip.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Clip.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Clip.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(@fo.k Clip clip, @fo.l ReadSetting.Coordinate coordinate) {
        Intrinsics.checkNotNullParameter(clip, "clip");
        this.a = clip;
        this.b = coordinate;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        int i = C0120a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1) {
            return obj;
        }
        if (i == 2) {
            return new c().a(obj, continuation);
        }
        if (i == 3) {
            return new b(this.b).a(obj, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fo.k
    public final Clip b() {
        return this.a;
    }

    @fo.l
    public final ReadSetting.Coordinate c() {
        return this.b;
    }
}
