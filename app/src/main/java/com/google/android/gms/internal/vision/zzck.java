package com.google.android.gms.internal.vision;

public enum zzck implements zzgb {
    MODE_TYPE_UNKNOWN(0),
    FAST(1),
    ACCURATE(2),
    SELFIE(3);
    
    public static final zzgc<zzck> zzdv = new zzcl();
    public final int value;

    /* access modifiers changed from: public */
    zzck(int i) {
        this.value = i;
    }

    public static zzgd zzah() {
        return zzcm.zzhl;
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }

    public static zzck zzr(int i) {
        if (i == 0) {
            return MODE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return FAST;
        }
        if (i == 2) {
            return ACCURATE;
        }
        if (i != 3) {
            return null;
        }
        return SELFIE;
    }
}
