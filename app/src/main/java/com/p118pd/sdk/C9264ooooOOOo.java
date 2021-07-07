package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooooOOOo  reason: case insensitive filesystem */
public class C9264ooooOOOo {
    public static final int OooO = 8448;
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22646OooO00o = "jni";
    public static final int OooO0O0 = 16;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f22647OooO0O0 = "java";
    public static final int OooO0OO = 256;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f22648OooO0OO = "anr";
    public static final int OooO0Oo = 1048576;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f22649OooO0Oo = "unexp";
    public static final int OooO0o = 1280;
    public static final int OooO0o0 = 768;
    public static final int OooO0oO = 2304;
    public static final int OooO0oo = 4352;
    public static final int OooOO0 = 16640;
    public static final int OooOO0O = 32000;
    public static final int OooOO0o = 32512;

    public static int OooO00o(int i, int i2) {
        return (i | i2) & 1048849;
    }

    public static boolean OooO00o(int i) {
        return (i & 1048576) != 0;
    }

    public static int OooO0O0(int i, int i2) {
        return i & ((i2 & 1048849) ^ -1);
    }

    public static boolean OooO0O0(int i) {
        return (i & 16) != 0;
    }

    public static boolean OooO0OO(int i) {
        return (i & 1) != 0;
    }

    public static boolean OooO0Oo(int i) {
        return (i & 256) != 0;
    }
}
