package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.LL11丨1l  reason: invalid class name */
public class LL111l extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public LL111l(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
            try {
                this.OooO00o = AbstractC6122iIlLiL.OooO00o(i11li1.OooO00o(1).OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
            } catch (IOException unused) {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
    }

    public LL111l(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static LL111l OooO00o(Object obj) {
        if (obj instanceof LL111l) {
            return (LL111l) obj;
        }
        if (obj != null) {
            return new LL111l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16165OooO0O0() {
        return this.OooO00o;
    }
}
