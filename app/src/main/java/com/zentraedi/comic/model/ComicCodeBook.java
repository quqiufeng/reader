package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCodeBook extends BaseModel {

    @k
    private final String created_at;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @k
    private final String f359id;

    @k
    private final String path;

    @k
    private final String secret;

    @k
    private final String title;

    @k
    private final String updated_at;

    @k
    private final String user_id;

    public ComicCodeBook(@k String id2, @k String user_id, @k String title, @k String secret, @k String path, @k String created_at, @k String updated_at) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        this.f359id = id2;
        this.user_id = user_id;
        this.title = title;
        this.secret = secret;
        this.path = path;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public static /* synthetic */ ComicCodeBook copy$default(ComicCodeBook comicCodeBook, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comicCodeBook.f359id;
        }
        if ((i & 2) != 0) {
            str2 = comicCodeBook.user_id;
        }
        if ((i & 4) != 0) {
            str3 = comicCodeBook.title;
        }
        if ((i & 8) != 0) {
            str4 = comicCodeBook.secret;
        }
        if ((i & 16) != 0) {
            str5 = comicCodeBook.path;
        }
        if ((i & 32) != 0) {
            str6 = comicCodeBook.created_at;
        }
        if ((i & 64) != 0) {
            str7 = comicCodeBook.updated_at;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return comicCodeBook.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @k
    public final String component1() {
        return this.f359id;
    }

    @k
    public final String component2() {
        return this.user_id;
    }

    @k
    public final String component3() {
        return this.title;
    }

    @k
    public final String component4() {
        return this.secret;
    }

    @k
    public final String component5() {
        return this.path;
    }

    @k
    public final String component6() {
        return this.created_at;
    }

    @k
    public final String component7() {
        return this.updated_at;
    }

    @k
    public final ComicCodeBook copy(@k String id2, @k String user_id, @k String title, @k String secret, @k String path, @k String created_at, @k String updated_at) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        return new ComicCodeBook(id2, user_id, title, secret, path, created_at, updated_at);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComicCodeBook)) {
            return false;
        }
        ComicCodeBook comicCodeBook = (ComicCodeBook) obj;
        return Intrinsics.areEqual(this.f359id, comicCodeBook.f359id) && Intrinsics.areEqual(this.user_id, comicCodeBook.user_id) && Intrinsics.areEqual(this.title, comicCodeBook.title) && Intrinsics.areEqual(this.secret, comicCodeBook.secret) && Intrinsics.areEqual(this.path, comicCodeBook.path) && Intrinsics.areEqual(this.created_at, comicCodeBook.created_at) && Intrinsics.areEqual(this.updated_at, comicCodeBook.updated_at);
    }

    @k
    public final String getCreated_at() {
        return this.created_at;
    }

    @k
    public final String getId() {
        return this.f359id;
    }

    @k
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

    @k
    public final String getUpdated_at() {
        return this.updated_at;
    }

    @k
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return (((((((((((this.f359id.hashCode() * 31) + this.user_id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.path.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode();
    }

    @k
    public String toString() {
        return "ComicCodeBook(id=" + this.f359id + ", user_id=" + this.user_id + ", title=" + this.title + ", secret=" + this.secret + ", path=" + this.path + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ')';
    }
}
