package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LiL丨l1i  reason: invalid class name and case insensitive filesystem */
public class C9507LiLl1i implements AbstractC6370iIIIl {
    public LL1ii1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6512lIilLl f23085OooO00o;
    public C6512lIilLl OooO0O0;

    public C9507LiLl1i(C6512lIilLl r2, C6512lIilLl r3) {
        this(r2, r3, null);
    }

    public C9507LiLl1i(C6512lIilLl r4, C6512lIilLl r5, LL1ii1l r6) {
        if (r4 == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        } else if (r5 != null) {
            C5600L1iLL OooO00o2 = r4.OooO00o();
            if (OooO00o2.equals(r5.OooO00o())) {
                if (r6 == null) {
                    r6 = new LL1ii1l(OooO00o2.m16003OooO00o().OooO00o(r5.OooO00o()), OooO00o2);
                } else if (!OooO00o2.equals(r6.OooO00o())) {
                    throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
                }
                this.f23085OooO00o = r4;
                this.OooO0O0 = r5;
                this.OooO00o = r6;
                return;
            }
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        } else {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
    }

    public LL1ii1l OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6512lIilLl m21571OooO00o() {
        return this.OooO0O0;
    }

    public C6512lIilLl OooO0O0() {
        return this.f23085OooO00o;
    }
}
