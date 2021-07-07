package com.p118pd.sdk;

import java.util.Hashtable;

/* renamed from: com.pd.sdk.丨Lii1L  reason: invalid class name and case insensitive filesystem */
public class C9510Lii1L {
    public static final Hashtable OooO00o;

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put(LL1i.OooO0O0, I11I.OooO00o(128));
        OooO00o.put(LL1i.OooO0OO, I11I.OooO00o(192));
        OooO00o.put(LL1i.OooO0Oo, I11I.OooO00o(256));
        OooO00o.put(LL1i.f16409OooO0o0, I11I.OooO00o(256));
        OooO00o.put(LL1i.f16408OooO0o, I11I.OooO00o(256));
        OooO00o.put("SHA-512/224", I11I.OooO00o(192));
        OooO00o.put("SHA-512/256", I11I.OooO00o(256));
    }

    public static int OooO00o(AbstractC6436l11LI r1) {
        return ((Integer) OooO00o.get(r1.OooO00o())).intValue();
    }

    public static int OooO00o(AbstractC6769llL1L lll1l) {
        String OooO00o2 = lll1l.m17871OooO00o();
        return ((Integer) OooO00o.get(OooO00o2.substring(0, OooO00o2.indexOf(C8932ooOOO0o.OooO0OO)))).intValue();
    }

    public static boolean OooO00o(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    public static byte[] OooO00o(AbstractC6436l11LI r10, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int OooO0O0 = i2 / r10.OooO0O0();
        int OooO0O02 = r10.OooO0O0();
        byte[] bArr3 = new byte[OooO0O02];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= OooO0O0; i5++) {
            r10.update((byte) i3);
            r10.update((byte) (i >> 24));
            r10.update((byte) (i >> 16));
            r10.update((byte) (i >> 8));
            r10.update((byte) i);
            r10.update(bArr, 0, bArr.length);
            r10.OooO00o(bArr3, 0);
            int i6 = i5 * OooO0O02;
            int i7 = i2 - i6;
            if (i7 > OooO0O02) {
                i7 = OooO0O02;
            }
            System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }
}
