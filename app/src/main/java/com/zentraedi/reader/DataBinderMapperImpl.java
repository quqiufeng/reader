package com.zentraedi.reader;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.c0;
import androidx.databinding.k;
import androidx.databinding.l;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class DataBinderMapperImpl extends k {
    private static final int a = 1;
    private static final SparseIntArray b;

    private static class a {
        static final SparseArray<String> a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(42);
            a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionType");
            sparseArray.put(2, "click");
            sparseArray.put(3, "data");
            sparseArray.put(4, "dialog");
            sparseArray.put(5, "dialogVM");
            sparseArray.put(6, "emptyViewModel");
            sparseArray.put(7, "enable");
            sparseArray.put(8, "errorText");
            sparseArray.put(9, "filePathConvertUtils");
            sparseArray.put(10, "firstItem");
            sparseArray.put(11, "folderVM");
            sparseArray.put(12, "groupVM");
            sparseArray.put(13, "helpClickListener");
            sparseArray.put(14, "isAppRecycler");
            sparseArray.put(15, "isZipPre");
            sparseArray.put(16, "itemVM");
            sparseArray.put(17, "itemVM1");
            sparseArray.put(18, "itemVM2");
            sparseArray.put(19, "itemVM3");
            sparseArray.put(20, "itemVM4");
            sparseArray.put(21, "listener");
            sparseArray.put(22, "logoutClickListener");
            sparseArray.put(23, "mSelectList");
            sparseArray.put(24, "mSelectedPaths");
            sparseArray.put(25, "mViewModel");
            sparseArray.put(26, "model");
            sparseArray.put(27, "newGroup");
            sparseArray.put(28, "oldGroup");
            sparseArray.put(29, "pageVM");
            sparseArray.put(30, "pathItemVM");
            sparseArray.put(31, "pathName");
            sparseArray.put(32, "picPageVM");
            sparseArray.put(33, CommonNetImpl.POSITION);
            sparseArray.put(34, "searchKey");
            sparseArray.put(35, "showError");
            sparseArray.put(36, "text");
            sparseArray.put(37, "toolbarViewModel");
            sparseArray.put(38, "viewModel");
            sparseArray.put(39, "viewmodel");
            sparseArray.put(40, "vm");
            sparseArray.put(41, "vmList");
        }

        private a() {
        }
    }

    private static class b {
        static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            a = map;
            map.put("layout/fragment_pdf_scroll_0", Integer.valueOf(h.l.h4));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        b = sparseIntArray;
        sparseIntArray.put(h.l.h4, 1);
    }

    public List<k> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.basic.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.business.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int i) {
        return a.a.get(i);
    }

    public c0 c(l lVar, View view, int i) {
        int i2 = b.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/fragment_pdf_scroll_0".equals(tag)) {
            return new com.zentraedi.reader.databinding.b(lVar, view);
        }
        throw new IllegalArgumentException("The tag for fragment_pdf_scroll is invalid. Received: " + tag);
    }

    public c0 d(l lVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || b.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int e(String str) {
        Integer num;
        if (str == null || (num = b.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
