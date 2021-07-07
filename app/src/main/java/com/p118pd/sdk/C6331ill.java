package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.ill  reason: case insensitive filesystem */
public class C6331ill extends AbstractC5761Lili {
    public List OooO00o;

    public C6331ill(C5178I1iIi i1iIi) throws DVCSConstructionException {
        super(i1iIi);
        C1706l[] OooO00o2 = i1iIi.m15290OooO00o();
        if (OooO00o2 != null) {
            this.OooO00o = new ArrayList(OooO00o2.length);
            for (int i = 0; i != OooO00o2.length; i++) {
                this.OooO00o.add(new liIIl1I(OooO00o2[i]));
            }
            return;
        }
        throw new DVCSConstructionException("DVCSRequest.data.certs should be specified for VPKC service");
    }

    @Override // com.p118pd.sdk.AbstractC5761Lili
    public List OooO00o() {
        return Collections.unmodifiableList(this.OooO00o);
    }
}
