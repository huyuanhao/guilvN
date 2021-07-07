package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    public final Object lock;
    @VisibleForTesting
    public final ExecutorService zzi;
    public Binder zzj;
    public int zzk;
    public int zzl;

    public zzb() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.zzi = Executors.newSingleThreadExecutor(new NamedThreadFactory(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        this.lock = new Object();
        this.zzl = 0;
    }

    /* access modifiers changed from: private */
    public final void zza(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i = this.zzl - 1;
            this.zzl = i;
            if (i == 0) {
                stopSelfResult(this.zzk);
            }
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.zzj == null) {
            this.zzj = new zzf(this);
        }
        return this.zzj;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzk = i2;
            this.zzl++;
        }
        Intent zzb = zzb(intent);
        if (zzb == null) {
            zza(intent);
            return 2;
        } else if (zzc(zzb)) {
            zza(intent);
            return 2;
        } else {
            this.zzi.execute(new zzc(this, zzb, intent));
            return 3;
        }
    }

    public Intent zzb(Intent intent) {
        return intent;
    }

    public boolean zzc(Intent intent) {
        return false;
    }

    public abstract void zzd(Intent intent);
}
