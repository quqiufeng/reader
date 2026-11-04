package com.zentraedi.comic.delegate;

import android.app.Activity;
import com.google.gson.Gson;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.FileInfoRequest;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l0;
import com.zentraedi.comic.activity.ComicCompressionBrowserActivity;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.business.x1;
import com.zentraedi.comic.viewmodel.i6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nOpenReaderDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenReaderDelegate.kt\ncom/zentraedi/comic/delegate/OpenReaderDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class m {

    @fo.k
    public static final m a = new m();

    @fo.k
    private static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.delegate.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.p();
        }
    });

    public static final class a extends com.zentraedi.business.http.b<FileInfoModel> {
        final /* synthetic */ String a;
        final /* synthetic */ Function1<FileInfoModel, Unit> b;

        a(String str, Function1<? super FileInfoModel, Unit> function1) {
            this.a = str;
            this.b = function1;
        }

        public void onResult(ResponseData<FileInfoModel> responseData) {
            nd.a.a("OpenReaderDelegate", "getFileInfo onResult path=" + this.a + " resp=" + responseData);
            if (responseData == null || !responseData.isSuccess()) {
                return;
            }
            this.b.invoke(responseData.getData());
        }

        public void onServerError() {
            nd.a.c("OpenReaderDelegate", "getFileInfo onServerError path=" + this.a);
            this.b.invoke(null);
        }
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Activity activity, FileInfoModel fileInfoModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("openReader picture fileInfo=");
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        sb.append(" null=");
        sb.append(fileInfoModel == null);
        nd.a.e("OpenReaderDelegate", sb.toString());
        if (fileInfoModel != null) {
            ComicReaderActivity.a aVar = ComicReaderActivity.x5;
            Intrinsics.checkNotNull(activity);
            aVar.a(activity, fileInfoModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(final ComicInfoModel comicInfoModel, final Function1 function1, String str) {
        nd.a.a("OpenReaderDelegate", "setDefaultCover cover=" + str + " path=" + comicInfoModel.getPath() + " id=" + comicInfoModel.getId());
        if (str == null || str.length() == 0) {
            function1.invoke(comicInfoModel);
        } else {
            x1.S(a.o(), comicInfoModel, comicInfoModel.getName(), str, null, new Function0() { // from class: com.zentraedi.comic.delegate.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.D(comicInfoModel, function1);
                }
            }, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(ComicInfoModel comicInfoModel, Function1 function1) {
        nd.a.e("OpenReaderDelegate", "setDefaultCover editComic done path=" + comicInfoModel.getPath() + " id=" + comicInfoModel.getId());
        function1.invoke(comicInfoModel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void k(m mVar, String str, String str2, Boolean bool, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.TRUE;
        }
        mVar.j(str, str2, bool, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(final String str, final Function1 function1, Boolean bool, String str2, boolean z, final ComicInfoModel comicInfoModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("getComicInfoModel onResult success=");
        sb.append(z);
        sb.append(" modelPath=");
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" id=");
        sb.append(comicInfoModel != null ? comicInfoModel.getId() : null);
        sb.append(" path=");
        sb.append(str);
        nd.a.a("OpenReaderDelegate", sb.toString());
        if (!z) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        if (comicInfoModel != null) {
            function1.invoke(comicInfoModel);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        x1.M(a.o(), str2, str, null, new Function1() { // from class: com.zentraedi.comic.delegate.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.m(str, function1, comicInfoModel, (ComicInfoModel) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, Function1 function1, ComicInfoModel comicInfoModel, ComicInfoModel info) {
        Intrinsics.checkNotNullParameter(info, "info");
        nd.a.e("OpenReaderDelegate", "getComicInfoModel createComic done path=" + str + " infoPath=" + info.getPath() + " infoId=" + info.getId());
        String cover = info.getCover();
        if (cover == null || cover.length() == 0) {
            a.B(info, function1);
        } else {
            function1.invoke(comicInfoModel);
        }
        return Unit.INSTANCE;
    }

    private final x1 o() {
        return (x1) b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 p() {
        return new x1();
    }

    public static /* synthetic */ void w(m mVar, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = -1;
        }
        mVar.v(str, str2, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Activity activity, Integer num, ComicInfoModel comicInfoModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("openReader zip comicInfo=");
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" id=");
        sb.append(comicInfoModel != null ? comicInfoModel.getId() : null);
        sb.append(" null=");
        sb.append(comicInfoModel == null);
        nd.a.e("OpenReaderDelegate", sb.toString());
        if (comicInfoModel == null) {
            return Unit.INSTANCE;
        }
        ComicCompressionBrowserActivity.a aVar = ComicCompressionBrowserActivity.b0;
        Intrinsics.checkNotNull(activity);
        aVar.a(activity, comicInfoModel, l0.d(l0.a, (String) null, (String) null, (String) null, num, 7, (Object) null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Activity activity, ComicInfoModel comicInfoModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("openReader book comicInfo=");
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" id=");
        sb.append(comicInfoModel != null ? comicInfoModel.getId() : null);
        sb.append(" null=");
        sb.append(comicInfoModel == null);
        nd.a.e("OpenReaderDelegate", sb.toString());
        if (comicInfoModel == null) {
            return Unit.INSTANCE;
        }
        ComicReaderActivity.a aVar = ComicReaderActivity.x5;
        Intrinsics.checkNotNull(activity);
        aVar.a(activity, comicInfoModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String str, Integer num, final Activity activity, ComicInfoModel comicInfoModel) {
        StringBuilder sb = new StringBuilder();
        sb.append("openReader other comicInfo=");
        sb.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        sb.append(" id=");
        sb.append(comicInfoModel != null ? comicInfoModel.getId() : null);
        sb.append(" null=");
        sb.append(comicInfoModel == null);
        nd.a.e("OpenReaderDelegate", sb.toString());
        if (comicInfoModel != null) {
            BaseModel comicInfoModel2 = new ComicInfoModel();
            comicInfoModel2.setName(comicInfoModel.getName());
            comicInfoModel2.setPath(comicInfoModel.getPath());
            comicInfoModel2.setId(comicInfoModel.getId());
            comicInfoModel.createNewProgress(str);
            if (num != null && num.intValue() == -1) {
                comicInfoModel2.setProgress(comicInfoModel.getProgress());
            } else {
                Gson gsonB = com.zentraedi.basic.component.utils.a.b();
                String progress = comicInfoModel.getProgress();
                if (progress == null) {
                    progress = "";
                }
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) gsonB.fromJson(progress, NasReadingRecordModule.class);
                if (nasReadingRecordModule != null) {
                    nasReadingRecordModule.setPosition(num != null ? num.intValue() : -1);
                    nasReadingRecordModule.setFilePath(comicInfoModel2.getPath());
                    String json = com.zentraedi.basic.component.utils.a.b().toJson(nasReadingRecordModule);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    comicInfoModel2.setProgress(json);
                } else {
                    comicInfoModel2.setProgress(comicInfoModel.getProgress());
                }
            }
            comicInfoModel2.setOnShelf(comicInfoModel.getOnShelf());
            comicInfoModel2.setCover(comicInfoModel.getCover());
            comicInfoModel2.setDir(comicInfoModel.getDir());
            ComicReaderActivity.a aVar = ComicReaderActivity.x5;
            Intrinsics.checkNotNull(activity);
            aVar.a(activity, comicInfoModel2);
        } else if (3 == i5.a.f(str)) {
            a.n(str, new Function1() { // from class: com.zentraedi.comic.delegate.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.A(activity, (FileInfoModel) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public final void B(@fo.k final ComicInfoModel model, @fo.k final Function1<? super ComicInfoModel, Unit> callback) {
        String id2;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callback, "callback");
        nd.a.a("OpenReaderDelegate", "setDefaultCover begin path=" + model.getPath() + " id=" + model.getId());
        x1 x1VarO = o();
        ComicDirModel dir = model.getDir();
        if (dir == null || (id2 = dir.getId()) == null) {
            id2 = "";
        }
        x1VarO.W(id2, model.getPath(), new Function1() { // from class: com.zentraedi.comic.delegate.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.C(model, callback, (String) obj);
            }
        });
    }

    public final void j(@fo.k final String dirId, @fo.k final String path, @fo.l final Boolean bool, @fo.k final Function1<? super ComicInfoModel, Unit> callback) {
        Intrinsics.checkNotNullParameter(dirId, "dirId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        nd.a.a("OpenReaderDelegate", "getComicInfoModel request dirId=" + dirId + " path=" + path + " autoCreate=" + bool);
        o().T(dirId, path, new Function2() { // from class: com.zentraedi.comic.delegate.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m.l(path, callback, bool, dirId, ((Boolean) obj).booleanValue(), (ComicInfoModel) obj2);
            }
        });
    }

    public final void n(@fo.k String path, @fo.k Function1<? super FileInfoModel, Unit> result) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(result, "result");
        FileInfoRequest fileInfoRequest = new FileInfoRequest();
        fileInfoRequest.setFilePath(path);
        nd.a.a("OpenReaderDelegate", "getFileInfo path=" + path);
        com.zentraedi.business.http.a.b().h(fileInfoRequest, new a(path, result));
    }

    public final boolean q(@fo.k com.zentraedi.comic.viewmodel.l0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (!model.b0()) {
            return false;
        }
        ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
        Intrinsics.checkNotNull(activityE);
        ComicDirModel comicDirModelP = model.P();
        String rootDirId = comicDirModelP != null ? comicDirModelP.getRootDirId() : null;
        ComicDirModel comicDirModelP2 = model.P();
        ComicSubDirActivity.a.b(aVar, activityE, "0", rootDirId, comicDirModelP2 != null ? comicDirModelP2.getPath() : null, model.getPath(), null, model.Q(), 32, null);
        return true;
    }

    public final boolean r(@fo.k i6 model) {
        ComicDirModel dir;
        ComicDirModel dir2;
        Intrinsics.checkNotNullParameter(model, "model");
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (!model.z0()) {
            return false;
        }
        ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
        Intrinsics.checkNotNull(activityE);
        ComicInfoModel comicInfoModelY0 = model.y0();
        String id2 = (comicInfoModelY0 == null || (dir2 = comicInfoModelY0.getDir()) == null) ? null : dir2.getId();
        ComicInfoModel comicInfoModelY1 = model.y0();
        String path = (comicInfoModelY1 == null || (dir = comicInfoModelY1.getDir()) == null) ? null : dir.getPath();
        ComicInfoModel comicInfoModelY2 = model.y0();
        ComicSubDirActivity.a.b(aVar, activityE, "0", id2, path, comicInfoModelY2 != null ? comicInfoModelY2.getPath() : null, null, model.y0(), 32, null);
        return true;
    }

    public final void s(@fo.k com.zentraedi.comic.viewmodel.l0 model) {
        String rootDirId;
        Intrinsics.checkNotNullParameter(model, "model");
        if (q(model)) {
            return;
        }
        ComicDirModel comicDirModelP = model.P();
        String str = (comicDirModelP == null || (rootDirId = comicDirModelP.getRootDirId()) == null) ? "" : rootDirId;
        String path = model.getPath();
        w(this, str, path == null ? "" : path, null, null, 12, null);
    }

    public final void t(@fo.k com.zentraedi.comic.viewmodel.l0 model, int i) {
        String rootDirId;
        Intrinsics.checkNotNullParameter(model, "model");
        if (q(model)) {
            return;
        }
        ComicDirModel comicDirModelP = model.P();
        if (comicDirModelP == null || (rootDirId = comicDirModelP.getRootDirId()) == null) {
            rootDirId = "";
        }
        String path = model.getPath();
        v(rootDirId, path != null ? path : "", null, Integer.valueOf(i));
    }

    public final void u(@fo.k i6 model) {
        String path;
        ComicDirModel dir;
        String id2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (r(model)) {
            return;
        }
        ComicInfoModel comicInfoModelY0 = model.y0();
        String str = (comicInfoModelY0 == null || (dir = comicInfoModelY0.getDir()) == null || (id2 = dir.getId()) == null) ? "" : id2;
        ComicInfoModel comicInfoModelY1 = model.y0();
        w(this, str, (comicInfoModelY1 == null || (path = comicInfoModelY1.getPath()) == null) ? "" : path, model.p0(), null, 8, null);
    }

    public final void v(@fo.k String dirId, @fo.k final String path, @fo.l final Integer num, @fo.l final Integer num2) {
        Intrinsics.checkNotNullParameter(dirId, "dirId");
        Intrinsics.checkNotNullParameter(path, "path");
        final Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        StringBuilder sb = new StringBuilder();
        sb.append("openReader begin dirId=");
        sb.append(dirId);
        sb.append(" path=");
        sb.append(path);
        sb.append(" fromPage=");
        sb.append(num);
        sb.append(" position=");
        sb.append(num2);
        sb.append(" activity=");
        sb.append(activityE != null ? activityE.getClass().getSimpleName() : null);
        nd.a.e("OpenReaderDelegate", sb.toString());
        i5 i5Var = i5.a;
        if (!i5Var.p(path)) {
            nd.a.c("OpenReaderDelegate", "openReader not support path=" + path);
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.EK));
            return;
        }
        int iF = i5Var.f(path);
        nd.a.e("OpenReaderDelegate", "openReader fileType=" + iF + " path=" + path);
        if (iF == 10) {
            k(this, dirId, path, null, new Function1() { // from class: com.zentraedi.comic.delegate.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.x(activityE, num, (ComicInfoModel) obj);
                }
            }, 4, null);
            return;
        }
        if (iF == 8 || iF == 26 || iF == 33 || iF == 57) {
            k(this, dirId, path, null, new Function1() { // from class: com.zentraedi.comic.delegate.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.y(activityE, (ComicInfoModel) obj);
                }
            }, 4, null);
        } else {
            j(dirId, d5.a.m(path), Boolean.FALSE, new Function1() { // from class: com.zentraedi.comic.delegate.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.z(path, num2, activityE, (ComicInfoModel) obj);
                }
            });
        }
    }
}
