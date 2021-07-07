package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.lLlLIlIi */
public class lLlLIlIi {
    public BigInteger OooO;
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18547OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18548OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public BigInteger OooO0o;
    public BigInteger OooO0o0;
    public BigInteger OooO0oO;
    public BigInteger OooO0oo;
    public BigInteger OooOO0;
    public BigInteger OooOO0O;

    private BigInteger OooO0Oo() {
        BigInteger OooO00o2 = LLII.OooO00o(this.OooO00o, this.f18547OooO00o, this.OooO0O0);
        return this.OooO0o0.subtract(this.OooO0O0.modPow(this.OooO0o, this.f18547OooO00o).multiply(OooO00o2).mod(this.f18547OooO00o)).mod(this.f18547OooO00o).modPow(this.OooO0oO.multiply(this.OooO0o).add(this.OooO0OO), this.f18547OooO00o);
    }

    public BigInteger OooO00o() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.OooO0Oo;
        if (bigInteger3 == null || (bigInteger = this.OooO0o0) == null || (bigInteger2 = this.OooO0oo) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger OooO00o2 = LLII.OooO00o(this.OooO00o, this.f18547OooO00o, bigInteger3, bigInteger, bigInteger2);
        this.OooO = OooO00o2;
        return OooO00o2;
    }

    public BigInteger OooO00o(BigInteger bigInteger) throws CryptoException {
        BigInteger OooO00o2 = LLII.OooO00o(this.f18547OooO00o, bigInteger);
        this.OooO0o0 = OooO00o2;
        this.OooO0oO = LLII.OooO00o(this.OooO00o, this.f18547OooO00o, this.OooO0Oo, OooO00o2);
        BigInteger OooO0Oo2 = OooO0Oo();
        this.OooO0oo = OooO0Oo2;
        return OooO0Oo2;
    }

    public BigInteger OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.OooO0o = LLII.OooO00o(this.OooO00o, this.f18547OooO00o, bArr, bArr2, bArr3);
        BigInteger OooO0OO2 = OooO0OO();
        this.OooO0OO = OooO0OO2;
        BigInteger modPow = this.OooO0O0.modPow(OooO0OO2, this.f18547OooO00o);
        this.OooO0Oo = modPow;
        return modPow;
    }

    public void OooO00o(C6057i1L r2, AbstractC6436l11LI r3, SecureRandom secureRandom) {
        OooO00o(r2.OooO0O0(), r2.OooO00o(), r3, secureRandom);
    }

    public void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, AbstractC6436l11LI r3, SecureRandom secureRandom) {
        this.f18547OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO00o = r3;
        this.f18548OooO00o = secureRandom;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17703OooO00o(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.OooO0Oo;
        if (bigInteger4 == null || (bigInteger2 = this.OooO) == null || (bigInteger3 = this.OooO0oo) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        } else if (!LLII.OooO0O0(this.OooO00o, this.f18547OooO00o, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        } else {
            this.OooOO0 = bigInteger;
            return true;
        }
    }

    public BigInteger OooO0O0() throws CryptoException {
        BigInteger bigInteger = this.OooO0oo;
        if (bigInteger == null || this.OooO == null || this.OooOO0 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger OooO0O02 = LLII.OooO0O0(this.OooO00o, this.f18547OooO00o, bigInteger);
        this.OooOO0O = OooO0O02;
        return OooO0O02;
    }

    public BigInteger OooO0OO() {
        return LLII.OooO00o(this.OooO00o, this.f18547OooO00o, this.OooO0O0, this.f18548OooO00o);
    }
}
