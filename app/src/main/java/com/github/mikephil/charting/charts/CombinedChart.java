package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8191oOOo0OOo;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8219oOOoOOOo;
import com.p118pd.sdk.AbstractC8256oOOooOo;
import com.p118pd.sdk.AbstractC8261oOOooo0;
import com.p118pd.sdk.C8208oOOoO0Oo;
import com.p118pd.sdk.C8213oOOoOO00;
import com.p118pd.sdk.C8216oOOoOOO;
import com.p118pd.sdk.C8220oOOoOOo;
import com.p118pd.sdk.C8221oOOoOOo0;
import com.p118pd.sdk.C8224oOOoOo;
import com.p118pd.sdk.C8245oOOoo0o;
import com.p118pd.sdk.C8246oOOoo0oO;
import com.p118pd.sdk.C8320oOoO0oo;

public class CombinedChart extends AbstractC8191oOOo0OOo<C8221oOOoOOo0> implements AbstractC8256oOOooOo {
    public DrawOrder[] OooO00o;
    public boolean OooOo = false;
    public boolean OooOo0O = true;
    public boolean OooOo0o = false;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o == null) {
            return null;
        }
        C8246oOOoo0oO OooO00o2 = getHighlighter().OooO00o(f, f2);
        return (OooO00o2 == null || !OooO0OO()) ? OooO00o2 : new C8246oOOoo0oO(OooO00o2.OooO0OO(), OooO00o2.OooO0o0(), OooO00o2.OooO0Oo(), OooO00o2.OooO0o(), OooO00o2.m19936OooO0O0(), -1, OooO00o2.m19934OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public boolean OooO0O0() {
        return this.OooOo0O;
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public boolean OooO0OO() {
        return this.OooOo0o;
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        this.OooO00o = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new C8245oOOoo0o(this, this));
        setHighlightFullBarEnabled(true);
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8320oOoO0oo(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO
    public C8208oOOoO0Oo getBarData() {
        T t = ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
        if (t == null) {
            return null;
        }
        return ((C8221oOOoOOo0) t).OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8254oOOooOOO
    public C8213oOOoOO00 getBubbleData() {
        T t = ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
        if (t == null) {
            return null;
        }
        return ((C8221oOOoOOo0) t).m19920OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8255oOOooOOo
    public C8216oOOoOOO getCandleData() {
        T t = ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
        if (t == null) {
            return null;
        }
        return ((C8221oOOoOOo0) t).m19921OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8256oOOooOo
    public C8221oOOoOOo0 getCombinedData() {
        return (C8221oOOoOOo0) ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
    }

    public DrawOrder[] getDrawOrder() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8258oOOooOoO
    public C8220oOOoOOo getLineData() {
        T t = ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
        if (t == null) {
            return null;
        }
        return ((C8221oOOoOOo0) t).m19922OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8259oOOooOoo
    public C8224oOOoOo getScatterData() {
        T t = ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
        if (t == null) {
            return null;
        }
        return ((C8221oOOoOOo0) t).m19923OooO00o();
    }

    public void setDrawBarShadow(boolean z) {
        this.OooOo = z;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr != null && drawOrderArr.length > 0) {
            this.OooO00o = drawOrderArr;
        }
    }

    public void setDrawValueAboveBar(boolean z) {
        this.OooOo0O = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.OooOo0o = z;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0O0(Canvas canvas) {
        if (((AbstractC8194oOOo0OoO) this).f21267OooO00o != null && m19847OooO0o() && OooOO0()) {
            int i = 0;
            while (true) {
                C8246oOOoo0oO[] ooooo0ooArr = ((AbstractC8194oOOo0OoO) this).f21277OooO00o;
                if (i < ooooo0ooArr.length) {
                    C8246oOOoo0oO ooooo0oo = ooooo0ooArr[i];
                    AbstractC8261oOOooo0<? extends Entry> OooO00o2 = ((C8221oOOoOOo0) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).m19924OooO00o(ooooo0oo);
                    Entry OooO00o3 = ((C8221oOOoOOo0) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(ooooo0oo);
                    if (OooO00o3 != null && ((float) OooO00o2.OooO00o((Object) OooO00o3)) <= ((float) OooO00o2.OooO0Oo()) * ((AbstractC8194oOOo0OoO) this).f21265OooO00o.OooO00o()) {
                        float[] OooO00o4 = m19845OooO00o(ooooo0oo);
                        if (((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20033OooO00o(OooO00o4[0], OooO00o4[1])) {
                            ((AbstractC8194oOOo0OoO) this).f21267OooO00o.OooO00o(OooO00o3, ooooo0oo);
                            ((AbstractC8194oOOo0OoO) this).f21267OooO00o.OooO00o(canvas, OooO00o4[0], OooO00o4[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setData(C8221oOOoOOo0 ooooooo0) {
        super.setData((AbstractC8219oOOoOOOo) ooooooo0);
        setHighlighter(new C8245oOOoo0o(this, this));
        ((C8320oOoO0oo) ((AbstractC8194oOOo0OoO) this).f21273OooO00o).OooO0O0();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o.m20005OooO00o();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p118pd.sdk.AbstractC8248oOOooO, com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public boolean OooO00o() {
        return this.OooOo;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
