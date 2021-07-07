package com.umeng.message.proguard;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: com.umeng.message.proguard.g */
public class C3818g {

    /* renamed from: a */
    public static int f10345a;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10536a(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
        /*
            boolean r0 = com.umeng.message.proguard.C3819h.m10566d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>()
            byte[] r4 = r4.getBytes(r5)
            r0.setInput(r4)
            r0.finish()
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]
            r5 = 0
            com.umeng.message.proguard.C3818g.f10345a = r5
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0023:
            boolean r1 = r0.finished()     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0036
            int r1 = r0.deflate(r4)     // Catch:{ all -> 0x0041 }
            int r3 = com.umeng.message.proguard.C3818g.f10345a     // Catch:{ all -> 0x0041 }
            int r3 = r3 + r1
            com.umeng.message.proguard.C3818g.f10345a = r3     // Catch:{ all -> 0x0041 }
            r2.write(r4, r5, r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0023
        L_0x0036:
            r0.end()     // Catch:{ all -> 0x0041 }
            r2.close()
            byte[] r4 = r2.toByteArray()
            return r4
        L_0x0041:
            r4 = move-exception
            r1 = r2
            goto L_0x0045
        L_0x0044:
            r4 = move-exception
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            goto L_0x004c
        L_0x004b:
            throw r4
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3818g.m10536a(java.lang.String, java.lang.String):byte[]");
    }

    /* renamed from: a */
    public static String m10535a(byte[] bArr, String str) throws UnsupportedEncodingException, DataFormatException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Inflater inflater = new Inflater();
        byte[] bArr2 = new byte[100];
        inflater.setInput(bArr, 0, bArr.length);
        StringBuilder sb = new StringBuilder();
        while (!inflater.needsInput()) {
            sb.append(new String(bArr2, 0, inflater.inflate(bArr2), str));
        }
        inflater.end();
        return sb.toString();
    }
}
