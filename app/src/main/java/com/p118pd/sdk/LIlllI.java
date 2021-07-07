package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LI丨lll丨I  reason: invalid class name */
public class LIlllI implements AbstractC5490IlLL, IililIi {
    public C5611LI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6477lI1I f16388OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16389OooO00o;

    public LIlllI() {
        this.f16388OooO00o = new C6246iiLII();
    }

    public LIlllI(AbstractC6477lI1I li1i) {
        this.f16388OooO00o = li1i;
    }

    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    public AbstractC97441iIIL OooO00o(int i, AbstractC9738llL1L r4) {
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return r4.m21803OooO00o(0).OooO0o0();
            }
            if (!(i == 6 || i == 7)) {
                return null;
            }
        }
        return r4.m21803OooO00o(0);
    }

    public BigInteger OooO00o(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
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
        C5611LI1 r32;
        if (!z) {
            r32 = (LL1ii1l) r3;
        } else if (r3 instanceof liLL1l) {
            liLL1l r33 = (liLL1l) r3;
            this.OooO00o = (C6512lIilLl) r33.OooO00o();
            secureRandom = r33.m17752OooO00o();
            this.f16389OooO00o = OooO00o(!z && !this.f16388OooO00o.m17613OooO00o(), secureRandom);
        } else {
            r32 = (C6512lIilLl) r3;
        }
        this.OooO00o = r32;
        secureRandom = null;
        this.f16389OooO00o = OooO00o(!z && !this.f16388OooO00o.m17613OooO00o(), secureRandom);
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger OooO00o2;
        AbstractC97441iIIL OooO00o3;
        C5600L1iLL OooO00o4 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o4.OooO0OO();
        BigInteger OooO00o5 = OooO00o(OooO0OO, bArr);
        if (bigInteger.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger.compareTo(OooO0OO) >= 0 || bigInteger2.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger2.compareTo(OooO0OO) >= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(OooO0OO);
        AbstractC9738llL1L OooO0Oo = Lii1I.OooO0Oo(OooO00o4.m16003OooO00o(), OooO00o5.multiply(modInverse).mod(OooO0OO), ((LL1ii1l) this.OooO00o).OooO00o(), bigInteger.multiply(modInverse).mod(OooO0OO));
        if (OooO0Oo.m21814OooO0OO()) {
            return false;
        }
        IIiLIli OooO00o6 = OooO0Oo.m21800OooO00o();
        if (OooO00o6 == null || (OooO00o2 = OooO00o6.m15395OooO00o()) == null || OooO00o2.compareTo(AbstractC5490IlLL.OooO0o) > 0 || (OooO00o3 = OooO00o(OooO00o6.m15387OooO00o(), OooO0Oo)) == null || OooO00o3.m21863OooO0O0()) {
            return OooO0Oo.OooO0Oo().m21802OooO00o().m21859OooO00o().mod(OooO0OO).equals(bigInteger);
        }
        AbstractC97441iIIL OooO0o0 = OooO0Oo.m21819OooO0o0();
        while (OooO00o6.m15398OooO00o(bigInteger)) {
            if (OooO00o6.OooO00o(bigInteger).OooO0OO(OooO00o3).equals(OooO0o0)) {
                return true;
            }
            bigInteger = bigInteger.add(OooO0OO);
        }
        return false;
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO00o3 = OooO00o(OooO0OO, bArr);
        BigInteger OooO00o4 = ((C6512lIilLl) this.OooO00o).OooO00o();
        if (this.f16388OooO00o.m17613OooO00o()) {
            this.f16388OooO00o.OooO00o(OooO0OO, OooO00o4, bArr);
        } else {
            this.f16388OooO00o.OooO00o(OooO0OO, this.f16389OooO00o);
        }
        AbstractC6615lLl1Ii OooO00o5 = OooO00o();
        while (true) {
            BigInteger OooO00o6 = this.f16388OooO00o.OooO00o();
            BigInteger mod = OooO00o5.OooO00o(OooO00o2.m16003OooO00o(), OooO00o6).OooO0Oo().m21802OooO00o().m21859OooO00o().mod(OooO0OO);
            if (!mod.equals(AbstractC5490IlLL.OooO00o)) {
                BigInteger mod2 = OooO00o6.modInverse(OooO0OO).multiply(OooO00o3.add(OooO00o4.multiply(mod))).mod(OooO0OO);
                if (!mod2.equals(AbstractC5490IlLL.OooO00o)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }
}
