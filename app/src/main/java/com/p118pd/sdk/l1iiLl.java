package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.l1iiLl */
public class l1iiLl implements I1LLllll {
    public final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18291OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18292OooO00o = new byte[1024];

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18293OooO00o = null;
    public final int OooO0O0 = 256;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18294OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f18295OooO0O0 = null;
    public int OooO0OO = 0;
    public int OooO0Oo = 0;
    public int OooO0o = 0;
    public int OooO0o0 = 0;

    @Override // com.p118pd.sdk.I1LLllll
    private void OooO00o() {
        int i;
        int i2;
        int i3 = this.OooO0Oo;
        int i4 = this.OooO0o0 + 1;
        this.OooO0o0 = i4;
        this.OooO0Oo = i3 + i4;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = this.f18293OooO00o[i5];
            int i7 = i5 & 3;
            if (i7 == 0) {
                i2 = this.OooO0OO;
                i = i2 << 13;
            } else if (i7 == 1) {
                i2 = this.OooO0OO;
                i = i2 >>> 6;
            } else if (i7 == 2) {
                i2 = this.OooO0OO;
                i = i2 << 2;
            } else if (i7 != 3) {
                int i8 = this.OooO0OO;
                int[] iArr = this.f18293OooO00o;
                int i9 = i8 + iArr[(i5 + 128) & 255];
                this.OooO0OO = i9;
                int i10 = iArr[(i6 >>> 2) & 255] + i9 + this.OooO0Oo;
                iArr[i5] = i10;
                int[] iArr2 = this.f18295OooO0O0;
                int i11 = iArr[(i10 >>> 10) & 255] + i6;
                this.OooO0Oo = i11;
                iArr2[i5] = i11;
            } else {
                i2 = this.OooO0OO;
                i = i2 >>> 16;
            }
            this.OooO0OO = i2 ^ i;
            int i82 = this.OooO0OO;
            int[] iArr3 = this.f18293OooO00o;
            int i92 = i82 + iArr3[(i5 + 128) & 255];
            this.OooO0OO = i92;
            int i102 = iArr3[(i6 >>> 2) & 255] + i92 + this.OooO0Oo;
            iArr3[i5] = i102;
            int[] iArr22 = this.f18295OooO0O0;
            int i112 = iArr3[(i102 >>> 10) & 255] + i6;
            this.OooO0Oo = i112;
            iArr22[i5] = i112;
        }
    }

    private void OooO00o(byte[] bArr) {
        this.f18294OooO0O0 = bArr;
        if (this.f18293OooO00o == null) {
            this.f18293OooO00o = new int[256];
        }
        if (this.f18295OooO0O0 == null) {
            this.f18295OooO0O0 = new int[256];
        }
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.f18293OooO00o;
            this.f18295OooO0O0[i] = 0;
            iArr[i] = 0;
        }
        this.OooO0o0 = 0;
        this.OooO0Oo = 0;
        this.OooO0OO = 0;
        this.OooO0o = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i2 = 0; i2 < length; i2 += 4) {
            this.f18295OooO0O0[i2 >>> 2] = AbstractC6464l1l.OooO0O0(bArr2, i2);
        }
        int[] iArr2 = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr2[i3] = -1640531527;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            OooO00o(iArr2);
        }
        int i5 = 0;
        while (i5 < 2) {
            for (int i6 = 0; i6 < 256; i6 += 8) {
                for (int i7 = 0; i7 < 8; i7++) {
                    iArr2[i7] = iArr2[i7] + (i5 < 1 ? this.f18295OooO0O0[i6 + i7] : this.f18293OooO00o[i6 + i7]);
                }
                OooO00o(iArr2);
                for (int i8 = 0; i8 < 8; i8++) {
                    this.f18293OooO00o[i6 + i8] = iArr2[i8];
                }
            }
            i5++;
        }
        OooO00o();
        this.f18291OooO00o = true;
    }

    private void OooO00o(int[] iArr) {
        iArr[0] = iArr[0] ^ (iArr[1] << 11);
        iArr[3] = iArr[3] + iArr[0];
        iArr[1] = iArr[1] + iArr[2];
        iArr[1] = iArr[1] ^ (iArr[2] >>> 2);
        iArr[4] = iArr[4] + iArr[1];
        iArr[2] = iArr[2] + iArr[3];
        iArr[2] = iArr[2] ^ (iArr[3] << 8);
        iArr[5] = iArr[5] + iArr[2];
        iArr[3] = iArr[3] + iArr[4];
        iArr[3] = iArr[3] ^ (iArr[4] >>> 16);
        iArr[6] = iArr[6] + iArr[3];
        iArr[4] = iArr[4] + iArr[5];
        iArr[4] = iArr[4] ^ (iArr[5] << 10);
        iArr[7] = iArr[7] + iArr[4];
        iArr[5] = iArr[5] + iArr[6];
        iArr[5] = (iArr[6] >>> 4) ^ iArr[5];
        iArr[0] = iArr[0] + iArr[5];
        iArr[6] = iArr[6] + iArr[7];
        iArr[6] = iArr[6] ^ (iArr[7] << 8);
        iArr[1] = iArr[1] + iArr[6];
        iArr[7] = iArr[7] + iArr[0];
        iArr[7] = iArr[7] ^ (iArr[0] >>> 9);
        iArr[2] = iArr[2] + iArr[7];
        iArr[0] = iArr[0] + iArr[1];
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        if (this.OooO0o == 0) {
            OooO00o();
            this.f18292OooO00o = AbstractC6464l1l.OooO00o(this.f18295OooO0O0);
        }
        byte[] bArr = this.f18292OooO00o;
        int i = this.OooO0o;
        byte b2 = (byte) (b ^ bArr[i]);
        this.OooO0o = (i + 1) & 1023;
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f18291OooO00o) {
            throw new IllegalStateException(m17581OooO00o() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (this.OooO0o == 0) {
                    OooO00o();
                    this.f18292OooO00o = AbstractC6464l1l.OooO00o(this.f18295OooO0O0);
                }
                byte[] bArr3 = this.f18292OooO00o;
                int i5 = this.OooO0o;
                bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                this.OooO0o = (i5 + 1) & 1023;
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17581OooO00o() {
        return "ISAAC";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to ISAAC init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        OooO00o(this.f18294OooO0O0);
    }
}
