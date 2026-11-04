package com.zspace.mobi;

import com.zentraedi.business.R;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes11.dex */
public final class MobiException extends Exception {

    @k
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final String errorLowLevelMsg() {
            String strN = com.zentraedi.basic.function.utils.a.n(R.string.Nv1);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            return strN;
        }

        @k
        public final String errorMsg() {
            String strN = com.zentraedi.basic.function.utils.a.n(R.string.Mv1);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            return strN;
        }

        @k
        public final MobiException lowLevelException() {
            return new MobiException(errorLowLevelMsg());
        }

        public final void toastError() {
            com.zentraedi.basic.function.ui.toast.a.w(errorMsg(), false);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MobiException() {
        String str = null;
        this(str, 1, str);
    }

    public MobiException(@l String str) {
        super(str);
    }

    public /* synthetic */ MobiException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Companion.errorMsg() : str);
    }
}
