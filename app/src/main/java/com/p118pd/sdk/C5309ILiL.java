package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ILiL  reason: case insensitive filesystem */
public class C5309ILiL extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ll11LL11 f15608OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9730lILiL f15609OooO00o;

    public C5309ILiL(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f15609OooO00o = C9730lILiL.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            Object nextElement = OooO00o2.nextElement();
            if ((nextElement instanceof AbstractC5903LlLLL) || (nextElement instanceof Ll11LL11)) {
                this.f15608OooO00o = Ll11LL11.OooO00o(nextElement);
            } else {
                this.OooO00o = I11li1.OooO00o(nextElement);
            }
        }
    }

    public C5309ILiL(C9730lILiL r1, Ll11LL11 ll11LL11, C6424iL[] r3) {
        if (r1 != null) {
            this.f15609OooO00o = r1;
            this.f15608OooO00o = ll11LL11;
            if (r3 != null) {
                this.OooO00o = new C5707LiL1(r3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("'certReq' cannot be null");
    }

    public static C5309ILiL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5309ILiL OooO00o(Object obj) {
        if (obj instanceof C5309ILiL) {
            return (C5309ILiL) obj;
        }
        if (obj != null) {
            return new C5309ILiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r1, AbstractC6854lLi1LL r2) {
        if (r2 != null) {
            r1.OooO00o(r2);
        }
    }

    public Ll11LL11 OooO00o() {
        return this.f15608OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9730lILiL m15506OooO00o() {
        return this.f15609OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6424iL[] m15507OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C6424iL[] r1 = new C6424iL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6424iL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public Ll11LL11 OooO0O0() {
        return this.f15608OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15508OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15609OooO00o);
        OooO00o(r0, this.f15608OooO00o);
        OooO00o(r0, this.OooO00o);
        return new C5707LiL1(r0);
    }
}
