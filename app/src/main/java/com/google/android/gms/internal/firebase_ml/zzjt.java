package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjt extends zzgd {
    @zzho
    public zziy detectedBreak;
    @zzho
    public List<zziz> detectedLanguages;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjt) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjt) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjt) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjt) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjt) clone();
    }

    public final zziy zzhz() {
        return this.detectedBreak;
    }

    public final List<zziz> zzia() {
        return this.detectedLanguages;
    }
}
