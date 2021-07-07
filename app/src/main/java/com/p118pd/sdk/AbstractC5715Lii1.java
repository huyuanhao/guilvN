package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.Lii1  reason: case insensitive filesystem */
public abstract class AbstractC5715Lii1 implements AbstractC9523Ll1LI {
    public final char[] OooO00o;
    public int OooO0OO = 1;

    public AbstractC5715Lii1(char[] cArr) {
        this.OooO00o = cArr;
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public int OooO00o() {
        return this.OooO0OO;
    }

    public AbstractC5715Lii1 OooO00o(int i) {
        this.OooO0OO = i;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public C6642li1LI OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr, byte[] bArr2) throws CMSException {
        AbstractC9875iiI OooO00o2 = C5340Ii1lI.m15557OooO00o(r3.OooO00o());
        OooO00o2.OooO00o(false, new C6274iilL1L(new C6642li1LI(bArr), AbstractC6804llL1ii.OooO00o(r3.m17587OooO0O0()).m17938OooO00o()));
        try {
            return new C6642li1LI(OooO00o2.OooO0O0(bArr2, 0, bArr2.length));
        } catch (InvalidCipherTextException e) {
            throw new CMSException("unable to unwrap key: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public byte[] OooO00o(int i, C6456l1ilL r4, int i2) throws CMSException {
        C5772LlIII OooO00o2 = C5772LlIII.OooO00o(r4.m17587OooO0O0());
        byte[] OooO0O0 = i == 0 ? lLLL1iL.OooO0O0(this.OooO00o) : lLLL1iL.OooO0OO(this.OooO00o);
        try {
            C6928llIL r0 = new C6928llIL(C5340Ii1lI.OooO00o(OooO00o2.OooO00o()));
            r0.OooO00o(OooO0O0, OooO00o2.m16367OooO00o(), OooO00o2.m16365OooO00o().intValue());
            return ((C6642li1LI) r0.OooO0O0(i2)).OooO00o();
        } catch (Exception e) {
            throw new CMSException("exception creating derived key: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public char[] getPassword() {
        return this.OooO00o;
    }
}
