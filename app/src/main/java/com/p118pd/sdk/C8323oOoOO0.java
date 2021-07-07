package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarEntry;

/* renamed from: com.pd.sdk.oOoOO0  reason: case insensitive filesystem */
public class C8323oOoOO0 extends AbstractC8324oOoOO00 {
    public C8196oOOo0o OooO00o;
    public Path OooO0O0 = new Path();
    public Path OooO0OO = new Path();
    public Paint OooO0o;
    public Paint OooO0o0;

    public C8323oOoOO0(C8196oOOo0o oooo0o, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
        this.OooO00o = oooo0o;
        Paint paint = new Paint(1);
        super.OooO0O0 = paint;
        paint.setStyle(Paint.Style.STROKE);
        super.OooO0O0.setStrokeWidth(2.0f);
        super.OooO0O0.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.OooO0o0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.OooO0o = new Paint(1);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        C8226oOOoOo0O oooooo0o = (C8226oOOoOo0O) this.OooO00o.getData();
        int OooO0Oo = ((AbstractC8268oOOoooo) oooooo0o.m19904OooO00o()).OooO0Oo();
        for (AbstractC8268oOOoooo ooooooo : oooooo0o.m19905OooO00o()) {
            if (ooooooo.isVisible()) {
                OooO00o(canvas, ooooooo, OooO0Oo);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
        OooO0Oo(canvas);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        float f;
        int i;
        float f2;
        C8349oOoOOo00 oooooo00;
        AbstractC8268oOOoooo ooooooo;
        float f3;
        int i2;
        int i3;
        float f4;
        C8349oOoOOo00 oooooo002;
        C8349oOoOOo00 oooooo003;
        float OooO00o2 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float sliceAngle = this.OooO00o.getSliceAngle();
        float factor = this.OooO00o.getFactor();
        C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
        C8349oOoOOo00 OooO00o3 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        C8349oOoOOo00 OooO00o4 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        float OooO00o5 = AbstractC8352oOoOOoO0.OooO00o(5.0f);
        int i4 = 0;
        while (i4 < ((C8226oOOoOo0O) this.OooO00o.getData()).m19903OooO00o()) {
            AbstractC8268oOOoooo ooooooo2 = (AbstractC8268oOOoooo) ((C8226oOOoOo0O) this.OooO00o.getData()).OooO00o(i4);
            if (!OooO00o((AbstractC8265oOOoooO0) ooooooo2)) {
                i = i4;
                f = OooO00o2;
                f2 = sliceAngle;
                oooooo00 = OooO00o4;
            } else {
                OooO00o((AbstractC8265oOOoooO0) ooooooo2);
                C8349oOoOOo00 OooO00o6 = C8349oOoOOo00.OooO00o(ooooooo2.m19953OooO00o());
                OooO00o6.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.f21456OooO00o);
                OooO00o6.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.OooO0O0);
                int i5 = 0;
                while (i5 < ooooooo2.OooO0Oo()) {
                    RadarEntry radarEntry = (RadarEntry) ooooooo2.m19951OooO00o(i5);
                    float f5 = ((float) i5) * sliceAngle * OooO00o2;
                    AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (radarEntry.OooO00o() - this.OooO00o.getYChartMin()) * factor * OooO0O02, f5 + this.OooO00o.getRotationAngle(), OooO00o3);
                    if (ooooooo2.OooO0OO()) {
                        i2 = i5;
                        f3 = OooO00o2;
                        oooooo003 = OooO00o6;
                        ooooooo = ooooooo2;
                        i3 = i4;
                        f4 = sliceAngle;
                        oooooo002 = OooO00o4;
                        OooO00o(canvas, ooooooo2.m19952OooO00o(), radarEntry.OooO00o(), radarEntry, i4, OooO00o3.f21456OooO00o, OooO00o3.OooO0O0 - OooO00o5, ooooooo2.OooO0Oo(i5));
                    } else {
                        i2 = i5;
                        ooooooo = ooooooo2;
                        i3 = i4;
                        f3 = OooO00o2;
                        f4 = sliceAngle;
                        oooooo003 = OooO00o6;
                        oooooo002 = OooO00o4;
                    }
                    if (radarEntry.m19898OooO00o() != null && ooooooo.OooOo00()) {
                        Drawable OooO00o7 = radarEntry.m19898OooO00o();
                        AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (radarEntry.OooO00o() * factor * OooO0O02) + oooooo003.OooO0O0, f5 + this.OooO00o.getRotationAngle(), oooooo002);
                        float f6 = oooooo002.OooO0O0 + oooooo003.f21456OooO00o;
                        oooooo002.OooO0O0 = f6;
                        AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o7, (int) oooooo002.f21456OooO00o, (int) f6, OooO00o7.getIntrinsicWidth(), OooO00o7.getIntrinsicHeight());
                    }
                    i5 = i2 + 1;
                    OooO00o6 = oooooo003;
                    OooO00o4 = oooooo002;
                    sliceAngle = f4;
                    i4 = i3;
                    OooO00o2 = f3;
                    ooooooo2 = ooooooo;
                }
                i = i4;
                f = OooO00o2;
                f2 = sliceAngle;
                oooooo00 = OooO00o4;
                C8349oOoOOo00.m20016OooO00o(OooO00o6);
            }
            i4 = i + 1;
            OooO00o4 = oooooo00;
            sliceAngle = f2;
            OooO00o2 = f;
        }
        C8349oOoOOo00.m20016OooO00o(centerOffsets);
        C8349oOoOOo00.m20016OooO00o(OooO00o3);
        C8349oOoOOo00.m20016OooO00o(OooO00o4);
    }

    public Paint OooO0Oo() {
        return this.OooO0o0;
    }

    public void OooO0Oo(Canvas canvas) {
        float sliceAngle = this.OooO00o.getSliceAngle();
        float factor = this.OooO00o.getFactor();
        float rotationAngle = this.OooO00o.getRotationAngle();
        C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
        this.OooO0o0.setStrokeWidth(this.OooO00o.getWebLineWidth());
        this.OooO0o0.setColor(this.OooO00o.getWebColor());
        this.OooO0o0.setAlpha(this.OooO00o.getWebAlpha());
        int skipWebLineCount = this.OooO00o.getSkipWebLineCount() + 1;
        int OooO0Oo = ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) this.OooO00o.getData()).m19904OooO00o()).OooO0Oo();
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        for (int i = 0; i < OooO0Oo; i += skipWebLineCount) {
            AbstractC8352oOoOOoO0.OooO00o(centerOffsets, this.OooO00o.getYRange() * factor, (((float) i) * sliceAngle) + rotationAngle, OooO00o2);
            canvas.drawLine(centerOffsets.f21456OooO00o, centerOffsets.OooO0O0, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0, this.OooO0o0);
        }
        C8349oOoOOo00.m20016OooO00o(OooO00o2);
        this.OooO0o0.setStrokeWidth(this.OooO00o.getWebLineWidthInner());
        this.OooO0o0.setColor(this.OooO00o.getWebColorInner());
        this.OooO0o0.setAlpha(this.OooO00o.getWebAlpha());
        int i2 = ((AbstractC8201oOOo0oO0) this.OooO00o.getYAxis()).f21304OooO0Oo;
        C8349oOoOOo00 OooO00o3 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        C8349oOoOOo00 OooO00o4 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((C8226oOOoOo0O) this.OooO00o.getData()).m19916OooO0O0()) {
                float yChartMin = (((AbstractC8201oOOo0oO0) this.OooO00o.getYAxis()).f21299OooO00o[i3] - this.OooO00o.getYChartMin()) * factor;
                AbstractC8352oOoOOoO0.OooO00o(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, OooO00o3);
                i4++;
                AbstractC8352oOoOOoO0.OooO00o(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, OooO00o4);
                canvas.drawLine(OooO00o3.f21456OooO00o, OooO00o3.OooO0O0, OooO00o4.f21456OooO00o, OooO00o4.OooO0O0, this.OooO0o0);
            }
        }
        C8349oOoOOo00.m20016OooO00o(OooO00o3);
        C8349oOoOOo00.m20016OooO00o(OooO00o4);
    }

    public void OooO00o(Canvas canvas, AbstractC8268oOOoooo ooooooo, int i) {
        float OooO00o2 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float sliceAngle = this.OooO00o.getSliceAngle();
        float factor = this.OooO00o.getFactor();
        C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
        C8349oOoOOo00 OooO00o3 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        Path path = this.OooO0O0;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < ooooooo.OooO0Oo(); i2++) {
            ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(ooooooo.OooO00o(i2));
            AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (((RadarEntry) ooooooo.m19951OooO00o(i2)).OooO00o() - this.OooO00o.getYChartMin()) * factor * OooO0O02, (((float) i2) * sliceAngle * OooO00o2) + this.OooO00o.getRotationAngle(), OooO00o3);
            if (!Float.isNaN(OooO00o3.f21456OooO00o)) {
                if (!z) {
                    path.moveTo(OooO00o3.f21456OooO00o, OooO00o3.OooO0O0);
                    z = true;
                } else {
                    path.lineTo(OooO00o3.f21456OooO00o, OooO00o3.OooO0O0);
                }
            }
        }
        if (ooooooo.OooO0Oo() > i) {
            path.lineTo(centerOffsets.f21456OooO00o, centerOffsets.OooO0O0);
        }
        path.close();
        if (ooooooo.OooO0o()) {
            Drawable OooO00o4 = ooooooo.OooO00o();
            if (OooO00o4 != null) {
                OooO00o(canvas, path, OooO00o4);
            } else {
                OooO00o(canvas, path, ooooooo.OooOO0O(), ooooooo.OooOO0());
            }
        }
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStrokeWidth(ooooooo.OooO0oO());
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.STROKE);
        if (!ooooooo.OooO0o() || ooooooo.OooOO0() < 255) {
            canvas.drawPath(path, ((AbstractC8321oOoO0ooO) this).OooO00o);
        }
        C8349oOoOOo00.m20016OooO00o(centerOffsets);
        C8349oOoOOo00.m20016OooO00o(OooO00o3);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        int i;
        float sliceAngle = this.OooO00o.getSliceAngle();
        float factor = this.OooO00o.getFactor();
        C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        C8226oOOoOo0O oooooo0o = (C8226oOOoOo0O) this.OooO00o.getData();
        int length = ooooo0ooArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            C8246oOOoo0oO ooooo0oo = ooooo0ooArr[i3];
            AbstractC8268oOOoooo ooooooo = (AbstractC8268oOOoooo) oooooo0o.OooO00o(ooooo0oo.m19936OooO0O0());
            if (ooooooo != null && ooooooo.OooO0O0()) {
                Entry entry = (RadarEntry) ooooooo.m19951OooO00o((int) ooooo0oo.OooO0OO());
                if (OooO00o(entry, ooooooo)) {
                    AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (entry.OooO00o() - this.OooO00o.getYChartMin()) * factor * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0(), (ooooo0oo.OooO0OO() * sliceAngle * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) + this.OooO00o.getRotationAngle(), OooO00o2);
                    ooooo0oo.OooO00o(OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
                    OooO00o(canvas, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0, ooooooo);
                    if (ooooooo.m19968OooO() && !Float.isNaN(OooO00o2.f21456OooO00o) && !Float.isNaN(OooO00o2.OooO0O0)) {
                        int OooOo0 = ooooooo.OooOo0();
                        if (OooOo0 == 1122867) {
                            OooOo0 = ooooooo.OooO00o(i2);
                        }
                        if (ooooooo.OooOo00() < 255) {
                            OooOo0 = C8342oOoOOOOO.OooO00o(OooOo0, ooooooo.OooOo00());
                        }
                        i = i3;
                        OooO00o(canvas, OooO00o2, ooooooo.OooOOOo(), ooooooo.OooOO0(), ooooooo.OooO(), OooOo0, ooooooo.OooO0OO());
                        i3 = i + 1;
                        i2 = 0;
                    }
                }
            }
            i = i3;
            i3 = i + 1;
            i2 = 0;
        }
        C8349oOoOOo00.m20016OooO00o(centerOffsets);
        C8349oOoOOo00.m20016OooO00o(OooO00o2);
    }

    public void OooO00o(Canvas canvas, C8349oOoOOo00 oooooo00, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(f2);
        float OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(f);
        if (i != 1122867) {
            Path path = this.OooO0OO;
            path.reset();
            path.addCircle(oooooo00.f21456OooO00o, oooooo00.OooO0O0, OooO00o2, Path.Direction.CW);
            if (OooO00o3 > 0.0f) {
                path.addCircle(oooooo00.f21456OooO00o, oooooo00.OooO0O0, OooO00o3, Path.Direction.CCW);
            }
            this.OooO0o.setColor(i);
            this.OooO0o.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.OooO0o);
        }
        if (i2 != 1122867) {
            this.OooO0o.setColor(i2);
            this.OooO0o.setStyle(Paint.Style.STROKE);
            this.OooO0o.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(f3));
            canvas.drawCircle(oooooo00.f21456OooO00o, oooooo00.OooO0O0, OooO00o2, this.OooO0o);
        }
        canvas.restore();
    }
}
