package com.zentraedi.outreader;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.c0;
import androidx.databinding.k;
import androidx.databinding.l;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.outreader.databinding.a1;
import com.zentraedi.outreader.databinding.b0;
import com.zentraedi.outreader.databinding.c1;
import com.zentraedi.outreader.databinding.d0;
import com.zentraedi.outreader.databinding.e1;
import com.zentraedi.outreader.databinding.f;
import com.zentraedi.outreader.databinding.f0;
import com.zentraedi.outreader.databinding.g1;
import com.zentraedi.outreader.databinding.h;
import com.zentraedi.outreader.databinding.h0;
import com.zentraedi.outreader.databinding.i1;
import com.zentraedi.outreader.databinding.j;
import com.zentraedi.outreader.databinding.k0;
import com.zentraedi.outreader.databinding.k1;
import com.zentraedi.outreader.databinding.m0;
import com.zentraedi.outreader.databinding.n;
import com.zentraedi.outreader.databinding.o0;
import com.zentraedi.outreader.databinding.p;
import com.zentraedi.outreader.databinding.q0;
import com.zentraedi.outreader.databinding.r;
import com.zentraedi.outreader.databinding.s0;
import com.zentraedi.outreader.databinding.t;
import com.zentraedi.outreader.databinding.u0;
import com.zentraedi.outreader.databinding.v;
import com.zentraedi.outreader.databinding.w0;
import com.zentraedi.outreader.databinding.x;
import com.zentraedi.outreader.databinding.y0;
import com.zentraedi.outreader.databinding.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class DataBinderMapperImpl extends k {
    private static final int A = 27;
    private static final int B = 28;
    private static final int C = 29;
    private static final int D = 30;
    private static final int E = 31;
    private static final SparseIntArray F;
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;
    private static final int h = 8;
    private static final int i = 9;
    private static final int j = 10;
    private static final int k = 11;
    private static final int l = 12;
    private static final int m = 13;
    private static final int n = 14;
    private static final int o = 15;
    private static final int p = 16;
    private static final int q = 17;
    private static final int r = 18;
    private static final int s = 19;
    private static final int t = 20;
    private static final int u = 21;
    private static final int v = 22;
    private static final int w = 23;
    private static final int x = 24;
    private static final int y = 25;
    private static final int z = 26;

    private static class a {
        static final SparseArray<String> a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(44);
            a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionType");
            sparseArray.put(2, "book");
            sparseArray.put(3, "click");
            sparseArray.put(4, "data");
            sparseArray.put(5, "dialog");
            sparseArray.put(6, "dialogVM");
            sparseArray.put(7, "emptyViewModel");
            sparseArray.put(8, "enable");
            sparseArray.put(9, "errorText");
            sparseArray.put(10, "filePathConvertUtils");
            sparseArray.put(11, "firstItem");
            sparseArray.put(12, "folderVM");
            sparseArray.put(13, "groupVM");
            sparseArray.put(14, "helpClickListener");
            sparseArray.put(15, "isAppRecycler");
            sparseArray.put(16, "isZipPre");
            sparseArray.put(17, "itemVM");
            sparseArray.put(18, "itemVM1");
            sparseArray.put(19, "itemVM2");
            sparseArray.put(20, "itemVM3");
            sparseArray.put(21, "itemVM4");
            sparseArray.put(22, "listener");
            sparseArray.put(23, "logoutClickListener");
            sparseArray.put(24, "mSelectList");
            sparseArray.put(25, "mSelectedPaths");
            sparseArray.put(26, "mViewModel");
            sparseArray.put(27, "model");
            sparseArray.put(28, "newGroup");
            sparseArray.put(29, "oldGroup");
            sparseArray.put(30, "pageVM");
            sparseArray.put(31, "pathItemVM");
            sparseArray.put(32, "pathName");
            sparseArray.put(33, "picPageVM");
            sparseArray.put(34, CommonNetImpl.POSITION);
            sparseArray.put(35, "searchKey");
            sparseArray.put(36, "settingViewModel");
            sparseArray.put(37, "showError");
            sparseArray.put(38, "text");
            sparseArray.put(39, "toolbarViewModel");
            sparseArray.put(40, "viewModel");
            sparseArray.put(41, "viewmodel");
            sparseArray.put(42, "vm");
            sparseArray.put(43, "vmList");
        }

        private a() {
        }
    }

    private static class b {
        static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> map = new HashMap<>(31);
            a = map;
            map.put("layout/activity_new_zreader_0", Integer.valueOf(d.l.o0));
            map.put("layout/activity_out_reader_0", Integer.valueOf(d.l.p0));
            map.put("layout/activity_reader_setting_0", Integer.valueOf(d.l.v0));
            map.put("layout/activity_reader_typeface_0", Integer.valueOf(d.l.w0));
            map.put("layout/category_item_0", Integer.valueOf(d.l.P0));
            map.put("layout/category_item_text_0", Integer.valueOf(d.l.Q0));
            map.put("layout/fragment_book_mark_0", Integer.valueOf(d.l.h5));
            map.put("layout/fragment_category_0", Integer.valueOf(d.l.j5));
            map.put("layout/fragment_epub_reader_0", Integer.valueOf(d.l.I5));
            map.put("layout/fragment_pdf_reader_0", Integer.valueOf(d.l.T5));
            map.put("layout/fragment_reader_menus_0", Integer.valueOf(d.l.Y5));
            map.put("layout/fragment_reader_side_0", Integer.valueOf(d.l.Z5));
            map.put("layout/item_book_mark_0", Integer.valueOf(d.l.L6));
            map.put("layout/item_book_preview_0", Integer.valueOf(d.l.M6));
            map.put("layout/layout_more_margin_0", Integer.valueOf(d.l.Fa));
            map.put("layout/layout_read_page_turn_mode_0", Integer.valueOf(d.l.qb));
            map.put("layout/layout_read_screen_keep_0", Integer.valueOf(d.l.rb));
            map.put("layout/layout_web_content_error_tip_0", Integer.valueOf(d.l.Ob));
            map.put("layout/popup_title_more_layout_0", Integer.valueOf(d.l.Hd));
            map.put("layout/read_slide_layout_0", Integer.valueOf(d.l.ke));
            map.put("layout/reader_error_layout_0", Integer.valueOf(d.l.le));
            map.put("layout/reader_footer_0", Integer.valueOf(d.l.me));
            map.put("layout/reader_footer_menu_0", Integer.valueOf(d.l.ne));
            map.put("layout/reader_footer_menu_auto_page_0", Integer.valueOf(d.l.oe));
            map.put("layout/reader_footer_menu_progress_0", Integer.valueOf(d.l.pe));
            map.put("layout/reader_footer_menu_setting_0", Integer.valueOf(d.l.qe));
            map.put("layout/reader_footer_menu_setting_v2_0", Integer.valueOf(d.l.re));
            map.put("layout/reader_footer_menu_theme_0", Integer.valueOf(d.l.se));
            map.put("layout/reader_footer_menu_v2_0", Integer.valueOf(d.l.te));
            map.put("layout/reader_header_bar_0", Integer.valueOf(d.l.ue));
            map.put("layout/reader_menu_theme_0", Integer.valueOf(d.l.ve));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(31);
        F = sparseIntArray;
        sparseIntArray.put(d.l.o0, 1);
        sparseIntArray.put(d.l.p0, 2);
        sparseIntArray.put(d.l.v0, 3);
        sparseIntArray.put(d.l.w0, 4);
        sparseIntArray.put(d.l.P0, 5);
        sparseIntArray.put(d.l.Q0, 6);
        sparseIntArray.put(d.l.h5, 7);
        sparseIntArray.put(d.l.j5, 8);
        sparseIntArray.put(d.l.I5, 9);
        sparseIntArray.put(d.l.T5, 10);
        sparseIntArray.put(d.l.Y5, 11);
        sparseIntArray.put(d.l.Z5, 12);
        sparseIntArray.put(d.l.L6, 13);
        sparseIntArray.put(d.l.M6, 14);
        sparseIntArray.put(d.l.Fa, 15);
        sparseIntArray.put(d.l.qb, 16);
        sparseIntArray.put(d.l.rb, 17);
        sparseIntArray.put(d.l.Ob, 18);
        sparseIntArray.put(d.l.Hd, 19);
        sparseIntArray.put(d.l.ke, 20);
        sparseIntArray.put(d.l.le, 21);
        sparseIntArray.put(d.l.me, 22);
        sparseIntArray.put(d.l.ne, 23);
        sparseIntArray.put(d.l.oe, 24);
        sparseIntArray.put(d.l.pe, 25);
        sparseIntArray.put(d.l.qe, 26);
        sparseIntArray.put(d.l.re, 27);
        sparseIntArray.put(d.l.se, 28);
        sparseIntArray.put(d.l.te, 29);
        sparseIntArray.put(d.l.ue, 30);
        sparseIntArray.put(d.l.ve, 31);
    }

    public List<k> a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.basic.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.business.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.reader.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int localId) {
        return a.a.get(localId);
    }

    public c0 c(l component, View view, int layoutId) {
        int i2 = F.get(layoutId);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_new_zreader_0".equals(tag)) {
                    return new com.zentraedi.outreader.databinding.b(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_zreader is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_out_reader_0".equals(tag)) {
                    return new com.zentraedi.outreader.databinding.d(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_out_reader is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_reader_setting_0".equals(tag)) {
                    return new f(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_reader_setting is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_reader_typeface_0".equals(tag)) {
                    return new h(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_reader_typeface is invalid. Received: " + tag);
            case 5:
                if ("layout/category_item_0".equals(tag)) {
                    return new j(component, view);
                }
                throw new IllegalArgumentException("The tag for category_item is invalid. Received: " + tag);
            case 6:
                if ("layout/category_item_text_0".equals(tag)) {
                    return new com.zentraedi.outreader.databinding.l(component, view);
                }
                throw new IllegalArgumentException("The tag for category_item_text is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_book_mark_0".equals(tag)) {
                    return new n(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_book_mark is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_category_0".equals(tag)) {
                    return new p(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_epub_reader_0".equals(tag)) {
                    return new r(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_epub_reader is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_pdf_reader_0".equals(tag)) {
                    return new t(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pdf_reader is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_reader_menus_0".equals(tag)) {
                    return new v(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_reader_menus is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_reader_side_0".equals(tag)) {
                    return new x(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_reader_side is invalid. Received: " + tag);
            case 13:
                if ("layout/item_book_mark_0".equals(tag)) {
                    return new z(component, view);
                }
                throw new IllegalArgumentException("The tag for item_book_mark is invalid. Received: " + tag);
            case 14:
                if ("layout/item_book_preview_0".equals(tag)) {
                    return new b0(component, view);
                }
                throw new IllegalArgumentException("The tag for item_book_preview is invalid. Received: " + tag);
            case 15:
                if ("layout/layout_more_margin_0".equals(tag)) {
                    return new d0(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_more_margin is invalid. Received: " + tag);
            case 16:
                if ("layout/layout_read_page_turn_mode_0".equals(tag)) {
                    return new f0(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_read_page_turn_mode is invalid. Received: " + tag);
            case 17:
                if ("layout/layout_read_screen_keep_0".equals(tag)) {
                    return new h0(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_read_screen_keep is invalid. Received: " + tag);
            case 18:
                if ("layout/layout_web_content_error_tip_0".equals(tag)) {
                    return new k0(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_web_content_error_tip is invalid. Received: " + tag);
            case 19:
                if ("layout/popup_title_more_layout_0".equals(tag)) {
                    return new m0(component, view);
                }
                throw new IllegalArgumentException("The tag for popup_title_more_layout is invalid. Received: " + tag);
            case 20:
                if ("layout/read_slide_layout_0".equals(tag)) {
                    return new o0(component, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for read_slide_layout is invalid. Received: " + tag);
            case 21:
                if ("layout/reader_error_layout_0".equals(tag)) {
                    return new q0(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_error_layout is invalid. Received: " + tag);
            case 22:
                if ("layout/reader_footer_0".equals(tag)) {
                    return new s0(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer is invalid. Received: " + tag);
            case 23:
                if ("layout/reader_footer_menu_0".equals(tag)) {
                    return new w0(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu is invalid. Received: " + tag);
            case 24:
                if ("layout/reader_footer_menu_auto_page_0".equals(tag)) {
                    return new u0(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_auto_page is invalid. Received: " + tag);
            case 25:
                if ("layout/reader_footer_menu_progress_0".equals(tag)) {
                    return new y0(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_progress is invalid. Received: " + tag);
            case 26:
                if ("layout/reader_footer_menu_setting_0".equals(tag)) {
                    return new a1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_setting is invalid. Received: " + tag);
            case 27:
                if ("layout/reader_footer_menu_setting_v2_0".equals(tag)) {
                    return new c1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_setting_v2 is invalid. Received: " + tag);
            case 28:
                if ("layout/reader_footer_menu_theme_0".equals(tag)) {
                    return new e1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_theme is invalid. Received: " + tag);
            case 29:
                if ("layout/reader_footer_menu_v2_0".equals(tag)) {
                    return new g1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_footer_menu_v2 is invalid. Received: " + tag);
            case 30:
                if ("layout/reader_header_bar_0".equals(tag)) {
                    return new i1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_header_bar is invalid. Received: " + tag);
            case 31:
                if ("layout/reader_menu_theme_0".equals(tag)) {
                    return new k1(component, view);
                }
                throw new IllegalArgumentException("The tag for reader_menu_theme is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    public c0 d(l component, View[] views, int layoutId) {
        int i2;
        if (views != null && views.length != 0 && (i2 = F.get(layoutId)) > 0) {
            Object tag = views[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 20) {
                if ("layout/read_slide_layout_0".equals(tag)) {
                    return new o0(component, views);
                }
                throw new IllegalArgumentException("The tag for read_slide_layout is invalid. Received: " + tag);
            }
        }
        return null;
    }

    public int e(String tag) {
        Integer num;
        if (tag == null || (num = b.a.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
