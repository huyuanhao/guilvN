package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨LiIl  reason: invalid class name and case insensitive filesystem */
public final class C9823LiIl {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);

    public static l11ILi OooO00o(int i, int i2, byte[] bArr) {
        if (i >= i2) {
            BigInteger OooO00o2 = C6356i1IiI1.m17450OooO00o(i, i2);
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(OooO00o2) < 0) {
                l11ILi l11ili = new l11ILi(i);
                int i3 = i;
                for (int i4 = 0; i4 < i; i4++) {
                    OooO00o2 = OooO00o2.multiply(BigInteger.valueOf((long) (i3 - i2))).divide(BigInteger.valueOf((long) i3));
                    i3--;
                    if (OooO00o2.compareTo(bigInteger) <= 0) {
                        l11ili.m17551OooO00o(i4);
                        bigInteger = bigInteger.subtract(OooO00o2);
                        i2--;
                        OooO00o2 = i3 == i2 ? OooO0O0 : OooO00o2.multiply(BigInteger.valueOf((long) (i2 + 1))).divide(BigInteger.valueOf((long) (i3 - i2)));
                    }
                }
                return l11ili;
            }
            throw new IllegalArgumentException("Encoded number too large.");
        }
        throw new IllegalArgumentException("n < t");
    }

    public static byte[] OooO00o(int i, int i2, l11ILi l11ili) {
        if (l11ili.OooO00o() == i && l11ili.OooO0O0() == i2) {
            int[] OooO00o2 = l11ili.m17553OooO00o();
            BigInteger OooO00o3 = C6356i1IiI1.m17450OooO00o(i, i2);
            BigInteger bigInteger = OooO00o;
            int i3 = i;
            for (int i4 = 0; i4 < i; i4++) {
                OooO00o3 = OooO00o3.multiply(BigInteger.valueOf((long) (i3 - i2))).divide(BigInteger.valueOf((long) i3));
                i3--;
                if ((OooO00o2[i4 >> 5] & (1 << (i4 & 31))) != 0) {
                    bigInteger = bigInteger.add(OooO00o3);
                    i2--;
                    OooO00o3 = i3 == i2 ? OooO0O0 : OooO00o3.multiply(BigInteger.valueOf((long) (i2 + 1))).divide(BigInteger.valueOf((long) (i3 - i2)));
                }
            }
            return C5796Lli.OooO00o(bigInteger);
        }
        throw new IllegalArgumentException("vector has wrong length or hamming weight");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21910OooO00o(int i, int i2, byte[] bArr) {
        if (i >= i2) {
            BigInteger OooO00o2 = C6356i1IiI1.m17450OooO00o(i, i2);
            int bitLength = OooO00o2.bitLength() - 1;
            int i3 = bitLength >> 3;
            int i4 = bitLength & 7;
            int i5 = 8;
            if (i4 == 0) {
                i3--;
                i4 = 8;
            }
            int i6 = i >> 3;
            int i7 = i & 7;
            if (i7 == 0) {
                i6--;
            } else {
                i5 = i7;
            }
            int i8 = i6 + 1;
            byte[] bArr2 = new byte[i8];
            if (bArr.length < i8) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                for (int length = bArr.length; length < i8; length++) {
                    bArr2[length] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, i6);
                bArr2[i6] = (byte) (bArr[i6] & ((1 << i5) - 1));
            }
            BigInteger bigInteger = OooO00o;
            int i9 = i;
            for (int i10 = 0; i10 < i; i10++) {
                OooO00o2 = OooO00o2.multiply(new BigInteger(Integer.toString(i9 - i2))).divide(new BigInteger(Integer.toString(i9)));
                i9--;
                if (((byte) (bArr2[i10 >>> 3] & (1 << (i10 & 7)))) != 0) {
                    bigInteger = bigInteger.add(OooO00o2);
                    i2--;
                    OooO00o2 = i9 == i2 ? OooO0O0 : OooO00o2.multiply(new BigInteger(Integer.toString(i2 + 1))).divide(new BigInteger(Integer.toString(i9 - i2)));
                }
            }
            int i11 = i3 + 1;
            byte[] bArr3 = new byte[i11];
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length < i11) {
                System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
                for (int length2 = byteArray.length; length2 < i11; length2++) {
                    bArr3[length2] = 0;
                }
            } else {
                System.arraycopy(byteArray, 0, bArr3, 0, i3);
                bArr3[i3] = (byte) (((1 << i4) - 1) & byteArray[i3]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("n < t");
    }
}
