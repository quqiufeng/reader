package com.zentraedi.outreader.reader;

import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.reader.reader.PageView;
import com.zentraedi.reader.reader.m;
import fo.k;
import fo.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nPageViewZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageViewZReader.kt\ncom/zentraedi/outreader/reader/PageViewZReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n360#2,7:169\n1056#2:176\n360#2,7:177\n360#2,7:184\n*S KotlinDebug\n*F\n+ 1 PageViewZReader.kt\ncom/zentraedi/outreader/reader/PageViewZReader\n*L\n50#1:169,7\n90#1:176\n102#1:177,7\n114#1:184,7\n*E\n"})
public abstract class d extends h {

    @l
    private PageView c;
    private int d = 1;

    @l
    private BookModel e;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PageViewZReader.kt\ncom/zentraedi/outreader/reader/PageViewZReader\n*L\n1#1,328:1\n91#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ChapterM.Chapter) t).page), Integer.valueOf(((ChapterM.Chapter) t2).page));
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PageViewZReader", f = "PageViewZReader.kt", i = {0, 0}, l = {49}, m = "go$suspendImpl", n = {"$this", "chapter"}, s = {"L$0", "L$1"}, v = 1)
    static final class b extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return d.H(d.this, null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PageViewZReader", f = "PageViewZReader.kt", i = {0, 0}, l = {60}, m = "go$suspendImpl", n = {"$this", "pageNumber"}, s = {"L$0", "I$0"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        int b;
        /* synthetic */ Object c;
        int e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return d.G(d.this, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.reader.d$d, reason: collision with other inner class name */
    @DebugMetadata(c = "com.zentraedi.outreader.reader.PageViewZReader", f = "PageViewZReader.kt", i = {0, 1, 1}, l = {112, 113}, m = "goNextChapter$suspendImpl", n = {"$this", "$this", "chapters"}, s = {"L$0", "L$0", "L$1"}, v = 1)
    static final class C0150d extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        C0150d(Continuation<? super C0150d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return d.I(d.this, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PageViewZReader", f = "PageViewZReader.kt", i = {0, 1, 1}, l = {100, 101}, m = "goPreChapter$suspendImpl", n = {"$this", "$this", "chapters"}, s = {"L$0", "L$0", "L$1"}, v = 1)
    static final class e extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return d.J(d.this, this);
        }
    }

    static /* synthetic */ Object B(d dVar, Continuation<? super String> continuation) {
        m currentPage;
        PageView pageViewE = dVar.E();
        return String.valueOf((pageViewE == null || (currentPage = pageViewE.getCurrentPage()) == null) ? null : Boxing.boxInt(currentPage.l()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object G(d dVar, int i, Continuation<? super Unit> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = dVar.new c(continuation);
            }
        } else {
            cVar = dVar.new c(continuation);
        }
        Object objM = cVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objM);
            cVar.a = dVar;
            cVar.b = i;
            cVar.e = 1;
            objM = dVar.m(cVar);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = cVar.b;
            dVar = (d) cVar.a;
            ResultKt.throwOnFailure(objM);
        }
        List<? extends ChapterM.Chapter> list = (List) objM;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        ChapterM.Chapter chapterA = dVar.A(i, list);
        if (chapterA == null) {
            return Unit.INSTANCE;
        }
        int iIndexOf = list.indexOf(chapterA);
        if (iIndexOf == -1) {
            return Unit.INSTANCE;
        }
        int i4 = list.get(0).page;
        int i5 = i - chapterA.page;
        nd.a.e("nas_book", "PageViewZReader->go 跳页 pageNumber=" + i + " firstPage=" + i4 + " page=" + i5);
        PageView pageViewE = dVar.E();
        if (pageViewE != null) {
            pageViewE.G1(iIndexOf, i5, dVar.K(list), -1.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object H(d dVar, ChapterM.Chapter chapter, Continuation<? super Unit> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                bVar.e = i - IntCompanionObject.MIN_VALUE;
            } else {
                bVar = dVar.new b(continuation);
            }
        } else {
            bVar = dVar.new b(continuation);
        }
        Object objM = bVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM);
            bVar.a = dVar;
            bVar.b = chapter;
            bVar.e = 1;
            objM = dVar.m(bVar);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chapter = (ChapterM.Chapter) bVar.b;
            dVar = (d) bVar.a;
            ResultKt.throwOnFailure(objM);
        }
        List<? extends ChapterM.Chapter> list = (List) objM;
        Iterator<? extends ChapterM.Chapter> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().f985id, chapter.f985id)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            return Unit.INSTANCE;
        }
        PageView pageViewE = dVar.E();
        if (pageViewE != null) {
            pageViewE.G1(i3, 0, dVar.K(list), -1.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[LOOP:0: B:24:0x006d->B:29:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[EDGE_INSN: B:52:0x0086->B:31:0x0086 BREAK  A[LOOP:0: B:24:0x006d->B:29:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object I(d dVar, Continuation<? super Unit> continuation) {
        C0150d c0150d;
        d dVar2;
        List<? extends ChapterM.Chapter> list;
        String str;
        Iterator<? extends ChapterM.Chapter> it;
        int i;
        if (continuation instanceof C0150d) {
            c0150d = (C0150d) continuation;
            int i2 = c0150d.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                c0150d.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                c0150d = dVar.new C0150d(continuation);
            }
        } else {
            c0150d = dVar.new C0150d(continuation);
        }
        Object objM = c0150d.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0150d.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objM);
            c0150d.a = dVar;
            c0150d.e = 1;
            objM = dVar.m(c0150d);
            if (objM != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            dVar = (d) c0150d.a;
            ResultKt.throwOnFailure(objM);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c0150d.b;
            dVar2 = (d) c0150d.a;
            ResultKt.throwOnFailure(objM);
        }
        str = (String) objM;
        it = list.iterator();
        i = 0;
        while (true) {
            if (it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().f985id, str)) {
                break;
            }
            i++;
        }
        if (i >= 0 || i >= list.size() - 1) {
            return Unit.INSTANCE;
        }
        while (list.get(i).page > 0) {
            int i4 = i + 1;
            if (list.get(i).page != list.get(i4).page) {
                break;
            }
            if (i4 >= list.size() - 1) {
                return Unit.INSTANCE;
            }
            i = i4;
        }
        PageView pageViewE = dVar2.E();
        if (pageViewE != null) {
            pageViewE.G1(i + 1, 0, dVar2.K(list), -1.0f);
        }
        return Unit.INSTANCE;
        List<? extends ChapterM.Chapter> list2 = (List) objM;
        c0150d.a = dVar;
        c0150d.b = list2;
        c0150d.e = 2;
        Object objN = dVar.n(c0150d);
        if (objN != coroutine_suspended) {
            dVar2 = dVar;
            list = list2;
            objM = objN;
            str = (String) objM;
            it = list.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().f985id, str)) {
                    break;
                    break;
                }
                i++;
            }
            if (i >= 0) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[LOOP:0: B:24:0x006d->B:29:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[LOOP:1: B:34:0x008b->B:52:?, LOOP_START, PHI: r3
      0x008b: PHI (r3v5 int) = (r3v4 int), (r3v7 int) binds: [B:31:0x0086, B:52:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[EDGE_INSN: B:48:0x0086->B:31:0x0086 BREAK  A[LOOP:0: B:24:0x006d->B:29:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:35:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    static /* synthetic */ java.lang.Object J(com.zentraedi.outreader.reader.d r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.zentraedi.outreader.reader.d.e
            if (r0 == 0) goto L13
            r0 = r8
            com.zentraedi.outreader.reader.d$e r0 = (com.zentraedi.outreader.reader.d.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.zentraedi.outreader.reader.d$e r0 = new com.zentraedi.outreader.reader.d$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.a
            com.zentraedi.outreader.reader.d r0 = (com.zentraedi.outreader.reader.d) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.a
            com.zentraedi.outreader.reader.d r7 = (com.zentraedi.outreader.reader.d) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L44:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r7
            r0.e = r4
            java.lang.Object r8 = r7.m(r0)
            if (r8 != r1) goto L52
            goto L60
        L52:
            java.util.List r8 = (java.util.List) r8
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = r7.n(r0)
            if (r0 != r1) goto L61
        L60:
            return r1
        L61:
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.String r8 = (java.lang.String) r8
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        L6d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L85
            java.lang.Object r5 = r1.next()
            com.zentraedi.outreader.model.ChapterM$Chapter r5 = (com.zentraedi.outreader.model.ChapterM.Chapter) r5
            java.lang.String r5 = r5.f985id
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)
            if (r5 == 0) goto L82
            goto L86
        L82:
            int r3 = r3 + 1
            goto L6d
        L85:
            r3 = -1
        L86:
            if (r3 > 0) goto L8b
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L8b:
            java.lang.Object r8 = r7.get(r3)
            com.zentraedi.outreader.model.ChapterM$Chapter r8 = (com.zentraedi.outreader.model.ChapterM.Chapter) r8
            int r8 = r8.page
            if (r8 <= 0) goto Lb0
            java.lang.Object r8 = r7.get(r3)
            com.zentraedi.outreader.model.ChapterM$Chapter r8 = (com.zentraedi.outreader.model.ChapterM.Chapter) r8
            int r8 = r8.page
            int r1 = r3 + (-1)
            java.lang.Object r1 = r7.get(r1)
            com.zentraedi.outreader.model.ChapterM$Chapter r1 = (com.zentraedi.outreader.model.ChapterM.Chapter) r1
            int r1 = r1.page
            if (r8 != r1) goto Lb0
            int r3 = r3 + (-1)
            if (r3 > 0) goto L8b
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lb0:
            com.zentraedi.reader.reader.PageView r8 = r0.E()
            if (r8 == 0) goto Lc0
            int r3 = r3 - r4
            java.util.ArrayList r7 = r0.K(r7)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.G1(r3, r2, r7, r0)
        Lc0:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.d.J(com.zentraedi.outreader.reader.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @l
    public final ChapterM.Chapter A(int i, @k List<? extends ChapterM.Chapter> chapters) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        List listSortedWith = CollectionsKt.sortedWith(chapters, new a());
        ListIterator listIterator = listSortedWith.listIterator(listSortedWith.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (i >= ((ChapterM.Chapter) objPrevious).page) {
                return (ChapterM.Chapter) objPrevious;
            }
        }
        objPrevious = null;
        return (ChapterM.Chapter) objPrevious;
    }

    @l
    public final BookModel C() {
        return this.e;
    }

    public final int D() {
        return this.d;
    }

    @l
    public PageView E() {
        return this.c;
    }

    @k
    public final String F(int i) {
        if (i <= 0) {
            return "";
        }
        return "  " + F(i - 1);
    }

    @k
    public final ArrayList<com.zentraedi.reader.reader.k> K(@l List<? extends ChapterM.Chapter> list) {
        ArrayList<com.zentraedi.reader.reader.k> arrayList = new ArrayList<>();
        List<? extends ChapterM.Chapter> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            for (ChapterM.Chapter chapter : list) {
                com.zentraedi.reader.reader.k kVar = new com.zentraedi.reader.reader.k();
                kVar.d = chapter.f985id;
                kVar.e = chapter.name;
                Integer numG = com.zentraedi.outreader.util.d.g(chapter.words);
                Intrinsics.checkNotNullExpressionValue(numG, "toInt(...)");
                kVar.i = numG.intValue();
                BookModel bookModel = this.e;
                int bookType = 0;
                kVar.h = bookModel != null ? bookModel.getWordCountInt() : 0;
                BookModel bookModel2 = this.e;
                String nasFileName = bookModel2 != null ? bookModel2.getNasFileName() : null;
                if (nasFileName == null) {
                    nasFileName = "";
                }
                kVar.b = nasFileName;
                BookModel bookModel3 = this.e;
                if (bookModel3 != null) {
                    bookType = bookModel3.getBookType();
                }
                kVar.c = bookType;
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public final void L(@l BookModel bookModel) {
        this.e = bookModel;
    }

    public final void M(int i) {
        this.d = i;
    }

    public void N(@l PageView pageView) {
        this.c = pageView;
        z(this.d);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object n(@k Continuation<? super String> continuation) {
        return B(this, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    public int o() {
        m currentPage;
        PageView pageViewE = E();
        return ((pageViewE == null || (currentPage = pageViewE.getCurrentPage()) == null) ? 0 : currentPage.i()) + 1;
    }

    @Override // com.zentraedi.reader.i
    public void onDestroy() {
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.Q0();
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public String p() {
        PageView pageViewE = E();
        String contentProgress = pageViewE != null ? pageViewE.getContentProgress() : null;
        return contentProgress == null ? "" : contentProgress;
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public List<Integer> r() {
        return CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 1, 3, 4, 5});
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object s(int i, @k Continuation<? super Unit> continuation) {
        return G(this, i, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object t(@k ChapterM.Chapter chapter, @k Continuation<? super Unit> continuation) {
        return H(this, chapter, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    public void u() {
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.P1();
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    public void v() {
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.v1();
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object w(@k Continuation<? super Unit> continuation) {
        return I(this, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object x(@k Continuation<? super Unit> continuation) {
        return J(this, continuation);
    }

    @Override // com.zentraedi.outreader.reader.h
    public boolean y(int i) {
        PageView pageViewE = E();
        return pageViewE != null && pageViewE.g2(i);
    }

    @Override // com.zentraedi.outreader.reader.h
    public void z(int i) {
        this.d = i;
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setPageMode(i);
        }
    }
}
