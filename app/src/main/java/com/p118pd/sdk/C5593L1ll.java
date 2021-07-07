package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1ll丨  reason: invalid class name and case insensitive filesystem */
public final class C5593L1ll {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f16225OooO00o;
    public static final int OooO0O0;

    static {
        int OooO0O02 = OooO0O0();
        OooO0O0 = OooO0O02;
        f16225OooO00o = OooO0O02 != 0;
    }

    public C5593L1ll() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15992OooO00o() {
        return f16225OooO00o;
    }

    public static int OooO0O0() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int OooO00o() {
        return OooO0O0;
    }
}
