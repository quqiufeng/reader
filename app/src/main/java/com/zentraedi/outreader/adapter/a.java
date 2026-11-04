package com.zentraedi.outreader.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class a<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public static final Class<?> d = a.class;
    public final LayoutInflater a;
    public final Context b;
    public List<T> c = new ArrayList();

    public a(Context context) {
        this.b = context;
        this.a = (LayoutInflater) context.getApplicationContext().getSystemService("layout_inflater");
    }

    public void D(List<T> data) {
        this.c.addAll(data);
        notifyDataSetChanged();
    }

    public abstract void E(VH vh2, int position);

    public abstract VH F(ViewGroup parent, int viewType);

    public void G(List<T> data) {
        this.c.clear();
        this.c.addAll(data);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.c.size();
    }

    public void onBindViewHolder(@n0 VH vh2, int position) {
        E(vh2, position);
    }

    @n0
    public VH onCreateViewHolder(@n0 ViewGroup viewGroup, int i) {
        return (VH) F(viewGroup, i);
    }
}
