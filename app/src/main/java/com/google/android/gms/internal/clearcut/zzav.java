package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzav<E> extends AbstractList<E> implements zzcn<E> {
    public boolean zzfa = true;

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e) {
        zzw();
        super.add(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e) {
        zzw();
        return super.add(e);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends E> collection) {
        zzw();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        zzw();
        return super.addAll(collection);
    }

    public void clear() {
        zzw();
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
        zzw();
        return (E) super.remove(i);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        zzw();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        zzw();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        zzw();
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e) {
        zzw();
        return (E) super.set(i, e);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public boolean zzu() {
        return this.zzfa;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final void zzv() {
        this.zzfa = false;
    }

    public final void zzw() {
        if (!this.zzfa) {
            throw new UnsupportedOperationException();
        }
    }
}
