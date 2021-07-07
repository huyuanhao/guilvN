package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨il1I  reason: invalid class name and case insensitive filesystem */
public class C6399iil1I extends lLLL1iL {
    public AbstractC6436l11LI OooO00o;

    public C6399iil1I(AbstractC6436l11LI r1) {
        this.OooO00o = r1;
    }

    private byte[] OooO0OO() {
        int OooO0O0 = this.OooO00o.OooO0O0();
        byte[] bArr = new byte[OooO0O0];
        AbstractC6436l11LI r2 = this.OooO00o;
        byte[] bArr2 = ((lLLL1iL) this).f18571OooO00o;
        r2.update(bArr2, 0, bArr2.length);
        AbstractC6436l11LI r22 = this.OooO00o;
        byte[] bArr3 = this.OooO0O0;
        r22.update(bArr3, 0, bArr3.length);
        this.OooO00o.OooO00o(bArr, 0);
        for (int i = 1; i < ((lLLL1iL) this).OooO00o; i++) {
            this.OooO00o.update(bArr, 0, OooO0O0);
            this.OooO00o.OooO00o(bArr, 0);
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO00o(int i) {
        return OooO0O0(i);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO00o(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        if (i5 <= this.OooO00o.OooO0O0()) {
            byte[] OooO0OO = OooO0OO();
            return new C6274iilL1L(new C6642li1LI(OooO0OO, 0, i3), OooO0OO, i3, i4);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i5 + " bytes long.");
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO0O0(int i) {
        int i2 = i / 8;
        if (i2 <= this.OooO00o.OooO0O0()) {
            return new C6642li1LI(OooO0OO(), 0, i2);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i2 + " bytes long.");
    }
}
