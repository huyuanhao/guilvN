package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii1丨I  reason: invalid class name and case insensitive filesystem */
public class C5344Ii1I implements AbstractC6370iIIIl {
    public LL1ii1l OooO00o;
    public LL1ii1l OooO0O0;

    public C5344Ii1I(LL1ii1l r3, LL1ii1l r4) {
        if (r3 == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        } else if (r4 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        } else if (r3.OooO00o().equals(r4.OooO00o())) {
            this.OooO00o = r3;
            this.OooO0O0 = r4;
        } else {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
    }

    public LL1ii1l OooO00o() {
        return this.OooO0O0;
    }

    public LL1ii1l OooO0O0() {
        return this.OooO00o;
    }
}
