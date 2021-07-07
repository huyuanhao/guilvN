package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.CMCException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l1丨丨I丨Il  reason: invalid class name and case insensitive filesystem */
public class C6474l1IIl implements i11ILLIi {
    public final iiiLLi1 OooO00o;

    public C6474l1IIl(C5753LiI1 r4) throws CMCException {
        try {
            iiiLLi1 r0 = new iiiLLi1(r4);
            this.OooO00o = r0;
            if (r0.m17280OooO00o().size() != 0) {
                throw new CMCException("malformed response: SignerInfo structures found");
            } else if (this.OooO00o.m17279OooO00o() != null) {
                throw new CMCException("malformed response: Signed Content found");
            }
        } catch (CMSException e) {
            throw new CMCException("malformed response: " + e.getMessage(), e);
        }
    }

    public C6474l1IIl(byte[] bArr) throws CMCException {
        this(OooO00o(bArr));
    }

    public static C5753LiI1 OooO00o(byte[] bArr) throws CMCException {
        try {
            return C5753LiI1.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (Exception e) {
            throw new CMCException("malformed data: " + e.getMessage(), e);
        }
    }

    public AbstractC6271iilI<X509CRLHolder> OooO00o() {
        return this.OooO00o.OooO0O0();
    }

    public AbstractC6271iilI<X509CertificateHolder> OooO0O0() {
        return this.OooO00o.OooO0OO();
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }
}
