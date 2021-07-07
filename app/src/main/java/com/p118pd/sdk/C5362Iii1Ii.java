package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Iii1I丨i  reason: invalid class name and case insensitive filesystem */
public class C5362Iii1Ii implements AbstractC6370iIIIl {
    public LiIiLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f15727OooO00o;
    public C6389ii OooO0O0;

    public C5362Iii1Ii(C6389ii r2, C6389ii r3) {
        this(r2, r3, null);
    }

    public C5362Iii1Ii(C6389ii r5, C6389ii r6, LiIiLii liIiLii) {
        if (r5 == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        } else if (r6 != null) {
            C6017i1Il OooO00o2 = r5.OooO00o();
            if (OooO00o2.equals(r6.OooO00o())) {
                if (liIiLii == null) {
                    liIiLii = new LiIiLii(OooO00o2.m16863OooO00o().modPow(r6.OooO00o(), OooO00o2.OooO0OO()), OooO00o2);
                } else if (!OooO00o2.equals(liIiLii.OooO00o())) {
                    throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                }
                this.f15727OooO00o = r5;
                this.OooO0O0 = r6;
                this.OooO00o = liIiLii;
                return;
            }
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        } else {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
    }

    public LiIiLii OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6389ii m15611OooO00o() {
        return this.OooO0O0;
    }

    public C6389ii OooO0O0() {
        return this.f15727OooO00o;
    }
}
