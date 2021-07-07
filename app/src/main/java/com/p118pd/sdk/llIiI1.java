package com.p118pd.sdk;

import java.net.URI;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.llIiI1 */
public class llIiI1 {
    public C1674II OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public URI f18744OooO00o;

    private void OooO00o(boolean z, LII lii, L1iI1 l1iI1, l1iII r5) {
        this.OooO00o = new C1674II(C5514IL.OooO00o(z), lii, l1iI1, r5);
    }

    public void OooO00o(I111LIL r3) throws CMSException {
        new C6012i1I1Ii(this.OooO00o).OooO00o(r3);
    }

    public void OooO00o(URI uri) {
        this.f18744OooO00o = uri;
    }

    public void OooO00o(boolean z, String str, String str2) {
        OooO00o(z, str, str2, (l1iII) null);
    }

    public void OooO00o(boolean z, String str, String str2, l1iII r6) {
        L1iI1 l1iI1 = null;
        LII lii = str != null ? new LII(str) : null;
        if (str2 != null) {
            l1iI1 = new L1iI1(str2);
        }
        OooO00o(z, lii, l1iI1, r6);
    }
}
