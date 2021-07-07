package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.liLL丨1l  reason: invalid class name */
public class liLL1l implements AbstractC6370iIIIl {
    public AbstractC6370iIIIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18616OooO00o;

    public liLL1l(AbstractC6370iIIIl r2) {
        this(r2, IIllii.OooO00o());
    }

    public liLL1l(AbstractC6370iIIIl r1, SecureRandom secureRandom) {
        this.f18616OooO00o = secureRandom;
        this.OooO00o = r1;
    }

    public AbstractC6370iIIIl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m17752OooO00o() {
        return this.f18616OooO00o;
    }
}
