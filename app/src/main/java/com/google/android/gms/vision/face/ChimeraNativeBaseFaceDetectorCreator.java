package com.google.android.gms.vision.face;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzdn;
import com.google.android.gms.internal.vision.zzdr;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.vision.EngineManager;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.LogUtils;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzg;
import com.google.android.gms.vision.face.internal.client.zzh;
import com.google.android.gms.vision.face.internal.client.zzk;
import java.io.File;

@RetainForClient
@KeepForSdk
@DynamiteApi
public abstract class ChimeraNativeBaseFaceDetectorCreator extends zzk {
    public static void zza(DynamiteClearcutLogger dynamiteClearcutLogger, Context context, zze zze, @Nullable String str, long j) {
        zzdu zzdu = new zzdu();
        zzdr zzdr = new zzdr();
        zzdu.zzqd = zzdr;
        zzdr.name = "face";
        zzdr.zzpq = Long.valueOf(j);
        zzdn zzdn = new zzdn();
        zzdr.zzps = zzdn;
        int i = zze.mode;
        if (i == 1) {
            zzdn.zzow = 1;
        } else if (i == 0) {
            zzdn.zzow = 2;
        } else if (i == 2) {
            zzdn.zzow = 3;
        }
        int i2 = zze.landmarkType;
        if (i2 == 1) {
            zzdr.zzps.zzox = 2;
        } else if (i2 == 0) {
            zzdr.zzps.zzox = 1;
        } else if (i2 == 2) {
            zzdr.zzps.zzox = 3;
        }
        int i3 = zze.zzcn;
        if (i3 == 1) {
            zzdr.zzps.zzoy = 2;
        } else if (i3 == 0) {
            zzdr.zzps.zzoy = 1;
        }
        zzdr.zzps.zzoz = Boolean.valueOf(zze.zzcm);
        zzdr.zzps.zzpa = Boolean.valueOf(zze.trackingEnabled);
        zzdr.zzps.zzpb = Float.valueOf(zze.proportionalMinFaceSize);
        if (str != null) {
            zzdr.zzon = str;
        }
        zzdr.zzpr = LogUtils.zzd(context);
        dynamiteClearcutLogger.zza(2, zzdu);
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzj
    public zzg newFaceDetector(IObjectWrapper iObjectWrapper, zze zze) throws RemoteException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        DynamiteClearcutLogger dynamiteClearcutLogger = new DynamiteClearcutLogger(context);
        zzh zzh = null;
        try {
            zzo().zza(context);
            zzo();
            File zzc = EngineManager.zzc(context);
            if (!zza(zze, new File(zzc, "models").toString())) {
                zzo().zzb(context);
            } else {
                zzh = zza(context, dynamiteClearcutLogger, zzc, zze);
            }
            if (zzh != null) {
                zza(dynamiteClearcutLogger, context, zze, null, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            return zzh;
        } catch (RemoteException e) {
            e.getMessage();
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                zza(dynamiteClearcutLogger, context, zze, null, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            throw th;
        }
    }

    public abstract zzh zza(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze);

    public abstract boolean zza(zze zze, String str);

    public abstract EngineManager zzo();
}
