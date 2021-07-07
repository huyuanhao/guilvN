package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzlf<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] zzacv = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(zzacv);
    }

    public int zza(Object[] objArr, int i) {
        zzlt zzlt = (zzlt) iterator();
        while (zzlt.hasNext()) {
            objArr[i] = zzlt.next();
            i++;
        }
        return i;
    }

    /* renamed from: zzij */
    public abstract zzlt<E> iterator();

    public Object[] zzik() {
        return null;
    }

    public int zzil() {
        throw new UnsupportedOperationException();
    }

    public int zzim() {
        throw new UnsupportedOperationException();
    }

    public zzlg<E> zzin() {
        return isEmpty() ? zzlg.zzip() : zzlg.zza(toArray());
    }

    public abstract boolean zzio();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzks.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzik = zzik();
            if (zzik != null) {
                return (T[]) Arrays.copyOfRange(zzik, zzil(), zzim(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }
}
