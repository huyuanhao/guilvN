package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨丨丨lIL  reason: invalid class name and case insensitive filesystem */
public class C6928llIL extends lLLL1iL {
    public AbstractC6769llL1L OooO00o;
    public byte[] OooO0OO;

    public C6928llIL() {
        this(C5427IlI1.OooO0O0());
    }

    public C6928llIL(AbstractC6436l11LI r2) {
        C6383iLl1 r0 = new C6383iLl1(r2);
        this.OooO00o = r0;
        this.OooO0OO = new byte[r0.OooO00o()];
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i != 0) {
            if (bArr != null) {
                this.OooO00o.update(bArr, 0, bArr.length);
            }
            this.OooO00o.update(bArr2, 0, bArr2.length);
            this.OooO00o.OooO00o(this.OooO0OO, 0);
            byte[] bArr4 = this.OooO0OO;
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            for (int i3 = 1; i3 < i; i3++) {
                AbstractC6769llL1L lll1l = this.OooO00o;
                byte[] bArr5 = this.OooO0OO;
                lll1l.update(bArr5, 0, bArr5.length);
                this.OooO00o.OooO00o(this.OooO0OO, 0);
                int i4 = 0;
                while (true) {
                    byte[] bArr6 = this.OooO0OO;
                    if (i4 == bArr6.length) {
                        break;
                    }
                    int i5 = i2 + i4;
                    bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                    i4++;
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    @Override // com.p118pd.sdk.lLLL1iL
    private byte[] OooO00o(int i) {
        int OooO00o2 = this.OooO00o.OooO00o();
        int i2 = ((i + OooO00o2) - 1) / OooO00o2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i2 * OooO00o2)];
        this.OooO00o.OooO00o(new C6642li1LI(((lLLL1iL) this).f18571OooO00o));
        int i3 = 0;
        for (int i4 = 1; i4 <= i2; i4++) {
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
            }
            OooO00o(this.OooO0O0, ((lLLL1iL) this).OooO00o, bArr, bArr2, i3);
            i3 += OooO00o2;
        }
        return bArr2;
    }

    @Override // com.p118pd.sdk.lLLL1iL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6370iIIIl m18075OooO00o(int i) {
        return OooO0O0(i);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO00o(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] OooO00o2 = OooO00o(i3 + i4);
        return new C6274iilL1L(new C6642li1LI(OooO00o2, 0, i3), OooO00o2, i3, i4);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO0O0(int i) {
        int i2 = i / 8;
        return new C6642li1LI(C9586iIILl.m21632OooO00o(OooO00o(i2), 0, i2), 0, i2);
    }
}
