package com.zentraedi.comic.business;

import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.task.database.FolderItemTaskEntity;
import com.zentraedi.business.utils.b5;
import com.zentraedi.business.utils.l5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicFolderDownloadBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicFolderDownloadBusiness.kt\ncom/zentraedi/comic/business/ComicFolderDownloadBusiness\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1617#2,9:92\n1869#2:101\n1870#2:103\n1626#2:104\n1#3:102\n*S KotlinDebug\n*F\n+ 1 ComicFolderDownloadBusiness.kt\ncom/zentraedi/comic/business/ComicFolderDownloadBusiness\n*L\n62#1:92,9\n62#1:101\n62#1:103\n62#1:104\n62#1:102\n*E\n"})
public final class w {

    public static final class a implements com.zentraedi.business.manager.download.b {
        final /* synthetic */ FileInfoModel b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ com.zentraedi.business.manager.download.j.b e;

        a(FileInfoModel fileInfoModel, String str, boolean z, com.zentraedi.business.manager.download.j.b bVar) {
            this.b = fileInfoModel;
            this.c = str;
            this.d = z;
            this.e = bVar;
        }

        public void a() {
            com.zentraedi.business.manager.download.j.b bVar = this.e;
            if (bVar != null) {
                bVar.canceled();
            }
        }

        public void b(long j, List<? extends FileInfoModel> fileList) {
            Intrinsics.checkNotNullParameter(fileList, "fileList");
            w.this.c(this.b, this.c, this.d, j, fileList, this.e);
        }

        public void onError(String str, String str2) {
            nd.a.c("DownloadTag", "folderContentLoader.loadContent error:" + str + ", " + str2);
            com.zentraedi.business.manager.download.j.b bVar = this.e;
            if (bVar != null) {
                bVar.success(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(FileInfoModel fileInfoModel, String str, boolean z, long j, List<? extends FileInfoModel> list, com.zentraedi.business.manager.download.j.b bVar) {
        String path;
        long j2 = com.zentraedi.basic.function.utils.u0.j();
        if (fileInfoModel == null || (path = fileInfoModel.getPath()) == null) {
            return;
        }
        try {
            new File(str).mkdirs();
        } catch (Exception e) {
            nd.a.c("DownloadTag", "folder download-> create folder exception:" + e.getLocalizedMessage());
        }
        fileInfoModel.setLocalPath(str);
        ArrayList arrayList = new ArrayList();
        for (FileInfoModel fileInfoModel2 : list) {
            String path2 = fileInfoModel2.getPath();
            String str2 = null;
            if (path2 != null) {
                String folderItemTaskEntity = new FolderItemTaskEntity();
                String strReplace$default = StringsKt.replace$default(path2, path, "", false, 4, (Object) null);
                if (!StringsKt.startsWith$default(strReplace$default, "/", false, 2, (Object) null)) {
                    strReplace$default = '/' + strReplace$default;
                }
                folderItemTaskEntity.setTargetPath(str + strReplace$default);
                folderItemTaskEntity.setFileId(path2);
                folderItemTaskEntity.setFolderName(path + j2);
                folderItemTaskEntity.setTotalSize(fileInfoModel2.getSize());
                Long modifyTimeValue = fileInfoModel2.getModifyTimeValue();
                folderItemTaskEntity.setModifyDate(modifyTimeValue != null ? String.valueOf(modifyTimeValue.longValue()) : null);
                folderItemTaskEntity.setCreateDate(fileInfoModel2.getCreated_at());
                folderItemTaskEntity.setUserId(com.zentraedi.business.w0.c);
                folderItemTaskEntity.setNasId(com.zentraedi.business.w0.a);
                folderItemTaskEntity.setState(1);
                folderItemTaskEntity.setExtra(fileInfoModel2.getDownloadArgs());
                str2 = folderItemTaskEntity;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        fileInfoModel.set_tfnum(String.valueOf(arrayList.size()));
        fileInfoModel.setSize(j);
        b5.e(fileInfoModel, arrayList, b5.l(), z);
        if (bVar != null) {
            bVar.success(true);
        }
    }

    public final void b(@fo.k String nasFolderPath, @fo.k String targetPath, boolean z, @fo.l com.zentraedi.business.manager.download.j.b bVar) {
        Intrinsics.checkNotNullParameter(nasFolderPath, "nasFolderPath");
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        com.zentraedi.business.manager.download.m mVar = new com.zentraedi.business.manager.download.m();
        FileInfoModel fileInfoModel = new FileInfoModel();
        fileInfoModel.setPath(nasFolderPath);
        fileInfoModel.setName(l5.r(nasFolderPath));
        mVar.d(fileInfoModel, new a(fileInfoModel, targetPath, z, bVar));
    }
}
