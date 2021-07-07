package com.p118pd.sdk;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoo0oo  reason: case insensitive filesystem */
public class C8247oOOoo0oo extends C8243oOOoo0OO {
    public C8247oOOoo0oo(AbstractC8248oOOooO oooooo) {
        super(oooooo);
    }

    @Override // com.p118pd.sdk.C8243oOOoo0OO, com.p118pd.sdk.C8244oOOoo0Oo, com.p118pd.sdk.C8244oOOoo0Oo, com.p118pd.sdk.AbstractC8235oOOoo
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        C8208oOOoO0Oo barData = ((AbstractC8248oOOooO) ((C8244oOOoo0Oo) this).OooO00o).getBarData();
        C8346oOoOOOoo OooO00o = m19931OooO00o(f2, f);
        C8246oOOoo0oO OooO00o2 = OooO00o((float) OooO00o.OooO0O0, f2, f);
        if (OooO00o2 == null) {
            return null;
        }
        AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) barData.OooO00o(OooO00o2.m19936OooO0O0());
        if (oooooo00.m19941OooOOo()) {
            return OooO00o(OooO00o2, oooooo00, (float) OooO00o.OooO0O0, (float) OooO00o.f21451OooO00o);
        }
        C8346oOoOOOoo.OooO00o(OooO00o);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.C8244oOOoo0Oo
    public List<C8246oOOoo0oO> OooO00o(AbstractC8265oOOoooO0 ooooooo0, int i, float f, DataSet.Rounding rounding) {
        Entry OooO00o;
        ArrayList arrayList = new ArrayList();
        List<Entry> OooO00o2 = ooooooo0.OooO00o(f);
        if (OooO00o2.size() == 0 && (OooO00o = ooooooo0.m19950OooO00o(f, Float.NaN, rounding)) != null) {
            OooO00o2 = ooooooo0.OooO00o(OooO00o.OooO0O0());
        }
        if (OooO00o2.size() == 0) {
            return arrayList;
        }
        for (Entry entry : OooO00o2) {
            C8346oOoOOOoo OooO00o3 = ((AbstractC8248oOOooO) ((C8244oOOoo0Oo) this).OooO00o).OooO00o(ooooooo0.m19949OooO00o()).OooO00o(entry.OooO00o(), entry.OooO0O0());
            arrayList.add(new C8246oOOoo0oO(entry.OooO0O0(), entry.OooO00o(), (float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0, i, ooooooo0.m19949OooO00o()));
        }
        return arrayList;
    }

    @Override // com.p118pd.sdk.C8243oOOoo0OO, com.p118pd.sdk.C8244oOOoo0Oo
    public float OooO00o(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
