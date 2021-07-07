package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.I丨LliiL  reason: invalid class name */
public class ILliiL implements IliIlli {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6427ii f16030OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f16031OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16032OooO00o;

    public ILliiL(AbstractC6427ii r1, SecureRandom secureRandom) {
        this.f16030OooO00o = r1;
        this.f16032OooO00o = secureRandom;
    }

    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i) {
        return OooO00o(bArr, 0, bArr.length, i);
    }

    @Override // com.p118pd.sdk.IliIlli
    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i, int i2) throws IllegalArgumentException {
        if (!this.f16031OooO00o.OooO00o()) {
            BigInteger OooO0O02 = this.f16031OooO00o.OooO0O0();
            BigInteger OooO00o2 = this.f16031OooO00o.OooO00o();
            BigInteger OooO00o3 = IIiL.OooO00o(OooO00o, OooO0O02.subtract(OooO0O0), this.f16032OooO00o);
            byte[] OooO00o4 = IIiL.OooO00o((OooO0O02.bitLength() + 7) / 8, OooO00o3.modPow(OooO00o2, OooO0O02));
            System.arraycopy(OooO00o4, 0, bArr, i, OooO00o4.length);
            return OooO00o(OooO0O02, OooO00o3, i2);
        }
        throw new IllegalArgumentException("Public key required for encryption");
    }

    @Override // com.p118pd.sdk.IliIlli
    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i, int i2, int i3) throws IllegalArgumentException {
        if (this.f16031OooO00o.OooO00o()) {
            BigInteger OooO0O02 = this.f16031OooO00o.OooO0O0();
            BigInteger OooO00o2 = this.f16031OooO00o.OooO00o();
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return OooO00o(OooO0O02, new BigInteger(1, bArr2).modPow(OooO00o2, OooO0O02), i3);
        }
        throw new IllegalArgumentException("Private key required for decryption");
    }

    public C6642li1LI OooO00o(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f16030OooO00o.OooO00o(new C9564i1I1(IIiL.OooO00o((bigInteger.bitLength() + 7) / 8, bigInteger2), null));
        byte[] bArr = new byte[i];
        this.f16030OooO00o.OooO00o(bArr, 0, i);
        return new C6642li1LI(bArr);
    }

    @Override // com.p118pd.sdk.IliIlli
    public void OooO00o(AbstractC6370iIIIl r2) throws IllegalArgumentException {
        if (r2 instanceof liLI1l1i) {
            this.f16031OooO00o = (liLI1l1i) r2;
            return;
        }
        throw new IllegalArgumentException("RSA key required");
    }

    public AbstractC6370iIIIl OooO0O0(byte[] bArr, int i) {
        return OooO00o(bArr, 0, i);
    }
}
