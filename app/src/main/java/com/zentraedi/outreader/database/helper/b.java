package com.zentraedi.outreader.database.helper;

import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.database.i1;
import com.zentraedi.outreader.model.entity.ComicEpubInfoEntity;
import fo.k;
import fo.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.g;
import org.readium.r2.shared.publication.Link;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nComicEpubDatabaseHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicEpubDatabaseHelper.kt\ncom/zentraedi/outreader/database/helper/ComicEpubDatabaseHelper\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n116#2,8:89\n125#2,2:99\n116#2,11:101\n116#2,11:112\n116#2,11:123\n1869#3,2:97\n*S KotlinDebug\n*F\n+ 1 ComicEpubDatabaseHelper.kt\ncom/zentraedi/outreader/database/helper/ComicEpubDatabaseHelper\n*L\n31#1:89,8\n31#1:99,2\n62#1:101,11\n70#1:112,11\n81#1:123,11\n43#1:97,2\n*E\n"})
public final class b {

    @k
    public static final a b = new a(null);

    @k
    private static final Lazy<b> c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.zentraedi.outreader.database.helper.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.f();
        }
    });

    @k
    private final kotlinx.coroutines.sync.a a = g.b(false, 1, (Object) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final b a() {
            return (b) b.c.getValue();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.database.helper.b$b, reason: collision with other inner class name */
    @DebugMetadata(c = "com.zentraedi.outreader.database.helper.ComicEpubDatabaseHelper", f = "ComicEpubDatabaseHelper.kt", i = {0, 0}, l = {94}, m = "deleteAllBook", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    static final class C0137b extends ContinuationImpl {
        Object a;
        int b;
        /* synthetic */ Object c;
        int e;

        C0137b(Continuation<? super C0137b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return b.this.c(this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.database.helper.ComicEpubDatabaseHelper", f = "ComicEpubDatabaseHelper.kt", i = {0, 0, 0}, l = {94}, m = "deleteBook", n = {"fileLocalPath", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        Object b;
        int c;
        /* synthetic */ Object d;
        int f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.d = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.database.helper.ComicEpubDatabaseHelper", f = "ComicEpubDatabaseHelper.kt", i = {0, 0, 0, 0, 0}, l = {94}, m = "insertSync", n = {TbsReaderView.m, "filePathMd5", "imageElementList", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    static final class d extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        /* synthetic */ Object f;
        int h;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return b.this.e(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.database.helper.ComicEpubDatabaseHelper", f = "ComicEpubDatabaseHelper.kt", i = {0, 0, 0, 0}, l = {94}, m = "query", n = {"filePathMd5", "$this$withLock_u24default$iv", "fileModifiedTime", "$i$f$withLock"}, s = {"L$0", "L$1", "J$0", "I$0"}, v = 1)
    static final class e extends ContinuationImpl {
        Object a;
        Object b;
        long c;
        int d;
        /* synthetic */ Object e;
        int g;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return b.this.g(null, 0L, this);
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f() {
        return new b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object c(@k Continuation<? super Unit> continuation) {
        C0137b c0137b;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof C0137b) {
            c0137b = (C0137b) continuation;
            int i = c0137b.e;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                c0137b.e = i - IntCompanionObject.MIN_VALUE;
            } else {
                c0137b = new C0137b(continuation);
            }
        } else {
            c0137b = new C0137b(continuation);
        }
        Object obj = c0137b.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c0137b.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.sync.a aVar2 = this.a;
            c0137b.a = aVar2;
            c0137b.b = 0;
            c0137b.e = 1;
            if (aVar2.t((Object) null, c0137b) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = aVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kotlinx.coroutines.sync.a) c0137b.a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            i1 i1VarZ = ReaderDatabase.A().z();
            Intrinsics.checkNotNull(strLoginUserName);
            Intrinsics.checkNotNull(nasId);
            i1VarZ.f(strLoginUserName, nasId);
            return Unit.INSTANCE;
        } finally {
            aVar.v((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object d(@l String str, @k Continuation<? super Unit> continuation) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.f = i - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str == null || str.length() == 0) {
                return Unit.INSTANCE;
            }
            aVar = this.a;
            cVar.a = str;
            cVar.b = aVar;
            cVar.c = 0;
            cVar.f = 1;
            if (aVar.t((Object) null, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) cVar.b;
            String str2 = (String) cVar.a;
            ResultKt.throwOnFailure(obj);
            aVar = aVar2;
            str = str2;
        }
        try {
            ReaderDatabase.A().z().i(NasConnectManager.getInstance().loginUserName(), NasConnectManager.getInstance().getNasId(), str);
            return Unit.INSTANCE;
        } finally {
            aVar.v((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object e(@k String str, @k String str2, @k List<Link> list, @k Continuation<? super Unit> continuation) {
        d dVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.h;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                dVar.h = i - IntCompanionObject.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str.length() == 0) {
                return Unit.INSTANCE;
            }
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            aVar = this.a;
            dVar.a = str;
            dVar.b = str2;
            dVar.c = list;
            dVar.d = aVar;
            dVar.e = 0;
            dVar.h = 1;
            if (aVar.t((Object) null, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) dVar.d;
            list = (List) dVar.c;
            str2 = (String) dVar.b;
            String str3 = (String) dVar.a;
            ResultKt.throwOnFailure(obj);
            aVar = aVar2;
            str = str3;
        }
        try {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            File file = new File(str);
            long jLastModified = !file.exists() ? 0L : file.lastModified();
            ReaderDatabase.A().z().i(strLoginUserName, nasId, str);
            ArrayList arrayList = new ArrayList();
            for (Link link : list) {
                ComicEpubInfoEntity comicEpubInfoEntity = new ComicEpubInfoEntity();
                comicEpubInfoEntity.setNasId(nasId);
                comicEpubInfoEntity.setUsername(strLoginUserName);
                comicEpubInfoEntity.setFileLocalPath(str);
                comicEpubInfoEntity.setFilePathMd5(str2);
                comicEpubInfoEntity.setFileModifiedTime(jLastModified);
                comicEpubInfoEntity.setImageLinkJson(link.toJSON().toString());
                arrayList.add(comicEpubInfoEntity);
            }
            nd.a.e("nas_book", "ComicEpubDatabaseHelper->insertSync filePath=" + str + " modifiedTime=" + jLastModified + " ids=" + ReaderDatabase.A().z().c(arrayList).size());
            return Unit.INSTANCE;
        } finally {
            aVar.v((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object g(@k String str, long j, @k Continuation<? super List<ComicEpubInfoEntity>> continuation) {
        e eVar;
        String str2;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.g;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                eVar.g = i - IntCompanionObject.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str.length() == 0) {
                return CollectionsKt.emptyList();
            }
            kotlinx.coroutines.sync.a aVar2 = this.a;
            eVar.a = str;
            eVar.b = aVar2;
            eVar.c = j;
            eVar.d = 0;
            eVar.g = 1;
            if (aVar2.t((Object) null, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            aVar = aVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = eVar.c;
            aVar = (kotlinx.coroutines.sync.a) eVar.b;
            String str3 = (String) eVar.a;
            ResultKt.throwOnFailure(obj);
            str2 = str3;
        }
        long j2 = j;
        try {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            i1 i1VarZ = ReaderDatabase.A().z();
            Intrinsics.checkNotNull(strLoginUserName);
            Intrinsics.checkNotNull(nasId);
            List<ComicEpubInfoEntity> listA = i1VarZ.a(strLoginUserName, nasId, str2, j2);
            if (listA == null) {
                listA = CollectionsKt.emptyList();
            }
            return listA;
        } finally {
            aVar.v((Object) null);
        }
    }
}
