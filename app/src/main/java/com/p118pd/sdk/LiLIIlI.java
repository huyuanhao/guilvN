package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.LiLII丨lI  reason: invalid class name */
public class LiLIIlI implements li1l11I1 {
    public static final int OooO00o = 32;
    public static final int OooO0O0 = 8;
    public static final int OooO0OO = -1640531527;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16602OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16603OooO00o = new int[4];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16604OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f16605OooO0O0 = new int[32];

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int[] f16606OooO0OO = new int[32];

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
            int i = 0;
            int i2 = 0;
            while (i < 4) {
                this.f16603OooO00o[i] = OooO00o(bArr, i2);
                i++;
                i2 += 4;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < 32; i4++) {
                int[] iArr = this.f16605OooO0O0;
                int[] iArr2 = this.f16603OooO00o;
                iArr[i4] = iArr2[i3 & 3] + i3;
                i3 -= 1640531527;
                this.f16606OooO0OO[i4] = iArr2[(i3 >>> 11) & 3] + i3;
            }
            return;
        }
        throw new IllegalArgumentException("Key size must be 128 bits.");
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        for (int i3 = 31; i3 >= 0; i3--) {
            OooO00o3 -= (((OooO00o2 << 4) ^ (OooO00o2 >>> 5)) + OooO00o2) ^ this.f16606OooO0OO[i3];
            OooO00o2 -= (((OooO00o3 << 4) ^ (OooO00o3 >>> 5)) + OooO00o3) ^ this.f16605OooO0O0[i3];
        }
        OooO00o(OooO00o2, bArr2, i2);
        OooO00o(OooO00o3, bArr2, i2 + 4);
        return 8;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        for (int i3 = 0; i3 < 32; i3++) {
            OooO00o2 += (((OooO00o3 << 4) ^ (OooO00o3 >>> 5)) + OooO00o3) ^ this.f16605OooO0O0[i3];
            OooO00o3 += (((OooO00o2 << 4) ^ (OooO00o2 >>> 5)) + OooO00o2) ^ this.f16606OooO0OO[i3];
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
        if (!this.f16602OooO00o) {
            throw new IllegalStateException(m16306OooO00o() + " not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            return this.f16604OooO0O0 ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16306OooO00o() {
        return "XTEA";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f16604OooO0O0 = z;
            this.f16602OooO00o = true;
            OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
