package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il1l丨  reason: invalid class name and case insensitive filesystem */
public class C5421Il1l extends C9611iLlI {
    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    public int OooO00o() {
        return 24;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15647OooO00o() {
        return "XSalsa20";
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException(m15647OooO00o() + " doesn't support re-init with null key");
        } else if (bArr.length == 32) {
            super.OooO00o(bArr, bArr2);
            AbstractC6464l1l.OooO00o(bArr2, 8, ((C9611iLlI) this).f23191OooO00o, 8, 2);
            int[] iArr = ((C9611iLlI) this).f23191OooO00o;
            int[] iArr2 = new int[iArr.length];
            C9611iLlI.OooO00o(20, iArr, iArr2);
            int[] iArr3 = ((C9611iLlI) this).f23191OooO00o;
            iArr3[1] = iArr2[0] - iArr3[0];
            iArr3[2] = iArr2[5] - iArr3[5];
            iArr3[3] = iArr2[10] - iArr3[10];
            iArr3[4] = iArr2[15] - iArr3[15];
            iArr3[11] = iArr2[6] - iArr3[6];
            iArr3[12] = iArr2[7] - iArr3[7];
            iArr3[13] = iArr2[8] - iArr3[8];
            iArr3[14] = iArr2[9] - iArr3[9];
            AbstractC6464l1l.OooO00o(bArr2, 16, iArr3, 6, 2);
        } else {
            throw new IllegalArgumentException(m15647OooO00o() + " requires a 256 bit key");
        }
    }
}
