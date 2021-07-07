package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashSet;
import java.util.Set;

public final class zzf implements ServiceConnection {
    public ComponentName mComponentName;
    public int mState = 2;
    public IBinder zzcz;
    public final Set<ServiceConnection> zzdz = new HashSet();
    public boolean zzea;
    public final GmsClientSupervisor.zza zzeb;
    public final /* synthetic */ zze zzec;

    public zzf(zze zze, GmsClientSupervisor.zza zza) {
        this.zzec = zze;
        this.zzeb = zza;
    }

    public final IBinder getBinder() {
        return this.zzcz;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean isBound() {
        return this.zzea;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zzec.zzdu) {
            this.zzec.mHandler.removeMessages(1, this.zzeb);
            this.zzcz = iBinder;
            this.mComponentName = componentName;
            for (ServiceConnection serviceConnection : this.zzdz) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.mState = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zzec.zzdu) {
            this.zzec.mHandler.removeMessages(1, this.zzeb);
            this.zzcz = null;
            this.mComponentName = componentName;
            for (ServiceConnection serviceConnection : this.zzdz) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.mState = 2;
        }
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.zzec.zzdw;
        Context unused2 = this.zzec.zzdv;
        this.zzeb.zzb(this.zzec.zzdv);
        this.zzdz.add(serviceConnection);
    }

    public final void zzb(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.zzec.zzdw;
        Context unused2 = this.zzec.zzdv;
        this.zzdz.remove(serviceConnection);
    }

    public final void zze(String str) {
        this.mState = 3;
        boolean zza = this.zzec.zzdw.zza(this.zzec.zzdv, str, this.zzeb.zzb(this.zzec.zzdv), this, this.zzeb.zzq());
        this.zzea = zza;
        if (zza) {
            this.zzec.mHandler.sendMessageDelayed(this.zzec.mHandler.obtainMessage(1, this.zzeb), this.zzec.zzdy);
            return;
        }
        this.mState = 2;
        try {
            this.zzec.zzdw.unbindService(this.zzec.zzdv, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void zzf(String str) {
        this.zzec.mHandler.removeMessages(1, this.zzeb);
        this.zzec.zzdw.unbindService(this.zzec.zzdv, this);
        this.zzea = false;
        this.mState = 2;
    }

    public final boolean zzr() {
        return this.zzdz.isEmpty();
    }

    public final int zzs() {
        return this.zzdz.size();
    }

    public final boolean zza(ServiceConnection serviceConnection) {
        return this.zzdz.contains(serviceConnection);
    }
}
