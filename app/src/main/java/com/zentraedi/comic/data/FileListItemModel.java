package com.zentraedi.comic.data;

import com.chad.library.adapter.base.entity.c;
import com.zentraedi.business.model.BasicUserInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.comic.m;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class FileListItemModel extends FileInfoModel implements c {
    public static final int LAYOUT_DIR_GRID = 1;
    public static final int LAYOUT_DIR_LIST = 0;
    public static final int LAYOUT_DIR_LIST_DETAIL = 4;
    public static final int LAYOUT_FILE_GRID = 3;
    public static final int LAYOUT_FILE_LIST = 2;
    public static final int LAYOUT_FILE_LIST_DETAIL = 5;
    public static int LAYOUT_MODE_GRID = 10;
    public static int LAYOUT_MODE_LIST = 20;
    public static int LAYOUT_MODE_LIST_DETAIL = 21;
    private BasicUserInfoModel user;

    private int configLayoutDetailModeList() {
        return getIsDir() == 1 ? 4 : 5;
    }

    private int configLayoutModeGrid() {
        return getIsDir() == 1 ? 1 : 3;
    }

    private int configLayoutModeList() {
        return getIsDir() == 1 ? 0 : 2;
    }

    public int getItemType() {
        int iQ = m.q();
        if (iQ == LAYOUT_MODE_GRID) {
            return configLayoutModeGrid();
        }
        if (iQ == LAYOUT_MODE_LIST) {
            return configLayoutModeList();
        }
        if (iQ == LAYOUT_MODE_LIST_DETAIL) {
            return configLayoutDetailModeList();
        }
        return -1;
    }

    public BasicUserInfoModel getUser() {
        return this.user;
    }

    public void setUser(BasicUserInfoModel basicUserInfoModel) {
        this.user = basicUserInfoModel;
    }
}
