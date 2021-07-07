package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOOO00o0  reason: case insensitive filesystem */
public class C8093oOOO00o0 {
    public static Long OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21097OooO00o = "soun";
    public static Long OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21098OooO0O0 = "vide";
    public static Long OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21099OooO0OO = "hint";
    public static Long OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21100OooO0Oo = "text";
    public static String OooO0o = null;
    public static final String OooO0o0 = "meta";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7854oO0O0oOO f21101OooO00o;

    public C8093oOOO00o0(AbstractC7854oO0O0oOO oo0o0ooo) {
        this.f21101OooO00o = oo0o0ooo;
    }

    public AbstractC7854oO0O0oOO OooO00o(C8097oOOO0O0o oooo0o0o, C7925oO0o0OO0 oo0o0oo0) {
        String OooO00o2 = oooo0o0o.OooO00o();
        if (OooO00o2.equals("soun")) {
            return new C8110oOOO0oo(oo0o0oo0);
        }
        if (OooO00o2.equals("vide")) {
            return new oOOOO00O(oo0o0oo0);
        }
        if (OooO00o2.equals(f21099OooO0OO)) {
            return new C8123oOOOOO(oo0o0oo0);
        }
        if (OooO00o2.equals("text")) {
            return new oOOOO000(oo0o0oo0);
        }
        if (OooO00o2.equals("meta")) {
            return new C8113oOOO0ooo(oo0o0oo0);
        }
        return this.f21101OooO00o;
    }
}
