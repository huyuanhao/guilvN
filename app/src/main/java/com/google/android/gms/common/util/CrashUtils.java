package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class CrashUtils {
    public static final String[] zzgf = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    public static DropBoxManager zzgg = null;
    public static boolean zzgh = false;
    public static int zzgi = -1;
    @GuardedBy("CrashUtils.class")
    public static int zzgj;
    @GuardedBy("CrashUtils.class")
    public static int zzgk;

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th) {
        return zza(context, th, 536870912);
    }

    public static boolean zza(Context context, Throwable th, int i) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
