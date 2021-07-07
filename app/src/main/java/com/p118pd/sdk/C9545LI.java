package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨L丨I  reason: invalid class name and case insensitive filesystem */
public class C9545LI extends AbstractC5738Lil implements AbstractC5711LiLli {
    public Il1iLLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6579lLL f23114OooO00o;

    public C9545LI(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        I11li1 OooO00o3 = I11li1.OooO00o((Object) ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0());
        if (OooO00o3.OooO00o(0).equals(AbstractC5711LiLli.OoooOo0)) {
            this.OooO00o = new Il1iLLi(AbstractC5711LiLli.OoooOo0, C5772LlIII.OooO00o(OooO00o3.OooO00o(1)));
        } else {
            this.OooO00o = Il1iLLi.OooO00o(OooO00o3);
        }
        this.f23114OooO00o = C6579lLL.OooO00o(OooO00o2.nextElement());
    }

    public C9545LI(Il1iLLi il1iLLi, C6579lLL lll) {
        this.OooO00o = il1iLLi;
        this.f23114OooO00o = lll;
    }

    public static C9545LI OooO00o(Object obj) {
        if (obj instanceof C9545LI) {
            return (C9545LI) obj;
        }
        if (obj != null) {
            return new C9545LI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Il1iLLi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6579lLL m21604OooO00o() {
        return this.f23114OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23114OooO00o);
        return new C5707LiL1(r0);
    }
}
