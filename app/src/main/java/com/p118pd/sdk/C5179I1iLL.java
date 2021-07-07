package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I1iLL丨丨  reason: invalid class name and case insensitive filesystem */
public class C5179I1iLL {
    public final AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6512lIilLl f15378OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15379OooO00o;

    public C5179I1iLL(AbstractC6436l11LI r1) {
        this.OooO00o = r1;
    }

    public static BigInteger OooO00o(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return new BigInteger(1, bArr2);
    }

    private byte[] OooO00o(AbstractC9738llL1L r8) {
        BigInteger OooO00o2 = r8.m21802OooO00o().m21859OooO00o();
        BigInteger OooO00o3 = r8.m21810OooO0O0().m21859OooO00o();
        int i = OooO00o2.toByteArray().length > 33 ? 64 : 32;
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        byte[] OooO00o4 = IIiL.OooO00o(i, OooO00o2);
        byte[] OooO00o5 = IIiL.OooO00o(i, OooO00o3);
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i3] = OooO00o4[(i - i3) - 1];
        }
        for (int i4 = 0; i4 != i; i4++) {
            bArr[i + i4] = OooO00o5[(i - i4) - 1];
        }
        this.OooO00o.update(bArr, 0, i2);
        byte[] bArr2 = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr2, 0);
        return bArr2;
    }

    public int OooO00o() {
        return (this.f15378OooO00o.OooO00o().OooO00o().OooO0O0() + 7) / 8;
    }

    public void OooO00o(AbstractC6370iIIIl r2) {
        C6403ii r22 = (C6403ii) r2;
        this.f15378OooO00o = (C6512lIilLl) r22.OooO00o();
        this.f15379OooO00o = OooO00o(r22.m17518OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15295OooO00o(AbstractC6370iIIIl r4) {
        LL1ii1l r42 = (LL1ii1l) r4;
        C5600L1iLL OooO00o2 = this.f15378OooO00o.OooO00o();
        if (OooO00o2.equals(r42.OooO00o())) {
            BigInteger mod = OooO00o2.m16004OooO00o().multiply(this.f15379OooO00o).multiply(this.f15378OooO00o.OooO00o()).mod(OooO00o2.OooO0OO());
            AbstractC9738llL1L OooO00o3 = Lii1I.OooO00o(OooO00o2.OooO00o(), r42.OooO00o());
            if (!OooO00o3.m21814OooO0OO()) {
                AbstractC9738llL1L OooO0Oo = OooO00o3.OooO00o(mod).OooO0Oo();
                if (!OooO0Oo.m21814OooO0OO()) {
                    return OooO00o(OooO0Oo);
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }
}
