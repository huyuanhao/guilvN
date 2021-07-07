package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOOoOoo  reason: case insensitive filesystem */
public class C8232oOOoOoo implements AbstractC8237oOOoo00 {
    @Override // com.p118pd.sdk.AbstractC8237oOOoo00
    public float OooO00o(AbstractC8264oOOoooO ooooooo, AbstractC8258oOOooOoO oooooooo) {
        float yChartMax = oooooooo.getYChartMax();
        float yChartMin = oooooooo.getYChartMin();
        C8220oOOoOOo lineData = oooooooo.getLineData();
        if (ooooooo.OooO() > 0.0f && ooooooo.OooO0o0() < 0.0f) {
            return 0.0f;
        }
        if (lineData.OooO0OO() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.OooO0Oo() < 0.0f) {
            yChartMin = 0.0f;
        }
        return ooooooo.OooO0o0() >= 0.0f ? yChartMin : yChartMax;
    }
}
