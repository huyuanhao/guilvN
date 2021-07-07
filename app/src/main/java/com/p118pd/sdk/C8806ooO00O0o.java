package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.netease.nimlib.mixpush.MixPushException;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.ooO00O0o  reason: case insensitive filesystem */
public class C8806ooO00O0o extends AbstractC8821ooO0O0 {

    /* renamed from: com.pd.sdk.ooO00O0o$OooO00o */
    public static class OooO00o {
        public static final int OooO0O0 = 10;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f22011OooO00o;

        public OooO00o() {
            Class<?>[] clsArr = {String.class};
            Object[] objArr = {"ro.build.version.emui"};
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method declaredMethod = cls.getDeclaredMethod("get", clsArr);
                this.f22011OooO00o = (String) declaredMethod.invoke(cls, objArr);
                this.OooO00o = Integer.parseInt((String) declaredMethod.invoke(cls, DeviceConfig.KEY_EMUI_VERSION_CODE));
                C8783oo0oooOO.OooOOOO("get EMUI version is:" + this.f22011OooO00o + " api level = " + this.OooO00o);
            } catch (ClassNotFoundException | Exception | LinkageError | NoSuchMethodException | NullPointerException unused) {
            }
        }

        public boolean OooO00o() {
            if (!TextUtils.isEmpty(this.f22011OooO00o) && this.OooO00o >= 10) {
                return true;
            }
            return false;
        }
    }

    public C8806ooO00O0o(int i) {
        super(i);
    }

    private boolean OooO0Oo(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(HuaweiApiAvailability.SERVICES_PACKAGE, 16);
            C8783oo0oooOO.OooOOOO("HW HMS version is " + packageInfo.versionCode);
            if (packageInfo.versionCode >= 20401300) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        if (Build.VERSION.SDK_INT < 16) {
            C8783oo0oooOO.OooOOOO("HW Device Android SDK Version = " + Build.VERSION.SDK_INT + " < 16");
            return false;
        } else if (!new OooO00o().OooO00o()) {
            C8783oo0oooOO.OooOOOO("HW EMUI version is not support push");
            return false;
        } else if (OooO0Oo(context)) {
            return true;
        } else {
            C8783oo0oooOO.OooOOOO("HW HMS version is not support push");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiClient").getName();
            C8783oo0oooOO.OooOOOO("HW push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("HW push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.huawei.android.push.intent.REGISTRATION");
            intent.setPackage(packageName);
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.netease.nimlib.mixpush.hw.HWPushReceiver");
            return true;
        } catch (MixPushException e) {
            C8783oo0oooOO.OooOOOO("android manifest miss push config " + e.getMessage());
            return false;
        }
    }
}
