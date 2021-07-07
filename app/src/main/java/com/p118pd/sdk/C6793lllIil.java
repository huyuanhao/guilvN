package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lllIil  reason: case insensitive filesystem */
public class C6793lllIil implements li1l11I1 {
    public static final int OooO0O0 = -1209970333;
    public static final int OooO0OO = -1640531527;
    public int OooO00o = 12;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18821OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18822OooO00o = null;

    private int OooO00o(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    private int OooO00o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private void OooO00o(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[((this.OooO00o + 1) * 2)];
        this.f18822OooO00o = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = this.f18822OooO00o;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr4 = this.f18822OooO00o;
            i5 = OooO00o(iArr4[i4] + i5 + i6, 3);
            iArr4[i4] = i5;
            i6 = OooO00o(iArr2[i7] + i5 + i6, i6 + i5);
            iArr2[i7] = i6;
            i4 = (i4 + 1) % this.f18822OooO00o.length;
            i7 = (i7 + 1) % length;
        }
    }

    private int OooO0O0(int i, int i2) {
        int i3 = i2 & 31;
        return (i << (32 - i3)) | (i >>> i3);
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        for (int i3 = this.OooO00o; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            OooO00o3 = OooO0O0(OooO00o3 - this.f18822OooO00o[i4 + 1], OooO00o2) ^ OooO00o2;
            OooO00o2 = OooO0O0(OooO00o2 - this.f18822OooO00o[i4], OooO00o3) ^ OooO00o3;
        }
        OooO00o(OooO00o2 - this.f18822OooO00o[0], bArr2, i2);
        OooO00o(OooO00o3 - this.f18822OooO00o[1], bArr2, i2 + 4);
        return 8;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i) + this.f18822OooO00o[0];
        int OooO00o3 = OooO00o(bArr, i + 4) + this.f18822OooO00o[1];
        for (int i3 = 1; i3 <= this.OooO00o; i3++) {
            int i4 = i3 * 2;
            OooO00o2 = OooO00o(OooO00o2 ^ OooO00o3, OooO00o3) + this.f18822OooO00o[i4];
            OooO00o3 = OooO00o(OooO00o3 ^ OooO00o2, OooO00o2) + this.f18822OooO00o[i4 + 1];
        }
        OooO00o(OooO00o2, bArr2, i2);
        OooO00o(OooO00o3, bArr2, i2 + 4);
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.f18821OooO00o ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17925OooO00o() {
        return "RC5-32";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C5663LLiL1l) {
            C5663LLiL1l lLiL1l = (C5663LLiL1l) r4;
            this.OooO00o = lLiL1l.OooO00o();
            OooO00o(lLiL1l.m16235OooO00o());
        } else if (r4 instanceof C6642li1LI) {
            OooO00o(((C6642li1LI) r4).OooO00o());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + r4.getClass().getName());
        }
        this.f18821OooO00o = z;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
