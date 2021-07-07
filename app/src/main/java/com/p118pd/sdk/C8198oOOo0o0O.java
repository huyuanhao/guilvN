package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieEntry;
import java.util.List;

/* renamed from: com.pd.sdk.oOOo0o0O  reason: case insensitive filesystem */
public class C8198oOOo0o0O extends AbstractC8199oOOo0o0o<C8225oOOoOo00> {
    public RectF OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21287OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f21288OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21289OooO00o;
    public float[] OooO0O0;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public float OooOOO;

    /* renamed from: OooOOO  reason: collision with other field name */
    public boolean f21290OooOOO;
    public float OooOOO0;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public boolean f21291OooOOO0;
    public float OooOOOO;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public boolean f21292OooOOOO;
    public float OooOOOo;

    public C8198oOOo0o0O(Context context) {
        super(context);
        this.OooO00o = new RectF();
        this.OooOO0 = true;
        this.f21289OooO00o = new float[1];
        this.OooO0O0 = new float[1];
        this.OooOO0O = true;
        this.OooOO0o = false;
        this.f21291OooOOO0 = false;
        this.f21290OooOOO = false;
        this.f21288OooO00o = "";
        this.f21287OooO00o = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        this.OooOOO0 = 50.0f;
        this.OooOOO = 55.0f;
        this.f21292OooOOOO = true;
        this.OooOOOO = 100.0f;
        this.OooOOOo = 360.0f;
    }

