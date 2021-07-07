package com.p118pd.sdk;

import java.util.Vector;

/* renamed from: com.pd.sdk.丨1I丨Lll  reason: invalid class name */
public class C1ILll {
    public Vector OooO00o = new Vector();

    public C5845LIillll OooO00o() {
        int size = this.OooO00o.size();
        ILI[] iliArr = new ILI[size];
        for (int i = 0; i != size; i++) {
            iliArr[i] = (ILI) this.OooO00o.elementAt(i);
        }
        return new C5845LIillll(iliArr);
    }

    public C1ILll OooO00o(ILI ili) {
        this.OooO00o.addElement(ili);
        return this;
    }

    public C1ILll OooO00o(C5845LIillll r4) {
        ILI[] OooO00o2 = r4.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            this.OooO00o.addElement(OooO00o2[i]);
        }
        return this;
    }
}
