package com.zentraedi.comic.data;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.FileInfoModel;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class FileListModel extends BaseModel {
    private FileInfoModel info;
    private List<FileListItemModel> list;

    @SerializedName("scan_info")
    private FileScanModel scanInfo;
    private int total;

    public FileInfoModel getInfo() {
        return this.info;
    }

    public List<FileListItemModel> getList() {
        return this.list;
    }

    public FileScanModel getScanInfo() {
        return this.scanInfo;
    }

    public int getTotal() {
        return this.total;
    }

    public void setInfo(FileInfoModel fileInfoModel) {
        this.info = fileInfoModel;
    }

    public void setList(List<FileListItemModel> list) {
        this.list = list;
    }

    public void setScanInfo(FileScanModel fileScanModel) {
        this.scanInfo = fileScanModel;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
