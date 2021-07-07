package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LL1I1 */
public class LL1I1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9738llL1L f16395OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC9738llL1L f16396OooO0O0;

    public LL1I1(int i, AbstractC9738llL1L r4, AbstractC9738llL1L r5, int i2) {
        if (r4.m21800OooO00o().OooO00o(r5.m21800OooO00o())) {
            this.OooO00o = i;
            this.f16395OooO00o = r4;
            this.f16396OooO0O0 = r5;
            this.OooO0O0 = i2;
            return;
        }
        throw new IllegalArgumentException("points need to be on the same curve");
    }

    public static int OooO00o(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m16166OooO00o() {
        return this.f16395OooO00o;
    }

    public int OooO0O0() {
        return ((this.f16395OooO00o.m21800OooO00o().OooO0O0() - (OooO00o(this.OooO0O0) + 13)) / 8) * 8;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9738llL1L m16167OooO0O0() {
        return this.f16396OooO0O0;
    }

    public int OooO0OO() {
        return this.OooO00o;
    }

    public int OooO0Oo() {
        return this.f16395OooO00o.m21800OooO00o().OooO0O0();
    }
}
