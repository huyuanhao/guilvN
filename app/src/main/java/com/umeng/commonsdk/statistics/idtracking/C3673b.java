package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.b */
public class C3673b extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9625a = "android_id";

    /* renamed from: b */
    public Context f9626b;

    public C3673b(Context context) {
        super("android_id");
        this.f9626b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return DeviceConfig.getAndroidId(this.f9626b);
    }
}
