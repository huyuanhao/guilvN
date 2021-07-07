package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨ILlI丨L  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9366ILlIL {
    public static final int OooO00o = 211;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BigInteger f22908OooO00o = BigInteger.valueOf(1);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);
    public static final BigInteger OooO0OO = BigInteger.valueOf(3);

    /* renamed from: com.pd.sdk.丨ILlI丨L$OooO0O0 */
    public static class OooO0O0 {
        public BigInteger OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22909OooO00o;

        public OooO0O0(boolean z, BigInteger bigInteger) {
            this.f22909OooO00o = z;
            this.OooO00o = bigInteger;
        }

        public static OooO0O0 OooO0O0(BigInteger bigInteger) {
            return new OooO0O0(true, bigInteger);
        }

        public static OooO0O0 OooO0OO() {
            return new OooO0O0(false, null);
        }

        public static OooO0O0 OooO0Oo() {
            return new OooO0O0(true, null);
        }

        public BigInteger OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m21433OooO00o() {
            return this.f22909OooO00o && this.OooO00o == null;
        }

        public boolean OooO0O0() {
            return this.f22909OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.丨ILlI丨L$OooO0OO */
    public static class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public BigInteger f22910OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f22911OooO00o;

        public OooO0OO(BigInteger bigInteger, byte[] bArr, int i) {
            this.f22910OooO00o = bigInteger;
            this.f22911OooO00o = bArr;
            this.OooO00o = i;
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public BigInteger m21434OooO00o() {
            return this.f22910OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m21435OooO00o() {
            return this.f22911OooO00o;
        }
    }

    public static int OooO00o(byte[] bArr) {
        int min = Math.min(4, bArr.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            int i3 = i + 1;
            i2 |= (bArr[bArr.length - i3] & 255) << (i * 8);
            i = i3;
        }
        return i2;
    }

    public static OooO0O0 OooO00o(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        BigInteger bigInteger2;
        boolean z;
        OooO00o(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        } else if (i < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        } else if (bigInteger.bitLength() == 2) {
            return OooO0O0.OooO0OO();
        } else {
            if (!bigInteger.testBit(0)) {
                return OooO0O0.OooO0O0(OooO0O0);
            }
            BigInteger subtract = bigInteger.subtract(f22908OooO00o);
            BigInteger subtract2 = bigInteger.subtract(OooO0O0);
            int lowestSetBit = subtract.getLowestSetBit();
            BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
            for (int i2 = 0; i2 < i; i2++) {
                BigInteger OooO00o2 = IIiL.OooO00o(OooO0O0, subtract2, secureRandom);
                BigInteger gcd = OooO00o2.gcd(bigInteger);
                if (gcd.compareTo(f22908OooO00o) > 0) {
                    return OooO0O0.OooO0O0(gcd);
                }
                BigInteger modPow = OooO00o2.modPow(shiftRight, bigInteger);
                if (!modPow.equals(f22908OooO00o) && !modPow.equals(subtract)) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= lowestSetBit) {
                            bigInteger2 = modPow;
                            break;
                        }
                        bigInteger2 = modPow.modPow(OooO0O0, bigInteger);
                        if (bigInteger2.equals(subtract)) {
                            z = true;
                            break;
                        } else if (bigInteger2.equals(f22908OooO00o)) {
                            break;
                        } else {
                            i3++;
                            modPow = bigInteger2;
                        }
                    }
                    z = false;
                    if (!z) {
                        if (!bigInteger2.equals(f22908OooO00o)) {
                            modPow = bigInteger2.modPow(OooO0O0, bigInteger);
                            if (modPow.equals(f22908OooO00o)) {
                                modPow = bigInteger2;
                            }
                        }
                        BigInteger gcd2 = modPow.subtract(f22908OooO00o).gcd(bigInteger);
                        return gcd2.compareTo(f22908OooO00o) > 0 ? OooO0O0.OooO0O0(gcd2) : OooO0O0.OooO0Oo();
                    }
                }
            }
            return OooO0O0.OooO0OO();
        }
    }

    public static OooO0OO OooO00o(AbstractC6436l11LI r1, int i, byte[] bArr) {
        if (r1 == null) {
            throw new IllegalArgumentException("'hash' cannot be null");
        } else if (i < 2) {
            throw new IllegalArgumentException("'length' must be >= 2");
        } else if (bArr != null && bArr.length != 0) {
            return OooO0O0(r1, i, C9586iIILl.m21630OooO00o(bArr));
        } else {
            throw new IllegalArgumentException("'inputSeed' cannot be null or empty");
        }
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r5, byte[] bArr, int i) {
        int OooO0O02 = r5.OooO0O0();
        int i2 = i * OooO0O02;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i; i3++) {
            i2 -= OooO0O02;
            OooO00o(r5, bArr, bArr2, i2);
            OooO00o(bArr, 1);
        }
        return new BigInteger(1, bArr2);
    }

    public static void OooO00o(AbstractC6436l11LI r2, byte[] bArr, byte[] bArr2, int i) {
        r2.update(bArr, 0, bArr.length);
        r2.OooO00o(bArr2, i);
    }

    public static void OooO00o(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'" + str + "' must be non-null and >= 2");
        }
    }

    public static void OooO00o(byte[] bArr, int i) {
        int length = bArr.length;
        while (i > 0) {
            length--;
            if (length >= 0) {
                int i2 = i + (bArr[length] & 255);
                bArr[length] = (byte) i2;
                i = i2 >>> 8;
            } else {
                return;
            }
        }
    }

    public static boolean OooO00o(long j) {
        if ((j >>> 32) != 0) {
            throw new IllegalArgumentException("Size limit exceeded");
        } else if (j <= 5) {
            return j == 2 || j == 3 || j == 5;
        } else {
            if ((1 & j) == 0 || j % 3 == 0 || j % 5 == 0) {
                return false;
            }
            long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
            long j2 = 0;
            int i = 1;
            while (true) {
                if (i >= 8) {
                    j2 += 30;
                    if (j2 * j2 >= j) {
                        return true;
                    }
                    i = 0;
                } else if (j % (jArr[i] + j2) == 0) {
                    return j < 30;
                } else {
                    i++;
                }
            }
        }
    }

    public static boolean OooO00o(BigInteger bigInteger) {
        OooO00o(bigInteger, "candidate");
        return OooO0O0(bigInteger);
    }

    public static boolean OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        OooO00o(bigInteger, "candidate");
        OooO00o(bigInteger2, "base");
        if (bigInteger2.compareTo(bigInteger.subtract(f22908OooO00o)) >= 0) {
            throw new IllegalArgumentException("'base' must be < ('candidate' - 1)");
        } else if (bigInteger.bitLength() == 2) {
            return true;
        } else {
            BigInteger subtract = bigInteger.subtract(f22908OooO00o);
            int lowestSetBit = subtract.getLowestSetBit();
            return OooO00o(bigInteger, subtract, subtract.shiftRight(lowestSetBit), lowestSetBit, bigInteger2);
        }
    }

    public static boolean OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, BigInteger bigInteger4) {
        BigInteger modPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (modPow.equals(f22908OooO00o) || modPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            modPow = modPow.modPow(OooO0O0, bigInteger);
            if (modPow.equals(bigInteger2)) {
                return true;
            }
            if (modPow.equals(f22908OooO00o)) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21432OooO00o(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        OooO00o(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        } else if (i < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        } else if (bigInteger.bitLength() == 2) {
            return true;
        } else {
            if (!bigInteger.testBit(0)) {
                return false;
            }
            BigInteger subtract = bigInteger.subtract(f22908OooO00o);
            BigInteger subtract2 = bigInteger.subtract(OooO0O0);
            int lowestSetBit = subtract.getLowestSetBit();
            BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
            for (int i2 = 0; i2 < i; i2++) {
                if (!OooO00o(bigInteger, subtract, shiftRight, lowestSetBit, IIiL.OooO00o(OooO0O0, subtract2, secureRandom))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static OooO0OO OooO0O0(AbstractC6436l11LI r16, int i, byte[] bArr) {
        Object obj;
        int OooO0O02 = r16.OooO0O0();
        Object obj2 = null;
        int i2 = 1;
        if (i < 33) {
            byte[] bArr2 = new byte[OooO0O02];
            byte[] bArr3 = new byte[OooO0O02];
            int i3 = 0;
            do {
                OooO00o(r16, bArr, bArr2, 0);
                OooO00o(bArr, 1);
                OooO00o(r16, bArr, bArr3, 0);
                OooO00o(bArr, 1);
                i3++;
                long OooO00o2 = ((long) (((OooO00o(bArr2) ^ OooO00o(bArr3)) & (-1 >>> (32 - i))) | (1 << (i - 1)) | 1)) & 4294967295L;
                if (OooO00o(OooO00o2)) {
                    return new OooO0OO(BigInteger.valueOf(OooO00o2), bArr, i3);
                }
            } while (i3 <= i * 4);
            throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
        }
        OooO0OO OooO0O03 = OooO0O0(r16, (i + 3) / 2, bArr);
        BigInteger OooO00o3 = OooO0O03.m21434OooO00o();
        byte[] OooO00o4 = OooO0O03.m21435OooO00o();
        int OooO00o5 = OooO0O03.OooO00o();
        int i4 = i - 1;
        int i5 = (i4 / (OooO0O02 * 8)) + 1;
        BigInteger bit = OooO00o(r16, OooO00o4, i5).mod(f22908OooO00o.shiftLeft(i4)).setBit(i4);
        BigInteger shiftLeft = OooO00o3.shiftLeft(1);
        BigInteger shiftLeft2 = bit.subtract(f22908OooO00o).divide(shiftLeft).add(f22908OooO00o).shiftLeft(1);
        BigInteger add = shiftLeft2.multiply(OooO00o3).add(f22908OooO00o);
        int i6 = OooO00o5;
        int i7 = 0;
        while (true) {
            if (add.bitLength() > i) {
                shiftLeft2 = f22908OooO00o.shiftLeft(i4).subtract(f22908OooO00o).divide(shiftLeft).add(f22908OooO00o).shiftLeft(i2);
                add = shiftLeft2.multiply(OooO00o3).add(f22908OooO00o);
            }
            i6 += i2;
            if (!OooO0O0(add)) {
                BigInteger add2 = OooO00o(r16, OooO00o4, i5).mod(add.subtract(OooO0OO)).add(OooO0O0);
                BigInteger add3 = shiftLeft2.add(BigInteger.valueOf((long) i7));
                BigInteger modPow = add2.modPow(add3, add);
                if (add.gcd(modPow.subtract(f22908OooO00o)).equals(f22908OooO00o) && modPow.modPow(OooO00o3, add).equals(f22908OooO00o)) {
                    return new OooO0OO(add, OooO00o4, i6);
                }
                obj = null;
                shiftLeft2 = add3;
                i7 = 0;
            } else {
                obj = obj2;
                OooO00o(OooO00o4, i5);
            }
            if (i6 < (i * 4) + OooO00o5) {
                i7 += 2;
                add = add.add(shiftLeft);
                obj2 = obj;
                i2 = 1;
            } else {
                throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
            }
        }
    }

    public static boolean OooO0O0(BigInteger bigInteger) {
        int intValue = bigInteger.mod(BigInteger.valueOf((long) 223092870)).intValue();
        if (!(intValue % 2 == 0 || intValue % 3 == 0 || intValue % 5 == 0 || intValue % 7 == 0 || intValue % 11 == 0 || intValue % 13 == 0 || intValue % 17 == 0 || intValue % 19 == 0 || intValue % 23 == 0)) {
            int intValue2 = bigInteger.mod(BigInteger.valueOf((long) 58642669)).intValue();
            if (!(intValue2 % 29 == 0 || intValue2 % 31 == 0 || intValue2 % 37 == 0 || intValue2 % 41 == 0 || intValue2 % 43 == 0)) {
                int intValue3 = bigInteger.mod(BigInteger.valueOf((long) 600662303)).intValue();
                if (!(intValue3 % 47 == 0 || intValue3 % 53 == 0 || intValue3 % 59 == 0 || intValue3 % 61 == 0 || intValue3 % 67 == 0)) {
                    int intValue4 = bigInteger.mod(BigInteger.valueOf((long) 33984931)).intValue();
                    if (!(intValue4 % 71 == 0 || intValue4 % 73 == 0 || intValue4 % 79 == 0 || intValue4 % 83 == 0)) {
                        int intValue5 = bigInteger.mod(BigInteger.valueOf((long) 89809099)).intValue();
                        if (!(intValue5 % 89 == 0 || intValue5 % 97 == 0 || intValue5 % 101 == 0 || intValue5 % 103 == 0)) {
                            int intValue6 = bigInteger.mod(BigInteger.valueOf((long) 167375713)).intValue();
                            if (!(intValue6 % 107 == 0 || intValue6 % 109 == 0 || intValue6 % 113 == 0 || intValue6 % 127 == 0)) {
                                int intValue7 = bigInteger.mod(BigInteger.valueOf((long) 371700317)).intValue();
                                if (!(intValue7 % 131 == 0 || intValue7 % 137 == 0 || intValue7 % 139 == 0 || intValue7 % 149 == 0)) {
                                    int intValue8 = bigInteger.mod(BigInteger.valueOf((long) 645328247)).intValue();
                                    if (!(intValue8 % 151 == 0 || intValue8 % 157 == 0 || intValue8 % 163 == 0 || intValue8 % 167 == 0)) {
                                        int intValue9 = bigInteger.mod(BigInteger.valueOf((long) 1070560157)).intValue();
                                        if (!(intValue9 % 173 == 0 || intValue9 % 179 == 0 || intValue9 % 181 == 0 || intValue9 % Lillilli.OooooOo == 0)) {
                                            int intValue10 = bigInteger.mod(BigInteger.valueOf((long) 1596463769)).intValue();
                                            return intValue10 % Lillilli.Oooooo == 0 || intValue10 % Lillilli.ooOO == 0 || intValue10 % 199 == 0 || intValue10 % OooO00o == 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
