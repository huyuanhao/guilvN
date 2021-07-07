package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IiIl  reason: case insensitive filesystem */
public class C5352IiIl implements AbstractC6769llL1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLIl f15693OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f15694OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6642li1LI f15695OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15696OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6642li1LI f15697OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15698OooO0O0;

    public C5352IiIl(li1l11I1 li1l11i1) {
        this(li1l11i1, li1l11i1.OooO00o() * 8, null);
    }

    public C5352IiIl(li1l11I1 li1l11i1, int i) {
        this(li1l11i1, i, null);
    }

    public C5352IiIl(li1l11I1 li1l11i1, int i, LLLIl r4) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else if (li1l11i1 instanceof C6293il1I) {
            this.f15694OooO00o = new C6927lll1(li1l11i1);
            this.f15693OooO00o = r4;
            this.OooO0O0 = i / 8;
            this.f15696OooO00o = new byte[li1l11i1.OooO00o()];
            this.f15698OooO0O0 = new byte[li1l11i1.OooO00o()];
            this.OooO00o = 0;
        } else {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
    }

    public C5352IiIl(li1l11I1 li1l11i1, LLLIl r3) {
        this(li1l11i1, li1l11i1.OooO00o() * 8, r3);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        int OooO00o2 = this.f15694OooO00o.OooO00o();
        if (this.f15693OooO00o == null) {
            while (true) {
                int i2 = this.OooO00o;
                if (i2 >= OooO00o2) {
                    break;
                }
                this.f15698OooO0O0[i2] = 0;
                this.OooO00o = i2 + 1;
            }
        } else {
            if (this.OooO00o == OooO00o2) {
                this.f15694OooO00o.OooO00o(this.f15698OooO0O0, 0, this.f15696OooO00o, 0);
                this.OooO00o = 0;
            }
            this.f15693OooO00o.OooO00o(this.f15698OooO0O0, this.OooO00o);
        }
        this.f15694OooO00o.OooO00o(this.f15698OooO0O0, 0, this.f15696OooO00o, 0);
        C6293il1I r0 = new C6293il1I();
        r0.OooO00o(false, (AbstractC6370iIIIl) this.f15695OooO00o);
        byte[] bArr2 = this.f15696OooO00o;
        r0.OooO00o(bArr2, 0, bArr2, 0);
        r0.OooO00o(true, (AbstractC6370iIIIl) this.f15697OooO0O0);
        byte[] bArr3 = this.f15696OooO00o;
        r0.OooO00o(bArr3, 0, bArr3, 0);
        System.arraycopy(this.f15696OooO00o, 0, bArr, i, this.OooO0O0);
        reset();
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15566OooO00o() {
        return "ISO9797Alg3";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r7) {
        C6642li1LI r1;
        reset();
        boolean z = r7 instanceof C6642li1LI;
        if (z || (r7 instanceof C6274iilL1L)) {
            byte[] OooO00o2 = (z ? (C6642li1LI) r7 : (C6642li1LI) ((C6274iilL1L) r7).OooO00o()).OooO00o();
            if (OooO00o2.length == 16) {
                r1 = new C6642li1LI(OooO00o2, 0, 8);
                this.f15695OooO00o = new C6642li1LI(OooO00o2, 8, 8);
                this.f15697OooO0O0 = r1;
            } else if (OooO00o2.length == 24) {
                r1 = new C6642li1LI(OooO00o2, 0, 8);
                this.f15695OooO00o = new C6642li1LI(OooO00o2, 8, 8);
                this.f15697OooO0O0 = new C6642li1LI(OooO00o2, 16, 8);
            } else {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            if (r7 instanceof C6274iilL1L) {
                this.f15694OooO00o.OooO00o(true, new C6274iilL1L(r1, ((C6274iilL1L) r7).m17301OooO00o()));
            } else {
                this.f15694OooO00o.OooO00o(true, r1);
            }
        } else {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f15698OooO0O0;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO00o = 0;
                this.f15694OooO00o.reset();
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.f15698OooO0O0;
        if (i == bArr.length) {
            this.f15694OooO00o.OooO00o(bArr, 0, this.f15696OooO00o, 0);
            this.OooO00o = 0;
        }
        byte[] bArr2 = this.f15698OooO0O0;
        int i2 = this.OooO00o;
        this.OooO00o = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int OooO00o2 = this.f15694OooO00o.OooO00o();
            int i3 = this.OooO00o;
            int i4 = OooO00o2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.f15698OooO0O0, i3, i4);
                this.f15694OooO00o.OooO00o(this.f15698OooO0O0, 0, this.f15696OooO00o, 0);
                this.OooO00o = 0;
                i2 -= i4;
                i += i4;
                while (i2 > OooO00o2) {
                    this.f15694OooO00o.OooO00o(bArr, i, this.f15696OooO00o, 0);
                    i2 -= OooO00o2;
                    i += OooO00o2;
                }
            }
            System.arraycopy(bArr, i, this.f15698OooO0O0, this.OooO00o, i2);
            this.OooO00o += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
