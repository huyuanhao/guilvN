package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.LLII */
public class LLII {
    public static BigInteger OooO00o = BigInteger.valueOf(0);
    public static BigInteger OooO0O0 = BigInteger.valueOf(1);

    public static BigInteger OooO00o(AbstractC6436l11LI r0, BigInteger bigInteger, BigInteger bigInteger2) {
        return OooO0O0(r0, bigInteger, bigInteger, bigInteger2);
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r0, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return OooO0O0(r0, bigInteger, bigInteger2, bigInteger3);
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r0, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return OooO0OO(r0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r0, BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return IIiL.OooO00o(OooO0O0.shiftLeft(Math.min(256, bigInteger.bitLength() / 2) - 1), bigInteger.subtract(OooO0O0), secureRandom);
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r3, BigInteger bigInteger, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int OooO0O02 = r3.OooO0O0();
        byte[] bArr4 = new byte[OooO0O02];
        r3.update(bArr2, 0, bArr2.length);
        r3.update((byte) 58);
        r3.update(bArr3, 0, bArr3.length);
        r3.OooO00o(bArr4, 0);
        r3.update(bArr, 0, bArr.length);
        r3.update(bArr4, 0, OooO0O02);
        r3.OooO00o(bArr4, 0);
        return new BigInteger(1, bArr4);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2) throws CryptoException {
        BigInteger mod = bigInteger2.mod(bigInteger);
        if (!mod.equals(OooO00o)) {
            return mod;
        }
        throw new CryptoException("Invalid public value: 0");
    }

    public static byte[] OooO00o(BigInteger bigInteger, int i) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        if (OooO00o2.length >= i) {
            return OooO00o2;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(OooO00o2, 0, bArr, i - OooO00o2.length, OooO00o2.length);
        return bArr;
    }

    public static BigInteger OooO0O0(AbstractC6436l11LI r1, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] OooO00o2 = OooO00o(bigInteger2, (bigInteger.bitLength() + 7) / 8);
        r1.update(OooO00o2, 0, OooO00o2.length);
        byte[] bArr = new byte[r1.OooO0O0()];
        r1.OooO00o(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger OooO0O0(AbstractC6436l11LI r1, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] OooO00o2 = OooO00o(bigInteger2, bitLength);
        byte[] OooO00o3 = OooO00o(bigInteger3, bitLength);
        r1.update(OooO00o2, 0, OooO00o2.length);
        r1.update(OooO00o3, 0, OooO00o3.length);
        byte[] bArr = new byte[r1.OooO0O0()];
        r1.OooO00o(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger OooO0O0(AbstractC6436l11LI r0, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return OooO0OO(r0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger OooO0OO(AbstractC6436l11LI r1, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] OooO00o2 = OooO00o(bigInteger2, bitLength);
        byte[] OooO00o3 = OooO00o(bigInteger3, bitLength);
        byte[] OooO00o4 = OooO00o(bigInteger4, bitLength);
        r1.update(OooO00o2, 0, OooO00o2.length);
        r1.update(OooO00o3, 0, OooO00o3.length);
        r1.update(OooO00o4, 0, OooO00o4.length);
        byte[] bArr = new byte[r1.OooO0O0()];
        r1.OooO00o(bArr, 0);
        return new BigInteger(1, bArr);
    }
}
