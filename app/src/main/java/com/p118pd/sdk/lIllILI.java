package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.lIllILI */
public abstract class lIllILI implements AbstractC6520lIlLi {
    public C6213iL11I OooO00o;

    public lIllILI(C6213iL11I r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi
    public AbstractC6370iIIIl OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CMSException {
        try {
            return C6225iiI.OooO00o(new C6208iLLi(r3, this.OooO00o).OooO00o(r4, bArr));
        } catch (OperatorException e) {
            throw new CMSException("exception unwrapping key: " + e.getMessage(), e);
        }
    }
}
