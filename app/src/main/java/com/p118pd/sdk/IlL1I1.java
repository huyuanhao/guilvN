package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IlL1I1 */
public class IlL1I1 implements AbstractC6769llL1L {
    public static final byte OooO00o = 54;
    public static final byte OooO0O0 = 92;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final byte[] f15831OooO0O0 = OooO00o((byte) 54, 48);
    public static final byte[] OooO0OO = OooO00o((byte) 92, 48);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15832OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f15833OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15834OooO00o;

    public IlL1I1(AbstractC6436l11LI r2) {
        this.f15833OooO00o = r2;
        this.f15832OooO00o = r2.OooO0O0() == 20 ? 40 : 48;
    }

    public static byte[] OooO00o(byte b, int i) {
        byte[] bArr = new byte[i];
        C9586iIILl.OooO00o(bArr, b);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.f15833OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        int OooO0O02 = this.f15833OooO00o.OooO0O0();
        byte[] bArr2 = new byte[OooO0O02];
        this.f15833OooO00o.OooO00o(bArr2, 0);
        AbstractC6436l11LI r2 = this.f15833OooO00o;
        byte[] bArr3 = this.f15834OooO00o;
        r2.update(bArr3, 0, bArr3.length);
        this.f15833OooO00o.update(OooO0OO, 0, this.f15832OooO00o);
        this.f15833OooO00o.update(bArr2, 0, OooO0O02);
        int OooO00o2 = this.f15833OooO00o.OooO00o(bArr, i);
        reset();
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m15668OooO00o() {
        return this.f15833OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15669OooO00o() {
        return this.f15833OooO00o.OooO00o() + "/SSL3MAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r1) {
        this.f15834OooO00o = C9586iIILl.m21630OooO00o(((C6642li1LI) r1).OooO00o());
        reset();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f15833OooO00o.reset();
        AbstractC6436l11LI r0 = this.f15833OooO00o;
        byte[] bArr = this.f15834OooO00o;
        r0.update(bArr, 0, bArr.length);
        this.f15833OooO00o.update(f15831OooO0O0, 0, this.f15832OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        this.f15833OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        this.f15833OooO00o.update(bArr, i, i2);
    }
}
