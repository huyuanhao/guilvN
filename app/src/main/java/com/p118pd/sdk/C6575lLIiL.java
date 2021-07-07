package com.p118pd.sdk;

import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.lLIiL丨  reason: invalid class name and case insensitive filesystem */
public class C6575lLIiL extends AbstractC5761Lili {
    public C6575lLIiL(C5178I1iIi i1iIi) throws DVCSConstructionException {
        super(i1iIi);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    private void OooO00o() throws DVCSConstructionException {
        if (this.OooO00o.OooO00o() == null) {
            throw new DVCSConstructionException("DVCSRequest.data.messageImprint should be specified for CCPD service");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9536Lll m17673OooO00o() {
        return new C9536Lll(this.OooO00o.OooO00o());
    }
}
