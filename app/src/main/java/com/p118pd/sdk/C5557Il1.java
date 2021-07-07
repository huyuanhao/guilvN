package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨l1  reason: invalid class name and case insensitive filesystem */
public class C5557Il1 {
    public static byte[] OooO00o(AbstractC5552Iil r7, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= r7.OooO00o()) {
            System.arraycopy(r7.m15831OooO00o(), 0, bArr, 0, i);
        } else {
            int OooO00o = r7.OooO00o() / 8;
            for (int i2 = 0; i2 < i; i2 += OooO00o) {
                byte[] OooO00o2 = r7.m15831OooO00o();
                int i3 = i - i2;
                if (OooO00o2.length <= i3) {
                    System.arraycopy(OooO00o2, 0, bArr, i2, OooO00o2.length);
                } else {
                    System.arraycopy(OooO00o2, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }
}
