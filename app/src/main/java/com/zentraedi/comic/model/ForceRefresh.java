package com.zentraedi.comic.model;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ForceRefresh extends BaseModel {

    @SerializedName("cate_id_list")
    @k
    private final List<String> cateIdList;

    @k
    private final List<Details> details;

    @SerializedName("dir_id_list")
    @k
    private final List<String> dirIdList;

    @k
    private final String state;

    @k
    private final String username;

    public ForceRefresh(@k String username, @k String state, @k List<Details> details, @k List<String> dirIdList, @k List<String> cateIdList) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(dirIdList, "dirIdList");
        Intrinsics.checkNotNullParameter(cateIdList, "cateIdList");
        this.username = username;
        this.state = state;
        this.details = details;
        this.dirIdList = dirIdList;
        this.cateIdList = cateIdList;
    }

    @k
    public final List<String> getCateIdList() {
        return this.cateIdList;
    }

    @k
    public final List<Details> getDetails() {
        return this.details;
    }

    @k
    public final List<String> getDirIdList() {
        return this.dirIdList;
    }

    @k
    public final String getState() {
        return this.state;
    }

    @k
    public final String getUsername() {
        return this.username;
    }
}
