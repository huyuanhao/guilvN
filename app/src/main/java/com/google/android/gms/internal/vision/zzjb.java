package com.google.android.gms.internal.vision;

public final class zzjb extends zziy {
    public static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zziw.zzbr(i);
        }
        if (i2 == 1) {
            return zziw.zzt(i, zziu.zza(bArr, j));
        }
        if (i2 == 2) {
            return zziw.zzc(i, zziu.zza(bArr, j), zziu.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.zziy
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzjb.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.vision.zziy
    public final String zzi(byte[] bArr, int i, int i2) throws zzgf {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte zza = zziu.zza(bArr, (long) i);
                if (!zzix.zzh(zza)) {
                    break;
                }
                i++;
                zzix.zzb(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte zza2 = zziu.zza(bArr, (long) i);
                if (zzix.zzh(zza2)) {
                    int i7 = i5 + 1;
                    zzix.zzb(zza2, cArr, i5);
                    while (i6 < i3) {
                        byte zza3 = zziu.zza(bArr, (long) i6);
                        if (!zzix.zzh(zza3)) {
                            break;
                        }
                        i6++;
                        zzix.zzb(zza3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (zzix.zzi(zza2)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        zzix.zzb(zza2, zziu.zza(bArr, (long) i6), cArr, i5);
                        i = i8;
                        i5++;
                    } else {
                        throw zzgf.zzfp();
                    }
                } else if (zzix.zzj(zza2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzix.zzb(zza2, zziu.zza(bArr, (long) i6), zziu.zza(bArr, (long) i9), cArr, i5);
                        i = i10;
                        i5++;
                    } else {
                        throw zzgf.zzfp();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    zzix.zzb(zza2, zziu.zza(bArr, (long) i6), zziu.zza(bArr, (long) i11), zziu.zza(bArr, (long) i12), cArr, i5);
                    i = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw zzgf.zzfp();
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
    @Override // com.google.android.gms.internal.vision.zziy
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzjb.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041 A[LOOP:1: B:11:0x0041->B:36:0x0100, LOOP_START, PHI: r2 r4 r9 r10 
      PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 long) = (r4v4 long), (r4v7 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.google.android.gms.internal.vision.zziy
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzjb.zzb(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }
}
