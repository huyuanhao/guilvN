package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.II1lI */
public class II1lI extends AbstractC5738Lil {
    public static final LlLI1 o00OoOo0 = new LlLI1(AbstractC6634li1.OooOOOO + ".1");
    public C6310ilIL OooO00o;
    public LlLI1 o00OoOOo;
    public String o0ooOOo;

    public II1lI(I11li1 i11li1) {
        if (i11li1.size() <= 3) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r0 instanceof LlLI1) {
                    this.o00OoOOo = (LlLI1) r0;
                } else if (r0 instanceof L1iI1) {
                    this.o0ooOOo = L1iI1.OooO00o(r0).OooO00o();
                } else if (r0 instanceof AbstractC98681) {
                    this.OooO00o = C6310ilIL.OooO00o(r0);
                } else {
                    throw new IllegalArgumentException("Bad object encountered: " + r0.getClass());
                }
            }
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r02 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r02 instanceof L1iI1) {
                    this.o0ooOOo = L1iI1.OooO00o(r02).OooO00o();
                } else if (r02 instanceof AbstractC98681) {
                    this.OooO00o = C6310ilIL.OooO00o(r02);
                } else {
                    throw new IllegalArgumentException("Bad object encountered: " + r02.getClass());
                }
            }
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r4 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r4 instanceof AbstractC98681) {
                    this.OooO00o = C6310ilIL.OooO00o(r4);
                    return;
                }
                throw new IllegalArgumentException("Bad object encountered: " + r4.getClass());
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public II1lI(LlLI1 llLI1, String str, C6310ilIL r3) {
        this.o00OoOOo = llLI1;
        this.o0ooOOo = str;
        this.OooO00o = r3;
    }

    public static II1lI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static II1lI OooO00o(Object obj) {
        if (obj == null || (obj instanceof II1lI)) {
            return (II1lI) obj;
        }
        if (obj instanceof I11li1) {
            return new II1lI((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL m15357OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            r0.OooO00o(llLI1);
        }
        String str = this.o0ooOOo;
        if (str != null) {
            r0.OooO00o(new L1iI1(str, true));
        }
        C6310ilIL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15358OooO0O0() {
        return this.o0ooOOo;
    }
}
