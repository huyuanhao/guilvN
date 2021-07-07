package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzdt extends zzjn<zzdt> {
    public static volatile zzdt[] zzpx;
    public zzdk zzpy = null;
    public Integer zzpz = null;
    public zzdo zzqa = null;
    public zzdj zzqb = null;

    public zzdt() {
        this.zzadp = -1;
    }

    public static zzdt[] zzcd() {
        if (zzpx == null) {
            synchronized (zzjr.zzado) {
                if (zzpx == null) {
                    zzpx = new zzdt[0];
                }
            }
        }
        return zzpx;
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final void zza(zzjl zzjl) throws IOException {
        zzdk zzdk = this.zzpy;
        if (zzdk != null) {
            zzjl.zza(1, zzdk);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzjl.zze(2, num.intValue());
        }
        zzdo zzdo = this.zzqa;
        if (zzdo != null) {
            zzjl.zza(16, zzdo);
        }
        zzdj zzdj = this.zzqb;
        if (zzdj != null) {
            zzjl.zza(17, zzdj);
        }
        super.zza(zzjl);
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final int zzt() {
        int zzt = super.zzt();
        zzdk zzdk = this.zzpy;
        if (zzdk != null) {
            zzt += zzjl.zzb(1, zzdk);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzt += zzjl.zzi(2, num.intValue());
        }
        zzdo zzdo = this.zzqa;
        if (zzdo != null) {
            zzt += zzjl.zzb(16, zzdo);
        }
        zzdj zzdj = this.zzqb;
        return zzdj != null ? zzt + zzjl.zzb(17, zzdj) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjk) throws IOException {
        while (true) {
            int zzdq = zzjk.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                if (this.zzpy == null) {
                    this.zzpy = new zzdk();
                }
                zzjk.zza(this.zzpy);
            } else if (zzdq == 16) {
                this.zzpz = Integer.valueOf(zzjk.zzdt());
            } else if (zzdq == 130) {
                if (this.zzqa == null) {
                    this.zzqa = new zzdo();
                }
                zzjk.zza(this.zzqa);
            } else if (zzdq == 138) {
                if (this.zzqb == null) {
                    this.zzqb = new zzdj();
                }
                zzjk.zza(this.zzqb);
            } else if (!super.zza(zzjk, zzdq)) {
                return this;
            }
        }
    }
}
