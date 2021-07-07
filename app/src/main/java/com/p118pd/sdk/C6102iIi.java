package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iIi  reason: case insensitive filesystem */
public class C6102iIi extends C6097iILii {
    public C6102iIi(InputStream inputStream) throws CMSException {
        super(inputStream);
    }

    public C6102iIi(byte[] bArr) throws CMSException {
        this(new ByteArrayInputStream(bArr));
    }

    public C5200IILli OooO00o(AbstractC9660l1il r4) throws CMSException {
        try {
            C6709li r0 = new C6709li((AbstractC9685lL) ((C6097iILii) this).OooO00o.OooO00o(16));
            I1Iili1 OooO00o = r0.OooO00o();
            return new C5200IILli(OooO00o.OooO00o().m16387OooO0O0(), r4.OooO00o(r0.m17801OooO00o()).OooO00o(((AbstractC6541lIlii) OooO00o.OooO00o(4)).OooO00o()));
        } catch (IOException e) {
            throw new CMSException("IOException reading compressed content.", e);
        }
    }
}
