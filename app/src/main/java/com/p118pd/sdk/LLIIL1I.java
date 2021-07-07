package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLIIL1I */
public final class LLIIL1I {
    public LLIIL1I() {
        throw new IllegalStateException("No instances!");
    }

    public static int OooO00o(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16189OooO00o(int i) {
        return (i & (i + -1)) == 0;
    }
}
