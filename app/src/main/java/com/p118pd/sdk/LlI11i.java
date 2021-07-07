package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.LlI11丨i丨  reason: invalid class name */
public class LlI11i extends AbstractC5738Lil implements AbstractC5462Ilil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6310ilIL f16686OooO00o;
    public C6310ilIL OooO0O0;

    public LlI11i(I11li1 i11li1) {
        if (i11li1.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        } else if (i11li1.OooO00o(0) instanceof AbstractC98681) {
            this.OooO0O0 = C6310ilIL.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
        } else {
            throw new IllegalArgumentException("Bad object encountered: " + i11li1.OooO00o(0).getClass());
        }
    }

    public LlI11i(C6310ilIL r1) {
        this.f16686OooO00o = r1;
    }

    public LlI11i(C6310ilIL r1, I11li1 i11li1) {
        this.OooO0O0 = r1;
        this.OooO00o = i11li1;
    }

    public LlI11i(String str) {
        this(new C6310ilIL(str));
    }

    public static LlI11i OooO00o(Object obj) {
        if (obj == null || (obj instanceof LlI11i)) {
            return (LlI11i) obj;
        }
        if (obj instanceof AbstractC98681) {
            return new LlI11i(C6310ilIL.OooO00o(obj));
        }
        if (obj instanceof I11li1) {
            return new LlI11i((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public C6310ilIL OooO00o() {
        return this.f16686OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL[] m16363OooO00o() {
        C6310ilIL[] r0 = new C6310ilIL[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C6310ilIL.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C6310ilIL r0 = this.f16686OooO00o;
        if (r0 != null) {
            return r0.OooO0O0();
        }
        iILLL1 r02 = new iILLL1();
        r02.OooO00o(this.OooO0O0);
        r02.OooO00o(this.OooO00o);
        return new C5707LiL1(r02);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6310ilIL m16364OooO0O0() {
        return this.OooO0O0;
    }
}
