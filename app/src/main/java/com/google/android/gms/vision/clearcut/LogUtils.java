package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzdh;
import com.google.android.gms.internal.vision.zzdm;
import com.google.android.gms.internal.vision.zzdp;
import com.google.android.gms.internal.vision.zzdt;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.vision.C0960L;

@Keep
public class LogUtils {
    public static zzdu zza(long j, int i) {
        zzdu zzdu = new zzdu();
        zzdp zzdp = new zzdp();
        zzdu.zzqe = zzdp;
        zzdm zzdm = new zzdm();
        zzdm[] zzdmArr = new zzdm[1];
        zzdp.zzpk = zzdmArr;
        zzdmArr[0] = zzdm;
        zzdm.zzot = Long.valueOf(j);
        zzdm.zzou = Long.valueOf((long) i);
        zzdm.zzov = new zzdt[i];
        return zzdu;
    }

    public static zzdh zzd(Context context) {
        zzdh zzdh = new zzdh();
        zzdh.zzod = context.getPackageName();
        String zze = zze(context);
        if (zze != null) {
            zzdh.version = zze;
        }
        return zzdh;
    }

    @Nullable
    public static String zze(Context context) {
        try {
            return Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C0960L.zza(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }
}
