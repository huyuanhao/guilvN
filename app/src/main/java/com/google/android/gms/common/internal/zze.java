package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

public final class zze extends GmsClientSupervisor implements Handler.Callback {
    public final Handler mHandler;
    @GuardedBy("mConnectionStatus")
    public final HashMap<GmsClientSupervisor.zza, zzf> zzdu = new HashMap<>();
    public final Context zzdv;
    public final ConnectionTracker zzdw;
    public final long zzdx;
    public final long zzdy;

    public zze(Context context) {
        this.zzdv = context.getApplicationContext();
        this.mHandler = new com.google.android.gms.internal.common.zze(context.getMainLooper(), this);
        this.zzdw = ConnectionTracker.getInstance();
        this.zzdx = WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS;
        this.zzdy = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.zzdu) {
                GmsClientSupervisor.zza zza = (GmsClientSupervisor.zza) message.obj;
                zzf zzf = this.zzdu.get(zza);
                if (zzf != null && zzf.zzr()) {
                    if (zzf.isBound()) {
                        zzf.zzf("GmsClientSupervisor");
                    }
                    this.zzdu.remove(zza);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.zzdu) {
                GmsClientSupervisor.zza zza2 = (GmsClientSupervisor.zza) message.obj;
                zzf zzf2 = this.zzdu.get(zza2);
                if (zzf2 != null && zzf2.getState() == 3) {
                    String valueOf = String.valueOf(zza2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    ComponentName componentName = zzf2.getComponentName();
                    if (componentName == null) {
                        componentName = zza2.getComponentName();
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(zza2.getPackage(), "unknown");
                    }
                    zzf2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zza(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        boolean isBound;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            zzf zzf = this.zzdu.get(zza);
            if (zzf == null) {
                zzf = new zzf(this, zza);
                zzf.zza(serviceConnection, str);
                zzf.zze(str);
                this.zzdu.put(zza, zzf);
                if (this.zzdu.size() > 200) {
                    String valueOf = String.valueOf(zza);
                    int size = this.zzdu.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                    sb.append("Adding ");
                    sb.append(valueOf);
                    sb.append(", and there are now ");
                    sb.append(size);
                    sb.append(" connections.");
                    sb.toString();
                    new Exception();
                }
            } else {
                this.mHandler.removeMessages(0, zza);
                if (!zzf.zza(serviceConnection)) {
                    zzf.zza(serviceConnection, str);
                    int state = zzf.getState();
                    if (state == 1) {
                        serviceConnection.onServiceConnected(zzf.getComponentName(), zzf.getBinder());
                    } else if (state == 2) {
                        zzf.zze(str);
                    }
                } else {
                    String valueOf2 = String.valueOf(zza);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(valueOf2);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            if (zzf.zzs() > 100) {
                int zzs = zzf.zzs();
                String valueOf3 = String.valueOf(zza);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 41);
                sb3.append("There are");
                sb3.append(zzs);
                sb3.append(" clients for service ");
                sb3.append(valueOf3);
                sb3.toString();
                new Exception();
            }
            isBound = zzf.isBound();
        }
        return isBound;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zzb(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            zzf zzf = this.zzdu.get(zza);
            if (zzf == null) {
                String valueOf = String.valueOf(zza);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (zzf.zza(serviceConnection)) {
                zzf.zzb(serviceConnection, str);
                if (zzf.zzr()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, zza), this.zzdx);
                }
            } else {
                String valueOf2 = String.valueOf(zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
