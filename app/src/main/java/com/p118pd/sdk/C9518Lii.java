package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨Li丨i丨  reason: invalid class name and case insensitive filesystem */
public class C9518Lii implements IililIi {
    public C5611LI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23094OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23095OooO00o;

    @Override // com.p118pd.sdk.IililIi
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        C5611LI1 r22;
        this.f23095OooO00o = z;
        if (!z) {
            r22 = (LL1ii1l) r2;
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f23094OooO00o = r23.m17752OooO00o();
            this.OooO00o = (C6512lIilLl) r23.OooO00o();
            return;
        } else {
            this.f23094OooO00o = IIllii.OooO00o();
            r22 = (C6512lIilLl) r2;
        }
        this.OooO00o = r22;
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (!this.f23095OooO00o) {
            LL1ii1l r0 = (LL1ii1l) this.OooO00o;
            BigInteger OooO0OO = r0.OooO00o().OooO0OO();
            int bitLength = OooO0OO.bitLength();
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            if (bigInteger3.bitLength() > bitLength) {
                throw new DataLengthException("input too large for ECNR key.");
            } else if (bigInteger.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger.compareTo(OooO0OO) >= 0 || bigInteger2.compareTo(AbstractC5490IlLL.OooO00o) < 0 || bigInteger2.compareTo(OooO0OO) >= 0) {
                return false;
            } else {
                AbstractC9738llL1L OooO0Oo = Lii1I.OooO0Oo(r0.OooO00o().m16003OooO00o(), bigInteger2, r0.OooO00o(), bigInteger).OooO0Oo();
                if (OooO0Oo.m21814OooO0OO()) {
                    return false;
                }
                return bigInteger.subtract(OooO0Oo.m21802OooO00o().m21859OooO00o()).mod(OooO0OO).equals(bigInteger3);
            }
        } else {
            throw new IllegalStateException("not initialised for verifying");
        }
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        i1LLl1L OooO00o2;
        BigInteger mod;
        if (this.f23095OooO00o) {
            BigInteger OooO0OO = ((C6512lIilLl) this.OooO00o).OooO00o().OooO0OO();
            int bitLength = OooO0OO.bitLength();
            BigInteger bigInteger = new BigInteger(1, bArr);
            int bitLength2 = bigInteger.bitLength();
            C6512lIilLl r4 = (C6512lIilLl) this.OooO00o;
            if (bitLength2 <= bitLength) {
                do {
                    LI111l r8 = new LI111l();
                    r8.OooO00o(new iL1ilL1(r4.OooO00o(), this.f23094OooO00o));
                    OooO00o2 = r8.OooO00o();
                    mod = ((LL1ii1l) OooO00o2.OooO0O0()).OooO00o().m21802OooO00o().m21859OooO00o().add(bigInteger).mod(OooO0OO);
                } while (mod.equals(AbstractC5490IlLL.OooO00o));
                return new BigInteger[]{mod, ((C6512lIilLl) OooO00o2.OooO00o()).OooO00o().subtract(mod.multiply(r4.OooO00o())).mod(OooO0OO)};
            }
            throw new DataLengthException("input too large for ECNR key.");
        }
        throw new IllegalStateException("not initialised for signing");
    }
}
