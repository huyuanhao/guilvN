package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzdn extends zzjn<zzdn> {
    public Integer zzow;
    public Integer zzox;
    public Integer zzoy;
    public Boolean zzoz = null;
    public Boolean zzpa = null;
    public Float zzpb = null;

    public zzdn() {
        this.zzadp = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: zzd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.vision.zzdn zza(com.google.android.gms.internal.vision.zzjk r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzdn.zza(com.google.android.gms.internal.vision.zzjk):com.google.android.gms.internal.vision.zzdn");
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final void zza(zzjl zzjl) throws IOException {
        Integer num = this.zzow;
        if (num != null) {
            zzjl.zze(1, num.intValue());
        }
        Integer num2 = this.zzox;
        if (num2 != null) {
            zzjl.zze(2, num2.intValue());
        }
        Integer num3 = this.zzoy;
        if (num3 != null) {
            zzjl.zze(3, num3.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            zzjl.zzb(4, bool.booleanValue());
        }
        Boolean bool2 = this.zzpa;
        if (bool2 != null) {
            zzjl.zzb(5, bool2.booleanValue());
        }
        Float f = this.zzpb;
        if (f != null) {
            zzjl.zza(6, f.floatValue());
        }
        super.zza(zzjl);
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzow;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        Integer num2 = this.zzox;
        if (num2 != null) {
            zzt += zzjl.zzi(2, num2.intValue());
        }
        Integer num3 = this.zzoy;
        if (num3 != null) {
            zzt += zzjl.zzi(3, num3.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(4) + 1;
        }
        Boolean bool2 = this.zzpa;
        if (bool2 != null) {
            bool2.booleanValue();
            zzt += zzjl.zzav(5) + 1;
        }
        Float f = this.zzpb;
        if (f == null) {
            return zzt;
        }
        f.floatValue();
        return zzt + zzjl.zzav(6) + 4;
    }
}
