package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzh implements ServiceConnection {
    public final Queue<zzd> zzaa;
    public zzf zzab;
    @GuardedBy("this")
    public boolean zzac;
    public final Context zzx;
    public final Intent zzy;
    public final ScheduledExecutorService zzz;

    public zzh(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private final synchronized void zzc() {
        Log.isLoggable("EnhancedIntentService", 3);
        while (!this.zzaa.isEmpty()) {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.zzab == null || !this.zzab.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z = !this.zzac;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    sb.toString();
                }
                if (!this.zzac) {
                    this.zzac = true;
                    try {
                        if (ConnectionTracker.getInstance().bindService(this.zzx, this.zzy, this, 65)) {
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.zzac = false;
                    zzd();
                }
                return;
            }
            Log.isLoggable("EnhancedIntentService", 3);
            this.zzab.zza(this.zzaa.poll());
        }
    }

    @GuardedBy("this")
    private final void zzd() {
        while (!this.zzaa.isEmpty()) {
            this.zzaa.poll().finish();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.zzac = false;
            this.zzab = (zzf) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                sb.toString();
            }
            if (iBinder == null) {
                zzd();
            } else {
                zzc();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        zzc();
    }

    public final synchronized void zza(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzaa.add(new zzd(intent, pendingResult, this.zzz));
        zzc();
    }

    @VisibleForTesting
    public zzh(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzaa = new ArrayDeque();
        this.zzac = false;
        this.zzx = context.getApplicationContext();
        this.zzy = new Intent(str).setPackage(this.zzx.getPackageName());
        this.zzz = scheduledExecutorService;
    }
}
