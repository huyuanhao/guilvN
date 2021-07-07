package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzdc extends zzav<Long> implements zzcn<Long>, RandomAccess {
    public static final zzdc zzlw;
    public int size;
    public long[] zzlx;

    static {
        zzdc zzdc = new zzdc();
        zzlw = zzdc;
        zzdc.zzv();
    }

    public zzdc() {
        this(new long[10], 0);
    }

    public zzdc(long[] jArr, int i) {
        this.zzlx = jArr;
        this.size = i;
    }

    public static zzdc zzbx() {
        return zzlw;
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    private final String zzh(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void zzk(int i, long j) {
        int i2;
        zzw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        long[] jArr = this.zzlx;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzlx, i, jArr2, i + 1, this.size - i);
            this.zzlx = jArr2;
        }
        this.zzlx[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ void add(int i, Long l) {
        zzk(i, l.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzdc)) {
            return super.addAll(collection);
        }
        zzdc zzdc = (zzdc) collection;
        int i = zzdc.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzlx;
            if (i3 > jArr.length) {
                this.zzlx = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzdc.zzlx, 0, this.zzlx, this.size, zzdc.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return super.equals(obj);
        }
        zzdc zzdc = (zzdc) obj;
        if (this.size != zzdc.size) {
            return false;
        }
        long[] jArr = zzdc.zzlx;
        for (int i = 0; i < this.size; i++) {
            if (this.zzlx[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        zzg(i);
        return this.zzlx[i];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzci.zzl(this.zzlx[i2]);
        }
        return i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ Long remove(int i) {
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzlx[i]))) {
                long[] jArr = this.zzlx;
                System.arraycopy(jArr, i + 1, jArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        zzw();
        if (i2 >= i) {
            long[] jArr = this.zzlx;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ Long set(int i, Long l) {
        long longValue = l.longValue();
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.clearcut.zzcn' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Long> zzi(int i) {
        if (i >= this.size) {
            return new zzdc(Arrays.copyOf(this.zzlx, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzm(long j) {
        zzk(this.size, j);
    }
}
