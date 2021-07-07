package com.huawei.updatesdk.sdk.p062a.p069d;

import java.io.UnsupportedEncodingException;

/* renamed from: com.huawei.updatesdk.sdk.a.d.b */
public class C1281b {

    /* renamed from: a */
    public byte[] f1430a;

    /* renamed from: b */
    public int f1431b;

    /* renamed from: c */
    public int f1432c;

    public C1281b() {
        this.f1430a = null;
        this.f1431b = 1024;
        this.f1432c = 0;
        this.f1430a = new byte[1024];
    }

    /* renamed from: a */
    public static String m1589a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    public String mo15892a() {
        if (this.f1432c <= 0) {
            return null;
        }
        try {
            return new String(this.f1430a, 0, this.f1432c, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo15893a(byte[] bArr, int i) {
        if (i > 0) {
            byte[] bArr2 = this.f1430a;
            int length = bArr2.length;
            int i2 = this.f1432c;
            if (length - i2 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                byte[] bArr3 = new byte[((bArr2.length + i) << 1)];
                System.arraycopy(bArr2, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr3, this.f1432c, i);
                this.f1430a = bArr3;
            }
            this.f1432c += i;
        }
    }
}
