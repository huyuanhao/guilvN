package com.p118pd.sdk;

import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.L1lll1i1 */
public abstract class L1lll1i1 extends AbstractC6078iI1lL {
    public abstract IililIi OooO00o(short s);

    public AbstractC6370iIIIl OooO00o(boolean z, AbstractC6370iIIIl r2) {
        return r2;
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO00o(II1LLIl iI1LLIl, C6213iL11I r4) {
        return OooO00o(iI1LLIl, false, true, (AbstractC6370iIIIl) r4);
    }

    public AbstractC93171I1 OooO00o(II1LLIl iI1LLIl, boolean z, boolean z2, AbstractC6370iIIIl r6) {
        if ((iI1LLIl != null) != L1LL1Ii.OooO0OO(this.OooO00o)) {
            throw new IllegalStateException();
        } else if (iI1LLIl == null || iI1LLIl.OooO0O0() == OooO00o()) {
            short OooO00o = iI1LLIl == null ? 2 : iI1LLIl.OooO00o();
            C5759Lii r0 = new C5759Lii(OooO00o(OooO00o), z ? new Lill1() : L1LL1Ii.m15920OooO00o(OooO00o));
            r0.OooO00o(z2, OooO00o(z2, r6));
            return r0;
        } else {
            throw new IllegalStateException();
        }
    }

    public abstract short OooO00o();

    @Override // com.p118pd.sdk.L1Illl1i
    public boolean OooO00o(II1LLIl iI1LLIl, byte[] bArr, C6213iL11I r5, byte[] bArr2) throws CryptoException {
        AbstractC93171I1 OooO00o = OooO00o(iI1LLIl, true, false, (AbstractC6370iIIIl) r5);
        if (iI1LLIl == null) {
            OooO00o.update(bArr2, 16, 20);
        } else {
            OooO00o.update(bArr2, 0, bArr2.length);
        }
        return OooO00o.OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public byte[] OooO00o(II1LLIl iI1LLIl, C6213iL11I r4, byte[] bArr) throws CryptoException {
        int i;
        int i2;
        AbstractC93171I1 OooO00o = OooO00o(iI1LLIl, true, true, (AbstractC6370iIIIl) new liLL1l(r4, this.OooO00o.m17078OooO00o()));
        if (iI1LLIl == null) {
            i = 16;
            i2 = 20;
        } else {
            i = 0;
            i2 = bArr.length;
        }
        OooO00o.update(bArr, i, i2);
        return OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO0O0(II1LLIl iI1LLIl, C6213iL11I r3) {
        return OooO00o(iI1LLIl, false, false, (AbstractC6370iIIIl) r3);
    }
}
