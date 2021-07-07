package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* renamed from: com.pd.sdk.oOOo0o  reason: case insensitive filesystem */
public class C8196oOOo0o extends AbstractC8199oOOo0o0o<C8226oOOoOo0O> {
    public YAxis OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8332oOoOO0o0 f21285OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8446oOooOOOO f21286OooO00o;
    public boolean OooOO0 = true;
    public float OooOOO = 1.5f;
    public float OooOOO0 = 2.5f;
    public int o000OOo = 0;
    public int o0O0O00 = 150;
    public int o0OO00O = Color.rgb((int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST, (int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST, (int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST);
    public int oo0o0Oo = Color.rgb((int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST, (int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST, (int) TinkerReport.KEY_APPLIED_DEXOPT_EXIST);

    public C8196oOOo0o(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO() {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            OooO00o();
            C8446oOooOOOO oooooooo = this.f21286OooO00o;
            YAxis yAxis = this.OooO00o;
            oooooooo.OooO00o(((AbstractC8201oOOo0oO0) yAxis).OooOO0, ((AbstractC8201oOOo0oO0) yAxis).OooO, yAxis.OooOOOo());
            C8332oOoOO0o0 ooooo0o0 = this.f21285OooO00o;
            XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
            ooooo0o0.OooO00o(((AbstractC8201oOOo0oO0) xAxis).OooOO0, ((AbstractC8201oOOo0oO0) xAxis).OooO, false);
            Legend legend = ((AbstractC8194oOOo0OoO) this).f21262OooO00o;
            if (legend != null && !legend.m15069OooO0OO()) {
                ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(((AbstractC8194oOOo0OoO) this).f21268OooO00o);
            }
            OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o() {
        super.OooO00o();
        this.OooO00o.OooO00o(((C8226oOOoOo0O) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.LEFT), ((C8226oOOoOo0O) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.LEFT));
        ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o(0.0f, (float) ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19904OooO00o()).OooO0Oo());
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        this.OooO00o = new YAxis(YAxis.AxisDependency.LEFT);
        this.OooOOO0 = AbstractC8352oOoOOoO0.OooO00o(1.5f);
        this.OooOOO = AbstractC8352oOoOOoO0.OooO00o(0.75f);
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8323oOoOO0(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        this.f21286OooO00o = new C8446oOooOOOO(((AbstractC8194oOOo0OoO) this).f21275OooO00o, this.OooO00o, this);
        this.f21285OooO00o = new C8332oOoOO0o0(((AbstractC8194oOOo0OoO) this).f21275OooO00o, ((AbstractC8194oOOo0OoO) this).f21263OooO00o, this);
        ((AbstractC8194oOOo0OoO) this).f21270OooO00o = new C8251oOOooO0O(this);
    }

    public float getFactor() {
        RectF OooO00o2 = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o();
        return Math.min(OooO00o2.width() / 2.0f, OooO00o2.height() / 2.0f) / ((AbstractC8201oOOo0oO0) this.OooO00o).OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRadius() {
        RectF OooO00o2 = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o();
        return Math.min(OooO00o2.width() / 2.0f, OooO00o2.height() / 2.0f);
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRequiredBaseOffset() {
        if (!((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o() || !((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19873OooO0oo()) {
            return AbstractC8352oOoOOoO0.OooO00o(10.0f);
        }
        return (float) ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRequiredLegendOffset() {
        return ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO0O0().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.o000OOo;
    }

    public float getSliceAngle() {
        return 360.0f / ((float) ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19904OooO00o()).OooO0Oo());
    }

    public int getWebAlpha() {
        return this.o0O0O00;
    }

    public int getWebColor() {
        return this.o0OO00O;
    }

    public int getWebColorInner() {
        return this.oo0o0Oo;
    }

    public float getWebLineWidth() {
        return this.OooOOO0;
    }

    public float getWebLineWidthInner() {
        return this.OooOOO;
    }

    public YAxis getYAxis() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMax() {
        return ((AbstractC8201oOOo0oO0) this.OooO00o).OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMin() {
        return ((AbstractC8201oOOo0oO0) this.OooO00o).OooOO0;
    }

    public float getYRange() {
        return ((AbstractC8201oOOo0oO0) this.OooO00o).OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o()) {
                C8332oOoOO0o0 ooooo0o0 = this.f21285OooO00o;
                XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
                ooooo0o0.OooO00o(((AbstractC8201oOOo0oO0) xAxis).OooOO0, ((AbstractC8201oOOo0oO0) xAxis).OooO, false);
            }
            this.f21285OooO00o.OooO00o(canvas);
            if (this.OooOO0) {
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0O0(canvas);
            }
            if (this.OooO00o.m19855OooO00o() && this.OooO00o.m19856OooO()) {
                this.f21286OooO00o.OooO0Oo(canvas);
            }
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas);
            if (OooOO0()) {
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas, ((AbstractC8194oOOo0OoO) this).f21277OooO00o);
            }
            if (this.OooO00o.m19855OooO00o() && !this.OooO00o.m19856OooO()) {
                this.f21286OooO00o.OooO0Oo(canvas);
            }
            this.f21286OooO00o.OooO00o(canvas);
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0OO(canvas);
            ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(canvas);
            OooO00o(canvas);
            OooO0O0(canvas);
        }
    }

    public void setDrawWeb(boolean z) {
        this.OooOO0 = z;
    }

    public void setSkipWebLineCount(int i) {
        this.o000OOo = Math.max(0, i);
    }

    public void setWebAlpha(int i) {
        this.o0O0O00 = i;
    }

    public void setWebColor(int i) {
        this.o0OO00O = i;
    }

    public void setWebColorInner(int i) {
        this.oo0o0Oo = i;
    }

    public void setWebLineWidth(float f) {
        this.OooOOO0 = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setWebLineWidthInner(float f) {
        this.OooOOO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public int OooO00o(float f) {
        float OooO0OO = AbstractC8352oOoOOoO0.OooO0OO(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int OooO0Oo = ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19904OooO00o()).OooO0Oo();
        int i = 0;
        while (i < OooO0Oo) {
            int i2 = i + 1;
            if ((((float) i2) * sliceAngle) - (sliceAngle / 2.0f) > OooO0OO) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public C8196oOOo0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8196oOOo0o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
