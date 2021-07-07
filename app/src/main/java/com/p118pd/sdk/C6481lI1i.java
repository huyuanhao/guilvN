package com.p118pd.sdk;

import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.lI1i  reason: case insensitive filesystem */
public class C6481lI1i {
    public static final LlLI1 OooO00o = AbstractC5711LiLli.o00000O0;
    public static final LlLI1 OooO0O0 = AbstractC5711LiLli.o00000O;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5717LiiIll f18346OooO00o;

    public C6481lI1i(C5717LiiIll liiIll) {
        this.f18346OooO00o = liiIll;
    }

    public C5717LiiIll OooO00o() {
        return this.f18346OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17619OooO00o() {
        return this.f18346OooO00o.m16311OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m17620OooO00o() {
        return m17619OooO00o().equals(AbstractC5711LiLli.o000o00) ? new C5245IIi(C6845lLIL.OooO00o(this.f18346OooO00o.m16312OooO0O0())) : m17619OooO00o().equals(AbstractC5711LiLli.o000o00O) ? new X509CertificateHolder(LilIiIl.OooO00o(AbstractC6804llL1ii.OooO00o(C6905ll.OooO00o(this.f18346OooO00o.m16312OooO0O0()).m18070OooO0O0()).m17938OooO00o())) : m17619OooO00o().equals(AbstractC5711LiLli.o000o000) ? C5464IlilIi.OooO00o(this.f18346OooO00o.m16312OooO0O0()) : m17619OooO00o().equals(AbstractC5711LiLli.o000o00o) ? new X509CRLHolder(C5190I1lIiL.OooO00o(AbstractC6804llL1ii.OooO00o(lIiI11i.OooO00o(this.f18346OooO00o.m16312OooO0O0()).m17637OooO0O0()).m17938OooO00o())) : this.f18346OooO00o.m16312OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIIi[] m17621OooO00o() {
        I11L OooO00o2 = this.f18346OooO00o.OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        LIIi[] r1 = new LIIi[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = LIIi.OooO00o(OooO00o2.OooO00o(i));
        }
        return r1;
    }
}
