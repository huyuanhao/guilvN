package com.google.android.gms.tasks;

public final class zzn implements Runnable {
    public final /* synthetic */ Task zzg;
    public final /* synthetic */ zzm zzq;

    public zzn(zzm zzm, Task task) {
        this.zzq = zzm;
        this.zzg = task;
    }

    public final void run() {
        synchronized (zzm.zza(this.zzq)) {
            if (zzm.zzb(this.zzq) != null) {
                zzm.zzb(this.zzq).onSuccess(this.zzg.getResult());
            }
        }
    }
}
