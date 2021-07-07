package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii丨L  reason: invalid class name and case insensitive filesystem */
public class C5393IiL extends C9607iLLLi {
    @Override // com.p118pd.sdk.C9607iLLLi, com.p118pd.sdk.I1LLllll
    public String OooO00o() {
        return "VMPC-KSA3";
    }

    @Override // com.p118pd.sdk.C9607iLLLi
    public void OooO00o(byte[] bArr, byte[] bArr2) {
        ((C9607iLLLi) this).OooO0O0 = 0;
        ((C9607iLLLi) this).f23180OooO00o = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((C9607iLLLi) this).f23180OooO00o[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = ((C9607iLLLi) this).f23180OooO00o;
            int i3 = i2 & 255;
            byte b = bArr3[(((C9607iLLLi) this).OooO0O0 + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            ((C9607iLLLi) this).OooO0O0 = b;
            byte b2 = bArr3[i3];
            bArr3[i3] = bArr3[b & 255];
            bArr3[b & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = ((C9607iLLLi) this).f23180OooO00o;
            int i5 = i4 & 255;
            byte b3 = bArr4[(((C9607iLLLi) this).OooO0O0 + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            ((C9607iLLLi) this).OooO0O0 = b3;
            byte b4 = bArr4[i5];
            bArr4[i5] = bArr4[b3 & 255];
            bArr4[b3 & 255] = b4;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr5 = ((C9607iLLLi) this).f23180OooO00o;
            int i7 = i6 & 255;
            byte b5 = bArr5[(((C9607iLLLi) this).OooO0O0 + bArr5[i7] + bArr[i6 % bArr.length]) & 255];
            ((C9607iLLLi) this).OooO0O0 = b5;
            byte b6 = bArr5[i7];
            bArr5[i7] = bArr5[b5 & 255];
            bArr5[b5 & 255] = b6;
        }
        ((C9607iLLLi) this).OooO00o = 0;
    }
}
