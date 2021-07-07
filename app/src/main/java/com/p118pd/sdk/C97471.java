package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.丨丨1丨  reason: invalid class name and case insensitive filesystem */
public class C97471 implements AlgorithmParameterSpec {
    public static final int[] OooO0O0 = {6, 12, 17, 22, 33};
    public int[] OooO00o;

    public C97471() {
        this.OooO00o = OooO0O0;
    }

    public C97471(int[] iArr) {
        this.OooO00o = iArr;
        OooO00o();
    }

    private void OooO00o() {
        int[] iArr;
        int i;
        int[] iArr2 = this.OooO00o;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        } else if (iArr2.length > 1) {
            int i2 = 0;
            do {
                iArr = this.OooO00o;
                if (i2 < iArr.length - 1) {
                    i = iArr[i2];
                    i2++;
                } else {
                    return;
                }
            } while (i < iArr[i2]);
            throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
        } else {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m21884OooO00o() {
        int[] iArr = this.OooO00o;
        return iArr[iArr.length - 1] - iArr[0];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m21885OooO00o() {
        return C9586iIILl.m21635OooO00o(this.OooO00o);
    }

    public int OooO0O0() {
        return this.OooO00o.length - 1;
    }
}
