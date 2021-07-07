package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LlL  reason: case insensitive filesystem */
public final class C5786LlL {

    /* renamed from: com.pd.sdk.LlL$OooO00o */
    public static class OooO00o {
        public C6051i1lli OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public llILLI1 f16716OooO00o;
        public llILLI1 OooO0O0;

        public OooO00o(llILLI1 r1, llILLI1 r2, C6051i1lli i1lli) {
            this.f16716OooO00o = r1;
            this.OooO0O0 = r2;
            this.OooO00o = i1lli;
        }

        public C6051i1lli OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public llILLI1 m16381OooO00o() {
            return this.f16716OooO00o;
        }

        public llILLI1 OooO0O0() {
            return this.OooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.LlL$OooO0O0 */
    public static class OooO0O0 {
        public llILLI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f16717OooO00o;

        public OooO0O0(llILLI1 r1, int[] iArr) {
            this.OooO00o = r1;
            this.f16717OooO00o = iArr;
        }

        public llILLI1 OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int[] m16382OooO00o() {
            return this.f16717OooO00o;
        }
    }

    public static OooO00o OooO00o(llILLI1 r7, SecureRandom secureRandom) {
        C6051i1lli i1lli;
        llILLI1 r3;
        llILLI1 OooO0OO;
        boolean z;
        int OooO00o2 = r7.OooO00o();
        llILLI1 r1 = null;
        do {
            i1lli = new C6051i1lli(OooO00o2, secureRandom);
            r3 = (llILLI1) r7.OooO00o(i1lli);
            OooO0OO = r3.m17863OooO0OO();
            z = true;
            try {
                r1 = (llILLI1) OooO0OO.m17856OooO00o();
                continue;
            } catch (ArithmeticException unused) {
                z = false;
                continue;
            }
        } while (!z);
        return new OooO00o(OooO0OO, ((llILLI1) r1.OooO00o(r3)).OooO0Oo(), i1lli);
    }

    public static l11ILi OooO00o(l11ILi l11ili, Ll111 ll111, C5585L1L r6, C5585L1L[] r7) {
        int OooO00o2 = 1 << ll111.OooO00o();
        l11ILi l11ili2 = new l11ILi(OooO00o2);
        if (!l11ili.OooO00o()) {
            C5585L1L[] OooO0O02 = new C5585L1L(l11ili.OooO00o(ll111)).OooO0Oo(r6).m15965OooO00o(1).OooO0O0(r7).m15971OooO0O0(r6);
            C5585L1L OooO00o3 = OooO0O02[0].OooO0o(OooO0O02[0]).OooO00o(OooO0O02[1].OooO0o(OooO0O02[1]).OooO0OO(1));
            C5585L1L OooO0O03 = OooO00o3.m15970OooO0O0(ll111.OooO00o(OooO00o3.OooO0O0()));
            for (int i = 0; i < OooO00o2; i++) {
                if (OooO0O03.OooO00o(i) == 0) {
                    l11ili2.m17551OooO00o(i);
                }
            }
        }
        return l11ili2;
    }

    public static llILLI1 OooO00o(Ll111 ll111, C5585L1L r18) {
        int OooO00o2 = ll111.OooO00o();
        int i = 1 << OooO00o2;
        int OooO00o3 = r18.m15964OooO00o();
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = OooO00o3;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i;
        iArr3[0] = OooO00o3;
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, iArr3);
        for (int i2 = 0; i2 < i; i2++) {
            iArr4[0][i2] = ll111.OooO00o(r18.OooO00o(i2));
        }
        for (int i3 = 1; i3 < OooO00o3; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr4[i3][i4] = ll111.OooO0OO(iArr4[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < OooO00o3; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    iArr2[i5][i6] = ll111.OooO00o(iArr2[i5][i6], ll111.OooO0OO(iArr4[i7][i6], r18.OooO0O0((OooO00o3 + i7) - i5)));
                }
            }
        }
        int[] iArr5 = new int[2];
        iArr5[1] = (i + 31) >>> 5;
        iArr5[0] = OooO00o3 * OooO00o2;
        int[][] iArr6 = (int[][]) Array.newInstance(int.class, iArr5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < OooO00o3; i11++) {
                int i12 = iArr2[i11][i8];
                for (int i13 = 0; i13 < OooO00o2; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr7 = iArr6[(((i11 + 1) * OooO00o2) - i13) - 1];
                        iArr7[i9] = iArr7[i9] ^ i10;
                    }
                }
            }
        }
        return new llILLI1(i, iArr6);
    }
}
