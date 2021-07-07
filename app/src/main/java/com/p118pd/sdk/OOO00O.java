package com.p118pd.sdk;

import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.OOO00O */
public class OOO00O extends C8282oOo000oO {
    @InlineOnly
    public static final String OooO00o(char c, String str) {
        return String.valueOf(c) + str;
    }

    public static final boolean OooOOOO(char c) {
        return 55296 <= c && 57343 >= c;
    }

    public static /* synthetic */ boolean OooO00o(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO00o(c, c2, z);
    }

    public static final boolean OooO00o(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
