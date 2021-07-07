package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨iLi  reason: invalid class name and case insensitive filesystem */
public class C9609iLi {
    public static final byte OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BigInteger f23182OooO00o = AbstractC5490IlLL.OooO0O0.negate();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5519ILL1[] f23183OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[][] f23184OooO00o = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
    public static final byte OooO0O0 = 16;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final BigInteger f23185OooO0O0 = AbstractC5490IlLL.OooO0OO.negate();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C5519ILL1[] f23186OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final byte[][] f23187OooO0O0 = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    public static final BigInteger OooO0OO = AbstractC5490IlLL.OooO0Oo.negate();

    static {
        BigInteger bigInteger = f23182OooO00o;
        f23183OooO00o = new C5519ILL1[]{null, new C5519ILL1(AbstractC5490IlLL.OooO0O0, AbstractC5490IlLL.OooO00o), null, new C5519ILL1(OooO0OO, f23182OooO00o), null, new C5519ILL1(bigInteger, bigInteger), null, new C5519ILL1(AbstractC5490IlLL.OooO0O0, f23182OooO00o), null};
        BigInteger bigInteger2 = AbstractC5490IlLL.OooO0O0;
        f23186OooO0O0 = new C5519ILL1[]{null, new C5519ILL1(AbstractC5490IlLL.OooO0O0, AbstractC5490IlLL.OooO00o), null, new C5519ILL1(OooO0OO, AbstractC5490IlLL.OooO0O0), null, new C5519ILL1(f23182OooO00o, AbstractC5490IlLL.OooO0O0), null, new C5519ILL1(bigInteger2, bigInteger2), null};
    }

    public static byte OooO00o(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static byte OooO00o(IIiLIli.OooO0O0 oooO0O0) {
        if (oooO0O0.OooO00o()) {
            return oooO0O0.m15394OooO00o().m21863OooO0O0() ? (byte) -1 : 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static byte OooO00o(AbstractC97441iIIL r0) {
        return (byte) (r0.m21863OooO0O0() ? -1 : 1);
    }

    public static int OooO00o(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(AbstractC5490IlLL.OooO0OO)) {
                return 1;
            }
            if (bigInteger.equals(AbstractC5490IlLL.OooO0o0)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5.OooO00o(com.p118pd.sdk.C9609iLi.f23182OooO00o) < 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r7.OooO00o(com.p118pd.sdk.AbstractC5490IlLL.OooO0OO) >= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r5.OooO00o(com.p118pd.sdk.AbstractC5490IlLL.OooO0O0) >= 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r7.OooO00o(com.p118pd.sdk.C9609iLi.f23185OooO0O0) < 0) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C5519ILL1 OooO00o(com.p118pd.sdk.C6365i1 r7, com.p118pd.sdk.C6365i1 r8, byte r9) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9609iLi.OooO00o(com.pd.sdk.i丨1丨丨, com.pd.sdk.i丨1丨丨, byte):com.pd.sdk.I丨LL1");
    }

    public static C5519ILL1 OooO00o(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        BigInteger add = b2 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = OooO00o(b2, i, true)[1];
        C5519ILL1 OooO00o2 = OooO00o(OooO00o(bigInteger, bigIntegerArr[0], bigInteger2, b, i, b3), OooO00o(bigInteger, bigIntegerArr[1], bigInteger2, b, i, b3), b2);
        return new C5519ILL1(bigInteger.subtract(add.multiply(OooO00o2.OooO00o)).subtract(BigInteger.valueOf(2).multiply(bigIntegerArr[1]).multiply(OooO00o2.OooO0O0)), bigIntegerArr[1].multiply(OooO00o2.OooO00o).subtract(bigIntegerArr[0].multiply(OooO00o2.OooO0O0)));
    }

    public static C6365i1 OooO00o(byte b, C6365i1 r3, C6365i1 r4) {
        C6365i1 OooO0Oo;
        C6365i1 OooO0OO2 = r3.OooO0OO(r3);
        C6365i1 OooO0OO3 = r3.OooO0OO(r4);
        C6365i1 OooO0O02 = r4.OooO0OO(r4).OooO0O0(1);
        if (b == 1) {
            OooO0Oo = OooO0OO2.m17468OooO00o(OooO0OO3);
        } else if (b == -1) {
            OooO0Oo = OooO0OO2.OooO0Oo(OooO0OO3);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return OooO0Oo.m17468OooO00o(OooO0O02);
    }

    public static C6365i1 OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(AbstractC5490IlLL.OooO0O0);
        }
        return new C6365i1(shiftRight, i2);
    }

    public static AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0) {
        return oooO0O0.OooO00o();
    }

