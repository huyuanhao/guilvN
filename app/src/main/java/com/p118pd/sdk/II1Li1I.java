package com.p118pd.sdk;

import com.qiyukf.basesdk.sdk.ResponseCode;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.II1Li1I */
public class II1Li1I implements li1l11I1 {
    public static final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static short[] f15446OooO00o = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, C6728ll11.OooOoO0, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, ResponseCode.RES_SUCCESS, 116, 220, 201, 93, 92, 49, 164, C6728ll11.OooOoOO, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, C6728ll11.OooOooO, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, C6728ll11.OooOoo0, 126, 255, 140, 14, 226, 12, 239, 188, C6728ll11.OooOoo, 117, C6728ll11.OooOoO, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15447OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f15448OooO00o;
    public int[] OooO0O0;
    public int[] OooO0OO;
    public int[] OooO0Oo;

    private int OooO00o(int i, int i2) {
        int i3 = i2 & 255;
        short[] sArr = f15446OooO00o;
        int i4 = ((i2 >> 8) & 255) ^ sArr[this.f15448OooO00o[i] ^ i3];
        int i5 = i3 ^ sArr[this.OooO0O0[i] ^ i4];
        int i6 = i4 ^ sArr[this.OooO0OO[i] ^ i5];
        return (i6 << 8) + (sArr[this.OooO0Oo[i] ^ i6] ^ i5);
    }

    private int OooO0O0(int i, int i2) {
        int i3 = i2 & 255;
        int i4 = (i2 >> 8) & 255;
        short[] sArr = f15446OooO00o;
        int i5 = i3 ^ sArr[this.OooO0Oo[i] ^ i4];
        int i6 = i4 ^ sArr[this.OooO0OO[i] ^ i5];
        int i7 = i5 ^ sArr[this.OooO0O0[i] ^ i6];
        return ((sArr[this.f15448OooO00o[i] ^ i7] ^ i6) << 8) + i7;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.OooO0O0 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.f15447OooO00o) {
            OooO0OO(bArr, i, bArr2, i2);
            return 8;
        } else {
            OooO0O0(bArr, i, bArr2, i2);
            return 8;
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15355OooO00o() {
        return "SKIPJACK";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) {
        if (r6 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r6).OooO00o();
            this.f15447OooO00o = z;
            this.f15448OooO00o = new int[32];
            this.OooO0O0 = new int[32];
            this.OooO0OO = new int[32];
            this.OooO0Oo = new int[32];
            for (int i = 0; i < 32; i++) {
                int i2 = i * 4;
                this.f15448OooO00o[i] = OooO00o2[i2 % 10] & 255;
                this.OooO0O0[i] = OooO00o2[(i2 + 1) % 10] & 255;
                this.OooO0OO[i] = OooO00o2[(i2 + 2) % 10] & 255;
                this.OooO0Oo[i] = OooO00o2[(i2 + 3) % 10] & 255;
            }
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + r6.getClass().getName());
    }

    public int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i + 0] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 31;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 8) {
                int OooO0O02 = OooO0O0(i7, i4);
                i7--;
                i9++;
                i6 = i3;
                i3 = OooO0O02;
                i4 = (i5 ^ OooO0O02) ^ (i7 + 1);
                i5 = i6;
            }
            int i10 = 0;
            while (i10 < 8) {
                int OooO0O03 = OooO0O0(i7, i4);
                i7--;
                i10++;
                i6 = (i3 ^ i4) ^ (i7 + 1);
                i3 = OooO0O03;
                i4 = i5;
                i5 = i6;
            }
        }
        bArr2[i2 + 0] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    public int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i + 0] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 8) {
                int OooO00o2 = OooO00o(i7, i3);
                i7++;
                i9++;
                i4 = OooO00o2;
                i3 = (i6 ^ OooO00o2) ^ i7;
                i6 = i5;
                i5 = i4;
            }
            int i10 = 0;
            while (i10 < 8) {
                int i11 = i7 + 1;
                int i12 = (i4 ^ i3) ^ i11;
                int OooO00o3 = OooO00o(i7, i3);
                i10++;
                i7 = i11;
                i4 = OooO00o3;
                i3 = i6;
                i6 = i5;
                i5 = i12;
            }
        }
        bArr2[i2 + 0] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
