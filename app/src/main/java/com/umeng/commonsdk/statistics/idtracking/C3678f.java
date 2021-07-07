package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.f */
public class C3678f extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9643a = "imei";

    /* renamed from: b */
    public Context f9644b;

    public C3678f(Context context) {
        super("imei");
        this.f9644b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return DeviceConfig.getImeiNew(this.f9644b);
    }
}
