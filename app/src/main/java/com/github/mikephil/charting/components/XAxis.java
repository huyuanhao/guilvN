package com.github.mikephil.charting.components;

import com.p118pd.sdk.AbstractC8200oOOo0oO;
import com.p118pd.sdk.AbstractC8201oOOo0oO0;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class XAxis extends AbstractC8201oOOo0oO0 {
    public int OooO = 1;
    public XAxisPosition OooO00o = XAxisPosition.TOP;
    public int OooO0oO = 1;
    public int OooO0oo = 1;
    public int OooOO0 = 1;
    public boolean OooOO0O = false;
    public float OooOO0o = 0.0f;

    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        ((AbstractC8200oOOo0oO) this).OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(4.0f);
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0, com.p118pd.sdk.AbstractC8201oOOo0oO0
    public XAxisPosition OooO00o() {
        return this.OooO00o;
    }

    public void OooO0oo(boolean z) {
        this.OooOO0O = z;
    }

    @Override // com.p118pd.sdk.AbstractC8201oOOo0oO0
    public float OooOO0O() {
        return this.OooOO0o;
    }

    public void OooOOO0(float f) {
        this.OooOO0o = f;
    }

    public void OooO00o(XAxisPosition xAxisPosition) {
        this.OooO00o = xAxisPosition;
    }

    public boolean OooOOO0() {
        return this.OooOO0O;
    }
}
