package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.BatteryView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class e implements j4.b {

    @n0
    private final RelativeLayout a;

    @n0
    public final BatteryView b;

    @n0
    public final TextView c;

    @n0
    public final TextView d;

    @n0
    public final TextView e;

    private e(@n0 RelativeLayout relativeLayout, @n0 BatteryView batteryView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3) {
        this.a = relativeLayout;
        this.b = batteryView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    @n0
    public static e a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.M1;
        BatteryView batteryView = (BatteryView) j4.c.a(view, i);
        if (batteryView != null) {
            i = com.zentraedi.reader.h.i.x4;
            TextView textView = (TextView) j4.c.a(view, i);
            if (textView != null) {
                i = com.zentraedi.reader.h.i.Yg;
                TextView textView2 = (TextView) j4.c.a(view, i);
                if (textView2 != null) {
                    i = com.zentraedi.reader.h.i.Xq;
                    TextView textView3 = (TextView) j4.c.a(view, i);
                    if (textView3 != null) {
                        return new e((RelativeLayout) view, batteryView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static e c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static e d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.z8, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
