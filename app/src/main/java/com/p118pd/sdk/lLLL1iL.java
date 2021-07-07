package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lL丨LL1iL  reason: invalid class name */
public abstract class lLLL1iL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18571OooO00o;
    public byte[] OooO0O0;

    public static byte[] OooO00o(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((cArr.length + 1) * 2)];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) (cArr[i] >>> '\b');
            bArr[i2 + 1] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] OooO0O0(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] OooO0OO(char[] cArr) {
        return cArr != null ? Strings.OooO0O0(cArr) : new byte[0];
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    public abstract AbstractC6370iIIIl OooO00o(int i);

    public abstract AbstractC6370iIIIl OooO00o(int i, int i2);

    public void OooO00o(byte[] bArr, byte[] bArr2, int i) {
        this.f18571OooO00o = bArr;
        this.OooO0O0 = bArr2;
        this.OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17715OooO00o() {
        return this.f18571OooO00o;
    }

    public abstract AbstractC6370iIIIl OooO0O0(int i);

    public byte[] OooO0O0() {
        return this.OooO0O0;
    }
}
