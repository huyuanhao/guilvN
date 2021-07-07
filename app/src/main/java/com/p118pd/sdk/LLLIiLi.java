package com.p118pd.sdk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.LLLIiLi */
public class LLLIiLi extends LIiL11 {
    public C5534IiLLi OooO00o;

    @Override // com.p118pd.sdk.LIiL11
    public Collection OooO00o(AbstractC6317ilLi illi) throws StoreException {
        if (!(illi instanceof C6900li)) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.OooO00o.OooO00o((C6900li) illi));
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
