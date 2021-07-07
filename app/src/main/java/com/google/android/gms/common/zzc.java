package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public final class zzc {
    public static volatile zzm zzn;
    public static final Object zzo = new Object();
    public static Context zzp;

    public static synchronized void zza(Context context) {
        synchronized (zzc.class) {
            if (zzp == null && context != null) {
                zzp = context.getApplicationContext();
            }
        }
    }

    public static zzm zzb(String str, zze zze, boolean z, boolean z2) {
        try {
            if (zzn == null) {
                Preconditions.checkNotNull(zzp);
                synchronized (zzo) {
                    if (zzn == null) {
                        zzn = zzn.zzc(DynamiteModule.load(zzp, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            Preconditions.checkNotNull(zzp);
            try {
                if (zzn.zza(new zzk(str, zze, z, z2), ObjectWrapper.wrap(zzp.getPackageManager()))) {
                    return zzm.zze();
                }
                return zzm.zza(new zzd(z, str, zze));
            } catch (RemoteException e) {
                return zzm.zza("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return zzm.zza(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    public static zzm zza(String str, zze zze, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzb(str, zze, z, false);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final /* synthetic */ String zza(boolean z, String str, zze zze) throws Exception {
        boolean z2 = true;
        if (z || !zzb(str, zze, true, false).zzad) {
            z2 = false;
        }
        return zzm.zzc(str, zze, z, z2);
    }
}
