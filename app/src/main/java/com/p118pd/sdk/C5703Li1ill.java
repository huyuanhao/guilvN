package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.Li1丨ill  reason: invalid class name and case insensitive filesystem */
public class C5703Li1ill implements Ii1IliL {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f16580OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1IIl1 f16581OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16582OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16583OooO00o;

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        return this.f16583OooO00o ? (this.f16580OooO00o - 1) / 8 : ((this.f16580OooO00o + 7) / 8) * 2;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        SecureRandom secureRandom;
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            this.f16581OooO00o = (ii1IIl1) r32.OooO00o();
            secureRandom = r32.m17752OooO00o();
        } else {
            this.f16581OooO00o = (ii1IIl1) r3;
            secureRandom = IIllii.OooO00o();
        }
        this.f16582OooO00o = secureRandom;
        this.f16583OooO00o = z;
        this.f16580OooO00o = this.f16581OooO00o.OooO00o().OooO0O0().bitLength();
        if (z) {
            if (!(this.f16581OooO00o instanceof i1I1L)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f16581OooO00o instanceof C6336illiIil)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.f16581OooO00o != null) {
            if (i2 <= (this.f16583OooO00o ? ((this.f16580OooO00o - 1) + 7) / 8 : OooO00o())) {
                BigInteger OooO0O02 = this.f16581OooO00o.OooO00o().OooO0O0();
                if (this.f16581OooO00o instanceof C6336illiIil) {
                    int i3 = i2 / 2;
                    byte[] bArr2 = new byte[i3];
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    System.arraycopy(bArr, i + i3, bArr3, 0, i3);
                    return IIiL.OooO00o(new BigInteger(1, bArr2).modPow(OooO0O02.subtract(OooO0O0).subtract(((C6336illiIil) this.f16581OooO00o).OooO00o()), OooO0O02).multiply(new BigInteger(1, bArr3)).mod(OooO0O02));
                }
                if (!(i == 0 && i2 == bArr.length)) {
                    byte[] bArr4 = new byte[i2];
                    System.arraycopy(bArr, i, bArr4, 0, i2);
                    bArr = bArr4;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (bigInteger.compareTo(OooO0O02) < 0) {
                    i1I1L r7 = (i1I1L) this.f16581OooO00o;
                    int bitLength = OooO0O02.bitLength();
                    BigInteger bigInteger2 = new BigInteger(bitLength, this.f16582OooO00o);
                    while (true) {
                        if (!bigInteger2.equals(OooO00o) && bigInteger2.compareTo(OooO0O02.subtract(OooO0OO)) <= 0) {
                            break;
                        }
                        bigInteger2 = new BigInteger(bitLength, this.f16582OooO00o);
                    }
                    BigInteger modPow = this.f16581OooO00o.OooO00o().m15512OooO00o().modPow(bigInteger2, OooO0O02);
                    BigInteger mod = bigInteger.multiply(r7.OooO00o().modPow(bigInteger2, OooO0O02)).mod(OooO0O02);
                    byte[] byteArray = modPow.toByteArray();
                    byte[] byteArray2 = mod.toByteArray();
                    int OooO0O03 = OooO0O0();
                    byte[] bArr5 = new byte[OooO0O03];
                    int i4 = OooO0O03 / 2;
                    if (byteArray.length > i4) {
                        System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
                    } else {
                        System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
                    }
                    if (byteArray2.length > i4) {
                        System.arraycopy(byteArray2, 1, bArr5, OooO0O03 - (byteArray2.length - 1), byteArray2.length - 1);
                    } else {
                        System.arraycopy(byteArray2, 0, bArr5, OooO0O03 - byteArray2.length, byteArray2.length);
                    }
                    return bArr5;
                }
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        throw new IllegalStateException("ElGamal engine not initialised");
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        return this.f16583OooO00o ? ((this.f16580OooO00o + 7) / 8) * 2 : (this.f16580OooO00o - 1) / 8;
    }
}
