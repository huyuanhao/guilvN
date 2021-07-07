package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LL1 */
public class LL1 implements IliIlli {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5611LI1 f16391OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6427ii f16392OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16393OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16394OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    public LL1(AbstractC6427ii r1, SecureRandom secureRandom) {
        this.f16392OooO00o = r1;
        this.f16393OooO00o = secureRandom;
        this.f16394OooO00o = false;
        this.OooO0O0 = false;
        this.OooO0OO = false;
    }

    public LL1(AbstractC6427ii r1, SecureRandom secureRandom, boolean z, boolean z2, boolean z3) {
        this.f16392OooO00o = r1;
        this.f16393OooO00o = secureRandom;
        this.f16394OooO00o = z;
        this.OooO0O0 = z2;
        this.OooO0OO = z3;
    }

    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i) {
        return OooO00o(bArr, 0, bArr.length, i);
    }

    @Override // com.p118pd.sdk.IliIlli
    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i, int i2) throws IllegalArgumentException {
        C5611LI1 r0 = this.f16391OooO00o;
        if (r0 instanceof LL1ii1l) {
            LL1ii1l r02 = (LL1ii1l) r0;
            C5600L1iLL OooO00o2 = r02.OooO00o();
            IIiLIli OooO00o3 = OooO00o2.OooO00o();
            BigInteger OooO0OO2 = OooO00o2.OooO0OO();
            BigInteger OooO00o4 = OooO00o2.m16004OooO00o();
            BigInteger OooO00o5 = IIiL.OooO00o(OooO00o, OooO0OO2, this.f16393OooO00o);
            AbstractC9738llL1L[] r6 = {OooO00o().OooO00o(OooO00o2.m16003OooO00o(), OooO00o5), r02.OooO00o().OooO00o(this.f16394OooO00o ? OooO00o5.multiply(OooO00o4).mod(OooO0OO2) : OooO00o5)};
            OooO00o3.OooO0O0(r6);
            AbstractC9738llL1L r03 = r6[0];
            AbstractC9738llL1L r1 = r6[1];
            byte[] OooO00o6 = r03.m21808OooO00o(false);
            System.arraycopy(OooO00o6, 0, bArr, i, OooO00o6.length);
            return OooO00o(i2, OooO00o6, r1.m21802OooO00o().m21861OooO00o());
        }
        throw new IllegalArgumentException("Public key required for encryption");
    }

    @Override // com.p118pd.sdk.IliIlli
    public AbstractC6370iIIIl OooO00o(byte[] bArr, int i, int i2, int i3) throws IllegalArgumentException {
        C5611LI1 r0 = this.f16391OooO00o;
        if (r0 instanceof C6512lIilLl) {
            C6512lIilLl r02 = (C6512lIilLl) r0;
            C5600L1iLL OooO00o2 = r02.OooO00o();
            IIiLIli OooO00o3 = OooO00o2.OooO00o();
            BigInteger OooO0OO2 = OooO00o2.OooO0OO();
            BigInteger OooO00o4 = OooO00o2.m16004OooO00o();
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            AbstractC9738llL1L OooO00o5 = OooO00o3.OooO00o(bArr2);
            if (this.f16394OooO00o || this.OooO0O0) {
                OooO00o5 = OooO00o5.OooO00o(OooO00o4);
            }
            BigInteger OooO00o6 = r02.OooO00o();
            if (this.f16394OooO00o) {
                OooO00o6 = OooO00o6.multiply(OooO00o4.modInverse(OooO0OO2)).mod(OooO0OO2);
            }
            return OooO00o(i3, bArr2, OooO00o5.OooO00o(OooO00o6).OooO0Oo().m21802OooO00o().m21861OooO00o());
        }
        throw new IllegalArgumentException("Private key required for encryption");
    }

    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    public C6642li1LI OooO00o(int i, byte[] bArr, byte[] bArr2) {
        if (!this.OooO0OO) {
            byte[] OooO0O02 = C9586iIILl.m21645OooO0O0(bArr, bArr2);
            C9586iIILl.OooO00o(bArr2, (byte) 0);
            bArr2 = OooO0O02;
        }
        try {
            this.f16392OooO00o.OooO00o(new C9564i1I1(bArr2, null));
            byte[] bArr3 = new byte[i];
            this.f16392OooO00o.OooO00o(bArr3, 0, i);
            return new C6642li1LI(bArr3);
        } finally {
            C9586iIILl.OooO00o(bArr2, (byte) 0);
        }
    }

    @Override // com.p118pd.sdk.IliIlli
    public void OooO00o(AbstractC6370iIIIl r2) throws IllegalArgumentException {
        if (r2 instanceof C5611LI1) {
            this.f16391OooO00o = (C5611LI1) r2;
            return;
        }
        throw new IllegalArgumentException("EC key required");
    }

    public AbstractC6370iIIIl OooO0O0(byte[] bArr, int i) {
        return OooO00o(bArr, 0, i);
    }
}
