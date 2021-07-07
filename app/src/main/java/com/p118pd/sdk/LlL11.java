package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LlL11丨丨  reason: invalid class name */
public class LlL11 implements IililIi {
    public static final BigInteger OooO0oO = BigInteger.valueOf(1);
    public C5611LI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16720OooO00o;

    public static AbstractC97441iIIL OooO00o(IIiLIli r2, byte[] bArr) {
        return r2.OooO00o(OooO00o(new BigInteger(1, C9586iIILl.OooO0O0(bArr)), r2.OooO0O0()));
    }

    public static BigInteger OooO00o(BigInteger bigInteger, int i) {
        return bigInteger.bitLength() > i ? bigInteger.mod(OooO0oO.shiftLeft(i)) : bigInteger;
    }

    public static BigInteger OooO00o(BigInteger bigInteger, AbstractC97441iIIL r1) {
        return OooO00o(r1.m21859OooO00o(), bigInteger.bitLength() - 1);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        return new BigInteger(bigInteger.bitLength() - 1, secureRandom);
    }

    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.IililIi
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        C5611LI1 r22;
        if (z) {
            if (r2 instanceof liLL1l) {
                liLL1l r23 = (liLL1l) r2;
                this.f16720OooO00o = r23.m17752OooO00o();
                r2 = r23.OooO00o();
            } else {
                this.f16720OooO00o = IIllii.OooO00o();
            }
            r22 = (C6512lIilLl) r2;
        } else {
            r22 = (LL1ii1l) r2;
        }
        this.OooO00o = r22;
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        if (bigInteger.compareTo(OooO0OO) >= 0 || bigInteger2.compareTo(OooO0OO) >= 0) {
            return false;
        }
        IIiLIli OooO00o3 = OooO00o2.OooO00o();
        AbstractC97441iIIL OooO00o4 = OooO00o(OooO00o3, bArr);
        if (OooO00o4.m21863OooO0O0()) {
            OooO00o4 = OooO00o3.OooO00o(OooO0oO);
        }
        AbstractC9738llL1L OooO0Oo = Lii1I.OooO0Oo(OooO00o2.m16003OooO00o(), bigInteger2, ((LL1ii1l) this.OooO00o).OooO00o(), bigInteger).OooO0Oo();
        return !OooO0Oo.m21814OooO0OO() && OooO00o(OooO0OO, OooO00o4.OooO0OO(OooO0Oo.m21802OooO00o())).compareTo(bigInteger) == 0;
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        IIiLIli OooO00o3 = OooO00o2.OooO00o();
        AbstractC97441iIIL OooO00o4 = OooO00o(OooO00o3, bArr);
        if (OooO00o4.m21863OooO0O0()) {
            OooO00o4 = OooO00o3.OooO00o(OooO0oO);
        }
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO00o5 = ((C6512lIilLl) this.OooO00o).OooO00o();
        AbstractC6615lLl1Ii OooO00o6 = OooO00o();
        while (true) {
            BigInteger OooO00o7 = OooO00o(OooO0OO, this.f16720OooO00o);
            AbstractC97441iIIL OooO00o8 = OooO00o6.OooO00o(OooO00o2.m16003OooO00o(), OooO00o7).OooO0Oo().m21802OooO00o();
            if (!OooO00o8.m21863OooO0O0()) {
                BigInteger OooO00o9 = OooO00o(OooO0OO, OooO00o4.OooO0OO(OooO00o8));
                if (OooO00o9.signum() != 0) {
                    BigInteger mod = OooO00o9.multiply(OooO00o5).add(OooO00o7).mod(OooO0OO);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{OooO00o9, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
