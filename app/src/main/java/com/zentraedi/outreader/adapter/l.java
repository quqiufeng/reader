package com.zentraedi.outreader.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.outreader.event.MsgLoadChapterContentEvent;
import com.zentraedi.outreader.model.SectionContentEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class l extends com.zentraedi.reader.reader.l {
    private static final Class<?> A = l.class;
    private int s;
    private int t;
    private ArrayList<String> u;
    private final SparseArray<SectionContentEntity> v;
    private final String w;
    private int x;
    private int y;
    private int z;

    public l(Context context, String sourceId) {
        super(context);
        this.x = 0;
        this.v = new SparseArray<>();
        this.w = sourceId;
    }

    private boolean P(String position) {
        if (j0.l(this.u)) {
            return false;
        }
        return this.u.contains(position);
    }

    private int Q(int section, int sectionRecTypeOne, int sectionRecTypeTwo) {
        int i;
        if (section != 0 && ((i = this.s) == 0 || section % (i + 1) != 0)) {
            if (!P(section + "")) {
                return sectionRecTypeTwo;
            }
        }
        return sectionRecTypeOne;
    }

    @Override // com.zentraedi.reader.reader.l
    protected boolean A(int section) {
        return true;
    }

    @Override // com.zentraedi.reader.reader.l
    protected boolean B(int section) {
        return false;
    }

    @Override // com.zentraedi.reader.reader.l
    protected boolean C(int section) {
        return false;
    }

    public void G(int index, String content) {
        SparseArray<SectionContentEntity> sparseArray;
        SectionContentEntity sectionContentEntity;
        if (TextUtils.isEmpty(content) || (sparseArray = this.v) == null || (sectionContentEntity = sparseArray.get(index)) == null) {
            return;
        }
        sectionContentEntity.setContent(content);
    }

    public boolean H(int section, SectionContentEntity toAddEntry) {
        boolean zEquals;
        if (toAddEntry == null || section < 0) {
            return false;
        }
        SectionContentEntity sectionContentEntity = this.v.get(section);
        if (sectionContentEntity != null && !TextUtils.isEmpty(sectionContentEntity.getErrorStatus()) && TextUtils.isEmpty(toAddEntry.getErrorStatus())) {
            this.v.put(section, toAddEntry);
            return true;
        }
        if (sectionContentEntity != null) {
            if (sectionContentEntity.getContent() != null) {
                zEquals = sectionContentEntity.getContent().equals(toAddEntry.getContent());
            } else {
                zEquals = sectionContentEntity.getMupdfPath() != null ? sectionContentEntity.getMupdfPath().equals(toAddEntry.getMupdfPath()) : false;
            }
            if (zEquals) {
                this.v.put(section, toAddEntry);
                return false;
            }
        }
        this.v.put(section, toAddEntry);
        return true;
    }

    public void I() {
        SparseArray<SectionContentEntity> sparseArray = this.v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public void J() {
    }

    public void K() {
    }

    public List<String> L() {
        ArrayList arrayList = new ArrayList();
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                SectionContentEntity sectionContentEntityValueAt = this.v.valueAt(i);
                if (sectionContentEntityValueAt != null) {
                    arrayList.add(sectionContentEntityValueAt.getSectionId());
                }
            }
        }
        return arrayList;
    }

    public SectionContentEntity M(int section) {
        return this.v.get(section);
    }

    public int N(int section) {
        return 0;
    }

    public boolean O(int section) {
        return this.v.get(section) != null;
    }

    public void R(int shareUnLocked) {
        this.x = shareUnLocked;
    }

    public void S(int bookType) {
        this.z = bookType;
    }

    public void T(ArrayList<String> jumpChapterIds) {
        this.u = jumpChapterIds;
    }

    public void U(int count) {
        this.s = count;
    }

    public void V(int chapterCount) {
        this.y = chapterCount;
    }

    public void W(int count) {
        this.t = count;
    }

    @Override // com.zentraedi.reader.reader.l, com.zentraedi.reader.reader.f
    public String a(int section) {
        if (this.v.get(section) != null) {
            return this.v.get(section).getSectionName();
        }
        return null;
    }

    @Override // com.zentraedi.reader.reader.f
    public String d(int section) {
        SectionContentEntity sectionContentEntity = this.v.get(section);
        if (sectionContentEntity == null) {
            return null;
        }
        return o(section) == 1 ? sectionContentEntity.getMupdfPath() : sectionContentEntity.getContent();
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean g(int section) {
        return false;
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean i(int section) {
        return false;
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean j(int section) {
        return false;
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean k(int currentSection) {
        int i = currentSection + 1;
        return this.v.get(i) != null && TextUtils.isEmpty(this.v.get(i).getErrorStatus());
    }

    @Override // com.zentraedi.reader.reader.f
    public void l(int section) {
        org.greenrobot.eventbus.c.f().q(new MsgLoadChapterContentEvent(MsgLoadChapterContentEvent.LOAD_CHAPTER_CONTENT, section));
    }

    @Override // com.zentraedi.reader.reader.l, com.zentraedi.reader.reader.f
    public int n() {
        return this.y;
    }

    @Override // com.zentraedi.reader.reader.f
    public int o(int section) {
        return this.z == 2 ? 2 : 0;
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean p(int currentSection) {
        int i = currentSection - 1;
        return this.v.get(i) != null && TextUtils.isEmpty(this.v.get(i).getErrorStatus());
    }

    @Override // com.zentraedi.reader.reader.f
    public int q(int section) {
        return 0;
    }

    @Override // com.zentraedi.reader.reader.l
    protected int t(int section) {
        return 0;
    }

    @Override // com.zentraedi.reader.reader.l
    protected String v(int section) {
        SectionContentEntity sectionContentEntity = this.v.get(section);
        if (sectionContentEntity != null) {
            return sectionContentEntity.getErrorStatus();
        }
        return null;
    }

    @Override // com.zentraedi.reader.reader.l
    public int w(int section) {
        return 0;
    }
}
