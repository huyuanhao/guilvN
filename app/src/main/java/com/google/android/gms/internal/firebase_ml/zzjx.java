package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjx extends zzgd {
    @zzho
    public zziv boundingBox;
    @zzho
    public Float confidence;
    @zzho
    public zzjt property;
    @zzho
    public List<zzjr> symbols;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjx) super.clone();
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final List<zzjr> getSymbols() {
        return this.symbols;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjx) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjx) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjx) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjx) clone();
    }

    public final zziv zzhq() {
        return this.boundingBox;
    }

    public final zzjt zzhr() {
        return this.property;
    }
}
