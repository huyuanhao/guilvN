package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjm extends zzgd {
    @zzho
    public zziv boundingBox;
    @zzho
    public Float confidence;
    @zzho
    public zzjt property;
    @zzho
    public List<zzjx> words;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjm) super.clone();
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final List<zzjx> getWords() {
        return this.words;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjm) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjm) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjm) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjm) clone();
    }

    public final zziv zzhq() {
        return this.boundingBox;
    }

    public final zzjt zzhr() {
        return this.property;
    }
}
