package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iL1丨ii丨l  reason: invalid class name and case insensitive filesystem */
public class C6156iL1iil extends AbstractC5696Li1Il {
    public AbstractC6092iILIii OooO00o;

    public C6156iL1iil(AbstractC6092iILIii r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC5696Li1Il
    public C6213iL11I OooO00o(C6888ll r1) throws IOException {
        return IILLl.OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC5696Li1Il
    public AbstractC93171I1 OooO00o(C6456l1ilL r2) throws OperatorCreationException {
        return new C9503Li1(super.OooO00o.OooO00o(this.OooO00o.OooO00o(r2)));
    }
}
