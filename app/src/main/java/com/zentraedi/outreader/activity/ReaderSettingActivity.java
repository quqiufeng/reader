package com.zentraedi.outreader.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.lifecycle.m2;
import com.zentraedi.business.activity.BaseNewActionBarActivity;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.event.ReadClickLeftTurnPageEvent;
import com.zentraedi.outreader.util.ReaderUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReaderSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderSettingActivity.kt\ncom/zentraedi/outreader/activity/ReaderSettingActivity\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,154:1\n717#2,4:155\n*S KotlinDebug\n*F\n+ 1 ReaderSettingActivity.kt\ncom/zentraedi/outreader/activity/ReaderSettingActivity\n*L\n103#1:155,4\n*E\n"})
public final class ReaderSettingActivity extends BaseNewActionBarActivity {

    @fo.k
    public static final String a0 = "charge_type";

    @fo.k
    public static final String b0 = "book_id";

    @JvmField
    public static final long e0 = 0;
    private com.zentraedi.outreader.databinding.e W;
    private long X = -1;

    @fo.k
    private final Lazy Y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.zentraedi.outreader.activity.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderSettingActivity.P4(this.a);
        }
    });

    @fo.k
    public static final a Z = new a(null);

    @JvmField
    public static final long c0 = 300000;

    @JvmField
    public static final long d0 = 600000;

    @JvmField
    public static final long f0 = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@fo.k Context context, @fo.l String str, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ReaderSettingActivity.class);
            intent.putExtra(ReaderSettingActivity.a0, i);
            intent.putExtra(ReaderSettingActivity.b0, str);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    private final com.zentraedi.outreader.viewmodel.e F4() {
        return (com.zentraedi.outreader.viewmodel.e) this.Y.getValue();
    }

    private final void G4() {
        l4().K.E.setImageResource(com.zentraedi.outreader.d.h.bi);
        boolean z = false;
        l4().N.setVisibility(0);
        F4().navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.GD2));
        F4().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReaderSettingActivity.H4(this.a, view);
            }
        });
        Integer num = (Integer) t7.d(gh.b.S, 1);
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        com.zentraedi.outreader.databinding.e eVar = this.W;
        com.zentraedi.outreader.databinding.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar = null;
        }
        eVar.I.setChecked(z);
        com.zentraedi.outreader.databinding.e eVar3 = this.W;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar3 = null;
        }
        eVar3.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.activity.m
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ReaderSettingActivity.I4(compoundButton, z2);
            }
        });
        Boolean bool = (Boolean) t7.d(gh.b.T, Boolean.FALSE);
        com.zentraedi.outreader.databinding.e eVar4 = this.W;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar4 = null;
        }
        Switch r1 = eVar4.F;
        Intrinsics.checkNotNull(bool);
        r1.setChecked(bool.booleanValue());
        com.zentraedi.outreader.databinding.e eVar5 = this.W;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar5 = null;
        }
        eVar5.F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.activity.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ReaderSettingActivity.J4(compoundButton, z2);
            }
        });
        Object objD = t7.d(gh.b.d0, Long.valueOf(f0));
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        long jLongValue = ((Number) objD).longValue();
        this.X = jLongValue;
        Q4(jLongValue);
        com.zentraedi.outreader.databinding.e eVar6 = this.W;
        if (eVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar6 = null;
        }
        eVar6.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReaderSettingActivity.K4(this.a, view);
            }
        });
        com.zentraedi.outreader.databinding.e eVar7 = this.W;
        if (eVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar7 = null;
        }
        Switch r0 = eVar7.H;
        ReaderUtils.a aVar = ReaderUtils.a;
        r0.setChecked(aVar.y());
        com.zentraedi.outreader.databinding.e eVar8 = this.W;
        if (eVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar8 = null;
        }
        eVar8.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.activity.p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ReaderSettingActivity.M4(compoundButton, z2);
            }
        });
        com.zentraedi.outreader.databinding.e eVar9 = this.W;
        if (eVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar9 = null;
        }
        eVar9.G.setChecked(aVar.n());
        com.zentraedi.outreader.databinding.e eVar10 = this.W;
        if (eVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            eVar2 = eVar10;
        }
        eVar2.G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.outreader.activity.q
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ReaderSettingActivity.N4(compoundButton, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void H4(ReaderSettingActivity readerSettingActivity, View view) {
        readerSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I4(CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        t7.j(gh.b.S, Integer.valueOf(!z ? 0 : 1));
        if (z) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Hz2));
        } else {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.vA2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        t7.j(gh.b.T, Boolean.valueOf(z));
        org.greenrobot.eventbus.c.f().q(new ReadClickLeftTurnPageEvent(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void K4(final ReaderSettingActivity readerSettingActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        new com.zentraedi.outreader.dialog.e0(readerSettingActivity).h(readerSettingActivity.X).g(new Function1() { // from class: com.zentraedi.outreader.activity.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderSettingActivity.L4(this.a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L4(ReaderSettingActivity readerSettingActivity, long j) {
        t7.j(gh.b.d0, Long.valueOf(j));
        readerSettingActivity.X = j;
        readerSettingActivity.Q4(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        ReaderUtils.a.K(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        ReaderUtils.a.G(z);
    }

    @JvmStatic
    public static final void O4(@fo.k Context context, @fo.l String str, int i) {
        Z.a(context, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.e P4(ReaderSettingActivity readerSettingActivity) {
        return new m2(readerSettingActivity).c(com.zentraedi.outreader.viewmodel.e.class);
    }

    private final void Q4(long j) {
        com.zentraedi.outreader.databinding.e eVar = null;
        if (j == c0) {
            com.zentraedi.outreader.databinding.e eVar2 = this.W;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                eVar = eVar2;
            }
            eVar.J.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.C64));
            return;
        }
        if (j == d0) {
            com.zentraedi.outreader.databinding.e eVar3 = this.W;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                eVar = eVar3;
            }
            eVar.J.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.H54));
            return;
        }
        if (j == e0) {
            com.zentraedi.outreader.databinding.e eVar4 = this.W;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                eVar = eVar4;
            }
            eVar.J.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.AB2));
            return;
        }
        if (j == f0) {
            com.zentraedi.outreader.databinding.e eVar5 = this.W;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                eVar = eVar5;
            }
            eVar.J.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.CA2));
        }
    }

    protected void onCreate(@fo.l Bundle bundle) {
        if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            Y2().d0(2);
        } else {
            Y2().d0(1);
        }
        super.onCreate(bundle);
    }

    @fo.k
    public com.zentraedi.basic.function.viewmodel.b p4() {
        return F4();
    }

    protected void r3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(this), com.zentraedi.outreader.d.l.v0, m4(), true);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.e eVar = (com.zentraedi.outreader.databinding.e) c0VarJ;
        this.W = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar = null;
        }
        eVar.C1(F4());
        G4();
    }
}
