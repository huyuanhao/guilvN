package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIiL1  reason: case insensitive filesystem */
public class C6108iIiL1 {

    /* renamed from: com.pd.sdk.iIiL1$OooO00o */
    public static class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f17568OooO00o;
        public long OooO0O0;

        public OooO00o() {
        }

        public OooO00o(OooO00o oooO00o) {
            this.OooO00o = oooO00o.OooO00o;
            this.f17568OooO00o = oooO00o.f17568OooO00o;
            this.OooO0O0 = oooO00o.OooO0O0;
        }
    }

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, int i2, byte[] bArr2, OooO00o oooO00o, byte[] bArr3, int i3) {
        OooO00o oooO00o2 = new OooO00o(oooO00o);
        int i4 = i2 + 1;
        byte[] bArr4 = new byte[(i4 * 32)];
        int[] iArr = new int[i4];
        int i5 = 1;
        int i6 = (int) (oooO00o2.OooO0O0 + ((long) (1 << i2)));
        int i7 = 0;
        while (oooO00o2.OooO0O0 < ((long) i6)) {
            OooO00o(iI1i111L, bArr4, i7 * 32, bArr3, i3, bArr2, oooO00o2);
            iArr[i7] = 0;
            int i8 = i7 + i5;
            while (i8 > i5) {
                int i9 = i8 - 1;
                int i10 = i8 - 2;
                if (iArr[i9] != iArr[i10]) {
                    break;
                }
                int i11 = i10 * 32;
                iI1i111L.OooO00o(bArr4, i11, bArr4, i11, bArr3, i3 + ((iArr[i9] + 7) * 2 * 32));
                iArr[i10] = iArr[i10] + 1;
                i8--;
                i6 = i6;
                iArr = iArr;
                i5 = 1;
            }
            oooO00o2.OooO0O0++;
            i7 = i8;
            i6 = i6;
            iArr = iArr;
            i5 = 1;
        }
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i + i12] = bArr4[i12];
        }
    }

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4;
        int i5 = 67;
        for (int i6 = 0; i6 < 7; i6++) {
            int i7 = 0;
            while (true) {
                i4 = i5 >>> 1;
                if (i7 >= i4) {
                    break;
                }
                iI1i111L.OooO00o(bArr2, i2 + (i7 * 32), bArr2, i2 + (i7 * 2 * 32), bArr3, i3 + (i6 * 2 * 32));
                i7++;
            }
            if ((i5 & 1) != 0) {
                System.arraycopy(bArr2, i2 + ((i5 - 1) * 32), bArr2, (i4 * 32) + i2, 32);
                i4++;
            }
            i5 = i4;
        }
        System.arraycopy(bArr2, i2, bArr, i, 32);
    }

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, OooO00o oooO00o) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[C6362i1lII.OooO0o];
        C6362i1lII r1 = new C6362i1lII();
        C5779LlIl.OooO00o(iI1i111L, bArr4, 0, bArr3, oooO00o);
        r1.OooO00o(iI1i111L, bArr5, 0, bArr4, 0, bArr2, i2);
        OooO00o(iI1i111L, bArr, i, bArr5, 0, bArr2, i2);
    }
}
