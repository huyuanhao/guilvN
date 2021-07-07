package com.alibaba.sdk.android.utils;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.sdk.android.utils.crashdefend.C0333b;
import com.alibaba.sdk.android.utils.crashdefend.C0335c;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;

public class AlicloudTrackerManager {

    /* renamed from: a */
    public static AlicloudTrackerManager f735a;

    /* renamed from: a */
    public C0330c f736a = new C0330c();

    /* renamed from: a */
    public C0333b f737a = null;

    /* renamed from: c */
    public Map<String, AlicloudTracker> f738c;

    public AlicloudTrackerManager(Application application) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("kVersion", "1.1.4");
        hashMap.put(Constants.KEY_PACKAGE_NAME, application.getPackageName());
        this.f736a.mo4074a(application, hashMap);
        this.f738c = new HashMap();
        this.f737a = C0333b.m612a(application, this.f736a);
    }

    public static synchronized AlicloudTrackerManager getInstance(Application application) {
        synchronized (AlicloudTrackerManager.class) {
            if (application == null) {
                return null;
            }
            if (f735a == null) {
                f735a = new AlicloudTrackerManager(application);
            }
            return f735a;
        }
    }

    public AlicloudTracker getTracker(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = str + str2;
        if (this.f738c.containsKey(str3)) {
            return this.f738c.get(str3);
        }
        AlicloudTracker alicloudTracker = new AlicloudTracker(this.f736a, str, str2);
        this.f738c.put(str3, alicloudTracker);
        return alicloudTracker;
    }

    public boolean registerCrashDefend(String str, String str2, int i, int i2, SDKMessageCallback sDKMessageCallback) {
        if (this.f737a == null) {
            return false;
        }
        C0335c cVar = new C0335c();
        cVar.f757a = str;
        cVar.f760b = str2;
        cVar.f754a = i;
        cVar.f758b = i2;
        return this.f737a.m624a(cVar, sDKMessageCallback);
    }

    public void unregisterCrashDefend(String str, String str2) {
        this.f737a.mo4084d(str, str2);
    }
}
