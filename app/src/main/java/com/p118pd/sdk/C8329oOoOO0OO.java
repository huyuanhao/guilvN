package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO0OO  reason: case insensitive filesystem */
public class C8329oOoOO0OO extends AbstractC8307oOo0O000 {
    public Path OooO00o = new Path();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21437OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public XAxis f21438OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21439OooO00o = new float[2];
    public Path OooO0O0 = new Path();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public RectF f21440OooO0O0 = new RectF();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f21441OooO0O0 = new float[2];
    public float[] OooO0OO = new float[4];

    public C8329oOoOO0OO(C8353oOoOOoOO oooooooo, XAxis xAxis, C8351oOoOOo0o oooooo0o) {
        super(oooooooo, oooooo0o, xAxis);
        this.f21438OooO00o = xAxis;
        ((AbstractC8307oOo0O000) this).OooO0O0.setColor(-16777216);
        ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.CENTER);
        ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(AbstractC8352oOoOOoO0.OooO00o(10.0f));
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(float f, float f2, boolean z) {
        float f3;
        double d;
        if (((AbstractC8328oOoOO0O) this).OooO00o.OooO0o() > 10.0f && !((AbstractC8328oOoOO0O) this).OooO00o.m20048OooO0oo()) {
            C8346oOoOOOoo OooO0O02 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            C8346oOoOOOoo OooO0O03 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            if (z) {
                f3 = (float) OooO0O03.f21451OooO00o;
                d = OooO0O02.f21451OooO00o;
            } else {
                f3 = (float) OooO0O02.f21451OooO00o;
                d = OooO0O03.f21451OooO00o;
            }
            C8346oOoOOOoo.OooO00o(OooO0O02);
            C8346oOoOOOoo.OooO00o(OooO0O03);
            f = f3;
            f2 = (float) d;
        }
        OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0O0() {
        ((AbstractC8307oOo0O000) this).OooO00o.setColor(this.f21438OooO00o.OooO0OO());
        ((AbstractC8307oOo0O000) this).OooO00o.setStrokeWidth(this.f21438OooO00o.OooO0oo());
        ((AbstractC8307oOo0O000) this).OooO00o.setPathEffect(this.f21438OooO00o.m19861OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0OO(Canvas canvas) {
        if (this.f21438OooO00o.m19872OooO0oO() && this.f21438OooO00o.m19855OooO00o()) {
            int save = canvas.save();
            canvas.clipRect(OooO00o());
            if (this.f21439OooO00o.length != ((AbstractC8307oOo0O000) this).f21407OooO00o.f21304OooO0Oo * 2) {
                this.f21439OooO00o = new float[(((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21304OooO0Oo * 2)];
            }
            float[] fArr = this.f21439OooO00o;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = ((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21299OooO00o;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
            OooO0O0();
            Path path = this.OooO00o;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                OooO00o(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
        List<LimitLine> OooO00o2 = this.f21438OooO00o.m19859OooO00o();
        if (OooO00o2 != null && OooO00o2.size() > 0) {
            float[] fArr = this.f21441OooO0O0;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i = 0; i < OooO00o2.size(); i++) {
                LimitLine limitLine = OooO00o2.get(i);
                if (limitLine.m19855OooO00o()) {
                    int save = canvas.save();
                    this.f21440OooO0O0.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
                    this.f21440OooO0O0.inset(-limitLine.OooO0o0(), 0.0f);
                    canvas.clipRect(this.f21440OooO0O0);
                    fArr[0] = limitLine.OooO0Oo();
                    fArr[1] = 0.0f;
                    ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
                    OooO00o(canvas, limitLine, fArr);
                    OooO00o(canvas, limitLine, fArr, limitLine.OooO0OO() + 2.0f);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0O0(Canvas canvas) {
        if (this.f21438OooO00o.m19869OooO0o() && this.f21438OooO00o.m19855OooO00o()) {
            super.OooO0OO.setColor(this.f21438OooO00o.OooO0O0());
            super.OooO0OO.setStrokeWidth(this.f21438OooO00o.OooO0Oo());
            super.OooO0OO.setPathEffect(this.f21438OooO00o.OooO00o());
            if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP || this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP_INSIDE || this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), super.OooO0OO);
            }
            if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM || this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), super.OooO0OO);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(float f, float f2) {
        super.OooO00o(f, f2);
        m20008OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20008OooO00o() {
        String OooO00o2 = this.f21438OooO00o.m19858OooO00o();
        ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(this.f21438OooO00o.m19854OooO00o());
        ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(this.f21438OooO00o.OooO00o());
        C8344oOoOOOo OooO00o3 = AbstractC8352oOoOOoO0.m20022OooO00o(((AbstractC8307oOo0O000) this).OooO0O0, OooO00o2);
        float f = OooO00o3.f21450OooO00o;
        float OooO00o4 = (float) AbstractC8352oOoOOoO0.OooO00o(((AbstractC8307oOo0O000) this).OooO0O0, "Q");
        C8344oOoOOOo OooO00o5 = AbstractC8352oOoOOoO0.OooO00o(f, OooO00o4, this.f21438OooO00o.OooOO0O());
        this.f21438OooO00o.OooO0oO = Math.round(f);
        this.f21438OooO00o.OooO0oo = Math.round(OooO00o4);
        this.f21438OooO00o.OooO = Math.round(OooO00o5.f21450OooO00o);
        this.f21438OooO00o.OooOO0 = Math.round(OooO00o5.OooO0O0);
        C8344oOoOOOo.OooO00o(OooO00o5);
        C8344oOoOOOo.OooO00o(OooO00o3);
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        if (this.f21438OooO00o.m19855OooO00o() && this.f21438OooO00o.m19873OooO0oo()) {
            float OooO0OO2 = this.f21438OooO00o.OooO0OO();
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(this.f21438OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(this.f21438OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(this.f21438OooO00o.m19853OooO00o());
            C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
            if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP) {
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 1.0f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() - OooO0OO2, OooO00o2);
            } else if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.TOP_INSIDE) {
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 1.0f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() + OooO0OO2 + ((float) this.f21438OooO00o.OooOO0), OooO00o2);
            } else if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM) {
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 0.0f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() + OooO0OO2, OooO00o2);
            } else if (this.f21438OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 0.0f;
                OooO00o(canvas, (((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - OooO0OO2) - ((float) this.f21438OooO00o.OooOO0), OooO00o2);
            } else {
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 1.0f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() - OooO0OO2, OooO00o2);
                OooO00o2.f21456OooO00o = 0.5f;
                OooO00o2.OooO0O0 = 0.0f;
                OooO00o(canvas, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() + OooO0OO2, OooO00o2);
            }
            C8349oOoOOo00.m20016OooO00o(OooO00o2);
        }
    }

    public void OooO00o(Canvas canvas, float f, C8349oOoOOo00 oooooo00) {
        float OooOO0O = this.f21438OooO00o.OooOO0O();
        boolean OooO0o0 = this.f21438OooO00o.m19871OooO0o0();
        int i = ((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21304OooO0Oo * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (OooO0o0) {
                fArr[i2] = ((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21302OooO0O0[i2 / 2];
            } else {
                fArr[i2] = ((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21299OooO00o[i2 / 2];
            }
        }
        ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (((AbstractC8328oOoOO0O) this).OooO00o.m20046OooO0o0(f2)) {
                AbstractC8238oOOoo000 OooO00o2 = this.f21438OooO00o.m19857OooO00o();
                XAxis xAxis = this.f21438OooO00o;
                int i4 = i3 / 2;
                String OooO00o3 = OooO00o2.OooO00o(((AbstractC8201oOOo0oO0) xAxis).f21299OooO00o[i4], xAxis);
                if (this.f21438OooO00o.OooOOO0()) {
                    int i5 = ((AbstractC8201oOOo0oO0) this.f21438OooO00o).f21304OooO0Oo;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float OooO0O02 = (float) AbstractC8352oOoOOoO0.OooO0O0(((AbstractC8307oOo0O000) this).OooO0O0, OooO00o3);
                        if (OooO0O02 > ((AbstractC8328oOoOO0O) this).OooO00o.OooOo00() * 2.0f && f2 + OooO0O02 > ((AbstractC8328oOoOO0O) this).OooO00o.OooO0oo()) {
                            f2 -= OooO0O02 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += ((float) AbstractC8352oOoOOoO0.OooO0O0(((AbstractC8307oOo0O000) this).OooO0O0, OooO00o3)) / 2.0f;
                    }
                }
                OooO00o(canvas, OooO00o3, f2, f, oooooo00, OooOO0O);
            }
        }
    }

    public void OooO00o(Canvas canvas, String str, float f, float f2, C8349oOoOOo00 oooooo00, float f3) {
        AbstractC8352oOoOOoO0.OooO00o(canvas, str, f, f2, ((AbstractC8307oOo0O000) this).OooO0O0, oooooo00, f3);
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    public RectF OooO00o() {
        this.f21437OooO00o.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        this.f21437OooO00o.inset(-((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oo(), 0.0f);
        return this.f21437OooO00o;
    }

    public void OooO00o(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
        path.lineTo(f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
        canvas.drawPath(path, ((AbstractC8307oOo0O000) this).OooO00o);
        path.reset();
    }

    public void OooO00o(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.OooO0OO;
        fArr2[0] = fArr[0];
        fArr2[1] = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0();
        float[] fArr3 = this.OooO0OO;
        fArr3[2] = fArr[0];
        fArr3[3] = ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o();
        this.OooO0O0.reset();
        Path path = this.OooO0O0;
        float[] fArr4 = this.OooO0OO;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.OooO0O0;
        float[] fArr5 = this.OooO0OO;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.OooO0Oo.setStyle(Paint.Style.STROKE);
        this.OooO0Oo.setColor(limitLine.OooO0O0());
        this.OooO0Oo.setStrokeWidth(limitLine.OooO0o0());
        this.OooO0Oo.setPathEffect(limitLine.OooO00o());
        canvas.drawPath(this.OooO0O0, this.OooO0Oo);
    }

    public void OooO00o(Canvas canvas, LimitLine limitLine, float[] fArr, float f) {
        String OooO00o2 = limitLine.m15073OooO00o();
        if (OooO00o2 != null && !OooO00o2.equals("")) {
            this.OooO0Oo.setStyle(limitLine.m15071OooO00o());
            this.OooO0Oo.setPathEffect(null);
            this.OooO0Oo.setColor(limitLine.m19853OooO00o());
            this.OooO0Oo.setStrokeWidth(0.5f);
            this.OooO0Oo.setTextSize(limitLine.OooO00o());
            float OooO0o0 = limitLine.OooO0o0() + limitLine.OooO0O0();
            LimitLine.LimitLabelPosition OooO00o3 = limitLine.m15072OooO00o();
            if (OooO00o3 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(OooO00o2, fArr[0] + OooO0o0, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() + f + ((float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, OooO00o2)), this.OooO0Oo);
            } else if (OooO00o3 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(OooO00o2, fArr[0] + OooO0o0, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - f, this.OooO0Oo);
            } else if (OooO00o3 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(OooO00o2, fArr[0] - OooO0o0, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0() + f + ((float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, OooO00o2)), this.OooO0Oo);
            } else {
                this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(OooO00o2, fArr[0] - OooO0o0, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - f, this.OooO0Oo);
            }
        }
    }
}
