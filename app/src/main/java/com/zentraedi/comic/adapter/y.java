package com.zentraedi.comic.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.manager.placeholder.PlaceholderLoader;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.utils.l5;
import com.zentraedi.comic.databinding.c3;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.l6;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class y extends com.zentraedi.comic.adapter.b {

    @fo.k
    public static final a e = new a(null);
    private static final int f = 100663296;

    @fo.k
    private final Map<String, ImageView> d = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    private final void P(String str, ImageView imageView) {
        com.bumptech.glide.c.F(imageView.getContext()).u().A1(str).r1(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(y yVar, int i, View view) {
        b0 b0VarH = yVar.H();
        if (b0VarH != null) {
            b0VarH.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(y yVar, Pair pair) {
        if (!Intrinsics.areEqual(pair.getFirst(), "100%")) {
            return Unit.INSTANCE;
        }
        ImageView imageView = yVar.d.get(pair.getSecond());
        if (imageView == null) {
            return Unit.INSTANCE;
        }
        yVar.P(imageView.getTag(f).toString(), imageView);
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.comic.adapter.b
    public void D(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k c holder, final int i) {
        c3 c3Var;
        String path;
        Intrinsics.checkNotNullParameter(holder, "holder");
        androidx.databinding.a aVar = G().get(i);
        if (!(aVar instanceof l6) || (c3Var = (c3) androidx.databinding.m.a(((RecyclerView.ViewHolder) holder).itemView)) == null) {
            return;
        }
        ((RecyclerView.ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.adapter.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.R(this.a, i, view);
            }
        });
        l6 l6Var = (l6) aVar;
        String strH = l6Var.h();
        if (new File(strH).exists()) {
            ImageFilterView pvPic = c3Var.E;
            Intrinsics.checkNotNullExpressionValue(pvPic, "pvPic");
            P(strH, pvPic);
        } else if (Integer.parseInt(l6Var.j()) == 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.zentraedi.comic.m.z());
            com.zentraedi.comic.b0 b0Var = com.zentraedi.comic.b0.a;
            CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
            if (compressionBrowserResponseT == null || (path = compressionBrowserResponseT.getPath()) == null) {
                path = "";
            }
            sb.append(l5.y(com.zentraedi.comic.m.k(path)));
            sb.append(File.separator);
            sb.append(l6Var.getPath());
            String string = sb.toString();
            if (new File(string).exists()) {
                ImageFilterView pvPic2 = c3Var.E;
                Intrinsics.checkNotNullExpressionValue(pvPic2, "pvPic");
                P(string, pvPic2);
            } else {
                b0Var.r(l6Var.getPath(), b0Var.k(l6Var.getPath()), 0, l6Var.u());
                this.d.put(string, c3Var.E);
                c3Var.E.setTag(f, string);
                d1<Pair<String, String>> d1VarU = l6Var.u();
                p0 p0VarF = F();
                Intrinsics.checkNotNull(p0VarF, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                d1VarU.k(p0VarF, new b(new Function1() { // from class: com.zentraedi.comic.adapter.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y.S(this.a, (Pair) obj);
                    }
                }));
            }
        } else {
            new PlaceholderLoader.Builder().url(strH).view(c3Var.E).type(11).scaleType(ImageView.ScaleType.CENTER_CROP).preview(false).bigImage(false).load();
        }
        c3Var.F.setText(String.valueOf(i + 1));
        c3Var.u();
    }
}
