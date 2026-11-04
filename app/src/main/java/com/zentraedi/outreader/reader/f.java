package com.zentraedi.outreader.reader;

import android.content.Context;
import com.google.gson.Gson;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.reader.OpenFileResult;
import fo.k;
import fo.l;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.u2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.readium.r2.navigator.Navigator;
import org.readium.r2.navigator.OverflowableNavigator;
import org.readium.r2.navigator.epub.EpubNavigatorFragment;
import org.readium.r2.shared.publication.Link;
import org.readium.r2.shared.publication.Locator;
import org.readium.r2.shared.publication.Publication;
import org.readium.r2.shared.publication.html.LocatorKt;
import org.readium.r2.shared.publication.services.ContentProtectionServiceKt;
import org.readium.r2.shared.util.Error;
import org.readium.r2.shared.util.Url;
import org.readium.r2.shared.util.asset.Asset;
import org.readium.r2.shared.util.format.Specification;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReadiumZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadiumZReader.kt\ncom/zentraedi/outreader/reader/ReadiumZReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n774#2:371\n865#2,2:372\n295#2,2:374\n1563#2:376\n1634#2,3:377\n1563#2:380\n1634#2,3:381\n360#2,7:384\n360#2,7:391\n360#2,7:398\n360#2,7:405\n*S KotlinDebug\n*F\n+ 1 ReadiumZReader.kt\ncom/zentraedi/outreader/reader/ReadiumZReader\n*L\n178#1:371\n178#1:372,2\n181#1:374,2\n193#1:376\n193#1:377,3\n194#1:380\n194#1:381,3\n304#1:384,7\n310#1:391,7\n324#1:398,7\n330#1:405,7\n*E\n"})
public abstract class f extends com.zentraedi.outreader.reader.h {

    @k
    private final String c = "ReadiumZReader";

    @k
    private final com.zentraedi.reader.readium.d d;

    @l
    private Publication e;

    @l
    private Navigator f;

