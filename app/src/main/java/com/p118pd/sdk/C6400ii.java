package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨i丨  reason: invalid class name and case insensitive filesystem */
public class C6400ii extends C9388IiLL {
    public static final AbstractC5662LLi OooO0O0 = new C6400ii();

    @Override // com.p118pd.sdk.AbstractC5662LLi, com.p118pd.sdk.AbstractC5479IlII
    public boolean OooO00o(l1LILI1 r5, l1LILI1 r6) {
        LILlIL[] OooO00o = r5.m17571OooO00o();
        LILlIL[] OooO00o2 = r6.m17571OooO00o();
        if (OooO00o.length != OooO00o2.length) {
            return false;
        }
        for (int i = 0; i != OooO00o.length; i++) {
            if (!OooO00o(OooO00o[i], OooO00o2[i])) {
                return false;
            }
        }
        return true;
    }
}
