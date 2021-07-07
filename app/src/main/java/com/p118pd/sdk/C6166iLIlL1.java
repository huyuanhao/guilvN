package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iLI丨lL1丨  reason: invalid class name and case insensitive filesystem */
public class C6166iLIlL1 implements li1l11I1 {
    public static final int OooO0o = 8;
    public static final int OooO0o0 = 32;
    public static final int OooO0oO = -1640531527;
    public static final int OooO0oo = -957401312;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17718OooO00o = false;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17719OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    private int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        return (bArr[i3 + 1] & 255) | i4 | ((bArr[i3] & 255) << 8);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    private void OooO00o(byte[] bArr) {
        if (bArr.length == 16) {
            this.OooO00o = OooO00o(bArr, 0);
            this.OooO0O0 = OooO00o(bArr, 4);
            this.OooO0OO = OooO00o(bArr, 8);
            this.OooO0Oo = OooO00o(bArr, 12);
            return;
        }
        throw new IllegalArgumentException("Key size must be 128 bits.");
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int i3 = OooO0oo;
        for (int i4 = 0; i4 != 32; i4++) {
            OooO00o3 -= (((OooO00o2 << 4) + this.OooO0OO) ^ (OooO00o2 + i3)) ^ ((OooO00o2 >>> 5) + this.OooO0Oo);
            OooO00o2 -= (((OooO00o3 << 4) + this.OooO00o) ^ (OooO00o3 + i3)) ^ ((OooO00o3 >>> 5) + this.OooO0O0);
            i3 += 1640531527;
        }
        OooO00o(OooO00o2, bArr2, i2);
        OooO00o(OooO00o3, bArr2, i2 + 4);
        return 8;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int i3 = OooO00o2;
        int i4 = 0;
        for (int i5 = 0; i5 != 32; i5++) {
            i4 -= 1640531527;
            i3 += (((OooO00o3 << 4) + this.OooO00o) ^ (OooO00o3 + i4)) ^ ((OooO00o3 >>> 5) + this.OooO0O0);
            OooO00o3 += (((i3 << 4) + this.OooO0OO) ^ (i3 + i4)) ^ ((i3 >>> 5) + this.OooO0Oo);
        }
        OooO00o(i3, bArr2, i2);
        OooO00o(OooO00o3, bArr2, i2 + 4);
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f17718OooO00o) {
            throw new IllegalStateException(m17109OooO00o() + " not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            return this.f17719OooO0O0 ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17109OooO00o() {
        return "TEA";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f17719OooO0O0 = z;
            this.f17718OooO00o = true;
            OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
