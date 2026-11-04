package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicEditorCodeBookRequest extends NasDeviceRequest {

    @k
    private final String note_id;

    @k
    private final String secret;

    @l
    private final String title;

    public ComicEditorCodeBookRequest(@k String note_id, @l String str, @k String secret) {
        Intrinsics.checkNotNullParameter(note_id, "note_id");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.note_id = note_id;
        this.title = str;
        this.secret = secret;
    }

    @k
    public String getApiPath() {
        return " /zcomic/notebook/edit";
    }

    @k
    public final String getNote_id() {
        return this.note_id;
    }

    @k
    public final String getSecret() {
        return this.secret;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ComicEditorCodeBookRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }
}