    public static AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, C5519ILL1 r2) {
        return OooO00o(oooO0O0, m21665OooO00o(OooO00o(((IIiLIli.OooO0O0) oooO0O0.m21800OooO00o()).m15394OooO00o()), r2));
    }

    public static AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, BigInteger bigInteger) {
        IIiLIli.OooO0O0 oooO0O02 = (IIiLIli.OooO0O0) oooO0O0.m21800OooO00o();
        int OooO0O02 = oooO0O02.OooO0O0();
        int intValue = oooO0O02.m15394OooO00o().m21859OooO00o().intValue();
        return OooO00o(oooO0O0, OooO00o(bigInteger, OooO0O02, (byte) intValue, oooO0O02.m15402OooO00o(), OooO00o(intValue), (byte) 10));
    }

    public static AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, byte[] bArr) {
        AbstractC9738llL1L.OooO0O0 oooO0O02 = (AbstractC9738llL1L.OooO0O0) oooO0O0.m21800OooO00o().m15393OooO00o();
        AbstractC9738llL1L.OooO0O0 oooO0O03 = (AbstractC9738llL1L.OooO0O0) oooO0O0.OooO0OO();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                oooO0O02 = (AbstractC9738llL1L.OooO0O0) oooO0O02.OooO00o(i).OooO00o((AbstractC9738llL1L) (b > 0 ? oooO0O0 : oooO0O03));
                i = 0;
            }
        }
        return i > 0 ? oooO0O02.OooO00o(i) : oooO0O02;
    }

    public static BigInteger OooO00o(byte b, int i) {
        if (i == 4) {
            return b == 1 ? BigInteger.valueOf(6) : BigInteger.valueOf(10);
        }
        BigInteger[] OooO00o2 = OooO00o(b, i, false);
        BigInteger bit = AbstractC5490IlLL.OooO00o.setBit(i);
        return AbstractC5490IlLL.OooO0OO.multiply(OooO00o2[0]).multiply(OooO00o2[1].modInverse(bit)).mod(bit);
    }

    public static BigInteger OooO00o(byte b, C5519ILL1 r4) {
        BigInteger subtract;
        BigInteger bigInteger = r4.OooO00o;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = r4.OooO00o.multiply(r4.OooO0O0);
        BigInteger bigInteger2 = r4.OooO0O0;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b == 1) {
            subtract = multiply.add(multiply2);
        } else if (b == -1) {
            subtract = multiply.subtract(multiply2);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return subtract.add(shiftLeft);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21665OooO00o(byte b, C5519ILL1 r10) {
        if (b == 1 || b == -1) {
            int bitLength = OooO00o(b, r10).bitLength();
            byte[] bArr = new byte[(bitLength > 30 ? bitLength + 4 : 34)];
            BigInteger bigInteger = r10.OooO00o;
            BigInteger bigInteger2 = r10.OooO0O0;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!bigInteger.equals(AbstractC5490IlLL.OooO00o) || !bigInteger2.equals(AbstractC5490IlLL.OooO00o)) {
                    if (bigInteger.testBit(0)) {
                        bArr[i2] = (byte) AbstractC5490IlLL.OooO0OO.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(AbstractC5490IlLL.OooO0o0)).intValue();
                        bigInteger = bArr[i2] == 1 ? bigInteger.clearBit(0) : bigInteger.add(AbstractC5490IlLL.OooO0O0);
                        i = i2;
                    } else {
                        bArr[i2] = 0;
                    }
                    BigInteger shiftRight = bigInteger.shiftRight(1);
                    BigInteger add = b == 1 ? bigInteger2.add(shiftRight) : bigInteger2.subtract(shiftRight);
                    BigInteger negate = bigInteger.shiftRight(1).negate();
                    i2++;
                    bigInteger = add;
                    bigInteger2 = negate;
                } else {
                    int i3 = i + 1;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    return bArr2;
                }
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static byte[] OooO00o(byte b, C5519ILL1 r9, byte b2, BigInteger bigInteger, BigInteger bigInteger2, C5519ILL1[] r13) {
        boolean z;
        if (b == 1 || b == -1) {
            int bitLength = OooO00o(b, r9).bitLength();
            byte[] bArr = new byte[(bitLength > 30 ? bitLength + 4 + b2 : b2 + 34)];
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger bigInteger3 = r9.OooO00o;
            BigInteger bigInteger4 = r9.OooO0O0;
            int i = 0;
            while (true) {
                if (bigInteger3.equals(AbstractC5490IlLL.OooO00o) && bigInteger4.equals(AbstractC5490IlLL.OooO00o)) {
                    return bArr;
                }
                if (bigInteger3.testBit(0)) {
                    BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                    if (mod.compareTo(shiftRight) >= 0) {
                        mod = mod.subtract(bigInteger);
                    }
                    byte intValue = (byte) mod.intValue();
                    bArr[i] = intValue;
                    if (intValue < 0) {
                        intValue = (byte) (-intValue);
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        bigInteger3 = bigInteger3.subtract(r13[intValue].OooO00o);
                        bigInteger4 = bigInteger4.subtract(r13[intValue].OooO0O0);
                    } else {
                        bigInteger3 = bigInteger3.add(r13[intValue].OooO00o);
                        bigInteger4 = bigInteger4.add(r13[intValue].OooO0O0);
                    }
                } else {
                    bArr[i] = 0;
                }
                BigInteger shiftRight2 = bigInteger3.shiftRight(1);
                BigInteger add = b == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
                BigInteger negate = bigInteger3.shiftRight(1).negate();
                i++;
                bigInteger3 = add;
                bigInteger4 = negate;
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static AbstractC9738llL1L.OooO0O0[] OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, byte b) {
        byte[][] bArr = b == 0 ? f23184OooO00o : f23187OooO0O0;
        AbstractC9738llL1L.OooO0O0[] oooO0O0Arr = new AbstractC9738llL1L.OooO0O0[((bArr.length + 1) >>> 1)];
        oooO0O0Arr[0] = oooO0O0;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            oooO0O0Arr[i >>> 1] = OooO00o(oooO0O0, bArr[i]);
        }
        oooO0O0.m21800OooO00o().OooO0O0(oooO0O0Arr);
        return oooO0O0Arr;
    }

    public static BigInteger[] OooO00o(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = AbstractC5490IlLL.OooO0OO;
                bigInteger2 = BigInteger.valueOf((long) b);
            } else {
                bigInteger = AbstractC5490IlLL.OooO00o;
                bigInteger2 = AbstractC5490IlLL.OooO0O0;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger2;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] OooO00o(int i, int i2, BigInteger bigInteger) {
        byte OooO00o2 = OooO00o(i2);
        int OooO00o3 = OooO00o(bigInteger);
        BigInteger[] OooO00o4 = OooO00o(OooO00o2, (i + 3) - i2, false);
        if (OooO00o2 == 1) {
            OooO00o4[0] = OooO00o4[0].negate();
            OooO00o4[1] = OooO00o4[1].negate();
        }
        return new BigInteger[]{AbstractC5490IlLL.OooO0O0.add(OooO00o4[1]).shiftRight(OooO00o3), AbstractC5490IlLL.OooO0O0.add(OooO00o4[0]).shiftRight(OooO00o3).negate()};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger[] m21666OooO00o(IIiLIli.OooO0O0 oooO0O0) {
        if (oooO0O0.OooO00o()) {
            int OooO0O02 = oooO0O0.OooO0O0();
            int intValue = oooO0O0.m15394OooO00o().m21859OooO00o().intValue();
            byte OooO00o2 = OooO00o(intValue);
            int OooO00o3 = OooO00o(oooO0O0.m15395OooO00o());
            BigInteger[] OooO00o4 = OooO00o(OooO00o2, (OooO0O02 + 3) - intValue, false);
            if (OooO00o2 == 1) {
                OooO00o4[0] = OooO00o4[0].negate();
                OooO00o4[1] = OooO00o4[1].negate();
            }
            return new BigInteger[]{AbstractC5490IlLL.OooO0O0.add(OooO00o4[1]).shiftRight(OooO00o3), AbstractC5490IlLL.OooO0O0.add(OooO00o4[0]).shiftRight(OooO00o3).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}
