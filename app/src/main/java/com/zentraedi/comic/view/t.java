package com.zentraedi.comic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.tencent.tbs.one.TBSOneErrorCodes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class t extends com.scwang.smartrefresh.layout.internal.b {
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    @fo.k
    private TextView j;

    @fo.k
    private TextView k;
    private boolean l;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.ReleaseToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(@fo.k Context context, @fo.k AttributeSet attrs) {
        super(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.d = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.YL);
        this.e = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fz1);
        this.f = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.hL);
        this.g = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.YJ);
        this.h = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.nr2);
        this.i = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wj);
        View viewInflate = LayoutInflater.from(context).inflate(com.zentraedi.comic.q.l.Z8, (ViewGroup) this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(com.zentraedi.comic.q.i.PQ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.j = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(com.zentraedi.comic.q.i.SP);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
    }

    public int b(@fo.k sc.j refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        if (z) {
            this.k.setText(this.g);
            return TBSOneErrorCodes.OTHER_BASE;
        }
        this.k.setText(this.l ? this.i : this.h);
        return TBSOneErrorCodes.OTHER_BASE;
    }

    public final String getLOADING_HEADER_FAILED() {
        return this.h;
    }

    public final String getLOADING_HEADER_FINISH() {
        return this.g;
    }

    public final String getLOADING_HEADER_NODATA() {
        return this.i;
    }

    public final String getLOADING_HEADER_PULLING() {
        return this.d;
    }

    public final String getLOADING_HEADER_RELEASE() {
        return this.f;
    }

    public final boolean getNoData() {
        return this.l;
    }

    public final String getREFRESH_HEADER_LOADING() {
        return this.e;
    }

    public void h(@fo.k sc.j refreshLayout, @fo.k RefreshState oldState, @fo.k RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = a.$EnumSwitchMapping$0[newState.ordinal()];
        if (i == 1) {
            this.k.setText(this.l ? this.i : this.d);
        } else if (i == 2) {
            this.k.setText(this.l ? this.i : this.f);
        } else {
            if (i != 3) {
                return;
            }
            this.k.setText(this.l ? this.i : this.e);
        }
    }

    public final void setFileName(@fo.k String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.j.setText(name);
    }

    public final void setLOADING_HEADER_FAILED(String str) {
        this.h = str;
    }

    public final void setLOADING_HEADER_FINISH(String str) {
        this.g = str;
    }

    public final void setLOADING_HEADER_NODATA(String str) {
        this.i = str;
    }

    public final void setLOADING_HEADER_PULLING(String str) {
        this.d = str;
    }

    public final void setLOADING_HEADER_RELEASE(String str) {
        this.f = str;
    }

    public final void setNoData(boolean z) {
        this.l = z;
    }

    public final void setREFRESH_HEADER_LOADING(String str) {
        this.e = str;
    }
}
