package com.zentraedi.comic.data;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class FileScanModel extends BaseModel {

    @k
    public static final a Companion = new a(null);

    @k
    public static final String STATE_BEGIN = "begin";

    @k
    public static final String STATE_RUNNING = "running";

    @l
    private Long created_at;
    private int num;

    @l
    private String state;

    @l
    private Long updated_at;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @l
    public final Long getCreated_at() {
        return this.created_at;
    }

    public final int getNum() {
        return this.num;
    }

    @l
    public final String getState() {
        return this.state;
    }

    @l
    public final Long getUpdated_at() {
        return this.updated_at;
    }

    public final void setCreated_at(@l Long l) {
        this.created_at = l;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setState(@l String str) {
        this.state = str;
    }

    public final void setUpdated_at(@l Long l) {
        this.updated_at = l;
    }
}
