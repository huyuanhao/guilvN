package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzgt extends zzef<Long> implements zzge<Long>, zzhr, RandomAccess {
    public static final zzgt zzyq;
    public int size;
    public long[] zzyr;

    static {
        zzgt zzgt = new zzgt();
        zzyq = zzgt;
        zzgt.zzci();
    }

    public zzgt() {
        this(new long[10], 0);
    }

    private final void zzaf(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzag(i));
        }
    }

    private final String zzag(int i) {
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
        zzcj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzag(i));
        }
        long[] jArr = this.zzyr;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzyr, i, jArr2, i + 1, this.size - i);
            this.zzyr = jArr2;
        }
        this.zzyr[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ void add(int i, Long l) {
        zzk(i, l.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.vision.zzef, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzgt)) {
            return super.addAll(collection);
        }
        zzgt zzgt = (zzgt) collection;
        int i = zzgt.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzyr;
            if (i3 > jArr.length) {
                this.zzyr = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzgt.zzyr, 0, this.zzyr, this.size, zzgt.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.vision.zzef
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgt)) {
            return super.equals(obj);
        }
        zzgt zzgt = (zzgt) obj;
        if (this.size != zzgt.size) {
            return false;
        }
        long[] jArr = zzgt.zzyr;
        for (int i = 0; i < this.size; i++) {
            if (this.zzyr[i] != jArr[i]) {
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
        zzaf(i);
        return this.zzyr[i];
    }

    @Override // com.google.android.gms.internal.vision.zzef
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzga.zzo(this.zzyr[i2]);
        }
        return i;
    }

    @Override // java.util.List, com.google.android.gms.internal.vision.zzef
    public final boolean remove(Object obj) {
        zzcj();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzyr[i]))) {
                long[] jArr = this.zzyr;
                System.arraycopy(jArr, i + 1, jArr, i, this.size - i);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        zzcj();
        if (i2 >= i) {
            long[] jArr = this.zzyr;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Long set(int i, Long l) {
        long longValue = l.longValue();
        zzcj();
        zzaf(i);
        long[] jArr = this.zzyr;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.vision.zzge' to match base method */
    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Long> zzah(int i) {
        if (i >= this.size) {
            return new zzgt(Arrays.copyOf(this.zzyr, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzp(long j) {
        zzk(this.size, j);
    }

    public zzgt(long[] jArr, int i) {
        this.zzyr = jArr;
        this.size = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Long remove(int i) {
        zzcj();
        zzaf(i);
        long[] jArr = this.zzyr;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
