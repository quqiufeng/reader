package com.zentraedi.comic.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.imgedit.CropImageView;
import com.zentraedi.comic.viewmodel.ReadSetting;
import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCropImageActivity extends AppCompatActivity {

    @fo.k
    public static final a U = new a(null);

    @fo.k
    private static final String V = "intent_comic_bitmap_path";

    @fo.k
    private static final String W = "intent_comic_type";

    @fo.k
    private static final String X = "intent_comic_orientation";

    @fo.k
    public static final String Y = "intent_comic_bitmap_path_result";

    @fo.k
    public static final String Z = "intent_comic_coordinate_path_result";
    public static final int a0 = 17;
    private static final int b0 = 16;

    @fo.l
    private String H = "";
    private CropImageView I;
    private int J;
    private TextView K;
    private TextView L;
    private TextView M;
    private CheckBox N;
    private CheckBox O;

    @fo.l
    private ReadSetting.Coordinate P;
    private float Q;
    private float R;
    private boolean S;
    private int T;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Activity activity, String str, int i, ReadSetting.Coordinate coordinate, int i2, int i3, Object obj) {
            if ((i3 & 16) != 0) {
                i2 = 0;
            }
            aVar.a(activity, str, i, coordinate, i2);
        }

        @JvmStatic
        public final void a(@fo.k Activity activity, @fo.k String path, int i, @fo.l ReadSetting.Coordinate coordinate, int i2) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(path, "path");
            Intent intent = new Intent(activity, (Class<?>) ComicCropImageActivity.class);
            intent.putExtra(ComicCropImageActivity.V, path);
            intent.putExtra(ComicCropImageActivity.X, i);
            intent.putExtra(ComicCropImageActivity.Z, coordinate);
            intent.putExtra(ComicCropImageActivity.W, i2);
            activity.startActivityForResult(intent, 16);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A3() {
        if (M3()) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            O3(viewFindViewById);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(ComicCropImageActivity comicCropImageActivity) {
        TextView textView = comicCropImageActivity.L;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
            textView = null;
        }
        textView.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(ComicCropImageActivity comicCropImageActivity, float f, float f2) {
        if (comicCropImageActivity.S) {
            return;
        }
        comicCropImageActivity.R = f;
        comicCropImageActivity.Q = f2;
        CropImageView cropImageView = null;
        if (comicCropImageActivity.P == null) {
            TextView textView = comicCropImageActivity.L;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
                textView = null;
            }
            textView.setEnabled(false);
            CropImageView cropImageView2 = comicCropImageActivity.I;
            if (cropImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            } else {
                cropImageView = cropImageView2;
            }
            cropImageView.I(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f), Float.valueOf(f2));
            return;
        }
        TextView textView2 = comicCropImageActivity.L;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
            textView2 = null;
        }
        textView2.setEnabled(true);
        CropImageView cropImageView3 = comicCropImageActivity.I;
        if (cropImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
        } else {
            cropImageView = cropImageView3;
        }
        ReadSetting.Coordinate coordinate = comicCropImageActivity.P;
        Intrinsics.checkNotNull(coordinate);
        Float fValueOf = Float.valueOf(coordinate.l() * f);
        ReadSetting.Coordinate coordinate2 = comicCropImageActivity.P;
        Intrinsics.checkNotNull(coordinate2);
        Float fValueOf2 = Float.valueOf(coordinate2.n() * f2);
        ReadSetting.Coordinate coordinate3 = comicCropImageActivity.P;
        Intrinsics.checkNotNull(coordinate3);
        Float fValueOf3 = Float.valueOf(f * coordinate3.m());
        ReadSetting.Coordinate coordinate4 = comicCropImageActivity.P;
        Intrinsics.checkNotNull(coordinate4);
        cropImageView.I(fValueOf, fValueOf2, fValueOf3, Float.valueOf(f2 * coordinate4.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(ComicCropImageActivity comicCropImageActivity, CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        CheckBox checkBox = null;
        if (!z) {
            CheckBox checkBox2 = comicCropImageActivity.O;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCheckHeight");
                checkBox2 = null;
            }
            checkBox2.setChecked(true);
        }
        if (z) {
            CheckBox checkBox3 = comicCropImageActivity.O;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCheckHeight");
            } else {
                checkBox = checkBox3;
            }
            checkBox.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(ComicCropImageActivity comicCropImageActivity, CompoundButton buttonView, boolean z) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        CheckBox checkBox = null;
        if (!z) {
            CheckBox checkBox2 = comicCropImageActivity.N;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCheckWidth");
                checkBox2 = null;
            }
            checkBox2.setChecked(true);
        }
        if (z) {
            CheckBox checkBox3 = comicCropImageActivity.N;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCheckWidth");
            } else {
                checkBox = checkBox3;
            }
            checkBox.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void H3(ComicCropImageActivity comicCropImageActivity, View view) {
        CropImageView cropImageView = comicCropImageActivity.I;
        CheckBox checkBox = null;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView = null;
        }
        RectF cropRectF = cropImageView.getCropRectF();
        View view2 = comicCropImageActivity.I;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            view2 = null;
        }
        int width = view2.getWidth();
        View view3 = comicCropImageActivity.I;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            view3 = null;
        }
        int height = view3.getHeight();
        float f = width;
        float f2 = cropRectF.left / f;
        float f3 = cropRectF.right / f;
        float f4 = height;
        float f5 = cropRectF.top / f4;
        float f6 = cropRectF.bottom / f4;
        CheckBox checkBox2 = comicCropImageActivity.N;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckWidth");
        } else {
            checkBox = checkBox2;
        }
        comicCropImageActivity.P = new ReadSetting.Coordinate(f2, f3, f5, f6, checkBox.isChecked());
        Intent intent = new Intent();
        intent.putExtra("intent_comic_bitmap_path_result", comicCropImageActivity.P);
        comicCropImageActivity.setResult(17, intent);
        comicCropImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void I3(ComicCropImageActivity comicCropImageActivity, View view) {
        comicCropImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(final ComicCropImageActivity comicCropImageActivity, View view) {
        CropImageView cropImageView = comicCropImageActivity.I;
        TextView textView = null;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView = null;
        }
        cropImageView.I(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(comicCropImageActivity.R), Float.valueOf(comicCropImageActivity.Q));
        TextView textView2 = comicCropImageActivity.L;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
        } else {
            textView = textView2;
        }
        textView.postDelayed(new Runnable() { // from class: com.zentraedi.comic.activity.p0
            @Override // java.lang.Runnable
            public final void run() {
                ComicCropImageActivity.K3(this.a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(ComicCropImageActivity comicCropImageActivity) {
        comicCropImageActivity.S = true;
        CropImageView cropImageView = comicCropImageActivity.I;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView = null;
        }
        cropImageView.z();
    }

    private final boolean L3() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @JvmStatic
    public static final void N3(@fo.k Activity activity, @fo.k String str, int i, @fo.l ReadSetting.Coordinate coordinate, int i2) {
        U.a(activity, str, i, coordinate, i2);
    }

    private final void O3(final View view) {
        try {
            androidx.core.view.a2.l2(view, new androidx.core.view.e1() { // from class: com.zentraedi.comic.activity.h0
                public final androidx.core.view.q3 onApplyWindowInsets(View view2, androidx.core.view.q3 q3Var) {
                    return ComicCropImageActivity.P3(view, view2, q3Var);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.view.q3 P3(View view, View v, androidx.core.view.q3 insets) {
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
    public final void B3() {
        this.H = getIntent().getStringExtra(V);
        this.T = getIntent().getIntExtra(W, 0);
        this.J = getIntent().getIntExtra(X, 1);
        this.P = (ReadSetting.Coordinate) getIntent().getParcelableExtra(Z);
    }

    public final void C3() {
        A3();
        setContentView(com.zentraedi.comic.q.l.V);
        CropImageView cropImageViewFindViewById = findViewById(com.zentraedi.comic.q.i.zk);
        Intrinsics.checkNotNullExpressionValue(cropImageViewFindViewById, "findViewById(...)");
        this.I = cropImageViewFindViewById;
        View viewFindViewById = findViewById(com.zentraedi.comic.q.i.sS);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.K = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(com.zentraedi.comic.q.i.tP);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.M = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(com.zentraedi.comic.q.i.kS);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.L = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(com.zentraedi.comic.q.i.m6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.N = (CheckBox) viewFindViewById4;
        View viewFindViewById5 = findViewById(com.zentraedi.comic.q.i.l6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.O = (CheckBox) viewFindViewById5;
        Uri uriFromFile = Uri.fromFile(new File(this.H));
        CropImageView cropImageView = this.I;
        TextView textView = null;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView = null;
        }
        cropImageView.setAutoZoomEnabled(false);
        CropImageView cropImageView2 = this.I;
        if (cropImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView2 = null;
        }
        cropImageView2.setImageUriAsync(uriFromFile);
        TextView textView2 = this.L;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
            textView2 = null;
        }
        textView2.setEnabled(false);
        CropImageView cropImageView3 = this.I;
        if (cropImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView3 = null;
        }
        cropImageView3.setOnCropWindowChangedListener(new CropImageView.g() { // from class: com.zentraedi.comic.activity.i0
            public final void a() {
                ComicCropImageActivity.D3(this.a);
            }
        });
        CropImageView cropImageView4 = this.I;
        if (cropImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropImageView");
            cropImageView4 = null;
        }
        cropImageView4.setmOnApplyImageMatrixListener(new CropImageView.c() { // from class: com.zentraedi.comic.activity.j0
            public final void a(float f, float f2) {
                ComicCropImageActivity.E3(this.a, f, f2);
            }
        });
        CheckBox checkBox = this.N;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckWidth");
            checkBox = null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.comic.activity.k0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ComicCropImageActivity.F3(this.a, compoundButton, z);
            }
        });
        CheckBox checkBox2 = this.O;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckHeight");
            checkBox2 = null;
        }
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zentraedi.comic.activity.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ComicCropImageActivity.G3(this.a, compoundButton, z);
            }
        });
        CheckBox checkBox3 = this.N;
        if (checkBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckWidth");
            checkBox3 = null;
        }
        ReadSetting.Coordinate coordinate = this.P;
        checkBox3.setChecked(coordinate != null ? coordinate.o() : true);
        TextView textView3 = this.K;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSave");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCropImageActivity.H3(this.a, view);
            }
        });
        TextView textView4 = this.M;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvCancel");
            textView4 = null;
        }
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCropImageActivity.I3(this.a, view);
            }
        });
        TextView textView5 = this.L;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReset");
        } else {
            textView = textView5;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCropImageActivity.J3(this.a, view);
            }
        });
    }

    public boolean M3() {
        return L3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@fo.l Bundle bundle) {
        B3();
        setRequestedOrientation(this.J);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        C3();
    }
}
