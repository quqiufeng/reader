package com.zentraedi.reader.readium;

import fo.k;
import fo.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
@SourceDebugExtension({"SMAP\nEpubDrmChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpubDrmChecker.kt\ncom/zentraedi/reader/readium/EpubDrmChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,104:1\n1#2:105\n1761#3,3:106\n1255#4,2:109\n1855#5,2:111\n*S KotlinDebug\n*F\n+ 1 EpubDrmChecker.kt\ncom/zentraedi/reader/readium/EpubDrmChecker\n*L\n37#1:106,3\n49#1:109,2\n95#1:111,2\n*E\n"})
public final class c {

    @k
    public static final c a = new c();

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(ZipEntry zipEntry) {
        return zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.endsWith(str, ".xhtml", true) || StringsKt.endsWith(str, ".html", true);
    }

    private final boolean g(String str) {
        String string = StringsKt.trim(StringsKt.substringBefore$default(StringsKt.substringAfterLast$default(str, "/", (String) null, 2, (Object) null), ".", (String) null, 2, (Object) null)).toString();
        if (string.length() > 0) {
            for (int i = 0; i < string.length(); i++) {
                if (!Character.isLetterOrDigit(string.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean h(String str) {
        String lowerCase = StringsKt.take(StringsKt.trim(str).toString(), 200).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.startsWith$default(lowerCase, "<", false, 2, (Object) null) && (StringsKt.contains$default(lowerCase, "<html", false, 2, (Object) null) || StringsKt.contains$default(lowerCase, "<xhtml", false, 2, (Object) null) || StringsKt.contains$default(lowerCase, "<body", false, 2, (Object) null));
    }

    private final List<String> i(String str) throws XmlPullParserException, IOException {
        String attributeValue;
        ArrayList arrayList = new ArrayList();
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
            if (eventType == 2 && Intrinsics.areEqual(xmlPullParserNewPullParser.getName(), "CipherReference") && (attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "URI")) != null) {
                arrayList.add(attributeValue);
            }
        }
        return arrayList;
    }

    @k
    public final DrmStatus c(@k File epubFile) throws IOException {
        DrmStatus drmStatus;
        Intrinsics.checkNotNullParameter(epubFile, "epubFile");
        ZipFile zipFile = new ZipFile(epubFile);
        try {
            ZipEntry entry = zipFile.getEntry("META-INF/encryption.xml");
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    List<String> listI = a.i(text);
                    if (!listI.isEmpty()) {
                        List<String> list = listI;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (String str : list) {
                                if (StringsKt.endsWith(str, ".xhtml", true) || StringsKt.endsWith(str, ".html", true) || StringsKt.endsWith(str, ".opf", true)) {
                                    drmStatus = DrmStatus.CONTENT_ENCRYPTED;
                                    CloseableKt.closeFinally(zipFile, null);
                                    return drmStatus;
                                }
                            }
                        }
                        drmStatus = DrmStatus.RESOURCE_ENCRYPTED;
                        CloseableKt.closeFinally(zipFile, null);
                        return drmStatus;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            Intrinsics.checkNotNullExpressionValue(enumerationEntries, "entries(...)");
            for (String str2 : SequencesKt.filter(SequencesKt.map(SequencesKt.asSequence(CollectionsKt.iterator(enumerationEntries)), new Function1() { // from class: com.zentraedi.reader.readium.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.d((ZipEntry) obj);
                }
            }), new Function1() { // from class: com.zentraedi.reader.readium.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(c.e((String) obj));
                }
            })) {
                c cVar = a;
                Intrinsics.checkNotNull(str2);
                if (cVar.g(str2)) {
                    DrmStatus drmStatus2 = DrmStatus.CONTENT_ENCRYPTED;
                    CloseableKt.closeFinally(zipFile, null);
                    return drmStatus2;
                }
            }
            DrmStatus drmStatus3 = DrmStatus.NONE;
            CloseableKt.closeFinally(zipFile, null);
            return drmStatus3;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(zipFile, th4);
                throw th5;
            }
        }
    }

    @l
    public final Object f(@k File file, @k Continuation<? super Boolean> continuation) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("META-INF/encryption.xml");
            if (entry == null) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                CloseableKt.closeFinally(zipFile, null);
                return boolBoxBoolean;
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(StringsKt.contains$default(text, "http://ns.adobe.com/adept", false, 2, (Object) null) || StringsKt.contains$default(text, "license.lcpl", false, 2, (Object) null) || StringsKt.contains$default(text, "EncryptionMethod", false, 2, (Object) null));
                CloseableKt.closeFinally(zipFile, null);
                return boolBoxBoolean2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(zipFile, th4);
                throw th5;
            }
        }
    }
}
