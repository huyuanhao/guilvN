package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public class zzej extends zzgd {
    @zzho
    public int code;
    @zzho
    public List<zza> errors;
    @zzho
    public String message;

    public static class zza extends zzgd {
        @zzho
        public String domain;
        @zzho
        public String location;
        @zzho
        public String locationType;
        @zzho
        public String message;
        @zzho
        public String reason;

        @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return (zza) super.clone();
        }

        public final String getReason() {
            return this.reason;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzgd
        public final /* synthetic */ zzgd zza(String str, Object obj) {
            return (zza) zzb(str, obj);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
        public final /* synthetic */ zzhm zzb(String str, Object obj) {
            return (zza) super.zzb(str, obj);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzgd
        public final /* synthetic */ zzgd zzeg() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
        public final /* synthetic */ zzhm zzeh() {
            return (zza) clone();
        }
    }

    static {
        zzhf.zzd(zza.class);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzej) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zza(String str, Object obj) {
        return (zzej) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzej) super.zzb(str, obj);
    }

    public final List<zza> zzef() {
        return this.errors;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd
    public final /* synthetic */ zzgd zzeg() {
        return (zzej) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzej) clone();
    }
}
