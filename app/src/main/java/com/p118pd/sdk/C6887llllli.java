package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l丨lll丨li  reason: invalid class name and case insensitive filesystem */
public class C6887llllli implements IililIi {
    public ILi1llI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18978OooO00o;

    @Override // com.p118pd.sdk.IililIi
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        ILi1llI iLi1llI;
        if (!z) {
            iLi1llI = (C5201IIL) r2;
        } else if (r2 instanceof liLL1l) {
            liLL1l r22 = (liLL1l) r2;
            this.f18978OooO00o = r22.m17752OooO00o();
            this.OooO00o = (C6463l1lI) r22.OooO00o();
            return;
        } else {
            this.f18978OooO00o = IIllii.OooO00o();
            iLi1llI = (C6463l1lI) r2;
        }
        this.OooO00o = iLi1llI;
    }

    @Override // com.p118pd.sdk.IililIi
    public boolean OooO00o(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        Ii1lIl OooO00o2 = this.OooO00o.OooO00o();
        BigInteger valueOf = BigInteger.valueOf(0);
        if (valueOf.compareTo(bigInteger) >= 0 || OooO00o2.OooO0OO().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || OooO00o2.OooO0OO().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(OooO00o2.OooO0OO().subtract(new BigInteger("2")), OooO00o2.OooO0OO());
        return OooO00o2.m15559OooO00o().modPow(bigInteger2.multiply(modPow).mod(OooO00o2.OooO0OO()), OooO00o2.OooO0O0()).multiply(((C5201IIL) this.OooO00o).OooO00o().modPow(OooO00o2.OooO0OO().subtract(bigInteger).multiply(modPow).mod(OooO00o2.OooO0OO()), OooO00o2.OooO0O0())).mod(OooO00o2.OooO0O0()).mod(OooO00o2.OooO0OO()).equals(bigInteger);
    }

    @Override // com.p118pd.sdk.IililIi
    public BigInteger[] OooO00o(byte[] bArr) {
        BigInteger bigInteger;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        Ii1lIl OooO00o2 = this.OooO00o.OooO00o();
        do {
            bigInteger = new BigInteger(OooO00o2.OooO0OO().bitLength(), this.f18978OooO00o);
        } while (bigInteger.compareTo(OooO00o2.OooO0OO()) >= 0);
        BigInteger mod = OooO00o2.m15559OooO00o().modPow(bigInteger, OooO00o2.OooO0O0()).mod(OooO00o2.OooO0OO());
        return new BigInteger[]{mod, bigInteger.multiply(bigInteger2).add(((C6463l1lI) this.OooO00o).OooO00o().multiply(mod)).mod(OooO00o2.OooO0OO())};
    }
}
