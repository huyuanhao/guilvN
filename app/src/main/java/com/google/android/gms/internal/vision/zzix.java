package com.google.android.gms.internal.vision;

import com.p118pd.sdk.C8026oOO00oOo;
import com.umeng.commonsdk.proguard.C3571am;

public final class zzix {
    public static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean zzd(byte b) {
        return b >= 0;
    }

    public static boolean zze(byte b) {
        return b < -32;
    }

    public static boolean zzf(byte b) {
        return b < -16;
    }

    public static boolean zzg(byte b) {
        return b > -65;
    }

    public static void zza(byte b, byte b2, char[] cArr, int i) throws zzgf {
        if (b < -62 || zzg(b2)) {
            throw zzgf.zzfp();
        }
        cArr[i] = (char) (((b & C3571am.f9204j) << 6) | (b2 & 63));
    }

    public static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzgf {
        if (zzg(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || zzg(b3)))) {
            throw zzgf.zzfp();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzgf {
        if (zzg(b2) || (((b << C8026oOO00oOo.OooO00o) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw zzgf.zzfp();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }
}
