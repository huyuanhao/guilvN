package com.p118pd.sdk;

import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;

/* renamed from: com.pd.sdk.oO0OOo  reason: case insensitive filesystem */
public class C7871oO0OOo {
    public static int OooO00o(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull AbstractC7867oO0OOOo oo0oooo2, int i) throws TiffProcessingException, IOException {
        short OooO00o = oo0oooo.m19598OooO00o(i);
        if (OooO00o == 19789) {
            oo0oooo.OooO00o(true);
        } else if (OooO00o == 18761) {
            oo0oooo.OooO00o(false);
        } else {
            throw new TiffProcessingException("Unclear distinction between Motorola/Intel byte ordering: " + ((int) OooO00o));
        }
        int i2 = i + 2;
        oo0oooo2.OooO00o(oo0oooo.OooO0OO(i2));
        int OooO0O0 = oo0oooo.m19604OooO0O0(i + 4) + i;
        if (((long) OooO0O0) >= oo0oooo.OooO00o() - 1) {
            oo0oooo2.OooO00o("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
            OooO0O0 = i2 + 2 + 4;
        }
        OooO00o(oo0oooo2, oo0oooo, new HashSet(), OooO0O0, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f A[SYNTHETIC, Splitter:B:56:0x011f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(@com.drew.lang.annotations.NotNull com.p118pd.sdk.AbstractC7867oO0OOOo r28, @com.drew.lang.annotations.NotNull com.p118pd.sdk.AbstractC7911oO0Oooo r29, @com.drew.lang.annotations.NotNull java.util.Set<java.lang.Integer> r30, int r31, int r32) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 542
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7871oO0OOo.OooO00o(com.pd.sdk.oO0OOOo, com.pd.sdk.oO0Oooo, java.util.Set, int, int):void");
    }

    public static void OooO00o(@NotNull AbstractC7867oO0OOOo oo0oooo, int i, int i2, int i3, int i4, @NotNull AbstractC7911oO0Oooo oo0oooo2) throws IOException {
        int i5 = 0;
        switch (i4) {
            case 1:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.m19607OooO0O0(i2));
                    return;
                }
                short[] sArr = new short[i3];
                while (i5 < i3) {
                    sArr[i5] = oo0oooo2.m19607OooO0O0(i2 + i5);
                    i5++;
                }
                oo0oooo.OooO00o(i, sArr);
                return;
            case 2:
                oo0oooo.OooO00o(i, oo0oooo2.OooO00o(i2, i3, (Charset) null));
                return;
            case 3:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.OooO0OO(i2));
                    return;
                }
                int[] iArr = new int[i3];
                while (i5 < i3) {
                    iArr[i5] = oo0oooo2.OooO0OO((i5 * 2) + i2);
                    i5++;
                }
                oo0oooo.OooO00o(i, iArr);
                return;
            case 4:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.m19605OooO0O0(i2));
                    return;
                }
                long[] jArr = new long[i3];
                while (i5 < i3) {
                    jArr[i5] = oo0oooo2.m19605OooO0O0((i5 * 4) + i2);
                    i5++;
                }
                oo0oooo.OooO00o(i, jArr);
                return;
            case 5:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, new Rational(oo0oooo2.m19605OooO0O0(i2), oo0oooo2.m19605OooO0O0(i2 + 4)));
                    return;
                } else if (i3 > 1) {
                    Rational[] rationalArr = new Rational[i3];
                    while (i5 < i3) {
                        int i6 = i5 * 8;
                        rationalArr[i5] = new Rational(oo0oooo2.m19605OooO0O0(i2 + i6), oo0oooo2.m19605OooO0O0(i2 + 4 + i6));
                        i5++;
                    }
                    oo0oooo.OooO00o(i, rationalArr);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.OooO0O0(i2));
                    return;
                }
                byte[] bArr = new byte[i3];
                while (i5 < i3) {
                    bArr[i5] = oo0oooo2.OooO0O0(i2 + i5);
                    i5++;
                }
                oo0oooo.OooO00o(i, bArr);
                return;
            case 7:
                oo0oooo.OooO0O0(i, oo0oooo2.m19602OooO00o(i2, i3));
                return;
            case 8:
                if (i3 == 1) {
                    oo0oooo.OooO0OO(i, oo0oooo2.m19598OooO00o(i2));
                    return;
                }
                short[] sArr2 = new short[i3];
                while (i5 < i3) {
                    sArr2[i5] = oo0oooo2.m19598OooO00o((i5 * 2) + i2);
                    i5++;
                }
                oo0oooo.OooO0O0(i, sArr2);
                return;
            case 9:
                if (i3 == 1) {
                    oo0oooo.OooO0O0(i, oo0oooo2.m19604OooO0O0(i2));
                    return;
                }
                int[] iArr2 = new int[i3];
                while (i5 < i3) {
                    iArr2[i5] = oo0oooo2.m19604OooO0O0((i5 * 4) + i2);
                    i5++;
                }
                oo0oooo.OooO0O0(i, iArr2);
                return;
            case 10:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, new Rational((long) oo0oooo2.m19604OooO0O0(i2), (long) oo0oooo2.m19604OooO0O0(i2 + 4)));
                    return;
                } else if (i3 > 1) {
                    Rational[] rationalArr2 = new Rational[i3];
                    while (i5 < i3) {
                        int i7 = i5 * 8;
                        rationalArr2[i5] = new Rational((long) oo0oooo2.m19604OooO0O0(i2 + i7), (long) oo0oooo2.m19604OooO0O0(i2 + 4 + i7));
                        i5++;
                    }
                    oo0oooo.OooO00o(i, rationalArr2);
                    return;
                } else {
                    return;
                }
            case 11:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.m19594OooO00o(i2));
                    return;
                }
                float[] fArr = new float[i3];
                while (i5 < i3) {
                    fArr[i5] = oo0oooo2.m19594OooO00o((i5 * 4) + i2);
                    i5++;
                }
                oo0oooo.OooO00o(i, fArr);
                return;
            case 12:
                if (i3 == 1) {
                    oo0oooo.OooO00o(i, oo0oooo2.m19593OooO00o(i2));
                    return;
                }
                double[] dArr = new double[i3];
                while (i5 < i3) {
                    dArr[i5] = oo0oooo2.m19593OooO00o((i5 * 4) + i2);
                    i5++;
                }
                oo0oooo.OooO00o(i, dArr);
                return;
            default:
                oo0oooo.OooO0O0(String.format("Invalid TIFF tag format code %d for tag 0x%04X", Integer.valueOf(i4), Integer.valueOf(i)));
                return;
        }
    }
}
