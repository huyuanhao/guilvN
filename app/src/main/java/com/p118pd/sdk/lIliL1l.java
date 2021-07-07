package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.lIliL1l */
public class lIliL1l extends AbstractC9563i1I implements i1IIi1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18404OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final li1l11I1 f18405OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18406OooO0O0;
    public byte[] OooO0OO;

    public lIliL1l(li1l11I1 li1l11i1) {
        super(li1l11i1);
        this.f18405OooO0O0 = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO00o = OooO00o2;
        this.f18404OooO00o = new byte[OooO00o2];
        this.f18406OooO0O0 = new byte[OooO00o2];
        this.OooO0OO = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        if (this.f18404OooO00o.length < this.OooO00o) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f18404OooO00o;
                if (i == bArr.length) {
                    return;
                }
                if (this.f18406OooO0O0[i] == bArr[i]) {
                    i++;
                } else {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void OooO00o(int i) {
        byte b;
        int length = this.f18406OooO0O0.length - i;
        do {
            length--;
            if (length >= 0) {
                byte[] bArr = this.f18406OooO0O0;
                b = (byte) (bArr[length] - 1);
                bArr[length] = b;
            } else {
                return;
            }
        } while (b == -1);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    private void OooO00o(long j) {
        int i;
        int i2 = 5;
        if (j >= 0) {
            long j2 = (((long) this.OooO0O0) + j) / ((long) this.OooO00o);
            long j3 = j2;
            if (j2 > 255) {
                while (i2 >= 1) {
                    long j4 = 1 << (i2 * 8);
                    while (j3 >= j4) {
                        OooO0OO(i2);
                        j3 -= j4;
                    }
                    i2--;
                }
            }
            OooO0O0((int) j3);
            i = (int) ((j + ((long) this.OooO0O0)) - (((long) this.OooO00o) * j2));
        } else {
            long j5 = ((-j) - ((long) this.OooO0O0)) / ((long) this.OooO00o);
            long j6 = j5;
            if (j5 > 255) {
                while (i2 >= 1) {
                    long j7 = 1 << (i2 * 8);
                    while (j6 > j7) {
                        OooO00o(i2);
                        j6 -= j7;
                    }
                    i2--;
                }
            }
            for (long j8 = 0; j8 != j6; j8++) {
                OooO00o(0);
            }
            int i3 = (int) (((long) this.OooO0O0) + j + (((long) this.OooO00o) * j5));
            if (i3 >= 0) {
                this.OooO0O0 = 0;
                return;
            } else {
                OooO00o(0);
                i = this.OooO00o + i3;
            }
        }
        this.OooO0O0 = i;
    }

    private void OooO0O0(int i) {
        byte[] bArr = this.f18406OooO0O0;
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i);
        if (b != 0 && bArr[bArr.length - 1] < b) {
            OooO0OO(1);
        }
    }

    private void OooO0OO(int i) {
        byte b;
        int length = this.f18406OooO0O0.length - i;
        do {
            length--;
            if (length >= 0) {
                byte[] bArr = this.f18406OooO0O0;
                b = (byte) (bArr[length] + 1);
                bArr[length] = b;
            } else {
                return;
            }
        } while (b == 0);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17649OooO00o() {
        return this.f18405OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO00o, bArr2, i2);
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m17650OooO00o() {
        byte[] bArr = this.f18406OooO0O0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i >= 1) {
            byte[] bArr3 = this.f18404OooO00o;
            int i2 = i < bArr3.length ? (bArr2[i] & 255) - (bArr3[i] & 255) : bArr2[i] & 255;
            if (i2 < 0) {
                int i3 = i - 1;
                bArr2[i3] = (byte) (bArr2[i3] - 1);
                i2 += 256;
            }
            bArr2[i] = (byte) i2;
            i--;
        }
        return (AbstractC6464l1l.m17599OooO00o(bArr2, length - 8) * ((long) this.OooO00o)) + ((long) this.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m17651OooO00o(long j) {
        reset();
        return skip(j);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17652OooO00o() {
        return this.f18405OooO0O0.m17732OooO00o() + "/SIC";
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) throws IllegalArgumentException {
        if (r5 instanceof C6274iilL1L) {
            C6274iilL1L r52 = (C6274iilL1L) r5;
            byte[] OooO00o2 = C9586iIILl.m21630OooO00o(r52.m17301OooO00o());
            this.f18404OooO00o = OooO00o2;
            int i = this.OooO00o;
            if (i >= OooO00o2.length) {
                int i2 = 8;
                if (8 > i / 2) {
                    i2 = i / 2;
                }
                if (this.OooO00o - this.f18404OooO00o.length <= i2) {
                    if (r52.OooO00o() != null) {
                        this.f18405OooO0O0.OooO00o(true, r52.OooO00o());
                    }
                    reset();
                    return;
                }
                throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.OooO00o - i2) + " bytes.");
            }
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.OooO00o + " bytes.");
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) throws DataLengthException, IllegalStateException {
        int i = this.OooO0O0;
        if (i == 0) {
            this.f18405OooO0O0.OooO00o(this.f18406OooO0O0, 0, this.OooO0OO, 0);
            byte[] bArr = this.OooO0OO;
            int i2 = this.OooO0O0;
            this.OooO0O0 = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.OooO0OO;
        int i3 = i + 1;
        this.OooO0O0 = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.f18406OooO0O0.length) {
            this.OooO0O0 = 0;
            OooO0OO(0);
            OooO00o();
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        C9586iIILl.OooO00o(this.f18406OooO0O0, (byte) 0);
        byte[] bArr = this.f18404OooO00o;
        System.arraycopy(bArr, 0, this.f18406OooO0O0, 0, bArr.length);
        this.f18405OooO0O0.reset();
        this.OooO0O0 = 0;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    public long skip(long j) {
        OooO00o(j);
        OooO00o();
        this.f18405OooO0O0.OooO00o(this.f18406OooO0O0, 0, this.OooO0OO, 0);
        return j;
    }
}
