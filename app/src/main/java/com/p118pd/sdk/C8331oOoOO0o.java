package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO0o  reason: case insensitive filesystem */
public class C8331oOoOO0o extends AbstractC8307oOo0O000 {
    public Path OooO00o = new Path();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21442OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis f21443OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21444OooO00o = new float[2];
    public Path OooO0O0 = new Path();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public RectF f21445OooO0O0 = new RectF();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f21446OooO0O0 = new float[2];
    public Path OooO0OO = new Path();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public RectF f21447OooO0OO = new RectF();
    public Paint OooO0o0;

    public C8331oOoOO0o(C8353oOoOOoOO oooooooo, YAxis yAxis, C8351oOoOOo0o oooooo0o) {
        super(oooooooo, oooooo0o, yAxis);
        this.f21443OooO00o = yAxis;
        if (((AbstractC8328oOoOO0O) this).OooO00o != null) {
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(-16777216);
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(AbstractC8352oOoOOoO0.OooO00o(10.0f));
            Paint paint = new Paint(1);
            this.OooO0o0 = paint;
            paint.setColor(-7829368);
            this.OooO0o0.setStrokeWidth(1.0f);
            this.OooO0o0.setStyle(Paint.Style.STROKE);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.f21443OooO00o.m19855OooO00o() && this.f21443OooO00o.m19873OooO0oo()) {
            float[] OooO00o2 = m20010OooO00o();
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(this.f21443OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(this.f21443OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(this.f21443OooO00o.m19853OooO00o());
            float OooO0O02 = this.f21443OooO00o.OooO0O0();
            float OooO00o3 = (((float) AbstractC8352oOoOOoO0.OooO00o(((AbstractC8307oOo0O000) this).OooO0O0, ExifInterface.o000oo0O)) / 2.5f) + this.f21443OooO00o.OooO0OO();
            YAxis.AxisDependency OooO00o4 = this.f21443OooO00o.OooO00o();
            YAxis.YAxisLabelPosition OooO00o5 = this.f21443OooO00o.m15076OooO00o();
            if (OooO00o4 == YAxis.AxisDependency.LEFT) {
                if (OooO00o5 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.RIGHT);
                    f2 = ((AbstractC8328oOoOO0O) this).OooO00o.OooOOoo();
                    f = f2 - OooO0O02;
                    OooO00o(canvas, f, OooO00o2, OooO00o3);
                }
                ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.LEFT);
                f3 = ((AbstractC8328oOoOO0O) this).OooO00o.OooOOoo();
            } else if (OooO00o5 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.LEFT);
                f3 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo();
            } else {
                ((AbstractC8307oOo0O000) this).OooO0O0.setTextAlign(Paint.Align.RIGHT);
                f2 = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo();
                f = f2 - OooO0O02;
                OooO00o(canvas, f, OooO00o2, OooO00o3);
            }
            f = f3 + OooO0O02;
            OooO00o(canvas, f, OooO00o2, OooO00o3);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0O0(Canvas canvas) {
        if (this.f21443OooO00o.m19855OooO00o() && this.f21443OooO00o.m19869OooO0o()) {
            ((AbstractC8307oOo0O000) this).OooO0OO.setColor(this.f21443OooO00o.OooO0O0());
            ((AbstractC8307oOo0O000) this).OooO0OO.setStrokeWidth(this.f21443OooO00o.OooO0Oo());
            if (this.f21443OooO00o.OooO00o() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8307oOo0O000) this).OooO0OO);
            } else {
                canvas.drawLine(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o(), ((AbstractC8307oOo0O000) this).OooO0OO);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0OO(Canvas canvas) {
        if (this.f21443OooO00o.m19855OooO00o()) {
            if (this.f21443OooO00o.m19872OooO0oO()) {
                int save = canvas.save();
                canvas.clipRect(OooO00o());
                float[] OooO00o2 = m20010OooO00o();
                ((AbstractC8307oOo0O000) this).OooO00o.setColor(this.f21443OooO00o.OooO0OO());
                ((AbstractC8307oOo0O000) this).OooO00o.setStrokeWidth(this.f21443OooO00o.OooO0oo());
                ((AbstractC8307oOo0O000) this).OooO00o.setPathEffect(this.f21443OooO00o.m19861OooO0O0());
                Path path = this.OooO00o;
                path.reset();
                for (int i = 0; i < OooO00o2.length; i += 2) {
                    canvas.drawPath(OooO00o(path, i, OooO00o2), ((AbstractC8307oOo0O000) this).OooO00o);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.f21443OooO00o.m15079OooOOOO()) {
                OooO0o0(canvas);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
        List<LimitLine> OooO00o2 = this.f21443OooO00o.m19859OooO00o();
        if (OooO00o2 != null && OooO00o2.size() > 0) {
            float[] fArr = this.f21446OooO0O0;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.OooO0OO;
            path.reset();
            for (int i = 0; i < OooO00o2.size(); i++) {
                LimitLine limitLine = OooO00o2.get(i);
                if (limitLine.m19855OooO00o()) {
                    int save = canvas.save();
                    this.f21447OooO0OO.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
                    this.f21447OooO0OO.inset(0.0f, -limitLine.OooO0o0());
                    canvas.clipRect(this.f21447OooO0OO);
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
                        this.OooO0Oo.setTypeface(limitLine.m19854OooO00o());
                        this.OooO0Oo.setStrokeWidth(0.5f);
                        this.OooO0Oo.setTextSize(limitLine.OooO00o());
                        float OooO00o4 = (float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, OooO00o3);
                        float OooO00o5 = AbstractC8352oOoOOoO0.OooO00o(4.0f) + limitLine.OooO0O0();
                        float OooO0o02 = limitLine.OooO0o0() + OooO00o4 + limitLine.OooO0OO();
                        LimitLine.LimitLabelPosition OooO00o6 = limitLine.m15072OooO00o();
                        if (OooO00o6 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() - OooO00o5, (fArr[1] - OooO0o02) + OooO00o4, this.OooO0Oo);
                        } else if (OooO00o6 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo() - OooO00o5, fArr[1] + OooO0o02, this.OooO0Oo);
                        } else if (OooO00o6 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO() + OooO00o5, (fArr[1] - OooO0o02) + OooO00o4, this.OooO0Oo);
                        } else {
                            this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(OooO00o3, ((AbstractC8328oOoOO0O) this).OooO00o.OooOOoo() + OooO00o5, fArr[1] + OooO0o02, this.OooO0Oo);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public void OooO0o0(Canvas canvas) {
        int save = canvas.save();
        this.f21445OooO0O0.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        this.f21445OooO0O0.inset(0.0f, -this.f21443OooO00o.OooOOOO());
        canvas.clipRect(this.f21445OooO0O0);
        C8346oOoOOOoo OooO00o2 = ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO00o(0.0f, 0.0f);
        this.OooO0o0.setColor(this.f21443OooO00o.OooO0o0());
        this.OooO0o0.setStrokeWidth(this.f21443OooO00o.OooOOOO());
        Path path = this.OooO0O0;
        path.reset();
        path.moveTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), (float) OooO00o2.OooO0O0);
        path.lineTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), (float) OooO00o2.OooO0O0);
        canvas.drawPath(path, this.OooO0o0);
        canvas.restoreToCount(save);
    }

    public void OooO00o(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.f21443OooO00o.m15077OooOOO() ? ((AbstractC8201oOOo0oO0) this.f21443OooO00o).f21304OooO0Oo : ((AbstractC8201oOOo0oO0) this.f21443OooO00o).f21304OooO0Oo - 1;
        for (int i2 = !this.f21443OooO00o.m15078OooOOO0(); i2 < i; i2++) {
            canvas.drawText(this.f21443OooO00o.OooO00o(i2), f, fArr[(i2 * 2) + 1] + f2, ((AbstractC8307oOo0O000) this).OooO0O0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    public RectF OooO00o() {
        this.f21442OooO00o.set(((AbstractC8328oOoOO0O) this).OooO00o.m20027OooO00o());
        this.f21442OooO00o.inset(0.0f, -((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oo());
        return this.f21442OooO00o;
    }

    public Path OooO00o(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(((AbstractC8328oOoOO0O) this).OooO00o.OooOOoo(), fArr[i2]);
        path.lineTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), fArr[i2]);
        return path;
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000, com.p118pd.sdk.AbstractC8307oOo0O000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m20010OooO00o() {
        int length = this.f21444OooO00o.length;
        int i = ((AbstractC8201oOOo0oO0) this.f21443OooO00o).f21304OooO0Oo;
        if (length != i * 2) {
            this.f21444OooO00o = new float[(i * 2)];
        }
        float[] fArr = this.f21444OooO00o;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = ((AbstractC8201oOOo0oO0) this.f21443OooO00o).f21299OooO00o[i2 / 2];
        }
        ((AbstractC8307oOo0O000) this).f21408OooO00o.OooO0O0(fArr);
        return fArr;
    }
}
