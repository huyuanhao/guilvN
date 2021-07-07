package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;

/* renamed from: com.pd.sdk.o0OOo0oO  reason: case insensitive filesystem */
public class C7425o0OOo0oO {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 11;

    public static C7421o0OOo0OO OooO00o(C7421o0OOo0OO o0ooo0oo) {
        if (!"UTF-8".equals(o0ooo0oo.m18989OooO00o())) {
            return o0ooo0oo;
        }
        byte[] bArr = new byte[8];
        C7421o0OOo0OO o0ooo0oo2 = new C7421o0OOo0OO((o0ooo0oo.OooO00o() * 4) / 3);
        int i = 0;
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < o0ooo0oo.OooO00o()) {
            int OooO00o2 = o0ooo0oo.m18987OooO00o(i);
            if (c == 11) {
                if (i2 <= 0 || (OooO00o2 & 192) != 128) {
                    o0ooo0oo2.OooO00o(OooO00o(bArr[0]));
                    i -= i3;
                } else {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) OooO00o2;
                    i2--;
                    if (i2 == 0) {
                        o0ooo0oo2.OooO00o(bArr, 0, i4);
                    } else {
                        i3 = i4;
                    }
                }
                c = 0;
                i3 = 0;
            } else if (OooO00o2 < 127) {
                o0ooo0oo2.OooO00o((byte) OooO00o2);
            } else if (OooO00o2 >= 192) {
                int i5 = OooO00o2;
                i2 = -1;
                while (i2 < 8 && (i5 & 128) == 128) {
                    i2++;
                    i5 <<= 1;
                }
                bArr[i3] = (byte) OooO00o2;
                i3++;
                c = 11;
            } else {
                o0ooo0oo2.OooO00o(OooO00o((byte) OooO00o2));
            }
            i++;
        }
        if (c == 11) {
            for (int i6 = 0; i6 < i3; i6++) {
                o0ooo0oo2.OooO00o(OooO00o(bArr[i6]));
            }
        }
        return o0ooo0oo2;
    }

    public static byte[] OooO00o(byte b) {
        int i = b & 255;
        if (i >= 128) {
            if (i == 129 || i == 141 || i == 143 || i == 144 || i == 157) {
                return new byte[]{32};
            }
            try {
                return new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }
}
