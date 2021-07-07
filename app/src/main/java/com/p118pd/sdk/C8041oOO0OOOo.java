package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOO0OOOo  reason: case insensitive filesystem */
public class C8041oOO0OOOo {
    public static Long OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21065OooO00o = "mdir";
    public static Long OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21066OooO0O0 = "mdta";
    public static Long OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21067OooO0OO = "soun";
    public static Long OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21068OooO0Oo = "vide";
    public static final String OooO0o = "text";
    public static final String OooO0o0 = "tmcd";
    public static final String OooO0oO = "sbtl";
    public static final String OooO0oo = "musi";

    /* renamed from: OooO00o  reason: collision with other field name */
    public oO0OO0O f21069OooO00o;

    public C8041oOO0OOOo(oO0OO0O oo0oo0o) {
        this.f21069OooO00o = oo0oo0o;
    }

    public oO0OO0O OooO00o(String str, C7925oO0o0OO0 oo0o0oo0) {
        if (str.equals(f21065OooO00o)) {
            return new C8083oOO0oooO(oo0o0oo0);
        }
        if (str.equals(f21066OooO0O0)) {
            return new C8081oOO0ooo(oo0o0oo0);
        }
        if (str.equals("soun")) {
            return new C8069oOO0oOOo(oo0o0oo0);
        }
        if (str.equals("vide")) {
            return new C8082oOO0ooo0(oo0o0oo0);
        }
        if (str.equals(OooO0o0)) {
            return new C8078oOO0ooO0(oo0o0oo0);
        }
        if (str.equals("text")) {
            return new C8076oOO0oo0O(oo0o0oo0);
        }
        if (str.equals("sbtl")) {
            return new C8072oOO0oOoo(oo0o0oo0);
        }
        if (str.equals(OooO0oo)) {
            return new C8067oOO0oOO0(oo0o0oo0);
        }
        return this.f21069OooO00o;
    }
}
