package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.L丨i1lll  reason: invalid class name and case insensitive filesystem */
public class C5868Li1lll implements I1LLllll {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16828OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16829OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16830OooO00o = new int[512];
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16831OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f16832OooO0O0 = new int[512];
    public byte[] OooO0OO = new byte[4];

    @Override // com.p118pd.sdk.I1LLllll
    private byte OooO00o() {
        if (this.OooO0O0 == 0) {
            int OooO00o2 = m16455OooO00o();
            byte[] bArr = this.OooO0OO;
            bArr[0] = (byte) (OooO00o2 & 255);
            int i = OooO00o2 >> 8;
            bArr[1] = (byte) (i & 255);
            int i2 = i >> 8;
            bArr[2] = (byte) (i2 & 255);
            bArr[3] = (byte) ((i2 >> 8) & 255);
        }
        byte[] bArr2 = this.OooO0OO;
        int i3 = this.OooO0O0;
        byte b = bArr2[i3];
        this.OooO0O0 = 3 & (i3 + 1);
        return b;
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m16455OooO00o() {
        int i;
        int i2;
        int OooO0o = OooO0o(this.OooO00o);
        if (this.OooO00o < 512) {
            int[] iArr = this.f16830OooO00o;
            iArr[OooO0o] = iArr[OooO0o] + OooO00o(iArr[OooO00o(OooO0o, 3)], this.f16830OooO00o[OooO00o(OooO0o, 10)], this.f16830OooO00o[OooO00o(OooO0o, 511)]);
            i = OooO0OO(this.f16830OooO00o[OooO00o(OooO0o, 12)]);
            i2 = this.f16830OooO00o[OooO0o];
        } else {
            int[] iArr2 = this.f16832OooO0O0;
            iArr2[OooO0o] = iArr2[OooO0o] + OooO0O0(iArr2[OooO00o(OooO0o, 3)], this.f16832OooO0O0[OooO00o(OooO0o, 10)], this.f16832OooO0O0[OooO00o(OooO0o, 511)]);
            i = OooO0Oo(this.f16832OooO0O0[OooO00o(OooO0o, 12)]);
            i2 = this.f16832OooO0O0[OooO0o];
        }
        int i3 = i2 ^ i;
        this.OooO00o = OooO0o0(this.OooO00o + 1);
        return i3;
    }

    public static int OooO00o(int i) {
        return (i >>> 3) ^ (OooO0OO(i, 7) ^ OooO0OO(i, 18));
    }

    public static int OooO00o(int i, int i2) {
        return OooO0o(i - i2);
    }

    private int OooO00o(int i, int i2, int i3) {
        return (OooO0OO(i, 10) ^ OooO0OO(i3, 23)) + OooO0OO(i2, 8);
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m16456OooO00o() {
        if (this.f16829OooO00o.length == 16) {
            this.OooO0O0 = 0;
            this.OooO00o = 0;
            int[] iArr = new int[1280];
            for (int i = 0; i < 16; i++) {
                int i2 = i >> 2;
                iArr[i2] = ((this.f16829OooO00o[i] & 255) << ((i & 3) * 8)) | iArr[i2];
            }
            System.arraycopy(iArr, 0, iArr, 4, 4);
            int i3 = 0;
            while (true) {
                byte[] bArr = this.f16831OooO0O0;
                if (i3 >= bArr.length || i3 >= 16) {
                    System.arraycopy(iArr, 8, iArr, 12, 4);
                } else {
                    int i4 = (i3 >> 2) + 8;
                    iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
                    i3++;
                }
            }
            System.arraycopy(iArr, 8, iArr, 12, 4);
            for (int i5 = 16; i5 < 1280; i5++) {
                iArr[i5] = OooO0O0(iArr[i5 - 2]) + iArr[i5 - 7] + OooO00o(iArr[i5 - 15]) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 256, this.f16830OooO00o, 0, 512);
            System.arraycopy(iArr, 768, this.f16832OooO0O0, 0, 512);
            for (int i6 = 0; i6 < 512; i6++) {
                this.f16830OooO00o[i6] = m16455OooO00o();
            }
            for (int i7 = 0; i7 < 512; i7++) {
                this.f16832OooO0O0[i7] = m16455OooO00o();
            }
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("The key must be 128 bits long");
    }

    public static int OooO0O0(int i) {
        return (i >>> 10) ^ (OooO0OO(i, 17) ^ OooO0OO(i, 19));
    }

    public static int OooO0O0(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int OooO0O0(int i, int i2, int i3) {
        return (OooO0O0(i, 10) ^ OooO0O0(i3, 23)) + OooO0O0(i2, 8);
    }

    private int OooO0OO(int i) {
        int[] iArr = this.f16832OooO0O0;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    public static int OooO0OO(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int OooO0Oo(int i) {
        int[] iArr = this.f16830OooO00o;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    public static int OooO0o(int i) {
        return i & 511;
    }

    public static int OooO0o0(int i) {
        return i & 1023;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        return (byte) (b ^ OooO00o());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f16828OooO00o) {
            throw new IllegalStateException(m16457OooO00o() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ OooO00o());
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16457OooO00o() {
        return "HC-128";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        AbstractC6370iIIIl r3;
        if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r32 = (C6274iilL1L) r4;
            this.f16831OooO0O0 = r32.m17301OooO00o();
            r3 = r32.OooO00o();
        } else {
            this.f16831OooO0O0 = new byte[0];
            r3 = r4;
        }
        if (r3 instanceof C6642li1LI) {
            this.f16829OooO00o = ((C6642li1LI) r3).OooO00o();
            m16456OooO00o();
            this.f16828OooO00o = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        m16456OooO00o();
    }
}
