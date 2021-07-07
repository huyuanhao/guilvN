package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzfh extends zzef<Double> implements zzge<Double>, zzhr, RandomAccess {
    public static final zzfh zztc;
    public int size;
    public double[] zztd;

    static {
        zzfh zzfh = new zzfh();
        zztc = zzfh;
        zzfh.zzci();
    }

    public zzfh() {
        this(new double[10], 0);
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

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ void add(int i, Double d) {
        zzc(i, d.doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.vision.zzef, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfh)) {
            return super.addAll(collection);
        }
        zzfh zzfh = (zzfh) collection;
        int i = zzfh.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zztd;
            if (i3 > dArr.length) {
                this.zztd = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzfh.zztd, 0, this.zztd, this.size, zzfh.size);
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
        if (!(obj instanceof zzfh)) {
            return super.equals(obj);
        }
        zzfh zzfh = (zzfh) obj;
        if (this.size != zzfh.size) {
            return false;
        }
        double[] dArr = zzfh.zztd;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zztd[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        zzaf(i);
        return Double.valueOf(this.zztd[i]);
    }

    @Override // com.google.android.gms.internal.vision.zzef
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzga.zzo(Double.doubleToLongBits(this.zztd[i2]));
        }
        return i;
    }

    @Override // java.util.List, com.google.android.gms.internal.vision.zzef
    public final boolean remove(Object obj) {
        zzcj();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zztd[i]))) {
                double[] dArr = this.zztd;
                System.arraycopy(dArr, i + 1, dArr, i, this.size - i);
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
            double[] dArr = this.zztd;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Double set(int i, Double d) {
        double doubleValue = d.doubleValue();
        zzcj();
        zzaf(i);
        double[] dArr = this.zztd;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.vision.zzge' to match base method */
    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Double> zzah(int i) {
        if (i >= this.size) {
            return new zzfh(Arrays.copyOf(this.zztd, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzc(double d) {
        zzc(this.size, d);
    }

    public zzfh(double[] dArr, int i) {
        this.zztd = dArr;
        this.size = i;
    }

    private final void zzc(int i, double d) {
        int i2;
        zzcj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzag(i));
        }
        double[] dArr = this.zztd;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zztd, i, dArr2, i + 1, this.size - i);
            this.zztd = dArr2;
        }
        this.zztd[i] = d;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.vision.zzef, java.util.AbstractList
    public final /* synthetic */ Double remove(int i) {
        zzcj();
        zzaf(i);
        double[] dArr = this.zztd;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
