package com.google.android.gms.vision.clearcut;

import javax.annotation.concurrent.GuardedBy;

public final class zzb {
    public final Object lock = new Object();
    public final long zzbu = Math.round(30000.0d);
    @GuardedBy("lock")
    public long zzbv = Long.MIN_VALUE;

    public zzb(double d) {
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzbv + this.zzbu > currentTimeMillis) {
                return false;
            }
            this.zzbv = currentTimeMillis;
            return true;
        }
    }
}
