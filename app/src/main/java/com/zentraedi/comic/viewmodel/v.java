package com.zentraedi.comic.viewmodel;

import android.text.TextUtils;
import android.view.View;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.model.ComicCategoryListResponse;
import com.zentraedi.comic.request.ComicCategoryListRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCategoryManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryManagementViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class v extends com.zentraedi.basic.function.viewmodel.e {

    @fo.l
    private Function1<? super Boolean, Unit> c;

    @fo.l
    private Function1<? super Boolean, Unit> d;
    private boolean e;

    @fo.k
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.T();
        }
    });

    @fo.k
    private final com.zentraedi.comic.adapter.k b = new com.zentraedi.comic.adapter.k();

    @fo.k
    private final ComicCategoryListRequest f = new ComicCategoryListRequest();

    @fo.k
    private final ObservableField<Boolean> g = new ObservableField<>(t7.d(com.zentraedi.comic.constant.a.b + com.zentraedi.business.w0.F(), Boolean.TRUE));

    @fo.k
    private final ObservableField<Boolean> h = new ObservableField<>(Boolean.FALSE);

    @SourceDebugExtension({"SMAP\nComicCategoryManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryManagementViewModel$getCategory$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
    public static final class a extends com.zentraedi.business.http.b<ComicCategoryListResponse> {
        a() {
        }

        public void onResult(ResponseData<ComicCategoryListResponse> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            Function1<Boolean, Unit> function1C0 = v.this.c0();
            if (function1C0 != null) {
                function1C0.invoke(Boolean.valueOf(resp.isSuccess()));
            }
            if (resp.isSuccess()) {
                List<ComicCategory> list = resp.getData().getList();
                if (list != null) {
                    v.this.d0().U1(list);
                }
                com.zentraedi.comic.business.a1.d.b(resp.getData().getList());
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
            ObservableField<Boolean> showEmpty = v.this.getShowEmpty();
            List<ComicCategory> list2 = resp.getData().getList();
            showEmpty.set(list2 != null ? Boolean.valueOf(list2.isEmpty()) : null);
            v.this.e = false;
        }

        public void onServerError() {
            Function1<Boolean, Unit> function1C0 = v.this.c0();
            if (function1C0 != null) {
                function1C0.invoke(Boolean.FALSE);
            }
            v.this.getShowEmpty().set(Boolean.valueOf(v.this.d0().getData().isEmpty()));
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.jF4);
            v.this.e = false;
        }
    }

    public static final class b extends ItemTouchHelper.SimpleCallback {
        b() {
            super(3, 0);
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            viewHolder.itemView.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.Vd));
            super/*androidx.recyclerview.widget.ItemTouchHelper.Callback*/.clearView(recyclerView, viewHolder);
            v.this.g0();
            Function1<Boolean, Unit> function1Z = v.this.Z();
            if (function1Z != null) {
                function1Z.invoke(Boolean.TRUE);
            }
        }

        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            if (v.this.e) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition2 < 0) {
                return false;
            }
            if (adapterPosition >= adapterPosition2) {
                int i = adapterPosition2 + 1;
                if (i <= adapterPosition) {
                    int i2 = adapterPosition;
                    while (true) {
                        Collections.swap(v.this.d0().getData(), i2, i2 - 1);
                        if (i2 == i) {
                            break;
                        }
                        i2--;
                    }
                }
            } else {
                int i3 = adapterPosition;
                while (i3 < adapterPosition2) {
                    int i4 = i3 + 1;
                    Collections.swap(v.this.d0().getData(), i3, i4);
                    i3 = i4;
                }
            }
            v.this.d0().notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            View view;
            Function1<Boolean, Unit> function1Z = v.this.Z();
            if (function1Z != null) {
                function1Z.invoke(Boolean.FALSE);
            }
            if (viewHolder != null && (view = viewHolder.itemView) != null) {
                view.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.z9));
            }
            super/*androidx.recyclerview.widget.ItemTouchHelper.Callback*/.onSelectedChanged(viewHolder, i);
        }

        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(v vVar, Function1 function1, com.chad.library.adapter.base.c cVar, View view, int i) {
        ComicCategory comicCategory = (ComicCategory) vVar.b.getItem(i);
        if (comicCategory != null) {
            function1.invoke(comicCategory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 T() {
        return new com.zentraedi.comic.business.a1();
    }

    private final com.zentraedi.comic.business.a1 Y() {
        return (com.zentraedi.comic.business.a1) this.a.getValue();
    }

    private final ItemTouchHelper.SimpleCallback b0() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        StringBuilder sb = new StringBuilder();
        List data = this.b.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (IndexedValue indexedValue : CollectionsKt.withIndex(data)) {
            if (indexedValue.getIndex() > 0) {
                sb.append(",");
            }
            sb.append(((ComicCategory) indexedValue.getValue()).getId() + ':' + (indexedValue.getIndex() + 1));
        }
        com.zentraedi.comic.business.a1 a1VarY = Y();
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        a1VarY.z0(string, new Function1() { // from class: com.zentraedi.comic.viewmodel.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.h0(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(v vVar, boolean z) {
        if (!z) {
            vVar.X();
        }
        return Unit.INSTANCE;
    }

    public final void R(@fo.k RecyclerView recyclerView, @fo.k final Function1<? super ComicCategory, Unit> itemOnClickListener) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemOnClickListener, "itemOnClickListener");
        this.b.Y1(new com.chad.library.adapter.base.c.k() { // from class: com.zentraedi.comic.viewmodel.t
            public final void a(com.chad.library.adapter.base.c cVar, View view, int i) {
                v.S(this.a, itemOnClickListener, cVar, view, i);
            }
        });
        new ItemTouchHelper(b0()).attachToRecyclerView(recyclerView);
    }

    public final void U() {
        Y().R();
    }

    public final void V(@fo.k String id2) {
        int index;
        Intrinsics.checkNotNullParameter(id2, "id");
        List data = this.b.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = CollectionsKt.withIndex(data).iterator();
        while (true) {
            if (!it.hasNext()) {
                index = -1;
                break;
            }
            IndexedValue indexedValue = (IndexedValue) it.next();
            if (TextUtils.equals(((ComicCategory) indexedValue.getValue()).getId(), id2)) {
                index = indexedValue.getIndex();
                break;
            }
        }
        if (index >= 0) {
            this.b.t1(index);
        }
        this.h.set(Boolean.valueOf(this.b.getData().isEmpty()));
    }

    public final void W(@fo.k String id2, @fo.k String name) {
        int index;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        List data = this.b.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = CollectionsKt.withIndex(data).iterator();
        while (true) {
            if (!it.hasNext()) {
                index = -1;
                break;
            }
            IndexedValue indexedValue = (IndexedValue) it.next();
            if (TextUtils.equals(((ComicCategory) indexedValue.getValue()).getId(), id2)) {
                index = indexedValue.getIndex();
                ((ComicCategory) indexedValue.getValue()).setName(name);
                break;
            }
        }
        if (index >= 0) {
            this.b.notifyItemChanged(index);
        }
    }

    public final void X() {
        this.e = true;
        com.zentraedi.business.http.a.b().h(this.f, new a());
    }

    @fo.l
    public final Function1<Boolean, Unit> Z() {
        return this.d;
    }

    @fo.l
    public final Function1<Boolean, Unit> c0() {
        return this.c;
    }

    @fo.k
    public final com.zentraedi.comic.adapter.k d0() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Boolean> e0() {
        return this.g;
    }

    public final void f0() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        ObservableField<Boolean> observableField = this.g;
        Boolean bool = Boolean.FALSE;
        observableField.set(bool);
        t7.j(com.zentraedi.comic.constant.a.b + com.zentraedi.business.w0.F(), bool);
    }

    @fo.k
    public final ObservableField<Boolean> getShowEmpty() {
        return this.h;
    }

    public final void i0(@fo.l Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    public final void j0(@fo.l Function1<? super Boolean, Unit> function1) {
        this.c = function1;
    }
}
