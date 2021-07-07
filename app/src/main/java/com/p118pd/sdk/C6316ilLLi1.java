package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ilLLi1丨  reason: invalid class name and case insensitive filesystem */
public class C6316ilLLi1 implements AbstractC6370iIIIl {
    public liLI1l1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18026OooO00o;

    public C6316ilLLi1(liLI1l1i lili1l1i, BigInteger bigInteger) {
        if (!(lili1l1i instanceof C11lI)) {
            this.OooO00o = lili1l1i;
            this.f18026OooO00o = bigInteger;
            return;
        }
        throw new IllegalArgumentException("RSA parameters should be for a public key");
    }

    public liLI1l1i OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17358OooO00o() {
        return this.f18026OooO00o;
    }
}
