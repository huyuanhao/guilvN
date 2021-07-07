package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzch extends zzav<Integer> implements zzcn<Integer>, RandomAccess {
    public static final zzch zzkr;
    public int size;
    public int[] zzks;

    static {
        zzch zzch = new zzch();
        zzkr = zzch;
        zzch.zzv();
    }

    public zzch() {
        this(new int[10], 0);
    }

    public zzch(int[] iArr, int i) {
        this.zzks = iArr;
        this.size = i;
    }

    public static zzch zzbk() {
        return zzkr;
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

    private final void zzo(int i, int i2) {
        int i3;
        zzw();
        if (i < 0 || i > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int[] iArr = this.zzks;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzks, i, iArr2, i + 1, this.size - i);
            this.zzks = iArr2;
        }
        this.zzks[i] = i2;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ void add(int i, Integer num) {
        zzo(i, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (!(collection instanceof zzch)) {
            return super.addAll(collection);
        }
        zzch zzch = (zzch) collection;
        int i = zzch.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzks;
            if (i3 > iArr.length) {
                this.zzks = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzch.zzks, 0, this.zzks, this.size, zzch.size);
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
        if (!(obj instanceof zzch)) {
            return super.equals(obj);
        }
        zzch zzch = (zzch) obj;
        if (this.size != zzch.size) {
            return false;
        }
        int[] iArr = zzch.zzks;
        for (int i = 0; i < this.size; i++) {
            if (this.zzks[i] != iArr[i]) {
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
        zzg(i);
        return this.zzks[i];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzks[i2];
        }
        return i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ Integer remove(int i) {
        zzw();
        zzg(i);
        int[] iArr = this.zzks;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzks[i]))) {
                int[] iArr = this.zzks;
                System.arraycopy(iArr, i + 1, iArr, i, this.size - i);
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
            int[] iArr = this.zzks;
            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ Integer set(int i, Integer num) {
        int intValue = num.intValue();
        zzw();
        zzg(i);
        int[] iArr = this.zzks;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.size;
    }

    public final void zzac(int i) {
        zzo(this.size, i);
    }

    /* Return type fixed from 'com.google.android.gms.internal.clearcut.zzcn' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Integer> zzi(int i) {
        if (i >= this.size) {
            return new zzch(Arrays.copyOf(this.zzks, i), this.size);
        }
        throw new IllegalArgumentException();
    }
}
