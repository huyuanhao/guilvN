package com.google.android.gms.internal.firebase_ml;

public final class zzjc extends zzgd {
    @zzho
    public Integer maxResults;
    @zzho
    public String model;
    @zzho
    public String type;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjc) super.clone();
    }

    public final zzjc zza(Integer num) {
        this.maxResults = num;
        return this;
    }

    public final zzjc zzax(String str) {
        this.model = str;
        return this;
    }

    public final zzjc zzay(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzjc) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzjc) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzjc) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzjc) zzb(str, obj);
    }
}
