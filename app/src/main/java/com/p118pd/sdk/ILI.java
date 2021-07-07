package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.StringTokenizer;

/* renamed from: com.pd.sdk.ILI */
public class ILI extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o000OOo = 8;
    public static final int o0O0O00 = 7;
    public static final int o0OO00O = 5;
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public static final int oo0o0Oo = 6;
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public ILI(int i, AbstractC6854lLi1LL r2) {
        this.OooO00o = r2;
        this.o00oO0O = i;
    }

    public ILI(int i, String str) {
        AbstractC6854lLi1LL r3;
        this.o00oO0O = i;
        if (i == 1 || i == 2 || i == 6) {
            r3 = new L1iI1(str);
        } else if (i == 8) {
            r3 = new LlLI1(str);
        } else if (i == 4) {
            r3 = new l1LILI1(str);
        } else if (i == 7) {
            byte[] OooO0O0 = OooO0O0(str);
            if (OooO0O0 != null) {
                this.OooO00o = new C6487lIIiIlL(OooO0O0);
                return;
            }
            throw new IllegalArgumentException("IP Address is invalid");
        } else {
            throw new IllegalArgumentException("can't process String for tag: " + i);
        }
        this.OooO00o = r3;
    }

    public ILI(l1LILI1 r1) {
        this.OooO00o = r1;
        this.o00oO0O = 4;
    }

    public ILI(C929811Li1 r1) {
        this.OooO00o = l1LILI1.OooO00o(r1);
        this.o00oO0O = 4;
    }

    public static ILI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(AbstractC5903LlLLL.OooO00o(r0, true));
    }

    public static ILI OooO00o(Object obj) {
        if (obj == null || (obj instanceof ILI)) {
            return (ILI) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) obj;
            int OooO00o2 = r0.OooO00o();
            switch (OooO00o2) {
                case 0:
                    return new ILI(OooO00o2, I11li1.OooO00o(r0, false));
                case 1:
                    return new ILI(OooO00o2, L1iI1.OooO00o(r0, false));
                case 2:
                    return new ILI(OooO00o2, L1iI1.OooO00o(r0, false));
                case 3:
                    throw new IllegalArgumentException("unknown tag: " + OooO00o2);
                case 4:
                    return new ILI(OooO00o2, l1LILI1.OooO00o(r0, true));
                case 5:
                    return new ILI(OooO00o2, I11li1.OooO00o(r0, false));
                case 6:
                    return new ILI(OooO00o2, L1iI1.OooO00o(r0, false));
                case 7:
                    return new ILI(OooO00o2, AbstractC6804llL1ii.OooO00o(r0, false));
                case 8:
                    return new ILI(OooO00o2, LlLI1.OooO00o(r0, false));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
    }

    private void OooO00o(String str, byte[] bArr, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2 + i] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i2++;
        }
    }

    private void OooO00o(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 != iArr.length; i2++) {
            int i3 = i2 * 2;
            bArr[i3 + i] = (byte) (iArr[i2] >> 8);
            bArr[i3 + 1 + i] = (byte) iArr[i2];
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    private int[] OooO00o(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.COLON_SEPARATOR, true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i = -1;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(Constants.COLON_SEPARATOR)) {
                iArr[i2] = 0;
                i2++;
                i = i2;
            } else if (nextToken.indexOf(46) < 0) {
                int i3 = i2 + 1;
                iArr[i2] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i2 = i3;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, C9058ooOoOoOO.OooOO0);
                int i4 = i2 + 1;
                iArr[i2] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i2 = i4 + 1;
                iArr[i4] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i2 != 8) {
            int i5 = i2 - i;
            int i6 = 8 - i5;
            System.arraycopy(iArr, i, iArr, i6, i5);
            while (i != i6) {
                iArr[i] = 0;
                i++;
            }
        }
        return iArr;
    }

    private void OooO0O0(String str, byte[] bArr, int i) {
        int parseInt = Integer.parseInt(str);
        for (int i2 = 0; i2 != parseInt; i2++) {
            int i3 = (i2 / 8) + i;
            bArr[i3] = (byte) (bArr[i3] | (1 << (7 - (i2 % 8))));
        }
    }

    private byte[] OooO0O0(String str) {
        if (C6415il.OooO0o0(str) || C6415il.OooO0Oo(str)) {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                byte[] bArr = new byte[16];
                OooO00o(OooO00o(str), bArr, 0);
                return bArr;
            }
            byte[] bArr2 = new byte[32];
            OooO00o(OooO00o(str.substring(0, indexOf)), bArr2, 0);
            String substring = str.substring(indexOf + 1);
            OooO00o(substring.indexOf(58) > 0 ? OooO00o(substring) : m15482OooO0O0(substring), bArr2, 16);
            return bArr2;
        } else if (!C6415il.OooO0OO(str) && !C6415il.OooO0O0(str)) {
            return null;
        } else {
            int indexOf2 = str.indexOf(47);
            if (indexOf2 < 0) {
                byte[] bArr3 = new byte[4];
                OooO00o(str, bArr3, 0);
                return bArr3;
            }
            byte[] bArr4 = new byte[8];
            OooO00o(str.substring(0, indexOf2), bArr4, 0);
            String substring2 = str.substring(indexOf2 + 1);
            if (substring2.indexOf(46) > 0) {
                OooO00o(substring2, bArr4, 4);
            } else {
                OooO0O0(substring2, bArr4, 4);
            }
            return bArr4;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private int[] m15482OooO0O0(String str) {
        int[] iArr = new int[8];
        int parseInt = Integer.parseInt(str);
        for (int i = 0; i != parseInt; i++) {
            int i2 = i / 16;
            iArr[i2] = iArr[i2] | (1 << (15 - (i % 16)));
        }
        return iArr;
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.o00oO0O == 4 ? new ILI1Ll(true, this.o00oO0O, this.OooO00o) : new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15483OooO0O0() {
        return this.OooO00o;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.o00oO0O);
        stringBuffer.append(": ");
        int i = this.o00oO0O;
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                str = l1LILI1.OooO00o(this.OooO00o).toString();
            } else if (i != 6) {
                str = this.OooO00o.toString();
            }
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        str = L1iI1.OooO00o(this.OooO00o).OooO00o();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
