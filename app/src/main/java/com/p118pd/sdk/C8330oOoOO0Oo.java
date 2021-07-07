package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO0Oo  reason: case insensitive filesystem */
public class C8330oOoOO0Oo extends C8329oOoOO0OO {
    public C8190oOOo0OOO OooO00o;
    public Path OooO0OO = new Path();

    public C8330oOoOO0Oo(C8353oOoOOoOO oooooooo, XAxis xAxis, C8351oOoOOo0o oooooo0o, C8190oOOo0OOO oooo0ooo) {
        super(oooooooo, xAxis, oooooo0o);
        this.OooO00o = oooo0ooo;
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(float f, float f2, boolean z) {
        float f3;
        double d;
        if (((AbstractC8328oOoOO0O) this).OooO00o.OooO0o() > 10.0f && !((AbstractC8328oOoOO0O) this).OooO00o.m20025OooO()) {
            C8346oOoOOOoo OooO0O0 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
            C8346oOoOOOoo OooO0O02 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            if (z) {
                f3 = (float) OooO0O02.OooO0O0;
                d = OooO0O0.OooO0O0;
            } else {
                f3 = (float) OooO0O0.OooO0O0;
                d = OooO0O02.OooO0O0;
            }
            C8346oOoOOOoo.OooO00o(OooO0O0);
            C8346oOoOOOoo.OooO00o(OooO0O02);
            f = f3;
            f2 = (float) d;
        }
        OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0O0(Canvas canvas) {
        if (((C8329oOoOO0OO) this).f21438OooO00o.m19869OooO0o() && ((C8329oOoOO0OO) this).f21438OooO00o.m19855OooO00o()) {
            ((AbstractC8307oOo0O000) this).OooO0OO.setColor(((C8329oOoOO0OO) this).f21438OooO00o.OooO0O0());
            ((AbstractC8307oOo0O000) this).OooO0OO.setStrokeWidth(((C8329oOoOO0OO) this).f21438OooO00o.OooO0Oo());
            if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP || ((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP_INSIDE || ((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8307oOo0O000) this).OooO0OO);
            }
            if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM || ((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM_INSIDE || ((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8307oOo0O000) this).OooO0OO);
            }
        }
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
        List<LimitLine> OooO00o2 = ((C8329oOoOO0OO) this).f21438OooO00o.m19859OooO00o();
        if (OooO00o2 != null && OooO00o2.size() > 0) {
            float[] fArr = ((C8329oOoOO0OO) this).f21441OooO0O0;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.OooO0OO;
            path.reset();
            for (int i = 0; i < OooO00o2.size(); i++) {
                LimitLine limitLine = OooO00o2.get(i);
                if (limitLine.m19855OooO00o()) {
                    int save = canvas.save();
                    ((C8329oOoOO0OO) this).f21440OooO0O0.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
                    ((C8329oOoOO0OO) this).f21440OooO0O0.inset(0.0f, -limitLine.OooO0o0());
                    canvas.clipRect(((C8329oOoOO0OO) this).f21440OooO0O0);
                    this.OooO0Oo.setStyle(Paint.Style.STROKE);
                    this.OooO0Oo.setColor(limitLine.OooO0O0());
                    this.OooO0Oo.setStrokeWidth(limitLine.OooO0o0());
                    this.OooO0Oo.setPathEffect(limitLine.OooO00o());
                    fArr[1] = limitLine.OooO0Oo();
                    ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
                    path.moveTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), fArr[1]);
                    path.lineTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), fArr[1]);
                    canvas.drawPath(path, this.OooO0Oo);
                    path.reset();
                    String OooO00o3 = limitLine.m15073OooO00o();
                    if (OooO00o3 != null && !OooO00o3.equals("")) {
                        this.OooO0Oo.setStyle(limitLine.m15071OooO00o());
                        this.OooO0Oo.setPathEffect(null);
                        this.OooO0Oo.setColor(limitLine.m19853OooO00o());
                        this.OooO0Oo.setStrokeWidth(0.5f);
                        this.OooO0Oo.setTextSize(limitLine.OooO00o());
                        float OooO00o4 = (float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, OooO00o3);
                        float OooO00o5 = AbstractC8352oOoOOoO0.OooO00o(4.0f) + limitLine.OooO0O0();
                        float OooO0o0 = limitLine.OooO0o0() + OooO00o4 + limitLine.OooO0OO();
                        LimitLine.LimitLabelPosition OooO00o6 = limitLine.m15072OooO00o();
                        if (OooO00o6 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() - OooO00o5, (fArr[1] - OooO0o0) + OooO00o4, this.OooO0Oo);
                        } else if (OooO00o6 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() - OooO00o5, fArr[1] + OooO0o0, this.OooO0Oo);
                        } else if (OooO00o6 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO() + OooO00o5, (fArr[1] - OooO0o0) + OooO00o4, this.OooO0Oo);
                        } else {
                            this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooOOoo() + OooO00o5, fArr[1] + OooO0o0, this.OooO0Oo);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20009OooO00o() {
        ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8329oOoOO0OO) this).f21438OooO00o.m19854OooO00o());
        ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8329oOoOO0OO) this).f21438OooO00o.OooO00o());
        C8344oOoOOOo OooO00o2 = AbstractC8352oOoOOoO0.m20022OooO00o(((AbstractC8307oOo0O000) this).OooO0O0, ((C8329oOoOO0OO) this).f21438OooO00o.m19858OooO00o());
        float f = OooO00o2.OooO0O0;
        C8344oOoOOOo OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(OooO00o2.f21450OooO00o, f, ((C8329oOoOO0OO) this).f21438OooO00o.OooOO0O());
        ((C8329oOoOO0OO) this).f21438OooO00o.OooO0oO = Math.round((float) ((int) (OooO00o2.f21450OooO00o + (((C8329oOoOO0OO) this).f21438OooO00o.OooO0O0() * 3.5f))));
        ((C8329oOoOO0OO) this).f21438OooO00o.OooO0oo = Math.round(f);
        XAxis xAxis = ((C8329oOoOO0OO) this).f21438OooO00o;
        xAxis.OooO = (int) (OooO00o3.f21450OooO00o + (xAxis.OooO0O0() * 3.5f));
        ((C8329oOoOO0OO) this).f21438OooO00o.OooOO0 = Math.round(OooO00o3.OooO0O0);
        C8344oOoOOOo.OooO00o(OooO00o3);
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        if (((C8329oOoOO0OO) this).f21438OooO00o.m19855OooO00o() && ((C8329oOoOO0OO) this).f21438OooO00o.m19873OooO0oo()) {
            float OooO0O0 = ((C8329oOoOO0OO) this).f21438OooO00o.OooO0O0();
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8329oOoOO0OO) this).f21438OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8329oOoOO0OO) this).f21438OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(((C8329oOoOO0OO) this).f21438OooO00o.m19853OooO00o());
            C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
            if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP) {
                OooO00o2.f21456OooO00o = 0.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() + OooO0O0, OooO00o2);
            } else if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP_INSIDE) {
                OooO00o2.f21456OooO00o = 1.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() - OooO0O0, OooO00o2);
            } else if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM) {
                OooO00o2.f21456OooO00o = 1.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO() - OooO0O0, OooO00o2);
            } else if (((C8329oOoOO0OO) this).f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                OooO00o2.f21456OooO00o = 1.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO() + OooO0O0, OooO00o2);
            } else {
                OooO00o2.f21456OooO00o = 0.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() + OooO0O0, OooO00o2);
                OooO00o2.f21456OooO00o = 1.0f;
                OooO00o2.OooO0O0 = 0.5f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO() - OooO0O0, OooO00o2);
            }
            C8349oOoOOo00.m20016OooO00o(OooO00o2);
        }
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO
    public void OooO00o(Canvas canvas, float f, C8349oOoOOo00 oooooo00) {
        float OooOO0O = ((C8329oOoOO0OO) this).f21438OooO00o.OooOO0O();
        boolean OooO0o0 = ((C8329oOoOO0OO) this).f21438OooO00o.m19871OooO0o0();
        int i = ((AbstractC8201oOOo0oO0) ((C8329oOoOO0OO) this).f21438OooO00o).f21304OooO0Oo * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (OooO0o0) {
                fArr[i2 + 1] = ((AbstractC8201oOOo0oO0) ((C8329oOoOO0OO) this).f21438OooO00o).f21302OooO0O0[i2 / 2];
            } else {
                fArr[i2 + 1] = ((AbstractC8201oOOo0oO0) ((C8329oOoOO0OO) this).f21438OooO00o).f21299OooO00o[i2 / 2];
            }
        }
        ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(f2)) {
                AbstractC8238oOOoo000 OooO00o2 = ((C8329oOoOO0OO) this).f21438OooO00o.m19857OooO00o();
                XAxis xAxis = ((C8329oOoOO0OO) this).f21438OooO00o;
                OooO00o(canvas, OooO00o2.OooO00o(((AbstractC8201oOOo0oO0) xAxis).f21299OooO00o[i3 / 2], xAxis), f, f2, oooooo00, OooOO0O);
            }
        }
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    public RectF OooO00o() {
        ((C8329oOoOO0OO) this).f21437OooO00o.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        ((C8329oOoOO0OO) this).f21437OooO00o.inset(0.0f, -((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oo());
        return ((C8329oOoOO0OO) this).f21437OooO00o;
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO
    public void OooO00o(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), f2);
        path.lineTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), f2);
        canvas.drawPath(path, ((AbstractC8307oOo0O000) this).OooO00o);
        path.reset();
    }
}
