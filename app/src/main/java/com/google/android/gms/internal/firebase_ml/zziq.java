package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zziq extends zzgd {
    @zzho
    public List<zzjc> features;
    @zzho
    public zzjd image;
    @zzho
    public zzjf imageContext;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zziq) super.clone();
    }

    public final zziq zza(zzjd zzjd) {
        this.image = zzjd;
        return this;
    }

    public final zziq zzb(List<zzjc> list) {
        this.features = list;
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zziq) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zziq) clone();
    }

    public final zziq zza(zzjf zzjf) {
        this.imageContext = zzjf;
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zziq) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zziq) zzb(str, obj);
    }
}
