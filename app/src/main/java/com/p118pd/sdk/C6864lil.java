package com.p118pd.sdk;

import com.p118pd.sdk.OooOOO;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l丨il  reason: invalid class name and case insensitive filesystem */
public class C6864lil {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18943OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18944OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f18945OooO0O0;

    private int OooO00o(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i4 = i;
        while (true) {
            if (i4 >= 0 && i4 <= 65536) {
                break;
            }
            i4 = this.f18944OooO00o.nextInt() / 32768;
        }
        int i5 = i2;
        while (true) {
            if (i5 >= 0 && i5 <= 65536 && i5 / 2 != 0) {
                break;
            }
            i5 = (this.f18944OooO00o.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger2 = new BigInteger(Integer.toString(i5));
        BigInteger bigInteger3 = new BigInteger("19381");
        BigInteger bigInteger4 = new BigInteger(Integer.toString(i4));
        int i6 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger4};
        int[] iArr = {i3};
        int i7 = 0;
        int i8 = 0;
        while (iArr[i7] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i8 = i7 + 1;
            iArr[i8] = iArr[i7] / 2;
            i7 = i8;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[(i8 + 1)];
        int i9 = 16;
        bigIntegerArr4[i8] = new BigInteger("8003", 16);
        int i10 = i8 - 1;
        int i11 = 0;
        while (true) {
            if (i11 >= i8) {
                bigInteger = bigIntegerArr3[0];
                break;
            }
            int i12 = iArr[i10] / i9;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i6, bigIntegerArr5, i6, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[(i12 + 1)];
                System.arraycopy(bigIntegerArr5, i6, bigIntegerArr2, i6, length2);
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i13 + 1;
                    bigIntegerArr2[i14] = bigIntegerArr2[i13].multiply(bigInteger3).add(bigInteger2).mod(OooO0O0.pow(i9));
                    i13 = i14;
                }
                BigInteger bigInteger5 = new BigInteger("0");
                for (int i15 = 0; i15 < i12; i15++) {
                    bigInteger5 = bigInteger5.add(bigIntegerArr2[i15].multiply(OooO0O0.pow(i15 * 16)));
                }
                bigIntegerArr2[i6] = bigIntegerArr2[i12];
                int i16 = i10 + 1;
                BigInteger add = OooO0O0.pow(iArr[i10] - 1).divide(bigIntegerArr4[i16]).add(OooO0O0.pow(iArr[i10] - 1).multiply(bigInteger5).divide(bigIntegerArr4[i16].multiply(OooO0O0.pow(i12 * 16))));
                if (add.mod(OooO0O0).compareTo(OooO00o) == 0) {
                    add = add.add(OooO00o);
                }
                int i17 = 0;
                while (true) {
                    long j = (long) i17;
                    bigIntegerArr4[i10] = bigIntegerArr4[i16].multiply(add.add(BigInteger.valueOf(j))).add(OooO00o);
                    if (bigIntegerArr4[i10].compareTo(OooO0O0.pow(iArr[i10])) == 1) {
                        break;
                    }
                    if (OooO0O0.modPow(bigIntegerArr4[i16].multiply(add.add(BigInteger.valueOf(j))), bigIntegerArr4[i10]).compareTo(OooO00o) == 0 && OooO0O0.modPow(add.add(BigInteger.valueOf(j)), bigIntegerArr4[i10]).compareTo(OooO00o) != 0) {
                        break;
                    }
                    i17 += 2;
                    bigInteger2 = bigInteger2;
                    bigInteger3 = bigInteger3;
                }
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger2 = bigInteger2;
                bigInteger3 = bigInteger3;
                i6 = 0;
                i9 = 16;
            }
            i10--;
            if (i10 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i11++;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger2 = bigInteger2;
            bigInteger3 = bigInteger3;
            i6 = 0;
            i9 = 16;
        }
        return bigInteger.intValue();
    }

    private long OooO00o(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= OooOOO.OooO0OO.OooO00o) {
                break;
            }
            j3 = (long) (this.f18944OooO00o.nextInt() * 2);
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= OooOOO.OooO0OO.OooO00o && j4 / 2 != 0) {
                break;
            }
            j4 = (long) ((this.f18944OooO00o.nextInt() * 2) + 1);
        }
        BigInteger bigInteger2 = new BigInteger(Long.toString(j4));
        BigInteger bigInteger3 = new BigInteger("97781173");
        BigInteger bigInteger4 = new BigInteger(Long.toString(j3));
        int i2 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger4};
        int[] iArr = {i};
        int i3 = 0;
        int i4 = 0;
        while (iArr[i3] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i4 = i3 + 1;
            iArr[i4] = iArr[i3] / 2;
            i3 = i4;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[(i4 + 1)];
        bigIntegerArr4[i4] = new BigInteger("8000000B", 16);
        int i5 = i4 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i4) {
                bigInteger = bigIntegerArr3[0];
                break;
            }
            int i7 = 32;
            int i8 = iArr[i5] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i2, bigIntegerArr5, i2, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[(i8 + 1)];
                System.arraycopy(bigIntegerArr5, i2, bigIntegerArr2, i2, length2);
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9 + 1;
                    bigIntegerArr2[i10] = bigIntegerArr2[i9].multiply(bigInteger3).add(bigInteger2).mod(OooO0O0.pow(i7));
                    i9 = i10;
                }
                BigInteger bigInteger5 = new BigInteger("0");
                for (int i11 = 0; i11 < i8; i11++) {
                    bigInteger5 = bigInteger5.add(bigIntegerArr2[i11].multiply(OooO0O0.pow(i11 * 32)));
                }
                bigIntegerArr2[i2] = bigIntegerArr2[i8];
                int i12 = i5 + 1;
                BigInteger add = OooO0O0.pow(iArr[i5] - 1).divide(bigIntegerArr4[i12]).add(OooO0O0.pow(iArr[i5] - 1).multiply(bigInteger5).divide(bigIntegerArr4[i12].multiply(OooO0O0.pow(i8 * 32))));
                if (add.mod(OooO0O0).compareTo(OooO00o) == 0) {
                    add = add.add(OooO00o);
                }
                int i13 = 0;
                while (true) {
                    long j5 = (long) i13;
                    bigIntegerArr4[i5] = bigIntegerArr4[i12].multiply(add.add(BigInteger.valueOf(j5))).add(OooO00o);
                    if (bigIntegerArr4[i5].compareTo(OooO0O0.pow(iArr[i5])) == 1) {
                        break;
                    }
                    if (OooO0O0.modPow(bigIntegerArr4[i12].multiply(add.add(BigInteger.valueOf(j5))), bigIntegerArr4[i5]).compareTo(OooO00o) == 0 && OooO0O0.modPow(add.add(BigInteger.valueOf(j5)), bigIntegerArr4[i5]).compareTo(OooO00o) != 0) {
                        break;
                    }
                    i13 += 2;
                    bigInteger2 = bigInteger2;
                    bigInteger3 = bigInteger3;
                }
                bigInteger2 = bigInteger2;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger3 = bigInteger3;
                i2 = 0;
                i7 = 32;
            }
            i5--;
            if (i5 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i6++;
            bigInteger2 = bigInteger2;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger3 = bigInteger3;
            i2 = 0;
        }
        return bigInteger.longValue();
    }

    private BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(OooO00o);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(bitLength, this.f18944OooO00o);
            if (bigInteger3.compareTo(OooO00o) > 0 && bigInteger3.compareTo(subtract) < 0) {
                BigInteger modPow = bigInteger3.modPow(divide, bigInteger);
                if (modPow.compareTo(OooO00o) != 0) {
                    return modPow;
                }
            }
        }
    }

    private void OooO00o(int i, int i2, BigInteger[] bigIntegerArr) {
        int i3 = i;
        while (true) {
            if (i3 >= 0 && i3 <= 65536) {
                break;
            }
            i3 = this.f18944OooO00o.nextInt() / 32768;
        }
        int i4 = i2;
        while (true) {
            if (i4 >= 0 && i4 <= 65536 && i4 / 2 != 0) {
                break;
            }
            i4 = (this.f18944OooO00o.nextInt() / 32768) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i4));
        BigInteger bigInteger2 = new BigInteger("19381");
        int OooO00o2 = OooO00o(i3, i4, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int OooO00o3 = OooO00o(OooO00o2, i4, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(OooO00o3));
        while (true) {
            int i5 = 0;
            while (i5 < 64) {
                int i6 = i5 + 1;
                bigIntegerArr3[i6] = bigIntegerArr3[i5].multiply(bigInteger2).add(bigInteger).mod(OooO0O0.pow(16));
                i5 = i6;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i7 = 0; i7 < 64; i7++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i7].multiply(OooO0O0.pow(i7 * 16)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[64];
            int i8 = 1024;
            BigInteger add = OooO0O0.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(OooO0O0.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(OooO0O0.pow(1024))));
            if (add.mod(OooO0O0).compareTo(OooO00o) == 0) {
                add = add.add(OooO00o);
            }
            int i9 = 0;
            while (true) {
                long j = (long) i9;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j))).add(OooO00o);
                if (add2.compareTo(OooO0O0.pow(i8)) != 1) {
                    if (OooO0O0.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j))), add2).compareTo(OooO00o) != 0 || OooO0O0.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j))), add2).compareTo(OooO00o) == 0) {
                        i9 += 2;
                        i8 = 1024;
                    } else {
                        bigIntegerArr[0] = add2;
                        bigIntegerArr[1] = bigInteger3;
                        return;
                    }
                }
            }
        }
    }

    private void OooO00o(long j, long j2, BigInteger[] bigIntegerArr) {
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= OooOOO.OooO0OO.OooO00o) {
                break;
            }
            j3 = (long) (this.f18944OooO00o.nextInt() * 2);
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= OooOOO.OooO0OO.OooO00o && j4 / 2 != 0) {
                break;
            }
            j4 = (long) ((this.f18944OooO00o.nextInt() * 2) + 1);
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j4));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long OooO00o2 = OooO00o(j3, j4, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long OooO00o3 = OooO00o(OooO00o2, j4, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(OooO00o3));
        while (true) {
            int i = 0;
            while (i < 32) {
                int i2 = i + 1;
                bigIntegerArr3[i2] = bigIntegerArr3[i].multiply(bigInteger2).add(bigInteger).mod(OooO0O0.pow(32));
                i = i2;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i3 = 0; i3 < 32; i3++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i3].multiply(OooO0O0.pow(i3 * 32)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[32];
            int i4 = 1024;
            BigInteger add = OooO0O0.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(OooO0O0.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(OooO0O0.pow(1024))));
            if (add.mod(OooO0O0).compareTo(OooO00o) == 0) {
                add = add.add(OooO00o);
            }
            int i5 = 0;
            while (true) {
                long j5 = (long) i5;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j5))).add(OooO00o);
                if (add2.compareTo(OooO0O0.pow(i4)) != 1) {
                    if (OooO0O0.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j5))), add2).compareTo(OooO00o) != 0 || OooO0O0.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j5))), add2).compareTo(OooO00o) == 0) {
                        i5 += 2;
                        i4 = 1024;
                    } else {
                        bigIntegerArr[0] = add2;
                        bigIntegerArr[1] = bigInteger3;
                        return;
                    }
                }
            }
        }
    }

    public Ii1lIl OooO00o() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.f18945OooO0O0 == 1) {
            int nextInt = this.f18944OooO00o.nextInt();
            int nextInt2 = this.f18944OooO00o.nextInt();
            int i = this.f18943OooO00o;
            if (i == 512) {
                OooO00o(nextInt, nextInt2, bigIntegerArr, 512);
            } else if (i == 1024) {
                OooO00o(nextInt, nextInt2, bigIntegerArr);
            } else {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new Ii1lIl(bigInteger, bigInteger2, OooO00o(bigInteger, bigInteger2), new iIIiLli(nextInt, nextInt2));
        }
        long nextLong = this.f18944OooO00o.nextLong();
        long nextLong2 = this.f18944OooO00o.nextLong();
        int i2 = this.f18943OooO00o;
        if (i2 == 512) {
            OooO00o(nextLong, nextLong2, bigIntegerArr, 512);
        } else if (i2 == 1024) {
            OooO00o(nextLong, nextLong2, bigIntegerArr);
        } else {
            throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new Ii1lIl(bigInteger3, bigInteger4, OooO00o(bigInteger3, bigInteger4), new iIIiLli(nextLong, nextLong2));
    }

    public void OooO00o(int i, int i2, SecureRandom secureRandom) {
        this.f18943OooO00o = i;
        this.f18945OooO0O0 = i2;
        this.f18944OooO00o = secureRandom;
    }
}
