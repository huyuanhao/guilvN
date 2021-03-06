package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    public static Boolean zzgm;
    public static Boolean zzgn;
    public static Boolean zzgo;
    public static Boolean zzgp;
    public static Boolean zzgq;
    public static Boolean zzgr;
    public static Boolean zzgs;
    public static Boolean zzgt;

    @KeepForSdk
    public static boolean isAuto(Context context) {
        if (zzgs == null) {
            zzgs = Boolean.valueOf(PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return zzgs.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzgq == null) {
            PackageManager packageManager = context.getPackageManager();
            zzgq = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return zzgq.booleanValue();
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(Context context) {
        if (zzgp == null) {
            zzgp = Boolean.valueOf(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzgp.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (com.google.android.gms.common.util.DeviceProperties.zzgn.booleanValue() != false) goto L_0x003e;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isTablet(android.content.res.Resources r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzgm
            if (r1 != 0) goto L_0x0045
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 <= r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 != 0) goto L_0x003e
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzgn
            if (r1 != 0) goto L_0x0036
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r1 = r4.screenLayout
            r1 = r1 & 15
            if (r1 > r2) goto L_0x002f
            int r4 = r4.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r4 < r1) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.common.util.DeviceProperties.zzgn = r4
        L_0x0036:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzgn
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzgm = r4
        L_0x0045:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzgm
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isTablet(android.content.res.Resources):boolean");
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
        if (zzgt == null) {
            PackageManager packageManager = context.getPackageManager();
            zzgt = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return zzgt.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(Context context) {
        if (zzgo == null) {
            zzgo = Boolean.valueOf(PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return zzgo.booleanValue();
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(Context context) {
        if (!isWearable(context)) {
            return false;
        }
        if (PlatformVersion.isAtLeastN()) {
            return isSidewinder(context) && !PlatformVersion.isAtLeastO();
        }
        return true;
    }

    public static boolean zzf(Context context) {
        if (zzgr == null) {
            zzgr = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return zzgr.booleanValue();
    }
}
