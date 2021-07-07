package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨lL丨lLL  reason: invalid class name and case insensitive filesystem */
public class C9695lLlLL extends lLLL1iL {
    public AbstractC6436l11LI OooO00o = C5427IlI1.OooO00o();

    @Override // com.p118pd.sdk.lLLL1iL
    private byte[] OooO00o(int i) {
        int OooO0O0 = this.OooO00o.OooO0O0();
        byte[] bArr = new byte[OooO0O0];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            AbstractC6436l11LI r5 = this.OooO00o;
            byte[] bArr3 = ((lLLL1iL) this).f18571OooO00o;
            r5.update(bArr3, 0, bArr3.length);
            AbstractC6436l11LI r52 = this.OooO00o;
            byte[] bArr4 = this.OooO0O0;
            r52.update(bArr4, 0, bArr4.length);
            this.OooO00o.OooO00o(bArr, 0);
            int i3 = i > OooO0O0 ? OooO0O0 : i;
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            this.OooO00o.reset();
            this.OooO00o.update(bArr, 0, OooO0O0);
        }
    }

    @Override // com.p118pd.sdk.lLLL1iL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6370iIIIl m21731OooO00o(int i) {
        return OooO0O0(i);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO00o(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] OooO00o2 = OooO00o(i3 + i4);
        return new C6274iilL1L(new C6642li1LI(OooO00o2, 0, i3), OooO00o2, i3, i4);
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        super.OooO00o(bArr, bArr2, 1);
    }

    @Override // com.p118pd.sdk.lLLL1iL
    public AbstractC6370iIIIl OooO0O0(int i) {
        int i2 = i / 8;
        return new C6642li1LI(OooO00o(i2), 0, i2);
    }
}
