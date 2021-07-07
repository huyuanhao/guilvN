package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i11Liiil */
public class i11Liiil implements AbstractC6370iIIIl {
    public LiIiLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f17330OooO00o;
    public C6389ii OooO0O0;

    public i11Liiil(C6389ii r2, C6389ii r3) {
        this(r2, r3, null);
    }

    public i11Liiil(C6389ii r4, C6389ii r5, LiIiLii liIiLii) {
        if (r4 == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        } else if (r5 != null) {
            C6017i1Il OooO00o2 = r4.OooO00o();
            if (OooO00o2.equals(r5.OooO00o())) {
                if (liIiLii == null) {
                    liIiLii = new LiIiLii(OooO00o2.m16863OooO00o().multiply(r5.OooO00o()), OooO00o2);
                } else if (!OooO00o2.equals(liIiLii.OooO00o())) {
                    throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
                }
                this.f17330OooO00o = r4;
                this.OooO0O0 = r5;
                this.OooO00o = liIiLii;
                return;
            }
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        } else {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
    }

    public LiIiLii OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6389ii m16848OooO00o() {
        return this.OooO0O0;
    }

    public C6389ii OooO0O0() {
        return this.f17330OooO00o;
    }
}
