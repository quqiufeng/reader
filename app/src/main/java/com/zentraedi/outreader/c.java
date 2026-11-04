package com.zentraedi.outreader;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.zentraedi.business.l0;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.outreader.activity.EditTxtActivity;
import com.zentraedi.outreader.activity.LocalTxtActivity;
import com.zentraedi.outreader.activity.ZReaderActivity;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class c {

    class a implements l0.x {
        a() {
        }

        public Fragment a(String localPath) {
            com.zentraedi.reader.pdfscroll.c cVar = new com.zentraedi.reader.pdfscroll.c();
            cVar.T2(localPath);
            return cVar;
        }

        public void b(Activity activity, FileInfoModel fileInfoModel, String from) {
            ZReaderActivity.g7(activity, fileInfoModel, from);
        }

        public void c(Activity activity, String localTxtPath) {
            LocalTxtActivity.d0.a(activity, localTxtPath);
        }

        public void d(Activity activity, FileInfoModel fileInfoModel, boolean isZipPre) {
            EditTxtActivity.g0.b(activity, fileInfoModel, isZipPre);
        }
    }

    public static void a() {
        l0.g().f0(new a());
    }

    public static boolean b() {
        return com.zentraedi.outreader.wrapper.b.a.k();
    }
}
