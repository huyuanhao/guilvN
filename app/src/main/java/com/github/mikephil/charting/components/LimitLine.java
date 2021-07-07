package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.p118pd.sdk.AbstractC8200oOOo0oO;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class LimitLine extends AbstractC8200oOOo0oO {
    public DashPathEffect OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint.Style f14943OooO00o = Paint.Style.FILL_AND_STROKE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LimitLabelPosition f14944OooO00o = LimitLabelPosition.RIGHT_TOP;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f14945OooO00o = "";
    public int OooO0O0 = Color.rgb(237, 91, 91);
    public float OooO0Oo = 0.0f;
    public float OooO0o0 = 2.0f;

    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f) {
        this.OooO0Oo = f;
    }

    public void OooO00o(float f, float f2, float f3) {
        this.OooO00o = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public void OooO0O0(int i) {
        this.OooO0O0 = i;
    }

    public float OooO0Oo() {
        return this.OooO0Oo;
    }

    public float OooO0o0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15074OooO00o() {
        this.OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    public int OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0Oo(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 12.0f) {
            f = 12.0f;
        }
        this.OooO0o0 = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    public DashPathEffect OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15075OooO0O0() {
        return this.OooO00o != null;
    }

    public void OooO00o(Paint.Style style) {
        this.f14943OooO00o = style;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Paint.Style m15071OooO00o() {
        return this.f14943OooO00o;
    }

    public void OooO00o(LimitLabelPosition limitLabelPosition) {
        this.f14944OooO00o = limitLabelPosition;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LimitLabelPosition m15072OooO00o() {
        return this.f14944OooO00o;
    }

    public void OooO00o(String str) {
        this.f14945OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15073OooO00o() {
        return this.f14945OooO00o;
    }

    public LimitLine(float f, String str) {
        this.OooO0Oo = f;
        this.f14945OooO00o = str;
    }
}
