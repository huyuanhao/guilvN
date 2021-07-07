package com.google.android.gms.internal.firebase_ml;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzlq<K> extends zzll<K> {
    public final transient zzlg<K> zzacx;
    public final transient zzlj<K, ?> zzadk;

    public zzlq(zzlj<K, ?> zzlj, zzlg<K> zzlg) {
        this.zzadk = zzlj;
        this.zzacx = zzlg;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean contains(@NullableDecl Object obj) {
        return this.zzadk.get(obj) != null;
    }

    public final int size() {
        return this.zzadk.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zza(Object[] objArr, int i) {
        return zzin().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    /* renamed from: zzij */
    public final zzlt<K> iterator() {
        return (zzlt) zzin().iterator();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf, com.google.android.gms.internal.firebase_ml.zzll
    public final zzlg<K> zzin() {
        return this.zzacx;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return true;
    }
}
