package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;
import java.math.BigInteger;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LL丨丨  reason: invalid class name and case insensitive filesystem */
public class C5693LL implements Ii1IliL {
    public static byte[] OooO00o = {C3587az.f9268l, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    public static final BigInteger OooO0O0 = BigInteger.valueOf(16);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static byte[] f16539OooO0O0 = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, C3587az.f9268l, 9, 0, 7};
    public static final BigInteger OooO0OO = BigInteger.valueOf(6);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f16540OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f16541OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16542OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16543OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f16544OooO0O0 = 0;

    public C5693LL(Ii1IliL r2) {
        this.f16541OooO00o = r2;
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

    private byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] OooO00o2 = this.f16541OooO00o.OooO00o(bArr, i, i2);
        int i3 = (this.f16540OooO00o + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, OooO00o2);
        if (!bigInteger.mod(OooO0O0).equals(OooO0OO)) {
            if (this.f16542OooO00o.subtract(bigInteger).mod(OooO0O0).equals(OooO0OO)) {
                bigInteger = this.f16542OooO00o.subtract(bigInteger);
            } else {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
        }
        byte[] OooO00o3 = OooO00o(bigInteger);
        if ((OooO00o3[OooO00o3.length - 1] & 15) == 6) {
            OooO00o3[OooO00o3.length - 1] = (byte) (((OooO00o3[OooO00o3.length - 1] & 255) >>> 4) | (f16539OooO0O0[(OooO00o3[OooO00o3.length - 2] & 255) >> 4] << 4));
            byte[] bArr2 = OooO00o;
            OooO00o3[0] = (byte) (bArr2[OooO00o3[1] & 15] | (bArr2[(OooO00o3[1] & 255) >>> 4] << 4));
            int i4 = 0;
            boolean z = false;
            int i5 = 1;
            for (int length = OooO00o3.length - 1; length >= OooO00o3.length - (i3 * 2); length -= 2) {
                byte[] bArr3 = OooO00o;
                int i6 = bArr3[OooO00o3[length] & 15] | (bArr3[(OooO00o3[length] & 255) >>> 4] << 4);
                int i7 = length - 1;
                if (((OooO00o3[i7] ^ i6) & 255) != 0) {
                    if (!z) {
                        i5 = (OooO00o3[i7] ^ i6) & 255;
                        i4 = i7;
                        z = true;
                    } else {
                        throw new InvalidCipherTextException("invalid tsums in block");
                    }
                }
            }
            OooO00o3[i4] = 0;
            int length2 = (OooO00o3.length - i4) / 2;
            byte[] bArr4 = new byte[length2];
            for (int i8 = 0; i8 < length2; i8++) {
                bArr4[i8] = OooO00o3[(i8 * 2) + i4 + 1];
            }
            this.f16544OooO0O0 = i5 - 1;
            return bArr4;
        }
        throw new InvalidCipherTextException("invalid forcing byte in block");
    }

    private byte[] OooO0OO(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int i3 = this.f16540OooO00o;
        int i4 = (i3 + 7) / 8;
        byte[] bArr2 = new byte[i4];
        int i5 = 1;
        int i6 = this.f16544OooO0O0 + 1;
        int i7 = (i3 + 13) / 16;
        int i8 = 0;
        while (i8 < i7) {
            if (i8 > i7 - i2) {
                int i9 = i7 - i8;
                System.arraycopy(bArr, (i + i2) - i9, bArr2, i4 - i7, i9);
            } else {
                System.arraycopy(bArr, i, bArr2, i4 - (i8 + i2), i2);
            }
            i8 += i2;
        }
        for (int i10 = i4 - (i7 * 2); i10 != i4; i10 += 2) {
            byte b = bArr2[(i4 - i7) + (i10 / 2)];
            byte[] bArr3 = OooO00o;
            bArr2[i10] = (byte) (bArr3[b & 15] | (bArr3[(b & 255) >>> 4] << 4));
            bArr2[i10 + 1] = b;
        }
        int i11 = i4 - (i2 * 2);
        bArr2[i11] = (byte) (bArr2[i11] ^ i6);
        int i12 = i4 - 1;
        bArr2[i12] = (byte) ((bArr2[i12] << 4) | 6);
        int i13 = 8 - ((this.f16540OooO00o - 1) % 8);
        if (i13 != 8) {
            bArr2[0] = (byte) (bArr2[0] & (255 >>> i13));
            bArr2[0] = (byte) ((128 >>> i13) | bArr2[0]);
            i5 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | O0O00O.OooO00o);
        }
        return this.f16541OooO00o.OooO00o(bArr2, i5, i4 - i5);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        int OooO00o2 = this.f16541OooO00o.OooO00o();
        return this.f16543OooO00o ? (OooO00o2 + 1) / 2 : OooO00o2;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ii1IliL m16272OooO00o() {
        return this.f16541OooO00o;
    }

    public void OooO00o(int i) {
        if (i <= 7) {
            this.f16544OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("padBits > 7");
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        liLI1l1i lili1l1i = r4 instanceof liLL1l ? (liLI1l1i) ((liLL1l) r4).OooO00o() : (liLI1l1i) r4;
        this.f16541OooO00o.OooO00o(z, r4);
        BigInteger OooO0O02 = lili1l1i.OooO0O0();
        this.f16542OooO00o = OooO0O02;
        this.f16540OooO00o = OooO0O02.bitLength();
        this.f16543OooO00o = z;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.f16543OooO00o ? OooO0OO(bArr, i, i2) : OooO0O0(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        int OooO0O02 = this.f16541OooO00o.OooO0O0();
        return this.f16543OooO00o ? OooO0O02 : (OooO0O02 + 1) / 2;
    }

    public int OooO0OO() {
        return this.f16544OooO0O0;
    }
}
