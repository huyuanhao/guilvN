package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Li丨i丨丨  reason: invalid class name and case insensitive filesystem */
public class C5759Lii implements AbstractC93171I1 {
    public final IililIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f16665OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16666OooO00o;

    public C5759Lii(IililIi iililIi, AbstractC6436l11LI r2) {
        this.f16665OooO00o = r2;
        this.OooO00o = iililIi;
    }

    private byte[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(bigInteger));
        r0.OooO00o(new C6513lIiI(bigInteger2));
        return new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    private BigInteger[] OooO00o(byte[] bArr) throws IOException {
        I11li1 i11li1 = (I11li1) AbstractC6122iIlLiL.OooO00o(bArr);
        return new BigInteger[]{((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0(), ((C6513lIiI) i11li1.OooO00o(1)).m17647OooO0O0()};
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        this.f16666OooO00o = z;
        C6213iL11I r0 = r4 instanceof liLL1l ? (C6213iL11I) ((liLL1l) r4).OooO00o() : (C6213iL11I) r4;
        if (z && !r0.OooO00o()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        } else if (z || !r0.OooO00o()) {
            reset();
            this.OooO00o.OooO00o(z, r4);
        } else {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16343OooO00o(byte[] bArr) {
        if (!this.f16666OooO00o) {
            byte[] bArr2 = new byte[this.f16665OooO00o.OooO0O0()];
            this.f16665OooO00o.OooO00o(bArr2, 0);
            try {
                BigInteger[] OooO00o2 = OooO00o(bArr);
                return this.OooO00o.OooO00o(bArr2, OooO00o2[0], OooO00o2[1]);
            } catch (IOException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() {
        if (this.f16666OooO00o) {
            byte[] bArr = new byte[this.f16665OooO00o.OooO0O0()];
            this.f16665OooO00o.OooO00o(bArr, 0);
            BigInteger[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            try {
                return OooO00o(OooO00o2[0], OooO00o2[1]);
            } catch (IOException unused) {
                throw new IllegalStateException("unable to encode signature");
            }
        } else {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f16665OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.f16665OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.f16665OooO00o.update(bArr, i, i2);
    }
}
