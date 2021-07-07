package com.google.android.gms.internal.firebase_ml;

public final class zzlr extends zzlg<Object> {
    public final transient int offset;
    public final transient int size;
    public final transient Object[] zzadd;

    public zzlr(Object[] objArr, int i, int i2) {
        this.zzadd = objArr;
        this.offset = i;
        this.size = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzks.zzb(i, this.size);
        return this.zzadd[(i * 2) + this.offset];
    }

    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return true;
    }
}
