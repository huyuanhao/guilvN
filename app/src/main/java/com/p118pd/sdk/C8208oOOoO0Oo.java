package com.p118pd.sdk;

import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoO0Oo  reason: case insensitive filesystem */
public class C8208oOOoO0Oo extends AbstractC8211oOOoO0oO<AbstractC8262oOOooo00> {
    public float OooO = 0.85f;

    public C8208oOOoO0Oo() {
    }

    public void OooO00o(float f, float f2, float f3) {
        BarEntry barEntry;
        if (((AbstractC8219oOOoOOOo) this).f21339OooO00o.size() > 1) {
            int OooO0Oo = ((AbstractC8262oOOooo00) m19904OooO00o()).OooO0Oo();
            float f4 = f2 / 2.0f;
            float f5 = f3 / 2.0f;
            float f6 = this.OooO / 2.0f;
            float OooO00o = OooO00o(f2, f3);
            for (int i = 0; i < OooO0Oo; i++) {
                float f7 = f + f4;
                for (T t : ((AbstractC8219oOOoOOOo) this).f21339OooO00o) {
                    float f8 = f7 + f5 + f6;
                    if (i < t.OooO0Oo() && (barEntry = (BarEntry) t.m19951OooO00o(i)) != null) {
                        barEntry.OooO0O0(f8);
                    }
                    f7 = f8 + f6 + f5;
                }
                float f9 = f7 + f4;
                float f10 = OooO00o - (f9 - f);
                if (f10 > 0.0f || f10 < 0.0f) {
                    f9 += f10;
                }
                f = f9;
            }
            m19919OooO0OO();
            return;
        }
        throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
    }

    public void OooO0O0(float f) {
        this.OooO = f;
    }

    public float OooO0o0() {
        return this.OooO;
    }

    public C8208oOOoO0Oo(AbstractC8262oOOooo00... oooooo00Arr) {
        super(oooooo00Arr);
    }

    public C8208oOOoO0Oo(List<AbstractC8262oOOooo00> list) {
        super(list);
    }

    @Override // com.p118pd.sdk.AbstractC8219oOOoOOOo
    public float OooO00o(float f, float f2) {
        return (((float) ((AbstractC8219oOOoOOOo) this).f21339OooO00o.size()) * (this.OooO + f2)) + f;
    }
}
