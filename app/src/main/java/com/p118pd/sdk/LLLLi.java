package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* renamed from: com.pd.sdk.LLLLi */
public class LLLLi {
    public L11l1i OooO00o = new L11l1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public liL11ll f16466OooO00o = new liL11ll();

    public LLLLi(C5856LLl1I r2, IL1LI r3, BigInteger bigInteger, Date date, Date date2) {
        this.f16466OooO00o.OooO00o(r2.f16821OooO00o);
        this.f16466OooO00o.OooO00o(C6653liIl.OooO00o(r3.OooO00o));
        this.f16466OooO00o.OooO00o(new C6513lIiI(bigInteger));
        this.f16466OooO00o.OooO0O0(new C9623il(date));
        this.f16466OooO00o.OooO00o(new C9623il(date2));
    }

    public LLLLi(C5856LLl1I r2, IL1LI r3, BigInteger bigInteger, Date date, Date date2, Locale locale) {
        this.f16466OooO00o.OooO00o(r2.f16821OooO00o);
        this.f16466OooO00o.OooO00o(C6653liIl.OooO00o(r3.OooO00o));
        this.f16466OooO00o.OooO00o(new C6513lIiI(bigInteger));
        this.f16466OooO00o.OooO0O0(new C9623il(date, locale));
        this.f16466OooO00o.OooO00o(new C9623il(date2, locale));
    }

    public LLLLi OooO00o(C5237III r2) throws CertIOException {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public LLLLi OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r5) {
        this.f16466OooO00o.OooO00o(new C5870LiLlI(llLI1, new i1I1I1l(r5)));
        return this;
    }

    public LLLLi OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws CertIOException {
        lIil1IL.OooO00o(this.OooO00o, llLI1, z, r4);
        return this;
    }

    public LLLLi OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) throws CertIOException {
        this.OooO00o.OooO00o(llLI1, z, bArr);
        return this;
    }

    public LLLLi OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL[] r5) {
        this.f16466OooO00o.OooO00o(new C5870LiLlI(llLI1, new i1I1I1l(r5)));
        return this;
    }

    public X509AttributeCertificateHolder OooO00o(Lii1ii1 r3) {
        this.f16466OooO00o.OooO00o(r3.OooO00o());
        if (!this.OooO00o.m15892OooO00o()) {
            this.f16466OooO00o.OooO00o(this.OooO00o.OooO00o());
        }
        return lIil1IL.OooO00o(r3, this.f16466OooO00o.OooO00o());
    }

    public void OooO00o(boolean[] zArr) {
        this.f16466OooO00o.OooO00o(lIil1IL.OooO00o(zArr));
    }
}
