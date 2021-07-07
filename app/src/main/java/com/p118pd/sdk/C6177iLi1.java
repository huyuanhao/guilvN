package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iLi1  reason: case insensitive filesystem */
public class C6177iLi1 implements li1l11I1 {
    public static final int OooO00o = 32;
    public static final int OooO0O0 = 4;
    public static final int OooO0OO = 20;
    public static final int OooO0Oo = -1209970333;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = -1640531527;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17748OooO00o = null;

    private int OooO00o(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int OooO00o(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    private void OooO00o(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int length2 = ((bArr.length + 4) - 1) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.f17748OooO00o = iArr3;
        iArr3[0] = -1209970333;
        int i2 = 1;
        while (true) {
            iArr = this.f17748OooO00o;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] - 1640531527;
            i2++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length4; i7++) {
            int[] iArr4 = this.f17748OooO00o;
            i4 = OooO00o(iArr4[i3] + i4 + i5, 3);
            iArr4[i3] = i4;
            i5 = OooO00o(iArr2[i6] + i4 + i5, i5 + i4);
            iArr2[i6] = i5;
            i3 = (i3 + 1) % this.f17748OooO00o.length;
            i6 = (i6 + 1) % length2;
        }
    }

    private int OooO0O0(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int OooO00o4 = OooO00o(bArr, i + 8);
        int OooO00o5 = OooO00o(bArr, i + 12);
        int[] iArr = this.f17748OooO00o;
        int i3 = OooO00o4 - iArr[43];
        int i4 = OooO00o2 - iArr[42];
        int i5 = 20;
        while (i5 >= 1) {
            int OooO00o6 = OooO00o(((i4 * 2) + 1) * i4, 5);
            int OooO00o7 = OooO00o(((i3 * 2) + 1) * i3, 5);
            int i6 = i5 * 2;
            i5--;
            i4 = OooO0O0(OooO00o5 - this.f17748OooO00o[i6], OooO00o7) ^ OooO00o6;
            OooO00o5 = i3;
            i3 = OooO0O0(OooO00o3 - this.f17748OooO00o[i6 + 1], OooO00o6) ^ OooO00o7;
            OooO00o3 = i4;
        }
        int[] iArr2 = this.f17748OooO00o;
        OooO00o(i4, bArr2, i2);
        OooO00o(OooO00o3 - iArr2[0], bArr2, i2 + 4);
        OooO00o(i3, bArr2, i2 + 8);
        OooO00o(OooO00o5 - iArr2[1], bArr2, i2 + 12);
        return 16;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int OooO00o4 = OooO00o(bArr, i + 8);
        int OooO00o5 = OooO00o(bArr, i + 12);
        int[] iArr = this.f17748OooO00o;
        int i3 = OooO00o3 + iArr[0];
        int i4 = OooO00o5 + iArr[1];
        int i5 = 1;
        while (i5 <= 20) {
            int OooO00o6 = OooO00o(((i3 * 2) + 1) * i3, 5);
            int OooO00o7 = OooO00o(((i4 * 2) + 1) * i4, 5);
            int i6 = i5 * 2;
            int OooO00o8 = OooO00o(OooO00o4 ^ OooO00o7, OooO00o6) + this.f17748OooO00o[i6 + 1];
            i5++;
            OooO00o4 = i4;
            i4 = OooO00o(OooO00o2 ^ OooO00o6, OooO00o7) + this.f17748OooO00o[i6];
            OooO00o2 = i3;
            i3 = OooO00o8;
        }
        int[] iArr2 = this.f17748OooO00o;
        int i7 = OooO00o4 + iArr2[43];
        OooO00o(OooO00o2 + iArr2[42], bArr2, i2);
        OooO00o(i3, bArr2, i2 + 4);
        OooO00o(i7, bArr2, i2 + 8);
        OooO00o(i4, bArr2, i2 + 12);
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o();
        if (this.f17748OooO00o == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        } else if (i + OooO00o2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (OooO00o2 + i2 <= bArr2.length) {
            return this.f17747OooO00o ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17128OooO00o() {
        return "RC6";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f17747OooO00o = z;
            OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
