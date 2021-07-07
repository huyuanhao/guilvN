package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.Ili丨lIi  reason: invalid class name and case insensitive filesystem */
public class C5464IlilIi extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15887OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15888OooO00o;

    public C5464IlilIi(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        if (((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0().intValue() == 0) {
            this.f15887OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
            this.f15888OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
            if (OooO00o2.hasMoreElements()) {
                this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) OooO00o2.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }

    public C5464IlilIi(C6456l1ilL r2, AbstractC6854lLi1LL r3) throws IOException {
        this(r2, r3, null);
    }

    public C5464IlilIi(C6456l1ilL r3, AbstractC6854lLi1LL r4, I11L i11l) throws IOException {
        this.f15888OooO00o = new C6487lIIiIlL(r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
        this.f15887OooO00o = r3;
        this.OooO00o = i11l;
    }

    public static C5464IlilIi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5464IlilIi OooO00o(Object obj) {
        if (obj instanceof C5464IlilIi) {
            return (C5464IlilIi) obj;
        }
        if (obj != null) {
            return new C5464IlilIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15706OooO00o() {
        return this.f15887OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(0));
        r0.OooO00o(this.f15887OooO00o);
        r0.OooO00o(this.f15888OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m15707OooO0O0() {
        return this.f15887OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15708OooO0O0() throws IOException {
        return AbstractC6122iIlLiL.OooO00o(this.f15888OooO00o.m17938OooO00o());
    }

    public AbstractC6122iIlLiL OooO0Oo() {
        try {
            return m15708OooO0O0().OooO0O0();
        } catch (IOException unused) {
            throw new IllegalStateException("unable to parse private key");
        }
    }
}
