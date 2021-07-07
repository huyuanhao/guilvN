package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.k */
public class C3683k extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9658a = "serial";

    public C3683k() {
        super(f9658a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return DeviceConfig.getSerial();
    }
}
