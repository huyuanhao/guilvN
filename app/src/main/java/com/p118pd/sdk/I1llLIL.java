package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.I1llLIL */
public class I1llLIL implements IililIi {
    public C5611LI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15406OooO00o;

    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.IililIi
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        C5611LI1 r22;
        if (!z) {
            r22 = (LL1ii1l) r2;
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f15406OooO00o = r23.m17752OooO00o();
            this.OooO00o = (C6512lIilLl) r23.OooO00o();
            return;
        } else {
            this.f15406OooO00o = IIllii.OooO00o();
            r22 = (C6512lIilLl) r2;
        }
        this.OooO00o = r22;
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        BigInteger OooO0OO = this.OooO00o.OooO00o().OooO0OO();
        if (bigInteger.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger.compareTo(OooO0OO) >= 0 || bigInteger2.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger2.compareTo(OooO0OO) >= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger3.modInverse(OooO0OO);
        AbstractC9738llL1L OooO0Oo = Lii1I.OooO0Oo(this.OooO00o.OooO00o().m16003OooO00o(), bigInteger2.multiply(modInverse).mod(OooO0OO), ((LL1ii1l) this.OooO00o).OooO00o(), OooO0OO.subtract(bigInteger).multiply(modInverse).mod(OooO0OO)).OooO0Oo();
        if (OooO0Oo.m21814OooO0OO()) {
            return false;
        }
        return OooO0Oo.m21802OooO00o().m21859OooO00o().mod(OooO0OO).equals(bigInteger);
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO00o3 = ((C6512lIilLl) this.OooO00o).OooO00o();
        AbstractC6615lLl1Ii OooO00o4 = OooO00o();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(OooO0OO.bitLength(), this.f15406OooO00o);
            if (!bigInteger2.equals(AbstractC5490IlLL.OooO00o)) {
                BigInteger mod = OooO00o4.OooO00o(OooO00o2.m16003OooO00o(), bigInteger2).OooO0Oo().m21802OooO00o().m21859OooO00o().mod(OooO0OO);
                if (!mod.equals(AbstractC5490IlLL.OooO00o)) {
                    BigInteger mod2 = bigInteger2.multiply(bigInteger).add(OooO00o3.multiply(mod)).mod(OooO0OO);
                    if (!mod2.equals(AbstractC5490IlLL.OooO00o)) {
                        return new BigInteger[]{mod, mod2};
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
