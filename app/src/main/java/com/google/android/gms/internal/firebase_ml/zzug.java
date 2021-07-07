package com.google.android.gms.internal.firebase_ml;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzug {
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final byte[] zzbpe;
    public static final ByteBuffer zzbpf;
    public static final zzti zzbpg;

    static {
        byte[] bArr = new byte[0];
        zzbpe = bArr;
        zzbpf = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzbpe;
        zzbpg = zzti.zza(bArr2, 0, bArr2.length, false);
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

    public static int zzaj(boolean z) {
        return z ? 1231 : 1237;
    }

    public static Object zze(Object obj, Object obj2) {
        return ((zzvo) obj).zzrc().zza((zzvo) obj2).zzri();
    }

    public static boolean zzf(zzvo zzvo) {
        return false;
    }

    public static boolean zzi(byte[] bArr) {
        return zzxe.zzi(bArr);
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzz(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
