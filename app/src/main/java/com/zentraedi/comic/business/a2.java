package com.zentraedi.comic.business;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a2 {

    @fo.k
    private final ArrayList<com.zentraedi.business.addfile.n> a = new ArrayList<>();

    @fo.k
    private final ArrayList<com.zentraedi.business.addfile.n> b = new ArrayList<>();
    private boolean c;

    @fo.l
    private a d;

    public interface a {
        void a();
    }

    public final void a(boolean z) {
        Iterator<com.zentraedi.business.addfile.n> it = this.b.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.zentraedi.business.addfile.n next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.x.set(z);
        }
    }

    @fo.k
    public final ArrayList<com.zentraedi.business.addfile.n> b() {
        return this.b;
    }

    @fo.l
    public final a c() {
        return this.d;
    }

    @fo.k
    public final ArrayList<com.zentraedi.business.addfile.n> d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final void f(@fo.k com.zentraedi.business.addfile.n vm) {
        Intrinsics.checkNotNullParameter(vm, "vm");
        if (vm.w.get()) {
            vm.w.set(false);
            this.a.remove(vm);
        } else {
            vm.w.set(true);
            this.a.add(vm);
        }
        i();
    }

    public final void g() {
        Iterator<com.zentraedi.business.addfile.n> it = this.b.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.zentraedi.business.addfile.n next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.w.set(true);
        }
        this.a.clear();
        this.a.addAll(this.b);
        i();
    }

    public final void h() {
        Iterator<com.zentraedi.business.addfile.n> it = this.a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.zentraedi.business.addfile.n next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.w.set(false);
        }
        this.a.clear();
        i();
    }

    public final void i() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void j(@fo.l a aVar) {
        this.d = aVar;
    }

    public final void k(boolean z) {
        this.c = z;
    }
}
