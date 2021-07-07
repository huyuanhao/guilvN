package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class PackageManagerWrapper {
    public final Context zzhw;

    public PackageManagerWrapper(Context context) {
        this.zzhw = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String str) {
        return this.zzhw.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(String str, String str2) {
        return this.zzhw.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
        return this.zzhw.getPackageManager().getApplicationInfo(str, i);
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String str) throws PackageManager.NameNotFoundException {
        return this.zzhw.getPackageManager().getApplicationLabel(this.zzhw.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        return this.zzhw.getPackageManager().getPackageInfo(str, i);
    }

    public final String[] getPackagesForUid(int i) {
        return this.zzhw.getPackageManager().getPackagesForUid(i);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zzhw);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zzhw.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zzhw.getPackageManager().isInstantApp(nameForUid);
    }

    public final PackageInfo zza(String str, int i, int i2) throws PackageManager.NameNotFoundException {
        return this.zzhw.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    public final boolean zzb(int i, String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            try {
                ((AppOpsManager) this.zzhw.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.zzhw.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
