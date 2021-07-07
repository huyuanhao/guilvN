package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.ILI1Ll */
public class ILI1Ll extends AbstractC5903LlLLL {
    public static final byte[] OooO00o = new byte[0];

    public ILI1Ll(int i, AbstractC6854lLi1LL r3) {
        super(true, i, r3);
    }

    public ILI1Ll(boolean z, int i, AbstractC6854lLi1LL r3) {
        super(z, i, r3);
    }

    @Override // com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        int i = 160;
        if (!this.OooO0O0) {
            AbstractC6122iIlLiL OooO0Oo = this.OooO00o.OooO0O0().OooO0Oo();
            if (this.OooO0OO) {
                iii1.OooO00o(160, this.o00oO0O);
                iii1.OooO0O0(OooO0Oo.OooO0O0());
                iii1.OooO00o((AbstractC6854lLi1LL) OooO0Oo);
                return;
            }
            if (!OooO0Oo.OooO00o()) {
                i = 128;
            }
            iii1.OooO00o(i, this.o00oO0O);
            iii1.OooO00o(OooO0Oo);
            return;
        }
        iii1.OooO00o(160, this.o00oO0O, OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public boolean OooO00o() {
        if (this.OooO0O0 || this.OooO0OO) {
            return true;
        }
        return this.OooO00o.OooO0O0().OooO0Oo().OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        int OooO0O0;
        if (this.OooO0O0) {
            return L1li1.OooO0O0(this.o00oO0O) + 1;
        }
        int OooO0O02 = this.OooO00o.OooO0O0().OooO0Oo().OooO0O0();
        if (this.OooO0OO) {
            OooO0O0 = L1li1.OooO0O0(this.o00oO0O) + L1li1.OooO00o(OooO0O02);
        } else {
            OooO0O02--;
            OooO0O0 = L1li1.OooO0O0(this.o00oO0O);
        }
        return OooO0O0 + OooO0O02;
    }
}
