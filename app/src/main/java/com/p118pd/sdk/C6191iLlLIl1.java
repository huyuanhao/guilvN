package com.p118pd.sdk;

import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.iLlLIl1  reason: case insensitive filesystem */
public class C6191iLlLIl1 extends AbstractC6078iI1lL {
    @Override // com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO00o(II1LLIl iI1LLIl, C6213iL11I r4) {
        return OooO00o(iI1LLIl, false, true, (AbstractC6370iIIIl) new liLL1l(r4, this.OooO00o.m17078OooO00o()));
    }

    public AbstractC93171I1 OooO00o(II1LLIl iI1LLIl, boolean z, boolean z2, AbstractC6370iIIIl r7) {
        if ((iI1LLIl != null) != L1LL1Ii.OooO0OO(this.OooO00o)) {
            throw new IllegalStateException();
        } else if (iI1LLIl == null || iI1LLIl.OooO0O0() == 1) {
            AbstractC6436l11LI r5 = z ? new Lill1() : iI1LLIl == null ? new C6352ili() : L1LL1Ii.m15920OooO00o(iI1LLIl.OooO00o());
            AbstractC93171I1 r0 = iI1LLIl != null ? new C9503Li1(r5, L1LL1Ii.m15915OooO00o(iI1LLIl.OooO00o())) : new i1i1lli(OooO00o(), r5);
            r0.OooO00o(z2, r7);
            return r0;
        } else {
            throw new IllegalStateException();
        }
    }

    public Ii1IliL OooO00o() {
        return new iLlilLI(new C6114iIiI());
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public boolean OooO00o(II1LLIl iI1LLIl, byte[] bArr, C6213iL11I r5, byte[] bArr2) throws CryptoException {
        AbstractC93171I1 OooO00o = OooO00o(iI1LLIl, true, false, (AbstractC6370iIIIl) r5);
        OooO00o.update(bArr2, 0, bArr2.length);
        return OooO00o.OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.L1Illl1i, com.p118pd.sdk.L1Illl1i, com.p118pd.sdk.AbstractC6078iI1lL
    public boolean OooO00o(C6213iL11I r2) {
        return (r2 instanceof liLI1l1i) && !r2.OooO00o();
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public byte[] OooO00o(II1LLIl iI1LLIl, C6213iL11I r4, byte[] bArr) throws CryptoException {
        AbstractC93171I1 OooO00o = OooO00o(iI1LLIl, true, true, (AbstractC6370iIIIl) new liLL1l(r4, this.OooO00o.m17078OooO00o()));
        OooO00o.update(bArr, 0, bArr.length);
        return OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO0O0(II1LLIl iI1LLIl, C6213iL11I r3) {
        return OooO00o(iI1LLIl, false, false, (AbstractC6370iIIIl) r3);
    }
}
