package com.zentraedi.outreader.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.m2;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.event.ChangeTypefaceEvent;
import com.zentraedi.outreader.model.TypefaceM;
import com.zentraedi.outreader.util.ReaderUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nZReaderTypefaceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZReaderTypefaceActivity.kt\ncom/zentraedi/outreader/activity/ZReaderTypefaceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 DialogTipsBuilder.kt\ncom/zentraedi/business/widget/DialogTipsBuilderKt\n*L\n1#1,332:1\n774#2:333\n865#2,2:334\n1869#2,2:336\n774#2:346\n865#2,2:347\n1869#2,2:350\n1869#2,2:352\n257#3,2:338\n257#3,2:340\n257#3,2:342\n257#3,2:344\n146#4:349\n*S KotlinDebug\n*F\n+ 1 ZReaderTypefaceActivity.kt\ncom/zentraedi/outreader/activity/ZReaderTypefaceActivity\n*L\n134#1:333\n134#1:334,2\n200#1:336,2\n117#1:346\n117#1:347,2\n119#1:350,2\n234#1:352,2\n207#1:338,2\n208#1:340,2\n209#1:342,2\n210#1:344,2\n118#1:349\n*E\n"})
public final class ZReaderTypefaceActivity extends BaseActivity {

    @fo.k
    public static final a c0 = new a(null);

    @fo.k
    private static final String d0 = "KEY_FONT_NAME";

    @fo.k
    private static final String e0 = "KEY_BOOK_TYPE";

    @fo.l
    private androidx.fragment.app.m V;

    @fo.l
    private com.zentraedi.outreader.adapter.n W;

