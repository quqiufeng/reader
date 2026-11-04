package com.zentraedi.comic.viewmodel;

import android.graphics.BitmapFactory;
import androidx.databinding.ObservableArrayList;
import com.google.gson.Gson;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.http.NasDeviceRequest;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.model.FileListModel;
import com.zentraedi.business.request.ComicAddReadingRecordRequest;
import com.zentraedi.business.request.ComicSearchReadingRecordRequest;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.business.request.NasReadingRecord;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.p7;
import com.zentraedi.comic.adapter.ComicItemType;
import com.zentraedi.comic.data.ComicZipModel;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import retrofit2.Call;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicReaderNetDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReaderNetDataViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderNetDataViewModel\n+ 2 FilePathConstant.kt\ncom/zentraedi/business/FilePathConstantKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1289#2:460\n13805#3,2:461\n13805#3,2:468\n1#4:463\n1869#5,2:464\n1869#5,2:466\n*S KotlinDebug\n*F\n+ 1 ComicReaderNetDataViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderNetDataViewModel\n*L\n65#1:460\n261#1:461,2\n386#1:468,2\n357#1:464,2\n372#1:466,2\n*E\n"})
public final class m4 extends com.zentraedi.basic.function.viewmodel.d {

    @fo.l
    private FileListRequest B;
    private int C;

    @fo.l
    private String E;

    @fo.l
    private Call<ResponseBody> F;
    private String D = FileListRequest.URL_FILE_REQUEST_FILE_LIST;

    @fo.k
    private androidx.databinding.w<FileInfoModel> G = new ObservableArrayList();

    @fo.k
    private androidx.databinding.w<FileInfoModel> H = new ObservableArrayList();

    @fo.k
    private androidx.lifecycle.d1<NasReadingRecord> I = new androidx.lifecycle.d1<>();

