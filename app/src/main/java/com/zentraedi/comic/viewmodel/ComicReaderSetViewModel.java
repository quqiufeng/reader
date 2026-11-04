package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import com.zentraedi.business.model.BaseBottomDialogModel;
import com.zentraedi.business.model.BaseBottomDialogViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicReaderSetViewModel extends com.zentraedi.basic.function.viewmodel.e {

    @fo.k
    private final ObservableField<Integer> a = new ObservableField<>(0);

    @fo.k
    private final ObservableField<String> b = new ObservableField<>("");

    @fo.k
    private final ObservableField<String> c = new ObservableField<>("");

    @fo.k
    private final ObservableField<Boolean> d;

    @fo.k
    private final ObservableField<Long> e;

    @fo.k
    private final ObservableField<Integer> f;

    @fo.k
    private final ObservableField<Integer> g;

    @fo.k
    private final ObservableField<Boolean> h;

    @fo.l
    private com.zentraedi.business.dialog.c i;

    @fo.k
    private final List<BaseBottomDialogModel> j;

    @fo.l
    private BaseBottomDialogViewModel k;

    @fo.l
    private View.OnClickListener l;

    public enum ReadModel {
        SCROLL(0),
        COMMON(1),
        MANGE(2);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int value;

        ReadModel(int i) {
            this.value = i;
        }

        @fo.k
        public static EnumEntries<ReadModel> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum ReadQuality {
        TALL(0),
        MIDDLE(1),
        LOW(2);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int value;

        ReadQuality(int i) {
            this.value = i;
        }

        @fo.k
        public static EnumEntries<ReadQuality> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ComicReaderSetViewModel() {
        Boolean bool = Boolean.TRUE;
        this.d = new ObservableField<>(bool);
        this.e = new ObservableField<>(0L);
        this.f = new ObservableField<>(0);
        this.g = new ObservableField<>(1);
        this.h = new ObservableField<>(bool);
        this.j = new ArrayList();
    }

    private final void Y(Context context) {
        if (context instanceof AppCompatActivity) {
            BaseBottomDialogViewModel baseBottomDialogViewModelC = androidx.lifecycle.p2.c((FragmentActivity) context).c(BaseBottomDialogViewModel.class);
            this.k = baseBottomDialogViewModelC;
            if (baseBottomDialogViewModelC != null) {
                baseBottomDialogViewModelC.createData(this.j);
            }
            com.zentraedi.business.dialog.c cVar = new com.zentraedi.business.dialog.c((AppCompatActivity) context, new Function1() { // from class: com.zentraedi.comic.viewmodel.p4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicReaderSetViewModel.Z(this.a, (BaseBottomDialogModel) obj);
                }
            });
            this.i = cVar;
            cVar.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(final ComicReaderSetViewModel comicReaderSetViewModel, BaseBottomDialogModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String itemDes = it.getItemDes();
        if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UI))) {
            comicReaderSetViewModel.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UI));
            comicReaderSetViewModel.a.set(Integer.valueOf(ReadModel.SCROLL.getValue()));
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fM))) {
            comicReaderSetViewModel.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fM));
            comicReaderSetViewModel.a.set(Integer.valueOf(ReadModel.COMMON.getValue()));
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gM))) {
            comicReaderSetViewModel.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gM));
            comicReaderSetViewModel.a.set(Integer.valueOf(ReadModel.MANGE.getValue()));
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JJ))) {
            com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sL);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
            Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
            n4VarA.T2(activityE, strN, strN2, strN3, strN4, new Function0() { // from class: com.zentraedi.comic.viewmodel.q4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComicReaderSetViewModel.b0(this.a);
                }
            }, new Function0() { // from class: com.zentraedi.comic.viewmodel.r4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComicReaderSetViewModel.c0();
                }
            }, com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.Nf));
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iK))) {
            comicReaderSetViewModel.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iK));
            comicReaderSetViewModel.g.set(Integer.valueOf(ReadQuality.MIDDLE.getValue()));
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eK))) {
            comicReaderSetViewModel.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eK));
            comicReaderSetViewModel.g.set(Integer.valueOf(ReadQuality.LOW.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(ComicReaderSetViewModel comicReaderSetViewModel) {
        comicReaderSetViewModel.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JJ));
        comicReaderSetViewModel.g.set(Integer.valueOf(ReadQuality.TALL.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0() {
        return Unit.INSTANCE;
    }

    public final void O(@fo.k View view) {
        ObservableField mTitle;
        Intrinsics.checkNotNullParameter(view, "view");
        this.j.clear();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UI);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.c.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UI)), (String) null, (String) null, strN, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fM);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.c.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fM)), (String) null, (String) null, strN2, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gM);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.c.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gM)), (String) null, (String) null, strN3, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Y(context);
        BaseBottomDialogViewModel baseBottomDialogViewModel = this.k;
        if (baseBottomDialogViewModel == null || (mTitle = baseBottomDialogViewModel.getMTitle()) == null) {
            return;
        }
        mTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.NK));
    }

    public final void P(@fo.k View view) {
        ObservableField mTitle;
        Intrinsics.checkNotNullParameter(view, "view");
        this.j.clear();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JJ);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.b.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JJ)), (String) null, (String) null, strN, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iK);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.b.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iK)), (String) null, (String) null, strN2, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eK);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        this.j.add(new BaseBottomDialogModel(0, Intrinsics.areEqual(this.b.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eK)), (String) null, (String) null, strN3, com.zentraedi.comic.q.h.ef, com.zentraedi.comic.q.h.cf, (String) null, 141, (DefaultConstructorMarker) null));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Y(context);
        BaseBottomDialogViewModel baseBottomDialogViewModel = this.k;
        if (baseBottomDialogViewModel == null || (mTitle = baseBottomDialogViewModel.getMTitle()) == null) {
            return;
        }
        mTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.NJ));
    }

    @fo.k
    public final ObservableField<Integer> Q() {
        return this.f;
    }

    @fo.k
    public final ObservableField<Integer> R() {
        return this.g;
    }

    @fo.k
    public final ObservableField<Boolean> S() {
        return this.d;
    }

    @fo.k
    public final ObservableField<Long> T() {
        return this.e;
    }

    @fo.k
    public final ObservableField<Boolean> U() {
        return this.h;
    }

    @fo.k
    public final ObservableField<String> V() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Integer> W() {
        return this.a;
    }

    @fo.k
    public final ObservableField<String> X() {
        return this.c;
    }

    @fo.l
    public final View.OnClickListener getLeftIconOnClickListener() {
        return this.l;
    }

    @fo.k
    public final List<BaseBottomDialogModel> getMBottomDialogData() {
        return this.j;
    }

    public final void initData() {
        Integer num = (Integer) this.a.get();
        if (num != null && num.intValue() == 0) {
            this.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UI));
        } else if (num != null && num.intValue() == 1) {
            this.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fM));
        } else if (num != null && num.intValue() == 2) {
            this.c.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gM));
        }
        Integer num2 = (Integer) this.g.get();
        if (num2 != null && num2.intValue() == 0) {
            this.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JJ));
            return;
        }
        if (num2 != null && num2.intValue() == 1) {
            this.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iK));
        } else if (num2 != null && num2.intValue() == 2) {
            this.b.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eK));
        }
    }

    public final void setLeftIconOnClickListener(@fo.l View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }
}
