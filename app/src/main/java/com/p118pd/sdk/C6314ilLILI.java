package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilLIL丨I  reason: invalid class name and case insensitive filesystem */
public class C6314ilLILI implements AbstractC6863liiI {
    public static final int OooO0O0 = 262144;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f18019OooO0O0 = 140737488355328L;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18020OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5552Iil f18021OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f18022OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18023OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18024OooO0O0;

    public C6314ilLILI(AbstractC6769llL1L lll1l, int i, AbstractC5552Iil r4, byte[] bArr, byte[] bArr2) {
        if (i > C9510Lii1L.OooO00o(lll1l)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (r4.OooO00o() >= i) {
            this.OooO00o = i;
            this.f18021OooO00o = r4;
            this.f18022OooO00o = lll1l;
            byte[] OooO00o2 = C9586iIILl.OooO00o(OooO00o(), bArr2, bArr);
            byte[] bArr3 = new byte[lll1l.OooO00o()];
            this.f18023OooO00o = bArr3;
            byte[] bArr4 = new byte[bArr3.length];
            this.f18024OooO0O0 = bArr4;
            C9586iIILl.OooO00o(bArr4, (byte) 1);
            OooO0O0(OooO00o2);
            this.f18020OooO00o = 1;
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    private void OooO00o(byte[] bArr, byte b) {
        this.f18022OooO00o.OooO00o(new C6642li1LI(this.f18023OooO00o));
        AbstractC6769llL1L lll1l = this.f18022OooO00o;
        byte[] bArr2 = this.f18024OooO0O0;
        lll1l.update(bArr2, 0, bArr2.length);
        this.f18022OooO00o.update(b);
        if (bArr != null) {
            this.f18022OooO00o.update(bArr, 0, bArr.length);
        }
        this.f18022OooO00o.OooO00o(this.f18023OooO00o, 0);
        this.f18022OooO00o.OooO00o(new C6642li1LI(this.f18023OooO00o));
        AbstractC6769llL1L lll1l2 = this.f18022OooO00o;
        byte[] bArr3 = this.f18024OooO0O0;
        lll1l2.update(bArr3, 0, bArr3.length);
        this.f18022OooO00o.OooO00o(this.f18024OooO0O0, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    private byte[] OooO00o() {
        byte[] OooO00o2 = this.f18021OooO00o.m15831OooO00o();
        if (OooO00o2.length >= (this.OooO00o + 7) / 8) {
            return OooO00o2;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private void OooO0O0(byte[] bArr) {
        OooO00o(bArr, (byte) 0);
        if (bArr != null) {
            OooO00o(bArr, (byte) 1);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17356OooO00o() {
        return this.f18024OooO0O0.length * 8;
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    public int OooO00o(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        } else if (this.f18020OooO00o > 140737488355328L) {
            return -1;
        } else {
            if (z) {
                OooO00o(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                OooO0O0(bArr2);
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            int length3 = bArr.length / this.f18024OooO0O0.length;
            this.f18022OooO00o.OooO00o(new C6642li1LI(this.f18023OooO00o));
            for (int i = 0; i < length3; i++) {
                AbstractC6769llL1L lll1l = this.f18022OooO00o;
                byte[] bArr4 = this.f18024OooO0O0;
                lll1l.update(bArr4, 0, bArr4.length);
                this.f18022OooO00o.OooO00o(this.f18024OooO0O0, 0);
                byte[] bArr5 = this.f18024OooO0O0;
                System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
            }
            byte[] bArr6 = this.f18024OooO0O0;
            if (bArr6.length * length3 < length2) {
                this.f18022OooO00o.update(bArr6, 0, bArr6.length);
                this.f18022OooO00o.OooO00o(this.f18024OooO0O0, 0);
                byte[] bArr7 = this.f18024OooO0O0;
                System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
            }
            OooO0O0(bArr2);
            this.f18020OooO00o++;
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            return length;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    public void OooO00o(byte[] bArr) {
        OooO0O0(C9586iIILl.m21645OooO0O0(OooO00o(), bArr));
        this.f18020OooO00o = 1;
    }
}
