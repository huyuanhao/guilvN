package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0OOOOO */
public class o0OOOOO {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m18939OooO00o(byte[] bArr, String str) {
        int length = bArr.length;
        int length2 = str.length();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ str.charAt(i % length2));
        }
        return bArr;
    }

    public static String OooO00o(byte[] bArr, String str) {
        int length = bArr.length;
        int length2 = str.length();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ str.charAt(i % length2));
        }
        return new String(bArr);
    }
}
