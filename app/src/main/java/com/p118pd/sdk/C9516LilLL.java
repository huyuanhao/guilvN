package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.cmp.CMPException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨Lil丨LL丨  reason: invalid class name and case insensitive filesystem */
public class C9516LilLL {
    public AbstractC6092iILIii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f23093OooO00o;
    public List OooO0O0;

    public C9516LilLL() {
        this(new C6056i1I());
    }

    public C9516LilLL(AbstractC6092iILIii r2) {
        this.f23093OooO00o = new ArrayList();
        this.OooO0O0 = new ArrayList();
        this.OooO00o = r2;
    }

    public C9516LilLL OooO00o(X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) {
        this.f23093OooO00o.add(x509CertificateHolder);
        this.OooO0O0.add(bigInteger);
        return this;
    }

    public C4983 OooO00o(AbstractC6290ii r7) throws CMPException {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != this.f23093OooO00o.size(); i++) {
            X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) this.f23093OooO00o.get(i);
            BigInteger bigInteger = (BigInteger) this.OooO0O0.get(i);
            C6456l1ilL OooO00o2 = this.OooO00o.OooO00o(x509CertificateHolder.toASN1Structure().m16319OooO00o());
            if (OooO00o2 != null) {
                try {
                    I111LIL OooO00o3 = r7.OooO00o(OooO00o2);
                    C9836iL.OooO00o(x509CertificateHolder.toASN1Structure(), OooO00o3.m21370OooO00o());
                    r0.OooO00o(new LLlIiil(OooO00o3.m21371OooO00o(), bigInteger));
                } catch (OperatorCreationException e) {
                    throw new CMPException("unable to create digest: " + e.getMessage(), e);
                }
            } else {
                throw new CMPException("cannot find algorithm for digest from signature");
            }
        }
        return new C4983(C6593lLi.OooO00o(new C5707LiL1(r0)), this.OooO00o);
    }
}
