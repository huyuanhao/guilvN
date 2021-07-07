package com.p118pd.sdk;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOOoo0O  reason: case insensitive filesystem */
public class C8241oOOoo0O implements AbstractC8239oOOoo00O {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecimalFormat f21353OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21354OooO00o;

    public C8241oOOoo0O(boolean z, String str, int i) {
        this.f21354OooO00o = z;
        this.OooO00o = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(C9058ooOoOoOO.OooOO0);
            }
            stringBuffer.append("0");
        }
        this.f21353OooO00o = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        BarEntry barEntry;
        float[] OooO00o2;
        if (this.f21354OooO00o || !(entry instanceof BarEntry) || (OooO00o2 = (barEntry = (BarEntry) entry).m15084OooO00o()) == null) {
            return this.f21353OooO00o.format((double) f) + this.OooO00o;
        } else if (OooO00o2[OooO00o2.length - 1] != f) {
            return "";
        } else {
            return this.f21353OooO00o.format((double) barEntry.OooO00o()) + this.OooO00o;
        }
    }
}
