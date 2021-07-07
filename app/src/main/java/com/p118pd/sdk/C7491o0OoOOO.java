package com.p118pd.sdk;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.pd.sdk.o0OoOOO  reason: case insensitive filesystem */
public class C7491o0OoOOO {
    public static final String OooO00o = "RSA";

    public static PublicKey OooO00o(String str, String str2) throws NoSuchAlgorithmException, Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(C7490o0OoOO0o.OooO00o(str2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m19117OooO00o(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r6 = OooO00o(r1, r6)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            r2 = 1
            r1.init(r2, r6)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            int r6 = r1.getBlockSize()     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            r2.<init>()     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            r3 = 0
        L_0x0021:
            int r4 = r5.length     // Catch:{ Exception -> 0x0042 }
            if (r3 >= r4) goto L_0x0035
            int r4 = r5.length     // Catch:{ Exception -> 0x0042 }
            int r4 = r4 - r3
            if (r4 >= r6) goto L_0x002b
            int r4 = r5.length     // Catch:{ Exception -> 0x0042 }
            int r4 = r4 - r3
            goto L_0x002c
        L_0x002b:
            r4 = r6
        L_0x002c:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch:{ Exception -> 0x0042 }
            r2.write(r4)     // Catch:{ Exception -> 0x0042 }
            int r3 = r3 + r6
            goto L_0x0021
        L_0x0035:
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0050
        L_0x003d:
            r5 = move-exception
            com.p118pd.sdk.C7620o0oOOOoo.m19257OooO00o(r5)
            goto L_0x0050
        L_0x0042:
            r5 = move-exception
            goto L_0x0048
        L_0x0044:
            r5 = move-exception
            goto L_0x0053
        L_0x0046:
            r5 = move-exception
            r2 = r0
        L_0x0048:
            com.p118pd.sdk.C7620o0oOOOoo.m19257OooO00o(r5)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0050
            r2.close()
        L_0x0050:
            return r0
        L_0x0051:
            r5 = move-exception
            r0 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r6 = move-exception
            com.p118pd.sdk.C7620o0oOOOoo.m19257OooO00o(r6)
        L_0x005d:
            goto L_0x005f
        L_0x005e:
            throw r5
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7491o0OoOOO.m19117OooO00o(java.lang.String, java.lang.String):byte[]");
    }
}
