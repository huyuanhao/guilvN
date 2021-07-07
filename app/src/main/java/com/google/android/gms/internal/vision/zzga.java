package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzga {
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final byte[] zzxn;
    public static final ByteBuffer zzxo;
    public static final zzez zzxp = zzez.zzf(zzxn);

    static {
        byte[] bArr = new byte[0];
        zzxn = bArr;
        zzxo = ByteBuffer.wrap(bArr);
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzf(zzhf zzhf) {
        return false;
    }

    public static boolean zzi(byte[] bArr) {
        return zziw.zzi(bArr);
    }

    public static int zzj(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzo(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zza(Object obj, Object obj2) {
        return ((zzhf) obj).zzez().zza((zzhf) obj2).zzff();
    }
}
