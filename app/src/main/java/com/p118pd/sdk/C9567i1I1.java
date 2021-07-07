package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.丨i1I丨1  reason: invalid class name and case insensitive filesystem */
public class C9567i1I1 extends AbstractC5761Lili {
    public iiiLLi1 OooO00o;

    public C9567i1I1(C5178I1iIi i1iIi) throws DVCSConstructionException {
        super(i1iIi);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    private void OooO00o() throws DVCSConstructionException {
        if (this.OooO00o != null) {
            return;
        }
        if (super.OooO00o.m15289OooO00o() != null) {
            try {
                this.OooO00o = new iiiLLi1(super.OooO00o.m15289OooO00o().m17938OooO00o());
            } catch (CMSException e) {
                throw new DVCSConstructionException("Can't read CMS SignedData from input", e);
            }
        } else {
            throw new DVCSConstructionException("DVCSRequest.data.message should be specified for VSD service");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    /* renamed from: OooO00o  reason: collision with other method in class */
    public iiiLLi1 m21614OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21615OooO00o() {
        return super.OooO00o.m15289OooO00o().m17938OooO00o();
    }
}
