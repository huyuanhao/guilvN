package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.d */
public class C3675d extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9629a = "idmd5";

    /* renamed from: b */
    public Context f9630b;

    public C3675d(Context context) {
        super("idmd5");
        this.f9630b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f9630b);
    }
}
