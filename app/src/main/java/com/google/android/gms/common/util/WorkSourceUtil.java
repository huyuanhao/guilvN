package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil {
    public static final int zzhi = Process.myUid();
    public static final Method zzhj = zzx();
    public static final Method zzhk = zzy();
    public static final Method zzhl = zzz();
    public static final Method zzhm = zzaa();
    public static final Method zzhn = zzab();
    public static final Method zzho = zzac();
    public static final Method zzhp = zzad();

    @Nullable
    @KeepForSdk
    public static WorkSource fromPackage(Context context, @Nullable String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    return zza(applicationInfo.uid, str);
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(valueOf);
                } else {
                    new String("Could not get applicationInfo from package: ");
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Could not find package: ".concat(valueOf2);
                } else {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        WorkSource workSource = null;
        if (!(context == null || context.getPackageManager() == null || str2 == null || str == null)) {
            int zzd = zzd(context, str);
            if (zzd < 0) {
                return null;
            }
            workSource = new WorkSource();
            Method method = zzho;
            if (method == null || zzhp == null) {
                zza(workSource, zzd, str);
            } else {
                try {
                    Object invoke = method.invoke(workSource, new Object[0]);
                    if (zzd != zzhi) {
                        zzhp.invoke(invoke, Integer.valueOf(zzd), str);
                    }
                    zzhp.invoke(invoke, Integer.valueOf(zzhi), str2);
                } catch (Exception unused) {
                }
            }
        }
        return workSource;
    }

    @KeepForSdk
    public static List<String> getNames(@Nullable WorkSource workSource) {
        int zza = workSource == null ? 0 : zza(workSource);
        if (zza == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zza; i++) {
            String zza2 = zza(workSource, i);
            if (!Strings.isEmptyOrWhitespace(zza2)) {
                arrayList.add(zza2);
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static WorkSource zza(int i, String str) {
        WorkSource workSource = new WorkSource();
        zza(workSource, i, str);
        return workSource;
    }

    public static Method zzaa() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method zzab() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final Method zzac() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    public static final Method zzad() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static int zzd(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Could not get applicationInfo from package: ".concat(valueOf);
            } else {
                new String("Could not get applicationInfo from package: ");
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Could not find package: ".concat(valueOf2);
            } else {
                new String("Could not find package: ");
            }
            return -1;
        }
    }

    public static Method zzx() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method zzy() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Method zzz() {
        try {
            return WorkSource.class.getMethod(FileAttachment.KEY_SIZE, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void zza(WorkSource workSource, int i, @Nullable String str) {
        if (zzhk != null) {
            if (str == null) {
                str = "";
            }
            try {
                zzhk.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception unused) {
            }
        } else {
            Method method = zzhj;
            if (method != null) {
                try {
                    method.invoke(workSource, Integer.valueOf(i));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static int zza(WorkSource workSource) {
        Method method = zzhl;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Nullable
    public static String zza(WorkSource workSource, int i) {
        Method method = zzhn;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }
}
