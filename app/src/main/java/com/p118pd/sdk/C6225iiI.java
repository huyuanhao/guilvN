package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiI  reason: case insensitive filesystem */
public class C6225iiI {
    public static AbstractC6370iIIIl OooO00o(LIiI11 r1) {
        if (r1.m16085OooO00o() instanceof AbstractC6370iIIIl) {
            return (AbstractC6370iIIIl) r1.m16085OooO00o();
        }
        if (r1.m16085OooO00o() instanceof byte[]) {
            return new C6642li1LI((byte[]) r1.m16085OooO00o());
        }
        throw new IllegalArgumentException("unknown generic key type");
    }
}
