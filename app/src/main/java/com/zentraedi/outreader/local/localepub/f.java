package com.zentraedi.outreader.local.localepub;

import android.text.TextUtils;
import com.zentraedi.basic.function.utils.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class f {
    private static List<String> a(Element element, String thirdNode, String attributesName) {
        if (!TextUtils.equals(element.getName(), thirdNode)) {
            return null;
        }
        List<Attribute> listAttributes = element.attributes();
        if (j0.l(listAttributes)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attribute attribute : listAttributes) {
            if (attribute.getName().equals(attributesName)) {
                arrayList.add(attribute.getValue());
            }
        }
        return arrayList;
    }

    private static List<String> b(Element element, String secondNode, String thirdNode, String attributesName) {
        if (element == null) {
            return null;
        }
        List<Element> listElements = element.elements();
        if (j0.l(listElements)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Element element2 : listElements) {
            if (TextUtils.equals(element2.getName(), secondNode)) {
                List<Element> listElements2 = element2.elements();
                if (!j0.l(listElements2)) {
                    for (Element element3 : listElements2) {
                        if (TextUtils.equals(element3.getName(), secondNode)) {
                            List<String> listB = b(element3, secondNode, thirdNode, attributesName);
                            if (!j0.l(listB)) {
                                arrayList.addAll(listB);
                            }
                        } else {
                            List<String> listA = a(element3, thirdNode, attributesName);
                            if (!j0.l(listA)) {
                                arrayList.addAll(listA);
                            }
                        }
                    }
                }
            } else {
                List<String> listA2 = a(element2, thirdNode, attributesName);
                if (!j0.l(listA2)) {
                    arrayList.addAll(listA2);
                }
            }
        }
        return arrayList;
    }

    private static String c(String xmlPath, String fatherNode, String subtagName, String subtagAttributesName, String subtagAttributesValue, String conditionName) throws DocumentException {
        Iterator itElementIterator;
        boolean zIsEmpty = TextUtils.isEmpty(subtagName);
        if (TextUtils.isEmpty(xmlPath) || TextUtils.isEmpty(fatherNode)) {
            return null;
        }
        if ((!TextUtils.isEmpty(subtagAttributesName) || !zIsEmpty) && (itElementIterator = new SAXReader().read(new File(xmlPath)).getRootElement().element(fatherNode).elementIterator()) != null) {
            while (itElementIterator.hasNext()) {
                Element element = (Element) itElementIterator.next();
                List<Attribute> listAttributes = element.attributes();
                if (zIsEmpty) {
                    for (Attribute attribute : listAttributes) {
                        if (attribute.getName().equals(subtagAttributesName) && attribute.getValue().equals(subtagAttributesValue)) {
                            for (Attribute attribute2 : listAttributes) {
                                if (attribute2.getName().equals(conditionName)) {
                                    return attribute2.getValue();
                                }
                            }
                        }
                    }
                } else if (subtagName.equals(element.getName())) {
                    if (subtagAttributesName == null) {
                        return element.getStringValue();
                    }
                    for (Attribute attribute3 : listAttributes) {
                        if (attribute3.getName().equals(subtagAttributesName)) {
                            return attribute3.getValue();
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static String d(String xmlPath, String fatherNode, String attributesName) throws DocumentException {
        Element element;
        if (TextUtils.isEmpty(xmlPath) || TextUtils.isEmpty(fatherNode) || TextUtils.isEmpty(attributesName) || (element = new SAXReader().read(new File(xmlPath)).getRootElement().element(fatherNode)) == null) {
            return null;
        }
        List<Attribute> listAttributes = element.attributes();
        if (j0.l(listAttributes)) {
            return null;
        }
        for (Attribute attribute : listAttributes) {
            if (attribute.getName().equals(attributesName)) {
                return attribute.getValue();
            }
        }
        return null;
    }

    public static List<String> e(String xmlPath, String fatherNode, String secondNode, String thirdNode, String attributesName) throws DocumentException {
        if (TextUtils.isEmpty(xmlPath) || TextUtils.isEmpty(fatherNode) || TextUtils.isEmpty(secondNode) || TextUtils.isEmpty(thirdNode) || TextUtils.isEmpty(attributesName)) {
            return null;
        }
        return b(new SAXReader().read(new File(xmlPath)).getRootElement().element(fatherNode), secondNode, thirdNode, attributesName);
    }

    public static String f(String xmlPath, String fatherNode, String subtagAttributesName, String subtagAttributesValue, String conditionName) throws DocumentException {
        return c(xmlPath, fatherNode, null, subtagAttributesName, subtagAttributesValue, conditionName);
    }

    public static String g(String xmlPath, String fatherNode, String subtagName, String subtagAttributesName) throws DocumentException {
        return c(xmlPath, fatherNode, subtagName, subtagAttributesName, null, null);
    }
}
