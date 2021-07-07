package org.android.agoo.xiaomi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;

public class MiPushRegistar {
    public static final String PACKAGE_XIAOMI = "com.xiaomi.xmsf";
    public static final String TAG = "MiPushRegistar";
    public static final String XIAOMI = "Xiaomi".toLowerCase();
    public static String phoneBrand = Build.BRAND;

    public static class XiaoMiNotifyListener implements BaseNotifyClickActivity.INotifyListener {
        public XiaoMiNotifyListener() {
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String getMsgSource() {
            return "xiaomi";
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String parseMsgFromIntent(Intent intent) {
            String str;
            try {
                str = ((MiPushMessage) intent.getSerializableExtra(PushMessageHelper.KEY_MESSAGE)).getContent();
            } catch (Exception unused) {
                str = null;
            }
            ALog.m7600i(MiPushRegistar.TAG, "parseMsgFromIntent", "msg", str);
            return str;
        }

        public String toString() {
            return "INotifyListener: " + getMsgSource();
        }
    }

    public static boolean checkDevice(Context context) {
        boolean z;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (TextUtils.equals(XIAOMI, phoneBrand.toLowerCase()) && (packageInfo = packageManager.getPackageInfo(PACKAGE_XIAOMI, 4)) != null && packageInfo.versionCode >= 105) {
                z = true;
                ALog.m7597d(TAG, "checkDevice", "result", Boolean.valueOf(z));
                return z;
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "checkDevice", th, new Object[0]);
        }
        z = false;
        ALog.m7597d(TAG, "checkDevice", "result", Boolean.valueOf(z));
        return z;
    }

    public static void register(Context context, String str, String str2) {
        try {
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.m7599e(TAG, "register not in main process, return", new Object[0]);
            } else if (checkDevice(context)) {
                ALog.m7600i(TAG, "register begin", new Object[0]);
                BaseNotifyClickActivity.addNotifyListener(new XiaoMiNotifyListener());
                MiPushClient.registerPush(context, str, str2);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "register", th, new Object[0]);
        }
    }

    public static void unregister(Context context) {
        try {
            MiPushClient.unregisterPush(context);
        } catch (Throwable th) {
            ALog.m7598e(TAG, MiPushClient.COMMAND_UNREGISTER, th, new Object[0]);
        }
    }
}
