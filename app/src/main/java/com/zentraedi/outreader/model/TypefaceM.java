package com.zentraedi.outreader.model;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.zentraedi.basic.function.server.BaseModel;
import java.io.File;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class TypefaceM extends BaseModel {
    public static final int COMPLETE = 4;
    public static final int DOWNLOADING = 2;
    public static final int FAIL = 5;
    public static final int INIT = 1;
    public static final int PAUSE = 3;
    public static long mOldTime;
    private String customFontPath;
    private int downloadState = 1;
    private String downloadUrl;
    private long downloadedSize;
    private boolean isCustom;
    private boolean isDeleteSelect;
    private boolean isSelect;
    private String name;
    private long totalSize;
    private String type;
    private Typeface typeface;

    public void checkDownloadState() {
        if (TextUtils.isEmpty(this.name)) {
            return;
        }
        try {
            File file = new File(gh.a.a, this.name + ".otf");
            if (!file.exists()) {
                this.downloadedSize = 0L;
                this.downloadState = 1;
                return;
            }
            long length = file.length();
            this.downloadedSize = length;
            if (length != this.totalSize) {
                this.downloadState = 3;
            } else {
                this.downloadState = 4;
                this.typeface = Typeface.createFromFile(file);
            }
        } catch (Exception unused) {
            this.downloadedSize = 0L;
            this.downloadState = 1;
        }
    }

    public String getCustomFontPath() {
        return this.customFontPath;
    }

    public int getDownloadState() {
        return this.downloadState;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public long getDownloadedSize() {
        return this.downloadedSize;
    }

    public String getName() {
        return this.name;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public String getType() {
        return this.type;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCustom() {
        return this.isCustom;
    }

    public boolean isDeleteSelect() {
        return this.isDeleteSelect;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setCustom(boolean custom) {
        this.isCustom = custom;
    }

    public void setCustomFontPath(String customFontPath) {
        this.customFontPath = customFontPath;
    }

    public void setDeleteSelect(boolean deleteSelect) {
        this.isDeleteSelect = deleteSelect;
    }

    public void setDownloadState(int downloadState) {
        this.downloadState = downloadState;
        com.zentraedi.outreader.typeface.a.c().d();
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setDownloadedSize(long downloadedSize) {
        this.downloadedSize = downloadedSize;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((jCurrentTimeMillis - mOldTime) / 1000 >= 2) {
            mOldTime = jCurrentTimeMillis;
            com.zentraedi.outreader.typeface.a.c().d();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }
}
