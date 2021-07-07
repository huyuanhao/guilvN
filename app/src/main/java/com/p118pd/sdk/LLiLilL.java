package com.p118pd.sdk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.LLiLil丨L  reason: invalid class name */
public class LLiLilL extends LIiL11 {
    public C5534IiLLi OooO00o;

    @Override // com.p118pd.sdk.LIiL11
    public Collection OooO00o(AbstractC6317ilLi illi) throws StoreException {
        if (!(illi instanceof C6088iIII)) {
            return Collections.EMPTY_SET;
        }
        C6088iIII r3 = (C6088iIII) illi;
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.OooO00o.OooO00o(r3));
        hashSet.addAll(this.OooO00o.OooO0O0(r3));
        hashSet.addAll(this.OooO00o.OooO0OO(r3));
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
