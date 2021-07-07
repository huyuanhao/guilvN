package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.llL  reason: case insensitive filesystem */
public class C6762llL implements I1LLllll {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18748OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18749OooO00o = new int[1024];
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18750OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f18751OooO0O0 = new int[1024];
    public byte[] OooO0OO = new byte[4];

    @Override // com.p118pd.sdk.I1LLllll
    private byte OooO00o() {
        if (this.OooO0O0 == 0) {
            int OooO00o2 = m17868OooO00o();
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
    private int m17868OooO00o() {
        int i;
        int i2;
        int i3 = this.OooO00o;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int[] iArr = this.f18749OooO00o;
            int i5 = iArr[(i4 - 3) & 1023];
            int i6 = iArr[(i4 - 1023) & 1023];
            int i7 = iArr[i4];
            int OooO00o2 = iArr[(i4 - 10) & 1023] + (OooO00o(i6, 23) ^ OooO00o(i5, 10));
            int[] iArr2 = this.f18751OooO0O0;
            iArr[i4] = i7 + OooO00o2 + iArr2[(i5 ^ i6) & 1023];
            int[] iArr3 = this.f18749OooO00o;
            int i8 = iArr3[(i4 - 12) & 1023];
            i = iArr2[i8 & 255] + iArr2[((i8 >> 8) & 255) + 256] + iArr2[((i8 >> 16) & 255) + 512] + iArr2[((i8 >> 24) & 255) + 768];
            i2 = iArr3[i4];
        } else {
            int[] iArr4 = this.f18751OooO0O0;
            int i9 = iArr4[(i4 - 3) & 1023];
            int i10 = iArr4[(i4 - 1023) & 1023];
            int i11 = iArr4[i4];
            int OooO00o3 = iArr4[(i4 - 10) & 1023] + (OooO00o(i10, 23) ^ OooO00o(i9, 10));
            int[] iArr5 = this.f18749OooO00o;
            iArr4[i4] = i11 + OooO00o3 + iArr5[(i9 ^ i10) & 1023];
            int[] iArr6 = this.f18751OooO0O0;
            int i12 = iArr6[(i4 - 12) & 1023];
            i = iArr5[i12 & 255] + iArr5[((i12 >> 8) & 255) + 256] + iArr5[((i12 >> 16) & 255) + 512] + iArr5[((i12 >> 24) & 255) + 768];
            i2 = iArr6[i4];
        }
        int i13 = i2 ^ i;
        this.OooO00o = (this.OooO00o + 1) & 2047;
        return i13;
    }

    public static int OooO00o(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17869OooO00o() {
        byte[] bArr = this.f18748OooO00o;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        } else if (this.f18750OooO0O0.length >= 16) {
            byte[] bArr2 = this.f18748OooO00o;
            if (bArr2.length != 32) {
                byte[] bArr3 = new byte[32];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                byte[] bArr4 = this.f18748OooO00o;
                System.arraycopy(bArr4, 0, bArr3, 16, bArr4.length);
                this.f18748OooO00o = bArr3;
            }
            byte[] bArr5 = this.f18750OooO0O0;
            if (bArr5.length < 32) {
                byte[] bArr6 = new byte[32];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                byte[] bArr7 = this.f18750OooO0O0;
                System.arraycopy(bArr7, 0, bArr6, bArr7.length, 32 - bArr7.length);
                this.f18750OooO0O0 = bArr6;
            }
            this.OooO0O0 = 0;
            this.OooO00o = 0;
            int[] iArr = new int[2560];
            for (int i = 0; i < 32; i++) {
                int i2 = i >> 2;
                iArr[i2] = iArr[i2] | ((this.f18748OooO00o[i] & 255) << ((i & 3) * 8));
            }
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = (i3 >> 2) + 8;
                iArr[i4] = iArr[i4] | ((this.f18750OooO0O0[i3] & 255) << ((i3 & 3) * 8));
            }
            for (int i5 = 16; i5 < 2560; i5++) {
                int i6 = iArr[i5 - 2];
                int i7 = iArr[i5 - 15];
                iArr[i5] = ((i6 >>> 10) ^ (OooO00o(i6, 17) ^ OooO00o(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (OooO00o(i7, 7) ^ OooO00o(i7, 18))) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 512, this.f18749OooO00o, 0, 1024);
            System.arraycopy(iArr, 1536, this.f18751OooO0O0, 0, 1024);
            for (int i8 = 0; i8 < 4096; i8++) {
                m17868OooO00o();
            }
            this.OooO00o = 0;
        } else {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        return (byte) (b ^ OooO00o());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f18747OooO00o) {
            throw new IllegalStateException(m17870OooO00o() + " not initialised");
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
    public String m17870OooO00o() {
        return "HC-256";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        AbstractC6370iIIIl r3;
        if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r32 = (C6274iilL1L) r4;
            this.f18750OooO0O0 = r32.m17301OooO00o();
            r3 = r32.OooO00o();
        } else {
            this.f18750OooO0O0 = new byte[0];
            r3 = r4;
        }
        if (r3 instanceof C6642li1LI) {
            this.f18748OooO00o = ((C6642li1LI) r3).OooO00o();
            m17869OooO00o();
            this.f18747OooO00o = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        m17869OooO00o();
    }
}
