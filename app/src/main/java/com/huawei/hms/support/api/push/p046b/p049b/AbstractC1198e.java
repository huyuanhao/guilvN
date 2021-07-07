package com.huawei.hms.support.api.push.p046b.p049b;

import com.huawei.hms.support.api.push.p046b.p047a.p048a.AbstractC1189a;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1190b;

/* renamed from: com.huawei.hms.support.api.push.b.b.e */
public abstract class AbstractC1198e {
    /* renamed from: a */
    public static byte[] m1300a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        if (length != bArr2.length) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: b */
    public static String m1301b() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    /* renamed from: a */
    public static byte[] m1299a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] >> 2);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m1298a() {
        byte[] b = AbstractC1189a.m1273b(C1190b.m1274a());
        byte[] b2 = AbstractC1189a.m1273b(C1195b.m1293a());
        return m1299a(m1300a(m1300a(b, b2), AbstractC1189a.m1273b(m1301b())));
    }
}
