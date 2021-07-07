package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.L1L丨丨  reason: invalid class name and case insensitive filesystem */
public class C5585L1L {
    public static final char OooO00o = 'I';

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f16188OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ll111 f16189OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16190OooO00o;

    public C5585L1L(C5585L1L r2) {
        this.f16189OooO00o = r2.f16189OooO00o;
        this.f16188OooO00o = r2.f16188OooO00o;
        this.f16190OooO00o = lllILI.m17914OooO00o(r2.f16190OooO00o);
    }

    public C5585L1L(Ll111 ll111) {
        this.f16189OooO00o = ll111;
        this.f16188OooO00o = -1;
        this.f16190OooO00o = new int[1];
    }

    public C5585L1L(Ll111 ll111, int i) {
        this.f16189OooO00o = ll111;
        this.f16188OooO00o = i;
        int[] iArr = new int[(i + 1)];
        this.f16190OooO00o = iArr;
        iArr[i] = 1;
    }

    public C5585L1L(Ll111 ll111, int i, char c, SecureRandom secureRandom) {
        this.f16189OooO00o = ll111;
        if (c == 'I') {
            this.f16190OooO00o = OooO00o(i, secureRandom);
            OooO00o();
            return;
        }
        throw new IllegalArgumentException(" Error: type " + c + " is not defined for GF2smallmPolynomial");
    }

