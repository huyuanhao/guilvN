package com.google.android.gms.internal.vision;

import com.p118pd.sdk.OooOOO;
import java.nio.ByteBuffer;

public final class zziw {
    public static final zziy zzabt;

    static {
        zziy zziy;
        if (!(zziu.zzhh() && zziu.zzhi()) || zzeg.zzck()) {
            zziy = new zziz();
        } else {
            zziy = new zzjb();
        }
        zzabt = zziy;
    }

    public static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzja(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + OooOOO.OooO0OO.OooO00o;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbr(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int zzc(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean zzg(byte[] bArr, int i, int i2) {
        return zzabt.zzg(bArr, i, i2);
    }

    public static int zzh(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return zzbr(b);
        }
        if (i3 == 1) {
            return zzt(b, bArr[i]);
        }
        if (i3 == 2) {
            return zzc(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean zzi(byte[] bArr) {
        return zzabt.zzg(bArr, 0, bArr.length);
    }

    public static int zzt(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static String zzi(byte[] bArr, int i, int i2) throws zzgf {
        return zzabt.zzi(bArr, i, i2);
    }

    public static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzabt.zzb(charSequence, bArr, i, i2);
    }

    public static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        zziy zziy = zzabt;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(zza(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            zziy.zzb(charSequence, byteBuffer);
        } else {
            zziy.zzc(charSequence, byteBuffer);
        }
    }
}
