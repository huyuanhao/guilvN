package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.L丨11  reason: invalid class name and case insensitive filesystem */
public class C5823L11 {
    public C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6031i1iI f16781OooO00o;

    public C5823L11(C5753LiI1 r1) {
        this.OooO00o = r1;
        this.f16781OooO00o = C6031i1iI.OooO00o(r1.m16341OooO0O0());
    }

    public C5200IILli OooO00o(AbstractC6429iliL r4) throws CMSException {
        try {
            C1684L OooO00o2 = this.f16781OooO00o.m16884OooO00o();
            return new C5200IILli(OooO00o2.OooO00o(), r4.OooO00o(OooO00o2.m16414OooO00o()).OooO00o(new ByteArrayInputStream(OooO00o2.m16415OooO00o().m17938OooO00o())));
        } catch (Exception e) {
            throw new CMSException("unable to create stream: " + e.getMessage(), e);
        }
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16417OooO00o(AbstractC6429iliL r4) throws CMSException {
        try {
            return C5799LllI.m16401OooO00o(OooO00o(r4).m15381OooO00o());
        } catch (IOException e) {
            throw new CMSException("unable to parse internal stream: " + e.getMessage(), e);
        }
    }
}
