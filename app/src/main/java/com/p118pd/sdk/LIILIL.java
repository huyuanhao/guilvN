package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.LIILIL */
public class LIILIL extends AbstractC6339ill {
    public Ll111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[][] f16281OooO00o;

    public LIILIL(LIILIL liilil) {
        int i = ((AbstractC6339ill) liilil).f18082OooO00o;
        ((AbstractC6339ill) this).f18082OooO00o = i;
        this.f18083OooO0O0 = liilil.f18083OooO0O0;
        this.OooO00o = liilil.OooO00o;
        this.f16281OooO00o = new int[i][];
        for (int i2 = 0; i2 < ((AbstractC6339ill) this).f18082OooO00o; i2++) {
            this.f16281OooO00o[i2] = lllILI.m17914OooO00o(liilil.f16281OooO00o[i2]);
        }
    }

    public LIILIL(Ll111 ll111, byte[] bArr) {
        this.OooO00o = ll111;
        int i = 8;
        int i2 = 1;
        while (ll111.OooO00o() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length >= 5) {
            int i3 = ((((bArr[3] & 255) << 24) ^ ((bArr[2] & 255) << 16)) ^ ((bArr[1] & 255) << 8)) ^ (bArr[0] & 255);
            ((AbstractC6339ill) this).f18082OooO00o = i3;
            int i4 = i2 * i3;
            if (i3 > 0) {
                int i5 = 4;
                if ((bArr.length - 4) % i4 == 0) {
                    int length = (bArr.length - 4) / i4;
                    this.f18083OooO0O0 = length;
                    int[] iArr = new int[2];
                    iArr[1] = length;
                    iArr[0] = i3;
                    this.f16281OooO00o = (int[][]) Array.newInstance(int.class, iArr);
                    for (int i6 = 0; i6 < ((AbstractC6339ill) this).f18082OooO00o; i6++) {
                        for (int i7 = 0; i7 < this.f18083OooO0O0; i7++) {
                            int i8 = 0;
                            while (i8 < i) {
                                int[] iArr2 = this.f16281OooO00o[i6];
                                iArr2[i7] = iArr2[i7] ^ ((bArr[i5] & 255) << i8);
                                i8 += 8;
                                i5++;
                            }
                            if (!this.OooO00o.m16357OooO00o(this.f16281OooO00o[i6][i7])) {
                                throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                            }
                        }
                    }
                    return;
                }
            }
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
    }

    public LIILIL(Ll111 ll111, int[][] iArr) {
        this.OooO00o = ll111;
        this.f16281OooO00o = iArr;
        ((AbstractC6339ill) this).f18082OooO00o = iArr.length;
        this.f18083OooO0O0 = iArr[0].length;
    }

    private void OooO00o(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.OooO00o.OooO0OO(iArr[length], i);
        }
    }

