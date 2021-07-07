package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class zzp {
    public static Object sLock = new Object();
    @GuardedBy("sLock")
    public static boolean zzeo;
    public static String zzep;
    public static int zzeq;

    public static String zzc(Context context) {
        zze(context);
        return zzep;
    }

    public static int zzd(Context context) {
        zze(context);
        return zzeq;
    }

    public static void zze(Context context) {
        synchronized (sLock) {
            if (!zzeo) {
                zzeo = true;
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        zzep = bundle.getString("com.google.app.id");
                        zzeq = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
    }
}