    @fo.l
    private String Z;
    private int b0;

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.activity.h0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ZReaderTypefaceActivity.I4(this.a);
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.activity.i0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ZReaderTypefaceActivity.J4(this.a);
        }
    });

    @fo.k
    private final com.zentraedi.outreader.business.b X = new com.zentraedi.outreader.business.b();

    @fo.k
    private final List<TypefaceM> Y = new ArrayList();

    @fo.k
    private String a0 = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.k String selectedFontName, @fo.k String bookFileType) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(selectedFontName, "selectedFontName");
            Intrinsics.checkNotNullParameter(bookFileType, "bookFileType");
            Intent intent = new Intent(activity, (Class<?>) ZReaderTypefaceActivity.class);
            intent.putExtra(ZReaderTypefaceActivity.d0, selectedFontName);
            intent.putExtra(ZReaderTypefaceActivity.e0, bookFileType);
            activity.startActivity(intent);
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nZReaderTypefaceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZReaderTypefaceActivity.kt\ncom/zentraedi/outreader/activity/ZReaderTypefaceActivity$configRecycleView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n774#2:333\n865#2,2:334\n*S KotlinDebug\n*F\n+ 1 ZReaderTypefaceActivity.kt\ncom/zentraedi/outreader/activity/ZReaderTypefaceActivity$configRecycleView$2\n*L\n169#1:333\n169#1:334,2\n*E\n"})
    public static final class b implements com.zentraedi.outreader.adapter.n.g {
        b() {
        }

        @Override // com.zentraedi.outreader.adapter.n.g
        public void a(View view, TypefaceM typefaceM) {
            if (typefaceM != null) {
                typefaceM.setDeleteSelect(!typefaceM.isDeleteSelect());
            }
            com.zentraedi.outreader.adapter.n nVar = ZReaderTypefaceActivity.this.W;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            List list = ZReaderTypefaceActivity.this.Y;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TypefaceM) obj).isDeleteSelect()) {
                    arrayList.add(obj);
                }
            }
            ZReaderTypefaceActivity.this.M4(arrayList.size());
        }

        @Override // com.zentraedi.outreader.adapter.n.g
        public void b(View view, TypefaceM typefaceM) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (typefaceM != null) {
                com.zentraedi.outreader.typeface.a.c().e(typefaceM);
            }
        }

        @Override // com.zentraedi.outreader.adapter.n.g
        public void c(View view, TypefaceM typefaceM) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (typefaceM == null) {
                return;
            }
            ReaderUtils.a aVar = ReaderUtils.a;
            String str = ZReaderTypefaceActivity.this.a0;
            String type = typefaceM.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            aVar.E(str, type);
            int size = ZReaderTypefaceActivity.this.Y.size();
            for (int i = 0; i < size; i++) {
                ((TypefaceM) ZReaderTypefaceActivity.this.Y.get(i)).setSelect(false);
            }
            typefaceM.setSelect(true);
            com.zentraedi.outreader.adapter.n nVar = ZReaderTypefaceActivity.this.W;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ChangeTypefaceEvent changeTypefaceEvent = new ChangeTypefaceEvent(typefaceM.getTypeface());
            changeTypefaceEvent.setType(typefaceM.getType());
            cVarF.q(changeTypefaceEvent);
        }

        @Override // com.zentraedi.outreader.adapter.n.g
        public void d(View view, TypefaceM typefaceM) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (typefaceM != null) {
                com.zentraedi.outreader.typeface.a.c().a(typefaceM);
            }
        }
    }

    public static final class c implements AppBarLayout.g {
        private int a = -1;

        c() {
        }

        public void j(AppBarLayout appBarLayout, int i) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            if (this.a == i) {
                return;
            }
            this.a = i;
            float fAbs = Math.abs(i) / ZReaderTypefaceActivity.this.F4().E.getTotalScrollRange();
            ZReaderTypefaceActivity.this.F4().R.setAlpha(fAbs);
            ZReaderTypefaceActivity.this.F4().F.setAlpha(1 - fAbs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(ZReaderTypefaceActivity zReaderTypefaceActivity, View view) {
        com.zentraedi.outreader.viewmodel.h hVarG4 = zReaderTypefaceActivity.G4();
        ImageView ivAdd = zReaderTypefaceActivity.F4().H;
        Intrinsics.checkNotNullExpressionValue(ivAdd, "ivAdd");
        hVarG4.T(ivAdd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(ZReaderTypefaceActivity zReaderTypefaceActivity, View view) {
        zReaderTypefaceActivity.P4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(ZReaderTypefaceActivity zReaderTypefaceActivity, View view) {
        zReaderTypefaceActivity.P4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void D4(final ZReaderTypefaceActivity zReaderTypefaceActivity, View view) {
        List<TypefaceM> list = zReaderTypefaceActivity.Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TypefaceM) obj).isDeleteSelect()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        com.zentraedi.business.widget.h0.y(com.zentraedi.business.widget.h0.v(new com.zentraedi.business.widget.h0(zReaderTypefaceActivity).I(com.zentraedi.outreader.d.q.Ns2).n(com.zentraedi.outreader.d.q.gD2), 0, new Function1() { // from class: com.zentraedi.outreader.activity.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ZReaderTypefaceActivity.E4(this.a, (com.zentraedi.business.dialog.n) obj2);
            }
        }, 1, (Object) null), (Function1) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E4(ZReaderTypefaceActivity zReaderTypefaceActivity, com.zentraedi.business.dialog.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        for (TypefaceM typefaceM : zReaderTypefaceActivity.Y) {
            if (typefaceM.isDeleteSelect()) {
                new File(typefaceM.getCustomFontPath()).delete();
            }
        }
        it.dismiss();
        zReaderTypefaceActivity.y4();
        com.zentraedi.outreader.adapter.n nVar = zReaderTypefaceActivity.W;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.databinding.g F4() {
        Object value = this.T.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.outreader.databinding.g) value;
    }

    private final com.zentraedi.outreader.viewmodel.h G4() {
        return (com.zentraedi.outreader.viewmodel.h) this.U.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.outreader.databinding.g I4(ZReaderTypefaceActivity zReaderTypefaceActivity) {
        return (com.zentraedi.outreader.databinding.g) androidx.databinding.m.l(zReaderTypefaceActivity, com.zentraedi.outreader.d.l.w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.h J4(ZReaderTypefaceActivity zReaderTypefaceActivity) {
        return new m2(zReaderTypefaceActivity).c(com.zentraedi.outreader.viewmodel.h.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K4(ZReaderTypefaceActivity zReaderTypefaceActivity) {
        Iterator<T> it = zReaderTypefaceActivity.G4().Q().iterator();
        while (it.hasNext()) {
            com.zentraedi.business.task.g.D().X((String) it.next());
        }
        zReaderTypefaceActivity.G4().Q().clear();
        androidx.fragment.app.m mVar = zReaderTypefaceActivity.V;
        if (mVar != null) {
            mVar.k2();
        }
        zReaderTypefaceActivity.V = null;
        zReaderTypefaceActivity.y4();
        com.zentraedi.outreader.adapter.n nVar = zReaderTypefaceActivity.W;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L4(ZReaderTypefaceActivity ktxRunOnUiDelay) {
        Intrinsics.checkNotNullParameter(ktxRunOnUiDelay, "$this$ktxRunOnUiDelay");
        androidx.fragment.app.m mVar = ktxRunOnUiDelay.V;
        if (mVar != null) {
            mVar.k2();
        }
        ktxRunOnUiDelay.V = null;
        ktxRunOnUiDelay.y4();
        com.zentraedi.outreader.adapter.n nVar = ktxRunOnUiDelay.W;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    private final void O4() {
        F4().E.e(new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y4() {
        this.Y.clear();
        this.Y.addAll(this.X.i(this.Z));
        List<TypefaceM> list = this.Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            TypefaceM typefaceM = (TypefaceM) obj;
            if (typefaceM.isCustom() && !typefaceM.isSelect()) {
                arrayList.add(obj);
            }
        }
        this.b0 = arrayList.size();
        if (this.W == null) {
            com.zentraedi.outreader.adapter.n nVar = new com.zentraedi.outreader.adapter.n(this);
            this.W = nVar;
            nVar.p2(new b());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(1);
            F4().P.setLayoutManager(linearLayoutManager);
            F4().P.setAdapter(this.W);
        }
        com.zentraedi.outreader.adapter.n nVar2 = this.W;
        if (nVar2 != null) {
            nVar2.U1(this.Y);
        }
        P4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void z4(ZReaderTypefaceActivity zReaderTypefaceActivity, View view) {
        zReaderTypefaceActivity.finish();
    }

    @fo.l
    public final androidx.fragment.app.m H4() {
        return this.V;
    }

    public final void M4(int i) {
        F4().T.setText(com.zentraedi.basic.function.utils.l.b(Integer.valueOf(com.zentraedi.outreader.d.q.RO1), MapsKt.mapOf(TuplesKt.to("num", Integer.valueOf(i)), TuplesKt.to("num2", Integer.valueOf(this.b0)))));
        F4().K.setImageResource(i > 0 ? com.zentraedi.outreader.d.h.bn : com.zentraedi.outreader.d.h.cn);
        F4().S.setTextColor(com.zentraedi.basic.function.utils.a.d(i > 0 ? com.zentraedi.outreader.d.f.K3 : com.zentraedi.outreader.d.f.L0));
        F4().N.setClickable(i > 0);
    }

    public final void N4(@fo.l androidx.fragment.app.m mVar) {
        this.V = mVar;
    }

    public final void P4(boolean z) {
        if (!z) {
            Iterator<T> it = this.Y.iterator();
            while (it.hasNext()) {
                ((TypefaceM) it.next()).setDeleteSelect(false);
            }
        }
        F4().P.setPadding(0, 0, 0, z ? com.zentraedi.basic.function.utils.m0.b(84.0f) : 0);
        com.zentraedi.outreader.adapter.n nVar = this.W;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        M4(0);
        com.zentraedi.outreader.adapter.n nVar2 = this.W;
        if (nVar2 != null) {
            nVar2.o2(z);
        }
        LinearLayout collapseLayout = F4().F;
        Intrinsics.checkNotNullExpressionValue(collapseLayout, "collapseLayout");
        collapseLayout.setVisibility(!z ? 0 : 8);
        RelativeLayout layoutTitle = F4().M;
        Intrinsics.checkNotNullExpressionValue(layoutTitle, "layoutTitle");
        layoutTitle.setVisibility(!z ? 0 : 8);
        LinearLayout llSelectTitle = F4().O;
        Intrinsics.checkNotNullExpressionValue(llSelectTitle, "llSelectTitle");
        llSelectTitle.setVisibility(z ? 0 : 8);
        LinearLayout llDelete = F4().N;
        Intrinsics.checkNotNullExpressionValue(llDelete, "llDelete");
        llDelete.setVisibility(z ? 0 : 8);
    }

    public void onBackPressed() {
        com.zentraedi.outreader.adapter.n nVar = this.W;
        if (nVar == null || !nVar.n2()) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            P4(false);
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

    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k FileDownloadProgressEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TaskFileData fileData = event.mBaseTask.getFileData();
        String targetPath = fileData.getTargetPath();
        if (targetPath == null || targetPath.length() == 0 || !G4().Q().contains(fileData.getFileId()) || fileData.getFileSize() <= 0) {
            return;
        }
        if (this.V == null) {
            n4 n4VarA = n4.c.a();
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.YG3);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            this.V = n4VarA.J1(strN, new Function0() { // from class: com.zentraedi.outreader.activity.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZReaderTypefaceActivity.K4(this.a);
                }
            });
            N3();
        }
        if ((fileData.getCompleteSize() * ((long) 100)) / fileData.getFileSize() >= 100) {
            G4().Q().remove(fileData.getFileId());
            Typeface.createFromFile(fileData.getTargetPath());
        }
        if (G4().Q().isEmpty()) {
            pe.i.v(this, 2000L, new Function1() { // from class: com.zentraedi.outreader.activity.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ZReaderTypefaceActivity.L4((ZReaderTypefaceActivity) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        org.greenrobot.eventbus.c.f().v(this);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(e0) : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.a0 = stringExtra;
        Intent intent2 = getIntent();
        this.Z = intent2 != null ? intent2.getStringExtra(d0) : null;
    }

    protected void s3() {
        F4().C1(G4());
        F4().I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderTypefaceActivity.z4(this.a, view);
            }
        });
        F4().H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderTypefaceActivity.A4(this.a, view);
            }
        });
        F4().L.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderTypefaceActivity.B4(this.a, view);
            }
        });
        F4().J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderTypefaceActivity.C4(this.a, view);
            }
        });
        F4().N.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderTypefaceActivity.D4(this.a, view);
            }
        });
        O4();
        y4();
    }
}
