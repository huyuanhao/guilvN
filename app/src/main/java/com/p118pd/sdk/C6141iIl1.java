package com.p118pd.sdk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.iI丨l1  reason: invalid class name and case insensitive filesystem */
public class C6141iIl1 extends LIiL11 {
    public C5534IiLLi OooO00o;

    @Override // com.p118pd.sdk.LIiL11
    public Collection OooO00o(AbstractC6317ilLi illi) throws StoreException {
        Collection collection;
        if (!(illi instanceof C9801LIL)) {
            return Collections.EMPTY_SET;
        }
        C9801LIL r3 = (C9801LIL) illi;
        HashSet hashSet = new HashSet();
        if (r3.OooO0O0()) {
            collection = this.OooO00o.OooO0o0(r3);
        } else {
            hashSet.addAll(this.OooO00o.OooO0o0(r3));
            hashSet.addAll(this.OooO00o.OooO00o(r3));
            hashSet.addAll(this.OooO00o.OooO0O0(r3));
            hashSet.addAll(this.OooO00o.OooO0OO(r3));
            collection = this.OooO00o.OooO0Oo(r3);
        }
        hashSet.addAll(collection);
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
