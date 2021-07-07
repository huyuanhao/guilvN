package com.google.android.gms.internal.firebase_ml;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzlg<E> extends zzlf<E> implements List<E>, RandomAccess {
    public static final zzlu<Object> zzacw = new zzlh(zzlm.zzadg, 0);

    public static <E> zzlg<E> zza(Object[] objArr) {
        int length = objArr.length;
        return length == 0 ? (zzlg<E>) zzlm.zzadg : new zzlm(objArr, length);
    }

    public static <E> zzlg<E> zzb(Collection<? extends E> collection) {
        if (collection instanceof zzlf) {
            zzlg<E> zzin = ((zzlf) collection).zzin();
            if (!zzin.zzio()) {
                return zzin;
            }
            Object[] array = zzin.toArray();
            int length = array.length;
            return length == 0 ? (zzlg<E>) zzlm.zzadg : new zzlm(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length3 = array2.length;
        return length3 == 0 ? (zzlg<E>) zzlm.zzadg : new zzlm(array2, length3);
    }

    public static <E> zzlg<E> zzip() {
        return (zzlg<E>) zzlm.zzadg;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzks.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzkn.equal(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!zzkn.equal(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        zzks.zzc(i, size());
        if (isEmpty()) {
            return zzacw;
        }
        return new zzlh(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zzd */
    public zzlg<E> subList(int i, int i2) {
        zzks.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (zzlg<E>) zzlm.zzadg : new zzli(this, i, i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    /* renamed from: zzij */
    public final zzlt<E> iterator() {
        return (zzlu) listIterator();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final zzlg<E> zzin() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzlu) listIterator(0);
    }
}
