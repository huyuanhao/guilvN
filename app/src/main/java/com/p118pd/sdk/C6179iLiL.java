package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iLiL  reason: case insensitive filesystem */
public class C6179iLiL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f17751OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[][] f17752OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[][][] f17753OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short[][][] f17754OooO0O0;
    public int OooO0OO;

    public C6179iLiL(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & 255;
        this.OooO00o = i;
        int i2 = b2 & 255;
        this.OooO0O0 = i2;
        this.OooO0OO = i2 - i;
        this.f17753OooO00o = sArr;
        this.f17754OooO0O0 = sArr2;
        this.f17752OooO00o = sArr3;
        this.f17751OooO00o = sArr4;
    }

    public C6179iLiL(int i, int i2, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        int i3 = i2 - i;
        this.OooO0OO = i3;
        int[] iArr = new int[3];
        iArr[2] = i;
        iArr[1] = i3;
        iArr[0] = i3;
        this.f17753OooO00o = (short[][][]) Array.newInstance(short.class, iArr);
        int i4 = this.OooO0OO;
        int i5 = this.OooO00o;
        int[] iArr2 = new int[3];
        iArr2[2] = i5;
        iArr2[1] = i5;
        iArr2[0] = i4;
        this.f17754OooO0O0 = (short[][][]) Array.newInstance(short.class, iArr2);
        int i6 = this.OooO0OO;
        int[] iArr3 = new int[2];
        iArr3[1] = this.OooO0O0;
        iArr3[0] = i6;
        this.f17752OooO00o = (short[][]) Array.newInstance(short.class, iArr3);
        int i7 = this.OooO0OO;
        this.f17751OooO00o = new short[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            for (int i9 = 0; i9 < this.OooO0OO; i9++) {
                for (int i10 = 0; i10 < this.OooO00o; i10++) {
                    this.f17753OooO00o[i8][i9][i10] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < this.OooO00o; i12++) {
                for (int i13 = 0; i13 < this.OooO00o; i13++) {
                    this.f17754OooO0O0[i11][i12][i13] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i14 = 0; i14 < i7; i14++) {
            for (int i15 = 0; i15 < this.OooO0O0; i15++) {
                this.f17752OooO00o[i14][i15] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i16 = 0; i16 < i7; i16++) {
            this.f17751OooO00o[i16] = (short) (secureRandom.nextInt() & 255);
        }
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m17135OooO00o() {
        return this.f17751OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][] m17136OooO00o() {
        return this.f17752OooO00o;
    }

    public short[][] OooO00o(short[] sArr) {
        int i = this.OooO0OO;
        int[] iArr = new int[2];
        iArr[1] = i + 1;
        int i2 = 0;
        iArr[0] = i;
        short[][] sArr2 = (short[][]) Array.newInstance(short.class, iArr);
        short[] sArr3 = new short[this.OooO0OO];
        for (int i3 = 0; i3 < this.OooO0OO; i3++) {
            for (int i4 = 0; i4 < this.OooO00o; i4++) {
                for (int i5 = 0; i5 < this.OooO00o; i5++) {
                    sArr3[i3] = C6275iili.OooO00o(sArr3[i3], C6275iili.OooO0O0(C6275iili.OooO0O0(this.f17754OooO0O0[i3][i4][i5], sArr[i4]), sArr[i5]));
                }
            }
        }
        for (int i6 = 0; i6 < this.OooO0OO; i6++) {
            for (int i7 = 0; i7 < this.OooO0OO; i7++) {
                for (int i8 = 0; i8 < this.OooO00o; i8++) {
                    sArr2[i6][i7] = C6275iili.OooO00o(sArr2[i6][i7], C6275iili.OooO0O0(this.f17753OooO00o[i6][i7][i8], sArr[i8]));
                }
            }
        }
        for (int i9 = 0; i9 < this.OooO0OO; i9++) {
            for (int i10 = 0; i10 < this.OooO00o; i10++) {
                sArr3[i9] = C6275iili.OooO00o(sArr3[i9], C6275iili.OooO0O0(this.f17752OooO00o[i9][i10], sArr[i10]));
            }
        }
        for (int i11 = 0; i11 < this.OooO0OO; i11++) {
            for (int i12 = this.OooO00o; i12 < this.OooO0O0; i12++) {
                short[] sArr4 = sArr2[i11];
                int i13 = this.OooO00o;
                sArr4[i12 - i13] = C6275iili.OooO00o(this.f17752OooO00o[i11][i12], sArr2[i11][i12 - i13]);
            }
        }
        for (int i14 = 0; i14 < this.OooO0OO; i14++) {
            sArr3[i14] = C6275iili.OooO00o(sArr3[i14], this.f17751OooO00o[i14]);
        }
        while (true) {
            int i15 = this.OooO0OO;
            if (i2 >= i15) {
                return sArr2;
            }
            sArr2[i2][i15] = sArr3[i2];
            i2++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][][] m17137OooO00o() {
        return this.f17753OooO00o;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short[][][] m17138OooO0O0() {
        return this.f17754OooO0O0;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6179iLiL)) {
            return false;
        }
        C6179iLiL ilil = (C6179iLiL) obj;
        return this.OooO00o == ilil.OooO0O0() && this.OooO0O0 == ilil.OooO0OO() && this.OooO0OO == ilil.OooO00o() && C5601L1i.OooO00o(this.f17753OooO00o, ilil.m17137OooO00o()) && C5601L1i.OooO00o(this.f17754OooO0O0, ilil.m17138OooO0O0()) && C5601L1i.OooO00o(this.f17752OooO00o, ilil.m17136OooO00o()) && C5601L1i.OooO00o(this.f17751OooO00o, ilil.m17135OooO00o());
    }

    public int hashCode() {
        return (((((((((((this.OooO00o * 37) + this.OooO0O0) * 37) + this.OooO0OO) * 37) + C9586iIILl.OooO00o(this.f17753OooO00o)) * 37) + C9586iIILl.OooO00o(this.f17754OooO0O0)) * 37) + C9586iIILl.OooO00o(this.f17752OooO00o)) * 37) + C9586iIILl.OooO00o(this.f17751OooO00o);
    }
}
