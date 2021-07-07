package com.p118pd.sdk;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.L丨Ll1I  reason: invalid class name and case insensitive filesystem */
public class C5856LLl1I implements AbstractC6317ilLi {
    public static AbstractC6290ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9421IlIli f16821OooO00o;

    public C5856LLl1I(int i, LlLI1 llLI1, LlLI1 llLI12, byte[] bArr) {
        this.f16821OooO00o = new C9421IlIli(new Ii111(i, llLI12, new C6456l1ilL(llLI1), C9586iIILl.m21630OooO00o(bArr)));
    }

    public C5856LLl1I(I11li1 i11li1) {
        this.f16821OooO00o = C9421IlIli.OooO00o(i11li1);
    }

    public C5856LLl1I(l1LILI1 r2) {
        this.f16821OooO00o = new C9421IlIli(OooO00o(r2));
    }

    public C5856LLl1I(l1LILI1 r4, BigInteger bigInteger) {
        this.f16821OooO00o = new C9421IlIli(new C93041iI1l(OooO00o(r4), new C6513lIiI(bigInteger)));
    }

    public C5856LLl1I(X509CertificateHolder x509CertificateHolder) {
        this.f16821OooO00o = new C9421IlIli(new C93041iI1l(OooO00o(x509CertificateHolder.getIssuer()), new C6513lIiI(x509CertificateHolder.getSerialNumber())));
    }

    private C5845LIillll OooO00o(l1LILI1 r3) {
        return new C5845LIillll(new ILI(r3));
    }

    public static void OooO00o(AbstractC6290ii r0) {
        OooO00o = r0;
    }

    private boolean OooO00o(l1LILI1 r6, C5845LIillll r7) {
        ILI[] OooO00o2 = r7.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            ILI ili = OooO00o2[i];
            if (ili.OooO00o() == 4 && l1LILI1.OooO00o(ili.m15483OooO0O0()).equals(r6)) {
                return true;
            }
        }
        return false;
    }

    private l1LILI1[] OooO00o(ILI[] iliArr) {
        ArrayList arrayList = new ArrayList(iliArr.length);
        for (int i = 0; i != iliArr.length; i++) {
            if (iliArr[i].OooO00o() == 4) {
                arrayList.add(l1LILI1.OooO00o(iliArr[i].m15483OooO0O0()));
            }
        }
        return (l1LILI1[]) arrayList.toArray(new l1LILI1[arrayList.size()]);
    }

    public int OooO00o() {
        if (this.f16821OooO00o.OooO00o() != null) {
            return this.f16821OooO00o.OooO00o().m15800OooO00o().OooO00o().intValue();
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16434OooO00o() {
        if (this.f16821OooO00o.OooO00o() == null) {
            return null;
        }
        new LlLI1(this.f16821OooO00o.OooO00o().OooO00o().m16387OooO0O0());
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16435OooO00o() {
        if (this.f16821OooO00o.OooO00o() != null) {
            return this.f16821OooO00o.OooO00o().m15802OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16436OooO00o() {
        if (this.f16821OooO00o.m21465OooO00o() != null) {
            return this.f16821OooO00o.m21465OooO00o().m21308OooO00o().m17647OooO0O0();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509CertificateHolder)) {
            return false;
        }
        X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) obj;
        if (this.f16821OooO00o.m21465OooO00o() != null) {
            return this.f16821OooO00o.m21465OooO00o().m21308OooO00o().m17647OooO0O0().equals(x509CertificateHolder.getSerialNumber()) && OooO00o(x509CertificateHolder.getIssuer(), this.f16821OooO00o.m21465OooO00o().OooO00o());
        }
        if (this.f16821OooO00o.m21464OooO00o() != null && OooO00o(x509CertificateHolder.getSubject(), this.f16821OooO00o.m21464OooO00o())) {
            return true;
        }
        if (this.f16821OooO00o.OooO00o() != null) {
            try {
                I111LIL OooO00o2 = OooO00o.OooO00o(this.f16821OooO00o.OooO00o().m15802OooO00o());
                OutputStream OooO00o3 = OooO00o2.m21370OooO00o();
                int OooO00o4 = OooO00o();
                if (OooO00o4 == 0) {
                    OooO00o3.write(x509CertificateHolder.getSubjectPublicKeyInfo().getEncoded());
                } else if (OooO00o4 == 1) {
                    OooO00o3.write(x509CertificateHolder.getEncoded());
                }
                OooO00o3.close();
                if (!C9586iIILl.m21627OooO00o(OooO00o2.m21371OooO00o(), m16437OooO00o())) {
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16437OooO00o() {
        if (this.f16821OooO00o.OooO00o() != null) {
            return this.f16821OooO00o.OooO00o().m15801OooO00o().m15475OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1[] m16438OooO00o() {
        if (this.f16821OooO00o.m21464OooO00o() != null) {
            return OooO00o(this.f16821OooO00o.m21464OooO00o().OooO00o());
        }
        return null;
    }

    public l1LILI1[] OooO0O0() {
        if (this.f16821OooO00o.m21465OooO00o() != null) {
            return OooO00o(this.f16821OooO00o.m21465OooO00o().OooO00o().OooO00o());
        }
        return null;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C5856LLl1I((I11li1) this.f16821OooO00o.m21466OooO0O0());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5856LLl1I)) {
            return false;
        }
        return this.f16821OooO00o.equals(((C5856LLl1I) obj).f16821OooO00o);
    }

    public int hashCode() {
        return this.f16821OooO00o.hashCode();
    }
}
