package com.zentraedi.outreader.model;

import android.text.TextUtils;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.basic.function.utils.j0;
import java.util.ArrayList;
import org.readium.r2.shared.publication.Link;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class ChapterM extends BaseModel {
    public BookInfo bookInfo;
    public final ArrayList<Chapter> chapterList = new ArrayList<>();
    public ArrayList<Volume> volumes;

    public static class Author extends BaseModel {
        private static final long serialVersionUID = 1471078028754490792L;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f982id;
        public String name;
    }

    public static class BookInfo extends BaseModel {
        private static final Class<?> TAG = BookInfo.class;
        private static final long serialVersionUID = -3113143956644758555L;
        public String author;
        public ArrayList<Author> authors;
        public int bookType;
        public ArrayList<Category> categories;
        public String chapterCount;
        public int charge;
        public int contractType;
        public String copyright;
        public String cover;
        public boolean finish;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f983id;
        public String intro;
        public String jumpChapterIds;
        public String name;
        public String pay;
        public String readerNum;
        public String refBookId;
        public String score;
        public int siteType;
        public String sourceId;
        public int supportAd;
        public int supportListen;
        public ArrayList<Tag> tags;
        public String words;

        public ArrayList<String> getJumpChapterIdList() {
            if (TextUtils.isEmpty(this.jumpChapterIds)) {
                return new ArrayList<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : this.jumpChapterIds.split(",")) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }

        public String spliceAuthor() {
            if (j0.l(this.authors)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.authors.size(); i++) {
                if (this.authors.get(i) != null && !TextUtils.isEmpty(this.authors.get(i).name)) {
                    sb.append(this.authors.get(i).name);
                    sb.append(",");
                }
            }
            String string = sb.toString();
            return TextUtils.isEmpty(string) ? "" : string.substring(0, string.length() - 1);
        }
    }

    public static class Category extends BaseModel {
        private static final long serialVersionUID = -3901001488291381263L;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f984id;
        public String name;
    }

    public static class Chapter extends BaseModel {
        public static final int TYPE_FREE = 0;
        public static final int TYPE_PAY = 1;
        public static final int TYPE_VIP_FREE = 2;
        private static final long serialVersionUID = -4459060760322681407L;
        public String coverUrl;
        public ExternalInfo externalInfo;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f985id;
        public boolean isCache = false;
        public boolean isSelect = false;
        public Link link;
        public int lock;
        public String name;
        public int page;
        public int pay;
        public long updateTime;
        public String url;
        public String volumeName;
        public String words;

        public String toString() {
            return "Chapter{id='" + this.f985id + "', isCache=" + this.isCache + ", isSelect=" + this.isSelect + ", name='" + this.name + "', page=" + this.page + '}';
        }
    }

    public static class ExternalInfo extends BaseModel {
        private static final long serialVersionUID = -1139010678994442191L;
        public String chapterId;
        public String chapterReadId;
    }

    public static class Tag extends BaseModel {
        private static final long serialVersionUID = -6410935090240007223L;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f986id;
        public boolean inScreen;
        public String name;
    }

    public static class Volume extends BaseModel {
        private static final long serialVersionUID = -4523562715270282089L;
        public ArrayList<Chapter> chapters;
        public String name;
    }

    public void spliceChapters() {
        ArrayList<Volume> arrayList = this.volumes;
        if (arrayList != null) {
            for (Volume volume : arrayList) {
                if (volume != null && !j0.l(volume.chapters)) {
                    for (Chapter chapter : volume.chapters) {
                        if (chapter != null) {
                            chapter.volumeName = volume.name;
                            this.chapterList.add(chapter);
                        }
                    }
                }
            }
        }
    }
}
