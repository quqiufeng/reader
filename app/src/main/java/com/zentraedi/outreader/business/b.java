package com.zentraedi.outreader.business;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.video.base.CheckFontService;
import com.zentraedi.outreader.model.TypefaceM;
import fo.k;
import fo.l;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nTypefaceDataBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypefaceDataBusiness.kt\ncom/zentraedi/outreader/business/TypefaceDataBusiness\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1056#2:169\n1869#2,2:170\n*S KotlinDebug\n*F\n+ 1 TypefaceDataBusiness.kt\ncom/zentraedi/outreader/business/TypefaceDataBusiness\n*L\n103#1:169\n104#1:170,2\n*E\n"})
public final class b {

    @k
    public static final a a = new a(null);

    @k
    private static final File b = new File(new File(com.zentraedi.basic.function.utils.a.a().getExternalCacheDir(), "/ZreaderFont"), NasConnectManager.getInstance().loginUserName());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final File a() {
            return b.b;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.business.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TypefaceDataBusiness.kt\ncom/zentraedi/outreader/business/TypefaceDataBusiness\n*L\n1#1,328:1\n103#2:329\n*E\n"})
    public static final class C0135b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
        }
    }

    private final TypefaceM c(String str, String str2) {
        TypefaceM typefaceM = new TypefaceM();
        typefaceM.setCustomFontPath(new File(b, str2).getPath());
        typefaceM.setName(str);
        typefaceM.setDownloadState(4);
        typefaceM.setType(str);
        String customFontPath = typefaceM.getCustomFontPath();
        Intrinsics.checkNotNullExpressionValue(customFontPath, "getCustomFontPath(...)");
        typefaceM.setTypeface(d(customFontPath));
        typefaceM.setDownloadedSize(1000L);
        typefaceM.setCustom(true);
        return typefaceM;
    }

    private final Typeface d(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            try {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
                Intrinsics.checkNotNullExpressionValue(typefaceCreateFromFile, "createFromFile(...)");
                return typefaceCreateFromFile;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        return DEFAULT;
    }

    private final List<TypefaceM> e(String str) {
        List listEmptyList;
        File file = b;
        if (!file.exists() || !file.isDirectory()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.zentraedi.outreader.business.a
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return b.f(file2);
            }
        });
        if (fileArrListFiles == null || (listEmptyList = ArraysKt.toList(fileArrListFiles)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (File file2 : CollectionsKt.sortedWith(listEmptyList, new C0135b())) {
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String name2 = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            TypefaceM typefaceMC = c(name, name2);
            typefaceMC.setSelect(Intrinsics.areEqual(typefaceMC.getType(), str));
            arrayList.add(typefaceMC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file) {
        return file.isFile();
    }

    private final TypefaceM g(String str, String str2) {
        TypefaceM typefaceM = new TypefaceM();
        typefaceM.setName(str);
        typefaceM.setDownloadState(4);
        typefaceM.setType(str2);
        typefaceM.setTypeface(h(str2));
        typefaceM.setDownloadedSize(1000L);
        return typefaceM;
    }

    @k
    public final Typeface h(@k String fontName) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        String str = (String) CheckFontService.A.get(fontName);
        if (str == null) {
            String path = new File(b, fontName).getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return d(path);
        }
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            try {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
                Intrinsics.checkNotNullExpressionValue(typefaceCreateFromFile, "createFromFile(...)");
                return typefaceCreateFromFile;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        return DEFAULT;
    }

    @k
    public final List<TypefaceM> i(@l String str) {
        ArrayList arrayList = new ArrayList();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.FE1);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        TypefaceM typefaceMG = g(strN, "NotoSansCJK-Regular.ttc");
        typefaceMG.setSelect(Intrinsics.areEqual(typefaceMG.getType(), str));
        arrayList.add(typefaceMG);
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Iw1);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        TypefaceM typefaceMG2 = g(strN2, "SiYuanSongTi.otf");
        typefaceMG2.setSelect(Intrinsics.areEqual(typefaceMG2.getType(), str));
        Typeface typeface = typefaceMG2.getTypeface();
        Typeface typeface2 = Typeface.DEFAULT;
        if (!Intrinsics.areEqual(typeface, typeface2)) {
            arrayList.add(typefaceMG2);
        }
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Hw1);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        TypefaceM typefaceMG3 = g(strN3, "SiYuanHeiTi.otf");
        typefaceMG3.setSelect(Intrinsics.areEqual(typefaceMG3.getType(), str));
        if (!Intrinsics.areEqual(typefaceMG3.getTypeface(), typeface2)) {
            arrayList.add(typefaceMG3);
        }
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.BE4);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        TypefaceM typefaceMG4 = g(strN4, "WenQuanYiWeiMiHei.tar");
        typefaceMG4.setSelect(Intrinsics.areEqual(typefaceMG4.getType(), str));
        if (!Intrinsics.areEqual(typefaceMG4.getTypeface(), typeface2)) {
            arrayList.add(typefaceMG4);
        }
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.CE4);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        TypefaceM typefaceMG5 = g(strN5, "GengShaHeiTi.ttf");
        typefaceMG5.setSelect(Intrinsics.areEqual(typefaceMG5.getType(), str));
        if (!Intrinsics.areEqual(typefaceMG5.getTypeface(), typeface2)) {
            arrayList.add(typefaceMG5);
        }
        String strN6 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.DE4);
        Intrinsics.checkNotNullExpressionValue(strN6, "getString(...)");
        TypefaceM typefaceMG6 = g(strN6, "YouAiYuanTi2.ttf");
        typefaceMG6.setSelect(Intrinsics.areEqual(typefaceMG6.getType(), str));
        if (!Intrinsics.areEqual(typefaceMG6.getTypeface(), typeface2)) {
            arrayList.add(typefaceMG6);
        }
        String strN7 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.EE4);
        Intrinsics.checkNotNullExpressionValue(strN7, "getString(...)");
        TypefaceM typefaceMG7 = g(strN7, "YuanXiangMingTi2.ttc");
        typefaceMG7.setSelect(Intrinsics.areEqual(typefaceMG7.getType(), str));
        if (!Intrinsics.areEqual(typefaceMG7.getTypeface(), typeface2)) {
            arrayList.add(typefaceMG7);
        }
        arrayList.addAll(e(str));
        return arrayList;
    }
}
