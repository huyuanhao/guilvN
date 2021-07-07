package com.google.android.gms.internal.firebase_ml;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.C8027oOO00oo;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class zzgt extends zzgu {
    public static final byte[] zzxh = {13, 10};
    public static final byte[] zzxi = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] zzxj = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] zzxk = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, C3587az.f9268l, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, C8027oOO00oo.OooO0Oo, C8026oOO00oOo.OooO00o, 29, 30, C3571am.f9204j, 32, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, ExifInterface.OooO00o, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] zzxl;
    public final byte[] zzxm;
    public final byte[] zzxn;
    public final int zzxo;
    public final int zzxp;

    public zzgt() {
        this(0);
    }

    public static String zzb(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            zzgt zzgt = new zzgt(0, zzxh, true);
            long zzc = zzgt.zzc(bArr);
            if (zzc > 2147483647L) {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + zzc + ") than the specified maximum size of 2147483647");
            } else if (!(bArr == null || bArr.length == 0)) {
                zzgv zzgv = new zzgv();
                zzgt.zza(bArr, 0, bArr.length, zzgv);
                zzgt.zza(bArr, 0, -1, zzgv);
                int i = zzgv.pos;
                int i2 = zzgv.zzxx;
                int i3 = i - i2;
                byte[] bArr2 = new byte[i3];
                byte[] bArr3 = zzgv.buffer;
                if (bArr3 != null) {
                    int min = Math.min(bArr3 != null ? i - i2 : 0, i3);
                    System.arraycopy(zzgv.buffer, zzgv.zzxx, bArr2, 0, min);
                    int i4 = zzgv.zzxx + min;
                    zzgv.zzxx = i4;
                    if (i4 >= zzgv.pos) {
                        zzgv.buffer = null;
                    }
                } else {
                    boolean z = zzgv.eof;
                }
                bArr = bArr2;
            }
        }
        return zzgw.zzd(bArr);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgu
    public final void zza(byte[] bArr, int i, int i2, zzgv zzgv) {
        if (!zzgv.eof) {
            if (i2 < 0) {
                zzgv.eof = true;
                if (zzgv.zzxz != 0 || this.zzxu != 0) {
                    byte[] zza = zza(this.zzxp, zzgv);
                    int i3 = zzgv.pos;
                    int i4 = zzgv.zzxz;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            int i5 = i3 + 1;
                            zzgv.pos = i5;
                            byte[] bArr2 = this.zzxl;
                            int i6 = zzgv.zzxw;
                            zza[i3] = bArr2[(i6 >> 2) & 63];
                            int i7 = i5 + 1;
                            zzgv.pos = i7;
                            zza[i5] = bArr2[(i6 << 4) & 63];
                            if (bArr2 == zzxi) {
                                int i8 = i7 + 1;
                                zzgv.pos = i8;
                                byte b = this.zzxr;
                                zza[i7] = b;
                                zzgv.pos = i8 + 1;
                                zza[i8] = b;
                            }
                        } else if (i4 == 2) {
                            int i9 = i3 + 1;
                            zzgv.pos = i9;
                            byte[] bArr3 = this.zzxl;
                            int i10 = zzgv.zzxw;
                            zza[i3] = bArr3[(i10 >> 10) & 63];
                            int i11 = i9 + 1;
                            zzgv.pos = i11;
                            zza[i9] = bArr3[(i10 >> 4) & 63];
                            int i12 = i11 + 1;
                            zzgv.pos = i12;
                            zza[i11] = bArr3[(i10 << 2) & 63];
                            if (bArr3 == zzxi) {
                                zzgv.pos = i12 + 1;
                                zza[i12] = this.zzxr;
                            }
                        } else {
                            throw new IllegalStateException("Impossible modulus " + zzgv.zzxz);
                        }
                    }
                    int i13 = zzgv.zzxy;
                    int i14 = zzgv.pos;
                    int i15 = i13 + (i14 - i3);
                    zzgv.zzxy = i15;
                    if (this.zzxu > 0 && i15 > 0) {
                        byte[] bArr4 = this.zzxn;
                        System.arraycopy(bArr4, 0, zza, i14, bArr4.length);
                        zzgv.pos += this.zzxn.length;
                        return;
                    }
                    return;
                }
                return;
            }
            int i16 = 0;
            while (i16 < i2) {
                byte[] zza2 = zza(this.zzxp, zzgv);
                zzgv.zzxz = (zzgv.zzxz + 1) % 3;
                int i17 = i + 1;
                byte b2 = bArr[i];
                int i18 = b2;
                if (b2 < 0) {
                    i18 = b2 + 256;
                }
                int i19 = (zzgv.zzxw << 8) + (i18 == 1 ? 1 : 0);
                zzgv.zzxw = i19;
                if (zzgv.zzxz == 0) {
                    int i20 = zzgv.pos;
                    int i21 = i20 + 1;
                    zzgv.pos = i21;
                    byte[] bArr5 = this.zzxl;
                    zza2[i20] = bArr5[(i19 >> 18) & 63];
                    int i22 = i21 + 1;
                    zzgv.pos = i22;
                    zza2[i21] = bArr5[(i19 >> 12) & 63];
                    int i23 = i22 + 1;
                    zzgv.pos = i23;
                    zza2[i22] = bArr5[(i19 >> 6) & 63];
                    int i24 = i23 + 1;
                    zzgv.pos = i24;
                    zza2[i23] = bArr5[i19 & 63];
                    int i25 = zzgv.zzxy + 4;
                    zzgv.zzxy = i25;
                    int i26 = this.zzxu;
                    if (i26 > 0 && i26 <= i25) {
                        byte[] bArr6 = this.zzxn;
                        System.arraycopy(bArr6, 0, zza2, i24, bArr6.length);
                        zzgv.pos += this.zzxn.length;
                        zzgv.zzxy = 0;
                    }
                }
                i16++;
                i = i17;
            }
        }
    }

    public zzgt(int i) {
        this(0, zzxh);
    }

    public zzgt(int i, byte[] bArr) {
        this(0, bArr, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzgt(int r9, byte[] r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgt.<init>(int, byte[], boolean):void");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgu
    public final boolean zza(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.zzxm;
        return b < bArr.length && bArr[b] != -1;
    }
}
