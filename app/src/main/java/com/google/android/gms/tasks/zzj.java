package com.google.android.gms.tasks;

public final class zzj implements Runnable {
    public final /* synthetic */ Task zzg;
    public final /* synthetic */ zzi zzm;

    public zzj(zzi zzi, Task task) {
        this.zzm = zzi;
        this.zzg = task;
    }

    public final void run() {
        synchronized (zzi.zza(this.zzm)) {
            if (zzi.zzb(this.zzm) != null) {
                zzi.zzb(this.zzm).onComplete(this.zzg);
            }
        }
    }
}
