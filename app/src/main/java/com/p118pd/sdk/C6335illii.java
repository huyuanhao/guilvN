package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Vector;

/* renamed from: com.pd.sdk.illii  reason: case insensitive filesystem */
public class C6335illii implements L1l1I111 {
    public static final Vector OooO0O0;
    public Vector OooO00o;

    static {
        Vector vector = new Vector();
        OooO0O0 = vector;
        vector.addElement(C5815Lll.OooO00o);
        OooO0O0.addElement(C5815Lll.OooO0O0);
        OooO0O0.addElement(C5815Lll.OooO0OO);
        OooO0O0.addElement(C5815Lll.OooO0Oo);
        OooO0O0.addElement(C5815Lll.OooO0o0);
        OooO0O0.addElement(C5815Lll.OooO0o);
        OooO0O0.addElement(C5815Lll.OooO0oO);
    }

    public C6335illii() {
        this(OooO0O0);
    }

    public C6335illii(Vector vector) {
        this.OooO00o = vector;
    }

    @Override // com.p118pd.sdk.L1l1I111
    public boolean OooO00o(C6057i1L r4) {
        for (int i = 0; i < this.OooO00o.size(); i++) {
            if (OooO00o(r4, (C6057i1L) this.OooO00o.elementAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean OooO00o(C6057i1L r3, C6057i1L r4) {
        return r3 == r4 || (OooO00o(r3.OooO0O0(), r4.OooO0O0()) && OooO00o(r3.OooO00o(), r4.OooO00o()));
    }

    public boolean OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger == bigInteger2 || bigInteger.equals(bigInteger2);
    }
}
