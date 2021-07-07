package com.p118pd.sdk;

import com.google.zxing.pdf417.PDF417Common;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.common.Constants;
import com.taobao.accs.flowcontrol.FlowControl;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.i丨1IiI1  reason: invalid class name and case insensitive filesystem */
public final class C6356i1IiI1 {
    public static final long OooO00o = 152125131763605L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BigInteger f18128OooO00o = BigInteger.valueOf(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static SecureRandom f18129OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18130OooO00o = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f18131OooO0O0 = {0, 1, 0, -1, 0, -1, 0, 1};
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);
    public static final BigInteger OooO0Oo = BigInteger.valueOf(4);

    public static double OooO00o(double d) {
        double d2 = 1.0d;
        if (d > AbstractC8352oOoOOoO0.OooO0O0 && d < 1.0d) {
            return -OooO00o(1.0d / d);
        }
        int i = 0;
        double d3 = d;
        while (d3 > 2.0d) {
            d3 /= 2.0d;
            i++;
            d2 *= 2.0d;
        }
        double OooO0O02 = OooO0O0(d / d2);
        double d4 = (double) i;
        Double.isNaN(d4);
        return d4 + OooO0O02;
    }

    public static double OooO00o(long j) {
        int OooO0O02 = OooO0O0(BigInteger.valueOf(j));
        double d = (double) j;
        double d2 = (double) ((long) (1 << OooO0O02));
        Double.isNaN(d);
        Double.isNaN(d2);
        double OooO0O03 = OooO0O0(d / d2);
        double d3 = (double) OooO0O02;
        Double.isNaN(d3);
        return d3 + OooO0O03;
    }

    public static float OooO00o(float f, int i) {
        float f2 = 1.0f;
        while (i > 0) {
            f2 *= f;
            i--;
        }
        return f2;
    }

    public static float OooO00o(int i, int i2) {
        float OooO00o2;
        float f = (float) (i / i2);
        float f2 = 0.0f;
        while (((double) Math.abs(f2 - f)) > 1.0E-4d) {
            while (true) {
                OooO00o2 = OooO00o(f, i2);
                if (!Float.isInfinite(OooO00o2)) {
                    break;
                }
                f = (f + f2) / 2.0f;
            }
            f2 = f;
            f -= (OooO00o2 - ((float) i)) / (((float) i2) * OooO00o(f, i2 - 1));
        }
        return f;
    }

    public static int OooO00o(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m17448OooO00o(int i, int i2) {
        return BigInteger.valueOf((long) i).gcd(BigInteger.valueOf((long) i2)).intValue();
    }

    public static int OooO00o(int i, int i2, int i3) {
        if (i3 <= 0 || i3 * i3 > Integer.MAX_VALUE || i2 < 0) {
            return 0;
        }
        int i4 = ((i % i3) + i3) % i3;
        int i5 = 1;
        while (i2 > 0) {
            if ((i2 & 1) == 1) {
                i5 = (i5 * i4) % i3;
            }
            i4 = (i4 * i4) % i3;
            i2 >>>= 1;
        }
        return i5;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m17449OooO00o(long j) {
        if (j == 0) {
            return 1;
        }
        if (j < 0) {
            j = -j;
        }
        int i = 0;
        while (j > 0) {
            i++;
            j >>>= 8;
        }
        return i;
    }

    public static int OooO00o(BigInteger bigInteger) {
        int i = 0;
        for (BigInteger bigInteger2 = OooO0O0; bigInteger2.compareTo(bigInteger) < 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i++;
        }
        return i;
    }

    public static int OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.equals(f18128OooO00o)) {
            return bigInteger.abs().equals(OooO0O0) ? 1 : 0;
        }
        if (!bigInteger.testBit(0) && !bigInteger2.testBit(0)) {
            return 0;
        }
        long j = 1;
        if (bigInteger2.signum() == -1) {
            bigInteger2 = bigInteger2.negate();
            if (bigInteger.signum() == -1) {
                j = -1;
            }
        }
        BigInteger bigInteger3 = f18128OooO00o;
        while (!bigInteger2.testBit(0)) {
            bigInteger3 = bigInteger3.add(OooO0O0);
            bigInteger2 = bigInteger2.divide(OooO0OO);
        }
        if (bigInteger3.testBit(0)) {
            j *= (long) f18131OooO0O0[bigInteger.intValue() & 7];
        }
        if (bigInteger.signum() < 0) {
            if (bigInteger2.testBit(1)) {
                j = -j;
            }
            bigInteger = bigInteger.negate();
        }
        while (bigInteger.signum() != 0) {
            BigInteger bigInteger4 = f18128OooO00o;
            while (!bigInteger.testBit(0)) {
                bigInteger4 = bigInteger4.add(OooO0O0);
                bigInteger = bigInteger.divide(OooO0OO);
            }
            if (bigInteger4.testBit(0)) {
                j *= (long) f18131OooO0O0[bigInteger2.intValue() & 7];
            }
            if (bigInteger.compareTo(bigInteger2) >= 0) {
                bigInteger2 = bigInteger;
                bigInteger = bigInteger2;
            } else if (bigInteger2.testBit(1) && bigInteger.testBit(1)) {
                j = -j;
            }
            BigInteger subtract = bigInteger2.subtract(bigInteger);
            bigInteger2 = bigInteger;
            bigInteger = subtract;
        }
        if (bigInteger2.equals(OooO0O0)) {
            return (int) j;
        }
        return 0;
    }

