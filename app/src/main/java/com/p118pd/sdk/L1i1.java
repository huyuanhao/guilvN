package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1i1 */
public class L1i1 extends lLLL1iL {
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 3;
    public static final int OooO0o0 = 2;
    public AbstractC6436l11LI OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public L1i1(AbstractC6436l11LI r4) {
        this.OooO00o = r4;
        if (r4 instanceof i1l11II) {
            this.OooO0O0 = 16;
        } else if (!(r4 instanceof C6461l1liI) && !(r4 instanceof C9706liLi)) {
            throw new IllegalArgumentException("Digest " + r4.OooO00o() + " unsupported");
        } else {
            this.OooO0O0 = 20;
        }
        this.OooO0OO = 64;
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = i3 + (bArr2[length] & 255) + (bArr[i4] & 255);
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    @Override // com.p118pd.sdk.lLLL1iL
    private byte[] OooO00o(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3 = this.OooO0OO;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != i3; i5++) {
            bArr3[i5] = (byte) i;
        }
        byte[] bArr5 = super.OooO0O0;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i6 = this.OooO0OO;
            int length = i6 * (((bArr5.length + i6) - 1) / i6);
            bArr = new byte[length];
            for (int i7 = 0; i7 != length; i7++) {
                byte[] bArr6 = super.OooO0O0;
                bArr[i7] = bArr6[i7 % bArr6.length];
            }
        }
        byte[] bArr7 = ((lLLL1iL) this).f18571OooO00o;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i8 = this.OooO0OO;
            int length2 = i8 * (((bArr7.length + i8) - 1) / i8);
            bArr2 = new byte[length2];
            for (int i9 = 0; i9 != length2; i9++) {
                byte[] bArr8 = ((lLLL1iL) this).f18571OooO00o;
                bArr2[i9] = bArr8[i9 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i10 = this.OooO0OO;
        byte[] bArr10 = new byte[i10];
        int i11 = this.OooO0O0;
        int i12 = ((i2 + i11) - 1) / i11;
        int i13 = 1;
        while (i13 <= i12) {
            int i14 = this.OooO0O0;
            byte[] bArr11 = new byte[i14];
            this.OooO00o.update(bArr3, i4, i3);
            this.OooO00o.update(bArr9, i4, length3);
            this.OooO00o.OooO00o(bArr11, i4);
            for (int i15 = 1; i15 != ((lLLL1iL) this).OooO00o; i15++) {
                this.OooO00o.update(bArr11, i4, i14);
                this.OooO00o.OooO00o(bArr11, i4);
            }
            for (int i16 = 0; i16 != i10; i16++) {
                bArr10[i13] = bArr11[i16 % i14];
            }
            int i17 = 0;
            while (true) {
                int i18 = this.OooO0OO;
                if (i17 == length3 / i18) {
                    break;
                }
                OooO00o(bArr9, i18 * i17, bArr10);
                i17++;
            }
            if (i13 == i12) {
                int i19 = i13 - 1;
                int i20 = this.OooO0O0;
                System.arraycopy(bArr11, 0, bArr4, i19 * i20, i2 - (i19 * i20));
            } else {
                System.arraycopy(bArr11, 0, bArr4, (i13 - 1) * this.OooO0O0, i14);
            }
            i13++;
            i4 = 0;
        }
        return bArr4;
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO00o(int i) {
        int i2 = i / 8;
        return new C6642li1LI(OooO00o(3, i2), 0, i2);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6370iIIIl m15973OooO00o(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] OooO00o2 = OooO00o(1, i3);
        return new C6274iilL1L(new C6642li1LI(OooO00o2, 0, i3), OooO00o(2, i4), 0, i4);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO0O0(int i) {
        int i2 = i / 8;
        return new C6642li1LI(OooO00o(1, i2), 0, i2);
    }
}
