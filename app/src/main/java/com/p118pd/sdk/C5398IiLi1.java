package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.Ii丨L丨i1  reason: invalid class name and case insensitive filesystem */
public class C5398IiLi1 {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iILLL1 f15771OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f15772OooO00o;

    public C5398IiLi1(C5190I1lIiL r4) throws IOException {
        this.f15771OooO00o = new iILLL1();
        this.OooO00o = AbstractC5711LiLli.o000o00o;
        this.f15772OooO00o = new C6905ll(AbstractC5711LiLli.o00000oo, new C6487lIIiIlL(r4.getEncoded()));
    }

    public C5398IiLi1(C5464IlilIi r2) {
        this.f15771OooO00o = new iILLL1();
        this.OooO00o = AbstractC5711LiLli.o000o000;
        this.f15772OooO00o = r2;
    }

    public C5398IiLi1(C5464IlilIi r2, AbstractC5650LIL r3) {
        this.f15771OooO00o = new iILLL1();
        this.OooO00o = AbstractC5711LiLli.o000o00;
        this.f15772OooO00o = new C6805llLL(r2).OooO00o(r3).m15462OooO00o();
    }

    public C5398IiLi1(LilIiIl lilIiIl) throws IOException {
        this.f15771OooO00o = new iILLL1();
        this.OooO00o = AbstractC5711LiLli.o000o00O;
        this.f15772OooO00o = new C6905ll(AbstractC5711LiLli.o00000o0, new C6487lIIiIlL(lilIiIl.getEncoded()));
    }

    public C5398IiLi1(X509CRLHolder x509CRLHolder) throws IOException {
        this(x509CRLHolder.toASN1Structure());
    }

    public C5398IiLi1(X509CertificateHolder x509CertificateHolder) throws IOException {
        this(x509CertificateHolder.toASN1Structure());
    }

    public C5398IiLi1 OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r5) {
        this.f15771OooO00o.OooO00o(new LIIi(llLI1, new i1I1I1l(r5)));
        return this;
    }

    public C6481lI1i OooO00o() {
        return new C6481lI1i(new C5717LiiIll(this.OooO00o, this.f15772OooO00o, new i1I1I1l(this.f15771OooO00o)));
    }
}