    @l
    private List<ChapterM.Chapter> g;

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {178, 186, 254}, m = "getChapter", n = {"locator", ComicSubDirActivity.k0, "preferLastVisibleHeading", "locator", ComicSubDirActivity.k0, "chapters", "fileChapter", "epubNavigator", "preferLastVisibleHeading", "locator", ComicSubDirActivity.k0, "chapters", "fileChapter", "epubNavigator", "visibleLocator", "selector", "anchors", "titles", "script", "preferLastVisibleHeading"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        Object i;
        Object j;
        boolean k;
        /* synthetic */ Object l;
        int n;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.l = obj;
            this.n |= IntCompanionObject.MIN_VALUE;
            return f.this.E(null, false, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader$getChapter$result$1", f = "ReadiumZReader.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<q0, Continuation<? super String>, Object> {
        int a;
        final /* synthetic */ EpubNavigatorFragment b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EpubNavigatorFragment epubNavigatorFragment, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = epubNavigatorFragment;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            EpubNavigatorFragment epubNavigatorFragment = this.b;
            String str = this.c;
            this.a = 1;
            Object objEvaluateJavascript = epubNavigatorFragment.evaluateJavascript(str, this);
            return objEvaluateJavascript == coroutine_suspended ? coroutine_suspended : objEvaluateJavascript;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super String> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader$getChapter$visibleLocator$1", f = "ReadiumZReader.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Locator>, Object> {
        int a;
        final /* synthetic */ EpubNavigatorFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EpubNavigatorFragment epubNavigatorFragment, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = epubNavigatorFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            EpubNavigatorFragment epubNavigatorFragment = this.b;
            this.a = 1;
            Object objFirstVisibleElementLocator = epubNavigatorFragment.firstVisibleElementLocator(this);
            return objFirstVisibleElementLocator == coroutine_suspended ? coroutine_suspended : objFirstVisibleElementLocator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Locator> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 0}, l = {107}, m = "getChapters$suspendImpl", n = {"$this", "chapters"}, s = {"L$0", "L$1"}, v = 1)
    static final class d extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return f.G(f.this, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader$getChapters$2", f = "ReadiumZReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class e extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ Ref.ObjectRef<List<ChapterM.Chapter>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref.ObjectRef<List<ChapterM.Chapter>> objectRef, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new e(this.c, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0071  */
        /* JADX WARN: Code duplicated, block: B:19:0x008b A[LOOP:2: B:17:0x0085->B:19:0x008b, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            boolean z;
            String string;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Publication publicationK = f.this.K();
            Intrinsics.checkNotNull(publicationK);
            List<Link> tableOfContents = publicationK.getTableOfContents();
            ArrayList<Pair> arrayList = new ArrayList();
            for (Link link : tableOfContents) {
                List<Pair<Integer, Link>> listD = f.this.D(new Pair<>(Boxing.boxInt(0), link));
                arrayList.add(new Pair(Boxing.boxInt(0), link));
                arrayList.addAll(listD);
            }
            if (arrayList.isEmpty()) {
                arrayList.clear();
                Publication publicationK2 = f.this.K();
                Intrinsics.checkNotNull(publicationK2);
                it = publicationK2.getReadingOrder().iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair(Boxing.boxInt(0), (Link) it.next()));
                }
                z = true;
            } else {
                if (arrayList.size() == 1) {
                    Publication publicationK3 = f.this.K();
                    Intrinsics.checkNotNull(publicationK3);
                    if (publicationK3.getReadingOrder().size() > 1) {
                        arrayList.clear();
                        Publication publicationK4 = f.this.K();
                        Intrinsics.checkNotNull(publicationK4);
                        it = publicationK4.getReadingOrder().iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Pair(Boxing.boxInt(0), (Link) it.next()));
                        }
                        z = true;
                    }
                }
                z = false;
            }
            int i = 0;
            for (Pair pair : arrayList) {
                ChapterM.Chapter chapter = new ChapterM.Chapter();
                chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
                StringBuilder sb = new StringBuilder();
                sb.append(f.this.M(((Number) pair.getFirst()).intValue()));
                String title = ((Link) pair.getSecond()).getTitle();
                if (title == null) {
                    title = ((Link) pair.getSecond()).getHref().toString();
                }
                sb.append(title);
                chapter.name = sb.toString();
                if (z) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    string = String.format("%03d", Arrays.copyOf(new Object[]{Boxing.boxInt(i + 1)}, 1));
                    Intrinsics.checkNotNullExpressionValue(string, "format(...)");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f.this.M(((Number) pair.getFirst()).intValue()));
                    String title2 = ((Link) pair.getSecond()).getTitle();
                    if (title2 == null) {
                        title2 = ((Link) pair.getSecond()).getHref().toString();
                    }
                    sb2.append(title2);
                    string = sb2.toString();
                }
                chapter.name = string;
                chapter.f985id = i + "";
                Publication publicationK5 = f.this.K();
                String path = null;
                Url urlUrl$default = publicationK5 != null ? Publication.url$default(publicationK5, ((Link) pair.getSecond()).getHref(), (Map) null, 2, (Object) null) : null;
                if (urlUrl$default != null) {
                    path = urlUrl$default.getPath();
                }
                chapter.url = path;
                chapter.link = (Link) pair.getSecond();
                this.c.element.add(chapter);
                i++;
                nd.a.e(com.zentraedi.reader.f.a, "configChapters chapter=" + chapter.toJsonStr() + ", link=" + new Gson().toJson(pair.getSecond()));
            }
            f.this.g = this.c.element;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.reader.f$f, reason: collision with other inner class name */
    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 0, 0}, l = {161}, m = "getCurrentChapterId", n = {"currentNavigator", "locator", "preferLastVisibleHeading"}, s = {"L$0", "L$1", "Z$0"}, v = 1)
    static final class C0151f extends ContinuationImpl {
        boolean a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        C0151f(Continuation<? super C0151f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.d = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            return f.this.H(false, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 1, 1, 2, 2, 2, 2, 2}, l = {317, TBSOneErrorCodes.LEGACY_LOCAL_FILE_NOT_FOUND, 338}, m = "goNextChapter$suspendImpl", n = {"$this", "$this", "chapters", "$this", "chapters", "currentChapterId", "chapter", "currentChapterIndex"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    static final class g extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        /* synthetic */ Object f;
        int h;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return f.P(f.this, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 1, 1, 2, 2, 2, 2, 2}, l = {298, 299, TBSOneErrorCodes.UNZIP_LOCAL_COMPONENT_FAILED}, m = "goPreChapter$suspendImpl", n = {"$this", "$this", "chapters", "$this", "chapters", "currentChapterId", "chapter", "currentChapterIndex"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    static final class h extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        /* synthetic */ Object f;
        int h;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return f.Q(f.this, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ReadiumZReader", f = "ReadiumZReader.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {54, 70, 89}, m = "openFile-gIAlu-s$suspendImpl", n = {"$this", TbsReaderView.m, "file", "$this", TbsReaderView.m, "file", "asset", "$this", TbsReaderView.m, "file", "asset"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    static final class i extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        /* synthetic */ Object f;
        int h;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            Object objR = f.R(f.this, null, this);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : Result.m5boximpl(objR);
        }
    }

    public f() {
        com.zentraedi.reader.readium.d.a aVar = com.zentraedi.reader.readium.d.d;
        Context contextA = com.zentraedi.basic.function.utils.a.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext(...)");
        this.d = aVar.a(contextA);
    }

    public static /* synthetic */ Object F(f fVar, Locator locator, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChapter");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return fVar.E(locator, z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, java.util.ArrayList] */
    static /* synthetic */ Object G(f fVar, Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        d dVar;
        Ref.ObjectRef objectRef;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                dVar.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                dVar = fVar.new d(continuation);
            }
        } else {
            dVar = fVar.new d(continuation);
        }
        Object obj = dVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<ChapterM.Chapter> list = fVar.g;
            if (list != null && !list.isEmpty()) {
                List<ChapterM.Chapter> list2 = fVar.g;
                Intrinsics.checkNotNull(list2);
                return list2;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? arrayList = new ArrayList();
            objectRef2.element = arrayList;
            if (fVar.e == null) {
                return arrayList;
            }
            m0 m0VarC = g1.c();
            e eVar = fVar.new e(objectRef2, null);
            dVar.a = SpillingKt.nullOutSpilledVariable(fVar);
            dVar.b = objectRef2;
            dVar.e = 1;
            if (kotlinx.coroutines.i.h(m0VarC, eVar, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) dVar.b;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005c -> B:21:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:0x007c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object H(boolean r8, kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zentraedi.outreader.reader.f.C0151f
            if (r0 == 0) goto L13
            r0 = r9
            com.zentraedi.outreader.reader.f$f r0 = (com.zentraedi.outreader.reader.f.C0151f) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.zentraedi.outreader.reader.f$f r0 = new com.zentraedi.outreader.reader.f$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            boolean r8 = r0.a
            java.lang.Object r2 = r0.c
            org.readium.r2.shared.publication.Locator r2 = (org.readium.r2.shared.publication.Locator) r2
            java.lang.Object r5 = r0.b
            org.readium.r2.navigator.Navigator r5 = (org.readium.r2.navigator.Navigator) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5f
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
        L40:
            org.readium.r2.navigator.Navigator r5 = r7.f
            if (r5 != 0) goto L45
            return r3
        L45:
            kotlinx.coroutines.flow.m0 r9 = r5.getCurrentLocator()
            java.lang.Object r9 = r9.getValue()
            r2 = r9
            org.readium.r2.shared.publication.Locator r2 = (org.readium.r2.shared.publication.Locator) r2
            r0.b = r5
            r0.c = r2
            r0.a = r8
            r0.f = r4
            java.lang.Object r9 = r7.E(r2, r8, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            com.zentraedi.outreader.model.ChapterM$Chapter r9 = (com.zentraedi.outreader.model.ChapterM.Chapter) r9
            org.readium.r2.navigator.Navigator r6 = r7.f
            if (r6 != r5) goto L40
            kotlinx.coroutines.flow.m0 r5 = r5.getCurrentLocator()
            java.lang.Object r5 = r5.getValue()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 == 0) goto L40
            if (r9 == 0) goto L78
            java.lang.String r8 = r9.f985id
            goto L79
        L78:
            r8 = 0
        L79:
            if (r8 != 0) goto L7c
            return r3
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.f.H(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object I(f fVar, Continuation<? super String> continuation) {
        return fVar.H(false, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M(int i2) {
        if (i2 <= 0) {
            return "";
        }
        return "  " + M(i2 - 1);
    }

    static /* synthetic */ Object N(f fVar, int i2, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object O(f fVar, ChapterM.Chapter chapter, Continuation<? super Unit> continuation) {
        Navigator navigator = fVar.f;
        if (navigator != null) {
            Link link = chapter.link;
            Intrinsics.checkNotNullExpressionValue(link, "link");
            Boxing.boxBoolean(navigator.go(link, true));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[LOOP:0: B:36:0x00a3->B:41:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e A[LOOP:1: B:54:0x0108->B:59:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:89:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0187, code lost:
    
        if (r2.t(r3, r0) == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object P(com.zentraedi.outreader.reader.f r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.f.P(com.zentraedi.outreader.reader.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[LOOP:0: B:36:0x00a2->B:41:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d A[LOOP:1: B:54:0x0107->B:59:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (r2.t(r3, r0) == r1) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object Q(com.zentraedi.outreader.reader.f r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.f.Q(com.zentraedi.outreader.reader.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:21:0x0061, B:52:0x0126, B:54:0x012e, B:58:0x0141, B:60:0x0147, B:62:0x014b, B:64:0x0151, B:66:0x015f, B:67:0x0163, B:69:0x0176), top: B:83:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0 A[Catch: Exception -> 0x0042, TryCatch #2 {Exception -> 0x0042, blocks: (B:14:0x003d, B:73:0x0198, B:75:0x01a0, B:77:0x01ae, B:38:0x00c4, B:40:0x00c8, B:42:0x00d6, B:44:0x00e2, B:45:0x00e9, B:47:0x00f5, B:48:0x00fc, B:34:0x00a4), top: B:84:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #2 {Exception -> 0x0042, blocks: (B:14:0x003d, B:73:0x0198, B:75:0x01a0, B:77:0x01ae, B:38:0x00c4, B:40:0x00c8, B:42:0x00d6, B:44:0x00e2, B:45:0x00e9, B:47:0x00f5, B:48:0x00fc, B:34:0x00a4), top: B:84:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x013e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01ae, please report this as an issue */
    static /* synthetic */ Object R(f fVar, String str, Continuation<? super Result<? extends OpenFileResult>> continuation) {
        i iVar;
        File file;
        String str2;
        Asset asset;
        f fVar2;
        Publication publication;
        f fVar3;
        boolean zBooleanValue;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.h;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                iVar.h = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                iVar = fVar.new i(continuation);
            }
        } else {
            iVar = fVar.new i(continuation);
        }
        Object objF = iVar.f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.h;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objF);
                nd.a.a(fVar.c, "openFile");
                File file2 = new File(str);
                if (!file2.exists()) {
                    nd.a.c(com.zentraedi.outreader.reader.h.b, "openFile->security is false");
                    Result.Companion companion = Result.Companion;
                    return Result.m6constructorimpl(OpenFileResult.FILE_NOT_EXISTS);
                }
                nd.a.a(fVar.c, "openFile retrieveFile");
                com.zentraedi.reader.readium.d dVar = fVar.d;
                iVar.a = fVar;
                iVar.b = SpillingKt.nullOutSpilledVariable(str);
                iVar.c = file2;
                iVar.h = 1;
                Object objE = dVar.e(file2, iVar);
                if (objE != coroutine_suspended) {
                    file = file2;
                    objF = objE;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    fVar = (f) iVar.e;
                    asset = (Asset) iVar.d;
                    file = (File) iVar.c;
                    str2 = (String) iVar.b;
                    fVar2 = (f) iVar.a;
                    try {
                        ResultKt.throwOnFailure(objF);
                        fVar.e = (Publication) objF;
                        publication = fVar2.e;
                        if (publication == null) {
                            nd.a.a(fVar2.c, "openFile get publication is null");
                            Result.Companion companion2 = Result.Companion;
                            return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
                        }
                        if (publication == null && ContentProtectionServiceKt.isRestricted(publication)) {
                            Publication publication2 = fVar2.e;
                            Error protectionError = publication2 != null ? ContentProtectionServiceKt.getProtectionError(publication2) : null;
                            String str3 = fVar2.c;
                            StringBuilder sb = new StringBuilder();
                            sb.append("ReadiumZReader->openFile error=");
                            sb.append(protectionError != null ? protectionError.getMessage() : null);
                            nd.a.c(str3, sb.toString());
                            Result.Companion companion3 = Result.Companion;
                            return Result.m6constructorimpl(OpenFileResult.DRM_PROTECTED);
                        }
                        com.zentraedi.reader.readium.c cVar = com.zentraedi.reader.readium.c.a;
                        iVar.a = fVar2;
                        iVar.b = SpillingKt.nullOutSpilledVariable(str2);
                        iVar.c = SpillingKt.nullOutSpilledVariable(file);
                        iVar.d = SpillingKt.nullOutSpilledVariable(asset);
                        iVar.e = null;
                        iVar.h = 3;
                        objF = cVar.f(file, iVar);
                        if (objF != coroutine_suspended) {
                            fVar3 = fVar2;
                        }
                        return coroutine_suspended;
                    } catch (Exception e2) {
                        e = e2;
                        fVar = fVar2;
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar3 = (f) iVar.a;
                    ResultKt.throwOnFailure(objF);
                }
                zBooleanValue = ((Boolean) objF).booleanValue();
                if (zBooleanValue) {
                    nd.a.c(com.zentraedi.outreader.reader.h.b, "openFile->drmStatus is null");
                    Result.Companion companion4 = Result.Companion;
                    return Result.m6constructorimpl(OpenFileResult.DRM_PROTECTED);
                }
                nd.a.e(fVar3.c, "ReadiumZReader->openFile drmStatus=" + zBooleanValue);
                Result.Companion companion5 = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.SUCCESS);
            }
            File file3 = (File) iVar.c;
            str = (String) iVar.b;
            f fVar4 = (f) iVar.a;
            try {
                ResultKt.throwOnFailure(objF);
                file = file3;
                fVar = fVar4;
            } catch (Exception e3) {
                e = e3;
                fVar = fVar4;
            }
            nd.a.c(fVar.c, "openFile exception: " + e.getMessage());
            Result.Companion companion6 = Result.Companion;
            return Result.m6constructorimpl(ResultKt.createFailure(e));
            Asset asset2 = (Asset) objF;
            if (asset2 == null) {
                nd.a.c(com.zentraedi.outreader.reader.h.b, "openFile->asset is null");
                Result.Companion companion7 = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
            }
            if (asset2.getFormat().conformsTo(Specification.Lcp.INSTANCE)) {
                nd.a.h(fVar.c, "openFile openAsset Lcp");
            }
            if (asset2.getFormat().conformsTo(Specification.Adept.INSTANCE)) {
                nd.a.h(fVar.c, "openFile openAsset Adept");
            }
            nd.a.a(fVar.c, "openFile openAsset");
            com.zentraedi.reader.readium.d dVar2 = fVar.d;
            iVar.a = fVar;
            iVar.b = SpillingKt.nullOutSpilledVariable(str);
            iVar.c = file;
            iVar.d = SpillingKt.nullOutSpilledVariable(asset2);
            iVar.e = fVar;
            iVar.h = 2;
            Object objD = dVar2.d(asset2, iVar);
            if (objD != coroutine_suspended) {
                str2 = str;
                asset = asset2;
                objF = objD;
                fVar2 = fVar;
                fVar.e = (Publication) objF;
                publication = fVar2.e;
                if (publication == null) {
                    nd.a.a(fVar2.c, "openFile get publication is null");
                    Result.Companion companion8 = Result.Companion;
                    return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
                }
                if (publication == null) {
                }
                com.zentraedi.reader.readium.c cVar2 = com.zentraedi.reader.readium.c.a;
                iVar.a = fVar2;
                iVar.b = SpillingKt.nullOutSpilledVariable(str2);
                iVar.c = SpillingKt.nullOutSpilledVariable(file);
                iVar.d = SpillingKt.nullOutSpilledVariable(asset);
                iVar.e = null;
                iVar.h = 3;
                objF = cVar2.f(file, iVar);
                if (objF != coroutine_suspended) {
                    fVar3 = fVar2;
                    zBooleanValue = ((Boolean) objF).booleanValue();
                    if (zBooleanValue) {
                        nd.a.c(com.zentraedi.outreader.reader.h.b, "openFile->drmStatus is null");
                        Result.Companion companion9 = Result.Companion;
                        return Result.m6constructorimpl(OpenFileResult.DRM_PROTECTED);
                    }
                    nd.a.e(fVar3.c, "ReadiumZReader->openFile drmStatus=" + zBooleanValue);
                    Result.Companion companion10 = Result.Companion;
                    return Result.m6constructorimpl(OpenFileResult.SUCCESS);
                }
            }
            return coroutine_suspended;
        } catch (Exception e4) {
            e = e4;
        }
    }

    @k
    public final List<Pair<Integer, Link>> D(@k Pair<Integer, Link> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int iIntValue = parent.getFirst().intValue() + 1;
        ArrayList arrayList = new ArrayList();
        for (Link link : parent.getSecond().getChildren()) {
            arrayList.add(new Pair(Integer.valueOf(iIntValue), link));
            arrayList.addAll(D(new Pair<>(Integer.valueOf(iIntValue), link)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @l
    public final Object E(@k Locator locator, boolean z, @k Continuation<? super ChapterM.Chapter> continuation) {
        a aVar;
        Locator locator2;
        boolean z2;
        String str;
        List arrayList;
        Object next;
        ChapterM.Chapter chapter;
        EpubNavigatorFragment epubNavigatorFragment;
        Link link;
        Url urlUrl$default;
        Url urlUrl$default2;
        Url urlNormalize;
        Locator.Locations locations;
        String cssSelector;
        Locator locator3;
        EpubNavigatorFragment epubNavigatorFragment2;
        ChapterM.Chapter chapter2;
        List list;
        Url urlUrl$default3;
        Integer intOrNull;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.n;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.n = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objH = aVar.l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.n;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objH);
            String path = locator.getHref().normalize().getPath();
            if (path == null) {
                return null;
            }
            locator2 = locator;
            aVar.a = locator2;
            aVar.b = path;
            z2 = z;
            aVar.k = z2;
            aVar.n = 1;
            Object objM = m(aVar);
            if (objM != coroutine_suspended) {
                str = path;
                objH = objM;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            boolean z3 = aVar.k;
            String str2 = (String) aVar.b;
            Locator locator4 = (Locator) aVar.a;
            ResultKt.throwOnFailure(objH);
            z2 = z3;
            locator2 = locator4;
            str = str2;
        } else {
            if (i3 == 2) {
                boolean z4 = aVar.k;
                epubNavigatorFragment = (EpubNavigatorFragment) aVar.e;
                chapter = (ChapterM.Chapter) aVar.d;
                List list2 = (List) aVar.c;
                str = (String) aVar.b;
                Locator locator5 = (Locator) aVar.a;
                ResultKt.throwOnFailure(objH);
                z2 = z4;
                locator2 = locator5;
                arrayList = list2;
                Locator locator6 = (Locator) objH;
                if (this.f == epubNavigatorFragment || !Intrinsics.areEqual(epubNavigatorFragment.getCurrentLocator().getValue(), locator2)) {
                    return null;
                }
                if (locator6 != null && !Intrinsics.areEqual(locator6.getHref().normalize().getPath(), str)) {
                    return null;
                }
                if (locator6 == null || (locations = locator6.getLocations()) == null || (cssSelector = LocatorKt.getCssSelector(locations)) == null) {
                    return chapter;
                }
                List list3 = arrayList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Link link2 = ((ChapterM.Chapter) it.next()).link;
                    Locator locator7 = locator6;
                    arrayList2.add((link2 == null || (urlUrl$default3 = Link.url$default(link2, (Url) null, (Map) null, 3, (Object) null)) == null) ? null : urlUrl$default3.getFragment());
                    locator6 = locator7;
                }
                Locator locator8 = locator6;
                JSONArray jSONArray = new JSONArray((Collection) arrayList2);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    Link link3 = ((ChapterM.Chapter) it2.next()).link;
                    arrayList3.add(link3 != null ? link3.getTitle() : null);
                }
                JSONArray jSONArray2 = new JSONArray((Collection) arrayList3);
                String strTrimIndent = StringsKt.trimIndent("\n            (function() {\n                try {\n                    var current = document.querySelector(" + JSONObject.quote(cssSelector) + ");\n                    if (!current) return -1;\n                    var anchors = " + jSONArray + ";\n                    var titles = " + jSONArray2 + ";\n                    var headings = null;\n                    function normalizeTitle(text) { return (text || '').replace(/\\s+/g, ''); }\n                    var selected = -1;\n                    var previous = null;\n                    var hasVisibleHeading = false;\n                    for (var i = 0; i < anchors.length; i++) {\n                        var title = normalizeTitle(titles[i]);\n                        var anchor = anchors[i] ? document.getElementById(anchors[i]) : null;\n                        // 无锚点的父目录按标题文字反查；空格和全角空格不影响匹配，重名时不猜测。\n                        if (!anchors[i] && title) {\n                            headings = headings || Array.prototype.slice.call(document.querySelectorAll('h1,h2,h3,h4,h5,h6,p'));\n                            var matches = headings.filter(function(node) { return normalizeTitle(node.textContent) === title; });\n                            if (matches.length === 1) anchor = matches[0];\n                        }\n                        if (!anchor) continue;\n                        var relation = anchor.compareDocumentPosition(current);\n                        if (relation & Node.DOCUMENT_POSITION_DISCONNECTED) continue;\n                        // 部分书用空 span/a 定位，实际标题在后方段落或父节点；可见性应检查标题。\n                        // 原锚点仍用于正文顺序判断和 Link 跳转，只有文字与目录一致时才换可见性节点。\n                        var heading = anchor;\n                        if (title && !normalizeTitle(anchor.textContent)) {\n                            heading = [anchor.nextElementSibling, anchor.parentElement].find(function(node) {\n                                return node && normalizeTitle(node.textContent) === title;\n                            }) || anchor;\n                        }\n                        var style = window.getComputedStyle(heading);\n                        // EPUB 分栏中，下一页标题也在 DOM 内；只认与当前视口相交的可见片段。\n                        var isVisible = style.visibility !== 'hidden' && style.visibility !== 'collapse' &&\n                            style.display !== 'none' && style.opacity !== '0' &&\n                            Array.prototype.some.call(heading.getClientRects(), function(rect) {\n                                return rect.width > 0 && rect.height > 0 && rect.right > 0 && rect.bottom > 0 &&\n                                    rect.left < window.innerWidth && rect.top < window.innerHeight;\n                            });\n                        if (!isVisible && (hasVisibleHeading ||\n                            (anchor !== current && !(relation & Node.DOCUMENT_POSITION_FOLLOWING)))) continue;\n                        // 默认取首个可见标题，下一章取末个；没有标题时都取正文前方最近锚点。\n                        if ((isVisible && !hasVisibleHeading) || !previous || previous === anchor ||\n                            (previous.compareDocumentPosition(anchor) & (isVisible && !" + z2 + "\n                                ? Node.DOCUMENT_POSITION_PRECEDING : Node.DOCUMENT_POSITION_FOLLOWING))) {\n                            previous = anchor;\n                            selected = i;\n                        }\n                        if (isVisible) hasVisibleHeading = true;\n                    }\n                    return selected;\n                } catch (e) {\n                    return -1;\n                }\n            })();\n        ");
                u2 u2VarL0 = g1.e().L0();
                b bVar = new b(epubNavigatorFragment, strTrimIndent, null);
                aVar.a = locator2;
                aVar.b = SpillingKt.nullOutSpilledVariable(str);
                aVar.c = arrayList;
                aVar.d = chapter;
                aVar.e = epubNavigatorFragment;
                aVar.f = SpillingKt.nullOutSpilledVariable(locator8);
                aVar.g = SpillingKt.nullOutSpilledVariable(cssSelector);
                aVar.h = SpillingKt.nullOutSpilledVariable(jSONArray);
                aVar.i = SpillingKt.nullOutSpilledVariable(jSONArray2);
                aVar.j = SpillingKt.nullOutSpilledVariable(strTrimIndent);
                aVar.k = z2;
                aVar.n = 3;
                objH = kotlinx.coroutines.i.h(u2VarL0, bVar, aVar);
                if (objH != coroutine_suspended) {
                    locator3 = locator2;
                    epubNavigatorFragment2 = epubNavigatorFragment;
                    chapter2 = chapter;
                    list = arrayList;
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            epubNavigatorFragment2 = (EpubNavigatorFragment) aVar.e;
            chapter2 = (ChapterM.Chapter) aVar.d;
            list = (List) aVar.c;
            locator3 = (Locator) aVar.a;
            ResultKt.throwOnFailure(objH);
        }
        String str3 = (String) objH;
        if (this.f != epubNavigatorFragment2 || !Intrinsics.areEqual(epubNavigatorFragment2.getCurrentLocator().getValue(), locator3)) {
            return null;
        }
        ChapterM.Chapter chapter3 = (ChapterM.Chapter) CollectionsKt.getOrNull(list, (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? -1 : intOrNull.intValue());
        return chapter3 == null ? chapter2 : chapter3;
        arrayList = new ArrayList();
        for (Object obj : (Iterable) objH) {
            Link link4 = ((ChapterM.Chapter) obj).link;
            if (Intrinsics.areEqual((link4 == null || (urlUrl$default2 = Link.url$default(link4, (Url) null, (Map) null, 3, (Object) null)) == null || (urlNormalize = urlUrl$default2.normalize()) == null) ? null : urlNormalize.getPath(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return CollectionsKt.firstOrNull(arrayList);
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            link = ((ChapterM.Chapter) next).link;
        } while (((link == null || (urlUrl$default = Link.url$default(link, (Url) null, (Map) null, 3, (Object) null)) == null) ? null : urlUrl$default.getFragment()) != null);
        chapter = (ChapterM.Chapter) next;
        EpubNavigatorFragment epubNavigatorFragment3 = this.f;
        EpubNavigatorFragment epubNavigatorFragment4 = epubNavigatorFragment3 instanceof EpubNavigatorFragment ? epubNavigatorFragment3 : null;
        if (epubNavigatorFragment4 == null) {
            return chapter;
        }
        if (!Intrinsics.areEqual(epubNavigatorFragment4.getCurrentLocator().getValue(), locator2)) {
            return null;
        }
        u2 u2VarL1 = g1.e().L0();
        c cVar = new c(epubNavigatorFragment4, null);
        aVar.a = locator2;
        aVar.b = str;
        aVar.c = arrayList;
        aVar.d = chapter;
        aVar.e = epubNavigatorFragment4;
        aVar.k = z2;
        aVar.n = 2;
        Object objH2 = kotlinx.coroutines.i.h(u2VarL1, cVar, aVar);
        if (objH2 != coroutine_suspended) {
            epubNavigatorFragment = epubNavigatorFragment4;
            objH = objH2;
            Locator locator9 = (Locator) objH;
            if (this.f == epubNavigatorFragment) {
            }
            return null;
        }
        return coroutine_suspended;
    }

    @l
    public final Navigator J() {
        return this.f;
    }

    @l
    public final Publication K() {
        return this.e;
    }

    @k
    public final com.zentraedi.reader.readium.d L() {
        return this.d;
    }

    public final void S(@l Navigator navigator) {
        this.f = navigator;
    }

    public final void T(@l Publication publication) {
        this.e = publication;
    }

    @Override // com.zentraedi.reader.i
    @l
    public Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation) {
        return R(this, str, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        return G(this, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object n(@k Continuation<? super String> continuation) {
        return I(this, continuation);
    }

    @Override // com.zentraedi.reader.i
    public void onDestroy() {
        Publication publication = this.e;
        if (publication != null) {
            publication.close();
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public String p() {
        Navigator navigator = this.f;
        if (navigator == null) {
            return "";
        }
        Intrinsics.checkNotNull(navigator);
        Double totalProgression = ((Locator) navigator.getCurrentLocator().getValue()).getLocations().getTotalProgression();
        double dDoubleValue = totalProgression != null ? totalProgression.doubleValue() : 0.0d;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double d2 = dDoubleValue * ((double) 100);
        if (d2 > 100.0d) {
            d2 = 100.0d;
        }
        return decimalFormat.format(d2) + '%';
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public List<Integer> r() {
        return CollectionsKt.listOf((Object[]) new Integer[]{3, 2});
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object s(int i2, @k Continuation<? super Unit> continuation) {
        return N(this, i2, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object t(@k ChapterM.Chapter chapter, @k Continuation<? super Unit> continuation) {
        return O(this, chapter, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    public void u() {
        OverflowableNavigator overflowableNavigator = this.f;
        OverflowableNavigator overflowableNavigator2 = overflowableNavigator instanceof OverflowableNavigator ? overflowableNavigator : null;
        if (overflowableNavigator2 != null) {
            overflowableNavigator2.goBackward(true);
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    public void v() {
        OverflowableNavigator overflowableNavigator = this.f;
        OverflowableNavigator overflowableNavigator2 = overflowableNavigator instanceof OverflowableNavigator ? overflowableNavigator : null;
        if (overflowableNavigator2 != null) {
            overflowableNavigator2.goForward(true);
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object w(@k Continuation<? super Unit> continuation) {
        return P(this, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object x(@k Continuation<? super Unit> continuation) {
        return Q(this, continuation);
    }
}
