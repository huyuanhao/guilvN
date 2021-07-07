package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjf extends zzgd {
    @zzho
    public zzix cropHintsParams;
    @zzho
    public List<String> languageHints;
    @zzho
    public zzjj latLongRect;
    @zzho
    public zzjn productSearchParams;
    @zzho
    public zzjw webDetectionParams;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjf) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjf) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjf) super.zzb(str, obj);
    }

    public final zzjf zzd(List<String> list) {
        this.languageHints = list;
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjf) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjf) clone();
    }
}
