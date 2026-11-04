package com.zentraedi.outreader.reader;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.model.TypefaceM;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.fragment.n;
import com.zentraedi.reader.OpenFileResult;
import fo.k;
import fo.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u2;
import org.readium.r2.navigator.epub.EpubNavigatorFragment;
import org.readium.r2.navigator.epub.EpubPreferences;
import org.readium.r2.navigator.epub.EpubPreferencesEditor;
import org.readium.r2.navigator.preferences.Color;
import org.readium.r2.navigator.preferences.ColumnCount;
import org.readium.r2.navigator.preferences.FontFamily;
import org.readium.r2.navigator.preferences.ImageFilter;
import org.readium.r2.navigator.preferences.ReadingProgression;
import org.readium.r2.navigator.preferences.Spread;
import org.readium.r2.navigator.preferences.TextAlign;
import org.readium.r2.navigator.preferences.Theme;
import org.readium.r2.shared.publication.LinkKt;
import org.readium.r2.shared.publication.Publication;
import org.readium.r2.shared.util.Language;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nEpubReadiumZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpubReadiumZReader.kt\ncom/zentraedi/outreader/reader/EpubReadiumZReader\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n13805#2,2:220\n1869#3,2:222\n*S KotlinDebug\n*F\n+ 1 EpubReadiumZReader.kt\ncom/zentraedi/outreader/reader/EpubReadiumZReader\n*L\n175#1:220,2\n185#1:222,2\n*E\n"})
public final class b extends f implements c {

    @l
    private EpubPreferencesEditor i;
    private float m;

    @k
    private EpubPreferences h = new EpubPreferences((Color) null, ColumnCount.ONE, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, ReadingProgression.LTR, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67076093, (DefaultConstructorMarker) null);

    @k
    private final n j = n.q.a();

    @k
    private HashMap<String, FontFamily> k = new HashMap<>();

    @k
    private HashMap<String, FontFamily> l = new HashMap<>();

    @k
    private d1<Boolean> n = new d1<>(Boolean.FALSE);

    @k
    private File o = new File(com.zentraedi.basic.function.utils.a.c().getApplicationInfo().dataDir, "readium_assets_extra");

