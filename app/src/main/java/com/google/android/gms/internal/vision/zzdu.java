package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzdu extends zzjn<zzdu> {
    public zzdl zzqc = null;
    public zzdr zzqd = null;
    public zzdp zzqe = null;
    public Integer zzqf = null;

    public zzdu() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final void zza(zzjl zzjl) throws IOException {
        zzdl zzdl = this.zzqc;
        if (zzdl != null) {
            zzjl.zza(1, zzdl);
        }
        zzdr zzdr = this.zzqd;
        if (zzdr != null) {
            zzjl.zza(2, zzdr);
        }
        zzdp zzdp = this.zzqe;
        if (zzdp != null) {
            zzjl.zza(3, zzdp);
        }
        Integer num = this.zzqf;
        if (num != null) {
            zzjl.zze(4, num.intValue());
        }
        super.zza(zzjl);
    }

    @Override // com.google.android.gms.internal.vision.zzjt, com.google.android.gms.internal.vision.zzjn
    public final int zzt() {
        int zzt = super.zzt();
        zzdl zzdl = this.zzqc;
        if (zzdl != null) {
            zzt += zzjl.zzb(1, zzdl);
        }
        zzdr zzdr = this.zzqd;
        if (zzdr != null) {
            zzt += zzjl.zzb(2, zzdr);
        }
        zzdp zzdp = this.zzqe;
        if (zzdp != null) {
            zzt += zzjl.zzb(3, zzdp);
        }
        Integer num = this.zzqf;
        return num != null ? zzt + zzjl.zzi(4, num.intValue()) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjk) throws IOException {
        while (true) {
            int zzdq = zzjk.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                if (this.zzqc == null) {
                    this.zzqc = new zzdl();
                }
                zzjk.zza(this.zzqc);
            } else if (zzdq == 18) {
                if (this.zzqd == null) {
                    this.zzqd = new zzdr();
                }
                zzjk.zza(this.zzqd);
            } else if (zzdq == 26) {
                if (this.zzqe == null) {
                    this.zzqe = new zzdp();
                }
                zzjk.zza(this.zzqe);
            } else if (zzdq == 32) {
                this.zzqf = Integer.valueOf(zzjk.zzdt());
            } else if (!super.zza(zzjk, zzdq)) {
                return this;
            }
        }
    }
}
