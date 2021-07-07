package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1i丨i  reason: invalid class name and case insensitive filesystem */
public class C6040i1ii implements AbstractC97491iL {
    public static final byte[] OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    @Override // com.p118pd.sdk.AbstractC97491iL
    public int OooO00o() {
        return 1;
    }

    @Override // com.p118pd.sdk.AbstractC97491iL
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i3 + i5;
            byte[] bArr3 = OooO00o;
            bArr2[i6] = bArr3[(bArr[i] >> 4) & 15];
            bArr2[i6 + 1] = bArr3[bArr[i] & 15];
            i++;
            i4++;
            i5 += 2;
        }
        return i2 * 2;
    }

    @Override // com.p118pd.sdk.AbstractC97491iL
    public int OooO0O0() {
        return 2;
    }

    @Override // com.p118pd.sdk.AbstractC97491iL
    public int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 / 2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i5 * 2) + i;
            byte b = bArr[i6];
            byte b2 = bArr[i6 + 1];
            if (b < 97) {
                bArr2[i3] = (byte) ((b - 48) << 4);
            } else {
                bArr2[i3] = (byte) (((b - 97) + 10) << 4);
            }
            if (b2 < 97) {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) (b2 - 48)));
            } else {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) ((b2 - 97) + 10)));
            }
            i3++;
        }
        return i4;
    }
}
