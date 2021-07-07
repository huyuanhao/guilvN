package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class zzwc<E> extends zzsq<E> {
    public static final zzwc<Object> zzbrt;
    public final List<E> zzbqd;

    static {
        zzwc<Object> zzwc = new zzwc<>(new ArrayList(0));
        zzbrt = zzwc;
        zzwc.zzpt();
    }

    public zzwc() {
        this(new ArrayList(10));
    }

    public static <E> zzwc<E> zzsp() {
        return (zzwc<E>) zzbrt;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final void add(int i, E e) {
        zzpu();
        this.zzbqd.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        return this.zzbqd.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final E remove(int i) {
        zzpu();
        E remove = this.zzbqd.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final E set(int i, E e) {
        zzpu();
        E e2 = this.zzbqd.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    public final int size() {
        return this.zzbqd.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final /* synthetic */ zzun zzck(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzbqd);
            return new zzwc(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public zzwc(List<E> list) {
        this.zzbqd = list;
    }
}