    @DebugMetadata(c = "com.zentraedi.outreader.reader.EpubReadiumZReader", f = "EpubReadiumZReader.kt", i = {0}, l = {53}, m = "openFile-gIAlu-s", n = {TbsReaderView.m}, s = {"L$0"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.b = obj;
            this.d |= IntCompanionObject.MIN_VALUE;
            Object objH = b.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.m5boximpl(objH);
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.reader.b$b, reason: collision with other inner class name */
    @DebugMetadata(c = "com.zentraedi.outreader.reader.EpubReadiumZReader$setTypeface$1", f = "EpubReadiumZReader.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C0149b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX INFO: renamed from: com.zentraedi.outreader.reader.b$b$a */
        @DebugMetadata(c = "com.zentraedi.outreader.reader.EpubReadiumZReader$setTypeface$1$1", f = "EpubReadiumZReader.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ b b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EpubNavigatorFragment epubNavigatorFragmentJ = this.b.J();
                    EpubNavigatorFragment epubNavigatorFragment = epubNavigatorFragmentJ instanceof EpubNavigatorFragment ? epubNavigatorFragmentJ : null;
                    if (epubNavigatorFragment != null) {
                        String str = this.c;
                        this.a = 1;
                        if (epubNavigatorFragment.addCustomFontFace(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                b bVar = this.b;
                EpubPreferences epubPreferencesY = bVar.Y();
                FontFamily fontFamily = this.b.b0().get(this.c);
                bVar.h0(epubPreferencesY.plus(new EpubPreferences((Color) null, (ColumnCount) null, fontFamily != null ? fontFamily.unbox-impl() : null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, Boxing.boxBoolean(false), (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67092475, (DefaultConstructorMarker) null)));
                this.b.W();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0149b(String str, Continuation<? super C0149b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0149b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b.this.f0();
                u2 u2VarE = g1.e();
                a aVar = new a(b.this, this.c, null);
                this.a = 1;
                if (i.h(u2VarE, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((C0149b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        if (this.i == null) {
            return;
        }
        EpubNavigatorFragment epubNavigatorFragmentJ = J();
        EpubNavigatorFragment epubNavigatorFragment = epubNavigatorFragmentJ instanceof EpubNavigatorFragment ? epubNavigatorFragmentJ : null;
        if (epubNavigatorFragment != null) {
            EpubPreferencesEditor epubPreferencesEditor = this.i;
            Intrinsics.checkNotNull(epubPreferencesEditor);
            epubNavigatorFragment.submitPreferences(epubPreferencesEditor.getPreferences().plus(this.h));
        }
    }

    private final boolean e0(String str) {
        try {
            File file = new File(str);
            File file2 = new File(this.o, l5.r(str));
            if (!file.exists()) {
                throw new FileNotFoundException("源文件不存在: " + str);
            }
            if (file2.exists()) {
                return true;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            FilesKt.copyTo$default(file, file2, true, 0, 4, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            nd.a.c(h.b, "copyFile-> error=" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.k.clear();
        this.l.clear();
        for (TypefaceM typefaceM : new com.zentraedi.outreader.business.b().i("")) {
            HashMap<String, FontFamily> map = this.k;
            String type = typefaceM.getType();
            String type2 = typefaceM.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            map.put(type, FontFamily.box-impl(FontFamily.constructor-impl(type2)));
            if (typefaceM.isCustom()) {
                String customFontPath = typefaceM.getCustomFontPath();
                Intrinsics.checkNotNullExpressionValue(customFontPath, "getCustomFontPath(...)");
                if (e0(customFontPath)) {
                    HashMap<String, FontFamily> map2 = this.l;
                    String type3 = typefaceM.getType();
                    String type4 = typefaceM.getType();
                    Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                    map2.put(type3, FontFamily.box-impl(FontFamily.constructor-impl(type4)));
                }
            }
        }
    }

    private final void m0() {
        f0();
        File[] fileArrListFiles = this.o.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!this.l.containsKey(file.getName())) {
                    file.delete();
                }
            }
        }
    }

    @k
    public final HashMap<String, FontFamily> X() {
        return this.l;
    }

    @k
    public final EpubPreferences Y() {
        return this.h;
    }

    @k
    public final n Z() {
        return this.j;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void a(@k ReaderUtils.FontSize fontSize) {
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        if (this.m == fontSize.getEpubValue()) {
            return;
        }
        this.m = fontSize.getEpubValue();
        this.h = this.h.plus(new EpubPreferences((Color) null, (ColumnCount) null, (String) null, Double.valueOf(fontSize.getEpubValue()), (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67108855, (DefaultConstructorMarker) null));
        W();
    }

    @k
    public final File a0() {
        return this.o;
    }

    @k
    public final HashMap<String, FontFamily> b0() {
        return this.k;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void c(boolean z) {
        this.n.r(Boolean.valueOf(z));
    }

    @k
    public final d1<Boolean> c0() {
        return this.n;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void d(@k ReaderUtils.PageMargin margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.h = this.h.plus(new EpubPreferences((Color) null, (ColumnCount) null, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, Double.valueOf(margin.getEpubValue()), (Double) null, (Double) null, Boolean.FALSE, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67090431, (DefaultConstructorMarker) null));
        W();
    }

    @l
    public final EpubPreferencesEditor d0() {
        return this.i;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void f(@k String fontName) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        if (!this.k.containsKey(fontName)) {
            i.e(r0.a(g1.c()), (CoroutineContext) null, (CoroutineStart) null, new C0149b(fontName, null), 3, (Object) null);
            return;
        }
        EpubPreferences epubPreferences = this.h;
        FontFamily fontFamily = this.k.get(fontName);
        this.h = epubPreferences.plus(new EpubPreferences((Color) null, (ColumnCount) null, fontFamily != null ? fontFamily.unbox-impl() : null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, Boolean.FALSE, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67092475, (DefaultConstructorMarker) null));
        W();
    }

    public final void g0(@k HashMap<String, FontFamily> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.l = map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.zentraedi.outreader.reader.f, com.zentraedi.reader.i
    @l
    public Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation) {
        a aVar;
        Object objH;
        Publication publicationK;
        Publication publicationK2;
        List readingOrder;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.d = i - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.a = SpillingKt.nullOutSpilledVariable(str);
            aVar.d = 1;
            objH = super.h(str, aVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objH = ((Result) obj).m15unboximpl();
        }
        if (Result.m13isSuccessimpl(objH)) {
            if ((Result.m12isFailureimpl(objH) ? null : objH) == OpenFileResult.SUCCESS && (((publicationK = K()) == null || !publicationK.conformsTo(Publication.Profile.Companion.getEPUB())) && ((publicationK2 = K()) == null || (readingOrder = publicationK2.getReadingOrder()) == null || !LinkKt.getAllAreHtml(readingOrder)))) {
                nd.a.c(h.b, "openFile->publication is not EPUB");
                Result.Companion companion = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
            }
        }
        m0();
        return objH;
    }

    public final void h0(@k EpubPreferences epubPreferences) {
        Intrinsics.checkNotNullParameter(epubPreferences, "<set-?>");
        this.h = epubPreferences;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void i(@k ReaderUtils.LineSpace lineSpace) {
        Intrinsics.checkNotNullParameter(lineSpace, "lineSpace");
        this.h = this.h.plus(new EpubPreferences((Color) null, (ColumnCount) null, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, Double.valueOf(lineSpace.getEpubValue()), (Double) null, (Double) null, (Double) null, Boolean.FALSE, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67091455, (DefaultConstructorMarker) null));
        W();
    }

    public final void i0(@k File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.o = file;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void j(int i) {
    }

    public final void j0(@k HashMap<String, FontFamily> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.k = map;
    }

    public final void k0(@k d1<Boolean> d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<set-?>");
        this.n = d1Var;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void l(@k ReaderUtils.ParagraphSpace space) {
        Intrinsics.checkNotNullParameter(space, "space");
        this.h = this.h.plus(new EpubPreferences((Color) null, (ColumnCount) null, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, Double.valueOf(space.getEpubValue()), Boolean.FALSE, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67084287, (DefaultConstructorMarker) null));
        W();
    }

    public final void l0(@l EpubPreferencesEditor epubPreferencesEditor) {
        this.i = epubPreferencesEditor;
    }

    @Override // com.zentraedi.outreader.reader.h
    public int o() {
        return 0;
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Fragment q() {
        List readingOrder;
        if (K() == null) {
            return null;
        }
        Publication publicationK = K();
        if (publicationK != null && publicationK.conformsTo(Publication.Profile.Companion.getEPUB())) {
            return this.j;
        }
        Publication publicationK2 = K();
        if (publicationK2 != null && (readingOrder = publicationK2.getReadingOrder()) != null && LinkKt.getAllAreHtml(readingOrder)) {
            return this.j;
        }
        nd.a.e(h.b, "ReadiumZReader->getReaderFragment 格式不支持");
        return null;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void setBackgroundColor(int i) {
        this.h = this.h.plus(new EpubPreferences(Color.box-impl(Color.constructor-impl(ReaderUtils.a.d(i))), (ColumnCount) null, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (ReadingProgression) null, (Boolean) null, (Boolean) null, (Spread) null, (TextAlign) null, Color.box-impl(i == 5 ? Color.constructor-impl(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Vx)) : Color.constructor-impl(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Ox))), (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 66060286, (DefaultConstructorMarker) null));
        W();
    }

    @Override // com.zentraedi.outreader.reader.h
    public boolean y(int i) {
        EpubNavigatorFragment epubNavigatorFragmentJ = J();
        EpubNavigatorFragment epubNavigatorFragment = epubNavigatorFragmentJ instanceof EpubNavigatorFragment ? epubNavigatorFragmentJ : null;
        return epubNavigatorFragment != null && epubNavigatorFragment.scrollByOffset(i);
    }

    @Override // com.zentraedi.outreader.reader.h
    public void z(int i) {
        this.h = this.h.plus(new EpubPreferences((Color) null, (ColumnCount) null, (String) null, (Double) null, (Double) null, (Boolean) null, (ImageFilter) null, (Language) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (ReadingProgression) null, Boolean.valueOf(i == 2), (Boolean) null, (Spread) null, (TextAlign) null, (Color) null, (Boolean) null, (Theme) null, (Double) null, (Boolean) null, (Double) null, 67043327, (DefaultConstructorMarker) null));
        W();
    }
}
