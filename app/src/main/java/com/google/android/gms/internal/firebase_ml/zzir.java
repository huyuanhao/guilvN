package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzir extends zzgd {
    @zzho
    public zzje context;
    @zzho
    public zziw cropHintsAnnotation;
    @zzho
    public zzjq error;
    @zzho
    public List<Object> faceAnnotations;
    @zzho
    public zzjs fullTextAnnotation;
    @zzho
    public zzjg imagePropertiesAnnotation;
    @zzho
    public List<zzjb> labelAnnotations;
    @zzho
    public List<zzjb> landmarkAnnotations;
    @zzho
    public List<Object> localizedObjectAnnotations;
    @zzho
    public List<zzjb> logoAnnotations;
    @zzho
    public zzjo productSearchResults;
    @zzho
    public zzjp safeSearchAnnotation;
    @zzho
    public List<zzjb> textAnnotations;
    @zzho
    public zzjv webDetection;

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzir) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzir) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzir) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzir) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzir) clone();
    }

    public final zzjs zzhm() {
        return this.fullTextAnnotation;
    }

    public final List<zzjb> zzhn() {
        return this.labelAnnotations;
    }

    public final List<zzjb> zzho() {
        return this.landmarkAnnotations;
    }
}
