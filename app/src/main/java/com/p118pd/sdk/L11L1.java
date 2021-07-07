package com.p118pd.sdk;

import com.p118pd.sdk.C6108iIiL1;

/* renamed from: com.pd.sdk.L11L丨1  reason: invalid class name */
public class L11L1 implements l1lILl {
    public final II1i111L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16145OooO00o;

    public L11L1(AbstractC6436l11LI r3, AbstractC6436l11LI r4) {
        if (r3.OooO0O0() != 32) {
            throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        } else if (r4.OooO0O0() == 64) {
            this.OooO00o = new II1i111L(r3, r4);
        } else {
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
    }

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, byte[] bArr2, int i, C6108iIiL1.OooO00o oooO00o, byte[] bArr3, byte[] bArr4, int i2) {
        C6108iIiL1.OooO00o oooO00o2 = new C6108iIiL1.OooO00o(oooO00o);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        oooO00o2.OooO0O0 = 0;
        while (true) {
            long j = oooO00o2.OooO0O0;
            if (j >= 32) {
                break;
            }
            C5779LlIl.OooO00o(iI1i111L, bArr6, (int) (j * 32), bArr3, oooO00o2);
            oooO00o2.OooO0O0++;
        }
        C6362i1lII r19 = new C6362i1lII();
        oooO00o2.OooO0O0 = 0;
        while (true) {
            long j2 = oooO00o2.OooO0O0;
            if (j2 >= 32) {
                break;
            }
            r19.OooO00o(iI1i111L, bArr7, (int) (67 * j2 * 32), bArr6, (int) (j2 * 32), bArr4, 0);
            oooO00o2.OooO0O0++;
        }
        oooO00o2.OooO0O0 = 0;
        while (true) {
            long j3 = oooO00o2.OooO0O0;
            if (j3 >= 32) {
                break;
            }
            C6108iIiL1.OooO00o(iI1i111L, bArr5, (int) ((j3 * 32) + 1024), bArr7, (int) (j3 * 67 * 32), bArr4, 0);
            oooO00o2.OooO0O0++;
        }
        int i3 = 0;
        for (int i4 = 32; i4 > 0; i4 >>>= 1) {
            for (int i5 = 0; i5 < i4; i5 += 2) {
                iI1i111L.OooO00o(bArr5, ((i4 >>> 1) * 32) + ((i5 >>> 1) * 32), bArr5, (i4 * 32) + (i5 * 32), bArr4, (i3 + 7) * 2 * 32);
            }
            i3++;
        }
        int i6 = (int) oooO00o.OooO0O0;
        for (int i7 = 0; i7 < i2; i7++) {
            System.arraycopy(bArr5, ((32 >>> i7) * 32) + (((i6 >>> i7) ^ 1) * 32), bArr2, i + (i7 * 32), 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if ((i & 1) != 0) {
            for (int i4 = 0; i4 < 32; i4++) {
                bArr5[i4 + 32] = bArr2[i4];
            }
            for (int i5 = 0; i5 < 32; i5++) {
                bArr5[i5] = bArr3[i2 + i5];
            }
        } else {
            for (int i6 = 0; i6 < 32; i6++) {
                bArr5[i6] = bArr2[i6];
            }
            for (int i7 = 0; i7 < 32; i7++) {
                bArr5[i7 + 32] = bArr3[i2 + i7];
            }
        }
        int i8 = i2 + 32;
        int i9 = 0;
        int i10 = i;
        while (i9 < i3 - 1) {
            int i11 = i10 >>> 1;
            if ((i11 & 1) != 0) {
                iI1i111L.OooO00o(bArr5, 32, bArr5, 0, bArr4, (i9 + 7) * 2 * 32);
                for (int i12 = 0; i12 < 32; i12++) {
                    bArr5[i12] = bArr3[i8 + i12];
                }
            } else {
                iI1i111L.OooO00o(bArr5, 0, bArr5, 0, bArr4, (i9 + 7) * 2 * 32);
                for (int i13 = 0; i13 < 32; i13++) {
                    bArr5[i13 + 32] = bArr3[i8 + i13];
                }
            }
            i8 += 32;
            i9++;
            i10 = i11;
        }
        iI1i111L.OooO00o(bArr, 0, bArr5, 0, bArr4, ((i3 + 7) - 1) * 2 * 32);
    }

    private void OooO00o(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            bArr[i + i3] = 0;
        }
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        if (z) {
            this.f16145OooO00o = ((IilIilI) r2).OooO0O0();
        } else {
            this.f16145OooO00o = ((iII111) r2).OooO0O0();
        }
    }

    public boolean OooO00o(II1i111L iI1i111L, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr2.length;
        byte[] bArr4 = new byte[C6362i1lII.OooO0o];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[iLIIlIl.OooOO0O];
        byte[] bArr8 = new byte[iLIIlIl.OooO];
        if (length == 41000) {
            byte[] bArr9 = new byte[64];
            for (int i = 0; i < 1056; i++) {
                bArr8[i] = bArr3[i];
            }
            byte[] bArr10 = new byte[32];
            for (int i2 = 0; i2 < 32; i2++) {
                bArr10[i2] = bArr2[i2];
            }
            System.arraycopy(bArr2, 0, bArr7, 0, iLIIlIl.OooOO0O);
            AbstractC6436l11LI OooO00o2 = iI1i111L.OooO00o();
            OooO00o2.update(bArr10, 0, 32);
            OooO00o2.update(bArr8, 0, iLIIlIl.OooO);
            OooO00o2.update(bArr, 0, bArr.length);
            OooO00o2.OooO00o(bArr9, 0);
            long j = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                j ^= ((long) (bArr7[32 + i3] & 255)) << (i3 * 8);
            }
            new C6417ilLl();
            C6417ilLl.OooO00o(iI1i111L, bArr6, bArr7, 40, bArr8, bArr9);
            C6362i1lII r21 = new C6362i1lII();
            int i4 = 0;
            int i5 = 13352;
            while (i4 < 12) {
                r21.OooO00o(iI1i111L, bArr4, bArr7, i5, bArr6, bArr8);
                int i6 = i5 + C6362i1lII.OooO0o;
                C6108iIiL1.OooO00o(iI1i111L, bArr5, 0, bArr4, 0, bArr8, 0);
                OooO00o(iI1i111L, bArr6, bArr5, (int) (31 & j), bArr7, i6, bArr8, 5);
                j >>= 5;
                i5 = i6 + 160;
                i4++;
                bArr7 = bArr7;
                bArr8 = bArr8;
            }
            boolean z = true;
            for (int i7 = 0; i7 < 32; i7++) {
                if (bArr6[i7] != bArr8[i7 + 1024]) {
                    z = false;
                }
            }
            return z;
        }
        throw new IllegalArgumentException("signature wrong size");
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        return OooO00o(this.OooO00o, bArr, bArr2, this.f16145OooO00o);
    }

