package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzis extends zzgd {
    @zzho
    public List<zziq> requests;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzis) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzis) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzis) super.zzb(str, obj);
    }

    public final zzis zzc(List<zziq> list) {
        this.requests = list;
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzis) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzis) clone();
    }
}
