package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.iI丨LLL1  reason: invalid class name */
public class iILLL1 {
    public final Vector OooO00o = new Vector();

    public int OooO00o() {
        return this.OooO00o.size();
    }

    public AbstractC6854lLi1LL OooO00o(int i) {
        return (AbstractC6854lLi1LL) this.OooO00o.elementAt(i);
    }

    public void OooO00o(iILLL1 r3) {
        Enumeration elements = r3.OooO00o.elements();
        while (elements.hasMoreElements()) {
            this.OooO00o.addElement(elements.nextElement());
        }
    }

    public void OooO00o(AbstractC6854lLi1LL r2) {
        this.OooO00o.addElement(r2);
    }
}
