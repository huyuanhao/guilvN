package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOOoo0O0  reason: case insensitive filesystem */
public class C8242oOOoo0O0 implements AbstractC8239oOOoo00O, AbstractC8238oOOoo000 {
    public DecimalFormat OooO00o;

    public C8242oOOoo0O0() {
        this.OooO00o = new DecimalFormat("###,###,##0.0");
    }

    public int OooO00o() {
        return 1;
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        return this.OooO00o.format((double) f) + " %";
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        return this.OooO00o.format((double) f) + " %";
    }

    public C8242oOOoo0O0(DecimalFormat decimalFormat) {
        this.OooO00o = decimalFormat;
    }
}
