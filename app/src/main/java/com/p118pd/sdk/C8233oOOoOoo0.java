package com.p118pd.sdk;

import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOOoOoo0  reason: case insensitive filesystem */
public class C8233oOOoOoo0 implements AbstractC8238oOOoo000 {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecimalFormat f21347OooO00o;

    public C8233oOOoOoo0(int i) {
        this.OooO00o = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(C9058ooOoOoOO.OooOO0);
            }
            stringBuffer.append("0");
        }
        this.f21347OooO00o = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        return this.f21347OooO00o.format((double) f);
    }

    public int OooO00o() {
        return this.OooO00o;
    }
}
