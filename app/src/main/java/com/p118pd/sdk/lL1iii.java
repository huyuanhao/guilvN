package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨L1iii  reason: invalid class name */
public class lL1iii implements iiIi11 {
    public static long OooO0OO = 10;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18902OooO00o;
    public long OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18903OooO0O0;

    public lL1iii(AbstractC6436l11LI r3) {
        this.f18901OooO00o = r3;
        this.f18903OooO0O0 = new byte[r3.OooO0O0()];
        this.f18902OooO00o = new byte[r3.OooO0O0()];
        this.OooO00o = 1;
    }

    private void OooO00o() {
        OooO0Oo(this.f18903OooO0O0);
        long j = this.OooO0O0;
        this.OooO0O0 = 1 + j;
        OooO0O0(j);
        OooO0OO(this.f18903OooO0O0);
    }

    private void OooO0O0() {
        long j = this.OooO00o;
        this.OooO00o = 1 + j;
        OooO0O0(j);
        OooO0Oo(this.f18902OooO00o);
        OooO0Oo(this.f18903OooO0O0);
        OooO0OO(this.f18902OooO00o);
        if (this.OooO00o % OooO0OO == 0) {
            OooO00o();
        }
    }

    private void OooO0O0(long j) {
        for (int i = 0; i != 8; i++) {
            this.f18901OooO00o.update((byte) ((int) j));
            j >>>= 8;
        }
    }

    private void OooO0OO(byte[] bArr) {
        this.f18901OooO00o.OooO00o(bArr, 0);
    }

    private void OooO0Oo(byte[] bArr) {
        this.f18901OooO00o.update(bArr, 0, bArr.length);
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(long j) {
        synchronized (this) {
            OooO0O0(j);
            OooO0Oo(this.f18903OooO0O0);
            OooO0OO(this.f18903OooO0O0);
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr) {
        synchronized (this) {
            OooO0Oo(bArr);
            OooO0Oo(this.f18903OooO0O0);
            OooO0OO(this.f18903OooO0O0);
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr, int i, int i2) {
        synchronized (this) {
            OooO0O0();
            int i3 = i2 + i;
            int i4 = 0;
            while (i != i3) {
                if (i4 == this.f18902OooO00o.length) {
                    OooO0O0();
                    i4 = 0;
                }
                bArr[i] = this.f18902OooO00o[i4];
                i++;
                i4++;
            }
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO0O0(byte[] bArr) {
        OooO00o(bArr, 0, bArr.length);
    }
}
