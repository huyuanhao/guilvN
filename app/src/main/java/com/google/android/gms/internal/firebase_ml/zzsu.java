package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzsu extends zzsq<Boolean> implements zzun<Boolean>, zzwa, RandomAccess {
    public static final zzsu zzbkj;
    public int size;
    public boolean[] zzbkk;

    static {
        zzsu zzsu = new zzsu(new boolean[0], 0);
        zzbkj = zzsu;
        zzsu.zzpt();
    }

    public zzsu() {
        this(new boolean[10], 0);
    }

    private final void zza(int i, boolean z) {
        int i2;
        zzpu();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        boolean[] zArr = this.zzbkk;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzbkk, i, zArr2, i + 1, this.size - i);
            this.zzbkk = zArr2;
        }
        this.zzbkk[i] = z;
        this.size++;
        ((AbstractList) this).modCount++;
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

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Boolean bool) {
        zza(i, bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzsu)) {
            return super.addAll(collection);
        }
        zzsu zzsu = (zzsu) collection;
        int i = zzsu.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zzbkk;
            if (i3 > zArr.length) {
                this.zzbkk = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzsu.zzbkk, 0, this.zzbkk, this.size, zzsu.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addBoolean(boolean z) {
        zza(this.size, z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsu)) {
            return super.equals(obj);
        }
        zzsu zzsu = (zzsu) obj;
        if (this.size != zzsu.size) {
            return false;
        }
        boolean[] zArr = zzsu.zzbkk;
        for (int i = 0; i < this.size; i++) {
            if (this.zzbkk[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        zzci(i);
        return Boolean.valueOf(this.zzbkk[i]);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzug.zzaj(this.zzbkk[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List
    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zzbkk[i]))) {
                boolean[] zArr = this.zzbkk;
                System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
            boolean[] zArr = this.zzbkk;
            System.arraycopy(zArr, i2, zArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Boolean set(int i, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        zzpu();
        zzci(i);
        boolean[] zArr = this.zzbkk;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.firebase_ml.zzun' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final /* synthetic */ zzun<Boolean> zzck(int i) {
        if (i >= this.size) {
            return new zzsu(Arrays.copyOf(this.zzbkk, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public zzsu(boolean[] zArr, int i) {
        this.zzbkk = zArr;
        this.size = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Boolean remove(int i) {
        zzpu();
        zzci(i);
        boolean[] zArr = this.zzbkk;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
