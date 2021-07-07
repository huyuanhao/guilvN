package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzef<E> extends AbstractList<E> implements zzge<E> {
    public boolean zzrl = true;

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e) {
        zzcj();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        zzcj();
        return super.addAll(collection);
    }

    public void clear() {
        zzcj();
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
        zzcj();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        zzcj();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        zzcj();
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e) {
        zzcj();
        return (E) super.set(i, e);
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public boolean zzch() {
        return this.zzrl;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final void zzci() {
        this.zzrl = false;
    }

    public final void zzcj() {
        if (!this.zzrl) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e) {
        zzcj();
        super.add(i, e);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends E> collection) {
        zzcj();
        return super.addAll(i, collection);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        zzcj();
        return super.remove(obj);
    }
}
