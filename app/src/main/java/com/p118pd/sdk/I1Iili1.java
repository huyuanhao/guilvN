package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.I1Iili1 */
public class I1Iili1 {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6532lIII f15316OooO00o;

    public I1Iili1(AbstractC9685lL r2) throws IOException {
        this.OooO00o = (LlLI1) r2.OooO00o();
        this.f15316OooO00o = (AbstractC6532lIII) r2.OooO00o();
    }

    public LlLI1 OooO00o() {
        return this.OooO00o;
    }

    public AbstractC6854lLi1LL OooO00o(int i) throws IOException {
        AbstractC6532lIII r0 = this.f15316OooO00o;
        if (r0 != null) {
            return r0.OooO00o(i, true);
        }
        return null;
    }
}
