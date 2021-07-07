package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzvc extends zzsq<Long> implements zzun<Long>, zzwa, RandomAccess {
    public static final zzvc zzbqh;
    public int size;
    public long[] zzbqi;

    static {
        zzvc zzvc = new zzvc(new long[0], 0);
        zzbqh = zzvc;
        zzvc.zzpt();
    }

    public zzvc() {
        this(new long[10], 0);
    }

    private final void zzci(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
    }

    private final String zzcj(int i) {
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
        zzpu();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        long[] jArr = this.zzbqi;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzbqi, i, jArr2, i + 1, this.size - i);
            this.zzbqi = jArr2;
        }
        this.zzbqi[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Long l) {
        zzk(i, l.longValue());
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzvc)) {
            return super.addAll(collection);
        }
        zzvc zzvc = (zzvc) collection;
        int i = zzvc.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzbqi;
            if (i3 > jArr.length) {
                this.zzbqi = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzvc.zzbqi, 0, this.zzbqi, this.size, zzvc.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvc)) {
            return super.equals(obj);
        }
        zzvc zzvc = (zzvc) obj;
        if (this.size != zzvc.size) {
            return false;
        }
        long[] jArr = zzvc.zzbqi;
        for (int i = 0; i < this.size; i++) {
            if (this.zzbqi[i] != jArr[i]) {
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
        zzci(i);
        return this.zzbqi[i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzug.zzz(this.zzbqi[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List
    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzbqi[i]))) {
                long[] jArr = this.zzbqi;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        zzpu();
        if (i2 >= i) {
            long[] jArr = this.zzbqi;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Long set(int i, Long l) {
        long longValue = l.longValue();
        zzpu();
        zzci(i);
        long[] jArr = this.zzbqi;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.size;
    }

    public final void zzaa(long j) {
        zzk(this.size, j);
    }

    /* Return type fixed from 'com.google.android.gms.internal.firebase_ml.zzun' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final /* synthetic */ zzun<Long> zzck(int i) {
        if (i >= this.size) {
            return new zzvc(Arrays.copyOf(this.zzbqi, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public zzvc(long[] jArr, int i) {
        this.zzbqi = jArr;
        this.size = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Long remove(int i) {
        zzpu();
        zzci(i);
        long[] jArr = this.zzbqi;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
