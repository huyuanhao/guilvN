package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Lii丨1I  reason: invalid class name */
public class Lii1I {
    public static AbstractC9738llL1L OooO00o(IIiLIli r1, AbstractC9738llL1L r2) {
        if (r1.OooO00o(r2.m21800OooO00o())) {
            return r1.OooO00o(r2.m21808OooO00o(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L r1) {
        if (r1.m21818OooO0o()) {
            return r1;
        }
        throw new IllegalStateException("Invalid result");
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L r5, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        AbstractC9738llL1L OooO00o = r5.m21800OooO00o().m15393OooO00o();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                OooO00o = r5;
            }
            for (int i = 1; i < bitLength; i++) {
                r5 = r5.OooO0o();
                if (abs.testBit(i)) {
                    OooO00o = OooO00o.OooO00o(r5);
                }
            }
        }
        return bigInteger.signum() < 0 ? OooO00o.OooO0OO() : OooO00o;
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L r10, BigInteger bigInteger, AbstractC6872ll1i r12, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, I1lL.OooO00o(Math.max(abs.bitLength(), abs2.bitLength()))));
        AbstractC9738llL1L OooO00o = I1lL.OooO00o(r10, max, true, r12);
        C6597lLil OooO00o2 = I1lL.OooO00o(r10);
        C6597lLil OooO00o3 = I1lL.OooO00o(OooO00o);
        return OooO00o(z2 ? OooO00o2.OooO0O0() : OooO00o2.m17698OooO00o(), z2 ? OooO00o2.m17698OooO00o() : OooO00o2.OooO0O0(), I1lL.OooO00o(max, abs), z ? OooO00o3.OooO0O0() : OooO00o3.m17698OooO00o(), z ? OooO00o3.m17698OooO00o() : OooO00o3.OooO0O0(), I1lL.OooO00o(max, abs2));
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L r7, BigInteger bigInteger, AbstractC9738llL1L r9, BigInteger bigInteger2) {
        IIiLIli OooO00o = r7.m21800OooO00o();
        AbstractC9738llL1L OooO00o2 = OooO00o.m15393OooO00o();
        AbstractC9738llL1L[] r5 = {r9, r7.OooO0O0(r9), r7, r7.OooO00o(r9)};
        OooO00o.OooO0O0(r5);
        AbstractC9738llL1L[] r0 = {r5[3].OooO0OO(), r5[2].OooO0OO(), r5[1].OooO0OO(), r5[0].OooO0OO(), OooO00o2, r5[0], r5[1], r5[2], r5[3]};
        byte[] OooO00o3 = I1lL.OooO00o(bigInteger, bigInteger2);
        int length = OooO00o3.length;
        while (true) {
            length--;
            if (length < 0) {
                return OooO00o2;
            }
            byte b = OooO00o3[length];
            OooO00o2 = OooO00o2.OooO0OO(r0[(((b << 24) >> 28) * 3) + 4 + ((b << C8026oOO00oOo.OooO00o) >> 28)]);
        }
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L[] r16, AbstractC6872ll1i r17, BigInteger[] bigIntegerArr) {
        int length = r16.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        C6597lLil[] llilArr = new C6597lLil[i];
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            zArr[i4] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int max = Math.max(2, Math.min(16, I1lL.OooO00o(Math.max(abs.bitLength(), abs2.bitLength()))));
            AbstractC9738llL1L r13 = r16[i2];
            AbstractC9738llL1L OooO00o = I1lL.OooO00o(r13, max, true, r17);
            llilArr[i3] = I1lL.OooO00o(r13);
            llilArr[i4] = I1lL.OooO00o(OooO00o);
            bArr[i3] = I1lL.OooO00o(max, abs);
            bArr[i4] = I1lL.OooO00o(max, abs2);
        }
        return OooO00o(zArr, llilArr, bArr);
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L[] r8, AbstractC9738llL1L[] r9, byte[] bArr, AbstractC9738llL1L[] r11, AbstractC9738llL1L[] r12, byte[] bArr2) {
        AbstractC9738llL1L r5;
        int max = Math.max(bArr.length, bArr2.length);
        AbstractC9738llL1L OooO00o = r8[0].m21800OooO00o().m15393OooO00o();
        int i = max - 1;
        AbstractC9738llL1L r4 = OooO00o;
        int i2 = 0;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    r5 = OooO00o.OooO00o((b < 0 ? r9 : r8)[Math.abs((int) b) >>> 1]);
                } else {
                    r5 = OooO00o;
                }
                if (b2 != 0) {
                    r5 = r5.OooO00o((b2 < 0 ? r12 : r11)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    r4 = r4.OooO00o(i2);
                    i2 = 0;
                }
                r4 = r4.OooO0OO(r5);
            }
            i--;
        }
        return i2 > 0 ? r4.OooO00o(i2) : r4;
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L[] r11, BigInteger[] bigIntegerArr) {
        int length = r11.length;
        boolean[] zArr = new boolean[length];
        C6597lLil[] llilArr = new C6597lLil[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            int max = Math.max(2, Math.min(16, I1lL.OooO00o(abs.bitLength())));
            llilArr[i] = I1lL.OooO00o(r11[i], max, true);
            bArr[i] = I1lL.OooO00o(max, abs);
        }
        return OooO00o(zArr, llilArr, bArr);
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L[] r10, BigInteger[] bigIntegerArr, AbstractC9584iI1I r12) {
        BigInteger OooO0O0 = r10[0].m21800OooO00o().m15401OooO0O0();
        int length = r10.length;
        int i = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            BigInteger[] OooO00o = r12.OooO00o(bigIntegerArr[i3].mod(OooO0O0));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = OooO00o[0];
            i2 = i4 + 1;
            bigIntegerArr2[i4] = OooO00o[1];
        }
        AbstractC6872ll1i OooO00o2 = r12.OooO00o();
        if (r12.m15380OooO00o()) {
            return OooO00o(r10, OooO00o2, bigIntegerArr2);
        }
        AbstractC9738llL1L[] r122 = new AbstractC9738llL1L[i];
        int i5 = 0;
        for (AbstractC9738llL1L r3 : r10) {
            AbstractC9738llL1L OooO00o3 = OooO00o2.OooO00o(r3);
            int i6 = i5 + 1;
            r122[i5] = r3;
            i5 = i6 + 1;
            r122[i6] = OooO00o3;
        }
        return OooO00o(r122, bigIntegerArr2);
    }

    public static AbstractC9738llL1L OooO00o(boolean[] zArr, C6597lLil[] llilArr, byte[][] bArr) {
        int length = bArr.length;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = Math.max(i, bArr2.length);
        }
        AbstractC9738llL1L OooO00o = llilArr[0].m17698OooO00o()[0].m21800OooO00o().m15393OooO00o();
        int i2 = i - 1;
        AbstractC9738llL1L r6 = OooO00o;
        int i3 = 0;
        while (i2 >= 0) {
            AbstractC9738llL1L r8 = OooO00o;
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr3 = bArr[i4];
                byte b = i2 < bArr3.length ? bArr3[i2] : 0;
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    C6597lLil llil = llilArr[i4];
                    r8 = r8.OooO00o(((b < 0) == zArr[i4] ? llil.m17698OooO00o() : llil.OooO0O0())[abs >>> 1]);
                }
            }
            if (r8 == OooO00o) {
                i3++;
            } else {
                if (i3 > 0) {
                    r6 = r6.OooO00o(i3);
                    i3 = 0;
                }
                r6 = r6.OooO0OO(r8);
            }
            i2--;
        }
        return i3 > 0 ? r6.OooO00o(i3) : r6;
    }

    public static void OooO00o(AbstractC97441iIIL[] r1, int i, int i2) {
        OooO00o(r1, i, i2, (AbstractC97441iIIL) null);
    }

    public static void OooO00o(AbstractC97441iIIL[] r4, int i, int i2, AbstractC97441iIIL r7) {
        AbstractC97441iIIL[] r0 = new AbstractC97441iIIL[i2];
        int i3 = 0;
        r0[0] = r4[i];
        while (true) {
            i3++;
            if (i3 >= i2) {
                break;
            }
            r0[i3] = r0[i3 - 1].OooO0OO(r4[i + i3]);
        }
        int i4 = i3 - 1;
        if (r7 != null) {
            r0[i4] = r0[i4].OooO0OO(r7);
        }
        AbstractC97441iIIL OooO0O0 = r0[i4].m21862OooO0O0();
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = i4 + i;
            AbstractC97441iIIL r1 = r4[i6];
            r4[i6] = r0[i5].OooO0OO(OooO0O0);
            OooO0O0 = OooO0O0.OooO0OO(r1);
            i4 = i5;
        }
        r4[i] = OooO0O0;
    }

    public static boolean OooO00o(IIiLIli r0) {
        return OooO00o(r0.m15391OooO00o());
    }

    public static boolean OooO00o(AbstractC6047i1lLI i1lli) {
        return i1lli.OooO0O0() > 1 && i1lli.OooO00o().equals(AbstractC5490IlLL.OooO0OO) && (i1lli instanceof LiliILiI);
    }

    public static AbstractC9738llL1L OooO0O0(IIiLIli r1, AbstractC9738llL1L r2) {
        if (r1.OooO00o(r2.m21800OooO00o())) {
            return r1.OooO00o(r2);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r1) {
        if (r1.m21820OooO0o0()) {
            return r1;
        }
        throw new IllegalStateException("Invalid point");
    }

    public static AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r11, BigInteger bigInteger, AbstractC9738llL1L r13, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, I1lL.OooO00o(abs.bitLength())));
        int max2 = Math.max(2, Math.min(16, I1lL.OooO00o(abs2.bitLength())));
        C6597lLil OooO00o = I1lL.OooO00o(r11, max, true);
        C6597lLil OooO00o2 = I1lL.OooO00o(r13, max2, true);
        return OooO00o(z2 ? OooO00o.OooO0O0() : OooO00o.m17698OooO00o(), z2 ? OooO00o.m17698OooO00o() : OooO00o.OooO0O0(), I1lL.OooO00o(max, abs), z ? OooO00o2.OooO0O0() : OooO00o2.m17698OooO00o(), z ? OooO00o2.m17698OooO00o() : OooO00o2.OooO0O0(), I1lL.OooO00o(max2, abs2));
    }

    public static AbstractC9738llL1L OooO0O0(AbstractC9738llL1L[] r6, BigInteger[] bigIntegerArr) {
        if (!(r6 == null || bigIntegerArr == null || r6.length != bigIntegerArr.length)) {
            if (r6.length >= 1) {
                int length = r6.length;
                if (length == 1) {
                    return r6[0].OooO00o(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return OooO0Oo(r6[0], bigIntegerArr[0], r6[1], bigIntegerArr[1]);
                }
                AbstractC9738llL1L r3 = r6[0];
                IIiLIli OooO00o = r3.m21800OooO00o();
                AbstractC9738llL1L[] r5 = new AbstractC9738llL1L[length];
                r5[0] = r3;
                for (int i = 1; i < length; i++) {
                    r5[i] = OooO0O0(OooO00o, r6[i]);
                }
                IILLii1l OooO00o2 = OooO00o.m15388OooO00o();
                return OooO00o2 instanceof AbstractC9584iI1I ? OooO00o(OooO00o(r5, bigIntegerArr, (AbstractC9584iI1I) OooO00o2)) : OooO00o(OooO00o(r5, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
    }

    public static boolean OooO0O0(IIiLIli r0) {
        return OooO0O0(r0.m15391OooO00o());
    }

    public static boolean OooO0O0(AbstractC6047i1lLI i1lli) {
        return i1lli.OooO0O0() == 1;
    }

    public static AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r1, BigInteger bigInteger, AbstractC9738llL1L r3, BigInteger bigInteger2) {
        return OooO00o(OooO00o(r1, bigInteger, OooO0O0(r1.m21800OooO00o(), r3), bigInteger2));
    }

    public static AbstractC9738llL1L OooO0Oo(AbstractC9738llL1L r4, BigInteger bigInteger, AbstractC9738llL1L r6, BigInteger bigInteger2) {
        AbstractC9738llL1L OooO0O0;
        IIiLIli OooO00o = r4.m21800OooO00o();
        AbstractC9738llL1L OooO0O02 = OooO0O0(OooO00o, r6);
        if (!(OooO00o instanceof IIiLIli.OooO0O0) || !((IIiLIli.OooO0O0) OooO00o).OooO00o()) {
            IILLii1l OooO00o2 = OooO00o.m15388OooO00o();
            if (OooO00o2 instanceof AbstractC9584iI1I) {
                OooO0O0 = OooO00o(new AbstractC9738llL1L[]{r4, OooO0O02}, new BigInteger[]{bigInteger, bigInteger2}, (AbstractC9584iI1I) OooO00o2);
            } else {
                OooO0O0 = OooO0O0(r4, bigInteger, OooO0O02, bigInteger2);
            }
        } else {
            OooO0O0 = r4.OooO00o(bigInteger).OooO00o(OooO0O02.OooO00o(bigInteger2));
        }
        return OooO00o(OooO0O0);
    }
}
