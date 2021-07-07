package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.IIiLL丨  reason: invalid class name */
public class IIiLL extends AbstractC5738Lil {
    public Vector OooO00o = new Vector();

    public IIiLL(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            this.OooO00o.addElement(C5870LiLlI.OooO00o(I11li1.OooO00o(OooO00o2.nextElement())));
        }
    }

    public IIiLL(Vector vector) {
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.OooO00o.addElement(elements.nextElement());
        }
    }

    public static IIiLL OooO00o(Object obj) {
        if (obj instanceof IIiLL) {
            return (IIiLL) obj;
        }
        if (obj != null) {
            return new IIiLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Vector OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        Enumeration elements = this.OooO00o.elements();
        while (elements.hasMoreElements()) {
            r0.OooO00o((C5870LiLlI) elements.nextElement());
        }
        return new C5707LiL1(r0);
    }
}
