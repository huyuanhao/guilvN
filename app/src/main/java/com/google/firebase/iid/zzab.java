package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzab {
    @GuardedBy("MessengerIpcClient.class")
    public static zzab zzbt;
    public final ScheduledExecutorService zzbu;
    @GuardedBy("this")
    public zzad zzbv = new zzad(this);
    @GuardedBy("this")
    public int zzbw = 1;
    public final Context zzx;

    @VisibleForTesting
    public zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzbu = scheduledExecutorService;
        this.zzx = context.getApplicationContext();
    }

    public static synchronized zzab zzc(Context context) {
        zzab zzab;
        synchronized (zzab.class) {
            if (zzbt == null) {
                zzbt = new zzab(context, Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("MessengerIpcClient")));
            }
            zzab = zzbt;
        }
        return zzab;
    }

    private final synchronized int zzx() {
        int i;
        i = this.zzbw;
        this.zzbw = i + 1;
        return i;
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzaj(zzx(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzam(zzx(), 1, bundle));
    }

    private final synchronized <T> Task<T> zza(zzak<T> zzak) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzak);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.zzbv.zzb(zzak)) {
            zzad zzad = new zzad(this);
            this.zzbv = zzad;
            zzad.zzb(zzak);
        }
        return zzak.zzcg.getTask();
    }
}
