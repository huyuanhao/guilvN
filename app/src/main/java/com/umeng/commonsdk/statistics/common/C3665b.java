package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: com.umeng.commonsdk.statistics.common.b */
public class C3665b {

    /* renamed from: a */
    public static int f9591a;

    /* renamed from: a */
    public static byte[] m9856a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m9857a(str.getBytes(str2));
    }

    /* renamed from: b */
    public static byte[] m9858b(byte[] bArr) throws UnsupportedEncodingException, DataFormatException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Inflater inflater = new Inflater();
        int i = 0;
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (!inflater.needsInput()) {
            int inflate = inflater.inflate(bArr2);
            byteArrayOutputStream.write(bArr2, i, inflate);
            i += inflate;
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m9857a(byte[] r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0046
            int r1 = r5.length
            if (r1 > 0) goto L_0x0007
            goto L_0x0046
        L_0x0007:
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r5)
            r1.finish()
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]
            r2 = 0
            com.umeng.commonsdk.statistics.common.C3665b.f9591a = r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
        L_0x001e:
            boolean r0 = r1.finished()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0031
            int r0 = r1.deflate(r5)     // Catch:{ all -> 0x003c }
            int r4 = com.umeng.commonsdk.statistics.common.C3665b.f9591a     // Catch:{ all -> 0x003c }
            int r4 = r4 + r0
            com.umeng.commonsdk.statistics.common.C3665b.f9591a = r4     // Catch:{ all -> 0x003c }
            r3.write(r5, r2, r0)     // Catch:{ all -> 0x003c }
            goto L_0x001e
        L_0x0031:
            r1.end()     // Catch:{ all -> 0x003c }
            r3.close()
            byte[] r5 = r3.toByteArray()
            return r5
        L_0x003c:
            r5 = move-exception
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r5 = move-exception
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()
        L_0x0045:
            throw r5
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.C3665b.m9857a(byte[]):byte[]");
    }

    /* renamed from: a */
    public static String m9855a(byte[] bArr, String str) throws UnsupportedEncodingException, DataFormatException {
        byte[] b = m9858b(bArr);
        if (b != null) {
            return new String(b, str);
        }
        return null;
    }
}
