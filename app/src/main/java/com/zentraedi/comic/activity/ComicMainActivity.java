package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.RadioGroup;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.report.BaseDataRecord;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseEditModeEvent;
import com.zentraedi.comic.event.ComicJumpLastestAddEvent;
import com.zentraedi.comic.event.JumpToComicLibraryEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicMainActivity extends ComicBaseListActivity {

    @fo.k
    public static final a W = new a(null);

    @fo.k
    public static final String X = "extra_tab";

    @fo.k
    public static final String Y = "tab_set";

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.t1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicMainActivity.p4(this.a);
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.u1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicMainActivity.r4();
        }
    });

    @fo.k
    private final RadioGroup.OnCheckedChangeListener V = new RadioGroup.OnCheckedChangeListener() { // from class: com.zentraedi.comic.activity.v1
        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            ComicMainActivity.q4(this.a, radioGroup, i);
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            b(activity, false);
        }

        public final void b(@fo.k Activity activity, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (com.zentraedi.business.permission.a.d(activity, com.zentraedi.business.permission.a.i)) {
                Intent intent = new Intent(activity, (Class<?>) ComicMainActivity.class);
                intent.putExtra("KEY_SHOULD_REDIRECT_HOME", z);
                activity.startActivity(intent);
            }
        }

        public final void c(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (com.zentraedi.business.permission.a.d(activity, com.zentraedi.business.permission.a.i)) {
                Intent intent = new Intent(activity, (Class<?>) ComicMainActivity.class);
                intent.putExtra("KEY_SHOULD_REDIRECT_HOME", true);
                intent.putExtra("extra_tab", "tab_set");
                activity.startActivity(intent);
            }
        }

        private a() {
        }
    }

    private final com.zentraedi.comic.databinding.m n4() {
        Object value = this.T.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.m) value;
    }

    private final com.zentraedi.comic.business.m2 o4() {
        return (com.zentraedi.comic.business.m2) this.U.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.m p4(ComicMainActivity comicMainActivity) {
        return (com.zentraedi.comic.databinding.m) androidx.databinding.m.l(comicMainActivity, com.zentraedi.comic.q.l.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(ComicMainActivity comicMainActivity, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "<unused var>");
        if (i == com.zentraedi.comic.q.i.Uq) {
            comicMainActivity.o4().p(comicMainActivity.o4().d());
        } else if (i == com.zentraedi.comic.q.i.I7) {
            comicMainActivity.o4().p(comicMainActivity.o4().e());
        } else if (i == com.zentraedi.comic.q.i.JF) {
            comicMainActivity.o4().p(comicMainActivity.o4().f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.m2 r4() {
        return new com.zentraedi.comic.business.m2();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicHouseAddedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (o4().c() != o4().e()) {
            n4().G.performClick();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseEditModeEvent(@fo.k ComicHouseEditModeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getInEdit()) {
            n4().E.setVisibility(8);
        } else {
            n4().E.setVisibility(0);
        }
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
        com.zentraedi.comic.util.f.a.j();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k JumpToComicLibraryEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o4().p(o4().e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        org.greenrobot.eventbus.c.f().v(this);
        n4().E.setOnCheckedChangeListener(this.V);
        Intent intent = getIntent();
        ((BaseActivity) this).O = intent != null ? intent.getBooleanExtra("KEY_SHOULD_REDIRECT_HOME", false) : false;
        hf.e.e("comics");
        BaseDataRecord baseDataRecordA = hf.a.a(BaseDataRecord.class);
        baseDataRecordA.acode = 51;
        hf.e.c(baseDataRecordA, "comics_page_show");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        o4().l(I2());
        if (!TextUtils.equals(getIntent().getStringExtra("extra_tab"), "tab_set")) {
            o4().p(o4().d());
            return;
        }
        n4().I.setChecked(false);
        n4().J.setChecked(true);
        o4().p(o4().f());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicJumpLastestAddEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (o4().c() != o4().e()) {
            n4().G.performClick();
        }
    }
}
