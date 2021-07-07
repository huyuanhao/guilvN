package com.p118pd.sdk;

import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.ooOoOO00  reason: case insensitive filesystem */
public class C9043ooOoOO00 {
    public static boolean OooO00o(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}").matcher(str).matches();
    }
}
