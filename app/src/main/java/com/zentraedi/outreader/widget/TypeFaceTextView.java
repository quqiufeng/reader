package com.zentraedi.outreader.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.zentraedi.outreader.d;
import com.zentraedi.outreader.util.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class TypeFaceTextView extends AppCompatTextView {
    public TypeFaceTextView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, d.s.v10);
        String string = typedArrayObtainStyledAttributes.getString(d.s.w10);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Typeface typefaceA = l.a(string);
        if (typefaceA != null) {
            setTypeface(typefaceA);
            setPaintFlags(1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public TypeFaceTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TypeFaceTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        v(context, attrs);
    }
}
