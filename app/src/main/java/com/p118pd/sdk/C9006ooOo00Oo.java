package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.ooOo00Oo  reason: case insensitive filesystem */
public class C9006ooOo00Oo {
    public static String OooO00o(byte[] bArr) {
        try {
            return C8870ooO0oO00.OooO0O0(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String OooO0O0(String str) {
        if (str == null || str.trim().length() < 1) {
            return null;
        }
        try {
            return OooO00o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r5) {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
        L_0x0015:
            int r5 = r3.read(r0)     // Catch:{ Exception -> 0x0034 }
            if (r5 <= 0) goto L_0x0020
            r4 = 0
            r2.update(r0, r4, r5)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0015
        L_0x0020:
            r3.close()     // Catch:{ Exception -> 0x0034 }
            byte[] r5 = r2.digest()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = com.p118pd.sdk.C8870ooO0oO00.OooO0O0(r5)     // Catch:{ Exception -> 0x0034 }
            r3.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x0042
        L_0x002f:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0042
        L_0x0034:
            r5 = move-exception
            goto L_0x003a
        L_0x0036:
            r5 = move-exception
            goto L_0x0045
        L_0x0038:
            r5 = move-exception
            r3 = r1
        L_0x003a:
            r5.printStackTrace()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            r3.close()
        L_0x0042:
            return r1
        L_0x0043:
            r5 = move-exception
            r1 = r3
        L_0x0045:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            goto L_0x0051
        L_0x0050:
            throw r5
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9006ooOo00Oo.OooO00o(java.lang.String):java.lang.String");
    }
}
