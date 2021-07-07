package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class zzuc extends zzsq<Float> implements zzun<Float>, zzwa, RandomAccess {
    public static final zzuc zzboe;
    public int size;
    public float[] zzbof;

    static {
        zzuc zzuc = new zzuc(new float[0], 0);
        zzboe = zzuc;
        zzuc.zzpt();
    }

    public zzuc() {
        this(new float[10], 0);
    }

    private final void zzc(int i, float f) {
        int i2;
        zzpu();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        float[] fArr = this.zzbof;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzbof, i, fArr2, i + 1, this.size - i);
            this.zzbof = fArr2;
        }
        this.zzbof[i] = f;
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

    public static zzuc zzqv() {
        return zzboe;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Float f) {
        zzc(i, f.floatValue());
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzuc)) {
            return super.addAll(collection);
        }
        zzuc zzuc = (zzuc) collection;
        int i = zzuc.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzbof;
            if (i3 > fArr.length) {
                this.zzbof = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzuc.zzbof, 0, this.zzbof, this.size, zzuc.size);
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
        if (!(obj instanceof zzuc)) {
            return super.equals(obj);
        }
        zzuc zzuc = (zzuc) obj;
        if (this.size != zzuc.size) {
            return false;
        }
        float[] fArr = zzuc.zzbof;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzbof[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        zzci(i);
        return Float.valueOf(this.zzbof[i]);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzbof[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List
    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzbof[i]))) {
                float[] fArr = this.zzbof;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
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
            float[] fArr = this.zzbof;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Float set(int i, Float f) {
        float floatValue = f.floatValue();
        zzpu();
        zzci(i);
        float[] fArr = this.zzbof;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.size;
    }

    /* Return type fixed from 'com.google.android.gms.internal.firebase_ml.zzun' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final /* synthetic */ zzun<Float> zzck(int i) {
        if (i >= this.size) {
            return new zzuc(Arrays.copyOf(this.zzbof, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzv(float f) {
        zzc(this.size, f);
    }

    public zzuc(float[] fArr, int i) {
        this.zzbof = fArr;
        this.size = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ Float remove(int i) {
        zzpu();
        zzci(i);
        float[] fArr = this.zzbof;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}
