package com.zentraedi.reader.reader;

import android.graphics.Typeface;
import com.zentraedi.basic.function.server.BaseModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class TxtAttribute extends BaseModel {
    private int backgroundColorId;
    private int backgroundImageId;
    private boolean clickLeftGoNext;

    @fo.k
    private Typeface fontTypeface;
    private int lineSpace;
    private int pageMargin;
    private int pageMode;
    private int paragraphSpace;
    private int textColor;
    private int textSizePx = 40;

    public TxtAttribute() {
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.fontTypeface = DEFAULT;
        this.pageMargin = 40;
        this.lineSpace = 20;
        this.paragraphSpace = 40;
        this.pageMode = 1;
    }

    public final int getBackgroundColorId() {
        return this.backgroundColorId;
    }

    public final int getBackgroundImageId() {
        return this.backgroundImageId;
    }

    public final boolean getClickLeftGoNext() {
        return this.clickLeftGoNext;
    }

    @fo.k
    public final Typeface getFontTypeface() {
        return this.fontTypeface;
    }

    public final int getLineSpace() {
        return this.lineSpace;
    }

    public final int getPageMargin() {
        return this.pageMargin;
    }

    public final int getPageMode() {
        return this.pageMode;
    }

    public final int getParagraphSpace() {
        return this.paragraphSpace;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextSizePx() {
        return this.textSizePx;
    }

    public final void setBackgroundColorId(int i) {
        this.backgroundColorId = i;
    }

    public final void setBackgroundImageId(int i) {
        this.backgroundImageId = i;
    }

    public final void setClickLeftGoNext(boolean z) {
        this.clickLeftGoNext = z;
    }

    public final void setFontTypeface(@fo.k Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "<set-?>");
        this.fontTypeface = typeface;
    }

    public final void setLineSpace(int i) {
        this.lineSpace = i;
    }

    public final void setPageMargin(int i) {
        this.pageMargin = i;
    }

    public final void setPageMode(int i) {
        this.pageMode = i;
    }

    public final void setParagraphSpace(int i) {
        this.paragraphSpace = i;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSizePx(int i) {
        this.textSizePx = i;
    }

    @fo.k
    public String toString() {
        return "TxtAttribute(textSizePx=" + this.textSizePx + ", pageMargin=" + this.pageMargin + ", lineSpace=" + this.lineSpace + ", paragraphSpace=" + this.paragraphSpace + ", pageMode=" + this.pageMode + ", textColor=" + this.textColor + ", backgroundColorId=" + this.backgroundColorId + ", backgroundImageId=" + this.backgroundImageId + ')';
    }
}
