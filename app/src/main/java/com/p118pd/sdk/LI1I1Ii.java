package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.LI1I1Ii */
public class LI1I1Ii {
    public L11l1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6504lILI f16256OooO00o;

    public LI1I1Ii(l1LILI1 r3, BigInteger bigInteger, C5432IlIlIlL r5, C5432IlIlIlL r6, l1LILI1 r7, C6888ll r8) {
        C6504lILI lili = new C6504lILI();
        this.f16256OooO00o = lili;
        lili.OooO00o(new C6513lIiI(bigInteger));
        this.f16256OooO00o.OooO00o(r3);
        this.f16256OooO00o.OooO0O0(r5);
        this.f16256OooO00o.OooO00o(r6);
        this.f16256OooO00o.OooO0O0(r7);
        this.f16256OooO00o.OooO00o(r8);
        this.OooO00o = new L11l1i();
    }

    public LI1I1Ii(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, C6888ll r13) {
        this(r8, bigInteger, new C5432IlIlIlL(date), new C5432IlIlIlL(date2), r12, r13);
    }

    public LI1I1Ii(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, Locale locale, l1LILI1 r13, C6888ll r14) {
        this(r8, bigInteger, new C5432IlIlIlL(date, locale), new C5432IlIlIlL(date2, locale), r13, r14);
    }

    public LI1I1Ii OooO00o(C5237III r2) throws CertIOException {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public LI1I1Ii OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws CertIOException {
        lIil1IL.OooO00o(this.OooO00o, llLI1, z, r4);
        return this;
    }

    public LI1I1Ii OooO00o(LlLI1 llLI1, boolean z, X509CertificateHolder x509CertificateHolder) {
        C5237III OooO00o2 = x509CertificateHolder.toASN1Structure().OooO00o().m15514OooO00o().OooO00o(llLI1);
        if (OooO00o2 != null) {
            this.OooO00o.OooO00o(llLI1, z, OooO00o2.m15433OooO00o().m17938OooO00o());
            return this;
        }
        throw new NullPointerException("extension " + llLI1 + " not present");
    }

    public LI1I1Ii OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) throws CertIOException {
        this.OooO00o.OooO00o(llLI1, z, bArr);
        return this;
    }

    public LI1I1Ii OooO00o(boolean[] zArr) {
        this.f16256OooO00o.OooO00o(lIil1IL.OooO00o(zArr));
        return this;
    }

    public X509CertificateHolder OooO00o(Lii1ii1 r3) {
        this.f16256OooO00o.OooO00o(r3.OooO00o());
        if (!this.OooO00o.m15892OooO00o()) {
            this.f16256OooO00o.OooO00o(this.OooO00o.OooO00o());
        }
        return lIil1IL.OooO00o(r3, this.f16256OooO00o.OooO00o());
    }

    public LI1I1Ii OooO0O0(boolean[] zArr) {
        this.f16256OooO00o.OooO0O0(lIil1IL.OooO00o(zArr));
        return this;
    }
}
