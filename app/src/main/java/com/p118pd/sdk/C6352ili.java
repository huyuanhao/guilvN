package com.p118pd.sdk;

/* renamed from: com.pd.sdk.il丨丨i  reason: invalid class name and case insensitive filesystem */
public class C6352ili implements AbstractC9439IL {
    public iL1liI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18114OooO00o;
    public AbstractC6436l11LI OooO0O0;

    public C6352ili() {
        this.f18114OooO00o = L1LL1Ii.m15920OooO00o((short) 1);
        this.OooO0O0 = L1LL1Ii.m15920OooO00o((short) 2);
    }

    public C6352ili(C6352ili r3) {
        this.OooO00o = r3.OooO00o;
        this.f18114OooO00o = L1LL1Ii.OooO00o((short) 1, r3.f18114OooO00o);
        this.OooO0O0 = L1LL1Ii.OooO00o((short) 2, r3.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        iL1liI il1lii = this.OooO00o;
        if (il1lii != null && L1LL1Ii.OooO00o(il1lii)) {
            OooO00o(this.f18114OooO00o, IlL1I1.f15831OooO0O0, IlL1I1.OooO0OO, 48);
            OooO00o(this.OooO0O0, IlL1I1.f15831OooO0O0, IlL1I1.OooO0OO, 40);
        }
        int OooO00o2 = this.f18114OooO00o.OooO00o(bArr, i);
        return OooO00o2 + this.OooO0O0.OooO00o(bArr, i + OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    public AbstractC6436l11LI OooO00o() {
        return new C6352ili(this);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9439IL m17412OooO00o() {
        return new C6352ili(this);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17413OooO00o() {
        return this.f18114OooO00o.OooO00o() + " and " + this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17414OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC9439IL
    public void OooO00o(iL1liI il1lii) {
        this.OooO00o = il1lii;
    }

    public void OooO00o(AbstractC6436l11LI r5, byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = this.OooO00o.m17074OooO00o().f17561OooO00o;
        r5.update(bArr3, 0, bArr3.length);
        r5.update(bArr, 0, i);
        int OooO0O02 = r5.OooO0O0();
        byte[] bArr4 = new byte[OooO0O02];
        r5.OooO00o(bArr4, 0);
        r5.update(bArr3, 0, bArr3.length);
        r5.update(bArr2, 0, i);
        r5.update(bArr4, 0, OooO0O02);
    }

    @Override // com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    public void OooO00o(short s) {
        throw new IllegalStateException("CombinedHash only supports calculating the legacy PRF for handshake hash");
    }

    @Override // com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17415OooO00o(short s) {
        throw new IllegalStateException("CombinedHash doesn't support multiple hashes");
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL
    public int OooO0O0() {
        return this.f18114OooO00o.OooO0O0() + this.OooO0O0.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9439IL m17416OooO0O0() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f18114OooO00o.reset();
        this.OooO0O0.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        this.f18114OooO00o.update(b);
        this.OooO0O0.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        this.f18114OooO00o.update(bArr, i, i2);
        this.OooO0O0.update(bArr, i, i2);
    }
}
