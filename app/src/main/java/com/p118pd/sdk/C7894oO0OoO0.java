package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oO0OoO0  reason: case insensitive filesystem */
public class C7894oO0OoO0 {
    public static int[] OooO00o = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean OooO00o(int i, int i2, int i3) {
        if (i < 1 || i > 9999 || i2 < 0 || i2 > 11) {
            return false;
        }
        int i4 = OooO00o[i2];
        if (i2 == 1) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                i4++;
            }
        }
        if (i3 < 1 || i3 > i4) {
            return false;
        }
        return true;
    }

    public static boolean OooO0O0(int i, int i2, int i3) {
        return i >= 0 && i < 24 && i2 >= 0 && i2 < 60 && i3 >= 0 && i3 < 60;
    }
}
