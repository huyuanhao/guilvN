package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.Ll111 */
public class Ll111 {
    public int OooO00o = 0;
    public int OooO0O0;

    public Ll111(int i) {
        if (i >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        } else if (i >= 1) {
            this.OooO00o = i;
            this.OooO0O0 = C5496I1II.OooO0O0(i);
        } else {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
    }

    public Ll111(int i, int i2) {
        if (i != C5496I1II.OooO00o(i2)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        } else if (C5496I1II.m15733OooO00o(i2)) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        } else {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
    }

    public Ll111(Ll111 ll111) {
        this.OooO00o = ll111.OooO00o;
        this.OooO0O0 = ll111.OooO0O0;
    }

    public Ll111(byte[] bArr) {
        if (bArr.length == 4) {
            int OooO00o2 = IlIl11.OooO00o(bArr);
            this.OooO0O0 = OooO00o2;
            if (C5496I1II.m15733OooO00o(OooO00o2)) {
                this.OooO00o = C5496I1II.OooO00o(this.OooO0O0);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public static String OooO0O0(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    public int OooO00o(int i) {
        return OooO0O0(i, (1 << this.OooO00o) - 2);
    }

    public int OooO00o(int i, int i2) {
        return i ^ i2;
    }

    public int OooO00o(SecureRandom secureRandom) {
        return C5478Il1Li.OooO00o(secureRandom, 1 << this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16356OooO00o(int i) {
        String str;
        StringBuilder sb;
        String str2 = "";
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i >>>= 1;
        }
        return str2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16357OooO00o(int i) {
        int i2 = this.OooO00o;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16358OooO00o() {
        return IlIl11.OooO00o(this.OooO0O0);
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m16359OooO0O0(int i) {
        for (int i2 = 1; i2 < this.OooO00o; i2++) {
            i = OooO0OO(i, i);
        }
        return i;
    }

    public int OooO0O0(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = OooO00o(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = OooO0OO(i3, i);
            }
            i = OooO0OO(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public int OooO0O0(SecureRandom secureRandom) {
        int OooO00o2 = C5478Il1Li.OooO00o(secureRandom, 1 << this.OooO00o);
        int i = 0;
        while (OooO00o2 == 0 && i < 1048576) {
            OooO00o2 = C5478Il1Li.OooO00o(secureRandom, 1 << this.OooO00o);
            i++;
        }
        if (i == 1048576) {
            return 1;
        }
        return OooO00o2;
    }

    public int OooO0OO() {
        return OooO0O0(IIllii.OooO00o());
    }

    public int OooO0OO(int i, int i2) {
        return C5496I1II.OooO00o(i, i2, this.OooO0O0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Ll111)) {
            Ll111 ll111 = (Ll111) obj;
            return this.OooO00o == ll111.OooO00o && this.OooO0O0 == ll111.OooO0O0;
        }
    }

    public int hashCode() {
        return this.OooO0O0;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.OooO00o + ") = GF(2)[X]/<" + OooO0O0(this.OooO0O0) + "> ";
    }
}
