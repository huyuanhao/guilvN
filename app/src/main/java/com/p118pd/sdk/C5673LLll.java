package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLl丨l  reason: invalid class name and case insensitive filesystem */
public class C5673LLll {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16517OooO00o;
    public int[] OooO0O0;
    public int[] OooO0OO;

    public C5673LLll(int i) throws IllegalArgumentException {
        if (i <= 10) {
            OooO00o(1, new int[]{10}, new int[]{3}, new int[]{2});
        } else if (i <= 20) {
            OooO00o(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2});
        } else {
            OooO00o(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2});
        }
    }

    public C5673LLll(int i, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        OooO00o(i, iArr, iArr2, iArr3);
    }

    private void OooO00o(int i, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        boolean z;
        String str;
        this.OooO00o = i;
        if (i == iArr2.length && i == iArr.length && i == iArr3.length) {
            z = true;
            str = "";
        } else {
            str = "Unexpected parameterset format";
            z = false;
        }
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            if (iArr3[i2] < 2 || (iArr[i2] - iArr3[i2]) % 2 != 0) {
                str = "Wrong parameter K (K >= 2 and H-K even required)!";
                z = false;
            }
            if (iArr[i2] < 4 || iArr2[i2] < 2) {
                str = "Wrong parameter H or w (H > 3 and w > 1 required)!";
                z = false;
            }
        }
        if (z) {
            this.f16517OooO00o = C9586iIILl.m21635OooO00o(iArr);
            this.OooO0O0 = C9586iIILl.m21635OooO00o(iArr2);
            this.OooO0OO = C9586iIILl.m21635OooO00o(iArr3);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m16250OooO00o() {
        return C9586iIILl.m21635OooO00o(this.f16517OooO00o);
    }

    public int[] OooO0O0() {
        return C9586iIILl.m21635OooO00o(this.OooO0OO);
    }

    public int[] OooO0OO() {
        return C9586iIILl.m21635OooO00o(this.OooO0O0);
    }
}
