package com.zentraedi.comic.activity;

import android.content.Context;
import android.content.Intent;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.activity.PhoneImagePickerActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class SelectPhoneImageActivity extends BaseActivity {

    @fo.k
    public static final a T = new a(null);

    @fo.k
    private static final String U = "SelectPhoneImageActivity";
    private static final int V = 101;

    @fo.l
    private static b W;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.l
        public final b a() {
            return SelectPhoneImageActivity.W;
        }

        public final void b(@fo.k Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SelectPhoneImageActivity.class));
        }

        public final void c(@fo.l b bVar) {
            SelectPhoneImageActivity.W = bVar;
        }

        private a() {
        }
    }

    public interface b {
        void a(@fo.l String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onActivityResult(int i, int i2, @fo.l Intent intent) {
        ArrayList<String> stringArrayListExtra;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (intent == null) {
            finish();
            return;
        }
        String str = (i != 101 || i2 != -1 || (stringArrayListExtra = intent.getStringArrayListExtra("list")) == null || stringArrayListExtra.isEmpty()) ? null : stringArrayListExtra.get(0);
        nd.a.e(U, "path = " + str);
        b bVar = W;
        if (bVar != null) {
            bVar.a(str);
        }
        finish();
    }

    protected void onDestroy() {
        super.onDestroy();
        W = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        PhoneImagePickerActivity.Z.a(this, 101);
    }

    protected void s3() {
    }
}
