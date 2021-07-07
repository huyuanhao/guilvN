package com.p118pd.sdk;

import com.facebook.imageutils.JfifUtil;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.I丨1i  reason: invalid class name and case insensitive filesystem */
public class C5498I1i implements li1l11I1 {
    public static final int OooO00o = 16;
    public static final int[] OooO0Oo = {0, 0, 0, 0};
    public static final int[] OooO0o0 = {128, 27, 54, 108, JfifUtil.MARKER_SOI, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15954OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f15955OooO00o = new int[4];
    public boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f15956OooO0O0 = new int[4];
    public int[] OooO0OO = new int[4];

    private int OooO00o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

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
        this.f15956OooO0O0[0] = OooO00o(bArr, 0);
        this.f15956OooO0O0[1] = OooO00o(bArr, 4);
        this.f15956OooO0O0[2] = OooO00o(bArr, 8);
        this.f15956OooO0O0[3] = OooO00o(bArr, 12);
    }

    private void OooO00o(int[] iArr) {
        iArr[1] = iArr[1] ^ ((iArr[3] ^ -1) & (iArr[2] ^ -1));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
        int i = iArr[3];
        iArr[3] = iArr[0];
        iArr[0] = i;
        iArr[2] = iArr[2] ^ ((iArr[0] ^ iArr[1]) ^ iArr[3]);
        iArr[1] = ((iArr[3] ^ -1) & (iArr[2] ^ -1)) ^ iArr[1];
        iArr[0] = (iArr[1] & iArr[2]) ^ iArr[0];
    }

    private void OooO00o(int[] iArr, int[] iArr2) {
        int i = iArr[0] ^ iArr[2];
        int OooO00o2 = i ^ (OooO00o(i, 8) ^ OooO00o(i, 24));
        iArr[1] = iArr[1] ^ OooO00o2;
        iArr[3] = OooO00o2 ^ iArr[3];
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = iArr[i2] ^ iArr2[i2];
        }
        int i3 = iArr[1] ^ iArr[3];
        int OooO00o3 = i3 ^ (OooO00o(i3, 8) ^ OooO00o(i3, 24));
        iArr[0] = iArr[0] ^ OooO00o3;
        iArr[2] = OooO00o3 ^ iArr[2];
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f15955OooO00o[0] = OooO00o(bArr, i);
        this.f15955OooO00o[1] = OooO00o(bArr, i + 4);
        this.f15955OooO00o[2] = OooO00o(bArr, i + 8);
        this.f15955OooO00o[3] = OooO00o(bArr, i + 12);
        int[] iArr = this.f15956OooO0O0;
        System.arraycopy(iArr, 0, this.OooO0OO, 0, iArr.length);
        OooO00o(this.OooO0OO, OooO0Oo);
        int i3 = 16;
        while (true) {
            int[] iArr2 = this.f15955OooO00o;
            int[] iArr3 = this.OooO0OO;
            if (i3 > 0) {
                OooO00o(iArr2, iArr3);
                int[] iArr4 = this.f15955OooO00o;
                iArr4[0] = iArr4[0] ^ OooO0o0[i3];
                OooO0O0(iArr4);
                OooO00o(this.f15955OooO00o);
                OooO0OO(this.f15955OooO00o);
                i3--;
            } else {
                OooO00o(iArr2, iArr3);
                int[] iArr5 = this.f15955OooO00o;
                iArr5[0] = OooO0o0[i3] ^ iArr5[0];
                OooO00o(iArr5[0], bArr2, i2);
                OooO00o(this.f15955OooO00o[1], bArr2, i2 + 4);
                OooO00o(this.f15955OooO00o[2], bArr2, i2 + 8);
                OooO00o(this.f15955OooO00o[3], bArr2, i2 + 12);
                return 16;
            }
        }
    }

    private void OooO0O0(int[] iArr) {
        iArr[1] = OooO00o(iArr[1], 1);
        iArr[2] = OooO00o(iArr[2], 5);
        iArr[3] = OooO00o(iArr[3], 2);
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f15955OooO00o[0] = OooO00o(bArr, i);
        this.f15955OooO00o[1] = OooO00o(bArr, i + 4);
        this.f15955OooO00o[2] = OooO00o(bArr, i + 8);
        this.f15955OooO00o[3] = OooO00o(bArr, i + 12);
        int i3 = 0;
        while (i3 < 16) {
            int[] iArr = this.f15955OooO00o;
            iArr[0] = iArr[0] ^ OooO0o0[i3];
            OooO00o(iArr, this.f15956OooO0O0);
            OooO0O0(this.f15955OooO00o);
            OooO00o(this.f15955OooO00o);
            OooO0OO(this.f15955OooO00o);
            i3++;
        }
        int[] iArr2 = this.f15955OooO00o;
        iArr2[0] = OooO0o0[i3] ^ iArr2[0];
        OooO00o(iArr2, this.f15956OooO0O0);
        OooO00o(this.f15955OooO00o[0], bArr2, i2);
        OooO00o(this.f15955OooO00o[1], bArr2, i2 + 4);
        OooO00o(this.f15955OooO00o[2], bArr2, i2 + 8);
        OooO00o(this.f15955OooO00o[3], bArr2, i2 + 12);
        return 16;
    }

    private void OooO0OO(int[] iArr) {
        iArr[1] = OooO00o(iArr[1], 31);
        iArr[2] = OooO00o(iArr[2], 27);
        iArr[3] = OooO00o(iArr[3], 30);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f15954OooO00o) {
            throw new IllegalStateException(m15737OooO00o() + " not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            return this.OooO0O0 ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15737OooO00o() {
        return "Noekeon";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.OooO0O0 = z;
            this.f15954OooO00o = true;
            OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
