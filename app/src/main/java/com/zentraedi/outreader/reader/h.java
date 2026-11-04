package com.zentraedi.outreader.reader;

import androidx.fragment.app.Fragment;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.reader.i;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class h implements i {

    @k
    public static final a a = new a(null);

    @k
    public static final String b = "ZReader";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.zentraedi.reader.i
    public int b() {
        return 0;
    }

    @Override // com.zentraedi.reader.i
    @k
    public List<LocalPdfBookModel.LocalPdfChapter> e() {
        return CollectionsKt.emptyList();
    }

    @Override // com.zentraedi.reader.i
    public void g(int i, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
    }

    @Override // com.zentraedi.reader.i
    public void k(int i, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
    }

    @l
    public abstract Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation);

    @l
    public abstract Object n(@k Continuation<? super String> continuation);

    public abstract int o();

    @k
    public abstract String p();

    @l
    public abstract Fragment q();

    @k
    public abstract List<Integer> r();

    @l
    public abstract Object s(int i, @k Continuation<? super Unit> continuation);

    @l
    public abstract Object t(@k ChapterM.Chapter chapter, @k Continuation<? super Unit> continuation);

    public abstract void u();

    public abstract void v();

    @l
    public abstract Object w(@k Continuation<? super Unit> continuation);

    @l
    public abstract Object x(@k Continuation<? super Unit> continuation);

    public abstract boolean y(int i);

    public abstract void z(int i);
}
