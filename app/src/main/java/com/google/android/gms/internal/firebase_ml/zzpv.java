package com.google.android.gms.internal.firebase_ml;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.internal.firebase_ml.zzmd;

public final class zzpv {
    public static int zzbm(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Invalid rotation: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbn(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbo(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid mode type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbp(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Invalid classification type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @TargetApi(19)
    public static zzmd.zzr zzc(zzpz zzpz) {
        int i;
        zzmd.zzr.zzb zzb;
        if (zzpz.zzaxe.getBitmap() != null) {
            zzb = zzmd.zzr.zzb.BITMAP;
            if (Build.VERSION.SDK_INT >= 19) {
                i = zzpz.zzaxe.getBitmap().getAllocationByteCount();
            } else {
                i = zzpz.zzaxe.getBitmap().getByteCount();
            }
        } else {
            int format = zzpz.zzaxe.getMetadata().getFormat();
            if (format == 16) {
                zzb = zzmd.zzr.zzb.NV16;
            } else if (format == 17) {
                zzb = zzmd.zzr.zzb.NV21;
            } else if (format != 842094169) {
                zzb = zzmd.zzr.zzb.UNKNOWN_FORMAT;
            } else {
                zzb = zzmd.zzr.zzb.YV12;
            }
            i = zzpz.zzaxe.getGrayscaleImageData().capacity();
        }
        return (zzmd.zzr) ((zzue) zzmd.zzr.zzjz().zzb(zzb).zzav(i).zzrj());
    }
}
