package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1ill丨  reason: invalid class name */
public abstract class L1ill implements lIL1i11, AbstractC6186iLi1 {
    public static final int OooO0O0 = 64;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f16207OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16208OooO00o;

    public L1ill() {
        this.f16208OooO00o = new byte[4];
        this.OooO00o = 0;
    }

    public L1ill(L1ill r2) {
        this.f16208OooO00o = new byte[4];
        OooO00o(r2);
    }

    public L1ill(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.f16208OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.OooO00o = AbstractC6464l1l.OooO00o(bArr, 4);
        this.f16207OooO00o = AbstractC6464l1l.m17599OooO00o(bArr, 8);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return 64;
    }

    public abstract void OooO00o(long j);

    public void OooO00o(L1ill r5) {
        byte[] bArr = r5.f16208OooO00o;
        System.arraycopy(bArr, 0, this.f16208OooO00o, 0, bArr.length);
        this.OooO00o = r5.OooO00o;
        this.f16207OooO00o = r5.f16207OooO00o;
    }

    public void OooO00o(byte[] bArr) {
        System.arraycopy(this.f16208OooO00o, 0, bArr, 0, this.OooO00o);
        AbstractC6464l1l.OooO00o(this.OooO00o, bArr, 4);
        AbstractC6464l1l.OooO00o(this.f16207OooO00o, bArr, 8);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public abstract void OooO00o(byte[] bArr, int i);

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void OooO0O0() {
        long j = this.f16207OooO00o << 3;
        byte b = O0O00O.OooO00o;
        while (true) {
            update(b);
            if (this.OooO00o != 0) {
                b = 0;
            } else {
                OooO00o(j);
                OooO0OO();
                return;
            }
        }
    }

    public abstract void OooO0OO();

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f16207OooO00o = 0;
        this.OooO00o = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f16208OooO00o;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        byte[] bArr = this.f16208OooO00o;
        int i = this.OooO00o;
        int i2 = i + 1;
        this.OooO00o = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            OooO00o(bArr, 0);
            this.OooO00o = 0;
        }
        this.f16207OooO00o++;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.OooO00o != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f16208OooO00o;
                int i5 = this.OooO00o;
                int i6 = i5 + 1;
                this.OooO00o = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    OooO00o(bArr2, 0);
                    this.OooO00o = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            OooO00o(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.f16208OooO00o;
            int i9 = this.OooO00o;
            this.OooO00o = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.f16207OooO00o += (long) max;
    }
}
