package com.qiyukf.basesdk.p138c.p142c;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: com.qiyukf.basesdk.c.c.c */
public final class C1852c {
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079 A[SYNTHETIC, Splitter:B:42:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081 A[Catch:{ Exception -> 0x007d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3510a(android.content.Context r7, android.net.Uri r8) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p142c.C1852c.m3510a(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    public static String m3511a(String str) {
        if (str == null || str.trim().length() <= 0) {
            return null;
        }
        try {
            return m3512a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static String m3512a(byte[] bArr) {
        try {
            return C1848a.m3506a(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3513b(java.lang.String r6) {
        /*
            java.lang.String r0 = "MD5"
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r2 = 0
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
        L_0x0015:
            int r6 = r4.read(r1)     // Catch:{ Exception -> 0x0034 }
            if (r6 <= 0) goto L_0x0020
            r5 = 0
            r3.update(r1, r5, r6)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0015
        L_0x0020:
            r4.close()     // Catch:{ Exception -> 0x0034 }
            byte[] r6 = r3.digest()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r2 = com.qiyukf.basesdk.p138c.p142c.C1848a.m3506a(r6)     // Catch:{ Exception -> 0x0034 }
            r4.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x0044
        L_0x002f:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0044
        L_0x0034:
            r6 = move-exception
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            goto L_0x0047
        L_0x0038:
            r6 = move-exception
            r4 = r2
        L_0x003a:
            java.lang.String r1 = "getStreamMD5 is error"
            com.qiyukf.basesdk.p119a.C1709a.m3015b(r0, r1, r6)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0044
            r4.close()
        L_0x0044:
            return r2
        L_0x0045:
            r6 = move-exception
            r2 = r4
        L_0x0047:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0051:
            goto L_0x0053
        L_0x0052:
            throw r6
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p142c.C1852c.m3513b(java.lang.String):java.lang.String");
    }
}
