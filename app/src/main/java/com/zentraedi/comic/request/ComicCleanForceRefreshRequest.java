package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCleanForceRefreshRequest extends NasDeviceRequest {
    @k
    public String getApiPath() {
        return "/zcomic/flush/clean";
    }
}
