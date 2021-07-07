package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨ILlI  reason: invalid class name and case insensitive filesystem */
public final class C6831lILlI {
    public static int OooO00o(String str) {
        return (str.charAt(1) == 'x' || str.charAt(1) == 'X') ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str, 16);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m17965OooO00o(String str) {
        return (str.charAt(1) == 'x' || str.charAt(1) == 'X') ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str, 16);
    }
}
