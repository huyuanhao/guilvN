package com.google.android.gms.internal.vision;

public enum zzbq implements zzgb {
    ROTATION_0(0),
    ROTATION_90(1),
    ROTATION_180(2),
    ROTATION_270(3);
    
    public static final zzgc<zzbq> zzdv = new zzbr();
    public final int value;

    /* access modifiers changed from: public */
    zzbq(int i) {
        this.value = i;
    }

    public static zzgd zzah() {
        return zzbs.zzhl;
    }

    public static zzbq zzk(int i) {
        if (i == 0) {
            return ROTATION_0;
        }
        if (i == 1) {
            return ROTATION_90;
        }
        if (i == 2) {
            return ROTATION_180;
        }
        if (i != 3) {
            return null;
        }
        return ROTATION_270;
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }
}
