package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.g */
public class C3679g extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9645a = "mac";

    /* renamed from: b */
    public Context f9646b;

    public C3679g(Context context) {
        super("mac");
        this.f9646b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        try {
            return DeviceConfig.getMac(this.f9646b);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                e.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f9646b, e);
            return null;
        }
    }
}
