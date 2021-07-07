package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.p118pd.sdk.AbstractC8200oOOo0oO;
import com.p118pd.sdk.AbstractC8201oOOo0oO0;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class YAxis extends AbstractC8201oOOo0oO0 {
    public AxisDependency OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxisLabelPosition f14946OooO00o;
    public int OooO0oO;
    public boolean OooOO0O;
    public float OooOO0o;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public boolean f14947OooOO0o;
    public float OooOOO;

    /* renamed from: OooOOO  reason: collision with other field name */
    public boolean f14948OooOOO;
    public float OooOOO0;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public boolean f14949OooOOO0;
    public float OooOOOO;
    public float OooOOOo;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.OooOO0O = true;
        this.f14947OooOO0o = true;
        this.f14949OooOOO0 = false;
        this.f14948OooOOO = false;
        this.OooO0oO = -7829368;
        this.OooOO0o = 1.0f;
        this.OooOOO0 = 10.0f;
        this.OooOOO = 10.0f;
        this.f14946OooO00o = YAxisLabelPosition.OUTSIDE_CHART;
        this.OooOOOO = 0.0f;
        this.OooOOOo = Float.POSITIVE_INFINITY;
        this.OooO00o = AxisDependency.LEFT;
        ((AbstractC8200oOOo0oO) this).OooO0O0 = 0.0f;
    }

    public void OooO(boolean z) {
        this.f14948OooOOO = z;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0
    public AxisDependency OooO00o() {
        return this.OooO00o;
    }

    public float OooO0O0(Paint paint) {
        paint.setTextSize(((AbstractC8200oOOo0oO) this).OooO0OO);
        float OooO0O0 = ((float) AbstractC8352oOoOOoO0.OooO0O0(paint, m19858OooO00o())) + (OooO0O0() * 2.0f);
        float OooOO0o2 = OooOO0o();
        float OooOO0O2 = OooOO0O();
        if (OooOO0o2 > 0.0f) {
            OooOO0o2 = AbstractC8352oOoOOoO0.OooO00o(OooOO0o2);
        }
        if (OooOO0O2 > 0.0f && OooOO0O2 != Float.POSITIVE_INFINITY) {
            OooOO0O2 = AbstractC8352oOoOOoO0.OooO00o(OooOO0O2);
        }
        if (((double) OooOO0O2) <= AbstractC8352oOoOOoO0.OooO0O0) {
            OooOO0O2 = OooO0O0;
        }
        return Math.max(OooOO0o2, Math.min(OooO0O0, OooOO0O2));
    }

    @Override // com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0
    public int OooO0o0() {
        return this.OooO0oO;
    }

    public void OooO0oo(boolean z) {
        this.f14947OooOO0o = z;
    }

    public void OooOO0(boolean z) {
        this.f14949OooOOO0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC8201oOOo0oO0
    public float OooOO0O() {
        return this.OooOOOo;
    }

    @Override // com.p118pd.sdk.AbstractC8201oOOo0oO0
    public float OooOO0o() {
        return this.OooOOOO;
    }

    public void OooOOO(float f) {
        this.OooOOOO = f;
    }

    public void OooOOO0(float f) {
        this.OooOOOo = f;
    }

    public void OooOOOO(float f) {
        this.OooOOO = f;
    }

    public boolean OooOOOo() {
        return this.f14949OooOOO0;
    }

    public void OooOOo0(float f) {
        this.OooOO0o = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public YAxisLabelPosition m15076OooO00o() {
        return this.f14946OooO00o;
    }

    public void OooO0o0(int i) {
        this.OooO0oO = i;
    }

    @Deprecated
    public void OooOO0O(boolean z) {
        if (z) {
            OooO0oo(0.0f);
        } else {
            m19870OooO0o0();
        }
    }

    /* renamed from: OooOOO  reason: collision with other method in class */
    public boolean m15077OooOOO() {
        return this.f14947OooOO0o;
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public boolean m15078OooOOO0() {
        return this.OooOO0O;
    }

    /* renamed from: OooOOOO  reason: collision with other method in class */
    public boolean m15079OooOOOO() {
        return this.f14948OooOOO;
    }

    public void OooOOOo(float f) {
        this.OooOOO0 = f;
    }

    public boolean OooOOo0() {
        return m19855OooO00o() && m19873OooO0oo() && m15076OooO00o() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public void OooO00o(YAxisLabelPosition yAxisLabelPosition) {
        this.f14946OooO00o = yAxisLabelPosition;
    }

    public float OooOOO() {
        return this.OooOOO0;
    }

    public float OooOOO0() {
        return this.OooOOO;
    }

    public float OooOOOO() {
        return this.OooOO0o;
    }

    public float OooO00o(Paint paint) {
        paint.setTextSize(((AbstractC8200oOOo0oO) this).OooO0OO);
        return ((float) AbstractC8352oOoOOoO0.OooO00o(paint, m19858OooO00o())) + (OooO0OO() * 2.0f);
    }

    @Override // com.p118pd.sdk.AbstractC8201oOOo0oO0
    public void OooO00o(float f, float f2) {
        if (((AbstractC8201oOOo0oO0) this).f21296OooO) {
            f = ((AbstractC8201oOOo0oO0) this).OooOO0;
        }
        if (((AbstractC8201oOOo0oO0) this).f21312OooOO0) {
            f2 = ((AbstractC8201oOOo0oO0) this).OooO;
        }
        float abs = Math.abs(f2 - f);
        if (abs == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        if (!((AbstractC8201oOOo0oO0) this).f21296OooO) {
            ((AbstractC8201oOOo0oO0) this).OooOO0 = f - ((abs / 100.0f) * OooOOO0());
        }
        if (!((AbstractC8201oOOo0oO0) this).f21312OooOO0) {
            ((AbstractC8201oOOo0oO0) this).OooO = f2 + ((abs / 100.0f) * OooOOO());
        }
        super.OooOO0O = Math.abs(((AbstractC8201oOOo0oO0) this).OooO - ((AbstractC8201oOOo0oO0) this).OooOO0);
    }

    public YAxis(AxisDependency axisDependency) {
        this.OooOO0O = true;
        this.f14947OooOO0o = true;
        this.f14949OooOOO0 = false;
        this.f14948OooOOO = false;
        this.OooO0oO = -7829368;
        this.OooOO0o = 1.0f;
        this.OooOOO0 = 10.0f;
        this.OooOOO = 10.0f;
        this.f14946OooO00o = YAxisLabelPosition.OUTSIDE_CHART;
        this.OooOOOO = 0.0f;
        this.OooOOOo = Float.POSITIVE_INFINITY;
        this.OooO00o = axisDependency;
        ((AbstractC8200oOOo0oO) this).OooO0O0 = 0.0f;
    }
}
