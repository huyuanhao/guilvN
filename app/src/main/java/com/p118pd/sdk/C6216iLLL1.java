package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨丨LL1  reason: invalid class name and case insensitive filesystem */
public class C6216iLLL1 implements AbstractC6370iIIIl {
    public final int[] OooO00o;
    public int[] OooO0O0;

    public C6216iLLL1() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.OooO00o = iArr;
        this.OooO0O0 = iArr;
    }

    public C6216iLLL1(int[] iArr) {
        this.OooO00o = new int[]{6, 12, 17, 22, 33};
        this.OooO0O0 = iArr;
        OooO00o();
    }

    private void OooO00o() {
        int[] iArr;
        int i;
        int[] iArr2 = this.OooO0O0;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        } else if (iArr2.length > 1) {
            int i2 = 0;
            do {
                iArr = this.OooO0O0;
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
    public int m17199OooO00o() {
        int[] iArr = this.OooO0O0;
        return iArr[iArr.length - 1] - iArr[0];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17200OooO00o() {
        return this.OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO0O0.length - 1;
    }
}
