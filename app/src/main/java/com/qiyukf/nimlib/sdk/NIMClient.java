package com.qiyukf.nimlib.sdk;

import android.content.Context;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;

public class NIMClient {
    public static <T> T getService(Class<T> cls) {
        return (T) C2180b.m4472a(cls);
    }

    public static StatusCode getStatus() {
        return C2205d.m4582e();
    }

    public static void init(Context context, LoginInfo loginInfo, SDKOptions sDKOptions, boolean z) {
        C2180b.m4474a(context, loginInfo, sDKOptions, z);
    }

    public static void updateStatusBarNotificationConfig(StatusBarNotificationConfig statusBarNotificationConfig) {
        C2180b.m4476a(statusBarNotificationConfig);
    }
}
