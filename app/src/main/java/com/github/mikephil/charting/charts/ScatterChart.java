package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.p118pd.sdk.AbstractC8191oOOo0OOo;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8259oOOooOoo;
import com.p118pd.sdk.C8224oOOoOo;
import com.p118pd.sdk.C8350oOoOOo0O;

public class ScatterChart extends AbstractC8191oOOo0OOo<C8224oOOoOo> implements AbstractC8259oOOooOoo {

    public enum ScatterShape {
        SQUARE("SQUARE"),
        CIRCLE("CIRCLE"),
        TRIANGLE("TRIANGLE"),
        CROSS("CROSS"),
        X("X"),
        CHEVRON_UP("CHEVRON_UP"),
        CHEVRON_DOWN("CHEVRON_DOWN");
        
        public final String shapeIdentifier;

        /* access modifiers changed from: public */
        ScatterShape(String str) {
            this.shapeIdentifier = str;
        }

        public static ScatterShape[] getAllDefaultShapes() {
            return new ScatterShape[]{SQUARE, CIRCLE, TRIANGLE, CROSS, X, CHEVRON_UP, CHEVRON_DOWN};
        }

        public String toString() {
            return this.shapeIdentifier;
        }
    }

    public ScatterChart(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8350oOoOOo0O(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        getXAxis().OooOO0o(0.5f);
        getXAxis().OooOO0O(0.5f);
    }

    @Override // com.p118pd.sdk.AbstractC8259oOOooOoo
    public C8224oOOoOo getScatterData() {
        return (C8224oOOoOo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
