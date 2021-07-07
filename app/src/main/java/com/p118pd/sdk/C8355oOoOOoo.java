package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOoOOoo  reason: case insensitive filesystem */
public class C8355oOoOOoo implements AbstractC8238oOOoo000, AbstractC8239oOOoo00O {
    public DecimalFormat OooO00o;

    public C8355oOoOOoo(String str) {
        this.OooO00o = new DecimalFormat(str);
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        return this.OooO00o.format((double) f);
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        return this.OooO00o.format((double) f);
    }
}
