package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzsq<E> extends AbstractList<E> implements zzun<E> {
    public boolean zzbkd = true;

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e) {
        zzpu();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        zzpu();
        return super.addAll(collection);
    }

    public void clear() {
        zzpu();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public E remove(int i) {
        zzpu();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        zzpu();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        zzpu();
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e) {
        zzpu();
        return (E) super.set(i, e);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public boolean zzps() {
        return this.zzbkd;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final void zzpt() {
        this.zzbkd = false;
    }

    public final void zzpu() {
        if (!this.zzbkd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e) {
        zzpu();
        super.add(i, e);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends E> collection) {
        zzpu();
        return super.addAll(i, collection);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        zzpu();
        return super.remove(obj);
    }
}
