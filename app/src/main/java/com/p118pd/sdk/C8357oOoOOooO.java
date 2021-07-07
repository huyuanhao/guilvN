package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.pd.sdk.oOoOOooO  reason: case insensitive filesystem */
public class C8357oOoOOooO implements AbstractC8238oOOoo000, AbstractC8239oOOoo00O {
    public DateFormat OooO00o;

    public C8357oOoOOooO(String str) {
        this.OooO00o = new SimpleDateFormat(str);
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        return OooO00o((long) f);
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        return OooO00o((long) f);
    }

    private String OooO00o(long j) {
        return this.OooO00o.format(new Date(j));
    }
}
