package com.google.android.gms.common;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzd implements Callable {
    public final boolean zzq;
    public final String zzr;
    public final zze zzs;

    public zzd(boolean z, String str, zze zze) {
        this.zzq = z;
        this.zzr = str;
        this.zzs = zze;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return zzc.zza(this.zzq, this.zzr, this.zzs);
    }
}
