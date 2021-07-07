package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I1ii1I */
public class I1ii1I {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5600L1iLL f15380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f15381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6512lIilLl f15382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9738llL1L f15383OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15384OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15385OooO00o;
    public C6512lIilLl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC9738llL1L f15386OooO0O0;

    public I1ii1I() {
        this(new II1li1Il());
    }

    public I1ii1I(AbstractC6436l11LI r1) {
        this.f15381OooO00o = r1;
    }

    private AbstractC9738llL1L OooO00o(C9553LLi r6) {
        C5600L1iLL OooO00o2 = this.f15382OooO00o.OooO00o();
        AbstractC9738llL1L OooO00o3 = Lii1I.OooO00o(OooO00o2.OooO00o(), r6.OooO0O0().OooO00o());
        AbstractC9738llL1L OooO00o4 = Lii1I.OooO00o(OooO00o2.OooO00o(), r6.OooO00o().OooO00o());
        BigInteger OooO00o5 = OooO00o(this.f15386OooO0O0.m21802OooO00o().m21859OooO00o());
        BigInteger OooO00o6 = OooO00o(OooO00o4.m21802OooO00o().m21859OooO00o());
        BigInteger mod = this.f15380OooO00o.m16004OooO00o().multiply(this.f15382OooO00o.OooO00o().add(OooO00o5.multiply(this.OooO0O0.OooO00o()))).mod(this.f15380OooO00o.OooO0OO());
        return Lii1I.OooO0Oo(OooO00o3, mod, OooO00o4, mod.multiply(OooO00o6).mod(this.f15380OooO00o.OooO0OO())).OooO0Oo();
    }

    private BigInteger OooO00o(BigInteger bigInteger) {
        return bigInteger.and(BigInteger.valueOf(1).shiftLeft(this.OooO00o).subtract(BigInteger.valueOf(1))).setBit(this.OooO00o);
    }

    private void OooO00o(AbstractC6436l11LI r3, AbstractC97441iIIL r4) {
        byte[] OooO00o2 = r4.m21861OooO00o();
        r3.update(OooO00o2, 0, OooO00o2.length);
    }

    private void OooO00o(AbstractC6436l11LI r3, byte[] bArr) {
        int length = bArr.length * 8;
        r3.update((byte) (length >>> 8));
        r3.update((byte) length);
        r3.update(bArr, 0, bArr.length);
    }

    private byte[] OooO00o() {
        byte[] bArr = new byte[this.f15381OooO00o.OooO0O0()];
        this.f15381OooO00o.OooO00o(bArr, 0);
        return bArr;
    }

    private byte[] OooO00o(AbstractC6436l11LI r2, AbstractC9738llL1L r3, byte[] bArr) {
        r2.update((byte) 2);
        OooO00o(r2, r3.m21810OooO0O0());
        r2.update(bArr, 0, bArr.length);
        return OooO00o();
    }

    private byte[] OooO00o(AbstractC6436l11LI r2, AbstractC9738llL1L r3, byte[] bArr, byte[] bArr2, AbstractC9738llL1L r6, AbstractC9738llL1L r7) {
        OooO00o(r2, r3.m21802OooO00o());
        r2.update(bArr, 0, bArr.length);
        r2.update(bArr2, 0, bArr2.length);
        OooO00o(r2, r6.m21802OooO00o());
        OooO00o(r2, r6.m21810OooO0O0());
        OooO00o(r2, r7.m21802OooO00o());
        OooO00o(r2, r7.m21810OooO0O0());
        return OooO00o();
    }

    private byte[] OooO00o(AbstractC6436l11LI r1, byte[] bArr, AbstractC9738llL1L r3) {
        OooO00o(r1, bArr);
        OooO00o(r1, this.f15380OooO00o.OooO00o().m15394OooO00o());
        OooO00o(r1, this.f15380OooO00o.OooO00o().m15400OooO0O0());
        OooO00o(r1, this.f15380OooO00o.m16003OooO00o().m21802OooO00o());
        OooO00o(r1, this.f15380OooO00o.m16003OooO00o().m21810OooO0O0());
        OooO00o(r1, r3.m21802OooO00o());
        OooO00o(r1, r3.m21810OooO0O0());
        return OooO00o();
    }

    private byte[] OooO00o(AbstractC9738llL1L r12, byte[] bArr, byte[] bArr2, int i) {
        AbstractC6186iLi1 r4;
        int OooO0O02 = this.f15381OooO00o.OooO0O0();
        byte[] bArr3 = new byte[Math.max(4, OooO0O02)];
        int i2 = (i + 7) / 8;
        byte[] bArr4 = new byte[i2];
        AbstractC6436l11LI r42 = this.f15381OooO00o;
        AbstractC6186iLi1 r6 = null;
        if (r42 instanceof AbstractC6186iLi1) {
            OooO00o(r42, r12.m21802OooO00o());
            OooO00o(this.f15381OooO00o, r12.m21810OooO0O0());
            this.f15381OooO00o.update(bArr, 0, bArr.length);
            this.f15381OooO00o.update(bArr2, 0, bArr2.length);
            r6 = (AbstractC6186iLi1) this.f15381OooO00o;
            r4 = r6.OooO00o();
        } else {
            r4 = null;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (r6 != null) {
                r6.OooO00o(r4);
            } else {
                OooO00o(this.f15381OooO00o, r12.m21802OooO00o());
                OooO00o(this.f15381OooO00o, r12.m21810OooO0O0());
                this.f15381OooO00o.update(bArr, 0, bArr.length);
                this.f15381OooO00o.update(bArr2, 0, bArr2.length);
            }
            i4++;
            AbstractC6464l1l.OooO00o(i4, bArr3, 0);
            this.f15381OooO00o.update(bArr3, 0, 4);
            this.f15381OooO00o.OooO00o(bArr3, 0);
            int min = Math.min(OooO0O02, i2 - i3);
            System.arraycopy(bArr3, 0, bArr4, i3, min);
            i3 += min;
        }
        return bArr4;
    }

