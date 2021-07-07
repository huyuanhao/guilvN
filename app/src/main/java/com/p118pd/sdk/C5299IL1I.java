package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IL1丨I  reason: invalid class name and case insensitive filesystem */
public class C5299IL1I {
    public static C6456l1ilL OooO00o(C6642li1LI r1) {
        LlLI1 llLI1;
        int length = r1.OooO00o().length * 8;
        if (length == 128) {
            llLI1 = lILIiLL.OooO0Oo;
        } else if (length == 192) {
            llLI1 = lILIiLL.OooO0o0;
        } else if (length == 256) {
            llLI1 = lILIiLL.OooO0o;
        } else {
            throw new IllegalArgumentException("illegal keysize in Camellia");
        }
        return new C6456l1ilL(llLI1);
    }
}
