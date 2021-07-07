package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.li1I  reason: case insensitive filesystem */
public class C6635li1I {

    /* renamed from: com.pd.sdk.li1I$OooO00o */
    public static abstract class OooO00o {
        public static final int OooO0O0 = 64;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f18577OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f18578OooO00o;

        public OooO00o() {
            this.f18578OooO00o = new byte[4];
            this.OooO00o = 0;
        }

        public OooO00o(OooO00o oooO00o) {
            this.f18578OooO00o = new byte[oooO00o.f18578OooO00o.length];
            OooO00o(oooO00o);
        }

        public void OooO00o() {
            long j = this.f18577OooO00o << 3;
            byte b = O0O00O.OooO00o;
            while (true) {
                OooO00o(b);
                if (this.OooO00o != 0) {
                    b = 0;
                } else {
                    OooO00o(j);
                    OooO0O0();
                    return;
                }
            }
        }

        public void OooO00o(byte b) {
            byte[] bArr = this.f18578OooO00o;
            int i = this.OooO00o;
            int i2 = i + 1;
            this.OooO00o = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                OooO00o(bArr, 0);
                this.OooO00o = 0;
            }
            this.f18577OooO00o++;
        }

        public abstract void OooO00o(long j);

        public void OooO00o(OooO00o oooO00o) {
            byte[] bArr = oooO00o.f18578OooO00o;
            System.arraycopy(bArr, 0, this.f18578OooO00o, 0, bArr.length);
            this.OooO00o = oooO00o.OooO00o;
            this.f18577OooO00o = oooO00o.f18577OooO00o;
        }

        public abstract void OooO00o(byte[] bArr, int i);

