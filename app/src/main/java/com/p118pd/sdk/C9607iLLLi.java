package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.丨iLLLi  reason: invalid class name and case insensitive filesystem */
public class C9607iLLLi implements I1LLllll {
    public byte OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23180OooO00o = null;
    public byte OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23181OooO0O0;
    public byte[] OooO0OO;

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        byte[] bArr = this.f23180OooO00o;
        byte b2 = this.OooO0O0;
        byte b3 = this.OooO00o;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.OooO0O0 = b4;
        byte b5 = bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255];
        byte b6 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b6;
        this.OooO00o = (byte) ((b3 + 1) & 255);
        return (byte) (b ^ b5);
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr3 = this.f23180OooO00o;
                byte b = this.OooO0O0;
                byte b2 = this.OooO00o;
                byte b3 = bArr3[(b + bArr3[b2 & 255]) & 255];
                this.OooO0O0 = b3;
                byte b4 = bArr3[(bArr3[bArr3[b3 & 255] & 255] + 1) & 255];
                byte b5 = bArr3[b2 & 255];
                bArr3[b2 & 255] = bArr3[b3 & 255];
                bArr3[b3 & 255] = b5;
                this.OooO00o = (byte) ((b2 + 1) & 255);
                bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b4);
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public String OooO00o() {
        return "VMPC";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r42 = (C6274iilL1L) r4;
            if (r42.OooO00o() instanceof C6642li1LI) {
                C6642li1LI r3 = (C6642li1LI) r42.OooO00o();
                byte[] OooO00o2 = r42.m17301OooO00o();
                this.f23181OooO0O0 = OooO00o2;
                if (OooO00o2 == null || OooO00o2.length < 1 || OooO00o2.length > 768) {
                    throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
                }
                byte[] OooO00o3 = r3.OooO00o();
                this.OooO0OO = OooO00o3;
                OooO00o(OooO00o3, this.f23181OooO0O0);
                return;
            }
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC init parameters must include an IV");
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        this.OooO0O0 = 0;
        this.f23180OooO00o = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f23180OooO00o[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f23180OooO00o;
            int i3 = i2 & 255;
            byte b = bArr3[(this.OooO0O0 + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            this.OooO0O0 = b;
            byte b2 = bArr3[i3];
            bArr3[i3] = bArr3[b & 255];
            bArr3[b & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f23180OooO00o;
            int i5 = i4 & 255;
            byte b3 = bArr4[(this.OooO0O0 + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            this.OooO0O0 = b3;
            byte b4 = bArr4[i5];
            bArr4[i5] = bArr4[b3 & 255];
            bArr4[b3 & 255] = b4;
        }
        this.OooO00o = 0;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        OooO00o(this.OooO0OO, this.f23181OooO0O0);
    }
}
