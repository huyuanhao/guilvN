package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOOoOooO  reason: case insensitive filesystem */
public class C8234oOOoOooO implements AbstractC8239oOOoo00O {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecimalFormat f21348OooO00o;

    public C8234oOOoOooO(int i) {
        OooO00o(i);
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(C9058ooOoOoOO.OooOO0);
            }
            stringBuffer.append("0");
        }
        this.f21348OooO00o = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        return this.f21348OooO00o.format((double) f);
    }

    public int OooO00o() {
        return this.OooO00o;
    }
}
