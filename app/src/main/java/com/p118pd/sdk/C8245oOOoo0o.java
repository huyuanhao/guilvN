package com.p118pd.sdk;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoo0o  reason: case insensitive filesystem */
public class C8245oOOoo0o extends C8244oOOoo0Oo<AbstractC8256oOOooOo> implements AbstractC8235oOOoo {
    public C8243oOOoo0OO OooO00o;

    public C8245oOOoo0o(AbstractC8256oOOooOo ooooooo, AbstractC8248oOOooO oooooo) {
        super(ooooooo);
        this.OooO00o = oooooo.getBarData() == null ? null : new C8243oOOoo0OO(oooooo);
    }

    @Override // com.p118pd.sdk.C8244oOOoo0Oo, com.p118pd.sdk.C8244oOOoo0Oo
    public List<C8246oOOoo0oO> OooO00o(float f, float f2, float f3) {
        ((C8244oOOoo0Oo) this).f21355OooO00o.clear();
        List<AbstractC8211oOOoO0oO> OooO0O0 = ((AbstractC8256oOOooOo) ((C8244oOOoo0Oo) this).OooO00o).getCombinedData().OooO0O0();
        for (int i = 0; i < OooO0O0.size(); i++) {
            AbstractC8211oOOoO0oO ooooo0oo = OooO0O0.get(i);
            C8243oOOoo0OO ooooo0oo2 = this.OooO00o;
            if (ooooo0oo2 == null || !(ooooo0oo instanceof C8208oOOoO0Oo)) {
                int OooO00o2 = ooooo0oo.m19903OooO00o();
                for (int i2 = 0; i2 < OooO00o2; i2++) {
                    AbstractC8265oOOoooO0 OooO00o3 = OooO0O0.get(i).OooO00o(i2);
                    if (OooO00o3.OooO0O0()) {
                        for (C8246oOOoo0oO ooooo0oo3 : OooO00o(OooO00o3, i2, f, DataSet.Rounding.CLOSEST)) {
                            ooooo0oo3.OooO00o(i);
                            ((C8244oOOoo0Oo) this).f21355OooO00o.add(ooooo0oo3);
                        }
                    }
                }
            } else {
                C8246oOOoo0oO OooO00o4 = ooooo0oo2.OooO00o(f2, f3);
                if (OooO00o4 != null) {
                    OooO00o4.OooO00o(i);
                    ((C8244oOOoo0Oo) this).f21355OooO00o.add(OooO00o4);
                }
            }
        }
        return ((C8244oOOoo0Oo) this).f21355OooO00o;
    }
}
