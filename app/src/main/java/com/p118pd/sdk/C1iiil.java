package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.丨1丨i丨iil  reason: invalid class name */
public abstract class C1iiil implements AbstractC6479lI1L {
    public Ll1L1i OooO00o;

    public C1iiil(iIIl1 r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6479lI1L
    public AbstractC6370iIIIl OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        try {
            return C6225iiI.OooO00o(this.OooO00o.OooO00o(r3, bArr));
        } catch (OperatorException e) {
            throw new CMSException("exception unwrapping key: " + e.getMessage(), e);
        }
    }
}
