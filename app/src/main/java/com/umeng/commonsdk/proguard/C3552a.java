package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.proguard.a */
public class C3552a {

    /* renamed from: a */
    public static final String f9153a = "UMSysLocation";

    /* renamed from: c */
    public static final int f9154c = 10000;

    /* renamed from: b */
    public LocationManager f9155b;

    /* renamed from: d */
    public Context f9156d;

    /* renamed from: e */
    public AbstractC3600c f9157e;

    public C3552a() {
    }

    /* renamed from: a */
    public synchronized void mo38865a(AbstractC3600c cVar) {
        boolean z;
        boolean z2;
        Location location;
        ULog.m9832i(f9153a, "getSystemLocation");
        if (cVar != null) {
            if (this.f9156d != null) {
                this.f9157e = cVar;
                boolean checkPermission = UMUtils.checkPermission(this.f9156d, "android.permission.ACCESS_COARSE_LOCATION");
                boolean checkPermission2 = UMUtils.checkPermission(this.f9156d, "android.permission.ACCESS_FINE_LOCATION");
                if (!checkPermission) {
                    if (!checkPermission2) {
                        if (this.f9157e != null) {
                            this.f9157e.mo38964a(null);
                        }
                        return;
                    }
                }
                try {
                    if (this.f9155b != null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            z2 = this.f9155b.isProviderEnabled("gps");
                            z = this.f9155b.isProviderEnabled("network");
                        } else {
                            z2 = checkPermission2 ? this.f9155b.isProviderEnabled("gps") : false;
                            z = checkPermission ? this.f9155b.isProviderEnabled("network") : false;
                        }
                        if (z2 || z) {
                            ULog.m9832i(f9153a, "getLastKnownLocation(LocationManager.PASSIVE_PROVIDER)");
                            if (checkPermission2) {
                                location = this.f9155b.getLastKnownLocation("passive");
                            } else if (checkPermission) {
                                location = this.f9155b.getLastKnownLocation("network");
                            }
                            this.f9157e.mo38964a(location);
                        }
                        location = null;
                        this.f9157e.mo38964a(location);
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(this.f9156d, th);
                }
            }
        }
        return;
        UMCrashManager.reportCrash(this.f9156d, th);
    }

    public C3552a(Context context) {
        if (context == null) {
            MLog.m9793e("Context参数不能为null");
            return;
        }
        this.f9156d = context.getApplicationContext();
        this.f9155b = (LocationManager) context.getApplicationContext().getSystemService("location");
    }

    /* renamed from: a */
    public synchronized void mo38864a() {
        ULog.m9832i(f9153a, "destroy");
        try {
            if (this.f9155b != null) {
                this.f9155b = null;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9156d, th);
        }
    }
}
