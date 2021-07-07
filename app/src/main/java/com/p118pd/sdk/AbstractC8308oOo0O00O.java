package com.p118pd.sdk;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* renamed from: com.pd.sdk.oOo0O00O  reason: case insensitive filesystem */
public abstract class AbstractC8308oOo0O00O extends AbstractC8321oOoO0ooO {
    public OooO00o OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.oOo0O00O$OooO00o */
    public class OooO00o {
        public int OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public OooO00o() {
        }

        public void OooO00o(AbstractC8253oOOooOO ooooooo, AbstractC8261oOOooo0 oooooo0) {
            int i;
            float max = Math.max(0.0f, Math.min(1.0f, ((AbstractC8321oOoO0ooO) AbstractC8308oOo0O00O.this).f21418OooO00o.OooO00o()));
            float lowestVisibleX = ooooooo.getLowestVisibleX();
            float highestVisibleX = ooooooo.getHighestVisibleX();
            Entry OooO00o2 = oooooo0.m19950OooO00o(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
            Entry OooO00o3 = oooooo0.m19950OooO00o(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
            int i2 = 0;
            if (OooO00o2 == null) {
                i = 0;
            } else {
                i = oooooo0.OooO00o(OooO00o2);
            }
            this.OooO00o = i;
            if (OooO00o3 != null) {
                i2 = oooooo0.OooO00o(OooO00o3);
            }
            this.OooO0O0 = i2;
            this.OooO0OO = (int) (((float) (i2 - this.OooO00o)) * max);
        }
    }

    public AbstractC8308oOo0O00O(C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public boolean OooO00o(AbstractC8265oOOoooO0 ooooooo0) {
        return ooooooo0.isVisible() && (ooooooo0.OooO0OO() || ooooooo0.OooOo00());
    }

    public boolean OooO00o(Entry entry, AbstractC8261oOOooo0 oooooo0) {
        if (entry == null) {
            return false;
        }
        float OooO00o2 = (float) oooooo0.OooO00o(entry);
        if (entry == null || OooO00o2 >= ((float) oooooo0.OooO0Oo()) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) {
            return false;
        }
        return true;
    }
}
