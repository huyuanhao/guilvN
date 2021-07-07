package com.google.android.gms.internal.firebase_ml;

public final class zzli extends zzlg<E> {
    public final transient int length;
    public final transient int offset;
    public final /* synthetic */ zzlg zzacy;

    public zzli(zzlg zzlg, int i, int i2) {
        this.zzacy = zzlg;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzks.zzb(i, this.length);
        return (E) this.zzacy.get(i + this.offset);
    }

    public final int size() {
        return this.length;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlg
    /* renamed from: zzd */
    public final zzlg<E> subList(int i, int i2) {
        zzks.zza(i, i2, this.length);
        zzlg zzlg = this.zzacy;
        int i3 = this.offset;
        return (zzlg) zzlg.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final Object[] zzik() {
        return this.zzacy.zzik();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zzil() {
        return this.zzacy.zzil() + this.offset;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zzim() {
        return this.zzacy.zzil() + this.offset + this.length;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return true;
    }
}