    public static long OooO00o(long j, int i) {
        long j2 = 1;
        while (i > 0) {
            if ((i & 1) == 1) {
                j2 *= j;
            }
            j *= j;
            i >>>= 1;
        }
        return j2;
    }

    public static long OooO00o(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + j2 : j3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m17450OooO00o(int i, int i2) {
        BigInteger bigInteger = OooO0O0;
        if (i == 0) {
            return i2 == 0 ? bigInteger : f18128OooO00o;
        }
        if (i2 > (i >>> 1)) {
            i2 = i - i2;
        }
        for (int i3 = 1; i3 <= i2; i3++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf((long) (i - (i3 - 1)))).divide(BigInteger.valueOf((long) i3));
        }
        return bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m17451OooO00o(long j) {
        if (j <= 1) {
            return BigInteger.valueOf(2);
        }
        if (j == 2) {
            return BigInteger.valueOf(3);
        }
        boolean z = false;
        long j2 = 0;
        for (long j3 = j + 1 + (j & 1); j3 <= (j << 1) && !z; j3 += 2) {
            for (long j4 = 3; j4 <= (j3 >> 1) && !z; j4 += 2) {
                if (j3 % j4 == 0) {
                    z = true;
                }
            }
            if (!z) {
                j2 = j3;
            }
            z = !z;
        }
        return BigInteger.valueOf(j2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m17452OooO00o(BigInteger bigInteger) {
        return OooO00o(bigInteger, 20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if ((r0 % 41) != 0) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.math.BigInteger OooO00o(java.math.BigInteger r7, int r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6356i1IiI1.OooO00o(java.math.BigInteger, int):java.math.BigInteger");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m17453OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.signum() < 0 ? m17453OooO00o(bigInteger.negate(), bigInteger2).negate() : bigInteger2.signum() < 0 ? m17453OooO00o(bigInteger, bigInteger2.negate()).negate() : bigInteger.shiftLeft(1).add(bigInteger2).divide(bigInteger2.shiftLeft(1));
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.subtract(bigInteger2).mod(bigInteger3.subtract(bigInteger2)).add(bigInteger2);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        BigInteger valueOf = BigInteger.valueOf(0);
        if (secureRandom == null && (secureRandom = f18129OooO00o) == null) {
            secureRandom = IIllii.OooO00o();
        }
        for (int i = 0; i < 20; i++) {
            valueOf = new BigInteger(bitLength, secureRandom);
            if (valueOf.compareTo(bigInteger) < 0) {
                return valueOf;
            }
        }
        return valueOf.mod(bigInteger);
    }

    public static BigInteger OooO00o(byte[] bArr) {
        return OooO00o(bArr, 0, bArr.length);
    }

    public static BigInteger OooO00o(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 1)];
        bArr2[0] = 0;
        System.arraycopy(bArr, i, bArr2, 1, i2);
        return new BigInteger(bArr2);
    }

    public static BigInteger OooO00o(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        BigInteger bigInteger = bigIntegerArr[0];
        for (int i = 1; i < length; i++) {
            bigInteger = bigInteger.multiply(bigIntegerArr[i]).divide(bigInteger.gcd(bigIntegerArr[i]));
        }
        return bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17454OooO00o(int i) {
        if (i < 2) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        if (i < 42) {
            int i2 = 0;
            while (true) {
                int[] iArr = f18130OooO00o;
                if (i2 >= iArr.length) {
                    break;
                } else if (i == iArr[i2]) {
                    return true;
                } else {
                    i2++;
                }
            }
        }
        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0 || i % 13 == 0 || i % 17 == 0 || i % 19 == 0 || i % 23 == 0 || i % 29 == 0 || i % 31 == 0 || i % 37 == 0 || i % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf((long) i).isProbablePrime(20);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17455OooO00o(BigInteger bigInteger) {
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, Lillilli.OooooOo, Lillilli.Oooooo, Lillilli.ooOO, 199, AbstractC9366ILlIL.OooO00o, 223, 227, 229, 233, 239, 241, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, oO0oO000.Oooo00o, 331, 337, oO0oO000.OoooO00, 349, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 359, 367, 373, 379, 383, 389, 397, TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, 409, AntiBrush.STATUS_BRUSH, FlowControl.STATUS_FLOW_CTRL_CUR, 431, 433, 439, Constants.PORT, 449, 457, 461, 463, 467, 479, 487, 491, 499, C8713oo0o0o.OooO, 509, 521, 523, oOO000OO.OooOo00, 547, C8025oOO00oOO.Oooo0, 563, 569, 571, C8025oOO00oOO.Oooo, C8025oOO00oOO.OoooO0, 593, 599, 601, C8025oOO00oOO.OoooOOO, C8025oOO00oOO.OoooOo0, C8025oOO00oOO.OoooOoo, 619, 631, 641, C8025oOO00oOO.o0OoOo0, C8025oOO00oOO.ooOO, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, C7982oO0oo00O.OooO0oo, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, PDF417Common.NUMBER_OF_CODEWORDS, 937, 941, 947, 953, 967, 971, IiIi1lI.OooO0OO, 983, 991, 997, 1009, 1013, 1019, 1021, C7980oO0oo0.OooO0O0, C8122oOOOO0oo.OooOoo0, C8122oOOOO0oo.Oooo00O, C8122oOOOO0oo.Oooo, C8122oOOOO0oo.OoooO0, C8122oOOOO0oo.OoooOoO, 1063, C8122oOOOO0oo.OooooOo, C8122oOOOO0oo.o0ooOOo, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, C7988oO0oo0o.OooOoOO, C7988oO0oo0o.Oooo000, C7988oO0oo0o.Oooo00o, 1297, 1301, 1303, 1307, C7988oO0oo0o.OoooO0O, C7988oO0oo0o.OoooO, C7988oO0oo0o.OoooOOo, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499};
        for (int i = 0; i < 239; i++) {
            if (bigInteger.mod(BigInteger.valueOf((long) iArr[i])).equals(f18128OooO00o)) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(int[] iArr) {
        for (int i = 1; i < iArr.length; i++) {
            int i2 = i - 1;
            if (iArr[i2] >= iArr[i]) {
                System.out.println("a[" + i2 + "] = " + iArr[i2] + " >= " + iArr[i] + " = a[" + i + "]");
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17456OooO00o(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m17457OooO00o(int i, int i2) {
        BigInteger[] OooO00o2 = m17458OooO00o(BigInteger.valueOf((long) i), BigInteger.valueOf((long) i2));
        return new int[]{OooO00o2[0].intValue(), OooO00o2[1].intValue(), OooO00o2[2].intValue()};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger[] m17458OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = OooO0O0;
        BigInteger bigInteger4 = f18128OooO00o;
        if (bigInteger2.signum() != 0) {
            BigInteger bigInteger5 = f18128OooO00o;
            BigInteger bigInteger6 = bigInteger;
            BigInteger bigInteger7 = bigInteger2;
            while (bigInteger7.signum() != 0) {
                BigInteger[] divideAndRemainder = bigInteger6.divideAndRemainder(bigInteger7);
                BigInteger bigInteger8 = divideAndRemainder[0];
                BigInteger bigInteger9 = divideAndRemainder[1];
                bigInteger5 = bigInteger3.subtract(bigInteger8.multiply(bigInteger5));
                bigInteger3 = bigInteger5;
                bigInteger6 = bigInteger7;
                bigInteger7 = bigInteger9;
            }
            bigInteger4 = bigInteger6.subtract(bigInteger.multiply(bigInteger3)).divide(bigInteger2);
            bigInteger = bigInteger6;
        }
        return new BigInteger[]{bigInteger, bigInteger3, bigInteger4};
    }

    public static BigInteger[] OooO00o(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        for (int i = 0; i < bigIntegerArr.length; i++) {
            bigIntegerArr2[i] = m17453OooO00o(bigIntegerArr[i], bigInteger);
        }
        return bigIntegerArr2;
    }

    public static double OooO0O0(double d) {
        double[] dArr = {1.0d, 0.5849625007211562d, 0.32192809488736235d, 0.16992500144231237d, 0.0874628412503394d, 0.044394119358453436d, 0.02236781302845451d, 0.01122725542325412d, 0.005624549193878107d, 0.0028150156070540383d, 0.0014081943928083889d, 7.042690112466433E-4d, 3.5217748030102726E-4d, 1.7609948644250602E-4d, 8.80524301221769E-5d, 4.4026886827316716E-5d, 2.2013611360340496E-5d, 1.1006847667481442E-5d, 5.503434330648604E-6d, 2.751719789561283E-6d, 1.375860550841138E-6d, 6.879304394358497E-7d, 3.4396526072176454E-7d, 1.7198264061184464E-7d, 8.599132286866321E-8d, 4.299566207501687E-8d, 2.1497831197679756E-8d, 1.0748915638882709E-8d, 5.374457829452062E-9d, 2.687228917228708E-9d, 1.3436144592400231E-9d, 6.718072297764289E-10d, 3.3590361492731876E-10d, 1.6795180747343547E-10d, 8.397590373916176E-11d, 4.1987951870191886E-11d, 2.0993975935248694E-11d, 1.0496987967662534E-11d, 5.2484939838408146E-12d, 2.624246991922794E-12d, 1.3121234959619935E-12d, 6.56061747981146E-13d, 3.2803087399061026E-13d, 1.6401543699531447E-13d, 8.200771849765956E-14d, 4.1003859248830365E-14d, 2.0501929624415328E-14d, 1.02509648122077E-14d, 5.1254824061038595E-15d, 2.5627412030519317E-15d, 1.2813706015259665E-15d, 6.406853007629834E-16d, 3.203426503814917E-16d, 1.6017132519074588E-16d, 8.008566259537294E-17d, 4.004283129768647E-17d, 2.0021415648843235E-17d, 1.0010707824421618E-17d, 5.005353912210809E-18d, 2.5026769561054044E-18d, 1.2513384780527022E-18d, 6.256692390263511E-19d, 3.1283461951317555E-19d, 1.5641730975658778E-19d, 7.820865487829389E-20d, 3.9104327439146944E-20d, 1.9552163719573472E-20d, 9.776081859786736E-21d, 4.888040929893368E-21d, 2.444020464946684E-21d, 1.222010232473342E-21d, 6.11005116236671E-22d, 3.055025581183355E-22d, 1.5275127905916775E-22d, 7.637563952958387E-23d, 3.818781976479194E-23d, 1.909390988239597E-23d, 9.546954941197984E-24d, 4.773477470598992E-24d, 2.386738735299496E-24d, 1.193369367649748E-24d, 5.96684683824874E-25d, 2.98342341912437E-25d, 1.491711709562185E-25d, 7.458558547810925E-26d, 3.7292792739054626E-26d, 1.8646396369527313E-26d, 9.323198184763657E-27d, 4.661599092381828E-27d, 2.330799546190914E-27d, 1.165399773095457E-27d, 5.826998865477285E-28d, 2.9134994327386427E-28d, 1.4567497163693213E-28d, 7.283748581846607E-29d, 3.6418742909233034E-29d, 1.8209371454616517E-29d, 9.104685727308258E-30d, 4.552342863654129E-30d, 2.2761714318270646E-30d};
        double d2 = 1.0d;
        double d3 = 0.0d;
        double d4 = 1.0d;
        for (int i = 0; i < 53; i++) {
            double d5 = (d2 * d4) + d2;
            if (d5 <= d) {
                d3 += dArr[i];
                d2 = d5;
            }
            d4 *= 0.5d;
        }
        return d3;
    }

    public static int OooO0O0(int i) {
        int i2 = 1;
        int i3 = 0;
        while (i2 < i) {
            i2 <<= 1;
            i3++;
        }
        return i3;
    }

    public static int OooO0O0(int i, int i2) {
        if (i <= 0) {
            return -1;
        }
        int i3 = 0;
        while (i > 1) {
            if (i % i2 != 0) {
                return -1;
            }
            i /= i2;
            i3++;
        }
        return i3;
    }

    public static int OooO0O0(BigInteger bigInteger) {
        int i = -1;
        for (BigInteger bigInteger2 = OooO0O0; bigInteger2.compareTo(bigInteger) <= 0; bigInteger2 = bigInteger2.shiftLeft(1)) {
            i++;
        }
        return i;
    }

    public static long OooO0O0(long j, long j2) {
        return BigInteger.valueOf(j).modInverse(BigInteger.valueOf(j2)).longValue();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static BigInteger m17459OooO0O0(BigInteger bigInteger) {
        if (f18129OooO00o == null) {
            f18129OooO00o = IIllii.OooO00o();
        }
        return OooO00o(bigInteger, f18129OooO00o);
    }

    public static BigInteger OooO0O0(BigInteger bigInteger, BigInteger bigInteger2) throws IllegalArgumentException {
        BigInteger add = bigInteger.compareTo(f18128OooO00o) < 0 ? bigInteger.add(bigInteger2) : bigInteger;
        if (add.equals(f18128OooO00o)) {
            return f18128OooO00o;
        }
        if (bigInteger2.equals(OooO0OO)) {
            return add;
        }
        int i = 1;
        if (!bigInteger2.testBit(0) || !bigInteger2.testBit(1)) {
            BigInteger subtract = bigInteger2.subtract(OooO0O0);
            long j = 0;
            while (!subtract.testBit(0)) {
                j++;
                subtract = subtract.shiftRight(1);
            }
            BigInteger shiftRight = subtract.subtract(OooO0O0).shiftRight(1);
            BigInteger modPow = add.modPow(shiftRight, bigInteger2);
            BigInteger remainder = modPow.multiply(modPow).remainder(bigInteger2).multiply(add).remainder(bigInteger2);
            BigInteger remainder2 = modPow.multiply(add).remainder(bigInteger2);
            if (remainder.equals(OooO0O0)) {
                return remainder2;
            }
            BigInteger bigInteger3 = OooO0OO;
            while (OooO00o(bigInteger3, bigInteger2) == 1) {
                bigInteger3 = bigInteger3.add(OooO0O0);
            }
            BigInteger modPow2 = bigInteger3.modPow(shiftRight.multiply(OooO0OO).add(OooO0O0), bigInteger2);
            while (remainder.compareTo(OooO0O0) == i) {
                BigInteger bigInteger4 = remainder;
                long j2 = 0;
                while (!bigInteger4.equals(OooO0O0)) {
                    bigInteger4 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
                    j2++;
                }
                long j3 = j - j2;
                if (j3 != 0) {
                    BigInteger bigInteger5 = OooO0O0;
                    long j4 = 0;
                    while (true) {
                        i = 1;
                        if (j4 >= j3 - 1) {
                            break;
                        }
                        bigInteger5 = bigInteger5.shiftLeft(1);
                        j4++;
                    }
                    BigInteger modPow3 = modPow2.modPow(bigInteger5, bigInteger2);
                    remainder2 = remainder2.multiply(modPow3).remainder(bigInteger2);
                    modPow2 = modPow3.multiply(modPow3).remainder(bigInteger2);
                    remainder = remainder.multiply(modPow2).mod(bigInteger2);
                    j = j2;
                } else {
                    throw new IllegalArgumentException("No quadratic residue: " + add + ", " + bigInteger2);
                }
            }
            return remainder2;
        } else if (OooO00o(add, bigInteger2) == 1) {
            return add.modPow(bigInteger2.add(OooO0O0).shiftRight(2), bigInteger2);
        } else {
            throw new IllegalArgumentException("No quadratic residue: " + add + ", " + bigInteger2);
        }
    }

    public static int OooO0OO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }

    public static int OooO0OO(int i, int i2) {
        return BigInteger.valueOf((long) i).modInverse(BigInteger.valueOf((long) i2)).intValue();
    }

    public static BigInteger OooO0OO(BigInteger bigInteger) {
        BigInteger bigInteger2;
        if (bigInteger.compareTo(f18128OooO00o) >= 0) {
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger3 = f18128OooO00o;
            if ((bitLength & 1) != 0) {
                bitLength--;
                bigInteger2 = bigInteger3;
                bigInteger3 = bigInteger3.add(OooO0O0);
            } else {
                bigInteger2 = bigInteger3;
            }
            while (bitLength > 0) {
                BigInteger multiply = bigInteger2.multiply(OooO0Oo);
                int i = bitLength - 1;
                int i2 = bigInteger.testBit(i) ? 2 : 0;
                bitLength = i - 1;
                bigInteger2 = multiply.add(BigInteger.valueOf((long) (i2 + (bigInteger.testBit(bitLength) ? 1 : 0))));
                BigInteger add = bigInteger3.multiply(OooO0Oo).add(OooO0O0);
                bigInteger3 = bigInteger3.multiply(OooO0OO);
                if (bigInteger2.compareTo(add) != -1) {
                    bigInteger3 = bigInteger3.add(OooO0O0);
                    bigInteger2 = bigInteger2.subtract(add);
                }
            }
            return bigInteger3;
        }
        throw new ArithmeticException("cannot extract root of negative number" + bigInteger + C9058ooOoOoOO.OooOO0);
    }

    public static int OooO0Oo(int i) {
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = i >>> 1; i3 > 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    public static int OooO0Oo(int i, int i2) {
        int i3 = i % i2;
        if (i3 != 0) {
            int i4 = 1;
            while (i3 != 1) {
                i3 = (i3 * i) % i2;
                if (i3 < 0) {
                    i3 += i2;
                }
                i4++;
            }
            return i4;
        }
        throw new IllegalArgumentException(i + " is not an element of Z/(" + i2 + "Z)^*; it is not meaningful to compute its order.");
    }

    public static int OooO0o(int i) {
        int i2 = 0;
        if (i != 0) {
            for (int i3 = 1; (i & i3) == 0; i3 <<= 1) {
                i2++;
            }
        }
        return i2;
    }

    public static int OooO0o0(int i) {
        if (i < 0) {
            i = -i;
        }
        if (i == 0) {
            return 1;
        }
        if ((i & 1) == 0) {
            return 2;
        }
        for (int i2 = 3; i2 <= i / i2; i2 += 2) {
            if (i % i2 == 0) {
                return i2;
            }
        }
        return i;
    }

    public static int OooO0o0(int i, int i2) {
        int i3 = 1;
        while (i2 > 0) {
            if ((i2 & 1) == 1) {
                i3 *= i;
            }
            i *= i;
            i2 >>>= 1;
        }
        return i3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    public static int OooO0oO(int r4) {
        /*
            r0 = 2
            r1 = 1
            if (r4 > r0) goto L_0x0005
            return r1
        L_0x0005:
            r2 = 3
            if (r4 != r2) goto L_0x0009
            return r0
        L_0x0009:
            r0 = r4 & 1
            if (r0 != 0) goto L_0x0010
            int r4 = r4 + -1
            goto L_0x0012
        L_0x0010:
            int r4 = r4 + -2
        L_0x0012:
            if (r4 <= r2) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r3 = m17454OooO00o(r4)
            r3 = r3 ^ r1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0020
            goto L_0x0010
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6356i1IiI1.OooO0oO(int):int");
    }
}
