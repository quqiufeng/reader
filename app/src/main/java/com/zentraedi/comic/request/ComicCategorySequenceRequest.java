package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCategorySequenceRequest extends NasDeviceRequest {

    @k
    private final String seq;

    public ComicCategorySequenceRequest(@k String seq) {
        Intrinsics.checkNotNullParameter(seq, "seq");
        this.seq = seq;
    }

    @k
    public String getApiPath() {
        return "/zcomic/category/sequence";
    }

    @k
    public final String getSeq() {
        return this.seq;
    }
}
