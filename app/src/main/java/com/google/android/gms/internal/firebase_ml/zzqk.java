package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import com.google.android.gms.internal.firebase_ml.zzmd;

public final /* synthetic */ class zzqk implements zznv {
    public final long zzaue;
    public final zzmk zzazu;
    public final zzpz zzazv;

    public zzqk(long j, zzmk zzmk, zzpz zzpz) {
        this.zzaue = j;
        this.zzazu = zzmk;
        this.zzazv = zzpz;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznv
    public final zzmd.zzq.zza zzm() {
        long j = this.zzaue;
        zzmk zzmk = this.zzazu;
        zzpz zzpz = this.zzazv;
        return zzmd.zzq.zzjx().zzb(zzmd.zzab.zzle().zzh(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzqj.zzata).zzaa(true).zzab(true)).zze(zzpv.zzc(zzpz)));
    }
}
