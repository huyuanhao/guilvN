package com.google.android.gms.internal.firebase_ml;

public final class zzjr extends zzgd {
    @zzho
    public zziv boundingBox;
    @zzho
    public Float confidence;
    @zzho
    public zzjt property;
    @zzho
    public String text;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjr) super.clone();
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjr) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjr) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjr) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjr) clone();
    }

    public final zziv zzhq() {
        return this.boundingBox;
    }

    public final zzjt zzhr() {
        return this.property;
    }
}
