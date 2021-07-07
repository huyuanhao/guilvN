package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IIiL */
public final class IIiL {
    public static final int OooO00o = 1000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BigInteger f15492OooO00o = BigInteger.valueOf(0);

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        } else if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return OooO00o(f15492OooO00o, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        } else {
            for (int i = 0; i < 1000; i++) {
                BigInteger bigInteger3 = new BigInteger(bigInteger2.bitLength(), secureRandom);
                if (bigInteger3.compareTo(bigInteger) >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                    return bigInteger3;
                }
            }
            return new BigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
        }
    }

    public static BigInteger OooO00o(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static BigInteger OooO00o(byte[] bArr, int i, int i2) {
        if (!(i == 0 && i2 == bArr.length)) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static byte[] OooO00o(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, i - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static byte[] OooO00o(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
