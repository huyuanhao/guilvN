package com.p118pd.sdk;

import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0o00OO0  reason: case insensitive filesystem */
public final class C7557o0o00OO0 {
    public static String OooO00o(String str) {
        try {
            if (C7559o0o00OOo.m19210OooO00o(str)) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0O0);
            instance.update(str.getBytes("UTF-8"));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
