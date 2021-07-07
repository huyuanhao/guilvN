package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjb extends zzgd {
    @zzho
    public zziv boundingPoly;
    @zzho
    public Float confidence;
    @zzho
    public String description;
    @zzho
    public String locale;
    @zzho
    public List<zzjk> locations;
    @zzho
    public String mid;
    @zzho
    public List<Object> properties;
    @zzho
    public Float score;
    @zzho
    public Float topicality;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjb) super.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<zzjk> getLocations() {
        return this.locations;
    }

    public final String getMid() {
        return this.mid;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjb) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjb) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjb) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjb) clone();
    }

    public final zziv zzhu() {
        return this.boundingPoly;
    }

    public final Float zzhv() {
        return this.score;
    }
}
