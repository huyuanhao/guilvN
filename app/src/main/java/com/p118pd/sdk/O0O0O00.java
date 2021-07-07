package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O0O00 */
public final class O0O0O00 extends O0OO0<double[]> {
    public final double[] OooO00o;

    public O0O0O00(int i) {
        super(i);
        this.OooO00o = new double[i];
    }

    public int OooO00o(@NotNull double[] dArr) {
        o0O0OO00.OooO0o(dArr, "receiver$0");
        return dArr.length;
    }

    public final void OooO00o(double d) {
        double[] dArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        dArr[OooO00o2] = d;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final double[] OooO00o() {
        return (double[]) OooO00o(this.OooO00o, new double[OooO0O0()]);
    }
}
