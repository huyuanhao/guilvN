package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨l1I1  reason: invalid class name and case insensitive filesystem */
public class C9657l1I1 implements AbstractC6769llL1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LI1liiL f23260OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLIl f23261OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23262OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23263OooO0O0;

    public C9657l1I1(li1l11I1 li1l11i1) {
        this(li1l11i1, 8, (li1l11i1.OooO00o() * 8) / 2, null);
    }

    public C9657l1I1(li1l11I1 li1l11i1, int i, int i2) {
        this(li1l11i1, i, i2, null);
    }

    public C9657l1I1(li1l11I1 li1l11i1, int i, int i2, LLLIl r5) {
        this.f23261OooO00o = null;
        if (i2 % 8 == 0) {
            this.f23262OooO00o = new byte[li1l11i1.OooO00o()];
            LI1liiL lI1liiL = new LI1liiL(li1l11i1, i);
            this.f23260OooO00o = lI1liiL;
            this.f23261OooO00o = r5;
            this.OooO0O0 = i2 / 8;
            this.f23263OooO0O0 = new byte[lI1liiL.OooO00o()];
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    public C9657l1I1(li1l11I1 li1l11i1, LLLIl r4) {
        this(li1l11i1, 8, (li1l11i1.OooO00o() * 8) / 2, r4);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        int OooO00o2 = this.f23260OooO00o.OooO00o();
        LLLIl r1 = this.f23261OooO00o;
        if (r1 == null) {
            while (true) {
                int i2 = this.OooO00o;
                if (i2 >= OooO00o2) {
                    break;
                }
                this.f23263OooO0O0[i2] = 0;
                this.OooO00o = i2 + 1;
            }
        } else {
            r1.OooO00o(this.f23263OooO0O0, this.OooO00o);
        }
        this.f23260OooO00o.OooO00o(this.f23263OooO0O0, 0, this.f23262OooO00o, 0);
        this.f23260OooO00o.OooO00o(this.f23262OooO00o);
        System.arraycopy(this.f23262OooO00o, 0, bArr, i, this.OooO0O0);
        reset();
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21717OooO00o() {
        return this.f23260OooO00o.m16016OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r2) {
        reset();
        this.f23260OooO00o.OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f23263OooO0O0;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO00o = 0;
                this.f23260OooO00o.m16017OooO00o();
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.f23263OooO0O0;
        if (i == bArr.length) {
            this.f23260OooO00o.OooO00o(bArr, 0, this.f23262OooO00o, 0);
            this.OooO00o = 0;
        }
        byte[] bArr2 = this.f23263OooO0O0;
        int i2 = this.OooO00o;
        this.OooO00o = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int OooO00o2 = this.f23260OooO00o.OooO00o();
            int i3 = this.OooO00o;
            int i4 = OooO00o2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.f23263OooO0O0, i3, i4);
                this.f23260OooO00o.OooO00o(this.f23263OooO0O0, 0, this.f23262OooO00o, 0);
                this.OooO00o = 0;
                i2 -= i4;
                i += i4;
                while (i2 > OooO00o2) {
                    this.f23260OooO00o.OooO00o(bArr, i, this.f23262OooO00o, 0);
                    i2 -= OooO00o2;
                    i += OooO00o2;
                }
            }
            System.arraycopy(bArr, i, this.f23263OooO0O0, this.OooO00o, i2);
            this.OooO00o += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
