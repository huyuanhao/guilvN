package com.google.android.gms.internal.vision;

public enum zzch implements zzgb {
    LANDMARK_TYPE_UNKNOWN(0),
    NO_LANDMARK(1),
    ALL_LANDMARKS(2),
    CONTOUR_LANDMARKS(3);
    
    public static final zzgc<zzch> zzdv = new zzci();
    public final int value;

    /* access modifiers changed from: public */
    zzch(int i) {
        this.value = i;
    }

    public static zzgd zzah() {
        return zzcj.zzhl;
    }

    public static zzch zzq(int i) {
        if (i == 0) {
            return LANDMARK_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NO_LANDMARK;
        }
        if (i == 2) {
            return ALL_LANDMARKS;
        }
        if (i != 3) {
            return null;
        }
        return CONTOUR_LANDMARKS;
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }
}
