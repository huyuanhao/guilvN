package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOO00o  reason: case insensitive filesystem */
public class C8327oOoOO00o extends AbstractC8321oOoO0ooO {
    public Canvas OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Path f21427OooO00o = new Path();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21428OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public StaticLayout f21429OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextPaint f21430OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8198oOOo0o0O f21431OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f21432OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<Bitmap> f21433OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF[] f21434OooO00o = {new RectF(), new RectF(), new RectF()};
    public Path OooO0O0 = new Path();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public RectF f21435OooO0O0 = new RectF();
    public Path OooO0OO = new Path();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public RectF f21436OooO0OO = new RectF();
    public Paint OooO0o;
    public Paint OooO0o0;
    public Paint OooO0oO;
    public Paint OooO0oo;

    public C8327oOoOO00o(C8198oOOo0o0O oooo0o0o, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
        this.f21431OooO00o = oooo0o0o;
        Paint paint = new Paint(1);
        this.OooO0o0 = paint;
        paint.setColor(-1);
        this.OooO0o0.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.OooO0o = paint2;
        paint2.setColor(-1);
        this.OooO0o.setStyle(Paint.Style.FILL);
        this.OooO0o.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f21430OooO00o = textPaint;
        textPaint.setColor(-16777216);
        this.f21430OooO00o.setTextSize(AbstractC8352oOoOOoO0.OooO00o(12.0f));
        this.OooO0Oo.setTextSize(AbstractC8352oOoOOoO0.OooO00o(13.0f));
        this.OooO0Oo.setColor(-1);
        this.OooO0Oo.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.OooO0oo = paint3;
        paint3.setColor(-1);
        this.OooO0oo.setTextAlign(Paint.Align.CENTER);
        this.OooO0oo.setTextSize(AbstractC8352oOoOOoO0.OooO00o(13.0f));
        Paint paint4 = new Paint(1);
        this.OooO0oO = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public TextPaint OooO00o() {
        return this.f21430OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20007OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
        OooO0o0(canvas);
        canvas.drawBitmap(this.f21433OooO00o.get(), 0.0f, 0.0f, (Paint) null);
        OooO0Oo(canvas);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        List list;
        float[] fArr;
        float f;
        int i;
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        PieDataSet.ValuePosition valuePosition;
        PieDataSet.ValuePosition valuePosition2;
        int i2;
        List list2;
        float f5;
        float[] fArr3;
        float f6;
        int i3;
        AbstractC8269oOOoooo0 ooooooo0;
        C8349oOoOOo00 oooooo00;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        AbstractC8269oOOoooo0 ooooooo02;
        C8349oOoOOo00 centerCircleBox = this.f21431OooO00o.getCenterCircleBox();
        float radius = this.f21431OooO00o.getRadius();
        float rotationAngle = this.f21431OooO00o.getRotationAngle();
        float[] drawAngles = this.f21431OooO00o.getDrawAngles();
        float[] absoluteAngles = this.f21431OooO00o.getAbsoluteAngles();
        float OooO00o2 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float holeRadius = this.f21431OooO00o.getHoleRadius() / 100.0f;
        float f12 = (radius / 10.0f) * 3.6f;
        if (this.f21431OooO00o.OooOOO()) {
            f12 = (radius - (radius * holeRadius)) / 2.0f;
        }
        float f13 = radius - f12;
        C8225oOOoOo00 oooooo002 = (C8225oOOoOo00) this.f21431OooO00o.getData();
        List OooO00o3 = oooooo002.m19905OooO00o();
        float OooO0o02 = oooooo002.OooO0o0();
        boolean OooOOO0 = this.f21431OooO00o.OooOOO0();
        canvas.save();
        float OooO00o4 = AbstractC8352oOoOOoO0.OooO00o(5.0f);
        int i4 = 0;
        int i5 = 0;
        while (i5 < OooO00o3.size()) {
            AbstractC8269oOOoooo0 ooooooo03 = (AbstractC8269oOOoooo0) OooO00o3.get(i5);
            boolean OooO0OO2 = ooooooo03.OooO0OO();
            if (OooO0OO2 || OooOOO0) {
                PieDataSet.ValuePosition OooO00o5 = ooooooo03.m19969OooO00o();
                PieDataSet.ValuePosition OooO0O03 = ooooooo03.OooO0O0();
                OooO00o((AbstractC8265oOOoooO0) ooooooo03);
                float OooO00o6 = ((float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, "Q")) + AbstractC8352oOoOOoO0.OooO00o(4.0f);
                AbstractC8239oOOoo00O OooO00o7 = ooooooo03.m19952OooO00o();
                int OooO0Oo = ooooooo03.OooO0Oo();
                this.OooO0oO.setColor(ooooooo03.OooO0o0());
                this.OooO0oO.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(ooooooo03.OooOo0()));
                float OooO00o8 = OooO00o(ooooooo03);
                C8349oOoOOo00 OooO00o9 = C8349oOoOOo00.OooO00o(ooooooo03.m19953OooO00o());
                OooO00o9.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o9.f21456OooO00o);
                OooO00o9.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o9.OooO0O0);
                int i6 = i4;
                int i7 = 0;
                while (i7 < OooO0Oo) {
                    PieEntry pieEntry = (PieEntry) ooooooo03.m19951OooO00o(i7);
                    if (i6 == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = absoluteAngles[i6 - 1] * OooO00o2;
                    }
                    float f14 = ((f3 + ((drawAngles[i6] - ((OooO00o8 / (f13 * 0.017453292f)) / 2.0f)) / 2.0f)) * OooO0O02) + rotationAngle;
                    if (this.f21431OooO00o.OooOOo0()) {
                        f4 = (pieEntry.OooO00o() / OooO0o02) * 100.0f;
                    } else {
                        f4 = pieEntry.OooO00o();
                    }
                    double d = (double) (f14 * 0.017453292f);
                    float cos = (float) Math.cos(d);
                    float sin = (float) Math.sin(d);
                    boolean z = OooOOO0 && OooO00o5 == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z2 = OooO0OO2 && OooO0O03 == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z3 = OooOOO0 && OooO00o5 == PieDataSet.ValuePosition.INSIDE_SLICE;
                    boolean z4 = OooO0OO2 && OooO0O03 == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float OooOo0o = ooooooo03.OooOo0o();
                        float OooOo00 = ooooooo03.OooOo00();
                        float OooOoO0 = ooooooo03.OooOoO0() / 100.0f;
                        valuePosition2 = OooO0O03;
                        if (this.f21431OooO00o.OooOOO()) {
                            float f15 = radius * holeRadius;
                            f8 = ((radius - f15) * OooOoO0) + f15;
                        } else {
                            f8 = radius * OooOoO0;
                        }
                        float abs = ooooooo03.OooOO0() ? OooOo00 * f13 * ((float) Math.abs(Math.sin(d))) : OooOo00 * f13;
                        float f16 = centerCircleBox.f21456OooO00o;
                        float f17 = (f8 * cos) + f16;
                        float f18 = centerCircleBox.OooO0O0;
                        float f19 = (f8 * sin) + f18;
                        float f20 = (OooOo0o + 1.0f) * f13;
                        float f21 = (f20 * cos) + f16;
                        float f22 = (f20 * sin) + f18;
                        double d2 = (double) f14;
                        Double.isNaN(d2);
                        double d3 = d2 % 360.0d;
                        if (d3 < 90.0d || d3 > 270.0d) {
                            f9 = f21 + abs;
                            this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
                            if (z) {
                                this.OooO0oo.setTextAlign(Paint.Align.LEFT);
                            }
                            f10 = f9 + OooO00o4;
                        } else {
                            float f23 = f21 - abs;
                            this.OooO0Oo.setTextAlign(Paint.Align.RIGHT);
                            if (z) {
                                this.OooO0oo.setTextAlign(Paint.Align.RIGHT);
                            }
                            f9 = f23;
                            f10 = f23 - OooO00o4;
                        }
                        if (ooooooo03.OooO0o0() != 1122867) {
                            f6 = radius;
                            oooooo00 = OooO00o9;
                            fArr3 = absoluteAngles;
                            i3 = i7;
                            i2 = OooO0Oo;
                            f11 = f10;
                            valuePosition = OooO00o5;
                            canvas.drawLine(f17, f19, f21, f22, this.OooO0oO);
                            canvas.drawLine(f21, f22, f9, f22, this.OooO0oO);
                        } else {
                            f11 = f10;
                            valuePosition = OooO00o5;
                            i2 = OooO0Oo;
                            f6 = radius;
                            oooooo00 = OooO00o9;
                            fArr3 = absoluteAngles;
                            i3 = i7;
                        }
                        if (!z || !z2) {
                            ooooooo02 = ooooooo03;
                            list2 = OooO00o3;
                            f5 = cos;
                            if (z) {
                                if (i3 < oooooo002.m19916OooO0O0() && pieEntry.m15103OooO00o() != null) {
                                    OooO00o(canvas, pieEntry.m15103OooO00o(), f11, f22 + (OooO00o6 / 2.0f));
                                }
                            } else if (z2) {
                                ooooooo0 = ooooooo02;
                                OooO00o(canvas, OooO00o7, f4, pieEntry, 0, f11, f22 + (OooO00o6 / 2.0f), ooooooo0.OooO0Oo(i3));
                            }
                        } else {
                            ooooooo02 = ooooooo03;
                            list2 = OooO00o3;
                            f5 = cos;
                            OooO00o(canvas, OooO00o7, f4, pieEntry, 0, f11, f22, ooooooo03.OooO0Oo(i3));
                            if (i3 < oooooo002.m19916OooO0O0() && pieEntry.m15103OooO00o() != null) {
                                OooO00o(canvas, pieEntry.m15103OooO00o(), f11, f22 + OooO00o6);
                            }
                        }
                        ooooooo0 = ooooooo02;
                    } else {
                        valuePosition2 = OooO0O03;
                        valuePosition = OooO00o5;
                        ooooooo0 = ooooooo03;
                        i2 = OooO0Oo;
                        list2 = OooO00o3;
                        f5 = cos;
                        f6 = radius;
                        oooooo00 = OooO00o9;
                        fArr3 = absoluteAngles;
                        i3 = i7;
                    }
                    if (z3 || z4) {
                        float f24 = (f13 * f5) + centerCircleBox.f21456OooO00o;
                        float f25 = (f13 * sin) + centerCircleBox.OooO0O0;
                        this.OooO0Oo.setTextAlign(Paint.Align.CENTER);
                        if (!z3 || !z4) {
                            f7 = sin;
                            if (z3) {
                                if (i3 < oooooo002.m19916OooO0O0() && pieEntry.m15103OooO00o() != null) {
                                    OooO00o(canvas, pieEntry.m15103OooO00o(), f24, f25 + (OooO00o6 / 2.0f));
                                }
                            } else if (z4) {
                                OooO00o(canvas, OooO00o7, f4, pieEntry, 0, f24, f25 + (OooO00o6 / 2.0f), ooooooo0.OooO0Oo(i3));
                            }
                        } else {
                            f7 = sin;
                            OooO00o(canvas, OooO00o7, f4, pieEntry, 0, f24, f25, ooooooo0.OooO0Oo(i3));
                            if (i3 < oooooo002.m19916OooO0O0() && pieEntry.m15103OooO00o() != null) {
                                OooO00o(canvas, pieEntry.m15103OooO00o(), f24, f25 + OooO00o6);
                            }
                        }
                    } else {
                        f7 = sin;
                    }
                    if (pieEntry.m19898OooO00o() != null && ooooooo0.OooOo00()) {
                        Drawable OooO00o10 = pieEntry.m19898OooO00o();
                        float f26 = oooooo00.OooO0O0;
                        AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o10, (int) (((f13 + f26) * f5) + centerCircleBox.f21456OooO00o), (int) (((f13 + f26) * f7) + centerCircleBox.OooO0O0 + oooooo00.f21456OooO00o), OooO00o10.getIntrinsicWidth(), OooO00o10.getIntrinsicHeight());
                    }
                    i6++;
                    i7 = i3 + 1;
                    OooO00o9 = oooooo00;
                    ooooooo03 = ooooooo0;
                    radius = f6;
                    absoluteAngles = fArr3;
                    i5 = i5;
                    rotationAngle = rotationAngle;
                    drawAngles = drawAngles;
                    OooO00o3 = list2;
                    OooO0Oo = i2;
                    OooO0O03 = valuePosition2;
                    OooO00o5 = valuePosition;
                }
                i = i5;
                list = OooO00o3;
                f2 = radius;
                f = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                C8349oOoOOo00.m20016OooO00o(OooO00o9);
                i4 = i6;
            } else {
                i = i5;
                list = OooO00o3;
                f2 = radius;
                f = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
            }
            i5 = i + 1;
            radius = f2;
            absoluteAngles = fArr2;
            rotationAngle = f;
            drawAngles = fArr;
            OooO00o3 = list;
        }
        C8349oOoOOo00.m20016OooO00o(centerCircleBox);
        canvas.restore();
    }

    public Paint OooO0Oo() {
        return this.OooO0oo;
    }

    public Paint OooO0o() {
        return this.OooO0o;
    }

    public Paint OooO0o0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        int OooO0oo2 = (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0oo();
        int OooO0oO2 = (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0oO();
        WeakReference<Bitmap> weakReference = this.f21433OooO00o;
        if (!(weakReference != null && weakReference.get().getWidth() == OooO0oo2 && this.f21433OooO00o.get().getHeight() == OooO0oO2)) {
            if (OooO0oo2 > 0 && OooO0oO2 > 0) {
                this.f21433OooO00o = new WeakReference<>(Bitmap.createBitmap(OooO0oo2, OooO0oO2, Bitmap.Config.ARGB_4444));
                this.OooO00o = new Canvas(this.f21433OooO00o.get());
            } else {
                return;
            }
        }
        this.f21433OooO00o.get().eraseColor(0);
        for (AbstractC8269oOOoooo0 ooooooo0 : ((C8225oOOoOo00) this.f21431OooO00o.getData()).m19905OooO00o()) {
            if (ooooooo0.isVisible() && ooooooo0.OooO0Oo() > 0) {
                OooO00o(canvas, ooooooo0);
            }
        }
    }

    public void OooO0Oo(Canvas canvas) {
        float f;
        C8349oOoOOo00 oooooo00;
        CharSequence centerText = this.f21431OooO00o.getCenterText();
        if (this.f21431OooO00o.OooOO0o() && centerText != null) {
            C8349oOoOOo00 centerCircleBox = this.f21431OooO00o.getCenterCircleBox();
            C8349oOoOOo00 centerTextOffset = this.f21431OooO00o.getCenterTextOffset();
            float f2 = centerCircleBox.f21456OooO00o + centerTextOffset.f21456OooO00o;
            float f3 = centerCircleBox.OooO0O0 + centerTextOffset.OooO0O0;
            if (!this.f21431OooO00o.OooOOO() || this.f21431OooO00o.OooOOOo()) {
                f = this.f21431OooO00o.getRadius();
            } else {
                f = this.f21431OooO00o.getRadius() * (this.f21431OooO00o.getHoleRadius() / 100.0f);
            }
            RectF[] rectFArr = this.f21434OooO00o;
            RectF rectF = rectFArr[0];
            rectF.left = f2 - f;
            rectF.top = f3 - f;
            rectF.right = f2 + f;
            rectF.bottom = f3 + f;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float centerTextRadiusPercent = this.f21431OooO00o.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > AbstractC8352oOoOOoO0.OooO0O0) {
                rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.f21432OooO00o) || !rectF2.equals(this.f21428OooO00o)) {
                this.f21428OooO00o.set(rectF2);
                this.f21432OooO00o = centerText;
                oooooo00 = centerTextOffset;
                this.f21429OooO00o = new StaticLayout(centerText, 0, centerText.length(), this.f21430OooO00o, (int) Math.max(Math.ceil((double) this.f21428OooO00o.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                oooooo00 = centerTextOffset;
            }
            float height = (float) this.f21429OooO00o.getHeight();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 18) {
                Path path = this.OooO0OO;
                path.reset();
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
            this.f21429OooO00o.draw(canvas);
            canvas.restore();
            C8349oOoOOo00.m20016OooO00o(centerCircleBox);
            C8349oOoOOo00.m20016OooO00o(oooooo00);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.pd.sdk.oOOoooo0, com.pd.sdk.oOOoooO0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0o(android.graphics.Canvas r20) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8327oOoOO00o.OooO0o(android.graphics.Canvas):void");
    }

    public void OooO0o0(Canvas canvas) {
        if (this.f21431OooO00o.OooOOO() && this.OooO00o != null) {
            float radius = this.f21431OooO00o.getRadius();
            float holeRadius = (this.f21431OooO00o.getHoleRadius() / 100.0f) * radius;
            C8349oOoOOo00 centerCircleBox = this.f21431OooO00o.getCenterCircleBox();
            if (Color.alpha(this.OooO0o0.getColor()) > 0) {
                this.OooO00o.drawCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, holeRadius, this.OooO0o0);
            }
            if (Color.alpha(this.OooO0o.getColor()) > 0 && this.f21431OooO00o.getTransparentCircleRadius() > this.f21431OooO00o.getHoleRadius()) {
                int alpha = this.OooO0o.getAlpha();
                float transparentCircleRadius = radius * (this.f21431OooO00o.getTransparentCircleRadius() / 100.0f);
                this.OooO0o.setAlpha((int) (((float) alpha) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o() * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0()));
                this.OooO0O0.reset();
                this.OooO0O0.addCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, transparentCircleRadius, Path.Direction.CW);
                this.OooO0O0.addCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, holeRadius, Path.Direction.CCW);
                this.OooO00o.drawPath(this.OooO0O0, this.OooO0o);
                this.OooO0o.setAlpha(alpha);
            }
            C8349oOoOOo00.m20016OooO00o(centerCircleBox);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0() {
        Canvas canvas = this.OooO00o;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.OooO00o = null;
        }
        WeakReference<Bitmap> weakReference = this.f21433OooO00o;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.f21433OooO00o.clear();
            this.f21433OooO00o = null;
        }
    }

    public float OooO00o(C8349oOoOOo00 oooooo00, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = oooooo00.f21456OooO00o + (((float) Math.cos(d)) * f);
        float sin = oooooo00.OooO0O0 + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        float cos2 = oooooo00.f21456OooO00o + (((float) Math.cos(d2)) * f);
        float sin2 = oooooo00.OooO0O0 + (((float) Math.sin(d2)) * f);
        double d3 = (double) f2;
        Double.isNaN(d3);
        double sqrt = (double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - d3) / 2.0d) * 0.017453292519943295d))));
        double sqrt2 = Math.sqrt(Math.pow((double) (cos2 - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) (sin2 - ((sin + f4) / 2.0f)), 2.0d));
        Double.isNaN(sqrt);
        return (float) (sqrt - sqrt2);
    }

    public float OooO00o(AbstractC8269oOOoooo0 ooooooo0) {
        if (!ooooooo0.OooOOoo()) {
            return ooooooo0.OooO00o();
        }
        if (ooooooo0.OooO00o() / ((AbstractC8328oOoOO0O) this).OooO00o.OooOOOO() > (ooooooo0.OooO0o0() / ((C8225oOOoOo00) this.f21431OooO00o.getData()).OooO0o0()) * 2.0f) {
            return 0.0f;
        }
        return ooooooo0.OooO00o();
    }

    public void OooO00o(Canvas canvas, AbstractC8269oOOoooo0 ooooooo0) {
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr;
        int i;
        int i2;
        RectF rectF;
        float f5;
        int i3;
        C8349oOoOOo00 oooooo00;
        float f6;
        float f7;
        float f8;
        C8349oOoOOo00 oooooo002;
        int i4;
        C8327oOoOO00o ooooo00o = this;
        AbstractC8269oOOoooo0 ooooooo02 = ooooooo0;
        float rotationAngle = ooooo00o.f21431OooO00o.getRotationAngle();
        float OooO00o2 = ((AbstractC8321oOoO0ooO) ooooo00o).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) ooooo00o).f21418OooO00o.OooO0O0();
        RectF circleBox = ooooo00o.f21431OooO00o.getCircleBox();
        int OooO0Oo = ooooooo0.OooO0Oo();
        float[] drawAngles = ooooo00o.f21431OooO00o.getDrawAngles();
        C8349oOoOOo00 centerCircleBox = ooooo00o.f21431OooO00o.getCenterCircleBox();
        float radius = ooooo00o.f21431OooO00o.getRadius();
        boolean z = ooooo00o.f21431OooO00o.OooOOO() && !ooooo00o.f21431OooO00o.OooOOOo();
        float holeRadius = z ? (ooooo00o.f21431OooO00o.getHoleRadius() / 100.0f) * radius : 0.0f;
        int i5 = 0;
        for (int i6 = 0; i6 < OooO0Oo; i6++) {
            if (Math.abs(((PieEntry) ooooooo02.m19951OooO00o(i6)).OooO00o()) > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                i5++;
            }
        }
        if (i5 <= 1) {
            f = 0.0f;
        } else {
            f = ooooo00o.OooO00o(ooooooo02);
        }
        int i7 = 0;
        float f9 = 0.0f;
        while (i7 < OooO0Oo) {
            float f10 = drawAngles[i7];
            if (Math.abs(ooooooo02.m19951OooO00o(i7).OooO00o()) <= AbstractC8352oOoOOoO0.f21471OooO0O0 || ooooo00o.f21431OooO00o.m19852OooO00o(i7)) {
                i2 = i7;
                f3 = radius;
                f2 = rotationAngle;
                f4 = OooO00o2;
                rectF = circleBox;
                i = OooO0Oo;
                fArr = drawAngles;
                i3 = i5;
                f5 = holeRadius;
                oooooo00 = centerCircleBox;
            } else {
                boolean z2 = f > 0.0f && f10 <= 180.0f;
                ((AbstractC8321oOoO0ooO) ooooo00o).OooO00o.setColor(ooooooo02.OooO00o(i7));
                float f11 = i5 == 1 ? 0.0f : f / (radius * 0.017453292f);
                float f12 = rotationAngle + ((f9 + (f11 / 2.0f)) * OooO0O02);
                float f13 = (f10 - f11) * OooO0O02;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                ooooo00o.f21427OooO00o.reset();
                double d = (double) (f12 * 0.017453292f);
                i = OooO0Oo;
                fArr = drawAngles;
                float cos = centerCircleBox.f21456OooO00o + (((float) Math.cos(d)) * radius);
                float sin = centerCircleBox.OooO0O0 + (((float) Math.sin(d)) * radius);
                if (f13 < 360.0f || f13 % 360.0f > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                    f4 = OooO00o2;
                    ooooo00o.f21427OooO00o.moveTo(cos, sin);
                    ooooo00o.f21427OooO00o.arcTo(circleBox, f12, f13);
                } else {
                    f4 = OooO00o2;
                    ooooo00o.f21427OooO00o.addCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, radius, Path.Direction.CW);
                }
                RectF rectF2 = ooooo00o.f21435OooO0O0;
                float f14 = centerCircleBox.f21456OooO00o;
                float f15 = centerCircleBox.OooO0O0;
                rectF2.set(f14 - holeRadius, f15 - holeRadius, f14 + holeRadius, f15 + holeRadius);
                if (!z) {
                    f5 = holeRadius;
                    f2 = rotationAngle;
                    f6 = f13;
                    f3 = radius;
                    oooooo00 = centerCircleBox;
                    rectF = circleBox;
                    i3 = i5;
                    i2 = i7;
                    f7 = 360.0f;
                } else if (holeRadius > 0.0f || z2) {
                    if (z2) {
                        f8 = f13;
                        rectF = circleBox;
                        i3 = i5;
                        i2 = i7;
                        f5 = holeRadius;
                        i4 = 1;
                        f3 = radius;
                        oooooo002 = centerCircleBox;
                        float OooO00o3 = OooO00o(centerCircleBox, radius, f10 * OooO0O02, cos, sin, f12, f8);
                        if (OooO00o3 < 0.0f) {
                            OooO00o3 = -OooO00o3;
                        }
                        holeRadius = Math.max(f5, OooO00o3);
                    } else {
                        f5 = holeRadius;
                        oooooo002 = centerCircleBox;
                        f8 = f13;
                        i4 = 1;
                        f3 = radius;
                        rectF = circleBox;
                        i3 = i5;
                        i2 = i7;
                    }
                    float f16 = (i3 == i4 || holeRadius == 0.0f) ? 0.0f : f / (holeRadius * 0.017453292f);
                    float f17 = ((f9 + (f16 / 2.0f)) * OooO0O02) + rotationAngle;
                    float f18 = (f10 - f16) * OooO0O02;
                    if (f18 < 0.0f) {
                        f18 = 0.0f;
                    }
                    float f19 = f17 + f18;
                    if (f8 < 360.0f || f8 % 360.0f > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                        ooooo00o = this;
                        double d2 = (double) (f19 * 0.017453292f);
                        f2 = rotationAngle;
                        ooooo00o.f21427OooO00o.lineTo(oooooo002.f21456OooO00o + (((float) Math.cos(d2)) * holeRadius), oooooo002.OooO0O0 + (holeRadius * ((float) Math.sin(d2))));
                        ooooo00o.f21427OooO00o.arcTo(ooooo00o.f21435OooO0O0, f19, -f18);
                    } else {
                        ooooo00o = this;
                        ooooo00o.f21427OooO00o.addCircle(oooooo002.f21456OooO00o, oooooo002.OooO0O0, holeRadius, Path.Direction.CCW);
                        f2 = rotationAngle;
                    }
                    oooooo00 = oooooo002;
                    ooooo00o.f21427OooO00o.close();
                    ooooo00o.OooO00o.drawPath(ooooo00o.f21427OooO00o, ((AbstractC8321oOoO0ooO) ooooo00o).OooO00o);
                } else {
                    f5 = holeRadius;
                    f2 = rotationAngle;
                    f6 = f13;
                    f7 = 360.0f;
                    f3 = radius;
                    oooooo00 = centerCircleBox;
                    rectF = circleBox;
                    i3 = i5;
                    i2 = i7;
                }
                if (f6 % f7 > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                    if (z2) {
                        float OooO00o4 = OooO00o(oooooo00, f3, f10 * OooO0O02, cos, sin, f12, f6);
                        double d3 = (double) ((f12 + (f6 / 2.0f)) * 0.017453292f);
                        ooooo00o.f21427OooO00o.lineTo(oooooo00.f21456OooO00o + (((float) Math.cos(d3)) * OooO00o4), oooooo00.OooO0O0 + (OooO00o4 * ((float) Math.sin(d3))));
                    } else {
                        ooooo00o.f21427OooO00o.lineTo(oooooo00.f21456OooO00o, oooooo00.OooO0O0);
                    }
                }
                ooooo00o.f21427OooO00o.close();
                ooooo00o.OooO00o.drawPath(ooooo00o.f21427OooO00o, ((AbstractC8321oOoO0ooO) ooooo00o).OooO00o);
            }
            f9 += f10 * f4;
            i7 = i2 + 1;
            ooooooo02 = ooooooo0;
            centerCircleBox = oooooo00;
            i5 = i3;
            holeRadius = f5;
            circleBox = rectF;
            OooO0Oo = i;
            drawAngles = fArr;
            OooO00o2 = f4;
            radius = f3;
            rotationAngle = f2;
        }
        C8349oOoOOo00.m20016OooO00o(centerCircleBox);
    }

    public void OooO00o(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.OooO0oo);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        RectF rectF;
        float[] fArr;
        float[] fArr2;
        float f;
        int i;
        float f2;
        AbstractC8269oOOoooo0 OooO00o2;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        int i4;
        float f8;
        float f9;
        C8246oOOoo0oO[] ooooo0ooArr2 = ooooo0ooArr;
        float OooO00o3 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float rotationAngle = this.f21431OooO00o.getRotationAngle();
        float[] drawAngles = this.f21431OooO00o.getDrawAngles();
        float[] absoluteAngles = this.f21431OooO00o.getAbsoluteAngles();
        C8349oOoOOo00 centerCircleBox = this.f21431OooO00o.getCenterCircleBox();
        float radius = this.f21431OooO00o.getRadius();
        boolean z = this.f21431OooO00o.OooOOO() && !this.f21431OooO00o.OooOOOo();
        float holeRadius = z ? (this.f21431OooO00o.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF2 = this.f21436OooO0OO;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i5 = 0;
        while (i5 < ooooo0ooArr2.length) {
            int OooO0OO2 = (int) ooooo0ooArr2[i5].OooO0OO();
            if (OooO0OO2 < drawAngles.length && (OooO00o2 = ((C8225oOOoOo00) this.f21431OooO00o.getData()).OooO00o(ooooo0ooArr2[i5].m19936OooO0O0())) != null && OooO00o2.OooO0O0()) {
                int OooO0Oo = OooO00o2.OooO0Oo();
                int i6 = 0;
                for (int i7 = 0; i7 < OooO0Oo; i7++) {
                    if (Math.abs(((PieEntry) OooO00o2.m19951OooO00o(i7)).OooO00o()) > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                        i6++;
                    }
                }
                if (OooO0OO2 == 0) {
                    i2 = 1;
                    f3 = 0.0f;
                } else {
                    f3 = absoluteAngles[OooO0OO2 - 1] * OooO00o3;
                    i2 = 1;
                }
                if (i6 <= i2) {
                    f4 = 0.0f;
                } else {
                    f4 = OooO00o2.OooO00o();
                }
                float f10 = drawAngles[OooO0OO2];
                float OooOoOO = OooO00o2.OooOoOO();
                float f11 = radius + OooOoOO;
                rectF2.set(this.f21431OooO00o.getCircleBox());
                float f12 = -OooOoOO;
                rectF2.inset(f12, f12);
                boolean z2 = f4 > 0.0f && f10 <= 180.0f;
                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(OooO00o2.OooO00o(OooO0OO2));
                float f13 = i6 == 1 ? 0.0f : f4 / (radius * 0.017453292f);
                float f14 = i6 == 1 ? 0.0f : f4 / (f11 * 0.017453292f);
                float f15 = rotationAngle + ((f3 + (f13 / 2.0f)) * OooO0O02);
                float f16 = (f10 - f13) * OooO0O02;
                float f17 = f16 < 0.0f ? 0.0f : f16;
                float f18 = ((f3 + (f14 / 2.0f)) * OooO0O02) + rotationAngle;
                float f19 = (f10 - f14) * OooO0O02;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                this.f21427OooO00o.reset();
                if (f17 < 360.0f || f17 % 360.0f > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                    f5 = holeRadius;
                    f = OooO00o3;
                    double d = (double) (f18 * 0.017453292f);
                    fArr2 = drawAngles;
                    fArr = absoluteAngles;
                    this.f21427OooO00o.moveTo(centerCircleBox.f21456OooO00o + (((float) Math.cos(d)) * f11), centerCircleBox.OooO0O0 + (f11 * ((float) Math.sin(d))));
                    this.f21427OooO00o.arcTo(rectF2, f18, f19);
                } else {
                    this.f21427OooO00o.addCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, f11, Path.Direction.CW);
                    f5 = holeRadius;
                    f = OooO00o3;
                    fArr2 = drawAngles;
                    fArr = absoluteAngles;
                }
                if (z2) {
                    double d2 = (double) (f15 * 0.017453292f);
                    i = i5;
                    f7 = f5;
                    f6 = 0.0f;
                    i4 = i6;
                    rectF = rectF2;
                    i3 = 1;
                    f8 = OooO00o(centerCircleBox, radius, f10 * OooO0O02, (((float) Math.cos(d2)) * radius) + centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0 + (((float) Math.sin(d2)) * radius), f15, f17);
                } else {
                    f7 = f5;
                    rectF = rectF2;
                    i4 = i6;
                    i = i5;
                    i3 = 1;
                    f6 = 0.0f;
                    f8 = 0.0f;
                }
                RectF rectF3 = this.f21435OooO0O0;
                float f20 = centerCircleBox.f21456OooO00o;
                float f21 = centerCircleBox.OooO0O0;
                rectF3.set(f20 - f7, f21 - f7, f20 + f7, f21 + f7);
                if (!z || (f7 <= f6 && !z2)) {
                    f2 = f7;
                    if (f17 % 360.0f > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                        if (z2) {
                            double d3 = (double) ((f15 + (f17 / 2.0f)) * 0.017453292f);
                            this.f21427OooO00o.lineTo(centerCircleBox.f21456OooO00o + (((float) Math.cos(d3)) * f8), centerCircleBox.OooO0O0 + (f8 * ((float) Math.sin(d3))));
                        } else {
                            this.f21427OooO00o.lineTo(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0);
                        }
                    }
                } else {
                    if (z2) {
                        if (f8 < f6) {
                            f8 = -f8;
                        }
                        f9 = Math.max(f7, f8);
                    } else {
                        f9 = f7;
                    }
                    float f22 = (i4 == i3 || f9 == f6) ? 0.0f : f4 / (f9 * 0.017453292f);
                    float f23 = rotationAngle + ((f3 + (f22 / 2.0f)) * OooO0O02);
                    float f24 = (f10 - f22) * OooO0O02;
                    if (f24 < f6) {
                        f24 = 0.0f;
                    }
                    float f25 = f23 + f24;
                    if (f17 < 360.0f || f17 % 360.0f > AbstractC8352oOoOOoO0.f21471OooO0O0) {
                        double d4 = (double) (f25 * 0.017453292f);
                        f2 = f7;
                        this.f21427OooO00o.lineTo(centerCircleBox.f21456OooO00o + (((float) Math.cos(d4)) * f9), centerCircleBox.OooO0O0 + (f9 * ((float) Math.sin(d4))));
                        this.f21427OooO00o.arcTo(this.f21435OooO0O0, f25, -f24);
                    } else {
                        this.f21427OooO00o.addCircle(centerCircleBox.f21456OooO00o, centerCircleBox.OooO0O0, f9, Path.Direction.CCW);
                        f2 = f7;
                    }
                }
                this.f21427OooO00o.close();
                this.OooO00o.drawPath(this.f21427OooO00o, ((AbstractC8321oOoO0ooO) this).OooO00o);
            } else {
                i = i5;
                rectF = rectF2;
                f2 = holeRadius;
                f = OooO00o3;
                fArr2 = drawAngles;
                fArr = absoluteAngles;
            }
            i5 = i + 1;
            rectF2 = rectF;
            ooooo0ooArr2 = ooooo0ooArr;
            holeRadius = f2;
            OooO00o3 = f;
            drawAngles = fArr2;
            absoluteAngles = fArr;
        }
        C8349oOoOOo00.m20016OooO00o(centerCircleBox);
    }
}
