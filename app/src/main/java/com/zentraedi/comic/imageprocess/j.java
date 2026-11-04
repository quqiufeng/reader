package com.zentraedi.comic.imageprocess;

import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class j implements f {

    @fo.k
    private final Layout a;

    @fo.k
    private final ReadModel b;
    private final int c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.values().length];
            try {
                iArr[Layout.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.DOUBLE_REVERSAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Layout.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(@fo.k Layout layout, @fo.k ReadModel readModel, int i) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(readModel, "readModel");
        this.a = layout;
        this.b = readModel;
        this.c = i;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1) {
            return new l(this.b, this.c).a(obj, continuation);
        }
        if (i == 2) {
            return obj;
        }
        if (i == 3 || i == 4) {
            return new i(this.a).a(obj, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fo.k
    public final Layout b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    @fo.k
    public final ReadModel d() {
        return this.b;
    }
}
