package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CRLHolder;

/* renamed from: com.pd.sdk.i11L丨L  reason: invalid class name and case insensitive filesystem */
public class C6006i11LL {
    public C5492I1 OooO00o = new C5492I1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public L11l1i f17335OooO00o = new L11l1i();

    public C6006i11LL(l1LILI1 r2, C5432IlIlIlL r3) {
        this.OooO00o.OooO00o(r2);
        this.OooO00o.OooO0O0(r3);
    }

    public C6006i11LL(l1LILI1 r2, Date date) {
        this.OooO00o.OooO00o(r2);
        this.OooO00o.OooO0O0(new C5432IlIlIlL(date));
    }

    public C6006i11LL(l1LILI1 r2, Date date, Locale locale) {
        this.OooO00o.OooO00o(r2);
        this.OooO00o.OooO0O0(new C5432IlIlIlL(date, locale));
    }

    public C6006i11LL OooO00o(C5237III r2) throws CertIOException {
        this.f17335OooO00o.OooO00o(r2);
        return this;
    }

    public C6006i11LL OooO00o(C5432IlIlIlL r2) {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public C6006i11LL OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws CertIOException {
        lIil1IL.OooO00o(this.f17335OooO00o, llLI1, z, r4);
        return this;
    }

    public C6006i11LL OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) throws CertIOException {
        this.f17335OooO00o.OooO00o(llLI1, z, bArr);
        return this;
    }

    public C6006i11LL OooO00o(BigInteger bigInteger, Date date, int i) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), i);
        return this;
    }

    public C6006i11LL OooO00o(BigInteger bigInteger, Date date, int i, Date date2) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), i, new C9623il(date2));
        return this;
    }

    public C6006i11LL OooO00o(BigInteger bigInteger, Date date, iI11IL r5) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), r5);
        return this;
    }

    public C6006i11LL OooO00o(Date date) {
        return OooO00o(new C5432IlIlIlL(date));
    }

    public C6006i11LL OooO00o(Date date, Locale locale) {
        return OooO00o(new C5432IlIlIlL(date, locale));
    }

    public C6006i11LL OooO00o(X509CRLHolder x509CRLHolder) {
        C6782lli11 OooO00o2 = x509CRLHolder.toASN1Structure().m15326OooO00o();
        if (OooO00o2 != null) {
            Enumeration OooO00o3 = OooO00o2.m17905OooO00o();
            while (OooO00o3.hasMoreElements()) {
                this.OooO00o.OooO00o(I11li1.OooO00o((Object) ((AbstractC6854lLi1LL) OooO00o3.nextElement()).OooO0O0()));
            }
        }
        return this;
    }

    public X509CRLHolder OooO00o(Lii1ii1 r3) {
        this.OooO00o.OooO00o(r3.OooO00o());
        if (!this.f17335OooO00o.m15892OooO00o()) {
            this.OooO00o.OooO00o(this.f17335OooO00o.OooO00o());
        }
        return lIil1IL.OooO00o(r3, this.OooO00o.OooO00o());
    }
}
