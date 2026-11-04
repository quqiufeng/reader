package com.zentraedi.comic.model;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class Details extends BaseModel {

    @k
    private final String created_at;

    @SerializedName("do")
    @k
    private final String form;

    @k
    private final String state;

    @k
    private final String updated_at;

    @k
    private final String why;

    public Details(@k String form, @k String state, @k String created_at, @k String updated_at, @k String result, @k String why) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(why, "why");
        this.form = form;
        this.state = state;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.why = why;
    }

    @k
    public final String getCreated_at() {
        return this.created_at;
    }

    @k
    public final String getForm() {
        return this.form;
    }

    @k
    public final String getState() {
        return this.state;
    }

    @k
    public final String getUpdated_at() {
        return this.updated_at;
    }

    @k
    public final String getWhy() {
        return this.why;
    }
}
