package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.analytics.pro.t */
public class C3465t implements AbstractC3464s {

    /* renamed from: a */
    public long f8792a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.AbstractC3464s
    /* renamed from: a */
    public void mo38785a(long j) {
        this.f8792a = j;
    }

    @Override // com.umeng.analytics.pro.AbstractC3464s
    /* renamed from: a */
    public long mo38783a() {
        return this.f8792a;
    }

    @Override // com.umeng.analytics.pro.AbstractC3464s
    /* renamed from: a */
    public String mo38784a(Context context) {
        String deviceId = DeviceConfig.getDeviceId(context);
        String appkey = UMUtils.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(currentTimeMillis + appkey + deviceId);
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.AbstractC3464s
    /* renamed from: a */
    public boolean mo38787a(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        if ((j == 0 || currentTimeMillis - j >= this.f8792a) && j2 > 0 && currentTimeMillis - j2 > this.f8792a) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.AbstractC3464s
    /* renamed from: a */
    public void mo38786a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(C3460q.f8779c, str);
            edit.putLong(C3460q.f8778b, 0);
            edit.putLong(C3460q.f8781e, currentTimeMillis);
            edit.putLong(C3460q.f8782f, 0);
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
