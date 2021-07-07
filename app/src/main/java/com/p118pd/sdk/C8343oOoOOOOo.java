package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* renamed from: com.pd.sdk.oOoOOOOo  reason: case insensitive filesystem */
public class C8343oOoOOOOo implements Comparator<Entry> {
    /* renamed from: OooO00o */
    public int compare(Entry entry, Entry entry2) {
        float OooO0O0 = entry.OooO0O0() - entry2.OooO0O0();
        if (OooO0O0 == 0.0f) {
            return 0;
        }
        return OooO0O0 > 0.0f ? 1 : -1;
    }
}
