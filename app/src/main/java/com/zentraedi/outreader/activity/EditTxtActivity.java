package com.zentraedi.outreader.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.activity.BaseEditTxtActivity;
import com.zentraedi.business.event.RefreshFileListByPathEvent;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.reader.ReaderActivity;
import com.zentraedi.business.reader.ReaderEvent;
import com.zentraedi.business.request.FileCreateRequest;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.task.event.FileDownloadFailEvent;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.business.task.event.TxtEncodeEvent;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.m6;
import com.zentraedi.business.utils.n4;
import java.net.URLEncoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nEditTxtActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTxtActivity.kt\ncom/zentraedi/outreader/activity/EditTxtActivity\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,401:1\n678#2,2:402\n*S KotlinDebug\n*F\n+ 1 EditTxtActivity.kt\ncom/zentraedi/outreader/activity/EditTxtActivity\n*L\n261#1:402,2\n*E\n"})
public final class EditTxtActivity extends BaseEditTxtActivity {

    @fo.k
    public static final a g0 = new a(null);
    private static final int h0 = 2097152;

    @fo.l
    private static FileInfoModel i0 = null;

    @fo.k
    private static final String j0 = "KEY_IS_ZIP_PRE";
    private int c0;

    @fo.l
    private String d0;
    private boolean e0;
    private boolean f0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.k FileInfoModel fileInfoModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
            Intent intent = new Intent(activity, (Class<?>) EditTxtActivity.class);
            EditTxtActivity.i0 = fileInfoModel;
            activity.startActivity(intent);
            activity.overridePendingTransition(com.zentraedi.outreader.d.a.R0, com.zentraedi.outreader.d.a.s);
        }

        public final void b(@fo.k Activity activity, @fo.k FileInfoModel fileInfoModel, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
            Intent intent = new Intent(activity, (Class<?>) EditTxtActivity.class);
            EditTxtActivity.i0 = fileInfoModel;
            intent.putExtra(EditTxtActivity.j0, z);
            activity.startActivity(intent);
            activity.overridePendingTransition(com.zentraedi.outreader.d.a.R0, com.zentraedi.outreader.d.a.s);
        }

        private a() {
        }
    }

    public static final class b implements n4.i {
        final /* synthetic */ String b;

        b(String str) {
            this.b = str;
        }

        public void leftClick() {
            EditTxtActivity.this.finish();
        }

        public void rightClick() {
            EditTxtActivity.this.n5(this.b);
        }
    }

    public static final class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 0) {
                return false;
            }
            EditTxtActivity.this.r4().F.setCursorVisible(true);
            return false;
        }
    }

    public static final class d extends com.zentraedi.business.http.b<FileInfoModel> {
        final /* synthetic */ String b;

        d(String str) {
            this.b = str;
        }

        public void onResult(ResponseData<FileInfoModel> responseData) {
            if (!Intrinsics.areEqual("200", responseData != null ? responseData.getCode() : null)) {
                EditTxtActivity.this.t4().rightNavTextEnable.set(Boolean.TRUE);
                EditTxtActivity editTxtActivity = EditTxtActivity.this;
                editTxtActivity.hideContentLoading(editTxtActivity.r4().I);
                EditTxtActivity.this.m5(com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.ou1, responseData != null ? responseData.getMsg() : null));
                return;
            }
            EditTxtActivity.this.e0 = true;
            EditTxtActivity.this.F4(this.b);
            FileInfoModel fileInfoModel = EditTxtActivity.i0;
            if (fileInfoModel != null) {
                FileInfoModel data = responseData.getData();
                fileInfoModel.setModifyTimeValue(data != null ? data.getModifyTimeValue() : null);
            }
            EditTxtActivity.this.d0 = com.zentraedi.business.reader.c.b(EditTxtActivity.i0);
            FileInfoModel fileInfoModel2 = EditTxtActivity.i0;
            if (fileInfoModel2 != null) {
                fileInfoModel2.setLocalPath(EditTxtActivity.this.d0);
            }
            com.zentraedi.business.l0.g().e.Q(EditTxtActivity.i0);
            if (!TextUtils.isEmpty(EditTxtActivity.this.d0)) {
                l5.L(EditTxtActivity.this.d0, this.b);
            }
            EditTxtActivity.this.E4();
        }

        public void onServerError() {
            EditTxtActivity.this.t4().rightNavTextEnable.set(Boolean.TRUE);
            EditTxtActivity.this.m5(null);
            EditTxtActivity editTxtActivity = EditTxtActivity.this;
            editTxtActivity.hideContentLoading(editTxtActivity.r4().I);
            EditTxtActivity.this.r4().H.f();
        }
    }

    private final void e5() {
        String strValueOf = String.valueOf(r4().F.getText());
        if (TextUtils.isEmpty(strValueOf) && TextUtils.isEmpty(s4())) {
            if (x4()) {
                finish();
                return;
            } else {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.au1), false);
                return;
            }
        }
        if (Intrinsics.areEqual(strValueOf, s4())) {
            if (x4()) {
                finish();
                return;
            } else {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.au1), false);
                return;
            }
        }
        if (x4()) {
            M4(new b(strValueOf));
        } else {
            n5(strValueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(EditTxtActivity editTxtActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        editTxtActivity.o5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(EditTxtActivity editTxtActivity, View view) {
        if (Intrinsics.areEqual(editTxtActivity.t4().rightNavTextEnable.get(), Boolean.FALSE)) {
            return;
        }
        editTxtActivity.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h5(EditTxtActivity editTxtActivity, View view) {
        ReaderActivity readerActivityA;
        com.zentraedi.business.reader.l lVarU4;
        ReaderActivity readerActivityA2;
        com.zentraedi.business.reader.l lVarU5;
        com.zentraedi.business.reader.l lVarR;
        FileInfoModel fileInfoModel = i0;
        if (fileInfoModel == null || fileInfoModel.getFtype() != 107) {
            com.zentraedi.business.reader.a aVarA = com.zentraedi.business.reader.b.a.a();
            if (aVarA == null || (readerActivityA = aVarA.a()) == null || (lVarU4 = readerActivityA.u4()) == null) {
                return;
            }
            lVarU4.w(editTxtActivity, editTxtActivity.r4().getRoot());
            return;
        }
        com.zentraedi.business.reader.a aVarA2 = com.zentraedi.business.reader.b.a.a();
        if (aVarA2 == null || (readerActivityA2 = aVarA2.a()) == null || (lVarU5 = readerActivityA2.u4()) == null || (lVarR = lVarU5.r(editTxtActivity.u4().e())) == null) {
            return;
        }
        lVarR.x(editTxtActivity, true, editTxtActivity.r4().getRoot());
    }

    private final void i5() {
        FileInfoModel fileInfoModel = i0;
        if ((fileInfoModel != null ? fileInfoModel.getSize() : 0L) > 10485760) {
            t4().showErrorLayout.set(Boolean.TRUE);
            t4().rightNavTextEnable.set(Boolean.FALSE);
            return;
        }
        int i = this.c0;
        if (i >= 3) {
            return;
        }
        this.c0 = i + 1;
        h4(r4().I, com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.vt1));
        FileInfoModel fileInfoModel2 = i0;
        if (fileInfoModel2 == null) {
            nd.a.c(((BaseActivity) this).J, "downloadFileToCache -> mFileInfoModel = null");
            return;
        }
        String strB = com.zentraedi.business.reader.c.b(fileInfoModel2);
        this.d0 = strB;
        com.zentraedi.business.reader.d.d(fileInfoModel2, strB, new gd.a() { // from class: com.zentraedi.outreader.activity.f
            @Override // gd.a
            public final void complete(int i2) {
                EditTxtActivity.j5(this.a, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(EditTxtActivity editTxtActivity, int i) {
        if (i == 0) {
            editTxtActivity.hideContentLoading(editTxtActivity.r4().I);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gt1), false);
        } else if (i == 1) {
            nd.a.e(((BaseActivity) editTxtActivity).J, "Begin Download Into Cache");
        } else if (i == 2) {
            editTxtActivity.l5(editTxtActivity.d0);
        } else {
            if (i != 3) {
                return;
            }
            editTxtActivity.i5();
        }
    }

    private final void k5(TaskFileData taskFileData) {
        if (taskFileData == null || TextUtils.isEmpty(taskFileData.getFileId())) {
            return;
        }
        if (taskFileData.getFileSize() == 0) {
            l5(this.d0);
            return;
        }
        long completeSize = (taskFileData.getCompleteSize() * ((long) 100)) / taskFileData.getFileSize();
        if (completeSize == 100) {
            l5(this.d0);
            return;
        }
        nd.a.c(((BaseActivity) this).J, "Download Cache Progress" + completeSize);
    }

    private final void l5(String str) {
        FileInfoModel fileInfoModel = i0;
        if (fileInfoModel != null) {
            Intrinsics.checkNotNull(fileInfoModel);
            fileInfoModel.setLocalPath(str);
        }
        C4(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m5(String str) {
        if (x4()) {
            p5();
            return;
        }
        int i = com.zentraedi.outreader.d.q.ou1;
        int i2 = com.zentraedi.outreader.d.q.Zx1;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            String strN = i2 != 0 ? com.zentraedi.basic.function.utils.a.n(i2) : "";
            Intrinsics.checkNotNull(strN);
            str = strN;
        }
        com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(i, str), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n5(String str) {
        t4().rightNavTextEnable.set(Boolean.FALSE);
        h4(r4().I, com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.eu1));
        FileCreateRequest fileCreateRequest = new FileCreateRequest();
        fileCreateRequest.setContent(str);
        FileInfoModel fileInfoModel = i0;
        fileCreateRequest.sendNasRequest(URLEncoder.encode(fileInfoModel != null ? fileInfoModel.getPath() : null, "UTF-8"), "3", new d(str));
    }

    private final void o5() {
        I4(true);
        if (Intrinsics.areEqual(t4().rightNavTextEnable.get(), Boolean.FALSE) || this.f0) {
            finish();
        } else {
            e5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p5() {
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) this, com.zentraedi.outreader.d.l.U2, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.outreader.d.i.wO)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.bv2));
        ((TextView) bVar.b(com.zentraedi.outreader.d.i.PL)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Nx1));
        TextView textView = (TextView) bVar.b(com.zentraedi.outreader.d.i.OL);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ox1));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTxtActivity.q5(this.a, bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.outreader.d.i.AL);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ey));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTxtActivity.r5(bVar, this, view);
            }
        });
        bVar.d(17);
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(EditTxtActivity editTxtActivity, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        editTxtActivity.I4(false);
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(com.zentraedi.basic.function.ui.dialog.b bVar, EditTxtActivity editTxtActivity, View view) {
        bVar.dismiss();
        editTxtActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super/*android.app.Activity*/.finish();
        if (this.e0) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            RefreshFileListByPathEvent refreshFileListByPathEvent = new RefreshFileListByPathEvent();
            FileInfoModel fileInfoModel = i0;
            refreshFileListByPathEvent.setPath(fileInfoModel != null ? fileInfoModel.getParentPath() : null);
            String path = refreshFileListByPathEvent.getPath();
            if (path != null && !StringsKt.endsWith$default(path, "/", false, 2, (Object) null)) {
                refreshFileListByPathEvent.setPath(refreshFileListByPathEvent.getPath() + '/');
            }
            cVarF.q(refreshFileListByPathEvent);
        }
        i0 = null;
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
        i0 = null;
    }

    public boolean onKeyDown(int i, @fo.k KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, event);
        }
        o5();
        return false;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.l FileDownloadProgressEvent fileDownloadProgressEvent) {
        if (fileDownloadProgressEvent != null) {
            TaskFileData fileData = fileDownloadProgressEvent.mBaseTask.getFileData();
            if (TextUtils.isEmpty(fileData.getTargetPath()) || !Intrinsics.areEqual(fileData.getTargetPath(), this.d0)) {
                return;
            }
            k5(fileData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        org.greenrobot.eventbus.c.f().v(this);
        this.f0 = getIntent().getBooleanExtra(j0, false);
        r4().D1(Boolean.valueOf(this.f0));
        if (this.f0) {
            FileInfoModel fileInfoModel = i0;
            C4(fileInfoModel != null ? fileInfoModel.getLocalPath() : null);
            r4().F.setFocusable(false);
            r4().F.setClickable(false);
            r4().F.setFocusableInTouchMode(false);
            r4().F.setMovementMethod(new ScrollingMovementMethod());
        } else {
            i5();
        }
        ObservableField<String> observableField = t4().navTitle;
        FileInfoModel fileInfoModel2 = i0;
        observableField.set(fileInfoModel2 != null ? fileInfoModel2.getName() : null);
        t4().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTxtActivity.f5(this.a, view);
            }
        });
        t4().setRightTextOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTxtActivity.g5(this.a, view);
            }
        });
        t4().setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTxtActivity.h5(this.a, view);
            }
        });
        FileInfoModel fileInfoModel3 = i0;
        H4((fileInfoModel3 != null ? fileInfoModel3.getSize() : 0L) > 2097152);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void s3() {
        r4().E1(t4());
        FileInfoModel fileInfoModel = i0;
        Integer numValueOf = fileInfoModel != null ? Integer.valueOf(fileInfoModel.getPermission()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 3)) {
            r4().F.setFocusable(false);
            t4().rightNavTextEnable.set(Boolean.FALSE);
        } else {
            r4().F.setCursorVisible(false);
            r4().F.setOnTouchListener(new c());
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k TxtEncodeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        J4();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k FileDownloadFailEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TaskFileData fileData = event.mBaseTask.getFileData();
        if (TextUtils.isEmpty(fileData.getTargetPath())) {
            return;
        }
        String targetPath = fileData.getTargetPath();
        Intrinsics.checkNotNullExpressionValue(targetPath, "getTargetPath(...)");
        String str = this.d0;
        Intrinsics.checkNotNull(str);
        if (StringsKt.startsWith$default(targetPath, str, false, 2, (Object) null)) {
            hideContentLoading(r4().I);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gt1), false);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ReaderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventId() == 1) {
            finish();
        }
    }
}
