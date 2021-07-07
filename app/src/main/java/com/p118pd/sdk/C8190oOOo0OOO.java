package com.p118pd.sdk;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;

/* renamed from: com.pd.sdk.oOOo0OOO  reason: case insensitive filesystem */
public class C8190oOOo0OOO extends AbstractC8191oOOo0OOo<C8208oOOoO0Oo> implements AbstractC8248oOOooO {
    public boolean OooOo = false;
    public boolean OooOo0O = false;
    public boolean OooOo0o = true;
    public boolean OooOoO0 = false;

    public C8190oOOo0OOO(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o() {
        if (this.OooOoO0) {
            ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o(((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0() - (((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0() / 2.0f), ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o() + (((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0() / 2.0f));
        } else {
            ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o(((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(), ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o());
        }
        ((AbstractC8191oOOo0OOo) this).f21247OooO00o.OooO00o(((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.LEFT), ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.LEFT));
        ((AbstractC8191oOOo0OOo) this).f21255OooO0O0.OooO00o(((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.RIGHT), ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.RIGHT));
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public boolean OooO0O0() {
        return this.OooOo0o;
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public boolean OooO0OO() {
        return this.OooOo0O;
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8306oOo0O00(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        setHighlighter(new C8243oOOoo0OO(this));
        getXAxis().OooOO0o(0.5f);
        getXAxis().OooOO0O(0.5f);
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO
    public C8208oOOoO0Oo getBarData() {
        return (C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
    }

    public void setDrawBarShadow(boolean z) {
        this.OooOo = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.OooOo0o = z;
    }

    public void setFitBars(boolean z) {
        this.OooOoO0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.OooOo0O = z;
    }

    public C8190oOOo0OOO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o == null) {
            return null;
        }
        C8246oOOoo0oO OooO00o = getHighlighter().OooO00o(f, f2);
        return (OooO00o == null || !OooO0OO()) ? OooO00o : new C8246oOOoo0oO(OooO00o.OooO0OO(), OooO00o.OooO0o0(), OooO00o.OooO0Oo(), OooO00o.OooO0o(), OooO00o.m19936OooO0O0(), -1, OooO00o.m19934OooO00o());
    }

    public C8190oOOo0OOO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RectF OooO00o(BarEntry barEntry) {
        RectF rectF = new RectF();
        OooO00o(barEntry, rectF);
        return rectF;
    }

    public void OooO00o(BarEntry barEntry, RectF rectF) {
        AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(barEntry);
        if (oooooo00 == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float OooO00o = barEntry.OooO00o();
        float OooO0O0 = barEntry.OooO0O0();
        float OooO0o0 = ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0() / 2.0f;
        float f = OooO0O0 - OooO0o0;
        float f2 = OooO0O0 + OooO0o0;
        float f3 = OooO00o >= 0.0f ? OooO00o : 0.0f;
        if (OooO00o > 0.0f) {
            OooO00o = 0.0f;
        }
        rectF.set(f, f3, f2, OooO00o);
        m19830OooO00o(oooooo00.m19949OooO00o()).OooO00o(rectF);
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19827OooO00o() {
        return this.OooOo;
    }

    public void OooO00o(float f, int i, int i2) {
        OooO00o(new C8246oOOoo0oO(f, i, i2), false);
    }

    public void OooO00o(float f, float f2, float f3) {
        if (getBarData() != null) {
            getBarData().OooO00o(f, f2, f3);
            OooO();
            return;
        }
        throw new RuntimeException("You need to set data for the chart before grouping bars.");
    }
}