    private void OooO00o(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.OooO00o.OooO00o(iArr[length], iArr2[length]);
        }
    }

    public static void OooO00o(int[][] iArr, int i, int i2) {
        int[] iArr2 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private int[] m16027OooO00o(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.OooO00o.OooO0OO(iArr[length], i);
        }
        return iArr2;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public L1LL111 OooO00o(L1LL111 l1ll111) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO00o() {
        int i;
        int i2 = ((AbstractC6339ill) this).f18082OooO00o;
        if (i2 == this.f18083OooO0O0) {
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = i2;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
            for (int i3 = ((AbstractC6339ill) this).f18082OooO00o - 1; i3 >= 0; i3--) {
                iArr2[i3] = lllILI.m17914OooO00o(this.f16281OooO00o[i3]);
            }
            int i4 = ((AbstractC6339ill) this).f18082OooO00o;
            int[] iArr3 = new int[2];
            iArr3[1] = i4;
            iArr3[0] = i4;
            int[][] iArr4 = (int[][]) Array.newInstance(int.class, iArr3);
            for (int i5 = ((AbstractC6339ill) this).f18082OooO00o - 1; i5 >= 0; i5--) {
                iArr4[i5][i5] = 1;
            }
            for (int i6 = 0; i6 < ((AbstractC6339ill) this).f18082OooO00o; i6++) {
                if (iArr2[i6][i6] == 0) {
                    int i7 = i6 + 1;
                    boolean z = false;
                    while (i7 < ((AbstractC6339ill) this).f18082OooO00o) {
                        if (iArr2[i7][i6] != 0) {
                            OooO00o(iArr2, i6, i7);
                            OooO00o(iArr4, i6, i7);
                            i7 = ((AbstractC6339ill) this).f18082OooO00o;
                            z = true;
                        }
                        i7++;
                    }
                    if (!z) {
                        throw new ArithmeticException("Matrix is not invertible.");
                    }
                }
                int OooO00o2 = this.OooO00o.OooO00o(iArr2[i6][i6]);
                OooO00o(iArr2[i6], OooO00o2);
                OooO00o(iArr4[i6], OooO00o2);
                for (int i8 = 0; i8 < ((AbstractC6339ill) this).f18082OooO00o; i8++) {
                    if (!(i8 == i6 || (i = iArr2[i8][i6]) == 0)) {
                        int[] OooO00o3 = m16027OooO00o(iArr2[i6], i);
                        int[] OooO00o4 = m16027OooO00o(iArr4[i6], i);
                        OooO00o(OooO00o3, iArr2[i8]);
                        OooO00o(OooO00o4, iArr4[i8]);
                    }
                }
            }
            return new LIILIL(this.OooO00o, iArr4);
        }
        throw new ArithmeticException("Matrix is not invertible.");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO00o(C6051i1lli i1lli) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO00o(AbstractC6339ill r2) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16028OooO00o() {
        for (int i = 0; i < ((AbstractC6339ill) this).f18082OooO00o; i++) {
            for (int i2 = 0; i2 < this.f18083OooO0O0; i2++) {
                if (this.f16281OooO00o[i][i2] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16029OooO00o() {
        int i = 8;
        int i2 = 1;
        while (this.OooO00o.OooO00o() > i) {
            i2++;
            i += 8;
        }
        int i3 = ((AbstractC6339ill) this).f18082OooO00o;
        int i4 = this.f18083OooO0O0 * i3 * i2;
        int i5 = 4;
        byte[] bArr = new byte[(i4 + 4)];
        bArr[0] = (byte) (i3 & 255);
        bArr[1] = (byte) ((i3 >>> 8) & 255);
        bArr[2] = (byte) ((i3 >>> 16) & 255);
        bArr[3] = (byte) ((i3 >>> 24) & 255);
        for (int i6 = 0; i6 < ((AbstractC6339ill) this).f18082OooO00o; i6++) {
            for (int i7 = 0; i7 < this.f18083OooO0O0; i7++) {
                int i8 = 0;
                while (i8 < i) {
                    bArr[i5] = (byte) (this.f16281OooO00o[i6][i7] >>> i8);
                    i8 += 8;
                    i5++;
                }
            }
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public L1LL111 OooO0O0(L1LL111 l1ll111) {
        throw new RuntimeException("Not implemented.");
    }

    public boolean equals(Object obj) {
        int i;
        if (obj != null && (obj instanceof LIILIL)) {
            LIILIL liilil = (LIILIL) obj;
            if (this.OooO00o.equals(liilil.OooO00o) && ((AbstractC6339ill) liilil).f18082OooO00o == (i = this.f18083OooO0O0) && liilil.f18083OooO0O0 == i) {
                for (int i2 = 0; i2 < ((AbstractC6339ill) this).f18082OooO00o; i2++) {
                    for (int i3 = 0; i3 < this.f18083OooO0O0; i3++) {
                        if (this.f16281OooO00o[i2][i3] != liilil.f16281OooO00o[i2][i3]) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.OooO00o.hashCode() * 31) + ((AbstractC6339ill) this).f18082OooO00o) * 31) + this.f18083OooO0O0;
        for (int i = 0; i < ((AbstractC6339ill) this).f18082OooO00o; i++) {
            for (int i2 = 0; i2 < this.f18083OooO0O0; i2++) {
                hashCode = (hashCode * 31) + this.f16281OooO00o[i][i2];
            }
        }
        return hashCode;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public String toString() {
        String str = ((AbstractC6339ill) this).f18082OooO00o + " x " + this.f18083OooO0O0 + " Matrix over " + this.OooO00o.toString() + ": \n";
        for (int i = 0; i < ((AbstractC6339ill) this).f18082OooO00o; i++) {
            for (int i2 = 0; i2 < this.f18083OooO0O0; i2++) {
                str = str + this.OooO00o.m16356OooO00o(this.f16281OooO00o[i][i2]) + " : ";
            }
            str = str + "\n";
        }
        return str;
    }
}
