package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lLI11I丨  reason: invalid class name and case insensitive filesystem */
public class C6570lLI11I {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);

    public static BigInteger OooO00o(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, AbstractC6436l11LI r9) {
        byte[] OooO00o2 = OooO00o(bigInteger5, r9);
        C6383iLl1 r0 = new C6383iLl1(r9);
        byte[] bArr = new byte[r0.OooO00o()];
        r0.OooO00o(new C6642li1LI(OooO00o2));
        OooO00o((AbstractC6769llL1L) r0, "KC_1_U");
        OooO00o((AbstractC6769llL1L) r0, str);
        OooO00o((AbstractC6769llL1L) r0, str2);
        OooO00o(r0, bigInteger);
        OooO00o(r0, bigInteger2);
        OooO00o(r0, bigInteger3);
        OooO00o(r0, bigInteger4);
        r0.OooO00o(bArr, 0);
        C9586iIILl.OooO00o(OooO00o2, (byte) 0);
        return new BigInteger(bArr);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, AbstractC6436l11LI r4) {
        r4.reset();
        OooO0O0(r4, bigInteger);
        OooO0O0(r4, bigInteger2);
        OooO0O0(r4, bigInteger3);
        OooO0O0(r4, str);
        byte[] bArr = new byte[r4.OooO0O0()];
        r4.OooO00o(bArr, 0);
        return new BigInteger(bArr);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return bigInteger3.modPow(bigInteger4, bigInteger);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6) {
        return bigInteger3.modPow(bigInteger4.multiply(bigInteger5).negate().mod(bigInteger2), bigInteger).multiply(bigInteger6).modPow(bigInteger4, bigInteger);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        return IIiL.OooO00o(OooO00o, bigInteger.subtract(OooO0O0), secureRandom);
    }

    public static BigInteger OooO00o(char[] cArr) {
        return new BigInteger(Strings.OooO0O0(cArr));
    }

    public static void OooO00o(AbstractC6436l11LI r2, String str) {
        byte[] OooO0O02 = Strings.m22987OooO0O0(str);
        r2.update(OooO0O02, 0, OooO0O02.length);
        C9586iIILl.OooO00o(OooO0O02, (byte) 0);
    }

    public static void OooO00o(AbstractC6436l11LI r2, BigInteger bigInteger) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        r2.update(OooO00o2, 0, OooO00o2.length);
        C9586iIILl.OooO00o(OooO00o2, (byte) 0);
    }

    public static void OooO00o(AbstractC6769llL1L lll1l, String str) {
        byte[] OooO0O02 = Strings.m22987OooO0O0(str);
        lll1l.update(OooO0O02, 0, OooO0O02.length);
        C9586iIILl.OooO00o(OooO0O02, (byte) 0);
    }

    public static void OooO00o(AbstractC6769llL1L lll1l, BigInteger bigInteger) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        lll1l.update(OooO00o2, 0, OooO00o2.length);
        C9586iIILl.OooO00o(OooO00o2, (byte) 0);
    }

    public static void OooO00o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str + " must not be null");
        }
    }

    public static void OooO00o(String str, String str2) throws CryptoException {
        if (str.equals(str2)) {
            throw new CryptoException("Both participants are using the same participantId (" + str + "). This is not allowed. Each participant must use a unique participantId.");
        }
    }

    public static void OooO00o(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, AbstractC6436l11LI r15, BigInteger bigInteger6) throws CryptoException {
        if (!OooO00o(str2, str, bigInteger3, bigInteger4, bigInteger, bigInteger2, bigInteger5, r15).equals(bigInteger6)) {
            throw new CryptoException("Partner MacTag validation failed. Therefore, the password, MAC, or digest algorithm of each participant does not match.");
        }
    }

    public static void OooO00o(BigInteger bigInteger) throws CryptoException {
        if (bigInteger.equals(OooO0O0)) {
            throw new CryptoException("ga is equal to 1.  It should not be.  The chances of this happening are on the order of 2^160 for a 160-bit q.  Try again.");
        }
    }

    public static void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger[] bigIntegerArr, String str, AbstractC6436l11LI r8) throws CryptoException {
        BigInteger bigInteger5 = bigIntegerArr[0];
        BigInteger bigInteger6 = bigIntegerArr[1];
        BigInteger OooO00o2 = OooO00o(bigInteger3, bigInteger5, bigInteger4, str, r8);
        if (bigInteger4.compareTo(OooO00o) != 1 || bigInteger4.compareTo(bigInteger) != -1 || bigInteger4.modPow(bigInteger2, bigInteger).compareTo(OooO0O0) != 0 || bigInteger3.modPow(bigInteger6, bigInteger).multiply(bigInteger4.modPow(OooO00o2, bigInteger)).mod(bigInteger).compareTo(bigInteger5) != 0) {
            throw new CryptoException("Zero-knowledge proof validation failed");
        }
    }

    public static byte[] OooO00o(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public static byte[] OooO00o(BigInteger bigInteger, AbstractC6436l11LI r2) {
        r2.reset();
        OooO00o(r2, bigInteger);
        OooO00o(r2, "JPAKE_KC");
        byte[] bArr = new byte[r2.OooO0O0()];
        r2.OooO00o(bArr, 0);
        return bArr;
    }

    public static BigInteger[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, String str, AbstractC6436l11LI r9, SecureRandom secureRandom) {
        BigInteger OooO00o2 = IIiL.OooO00o(OooO00o, bigInteger2.subtract(OooO0O0), secureRandom);
        BigInteger modPow = bigInteger3.modPow(OooO00o2, bigInteger);
        return new BigInteger[]{modPow, OooO00o2.subtract(bigInteger5.multiply(OooO00o(bigInteger3, modPow, bigInteger4, str, r9))).mod(bigInteger2)};
    }

    public static BigInteger OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger3).mod(bigInteger);
    }

    public static BigInteger OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return bigInteger2.multiply(bigInteger3).multiply(bigInteger4).mod(bigInteger);
    }

    public static BigInteger OooO0O0(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = OooO0O0;
        return IIiL.OooO00o(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    public static void OooO0O0(AbstractC6436l11LI r3, String str) {
        byte[] OooO0O02 = Strings.m22987OooO0O0(str);
        r3.update(OooO00o(OooO0O02.length), 0, 4);
        r3.update(OooO0O02, 0, OooO0O02.length);
        C9586iIILl.OooO00o(OooO0O02, (byte) 0);
    }

    public static void OooO0O0(AbstractC6436l11LI r3, BigInteger bigInteger) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        r3.update(OooO00o(OooO00o2.length), 0, 4);
        r3.update(OooO00o2, 0, OooO00o2.length);
        C9586iIILl.OooO00o(OooO00o2, (byte) 0);
    }

    public static void OooO0O0(String str, String str2) throws CryptoException {
        if (!str.equals(str2)) {
            throw new CryptoException("Received payload from incorrect partner (" + str2 + "). Expected to receive payload from " + str + C9058ooOoOoOO.OooOO0);
        }
    }

    public static void OooO0O0(BigInteger bigInteger) throws CryptoException {
        if (bigInteger.equals(OooO0O0)) {
            throw new CryptoException("g^x validation failed.  g^x should not be 1.");
        }
    }
}
