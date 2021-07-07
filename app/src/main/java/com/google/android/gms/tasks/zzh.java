package com.google.android.gms.tasks;

public final class zzh implements Runnable {
    public final /* synthetic */ zzg zzk;

    public zzh(zzg zzg) {
        this.zzk = zzg;
    }

    public final void run() {
        synchronized (zzg.zza(this.zzk)) {
            if (zzg.zzb(this.zzk) != null) {
                zzg.zzb(this.zzk).onCanceled();
            }
        }
    }
}
