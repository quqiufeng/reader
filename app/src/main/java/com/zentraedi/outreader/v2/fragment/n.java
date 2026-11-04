package com.zentraedi.outreader.v2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.responsemodel.ReadProgressExt;
import com.zentraedi.reader.readium.ReadiumReaderInputListener;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import org.readium.r2.navigator.DecorableNavigator;
import org.readium.r2.navigator.Decoration;
import org.readium.r2.navigator.Navigator;
import org.readium.r2.navigator.OverflowableNavigator;
import org.readium.r2.navigator.VisualNavigator;
import org.readium.r2.navigator.epub.EpubNavigatorFactory;
import org.readium.r2.navigator.epub.EpubNavigatorFragment;
import org.readium.r2.navigator.epub.EpubPreferences;
import org.readium.r2.navigator.epub.EpubPreferencesEditor;
import org.readium.r2.navigator.epub.css.BoxSizing;
import org.readium.r2.navigator.epub.css.ColCount;
import org.readium.r2.navigator.epub.css.Color;
import org.readium.r2.navigator.epub.css.FontStyle;
import org.readium.r2.navigator.epub.css.FontWeight;
import org.readium.r2.navigator.epub.css.Length;
import org.readium.r2.navigator.epub.css.MutableFontFaceDeclaration;
import org.readium.r2.navigator.epub.css.MutableFontFamilyDeclaration;
import org.readium.r2.navigator.epub.css.RsProperties;
import org.readium.r2.navigator.html.HtmlDecorationTemplate;
import org.readium.r2.navigator.html.HtmlDecorationTemplateKt;
import org.readium.r2.navigator.input.DragEvent;
import org.readium.r2.navigator.input.InputListener;
import org.readium.r2.navigator.input.KeyEvent;
import org.readium.r2.navigator.input.TapEvent;
import org.readium.r2.navigator.preferences.FontFamily;
import org.readium.r2.shared.publication.Link;
import org.readium.r2.shared.publication.LinkKt;
import org.readium.r2.shared.publication.Locator;
import org.readium.r2.shared.publication.Publication;
import org.readium.r2.shared.util.Either;
import org.readium.r2.shared.util.Url;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class n extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a q = new a(null);

    @fo.k
    private static final String r = "navigator";

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.O2(this.a);
        }
    });
    public com.zentraedi.outreader.databinding.q o;
    public com.zentraedi.outreader.reader.b p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final n a() {
            n nVar = new n();
            nVar.setArguments(new Bundle());
            return nVar;
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.EpubReadiumReaderFragment$getResourceTest$1", f = "EpubReadiumReaderFragment.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {369, 374, 382, 386}, m = "invokeSuspend", n = {"content", "iterator", "index", "content", "iterator", "element", "resource", "index", "content", "content", "elements", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "element", "r", "$i$f$map", "$i$f$mapTo", "$i$a$-map-EpubReadiumReaderFragment$getResourceTest$1$1"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2"}, v = 1)
    @SourceDebugExtension({"SMAP\nEpubReadiumReaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpubReadiumReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/EpubReadiumReaderFragment$getResourceTest$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n808#2,11:392\n1563#2:403\n1634#2,3:404\n*S KotlinDebug\n*F\n+ 1 EpubReadiumReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/EpubReadiumReaderFragment$getResourceTest$1\n*L\n384#1:392,11\n384#1:403\n384#1:404,3\n*E\n"})
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
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
        Object k;
        int l;
        int m;
        int n;
        int o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:71:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:74:0x022b  */
        /* JADX WARN: Code duplicated, block: B:78:0x023d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00dd -> B:45:0x0145). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0112 -> B:39:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x022b -> B:75:0x0232). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 602
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.v2.fragment.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.EpubReadiumReaderFragment$onViewCreated$1", f = "EpubReadiumReaderFragment.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"locator"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nEpubReadiumReaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpubReadiumReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/EpubReadiumReaderFragment$onViewCreated$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,391:1\n216#2,2:392\n*S KotlinDebug\n*F\n+ 1 EpubReadiumReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/EpubReadiumReaderFragment$onViewCreated$1\n*L\n130#1:392,2\n*E\n"})
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ EpubNavigatorFactory d;

        public static final class a implements EpubNavigatorFragment.PaginationListener {
            final /* synthetic */ n a;

            a(n nVar) {
                this.a = nVar;
            }

            public void onPageChanged(int i, int i2, Locator locator) {
                Intrinsics.checkNotNullParameter(locator, "locator");
                BookModel bookModelM = this.a.K2().M();
                if (bookModelM != null) {
                    bookModelM.setRead_page(String.valueOf(i));
                }
                BookModel bookModelM2 = this.a.K2().M();
                if (bookModelM2 != null) {
                    bookModelM2.setChapterTotalPage(i2);
                }
                androidx.lifecycle.d1<Integer> d1VarU = this.a.K2().U();
                Integer num = (Integer) this.a.K2().U().f();
                d1VarU.r(num != null ? Integer.valueOf(num.intValue() + 1) : null);
                this.a.K2().V().r(Boolean.TRUE);
            }

            public void onPageLoaded() {
                this.a.K2().V().r(Boolean.TRUE);
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ n a;

            @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.EpubReadiumReaderFragment$onViewCreated$1$3", f = "EpubReadiumReaderFragment.kt", i = {0, 0, 0}, l = {159}, m = "emit", n = {"it", "index", "realChapterId"}, s = {"L$0", "L$1", "L$2"}, v = 1)
            static final class a extends ContinuationImpl {
                Object a;
                Object b;
                Object c;
                /* synthetic */ Object d;
                final /* synthetic */ b<T> e;
                int f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(b<? super T> bVar, Continuation<? super a> continuation) {
                    super(continuation);
                    this.e = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= IntCompanionObject.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            b(n nVar) {
                this.a = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Locator locator, Continuation<? super Unit> continuation) {
                a aVar;
                String str;
                Integer num;
                Locator locator2;
                kotlinx.coroutines.flow.m0 currentLocator;
                if (continuation instanceof a) {
                    aVar = (a) continuation;
                    int i = aVar.f;
                    if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                        aVar.f = i - IntCompanionObject.MIN_VALUE;
                    } else {
                        aVar = new a(this, continuation);
                    }
                } else {
                    aVar = new a(this, continuation);
                }
                a aVar2 = aVar;
                Object obj = aVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = aVar2.f;
                Locator locator3 = null;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Publication publicationK = this.a.L2().K();
                    Intrinsics.checkNotNull(publicationK);
                    Integer numIndexOfFirstWithHref = LinkKt.indexOfFirstWithHref(publicationK.getReadingOrder(), locator.getHref());
                    String strValueOf = numIndexOfFirstWithHref != null ? String.valueOf(numIndexOfFirstWithHref.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    str = strValueOf;
                    if (numIndexOfFirstWithHref == null || StringsKt.isBlank(str)) {
                        return Unit.INSTANCE;
                    }
                    com.zentraedi.outreader.reader.b bVarL2 = this.a.L2();
                    aVar2.a = locator;
                    aVar2.b = numIndexOfFirstWithHref;
                    aVar2.c = str;
                    aVar2.f = 1;
                    Object objF = com.zentraedi.outreader.reader.f.F(bVarL2, locator, false, aVar2, 2, null);
                    if (objF == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    num = numIndexOfFirstWithHref;
                    obj = objF;
                    locator2 = locator;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) aVar2.c;
                    num = (Integer) aVar2.b;
                    Locator locator4 = (Locator) aVar2.a;
                    ResultKt.throwOnFailure(obj);
                    str = str2;
                    locator2 = locator4;
                }
                ChapterM.Chapter chapter = (ChapterM.Chapter) obj;
                Navigator navigatorJ = this.a.L2().J();
                if (navigatorJ != null && (currentLocator = navigatorJ.getCurrentLocator()) != null) {
                    locator3 = (Locator) currentLocator.getValue();
                }
                if (!Intrinsics.areEqual(locator3, locator2)) {
                    return Unit.INSTANCE;
                }
                if (chapter != null) {
                    this.a.K2().P().r(chapter.f985id);
                    BookModel bookModelM = this.a.K2().M();
                    if (bookModelM != null) {
                        bookModelM.setRead_chapter(chapter.name);
                    }
                }
                BookModel bookModelM2 = this.a.K2().M();
                if (bookModelM2 != null) {
                    bookModelM2.setRead_chapter_id(str);
                }
                BookModel bookModelM3 = this.a.K2().M();
                if (bookModelM3 != null) {
                    ReadProgressExt readProgressExt = new ReadProgressExt();
                    readProgressExt.setFileIndex(str);
                    readProgressExt.setFileProgress(String.valueOf(locator2.getLocations().getProgression()));
                    bookModelM3.setReadProgressExt(readProgressExt);
                }
                BookModel bookModelM4 = this.a.K2().M();
                if (bookModelM4 != null) {
                    bookModelM4.setReadTime(System.currentTimeMillis());
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                Double totalProgression = locator2.getLocations().getTotalProgression();
                double dDoubleValue = (totalProgression != null ? totalProgression.doubleValue() : 0.0d) * ((double) 100);
                if (dDoubleValue > 100.0d) {
                    dDoubleValue = 100.0d;
                }
                String str3 = decimalFormat.format(dDoubleValue);
                BookModel bookModelM5 = this.a.K2().M();
                if (bookModelM5 != null) {
                    bookModelM5.setReadProgressPercent(str3 + '%');
                }
                BookModel bookModelM6 = this.a.K2().M();
                if (bookModelM6 != null) {
                    bookModelM6.setCurrentPageDesc(str3 + '%');
                }
                Publication publicationK2 = this.a.L2().K();
                Intrinsics.checkNotNull(publicationK2);
                int size = publicationK2.getReadingOrder().size() - 1;
                if (num != null && num.intValue() == size) {
                    BookModel bookModelM7 = this.a.K2().M();
                    if (bookModelM7 != null) {
                        bookModelM7.setRead_finished(1);
                    }
                } else {
                    BookModel bookModelM8 = this.a.K2().M();
                    if (bookModelM8 != null) {
                        bookModelM8.setRead_finished(0);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EpubNavigatorFactory epubNavigatorFactory, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = epubNavigatorFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(final n nVar, EpubNavigatorFragment.Configuration configuration) {
            EpubNavigatorFragment.Configuration configuration2 = configuration;
            configuration2.setReadiumCssRsProperties(new RsProperties((Length) null, (ColCount) null, (Length.Absolute) null, (Length.Absolute) null, (Length) null, (Length) null, (Length) null, Length.Rem.box-impl(Length.Rem.constructor-impl(100.0d)), (Length) null, (Length) null, (BoxSizing) null, (BoxSizing) null, (Color) null, (Color) null, (Color) null, (Color) null, (Color) null, (Color) null, (Color) null, (Color) null, (Double) null, (List) null, (Either) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, -129, 7, (DefaultConstructorMarker) null));
            configuration2.setServedAssets(CollectionsKt.plus((Collection<? extends String>) configuration2.getServedAssets(), ".*"));
            for (final Map.Entry<String, FontFamily> entry : nVar.L2().b0().entrySet()) {
                EpubNavigatorFragment.Configuration.addFontFamilyDeclaration-mKJBpZw$default(configuration2, entry.getValue().unbox-impl(), (List) null, new Function1() { // from class: com.zentraedi.outreader.v2.fragment.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.c.h(nVar, entry, (MutableFontFamilyDeclaration) obj);
                    }
                }, 2, (Object) null);
                configuration2 = configuration;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(final n nVar, final Map.Entry entry, MutableFontFamilyDeclaration mutableFontFamilyDeclaration) {
            mutableFontFamilyDeclaration.addFontFace(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.c.j(nVar, entry, (MutableFontFaceDeclaration) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(n nVar, Map.Entry entry, MutableFontFaceDeclaration mutableFontFaceDeclaration) {
            if (nVar.L2().X().containsKey(entry.getKey())) {
                MutableFontFaceDeclaration.addSource$default(mutableFontFaceDeclaration, "readium_assets_extra/" + ((FontFamily) entry.getValue()).unbox-impl(), false, 2, (Object) null);
            } else {
                MutableFontFaceDeclaration.addSource$default(mutableFontFaceDeclaration, ((FontFamily) entry.getValue()).unbox-impl(), false, 2, (Object) null);
            }
            mutableFontFaceDeclaration.setFontStyle(FontStyle.NORMAL);
            mutableFontFaceDeclaration.setFontWeight(FontWeight.NORMAL);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new c(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.m0 currentLocator;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                BookModel bookModelM = nVar.K2().M();
                Intrinsics.checkNotNull(bookModelM);
                ReadProgressExt readProgressExt = bookModelM.getReadProgressExt();
                String fileIndex = readProgressExt != null ? readProgressExt.getFileIndex() : null;
                BookModel bookModelM2 = n.this.K2().M();
                Intrinsics.checkNotNull(bookModelM2);
                ReadProgressExt readProgressExt2 = bookModelM2.getReadProgressExt();
                Locator locatorI2 = nVar.I2(fileIndex, readProgressExt2 != null ? readProgressExt2.getFileProgress() : null);
                FragmentManager childFragmentManager = n.this.getChildFragmentManager();
                EpubNavigatorFactory epubNavigatorFactory = this.d;
                EpubPreferencesEditor epubPreferencesEditorD0 = n.this.L2().d0();
                Intrinsics.checkNotNull(epubPreferencesEditorD0);
                EpubPreferences preferences = epubPreferencesEditorD0.getPreferences();
                a aVar = new a(n.this);
                EpubNavigatorFragment.Configuration.Companion companion = EpubNavigatorFragment.Configuration.Companion;
                final n nVar2 = n.this;
                childFragmentManager.Y1(epubNavigatorFactory.createFragmentFactory(locatorI2, (List) null, preferences, (EpubNavigatorFragment.Listener) null, aVar, companion.invoke(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n.c.g(nVar2, (EpubNavigatorFragment.Configuration) obj2);
                    }
                })));
                n.this.getChildFragmentManager().w().F(com.zentraedi.outreader.d.i.ef, EpubNavigatorFragment.class, (Bundle) null, n.r).s();
                com.zentraedi.outreader.reader.b bVarL2 = n.this.L2();
                EpubNavigatorFragment epubNavigatorFragmentW0 = n.this.getChildFragmentManager().w0(n.r);
                Intrinsics.checkNotNull(epubNavigatorFragmentW0, "null cannot be cast to non-null type org.readium.r2.navigator.epub.EpubNavigatorFragment");
                bVarL2.S(epubNavigatorFragmentW0);
                n.this.R2();
                Navigator navigatorJ = n.this.L2().J();
                if (navigatorJ == null || (currentLocator = navigatorJ.getCurrentLocator()) == null) {
                    return Unit.INSTANCE;
                }
                b bVar = new b(n.this);
                this.a = SpillingKt.nullOutSpilledVariable(locatorI2);
                this.b = 1;
                if (currentLocator.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class d implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof androidx.lifecycle.e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class e implements InputListener {
        e() {
        }

        public /* bridge */ boolean onDrag(DragEvent dragEvent) {
            return InputListener.DefaultImpls.onDrag(this, dragEvent);
        }

        public /* bridge */ boolean onKey(KeyEvent keyEvent) {
            return InputListener.DefaultImpls.onKey(this, keyEvent);
        }

        public boolean onTap(TapEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Object objF = n.this.K2().W().f();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(objF, bool)) {
                return false;
            }
            n.this.K2().W().r(Boolean.valueOf(!Intrinsics.areEqual(n.this.K2().W().f(), bool)));
            return true;
        }
    }

    public static final class f implements InputListener {
        f() {
        }

        public /* bridge */ boolean onDrag(DragEvent dragEvent) {
            return InputListener.DefaultImpls.onDrag(this, dragEvent);
        }

        public /* bridge */ boolean onKey(KeyEvent keyEvent) {
            return InputListener.DefaultImpls.onKey(this, keyEvent);
        }

        public boolean onTap(TapEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            n.this.K2().W().r(Boolean.valueOf(!Intrinsics.areEqual(n.this.K2().W().f(), Boolean.TRUE)));
            return true;
        }
    }

    private final HtmlDecorationTemplate E2(@androidx.annotation.l final int i) {
        Url urlAssetUrl = EpubNavigatorFragment.Companion.assetUrl("annotation-icon.svg");
        if (urlAssetUrl == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final String str = "testapp-annotation-mark";
        return new HtmlDecorationTemplate(HtmlDecorationTemplate.Layout.BOUNDS, HtmlDecorationTemplate.Width.PAGE, new Function1() { // from class: com.zentraedi.outreader.v2.fragment.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.G2(str, i, (Decoration) obj);
            }
        }, "\n            .testapp-annotation-mark {\n                float: left;\n                margin-left: 8px;\n                width: 30px;\n                height: 30px;\n                border-radius: 50%;\n                background: url('" + urlAssetUrl + "') no-repeat center;\n                background-size: auto 50%;\n                opacity: 0.8;\n            }\n            ");
    }

    static /* synthetic */ HtmlDecorationTemplate F2(n nVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -256;
        }
        return nVar.E2(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G2(String str, int i, Decoration decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        return "\n            <div><div data-activable=\"1\" class=\"" + str + "\" style=\"background-color: " + HtmlDecorationTemplateKt.toCss$default(i, (Double) null, 1, (Object) null) + " !important\"/></div>\"\n            ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H2(DecorableNavigator decorableNavigator, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d O2(n nVar) {
        FragmentActivity fragmentActivityRequireActivity = nVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    private final HtmlDecorationTemplate P2() {
        final String str = "testapp-page-number";
        return new HtmlDecorationTemplate(HtmlDecorationTemplate.Layout.BOUNDS, HtmlDecorationTemplate.Width.PAGE, new Function1() { // from class: com.zentraedi.outreader.v2.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.Q2(str, (Decoration) obj);
            }
        }, "\n            .testapp-page-number {\n                float: left;\n                margin-left: 8px;\n                padding: 0px 4px 0px 4px;\n                border: 1px solid;\n                border-radius: 20%;\n                box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;\n                opacity: 0.8;\n            }\n            ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q2(String str, Decoration decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        return "\n            <div><span class=\"" + str + "\" style=\"background-color: var(--RS__backgroundColor) !important\">1</span></div>\"\n            ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit S2(Ref.ObjectRef objectRef, Boolean bool) {
        ReadiumReaderInputListener readiumReaderInputListener = (ReadiumReaderInputListener) objectRef.element;
        if (readiumReaderInputListener != null) {
            Intrinsics.checkNotNull(bool);
            readiumReaderInputListener.f(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    @fo.l
    public final Locator I2(@fo.l String str, @fo.l String str2) {
        Integer intOrNull;
        Publication publicationK = L2().K();
        Intrinsics.checkNotNull(publicationK);
        Link link = (Link) CollectionsKt.getOrNull(publicationK.getReadingOrder(), (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue());
        if (link != null) {
            Publication publicationK2 = L2().K();
            Locator locatorLocatorFromLink = publicationK2 != null ? publicationK2.locatorFromLink(link) : null;
            Double doubleOrNull = str2 != null ? StringsKt.toDoubleOrNull(str2) : null;
            if (locatorLocatorFromLink != null) {
                return Locator.copyWithLocations$default(locatorLocatorFromLink, (List) null, doubleOrNull, (Integer) null, (Double) null, (Map) null, 29, (Object) null);
            }
        }
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.databinding.q J2() {
        com.zentraedi.outreader.databinding.q qVar = this.o;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.viewmodel.d K2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    @fo.k
    public final com.zentraedi.outreader.reader.b L2() {
        com.zentraedi.outreader.reader.b bVar = this.p;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mZReader");
        return null;
    }

    public final void M2() {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new b(null), 3, (Object) null);
    }

    public final void N2(@fo.l String str, @fo.l String str2) {
        Navigator navigatorJ;
        Locator locatorI2 = I2(str, str2);
        if (locatorI2 == null || (navigatorJ = L2().J()) == null) {
            return;
        }
        navigatorJ.go(locatorI2, true);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.zentraedi.reader.readium.ReadiumReaderInputListener] */
    public final void R2() {
        VisualNavigator visualNavigatorJ = L2().J();
        VisualNavigator visualNavigator = visualNavigatorJ instanceof VisualNavigator ? visualNavigatorJ : null;
        if (visualNavigator != null) {
            visualNavigator.addInputListener(new e());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        VisualNavigator visualNavigatorJ2 = L2().J();
        VisualNavigator visualNavigator2 = visualNavigatorJ2 instanceof OverflowableNavigator ? (OverflowableNavigator) visualNavigatorJ2 : null;
        if (visualNavigator2 != null) {
            ?? readiumReaderInputListener = new ReadiumReaderInputListener(visualNavigator2, null, true, 0.0d, null, 0.0d, null, true, false, 378, null);
            objectRef.element = readiumReaderInputListener;
            readiumReaderInputListener.f(Intrinsics.areEqual(L2().c0().f(), Boolean.TRUE));
            visualNavigator2.addInputListener((InputListener) objectRef.element);
        }
        L2().c0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.S2(objectRef, (Boolean) obj);
            }
        }));
        Navigator navigatorJ = L2().J();
        VisualNavigator visualNavigator3 = navigatorJ instanceof VisualNavigator ? (VisualNavigator) navigatorJ : null;
        if (visualNavigator3 != null) {
            visualNavigator3.addInputListener(new f());
        }
    }

    public final void T2(@fo.k com.zentraedi.outreader.databinding.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.o = qVar;
    }

    public final void U2(@fo.k com.zentraedi.outreader.reader.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.p = bVar;
    }

    public void onCreate(@fo.l Bundle bundle) {
        if (K2().Y() instanceof com.zentraedi.outreader.reader.b) {
            com.zentraedi.outreader.reader.h hVarY = K2().Y();
            Intrinsics.checkNotNull(hVarY, "null cannot be cast to non-null type com.zentraedi.outreader.reader.EpubReadiumZReader");
            U2((com.zentraedi.outreader.reader.b) hVarY);
            if (L2().K() == null) {
                return;
            }
            super.onCreate(bundle);
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super/*androidx.fragment.app.Fragment*/.onCreateView(inflater, viewGroup, bundle);
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.I5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        T2((com.zentraedi.outreader.databinding.q) c0VarJ);
        return J2().getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Publication publicationK = L2().K();
        Intrinsics.checkNotNull(publicationK);
        EpubNavigatorFactory epubNavigatorFactory = new EpubNavigatorFactory(publicationK, (EpubNavigatorFactory.Configuration) null, 2, (DefaultConstructorMarker) null);
        L2().l0(epubNavigatorFactory.createPreferencesEditor(L2().Y()));
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new c(epubNavigatorFactory, null), 3, (Object) null);
    }
}
