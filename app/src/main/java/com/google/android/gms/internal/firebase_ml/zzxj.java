package com.google.android.gms.internal.firebase_ml;

public final class zzxj extends zzxg {
    public static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzxe.zzdr(i);
        }
        if (i2 == 1) {
            return zzxe.zzw(i, zzxc.zza(bArr, j));
        }
        if (i2 == 2) {
            return zzxe.zzd(i, zzxc.zza(bArr, j), zzxc.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.firebase_ml.zzxg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzxj.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxg
    public final String zzh(byte[] bArr, int i, int i2) throws zzuo {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte zza = zzxc.zza(bArr, (long) i);
                if (!zzxf.zzi(zza)) {
                    break;
                }
                i++;
                zzxf.zzb(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte zza2 = zzxc.zza(bArr, (long) i);
                if (zzxf.zzi(zza2)) {
                    int i7 = i5 + 1;
                    zzxf.zzb(zza2, cArr, i5);
                    while (i6 < i3) {
                        byte zza3 = zzxc.zza(bArr, (long) i6);
                        if (!zzxf.zzi(zza3)) {
                            break;
                        }
                        i6++;
                        zzxf.zzb(zza3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (zzxf.zzj(zza2)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        zzxf.zzb(zza2, zzxc.zza(bArr, (long) i6), cArr, i5);
                        i = i8;
                        i5++;
                    } else {
                        throw zzuo.zzrr();
                    }
                } else if (zzxf.zzk(zza2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzxf.zzb(zza2, zzxc.zza(bArr, (long) i6), zzxc.zza(bArr, (long) i9), cArr, i5);
                        i = i10;
                        i5++;
                    } else {
                        throw zzuo.zzrr();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    zzxf.zzb(zza2, zzxc.zza(bArr, (long) i6), zzxc.zza(bArr, (long) i11), zzxc.zza(bArr, (long) i12), cArr, i5);
                    i = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw zzuo.zzrr();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.firebase_ml.zzxg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzxj.zzb(java.lang.CharSequence, byte[], int, int):int");
    }
}
