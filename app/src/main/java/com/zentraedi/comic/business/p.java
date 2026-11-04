package com.zentraedi.comic.business;

import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class p {

    @fo.k
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.f();
        }
    });

    public static final class a implements com.zentraedi.business.manager.download.j.b {
        a() {
        }

        public void canceled() {
        }

        public void showLoading(boolean z) {
        }

        public void success(boolean z) {
        }
    }

    private final w e() {
        return (w) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w f() {
        return new w();
    }

    private final void g(final ComicInfoModel comicInfoModel) {
        String id2;
        ComicCategory category;
        ig.k kVar = ig.k.a;
        String id3 = comicInfoModel.getId();
        ComicDirModel dir = comicInfoModel.getDir();
        if (dir == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
            id2 = "";
        }
        kVar.r(id3, id2, new Function1() { // from class: com.zentraedi.comic.business.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.h(comicInfoModel, (ReadingRecord) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ComicInfoModel comicInfoModel, ReadingRecord readingRecord) {
        String id2;
        ComicCategory category;
        if (readingRecord == null) {
            String id3 = comicInfoModel.getId();
            ComicDirModel dir = comicInfoModel.getDir();
            if (dir == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
                id2 = "";
            }
            String str = id2;
            String cover = comicInfoModel.getCover();
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            Intrinsics.checkNotNullExpressionValue(strLoginUserName, "loginUserName(...)");
            String nasId = NasConnectManager.getInstance().getNasId();
            Intrinsics.checkNotNullExpressionValue(nasId, "getNasId(...)");
            ReadingRecord readingRecord2 = new ReadingRecord(id3, str, cover, strLoginUserName, nasId, comicInfoModel.getName(), comicInfoModel.getPath(), 0, 0, true, 0L);
            readingRecord2.setComicNasPath(comicInfoModel.getComicMainPath());
            readingRecord = readingRecord2;
        } else {
            readingRecord.setLocalDownload(true);
            readingRecord.setComicNasPath(comicInfoModel.getComicMainPath());
        }
        ig.k.a.I(readingRecord);
        return Unit.INSTANCE;
    }

    public final boolean c(@fo.k String filePath, @fo.k ComicInfoModel comicModel) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(comicModel, "comicModel");
        String strH = com.zentraedi.comic.util.f.a.h(comicModel.getId(), filePath);
        g(comicModel);
        if (new File(strH).exists()) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Il0), true);
            return false;
        }
        TaskFileData taskFileData = new TaskFileData();
        taskFileData.setFileId(filePath);
        taskFileData.setTargetPath(strH);
        com.zentraedi.business.task.g.D().m(ComicSubDirActivity.m0, taskFileData, false);
        return true;
    }

    public final boolean d(@fo.k String filePath, @fo.k ComicInfoModel comicModel) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(comicModel, "comicModel");
        String strH = com.zentraedi.comic.util.f.a.h(comicModel.getId(), filePath);
        g(comicModel);
        e().b(filePath, strH, false, new a());
        return true;
    }
}
