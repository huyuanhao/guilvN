package com.google.android.gms.internal.vision;

public enum zzbl implements zzgb {
    RGBA(0),
    NV21(1),
    RGB(2),
    GRAY(3);
    
    public static final zzgc<zzbl> zzdv = new zzbm();
    public final int value;

    /* access modifiers changed from: public */
    zzbl(int i) {
        this.value = i;
    }

    public static zzgd zzah() {
        return zzbn.zzhl;
    }

    public static zzbl zzg(int i) {
        if (i == 0) {
            return RGBA;
        }
        if (i == 1) {
            return NV21;
        }
        if (i == 2) {
            return RGB;
        }
        if (i != 3) {
            return null;
        }
        return GRAY;
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }
}
