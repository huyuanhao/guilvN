package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨ILI1l1  reason: invalid class name and case insensitive filesystem */
public class C9362ILI1l1 extends AbstractC5696Li1Il {
    public AbstractC6092iILIii OooO00o;

    public C9362ILI1l1(AbstractC6092iILIii r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC5696Li1Il
    public C6213iL11I OooO00o(C6888ll r1) throws IOException {
        return IILLl.OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC5696Li1Il
    public AbstractC93171I1 OooO00o(C6456l1ilL r3) throws OperatorCreationException {
        return new C5759Lii(new LL1IIL1(), super.OooO00o.OooO00o(this.OooO00o.OooO00o(r3)));
    }
}
