package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class ConnectionTracker {
    public static final Object zzdp = new Object();
    public static volatile ConnectionTracker zzfa;
    @VisibleForTesting
    public static boolean zzfb;
    public final List<String> zzfc;
    public final List<String> zzfd;
    public final List<String> zzfe;
    public final List<String> zzff;

    public ConnectionTracker() {
        List<String> list = Collections.EMPTY_LIST;
        this.zzfc = list;
        this.zzfd = list;
        this.zzfe = list;
        this.zzff = list;
    }

    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzfa == null) {
            synchronized (zzdp) {
                if (zzfa == null) {
                    zzfa = new ConnectionTracker();
                }
            }
        }
        return zzfa;
    }

    @KeepForSdk
    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @KeepForSdk
    @SuppressLint({"UntrackedBindService"})
    public void unbindService(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = ClientLibraryUtils.zzc(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
