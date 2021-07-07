package com.p118pd.sdk;

import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.liIiL  reason: case insensitive filesystem */
public class C6652liIiL extends AbstractC5761Lili {
    public C6652liIiL(C5178I1iIi i1iIi) throws DVCSConstructionException {
        super(i1iIi);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    private void OooO00o() throws DVCSConstructionException {
        if (this.OooO00o.m15289OooO00o() == null) {
            throw new DVCSConstructionException("DVCSRequest.data.message should be specified for CPD service");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17741OooO00o() {
        return this.OooO00o.m15289OooO00o().m17938OooO00o();
    }
}
