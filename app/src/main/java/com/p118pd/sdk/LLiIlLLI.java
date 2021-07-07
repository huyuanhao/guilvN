package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLiIlLLI */
public class LLiIlLLI implements AbstractC6769llL1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f16484OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16485OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16486OooO0O0;

    public LLiIlLLI(li1l11I1 li1l11i1) {
        this(li1l11i1, (li1l11i1.OooO00o() * 8) / 2);
    }

    public LLiIlLLI(li1l11I1 li1l11i1, int i) {
        if (i % 8 == 0) {
            this.f16484OooO00o = new C6927lll1(li1l11i1);
            this.OooO0O0 = i / 8;
            this.f16485OooO00o = new byte[li1l11i1.OooO00o()];
            this.f16486OooO0O0 = new byte[li1l11i1.OooO00o()];
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        int OooO00o2 = this.f16484OooO00o.OooO00o();
        while (true) {
            int i2 = this.OooO00o;
            if (i2 < OooO00o2) {
                this.f16486OooO0O0[i2] = 0;
                this.OooO00o = i2 + 1;
            } else {
                this.f16484OooO00o.OooO00o(this.f16486OooO0O0, 0, this.f16485OooO00o, 0);
                System.arraycopy(this.f16485OooO00o, 0, bArr, i, this.OooO0O0);
                reset();
                return this.OooO0O0;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16234OooO00o() {
        return this.f16484OooO00o.m17732OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r3) {
        reset();
        this.f16484OooO00o.OooO00o(true, r3);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16486OooO0O0;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO00o = 0;
                this.f16484OooO00o.reset();
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.f16486OooO0O0;
        if (i == bArr.length) {
            this.f16484OooO00o.OooO00o(bArr, 0, this.f16485OooO00o, 0);
            this.OooO00o = 0;
        }
        byte[] bArr2 = this.f16486OooO0O0;
        int i2 = this.OooO00o;
        this.OooO00o = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int OooO00o2 = this.f16484OooO00o.OooO00o();
            int i3 = this.OooO00o;
            int i4 = OooO00o2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.f16486OooO0O0, i3, i4);
                this.f16484OooO00o.OooO00o(this.f16486OooO0O0, 0, this.f16485OooO00o, 0);
                this.OooO00o = 0;
                i2 -= i4;
                i += i4;
                while (i2 > OooO00o2) {
                    this.f16484OooO00o.OooO00o(bArr, i, this.f16485OooO00o, 0);
                    i2 -= OooO00o2;
                    i += OooO00o2;
                }
            }
            System.arraycopy(bArr, i, this.f16486OooO0O0, this.OooO00o, i2);
            this.OooO00o += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
