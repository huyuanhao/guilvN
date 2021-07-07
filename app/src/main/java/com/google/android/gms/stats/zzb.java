package com.google.android.gms.stats;

public final class zzb implements Runnable {
    public final /* synthetic */ WakeLock zzp;

    public zzb(WakeLock wakeLock) {
        this.zzp = wakeLock;
    }

    public final void run() {
        WakeLock.zza(this.zzp, 0);
    }
}
