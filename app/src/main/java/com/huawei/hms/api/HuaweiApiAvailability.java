package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public abstract class HuaweiApiAvailability {
    public static final String ACTIVITY_NAME = "com.huawei.hms.core.activity.JumpActivity";
    public static final String APPID_HMS = "C10132067";
    public static final String HMS_API_NAME_GAME = "HuaweiGame.API";
    public static final String HMS_API_NAME_ID = "HuaweiID.API";
    public static final String HMS_API_NAME_OD = "HuaweiOpenDevice.API";
    public static final String HMS_API_NAME_PAY = "HuaweiPay.API";
    public static final String HMS_API_NAME_PUSH = "HuaweiPush.API";
    public static final String HMS_API_NAME_SNS = "HuaweiSns.API";
    public static final int HMS_SDK_VERSION_CODE = 20603306;
    public static final String HMS_SDK_VERSION_NAME = "2.6.3.306";
    public static final int HMS_VERSION_CODE_GAME = 20503000;
    public static final int HMS_VERSION_CODE_ID = 20503000;
    public static final int HMS_VERSION_CODE_MIN = 20503000;
    public static final int HMS_VERSION_CODE_OD = 20601000;
    public static final int HMS_VERSION_CODE_PAY = 20503000;
    public static final int HMS_VERSION_CODE_PUSH = 20503000;
    public static final int HMS_VERSION_CODE_SNS = 20503000;
    public static final int HMS_VERSION_MAX = 20600000;
    public static final int HMS_VERSION_MIN = 20503000;
    public static final int NOTICE_VERSION_CODE = 20600000;
    public static final String SERVICES_ACTION = "com.huawei.hms.core.aidlservice";
    public static final String SERVICES_PACKAGE = "com.huawei.hwid";
    public static final String SERVICES_SIGNATURE = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";

    /* renamed from: a */
    public static final Map<String, Integer> f1104a;

    /* renamed from: b */
    public static int f1105b;

    static {
        HashMap hashMap = new HashMap();
        f1104a = hashMap;
        hashMap.put(HMS_API_NAME_ID, 20503000);
        f1104a.put(HMS_API_NAME_SNS, 20503000);
        f1104a.put(HMS_API_NAME_PAY, 20503000);
        f1104a.put(HMS_API_NAME_PUSH, 20503000);
        f1104a.put(HMS_API_NAME_GAME, 20503000);
        f1104a.put(HMS_API_NAME_OD, Integer.valueOf((int) HMS_VERSION_CODE_OD));
    }

    public static Map<String, Integer> getApiMap() {
        return f1104a;
    }

    public static HuaweiApiAvailability getInstance() {
        return C1118e.m1043a();
    }

    public static int getServicesVersionCode() {
        return f1105b;
    }

    public static void setServicesVersionCode(int i) {
        f1105b = i;
    }

    public abstract int isHuaweiMobileNoticeAvailable(Context context);

    public abstract int isHuaweiMobileServicesAvailable(Context context, int i);

    public abstract boolean isUserResolvableError(int i);

    public abstract void resolveError(Activity activity, int i, int i2);
}
