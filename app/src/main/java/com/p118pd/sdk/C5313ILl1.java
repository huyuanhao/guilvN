package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ILl1  reason: case insensitive filesystem */
public class C5313ILl1 {
    public static IL1i1 OooO00o(String str) {
        C5600L1iLL OooO00o = C6723lilIL.OooO00o(str);
        if (OooO00o == null) {
            try {
                OooO00o = C6723lilIL.OooO00o(new LlLI1(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (OooO00o == null) {
            return null;
        }
        return new IL1i1(str, OooO00o.OooO00o(), OooO00o.m16003OooO00o(), OooO00o.OooO0OO(), OooO00o.m16004OooO00o(), OooO00o.m16005OooO00o());
    }

    public static Enumeration OooO00o() {
        return C6723lilIL.OooO00o();
    }
}
