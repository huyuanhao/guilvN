package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i111I */
public class i111I {
    public static final int OooO00o = 12287;
    public static final int OooO0O0 = 18;
    public static final int OooO0OO = 262143;

    public static short OooO00o(int i) {
        return (short) (((((i * OooO00o) & OooO0OO) * 12289) + i) >>> 18);
    }

    public static short OooO00o(short s) {
        int i = s & UShort.OooO0OO;
        return (short) (i - (((i * 5) >>> 16) * 12289));
    }
}