    private byte[] OooO0O0(AbstractC6436l11LI r2, AbstractC9738llL1L r3, byte[] bArr) {
        r2.update((byte) 3);
        OooO00o(r2, r3.m21810OooO0O0());
        r2.update(bArr, 0, bArr.length);
        return OooO00o();
    }

    public void OooO00o(AbstractC6370iIIIl r2) {
        Ii1L1 ii1L1;
        if (r2 instanceof LIIl1) {
            LIIl1 lIIl1 = (LIIl1) r2;
            ii1L1 = (Ii1L1) lIIl1.OooO00o();
            this.f15385OooO00o = lIIl1.m16032OooO00o();
        } else {
            ii1L1 = (Ii1L1) r2;
            this.f15385OooO00o = new byte[0];
        }
        this.f15384OooO00o = ii1L1.m15553OooO00o();
        this.f15382OooO00o = ii1L1.OooO0O0();
        this.OooO0O0 = ii1L1.OooO00o();
        this.f15380OooO00o = this.f15382OooO00o.OooO00o();
        this.f15383OooO00o = ii1L1.m15554OooO0O0();
        this.f15386OooO0O0 = ii1L1.m15552OooO00o();
        this.OooO00o = (this.f15380OooO00o.OooO00o().OooO0O0() / 2) - 1;
    }

    public byte[] OooO00o(int i, AbstractC6370iIIIl r6) {
        byte[] bArr;
        C9553LLi r0;
        if (r6 instanceof LIIl1) {
            LIIl1 lIIl1 = (LIIl1) r6;
            r0 = (C9553LLi) lIIl1.OooO00o();
            bArr = lIIl1.m16032OooO00o();
        } else {
            r0 = (C9553LLi) r6;
            bArr = new byte[0];
        }
        byte[] OooO00o2 = OooO00o(this.f15381OooO00o, this.f15385OooO00o, this.f15383OooO00o);
        byte[] OooO00o3 = OooO00o(this.f15381OooO00o, bArr, r0.OooO0O0().OooO00o());
        AbstractC9738llL1L OooO00o4 = OooO00o(r0);
        return this.f15384OooO00o ? OooO00o(OooO00o4, OooO00o2, OooO00o3, i) : OooO00o(OooO00o4, OooO00o3, OooO00o2, i);
    }

    public byte[][] OooO00o(int i, byte[] bArr, AbstractC6370iIIIl r18) {
        C9553LLi r2;
        byte[] bArr2;
        if (r18 instanceof LIIl1) {
            LIIl1 lIIl1 = (LIIl1) r18;
            r2 = (C9553LLi) lIIl1.OooO00o();
            bArr2 = lIIl1.m16032OooO00o();
        } else {
            r2 = (C9553LLi) r18;
            bArr2 = new byte[0];
        }
        if (!this.f15384OooO00o || bArr != null) {
            byte[] OooO00o2 = OooO00o(this.f15381OooO00o, this.f15385OooO00o, this.f15383OooO00o);
            byte[] OooO00o3 = OooO00o(this.f15381OooO00o, bArr2, r2.OooO0O0().OooO00o());
            AbstractC9738llL1L OooO00o4 = OooO00o(r2);
            if (this.f15384OooO00o) {
                byte[] OooO00o5 = OooO00o(OooO00o4, OooO00o2, OooO00o3, i);
                byte[] OooO00o6 = OooO00o(this.f15381OooO00o, OooO00o4, OooO00o2, OooO00o3, this.f15386OooO0O0, r2.OooO00o().OooO00o());
                if (C9586iIILl.OooO0O0(OooO00o(this.f15381OooO00o, OooO00o4, OooO00o6), bArr)) {
                    return new byte[][]{OooO00o5, OooO0O0(this.f15381OooO00o, OooO00o4, OooO00o6)};
                }
                throw new IllegalStateException("confirmation tag mismatch");
            }
            byte[] OooO00o7 = OooO00o(OooO00o4, OooO00o3, OooO00o2, i);
            byte[] OooO00o8 = OooO00o(this.f15381OooO00o, OooO00o4, OooO00o3, OooO00o2, r2.OooO00o().OooO00o(), this.f15386OooO0O0);
            return new byte[][]{OooO00o7, OooO00o(this.f15381OooO00o, OooO00o4, OooO00o8), OooO0O0(this.f15381OooO00o, OooO00o4, OooO00o8)};
        }
        throw new IllegalArgumentException("if initiating, confirmationTag must be set");
    }
}