    public C5585L1L(Ll111 ll111, byte[] bArr) {
        this.f16189OooO00o = ll111;
        int i = 8;
        int i2 = 1;
        while (ll111.OooO00o() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.f16190OooO00o = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f16190OooO00o;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.f16190OooO00o;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.f16189OooO00o.m16357OooO00o(this.f16190OooO00o[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    OooO00o();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public C5585L1L(Ll111 ll111, int[] iArr) {
        this.f16189OooO00o = ll111;
        this.f16190OooO00o = m15961OooO00o(iArr);
        OooO00o();
    }

    public C5585L1L(C6214iLI r2) {
        this(r2.OooO00o(), r2.m17198OooO00o());
    }

    public static int OooO00o(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void OooO00o() {
        int length = this.f16190OooO00o.length;
        do {
            this.f16188OooO00o = length - 1;
            length = this.f16188OooO00o;
            if (length < 0) {
                return;
            }
        } while (this.f16190OooO00o[length] == 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m15960OooO00o(int[] iArr) {
        if (iArr[0] == 0) {
            return false;
        }
        int OooO00o2 = OooO00o(iArr) >> 1;
        int[] iArr2 = {0, 1};
        int[] iArr3 = {0, 1};
        int OooO00o3 = this.f16189OooO00o.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            for (int i2 = OooO00o3 - 1; i2 >= 0; i2--) {
                iArr2 = OooO0O0(iArr2, iArr2, iArr);
            }
            iArr2 = m15961OooO00o(iArr2);
            if (OooO00o(OooO0O0(m15962OooO00o(iArr2, iArr3), iArr)) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(int[] iArr, int[] iArr2) {
        int OooO00o2 = OooO00o(iArr);
        if (OooO00o2 != OooO00o(iArr2)) {
            return false;
        }
        for (int i = 0; i <= OooO00o2; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] OooO00o(int i, SecureRandom secureRandom) {
        int[] iArr = new int[(i + 1)];
        iArr[i] = 1;
        iArr[0] = this.f16189OooO00o.OooO0O0(secureRandom);
        for (int i2 = 1; i2 < i; i2++) {
            iArr[i2] = this.f16189OooO00o.OooO00o(secureRandom);
        }
        while (!m15960OooO00o(iArr)) {
            int OooO00o2 = C5478Il1Li.OooO00o(secureRandom, i);
            if (OooO00o2 == 0) {
                iArr[0] = this.f16189OooO00o.OooO0O0(secureRandom);
            } else {
                iArr[OooO00o2] = this.f16189OooO00o.OooO00o(secureRandom);
            }
        }
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m15961OooO00o(int[] iArr) {
        int OooO00o2 = OooO00o(iArr);
        if (OooO00o2 == -1) {
            return new int[1];
        }
        int i = OooO00o2 + 1;
        if (iArr.length == i) {
            return lllILI.m17914OooO00o(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    private int[] OooO00o(int[] iArr, int i) {
        int OooO00o2 = OooO00o(iArr);
        if (OooO00o2 == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return lllILI.m17914OooO00o(iArr);
        }
        int[] iArr2 = new int[(OooO00o2 + 1)];
        while (OooO00o2 >= 0) {
            iArr2[OooO00o2] = this.f16189OooO00o.OooO0OO(iArr[OooO00o2], i);
            OooO00o2--;
        }
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private int[] m15962OooO00o(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f16189OooO00o.OooO00o(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private int[] OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO00o2 = m15961OooO00o(iArr3);
        int[] OooO0OO = OooO0OO(iArr2, iArr3);
        int[] iArr4 = {0};
        int[] OooO0OO2 = OooO0OO(iArr, iArr3);
        while (OooO00o(OooO0OO) != -1) {
            int[][] OooO00o3 = m15963OooO00o(OooO00o2, OooO0OO);
            int[] OooO00o4 = m15961OooO00o(OooO0OO);
            int[] OooO00o5 = m15961OooO00o(OooO00o3[1]);
            int[] OooO00o6 = m15962OooO00o(iArr4, OooO0O0(OooO00o3[0], OooO0OO2, iArr3));
            iArr4 = m15961OooO00o(OooO0OO2);
            OooO0OO2 = m15961OooO00o(OooO00o6);
            OooO00o2 = OooO00o4;
            OooO0OO = OooO00o5;
        }
        return OooO00o(iArr4, this.f16189OooO00o.OooO00o(OooO0O0(OooO00o2)));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private int[][] m15963OooO00o(int[] iArr, int[] iArr2) {
        int OooO00o2 = OooO00o(iArr2);
        int OooO00o3 = OooO00o(iArr) + 1;
        if (OooO00o2 != -1) {
            int[][] iArr3 = {new int[1], new int[OooO00o3]};
            int OooO00o4 = this.f16189OooO00o.OooO00o(OooO0O0(iArr2));
            iArr3[0][0] = 0;
            System.arraycopy(iArr, 0, iArr3[1], 0, iArr3[1].length);
            while (OooO00o2 <= OooO00o(iArr3[1])) {
                int[] iArr4 = {this.f16189OooO00o.OooO0OO(OooO0O0(iArr3[1]), OooO00o4)};
                int[] OooO00o5 = OooO00o(iArr2, iArr4[0]);
                int OooO00o6 = OooO00o(iArr3[1]) - OooO00o2;
                int[] OooO0O0 = OooO0O0(OooO00o5, OooO00o6);
                iArr3[0] = m15962OooO00o(OooO0O0(iArr4, OooO00o6), iArr3[0]);
                iArr3[1] = m15962OooO00o(OooO0O0, iArr3[1]);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero.");
    }

    public static int OooO0O0(int[] iArr) {
        int OooO00o2 = OooO00o(iArr);
        if (OooO00o2 == -1) {
            return 0;
        }
        return iArr[OooO00o2];
    }

    public static int[] OooO0O0(int[] iArr, int i) {
        int OooO00o2 = OooO00o(iArr);
        if (OooO00o2 == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[(OooO00o2 + i + 1)];
        System.arraycopy(iArr, 0, iArr2, i, OooO00o2 + 1);
        return iArr2;
    }

    private int[] OooO0O0(int[] iArr, int[] iArr2) {
        if (OooO00o(iArr) == -1) {
            return iArr2;
        }
        while (OooO00o(iArr2) != -1) {
            int[] OooO0OO = OooO0OO(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = OooO0OO.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(OooO0OO, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return OooO00o(iArr, this.f16189OooO00o.OooO00o(OooO0O0(iArr)));
    }

    private int[] OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        return OooO0OO(OooO0Oo(iArr, iArr2), iArr3);
    }

    private int[] OooO0OO(int[] iArr, int[] iArr2) {
        int OooO00o2 = OooO00o(iArr2);
        if (OooO00o2 != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int OooO00o3 = this.f16189OooO00o.OooO00o(OooO0O0(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (OooO00o2 <= OooO00o(iArr3)) {
                iArr3 = m15962OooO00o(OooO00o(OooO0O0(iArr2, OooO00o(iArr3) - OooO00o2), this.f16189OooO00o.OooO0OO(OooO0O0(iArr3), OooO00o3)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] OooO0Oo(int[] iArr, int[] iArr2) {
        if (OooO00o(iArr) < OooO00o(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] OooO00o2 = m15961OooO00o(iArr);
        int[] OooO00o3 = m15961OooO00o(iArr2);
        if (OooO00o3.length == 1) {
            return OooO00o(OooO00o2, OooO00o3[0]);
        }
        int length = OooO00o2.length;
        int length2 = OooO00o3.length;
        int[] iArr3 = new int[((length + length2) - 1)];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i = length - length2;
            int[] iArr5 = new int[i];
            System.arraycopy(OooO00o2, 0, iArr4, 0, length2);
            System.arraycopy(OooO00o2, length2, iArr5, 0, i);
            return m15962OooO00o(OooO0Oo(iArr4, OooO00o3), OooO0O0(OooO0Oo(iArr5, OooO00o3), length2));
        }
        int i2 = (length + 1) >>> 1;
        int i3 = length - i2;
        int[] iArr6 = new int[i2];
        int[] iArr7 = new int[i2];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        System.arraycopy(OooO00o2, 0, iArr6, 0, i2);
        System.arraycopy(OooO00o2, i2, iArr8, 0, i3);
        System.arraycopy(OooO00o3, 0, iArr7, 0, i2);
        System.arraycopy(OooO00o3, i2, iArr9, 0, i3);
        int[] OooO00o4 = m15962OooO00o(iArr6, iArr8);
        int[] OooO00o5 = m15962OooO00o(iArr7, iArr9);
        int[] OooO0Oo = OooO0Oo(iArr6, iArr7);
        int[] OooO0Oo2 = OooO0Oo(OooO00o4, OooO00o5);
        int[] OooO0Oo3 = OooO0Oo(iArr8, iArr9);
        return m15962OooO00o(OooO0O0(m15962OooO00o(m15962OooO00o(m15962OooO00o(OooO0Oo2, OooO0Oo), OooO0Oo3), OooO0O0(OooO0Oo3, i2)), i2), OooO0Oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15964OooO00o() {
        int[] iArr = this.f16190OooO00o;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public int OooO00o(int i) {
        int[] iArr = this.f16190OooO00o;
        int i2 = this.f16188OooO00o;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.f16189OooO00o.OooO0OO(i3, i) ^ this.f16190OooO00o[i4];
        }
        return i3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5585L1L m15965OooO00o(int i) {
        int[] iArr = new int[(i + 1)];
        iArr[i] = 1;
        return new C5585L1L(this.f16189OooO00o, m15962OooO00o(this.f16190OooO00o, iArr));
    }

    public C5585L1L OooO00o(C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, m15962OooO00o(this.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO00o(C5585L1L r2, C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, OooO00o(this.f16190OooO00o, r2.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO00o(C5585L1L[] r10) {
        int length = r10.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            int[] iArr3 = this.f16190OooO00o;
            if (i >= iArr3.length) {
                break;
            }
            iArr2[i] = this.f16189OooO00o.OooO0OO(iArr3[i], iArr3[i]);
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                if (i2 < r10[i3].f16190OooO00o.length) {
                    iArr[i2] = this.f16189OooO00o.OooO00o(iArr[i2], this.f16189OooO00o.OooO0OO(r10[i3].f16190OooO00o[i2], iArr2[i3]));
                }
            }
        }
        return new C5585L1L(this.f16189OooO00o, iArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15966OooO00o(int i) {
        if (this.f16189OooO00o.m16357OooO00o(i)) {
            this.f16190OooO00o = OooO00o(this.f16190OooO00o, i);
            OooO00o();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15967OooO00o(C5585L1L r2) {
        this.f16190OooO00o = m15962OooO00o(this.f16190OooO00o, r2.f16190OooO00o);
        OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15968OooO00o() {
        int i = 8;
        int i2 = 1;
        while (this.f16189OooO00o.OooO00o() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f16190OooO00o.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16190OooO00o.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f16190OooO00o[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5585L1L[] m15969OooO00o(C5585L1L r6) {
        int[][] OooO00o2 = m15963OooO00o(this.f16190OooO00o, r6.f16190OooO00o);
        return new C5585L1L[]{new C5585L1L(this.f16189OooO00o, OooO00o2[0]), new C5585L1L(this.f16189OooO00o, OooO00o2[1])};
    }

    public int OooO0O0() {
        int i = this.f16188OooO00o;
        if (i == -1) {
            return 0;
        }
        return this.f16190OooO00o[i];
    }

    public int OooO0O0(int i) {
        if (i < 0 || i > this.f16188OooO00o) {
            return 0;
        }
        return this.f16190OooO00o[i];
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5585L1L m15970OooO0O0(int i) {
        if (this.f16189OooO00o.m16357OooO00o(i)) {
            return new C5585L1L(this.f16189OooO00o, OooO00o(this.f16190OooO00o, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public C5585L1L OooO0O0(C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, OooO0O0(this.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO0O0(C5585L1L r2, C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, OooO0O0(this.f16190OooO00o, r2.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO0O0(C5585L1L[] r9) {
        int length = r9.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (i < r9[i2].f16190OooO00o.length) {
                    int[] iArr2 = this.f16190OooO00o;
                    if (i2 < iArr2.length) {
                        iArr[i] = this.f16189OooO00o.OooO00o(iArr[i], this.f16189OooO00o.OooO0OO(r9[i2].f16190OooO00o[i], iArr2[i2]));
                    }
                }
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f16189OooO00o.m16359OooO0O0(iArr[i3]);
        }
        return new C5585L1L(this.f16189OooO00o, iArr);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5585L1L[] m15971OooO0O0(C5585L1L r12) {
        int i = r12.f16188OooO00o >> 1;
        int[] OooO00o2 = m15961OooO00o(r12.f16190OooO00o);
        int[] iArr = OooO00o2;
        int[] OooO0OO = OooO0OO(this.f16190OooO00o, r12.f16190OooO00o);
        int[] iArr2 = {0};
        int[] iArr3 = {1};
        while (OooO00o(OooO0OO) > i) {
            int[][] OooO00o3 = m15963OooO00o(iArr, OooO0OO);
            int[] iArr4 = OooO00o3[1];
            int[] OooO00o4 = m15962OooO00o(iArr2, OooO0O0(OooO00o3[0], iArr3, r12.f16190OooO00o));
            iArr2 = iArr3;
            iArr3 = OooO00o4;
            iArr = OooO0OO;
            OooO0OO = iArr4;
        }
        return new C5585L1L[]{new C5585L1L(this.f16189OooO00o, OooO0OO), new C5585L1L(this.f16189OooO00o, iArr3)};
    }

    public C5585L1L OooO0OO(int i) {
        return new C5585L1L(this.f16189OooO00o, OooO0O0(this.f16190OooO00o, i));
    }

    public C5585L1L OooO0OO(C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, OooO0OO(this.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO0Oo(C5585L1L r4) {
        return new C5585L1L(this.f16189OooO00o, OooO00o(new int[]{1}, this.f16190OooO00o, r4.f16190OooO00o));
    }

    public C5585L1L OooO0o(C5585L1L r3) {
        return new C5585L1L(this.f16189OooO00o, OooO0Oo(this.f16190OooO00o, r3.f16190OooO00o));
    }

    public C5585L1L OooO0o0(C5585L1L r4) {
        int[] OooO00o2 = lllILI.m17914OooO00o(this.f16190OooO00o);
        int[] OooO0O0 = OooO0O0(OooO00o2, OooO00o2, r4.f16190OooO00o);
        while (!OooO00o(OooO0O0, this.f16190OooO00o)) {
            OooO00o2 = m15961OooO00o(OooO0O0);
            OooO0O0 = OooO0O0(OooO00o2, OooO00o2, r4.f16190OooO00o);
        }
        return new C5585L1L(this.f16189OooO00o, OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5585L1L)) {
            C5585L1L r4 = (C5585L1L) obj;
            return this.f16189OooO00o.equals(r4.f16189OooO00o) && this.f16188OooO00o == r4.f16188OooO00o && OooO00o(this.f16190OooO00o, r4.f16190OooO00o);
        }
    }

    public int hashCode() {
        int hashCode = this.f16189OooO00o.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.f16190OooO00o;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    public String toString() {
        String str = " Polynomial over " + this.f16189OooO00o.toString() + ": \n";
        for (int i = 0; i < this.f16190OooO00o.length; i++) {
            str = str + this.f16189OooO00o.m16356OooO00o(this.f16190OooO00o[i]) + "Y^" + i + "+";
        }
        return str + C7522o0Ooo0o.OooO0O0;
    }
}
