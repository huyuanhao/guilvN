package com.google.android.gms.common.util.concurrent;

import android.os.Process;

public final class zza implements Runnable {
    public final int priority;
    public final Runnable zzht;

    public zza(Runnable runnable, int i) {
        this.zzht = runnable;
        this.priority = i;
    }

    public final void run() {
        Process.setThreadPriority(this.priority);
        this.zzht.run();
    }
}
