package com.p118pd.sdk;

import java.util.Collection;

/* renamed from: com.pd.sdk.i丨丨丨l  reason: invalid class name and case insensitive filesystem */
public class C6432il extends LIiL11 {
    public C5607LI1I1iI OooO00o;

    @Override // com.p118pd.sdk.LIiL11
    public Collection OooO00o(AbstractC6317ilLi illi) {
        return this.OooO00o.OooO00o(illi);
    }

    @Override // com.p118pd.sdk.LIiL11
    public void OooO00o(IIllL1L r2) {
        if (r2 instanceof i1Ii1iI1) {
            this.OooO00o = new C5607LI1I1iI(((i1Ii1iI1) r2).OooO00o());
            return;
        }
        throw new IllegalArgumentException(r2.toString());
    }
}
