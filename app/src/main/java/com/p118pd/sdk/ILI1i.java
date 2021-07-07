package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ILI1i丨  reason: invalid class name */
public class ILI1i {
    public C5585L1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ll111 f15562OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5585L1L[] f15563OooO00o;
    public C5585L1L[] OooO0O0;

    public ILI1i(Ll111 ll111, C5585L1L r2) {
        this.f15562OooO00o = ll111;
        this.OooO00o = r2;
        OooO0O0();
        OooO00o();
    }

    private void OooO00o() {
        int OooO0O02;
        int OooO00o2 = this.OooO00o.m15964OooO00o();
        C5585L1L[] r1 = new C5585L1L[OooO00o2];
        int i = OooO00o2 - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            r1[i2] = new C5585L1L(this.f15563OooO00o[i2]);
        }
        this.OooO0O0 = new C5585L1L[OooO00o2];
        while (i >= 0) {
            this.OooO0O0[i] = new C5585L1L(this.f15562OooO00o, i);
            i--;
        }
        for (int i3 = 0; i3 < OooO00o2; i3++) {
            if (r1[i3].OooO0O0(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < OooO00o2) {
                    if (r1[i4].OooO0O0(i3) != 0) {
                        OooO00o(r1, i3, i4);
                        OooO00o(this.OooO0O0, i3, i4);
                        i4 = OooO00o2;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int OooO00o3 = this.f15562OooO00o.OooO00o(r1[i3].OooO0O0(i3));
            r1[i3].m15966OooO00o(OooO00o3);
            this.OooO0O0[i3].m15966OooO00o(OooO00o3);
            for (int i5 = 0; i5 < OooO00o2; i5++) {
                if (!(i5 == i3 || (OooO0O02 = r1[i5].OooO0O0(i3)) == 0)) {
                    C5585L1L OooO0O03 = r1[i3].m15970OooO0O0(OooO0O02);
                    C5585L1L OooO0O04 = this.OooO0O0[i3].m15970OooO0O0(OooO0O02);
                    r1[i5].m15967OooO00o(OooO0O03);
                    this.OooO0O0[i5].m15967OooO00o(OooO0O04);
                }
            }
        }
    }

    public static void OooO00o(C5585L1L[] r2, int i, int i2) {
        C5585L1L r0 = r2[i];
        r2[i] = r2[i2];
        r2[i2] = r0;
    }

    private void OooO0O0() {
        int i;
        int OooO00o2 = this.OooO00o.m15964OooO00o();
        this.f15563OooO00o = new C5585L1L[OooO00o2];
        int i2 = 0;
        while (true) {
            i = OooO00o2 >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[(i3 + 1)];
            iArr[i3] = 1;
            this.f15563OooO00o[i2] = new C5585L1L(this.f15562OooO00o, iArr);
            i2++;
        }
        while (i < OooO00o2) {
            int i4 = i << 1;
            int[] iArr2 = new int[(i4 + 1)];
            iArr2[i4] = 1;
            this.f15563OooO00o[i] = new C5585L1L(this.f15562OooO00o, iArr2).OooO0OO(this.OooO00o);
            i++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5585L1L[] m15484OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5585L1L[] m15485OooO0O0() {
        return this.f15563OooO00o;
    }
}
