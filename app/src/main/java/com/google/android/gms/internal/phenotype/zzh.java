package com.google.android.gms.internal.phenotype;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

public final class zzh<T> {
    public static final Object zzak = new Object();
    @SuppressLint({"StaticFieldLeak"})
    public static Context zzal;
    public static boolean zzam;
    public static volatile Boolean zzan;
    public static volatile Boolean zzbq;

    public static void init(Context context) {
        synchronized (zzak) {
            if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (zzal != context) {
                zzan = null;
            }
            zzal = context;
        }
        zzam = false;
    }

    public static void maybeInit(Context context) {
        if (zzal == null) {
            init(context);
        }
    }
}
