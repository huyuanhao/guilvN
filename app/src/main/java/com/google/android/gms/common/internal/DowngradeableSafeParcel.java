package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Object zzdc = new Object();
    public static ClassLoader zzdd;
    public static Integer zzde;
    public boolean zzdf = false;

    @KeepForSdk
    public static boolean canUnparcelSafely(String str) {
        zzp();
        return true;
    }

    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (zzdc) {
        }
        return null;
    }

    public static ClassLoader zzp() {
        synchronized (zzdc) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.zzdf = z;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzdf;
    }
}
