package com.p118pd.sdk;

import com.bumptech.glide.load.engine.GlideException;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.p118pd.sdk.AbstractC97441iIIL;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.I1ii丨i  reason: invalid class name and case insensitive filesystem */
public class C5181I1iii {
    public static final int OooO00o = 16;

    public static BigInteger OooO00o(BigInteger bigInteger) {
        BigInteger shiftRight = bigInteger.shiftRight(bigInteger.bitLength() / 2);
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.equals(shiftRight)) {
                return shiftRight2;
            }
            shiftRight = shiftRight2;
        }
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() != bigInteger2.signum();
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        BigInteger divide = abs.add(abs2.shiftRight(1)).divide(abs2);
        return z ? divide.negate() : divide;
    }

    public static void OooO00o(C9387Iill r2) {
        if (r2 != null) {
            IIiLIli OooO00o2 = r2.OooO00o();
            if (Lii1I.OooO0O0(OooO00o2)) {
                BigInteger OooO00o3 = OooO00o2.m15391OooO00o().OooO00o();
                if (OooO00o2.m15394OooO00o().m21863OooO0O0() && OooO00o3.mod(AbstractC5490IlLL.OooO0Oo).equals(AbstractC5490IlLL.OooO0O0)) {
                    System.out.println("Curve has a 'GLV Type B' endomorphism with these parameters:");
                    OooO0O0(r2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("x9");
    }

    public static void OooO00o(C9387Iill r13, BigInteger bigInteger, AbstractC97441iIIL[] r15) {
        AbstractC9738llL1L OooO0Oo = r13.m21457OooO00o().OooO0Oo();
        AbstractC9738llL1L OooO0Oo2 = OooO0Oo.OooO00o(bigInteger).OooO0Oo();
        if (OooO0Oo.m21817OooO0o().equals(OooO0Oo2.m21817OooO0o())) {
            AbstractC97441iIIL r4 = r15[0];
            if (!OooO0Oo.m21819OooO0o0().OooO0OO(r4).equals(OooO0Oo2.m21819OooO0o0())) {
                r4 = r15[1];
                if (!OooO0Oo.m21819OooO0o0().OooO0OO(r4).equals(OooO0Oo2.m21819OooO0o0())) {
                    throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
                }
            }
            BigInteger OooO0O0 = r13.m21460OooO0O0();
            BigInteger[] OooO00o2 = m15297OooO00o(OooO0O0, bigInteger);
            BigInteger[] bigIntegerArr = {OooO00o2[2], OooO00o2[3].negate()};
            BigInteger[] OooO00o3 = m15299OooO00o(new BigInteger[]{OooO00o2[0], OooO00o2[1].negate()}, new BigInteger[]{OooO00o2[4], OooO00o2[5].negate()});
            if (!OooO00o(OooO00o3, OooO0O0) && m15296OooO00o(bigIntegerArr[0], bigIntegerArr[1])) {
                BigInteger bigInteger2 = bigIntegerArr[0];
                BigInteger bigInteger3 = bigIntegerArr[1];
                BigInteger divide = bigInteger2.add(bigInteger3.multiply(bigInteger)).divide(OooO0O0);
                BigInteger[] OooO00o4 = m15298OooO00o(new BigInteger[]{divide.abs(), bigInteger3.abs()});
                if (OooO00o4 != null) {
                    BigInteger bigInteger4 = OooO00o4[0];
                    BigInteger bigInteger5 = OooO00o4[1];
                    if (divide.signum() < 0) {
                        bigInteger4 = bigInteger4.negate();
                    }
                    if (bigInteger3.signum() > 0) {
                        bigInteger5 = bigInteger5.negate();
                    }
                    if (divide.multiply(bigInteger4).subtract(bigInteger3.multiply(bigInteger5)).equals(AbstractC5490IlLL.OooO0O0)) {
                        BigInteger subtract = bigInteger5.multiply(OooO0O0).subtract(bigInteger4.multiply(bigInteger));
                        BigInteger negate = bigInteger4.negate();
                        BigInteger negate2 = subtract.negate();
                        BigInteger add = OooO00o(OooO0O0.subtract(AbstractC5490IlLL.OooO0O0)).add(AbstractC5490IlLL.OooO0O0);
                        BigInteger[] OooO0O02 = OooO0O0(OooO00o(negate, add, bigInteger3), OooO00o(negate2, add, bigInteger2));
                        if (OooO0O02 != null) {
                            for (BigInteger bigInteger6 = OooO0O02[0]; bigInteger6.compareTo(OooO0O02[1]) <= 0; bigInteger6 = bigInteger6.add(AbstractC5490IlLL.OooO0O0)) {
                                BigInteger[] bigIntegerArr2 = {subtract.add(bigInteger6.multiply(bigInteger2)), bigInteger4.add(bigInteger6.multiply(bigInteger3))};
                                if (OooO00o(bigIntegerArr2, OooO00o3)) {
                                    OooO00o3 = bigIntegerArr2;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            BigInteger subtract2 = bigIntegerArr[0].multiply(OooO00o3[1]).subtract(bigIntegerArr[1].multiply(OooO00o3[0]));
            int bitLength = (OooO0O0.bitLength() + 16) - (OooO0O0.bitLength() & 7);
            BigInteger OooO00o5 = OooO00o(OooO00o3[1].shiftLeft(bitLength), subtract2);
            BigInteger negate3 = OooO00o(bigIntegerArr[1].shiftLeft(bitLength), subtract2).negate();
            OooO00o("Beta", r4.m21859OooO00o().toString(16));
            OooO00o("Lambda", bigInteger.toString(16));
            OooO00o("v1", "{ " + bigIntegerArr[0].toString(16) + ", " + bigIntegerArr[1].toString(16) + " }");
            OooO00o(DefaultDiskStorage.DEFAULT_DISK_STORAGE_VERSION_PREFIX, "{ " + OooO00o3[0].toString(16) + ", " + OooO00o3[1].toString(16) + " }");
            OooO00o("d", subtract2.toString(16));
            OooO00o("(OPT) g1", OooO00o5.toString(16));
            OooO00o("(OPT) g2", negate3.toString(16));
            OooO00o("(OPT) bits", Integer.toString(bitLength));
            return;
        }
        throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
    }

    public static void OooO00o(String str) {
        C9387Iill OooO00o2 = C9857liL1l.m21940OooO00o(str);
        if (OooO00o2 == null) {
            PrintStream printStream = System.err;
            printStream.println("Unknown curve: " + str);
            return;
        }
        IIiLIli OooO00o3 = OooO00o2.OooO00o();
        if (Lii1I.OooO0O0(OooO00o3)) {
            BigInteger OooO00o4 = OooO00o3.m15391OooO00o().OooO00o();
            if (OooO00o3.m15394OooO00o().m21863OooO0O0() && OooO00o4.mod(AbstractC5490IlLL.OooO0Oo).equals(AbstractC5490IlLL.OooO0O0)) {
                PrintStream printStream2 = System.out;
                printStream2.println("Curve '" + str + "' has a 'GLV Type B' endomorphism with these parameters:");
                OooO0O0(OooO00o2);
            }
        }
    }

    public static void OooO00o(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer(GlideException.OooO00o.o0ooOoO);
        stringBuffer.append(str);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append("= ");
        stringBuffer.append(obj.toString());
        System.out.println(stringBuffer.toString());
    }

    public static void OooO00o(String[] strArr) {
        if (strArr.length < 1) {
            System.err.println("Expected a list of curve names as arguments");
            return;
        }
        for (String str : strArr) {
            OooO00o(str);
        }
    }

    public static void OooO00o(BigInteger[] bigIntegerArr) {
        BigInteger bigInteger = bigIntegerArr[0];
        bigIntegerArr[0] = bigIntegerArr[1];
        bigIntegerArr[1] = bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15296OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.gcd(bigInteger2).equals(AbstractC5490IlLL.OooO0O0);
    }

    public static boolean OooO00o(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        return OooO0O0(bigIntegerArr[0].abs().max(bigIntegerArr[1].abs()), bigInteger);
    }

    public static boolean OooO00o(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger abs = bigIntegerArr[0].abs();
        BigInteger abs2 = bigIntegerArr[1].abs();
        BigInteger abs3 = bigIntegerArr2[0].abs();
        BigInteger abs4 = bigIntegerArr2[1].abs();
        boolean z = abs.compareTo(abs3) < 0;
        return z == (abs2.compareTo(abs4) < 0) ? z : abs.multiply(abs).add(abs2.multiply(abs2)).compareTo(abs3.multiply(abs3).add(abs4.multiply(abs4))) < 0;
    }

    public static AbstractC97441iIIL[] OooO00o(IIiLIli r5) {
        BigInteger modPow;
        BigInteger OooO00o2 = r5.m15391OooO00o().OooO00o();
        BigInteger divide = OooO00o2.divide(AbstractC5490IlLL.OooO0Oo);
        SecureRandom secureRandom = new SecureRandom();
        do {
            BigInteger bigInteger = AbstractC5490IlLL.OooO0OO;
            modPow = IIiL.OooO00o(bigInteger, OooO00o2.subtract(bigInteger), secureRandom).modPow(divide, OooO00o2);
        } while (modPow.equals(AbstractC5490IlLL.OooO0O0));
        AbstractC97441iIIL OooO00o3 = r5.OooO00o(modPow);
        return new AbstractC97441iIIL[]{OooO00o3, OooO00o3.OooO0o0()};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger[] m15297OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = AbstractC5490IlLL.OooO00o;
        BigInteger bigInteger4 = AbstractC5490IlLL.OooO0O0;
        BigInteger bigInteger5 = bigInteger;
        while (true) {
            BigInteger[] divideAndRemainder = bigInteger5.divideAndRemainder(bigInteger2);
            BigInteger bigInteger6 = divideAndRemainder[0];
            BigInteger bigInteger7 = divideAndRemainder[1];
            BigInteger subtract = bigInteger3.subtract(bigInteger6.multiply(bigInteger4));
            if (OooO0O0(bigInteger2, bigInteger)) {
                return new BigInteger[]{bigInteger5, bigInteger3, bigInteger2, bigInteger4, bigInteger7, subtract};
            }
            bigInteger5 = bigInteger2;
            bigInteger3 = bigInteger4;
            bigInteger2 = bigInteger7;
            bigInteger4 = subtract;
        }
    }

    public static BigInteger[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return m15300OooO0O0(bigInteger.subtract(bigInteger2).divide(bigInteger3), bigInteger.add(bigInteger2).divide(bigInteger3));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger[] m15298OooO00o(BigInteger[] bigIntegerArr) {
        boolean z = bigIntegerArr[0].compareTo(bigIntegerArr[1]) < 0;
        if (z) {
            OooO00o(bigIntegerArr);
        }
        BigInteger bigInteger = bigIntegerArr[0];
        BigInteger bigInteger2 = bigIntegerArr[1];
        BigInteger bigInteger3 = AbstractC5490IlLL.OooO0O0;
        BigInteger bigInteger4 = AbstractC5490IlLL.OooO00o;
        BigInteger bigInteger5 = AbstractC5490IlLL.OooO0O0;
        BigInteger bigInteger6 = bigInteger4;
        BigInteger bigInteger7 = bigInteger2;
        BigInteger bigInteger8 = bigInteger;
        while (bigInteger7.compareTo(AbstractC5490IlLL.OooO0O0) > 0) {
            BigInteger[] divideAndRemainder = bigInteger8.divideAndRemainder(bigInteger7);
            BigInteger bigInteger9 = divideAndRemainder[0];
            bigInteger7 = divideAndRemainder[1];
            bigInteger8 = bigInteger7;
            bigInteger4 = bigInteger3.subtract(bigInteger9.multiply(bigInteger4));
            bigInteger3 = bigInteger4;
            bigInteger5 = bigInteger6.subtract(bigInteger9.multiply(bigInteger5));
            bigInteger6 = bigInteger5;
        }
        if (bigInteger7.signum() <= 0) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = {bigInteger4, bigInteger5};
        if (z) {
            OooO00o(bigIntegerArr2);
        }
        return bigIntegerArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger[] m15299OooO00o(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        return OooO00o(bigIntegerArr, bigIntegerArr2) ? bigIntegerArr : bigIntegerArr2;
    }

    public static void OooO0O0(C9387Iill r4) {
        BigInteger OooO0O0 = r4.m21460OooO0O0();
        BigInteger bigInteger = AbstractC5490IlLL.OooO0O0;
        BigInteger[] OooO0O02 = OooO0O0(OooO0O0, bigInteger, bigInteger);
        AbstractC97441iIIL[] OooO00o2 = OooO00o(r4.OooO00o());
        OooO00o(r4, OooO0O02[0], OooO00o2);
        System.out.println("OR");
        OooO00o(r4, OooO0O02[1], OooO00o2);
    }

    public static boolean OooO0O0(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int bitLength = abs2.bitLength();
        int bitLength2 = abs.bitLength() * 2;
        return bitLength2 + -1 <= bitLength && (bitLength2 < bitLength || abs.multiply(abs).compareTo(abs2) < 0);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static BigInteger[] m15300OooO0O0(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        return new BigInteger[]{bigInteger2, bigInteger};
    }

    public static BigInteger[] OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger OooO00o2 = new AbstractC97441iIIL.C9745OooO0Oo(bigInteger, bigInteger2.multiply(bigInteger2).subtract(bigInteger3.shiftLeft(2)).mod(bigInteger)).OooO0Oo().m21859OooO00o();
        BigInteger subtract = bigInteger.subtract(OooO00o2);
        if (OooO00o2.testBit(0)) {
            subtract = subtract.add(bigInteger);
        } else {
            OooO00o2 = OooO00o2.add(bigInteger);
        }
        return new BigInteger[]{OooO00o2.shiftRight(1), subtract.shiftRight(1)};
    }

    public static BigInteger[] OooO0O0(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger max = bigIntegerArr[0].max(bigIntegerArr2[0]);
        BigInteger min = bigIntegerArr[1].min(bigIntegerArr2[1]);
        if (max.compareTo(min) > 0) {
            return null;
        }
        return new BigInteger[]{max, min};
    }
}
