package com.google.android.gms.internal.firebase_ml;

public final class zzlm<E> extends zzlg<E> {
    public static final zzlg<Object> zzadg = new zzlm(new Object[0], 0);
    public final transient int size;
    public final transient Object[] zzadh;

    public zzlm(Object[] objArr, int i) {
        this.zzadh = objArr;
        this.size = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzks.zzb(i, this.size);
        return (E) this.zzadh[i];
    }

    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf, com.google.android.gms.internal.firebase_ml.zzlg
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzadh, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final Object[] zzik() {
        return this.zzadh;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zzil() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zzim() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return false;
    }
}
