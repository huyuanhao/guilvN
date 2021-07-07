package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.pd.sdk.i1iI1丨iI  reason: invalid class name */
public final class i1iI1iI extends LL1LL {
    public final ThreadFactory OooO00o;

    public i1iI1iI(ThreadFactory threadFactory) {
        this.OooO00o = threadFactory;
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new C6655liIlIl(this.OooO00o);
    }
}
