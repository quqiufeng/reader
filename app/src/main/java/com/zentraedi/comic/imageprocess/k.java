package com.zentraedi.comic.imageprocess;

import com.zentraedi.comic.viewmodel.ReadSetting;
import com.zentraedi.comic.viewmodel.ZoomType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class k implements f {

    @fo.k
    private final ZoomType a;

    @fo.l
    private final ReadSetting.Stretcher b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ZoomType.values().length];
            try {
                iArr[ZoomType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomType.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomType.WIDTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public k(@fo.k ZoomType zoomType, @fo.l ReadSetting.Stretcher stretcher) {
        Intrinsics.checkNotNullParameter(zoomType, "zoomType");
        this.a = zoomType;
        this.b = stretcher;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1) {
            return new m(this.b).a(obj, continuation);
        }
        if (i == 2 || i == 3) {
            return obj;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fo.l
    public final ReadSetting.Stretcher b() {
        return this.b;
    }

    @fo.k
    public final ZoomType c() {
        return this.a;
    }
}