    public byte[] OooO00o(II1i111L iI1i111L, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[iLIIlIl.OooOO0O];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i = 0; i < 1088; i++) {
            bArr9[i] = bArr2[i];
        }
        System.arraycopy(bArr9, iLIIlIl.OooO, bArr3, 40968, 32);
        AbstractC6436l11LI OooO00o2 = iI1i111L.OooO00o();
        byte[] bArr10 = new byte[OooO00o2.OooO0O0()];
        OooO00o2.update(bArr3, 40968, 32);
        OooO00o2.update(bArr, 0, bArr.length);
        OooO00o2.OooO00o(bArr10, 0);
        OooO00o(bArr3, 40968, 32);
        for (int i2 = 0; i2 != 8; i2++) {
            jArr[i2] = AbstractC6464l1l.m17601OooO0O0(bArr10, i2 * 8);
        }
        long j = jArr[0] & C6566lLI.OooO0O0;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        C6108iIiL1.OooO00o oooO00o = new C6108iIiL1.OooO00o();
        oooO00o.OooO00o = 11;
        oooO00o.f17568OooO00o = 0;
        oooO00o.OooO0O0 = 0;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        C6108iIiL1.OooO00o(iI1i111L, bArr3, 40968, 5, bArr9, oooO00o, bArr3, 39944);
        AbstractC6436l11LI OooO00o3 = iI1i111L.OooO00o();
        OooO00o3.update(bArr3, 39912, 1088);
        OooO00o3.update(bArr, 0, bArr.length);
        OooO00o3.OooO00o(bArr5, 0);
        C6108iIiL1.OooO00o oooO00o2 = new C6108iIiL1.OooO00o();
        oooO00o2.OooO00o = 12;
        oooO00o2.OooO0O0 = (long) ((int) (j & 31));
        oooO00o2.f17568OooO00o = j >>> 5;
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr4[i3];
        }
        byte[] bArr11 = bArr8;
        System.arraycopy(bArr9, 32, bArr11, 0, 1024);
        for (int i4 = 0; i4 < 8; i4++) {
            bArr3[32 + i4] = (byte) ((int) ((j >>> (i4 * 8)) & 255));
        }
        C5779LlIl.OooO00o(iI1i111L, bArr7, 0, bArr9, oooO00o2);
        new C6417ilLl();
        byte[] bArr12 = bArr9;
        C6362i1lII r14 = new C6362i1lII();
        int OooO00o4 = 40 + C6417ilLl.OooO00o(iI1i111L, bArr3, 40, bArr6, bArr7, bArr11, bArr5);
        int i5 = 0;
        for (int i6 = 12; i5 < i6; i6 = 12) {
            oooO00o2.OooO00o = i5;
            C5779LlIl.OooO00o(iI1i111L, bArr7, 0, bArr12, oooO00o2);
            r14.OooO00o(iI1i111L, bArr3, OooO00o4, bArr6, bArr7, bArr11);
            int i7 = OooO00o4 + C6362i1lII.OooO0o;
            OooO00o(iI1i111L, bArr6, bArr3, i7, oooO00o2, bArr12, bArr11, 5);
            OooO00o4 = i7 + 160;
            long j2 = oooO00o2.f17568OooO00o;
            oooO00o2.OooO0O0 = (long) ((int) (j2 & 31));
            oooO00o2.f17568OooO00o = j2 >>> 5;
            i5++;
            bArr12 = bArr12;
            bArr11 = bArr11;
        }
        OooO00o(bArr12, 0, 1088);
        return bArr3;
    }

    @Override // com.p118pd.sdk.l1lILl
    public byte[] OooO00o(byte[] bArr) {
        return OooO00o(this.OooO00o, bArr, this.f16145OooO00o);
    }
}
