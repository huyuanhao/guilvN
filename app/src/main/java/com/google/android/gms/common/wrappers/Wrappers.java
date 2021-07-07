package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers {
    public static Wrappers zzhy = new Wrappers();
    public PackageManagerWrapper zzhx = null;

    @KeepForSdk
    public static PackageManagerWrapper packageManager(Context context) {
        return zzhy.zzi(context);
    }

    @VisibleForTesting
    private final synchronized PackageManagerWrapper zzi(Context context) {
        if (this.zzhx == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzhx = new PackageManagerWrapper(context);
        }
        return this.zzhx;
    }
}
