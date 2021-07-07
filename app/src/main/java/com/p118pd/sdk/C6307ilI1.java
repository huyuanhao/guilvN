package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ilI丨1  reason: invalid class name and case insensitive filesystem */
public class C6307ilI1 extends AbstractC5738Lil implements AbstractC5711LiLli {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17995OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6903lil f17996OooO00o;
    public I11L OooO0O0;
    public I11L OooO0OO;
    public I11L OooO0Oo;

    public C6307ilI1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f17995OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.OooO00o = (I11L) OooO00o2.nextElement();
        this.f17996OooO00o = C6903lil.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL iillil = (AbstractC6122iIlLiL) OooO00o2.nextElement();
            if (iillil instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) iillil;
                int OooO00o3 = r0.OooO00o();
                if (OooO00o3 == 0) {
                    this.OooO0O0 = I11L.OooO00o(r0, false);
                } else if (OooO00o3 == 1) {
                    this.OooO0OO = I11L.OooO00o(r0, false);
                } else {
                    throw new IllegalArgumentException("unknown tag value " + r0.OooO00o());
                }
            } else {
                this.OooO0Oo = (I11L) iillil;
            }
        }
    }

    public C6307ilI1(C6513lIiI r1, I11L i11l, C6903lil r3, I11L i11l2, I11L i11l3, I11L i11l4) {
        this.f17995OooO00o = r1;
        this.OooO00o = i11l;
        this.f17996OooO00o = r3;
        this.OooO0O0 = i11l2;
        this.OooO0OO = i11l3;
        this.OooO0Oo = i11l4;
    }

    public static C6307ilI1 OooO00o(Object obj) {
        if (obj instanceof C6307ilI1) {
            return (C6307ilI1) obj;
        }
        if (obj != null) {
            return new C6307ilI1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17341OooO00o() {
        return this.f17995OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6903lil m17342OooO00o() {
        return this.f17996OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17343OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17995OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17996OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO0O0));
        }
        if (this.OooO0OO != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0OO));
        }
        r0.OooO00o(this.OooO0Oo);
        return new C6351ill(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public I11L OooO0OO() {
        return this.OooO00o;
    }

    public I11L OooO0Oo() {
        return this.OooO0Oo;
    }
}
