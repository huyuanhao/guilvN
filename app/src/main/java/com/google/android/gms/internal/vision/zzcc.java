package com.google.android.gms.internal.vision;

public enum zzcc implements zzgb {
    CLASSIFICATION_TYPE_UNKNOWN(0),
    NO_CLASSIFICATION(1),
    ALL_CLASSIFICATIONS(2);
    
    public static final zzgc<zzcc> zzdv = new zzcd();
    public final int value;

    /* access modifiers changed from: public */
    zzcc(int i) {
        this.value = i;
    }

    public static zzgd zzah() {
        return zzce.zzhl;
    }

    public static zzcc zzo(int i) {
        if (i == 0) {
            return CLASSIFICATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NO_CLASSIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return ALL_CLASSIFICATIONS;
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }
}
