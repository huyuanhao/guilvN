package com.google.android.gms.tasks;

public final class zzl implements Runnable {
    public final /* synthetic */ Task zzg;
    public final /* synthetic */ zzk zzo;

    public zzl(zzk zzk, Task task) {
        this.zzo = zzk;
        this.zzg = task;
    }

    public final void run() {
        synchronized (zzk.zza(this.zzo)) {
            if (zzk.zzb(this.zzo) != null) {
                zzk.zzb(this.zzo).onFailure(this.zzg.getException());
            }
        }
    }
}
