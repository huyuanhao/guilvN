package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.i1lli  reason: case insensitive filesystem */
public class C6051i1lli {
    public int[] OooO00o;

    public C6051i1lli(int i) {
        if (i > 0) {
            this.OooO00o = new int[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                this.OooO00o[i2] = i2;
            }
            return;
        }
        throw new IllegalArgumentException("invalid length");
    }

    public C6051i1lli(int i, SecureRandom secureRandom) {
        if (i > 0) {
            this.OooO00o = new int[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = i2;
            }
            int i3 = i;
            for (int i4 = 0; i4 < i; i4++) {
                int OooO00o2 = C5478Il1Li.OooO00o(secureRandom, i3);
                i3--;
                this.OooO00o[i4] = iArr[OooO00o2];
                iArr[OooO00o2] = iArr[i3];
            }
            return;
        }
        throw new IllegalArgumentException("invalid length");
    }

    public C6051i1lli(byte[] bArr) {
        if (bArr.length > 4) {
            int OooO00o2 = IlIl11.OooO00o(bArr, 0);
            int OooO0OO = C6356i1IiI1.OooO0OO(OooO00o2 - 1);
            if (bArr.length == (OooO00o2 * OooO0OO) + 4) {
                this.OooO00o = new int[OooO00o2];
                for (int i = 0; i < OooO00o2; i++) {
                    this.OooO00o[i] = IlIl11.OooO00o(bArr, (i * OooO0OO) + 4, OooO0OO);
                }
                if (!OooO00o(this.OooO00o)) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public C6051i1lli(int[] iArr) {
        if (OooO00o(iArr)) {
            this.OooO00o = lllILI.m17914OooO00o(iArr);
            return;
        }
        throw new IllegalArgumentException("array is not a permutation vector");
    }

    private boolean OooO00o(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] >= length || zArr[iArr[i]]) {
                return false;
            }
            zArr[iArr[i]] = true;
        }
        return true;
    }

    public C6051i1lli OooO00o() {
        C6051i1lli i1lli = new C6051i1lli(this.OooO00o.length);
        for (int length = this.OooO00o.length - 1; length >= 0; length--) {
            i1lli.OooO00o[this.OooO00o[length]] = length;
        }
        return i1lli;
    }

    public C6051i1lli OooO00o(C6051i1lli i1lli) {
        int length = i1lli.OooO00o.length;
        int[] iArr = this.OooO00o;
        if (length == iArr.length) {
            C6051i1lli i1lli2 = new C6051i1lli(iArr.length);
            for (int length2 = this.OooO00o.length - 1; length2 >= 0; length2--) {
                i1lli2.OooO00o[length2] = this.OooO00o[i1lli.OooO00o[length2]];
            }
            return i1lli2;
        }
        throw new IllegalArgumentException("length mismatch");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16914OooO00o() {
        int length = this.OooO00o.length;
        int OooO0OO = C6356i1IiI1.OooO0OO(length - 1);
        byte[] bArr = new byte[((length * OooO0OO) + 4)];
        IlIl11.OooO00o(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            IlIl11.OooO00o(this.OooO00o[i], bArr, (i * OooO0OO) + 4, OooO0OO);
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m16915OooO00o() {
        return lllILI.m17914OooO00o(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6051i1lli)) {
            return false;
        }
        return lllILI.OooO00o(this.OooO00o, ((C6051i1lli) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        String str = "[" + this.OooO00o[0];
        for (int i = 1; i < this.OooO00o.length; i++) {
            str = str + ", " + this.OooO00o[i];
        }
        return str + "]";
    }
}
