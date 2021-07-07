package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.cmp.CMPException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.Ll丨ilI  reason: invalid class name and case insensitive filesystem */
public class C5814LlilI {
    public LLlIiil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6092iILIii f16769OooO00o;

    public C5814LlilI(AbstractC6092iILIii r1, LLlIiil lLlIiil) {
        this.f16769OooO00o = r1;
        this.OooO00o = lLlIiil;
    }

    public II1LL OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16412OooO00o() {
        return this.OooO00o.m16241OooO00o().m17647OooO0O0();
    }

    public boolean OooO00o(X509CertificateHolder x509CertificateHolder, AbstractC6290ii r4) throws CMPException {
        C6456l1ilL OooO00o2 = this.f16769OooO00o.OooO00o(x509CertificateHolder.toASN1Structure().m16319OooO00o());
        if (OooO00o2 != null) {
            try {
                I111LIL OooO00o3 = r4.OooO00o(OooO00o2);
                C9836iL.OooO00o(x509CertificateHolder.toASN1Structure(), OooO00o3.m21370OooO00o());
                return C9586iIILl.m21627OooO00o(this.OooO00o.m16242OooO00o().m17938OooO00o(), OooO00o3.m21371OooO00o());
            } catch (OperatorCreationException e) {
                throw new CMPException("unable to create digester: " + e.getMessage(), e);
            }
        } else {
            throw new CMPException("cannot find algorithm for digest from signature");
        }
    }
}
