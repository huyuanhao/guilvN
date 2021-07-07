package com.p118pd.sdk;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;

/* renamed from: com.pd.sdk.oOOo0Ooo  reason: case insensitive filesystem */
public class C8195oOOo0Ooo extends C8190oOOo0OOO {
    public RectF OooO0O0;
    public float[] OooO0OO;

    public C8195oOOo0Ooo(Context context) {
        super(context);
        this.OooO0O0 = new RectF();
        this.OooO0OO = new float[2];
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public float[] OooO00o(C8246oOOoo0oO ooooo0oo) {
        return new float[]{ooooo0oo.OooO0O0(), ooooo0oo.OooO00o()};
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.C8190oOOo0OOO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0O0() {
        OooO00o(this.OooO0O0);
        RectF rectF = this.OooO0O0;
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f3 = rectF.right + 0.0f;
        float f4 = rectF.bottom + 0.0f;
        if (((AbstractC8191oOOo0OOo) this).f21247OooO00o.OooOOo0()) {
            f2 += ((AbstractC8191oOOo0OOo) this).f21247OooO00o.OooO00o(((AbstractC8191oOOo0OOo) this).f21250OooO00o.OooO00o());
        }
        if (((AbstractC8191oOOo0OOo) this).f21255OooO0O0.OooOOo0()) {
            f4 += ((AbstractC8191oOOo0OOo) this).f21255OooO0O0.OooO00o(((AbstractC8191oOOo0OOo) this).f21256OooO0O0.OooO00o());
        }
        XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
        float f5 = (float) xAxis.OooO;
        if (xAxis.m19855OooO00o()) {
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else {
                if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() != XAxis.XAxisPosition.TOP) {
                    if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float OooO00o = AbstractC8352oOoOOoO0.OooO00o(((AbstractC8191oOOo0OOo) this).OooOO0);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20030OooO00o(Math.max(OooO00o, extraLeftOffset), Math.max(OooO00o, extraTopOffset), Math.max(OooO00o, extraRightOffset), Math.max(OooO00o, extraBottomOffset));
        if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
            Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb = new StringBuilder();
            sb.append("Content: ");
            sb.append(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o().toString());
            Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, sb.toString());
        }
        OooOO0o();
        OooOOO0();
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void OooO0OO(float f, float f2) {
        float f3 = ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O;
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20038OooO0OO(f3 / f, f3 / f2);
    }

    @Override // com.p118pd.sdk.C8190oOOo0OOO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o = new C8457oOooOooO();
        super.OooO0oo();
        ((AbstractC8191oOOo0OOo) this).f21252OooO00o = new C8347oOoOOo(((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        ((AbstractC8191oOOo0OOo) this).f21258OooO0O0 = new C8347oOoOOo(((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8322oOoO0ooo(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        setHighlighter(new C8247oOOoo0oo(this));
        ((AbstractC8191oOOo0OOo) this).f21250OooO00o = new C8333oOoOO0oO(((AbstractC8194oOOo0OoO) this).f21275OooO00o, ((AbstractC8191oOOo0OOo) this).f21247OooO00o, ((AbstractC8191oOOo0OOo) this).f21252OooO00o);
        ((AbstractC8191oOOo0OOo) this).f21256OooO0O0 = new C8333oOoOO0oO(((AbstractC8194oOOo0OoO) this).f21275OooO00o, ((AbstractC8191oOOo0OOo) this).f21255OooO0O0, ((AbstractC8191oOOo0OOo) this).f21258OooO0O0);
        ((AbstractC8191oOOo0OOo) this).f21249OooO00o = new C8330oOoOO0Oo(((AbstractC8194oOOo0OoO) this).f21275OooO00o, ((AbstractC8194oOOo0OoO) this).f21263OooO00o, ((AbstractC8191oOOo0OOo) this).f21252OooO00o, this);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void OooOOO0() {
        C8351oOoOOo0o oooooo0o = ((AbstractC8191oOOo0OOo) this).f21258OooO0O0;
        YAxis yAxis = ((AbstractC8191oOOo0OOo) this).f21255OooO0O0;
        float f = ((AbstractC8201oOOo0oO0) yAxis).OooOO0;
        float f2 = ((AbstractC8201oOOo0oO0) yAxis).OooOO0O;
        XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
        oooooo0o.OooO00o(f, f2, ((AbstractC8201oOOo0oO0) xAxis).OooOO0O, ((AbstractC8201oOOo0oO0) xAxis).OooOO0);
        C8351oOoOOo0o oooooo0o2 = ((AbstractC8191oOOo0OOo) this).f21252OooO00o;
        YAxis yAxis2 = ((AbstractC8191oOOo0OOo) this).f21247OooO00o;
        float f3 = ((AbstractC8201oOOo0oO0) yAxis2).OooOO0;
        float f4 = ((AbstractC8201oOOo0oO0) yAxis2).OooOO0O;
        XAxis xAxis2 = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
        oooooo0o2.OooO00o(f3, f4, ((AbstractC8201oOOo0oO0) xAxis2).OooOO0O, ((AbstractC8201oOOo0oO0) xAxis2).OooOO0);
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8191oOOo0OOo
    public float getHighestVisibleX() {
        m19830OooO00o(YAxis.AxisDependency.LEFT).OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(), ((AbstractC8191oOOo0OOo) this).f21257OooO0O0);
        return (float) Math.min((double) ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooO, ((AbstractC8191oOOo0OOo) this).f21257OooO0O0.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8191oOOo0OOo
    public float getLowestVisibleX() {
        m19830OooO00o(YAxis.AxisDependency.LEFT).OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(), ((AbstractC8191oOOo0OOo) this).f21251OooO00o);
        return (float) Math.max((double) ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0, ((AbstractC8191oOOo0OOo) this).f21251OooO00o.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void setVisibleXRangeMaximum(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o(((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O / f);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void setVisibleXRangeMinimum(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0Oo(((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O / f);
    }

    @Override // com.p118pd.sdk.C8190oOOo0OOO
    public void OooO00o(BarEntry barEntry, RectF rectF) {
        AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(barEntry);
        if (oooooo00 == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float OooO00o = barEntry.OooO00o();
        float OooO0O02 = barEntry.OooO0O0();
        float OooO0o0 = ((C8208oOOoO0Oo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0() / 2.0f;
        float f = OooO0O02 - OooO0o0;
        float f2 = OooO0O02 + OooO0o0;
        float f3 = OooO00o >= 0.0f ? OooO00o : 0.0f;
        if (OooO00o > 0.0f) {
            OooO00o = 0.0f;
        }
        rectF.set(f3, f, OooO00o, f2);
        m19830OooO00o(oooooo00.m19949OooO00o()).OooO00o(rectF);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void OooO0OO(float f, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(OooO00o(axisDependency) / f);
    }

    public C8195oOOo0Ooo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0O0 = new RectF();
        this.OooO0OO = new float[2];
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void OooO0OO(float f, float f2, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20035OooO0O0(OooO00o(axisDependency) / f, OooO00o(axisDependency) / f2);
    }

    public C8195oOOo0Ooo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0O0 = new RectF();
        this.OooO0OO = new float[2];
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public C8349oOoOOo00 OooO00o(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.OooO0OO;
        fArr[0] = entry.OooO00o();
        fArr[1] = entry.OooO0O0();
        m19830OooO00o(axisDependency).OooO0O0(fArr);
        return C8349oOoOOo00.OooO00o(fArr[0], fArr[1]);
    }

    @Override // com.p118pd.sdk.C8190oOOo0OOO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            return getHighlighter().OooO00o(f2, f);
        }
        boolean z = ((AbstractC8194oOOo0OoO) this).f21278OooO0O0;
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo
    public void OooO0O0(float f, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(OooO00o(axisDependency) / f);
    }
}
