package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiL丨1丨  reason: invalid class name and case insensitive filesystem */
public class C6255iiL1 implements AbstractC6370iIIIl {
    public LiIiLii OooO00o;
    public LiIiLii OooO0O0;

    public C6255iiL1(LiIiLii liIiLii, LiIiLii liIiLii2) {
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
