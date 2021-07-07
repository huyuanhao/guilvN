package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiL丨l  reason: invalid class name and case insensitive filesystem */
public class C5712LiLl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f16613OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f16614OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16615OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public C5712LiLl(iL1liI il1lii, AbstractC6436l11LI r3, byte[] bArr, int i, int i2) {
        int i3;
        this.f16613OooO00o = il1lii;
        C6642li1LI r0 = new C6642li1LI(bArr, i, i2);
        this.f16615OooO00o = C9586iIILl.m21630OooO00o(r0.OooO00o());
        if (r3 instanceof LLILL) {
            this.OooO00o = 128;
            i3 = 16;
        } else {
            this.OooO00o = 64;
            i3 = 8;
        }
        this.OooO0O0 = i3;
        if (L1LL1Ii.OooO00o(il1lii)) {
            this.f16614OooO00o = new IlL1I1(r3);
            if (r3.OooO0O0() == 20) {
                this.OooO0O0 = 4;
            }
        } else {
            this.f16614OooO00o = new C6383iLl1(r3);
        }
        this.f16614OooO00o.OooO00o(r0);
        this.OooO0OO = this.f16614OooO00o.OooO00o();
        if (il1lii.m17074OooO00o().f17560OooO00o) {
            this.OooO0OO = Math.min(this.OooO0OO, 10);
        }
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    public int OooO00o(int i) {
        return (i + this.OooO0O0) / this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16308OooO00o() {
        return this.f16615OooO00o;
    }

    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) {
        i1iiIl OooO0O02 = this.f16613OooO00o.OooO0O0();
        boolean OooO0O03 = OooO0O02.m16893OooO0O0();
        int i3 = OooO0O03 ? 11 : 13;
        byte[] bArr2 = new byte[i3];
        L1LL1Ii.OooO0OO(j, bArr2, 0);
        L1LL1Ii.OooO00o(s, bArr2, 8);
        if (!OooO0O03) {
            L1LL1Ii.OooO00o(OooO0O02, bArr2, 9);
        }
        L1LL1Ii.OooO00o(i2, bArr2, i3 - 2);
        this.f16614OooO00o.update(bArr2, 0, i3);
        this.f16614OooO00o.update(bArr, i, i2);
        byte[] bArr3 = new byte[this.f16614OooO00o.OooO00o()];
        this.f16614OooO00o.OooO00o(bArr3, 0);
        return OooO00o(bArr3);
    }

    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2, int i3, byte[] bArr2) {
        byte[] OooO00o2 = OooO00o(j, s, bArr, i, i2);
        int i4 = L1LL1Ii.OooO00o(this.f16613OooO00o) ? 11 : 13;
        int OooO00o3 = OooO00o(i3 + i4) - OooO00o(i4 + i2);
        while (true) {
            OooO00o3--;
            if (OooO00o3 >= 0) {
                this.f16614OooO00o.update(bArr2, 0, this.OooO00o);
            } else {
                this.f16614OooO00o.update(bArr2[0]);
                this.f16614OooO00o.reset();
                return OooO00o2;
            }
        }
    }

    public byte[] OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = this.OooO0OO;
        return length <= i ? bArr : C9586iIILl.OooO00o(bArr, i);
    }
}
