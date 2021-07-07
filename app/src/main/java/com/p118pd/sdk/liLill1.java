package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.liLi丨ll1  reason: invalid class name */
public class liLill1 extends llIiI1 {
    public C5385IilliL OooO00o(C9448Il r2) throws CMSException {
        return OooO00o(r2, (InputStream) null);
    }

    public C5385IilliL OooO00o(C9448Il r9, InputStream inputStream) throws CMSException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            try {
                C6304ilIi1.OooO00o(inputStream, byteArrayOutputStream);
            } catch (IOException e) {
                throw new CMSException("exception encapsulating content: " + e.getMessage(), e);
            }
        }
        L1iI1 l1iI1 = null;
        C5837L1l r10 = byteArrayOutputStream.size() != 0 ? new C5837L1l(byteArrayOutputStream.toByteArray()) : null;
        C5497I1L r0 = new C5497I1L(r9.m21487OooO00o().m17281OooO00o());
        URI uri = ((llIiI1) this).f18744OooO00o;
        if (uri != null) {
            l1iI1 = new L1iI1(uri.toString());
        }
        return new C5385IilliL(new C5753LiI1(AbstractC6252iiLl.OooOO0, new C6393iiIiiL(l1iI1, ((llIiI1) this).OooO00o, r10, new C5507IILLI(new III(r0)))));
    }

    public C5385IilliL OooO00o(C9448Il r2, byte[] bArr) throws CMSException {
        return OooO00o(r2, new ByteArrayInputStream(bArr));
    }
}
