package com.p118pd.sdk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.丨1IIiL1丨  reason: invalid class name */
public class C1IIiL1 extends LIiL11 {
    public C5534IiLLi OooO00o;

    private Collection OooO00o(C6175iLLl r6) throws StoreException {
        HashSet hashSet = new HashSet();
        C6900li r1 = new C6900li();
        r1.OooO00o(r6);
        r1.OooO0O0(new C6175iLLl());
        HashSet<il1l1l> hashSet2 = new HashSet(this.OooO00o.OooO00o(r1));
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (il1l1l r3 : hashSet2) {
            if (r3.OooO00o() != null) {
                hashSet3.add(r3.OooO00o());
            }
            if (r3.OooO0O0() != null) {
                hashSet4.add(r3.OooO0O0());
            }
        }
        hashSet.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet;
    }

    @Override // com.p118pd.sdk.LIiL11
    public Collection OooO00o(AbstractC6317ilLi illi) throws StoreException {
        Collection OooO0O0;
        if (!(illi instanceof C6175iLLl)) {
            return Collections.EMPTY_SET;
        }
        C6175iLLl r4 = (C6175iLLl) illi;
        HashSet hashSet = new HashSet();
        if (r4.getBasicConstraints() <= 0) {
            if (r4.getBasicConstraints() == -2) {
                OooO0O0 = this.OooO00o.OooO0O0(r4);
                hashSet.addAll(OooO0O0);
                return hashSet;
            }
            hashSet.addAll(this.OooO00o.OooO0O0(r4));
        }
        hashSet.addAll(this.OooO00o.m15810OooO00o(r4));
        OooO0O0 = OooO00o(r4);
        hashSet.addAll(OooO0O0);
        return hashSet;
    }

    @Override // com.p118pd.sdk.LIiL11
    public void OooO00o(IIllL1L r3) {
        if (r3 instanceof C5590L1il) {
            this.OooO00o = new C5534IiLLi((C5590L1il) r3);
            return;
        }
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + C5590L1il.class.getName() + C9058ooOoOoOO.OooOO0);
    }
}
