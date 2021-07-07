package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* renamed from: com.pd.sdk.oOOooO0O  reason: case insensitive filesystem */
public class C8251oOOooO0O extends AbstractC8249oOOooO0<C8196oOOo0o> {
    public C8251oOOooO0O(C8196oOOo0o oooo0o) {
        super(oooo0o);
    }

    @Override // com.p118pd.sdk.AbstractC8249oOOooO0
    public C8246oOOoo0oO OooO00o(int i, float f, float f2) {
        List<C8246oOOoo0oO> OooO00o = OooO00o(i);
        float OooO00o2 = ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).OooO00o(f, f2) / ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getFactor();
        C8246oOOoo0oO ooooo0oo = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < OooO00o.size(); i2++) {
            C8246oOOoo0oO ooooo0oo2 = OooO00o.get(i2);
            float abs = Math.abs(ooooo0oo2.OooO0o0() - OooO00o2);
            if (abs < f3) {
                ooooo0oo = ooooo0oo2;
                f3 = abs;
            }
        }
        return ooooo0oo;
    }

    public List<C8246oOOoo0oO> OooO00o(int i) {
        int i2 = i;
        ((AbstractC8249oOOooO0) this).f21360OooO00o.clear();
        float OooO00o = ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getAnimator().OooO00o();
        float OooO0O0 = ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getAnimator().OooO0O0();
        float sliceAngle = ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getSliceAngle();
        float factor = ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getFactor();
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < ((C8226oOOoOo0O) ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getData()).m19903OooO00o()) {
            AbstractC8265oOOoooO0 OooO00o3 = ((C8226oOOoOo0O) ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getData()).OooO00o(i3);
            Entry OooO00o4 = OooO00o3.m19951OooO00o(i2);
            float f = (float) i2;
            AbstractC8352oOoOOoO0.OooO00o(((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getCenterOffsets(), (OooO00o4.OooO00o() - ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getYChartMin()) * factor * OooO0O0, (sliceAngle * f * OooO00o) + ((C8196oOOo0o) ((AbstractC8249oOOooO0) this).OooO00o).getRotationAngle(), OooO00o2);
            ((AbstractC8249oOOooO0) this).f21360OooO00o.add(new C8246oOOoo0oO(f, OooO00o4.OooO00o(), OooO00o2.f21456OooO00o, OooO00o2.OooO0O0, i3, OooO00o3.m19949OooO00o()));
            i3++;
            i2 = i;
        }
        return ((AbstractC8249oOOooO0) this).f21360OooO00o;
    }
}
