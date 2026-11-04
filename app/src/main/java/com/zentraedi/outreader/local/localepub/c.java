package com.zentraedi.outreader.local.localepub;

import android.text.TextUtils;
import com.zentraedi.business.utils.l5;
import fo.k;
import fo.l;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nEpubXmlUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpubXmlUtil.kt\ncom/zentraedi/outreader/local/localepub/EpubXmlUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class c {

    @k
    public static final c a = new c();

    @l
    private static String b;

    private c() {
    }

    private final List<String> a(Element element) {
        Attribute attribute;
        String value;
        String str;
        ArrayList arrayList = new ArrayList();
        Element element2 = element.element("content");
        if (element2 != null && (attribute = element2.attribute("src")) != null && (value = attribute.getValue()) != null && (!StringsKt.endsWith$default(value, ".html", false, 2, (Object) null) || (str = b) == null || !StringsKt.startsWith$default(str, value, false, 2, (Object) null))) {
            arrayList.add(value);
            b = value;
        }
        Iterator itElementIterator = element.elementIterator("navPoint");
        if (itElementIterator != null) {
            while (itElementIterator.hasNext()) {
                Object next = itElementIterator.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type org.dom4j.Element");
                arrayList.addAll(a((Element) next));
            }
        }
        return arrayList;
    }

    private final void c(Element element, List<String> list) {
        Attribute attribute;
        String value;
        String str;
        Element element2 = element.element("content");
        if (element2 != null && (attribute = element2.attribute("src")) != null && (value = attribute.getValue()) != null) {
            if (StringsKt.endsWith$default(value, ".html", false, 2, (Object) null) && (str = b) != null && StringsKt.startsWith$default(str, value, false, 2, (Object) null)) {
                value = String.valueOf(b);
            }
            b = value;
            String strD = e.a.d(value);
            if (CollectionsKt.contains(list, strD)) {
                element2.attribute("src").setValue(strD);
            }
        }
        Iterator itElementIterator = element.elementIterator("navPoint");
        if (itElementIterator != null) {
            while (itElementIterator.hasNext()) {
                Object next = itElementIterator.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type org.dom4j.Element");
                c((Element) next, list);
            }
        }
    }

    @k
    public final List<String> b(@k File ncxFile) {
        Element element;
        Intrinsics.checkNotNullParameter(ncxFile, "ncxFile");
        ArrayList arrayList = new ArrayList();
        try {
            Document document = new SAXReader().read(ncxFile);
            Intrinsics.checkNotNullExpressionValue(document, "read(...)");
            b = null;
            Element rootElement = document.getRootElement();
            if (rootElement != null && (element = rootElement.element("navMap")) != null) {
                arrayList.addAll(a.a(element));
                return arrayList;
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public final boolean d(@k File ncxFile, @k List<String> nameList) {
        Element element;
        Intrinsics.checkNotNullParameter(ncxFile, "ncxFile");
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        try {
            Document document = new SAXReader().read(ncxFile);
            Intrinsics.checkNotNullExpressionValue(document, "read(...)");
            b = null;
            Element rootElement = document.getRootElement();
            if (rootElement != null && (element = rootElement.element("navMap")) != null) {
                a.c(element, nameList);
            }
            XMLWriter xMLWriter = new XMLWriter(new FileWriter(ncxFile));
            xMLWriter.write(document);
            xMLWriter.close();
            return true;
        } catch (DocumentException e) {
            e.printStackTrace();
            nd.a.c(gh.b.b, "rewriteNavPointList exception: " + e.getLocalizedMessage());
            return false;
        }
    }

    public final boolean e(@k File opfFile, @k List<String> nameList) {
        Intrinsics.checkNotNullParameter(opfFile, "opfFile");
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        try {
            Document document = new SAXReader().read(opfFile);
            Intrinsics.checkNotNullExpressionValue(document, "read(...)");
            Element element = document.getRootElement().element("manifest");
            Element element2 = document.getRootElement().element("spine");
            Iterator itElementIterator = element2.elementIterator("itemref");
            while (itElementIterator.hasNext()) {
                Object next = itElementIterator.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type org.dom4j.Element");
                ((Element) next).detach();
            }
            Iterator itElementIterator2 = element.elementIterator("item");
            while (itElementIterator2.hasNext()) {
                Object next2 = itElementIterator2.next();
                Intrinsics.checkNotNull(next2, "null cannot be cast to non-null type org.dom4j.Element");
                Element element3 = (Element) next2;
                String value = element3.attribute("href").getValue();
                if (TextUtils.equals(element3.attribute("media-type").getValue(), "application/xhtml+xml")) {
                    Intrinsics.checkNotNull(value);
                    if (StringsKt.endsWith$default(value, ".html", false, 2, (Object) null)) {
                        element3.detach();
                    }
                }
            }
            for (String str : nameList) {
                String strY = l5.y(str);
                Element elementAddElement = element.addElement("item");
                elementAddElement.addAttribute("id", strY);
                elementAddElement.addAttribute("href", str);
                elementAddElement.addAttribute("media-type", "application/xhtml+xml");
                element2.addElement("itemref").addAttribute("idref", strY);
            }
            XMLWriter xMLWriter = new XMLWriter(new FileWriter(opfFile));
            xMLWriter.write(document);
            xMLWriter.close();
            return true;
        } catch (DocumentException e) {
            e.printStackTrace();
            nd.a.c(gh.b.b, "rewriteNavPointList exception: " + e.getLocalizedMessage());
            return false;
        }
    }
}
