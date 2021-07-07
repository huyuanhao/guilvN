package com.tencent.bugly.proguard;

import com.p118pd.sdk.C8027oOO00oo;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.bugly.proguard.n */
public final class C3358n {

    /* renamed from: a */
    public static final byte[] f8226a;

    /* renamed from: b */
    public static final byte[] f8227b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        f8226a = bArr2;
        f8227b = bArr3;
    }

    /* renamed from: a */
    public static boolean m8589a(byte b, byte b2) {
        return b == b2;
    }

    /* renamed from: a */
    public static boolean m8590a(int i, int i2) {
        return i == i2;
    }

    /* renamed from: a */
    public static boolean m8591a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: a */
    public static boolean m8592a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m8593a(boolean z, boolean z2) {
        return z == z2;
    }

    /* renamed from: a */
    public static byte[] m8594a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}
