package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.p118pd.sdk.C8912ooOO0o0;

public final class zza {
    public static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public static long zzgu;
    public static float zzgv = Float.NaN;

    @TargetApi(20)
    public static int zzg(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 2;
        }
        return i2 | i3;
    }

    public static synchronized float zzh(Context context) {
        synchronized (zza.class) {
            if (SystemClock.elapsedRealtime() - zzgu >= 60000 || Float.isNaN(zzgv)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
                if (registerReceiver != null) {
                    zzgv = ((float) registerReceiver.getIntExtra(C8912ooOO0o0.OooO0O0, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                zzgu = SystemClock.elapsedRealtime();
                return zzgv;
            }
            return zzgv;
        }
    }
}
