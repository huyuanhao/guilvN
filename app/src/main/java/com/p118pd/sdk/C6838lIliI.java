package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨Il丨iI  reason: invalid class name and case insensitive filesystem */
public class C6838lIliI extends C6513lIiI {
    public static final C6838lIliI OooO00o = new C6838lIliI(0);
    public static final C6838lIliI OooO0O0 = new C6838lIliI(1);

    public C6838lIliI(int i) {
        super((long) i);
    }

    public static C6838lIliI OooO00o(int i) {
        if (i == 0) {
            return OooO00o;
        }
        if (i == 1) {
            return OooO0O0;
        }
        throw new IllegalArgumentException("unknown value: " + i);
    }
}
