package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzfz extends zzef<Integer> implements zzge<Integer>, zzhr, RandomAccess {
    public static final zzfz zzxl;
    public int size;
    public int[] zzxm;

    static {
        zzfz zzfz = new zzfz();
        zzxl = zzfz;
        zzfz.zzci();
    }

    public zzfz() {
        this(new int[10], 0);
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

    private final void zzq(int i, int i2) {
        int i3;
        zzcj();
        if (i < 0 || i > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzag(i));
        }
        int[] iArr = this.zzxm;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzxm, i, iArr2, i + 1, this.size - i);
            this.zzxm = iArr2;
        }
        this.zzxm[i] = i2;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ void add(int i, Integer num) {
        zzq(i, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.vision.zzef, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfz)) {
            return super.addAll(collection);
        }
        zzfz zzfz = (zzfz) collection;
        int i = zzfz.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzxm;
            if (i3 > iArr.length) {
                this.zzxm = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzfz.zzxm, 0, this.zzxm, this.size, zzfz.size);
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
        if (!(obj instanceof zzfz)) {
            return super.equals(obj);
        }
        zzfz zzfz = (zzfz) obj;
        if (this.size != zzfz.size) {
            return false;
        }
        int[] iArr = zzfz.zzxm;
        for (int i = 0; i < this.size; i++) {
            if (this.zzxm[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        zzaf(i);
        return this.zzxm[i];
    }

    @Override // com.google.android.gms.internal.vision.zzef
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzxm[i2];
        }
        return i;
    }

    @Override // java.util.List, com.google.android.gms.internal.vision.zzef
    public final boolean remove(Object obj) {
        zzcj();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzxm[i]))) {
                int[] iArr = this.zzxm;
                System.arraycopy(iArr, i + 1, iArr, i, this.size - i);
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
            int[] iArr = this.zzxm;
            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Integer set(int i, Integer num) {
        int intValue = num.intValue();
        zzcj();
        zzaf(i);
        int[] iArr = this.zzxm;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.vision.zzge' to match base method */
    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Integer> zzah(int i) {
        if (i >= this.size) {
            return new zzfz(Arrays.copyOf(this.zzxm, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzbg(int i) {
        zzq(this.size, i);
    }

    public zzfz(int[] iArr, int i) {
        this.zzxm = iArr;
        this.size = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Integer remove(int i) {
        zzcj();
        zzaf(i);
        int[] iArr = this.zzxm;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
