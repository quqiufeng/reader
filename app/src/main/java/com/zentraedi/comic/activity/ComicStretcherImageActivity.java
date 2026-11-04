package com.zentraedi.comic.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.imgedit.ImageStretcherView;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicStretcherImageActivity extends AppCompatActivity {

    @fo.k
    public static final a P = new a(null);

    @fo.k
    private static final String Q = "intent_comic_bitmap_path";

    @fo.k
    private static final String R = "intent_comic_type";

    @fo.k
    private static final String S = "intent_comic_orientation";

    @fo.k
    public static final String T = "intent_comic_bitmap_path_result";

    @fo.k
    public static final String U = "intent_comic_stretcher_path_result";
    public static final int V = 20;
    private static final int W = 17;

    @fo.l
    private String H = "";
    private ImageStretcherView I;
    private int J;
    private TextView K;
    private TextView L;
    private TextView M;

    @fo.l
    private ReadSetting.Stretcher N;
    private int O;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Activity activity, String str, int i, ReadSetting.Stretcher stretcher, int i2, int i3, Object obj) {
            if ((i3 & 16) != 0) {
                i2 = 0;
            }
            aVar.a(activity, str, i, stretcher, i2);
        }

        @JvmStatic
        public final void a(@fo.k Activity activity, @fo.k String path, int i, @fo.l ReadSetting.Stretcher stretcher, int i2) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(path, "path");
            Intent intent = new Intent(activity, (Class<?>) ComicStretcherImageActivity.class);
            intent.putExtra(ComicStretcherImageActivity.Q, path);
            intent.putExtra(ComicStretcherImageActivity.S, i);
            intent.putExtra(ComicStretcherImageActivity.U, stretcher);
            intent.putExtra(ComicStretcherImageActivity.R, i2);
            activity.startActivityForResult(intent, 17);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(ComicStretcherImageActivity comicStretcherImageActivity, View view) {
        ImageStretcherView imageStretcherView = comicStretcherImageActivity.I;
        if (imageStretcherView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            imageStretcherView = null;
        }
        imageStretcherView.t();
    }

    private final boolean B3() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @JvmStatic
    public static final void D3(@fo.k Activity activity, @fo.k String str, int i, @fo.l ReadSetting.Stretcher stretcher, int i2) {
        P.a(activity, str, i, stretcher, i2);
    }

    private final void E3(final View view) {
        try {
            androidx.core.view.a2.l2(view, new androidx.core.view.e1() { // from class: com.zentraedi.comic.activity.h5
                public final androidx.core.view.q3 onApplyWindowInsets(View view2, androidx.core.view.q3 q3Var) {
                    return ComicStretcherImageActivity.F3(view, view2, q3Var);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.view.q3 F3(View view, View v, androidx.core.view.q3 insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.graphics.d0 d0VarF = insets.f(androidx.core.view.q3.p.i() | androidx.core.view.q3.p.c());
        Intrinsics.checkNotNullExpressionValue(d0VarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!Intrinsics.areEqual(BaseActivity.S, view.getTag()) || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            v.setPadding(0, 0, 0, d0VarF.d);
            return insets;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = d0VarF.d;
        view.setLayoutParams(layoutParams);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v3() {
        if (C3()) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            E3(viewFindViewById);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void y3(ComicStretcherImageActivity comicStretcherImageActivity, View view) {
        ImageStretcherView imageStretcherView = comicStretcherImageActivity.I;
        if (imageStretcherView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            imageStretcherView = null;
        }
        Pair wh = imageStretcherView.getWH();
        Intent intent = new Intent();
        Object second = wh.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        float fFloatValue = ((Number) second).floatValue();
        Object first = wh.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        intent.putExtra("intent_comic_bitmap_path_result", new ReadSetting.Stretcher(fFloatValue, ((Number) first).floatValue(), true));
        comicStretcherImageActivity.setResult(20, intent);
        comicStretcherImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void z3(ComicStretcherImageActivity comicStretcherImageActivity, View view) {
        comicStretcherImageActivity.finish();
    }

    public boolean C3() {
        return B3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@fo.l Bundle bundle) {
        w3();
        setRequestedOrientation(this.J);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        x3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w3() {
        this.H = getIntent().getStringExtra(Q);
        this.O = getIntent().getIntExtra(R, 0);
        this.J = getIntent().getIntExtra(S, 1);
        this.N = (ReadSetting.Stretcher) getIntent().getParcelableExtra(U);
    }

    public final void x3() {
        v3();
        setContentView(com.zentraedi.comic.q.l.X0);
        ImageStretcherView imageStretcherViewFindViewById = findViewById(com.zentraedi.comic.q.i.zk);
        Intrinsics.checkNotNullExpressionValue(imageStretcherViewFindViewById, "findViewById(...)");
        ImageStretcherView imageStretcherView = imageStretcherViewFindViewById;
        this.I = imageStretcherView;
        TextView textView = null;
        if (imageStretcherView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            imageStretcherView = null;
        }
        imageStretcherView.setImageBitmap(BitmapFactory.decodeFile(this.H));
        View viewFindViewById = findViewById(com.zentraedi.comic.q.i.sS);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.K = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(com.zentraedi.comic.q.i.tP);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.M = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(com.zentraedi.comic.q.i.kS);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.L = (TextView) viewFindViewById3;
        TextView textView2 = this.K;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSave");
            textView2 = null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.e5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicStretcherImageActivity.y3(this.a, view);
            }
        });
        TextView textView3 = this.M;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvCancel");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.f5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicStretcherImageActivity.z3(this.a, view);
            }
        });
        TextView textView4 = this.L;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
        } else {
            textView = textView4;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.g5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicStretcherImageActivity.A3(this.a, view);
            }
        });
    }
}
