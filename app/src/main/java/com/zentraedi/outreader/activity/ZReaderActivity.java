package com.zentraedi.outreader.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.w0;
import androidx.core.view.a2;
import androidx.core.view.e1;
import androidx.core.view.q3;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.p2;
import androidx.viewpager.widget.ViewPager;
import com.artifex.mupdf.fitz.Document;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.picture.ImageProxy;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.reader.BookShelfStatusChangeEvent;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.task.event.FileDownloadFailEvent;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.business.utils.f6;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.databinding.r0;
import com.zentraedi.outreader.event.ChangeTypefaceEvent;
import com.zentraedi.outreader.event.MsgBookEvent;
import com.zentraedi.outreader.event.MsgChapterChangeEvent;
import com.zentraedi.outreader.local.LocalReaderManager;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.BookmarkEntity;
import com.zentraedi.outreader.model.ChapterContentM;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.model.LocalTxtBookModel;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.activity.NewZReaderActivity;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.reader.PageView;
import com.zspace.mobi.MobiException;
import com.zspace.mobi.MobiUtilBusiness;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class ZReaderActivity extends BaseActivity implements com.zentraedi.reader.reader.d, View.OnClickListener, com.zentraedi.outreader.util.k.b, com.zentraedi.outreader.typeface.b {
    public static final String A6 = "EXTRA_BOOK_INFO_MODEL";
    public static final String B6 = "EXTRA_BOOK_FROM";
    public static final int C6 = 180;
    public static final int D6 = com.zentraedi.basic.function.utils.m0.b(54.0f);
    public static final String E6 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Qw1);
    public static final int F6 = 1;
    public static final int G6 = 2;
    private static final String z6 = "ZReaderActivity";
    private com.zentraedi.reader.reader.m A3;
    private hh.b<ChapterContentM> A4;
    private boolean A5;
    private boolean D5;
    private boolean E5;
    private int F5;
    private int G5;
    private boolean H5;
    private int K5;
    private int M1;
    private BookModel M2;
    private hh.c<List<SectionContentEntity>> M4;
    private int N5;
    private String P2;
    private com.zentraedi.basic.component.handler.a P3;
    private com.zentraedi.outreader.util.k P4;
    private com.zentraedi.outreader.viewmodel.f Q2;
    private String Q4;
    private boolean S5;
    private com.zentraedi.outreader.business.c T;
    private List<ChapterM.Chapter> T2;
    private boolean T3;
    private FileInfoModel U;
    public ArrayList<ChapterM.Author> V;
    private boolean W5;
    int X;
    private int Y;
    private int Y5;
    private com.zentraedi.outreader.databinding.c Z;
    private ArrayList<ChapterM.Category> Z2;
    private int Z4;
    private com.zentraedi.outreader.adapter.l a0;
    private String a1;
    private int a2;
    private com.zentraedi.outreader.adapter.m b0;
    private Animation c0;
    private boolean c6;
    private Animation d0;
    private BookEntity d6;
    private Animation e0;
    private Timer e6;
    private Animation f0;
    private TimerTask f6;
    private String g0;
    private int h6;
    private boolean i0;
    private String j0;
    private com.zentraedi.basic.function.ui.dialog.b j6;
    private String k0;
    private com.zentraedi.basic.function.ui.dialog.b k6;
    private String l0;
    private com.zentraedi.basic.function.ui.dialog.b l6;
    private String m0;
    private int r1;
    private PowerManager.WakeLock s6;
    private String u6;
    private boolean v5;
    private long w5;
    private String x5;
    private boolean y5;
    private long y6;
    public int W = 0;
    private boolean h0 = false;
    private String n0 = IdentifierConstant.OAID_STATE_DEFAULT;
    private final List<BookmarkEntity> u5 = new ArrayList();
    private boolean z5 = false;
    private int B5 = 1;
    private boolean C5 = false;
    private boolean I5 = false;
    private com.zentraedi.outreader.business.b J5 = new com.zentraedi.outreader.business.b();
    private boolean L5 = false;
    private int M5 = 0;
    private boolean O5 = false;
    private final HashMap<String, Integer> P5 = new HashMap<>(1);
    private boolean Q5 = false;
    private final hh.c<List<SectionContentEntity>> R5 = new k();
    private boolean T5 = false;
    private boolean U5 = false;
    private int V5 = 0;
    private final ArrayList<String> X5 = new ArrayList<>();
    private int Z5 = 0;
    private final hh.c<List<SectionContentEntity>> a6 = new v();
    private long b6 = 0;
    private int g6 = 0;
    private boolean i6 = false;
    private boolean m6 = false;
    private final hh.e<BookChapterEntity> n6 = new x();
    private Toast o6 = null;
    private boolean p6 = false;
    private final View.OnAttachStateChangeListener q6 = new y();
    private boolean r6 = false;
    private final Runnable t6 = new Runnable() { // from class: com.zentraedi.outreader.activity.f0
        @Override // java.lang.Runnable
        public final void run() {
            this.a.A7();
        }
    };
    private com.zentraedi.outreader.business.d v6 = new com.zentraedi.outreader.business.d();
    private String w6 = "";
    boolean x6 = false;

    public static final class DocumentData implements Serializable {
        public int countPages;
        public List<LocalPdfBookModel.LocalPdfChapter> localPdfChapterList;
        public Document mDocument;
    }

    class a extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean a;

        a(final boolean val$isCloseAct) {
            this.a = val$isCloseAct;
        }

        public void onResult(ResponseData<Object> resp) {
            if ("200".equals(resp.getCode())) {
                ZReaderActivity.this.v6(this.a);
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.tB2) + resp.getCode() + ": " + resp.getMsg(), false);
            ZReaderActivity.this.u6(this.a);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Mw1), false);
            ZReaderActivity.this.u6(this.a);
        }
    }

    class a0 implements hh.c<BookEntity> {
        a0() {
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(BookEntity bookEntity) {
            if (bookEntity != null && bookEntity.getAddToShelf()) {
                ZReaderActivity.this.M2.setAdd_shelf(1);
                ZReaderActivity.this.s8(true);
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        public static /* synthetic */ void a(b bVar) {
            bVar.getClass();
            if (!((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
                ZReaderActivity.this.z7();
                return;
            }
            ZReaderActivity.this.C5 = true;
            if (ZReaderActivity.this.B5 == 2 ? ZReaderActivity.this.Z.K.g2(ZReaderActivity.this.g6) : ZReaderActivity.this.Z.K.v1()) {
                return;
            }
            ZReaderActivity.this.v7();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ZReaderActivity.this.runOnUiThread(new Runnable() { // from class: com.zentraedi.outreader.activity.g0
                @Override // java.lang.Runnable
                public final void run() {
                    ZReaderActivity.b.a(this.a);
                }
            });
        }
    }

    class b0 implements hh.c<BookEntity> {
        b0() {
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(BookEntity bookEntity) {
            if (bookEntity != null) {
                ZReaderActivity.this.K8(bookEntity);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ZReaderActivity.this.isFinishing()) {
                return;
            }
            ZReaderActivity.this.finish();
        }
    }

    class c0 implements ViewTreeObserver.OnGlobalLayoutListener {
        c0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ZReaderActivity.this.Z.N.D5.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = ZReaderActivity.this.Z.N.D5.getHeight();
            if (com.zentraedi.basic.function.utils.b.o(ZReaderActivity.this)) {
                height += com.zentraedi.basic.function.utils.b.i();
            }
            int height2 = ZReaderActivity.this.Z.N.E5.getVisibility() == 0 ? ZReaderActivity.this.Z.N.E5.getHeight() + ZReaderActivity.this.Z.N.C5.getHeight() : 0;
            if (com.zentraedi.basic.function.utils.b.o(ZReaderActivity.this)) {
                height2 += com.zentraedi.basic.function.utils.b.i();
            }
            ZReaderActivity zReaderActivity = ZReaderActivity.this;
            zReaderActivity.j8(-height2, -(zReaderActivity.Z.N.C5.getHeight() + height));
        }
    }

    class d implements hh.b<ChapterContentM> {
        d() {
        }

        @Override // hh.a
        public void b(String errorCode, String chapterId) {
        }

        @Override // hh.b
        public void c(String state, String chapterId, int type) {
            if (ZReaderActivity.this.isFinishing()) {
                return;
            }
            ZReaderActivity.this.F6();
            ZReaderActivity.this.X5.remove(chapterId);
            ZReaderActivity.this.y4(state, chapterId, type);
        }

        @Override // hh.a
        public void d() {
        }

        @Override // hh.a
        public void f() {
        }

        @Override // hh.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(ChapterContentM chapterContentM, String str) {
        }

        @Override // hh.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(ChapterContentM chapterContentM, String destFilePath, int type) {
            if (ZReaderActivity.this.isFinishing() || chapterContentM == null) {
                return;
            }
            ZReaderActivity zReaderActivity = ZReaderActivity.this;
            int iO6 = zReaderActivity.O6(zReaderActivity.T2, chapterContentM.chapterId);
            SectionContentEntity sectionContentEntity = new SectionContentEntity();
            sectionContentEntity.setSectionName(chapterContentM.chapterName);
            sectionContentEntity.setContent(chapterContentM.content);
            sectionContentEntity.setSectionId(chapterContentM.chapterId);
            sectionContentEntity.setBookId(ZReaderActivity.this.m0);
            sectionContentEntity.setUserId(com.zentraedi.outreader.util.h.a());
            sectionContentEntity.setOriginalContent(chapterContentM.getOriginalContent());
            sectionContentEntity.setMupdfPath(destFilePath);
            ZReaderActivity.this.X5.remove(chapterContentM.chapterId);
            boolean zH = ZReaderActivity.this.a0.H(iO6, sectionContentEntity);
            ZReaderActivity.this.a0.G(iO6, sectionContentEntity.getContent());
            boolean z = !TextUtils.isEmpty(ZReaderActivity.this.Q4) && ZReaderActivity.this.Q4.equals(chapterContentM.chapterId);
            if (!ZReaderActivity.this.g0.equals(chapterContentM.chapterId) && !z) {
                if (zH) {
                    ZReaderActivity.this.Z.K.x1(iO6);
                    return;
                }
                return;
            }
            if (type == 2) {
                if (ZReaderActivity.this.a2 == 0) {
                    ZReaderActivity.this.m7(iO6, ZReaderActivity.this.Y6() ? ZReaderActivity.this.M1 : 0, type, -1.0f);
                } else {
                    ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                    zReaderActivity2.r7(iO6, zReaderActivity2.a2, type);
                }
            } else if (ZReaderActivity.this.Z4 == 1) {
                ZReaderActivity.this.m7(iO6, -1, type, -1.0f);
            } else {
                ZReaderActivity.this.m7(iO6, 0, type, -1.0f);
            }
            ZReaderActivity.this.G8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
            if (z) {
                ZReaderActivity.this.Q4 = null;
            }
        }
    }

    class d0 extends com.zentraedi.business.http.b<Object> {
        d0() {
        }

        public void onResult(ResponseData<Object> resp) {
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.uB2) + resp.getCode() + ": " + resp.getMsg(), false);
                return;
            }
            ZReaderActivity.this.M2.setAdd_shelf(1);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.nL), true);
            ZReaderActivity.this.s8(false);
            BookShelfStatusChangeEvent bookShelfStatusChangeEvent = new BookShelfStatusChangeEvent();
            bookShelfStatusChangeEvent.setBookId(ZReaderActivity.this.M2.getBook_id());
            bookShelfStatusChangeEvent.setShelfStatus(0);
            org.greenrobot.eventbus.c.f().q(bookShelfStatusChangeEvent);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Lw1), false);
        }
    }

    class e implements hh.c<List<SectionContentEntity>> {
        e() {
        }

        @Override // hh.c
        public void c() {
            if (IdentifierConstant.OAID_STATE_DEFAULT.equals(ZReaderActivity.this.n0)) {
                ZReaderActivity.this.z6();
                return;
            }
            ZReaderActivity zReaderActivity = ZReaderActivity.this;
            int iO6 = zReaderActivity.O6(zReaderActivity.T2, ZReaderActivity.this.g0);
            if (iO6 == -1 && ZReaderActivity.this.T2 != null && !com.zentraedi.basic.function.utils.j0.l(ZReaderActivity.this.T2)) {
                ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                zReaderActivity2.g0 = TextUtils.isEmpty(((ChapterM.Chapter) zReaderActivity2.T2.get(0)).f985id) ? "" : ((ChapterM.Chapter) ZReaderActivity.this.T2.get(0)).f985id;
                ZReaderActivity zReaderActivity3 = ZReaderActivity.this;
                zReaderActivity3.l0 = ((ChapterM.Chapter) zReaderActivity3.T2.get(0)).name;
                ZReaderActivity.this.M1 = 0;
                ZReaderActivity.this.a2 = 0;
                ZReaderActivity zReaderActivity4 = ZReaderActivity.this;
                zReaderActivity4.j0 = ((ChapterM.Chapter) zReaderActivity4.T2.get(0)).url;
                iO6 = 0;
            }
            ZReaderActivity.this.E7(iO6, 0);
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> object) {
            int iO6;
            if (ZReaderActivity.this.Q4 == null || TextUtils.isEmpty(ZReaderActivity.this.Q4)) {
                ZReaderActivity zReaderActivity = ZReaderActivity.this;
                iO6 = zReaderActivity.O6(zReaderActivity.T2, ZReaderActivity.this.g0);
            } else {
                ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                iO6 = zReaderActivity2.O6(zReaderActivity2.T2, ZReaderActivity.this.Q4);
            }
            if (iO6 == -1 && ZReaderActivity.this.T2 != null && !com.zentraedi.basic.function.utils.j0.l(ZReaderActivity.this.T2)) {
                ZReaderActivity zReaderActivity3 = ZReaderActivity.this;
                zReaderActivity3.g0 = TextUtils.isEmpty(((ChapterM.Chapter) zReaderActivity3.T2.get(0)).f985id) ? "" : ((ChapterM.Chapter) ZReaderActivity.this.T2.get(0)).f985id;
                ZReaderActivity zReaderActivity4 = ZReaderActivity.this;
                zReaderActivity4.l0 = ((ChapterM.Chapter) zReaderActivity4.T2.get(0)).name;
                ZReaderActivity.this.M1 = 0;
                ZReaderActivity.this.a2 = 0;
                ZReaderActivity zReaderActivity5 = ZReaderActivity.this;
                zReaderActivity5.j0 = ((ChapterM.Chapter) zReaderActivity5.T2.get(0)).url;
                iO6 = 0;
            }
            if (object == null || object.size() == 0) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Nw1));
                ZReaderActivity.this.F6();
                return;
            }
            ZReaderActivity.this.a0.I();
            for (int i = 0; i < object.size(); i++) {
                SectionContentEntity sectionContentEntity = object.get(i);
                ZReaderActivity zReaderActivity6 = ZReaderActivity.this;
                ZReaderActivity.this.a0.H(zReaderActivity6.O6(zReaderActivity6.T2, sectionContentEntity.getSectionId()), sectionContentEntity);
                ZReaderActivity.this.g0.equals(sectionContentEntity.getSectionId());
            }
            if (ZReaderActivity.this.a2 == 0) {
                ZReaderActivity.this.m7(iO6, ZReaderActivity.this.Y6() ? ZReaderActivity.this.M1 : 0, 0, -1.0f);
            } else {
                ZReaderActivity zReaderActivity7 = ZReaderActivity.this;
                zReaderActivity7.r7(iO6, zReaderActivity7.a2, 0);
            }
            ZReaderActivity.this.G8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
            ZReaderActivity.this.Q4 = null;
        }
    }

    class f implements hh.c<List<BookmarkEntity>> {
        f() {
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<BookmarkEntity> bookmarkEntities) {
            if (bookmarkEntities == null || com.zentraedi.basic.function.utils.j0.l(bookmarkEntities)) {
                return;
            }
            ZReaderActivity.this.u5.clear();
            ZReaderActivity.this.u5.addAll(bookmarkEntities);
            ZReaderActivity.this.H7();
            if (ZReaderActivity.this.M2 != null) {
                ZReaderActivity zReaderActivity = ZReaderActivity.this;
                zReaderActivity.S7(zReaderActivity.M2.getReadPageInt());
            }
        }
    }

    class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            return true;
        }
    }

    class h implements ViewPager.j {
        h() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float v, int i1) {
        }

        public void onPageSelected(int i) {
            if (i == 0) {
                ZReaderActivity.this.Z.H.K.setVisibility(0);
            } else if (i == 1) {
                ZReaderActivity.this.Z.H.K.setVisibility(4);
            }
        }
    }

    class i implements SeekBar.OnSeekBarChangeListener {
        i() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
            com.zentraedi.basic.function.utils.e.c(ZReaderActivity.this, progress);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ZReaderActivity.this.T3 = false;
            ZReaderActivity.this.i7(false, ((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
            t7.j(gh.b.p, Boolean.valueOf(ZReaderActivity.this.T3));
            t7.j(gh.b.o, Integer.valueOf(seekBar.getProgress()));
        }
    }

    class j implements PageView.u {
        j() {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void a() {
            ZReaderActivity.this.i8();
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public boolean b() {
            return false;
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void c(boolean forbidden, int orientation) {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void cancel() {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void d() {
            if (ZReaderActivity.this.M2 == null) {
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.y(ZReaderActivity.this, com.zentraedi.outreader.d.q.iA2);
        }
    }

    class k implements hh.c<List<SectionContentEntity>> {
        k() {
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> sectionContentEntities) {
            if (sectionContentEntities != null && !com.zentraedi.basic.function.utils.j0.l(sectionContentEntities)) {
                for (SectionContentEntity sectionContentEntity : sectionContentEntities) {
                    if (ZReaderActivity.this.a0 != null) {
                        ZReaderActivity zReaderActivity = ZReaderActivity.this;
                        ZReaderActivity.this.a0.H(zReaderActivity.O6(zReaderActivity.T2, sectionContentEntity.getSectionId()), sectionContentEntity);
                    }
                }
            }
            ZReaderActivity.this.Q5 = false;
        }
    }

    class l implements DrawerLayout.DrawerListener {
        l() {
        }

        public void onDrawerClosed(@androidx.annotation.n0 View view) {
            ZReaderActivity.this.Z.L.setDrawerLockMode(1);
            ZReaderActivity.this.c8();
            if (ZReaderActivity.this.z5) {
                ZReaderActivity.this.z5 = false;
                BookModel unused = ZReaderActivity.this.M2;
                ZReaderActivity.this.V5();
            }
        }

        public void onDrawerOpened(@androidx.annotation.n0 View view) {
            ZReaderActivity.this.Z.L.setDrawerLockMode(0);
            ZReaderActivity.this.z7();
        }

        public void onDrawerSlide(@androidx.annotation.n0 View view, float v) {
        }

        public void onDrawerStateChanged(int i) {
        }
    }

    class m implements SeekBar.OnSeekBarChangeListener {
        m() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (ZReaderActivity.this.M2 == null) {
                return;
            }
            if (fromUser) {
                ZReaderActivity.this.E5 = true;
                if (ZReaderActivity.this.Z.N.A4.getVisibility() == 8) {
                    ZReaderActivity zReaderActivity = ZReaderActivity.this;
                    zReaderActivity.F5 = zReaderActivity.M2.getReadPageInt();
                    ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                    zReaderActivity2.G5 = zReaderActivity2.W;
                }
                ZReaderActivity.this.Z.N.A4.setVisibility(0);
                ZReaderActivity.this.Z.N.b0.setClickable(true);
                ZReaderActivity zReaderActivity3 = ZReaderActivity.this;
                zReaderActivity3.v8(zReaderActivity3.D5);
            }
            ZReaderActivity.this.D8(seekBar.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            if (ZReaderActivity.this.T2 == null || progress < 0 || progress >= ZReaderActivity.this.T2.size()) {
                return;
            }
            ChapterM.Chapter chapter = (ChapterM.Chapter) ZReaderActivity.this.T2.get(progress);
            org.greenrobot.eventbus.c.f().q(new MsgChapterChangeEvent(MsgChapterChangeEvent.MSG_CHAPTER_CHANGE_QUICK, chapter.f985id, chapter.name));
        }
    }

    class n implements Animation.AnimationListener {
        n() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        @w0(api = 21)
        public void onAnimationEnd(Animation animation) {
            if (ZReaderActivity.this.Z.Y.getRoot().getVisibility() == 0) {
                ZReaderActivity.this.O8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
                return;
            }
            if (Build.VERSION.SDK_INT > 23) {
                ZReaderActivity.this.getWindow().setStatusBarColor(0);
            }
            ZReaderActivity.this.getWindow().setFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class o implements Animation.AnimationListener {
        o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ZReaderActivity.this.Z.K.setCanTouch(false);
        }
    }

    class p implements Animation.AnimationListener {
        p() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ZReaderActivity.this.Z.K.setCanTouch(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class q implements com.zentraedi.basic.component.easythread.b<DocumentData> {
        q() {
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(DocumentData data) {
            Document document = data.mDocument;
            if (ZReaderActivity.this.isFinishing()) {
                document.destroy();
                return;
            }
            ZReaderActivity.this.A6(data.localPdfChapterList, document, data.countPages);
            if (ZReaderActivity.this.U6()) {
                ZReaderActivity.this.P8(((Integer) t7.d(gh.b.y, 1)).intValue(), false);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            ZReaderActivity.this.a6();
        }
    }

    class r implements hh.c<List<SectionContentEntity>> {
        final /* synthetic */ List a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        r(final List val$chapterIds, final int val$chapter, final int val$page, final int val$type) {
            this.a = val$chapterIds;
            this.b = val$chapter;
            this.c = val$page;
            this.d = val$type;
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> sectionContentEntities) {
            if (sectionContentEntities != null) {
                for (SectionContentEntity sectionContentEntity : sectionContentEntities) {
                    ZReaderActivity zReaderActivity = ZReaderActivity.this;
                    ZReaderActivity.this.a0.G(zReaderActivity.O6(zReaderActivity.T2, sectionContentEntity.getSectionId()), sectionContentEntity.getContent());
                }
            }
            for (int i = 0; i < this.a.size(); i++) {
                ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                int iO6 = zReaderActivity2.O6(zReaderActivity2.T2, (String) this.a.get(i));
                SectionContentEntity sectionContentEntityM = ZReaderActivity.this.a0.M(iO6);
                if (sectionContentEntityM != null && !TextUtils.isEmpty(sectionContentEntityM.getErrorStatus())) {
                    ZReaderActivity.this.a0.G(iO6, sectionContentEntityM.getContent());
                }
            }
            ZReaderActivity.this.p7(this.b, this.c, this.d, -1.0f);
        }
    }

    class s implements hh.c<List<SectionContentEntity>> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        s(final int val$chapter, final int val$bookmarkPos) {
            this.a = val$chapter;
            this.b = val$bookmarkPos;
        }

        @Override // hh.c
        public void c() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> sectionContentEntities) {
            if (sectionContentEntities != null) {
                for (SectionContentEntity sectionContentEntity : sectionContentEntities) {
                    ZReaderActivity zReaderActivity = ZReaderActivity.this;
                    ZReaderActivity.this.a0.G(zReaderActivity.O6(zReaderActivity.T2, sectionContentEntity.getSectionId()), sectionContentEntity.getContent());
                }
            }
            if (ZReaderActivity.this.a0.O(this.a)) {
                ZReaderActivity.this.o7(this.a, this.b);
                return;
            }
            ZReaderActivity.this.F6();
            ZReaderActivity.this.W5();
            BaseActivity baseActivity = ZReaderActivity.this;
            com.zentraedi.basic.function.ui.toast.a.z(baseActivity, baseActivity.getString(com.zentraedi.outreader.d.q.qD2));
        }
    }

    class t implements hh.c<List<SectionContentEntity>> {
        final /* synthetic */ List a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        t(final List val$chapterIds, final int val$chapter, final int val$textPosition, final int val$type) {
            this.a = val$chapterIds;
            this.b = val$chapter;
            this.c = val$textPosition;
            this.d = val$type;
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> sectionContentEntities) {
            if (sectionContentEntities != null) {
                for (SectionContentEntity sectionContentEntity : sectionContentEntities) {
                    ZReaderActivity zReaderActivity = ZReaderActivity.this;
                    ZReaderActivity.this.a0.G(zReaderActivity.O6(zReaderActivity.T2, sectionContentEntity.getSectionId()), sectionContentEntity.getContent());
                }
            }
            for (int i = 0; i < this.a.size(); i++) {
                ZReaderActivity zReaderActivity2 = ZReaderActivity.this;
                int iO6 = zReaderActivity2.O6(zReaderActivity2.T2, (String) this.a.get(i));
                SectionContentEntity sectionContentEntityM = ZReaderActivity.this.a0.M(iO6);
                if (sectionContentEntityM != null && !TextUtils.isEmpty(sectionContentEntityM.getErrorStatus())) {
                    ZReaderActivity.this.a0.G(iO6, sectionContentEntityM.getContent());
                }
            }
            ZReaderActivity.this.q7(this.b, this.c, this.d);
        }
    }

    class u implements hh.c<BookChapterEntity> {
        u() {
        }

        @Override // hh.c
        public void c() {
            ZReaderActivity.this.z6();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, com.zentraedi.outreader.activity.ZReaderActivity] */
        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(BookChapterEntity bookChapterEntity) {
            if (bookChapterEntity == null) {
                ZReaderActivity.this.z6();
                return;
            }
            try {
                LocalTxtBookModel localTxtBookModel = (LocalTxtBookModel) com.zentraedi.basic.component.utils.a.b().fromJson(bookChapterEntity.getChapterList(), LocalTxtBookModel.class);
                if (localTxtBookModel == null) {
                    return;
                }
                String str = localTxtBookModel.getWords() + "";
                List<LocalTxtBookModel.LocalTxtChapterModel> chapterInfoList = localTxtBookModel.getChapterInfoList();
                String str2 = localTxtBookModel.getWords() + "";
                if (!str.equals(ZReaderActivity.this.M2.getWords()) || !str2.equals(ZReaderActivity.this.M2.getChapters())) {
                    ZReaderActivity.this.M2.setWords(str);
                    ZReaderActivity.this.M2.setChapters(str2);
                    com.zentraedi.outreader.wrapper.b.a.h(ZReaderActivity.this.M2, null);
                }
                ZReaderActivity.this.Z5(chapterInfoList);
                String strA = com.zentraedi.outreader.util.h.a();
                com.zentraedi.outreader.viewmodel.f fVar = ZReaderActivity.this.Q2;
                ?? r4 = ZReaderActivity.this;
                fVar.M(r4, strA, ((ZReaderActivity) r4).m0, ZReaderActivity.this.T2, ZReaderActivity.this.M4);
            } catch (Exception e) {
                nd.a.c(ZReaderActivity.z6, "onLoadContentSuccess->json exception:" + e.getLocalizedMessage());
                nd.a.c(ZReaderActivity.z6, "onLoadContentSuccess->json:" + bookChapterEntity.getChapterList());
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pw1), false);
            }
        }
    }

    class v implements hh.c<List<SectionContentEntity>> {
        v() {
        }

        @Override // hh.c
        public void c() {
        }

        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(List<SectionContentEntity> sectionContentEntities) {
            if (sectionContentEntities != null) {
                for (SectionContentEntity sectionContentEntity : sectionContentEntities) {
                    ZReaderActivity zReaderActivity = ZReaderActivity.this;
                    ZReaderActivity.this.a0.G(zReaderActivity.O6(zReaderActivity.T2, sectionContentEntity.getSectionId()), sectionContentEntity.getContent());
                }
            }
        }
    }

    class w implements com.zentraedi.basic.component.easythread.b<Object> {
        final /* synthetic */ int a;

        w(final int val$originPageCount) {
            this.a = val$originPageCount;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            if (ZReaderActivity.this.isFinishing()) {
                return;
            }
            ZReaderActivity.this.a6();
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onSuccess(Object data) {
            ZReaderActivity.this.F6();
            if (ZReaderActivity.this.isFinishing()) {
                ZReaderActivity.this.Z.K.getDocument().destroy();
                return;
            }
            ZReaderActivity zReaderActivity = ZReaderActivity.this;
            int iO6 = zReaderActivity.O6(zReaderActivity.T2, ZReaderActivity.this.g0);
            if (iO6 < 0) {
                iO6 = 0;
            }
            int iF = ((ZReaderActivity.this.Z.K.getCurrentPage() != null ? ZReaderActivity.this.Z.K.getCurrentPage().f() : 0) * ZReaderActivity.this.Z.K.getCountPages()) / this.a;
            ZReaderActivity.this.Z.K.H0();
            ZReaderActivity.this.m7(iO6, iF, 3, -1.0f);
        }
    }

    class x implements hh.e<BookChapterEntity> {
        x() {
        }

        @Override // hh.e
        public void b(String state) {
            ZReaderActivity.this.F6();
            ZReaderActivity.this.T7(state);
        }

        @Override // hh.c
        public void c() {
            ZReaderActivity.this.a6();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.zentraedi.outreader.activity.ZReaderActivity] */
        @Override // hh.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(BookChapterEntity bookChapterEntity) {
            ZReaderActivity.this.T2 = new ArrayList(Arrays.asList((ChapterM.Chapter[]) com.zentraedi.basic.component.utils.a.b().fromJson(bookChapterEntity.getChapterList(), ChapterM.Chapter[].class)));
            if (com.zentraedi.basic.function.utils.j0.l(ZReaderActivity.this.T2)) {
                ZReaderActivity.this.a6();
                return;
            }
            if (ZReaderActivity.this.a0 != null) {
                ZReaderActivity.this.a0.V(ZReaderActivity.this.T2.size());
            }
            ZReaderActivity.this.Z.N.M2.setMax(ZReaderActivity.this.T2.size() - 1);
            ZReaderActivity.this.Z.M.I.setVisibility(8);
            ZReaderActivity.this.N7();
            String strA = com.zentraedi.outreader.util.h.a();
            if (TextUtils.isEmpty(ZReaderActivity.this.g0)) {
                ZReaderActivity zReaderActivity = ZReaderActivity.this;
                zReaderActivity.M7(((ChapterM.Chapter) zReaderActivity.T2.get(0)).f985id, ((ChapterM.Chapter) ZReaderActivity.this.T2.get(0)).name);
            }
            com.zentraedi.outreader.viewmodel.f fVar = ZReaderActivity.this.Q2;
            ?? r1 = ZReaderActivity.this;
            fVar.M(r1, strA, ((ZReaderActivity) r1).m0, ZReaderActivity.this.T2, ZReaderActivity.this.M4);
        }
    }

    class y implements View.OnAttachStateChangeListener {
        y() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ZReaderActivity.this.p6 = false;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ZReaderActivity.this.p6 = true;
        }
    }

    class z implements com.zentraedi.basic.component.easythread.b<String> {
        z() {
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String s) {
            ZReaderActivity.this.w6();
            ZReaderActivity.this.P6();
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            String localizedMessage;
            if (t != null) {
                t.printStackTrace();
                localizedMessage = t.getLocalizedMessage();
            } else {
                localizedMessage = "Unknown";
            }
            nd.a.c(ZReaderActivity.z6, "preTransferBook " + localizedMessage);
            ZReaderActivity.this.b6();
            if (t instanceof MobiException) {
                com.zentraedi.basic.function.ui.toast.a.w(t.getMessage(), false);
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.JB2) + localizedMessage, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A6(List<LocalPdfBookModel.LocalPdfChapter> localPdfChapterList, Document document, int countPages) {
        float f2;
        if (com.zentraedi.basic.function.utils.j0.l(localPdfChapterList)) {
            return;
        }
        this.Z.K.f2(localPdfChapterList);
        Y5(localPdfChapterList);
        if (this.T2 == null) {
            this.T2 = new ArrayList();
            ChapterM.Chapter chapter = new ChapterM.Chapter();
            chapter.volumeName = TextUtils.isEmpty(this.M2.getNasFileName()) ? "" : this.M2.getNasFileName();
            chapter.name = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
            chapter.f985id = "0";
            chapter.isSelect = true;
            chapter.isCache = true;
            this.T2.add(chapter);
        }
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list)) {
            this.Z.N.M2.setMax(this.T2.size() - 1);
        }
        List<ChapterM.Chapter> list2 = this.T2;
        if (list2 == null) {
            return;
        }
        int iO6 = O6(list2, this.g0);
        if (iO6 < 0) {
            iO6 = 0;
        }
        if (document != null) {
            this.Z.K.setDocument(document);
            this.Z.K.setCountPages(countPages);
            try {
                f2 = Float.parseFloat(this.M2.getText_position());
            } catch (Exception e2) {
                e2.printStackTrace();
                f2 = -1.0f;
            }
            m7(iO6, this.M1, 0, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A7() {
        PowerManager.WakeLock wakeLock = this.s6;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.s6.release();
        this.s6 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void A8(boolean isNight) {
        if (isNight) {
            this.Z.N.E5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.N.p6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.s6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.q6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.A5));
            this.Z.N.r6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.A5));
            this.Z.N.s6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.A5));
            this.Z.N.D5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.N.T3.setBackground(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.r6));
            this.Z.N.P3.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.N.C5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.N.U.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.wV));
            this.Z.N.L.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.gU));
            this.Z.N.Z.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.IV));
            this.Z.N.X5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.T5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.P5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.Q.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.aN));
            this.Z.N.R.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.eN));
            i7(this.T3, true);
            this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kQ));
            this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.lQ));
            this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
            this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
            this.Z.N.V5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.G5.setProgressDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kT));
            this.Z.N.G5.setThumb(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.k70));
            this.Z.N.P.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.M2));
            this.Z.N.b6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.b6.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.iS), (Drawable) null, (Drawable) null, (Drawable) null);
            this.Z.N.K5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.K5.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.gS), (Drawable) null, (Drawable) null, (Drawable) null);
            this.Z.N.U5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            Drawable drawableL = androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.C9);
            if (drawableL != null) {
                drawableL.setBounds(0, 0, drawableL.getMinimumWidth(), drawableL.getMinimumHeight());
                return;
            }
            return;
        }
        this.Z.N.E5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
        this.Z.N.p6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.s6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.q6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.k7));
        this.Z.N.r6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.G3));
        this.Z.N.s6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.G3));
        this.Z.N.D5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
        this.Z.N.T3.setBackground(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.q6));
        this.Z.N.P3.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
        this.Z.N.C5.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
        this.Z.N.U.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.vV));
        this.Z.N.L.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.fU));
        this.Z.N.Z.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.HV));
        this.Z.N.X5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.T5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.P5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.Q.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.ZM));
        this.Z.N.R.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.dN));
        i7(this.T3, false);
        this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.N7));
        this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.CM));
        this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        this.Z.N.V5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        this.Z.N.G5.setProgressDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.jT));
        this.Z.N.G5.setThumb(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.j70));
        this.Z.N.P.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.B9));
        this.Z.N.b6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
        this.Z.N.b6.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.hS), (Drawable) null, (Drawable) null, (Drawable) null);
        this.Z.N.K5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
        this.Z.N.K5.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.dS), (Drawable) null, (Drawable) null, (Drawable) null);
        this.Z.N.U5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
        Drawable drawableL2 = androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.B9);
        if (drawableL2 != null) {
            drawableL2.setBounds(0, 0, drawableL2.getMinimumWidth(), drawableL2.getMinimumHeight());
        }
    }

    private void B6() {
        if (!a7()) {
            if (Y6()) {
                this.Z.N.u5.setVisibility(8);
                return;
            }
            return;
        }
        int i2 = 1;
        if (this.M2.isEpub()) {
            this.Z.K.setFileType(2);
        } else {
            this.Z.K.setFileType(1);
        }
        String localPath = this.M2.getLocalPath();
        i5.a.f(localPath);
        this.Z.K.setFilePath(localPath);
        l7(localPath);
        this.Z.K.setCoverPath(this.M2.getCover());
        if (a7()) {
            if (this.M2.getBookType() == 2) {
                this.Z.K.setFileType(2);
                this.Z.K.setCoverPath(this.M2.getCover());
            } else if (this.M2.getBookType() == 3) {
                this.Z.K.setFileType(1);
            }
        }
        this.Z.N.P4.setVisibility(8);
        this.Z.N.l0.setVisibility(0);
        this.Z.N.Q4.setVisibility(8);
        this.Z.N.u5.setVisibility(8);
        o8(((Integer) t7.d(gh.b.O, 11)).intValue());
        int iIntValue = ((Integer) t7.d(gh.b.v, 1)).intValue();
        if (iIntValue != 2 && iIntValue != 4) {
            i2 = iIntValue;
        }
        f8(false, i2);
    }

    private void B7(BookmarkEntity entity) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void B8() {
        if (isFinishing()) {
            return;
        }
        if (this.D5) {
            this.Z.O.Q.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.h3));
            this.Z.O.M.setImageResource(com.zentraedi.outreader.d.h.UL);
            this.Z.O.S.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
        } else {
            this.Z.O.Q.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.Ra));
            this.Z.O.M.setImageResource(com.zentraedi.outreader.d.h.TL);
            this.Z.O.S.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.L5));
        }
    }

    private void C6() {
        this.Z.O.E.setVisibility(8);
        this.Z.O.G.setVisibility(8);
    }

    private void C7() {
        this.Q2.T(this.M2, new d0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C8(boolean isNight) {
        if (this.M2 == null || isFinishing()) {
            return;
        }
        if (isNight) {
            this.Z.O.P.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.O.J.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.rV));
            this.Z.O.K.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.PT));
            this.Z.O.H.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.xU));
            this.Z.O.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.NT));
            this.Z.O.N.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.H2));
            this.Z.O.U.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            this.Z.O.T.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            this.Z.O.U.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.qI), (Drawable) null);
        } else {
            this.Z.O.P.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
            this.Z.O.J.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.qV));
            this.Z.O.N.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.db));
            this.Z.O.U.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.O.T.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.O.U.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.pI), (Drawable) null);
            this.Z.O.K.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.OT));
            this.Z.O.H.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.wU));
            this.Z.O.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.MT));
        }
        C6();
        if (X6()) {
            F8();
        }
    }

    private void D6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D7() {
        this.Q2.Q(this, com.zentraedi.outreader.util.h.a(), this.m0, this.n0, new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8(int chapterIndex) {
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && chapterIndex >= 0 && chapterIndex < list.size()) {
            this.Z.N.Q5.setText(this.T2.get(chapterIndex).name);
            this.Z.N.R5.setText(com.zentraedi.outreader.util.e.f(chapterIndex, this.T2.size() - 1));
        }
        if (this.D5) {
            if (chapterIndex == 0) {
                this.Z.N.W5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.M2));
            } else {
                this.Z.N.W5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.t5));
            }
            if (com.zentraedi.basic.function.utils.j0.l(this.T2)) {
                return;
            }
            if (chapterIndex == this.T2.size() - 1) {
                this.Z.N.c6.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.M2));
                return;
            } else {
                this.Z.N.c6.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.t5));
                return;
            }
        }
        if (chapterIndex == 0) {
            this.Z.N.W5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.I3));
        } else {
            this.Z.N.W5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.K3));
        }
        if (com.zentraedi.basic.function.utils.j0.l(this.T2)) {
            return;
        }
        if (chapterIndex == this.T2.size() - 1) {
            this.Z.N.c6.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.I3));
        } else {
            this.Z.N.c6.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.K3));
        }
    }

    private void E6(boolean hideSettingBar) {
        if (hideSettingBar && this.Z.O.O.getVisibility() == 0) {
            this.Z.O.O.startAnimation(this.d0);
            this.Z.O.O.setVisibility(8);
        }
        if (this.Z.N.n0.getVisibility() == 0) {
            if (hideSettingBar) {
                this.Z.N.n0.startAnimation(this.f0);
                this.Z.N.n0.setVisibility(8);
                this.Z.N.I5.setVisibility(8);
                this.Z.N.P.setVisibility(8);
                this.Z.N.B5.setVisibility(8);
                j7();
            } else {
                k7();
                this.Z.N.P3.setVisibility(0);
            }
            this.Z.N.D5.setVisibility(8);
            this.Z.N.j0.setVisibility(8);
            this.Z.N.E5.setVisibility(8);
            this.Z.N.A4.setVisibility(8);
            this.E5 = false;
            G7();
        }
        x7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void E7(int index, int type) {
        if (!f6.g()) {
            com.zentraedi.basic.function.ui.toast.a.z(this, getString(com.zentraedi.outreader.d.q.mA2));
            F6();
        }
        this.y5 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E8() {
        if (!this.T3) {
            int iIntValue = ((Integer) t7.d(gh.b.o, Integer.valueOf(com.zentraedi.basic.function.utils.e.a(this)))).intValue();
            this.Z.N.G5.setProgress(iIntValue);
            com.zentraedi.basic.function.utils.e.c(this, iIntValue);
        } else {
            int iA = com.zentraedi.basic.function.utils.e.a(this);
            this.Z.N.G5.setProgress(iA);
            t7.j(gh.b.o, Integer.valueOf(iA));
            com.zentraedi.basic.function.utils.e.d(this);
        }
    }

    private void F7() {
        this.X5.clear();
        this.a0.I();
        this.Z4 = 0;
        this.Y = 0;
        List<ChapterM.Chapter> list = this.T2;
        if (list != null) {
            list.clear();
        }
    }

    private void F8() {
        this.Z.O.G.setVisibility(0);
    }

    private void G7() {
        this.Z.N.Z.setSelected(false);
        this.Z.N.L.setSelected(false);
        this.Z.N.Y.setSelected(false);
        this.Z.N.W.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G8(boolean isNight) {
        this.D5 = isNight;
        if (this.L5) {
            O8(isNight);
        }
        t7.j(gh.b.A, Boolean.valueOf(isNight));
        J8(isNight);
        C8(isNight);
        A8(isNight);
        q8();
        r8();
        B8();
        P8(((Integer) t7.d(gh.b.y, 1)).intValue(), true);
        n8();
        L8(isNight);
        y8(((Integer) t7.d(gh.b.q, 3)).intValue());
        M8(((Integer) t7.d(gh.b.B, 15)).intValue());
        int iIntValue = ((Integer) t7.d(gh.b.v, 1)).intValue();
        if (!a7()) {
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), iIntValue);
        } else if (iIntValue == 2 || iIntValue == 4) {
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 1);
        } else {
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), iIntValue);
        }
        w8(isNight);
        k7();
    }

    private void H6() {
        I6(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H7() {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(1);
        if (com.zentraedi.basic.function.utils.j0.l(this.u5)) {
            this.Z.K.setBookMarkMap(map);
            return;
        }
        for (BookmarkEntity bookmarkEntity : this.u5) {
            if (bookmarkEntity != null) {
                ArrayList<Integer> arrayList = map.get(Integer.valueOf(bookmarkEntity.getChapterIndex()));
                if (arrayList == null || com.zentraedi.basic.function.utils.j0.l(arrayList)) {
                    ArrayList<Integer> arrayList2 = new ArrayList<>();
                    arrayList2.add(Integer.valueOf(bookmarkEntity.getPosition()));
                    map.put(Integer.valueOf(bookmarkEntity.getChapterIndex()), arrayList2);
                } else {
                    arrayList.add(Integer.valueOf(bookmarkEntity.getPosition()));
                    map.put(Integer.valueOf(bookmarkEntity.getChapterIndex()), arrayList);
                }
            }
        }
        this.Z.K.setBookMarkMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H8(boolean isReverseOrder) {
        if (isReverseOrder) {
            this.Z.H.O.setText(getString(com.zentraedi.outreader.d.q.FI));
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.p6));
            } else {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.o6));
            }
        } else {
            this.Z.H.O.setText(getString(com.zentraedi.outreader.d.q.MH));
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.n6));
            } else {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.m6));
            }
        }
        this.i6 = isReverseOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void I6(boolean hideSettingBar) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            androidx.activity.l0.a(attributes, 1);
            getWindow().setAttributes(attributes);
        }
        if (hideSettingBar) {
            L6();
        }
        com.zentraedi.basic.function.utils.k0.x(this.Z.R, false);
        if (this.d0 == null || this.f0 == null) {
            return;
        }
        this.H5 = false;
        E6(hideSettingBar);
        c8();
    }

    private void I7(final View view) {
        try {
            a2.l2(view, new e1() { // from class: com.zentraedi.outreader.activity.c0
                public final q3 onApplyWindowInsets(View view2, q3 q3Var) {
                    return ZReaderActivity.w4(view, view2, q3Var);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void I8(boolean isNight, int pageMode, TextView title, TextView pageRoll, TextView pageCover, TextView pageSlide, TextView pageSimulation, TextView pageInanimate) {
        R8(isNight, pageMode, title, pageRoll, pageCover, pageSlide, pageSimulation, pageInanimate);
    }

    private void J6() {
        this.Z.K.a1();
    }

    private void J7(final View view) {
        try {
            a2.l2(view, new e1() { // from class: com.zentraedi.outreader.activity.b0
                public final q3 onApplyWindowInsets(View view2, q3 q3Var) {
                    return ZReaderActivity.q4(view, view2, q3Var);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J8(boolean isNight) {
        if (!isNight) {
            this.Z.K.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.u8));
            this.Z.K.setTitleColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
            this.Z.K.setTipColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D4));
            this.Z.K.setBookMarkResource(com.zentraedi.outreader.d.h.z5);
            p8(0);
            this.Z.K.Y1(false, this.h6);
            return;
        }
        this.Z.K.i2(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.r2), 0);
        this.Z.K.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.v8));
        this.Z.K.setTipColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.n7));
        this.Z.K.setTitleColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.v8));
        this.Z.K.setBookMarkResource(com.zentraedi.outreader.d.h.A5);
        this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.H3);
        this.Z.K.Y1(true, this.h6);
    }

    private void K6() {
        if (this.Z == null || d7() || this.Z.W.getVisibility() != 0 || ((Boolean) t7.d(gh.b.e0, Boolean.FALSE)).booleanValue()) {
            return;
        }
        this.Z.W.setVisibility(8);
        t7.j(gh.b.e0, Boolean.TRUE);
    }

    private void K7(final int fontSizeLevel) {
        if (this.Z.K.getDocument() == null) {
            return;
        }
        w3();
        wd.b.b().a(new Callable() { // from class: com.zentraedi.outreader.activity.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ZReaderActivity.u4(this.a, fontSizeLevel);
            }
        }, new w(this.Z.K.getCountPages()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void K8(BookEntity bookEntity) {
        com.zentraedi.outreader.viewmodel.f fVar;
        if (bookEntity == null || (fVar = this.Q2) == null) {
            return;
        }
        fVar.R(this, bookEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L6() {
        if (com.zentraedi.basic.function.utils.b.o(this)) {
            com.zentraedi.basic.function.utils.b.n(this);
        }
    }

    private void L7(int fontSizeLevel) {
        y8(fontSizeLevel);
        this.Z.N.V5.setText("" + fontSizeLevel);
        if (!a7()) {
            this.Z.K.setTextSize(com.zentraedi.basic.function.utils.m0.b(((fontSizeLevel - 1) * 2) + 16));
            return;
        }
        BookModel bookModel = this.M2;
        if (bookModel != null) {
            bookModel.setFont_size(fontSizeLevel + "");
        }
        K7(fontSizeLevel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L8(boolean isNight) {
        if (isNight) {
            this.Z.H.M.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.H2));
            this.Z.I.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.r2));
            this.Z.H.N.setTextSelectColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            this.Z.H.N.setIndicatorColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.V4));
            this.Z.H.N.setTextUnselectColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            this.Z.H.O.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c6));
            this.Z.H.G.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.H2));
            this.Z.H.R.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.h4));
            this.Z.H.P.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c3));
            this.Z.H.Q.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c3));
            this.Z.H.H.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c3));
            this.Z.H.I.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.c3));
            if (this.i6) {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.p6));
            } else {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.n6));
            }
        } else {
            this.Z.H.M.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.P9));
            this.Z.I.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
            this.Z.H.N.setTextSelectColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
            this.Z.H.N.setTextUnselectColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
            this.Z.H.N.setIndicatorColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.P0));
            this.Z.H.O.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
            this.Z.H.G.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.tc));
            this.Z.H.R.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
            this.Z.H.P.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.H.Q.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.H.H.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.H.I.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            if (this.i6) {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.o6));
            } else {
                this.Z.H.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.m6));
            }
        }
        l8();
        int count = this.b0.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            com.zentraedi.outreader.fragment.f item = this.b0.getItem(i2);
            if (item instanceof com.zentraedi.outreader.fragment.f) {
                item.p3(isNight);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void M6() {
        if (!isFinishing() && this.Z.Y.getRoot().getVisibility() == 0) {
            if (this.Z.O.getRoot().getVisibility() != 0) {
                if (Build.VERSION.SDK_INT > 23) {
                    getWindow().setStatusBarColor(0);
                }
                getWindow().setFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            }
            this.Z.Y.getRoot().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M7(String chapterId, String chapterName) {
        if (this.M2 == null) {
            return;
        }
        if (TextUtils.isEmpty(chapterId)) {
            chapterId = "";
        }
        this.g0 = chapterId;
        this.l0 = chapterName;
        this.M2.setRead_chapter(chapterName);
        this.M2.setRead_chapter_id(this.g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void M8(int space) {
        Boolean bool = Boolean.FALSE;
        if (((Boolean) t7.d(gh.b.A, bool)).booleanValue()) {
            this.Z.N.Z5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
        } else {
            this.Z.N.Z5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
        }
        if (space == 10) {
            if (((Boolean) t7.d(gh.b.A, bool)).booleanValue()) {
                this.Z.N.d0.setBackgroundResource(com.zentraedi.outreader.d.h.d60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.f60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.p60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.t60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.l60));
            } else {
                this.Z.N.d0.setBackgroundResource(com.zentraedi.outreader.d.h.c60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.e60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.o60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.s60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.k60));
            }
            this.Z.N.f0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.g0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.e0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setLineSpacing(com.zentraedi.basic.function.utils.m0.b(10.0f));
            t7.j(gh.b.B, 10);
        } else if (space == 15) {
            if (((Boolean) t7.d(gh.b.A, bool)).booleanValue()) {
                this.Z.N.f0.setBackgroundResource(com.zentraedi.outreader.d.h.d60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.h60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.n60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.t60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.l60));
            } else {
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.g60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.m60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.s60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.k60));
                this.Z.N.f0.setBackgroundResource(com.zentraedi.outreader.d.h.c60);
            }
            this.Z.N.d0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.g0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.e0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setLineSpacing(com.zentraedi.basic.function.utils.m0.b(15.0f));
            t7.j(gh.b.B, 15);
        } else if (space == 20) {
            if (((Boolean) t7.d(gh.b.A, bool)).booleanValue()) {
                this.Z.N.g0.setBackgroundResource(com.zentraedi.outreader.d.h.d60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.h60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.p60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.r60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.l60));
            } else {
                this.Z.N.g0.setBackgroundResource(com.zentraedi.outreader.d.h.c60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.g60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.o60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.q60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.k60));
            }
            this.Z.N.f0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.d0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.e0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setLineSpacing(com.zentraedi.basic.function.utils.m0.b(20.0f));
            t7.j(gh.b.B, 20);
        } else if (space == 25) {
            if (((Boolean) t7.d(gh.b.A, bool)).booleanValue()) {
                this.Z.N.e0.setBackgroundResource(com.zentraedi.outreader.d.h.d60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.h60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.p60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.t60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.j60));
            } else {
                this.Z.N.e0.setBackgroundResource(com.zentraedi.outreader.d.h.c60);
                this.Z.N.d0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.g60));
                this.Z.N.f0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.o60));
                this.Z.N.g0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.s60));
                this.Z.N.e0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.i60));
            }
            this.Z.N.f0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.g0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.d0.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setLineSpacing(com.zentraedi.basic.function.utils.m0.b(25.0f));
            t7.j(gh.b.B, 25);
        }
        S7(this.M5);
    }

    private void N6(boolean increase) {
        int iMax;
        if (com.zentraedi.business.utils.m.e("increaseFontSize")) {
            return;
        }
        int iIntValue = 3;
        if (a7()) {
            BookModel bookModel = this.M2;
            if (bookModel != null) {
                iIntValue = bookModel.getFontSize();
            }
        } else {
            iIntValue = ((Integer) t7.d(gh.b.q, 3)).intValue();
        }
        if (increase) {
            if (iIntValue == 7) {
                return;
            } else {
                iMax = Math.min(iIntValue + 1, 7);
            }
        } else if (iIntValue == 1) {
            return;
        } else {
            iMax = Math.max(iIntValue - 1, 1);
        }
        if (!a7()) {
            t7.j(gh.b.q, Integer.valueOf(iMax));
        }
        L7(iMax);
        S7(this.M5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N7() {
        this.b0.getItem(0).j3(this.T2, this.a0.L(), this.g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N8(int speed) {
        if (speed >= 20) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.EM));
                this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.r9);
            } else {
                this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.DM));
                this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.q9);
            }
        } else if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.lQ));
            this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
        } else {
            this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.CM));
            this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        }
        if (speed <= 1) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.P7));
                this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.r9);
                return;
            } else {
                this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.O7));
                this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.q9);
                return;
            }
        }
        if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kQ));
            this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
        } else {
            this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.N7));
            this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void O5() {
        if (this.s6 == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(10, getClass().getCanonicalName());
            this.s6 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int O6(@androidx.annotation.n0 List<ChapterM.Chapter> chapters, String chapterId) {
        if (com.zentraedi.basic.function.utils.j0.l(chapters)) {
            return -1;
        }
        for (int i2 = 0; i2 < chapters.size(); i2++) {
            ChapterM.Chapter chapter = chapters.get(i2);
            if (chapter.f985id.equals(chapterId)) {
                nd.a.e(com.zentraedi.reader.f.a, "indexOfSectionList " + chapter.toJsonStr());
                return i2;
            }
        }
        return -1;
    }

    private void O7(Typeface typeface) {
        if (typeface == null) {
            return;
        }
        this.Z.K.setTypeface(typeface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void O8(boolean isNight) {
        if (isNight) {
            com.zentraedi.basic.function.ui.statusbar.a.E(this, androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            com.zentraedi.basic.function.ui.statusbar.a.F(this, false);
        } else {
            com.zentraedi.basic.function.ui.statusbar.a.E(this, androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
            com.zentraedi.basic.function.ui.statusbar.a.F(this, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P5(final boolean isCloseAct) {
        this.Q2.U();
        this.Q2.L(this, this.M2, new a(isCloseAct));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void P6() {
        if (isFinishing() || this.M2 == null) {
            return;
        }
        t7.j(gh.b.P, Boolean.FALSE);
        this.T3 = ((Boolean) t7.d(gh.b.p, Boolean.TRUE)).booleanValue();
        com.zentraedi.outreader.viewmodel.b bVarC = p2.c(this).c(com.zentraedi.outreader.viewmodel.b.class);
        this.A4 = new d();
        this.M4 = new e();
        if (a7()) {
            w3();
        } else if (!TextUtils.isEmpty(this.M2.getNasFileName()) && this.M2.getNasFileName().toLowerCase().endsWith(".txt")) {
            w3();
            D7();
        }
        bVarC.M(this, this.m0, this.n0, new f());
        BookModel bookModel = this.M2;
        if (bookModel != null) {
            s8(bookModel.getAdd_shelf() == 1);
        }
        E8();
        z8();
        p8(0);
        if (!a7()) {
            this.Z.N.U5.setVisibility(0);
        }
        this.Z.N.n0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zentraedi.outreader.activity.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ZReaderActivity.k4(view, motionEvent);
            }
        });
        O7(this.J5.h(n6()));
        this.T = new com.zentraedi.outreader.business.c();
        B6();
    }

    private void P7() {
        this.Z.O.O.startAnimation(this.c0);
        this.Z.N.n0.startAnimation(this.e0);
        this.Z.O.O.setVisibility(0);
        this.Z.N.n0.setVisibility(0);
        this.Z.N.I5.setVisibility(0);
        this.Z.N.P.setVisibility(0);
        this.Z.N.B5.setVisibility(0);
        this.Z.N.P3.setVisibility(0);
        X5();
        if (this.Z.K.p1()) {
            k7();
        } else {
            j7();
        }
        if (X6()) {
            F8();
        }
        if (this.E5) {
            this.Z.N.A4.setVisibility(0);
        }
        if (!this.O5) {
            this.Z.N.T.setVisibility(0);
        }
        this.Z.N.j0.setVisibility(8);
        this.Z.N.D5.setVisibility(8);
        this.Z.N.E5.setVisibility(8);
        x7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void P8(int selectTheme, boolean needSaveSp) {
        if (Z6()) {
            return;
        }
        boolean z2 = this.D5;
        int iO6 = o6();
        int i2 = 0;
        if (iO6 == 5 && U6()) {
            if (needSaveSp) {
                t7.j(gh.b.z, 1);
                t7.j(gh.b.A, Boolean.FALSE);
            }
            z2 = false;
            iO6 = 1;
        }
        if (selectTheme == 1) {
            this.Z.N.r1.setSelected(true);
            this.Z.N.M1.setSelected(false);
            this.Z.N.a2.setSelected(false);
            if (z2) {
                this.Z.N.r1.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.d70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.y5));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
            } else {
                this.Z.N.r1.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.c70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.k7));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
            }
            this.Z.N.M1.setBackground(null);
            this.Z.N.a2.setBackground(null);
            if (needSaveSp) {
                t7.j(gh.b.y, 1);
                t7.j(gh.b.R, 1);
            }
        } else if (selectTheme == 2) {
            this.Z.N.r1.setSelected(false);
            this.Z.N.M1.setSelected(true);
            this.Z.N.a2.setSelected(false);
            this.Z.N.r1.setBackground(null);
            if (z2) {
                this.Z.N.M1.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.d70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.y5));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
            } else {
                this.Z.N.M1.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.c70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.k7));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
            }
            this.Z.N.a2.setBackground(null);
            if (needSaveSp) {
                t7.j(gh.b.y, 2);
                t7.j(gh.b.R, 2);
            }
            if (iO6 == 1) {
                i2 = com.zentraedi.outreader.d.h.VQ;
            } else if (iO6 == 2) {
                i2 = com.zentraedi.outreader.d.h.WQ;
            } else if (iO6 == 3) {
                i2 = com.zentraedi.outreader.d.h.SQ;
            } else if (iO6 == 4) {
                i2 = com.zentraedi.outreader.d.h.UQ;
            } else if (iO6 == 5) {
                i2 = com.zentraedi.outreader.d.h.TQ;
            }
        } else if (selectTheme == 3) {
            this.Z.N.r1.setSelected(false);
            this.Z.N.M1.setSelected(false);
            this.Z.N.a2.setSelected(true);
            this.Z.N.r1.setBackground(null);
            this.Z.N.M1.setBackground(null);
            if (z2) {
                this.Z.N.a2.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.d70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.h4));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.y5));
            } else {
                this.Z.N.a2.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.c70));
                this.Z.N.q6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
                this.Z.N.r6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.G3));
                this.Z.N.s6.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.k7));
            }
            if (needSaveSp) {
                t7.j(gh.b.y, 3);
            }
            if (iO6 == 1) {
                i2 = com.zentraedi.outreader.d.h.dT;
            } else if (iO6 == 2) {
                i2 = com.zentraedi.outreader.d.h.eT;
            } else if (iO6 == 3) {
                i2 = com.zentraedi.outreader.d.h.aT;
            } else if (iO6 == 4) {
                i2 = com.zentraedi.outreader.d.h.cT;
            } else if (iO6 == 5) {
                i2 = com.zentraedi.outreader.d.h.bT;
            }
        }
        String str = this.n0;
        BookModel bookModel = this.M2;
        String nasFileName = bookModel == null ? "" : bookModel.getNasFileName();
        BookModel bookModel2 = this.M2;
        this.Z.K.i2(d6(this, str, nasFileName, bookModel2 != null ? bookModel2.getBookType() : 1), i2);
    }

    private void Q5(boolean isCloseAct) {
        P5(isCloseAct);
    }

    private void Q6() {
        this.Z.F.setOnClickListener(this);
        this.Z.O.E.setOnClickListener(this);
        this.Z.O.G.setOnClickListener(this);
        this.Z.O.F.setOnClickListener(this);
        this.Z.O.H.setOnClickListener(this);
        this.Z.O.L.setOnClickListener(this);
        this.Z.O.J.setOnClickListener(this);
        this.Z.O.K.setOnClickListener(this);
        this.Z.N.x5.setOnClickListener(this);
        this.Z.N.W5.setOnClickListener(this);
        this.Z.N.c6.setOnClickListener(this);
        this.Z.N.b0.setOnClickListener(this);
        this.Z.N.y5.setOnClickListener(this);
        this.Z.N.E.setOnClickListener(this);
        this.Z.H.K.setOnClickListener(this);
        this.Z.N.A5.setOnClickListener(this);
        this.Z.N.z5.setOnClickListener(this);
        this.Z.N.G.setOnClickListener(this);
        this.Z.N.H5.setOnClickListener(this);
        this.Z.N.J5.setOnClickListener(this);
        this.Z.N.H.setOnClickListener(this);
        this.Z.N.F.setOnClickListener(this);
        this.Z.N.d0.setOnClickListener(this);
        this.Z.N.f0.setOnClickListener(this);
        this.Z.N.g0.setOnClickListener(this);
        this.Z.N.e0.setOnClickListener(this);
        this.Z.N.O.setOnClickListener(this);
        this.Z.N.N.setOnClickListener(this);
        this.Z.N.U5.setOnClickListener(this);
        this.Z.N.o6.setOnClickListener(this);
        this.Z.N.b6.setOnClickListener(this);
        this.Z.N.K5.setOnClickListener(this);
        this.Z.N.d6.setOnClickListener(this);
        this.Z.N.f6.setOnClickListener(this);
        this.Z.N.h6.setOnClickListener(this);
        this.Z.N.e6.setOnClickListener(this);
        this.Z.N.g6.setOnClickListener(this);
        this.Z.H.M.setOnClickListener(this);
        this.Z.N.i0.setOnClickListener(this);
        this.Z.N.h0.setOnClickListener(this);
        this.Z.N.L5.setOnClickListener(this);
        this.Z.N.M5.setOnClickListener(this);
        this.Z.N.m0.setOnClickListener(this);
        this.Z.N.S.setOnClickListener(this);
        this.Z.N.v5.setOnClickListener(this);
        this.Z.N.r1.setOnClickListener(this);
        this.Z.N.M1.setOnClickListener(this);
        this.Z.N.a2.setOnClickListener(this);
        this.Z.N.P2.setOnClickListener(this);
        this.Z.U.setOnTouchListener(new g());
        this.Z.R.setOnClickListener(this);
        this.Z.O.N.setOnClickListener(this);
        this.Z.Y.E.setOnClickListener(this);
        this.Z.Y.G.setOnClickListener(this);
        this.Z.H.T.addOnPageChangeListener(new h());
        this.Z.N.G5.setOnSeekBarChangeListener(new i());
        this.Z.K.setOnPageChangeListener(this);
        this.Z.K.setTouchListener(new j());
        this.Z.K.setOnTouchListener(new View.OnTouchListener() { // from class: com.zentraedi.outreader.activity.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ZReaderActivity.t4(this.a, view, motionEvent);
            }
        });
        this.Z.L.addDrawerListener(new l());
        this.Z.N.M2.setOnSeekBarChangeListener(new m());
    }

    private void Q7() {
        this.Z.N.Z.setSelected(true);
        this.Z.N.L.setSelected(false);
        this.Z.N.Y.setSelected(true);
        this.Z.N.W.setSelected(false);
        this.Z.N.B5.setVisibility(0);
        this.Z.O.O.setVisibility(0);
        this.Z.N.n0.setVisibility(0);
        this.Z.N.P3.setVisibility(8);
        j7();
        this.Z.N.A4.setVisibility(8);
        this.Z.N.j0.setVisibility(8);
        this.Z.N.D5.setVisibility(0);
        this.Z.N.E5.setVisibility(8);
        E8();
        X5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q8() {
        int iO6 = o6();
        if (iO6 == 5 && U6()) {
            iO6 = 1;
        }
        if (iO6 == 1) {
            this.Z.N.M.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.O60));
            this.Z.N.V.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.X60));
            this.Z.N.a0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.b70));
            return;
        }
        if (iO6 == 2) {
            this.Z.N.M.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.g70));
            this.Z.N.V.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.h70));
            this.Z.N.a0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.i70));
            return;
        }
        if (iO6 == 3) {
            this.Z.N.M.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.R60));
            this.Z.N.V.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.S60));
            this.Z.N.a0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.T60));
        } else if (iO6 == 4) {
            this.Z.N.M.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.Y60));
            this.Z.N.V.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.Z60));
            this.Z.N.a0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.a70));
        } else if (iO6 == 5) {
            this.Z.N.M.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.U60));
            this.Z.N.V.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.V60));
            this.Z.N.a0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.W60));
        }
    }

    private int R5(int mode) {
        int iIntValue = ((Integer) t7.d(gh.b.O, 11)).intValue();
        if (mode == 1) {
            if (iIntValue < 20) {
                iIntValue++;
                t7.j(gh.b.O, Integer.valueOf(iIntValue));
                o8(iIntValue);
                c8();
                return iIntValue;
            }
            return iIntValue;
        }
        if (mode == 2) {
            if (iIntValue > 1) {
                iIntValue--;
            }
            return iIntValue;
        }
        t7.j(gh.b.O, Integer.valueOf(iIntValue));
        o8(iIntValue);
        c8();
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R6() {
        if (this.c0 != null) {
            return;
        }
        this.c0 = AnimationUtils.loadAnimation(this, com.zentraedi.outreader.d.a.h1);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, com.zentraedi.outreader.d.a.i1);
        this.d0 = animationLoadAnimation;
        animationLoadAnimation.setAnimationListener(new n());
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this, com.zentraedi.outreader.d.a.d1);
        this.e0 = animationLoadAnimation2;
        animationLoadAnimation2.setAnimationListener(new o());
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(this, com.zentraedi.outreader.d.a.e1);
        this.f0 = animationLoadAnimation3;
        animationLoadAnimation3.setAnimationListener(new p());
        this.d0.setDuration(200L);
        this.f0.setDuration(200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R7() {
        String str = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Rw1) + this.M2.getShowName() + com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Sw1);
        final com.zentraedi.business.dialog.n nVar = new com.zentraedi.business.dialog.n(this);
        nVar.E(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Dq2)).s(str).w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.ax), new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderActivity.l4(this.a, nVar, view);
            }
        }).A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pz), new View.OnClickListener() { // from class: com.zentraedi.outreader.activity.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZReaderActivity.x4(this.a, nVar, view);
            }
        });
        nVar.show();
    }

    private void R8(boolean isNight, int pageMode, TextView title, TextView pageRoll, TextView pageCover, TextView pageSlide, TextView pageSimulation, TextView pageInanimate) {
        this.v6.d(a7(), isNight, pageMode, title, pageRoll, pageCover, pageSlide, pageSimulation, pageInanimate);
        this.Z.K.setPageMode(pageMode);
    }

    private void S5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w0(api = 21)
    private void S6(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT > 23) {
            getWindow().setStatusBarColor(0);
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        y6(savedInstanceState);
        this.O5 = ((Boolean) t7.d(gh.b.Q, Boolean.FALSE)).booleanValue();
        com.zentraedi.outreader.adapter.l lVar = new com.zentraedi.outreader.adapter.l(this, this.n0);
        this.a0 = lVar;
        lVar.U(((Integer) t7.d(gh.b.f0, 3)).intValue());
        this.a0.W(((Integer) t7.d(gh.b.g0, 0)).intValue());
        com.zentraedi.outreader.adapter.m mVar = new com.zentraedi.outreader.adapter.m(I2());
        this.b0 = mVar;
        this.Z.H.T.setAdapter(mVar);
        com.zentraedi.outreader.databinding.n0 n0Var = this.Z.H;
        n0Var.N.setViewPager(n0Var.T);
        this.Z.K.setAdapter(this.a0);
        this.Z.L.setDrawerLockMode(1);
        int iJ = com.zentraedi.basic.function.utils.b.j();
        this.K5 = iJ;
        if (iJ <= 0) {
            this.K5 = com.zentraedi.basic.function.utils.k0.a(this, 25);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Z.O.O.getLayoutParams();
        layoutParams.topMargin = this.K5;
        this.Z.O.O.setLayoutParams(layoutParams);
        org.greenrobot.eventbus.c.f().v(this);
        H6();
        p8(0);
        w3();
        this.L5 = false;
        this.Z.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zentraedi.outreader.activity.v
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ZReaderActivity.s4(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    public void S7(int pagePos) {
        String str;
        List<BookmarkEntity> list;
        if (this.Z.K.s1()) {
            X7();
            return;
        }
        u8(false, null);
        List<ChapterM.Chapter> list2 = this.T2;
        if (list2 == null || com.zentraedi.basic.function.utils.j0.l(list2)) {
            str = "";
        } else {
            int size = this.T2.size();
            int i2 = this.W;
            if (size > i2) {
                str = this.T2.get(i2).f985id;
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str) || (list = this.u5) == null || com.zentraedi.basic.function.utils.j0.l(list)) {
            return;
        }
        String strT0 = this.Z.K.T0(pagePos);
        String strU0 = this.Z.K.U0(pagePos);
        if (TextUtils.isEmpty(strT0) || TextUtils.isEmpty(strU0)) {
            u8(false, null);
            return;
        }
        int iIndexOf = this.a0.s(this.W).indexOf(strT0);
        int iIndexOf2 = this.a0.s(this.W).indexOf(strU0);
        for (int i3 = 0; i3 < this.u5.size(); i3++) {
            int position = this.u5.get(i3).getPosition();
            String chapterId = this.u5.get(i3).getChapterId();
            if (!TextUtils.isEmpty(chapterId) && chapterId.equals(str)) {
                if (iIndexOf <= position && position < strU0.length() + iIndexOf2) {
                    u8(true, this.u5.get(i3));
                    return;
                }
                u8(false, null);
            }
        }
    }

    private void T5() {
        this.Z.N.n0.startAnimation(this.e0);
        this.Z.O.O.setVisibility(8);
        this.Z.N.n0.setVisibility(0);
        this.Z.N.I5.setVisibility(0);
        this.Z.N.P.setVisibility(0);
        this.Z.N.B5.setVisibility(8);
        j7();
        this.Z.N.A4.setVisibility(8);
        this.Z.N.D5.setVisibility(8);
        this.Z.N.E5.setVisibility(8);
        this.Z.N.j0.setVisibility(0);
    }

    private boolean T6(String state) {
        return gh.b.c.equals(state) || gh.b.d.equals(state) || gh.b.e.equals(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T7(String state) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void U5() {
        G6();
        this.Z.K.setVisibility(0);
        this.Z.O.U.setOnClickListener(this);
        if (this.D5) {
            this.Z.O.U.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.qI), (Drawable) null);
        } else {
            this.Z.O.U.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.pI), (Drawable) null);
        }
        this.Q2.M(this, com.zentraedi.outreader.util.h.a(), this.m0, this.T2, this.M4);
    }

    private void U7() {
    }

    private boolean V6() {
        return this.Z.N.n0.getVisibility() == 0;
    }

    @SuppressLint({"SetTextI18n"})
    private void V7(String title, String desc) {
    }

    private boolean W6() {
        return this.Z.O.O.getVisibility() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void W7() {
        if (this.d0 == null || this.f0 == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        if (((Boolean) t7.d(gh.b.P, bool)).booleanValue()) {
            T5();
        } else {
            getWindow().clearFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            P7();
        }
        b8();
        O8(((Boolean) t7.d(gh.b.A, bool)).booleanValue());
        z7();
        com.zentraedi.basic.function.utils.k0.x(this.Z.R, true);
    }

    private void X5() {
        if (this.M2 != null || X6()) {
            this.Z.O.I.setVisibility(8);
        } else if (((Boolean) t7.d(gh.b.Y, Boolean.FALSE)).booleanValue()) {
            this.Z.O.I.setVisibility(8);
        } else {
            this.Z.O.I.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private void X7() {
        String str;
        u8(false, null);
        List<ChapterM.Chapter> list = this.T2;
        if (list == null || com.zentraedi.basic.function.utils.j0.l(list)) {
            str = "";
        } else {
            int size = this.T2.size();
            int i2 = this.W;
            if (size > i2) {
                str = this.T2.get(i2).f985id;
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<BookmarkEntity> list2 = this.u5;
        if (com.zentraedi.basic.function.utils.j0.l(list2)) {
            return;
        }
        int iH = this.Z.K.getCurrentPage().h();
        for (BookmarkEntity bookmarkEntity : list2) {
            if (this.W == bookmarkEntity.getChapterIndex() && iH == bookmarkEntity.getPosition()) {
                u8(true, bookmarkEntity);
                return;
            }
        }
    }

    private void Y5(List<LocalPdfBookModel.LocalPdfChapter> localPdfChapterList) {
        if (localPdfChapterList == null) {
            return;
        }
        this.T2 = new ArrayList();
        int i2 = 0;
        for (LocalPdfBookModel.LocalPdfChapter localPdfChapter : localPdfChapterList) {
            ChapterM.Chapter chapter = new ChapterM.Chapter();
            chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
            chapter.name = p6(localPdfChapter.getLevel()) + localPdfChapter.getTitle();
            chapter.f985id = i2 + "";
            chapter.isCache = true;
            chapter.page = localPdfChapter.getPage();
            this.T2.add(chapter);
            i2++;
        }
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list)) {
            this.Z.N.M2.setMax(this.T2.size() - 1);
        }
        N7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y6() {
        BookModel bookModel = this.M2;
        return bookModel != null && bookModel.getBookType() == 5;
    }

    private void Y7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z5(List<LocalTxtBookModel.LocalTxtChapterModel> localChapterList) {
        this.T2 = new ArrayList();
        for (LocalTxtBookModel.LocalTxtChapterModel localTxtChapterModel : localChapterList) {
            ChapterM.Chapter chapter = new ChapterM.Chapter();
            chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
            chapter.name = localTxtChapterModel.getName();
            chapter.f985id = localTxtChapterModel.getChapterId();
            chapter.words = com.zentraedi.outreader.util.d.l(Long.valueOf(localTxtChapterModel.getWords()));
            chapter.isCache = true;
            this.T2.add(chapter);
        }
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list)) {
            this.Z.N.M2.setMax(this.T2.size() - 1);
        }
        N7();
    }

    private void Z7(int tryMode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a6() {
        com.zentraedi.basic.function.ui.toast.a.z(this, getString(com.zentraedi.outreader.d.q.wA2));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a8() {
        ZReaderTypefaceActivity.c0.a(this, n6(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b6() {
        com.zentraedi.basic.component.handler.a aVar = this.P3;
        if (aVar != null) {
            aVar.postDelayed(new c(), 200L);
        }
    }

    private boolean b7() {
        com.zentraedi.outreader.databinding.c cVar = this.Z;
        if (cVar.L.isDrawerOpen(cVar.I) || W6() || V6()) {
            return true;
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = this.j6;
        return bVar != null && bVar.isShowing();
    }

    private void b8() {
    }

    private boolean c7() {
        com.zentraedi.reader.reader.m mVar = this.A3;
        return (mVar == null || mVar.o() == -1 || this.A3.o() == -2 || this.A3.o() == -3) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c8() {
        if (((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue() && this.Z.K.p1() && !b7()) {
            if (this.e6 == null) {
                this.e6 = new Timer();
            }
            TimerTask timerTask = this.f6;
            if (timerTask != null) {
                timerTask.cancel();
                this.f6 = null;
            }
            if (this.B5 == 2) {
                this.g6 = com.zentraedi.outreader.util.f.a(((Integer) t7.d(gh.b.O, 11)).intValue());
            }
            b bVar = new b();
            this.f6 = bVar;
            if (this.B5 == 2) {
                this.e6.schedule(bVar, 300L, 40L);
                return;
            }
            long jB = com.zentraedi.outreader.util.f.b(((Integer) t7.d(gh.b.O, 11)).intValue());
            this.e6.schedule(this.f6, jB, jB);
        }
    }

    public static int d6(Context context, String sourceId, String bookName, int bookType) {
        boolean z2 = IdentifierConstant.OAID_STATE_DEFAULT.equals(sourceId) && !TextUtils.isEmpty(bookName) && bookName.toLowerCase().endsWith(".pdf");
        boolean z3 = bookType == 4;
        if (z2 || z3) {
            return androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.f731qd);
        }
        if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            return (IdentifierConstant.OAID_STATE_DEFAULT.equals(sourceId) && !TextUtils.isEmpty(bookName) && (bookName.toLowerCase().endsWith(".epub") || MobiUtilBusiness.INSTANCE.isMobi(bookName))) ? androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.f731qd) : androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.r2);
        }
        int iO6 = o6();
        if (iO6 == 2) {
            return androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.f721id);
        }
        if (iO6 == 3) {
            return androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.f715gd);
        }
        if (iO6 != 4) {
            return iO6 != 5 ? androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.f731qd) : androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.Hc);
        }
        return androidx.core.content.e.g(context, com.zentraedi.outreader.d.f.Qa);
    }

    private boolean d7() {
        return this.Z.K.getCurrentPage() != null && this.Z.K.getCurrentPage().o() == 3;
    }

    private void d8() {
        this.Z.K.O1();
    }

    private boolean e7() {
        return !(this.U instanceof CourseFileInfoModel) && this.M2 != null && "FILE_MANAGE".equals(this.P2) && this.M2.getAdd_shelf() == 0;
    }

    private void e8() {
    }

    private void f7(long intervalInMs) {
        if (intervalInMs == -1) {
            return;
        }
        O5();
        if (intervalInMs != 0) {
            this.P3.removeCallbacks(this.t6);
            this.P3.postDelayed(this.t6, intervalInMs);
        }
    }

    private void f8(boolean isNight, int pageMode) {
        if (((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
            r0 r0Var = this.Z.N;
            m8(isNight, pageMode, r0Var.O5, r0Var.M5, r0Var.L5);
        } else {
            r0 r0Var2 = this.Z.N;
            I8(isNight, pageMode, r0Var2.t6, r0Var2.f6, r0Var2.d6, r0Var2.h6, r0Var2.g6, r0Var2.e6);
        }
        this.B5 = pageMode;
    }

    public static void g7(Context context, FileInfoModel bookInfoModel, String from) {
        if (bookInfoModel == null) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Jw1), false);
            return;
        }
        String path = bookInfoModel.getPath();
        if (bookInfoModel instanceof CourseFileInfoModel) {
            path = bookInfoModel.getLocalPath();
        }
        if (!com.zentraedi.business.reader.m.a(path)) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Kw1), false);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) NewZReaderActivity.class);
        intent.putExtra(A6, (Serializable) bookInfoModel);
        intent.putExtra(B6, from);
        context.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g8() {
        this.Q2.O(this, this.m0, new b0());
    }

    private int h6() {
        if (!this.Z.K.s1()) {
            if (this.Z.K.getCurrentPage() != null) {
                return this.Z.K.getCurrentPage().m();
            }
            return -1;
        }
        com.zentraedi.reader.reader.m currentPage = this.Z.K.getCurrentPage();
        if (currentPage != null) {
            return currentPage.h();
        }
        return -1;
    }

    public static void h7(Context context, BookModel entity, String from) {
        if (entity == null) {
            nd.a.c(z6, "launchAct bookEntity is null");
            return;
        }
        FileInfoModel fileInfoModel = new FileInfoModel();
        fileInfoModel.setPath(entity.getNasPath());
        fileInfoModel.setName(entity.getNasFileName());
        fileInfoModel.setModifyTimeValue(Long.valueOf(entity.getTime()));
        LocalReaderManager.m().y(entity);
        com.zentraedi.outreader.v2.local.a.j().t(entity);
        g7(context, fileInfoModel, from);
    }

    private void h8() {
        this.Z.N.Z.setSelected(false);
        this.Z.N.L.setSelected(true);
        this.Z.N.B5.setVisibility(0);
        this.Z.O.O.setVisibility(0);
        this.Z.N.n0.setVisibility(0);
        this.Z.N.P3.setVisibility(8);
        j7();
        this.Z.N.A4.setVisibility(8);
        this.Z.N.j0.setVisibility(8);
        this.Z.N.E5.setVisibility(0);
        this.Z.N.a2.setVisibility(0);
        this.Z.N.D5.setVisibility(8);
        E8();
        X5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void i7(boolean isSystemBrightnessSelect, boolean isNight) {
        if (isNight) {
            this.Z.N.o6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            Drawable drawableL = androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.uV);
            if (drawableL != null) {
                drawableL.setBounds(0, 0, drawableL.getMinimumWidth(), drawableL.getMinimumHeight());
                this.Z.N.o6.setCompoundDrawables(drawableL, null, null, null);
            }
        } else {
            this.Z.N.o6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o0));
            Drawable drawableL2 = androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.tV);
            if (drawableL2 != null) {
                drawableL2.setBounds(0, 0, drawableL2.getMinimumWidth(), drawableL2.getMinimumHeight());
                this.Z.N.o6.setCompoundDrawables(drawableL2, null, null, null);
            }
        }
        this.Z.N.o6.setSelected(true);
        this.Z.N.o6.setSelected(isSystemBrightnessSelect);
    }

    private int j6(int fontSizeLevel) {
        return ((fontSizeLevel * 4) + 13) * 2;
    }

    private void j7() {
        this.Z.N.v5.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j8(int from, int height) {
        this.r6 = true;
        if (this.Z.Q.getVisibility() == 0) {
            height += D6;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.Z.K, "translationY", from, height);
        if (from == 0) {
            objectAnimatorOfFloat.setDuration(300L);
        } else {
            objectAnimatorOfFloat.setDuration(0L);
        }
        objectAnimatorOfFloat.start();
    }

    public static /* synthetic */ boolean k4(View view, MotionEvent motionEvent) {
        return true;
    }

    private String k6() {
        if (com.zentraedi.basic.function.utils.j0.l(this.T2)) {
            return "";
        }
        List<ChapterM.Chapter> list = this.T2;
        if (list.get(list.size() - 1) == null) {
            return "";
        }
        List<ChapterM.Chapter> list2 = this.T2;
        return list2.get(list2.size() - 1).name;
    }

    private void k7() {
        if (this.D5) {
            this.Z.N.S.setBackgroundResource(com.zentraedi.outreader.d.h.f5);
        } else {
            this.Z.N.S.setBackgroundResource(com.zentraedi.outreader.d.h.T8);
        }
        this.Z.N.v5.setVisibility(0);
        this.Z.N.w5.setVisibility(8);
        this.Z.N.S.setVisibility(8);
        if (this.H5) {
            this.Z.N.v5.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l4(ZReaderActivity zReaderActivity, com.zentraedi.business.dialog.n nVar, View view) {
        zReaderActivity.getClass();
        nVar.dismiss();
        zReaderActivity.finish();
    }

    private List<String> l6(int chapter, int offset) {
        ArrayList arrayList = new ArrayList();
        if (this.a0.M(chapter) != null && TextUtils.isEmpty(this.a0.d(chapter))) {
            arrayList.add(this.T2.get(chapter).f985id);
        }
        if (offset > 0) {
            for (int i2 = 0; i2 < offset; i2++) {
                int i3 = chapter + i2 + 1;
                if (i3 >= this.T2.size()) {
                    break;
                }
                if (this.a0.M(i3) != null && TextUtils.isEmpty(this.a0.d(i3))) {
                    arrayList.add(this.T2.get(i3).f985id);
                }
            }
            for (int i4 = 0; i4 < offset; i4++) {
                int i5 = (chapter - i4) - 1;
                if (i5 < 0) {
                    break;
                }
                if (this.a0.M(i5) != null && TextUtils.isEmpty(this.a0.d(i5))) {
                    arrayList.add(this.T2.get(i5).f985id);
                }
            }
        }
        return arrayList;
    }

    private void l7(final String filePath) {
        wd.b.b().a(new Callable() { // from class: com.zentraedi.outreader.activity.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ZReaderActivity.r4(this.a, filePath);
            }
        }, new q());
    }

    private void l8() {
        if (this.Z.H.J.getChildCount() > 0) {
            for (int i2 = 0; i2 < this.Z.H.J.getChildCount(); i2++) {
                if (this.D5) {
                    if (this.Z.H.J.getChildAt(i2) instanceof TextView) {
                        ((TextView) this.Z.H.J.getChildAt(i2)).setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.L7));
                    } else if (this.Z.H.J.getChildAt(i2) instanceof ImageView) {
                        ((ImageView) this.Z.H.J.getChildAt(i2)).setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.c8));
                    }
                } else if (this.Z.H.J.getChildAt(i2) instanceof TextView) {
                    ((TextView) this.Z.H.J.getChildAt(i2)).setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.D4));
                } else if (this.Z.H.J.getChildAt(i2) instanceof ImageView) {
                    ((ImageView) this.Z.H.J.getChildAt(i2)).setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.b8));
                }
            }
        }
    }

    public static /* synthetic */ void m4(ZReaderActivity zReaderActivity, int i2) {
        zReaderActivity.getClass();
        if (i2 == 0) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Iy1));
            return;
        }
        if (i2 == 2) {
            FileInfoModel fileInfoModel = zReaderActivity.U;
            if (!(fileInfoModel instanceof CourseFileInfoModel)) {
                fileInfoModel.setLocalPath(com.zentraedi.business.reader.c.f(fileInfoModel));
            }
            zReaderActivity.u7();
            return;
        }
        if (i2 == 1) {
            nd.a.e(z6, "Begin Download Into Cache");
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Rz2));
        } else if (i2 == 3) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Iy1));
        }
    }

    private int m6() {
        Iterator<String> it = this.P5.keySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = this.P5.get(it.next());
            if (num != null) {
                iIntValue += num.intValue();
            }
        }
        this.P5.clear();
        return iIntValue;
    }

    private void m8(boolean isNight, int pageMode, TextView title, TextView pageRoll, TextView pageCover) {
        R8(isNight, pageMode, title, pageRoll, pageCover, null, null, null);
    }

    private String n6() {
        return ReaderUtils.a.j("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n8() {
        if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            this.Z.N.I.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.M2));
            this.Z.N.j0.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
            this.Z.N.N5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kQ));
            this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.lQ));
            this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
            this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
            this.Z.N.n6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.l6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E5));
            this.Z.N.l6.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.RR), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.Z.N.I.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.xc));
            this.Z.N.j0.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.du));
            this.Z.N.N5.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
            this.Z.N.h0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.N7));
            this.Z.N.i0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.CM));
            this.Z.N.h0.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
            this.Z.N.i0.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
            this.Z.N.n6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
            this.Z.N.l6.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.J1));
            this.Z.N.l6.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.QR), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        o8(((Integer) t7.d(gh.b.O, 11)).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o4(ZReaderActivity zReaderActivity) {
        if (zReaderActivity.isFinishing() || !zReaderActivity.A5) {
            return;
        }
        zReaderActivity.c8();
    }

    private static int o6() {
        return ((Integer) t7.d(gh.b.z, 2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o7(int chapter, int bookmarkPos) {
        this.Z.M.I.setVisibility(8);
        this.W = chapter;
        this.Z.K.I1(chapter, bookmarkPos, w7());
        this.Z.L.closeDrawers();
        H6();
        c8();
        Y7();
    }

    private void o8(int speedMode) {
        N8(speedMode);
        this.Z.N.n6.setText(String.valueOf(speedMode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p4(ZReaderActivity zReaderActivity) {
        if (zReaderActivity.isFinishing() || !zReaderActivity.A5) {
            return;
        }
        com.zentraedi.basic.function.ui.toast.a.y(zReaderActivity, com.zentraedi.outreader.d.q.ID2);
    }

    private String p6(int level) {
        if (level <= 0) {
            return "";
        }
        return "    " + p6(level - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p7(int chapter, int page, int type, final float chapterPercent) {
        this.Z.M.I.setVisibility(8);
        this.W = chapter;
        this.Z.K.G1(chapter, page, w7(), chapterPercent);
        this.Z.L.closeDrawers();
        if (type != 1 && type != 3) {
            H6();
        }
        c8();
        Y7();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x031d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0320  */
    /* JADX WARN: Code duplicated, block: B:89:0x0329  */
    /* JADX WARN: Code duplicated, block: B:92:0x033a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0342  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void p8(int bgColor) {
        int i2;
        int i3;
        int i4;
        int i5;
        BookModel bookModel;
        String nasFileName;
        int iD6;
        if (bgColor == 0) {
            bgColor = o6();
        }
        int i6 = 0;
        if (Z6()) {
            bgColor = 0;
        }
        if (bgColor == 5 && U6()) {
            bgColor = 0;
        }
        this.h6 = bgColor;
        if (bgColor == 1) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.h.l4);
            } else {
                this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
            }
            this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.S4);
            t7.j(gh.b.z, 1);
            if (this.Z.N.M1.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.VQ;
                i2 = com.zentraedi.outreader.d.h.G5;
            } else if (this.Z.N.a2.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.dT;
                i2 = com.zentraedi.outreader.d.h.G5;
            } else {
                i2 = 0;
            }
            i3 = com.zentraedi.outreader.d.f.B8;
        } else if (bgColor == 2) {
            this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.h.l4);
            } else {
                this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
            }
            this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.T4);
            t7.j(gh.b.z, 2);
            if (this.Z.N.M1.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.WQ;
                i2 = com.zentraedi.outreader.d.h.H5;
            } else if (this.Z.N.a2.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.eT;
                i2 = com.zentraedi.outreader.d.h.H5;
            } else {
                i2 = 0;
            }
            i3 = com.zentraedi.outreader.d.f.T7;
        } else if (bgColor == 3) {
            this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.h.l4);
            } else {
                this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
            }
            this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.R4);
            t7.j(gh.b.z, 3);
            if (this.Z.N.M1.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.SQ;
                i2 = com.zentraedi.outreader.d.h.E5;
            } else if (this.Z.N.a2.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.aT;
                i2 = com.zentraedi.outreader.d.h.E5;
            } else {
                i2 = 0;
            }
            i3 = com.zentraedi.outreader.d.f.X7;
        } else {
            if (bgColor != 4) {
                if (bgColor != 5) {
                    this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
                    this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    i5 = com.zentraedi.outreader.d.f.T7;
                    i4 = 0;
                } else {
                    this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
                    if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                        this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.h.l4);
                    } else {
                        this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
                    }
                    this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.Q4);
                    t7.j(gh.b.z, 5);
                    if (this.Z.N.M1.isSelected()) {
                        i6 = com.zentraedi.outreader.d.h.TQ;
                    } else if (this.Z.N.a2.isSelected()) {
                        i6 = com.zentraedi.outreader.d.h.bT;
                    }
                    i2 = com.zentraedi.outreader.d.f.X1;
                    i3 = com.zentraedi.outreader.d.f.c5;
                    t7.j(gh.b.A, Boolean.TRUE);
                }
                Q8();
                String str = this.n0;
                bookModel = this.M2;
                if (bookModel == null) {
                    nasFileName = "";
                } else {
                    nasFileName = bookModel.getNasFileName();
                }
                BookModel bookModel2 = this.M2;
                iD6 = d6(this, str, nasFileName, bookModel2 != null ? bookModel2.getBookType() : 1);
                this.Z.K.i2(iD6, i6);
                if (i4 == 0) {
                    this.Z.Q.setBackgroundColor(iD6);
                } else {
                    this.Z.Q.setBackgroundResource(i4);
                }
                this.Z.V.setTextColor(com.zentraedi.basic.function.utils.a.d(i5));
            }
            this.Z.N.G.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.H5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.N.J5.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.h.l4);
            } else {
                this.Z.N.H.setBackgroundResource(com.zentraedi.outreader.d.h.k4);
            }
            this.Z.N.F.setBackgroundResource(com.zentraedi.outreader.d.f.oz);
            this.Z.K.setHighLightColor(com.zentraedi.outreader.d.f.U4);
            t7.j(gh.b.z, 4);
            if (this.Z.N.M1.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.UQ;
                i2 = com.zentraedi.outreader.d.h.F5;
            } else if (this.Z.N.a2.isSelected()) {
                i6 = com.zentraedi.outreader.d.h.cT;
                i2 = com.zentraedi.outreader.d.h.F5;
            } else {
                i2 = 0;
            }
            i3 = com.zentraedi.outreader.d.f.m8;
        }
        int i7 = i3;
        i4 = i2;
        i5 = i7;
        Q8();
        String str2 = this.n0;
        bookModel = this.M2;
        if (bookModel == null) {
            nasFileName = "";
        } else {
            nasFileName = bookModel.getNasFileName();
        }
        BookModel bookModel3 = this.M2;
        iD6 = d6(this, str2, nasFileName, bookModel3 != null ? bookModel3.getBookType() : 1);
        this.Z.K.i2(iD6, i6);
        if (i4 == 0) {
            this.Z.Q.setBackgroundColor(iD6);
        } else {
            this.Z.Q.setBackgroundResource(i4);
        }
        this.Z.V.setTextColor(com.zentraedi.basic.function.utils.a.d(i5));
    }

    public static /* synthetic */ q3 q4(View view, View view2, q3 q3Var) {
        androidx.core.graphics.d0 d0VarF = q3Var.f(q3.p.i() | q3.p.c());
        view.getLayoutParams();
        view.setPadding(0, d0VarF.b, 0, 0);
        return q3Var;
    }

    private int q6() {
        int iLongValue = (int) (((((((Long) t7.d(gh.b.Z, 0L)).longValue() - System.currentTimeMillis()) / 1000) / 3600) / 24) + 1);
        if (iLongValue < 0) {
            return 0;
        }
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q7(int chapter, int textPosition, int type) {
        this.Z.M.I.setVisibility(8);
        this.W = chapter;
        this.Z.K.I1(chapter, textPosition, w7());
        this.Z.L.closeDrawers();
        if (type != 1) {
            H6();
        }
        c8();
        Y7();
    }

    private void q8() {
        this.Z.N.G.setImageResource(com.zentraedi.outreader.d.h.p9);
        this.Z.N.H5.setImageResource(com.zentraedi.outreader.d.h.t9);
        this.Z.N.J5.setImageResource(com.zentraedi.outreader.d.h.x9);
        this.Z.N.H.setImageResource(com.zentraedi.outreader.d.h.z9);
        this.Z.N.F.setAlpha(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentData r4(ZReaderActivity zReaderActivity, String str) {
        zReaderActivity.getClass();
        DocumentData documentData = new DocumentData();
        Document documentOpenDocument = Document.openDocument(str);
        com.artifex.mupdf.fitz.Context.setUserCSS(com.zentraedi.reader.pdf.g.a(false));
        com.artifex.mupdf.fitz.Context.useDocumentCSS(true);
        BookModel bookModel = zReaderActivity.M2;
        int fontSize = bookModel == null ? 3 : bookModel.getFontSize();
        int i2 = fontSize != 0 ? fontSize : 3;
        zReaderActivity.y8(i2);
        zReaderActivity.Z.N.V5.setText("" + i2);
        documentOpenDocument.layout((float) com.zentraedi.basic.function.utils.k0.m(zReaderActivity), ((float) com.zentraedi.basic.function.utils.k0.j(zReaderActivity)) - 80.0f, (float) zReaderActivity.j6(i2));
        if (documentOpenDocument.isReflowable()) {
            zReaderActivity.Z.N.Q4.setVisibility(0);
        } else {
            zReaderActivity.Z.N.Q4.setVisibility(8);
        }
        documentData.countPages = documentOpenDocument.countPages();
        documentData.mDocument = documentOpenDocument;
        String str2 = zReaderActivity.m0;
        boolean zX6 = zReaderActivity.X6();
        String strA = com.zentraedi.outreader.util.h.a();
        String str3 = zReaderActivity.n0;
        if (zX6) {
            strA = com.zentraedi.outreader.util.h.a();
            str3 = IdentifierConstant.OAID_STATE_DEFAULT;
        }
        List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(documentOpenDocument);
        BookChapterEntity bookChapterEntityW = zReaderActivity.Q2.W(strA, str2, str3);
        String json = com.zentraedi.basic.component.utils.a.b().toJson(listA);
        if (bookChapterEntityW == null) {
            BookChapterEntity bookChapterEntity = new BookChapterEntity();
            bookChapterEntity.setBookId(str2);
            bookChapterEntity.setSourceId(str3);
            bookChapterEntity.setUserId(strA);
            bookChapterEntity.setChapterList(json);
            ReaderDatabase.A().t().c(bookChapterEntity);
        } else {
            ReaderDatabase.A().t().g(strA, str2, str3, json);
        }
        documentData.localPdfChapterList = listA;
        return documentData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r8() {
        if (!isFinishing() && this.Z.Y.getRoot().getVisibility() == 0) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                com.zentraedi.basic.function.ui.statusbar.a.E(this, androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.D2));
                com.zentraedi.basic.function.ui.statusbar.a.F(this, false);
                this.Z.Y.H.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.H2));
                this.Z.Y.K.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.A5));
                this.Z.Y.I.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.E3));
                this.Z.Y.J.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K6));
                return;
            }
            com.zentraedi.basic.function.ui.statusbar.a.E(this, androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.f731qd));
            com.zentraedi.basic.function.ui.statusbar.a.F(this, true);
            this.Z.Y.H.setBackgroundColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.db));
            this.Z.Y.K.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.K3));
            this.Z.Y.I.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.o7));
            this.Z.Y.J.setTextColor(androidx.core.content.e.g(this, com.zentraedi.outreader.d.f.db));
        }
    }

    public static /* synthetic */ void s4(final ZReaderActivity zReaderActivity) {
        com.zentraedi.basic.component.handler.a aVar = zReaderActivity.P3;
        if (aVar == null) {
            return;
        }
        aVar.postDelayed(new Runnable() { // from class: com.zentraedi.outreader.activity.a0
            @Override // java.lang.Runnable
            public final void run() {
                ZReaderActivity.v4(this.a);
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void s7() {
        if (W6() || V6()) {
            i8();
        }
        BookModel bookModel = this.M2;
        if (bookModel != null) {
            com.zentraedi.outreader.wrapper.b.c(bookModel);
            if (a7()) {
                ImageProxy.H(this, this.M2.getCover(), this.Z.H.E);
            } else {
                this.Z.H.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.kj));
            }
            this.Z.H.R.setText(this.M2.getNasFileName());
            this.Z.H.L.setVisibility(0);
            com.zentraedi.outreader.databinding.c cVar = this.Z;
            cVar.H.P.setText(com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.Oz2, cVar.K.getContentProgress()));
            this.Z.H.S.setVisibility(0);
            this.Z.H.I.setVisibility(8);
            this.Z.H.H.setText(com.zentraedi.basic.function.utils.m.e(com.zentraedi.outreader.d.q.xC2, "num", Integer.valueOf(this.T2.size())));
        }
        if (isFinishing() || com.zentraedi.basic.function.utils.j0.l(this.T2)) {
            return;
        }
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list) && this.T2.size() > this.W) {
            try {
                if (a7()) {
                    this.b0.getItem(0).o3(this.T2.get(this.W));
                } else {
                    this.b0.getItem(0).m3(this.a0.L(), this.T2.get(this.W).f985id);
                }
            } catch (Exception unused) {
            }
        }
        com.zentraedi.outreader.databinding.c cVar2 = this.Z;
        cVar2.L.openDrawer(cVar2.I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s8(boolean isBookCollect) {
        this.Z.O.F.setSelected(isBookCollect);
    }

    public static /* synthetic */ boolean t4(ZReaderActivity zReaderActivity, View view, MotionEvent motionEvent) {
        if (!zReaderActivity.W6() && !zReaderActivity.V6()) {
            return false;
        }
        zReaderActivity.i8();
        return true;
    }

    private void t7() {
        this.Z.N.Y.setSelected(false);
        this.Z.N.W.setSelected(true);
        this.Z.N.B5.setVisibility(0);
        this.Z.O.O.setVisibility(0);
        this.Z.N.n0.setVisibility(0);
        this.Z.N.P3.setVisibility(8);
        j7();
        this.Z.N.A4.setVisibility(8);
        this.Z.N.j0.setVisibility(8);
        this.Z.N.E5.setVisibility(0);
        if (Z6()) {
            this.Z.N.a1.setVisibility(8);
            this.Z.N.A3.setVisibility(8);
        }
        this.Z.N.F.setVisibility(8);
        this.Z.N.D5.setVisibility(8);
        E8();
        X5();
    }

    private void t8(BookEntity bookEntity) {
        com.zentraedi.outreader.viewmodel.f fVar;
        if (bookEntity == null || (fVar = this.Q2) == null) {
            return;
        }
        fVar.S(com.zentraedi.basic.function.utils.a.a(), bookEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object u4(ZReaderActivity zReaderActivity, int i2) {
        zReaderActivity.Z.K.getDocument().layout(com.zentraedi.basic.function.utils.k0.m(zReaderActivity), com.zentraedi.basic.function.utils.k0.j(zReaderActivity) - 80.0f, zReaderActivity.j6(i2));
        zReaderActivity.Z.K.setCountPages(zReaderActivity.Z.K.getDocument().countPages());
        zReaderActivity.Z.K.P0();
        zReaderActivity.Z.K.f2(com.zentraedi.reader.pdf.e.a(zReaderActivity.Z.K.getDocument()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void u6(final boolean isCloseAct) {
        this.M2.setAdd_shelf(0);
        if (!isCloseAct) {
            c8();
        } else {
            this.c6 = true;
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u7() {
        LocalReaderManager.m().A(this, this.U, new z());
    }

    private void u8(boolean isBookmark, BookmarkEntity bookmark) {
        if (isBookmark) {
            this.Z.O.H.setSelected(true);
            this.Z.O.H.setTag(bookmark);
            return;
        }
        BookmarkEntity bookmarkEntity = (BookmarkEntity) this.Z.O.H.getTag();
        if (bookmark == null || bookmarkEntity == null) {
            this.Z.O.H.setSelected(false);
            this.Z.O.H.setTag(null);
        } else if (bookmark.getPosition() == bookmarkEntity.getPosition()) {
            this.Z.O.H.setSelected(false);
            this.Z.O.H.setTag(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v4(ZReaderActivity zReaderActivity) {
        zReaderActivity.getClass();
        if (!com.zentraedi.basic.function.utils.b.o(zReaderActivity)) {
            if (zReaderActivity.S5) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) zReaderActivity.Z.N.n0.getLayoutParams();
                layoutParams.bottomMargin = 0;
                zReaderActivity.Z.N.n0.setLayoutParams(layoutParams);
                zReaderActivity.S5();
                if (zReaderActivity.Z.N.E5.getVisibility() == 0) {
                    int i2 = -(zReaderActivity.Z.N.E5.getHeight() + zReaderActivity.Z.N.C5.getHeight());
                    zReaderActivity.j8(i2, com.zentraedi.basic.function.utils.b.i() + i2);
                } else if (zReaderActivity.Z.N.D5.getVisibility() == 0) {
                    int i3 = -(zReaderActivity.Z.N.D5.getHeight() + zReaderActivity.Z.N.C5.getHeight());
                    zReaderActivity.j8(i3, com.zentraedi.basic.function.utils.b.i() + i3);
                }
            }
            zReaderActivity.S5 = false;
            return;
        }
        if (!zReaderActivity.S5) {
            int i4 = com.zentraedi.basic.function.utils.b.i();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) zReaderActivity.Z.N.n0.getLayoutParams();
            layoutParams2.bottomMargin = i4;
            zReaderActivity.Z.N.n0.setLayoutParams(layoutParams2);
            zReaderActivity.S5();
            if (zReaderActivity.Z.N.E5.getVisibility() == 0) {
                int i5 = -(zReaderActivity.Z.N.E5.getHeight() + zReaderActivity.Z.N.C5.getHeight());
                zReaderActivity.j8(i5, i5 - i4);
            } else if (zReaderActivity.Z.N.D5.getVisibility() == 0) {
                int i6 = -(zReaderActivity.Z.N.D5.getHeight() + zReaderActivity.Z.N.C5.getHeight());
                zReaderActivity.j8(i6, i6 - i4);
            }
        }
        zReaderActivity.S5 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void v6(final boolean isCloseAct) {
        this.M2.setAdd_shelf(1);
        if (this.A5) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ly1), true);
        }
        BookShelfStatusChangeEvent bookShelfStatusChangeEvent = new BookShelfStatusChangeEvent();
        bookShelfStatusChangeEvent.setBookId(this.M2.getBook_id());
        bookShelfStatusChangeEvent.setShelfStatus(1);
        org.greenrobot.eventbus.c.f().q(bookShelfStatusChangeEvent);
        s8(true);
        if (!isCloseAct) {
            c8();
        } else {
            this.c6 = true;
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void v7() {
        Boolean bool = Boolean.FALSE;
        if (((Boolean) t7.d(gh.b.P, bool)).booleanValue()) {
            t7.j(gh.b.P, bool);
            com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.KA2);
            f8(((Boolean) t7.d(gh.b.A, bool)).booleanValue(), ((Integer) t7.d(gh.b.v, 1)).intValue());
        }
        z7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void v8(boolean isNight) {
        if (isNight) {
            if (!this.Z.N.b0.isClickable()) {
                this.Z.N.b0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.pT));
                return;
            } else {
                this.Z.N.b0.setVisibility(0);
                this.Z.N.b0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.oT));
                return;
            }
        }
        if (!this.Z.N.b0.isClickable()) {
            this.Z.N.b0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.qT));
        } else {
            this.Z.N.b0.setVisibility(0);
            this.Z.N.b0.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.nT));
        }
    }

    public static /* synthetic */ q3 w4(View view, View view2, q3 q3Var) {
        androidx.core.graphics.d0 d0VarF = q3Var.f(q3.p.i() | q3.p.c());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -d0VarF.b;
        view.setLayoutParams(layoutParams);
        return q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w6() {
        this.M2 = LocalReaderManager.m().l();
        BookModel bookModelN = LocalReaderManager.m().n();
        if (this.M2 == null) {
            this.M2 = bookModelN;
        } else if (bookModelN != null && !TextUtils.isEmpty(bookModelN.getBook_id()) && TextUtils.isEmpty(this.M2.getBook_id())) {
            bookModelN.setLocalPath(this.M2.getLocalPath());
            bookModelN.setCover(this.M2.getCover());
            this.M2 = bookModelN;
        } else if (bookModelN != null && bookModelN.getBook_id() != null && bookModelN.getBook_id().equals(this.M2.getBook_id())) {
            bookModelN.setLocalPath(this.M2.getLocalPath());
            bookModelN.setCover(this.M2.getCover());
            this.M2 = bookModelN;
        }
        BookModel bookModel = this.M2;
        if (bookModel != null) {
            this.g0 = bookModel.getRecordReadChapterId();
            this.l0 = this.M2.getRead_chapter();
            this.m0 = this.M2.getMd5Path();
            this.M1 = this.M2.getReadPageInt();
            this.a2 = this.M2.getTextPositionInt();
            com.zentraedi.outreader.adapter.l lVar = this.a0;
            if (lVar != null) {
                lVar.S(this.M2.getBookType());
            }
        }
    }

    private ArrayList<com.zentraedi.reader.reader.k> w7() {
        ArrayList<com.zentraedi.reader.reader.k> arrayList = new ArrayList<>();
        List<ChapterM.Chapter> list = this.T2;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list)) {
            for (ChapterM.Chapter chapter : this.T2) {
                com.zentraedi.reader.reader.k kVar = new com.zentraedi.reader.reader.k();
                kVar.d = chapter.f985id;
                kVar.e = chapter.name;
                kVar.i = com.zentraedi.outreader.util.d.g(chapter.words).intValue();
                kVar.h = this.M2.getWordCountInt();
                kVar.b = this.M2.getNasFileName();
                kVar.c = this.M2.getBookType();
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w8(boolean isNight) {
        if (isNight) {
            this.Z.N.Q5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.t5));
            this.Z.N.R5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.g4));
            this.Z.N.M2.setProgressDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kT));
            this.Z.N.M2.setThumb(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.k70));
        } else {
            this.Z.N.Q5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.K3));
            this.Z.N.R5.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.e4));
            this.Z.N.M2.setProgressDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.jT));
            this.Z.N.M2.setThumb(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.j70));
        }
        v8(isNight);
        D8(this.W);
    }

    public static /* synthetic */ void x4(ZReaderActivity zReaderActivity, com.zentraedi.business.dialog.n nVar, View view) {
        zReaderActivity.getClass();
        nVar.dismiss();
        zReaderActivity.Q5(true);
    }

    private void x6(TaskFileData taskFileData) {
        if (taskFileData == null) {
            return;
        }
        if (!"200".equals(taskFileData.getErrorCode())) {
            HashMap map = new HashMap();
            map.put("fail", taskFileData.getErrorCode());
            map.put("reason", taskFileData.getErrorMessage());
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.m.f(com.zentraedi.outreader.d.q.EC2, map), false);
            return;
        }
        if (taskFileData.getFileSize() == 0 || TextUtils.isEmpty(taskFileData.getFileId())) {
            return;
        }
        long completeSize = (taskFileData.getCompleteSize() * 100) / taskFileData.getFileSize();
        if (completeSize == 100) {
            this.U.setLocalPath(taskFileData.getTargetPath());
            u7();
        } else {
            nd.a.a(z6, "Download Cache Progress" + completeSize);
        }
    }

    private void x7() {
        com.zentraedi.outreader.databinding.c cVar;
        if (!this.r6 || (cVar = this.Z) == null) {
            return;
        }
        this.r6 = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cVar.K, "translationY", 0.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    private void x8(List<ChapterM.Chapter> chapterList) {
    }

    private void y7() {
        if (this.M2 != null) {
            this.Z.O.U.setText(this.k0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y8(int progress) {
        if (progress >= 7) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.EM));
                this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.r9);
            } else {
                this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.DM));
                this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.q9);
            }
        } else if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.lQ));
            this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
        } else {
            this.Z.N.O.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.CM));
            this.Z.N.O.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        }
        if (progress <= 1) {
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.P7));
                this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.r9);
                return;
            } else {
                this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.O7));
                this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.q9);
                return;
            }
        }
        if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
            this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.kQ));
            this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.s9);
        } else {
            this.Z.N.N.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.N7));
            this.Z.N.N.setBackgroundResource(com.zentraedi.outreader.d.h.p9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z6() {
        com.zentraedi.basic.function.ui.toast.a.q(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.q.yD2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z7() {
        Timer timer = this.e6;
        if (timer != null) {
            timer.cancel();
            this.e6 = null;
        }
        TimerTask timerTask = this.f6;
        if (timerTask != null) {
            timerTask.cancel();
            this.f6 = null;
        }
        this.C5 = false;
    }

    private void z8() {
        int iIntValue;
        if (a7()) {
            BookModel bookModel = this.M2;
            if (bookModel == null) {
                return;
            }
            if (TextUtils.isEmpty(bookModel.getFont_size())) {
                this.M2.setFont_size("3");
            }
            iIntValue = this.M2.getFontSize();
        } else {
            iIntValue = ((Integer) t7.d(gh.b.q, 3)).intValue();
        }
        L7(iIntValue);
    }

    @Override // com.zentraedi.reader.reader.d
    public void F1(int orientation, int pageIndex) {
        this.M5 = pageIndex;
        this.Z4 = orientation;
        K6();
        e8();
        if (this.Z5 > 0) {
            PageView pageView = this.Z.K;
            pageView.b1(pageView.getCurrentPage(), 0, this.Z5 - 1);
            this.Z5 = 0;
        }
        int iF = this.Z.K.getCurrentPage().f();
        com.zentraedi.reader.reader.m mVarI6 = i6();
        if (mVarI6 != null && this.a0.i(mVarI6.l()) && mVarI6.o() != 3) {
            iF++;
        }
        this.M2.setRead_page(iF + "");
        this.M2.setReadTime(System.currentTimeMillis());
        this.M2.setReadProgressPercent(this.Z.K.getContentProgress());
        t7.j(gh.b.X, com.zentraedi.basic.component.utils.a.b().toJson(this.M2));
        if (!Y6()) {
            this.X = h6();
        }
        if (this.X >= 0) {
            this.M2.setText_position(this.X + "");
            this.a2 = this.X;
            this.M2.setChapterTotalPage(this.Z.K.getCurrentPage().b());
        }
        this.Q2.X(this.M2);
        if (this.Z.K.getCurrentPage() != null) {
            com.zentraedi.reader.reader.m currentPage = this.Z.K.getCurrentPage();
            this.A3 = currentPage;
            if (currentPage.o() == -1 || this.A3.o() == -2 || this.A3.o() == -3) {
                v7();
            }
        }
        S7(pageIndex);
        com.zentraedi.reader.reader.m currentPage2 = this.Z.K.getCurrentPage();
        if (currentPage2 == null) {
            return;
        }
        if (currentPage2.o() == 3) {
            this.h0 = true;
        } else {
            this.h0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F6() {
        if (this.Z == null || isFinishing()) {
            return;
        }
        if (this.Z.U.getVisibility() == 0) {
            if (this.Z.O.getRoot().getVisibility() != 0) {
                getWindow().setFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            }
            this.Z.U.setVisibility(8);
        }
        this.Z.N.N.setClickable(true);
        this.Z.N.O.setClickable(true);
    }

    public void G6() {
        this.Z.T.setVisibility(8);
    }

    @Override // com.zentraedi.reader.reader.d
    public void L0(int orientation, int sectionIndex, int pageIndex) {
        this.N5 = sectionIndex;
        com.zentraedi.outreader.util.d.g(Long.valueOf(System.currentTimeMillis() - this.b6)).getClass();
        this.b6 = System.currentTimeMillis();
        if (this.Z.K.getCurrentPage() == null || this.Z.K.getCurrentPage().o() != 0) {
            return;
        }
        String str = sectionIndex + "_" + pageIndex;
        if (this.P5.containsKey(str)) {
            return;
        }
        this.P5.put(str, Integer.valueOf(this.Z.K.getCurrentPage().g()));
    }

    public boolean R3() {
        return false;
    }

    @Override // com.zentraedi.outreader.util.k.b
    public void T(int time) {
    }

    public boolean U6() {
        BookModel bookModel = this.M2;
        if (bookModel == null) {
            return false;
        }
        return bookModel.isEpub();
    }

    @Override // com.zentraedi.outreader.typeface.b
    public void V0(com.zentraedi.outreader.typeface.a manager) {
    }

    public void V5() {
        t7.j(gh.b.U, gh.b.W);
        t7.j(gh.b.X, "");
    }

    public void W5() {
        com.zentraedi.outreader.databinding.c cVar = this.Z;
        if (cVar.L.isDrawerOpen(cVar.I)) {
            com.zentraedi.outreader.databinding.c cVar2 = this.Z;
            cVar2.L.closeDrawer(cVar2.I);
        }
    }

    public boolean X6() {
        return this.M2 != null && IdentifierConstant.OAID_STATE_DEFAULT.equals(this.n0) && !TextUtils.isEmpty(this.M2.getNasFileName()) && (this.M2.getNasFileName().toLowerCase().endsWith(".pdf") || this.M2.getNasFileName().toLowerCase().endsWith(".epub") || this.M2.getNasFileName().toLowerCase().endsWith(".txt"));
    }

    public boolean Z6() {
        BookModel bookModel = this.M2;
        if (bookModel == null) {
            return false;
        }
        return bookModel.isPdf();
    }

    public Integer a4() {
        return com.zentraedi.basic.function.utils.a.a().getResources().getConfiguration().orientation == 2 ? 6 : 1;
    }

    public boolean a7() {
        BookModel bookModel = this.M2;
        if (bookModel == null) {
            return false;
        }
        return bookModel.isPdfEpub();
    }

    public ArrayList<ChapterM.Author> c6() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            z7();
        } else if (action == 1) {
            c8();
        }
        try {
            f7(((Long) t7.d(gh.b.d0, Long.valueOf(ReaderSettingActivity.c0))).longValue());
            return super/*android.app.Activity*/.dispatchTouchEvent(ev);
        } catch (Exception unused) {
            return true;
        }
    }

    public int e6() {
        return this.r1;
    }

    public String f6() {
        return this.u6;
    }

    public int g6() {
        return this.N5;
    }

    public com.zentraedi.reader.reader.m i6() {
        com.zentraedi.outreader.databinding.c cVar = this.Z;
        if (cVar != null) {
            return cVar.K.getCurrentPage();
        }
        return null;
    }

    public void i8() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        R6();
        if (W6() || V6()) {
            H6();
        } else {
            W7();
        }
    }

    public void k8() {
        PageView pageView;
        com.zentraedi.outreader.databinding.c cVar = this.Z;
        if (cVar == null || (pageView = cVar.K) == null) {
            return;
        }
        pageView.v1();
    }

    @Override // com.zentraedi.outreader.util.k.b
    public void l1() {
        this.Y = 180;
        this.P4.k(180);
        this.P4.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.zentraedi.outreader.viewmodel.f] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.zentraedi.outreader.activity.ZReaderActivity] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.zentraedi.reader.reader.d
    public void m1(int i2, int i3) {
        ?? r2;
        if (i3 != -1) {
            this.L5 = true;
            List<ChapterM.Chapter> list = this.T2;
            if (list != null && list.size() > i3) {
                this.Z.N.M2.setProgress(i3);
                D8(i3);
                this.g0 = TextUtils.isEmpty(this.T2.get(i3).f985id) ? "" : this.T2.get(i3).f985id;
                this.j0 = this.T2.get(i3).url;
                y7();
                String str = this.T2.get(i3).name;
                this.l0 = str;
                this.M2.setRead_chapter(str);
                this.M2.setRead_chapter_id(this.g0);
                this.M2.setReadTime(System.currentTimeMillis());
                this.M2.setReadProgressPercent(this.Z.K.getContentProgress());
                this.W = i3;
                List<String> listL6 = l6(i3, 2);
                String strA = com.zentraedi.outreader.util.h.a();
                if (listL6.size() > 0) {
                    ?? r3 = this;
                    this.Q2.P(r3, strA, this.m0, listL6, this.T2, this.a6);
                    r2 = r3;
                } else {
                    r2 = this;
                }
                if (i3 == r2.T2.size() - 1) {
                    r2.M2.setRead_finished(1);
                } else {
                    r2.M2.setRead_finished(0);
                }
                F6();
                e8();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m7(final int chapter, final int page, final int type, final float chapterPercent) {
        if (!TextUtils.isEmpty(this.a0.d(chapter)) || this.Z.K.s1()) {
            p7(chapter, page, type, chapterPercent);
        } else {
            if (this.M2 != null) {
                return;
            }
            List<String> listL6 = l6(chapter, 1);
            this.Q2.P(this, com.zentraedi.outreader.util.h.a(), this.m0, listL6, this.T2, new r(listL6, chapter, page, type));
        }
    }

    @Override // com.zentraedi.outreader.typeface.b
    public void n0(com.zentraedi.outreader.typeface.a manager) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n7(final int chapter, final int bookmarkPos) {
        if (!TextUtils.isEmpty(this.a0.d(chapter)) || this.Z.K.s1()) {
            o7(chapter, bookmarkPos);
        } else {
            if (this.M2 != null) {
                return;
            }
            List<String> listL6 = l6(chapter, 1);
            this.Q2.P(this, com.zentraedi.outreader.util.h.a(), this.m0, listL6, this.T2, new s(chapter, bookmarkPos));
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, @androidx.annotation.p0 Intent data) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(requestCode, resultCode, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i2;
        ChapterM.Chapter chapter;
        int id2 = view.getId();
        if (id2 == com.zentraedi.outreader.d.i.cz || id2 == com.zentraedi.outreader.d.i.mz) {
            i8();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.QM) {
            int i3 = this.W;
            if (i3 == 0) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.wD2);
                return;
            }
            List<ChapterM.Chapter> list = this.T2;
            if (list == null || i3 - 1 < 0 || i3 - 1 >= list.size()) {
                return;
            }
            if (this.W >= this.T2.size() || !(this.M2.getNasFileName().toLowerCase().endsWith(".epub") || this.M2.getNasFileName().toLowerCase().endsWith(".mobi"))) {
                chapter = this.T2.get(this.W - 1);
            } else {
                chapter = this.T2.get(this.W);
                int i4 = chapter.page;
                nd.a.e(com.zentraedi.reader.f.a, "onClick currentPage=" + i4);
                for (int i5 = this.W - 1; i5 >= 0; i5--) {
                    chapter = this.T2.get(i5);
                    if (chapter.page < i4) {
                        break;
                    }
                }
            }
            org.greenrobot.eventbus.c.f().q(new MsgChapterChangeEvent(MsgChapterChangeEvent.MSG_CHAPTER_CHANGE_QUICK, chapter.f985id, chapter.name));
            this.Z.N.b0.setClickable(true);
            v8(this.D5);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.jN) {
            List<ChapterM.Chapter> list2 = this.T2;
            if (list2 != null && !com.zentraedi.basic.function.utils.j0.l(list2) && this.W == this.T2.size() - 1) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.qA2);
                return;
            }
            List<ChapterM.Chapter> list3 = this.T2;
            if (list3 != null) {
                int i6 = this.W;
                if (i6 + 1 < 0 || i6 + 1 >= list3.size()) {
                    return;
                }
                ChapterM.Chapter chapter2 = this.T2.get(this.W + 1);
                org.greenrobot.eventbus.c.f().q(new MsgChapterChangeEvent(MsgChapterChangeEvent.MSG_CHAPTER_CHANGE_QUICK, chapter2.f985id, chapter2.name));
                this.Z.N.b0.setClickable(true);
                v8(this.D5);
                return;
            }
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Vj) {
            List<ChapterM.Chapter> list4 = this.T2;
            if (list4 != null && !com.zentraedi.basic.function.utils.j0.l(list4) && (i2 = this.G5) >= 0 && i2 < this.T2.size() && this.F5 >= 0) {
                MsgChapterChangeEvent msgChapterChangeEvent = new MsgChapterChangeEvent(MsgChapterChangeEvent.MSG_CHAPTER_CHANGE_QUICK, this.T2.get(this.G5).f985id, this.T2.get(this.G5).name);
                msgChapterChangeEvent.setPageIndex(this.F5);
                org.greenrobot.eventbus.c.f().q(msgChapterChangeEvent);
                this.Z.N.b0.setClickable(false);
            }
            w8(this.D5);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.jj) {
            if (this.M2 == null || (!this.Z.K.p1() && T6(this.x5))) {
                finish();
                return;
            } else if (e7()) {
                R7();
                return;
            } else {
                finish();
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.yi) {
            if (com.zentraedi.business.utils.m.e("iv_add_shelf")) {
                return;
            }
            if (this.Z.O.F.isSelected()) {
                C7();
                return;
            } else {
                Q5(false);
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.vj) {
            if (this.M2 == null) {
                return;
            }
            this.T.l(this, this.Z.getRoot(), this.P2, this.M2.getAdd_shelf() == 1);
            t7.j(gh.b.Y, Boolean.TRUE);
            X5();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.rz || id2 == com.zentraedi.outreader.d.i.wz) {
            s7();
            G7();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Hn) {
            if (this.b0.getItem(0).h3(this.i6)) {
                H8(!this.i6);
                return;
            }
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Cz) {
            if (this.Z.N.D5.getVisibility() == 0) {
                I6(false);
                return;
            }
            this.H5 = true;
            this.Z.N.D5.getViewTreeObserver().addOnGlobalLayoutListener(new c0());
            Q7();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.xz) {
            if (this.Z.N.D5.getVisibility() == 0) {
                I6(false);
                return;
            } else {
                this.H5 = true;
                Q7();
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.Ga || id2 == com.zentraedi.outreader.d.i.zt) {
            this.Z.N.T.setVisibility(8);
            if (!this.O5) {
                this.O5 = true;
                t7.j(gh.b.Q, Boolean.TRUE);
            }
            if (this.Z.N.E5.getVisibility() == 0) {
                I6(false);
                return;
            }
            this.H5 = true;
            if (id2 == com.zentraedi.outreader.d.i.zt) {
                t7();
                return;
            } else {
                h8();
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.se) {
            p8(1);
            G8(false);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.QB) {
            p8(2);
            G8(false);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.sG) {
            p8(3);
            G8(false);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.cf) {
            p8(4);
            G8(false);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.be) {
            G8(true);
            p8(5);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Yn) {
            P8(1, true);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Zn) {
            P8(2, true);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.ao) {
            if (((Integer) t7.d(gh.b.y, 1)).intValue() != 3) {
                t7.j(gh.b.a0, 3);
                P8(3, true);
                return;
            }
            if (((Integer) t7.d(gh.b.a0, 1)).intValue() == 3) {
                Integer num = (Integer) t7.d(gh.b.b0, 1);
                num.intValue();
                t7.j(gh.b.a0, num);
            }
            Z7(1);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.ak) {
            M8(10);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.ck) {
            M8(15);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.dk) {
            M8(20);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.bk) {
            M8(25);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.cj) {
            N6(false);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.dj) {
            N6(true);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.yM) {
            if (Y6()) {
                com.zentraedi.basic.function.ui.toast.a.z(this, getString(com.zentraedi.outreader.d.q.NA2));
                return;
            } else {
                a8();
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.mO) {
            this.T3 = !this.T3;
            i7(this.T3, ((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
            t7.j(gh.b.p, Boolean.valueOf(this.T3));
            E8();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.aN) {
            ReaderSettingActivity.O4(this, this.m0, this.a0.w(this.W));
            V5();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Ry) {
            if (X6()) {
                return;
            }
            this.z5 = true;
            W5();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.pN) {
            if (((Integer) t7.d(gh.b.v, 1)).intValue() == 1) {
                return;
            }
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 1);
            t7.j(gh.b.v, 1);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.uN) {
            if (((Integer) t7.d(gh.b.v, 1)).intValue() == 3) {
                return;
            }
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 3);
            t7.j(gh.b.v, 3);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.rN) {
            if (((Integer) t7.d(gh.b.v, 1)).intValue() == 5) {
                return;
            }
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 5);
            t7.j(gh.b.v, 5);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.tN) {
            if (a7()) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.pD2);
                return;
            } else {
                if (((Integer) t7.d(gh.b.v, 1)).intValue() == 4) {
                    return;
                }
                f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 4);
                t7.j(gh.b.v, 4);
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.kL) {
            if (a7() || ((Integer) t7.d(gh.b.w, 2)).intValue() == 1) {
                return;
            }
            f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 1);
            t7.j(gh.b.w, 1);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.sN) {
            if (a7()) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.pD2);
                return;
            } else {
                if (((Integer) t7.d(gh.b.v, 1)).intValue() == 2) {
                    return;
                }
                f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 2);
                t7.j(gh.b.v, 2);
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.lL) {
            if (a7()) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.pD2);
                return;
            } else {
                if (((Integer) t7.d(gh.b.w, 2)).intValue() == 2) {
                    return;
                }
                f8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue(), 2);
                t7.j(gh.b.w, 2);
                return;
            }
        }
        if (id2 == com.zentraedi.outreader.d.i.jL) {
            if (!c7()) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.hD2);
                return;
            }
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) t7.d(gh.b.c0, bool)).booleanValue()) {
                com.zentraedi.basic.function.ui.toast.a.y(this, com.zentraedi.outreader.d.q.zD2);
                t7.j(gh.b.c0, Boolean.TRUE);
            }
            t7.j(gh.b.P, Boolean.TRUE);
            if (a7()) {
                f8(((Boolean) t7.d(gh.b.A, bool)).booleanValue(), 1);
            } else {
                f8(((Boolean) t7.d(gh.b.A, bool)).booleanValue(), ((Integer) t7.d(gh.b.w, 2)).intValue());
            }
            i8();
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.fk) {
            R5(1);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.ek) {
            R5(2);
            return;
        }
        if (id2 == com.zentraedi.outreader.d.i.Mn) {
            i8();
            v7();
        } else if (id2 == com.zentraedi.outreader.d.i.oj) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w0(api = 21)
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        com.zentraedi.outreader.databinding.c cVar = (com.zentraedi.outreader.databinding.c) androidx.databinding.m.l(this, com.zentraedi.outreader.d.l.p0);
        this.Z = cVar;
        if (Build.VERSION.SDK_INT >= 35) {
            I7(cVar.E);
            J7(this.Z.K);
            J7(this.Z.U);
        }
        this.P3 = new com.zentraedi.basic.component.handler.a();
        com.zentraedi.outreader.util.k kVar = new com.zentraedi.outreader.util.k();
        this.P4 = kVar;
        kVar.a(this);
        this.P4.k(180);
        this.P4.m();
        this.Q2 = p2.c(this).c(com.zentraedi.outreader.viewmodel.f.class);
        S6(savedInstanceState);
        getLifecycle().c(this.Z.K);
        Q6();
        LocalReaderManager.m().j(this.U, true, new gd.a() { // from class: com.zentraedi.outreader.activity.d0
            @Override // gd.a
            public final void complete(int i2) {
                ZReaderActivity.m4(this.a, i2);
            }
        });
        this.Z.N.g6.setVisibility(0);
        if (NasConnectManager.getInstance().isOfflineLogin() || (this.U instanceof CourseFileInfoModel)) {
            this.Z.O.F.setVisibility(8);
        }
        hf.e.e("zreader");
        this.Q2.V();
    }

    protected void onDestroy() {
        super.onDestroy();
        com.zentraedi.basic.component.handler.a aVar = this.P3;
        if (aVar != null) {
            aVar.a();
        }
        this.Z.K.Q0();
        D6();
        com.zentraedi.outreader.typeface.a.c().i(this);
        this.P4.h();
        this.P4.b();
        this.Y = 0;
        this.P4 = null;
        org.greenrobot.eventbus.c.f().A(this);
        getLifecycle().g(this.Z.K);
        v7();
        LocalReaderManager.m().t(this.M2);
        LocalReaderManager.m().r(this.M2, true);
        LocalReaderManager.m().h();
        LocalReaderManager.m().y(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 24) {
            if (b7() || !this.Z.K.p1()) {
                return false;
            }
            if (((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
                int iR5 = R5(1);
                Toast toast = this.o6;
                if (toast != null && !this.p6) {
                    toast.setText(getString(com.zentraedi.outreader.d.q.aB2) + ": " + String.valueOf(iR5));
                }
                return true;
            }
            if (((Integer) t7.d(gh.b.S, 1)).intValue() == 1) {
                this.Z.K.P1();
                return true;
            }
        }
        if (keyCode == 25) {
            if (b7() || !this.Z.K.p1()) {
                return false;
            }
            if (((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
                int iR6 = R5(2);
                Toast toast2 = this.o6;
                if (toast2 != null && !this.p6) {
                    toast2.setText(getString(com.zentraedi.outreader.d.q.aB2) + ": " + String.valueOf(iR6));
                }
                return true;
            }
            if (((Integer) t7.d(gh.b.S, 1)).intValue() == 1) {
                this.Z.K.v1();
                return true;
            }
        }
        if (keyCode == 4) {
            com.zentraedi.outreader.databinding.c cVar = this.Z;
            if (cVar.L.isDrawerOpen(cVar.I)) {
                com.zentraedi.outreader.databinding.c cVar2 = this.Z;
                cVar2.L.closeDrawer(cVar2.I);
                return true;
            }
            if (this.Z.N.D5.getVisibility() == 0 || this.Z.N.E5.getVisibility() == 0 || this.Z.N.j0.getVisibility() == 0) {
                i8();
                return true;
            }
            if (((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
                v7();
                return true;
            }
            if (e7()) {
                R7();
                return true;
            }
            finish();
        }
        return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(keyCode, event);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(BaseMessageEvent event) {
        TaskFileData fileData;
        boolean z2 = event instanceof FileDownloadProgressEvent;
        if (z2 || (event instanceof FileDownloadFailEvent)) {
            FileInfoModel fileInfoModel = this.U;
            if (fileInfoModel instanceof CourseFileInfoModel) {
                return;
            }
            String strF = com.zentraedi.business.reader.c.f(fileInfoModel);
            if (z2) {
                fileData = ((FileDownloadProgressEvent) event).mBaseTask.getFileData();
            } else if (!(event instanceof FileDownloadFailEvent)) {
                return;
            } else {
                fileData = ((FileDownloadFailEvent) event).mBaseTask.getFileData();
            }
            if (TextUtils.isEmpty(fileData.getTargetPath()) || !fileData.getTargetPath().equals(strF)) {
                return;
            }
            x6(fileData);
            return;
        }
        if (event instanceof ChangeTypefaceEvent) {
            O7(((ChangeTypefaceEvent) event).getTypeface());
        }
        if (TextUtils.isEmpty(event.getMessage()) || this.M2 == null) {
            return;
        }
        String message = event.getMessage();
        message.getClass();
        switch (message) {
            case "chapter_change_quick":
                if (this.A5) {
                    MsgChapterChangeEvent msgChapterChangeEvent = (MsgChapterChangeEvent) event;
                    String str = msgChapterChangeEvent.getmChapterId();
                    this.Q4 = str;
                    m7(O6(this.T2, str), msgChapterChangeEvent.getPageIndex(), 1, -1.0f);
                    break;
                }
                break;
            case "delete_mark":
                B7(((MsgBookEvent) event).book);
                break;
            case "chapter_change":
                if (this.A5) {
                    String str2 = ((MsgChapterChangeEvent) event).getmChapterId();
                    this.Q4 = str2;
                    m7(O6(this.T2, str2), 0, 0, -1.0f);
                    break;
                }
                break;
            case "open_book":
                MsgBookEvent msgBookEvent = (MsgBookEvent) event;
                n7(msgBookEvent.book.getChapterIndex(), msgBookEvent.book.getPosition());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onNewIntent(Intent intent) {
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        F7();
        setIntent(intent);
        y6(null);
        w3();
        if (!a7() && !TextUtils.isEmpty(this.M2.getNasFileName()) && this.M2.getNasFileName().toLowerCase().endsWith(".txt")) {
            D7();
        }
        BookModel bookModel = this.M2;
        if (bookModel != null) {
            s8(bookModel.getAdd_shelf() == 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onPause() {
        if (!this.I5) {
            overridePendingTransition(0, 0);
        }
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        A7();
        com.zentraedi.basic.component.handler.a aVar = this.P3;
        if (aVar != null) {
            aVar.removeCallbacks(this.t6);
        }
        this.P4.h();
        this.Y = 180 - this.P4.c();
        this.P4.k(180);
        z7();
        if (!this.c6) {
            g8();
        }
        this.A5 = false;
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        BookModel bookModel;
        com.zentraedi.basic.component.handler.a aVar;
        super.onResume();
        this.I5 = false;
        this.P4.m();
        if (this.Z.K.p1() && !b7() && ((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue() && (aVar = this.P3) != null) {
            aVar.postDelayed(new Runnable() { // from class: com.zentraedi.outreader.activity.t
                @Override // java.lang.Runnable
                public final void run() {
                    ZReaderActivity.p4(this.a);
                }
            }, 200L);
            this.P3.postDelayed(new Runnable() { // from class: com.zentraedi.outreader.activity.u
                @Override // java.lang.Runnable
                public final void run() {
                    ZReaderActivity.o4(this.a);
                }
            }, 1200L);
        }
        this.A5 = true;
        if (this.Q2 == null || (bookModel = this.M2) == null || bookModel.getAdd_shelf() != 0) {
            return;
        }
        this.Q2.N(this, this.M2.getNasPath(), new a0());
    }

    protected void onSaveInstanceState(@androidx.annotation.n0 Bundle outState) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(outState);
        FileInfoModel fileInfoModel = this.U;
        if (fileInfoModel != null) {
            outState.putSerializable(A6, fileInfoModel);
            outState.putSerializable(B6, this.P2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean hasFocus) {
        super/*android.app.Activity*/.onWindowFocusChanged(hasFocus);
        if (V6()) {
            return;
        }
        L6();
    }

    protected void r3() {
    }

    public com.zentraedi.outreader.viewmodel.f r6() {
        return this.Q2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r7(final int chapter, final int textPosition, final int type) {
        if (!TextUtils.isEmpty(this.a0.d(chapter)) || this.Z.K.s1()) {
            q7(chapter, textPosition, type);
        } else {
            if (this.M2 != null) {
                return;
            }
            List<String> listL6 = l6(chapter, 1);
            this.Q2.P(this, com.zentraedi.outreader.util.h.a(), this.m0, listL6, this.T2, new t(listL6, chapter, textPosition, type));
        }
    }

    protected void s3() {
    }

    public String s6() {
        return this.m0;
    }

    public String t6() {
        return this.n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w3() {
        this.Z.N.N.setClickable(false);
        this.Z.N.O.setClickable(false);
        if (this.Z.U.getVisibility() == 8) {
            getWindow().clearFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Z.S.getLayoutParams();
            layoutParams.topMargin = this.K5;
            this.Z.S.setLayoutParams(layoutParams);
            com.zentraedi.outreader.databinding.c cVar = this.Z;
            cVar.U.setBackgroundColor(cVar.K.getPageBackgroundColor());
            if (((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue()) {
                this.Z.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.YM));
            } else {
                this.Z.F.setImageDrawable(androidx.core.content.e.l(this, com.zentraedi.outreader.d.h.XM));
            }
            this.Z.U.setVisibility(0);
        }
    }

    public void y4(String state, String chapterId, int type) {
        int iO6 = O6(this.T2, chapterId);
        SectionContentEntity sectionContentEntity = new SectionContentEntity();
        sectionContentEntity.setBookId(this.m0);
        sectionContentEntity.setContent(E6);
        if (IdentifierConstant.OAID_STATE_DEFAULT.equals(state)) {
            sectionContentEntity.setErrorStatus("chapter_no_data");
        } else if (gh.b.c.equals(state) || gh.b.d.equals(state) || gh.b.e.equals(state)) {
            this.u6 = state;
            sectionContentEntity.setErrorStatus("chapter_on_control");
        } else {
            sectionContentEntity.setErrorStatus("chapter_other_error");
        }
        boolean zH = this.a0.H(iO6, sectionContentEntity);
        this.a0.G(iO6, sectionContentEntity.getContent());
        boolean z2 = !TextUtils.isEmpty(this.Q4) && this.Q4.equals(chapterId);
        if (!this.g0.equals(chapterId) && !z2) {
            if (zH) {
                this.Z.K.x1(iO6);
                return;
            }
            return;
        }
        this.x5 = state;
        if (this.Z4 == 1) {
            m7(iO6, -1, type, -1.0f);
        } else {
            m7(iO6, 0, type, -1.0f);
        }
        G8(((Boolean) t7.d(gh.b.A, Boolean.FALSE)).booleanValue());
        if (z2) {
            this.Q4 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y6(Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent != null) {
            this.U = intent.getSerializableExtra(A6);
            this.P2 = intent.getStringExtra(B6);
        }
    }
}
