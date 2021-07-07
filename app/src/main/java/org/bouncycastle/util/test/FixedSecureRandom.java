package org.bouncycastle.util.test;

import com.p118pd.sdk.AbstractC6464l1l;
import com.p118pd.sdk.C6472l1l1l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;

public class FixedSecureRandom extends SecureRandom {
    public static BigInteger OooO00o = new BigInteger("01020304ffffffff0506070811111111", 16);
    public static BigInteger OooO0O0 = new BigInteger("1111111105060708ffffffff01020304", 16);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final boolean f23984OooO0O0;
    public static BigInteger OooO0OO = new BigInteger("3020104ffffffff05060708111111", 16);

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final boolean f23985OooO0OO;
    public static final boolean OooO0Oo;
    public byte[] _data;
    public int _index;

    public static class DummyProvider extends Provider {
        public DummyProvider() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class OooO00o extends OooO0OO {
        public OooO00o(int i, String str) {
            super(FixedSecureRandom.OooO00o(i, C6472l1l1l.OooO00o(str)));
        }

        public OooO00o(int i, byte[] bArr) {
            super(FixedSecureRandom.OooO00o(i, bArr));
        }

        public OooO00o(String str) {
            this(C6472l1l1l.OooO00o(str));
        }

        public OooO00o(byte[] bArr) {
            super(bArr);
        }
    }

    public static class OooO0O0 extends OooO0OO {
        public OooO0O0(byte[] bArr) {
            super(bArr);
        }
    }

    public static class OooO0OO {
        public byte[] OooO00o;

        public OooO0OO(byte[] bArr) {
            this.OooO00o = bArr;
        }
    }

    public static class RandomChecker extends SecureRandom {
        public byte[] data = C6472l1l1l.OooO00o("01020304ffffffff0506070811111111");
        public int index = 0;

        public RandomChecker() {
            super(null, new DummyProvider());
        }

        public void nextBytes(byte[] bArr) {
            System.arraycopy(this.data, this.index, bArr, 0, bArr.length);
            this.index += bArr.length;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(128, new RandomChecker());
        BigInteger bigInteger2 = new BigInteger(120, new RandomChecker());
        f23984OooO0O0 = bigInteger.equals(OooO0O0);
        OooO0Oo = bigInteger.equals(OooO00o);
        f23985OooO0OO = bigInteger2.equals(OooO0OO);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new OooO0OO[]{new OooO0O0(bArr)});
    }

    public FixedSecureRandom(OooO0OO[] oooO0OOArr) {
        super(null, new DummyProvider());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        if (OooO0Oo) {
            if (f23985OooO0OO) {
                while (i != oooO0OOArr.length) {
                    try {
                        if (oooO0OOArr[i] instanceof OooO00o) {
                            byte[] bArr = oooO0OOArr[i].OooO00o;
                            int length = bArr.length - (bArr.length % 4);
                            for (int length2 = (bArr.length - length) - 1; length2 >= 0; length2--) {
                                byteArrayOutputStream.write(bArr[length2]);
                            }
                            for (int length3 = bArr.length - length; length3 < bArr.length; length3 += 4) {
                                byteArrayOutputStream.write(bArr, length3, 4);
                            }
                        } else {
                            byteArrayOutputStream.write(oooO0OOArr[i].OooO00o);
                        }
                        i++;
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            } else {
                while (i != oooO0OOArr.length) {
                    try {
                        byteArrayOutputStream.write(oooO0OOArr[i].OooO00o);
                        i++;
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            }
        } else if (f23984OooO0O0) {
            for (int i2 = 0; i2 != oooO0OOArr.length; i2++) {
                try {
                    if (oooO0OOArr[i2] instanceof OooO00o) {
                        byte[] bArr2 = oooO0OOArr[i2].OooO00o;
                        int length4 = bArr2.length - (bArr2.length % 4);
                        int i3 = 0;
                        while (i3 < length4) {
                            i3 += 4;
                            byteArrayOutputStream.write(bArr2, bArr2.length - i3, 4);
                        }
                        if (bArr2.length - length4 != 0) {
                            for (int i4 = 0; i4 != 4 - (bArr2.length - length4); i4++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i5 = 0; i5 != bArr2.length - length4; i5++) {
                            byteArrayOutputStream.write(bArr2[length4 + i5]);
                        }
                    } else {
                        byteArrayOutputStream.write(oooO0OOArr[i2].OooO00o);
                    }
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            throw new IllegalStateException("Unrecognized BigInteger implementation");
        }
        this._data = byteArrayOutputStream.toByteArray();
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(OooO00o(bArr));
    }

    private int OooO00o() {
        byte[] bArr = this._data;
        int i = this._index;
        this._index = i + 1;
        return bArr[i] & 255;
    }

    public static byte[] OooO00o(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = (i + 7) / 8;
        if (i4 > bArr.length) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
            if (f23984OooO0O0 && (i3 = i % 8) != 0) {
                AbstractC6464l1l.OooO00o(AbstractC6464l1l.OooO00o(bArr2, 0) << (8 - i3), bArr2, 0);
            }
            return bArr2;
        }
        if (f23984OooO0O0 && i < bArr.length * 8 && (i2 = i % 8) != 0) {
            AbstractC6464l1l.OooO00o(AbstractC6464l1l.OooO00o(bArr, 0) << (8 - i2), bArr, 0);
        }
        return bArr;
    }

    public static OooO0O0[] OooO00o(byte[][] bArr) {
        OooO0O0[] oooO0O0Arr = new OooO0O0[bArr.length];
        for (int i = 0; i != bArr.length; i++) {
            oooO0O0Arr[i] = new OooO0O0(bArr[i]);
        }
        return oooO0O0Arr;
    }

    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    public int nextInt() {
        return (OooO00o() << 24) | 0 | (OooO00o() << 16) | (OooO00o() << 8) | OooO00o();
    }

    public long nextLong() {
        return (((long) OooO00o()) << 56) | 0 | (((long) OooO00o()) << 48) | (((long) OooO00o()) << 40) | (((long) OooO00o()) << 32) | (((long) OooO00o()) << 24) | (((long) OooO00o()) << 16) | (((long) OooO00o()) << 8) | ((long) OooO00o());
    }
}
