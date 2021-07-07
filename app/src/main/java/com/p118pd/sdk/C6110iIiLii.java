package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIiL丨ii  reason: invalid class name and case insensitive filesystem */
public class C6110iIiLii implements AbstractC6370iIIIl {
    public LiIiLii OooO00o;
    public LiIiLii OooO0O0;

    public C6110iIiLii(LiIiLii liIiLii, LiIiLii liIiLii2) {
        if (liIiLii == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        } else if (liIiLii2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        } else if (liIiLii.OooO00o().equals(liIiLii2.OooO00o())) {
            this.OooO00o = liIiLii;
            this.OooO0O0 = liIiLii2;
        } else {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
    }

    public LiIiLii OooO00o() {
        return this.OooO0O0;
    }

    public LiIiLii OooO0O0() {
        return this.OooO00o;
    }
}
