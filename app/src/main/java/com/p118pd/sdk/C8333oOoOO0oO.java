package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO0oO  reason: case insensitive filesystem */
public class C8333oOoOO0oO extends C8331oOoOO0o {
    public float[] OooO0OO = new float[4];
    public Path OooO0Oo = new Path();
    public Path OooO0o0 = new Path();

    public C8333oOoOO0oO(C8353oOoOOoOO oooooooo, YAxis yAxis, C8351oOoOOo0o oooooo0o) {
        super(oooooooo, yAxis, oooooo0o);
        super.OooO0Oo.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(float f, float f2, boolean z) {
        float f3;
        double d;
        if (((AbstractC8328oOoOO0O) this).OooO00o.OooO0O0() > 10.0f && !((AbstractC8328oOoOO0O) this).OooO00o.m20048OooO0oo()) {
            C8346oOoOOOoo OooO0O0 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            C8346oOoOOOoo OooO0O02 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            if (!z) {
                f3 = (float) OooO0O0.f21451OooO00o;
                d = OooO0O02.f21451OooO00o;
            } else {
                f3 = (float) OooO0O02.f21451OooO00o;
                d = OooO0O0.f21451OooO00o;
            }
            C8346oOoOOOoo.OooO00o(OooO0O0);
            C8346oOoOOOoo.OooO00o(OooO0O02);
            f = f3;
            f2 = (float) d;
        }
        OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0O0(Canvas canvas) {
        if (((C8331oOoOO0o) this).f21443OooO00o.m19855OooO00o() && ((C8331oOoOO0o) this).f21443OooO00o.m19869OooO0o()) {
            ((AbstractC8307oOo0O000) this).OooO0OO.setColor(((C8331oOoOO0o) this).f21443OooO00o.OooO0O0());
            ((AbstractC8307oOo0O000) this).OooO0OO.setStrokeWidth(((C8331oOoOO0o) this).f21443OooO00o.OooO0Oo());
            if (((C8331oOoOO0o) this).f21443OooO00o.OooO00o() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8307oOo0O000) this).OooO0OO);
            } else {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8307oOo0O000) this).OooO0OO);
            }
        }
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
        List<LimitLine> OooO00o = ((C8331oOoOO0o) this).f21443OooO00o.m19859OooO00o();
        if (OooO00o != null && OooO00o.size() > 0) {
            float[] fArr = this.OooO0OO;
            float f = 0.0f;
            fArr[0] = 0.0f;
            char c = 1;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            Path path = this.OooO0o0;
            path.reset();
            int i = 0;
            while (i < OooO00o.size()) {
                LimitLine limitLine = OooO00o.get(i);
                if (limitLine.m19855OooO00o()) {
                    int save = canvas.save();
                    ((C8331oOoOO0o) this).f21447OooO0OO.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
                    ((C8331oOoOO0o) this).f21447OooO0OO.inset(-limitLine.OooO0o0(), f);
                    canvas.clipRect(((C8331oOoOO0o) this).f21447OooO0OO);
                    fArr[0] = limitLine.OooO0Oo();
                    fArr[2] = limitLine.OooO0Oo();
                    ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
                    fArr[c] = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0();
                    fArr[3] = ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o();
                    path.moveTo(fArr[0], fArr[c]);
                    path.lineTo(fArr[2], fArr[3]);
                    super.OooO0Oo.setStyle(Paint.Style.STROKE);
                    super.OooO0Oo.setColor(limitLine.OooO0O0());
                    super.OooO0Oo.setPathEffect(limitLine.OooO00o());
                    super.OooO0Oo.setStrokeWidth(limitLine.OooO0o0());
                    canvas.drawPath(path, super.OooO0Oo);
                    path.reset();
                    String OooO00o2 = limitLine.m15073OooO00o();
                    if (OooO00o2 != null && !OooO00o2.equals("")) {
                        super.OooO0Oo.setStyle(limitLine.m15071OooO00o());
                        super.OooO0Oo.setPathEffect(null);
                        super.OooO0Oo.setColor(limitLine.m19853OooO00o());
                        super.OooO0Oo.setTypeface(limitLine.m19854OooO00o());
                        super.OooO0Oo.setStrokeWidth(0.5f);
                        super.OooO0Oo.setTextSize(limitLine.OooO00o());
                        float OooO0o02 = limitLine.OooO0o0() + limitLine.OooO0O0();
                        float OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(2.0f) + limitLine.OooO0OO();
                        LimitLine.LimitLabelPosition OooO00o4 = limitLine.m15072OooO00o();
                        if (OooO00o4 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            super.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o2, fArr[0] + OooO0o02, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() + OooO00o3 + ((float) AbstractC8352oOoOOoO0.OooO00o(super.OooO0Oo, OooO00o2)), super.OooO0Oo);
                        } else if (OooO00o4 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            super.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o2, fArr[0] + OooO0o02, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - OooO00o3, super.OooO0Oo);
                        } else if (OooO00o4 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            super.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o2, fArr[0] - OooO0o02, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() + OooO00o3 + ((float) AbstractC8352oOoOOoO0.OooO00o(super.OooO0Oo, OooO00o2)), super.OooO0Oo);
                        } else {
                            super.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o2, fArr[0] - OooO0o02, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - OooO00o3, super.OooO0Oo);
                        }
                    }
                    canvas.restoreToCount(save);
                }
                i++;
                f = 0.0f;
                c = 1;
            }
        }
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o
    public void OooO0o0(Canvas canvas) {
        int save = canvas.save();
        ((C8331oOoOO0o) this).f21445OooO0O0.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        ((C8331oOoOO0o) this).f21445OooO0O0.inset(-((C8331oOoOO0o) this).f21443OooO00o.OooOOOO(), 0.0f);
        canvas.clipRect(((C8331oOoOO0o) this).f21447OooO0OO);
        C8346oOoOOOoo OooO00o = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO00o(0.0f, 0.0f);
        super.OooO0o0.setColor(((C8331oOoOO0o) this).f21443OooO00o.OooO0o0());
        super.OooO0o0.setStrokeWidth(((C8331oOoOO0o) this).f21443OooO00o.OooOOOO());
        Path path = this.OooO0Oo;
        path.reset();
        path.moveTo(((float) OooO00o.f21451OooO00o) - 1.0f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
        path.lineTo(((float) OooO00o.f21451OooO00o) - 1.0f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
        canvas.drawPath(path, super.OooO0o0);
        canvas.restoreToCount(save);
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (((C8331oOoOO0o) this).f21443OooO00o.m19855OooO00o() && ((C8331oOoOO0o) this).f21443OooO00o.m19873OooO0oo()) {
            float[] OooO00o = m20011OooO00o();
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8331oOoOO0o) this).f21443OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8331oOoOO0o) this).f21443OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(((C8331oOoOO0o) this).f21443OooO00o.m19853OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.CENTER);
            float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(2.5f);
            float OooO00o3 = (float) AbstractC8352oOoOOoO0.OooO00o(((AbstractC8307oOo0O000) this).OooO0O0, "Q");
            YAxis.AxisDependency OooO00o4 = ((C8331oOoOO0o) this).f21443OooO00o.OooO00o();
            YAxis.YAxisLabelPosition OooO00o5 = ((C8331oOoOO0o) this).f21443OooO00o.m15076OooO00o();
            if (OooO00o4 == YAxis.AxisDependency.LEFT) {
                if (OooO00o5 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    f3 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0();
                } else {
                    f3 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0();
                }
                f = f3 - OooO00o2;
            } else {
                if (OooO00o5 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    f2 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o();
                } else {
                    f2 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o();
                }
                f = f2 + OooO00o3 + OooO00o2;
            }
            OooO00o(canvas, f, OooO00o, ((C8331oOoOO0o) this).f21443OooO00o.OooO0OO());
        }
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o
    public void OooO00o(Canvas canvas, float f, float[] fArr, float f2) {
        ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8331oOoOO0o) this).f21443OooO00o.m19854OooO00o());
        ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8331oOoOO0o) this).f21443OooO00o.OooO00o());
        ((AbstractC8307oOo0O000) this).OooO0O0.setColor(((C8331oOoOO0o) this).f21443OooO00o.m19853OooO00o());
        int i = ((C8331oOoOO0o) this).f21443OooO00o.m15077OooOOO() ? ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21304OooO0Oo : ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21304OooO0Oo - 1;
        for (int i2 = !((C8331oOoOO0o) this).f21443OooO00o.m15078OooOOO0(); i2 < i; i2++) {
            canvas.drawText(((C8331oOoOO0o) this).f21443OooO00o.OooO00o(i2), fArr[i2 * 2], f - f2, ((AbstractC8307oOo0O000) this).OooO0O0);
        }
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m20011OooO00o() {
        int length = ((C8331oOoOO0o) this).f21444OooO00o.length;
        int i = ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21304OooO0Oo;
        if (length != i * 2) {
            ((C8331oOoOO0o) this).f21444OooO00o = new float[(i * 2)];
        }
        float[] fArr = ((C8331oOoOO0o) this).f21444OooO00o;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21299OooO00o[i2 / 2];
        }
        ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
        return fArr;
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    public RectF OooO00o() {
        ((C8331oOoOO0o) this).f21442OooO00o.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        ((C8331oOoOO0o) this).f21442OooO00o.inset(-((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oo(), 0.0f);
        return ((C8331oOoOO0o) this).f21442OooO00o;
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o
    public Path OooO00o(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
        path.lineTo(fArr[i], ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
        return path;
    }
}
