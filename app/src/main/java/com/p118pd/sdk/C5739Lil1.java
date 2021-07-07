package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.Lil1丨  reason: invalid class name and case insensitive filesystem */
public class C5739Lil1 implements I1LLllll {
    public static final int OooO0OO = 256;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16641OooO00o = null;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16642OooO0O0 = null;

    private void OooO00o(byte[] bArr) {
        this.f16642OooO0O0 = bArr;
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        if (this.f16641OooO00o == null) {
            this.f16641OooO00o = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.f16641OooO00o[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.f16641OooO00o;
            i3 = ((bArr[i2] & 255) + bArr2[i4] + i3) & 255;
            byte b = bArr2[i4];
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        int i = (this.OooO00o + 1) & 255;
        this.OooO00o = i;
        byte[] bArr = this.f16641OooO00o;
        int i2 = (bArr[i] + this.OooO0O0) & 255;
        this.OooO0O0 = i2;
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return (byte) (b ^ bArr[(bArr[i] + bArr[i2]) & 255]);
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (this.OooO00o + 1) & 255;
                this.OooO00o = i5;
                byte[] bArr3 = this.f16641OooO00o;
                int i6 = (bArr3[i5] + this.OooO0O0) & 255;
                this.OooO0O0 = i6;
                byte b = bArr3[i5];
                bArr3[i5] = bArr3[i6];
                bArr3[i6] = b;
                bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + bArr3[i6]) & 255] ^ bArr[i4 + i]);
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public String OooO00o() {
        return "RC4";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r4).OooO00o();
            this.f16642OooO0O0 = OooO00o2;
            OooO00o(OooO00o2);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        OooO00o(this.f16642OooO0O0);
    }
}
