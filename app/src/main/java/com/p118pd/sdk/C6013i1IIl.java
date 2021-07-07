package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1IIl  reason: case insensitive filesystem */
public class C6013i1IIl {
    public static C6456l1ilL OooO00o(C6642li1LI r1) {
        LlLI1 llLI1;
        int length = r1.OooO00o().length * 8;
        if (length == 128) {
            llLI1 = AbstractC5905LllI.OooOo;
        } else if (length == 192) {
            llLI1 = AbstractC5905LllI.Oooo000;
        } else if (length == 256) {
            llLI1 = AbstractC5905LllI.Oooo0oO;
        } else {
            throw new IllegalArgumentException("illegal keysize in AES");
        }
        return new C6456l1ilL(llLI1);
    }
}
