package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.LlIiLI丨丨  reason: invalid class name and case insensitive filesystem */
public class C5776LlIiLI {
    public BigInteger OooO;
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16695OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16696OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public BigInteger OooO0o;
    public BigInteger OooO0o0;
    public BigInteger OooO0oO;
    public BigInteger OooO0oo;
    public BigInteger OooOO0;
    public BigInteger OooOO0O;

    private BigInteger OooO0o0() {
        return this.OooO0OO.modPow(this.OooO0oO, this.f16695OooO00o).multiply(this.OooO0Oo).mod(this.f16695OooO00o).modPow(this.OooO0o0, this.f16695OooO00o);
    }

    public BigInteger OooO00o() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.OooO0Oo;
        if (bigInteger3 == null || (bigInteger = this.OooO) == null || (bigInteger2 = this.OooO0oo) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger OooO0O02 = LLII.OooO0O0(this.OooO00o, this.f16695OooO00o, bigInteger3, bigInteger, bigInteger2);
        this.OooOO0 = OooO0O02;
        return OooO0O02;
    }

    public BigInteger OooO00o(BigInteger bigInteger) throws CryptoException {
        BigInteger OooO00o2 = LLII.OooO00o(this.f16695OooO00o, bigInteger);
        this.OooO0Oo = OooO00o2;
        this.OooO0oO = LLII.OooO00o(this.OooO00o, this.f16695OooO00o, OooO00o2, this.OooO0o);
        BigInteger OooO0o02 = OooO0o0();
        this.OooO0oo = OooO0o02;
        return OooO0o02;
    }

    public void OooO00o(C6057i1L r7, BigInteger bigInteger, AbstractC6436l11LI r9, SecureRandom secureRandom) {
        OooO00o(r7.OooO0O0(), r7.OooO00o(), bigInteger, r9, secureRandom);
    }

    public void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AbstractC6436l11LI r4, SecureRandom secureRandom) {
        this.f16695OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
        this.f16696OooO00o = secureRandom;
        this.OooO00o = r4;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16374OooO00o(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.OooO0Oo;
        if (bigInteger4 == null || (bigInteger2 = this.OooO0o) == null || (bigInteger3 = this.OooO0oo) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        } else if (!LLII.OooO00o(this.OooO00o, this.f16695OooO00o, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        } else {
            this.OooO = bigInteger;
            return true;
        }
    }

    public BigInteger OooO0O0() throws CryptoException {
        BigInteger bigInteger = this.OooO0oo;
        if (bigInteger == null || this.OooO == null || this.OooOO0 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger OooO0O02 = LLII.OooO0O0(this.OooO00o, this.f16695OooO00o, bigInteger);
        this.OooOO0O = OooO0O02;
        return OooO0O02;
    }

    public BigInteger OooO0OO() {
        BigInteger OooO00o2 = LLII.OooO00o(this.OooO00o, this.f16695OooO00o, this.OooO0O0);
        this.OooO0o0 = OooO0Oo();
        BigInteger mod = OooO00o2.multiply(this.OooO0OO).mod(this.f16695OooO00o).add(this.OooO0O0.modPow(this.OooO0o0, this.f16695OooO00o)).mod(this.f16695OooO00o);
        this.OooO0o = mod;
        return mod;
    }

    public BigInteger OooO0Oo() {
        return LLII.OooO00o(this.OooO00o, this.f16695OooO00o, this.OooO0O0, this.f16696OooO00o);
    }
}
