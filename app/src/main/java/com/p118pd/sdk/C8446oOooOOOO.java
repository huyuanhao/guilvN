package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* renamed from: com.pd.sdk.oOooOOOO  reason: case insensitive filesystem */
public class C8446oOooOOOO extends C8331oOoOO0o {
    public C8196oOOo0o OooO00o;
    public Path OooO0Oo = new Path();

    public C8446oOooOOOO(C8353oOoOOoOO oooooooo, YAxis yAxis, C8196oOOo0o oooo0o) {
        super(oooooooo, yAxis, null);
        this.OooO00o = oooo0o;
    }

    @Override // com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(float f, float f2) {
        double d;
        double d2;
        int i;
        float f3 = f;
        int OooO0Oo2 = ((AbstractC8307oOo0O000) this).f21407OooO00o.m19866OooO0Oo();
        double abs = (double) Math.abs(f2 - f3);
        if (OooO0Oo2 == 0 || abs <= AbstractC8352oOoOOoO0.OooO0O0 || Double.isInfinite(abs)) {
            AbstractC8201oOOo0oO0 oooo0oo0 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
            oooo0oo0.f21299OooO00o = new float[0];
            oooo0oo0.f21302OooO0O0 = new float[0];
            oooo0oo0.f21304OooO0Oo = 0;
            return;
        }
        double d3 = (double) OooO0Oo2;
        Double.isNaN(abs);
        Double.isNaN(d3);
        double OooO00o2 = (double) AbstractC8352oOoOOoO0.m20019OooO00o(abs / d3);
        if (((AbstractC8307oOo0O000) this).f21407OooO00o.OooOO0O() && OooO00o2 < ((double) ((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oO())) {
            OooO00o2 = (double) ((AbstractC8307oOo0O000) this).f21407OooO00o.OooO0oO();
        }
        double OooO00o3 = (double) AbstractC8352oOoOOoO0.m20019OooO00o(Math.pow(10.0d, (double) ((int) Math.log10(OooO00o2))));
        Double.isNaN(OooO00o3);
        if (((int) (OooO00o2 / OooO00o3)) > 5) {
            Double.isNaN(OooO00o3);
            OooO00o2 = Math.floor(OooO00o3 * 10.0d);
        }
        boolean OooO0o0 = ((AbstractC8307oOo0O000) this).f21407OooO00o.m19871OooO0o0();
        if (((AbstractC8307oOo0O000) this).f21407OooO00o.m19874OooOO0()) {
            float f4 = ((float) abs) / ((float) (OooO0Oo2 - 1));
            AbstractC8201oOOo0oO0 oooo0oo02 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
            oooo0oo02.f21304OooO0Oo = OooO0Oo2;
            if (oooo0oo02.f21299OooO00o.length < OooO0Oo2) {
                oooo0oo02.f21299OooO00o = new float[OooO0Oo2];
            }
            for (int i2 = 0; i2 < OooO0Oo2; i2++) {
                ((AbstractC8307oOo0O000) this).f21407OooO00o.f21299OooO00o[i2] = f3;
                f3 += f4;
            }
        } else {
            if (OooO00o2 == AbstractC8352oOoOOoO0.OooO0O0) {
                d = AbstractC8352oOoOOoO0.OooO0O0;
            } else {
                double d4 = (double) f3;
                Double.isNaN(d4);
                d = Math.ceil(d4 / OooO00o2) * OooO00o2;
            }
            if (OooO0o0) {
                d -= OooO00o2;
            }
            if (OooO00o2 == AbstractC8352oOoOOoO0.OooO0O0) {
                d2 = 0.0d;
            } else {
                double d5 = (double) f2;
                Double.isNaN(d5);
                d2 = AbstractC8352oOoOOoO0.OooO00o(Math.floor(d5 / OooO00o2) * OooO00o2);
            }
            if (OooO00o2 != AbstractC8352oOoOOoO0.OooO0O0) {
                i = OooO0o0;
                for (double d6 = d; d6 <= d2; d6 += OooO00o2) {
                    i++;
                }
            } else {
                i = OooO0o0;
            }
            int i3 = i + 1;
            AbstractC8201oOOo0oO0 oooo0oo03 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
            oooo0oo03.f21304OooO0Oo = i3;
            if (oooo0oo03.f21299OooO00o.length < i3) {
                oooo0oo03.f21299OooO00o = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (d == AbstractC8352oOoOOoO0.OooO0O0) {
                    d = 0.0d;
                }
                ((AbstractC8307oOo0O000) this).f21407OooO00o.f21299OooO00o[i4] = (float) d;
                d += OooO00o2;
            }
            OooO0Oo2 = i3;
        }
        if (OooO00o2 < 1.0d) {
            ((AbstractC8307oOo0O000) this).f21407OooO00o.f21308OooO0o0 = (int) Math.ceil(-Math.log10(OooO00o2));
        } else {
            ((AbstractC8307oOo0O000) this).f21407OooO00o.f21308OooO0o0 = 0;
        }
        if (OooO0o0) {
            AbstractC8201oOOo0oO0 oooo0oo04 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
            if (oooo0oo04.f21302OooO0O0.length < OooO0Oo2) {
                oooo0oo04.f21302OooO0O0 = new float[OooO0Oo2];
            }
            float[] fArr = ((AbstractC8307oOo0O000) this).f21407OooO00o.f21299OooO00o;
            float f5 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i5 = 0; i5 < OooO0Oo2; i5++) {
                AbstractC8201oOOo0oO0 oooo0oo05 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
                oooo0oo05.f21302OooO0O0[i5] = oooo0oo05.f21299OooO00o[i5] + f5;
            }
        }
        AbstractC8201oOOo0oO0 oooo0oo06 = ((AbstractC8307oOo0O000) this).f21407OooO00o;
        float[] fArr2 = oooo0oo06.f21299OooO00o;
        float f6 = fArr2[0];
        oooo0oo06.OooOO0 = f6;
        float f7 = fArr2[OooO0Oo2 - 1];
        oooo0oo06.OooO = f7;
        oooo0oo06.OooOO0O = Math.abs(f7 - f6);
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
        List<LimitLine> OooO00o2 = ((C8331oOoOO0o) this).f21443OooO00o.m19859OooO00o();
        if (OooO00o2 != null) {
            float sliceAngle = this.OooO00o.getSliceAngle();
            float factor = this.OooO00o.getFactor();
            C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
            C8349oOoOOo00 OooO00o3 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
            for (int i = 0; i < OooO00o2.size(); i++) {
                LimitLine limitLine = OooO00o2.get(i);
                if (limitLine.m19855OooO00o()) {
                    super.OooO0Oo.setColor(limitLine.OooO0O0());
                    super.OooO0Oo.setPathEffect(limitLine.OooO00o());
                    super.OooO0Oo.setStrokeWidth(limitLine.OooO0o0());
                    float OooO0Oo2 = (limitLine.OooO0Oo() - this.OooO00o.getYChartMin()) * factor;
                    Path path = this.OooO0Oo;
                    path.reset();
                    for (int i2 = 0; i2 < ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) this.OooO00o.getData()).m19904OooO00o()).OooO0Oo(); i2++) {
                        AbstractC8352oOoOOoO0.OooO00o(centerOffsets, OooO0Oo2, (((float) i2) * sliceAngle) + this.OooO00o.getRotationAngle(), OooO00o3);
                        if (i2 == 0) {
                            path.moveTo(OooO00o3.f21456OooO00o, OooO00o3.OooO0O0);
                        } else {
                            path.lineTo(OooO00o3.f21456OooO00o, OooO00o3.OooO0O0);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, super.OooO0Oo);
                }
            }
            C8349oOoOOo00.m20016OooO00o(centerOffsets);
            C8349oOoOOo00.m20016OooO00o(OooO00o3);
        }
    }

    @Override // com.p118pd.sdk.C8331oOoOO0o, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        if (((C8331oOoOO0o) this).f21443OooO00o.m19855OooO00o() && ((C8331oOoOO0o) this).f21443OooO00o.m19873OooO0oo()) {
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8331oOoOO0o) this).f21443OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8331oOoOO0o) this).f21443OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(((C8331oOoOO0o) this).f21443OooO00o.m19853OooO00o());
            C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
            C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
            float factor = this.OooO00o.getFactor();
            int i = ((C8331oOoOO0o) this).f21443OooO00o.m15077OooOOO() ? ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21304OooO0Oo : ((AbstractC8201oOOo0oO0) ((C8331oOoOO0o) this).f21443OooO00o).f21304OooO0Oo - 1;
            for (int i2 = !((C8331oOoOO0o) this).f21443OooO00o.m15078OooOOO0(); i2 < i; i2++) {
                YAxis yAxis = ((C8331oOoOO0o) this).f21443OooO00o;
                AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (((AbstractC8201oOOo0oO0) yAxis).f21299OooO00o[i2] - ((AbstractC8201oOOo0oO0) yAxis).OooOO0) * factor, this.OooO00o.getRotationAngle(), OooO00o2);
                canvas.drawText(((C8331oOoOO0o) this).f21443OooO00o.OooO00o(i2), OooO00o2.f21456OooO00o + 10.0f, OooO00o2.OooO0O0, ((AbstractC8307oOo0O000) this).OooO0O0);
            }
            C8349oOoOOo00.m20016OooO00o(centerOffsets);
            C8349oOoOOo00.m20016OooO00o(OooO00o2);
        }
    }
}
