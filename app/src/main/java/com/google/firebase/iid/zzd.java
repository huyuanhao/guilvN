package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzd {
    public final Intent intent;
    public final BroadcastReceiver.PendingResult zzp;
    public boolean zzq = false;
    public final ScheduledFuture<?> zzr;

    public zzd(Intent intent2, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.intent = intent2;
        this.zzp = pendingResult;
        this.zzr = scheduledExecutorService.schedule(new zze(this, intent2), 9000, TimeUnit.MILLISECONDS);
    }

    public final synchronized void finish() {
        if (!this.zzq) {
            this.zzp.finish();
            this.zzr.cancel(false);
            this.zzq = true;
        }
    }
}
