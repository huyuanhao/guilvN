package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class zzaa {
    public static volatile UserManager zzdc;
    public static volatile boolean zzdd = (!zzf());

    public static boolean zze(Context context) {
        return zzf() && !zzf(context);
    }

    public static boolean zzf() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    public static boolean zzf(Context context) {
        boolean z = zzdd;
        if (!z) {
            UserManager userManager = zzdc;
            if (userManager == null) {
                synchronized (zzaa.class) {
                    userManager = zzdc;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        zzdc = userManager2;
                        if (userManager2 == null) {
                            zzdd = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            zzdd = z;
            if (z) {
                zzdc = null;
            }
        }
        return z;
    }
}