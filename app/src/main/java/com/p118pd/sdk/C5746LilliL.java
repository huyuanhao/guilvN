package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LilliL  reason: case insensitive filesystem */
public class C5746LilliL {
    public static int OooO00o(int i) {
        if (i <= 1024) {
            return 80;
        }
        return (((i - 1) / 1024) * 16) + 96;
    }
}
