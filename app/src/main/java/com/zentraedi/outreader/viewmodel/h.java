package com.zentraedi.outreader.viewmodel;

import android.app.Application;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.m;
import com.zentraedi.business.FileConstant;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.fileselect.f0;
import com.zentraedi.business.fileselect.s;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.utils.l5;
import fo.k;
import fo.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class h extends com.zentraedi.basic.function.viewmodel.b {
    private final String a;

    @k
    private final List<String> b;

    @k
    private final Lazy c;

    @SourceDebugExtension({"SMAP\nZReaderTypefaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZReaderTypefaceViewModel.kt\ncom/zentraedi/outreader/viewmodel/ZReaderTypefaceViewModel$showSelectFilePopup$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n774#2:101\n865#2,2:102\n1869#2,2:104\n*S KotlinDebug\n*F\n+ 1 ZReaderTypefaceViewModel.kt\ncom/zentraedi/outreader/viewmodel/ZReaderTypefaceViewModel$showSelectFilePopup$1\n*L\n43#1:101\n43#1:102,2\n48#1:104,2\n*E\n"})
    public static final class a implements f0.k {
        a() {
        }

        public void a(f0 f0Var, List<String> list) {
            ArrayList<String> arrayList;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.endsWith$default(lowerCase, "ttf", false, 2, (Object) null)) {
                        String lowerCase2 = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (!StringsKt.endsWith$default(lowerCase2, "otf", false, 2, (Object) null)) {
                            String lowerCase3 = str.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                            if (StringsKt.endsWith$default(lowerCase3, "ttc", false, 2, (Object) null)) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                h hVar = h.this;
                for (String str2 : arrayList) {
                    String strN = hVar.N(str2);
                    if (strN == null || strN.length() == 0) {
                        hVar.Q().add(str2);
                        hVar.U(str2);
                        BaseActivity baseActivityE = com.zentraedi.basic.function.utils.a.h().e();
                        BaseActivity baseActivity = baseActivityE instanceof BaseActivity ? baseActivityE : null;
                        if (baseActivity != null) {
                            baseActivity.g4();
                        }
                    }
                }
            }
        }

        public void onDismiss(m mVar) {
        }

        public void onSuccess(List<FileInfoModel> list) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = com.zentraedi.outreader.business.b.a.a().getPath();
        this.b = new ArrayList();
        this.c = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.viewmodel.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.S();
            }
        });
    }

    private final String O(String str) {
        return this.a + '/' + l5.r(str);
    }

    private final s P() {
        return (s) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s S() {
        return new s();
    }

    public final void M(@k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        new File(path).delete();
    }

    @l
    public final String N(@k String fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        String strO = O(fileId);
        if (new File(strO).exists()) {
            return strO;
        }
        return null;
    }

    @k
    public final List<String> Q() {
        return this.b;
    }

    public final String R() {
        return this.a;
    }

    public final void T(@k View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        s.a aVar = new s.a();
        FragmentActivity fragmentActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(fragmentActivityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        s.a aVarX = aVar.b(fragmentActivityE).Y(view).a(FileConstant.DialogOptionActionType.ADD_TYPE_FACE_TO_ZREADER).C(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Jt2)).X(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.RG3));
        P().L0(new a());
        P().U0(aVarX);
    }

    public final void U(@l String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        TaskFileData taskFileData = new TaskFileData();
        taskFileData.setFileId(str);
        taskFileData.setTargetPath(O(str));
        com.zentraedi.business.task.g.D().L((String) null, taskFileData, false);
    }
}
