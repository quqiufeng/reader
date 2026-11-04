package com.zentraedi.comic;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.c0;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.comic.databinding.a4;
import com.zentraedi.comic.databinding.a5;
import com.zentraedi.comic.databinding.b1;
import com.zentraedi.comic.databinding.b2;
import com.zentraedi.comic.databinding.b3;
import com.zentraedi.comic.databinding.c4;
import com.zentraedi.comic.databinding.c5;
import com.zentraedi.comic.databinding.d0;
import com.zentraedi.comic.databinding.d1;
import com.zentraedi.comic.databinding.d2;
import com.zentraedi.comic.databinding.d3;
import com.zentraedi.comic.databinding.e4;
import com.zentraedi.comic.databinding.e5;
import com.zentraedi.comic.databinding.f1;
import com.zentraedi.comic.databinding.f3;
import com.zentraedi.comic.databinding.g0;
import com.zentraedi.comic.databinding.g2;
import com.zentraedi.comic.databinding.g4;
import com.zentraedi.comic.databinding.g5;
import com.zentraedi.comic.databinding.h0;
import com.zentraedi.comic.databinding.h1;
import com.zentraedi.comic.databinding.h3;
import com.zentraedi.comic.databinding.i4;
import com.zentraedi.comic.databinding.j0;
import com.zentraedi.comic.databinding.j1;
import com.zentraedi.comic.databinding.j2;
import com.zentraedi.comic.databinding.j3;
import com.zentraedi.comic.databinding.k0;
import com.zentraedi.comic.databinding.k4;
import com.zentraedi.comic.databinding.l1;
import com.zentraedi.comic.databinding.l2;
import com.zentraedi.comic.databinding.l3;
import com.zentraedi.comic.databinding.m0;
import com.zentraedi.comic.databinding.m4;
import com.zentraedi.comic.databinding.n1;
import com.zentraedi.comic.databinding.n2;
import com.zentraedi.comic.databinding.n3;
import com.zentraedi.comic.databinding.o0;
import com.zentraedi.comic.databinding.o4;
import com.zentraedi.comic.databinding.p1;
import com.zentraedi.comic.databinding.p2;
import com.zentraedi.comic.databinding.p3;
import com.zentraedi.comic.databinding.q0;
import com.zentraedi.comic.databinding.q4;
import com.zentraedi.comic.databinding.r1;
import com.zentraedi.comic.databinding.r2;
import com.zentraedi.comic.databinding.r3;
import com.zentraedi.comic.databinding.s0;
import com.zentraedi.comic.databinding.s4;
import com.zentraedi.comic.databinding.t1;
import com.zentraedi.comic.databinding.t2;
import com.zentraedi.comic.databinding.t3;
import com.zentraedi.comic.databinding.u0;
import com.zentraedi.comic.databinding.u4;
import com.zentraedi.comic.databinding.v1;
import com.zentraedi.comic.databinding.v2;
import com.zentraedi.comic.databinding.w4;
import com.zentraedi.comic.databinding.x0;
import com.zentraedi.comic.databinding.x1;
import com.zentraedi.comic.databinding.x2;
import com.zentraedi.comic.databinding.y3;
import com.zentraedi.comic.databinding.y4;
import com.zentraedi.comic.databinding.z0;
import com.zentraedi.comic.databinding.z1;
import com.zentraedi.comic.databinding.z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class DataBinderMapperImpl extends androidx.databinding.k {
    private static final int A = 27;
    private static final int B = 28;
    private static final int C = 29;
    private static final int D = 30;
    private static final int E = 31;
    private static final int F = 32;
    private static final int G = 33;
    private static final int H = 34;
    private static final int I = 35;
    private static final int J = 36;
    private static final int K = 37;
    private static final int L = 38;
    private static final int M = 39;
    private static final int N = 40;
    private static final int O = 41;
    private static final int P = 42;
    private static final int Q = 43;
    private static final int R = 44;
    private static final int S = 45;
    private static final int T = 46;
    private static final int U = 47;
    private static final int V = 48;
    private static final int W = 49;
    private static final int X = 50;
    private static final int Y = 51;
    private static final int Z = 52;
    private static final int a = 1;
    private static final int a0 = 53;
    private static final int b = 2;
    private static final int b0 = 54;
    private static final int c = 3;
    private static final int c0 = 55;
    private static final int d = 4;
    private static final int d0 = 56;
    private static final int e = 5;
    private static final int e0 = 57;
    private static final int f = 6;
    private static final int f0 = 58;
    private static final int g = 7;
    private static final int g0 = 59;
    private static final int h = 8;
    private static final int h0 = 60;
    private static final int i = 9;
    private static final int i0 = 61;
    private static final int j = 10;
    private static final int j0 = 62;
    private static final int k = 11;
    private static final int k0 = 63;
    private static final int l = 12;
    private static final int l0 = 64;
    private static final int m = 13;
    private static final int m0 = 65;
    private static final int n = 14;
    private static final int n0 = 66;
    private static final int o = 15;
    private static final int o0 = 67;
    private static final int p = 16;
    private static final int p0 = 68;
    private static final int q = 17;
    private static final int q0 = 69;
    private static final int r = 18;
    private static final int r0 = 70;
    private static final int s = 19;
    private static final int s0 = 71;
    private static final int t = 20;
    private static final int t0 = 72;
    private static final int u = 21;
    private static final int u0 = 73;
    private static final int v = 22;
    private static final int v0 = 74;
    private static final int w = 23;
    private static final int w0 = 75;
    private static final int x = 24;
    private static final int x0 = 76;
    private static final int y = 25;
    private static final SparseIntArray y0;
    private static final int z = 26;

    private static class a {
        static final SparseArray<String> a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(64);
            a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionType");
            sparseArray.put(2, "book");
            sparseArray.put(3, "click");
            sparseArray.put(4, "clickListener");
            sparseArray.put(5, "comicCodeBookOperate");
            sparseArray.put(6, "data");
            sparseArray.put(7, "dialog");
            sparseArray.put(8, "dialogVM");
            sparseArray.put(9, "emptyViewModel");
            sparseArray.put(10, "enable");
            sparseArray.put(11, "errorText");
            sparseArray.put(12, "filePathConvertUtils");
            sparseArray.put(13, "firstItem");
            sparseArray.put(14, "folderVM");
            sparseArray.put(15, "groupVM");
            sparseArray.put(16, "headVM");
            sparseArray.put(17, "helpClickListener");
            sparseArray.put(18, "isAppRecycler");
            sparseArray.put(19, "isCategoryDetail");
            sparseArray.put(20, "isSelect");
            sparseArray.put(21, "isZipPre");
            sparseArray.put(22, "itemModel");
            sparseArray.put(23, "itemVM");
            sparseArray.put(24, "itemVM1");
            sparseArray.put(25, "itemVM2");
            sparseArray.put(26, "itemVM3");
            sparseArray.put(27, "itemVM4");
            sparseArray.put(28, "layout");
            sparseArray.put(29, "listener");
            sparseArray.put(30, "logoutClickListener");
            sparseArray.put(31, "mSelectList");
            sparseArray.put(32, "mSelectedPaths");
            sparseArray.put(33, "mViewModel");
            sparseArray.put(34, "menu");
            sparseArray.put(35, "menuViewModel");
            sparseArray.put(36, "model");
            sparseArray.put(37, "moreListener");
            sparseArray.put(38, "newGroup");
            sparseArray.put(39, "oldGroup");
            sparseArray.put(40, "order");
            sparseArray.put(41, "pageVM");
            sparseArray.put(42, "pathItemVM");
            sparseArray.put(43, "pathName");
            sparseArray.put(44, "picPageVM");
            sparseArray.put(45, CommonNetImpl.POSITION);
            sparseArray.put(46, "readModel");
            sparseArray.put(47, "readSetViewModel");
            sparseArray.put(48, "readSettingBottomViewModel");
            sparseArray.put(49, "screenOrganize");
            sparseArray.put(50, "searchKey");
            sparseArray.put(51, "settingViewModel");
            sparseArray.put(52, "showError");
            sparseArray.put(53, "sortBy");
            sparseArray.put(54, "sortViewModel");
            sparseArray.put(55, "tabVM");
            sparseArray.put(56, "text");
            sparseArray.put(57, "toolbarViewModel");
            sparseArray.put(58, "viewModel");
            sparseArray.put(59, "viewModelReadSetting");
            sparseArray.put(60, "viewmodel");
            sparseArray.put(61, "vm");
            sparseArray.put(62, "vmList");
            sparseArray.put(63, "zoomType");
        }

        private a() {
        }
    }

    private static class b {
        static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> map = new HashMap<>(78);
            a = map;
            map.put("layout/activity_comic_category_content_management_0", Integer.valueOf(q.l.I));
            map.put("layout/activity_comic_category_management_0", Integer.valueOf(q.l.J));
            map.put("layout/activity_comic_code_book_management_0", Integer.valueOf(q.l.K));
            map.put("layout/activity_comic_compression_browser_0", Integer.valueOf(q.l.L));
            map.put("layout/activity_comic_content_management_0", Integer.valueOf(q.l.M));
            map.put("layout/activity_comic_list_detail_0", Integer.valueOf(q.l.N));
            map.put("layout/activity_comic_main_0", Integer.valueOf(q.l.O));
            map.put("layout/activity_comic_reader_0", Integer.valueOf(q.l.P));
            map.put("layout/activity_comic_search_0", Integer.valueOf(q.l.Q));
            map.put("layout/activity_comic_search_detail_0", Integer.valueOf(q.l.R));
            map.put("layout/activity_comic_sub_dir_0", Integer.valueOf(q.l.T));
            map.put("layout/activity_offline_comic_detail_0", Integer.valueOf(q.l.C0));
            map.put("layout/activity_offline_comic_main_0", Integer.valueOf(q.l.D0));
            map.put("layout/activity_read_setting_0", Integer.valueOf(q.l.J0));
            map.put("layout/dialog_bottom_aoto_seting_0", Integer.valueOf(q.l.N2));
            map.put("layout-land/dialog_bottom_aoto_seting_0", Integer.valueOf(q.l.N2));
            map.put("layout/dialog_bottom_filter_setting_0", Integer.valueOf(q.l.O2));
            map.put("layout-land/dialog_bottom_filter_setting_0", Integer.valueOf(q.l.O2));
            map.put("layout/dialog_bottom_seting_0", Integer.valueOf(q.l.P2));
            map.put("layout/dialog_comic_code_book_0", Integer.valueOf(q.l.S2));
            map.put("layout/dialog_comic_cover_help_0", Integer.valueOf(q.l.T2));
            map.put("layout/dialog_comic_house_more_option_0", Integer.valueOf(q.l.U2));
            map.put("layout/dialog_comic_sort_0", Integer.valueOf(q.l.V2));
            map.put("layout/dialog_create_comic_code_0", Integer.valueOf(q.l.z3));
            map.put("layout/dialog_edit_comic_0", Integer.valueOf(q.l.O3));
            map.put("layout/dialog_read_clip_0", Integer.valueOf(q.l.N4));
            map.put("layout/dialog_read_orientation_0", Integer.valueOf(q.l.O4));
            map.put("layout/dialog_read_page_add_tag_0", Integer.valueOf(q.l.P4));
            map.put("layout/dialog_read_page_set_0", Integer.valueOf(q.l.Q4));
            map.put("layout/dialog_read_screen_orientation_0", Integer.valueOf(q.l.R4));
            map.put("layout/dialog_read_zoom_0", Integer.valueOf(q.l.S4));
            map.put("layout/drawer_comic_chapter_0", Integer.valueOf(q.l.E5));
            map.put("layout/fragment_comic_content_management_0", Integer.valueOf(q.l.T5));
            map.put("layout/fragment_comic_home_0", Integer.valueOf(q.l.U5));
            map.put("layout/fragment_comic_house_list_0", Integer.valueOf(q.l.V5));
            map.put("layout/fragment_comic_list_detail_0", Integer.valueOf(q.l.W5));
            map.put("layout/fragment_comic_read_set_0", Integer.valueOf(q.l.X5));
            map.put("layout/fragment_comic_search_0", Integer.valueOf(q.l.Y5));
            map.put("layout/fragment_commic_house_0", Integer.valueOf(q.l.Z5));
            map.put("layout/fragment_wrap_comic_list_0", Integer.valueOf(q.l.l7));
            map.put("layout/item_comic_category_0", Integer.valueOf(q.l.G7));
            map.put("layout/item_comic_code_book_0", Integer.valueOf(q.l.I7));
            map.put("layout/item_comic_content_manage_file_0", Integer.valueOf(q.l.J7));
            map.put("layout/item_comic_content_manage_folder_0", Integer.valueOf(q.l.K7));
            map.put("layout/item_comic_content_manage_title_0", Integer.valueOf(q.l.L7));
            map.put("layout/item_comic_dir_grid_0", Integer.valueOf(q.l.M7));
            map.put("layout/item_comic_dir_linear_0", Integer.valueOf(q.l.N7));
            map.put("layout/item_comic_empty_0", Integer.valueOf(q.l.O7));
            map.put("layout/item_comic_home_title_0", Integer.valueOf(q.l.P7));
            map.put("layout/item_comic_image_0", Integer.valueOf(q.l.Q7));
            map.put("layout/item_comic_image_subsampling_0", Integer.valueOf(q.l.R7));
            map.put("layout/item_comic_menu_image_0", Integer.valueOf(q.l.S7));
            map.put("layout/item_comic_net_error_0", Integer.valueOf(q.l.T7));
            map.put("layout/item_comic_pdf_0", Integer.valueOf(q.l.U7));
            map.put("layout/item_comic_search_empty_0", Integer.valueOf(q.l.V7));
            map.put("layout/item_comic_search_history_0", Integer.valueOf(q.l.W7));
            map.put("layout/item_comic_thumb_0", Integer.valueOf(q.l.X7));
            map.put("layout/item_comic_thumb_list_0", Integer.valueOf(q.l.Y7));
            map.put("layout/item_comic_thumb_search_0", Integer.valueOf(q.l.Z7));
            map.put("layout/item_dialog_comic_code_book_0", Integer.valueOf(q.l.p8));
            map.put("layout/item_read_setting_0", Integer.valueOf(q.l.r9));
            map.put("layout/layout_comic_bottom_menu_0", Integer.valueOf(q.l.S9));
            map.put("layout/layout_comic_bottom_menu_land_0", Integer.valueOf(q.l.T9));
            map.put("layout/layout_comic_code_book_empty_0", Integer.valueOf(q.l.U9));
            map.put("layout/layout_comic_edit_navigation_bar_0", Integer.valueOf(q.l.V9));
            map.put("layout/layout_comic_guide_0", Integer.valueOf(q.l.W9));
            map.put("layout/layout_comic_guide_land_0", Integer.valueOf(q.l.X9));
            map.put("layout/layout_comic_guide_mange_0", Integer.valueOf(q.l.Y9));
            map.put("layout/layout_comic_home_empty_0", Integer.valueOf(q.l.Z9));
            map.put("layout/layout_comic_house_sort_0", Integer.valueOf(q.l.aa));
            map.put("layout/layout_comic_list_edit_tab_bar_0", Integer.valueOf(q.l.ba));
            map.put("layout/layout_comic_list_empty_0", Integer.valueOf(q.l.ca));
            map.put("layout/layout_comic_list_head_0", Integer.valueOf(q.l.da));
            map.put("layout/layout_comic_loading_0", Integer.valueOf(q.l.ea));
            map.put("layout/layout_comic_nav_bar_0", Integer.valueOf(q.l.fa));
            map.put("layout/layout_comic_nav_menu_0", Integer.valueOf(q.l.ga));
            map.put("layout/layout_comic_navigation_bar_0", Integer.valueOf(q.l.ha));
            map.put("layout/layout_comic_read_progress_0", Integer.valueOf(q.l.ia));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(76);
        y0 = sparseIntArray;
        sparseIntArray.put(q.l.I, 1);
        sparseIntArray.put(q.l.J, 2);
        sparseIntArray.put(q.l.K, 3);
        sparseIntArray.put(q.l.L, 4);
        sparseIntArray.put(q.l.M, 5);
        sparseIntArray.put(q.l.N, 6);
        sparseIntArray.put(q.l.O, 7);
        sparseIntArray.put(q.l.P, 8);
        sparseIntArray.put(q.l.Q, 9);
        sparseIntArray.put(q.l.R, 10);
        sparseIntArray.put(q.l.T, 11);
        sparseIntArray.put(q.l.C0, 12);
        sparseIntArray.put(q.l.D0, 13);
        sparseIntArray.put(q.l.J0, 14);
        sparseIntArray.put(q.l.N2, 15);
        sparseIntArray.put(q.l.O2, 16);
        sparseIntArray.put(q.l.P2, 17);
        sparseIntArray.put(q.l.S2, 18);
        sparseIntArray.put(q.l.T2, 19);
        sparseIntArray.put(q.l.U2, 20);
        sparseIntArray.put(q.l.V2, 21);
        sparseIntArray.put(q.l.z3, 22);
        sparseIntArray.put(q.l.O3, 23);
        sparseIntArray.put(q.l.N4, 24);
        sparseIntArray.put(q.l.O4, 25);
        sparseIntArray.put(q.l.P4, 26);
        sparseIntArray.put(q.l.Q4, 27);
        sparseIntArray.put(q.l.R4, 28);
        sparseIntArray.put(q.l.S4, 29);
        sparseIntArray.put(q.l.E5, 30);
        sparseIntArray.put(q.l.T5, 31);
        sparseIntArray.put(q.l.U5, 32);
        sparseIntArray.put(q.l.V5, 33);
        sparseIntArray.put(q.l.W5, 34);
        sparseIntArray.put(q.l.X5, 35);
        sparseIntArray.put(q.l.Y5, 36);
        sparseIntArray.put(q.l.Z5, 37);
        sparseIntArray.put(q.l.l7, 38);
        sparseIntArray.put(q.l.G7, 39);
        sparseIntArray.put(q.l.I7, 40);
        sparseIntArray.put(q.l.J7, 41);
        sparseIntArray.put(q.l.K7, 42);
        sparseIntArray.put(q.l.L7, 43);
        sparseIntArray.put(q.l.M7, 44);
        sparseIntArray.put(q.l.N7, 45);
        sparseIntArray.put(q.l.O7, 46);
        sparseIntArray.put(q.l.P7, 47);
        sparseIntArray.put(q.l.Q7, 48);
        sparseIntArray.put(q.l.R7, 49);
        sparseIntArray.put(q.l.S7, 50);
        sparseIntArray.put(q.l.T7, 51);
        sparseIntArray.put(q.l.U7, 52);
        sparseIntArray.put(q.l.V7, 53);
        sparseIntArray.put(q.l.W7, 54);
        sparseIntArray.put(q.l.X7, 55);
        sparseIntArray.put(q.l.Y7, 56);
        sparseIntArray.put(q.l.Z7, 57);
        sparseIntArray.put(q.l.p8, 58);
        sparseIntArray.put(q.l.r9, 59);
        sparseIntArray.put(q.l.S9, 60);
        sparseIntArray.put(q.l.T9, 61);
        sparseIntArray.put(q.l.U9, 62);
        sparseIntArray.put(q.l.V9, 63);
        sparseIntArray.put(q.l.W9, 64);
        sparseIntArray.put(q.l.X9, 65);
        sparseIntArray.put(q.l.Y9, 66);
        sparseIntArray.put(q.l.Z9, 67);
        sparseIntArray.put(q.l.aa, 68);
        sparseIntArray.put(q.l.ba, 69);
        sparseIntArray.put(q.l.ca, 70);
        sparseIntArray.put(q.l.da, 71);
        sparseIntArray.put(q.l.ea, 72);
        sparseIntArray.put(q.l.fa, 73);
        sparseIntArray.put(q.l.ga, 74);
        sparseIntArray.put(q.l.ha, 75);
        sparseIntArray.put(q.l.ia, 76);
    }

    private final c0 f(androidx.databinding.l lVar, View view, int i2, Object obj) {
        switch (i2) {
            case 1:
                if ("layout/activity_comic_category_content_management_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.b(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_category_content_management is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_comic_category_management_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.d(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_category_management is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_comic_code_book_management_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.f(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_code_book_management is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_comic_compression_browser_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.h(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_compression_browser is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_comic_content_management_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.j(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_content_management is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_comic_list_detail_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.l(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_list_detail is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_comic_main_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.n(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_main is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_comic_reader_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.p(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_reader is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_comic_search_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.r(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_search is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_comic_search_detail_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.t(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_search_detail is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_comic_sub_dir_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.w(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_comic_sub_dir is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_offline_comic_detail_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.z(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_offline_comic_detail is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_offline_comic_main_0".equals(obj)) {
                    return new com.zentraedi.comic.databinding.b0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_offline_comic_main is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_read_setting_0".equals(obj)) {
                    return new d0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_read_setting is invalid. Received: " + obj);
            case 15:
                if ("layout/dialog_bottom_aoto_seting_0".equals(obj)) {
                    return new g0(lVar, view);
                }
                if ("layout-land/dialog_bottom_aoto_seting_0".equals(obj)) {
                    return new h0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_bottom_aoto_seting is invalid. Received: " + obj);
            case 16:
                if ("layout/dialog_bottom_filter_setting_0".equals(obj)) {
                    return new j0(lVar, view);
                }
                if ("layout-land/dialog_bottom_filter_setting_0".equals(obj)) {
                    return new k0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_bottom_filter_setting is invalid. Received: " + obj);
            case 17:
                if ("layout/dialog_bottom_seting_0".equals(obj)) {
                    return new m0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_bottom_seting is invalid. Received: " + obj);
            case 18:
                if ("layout/dialog_comic_code_book_0".equals(obj)) {
                    return new o0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_comic_code_book is invalid. Received: " + obj);
            case 19:
                if ("layout/dialog_comic_cover_help_0".equals(obj)) {
                    return new q0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_comic_cover_help is invalid. Received: " + obj);
            case 20:
                if ("layout/dialog_comic_house_more_option_0".equals(obj)) {
                    return new s0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_comic_house_more_option is invalid. Received: " + obj);
            case 21:
                if ("layout/dialog_comic_sort_0".equals(obj)) {
                    return new u0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_comic_sort is invalid. Received: " + obj);
            case 22:
                if ("layout/dialog_create_comic_code_0".equals(obj)) {
                    return new x0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_create_comic_code is invalid. Received: " + obj);
            case 23:
                if ("layout/dialog_edit_comic_0".equals(obj)) {
                    return new z0(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_edit_comic is invalid. Received: " + obj);
            case 24:
                if ("layout/dialog_read_clip_0".equals(obj)) {
                    return new b1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_clip is invalid. Received: " + obj);
            case 25:
                if ("layout/dialog_read_orientation_0".equals(obj)) {
                    return new d1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_orientation is invalid. Received: " + obj);
            case 26:
                if ("layout/dialog_read_page_add_tag_0".equals(obj)) {
                    return new f1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_page_add_tag is invalid. Received: " + obj);
            case 27:
                if ("layout/dialog_read_page_set_0".equals(obj)) {
                    return new h1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_page_set is invalid. Received: " + obj);
            case 28:
                if ("layout/dialog_read_screen_orientation_0".equals(obj)) {
                    return new j1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_screen_orientation is invalid. Received: " + obj);
            case 29:
                if ("layout/dialog_read_zoom_0".equals(obj)) {
                    return new l1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_read_zoom is invalid. Received: " + obj);
            case 30:
                if ("layout/drawer_comic_chapter_0".equals(obj)) {
                    return new n1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for drawer_comic_chapter is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_comic_content_management_0".equals(obj)) {
                    return new p1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_content_management is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_comic_home_0".equals(obj)) {
                    return new r1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_home is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_comic_house_list_0".equals(obj)) {
                    return new t1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_house_list is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_comic_list_detail_0".equals(obj)) {
                    return new v1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_list_detail is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_comic_read_set_0".equals(obj)) {
                    return new x1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_read_set is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_comic_search_0".equals(obj)) {
                    return new z1(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comic_search is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_commic_house_0".equals(obj)) {
                    return new b2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_commic_house is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_wrap_comic_list_0".equals(obj)) {
                    return new d2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wrap_comic_list is invalid. Received: " + obj);
            case 39:
                if ("layout/item_comic_category_0".equals(obj)) {
                    return new g2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_category is invalid. Received: " + obj);
            case 40:
                if ("layout/item_comic_code_book_0".equals(obj)) {
                    return new j2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_code_book is invalid. Received: " + obj);
            case 41:
                if ("layout/item_comic_content_manage_file_0".equals(obj)) {
                    return new l2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_content_manage_file is invalid. Received: " + obj);
            case 42:
                if ("layout/item_comic_content_manage_folder_0".equals(obj)) {
                    return new n2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_content_manage_folder is invalid. Received: " + obj);
            case 43:
                if ("layout/item_comic_content_manage_title_0".equals(obj)) {
                    return new p2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_content_manage_title is invalid. Received: " + obj);
            case 44:
                if ("layout/item_comic_dir_grid_0".equals(obj)) {
                    return new r2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_dir_grid is invalid. Received: " + obj);
            case 45:
                if ("layout/item_comic_dir_linear_0".equals(obj)) {
                    return new t2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_dir_linear is invalid. Received: " + obj);
            case 46:
                if ("layout/item_comic_empty_0".equals(obj)) {
                    return new v2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_empty is invalid. Received: " + obj);
            case 47:
                if ("layout/item_comic_home_title_0".equals(obj)) {
                    return new x2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_home_title is invalid. Received: " + obj);
            case 48:
                if ("layout/item_comic_image_0".equals(obj)) {
                    return new z2(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_image is invalid. Received: " + obj);
            case 49:
                if ("layout/item_comic_image_subsampling_0".equals(obj)) {
                    return new b3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_image_subsampling is invalid. Received: " + obj);
            case 50:
                if ("layout/item_comic_menu_image_0".equals(obj)) {
                    return new d3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_menu_image is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final c0 g(androidx.databinding.l lVar, View view, int i2, Object obj) {
        switch (i2) {
            case 51:
                if ("layout/item_comic_net_error_0".equals(obj)) {
                    return new f3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_net_error is invalid. Received: " + obj);
            case 52:
                if ("layout/item_comic_pdf_0".equals(obj)) {
                    return new h3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_pdf is invalid. Received: " + obj);
            case 53:
                if ("layout/item_comic_search_empty_0".equals(obj)) {
                    return new j3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_search_empty is invalid. Received: " + obj);
            case 54:
                if ("layout/item_comic_search_history_0".equals(obj)) {
                    return new l3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_search_history is invalid. Received: " + obj);
            case 55:
                if ("layout/item_comic_thumb_0".equals(obj)) {
                    return new n3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_thumb is invalid. Received: " + obj);
            case 56:
                if ("layout/item_comic_thumb_list_0".equals(obj)) {
                    return new p3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_thumb_list is invalid. Received: " + obj);
            case 57:
                if ("layout/item_comic_thumb_search_0".equals(obj)) {
                    return new r3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_comic_thumb_search is invalid. Received: " + obj);
            case 58:
                if ("layout/item_dialog_comic_code_book_0".equals(obj)) {
                    return new t3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_dialog_comic_code_book is invalid. Received: " + obj);
            case 59:
                if ("layout/item_read_setting_0".equals(obj)) {
                    return new y3(lVar, view);
                }
                throw new IllegalArgumentException("The tag for item_read_setting is invalid. Received: " + obj);
            case 60:
                if ("layout/layout_comic_bottom_menu_0".equals(obj)) {
                    return new a4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_bottom_menu is invalid. Received: " + obj);
            case 61:
                if ("layout/layout_comic_bottom_menu_land_0".equals(obj)) {
                    return new c4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_bottom_menu_land is invalid. Received: " + obj);
            case 62:
                if ("layout/layout_comic_code_book_empty_0".equals(obj)) {
                    return new e4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_code_book_empty is invalid. Received: " + obj);
            case 63:
                if ("layout/layout_comic_edit_navigation_bar_0".equals(obj)) {
                    return new g4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_edit_navigation_bar is invalid. Received: " + obj);
            case 64:
                if ("layout/layout_comic_guide_0".equals(obj)) {
                    return new i4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_guide is invalid. Received: " + obj);
            case 65:
                if ("layout/layout_comic_guide_land_0".equals(obj)) {
                    return new k4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_guide_land is invalid. Received: " + obj);
            case 66:
                if ("layout/layout_comic_guide_mange_0".equals(obj)) {
                    return new m4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_guide_mange is invalid. Received: " + obj);
            case 67:
                if ("layout/layout_comic_home_empty_0".equals(obj)) {
                    return new o4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_home_empty is invalid. Received: " + obj);
            case 68:
                if ("layout/layout_comic_house_sort_0".equals(obj)) {
                    return new q4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_house_sort is invalid. Received: " + obj);
            case 69:
                if ("layout/layout_comic_list_edit_tab_bar_0".equals(obj)) {
                    return new s4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_list_edit_tab_bar is invalid. Received: " + obj);
            case 70:
                if ("layout/layout_comic_list_empty_0".equals(obj)) {
                    return new u4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_list_empty is invalid. Received: " + obj);
            case 71:
                if ("layout/layout_comic_list_head_0".equals(obj)) {
                    return new w4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_list_head is invalid. Received: " + obj);
            case 72:
                if ("layout/layout_comic_loading_0".equals(obj)) {
                    return new y4(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_loading is invalid. Received: " + obj);
            case 73:
                if ("layout/layout_comic_nav_bar_0".equals(obj)) {
                    return new a5(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_nav_bar is invalid. Received: " + obj);
            case 74:
                if ("layout/layout_comic_nav_menu_0".equals(obj)) {
                    return new c5(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_nav_menu is invalid. Received: " + obj);
            case 75:
                if ("layout/layout_comic_navigation_bar_0".equals(obj)) {
                    return new e5(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_navigation_bar is invalid. Received: " + obj);
            case 76:
                if ("layout/layout_comic_read_progress_0".equals(obj)) {
                    return new g5(lVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_comic_read_progress is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public List<androidx.databinding.k> a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.basic.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.business.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.business_atom.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.outreader.DataBinderMapperImpl());
        arrayList.add(new com.zentraedi.reader.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int i2) {
        return a.a.get(i2);
    }

    public c0 c(androidx.databinding.l lVar, View view, int i2) {
        int i3 = y0.get(i2);
        if (i3 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i4 = (i3 - 1) / 50;
        if (i4 == 0) {
            return f(lVar, view, i3, tag);
        }
        if (i4 != 1) {
            return null;
        }
        return g(lVar, view, i3, tag);
    }

    public c0 d(androidx.databinding.l lVar, View[] viewArr, int i2) {
        if (viewArr == null || viewArr.length == 0 || y0.get(i2) <= 0 || viewArr[0].getTag() != null) {
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
