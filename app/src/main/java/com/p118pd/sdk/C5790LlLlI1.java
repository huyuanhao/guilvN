package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LlLlI1丨  reason: invalid class name and case insensitive filesystem */
public class C5790LlLlI1 {
    public static AbstractC6436l11LI OooO00o(String str) {
        if (str.equals(LL1i.OooO0O0)) {
            return new C6461l1liI();
        }
        if (str.equals(LL1i.OooO0OO)) {
            return new C9495LLIl();
        }
        if (str.equals(LL1i.OooO0Oo)) {
            return new I1li1Ll();
        }
        if (str.equals(LL1i.f16409OooO0o0)) {
            return new i1iLLll();
        }
        if (str.equals(LL1i.f16408OooO0o)) {
            return new C5622LILlL();
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }
}
