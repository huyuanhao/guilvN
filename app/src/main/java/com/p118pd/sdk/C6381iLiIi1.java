package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨LiIi1  reason: invalid class name and case insensitive filesystem */
public class C6381iLiIi1 implements AbstractC6769llL1L {
    public static final byte OooO00o = 54;
    public static final byte OooO0O0 = 92;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f18168OooO0O0 = 64;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18169OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18170OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18171OooO00o = new byte[64];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18172OooO0O0 = new byte[64];

    public C6381iLiIi1(AbstractC6436l11LI r3) {
        this.f18170OooO00o = r3;
        this.f18169OooO00o = r3.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.f18169OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        int i2 = this.f18169OooO00o;
        byte[] bArr2 = new byte[i2];
        this.f18170OooO00o.OooO00o(bArr2, 0);
        AbstractC6436l11LI r2 = this.f18170OooO00o;
        byte[] bArr3 = this.f18172OooO0O0;
        r2.update(bArr3, 0, bArr3.length);
        this.f18170OooO00o.update(bArr2, 0, i2);
        int OooO00o2 = this.f18170OooO00o.OooO00o(bArr, i);
        reset();
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m17498OooO00o() {
        return this.f18170OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17499OooO00o() {
        return this.f18170OooO00o.OooO00o() + "/HMAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r4) {
        this.f18170OooO00o.reset();
        byte[] OooO00o2 = ((C6642li1LI) r4).OooO00o();
        if (OooO00o2.length <= 64) {
            System.arraycopy(OooO00o2, 0, this.f18171OooO00o, 0, OooO00o2.length);
            int length = OooO00o2.length;
            while (true) {
                byte[] bArr = this.f18171OooO00o;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.f18170OooO00o.update(OooO00o2, 0, OooO00o2.length);
            this.f18170OooO00o.OooO00o(this.f18171OooO00o, 0);
            int i = this.f18169OooO00o;
            while (true) {
                byte[] bArr2 = this.f18171OooO00o;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        }
        byte[] bArr3 = this.f18171OooO00o;
        byte[] bArr4 = new byte[bArr3.length];
        this.f18172OooO0O0 = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i2 = 0;
        while (true) {
            byte[] bArr5 = this.f18171OooO00o;
            if (i2 >= bArr5.length) {
                break;
            }
            bArr5[i2] = (byte) (bArr5[i2] ^ 54);
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr6 = this.f18172OooO0O0;
            if (i3 < bArr6.length) {
                bArr6[i3] = (byte) (bArr6[i3] ^ 92);
                i3++;
            } else {
                AbstractC6436l11LI r42 = this.f18170OooO00o;
                byte[] bArr7 = this.f18171OooO00o;
                r42.update(bArr7, 0, bArr7.length);
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f18170OooO00o.reset();
        AbstractC6436l11LI r0 = this.f18170OooO00o;
        byte[] bArr = this.f18171OooO00o;
        r0.update(bArr, 0, bArr.length);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        this.f18170OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        this.f18170OooO00o.update(bArr, i, i2);
    }
}
