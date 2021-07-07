package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LL1IIL1 */
public class LL1IIL1 implements IililIi {
    public C5467Ill1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6477lI1I f16397OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16398OooO00o;

    public LL1IIL1() {
        this.f16397OooO00o = new C6246iiLII();
    }

    public LL1IIL1(AbstractC6477lI1I li1i) {
        this.f16397OooO00o = li1i;
    }

    private BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = IIllii.OooO00o();
        }
        return new BigInteger(7, secureRandom).add(BigInteger.valueOf(128)).multiply(bigInteger);
    }

    private BigInteger OooO00o(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    public SecureRandom OooO00o(boolean z, SecureRandom secureRandom) {
        if (!z) {
            return null;
        }
        return secureRandom != null ? secureRandom : IIllii.OooO00o();
    }

    @Override // com.p118pd.sdk.IililIi
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        SecureRandom secureRandom;
        C5467Ill1 r32;
        if (!z) {
            r32 = (C5242IIl) r3;
        } else if (r3 instanceof liLL1l) {
            liLL1l r33 = (liLL1l) r3;
            this.OooO00o = (C5907Ll1LI) r33.OooO00o();
            secureRandom = r33.m17752OooO00o();
            this.f16398OooO00o = OooO00o(!z && !this.f16397OooO00o.m17613OooO00o(), secureRandom);
        } else {
            r32 = (C5907Ll1LI) r3;
        }
        this.OooO00o = r32;
        secureRandom = null;
        this.f16398OooO00o = OooO00o(!z && !this.f16397OooO00o.m17613OooO00o(), secureRandom);
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        L1llLl1 OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO00o3 = OooO00o(OooO0OO, bArr);
        BigInteger valueOf = BigInteger.valueOf(0);
        if (valueOf.compareTo(bigInteger) >= 0 || OooO0OO.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || OooO0OO.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(OooO0OO);
        BigInteger mod = OooO00o3.multiply(modInverse).mod(OooO0OO);
        BigInteger mod2 = bigInteger.multiply(modInverse).mod(OooO0OO);
        BigInteger OooO0O0 = OooO00o2.OooO0O0();
        return OooO00o2.m15991OooO00o().modPow(mod, OooO0O0).multiply(((C5242IIl) this.OooO00o).OooO00o().modPow(mod2, OooO0O0)).mod(OooO0O0).mod(OooO0OO).equals(bigInteger);
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        L1llLl1 OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO00o3 = OooO00o(OooO0OO, bArr);
        BigInteger OooO00o4 = ((C5907Ll1LI) this.OooO00o).OooO00o();
        if (this.f16397OooO00o.m17613OooO00o()) {
            this.f16397OooO00o.OooO00o(OooO0OO, OooO00o4, bArr);
        } else {
            this.f16397OooO00o.OooO00o(OooO0OO, this.f16398OooO00o);
        }
        BigInteger OooO00o5 = this.f16397OooO00o.OooO00o();
        BigInteger mod = OooO00o2.m15991OooO00o().modPow(OooO00o5.add(OooO00o(OooO0OO, this.f16398OooO00o)), OooO00o2.OooO0O0()).mod(OooO0OO);
        return new BigInteger[]{mod, OooO00o5.modInverse(OooO0OO).multiply(OooO00o3.add(OooO00o4.multiply(mod))).mod(OooO0OO)};
    }
}
