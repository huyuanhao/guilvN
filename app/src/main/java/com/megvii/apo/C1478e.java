package com.megvii.apo;

import android.content.Context;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import java.util.Map;

/* renamed from: com.megvii.apo.e */
public final class C1478e extends AbstractC1486m {
    public C1478e(Context context) {
        super(context);
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        if (C1500j.f2037H == 1) {
            try {
                map.put("101080001", this.f1983a.getPackageManager().hasSystemFeature("android.hardware.nfc") ? "1" : "0");
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
