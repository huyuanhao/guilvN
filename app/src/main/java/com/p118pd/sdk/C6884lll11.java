package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l丨ll11  reason: invalid class name and case insensitive filesystem */
public class C6884lll11 extends lI11L1I1 {
    public C6884lll11(LlLI1 llLI1, char[] cArr) {
        super(llLI1, cArr);
    }

    @Override // com.p118pd.sdk.lI11L1I1
    public byte[] OooO00o(int i, C6456l1ilL r4, int i2) throws CMSException {
        C5772LlIII OooO00o = C5772LlIII.OooO00o(r4.m17587OooO0O0());
        byte[] OooO0O0 = i == 0 ? lLLL1iL.OooO0O0(((lI11L1I1) this).f18320OooO00o) : lLLL1iL.OooO0OO(((lI11L1I1) this).f18320OooO00o);
        try {
            C6928llIL r0 = new C6928llIL(C5340Ii1lI.OooO00o(OooO00o.OooO00o()));
            r0.OooO00o(OooO0O0, OooO00o.m16367OooO00o(), OooO00o.m16365OooO00o().intValue());
            return ((C6642li1LI) r0.OooO0O0(i2)).OooO00o();
        } catch (Exception e) {
            throw new CMSException("exception creating derived key: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.lI11L1I1
    public byte[] OooO00o(C6456l1ilL r4, byte[] bArr, LIiI11 r6) throws CMSException {
        byte[] OooO00o = ((C6642li1LI) C6225iiI.OooO00o(r6)).OooO00o();
        AbstractC9875iiI OooO00o2 = C5340Ii1lI.m15557OooO00o(r4.OooO00o());
        OooO00o2.OooO00o(true, new C6274iilL1L(new C6642li1LI(bArr), AbstractC6804llL1ii.OooO00o(r4.m17587OooO0O0()).m17938OooO00o()));
        return OooO00o2.OooO00o(OooO00o, 0, OooO00o.length);
    }
}
