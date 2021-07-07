package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zziu extends zzgd {
    @zzho
    public String blockType;
    @zzho
    public zziv boundingBox;
    @zzho
    public Float confidence;
    @zzho
    public List<zzjm> paragraphs;
    @zzho
    public zzjt property;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zziu) super.clone();
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final List<zzjm> getParagraphs() {
        return this.paragraphs;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zziu) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zziu) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zziu) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zziu) clone();
    }

    public final zziv zzhq() {
        return this.boundingBox;
    }

    public final zzjt zzhr() {
        return this.property;
    }
}
