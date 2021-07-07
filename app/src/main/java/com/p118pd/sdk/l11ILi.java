package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l11ILi */
public class l11ILi extends L1LL111 {
    public int[] OooO00o;

    public l11ILi(int i) {
        if (i >= 0) {
            super.OooO00o = i;
            this.OooO00o = new int[((i + 31) >> 5)];
            return;
        }
        throw new ArithmeticException("Negative length.");
    }

    public l11ILi(int i, int i2, SecureRandom secureRandom) {
        if (i2 <= i) {
            super.OooO00o = i;
            this.OooO00o = new int[((i + 31) >> 5)];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                int OooO00o2 = C5478Il1Li.OooO00o(secureRandom, i);
                m17551OooO00o(iArr[OooO00o2]);
                i--;
                iArr[OooO00o2] = iArr[i];
            }
            return;
        }
        throw new ArithmeticException("The hamming weight is greater than the length of vector.");
    }

    public l11ILi(int i, SecureRandom secureRandom) {
        super.OooO00o = i;
        int i2 = (i + 31) >> 5;
        this.OooO00o = new int[i2];
        int i3 = i2 - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            this.OooO00o[i4] = secureRandom.nextInt();
        }
        int i5 = i & 31;
        if (i5 != 0) {
            int[] iArr = this.OooO00o;
            iArr[i3] = ((1 << i5) - 1) & iArr[i3];
        }
    }

    public l11ILi(int i, int[] iArr) {
        if (i >= 0) {
            super.OooO00o = i;
            int i2 = (i + 31) >> 5;
            if (iArr.length == i2) {
                int[] OooO00o2 = lllILI.m17914OooO00o(iArr);
                this.OooO00o = OooO00o2;
                int i3 = i & 31;
                if (i3 != 0) {
                    int i4 = i2 - 1;
                    OooO00o2[i4] = ((1 << i3) - 1) & OooO00o2[i4];
                    return;
                }
                return;
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("negative length");
    }

    public l11ILi(l11ILi l11ili) {
        super.OooO00o = ((L1LL111) l11ili).OooO00o;
        this.OooO00o = lllILI.m17914OooO00o(l11ili.OooO00o);
    }

    public l11ILi(int[] iArr, int i) {
        this.OooO00o = iArr;
        super.OooO00o = i;
    }

    public static l11ILi OooO00o(int i, byte[] bArr) {
        if (i >= 0) {
            if (bArr.length <= ((i + 7) >> 3)) {
                return new l11ILi(i, IlIl11.m15667OooO00o(bArr));
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("negative length");
    }

    public int OooO00o(int i) {
        if (i < super.OooO00o) {
            int i2 = i >> 5;
            int i3 = i & 31;
            return (this.OooO00o[i2] & (1 << i3)) >>> i3;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.p118pd.sdk.L1LL111
    public L1LL111 OooO00o(L1LL111 l1ll111) {
        if (l1ll111 instanceof l11ILi) {
            l11ILi l11ili = (l11ILi) l1ll111;
            if (super.OooO00o == ((L1LL111) l11ili).OooO00o) {
                int[] OooO00o2 = lllILI.m17914OooO00o(l11ili.OooO00o);
                for (int length = OooO00o2.length - 1; length >= 0; length--) {
                    OooO00o2[length] = OooO00o2[length] ^ this.OooO00o[length];
                }
                return new l11ILi(super.OooO00o, OooO00o2);
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("vector is not defined over GF(2)");
    }

    @Override // com.p118pd.sdk.L1LL111
    public L1LL111 OooO00o(C6051i1lli i1lli) {
        int[] OooO00o2 = i1lli.m16915OooO00o();
        int i = super.OooO00o;
        if (i == OooO00o2.length) {
            l11ILi l11ili = new l11ILi(i);
            for (int i2 = 0; i2 < OooO00o2.length; i2++) {
                if ((this.OooO00o[OooO00o2[i2] >> 5] & (1 << (OooO00o2[i2] & 31))) != 0) {
                    int[] iArr = l11ili.OooO00o;
                    int i3 = i2 >> 5;
                    iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
                }
            }
            return l11ili;
        }
        throw new ArithmeticException("length mismatch");
    }

    public C6214iLI OooO00o(Ll111 ll111) {
        int OooO00o2 = ll111.OooO00o();
        int i = super.OooO00o;
        if (i % OooO00o2 == 0) {
            int i2 = i / OooO00o2;
            int[] iArr = new int[i2];
            int i3 = 0;
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                for (int OooO00o3 = ll111.OooO00o() - 1; OooO00o3 >= 0; OooO00o3--) {
                    if (((this.OooO00o[i3 >>> 5] >>> (i3 & 31)) & 1) == 1) {
                        iArr[i4] = iArr[i4] ^ (1 << OooO00o3);
                    }
                    i3++;
                }
            }
            return new C6214iLI(ll111, iArr);
        }
        throw new ArithmeticException("conversion is impossible");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l11ILi m17550OooO00o(int i) {
        int i2 = super.OooO00o;
        if (i > i2) {
            throw new ArithmeticException("invalid length");
        } else if (i == i2) {
            return new l11ILi(this);
        } else {
            l11ILi l11ili = new l11ILi(i);
            int i3 = i >> 5;
            int i4 = i & 31;
            System.arraycopy(this.OooO00o, 0, l11ili.OooO00o, 0, i3);
            if (i4 != 0) {
                l11ili.OooO00o[i3] = ((1 << i4) - 1) & this.OooO00o[i3];
            }
            return l11ili;
        }
    }

    public l11ILi OooO00o(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] <= super.OooO00o) {
            l11ILi l11ili = new l11ILi(length);
            for (int i = 0; i < length; i++) {
                if ((this.OooO00o[iArr[i] >> 5] & (1 << (iArr[i] & 31))) != 0) {
                    int[] iArr2 = l11ili.OooO00o;
                    int i2 = i >> 5;
                    iArr2[i2] = (1 << (i & 31)) | iArr2[i2];
                }
            }
            return l11ili;
        }
        throw new ArithmeticException("invalid index set");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17551OooO00o(int i) {
        if (i < super.OooO00o) {
            int[] iArr = this.OooO00o;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    public boolean OooO00o() {
        for (int length = this.OooO00o.length - 1; length >= 0; length--) {
            if (this.OooO00o[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17552OooO00o() {
        return IlIl11.OooO00o(this.OooO00o, (super.OooO00o + 7) >> 3);
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17553OooO00o() {
        return this.OooO00o;
    }

    public int OooO0O0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.OooO00o;
            if (i >= iArr.length) {
                return i2;
            }
            int i3 = iArr[i];
            for (int i4 = 0; i4 < 32; i4++) {
                if ((i3 & 1) != 0) {
                    i2++;
                }
                i3 >>>= 1;
            }
            i++;
        }
    }

    public l11ILi OooO0O0(int i) {
        int i2;
        int i3 = super.OooO00o;
        if (i > i3) {
            throw new ArithmeticException("invalid length");
        } else if (i == i3) {
            return new l11ILi(this);
        } else {
            l11ILi l11ili = new l11ILi(i);
            int i4 = super.OooO00o;
            int i5 = (i4 - i) >> 5;
            int i6 = (i4 - i) & 31;
            int i7 = (i + 31) >> 5;
            int i8 = 0;
            if (i6 != 0) {
                while (true) {
                    i2 = i7 - 1;
                    if (i8 >= i2) {
                        break;
                    }
                    int[] iArr = l11ili.OooO00o;
                    int[] iArr2 = this.OooO00o;
                    int i9 = i5 + 1;
                    iArr[i8] = (iArr2[i5] >>> i6) | (iArr2[i9] << (32 - i6));
                    i8++;
                    i5 = i9;
                }
                int[] iArr3 = l11ili.OooO00o;
                int[] iArr4 = this.OooO00o;
                int i10 = i5 + 1;
                iArr3[i2] = iArr4[i5] >>> i6;
                if (i10 < iArr4.length) {
                    iArr3[i2] = (iArr4[i10] << (32 - i6)) | iArr3[i2];
                }
            } else {
                System.arraycopy(this.OooO00o, i5, l11ili.OooO00o, 0, i7);
            }
            return l11ili;
        }
    }

    @Override // com.p118pd.sdk.L1LL111
    public boolean equals(Object obj) {
        if (!(obj instanceof l11ILi)) {
            return false;
        }
        l11ILi l11ili = (l11ILi) obj;
        return super.OooO00o == ((L1LL111) l11ili).OooO00o && lllILI.OooO00o(this.OooO00o, l11ili.OooO00o);
    }

    @Override // com.p118pd.sdk.L1LL111
    public int hashCode() {
        return (super.OooO00o * 31) + this.OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.L1LL111
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < super.OooO00o; i++) {
            if (i != 0 && (i & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.OooO00o[i >> 5] & (1 << (i & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }
}