    private float OooO0OO(float f, float f2) {
        return (f / f2) * this.OooOOOo;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    private void OooOO0() {
        int OooO0O02 = ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19916OooO0O0();
        if (this.f21289OooO00o.length != OooO0O02) {
            this.f21289OooO00o = new float[OooO0O02];
        } else {
            for (int i = 0; i < OooO0O02; i++) {
                this.f21289OooO00o[i] = 0.0f;
            }
        }
        if (this.OooO0O0.length != OooO0O02) {
            this.OooO0O0 = new float[OooO0O02];
        } else {
            for (int i2 = 0; i2 < OooO0O02; i2++) {
                this.OooO0O0[i2] = 0.0f;
            }
        }
        float OooO0o0 = ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0();
        List OooO00o2 = ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19905OooO00o();
        int i3 = 0;
        for (int i4 = 0; i4 < ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19903OooO00o(); i4++) {
            AbstractC8269oOOoooo0 ooooooo0 = (AbstractC8269oOOoooo0) OooO00o2.get(i4);
            for (int i5 = 0; i5 < ooooooo0.OooO0Oo(); i5++) {
                this.f21289OooO00o[i3] = OooO0OO(Math.abs(((PieEntry) ooooooo0.m19951OooO00o(i5)).OooO00o()), OooO0o0);
                if (i3 == 0) {
                    this.OooO0O0[i3] = this.f21289OooO00o[i3];
                } else {
                    float[] fArr = this.OooO0O0;
                    fArr[i3] = fArr[i3 - 1] + this.f21289OooO00o[i3];
                }
                i3++;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o() {
        OooOO0();
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0O0() {
        super.OooO0O0();
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            float diameter = getDiameter() / 2.0f;
            C8349oOoOOo00 centerOffsets = getCenterOffsets();
            float OooOoOO = ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o().OooOoOO();
            RectF rectF = this.OooO00o;
            float f = centerOffsets.f21456OooO00o;
            float f2 = centerOffsets.OooO0O0;
            rectF.set((f - diameter) + OooOoOO, (f2 - diameter) + OooOoOO, (f + diameter) - OooOoOO, (f2 + diameter) - OooOoOO);
            C8349oOoOOo00.m20016OooO00o(centerOffsets);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8327oOoOO00o(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21263OooO00o = null;
        ((AbstractC8194oOOo0OoO) this).f21270OooO00o = new C8250oOOooO00(this);
    }

    public boolean OooOO0o() {
        return this.f21292OooOOOO;
    }

    public boolean OooOOO() {
        return this.OooOO0O;
    }

    public boolean OooOOO0() {
        return this.OooOO0;
    }

    public boolean OooOOOO() {
        return this.f21290OooOOO;
    }

    public boolean OooOOOo() {
        return this.OooOO0o;
    }

    public boolean OooOOo0() {
        return this.f21291OooOOO0;
    }

    public float[] getAbsoluteAngles() {
        return this.OooO0O0;
    }

    public C8349oOoOOo00 getCenterCircleBox() {
        return C8349oOoOOo00.OooO00o(this.OooO00o.centerX(), this.OooO00o.centerY());
    }

    public CharSequence getCenterText() {
        return this.f21288OooO00o;
    }

    public C8349oOoOOo00 getCenterTextOffset() {
        C8349oOoOOo00 oooooo00 = this.f21287OooO00o;
        return C8349oOoOOo00.OooO00o(oooooo00.f21456OooO00o, oooooo00.OooO0O0);
    }

    public float getCenterTextRadiusPercent() {
        return this.OooOOOO;
    }

    public RectF getCircleBox() {
        return this.OooO00o;
    }

    public float[] getDrawAngles() {
        return this.f21289OooO00o;
    }

    public float getHoleRadius() {
        return this.OooOOO0;
    }

    public float getMaxAngle() {
        return this.OooOOOo;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRadius() {
        RectF rectF = this.OooO00o;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.OooO00o.height() / 2.0f);
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public float getRequiredLegendOffset() {
        return ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO0O0().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.OooOOO;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onDetachedFromWindow() {
        AbstractC8321oOoO0ooO oooo0ooo = ((AbstractC8194oOOo0OoO) this).f21273OooO00o;
        if (oooo0ooo != null && (oooo0ooo instanceof C8327oOoOO00o)) {
            ((C8327oOoOO00o) oooo0ooo).OooO0O0();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas);
            if (OooOO0()) {
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas, ((AbstractC8194oOOo0OoO) this).f21277OooO00o);
            }
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0O0(canvas);
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0OO(canvas);
            ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(canvas);
            OooO00o(canvas);
            OooO0O0(canvas);
        }
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f21288OooO00o = "";
        } else {
            this.f21288OooO00o = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO00o().setColor(i);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.OooOOOO = f;
    }

    public void setCenterTextSize(float f) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO00o().setTextSize(AbstractC8352oOoOOoO0.OooO00o(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO00o().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO00o().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.f21292OooOOOO = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.OooOO0 = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.OooOO0O = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.OooOO0 = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.OooOO0o = z;
    }

    public void setEntryLabelColor(int i) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0Oo().setColor(i);
    }

    public void setEntryLabelTextSize(float f) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0Oo().setTextSize(AbstractC8352oOoOOoO0.OooO00o(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0Oo().setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0o0().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.OooOOO0 = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.OooOOOo = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0o().setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint OooO0o = ((C8327oOoOO00o) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0o();
        int alpha = OooO0o.getAlpha();
        OooO0o.setColor(i);
        OooO0o.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.OooOOO = f;
    }

    public void setUsePercentValues(boolean z) {
        this.f21291OooOOO0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public float[] OooO00o(C8246oOOoo0oO ooooo0oo) {
        C8349oOoOOo00 centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f = (radius / 10.0f) * 3.6f;
        if (OooOOO()) {
            f = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f2 = radius - f;
        float rotationAngle = getRotationAngle();
        int OooO0OO = (int) ooooo0oo.OooO0OO();
        float f3 = this.f21289OooO00o[OooO0OO] / 2.0f;
        double d = (double) f2;
        double cos = Math.cos(Math.toRadians((double) (((this.OooO0O0[OooO0OO] + rotationAngle) - f3) * ((AbstractC8194oOOo0OoO) this).f21265OooO00o.OooO0O0())));
        Double.isNaN(d);
        double d2 = (double) centerCircleBox.f21456OooO00o;
        Double.isNaN(d2);
        float f4 = (float) ((cos * d) + d2);
        double sin = Math.sin(Math.toRadians((double) (((rotationAngle + this.OooO0O0[OooO0OO]) - f3) * ((AbstractC8194oOOo0OoO) this).f21265OooO00o.OooO0O0())));
        Double.isNaN(d);
        double d3 = d * sin;
        double d4 = (double) centerCircleBox.OooO0O0;
        Double.isNaN(d4);
        C8349oOoOOo00.m20016OooO00o(centerCircleBox);
        return new float[]{f4, (float) (d3 + d4)};
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    public void OooO0O0(float f, float f2) {
        this.f21287OooO00o.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(f);
        this.f21287OooO00o.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(f2);
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19852OooO00o(int i) {
        if (!OooOO0()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            C8246oOOoo0oO[] ooooo0ooArr = ((AbstractC8194oOOo0OoO) this).f21277OooO00o;
            if (i2 >= ooooo0ooArr.length) {
                return false;
            }
            if (((int) ooooo0ooArr[i2].OooO0OO()) == i) {
                return true;
            }
            i2++;
        }
    }

    public C8198oOOo0o0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO00o = new RectF();
        this.OooOO0 = true;
        this.f21289OooO00o = new float[1];
        this.OooO0O0 = new float[1];
        this.OooOO0O = true;
        this.OooOO0o = false;
        this.f21291OooOOO0 = false;
        this.f21290OooOOO = false;
        this.f21288OooO00o = "";
        this.f21287OooO00o = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        this.OooOOO0 = 50.0f;
        this.OooOOO = 55.0f;
        this.f21292OooOOOO = true;
        this.OooOOOO = 100.0f;
        this.OooOOOo = 360.0f;
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    private float OooO00o(float f) {
        return OooO0OO(f, ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0o0());
    }

    @Override // com.p118pd.sdk.AbstractC8199oOOo0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19851OooO00o(float f) {
        float OooO0OO = AbstractC8352oOoOOoO0.OooO0OO(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.OooO0O0;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > OooO0OO) {
                return i;
            }
            i++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public int OooO00o(int i) {
        List OooO00o2 = ((C8225oOOoOo00) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19905OooO00o();
        for (int i2 = 0; i2 < OooO00o2.size(); i2++) {
            if (((AbstractC8269oOOoooo0) OooO00o2.get(i2)).OooO00o((float) i, Float.NaN) != null) {
                return i2;
            }
        }
        return -1;
    }

    public C8198oOOo0o0O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO00o = new RectF();
        this.OooOO0 = true;
        this.f21289OooO00o = new float[1];
        this.OooO0O0 = new float[1];
        this.OooOO0O = true;
        this.OooOO0o = false;
        this.f21291OooOOO0 = false;
        this.f21290OooOOO = false;
        this.f21288OooO00o = "";
        this.f21287OooO00o = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        this.OooOOO0 = 50.0f;
        this.OooOOO = 55.0f;
        this.f21292OooOOOO = true;
        this.OooOOOO = 100.0f;
        this.OooOOOo = 360.0f;
    }
}
