package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.LilIlILL */
public class LilIlILL implements AbstractC93171I1, AbstractC5490IlLL {
    public final II1li1Il OooO00o = new II1li1Il();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5600L1iLL f16646OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5611LI1 f16647OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6477lI1I f16648OooO00o = new C6246iiLII();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9738llL1L f16649OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16650OooO00o;

    private void OooO00o(AbstractC6436l11LI r3, AbstractC97441iIIL r4) {
        byte[] OooO00o2 = r4.m21861OooO00o();
        r3.update(OooO00o2, 0, OooO00o2.length);
    }

    private void OooO00o(AbstractC6436l11LI r3, byte[] bArr) {
        int length = bArr.length * 8;
        r3.update((byte) ((length >> 8) & 255));
        r3.update((byte) (length & 255));
        r3.update(bArr, 0, bArr.length);
    }

    private boolean OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger OooO0OO = this.f16646OooO00o.OooO0OO();
        if (bigInteger.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger.compareTo(OooO0OO) >= 0 || bigInteger2.compareTo(AbstractC5490IlLL.OooO0O0) < 0 || bigInteger2.compareTo(OooO0OO) >= 0) {
            return false;
        }
        BigInteger OooO00o2 = m16326OooO00o(OooO0OO());
        BigInteger mod = bigInteger.add(bigInteger2).mod(OooO0OO);
        if (mod.equals(AbstractC5490IlLL.OooO00o)) {
            return false;
        }
        AbstractC9738llL1L OooO0Oo = Lii1I.OooO0Oo(this.f16646OooO00o.m16003OooO00o(), bigInteger2, ((LL1ii1l) this.f16647OooO00o).OooO00o(), mod).OooO0Oo();
        if (OooO0Oo.m21814OooO0OO()) {
            return false;
        }
        return OooO00o2.add(OooO0Oo.m21802OooO00o().m21859OooO00o()).mod(OooO0OO).equals(bigInteger);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    private byte[] OooO00o(byte[] bArr) {
        this.OooO00o.reset();
        OooO00o(this.OooO00o, bArr);
        OooO00o(this.OooO00o, this.f16646OooO00o.OooO00o().m15394OooO00o());
        OooO00o(this.OooO00o, this.f16646OooO00o.OooO00o().m15400OooO0O0());
        OooO00o(this.OooO00o, this.f16646OooO00o.m16003OooO00o().m21802OooO00o());
        OooO00o(this.OooO00o, this.f16646OooO00o.m16003OooO00o().m21810OooO0O0());
        OooO00o(this.OooO00o, this.f16649OooO00o.m21802OooO00o());
        OooO00o(this.OooO00o, this.f16649OooO00o.m21810OooO0O0());
        byte[] bArr2 = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr2, 0);
        return bArr2;
    }

    private byte[] OooO0OO() {
        byte[] bArr = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr, 0);
        reset();
        return bArr;
    }

    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16326OooO00o(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) {
        byte[] bArr;
        AbstractC9738llL1L r4;
        if (r5 instanceof LIIl1) {
            LIIl1 lIIl1 = (LIIl1) r5;
            AbstractC6370iIIIl OooO00o2 = lIIl1.OooO00o();
            bArr = lIIl1.m16032OooO00o();
            r5 = OooO00o2;
        } else {
            bArr = C6472l1l1l.OooO00o("31323334353637383132333435363738");
        }
        if (z) {
            if (r5 instanceof liLL1l) {
                liLL1l r52 = (liLL1l) r5;
                C5611LI1 r42 = (C5611LI1) r52.OooO00o();
                this.f16647OooO00o = r42;
                C5600L1iLL OooO00o3 = r42.OooO00o();
                this.f16646OooO00o = OooO00o3;
                this.f16648OooO00o.OooO00o(OooO00o3.OooO0OO(), r52.m17752OooO00o());
            } else {
                C5611LI1 r53 = (C5611LI1) r5;
                this.f16647OooO00o = r53;
                C5600L1iLL OooO00o4 = r53.OooO00o();
                this.f16646OooO00o = OooO00o4;
                this.f16648OooO00o.OooO00o(OooO00o4.OooO0OO(), IIllii.OooO00o());
            }
            r4 = OooO00o().OooO00o(this.f16646OooO00o.m16003OooO00o(), ((C6512lIilLl) this.f16647OooO00o).OooO00o()).OooO0Oo();
        } else {
            C5611LI1 r54 = (C5611LI1) r5;
            this.f16647OooO00o = r54;
            this.f16646OooO00o = r54.OooO00o();
            r4 = ((LL1ii1l) this.f16647OooO00o).OooO00o();
        }
        this.f16649OooO00o = r4;
        byte[] OooO00o5 = OooO00o(bArr);
        this.f16650OooO00o = OooO00o5;
        this.OooO00o.update(OooO00o5, 0, OooO00o5.length);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16327OooO00o(byte[] bArr) {
        try {
            BigInteger[] OooO00o2 = m16329OooO00o(bArr);
            if (OooO00o2 != null) {
                return OooO00o(OooO00o2[0], OooO00o2[1]);
            }
        } catch (IOException unused) {
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16328OooO00o(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(bigInteger));
        r0.OooO00o(new C6513lIiI(bigInteger2));
        return new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger[] m16329OooO00o(byte[] bArr) throws IOException {
        I11li1 OooO00o2 = I11li1.OooO00o((Object) AbstractC6122iIlLiL.OooO00o(bArr));
        if (OooO00o2.size() != 2) {
            return null;
        }
        BigInteger OooO0O0 = C6513lIiI.OooO00o(OooO00o2.OooO00o(0)).m17647OooO0O0();
        BigInteger OooO0O02 = C6513lIiI.OooO00o(OooO00o2.OooO00o(1)).m17647OooO0O0();
        if (!C9586iIILl.OooO0O0(m16328OooO00o(OooO0O0, OooO0O02), bArr)) {
            return null;
        }
        return new BigInteger[]{OooO0O0, OooO0O02};
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException {
        byte[] OooO0OO = OooO0OO();
        BigInteger OooO0OO2 = this.f16646OooO00o.OooO0OO();
        BigInteger OooO00o2 = m16326OooO00o(OooO0OO);
        BigInteger OooO00o3 = ((C6512lIilLl) this.f16647OooO00o).OooO00o();
        AbstractC6615lLl1Ii OooO00o4 = OooO00o();
        while (true) {
            BigInteger OooO00o5 = this.f16648OooO00o.OooO00o();
            BigInteger mod = OooO00o2.add(OooO00o4.OooO00o(this.f16646OooO00o.m16003OooO00o(), OooO00o5).OooO0Oo().m21802OooO00o().m21859OooO00o()).mod(OooO0OO2);
            if (!mod.equals(AbstractC5490IlLL.OooO00o) && !mod.add(OooO00o5).equals(OooO0OO2)) {
                BigInteger mod2 = OooO00o3.add(AbstractC5490IlLL.OooO0O0).modInverse(OooO0OO2).multiply(OooO00o5.subtract(mod.multiply(OooO00o3)).mod(OooO0OO2)).mod(OooO0OO2);
                if (!mod2.equals(AbstractC5490IlLL.OooO00o)) {
                    try {
                        return m16328OooO00o(mod, mod2);
                    } catch (IOException e) {
                        throw new CryptoException("unable to encode signature: " + e.getMessage(), e);
                    }
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.OooO00o.reset();
        byte[] bArr = this.f16650OooO00o;
        if (bArr != null) {
            this.OooO00o.update(bArr, 0, bArr.length);
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.OooO00o.update(bArr, i, i2);
    }
}
