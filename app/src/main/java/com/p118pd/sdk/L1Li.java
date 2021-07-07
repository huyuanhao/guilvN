package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.L1Li */
public class L1Li extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIi1i1l1 f16185OooO00o;

    public L1Li(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.f16185OooO00o = LIi1i1l1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public L1Li(LIi1i1l1 lIi1i1l1, iILLL1 r2) {
        this.f16185OooO00o = lIi1i1l1;
        this.OooO00o = new C5707LiL1(r2);
    }

    public L1Li(String str, iILLL1 r3) {
        this(new LIi1i1l1(str), r3);
    }

    public L1Li(String str, Vector vector) {
        this(str, OooO00o(vector));
    }

    public static L1Li OooO00o(Object obj) {
        if (obj instanceof L1Li) {
            return (L1Li) obj;
        }
        if (obj != null) {
            return new L1Li(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static iILLL1 OooO00o(Vector vector) {
        C6513lIiI r2;
        iILLL1 r0 = new iILLL1();
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            if (nextElement instanceof BigInteger) {
                r2 = new C6513lIiI((BigInteger) nextElement);
            } else if (nextElement instanceof Integer) {
                r2 = new C6513lIiI((long) ((Integer) nextElement).intValue());
            } else {
                throw new IllegalArgumentException();
            }
            r0.OooO00o(r2);
        }
        return r0;
    }

    public LIi1i1l1 OooO00o() {
        return this.f16185OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI[] m15958OooO00o() {
        C6513lIiI[] r0 = new C6513lIiI[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            r0[i] = C6513lIiI.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16185OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