    @fo.k
    private Function1<? super Boolean, Unit> J = new Function1() { // from class: com.zentraedi.comic.viewmodel.l4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m4.V0(((Boolean) obj).booleanValue());
        }
    };

    @SourceDebugExtension({"SMAP\nComicReaderNetDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReaderNetDataViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderNetDataViewModel$ResultHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n774#2:460\n865#2,2:461\n774#2:463\n865#2,2:464\n1#3:466\n*S KotlinDebug\n*F\n+ 1 ComicReaderNetDataViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicReaderNetDataViewModel$ResultHandler\n*L\n159#1:460\n159#1:461,2\n162#1:463\n162#1:464,2\n*E\n"})
    private final class a extends com.zentraedi.business.manager.file.p<FileListModel> {

        @fo.l
        private final NasDeviceRequest a;
        private final boolean b;

        @fo.l
        private final Integer c;

        public a(NasDeviceRequest nasDeviceRequest, @fo.l boolean z, Integer num) {
            this.a = nasDeviceRequest;
            this.b = z;
            this.c = num;
        }

        @fo.l
        public final Integer getNum() {
            return this.c;
        }

        @fo.l
        public final NasDeviceRequest getRequest() {
            return this.a;
        }

        public void onResultOK(@fo.k ResponseData<FileListModel> resp) {
            FileListModel data;
            ArrayList arrayList;
            List list;
            List list2;
            Intrinsics.checkNotNullParameter(resp, "resp");
            StringBuilder sb = new StringBuilder();
            sb.append("onResultOK isRefresh=");
            sb.append(this.b);
            sb.append(" request=");
            NasDeviceRequest nasDeviceRequest = this.a;
            ArrayList arrayList2 = null;
            sb.append(nasDeviceRequest != null ? nasDeviceRequest.getClass().getSimpleName() : null);
            sb.append(" total=");
            FileListModel data2 = resp.getData();
            sb.append(data2 != null ? Integer.valueOf(data2.getTotal()) : null);
            sb.append(" listSize=");
            FileListModel data3 = resp.getData();
            sb.append((data3 == null || (list2 = data3.getList()) == null) ? 0 : list2.size());
            sb.append(" code=");
            sb.append(resp.getCode());
            sb.append(" filePath=");
            sb.append(m4.this.R0());
            nd.a.e("ComicReaderNetDataVM", sb.toString());
            FileListModel data4 = resp.getData();
            if ((data4 != null ? data4.getList() : null) == null || !((data = resp.getData()) == null || (list = data.getList()) == null || list.size() != 0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onResultOK empty list request=");
                NasDeviceRequest nasDeviceRequest2 = this.a;
                sb2.append(nasDeviceRequest2 != null ? nasDeviceRequest2.getClass().getSimpleName() : null);
                sb2.append(" total=");
                FileListModel data5 = resp.getData();
                sb2.append(data5 != null ? Integer.valueOf(data5.getTotal()) : null);
                sb2.append(" filePath=");
                sb2.append(m4.this.R0());
                nd.a.h("ComicReaderNetDataVM", sb2.toString());
                m4.this.T0().invoke(Boolean.FALSE);
                return;
            }
            List list3 = resp.getData().getList();
            if (list3 != null) {
                arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (((FileInfoModel) obj).getFtype() == 101) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (list3 != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((FileInfoModel) obj2).getDetailFType() == 8) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList != null) {
                m4.this.P0().addAll(arrayList);
            }
            if (arrayList2 != null) {
                m4.this.Q0().addAll(arrayList2);
            }
            int total = resp.getData().getTotal();
            int i = m4.this.C + 1;
            Integer num = this.c;
            boolean z = i * (num != null ? num.intValue() : 1000) < total && total != 0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onResultOK filtered imageCount=");
            sb3.append(arrayList != null ? arrayList.size() : 0);
            sb3.append(" pdfCount=");
            sb3.append(arrayList2 != null ? arrayList2.size() : 0);
            sb3.append(" total=");
            sb3.append(total);
            sb3.append(" hasMore=");
            sb3.append(z);
            sb3.append(" filePath=");
            sb3.append(m4.this.R0());
            nd.a.e("ComicReaderNetDataVM", sb3.toString());
            m4.this.T0().invoke(Boolean.valueOf(z));
        }

        public void onResultOtherState(@fo.k ResponseData<FileListModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
        }

        public void onServerError() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComicItemType.values().length];
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_EPUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                org.greenrobot.eventbus.c.f().q(new ReadRecordUpdateSuccessEvent(this.a, this.b));
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicReaderNetDataViewModel$getFilesInDirectorySorted$3", f = "ComicReaderNetDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ ComicItemType b;
        final /* synthetic */ m4 c;
        final /* synthetic */ androidx.databinding.w<FileInfoModel> d;
        final /* synthetic */ String e;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComicItemType.values().length];
                try {
                    iArr[ComicItemType.COMIC_ITEM_TYPE_IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComicItemType.COMIC_ITEM_TYPE_PDF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ComicItemType comicItemType, m4 m4Var, androidx.databinding.w<FileInfoModel> wVar, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = comicItemType;
            this.c = m4Var;
            this.d = wVar;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ComicItemType comicItemType = this.b;
            int i = comicItemType == null ? -1 : a.$EnumSwitchMapping$0[comicItemType.ordinal()];
            if (i == 1) {
                Boxing.boxBoolean(this.c.P0().addAll(this.d));
            } else if (i != 2) {
                Unit unit = Unit.INSTANCE;
            } else {
                Boxing.boxBoolean(this.c.Q0().addAll(this.d));
            }
            nd.a.e("ComicReaderNetDataVM", "getFilesInDirectorySorted publish image=" + this.c.P0().size() + " pdf=" + this.c.Q0().size() + " form=" + this.b + " path=" + this.e);
            this.c.T0().invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicReaderNetDataViewModel$getFilesInZip$2", f = "ComicReaderNetDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ ComicItemType b;
        final /* synthetic */ m4 c;
        final /* synthetic */ androidx.databinding.w<FileInfoModel> d;
        final /* synthetic */ ComicZipModel e;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComicItemType.values().length];
                try {
                    iArr[ComicItemType.COMIC_ITEM_TYPE_IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComicItemType.COMIC_ITEM_TYPE_PDF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ComicItemType.COMIC_ITEM_TYPE_EPUB.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ComicItemType comicItemType, m4 m4Var, androidx.databinding.w<FileInfoModel> wVar, ComicZipModel comicZipModel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = comicItemType;
            this.c = m4Var;
            this.d = wVar;
            this.e = comicZipModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ComicItemType comicItemType = this.b;
            int i = comicItemType == null ? -1 : a.$EnumSwitchMapping$0[comicItemType.ordinal()];
            if (i == 1) {
                Boxing.boxBoolean(this.c.P0().addAll(this.d));
            } else if (i == 2 || i == 3) {
                Boxing.boxBoolean(this.c.Q0().addAll(this.d));
            } else {
                Unit unit = Unit.INSTANCE;
            }
            nd.a.e("ComicReaderNetDataVM", "getFilesInZip publish image=" + this.c.P0().size() + " pdf=" + this.c.Q0().size() + " form=" + this.b + " zipPath=" + this.e.getPath());
            this.c.T0().invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class f extends com.zentraedi.business.http.b<NasReadingRecord> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        f(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(m4 m4Var, String str, ReadingRecord readingRecord) {
            if (readingRecord == null) {
                return Unit.INSTANCE;
            }
            Gson gson = new Gson();
            NasReadingRecordModule nasReadingRecordModule = new NasReadingRecordModule();
            nasReadingRecordModule.setPosition(readingRecord.getComicReadNumber());
            String comicPath = readingRecord.getComicPath();
            if (comicPath == null) {
                comicPath = "";
            }
            nasReadingRecordModule.setFilePath(comicPath);
            nasReadingRecordModule.setCount(readingRecord.getComicAllNumber());
            nasReadingRecordModule.setReadModel(0);
            String json = gson.toJson(nasReadingRecordModule);
            androidx.lifecycle.d1<NasReadingRecord> d1VarS0 = m4Var.S0();
            Intrinsics.checkNotNull(json);
            d1VarS0.o(new NasReadingRecord("", "", str, json, "", "", new ComicInfoModel()));
            return Unit.INSTANCE;
        }

        public void onResult(ResponseData<NasReadingRecord> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                m4.this.S0().o(resp.getData());
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
            ig.k kVar = ig.k.a;
            String str = this.b;
            String string = this.c.toString();
            final m4 m4Var = m4.this;
            final String str2 = this.d;
            kVar.r(str, string, new Function1() { // from class: com.zentraedi.comic.viewmodel.n4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m4.f.b(m4Var, str2, (ReadingRecord) obj);
                }
            });
        }
    }

    private final void H0(ComicZipModel comicZipModel, androidx.databinding.w<FileInfoModel> wVar) {
        List<FileInfoModel> list;
        CompressionBrowserResponse compressionBrowserResponseT = com.zentraedi.comic.b0.a.t();
        if (compressionBrowserResponseT == null || (list = compressionBrowserResponseT.getList()) == null) {
            return;
        }
        for (FileInfoModel fileInfoModel : list) {
            nd.a.a("ComicReaderNetDataVM", "createImageData add path=" + fileInfoModel.getPath() + " name=" + fileInfoModel.getName());
            FileInfoModel fileInfoModel2 = new FileInfoModel();
            fileInfoModel2.setName(fileInfoModel.getName());
            fileInfoModel2.setPath(fileInfoModel.getPath());
            fileInfoModel2.setFileId(fileInfoModel.getPath());
            fileInfoModel2.set_height(String.valueOf(com.zentraedi.basic.function.utils.k0.l()));
            fileInfoModel2.set_width(String.valueOf(com.zentraedi.basic.function.utils.k0.l()));
            wVar.add(fileInfoModel2);
        }
    }

    private final void I0(File[] fileArr, androidx.databinding.w<FileInfoModel> wVar) {
        if (fileArr != null) {
            for (File file : fileArr) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                FileInfoModel fileInfoModel = new FileInfoModel();
                fileInfoModel.setName(file.getName());
                fileInfoModel.setPath(file.getPath());
                fileInfoModel.setFileId(file.getPath());
                fileInfoModel.set_height(String.valueOf(options.outHeight));
                fileInfoModel.set_width(String.valueOf(options.outWidth));
                wVar.add(fileInfoModel);
            }
        }
    }

    private final void J0(ComicZipModel comicZipModel, androidx.databinding.w<FileInfoModel> wVar) {
        List<FileInfoModel> list;
        CompressionBrowserResponse compressionBrowserResponseT = com.zentraedi.comic.b0.a.t();
        if (compressionBrowserResponseT == null || (list = compressionBrowserResponseT.getList()) == null) {
            return;
        }
        for (FileInfoModel fileInfoModel : list) {
            nd.a.a("ComicReaderNetDataVM", "createPdfData add path=" + fileInfoModel.getPath() + " name=" + fileInfoModel.getName());
            FileInfoModel fileInfoModel2 = new FileInfoModel();
            fileInfoModel2.setName(fileInfoModel.getName());
            fileInfoModel2.setPath(fileInfoModel.getPath());
            fileInfoModel2.setFileId(fileInfoModel.getPath());
            wVar.add(fileInfoModel2);
        }
    }

    private final void K0(File[] fileArr, androidx.databinding.w<FileInfoModel> wVar) {
        if (fileArr != null) {
            for (File file : fileArr) {
                FileInfoModel fileInfoModel = new FileInfoModel();
                fileInfoModel.setName(file.getName());
                fileInfoModel.setPath(file.getPath());
                fileInfoModel.setFileId(file.getPath());
                wVar.add(fileInfoModel);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(ComicItemType comicItemType, File file, String str) {
        int i = comicItemType == null ? -1 : b.$EnumSwitchMapping$0[comicItemType.ordinal()];
        if (i == 1) {
            return com.zentraedi.business.utils.i5.a.f(str) == 3;
        }
        if (i == 2) {
            return com.zentraedi.business.utils.i5.a.f(str) == 8;
        }
        Intrinsics.checkNotNull(str);
        return StringsKt.endsWith$default(str, "", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N0(File file, File file2) {
        String name;
        String name2;
        p7 p7Var = p7.a;
        String str = "";
        if (file == null || (name = file.getName()) == null) {
            name = "";
        }
        if (file2 != null && (name2 = file2.getName()) != null) {
            str = name2;
        }
        return p7Var.a(name, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(boolean z) {
        return Unit.INSTANCE;
    }

    public final void G0(@fo.k String comicId, @fo.k String progress) {
        Intrinsics.checkNotNullParameter(comicId, "comicId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        com.zentraedi.business.http.a.b().h(new ComicAddReadingRecordRequest(comicId, progress), new c(comicId, progress));
    }

    @fo.l
    public final Object L0(@fo.k String str, @fo.l final ComicItemType comicItemType, @fo.k Continuation<? super Unit> continuation) {
        nd.a.e("ComicReaderNetDataVM", "getFilesInDirectorySorted start path=" + str + " form=" + comicItemType);
        ObservableArrayList observableArrayList = new ObservableArrayList();
        File[] fileArrListFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.zentraedi.comic.viewmodel.j4
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return m4.M0(comicItemType, file, str2);
            }
        });
        Comparator comparator = new Comparator() { // from class: com.zentraedi.comic.viewmodel.k4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m4.N0((File) obj, (File) obj2);
            }
        };
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, comparator);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getFilesInDirectorySorted files=");
        sb.append(fileArrListFiles != null ? fileArrListFiles.length : 0);
        sb.append(" path=");
        sb.append(str);
        sb.append(" form=");
        sb.append(comicItemType);
        nd.a.a("ComicReaderNetDataVM", sb.toString());
        int i = comicItemType == null ? -1 : b.$EnumSwitchMapping$0[comicItemType.ordinal()];
        if (i == 1) {
            I0(fileArrListFiles, observableArrayList);
        } else if (i == 2) {
            K0(fileArrListFiles, observableArrayList);
        }
        nd.a.e("ComicReaderNetDataVM", "getFilesInDirectorySorted parsedCount=" + observableArrayList.size() + " form=" + comicItemType + " path=" + str);
        Object objH = kotlinx.coroutines.i.h(kotlinx.coroutines.g1.e(), new d(comicItemType, this, observableArrayList, str, null), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Unit.INSTANCE;
    }

    @fo.l
    public final Object O0(@fo.k ComicZipModel comicZipModel, @fo.l ComicItemType comicItemType, @fo.k Continuation<? super Unit> continuation) {
        List list;
        StringBuilder sb = new StringBuilder();
        sb.append("getFilesInZip start zipPath=");
        sb.append(comicZipModel.getPath());
        sb.append(" form=");
        sb.append(comicItemType);
        sb.append(" zipListSize=");
        CompressionBrowserResponse compressionBrowserResponseT = com.zentraedi.comic.b0.a.t();
        sb.append((compressionBrowserResponseT == null || (list = compressionBrowserResponseT.getList()) == null) ? 0 : list.size());
        nd.a.e("ComicReaderNetDataVM", sb.toString());
        ObservableArrayList observableArrayList = new ObservableArrayList();
        int i = comicItemType == null ? -1 : b.$EnumSwitchMapping$0[comicItemType.ordinal()];
        if (i == 1) {
            H0(comicZipModel, observableArrayList);
        } else if (i == 2 || i == 3) {
            J0(comicZipModel, observableArrayList);
        }
        nd.a.e("ComicReaderNetDataVM", "getFilesInZip parsedCount=" + observableArrayList.size() + " form=" + comicItemType + " zipPath=" + comicZipModel.getPath());
        Object objH = kotlinx.coroutines.i.h(kotlinx.coroutines.g1.e(), new e(comicItemType, this, observableArrayList, comicZipModel, null), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Unit.INSTANCE;
    }

    @fo.k
    public final androidx.databinding.w<FileInfoModel> P0() {
        return this.H;
    }

    @fo.k
    public final androidx.databinding.w<FileInfoModel> Q0() {
        return this.G;
    }

    @fo.l
    public final String R0() {
        return this.E;
    }

    @fo.k
    public final androidx.lifecycle.d1<NasReadingRecord> S0() {
        return this.I;
    }

    @fo.k
    public final Function1<Boolean, Unit> T0() {
        return this.J;
    }

    public final void U0(boolean z) {
        nd.a.e("ComicReaderNetDataVM", "loadFileData start isRefresh=" + z + " filePath=" + this.E + " apiPath=" + this.D + " currentPage=" + this.C);
        if (this.B == null) {
            FileListRequest fileListRequest = new FileListRequest();
            if (com.zentraedi.business.n.a.U(this.E)) {
                fileListRequest.setApiPath(FileListRequest.URL_FILE_REQUEST_PUBLIC_GROUP_LIST);
            } else {
                fileListRequest.setApiPath(this.D);
            }
            this.B = fileListRequest;
        }
        FileListRequest fileListRequest2 = this.B;
        if (fileListRequest2 != null) {
            if (z) {
                this.C = 0;
                fileListRequest2.setStart(0);
            } else {
                int i = this.C + 1;
                this.C = i;
                fileListRequest2.setStart(i * 1000);
            }
            fileListRequest2.setNum(1000);
            fileListRequest2.setSortby("name");
            fileListRequest2.setOrder(FileListRequest.ORDER_BY_ASC);
            fileListRequest2.setPath(this.E);
            fileListRequest2.setScope((String) null);
            nd.a.a("ComicReaderNetDataVM", "loadFileData request apiPath=" + fileListRequest2.getApiPath() + " start=" + fileListRequest2.getStart() + " num=" + fileListRequest2.getNum() + " path=" + fileListRequest2.getPath() + " scope=" + fileListRequest2.getScope());
        }
        com.zentraedi.business.http.a aVarB = com.zentraedi.business.http.a.b();
        FileListRequest fileListRequest3 = this.B;
        this.F = aVarB.f(fileListRequest3, 600, new a(fileListRequest3, z, fileListRequest3 != null ? Integer.valueOf(fileListRequest3.getNum()) : null));
    }

    public final void W0() {
        nd.a.a("ComicReaderNetDataVM", "reset clear pdf=" + this.G.size() + " image=" + this.H.size());
        this.G.clear();
        this.H.clear();
    }

    public final void X0(@fo.k String comicId, @fo.k String path, @fo.k String cateId) {
        Intrinsics.checkNotNullParameter(comicId, "comicId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(cateId, "cateId");
        com.zentraedi.business.http.a.b().h(new ComicSearchReadingRecordRequest(path, cateId), new f(comicId, cateId, path));
    }

    public final void Y0(@fo.k androidx.databinding.w<FileInfoModel> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.H = wVar;
    }

    public final void Z0(@fo.k androidx.databinding.w<FileInfoModel> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.G = wVar;
    }

    public final void a1(@fo.l String str) {
        this.E = str;
    }

    public final void b1(@fo.k androidx.lifecycle.d1<NasReadingRecord> d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<set-?>");
        this.I = d1Var;
    }

    public final void c1(@fo.k Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.J = function1;
    }

    @fo.l
    public final Call<ResponseBody> getListRequestCall() {
        return this.F;
    }

    protected void onCleared() {
        super.onCleared();
        Call<ResponseBody> call = this.F;
        if (call != null) {
            call.cancel();
        }
    }

    public final void setListRequestCall(@fo.l Call<ResponseBody> call) {
        this.F = call;
    }
}
