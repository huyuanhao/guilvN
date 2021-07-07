package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.llL1丨LI  reason: invalid class name */
public class llL1LI implements CertSelector, AbstractC6317ilLi {
    public final C9421IlIli OooO00o;

    public llL1LI(int i, String str, String str2, byte[] bArr) {
        this.OooO00o = new C9421IlIli(new Ii111(i, new LlLI1(str2), new C6456l1ilL(new LlLI1(str)), C9586iIILl.m21630OooO00o(bArr)));
    }

    public llL1LI(I11li1 i11li1) {
        this.OooO00o = C9421IlIli.OooO00o(i11li1);
    }

    public llL1LI(C6790lll1I11 r2) {
        this.OooO00o = new C9421IlIli(OooO00o(r2));
    }

    public llL1LI(C6790lll1I11 r5, BigInteger bigInteger) {
        this.OooO00o = new C9421IlIli(new C93041iI1l(C5845LIillll.OooO00o(new C5707LiL1(new ILI(r5))), new C6513lIiI(bigInteger)));
    }

    public llL1LI(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            this.OooO00o = new C9421IlIli(new C93041iI1l(OooO00o(C1IIlL.OooO00o(x509Certificate)), new C6513lIiI(x509Certificate.getSerialNumber())));
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    public llL1LI(X500Principal x500Principal) {
        this(C93211ll.OooO00o(x500Principal));
    }

    public llL1LI(X500Principal x500Principal, BigInteger bigInteger) {
        this(C93211ll.OooO00o(x500Principal), bigInteger);
    }

    private C5845LIillll OooO00o(C6790lll1I11 r3) {
        return C5845LIillll.OooO00o(new C5707LiL1(new ILI(r3)));
    }

    private boolean OooO00o(C6790lll1I11 r6, C5845LIillll r7) {
        ILI[] OooO00o2 = r7.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            ILI ili = OooO00o2[i];
            if (ili.OooO00o() == 4) {
                try {
                    if (new C6790lll1I11(ili.m15483OooO0O0().OooO0O0().getEncoded()).equals(r6)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    private Object[] OooO00o(ILI[] iliArr) {
        ArrayList arrayList = new ArrayList(iliArr.length);
        for (int i = 0; i != iliArr.length; i++) {
            if (iliArr[i].OooO00o() == 4) {
                try {
                    arrayList.add(new X500Principal(iliArr[i].m15483OooO0O0().OooO0O0().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private Principal[] OooO00o(C5845LIillll r4) {
        Object[] OooO00o2 = OooO00o(r4.OooO00o());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.length; i++) {
            if (OooO00o2[i] instanceof Principal) {
                arrayList.add(OooO00o2[i]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    public int OooO00o() {
        if (this.OooO00o.OooO00o() != null) {
            return this.OooO00o.OooO00o().m15800OooO00o().OooO00o().intValue();
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17872OooO00o() {
        if (this.OooO00o.m21465OooO00o() != null) {
            return this.OooO00o.m21465OooO00o().m21308OooO00o().m17647OooO0O0();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17873OooO00o() {
        if (this.OooO00o.OooO00o() != null) {
            return this.OooO00o.OooO00o().m15801OooO00o().m15475OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Principal[] m17874OooO00o() {
        if (this.OooO00o.m21464OooO00o() != null) {
            return OooO00o(this.OooO00o.m21464OooO00o());
        }
        return null;
    }

    public String OooO0O0() {
        if (this.OooO00o.OooO00o() != null) {
            return this.OooO00o.OooO00o().m15802OooO00o().OooO00o().m16387OooO0O0();
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Principal[] m17875OooO0O0() {
        if (this.OooO00o.m21465OooO00o() != null) {
            return OooO00o(this.OooO00o.m21465OooO00o().OooO00o());
        }
        return null;
    }

    public String OooO0Oo() {
        if (this.OooO00o.OooO00o() == null) {
            return null;
        }
        this.OooO00o.OooO00o().OooO00o().m16387OooO0O0();
        return null;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new llL1LI((I11li1) this.OooO00o.m21466OooO0O0());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof llL1LI)) {
            return false;
        }
        return this.OooO00o.equals(((llL1LI) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        try {
            if (this.OooO00o.m21465OooO00o() != null) {
                return this.OooO00o.m21465OooO00o().m21308OooO00o().m17647OooO0O0().equals(x509Certificate.getSerialNumber()) && OooO00o(C1IIlL.OooO00o(x509Certificate), this.OooO00o.m21465OooO00o().OooO00o());
            }
            if (this.OooO00o.m21464OooO00o() != null && OooO00o(C1IIlL.OooO0O0(x509Certificate), this.OooO00o.m21464OooO00o())) {
                return true;
            }
            if (this.OooO00o.OooO00o() != null) {
                MessageDigest instance = MessageDigest.getInstance(OooO0O0(), BouncyCastleProvider.PROVIDER_NAME);
                int OooO00o2 = OooO00o();
                if (OooO00o2 == 0) {
                    instance.update(certificate.getPublicKey().getEncoded());
                } else if (OooO00o2 == 1) {
                    instance.update(certificate.getEncoded());
                }
                if (!C9586iIILl.m21627OooO00o(instance.digest(), m17873OooO00o())) {
                }
            }
            return false;
        } catch (CertificateEncodingException unused) {
        }
    }
}
