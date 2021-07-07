package com.p118pd.sdk;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8253oOOooOO;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoo0Oo  reason: case insensitive filesystem */
public class C8244oOOoo0Oo<T extends AbstractC8253oOOooOO> implements AbstractC8235oOOoo {
    public T OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8246oOOoo0oO> f21355OooO00o = new ArrayList();

    public C8244oOOoo0Oo(T t) {
        this.OooO00o = t;
    }

    @Override // com.p118pd.sdk.AbstractC8235oOOoo
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        C8346oOoOOOoo OooO00o2 = m19931OooO00o(f, f2);
        C8346oOoOOOoo.OooO00o(OooO00o2);
        return OooO00o((float) OooO00o2.f21451OooO00o, f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC8235oOOoo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8346oOoOOOoo m19931OooO00o(float f, float f2) {
        return this.OooO00o.OooO00o(YAxis.AxisDependency.LEFT).OooO0O0(f, f2);
    }

    public C8246oOOoo0oO OooO00o(float f, float f2, float f3) {
        List<C8246oOOoo0oO> OooO00o2 = m19932OooO00o(f, f2, f3);
        if (OooO00o2.isEmpty()) {
            return null;
        }
        return OooO00o(OooO00o2, f2, f3, OooO00o(OooO00o2, f3, YAxis.AxisDependency.LEFT) < OooO00o(OooO00o2, f3, YAxis.AxisDependency.RIGHT) ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.RIGHT, this.OooO00o.getMaxHighlightDistance());
    }

    public float OooO00o(List<C8246oOOoo0oO> list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            C8246oOOoo0oO ooooo0oo = list.get(i);
            if (ooooo0oo.m19934OooO00o() == axisDependency) {
                float abs = Math.abs(OooO00o(ooooo0oo) - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    public float OooO00o(C8246oOOoo0oO ooooo0oo) {
        return ooooo0oo.OooO0o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<C8246oOOoo0oO> m19932OooO00o(float f, float f2, float f3) {
        this.f21355OooO00o.clear();
        AbstractC8211oOOoO0oO OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return this.f21355OooO00o;
        }
        int OooO00o3 = OooO00o2.m19903OooO00o();
        for (int i = 0; i < OooO00o3; i++) {
            AbstractC8265oOOoooO0 OooO00o4 = OooO00o2.OooO00o(i);
            if (OooO00o4.OooO0O0()) {
                this.f21355OooO00o.addAll(OooO00o(OooO00o4, i, f, DataSet.Rounding.CLOSEST));
            }
        }
        return this.f21355OooO00o;
    }

    public List<C8246oOOoo0oO> OooO00o(AbstractC8265oOOoooO0 ooooooo0, int i, float f, DataSet.Rounding rounding) {
        Entry OooO00o2;
        ArrayList arrayList = new ArrayList();
        List<Entry> OooO00o3 = ooooooo0.OooO00o(f);
        if (OooO00o3.size() == 0 && (OooO00o2 = ooooooo0.m19950OooO00o(f, Float.NaN, rounding)) != null) {
            OooO00o3 = ooooooo0.OooO00o(OooO00o2.OooO0O0());
        }
        if (OooO00o3.size() == 0) {
            return arrayList;
        }
        for (Entry entry : OooO00o3) {
            C8346oOoOOOoo OooO00o4 = this.OooO00o.OooO00o(ooooooo0.m19949OooO00o()).OooO00o(entry.OooO0O0(), entry.OooO00o());
            arrayList.add(new C8246oOOoo0oO(entry.OooO0O0(), entry.OooO00o(), (float) OooO00o4.f21451OooO00o, (float) OooO00o4.OooO0O0, i, ooooooo0.m19949OooO00o()));
        }
        return arrayList;
    }

    public C8246oOOoo0oO OooO00o(List<C8246oOOoo0oO> list, float f, float f2, YAxis.AxisDependency axisDependency, float f3) {
        C8246oOOoo0oO ooooo0oo = null;
        for (int i = 0; i < list.size(); i++) {
            C8246oOOoo0oO ooooo0oo2 = list.get(i);
            if (axisDependency == null || ooooo0oo2.m19934OooO00o() == axisDependency) {
                float OooO00o2 = OooO00o(f, f2, ooooo0oo2.OooO0Oo(), ooooo0oo2.OooO0o());
                if (OooO00o2 < f3) {
                    ooooo0oo = ooooo0oo2;
                    f3 = OooO00o2;
                }
            }
        }
        return ooooo0oo;
    }

    public float OooO00o(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    public AbstractC8211oOOoO0oO OooO00o() {
        return this.OooO00o.getData();
    }
}
