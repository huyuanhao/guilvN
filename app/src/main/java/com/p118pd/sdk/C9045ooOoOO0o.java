package com.p118pd.sdk;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.pd.sdk.ooOoOO0o  reason: case insensitive filesystem */
public class C9045ooOoOO0o {
    public static MessageDigest OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final char[] f22353OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        OooO00o = null;
        try {
            OooO00o = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC, Splitter:B:30:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065 A[SYNTHETIC, Splitter:B:37:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f A[SYNTHETIC, Splitter:B:42:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.io.File r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9045ooOoOO0o.OooO00o(java.io.File):java.lang.String");
    }

    public static String OooO0O0(String str) {
        return OooO0O0(str.getBytes());
    }

    public static String OooO0O0(byte[] bArr) {
        OooO00o.update(bArr);
        return OooO00o(OooO00o.digest());
    }

    public static String OooO00o(String str) {
        return OooO00o(new File(str));
    }

    public static boolean OooO00o(File file, String str) {
        return OooO00o(file).equalsIgnoreCase(str);
    }

    public static boolean OooO00o(String str, String str2) {
        return OooO00o(new File(str), str2);
    }

    public static String OooO00o(byte[] bArr) {
        return OooO00o(bArr, 0, bArr.length);
    }

    public static String OooO00o(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            sb.append(OooO00o(bArr[i3]));
        }
        return sb.toString();
    }

    public static String OooO00o(byte b) {
        return f22353OooO00o[(b & 240) >> 4] + "" + f22353OooO00o[b & 15];
    }
}
