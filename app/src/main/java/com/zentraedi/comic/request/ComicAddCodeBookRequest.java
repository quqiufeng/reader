package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicAddCodeBookRequest extends NasDeviceRequest {

    @l
    private final String path;

    @k
    private final String secret;

    @k
    private final String title;

    public ComicAddCodeBookRequest(@k String title, @k String secret, @l String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.title = title;
        this.secret = secret;
        this.path = str;
    }

    @k
    public String getApiPath() {
        return "/zcomic/notebook/create";
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @k
    public final String getSecret() {
        return this.secret;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ComicAddCodeBookRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
