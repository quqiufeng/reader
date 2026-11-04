package com.zentraedi.comic.dialog;

import android.os.Bundle;
import androidx.lifecycle.m2;
import androidx.lifecycle.r2;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.comic.databinding.l0;
import com.zentraedi.comic.viewmodel.n6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicReadSettingBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReadSettingBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicReadSettingBottomDialog\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,58:1\n13#2:59\n*S KotlinDebug\n*F\n+ 1 ComicReadSettingBottomDialog.kt\ncom/zentraedi/comic/dialog/ComicReadSettingBottomDialog\n*L\n25#1:59\n*E\n"})
public final class o extends com.zentraedi.basic.function.ui.dialog.a {

    @fo.k
    private final BaseActivity b;

    @fo.k
    private final Lazy c;
    private l0 d;

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class a implements Function0<n6> {
        final /* synthetic */ r2 a;

        public a(r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.n6] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n6 invoke() {
            return new m2(this.a).c(n6.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@fo.k BaseActivity mContext) {
        super(mContext, com.zentraedi.comic.q.r.is);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.b = mContext;
        this.c = LazyKt.lazy(new a(mContext));
    }

    private final n6 k() {
        return (n6) this.c.getValue();
    }

    @fo.k
    public final BaseActivity j() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zentraedi.basic.function.ui.dialog.a
    protected void onCreate(@fo.l Bundle bundle) {
        super.onCreate(bundle);
        l0 l0VarC1 = l0.C1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l0VarC1, "inflate(...)");
        this.d = l0VarC1;
        l0 l0Var = null;
        if (l0VarC1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            l0VarC1 = null;
        }
        l0VarC1.K1(k());
        l0 l0Var2 = this.d;
        if (l0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            l0Var = l0Var2;
        }
        setContentView(l0Var.getRoot());
    }
}
