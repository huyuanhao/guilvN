package com.p118pd.sdk;

import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.i丨i1  reason: invalid class name and case insensitive filesystem */
public class C6390ii1 {
    public static final C6456l1ilL OooO00o = new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6353i1 f18190OooO00o;

    public C6390ii1(C6353i1 r2) {
        if (r2 != null) {
            this.f18190OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("'id' cannot be null");
    }

    public C6390ii1(I111LIL r2, X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) throws OCSPException {
        this.f18190OooO00o = OooO00o(r2, x509CertificateHolder, new C6513lIiI(bigInteger));
    }

    public static C6353i1 OooO00o(I111LIL r3, X509CertificateHolder x509CertificateHolder, C6513lIiI r5) throws OCSPException {
        try {
            OutputStream OooO00o2 = r3.m21370OooO00o();
            OooO00o2.write(x509CertificateHolder.toASN1Structure().m16324OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o2.close();
            C6487lIIiIlL r0 = new C6487lIIiIlL(r3.m21371OooO00o());
            C6888ll subjectPublicKeyInfo = x509CertificateHolder.getSubjectPublicKeyInfo();
            OutputStream OooO00o3 = r3.m21370OooO00o();
            OooO00o3.write(subjectPublicKeyInfo.OooO00o().m15475OooO00o());
            OooO00o3.close();
            return new C6353i1(r3.OooO00o(), r0, new C6487lIIiIlL(r3.m21371OooO00o()), r5);
        } catch (Exception e) {
            throw new OCSPException("problem creating ID: " + e, e);
        }
    }

    public static C6390ii1 OooO00o(C6390ii1 r5, BigInteger bigInteger) {
        return new C6390ii1(new C6353i1(r5.f18190OooO00o.OooO00o(), r5.f18190OooO00o.m17420OooO0O0(), r5.f18190OooO00o.m17419OooO00o(), new C6513lIiI(bigInteger)));
    }

    public LlLI1 OooO00o() {
        return this.f18190OooO00o.OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6353i1 m17503OooO00o() {
        return this.f18190OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17504OooO00o() {
        return this.f18190OooO00o.m17418OooO00o().m17647OooO0O0();
    }

    public boolean OooO00o(X509CertificateHolder x509CertificateHolder, AbstractC6290ii r4) throws OCSPException {
        try {
            return OooO00o(r4.OooO00o(this.f18190OooO00o.OooO00o()), x509CertificateHolder, this.f18190OooO00o.m17418OooO00o()).equals(this.f18190OooO00o);
        } catch (OperatorCreationException e) {
            throw new OCSPException("unable to create digest calculator: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17505OooO00o() {
        return this.f18190OooO00o.m17419OooO00o().m17938OooO00o();
    }

    public byte[] OooO0O0() {
        return this.f18190OooO00o.m17420OooO0O0().m17938OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6390ii1)) {
            return false;
        }
        return this.f18190OooO00o.OooO0O0().equals(((C6390ii1) obj).f18190OooO00o.OooO0O0());
    }

    public int hashCode() {
        return this.f18190OooO00o.OooO0O0().hashCode();
    }
}
