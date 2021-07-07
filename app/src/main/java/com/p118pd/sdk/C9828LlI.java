package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨丨L丨lI  reason: invalid class name and case insensitive filesystem */
public class C9828LlI {
    public liLI1l1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23426OooO00o;

    public int OooO00o() {
        int bitLength = (this.OooO00o.OooO0O0().bitLength() + 7) / 8;
        return this.f23426OooO00o ? bitLength - 1 : bitLength;
    }

    public BigInteger OooO00o(BigInteger bigInteger) {
        liLI1l1i lili1l1i = this.OooO00o;
        if (!(lili1l1i instanceof C11lI)) {
            return bigInteger.modPow(lili1l1i.OooO00o(), this.OooO00o.OooO0O0());
        }
        C11lI r0 = (C11lI) lili1l1i;
        BigInteger OooO0o0 = r0.OooO0o0();
        BigInteger OooO0oO = r0.OooO0oO();
        BigInteger OooO0OO = r0.OooO0OO();
        BigInteger OooO0Oo = r0.OooO0Oo();
        BigInteger OooO0oo = r0.OooO0oo();
        BigInteger modPow = bigInteger.remainder(OooO0o0).modPow(OooO0OO, OooO0o0);
        BigInteger modPow2 = bigInteger.remainder(OooO0oO).modPow(OooO0Oo, OooO0oO);
        return modPow.subtract(modPow2).multiply(OooO0oo).mod(OooO0o0).multiply(OooO0oO).add(modPow2);
    }

    public BigInteger OooO00o(byte[] bArr, int i, int i2) {
        if (i2 > OooO00o() + 1) {
            throw new DataLengthException("input too large for RSA cipher.");
        } else if (i2 != OooO00o() + 1 || this.f23426OooO00o) {
            if (!(i == 0 && i2 == bArr.length)) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.OooO00o.OooO0O0()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for RSA cipher.");
        } else {
            throw new DataLengthException("input too large for RSA cipher.");
        }
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        if (r3 instanceof liLL1l) {
            r3 = ((liLL1l) r3).OooO00o();
        }
        this.OooO00o = (liLI1l1i) r3;
        this.f23426OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21919OooO00o(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.f23426OooO00o) {
            if (byteArray[0] == 0 && byteArray.length > OooO0O0()) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            } else if (byteArray.length < OooO0O0()) {
                int OooO0O0 = OooO0O0();
                byte[] bArr2 = new byte[OooO0O0];
                System.arraycopy(byteArray, 0, bArr2, OooO0O0 - byteArray.length, byteArray.length);
                return bArr2;
            }
        } else if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray, 1, bArr3, 0, length2);
            return bArr3;
        }
        return byteArray;
    }

    public int OooO0O0() {
        int bitLength = (this.OooO00o.OooO0O0().bitLength() + 7) / 8;
        return this.f23426OooO00o ? bitLength : bitLength - 1;
    }
}
