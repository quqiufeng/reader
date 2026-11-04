package com.zentraedi.comic.util;

import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.utils.l5;
import com.zentraedi.comic.q;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class f {

    @fo.k
    public static final f a = new f();
    private static final String b;

    @fo.k
    private static final String c;

    @fo.k
    private static final String d;

    @fo.k
    private static final Map<String, ReadingRecord> e;

    @DebugMetadata(c = "com.zentraedi.comic.util.ComicDownloadPathUtils$recordDownloadInfoIntoDb$1", f = "ComicDownloadPathUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ Map<String, ReadingRecord> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, ReadingRecord> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ReadingRecord> entry : this.b.entrySet()) {
                String key = entry.getKey();
                ReadingRecord value = entry.getValue();
                if (ig.k.a.E(key, value.getCateId()) == null) {
                    arrayList.add(value);
                }
            }
            if (!j0.l(arrayList)) {
                ig.k.a.H(arrayList);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String absolutePath = com.zentraedi.basic.function.utils.a.a().getFilesDir().getAbsolutePath();
        b = absolutePath;
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append(com.zentraedi.basic.function.utils.a.h().y() ? "/UnifyDrive/download/comic-download" : com.zentraedi.basic.function.utils.a.n(q.C0124q.ht4));
        c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l5.A());
        sb2.append(com.zentraedi.basic.function.utils.a.h().y() ? "/UnifyDrive/download/comic-download" : com.zentraedi.basic.function.utils.a.n(q.C0124q.ht4));
        d = sb2.toString();
        e = new LinkedHashMap();
    }

    private f() {
    }

    private final String g() {
        return c + NasConnectManager.getInstance().loginUserName() + NasConnectManager.getInstance().getNasId();
    }

    @fo.k
    public final String a() {
        return c;
    }

    public final String b() {
        return b;
    }

    @fo.k
    public final String c() {
        return d;
    }

    @fo.k
    public final String d() {
        return g() + "/preview";
    }

    @fo.k
    public final String e() {
        return g() + "/read";
    }

    @fo.k
    public final Map<String, ReadingRecord> f() {
        return e;
    }

    @fo.k
    public final String h(@fo.l String str, @fo.l String str2) {
        if (str2 == null) {
            return "";
        }
        if (StringsKt.startsWith$default(str2, "/", false, 2, (Object) null)) {
            str2 = str2.substring(1);
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        }
        return g() + '/' + str + '/' + str2;
    }

    public final boolean i(@fo.l ComicInfoModel comicInfoModel) {
        String id2;
        String path;
        ComicCategory category;
        String id3;
        if (comicInfoModel != null && (id2 = comicInfoModel.getId()) != null) {
            String name = comicInfoModel.getName();
            if (name == null || (path = comicInfoModel.getPath()) == null) {
                return false;
            }
            ComicDirModel dir = comicInfoModel.getDir();
            if (dir != null && (category = dir.getCategory()) != null && (id3 = category.getId()) != null) {
                String comicMainPath = comicInfoModel.getComicMainPath();
                if (comicMainPath == null) {
                    return false;
                }
                boolean zExists = new File(h(id2, path)).exists();
                if (zExists) {
                    Map<String, ReadingRecord> map = e;
                    if (map.get(id2) == null) {
                        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                        Intrinsics.checkNotNullExpressionValue(strLoginUserName, "loginUserName(...)");
                        String nasId = NasConnectManager.getInstance().getNasId();
                        Intrinsics.checkNotNullExpressionValue(nasId, "getNasId(...)");
                        ReadingRecord readingRecord = new ReadingRecord(id2, id3, "", strLoginUserName, nasId, name, path, 0, 0, true, 0L);
                        readingRecord.setComicNasPath(comicMainPath);
                        map.put(id2, readingRecord);
                        return zExists;
                    }
                }
                return zExists;
            }
        }
        return false;
    }

    public final void j() {
        Map<String, ReadingRecord> map = e;
        if (map.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        map.clear();
        kotlinx.coroutines.i.e(a2.a, g1.c(), (CoroutineStart) null, new a(linkedHashMap, null), 2, (Object) null);
    }
}
