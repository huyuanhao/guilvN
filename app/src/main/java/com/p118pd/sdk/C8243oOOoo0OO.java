package com.p118pd.sdk;

import com.github.mikephil.charting.data.BarEntry;

/* renamed from: com.pd.sdk.oOOoo0OO  reason: case insensitive filesystem */
public class C8243oOOoo0OO extends C8244oOOoo0Oo<AbstractC8248oOOooO> {
    public C8243oOOoo0OO(AbstractC8248oOOooO oooooo) {
        super(oooooo);
    }

    @Override // com.p118pd.sdk.C8244oOOoo0Oo, com.p118pd.sdk.C8244oOOoo0Oo, com.p118pd.sdk.AbstractC8235oOOoo
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        C8246oOOoo0oO OooO00o = super.OooO00o(f, f2);
        if (OooO00o == null) {
            return null;
        }
        C8346oOoOOOoo OooO00o2 = m19931OooO00o(f, f2);
        AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) ((AbstractC8248oOOooO) ((C8244oOOoo0Oo) this).OooO00o).getBarData().OooO00o(OooO00o.m19936OooO0O0());
        if (oooooo00.m19941OooOOo()) {
            return OooO00o(OooO00o, oooooo00, (float) OooO00o2.f21451OooO00o, (float) OooO00o2.OooO0O0);
        }
        C8346oOoOOOoo.OooO00o(OooO00o2);
        return OooO00o;
    }

    public C8246oOOoo0oO OooO00o(C8246oOOoo0oO ooooo0oo, AbstractC8262oOOooo00 oooooo00, float f, float f2) {
        BarEntry barEntry = (BarEntry) oooooo00.OooO00o(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.m15084OooO00o() == null) {
            return ooooo0oo;
        }
        C8252oOOooO0o[] OooO00o = barEntry.m15085OooO00o();
        if (OooO00o.length <= 0) {
            return null;
        }
        int OooO00o2 = OooO00o(OooO00o, f2);
        C8346oOoOOOoo OooO00o3 = ((AbstractC8248oOOooO) ((C8244oOOoo0Oo) this).OooO00o).OooO00o(oooooo00.m19949OooO00o()).OooO00o(ooooo0oo.OooO0OO(), OooO00o[OooO00o2].OooO0O0);
        C8246oOOoo0oO ooooo0oo2 = new C8246oOOoo0oO(barEntry.OooO0O0(), barEntry.OooO00o(), (float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0, ooooo0oo.m19936OooO0O0(), OooO00o2, ooooo0oo.m19934OooO00o());
        C8346oOoOOOoo.OooO00o(OooO00o3);
        return ooooo0oo2;
    }

    public int OooO00o(C8252oOOooO0o[] oooooo0oArr, float f) {
        if (oooooo0oArr == null || oooooo0oArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (C8252oOOooO0o oooooo0o : oooooo0oArr) {
            if (oooooo0o.OooO00o(f)) {
                return i;
            }
            i++;
        }
        int max = Math.max(oooooo0oArr.length - 1, 0);
        if (f > oooooo0oArr[max].OooO0O0) {
            return max;
        }
        return 0;
    }

    @Override // com.p118pd.sdk.C8244oOOoo0Oo
    public float OooO00o(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    @Override // com.p118pd.sdk.C8244oOOoo0Oo
    public AbstractC8211oOOoO0oO OooO00o() {
        return ((AbstractC8248oOOooO) ((C8244oOOoo0Oo) this).OooO00o).getBarData();
    }
}
