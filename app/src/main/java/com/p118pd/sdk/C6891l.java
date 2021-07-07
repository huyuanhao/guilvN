package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l丨丨  reason: invalid class name and case insensitive filesystem */
public class C6891l {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18981OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18982OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18983OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18984OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f18985OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f18986OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public C6891l() {
        this(C5427IlI1.OooO0O0());
    }

    public C6891l(AbstractC6436l11LI r1) {
        this.f18982OooO00o = r1;
    }

    public static int OooO00o(int i) {
        return i > 1024 ? 256 : 160;
    }

    public static BigInteger OooO00o(AbstractC6436l11LI r6, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
        BigInteger divide = bigInteger.subtract(OooO0O0).divide(bigInteger2);
        byte[] OooO00o2 = C6472l1l1l.OooO00o("6767656E");
        int length = bArr.length + OooO00o2.length + 1 + 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(OooO00o2, 0, bArr2, bArr.length, OooO00o2.length);
        bArr2[length - 3] = (byte) i;
        byte[] bArr3 = new byte[r6.OooO0O0()];
        for (int i2 = 1; i2 < 65536; i2++) {
            OooO00o(bArr2);
            OooO00o(r6, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(OooO0OO) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(OooO0O0).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(OooO0OO);
        do {
            modPow = IIiL.OooO00o(OooO0OO, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    public static void OooO00o(AbstractC6436l11LI r2, byte[] bArr, byte[] bArr2, int i) {
        r2.update(bArr, 0, bArr.length);
        r2.OooO00o(bArr2, i);
    }

    public static void OooO00o(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private boolean OooO00o(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.f18986OooO0OO);
    }

    public static int OooO0O0(int i) {
        if (i <= 1024) {
            return 40;
        }
        return (((i - 1) / 1024) * 8) + 48;
    }

    private L1llLl1 OooO0O0() {
        int i = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i2 = this.f18981OooO00o;
        int i3 = (i2 - 1) / 160;
        int i4 = i2 / 8;
        byte[] bArr5 = new byte[i4];
        if (this.f18982OooO00o instanceof C6461l1liI) {
            while (true) {
                this.f18983OooO00o.nextBytes(bArr);
                OooO00o(this.f18982OooO00o, bArr, bArr2, 0);
                System.arraycopy(bArr, 0, bArr3, 0, i);
                OooO00o(bArr3);
                OooO00o(this.f18982OooO00o, bArr3, bArr3, 0);
                for (int i5 = 0; i5 != i; i5++) {
                    bArr4[i5] = (byte) (bArr2[i5] ^ bArr3[i5]);
                }
                bArr4[0] = (byte) (bArr4[0] | O0O00O.OooO00o);
                bArr4[19] = (byte) (bArr4[19] | 1);
                BigInteger bigInteger = new BigInteger(1, bArr4);
                if (OooO00o(bigInteger)) {
                    byte[] OooO00o2 = C9586iIILl.m21630OooO00o(bArr);
                    OooO00o(OooO00o2);
                    int i6 = 0;
                    while (i6 < 4096) {
                        for (int i7 = 1; i7 <= i3; i7++) {
                            OooO00o(OooO00o2);
                            OooO00o(this.f18982OooO00o, OooO00o2, bArr5, i4 - (i7 * 20));
                        }
                        int i8 = i4 - (i3 * 20);
                        OooO00o(OooO00o2);
                        OooO00o(this.f18982OooO00o, OooO00o2, bArr2, 0);
                        System.arraycopy(bArr2, 20 - i8, bArr5, 0, i8);
                        bArr5[0] = (byte) (bArr5[0] | O0O00O.OooO00o);
                        BigInteger bigInteger2 = new BigInteger(1, bArr5);
                        BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(OooO0O0));
                        if (subtract.bitLength() == this.f18981OooO00o && OooO00o(subtract)) {
                            return new L1llLl1(subtract, bigInteger, OooO00o(subtract, bigInteger, this.f18983OooO00o), new C5561Ili(bArr, i6));
                        }
                        i6++;
                        i = 20;
                    }
                    continue;
                }
            }
        } else {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
    }

    public static BigInteger OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return OooO00o(bigInteger, bigInteger2, secureRandom);
    }

    private L1llLl1 OooO0OO() {
        BigInteger bit;
        int i;
        BigInteger subtract;
        BigInteger OooO00o2;
        AbstractC6436l11LI r1 = this.f18982OooO00o;
        int OooO0O02 = r1.OooO0O0() * 8;
        byte[] bArr = new byte[(this.f18985OooO0O0 / 8)];
        int i2 = this.f18981OooO00o;
        int i3 = (i2 - 1) / OooO0O02;
        int i4 = (i2 - 1) % OooO0O02;
        int i5 = i2 / 8;
        byte[] bArr2 = new byte[i5];
        int OooO0O03 = r1.OooO0O0();
        byte[] bArr3 = new byte[OooO0O03];
        loop0:
        while (true) {
            this.f18983OooO00o.nextBytes(bArr);
            int i6 = 0;
            OooO00o(r1, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(OooO0O0.shiftLeft(this.f18985OooO0O0 - 1)).setBit(0).setBit(this.f18985OooO0O0 - 1);
            if (OooO00o(bit)) {
                byte[] OooO00o3 = C9586iIILl.m21630OooO00o(bArr);
                int i7 = this.f18981OooO00o * 4;
                i = 0;
                while (i < i7) {
                    for (int i8 = 1; i8 <= i3; i8++) {
                        OooO00o(OooO00o3);
                        OooO00o(r1, OooO00o3, bArr2, i5 - (i8 * OooO0O03));
                    }
                    int i9 = i5 - (i3 * OooO0O03);
                    OooO00o(OooO00o3);
                    OooO00o(r1, OooO00o3, bArr3, i6);
                    System.arraycopy(bArr3, OooO0O03 - i9, bArr2, i6, i9);
                    bArr2[i6] = (byte) (bArr2[i6] | O0O00O.OooO00o);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(OooO0O0));
                    if (subtract.bitLength() == this.f18981OooO00o && OooO00o(subtract)) {
                        break loop0;
                    }
                    i++;
                    i6 = 0;
                }
                continue;
            }
        }
        int i10 = this.OooO0o0;
        return (i10 < 0 || (OooO00o2 = OooO00o(r1, subtract, bit, bArr, i10)) == null) ? new L1llLl1(subtract, bit, OooO0O0(subtract, bit, this.f18983OooO00o), new C5561Ili(bArr, i)) : new L1llLl1(subtract, bit, OooO00o2, new C5561Ili(bArr, i, this.OooO0o0));
    }

    public L1llLl1 OooO00o() {
        return this.f18984OooO00o ? OooO0OO() : OooO0O0();
    }

    public void OooO00o(int i, int i2, SecureRandom secureRandom) {
        this.f18981OooO00o = i;
        this.f18985OooO0O0 = OooO00o(i);
        this.f18986OooO0OO = i2;
        this.OooO0Oo = Math.max(OooO0O0(this.f18981OooO00o), (i2 + 1) / 2);
        this.f18983OooO00o = secureRandom;
        this.f18984OooO00o = false;
        this.OooO0o0 = -1;
    }

    public void OooO00o(IiLiII r6) {
        int OooO0O02 = r6.OooO0O0();
        int OooO0OO2 = r6.OooO0OO();
        if (OooO0O02 < 1024 || OooO0O02 > 3072 || OooO0O02 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        } else if (OooO0O02 == 1024 && OooO0OO2 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        } else if (OooO0O02 == 2048 && OooO0OO2 != 224 && OooO0OO2 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        } else if (OooO0O02 == 3072 && OooO0OO2 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        } else if (this.f18982OooO00o.OooO0O0() * 8 >= OooO0OO2) {
            this.f18981OooO00o = OooO0O02;
            this.f18985OooO0O0 = OooO0OO2;
            this.f18986OooO0OO = r6.OooO00o();
            this.OooO0Oo = Math.max(OooO0O0(OooO0O02), (this.f18986OooO0OO + 1) / 2);
            this.f18983OooO00o = r6.m15596OooO00o();
            this.f18984OooO00o = true;
            this.OooO0o0 = r6.OooO0Oo();
        } else {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
    }
}