        public void OooO00o(byte[] bArr, int i, int i2) {
            while (this.OooO00o != 0 && i2 > 0) {
                OooO00o(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.f18578OooO00o.length) {
                OooO00o(bArr, i);
                byte[] bArr2 = this.f18578OooO00o;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.f18577OooO00o += (long) bArr2.length;
            }
            while (i2 > 0) {
                OooO00o(bArr[i]);
                i++;
                i2--;
            }
        }

        public abstract void OooO0O0();

        public void OooO0OO() {
            this.f18577OooO00o = 0;
            this.OooO00o = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.f18578OooO00o;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.li1I$OooO0O0 */
    public static class OooO0O0 extends OooO00o {
        public static final int OooO = 20;
        public static final int OooOO0 = 1518500249;
        public static final int OooOO0O = 1859775393;
        public static final int OooOO0o = -1894007588;
        public static final int OooOOO0 = -899497514;
        public int[] OooO00o = new int[80];
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o;
        public int OooO0o0;
        public int OooO0oO;
        public int OooO0oo;

        public OooO0O0() {
            OooO0OO();
        }

        private int OooO00o(int i, int i2, int i3) {
            return ((i ^ -1) & i3) | (i2 & i);
        }

        private int OooO0O0(int i, int i2, int i3) {
            return (i & i3) | (i & i2) | (i2 & i3);
        }

        private int OooO0OO(int i, int i2, int i3) {
            return (i ^ i2) ^ i3;
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        public int OooO00o() {
            return 20;
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        public int OooO00o(byte[] bArr, int i) {
            OooO00o();
            AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, i);
            AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, i + 4);
            AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, i + 8);
            AbstractC6464l1l.OooO00o(this.OooO0o, bArr, i + 12);
            AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, i + 16);
            OooO0OO();
            return 20;
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m17723OooO00o() {
            return LL1i.OooO0O0;
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        public void OooO00o(long j) {
            if (this.OooO0oo > 14) {
                OooO0O0();
            }
            int[] iArr = this.OooO00o;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) (j & -1);
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m17724OooO00o(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
            int[] iArr = this.OooO00o;
            int i5 = this.OooO0oo;
            iArr[i5] = i4;
            int i6 = i5 + 1;
            this.OooO0oo = i6;
            if (i6 == 16) {
                OooO0O0();
            }
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        public void OooO0O0() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.OooO00o;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 >>> 31) | (i2 << 1);
            }
            int i3 = this.OooO0OO;
            int i4 = this.OooO0Oo;
            int i5 = this.OooO0o0;
            int i6 = this.OooO0o;
            int i7 = this.OooO0oO;
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = i9 + 1;
                int OooO00o2 = i7 + ((i3 << 5) | (i3 >>> 27)) + OooO00o(i4, i5, i6) + this.OooO00o[i9] + 1518500249;
                int i11 = (i4 >>> 2) | (i4 << 30);
                int i12 = i10 + 1;
                int OooO00o3 = i6 + ((OooO00o2 << 5) | (OooO00o2 >>> 27)) + OooO00o(i3, i11, i5) + this.OooO00o[i10] + 1518500249;
                int i13 = (i3 >>> 2) | (i3 << 30);
                int i14 = i12 + 1;
                int OooO00o4 = i5 + ((OooO00o3 << 5) | (OooO00o3 >>> 27)) + OooO00o(OooO00o2, i13, i11) + this.OooO00o[i12] + 1518500249;
                i7 = (OooO00o2 >>> 2) | (OooO00o2 << 30);
                int i15 = i14 + 1;
                i4 = i11 + ((OooO00o4 << 5) | (OooO00o4 >>> 27)) + OooO00o(OooO00o3, i7, i13) + this.OooO00o[i14] + 1518500249;
                i6 = (OooO00o3 >>> 2) | (OooO00o3 << 30);
                i3 = i13 + ((i4 << 5) | (i4 >>> 27)) + OooO00o(OooO00o4, i6, i7) + this.OooO00o[i15] + 1518500249;
                i5 = (OooO00o4 >>> 2) | (OooO00o4 << 30);
                i8++;
                i9 = i15 + 1;
            }
            int i16 = 0;
            while (i16 < 4) {
                int i17 = i9 + 1;
                int OooO0OO2 = i7 + ((i3 << 5) | (i3 >>> 27)) + OooO0OO(i4, i5, i6) + this.OooO00o[i9] + 1859775393;
                int i18 = (i4 >>> 2) | (i4 << 30);
                int i19 = i17 + 1;
                int OooO0OO3 = i6 + ((OooO0OO2 << 5) | (OooO0OO2 >>> 27)) + OooO0OO(i3, i18, i5) + this.OooO00o[i17] + 1859775393;
                int i20 = (i3 >>> 2) | (i3 << 30);
                int i21 = i19 + 1;
                int OooO0OO4 = i5 + ((OooO0OO3 << 5) | (OooO0OO3 >>> 27)) + OooO0OO(OooO0OO2, i20, i18) + this.OooO00o[i19] + 1859775393;
                i7 = (OooO0OO2 >>> 2) | (OooO0OO2 << 30);
                int i22 = i21 + 1;
                i4 = i18 + ((OooO0OO4 << 5) | (OooO0OO4 >>> 27)) + OooO0OO(OooO0OO3, i7, i20) + this.OooO00o[i21] + 1859775393;
                i6 = (OooO0OO3 >>> 2) | (OooO0OO3 << 30);
                i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + OooO0OO(OooO0OO4, i6, i7) + this.OooO00o[i22] + 1859775393;
                i5 = (OooO0OO4 >>> 2) | (OooO0OO4 << 30);
                i16++;
                i9 = i22 + 1;
            }
            int i23 = 0;
            while (i23 < 4) {
                int i24 = i9 + 1;
                int OooO0O0 = i7 + (((((i3 << 5) | (i3 >>> 27)) + OooO0O0(i4, i5, i6)) + this.OooO00o[i9]) - 1894007588);
                int i25 = (i4 >>> 2) | (i4 << 30);
                int i26 = i24 + 1;
                int OooO0O02 = i6 + (((((OooO0O0 << 5) | (OooO0O0 >>> 27)) + OooO0O0(i3, i25, i5)) + this.OooO00o[i24]) - 1894007588);
                int i27 = (i3 >>> 2) | (i3 << 30);
                int i28 = i26 + 1;
                int OooO0O03 = i5 + (((((OooO0O02 << 5) | (OooO0O02 >>> 27)) + OooO0O0(OooO0O0, i27, i25)) + this.OooO00o[i26]) - 1894007588);
                i7 = (OooO0O0 >>> 2) | (OooO0O0 << 30);
                int i29 = i28 + 1;
                i4 = i25 + (((((OooO0O03 << 5) | (OooO0O03 >>> 27)) + OooO0O0(OooO0O02, i7, i27)) + this.OooO00o[i28]) - 1894007588);
                i6 = (OooO0O02 >>> 2) | (OooO0O02 << 30);
                i3 = i27 + (((((i4 << 5) | (i4 >>> 27)) + OooO0O0(OooO0O03, i6, i7)) + this.OooO00o[i29]) - 1894007588);
                i5 = (OooO0O03 >>> 2) | (OooO0O03 << 30);
                i23++;
                i9 = i29 + 1;
            }
            int i30 = 0;
            while (i30 <= 3) {
                int i31 = i9 + 1;
                int OooO0OO5 = i7 + (((((i3 << 5) | (i3 >>> 27)) + OooO0OO(i4, i5, i6)) + this.OooO00o[i9]) - 899497514);
                int i32 = (i4 >>> 2) | (i4 << 30);
                int i33 = i31 + 1;
                int OooO0OO6 = i6 + (((((OooO0OO5 << 5) | (OooO0OO5 >>> 27)) + OooO0OO(i3, i32, i5)) + this.OooO00o[i31]) - 899497514);
                int i34 = (i3 >>> 2) | (i3 << 30);
                int i35 = i33 + 1;
                int OooO0OO7 = i5 + (((((OooO0OO6 << 5) | (OooO0OO6 >>> 27)) + OooO0OO(OooO0OO5, i34, i32)) + this.OooO00o[i33]) - 899497514);
                i7 = (OooO0OO5 >>> 2) | (OooO0OO5 << 30);
                int i36 = i35 + 1;
                i4 = i32 + (((((OooO0OO7 << 5) | (OooO0OO7 >>> 27)) + OooO0OO(OooO0OO6, i7, i34)) + this.OooO00o[i35]) - 899497514);
                i6 = (OooO0OO6 >>> 2) | (OooO0OO6 << 30);
                i3 = i34 + (((((i4 << 5) | (i4 >>> 27)) + OooO0OO(OooO0OO7, i6, i7)) + this.OooO00o[i36]) - 899497514);
                i5 = (OooO0OO7 >>> 2) | (OooO0OO7 << 30);
                i30++;
                i9 = i36 + 1;
            }
            this.OooO0OO += i3;
            this.OooO0Oo += i4;
            this.OooO0o0 += i5;
            this.OooO0o += i6;
            this.OooO0oO += i7;
            this.OooO0oo = 0;
            for (int i37 = 0; i37 < 16; i37++) {
                this.OooO00o[i37] = 0;
            }
        }

        @Override // com.p118pd.sdk.C6635li1I.OooO00o
        public void OooO0OO() {
            super.OooO0OO();
            this.OooO0OO = 1732584193;
            this.OooO0Oo = -271733879;
            this.OooO0o0 = -1732584194;
            this.OooO0o = 271733878;
            this.OooO0oO = -1009589776;
            this.OooO0oo = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.OooO00o;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static byte[] OooO00o(C6888ll r4) {
        OooO0O0 oooO0O0 = new OooO0O0();
        byte[] bArr = new byte[oooO0O0.OooO00o()];
        try {
            byte[] OooO00o2 = r4.OooO00o(AbstractC5533IiL.OooO00o);
            oooO0O0.OooO00o(OooO00o2, 0, OooO00o2.length);
            oooO0O0.OooO00o(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
