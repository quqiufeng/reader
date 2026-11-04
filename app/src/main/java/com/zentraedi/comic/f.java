package com.zentraedi.comic;

import android.app.Activity;
import com.google.gson.Gson;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.l0;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.d5;
import com.zentraedi.comic.activity.ComicMainActivity;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.activity.OfflineComicMainActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicModule.kt\ncom/zentraedi/comic/ComicModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FilePathConvertUtils.kt\ncom/zentraedi/business/utils/FilePathConvertUtils$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1869#2:100\n1870#2:107\n586#3:101\n586#3:102\n586#3:103\n586#3:104\n586#3:105\n586#3:106\n1#4:108\n*S KotlinDebug\n*F\n+ 1 ComicModule.kt\ncom/zentraedi/comic/ComicModule\n*L\n61#1:100\n61#1:107\n67#1:101\n68#1:102\n69#1:103\n70#1:104\n87#1:105\n89#1:106\n*E\n"})
public final class f {

    @fo.k
    public static final f a = new f();

    public static final class a implements l0.i {
        a() {
        }

        public List<String> a(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            List<String> listB = ig.k.a.B(username);
            return listB == null ? new ArrayList() : listB;
        }

        public void b() {
            ComicMainActivity.a aVar = ComicMainActivity.W;
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
            aVar.c(activityE);
        }

        public void c(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OfflineComicMainActivity.a.c(OfflineComicMainActivity.d0, activity, null, 2, null);
        }

        public void d(FileInfoModel fileInfoModel) {
            ComicReaderActivity.a aVar = ComicReaderActivity.x5;
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
            aVar.a(activityE, fileInfoModel);
        }

        public void e(com.zentraedi.business.listener.l lVar) {
            com.zentraedi.comic.util.i.a.a(lVar);
        }

        public boolean f(String username, String nasId) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(nasId, "nasId");
            return !j0.l(ig.k.a.D(username, nasId));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(List list) {
        String strZ;
        String strZ2;
        String strZ3;
        String strZ4;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReadingRecord readingRecord = (ReadingRecord) it.next();
                com.zentraedi.comic.util.f fVar = com.zentraedi.comic.util.f.a;
                String strH = fVar.h(readingRecord.getComicId(), readingRecord.getComicNasPath());
                d5.a aVar = d5.a;
                String strZ5 = aVar.z(readingRecord.getComicId().toString());
                String str = "";
                if (strZ5 == null) {
                    strZ5 = "";
                }
                readingRecord.setComicId(strZ5);
                String comicPath = readingRecord.getComicPath();
                if (comicPath == null || (strZ = aVar.z(comicPath.toString())) == null) {
                    strZ = "";
                }
                readingRecord.setComicPath(strZ);
                String comicThumb = readingRecord.getComicThumb();
                if (comicThumb == null || (strZ2 = aVar.z(comicThumb.toString())) == null) {
                    strZ2 = "";
                }
                readingRecord.setComicThumb(strZ2);
                String comicNasPath = readingRecord.getComicNasPath();
                if (comicNasPath == null || (strZ3 = aVar.z(comicNasPath.toString())) == null) {
                    strZ3 = "";
                }
                readingRecord.setComicNasPath(strZ3);
                String strH2 = fVar.h(readingRecord.getComicId(), readingRecord.getComicNasPath());
                if (readingRecord.getLocalDownload()) {
                    File file = new File(strH);
                    if (file.exists() && file.isDirectory()) {
                        File file2 = new File(strH2);
                        if (!file2.exists()) {
                            file.renameTo(file2);
                        }
                    }
                }
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(String.valueOf(readingRecord.getProgress()), NasReadingRecordModule.class);
                if (nasReadingRecordModule != null) {
                    String strZ6 = aVar.z(nasReadingRecordModule.getFilePath().toString());
                    if (strZ6 == null) {
                        strZ6 = "";
                    }
                    nasReadingRecordModule.setFilePath(strZ6);
                    String currentPath = nasReadingRecordModule.getCurrentPath();
                    if (currentPath != null && (strZ4 = aVar.z(currentPath.toString())) != null) {
                        str = strZ4;
                    }
                    nasReadingRecordModule.setCurrentPath(str);
                    readingRecord.setProgress(new Gson().toJson(nasReadingRecordModule));
                }
            }
        }
        if (list != null) {
            ig.k.a.H(list);
        }
        return Unit.INSTANCE;
    }

    public final void b() {
        l0.g().R(new a());
    }

    public final void c(@fo.k String userId, @fo.k String nasId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nasId, "nasId");
        ig.k.a.m(new Function1() { // from class: com.zentraedi.comic.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.d((List) obj);
            }
        });
    }
}
