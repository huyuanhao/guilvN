package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.C0185a;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import java.util.concurrent.CopyOnWriteArrayList;

public class GlobalAppRuntimeInfo {

    /* renamed from: a */
    public static Context f27a;

    /* renamed from: b */
    public static ENV f28b = ENV.ONLINE;

    /* renamed from: c */
    public static String f29c = "";

    /* renamed from: d */
    public static String f30d = "";

    /* renamed from: e */
    public static String f31e;

    /* renamed from: f */
    public static String f32f;

    /* renamed from: g */
    public static String f33g;

    /* renamed from: h */
    public static volatile boolean f34h = true;

    /* renamed from: i */
    public static SharedPreferences f35i = null;

    /* renamed from: j */
    public static volatile CopyOnWriteArrayList<String> f36j = null;

    public static void addBucketInfo(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 32 && str2.length() <= 32) {
            synchronized (GlobalAppRuntimeInfo.class) {
                if (f36j == null) {
                    f36j = new CopyOnWriteArrayList<>();
                }
                f36j.add(str);
                f36j.add(str2);
            }
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f36j;
    }

    public static Context getContext() {
        return f27a;
    }

    public static String getCurrentProcess() {
        return f30d;
    }

    public static ENV getEnv() {
        return f28b;
    }

    public static String getTtid() {
        return f31e;
    }

    public static String getUserId() {
        return f32f;
    }

    public static String getUtdid() {
        Context context;
        if (f33g == null && (context = f27a) != null) {
            f33g = Utils.getDeviceId(context);
        }
        return f33g;
    }

    public static boolean isAppBackground() {
        if (f27a == null) {
            return true;
        }
        return f34h;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f29c) || TextUtils.isEmpty(f30d)) {
            return true;
        }
        return f29c.equalsIgnoreCase(f30d);
    }

    public static void setBackground(boolean z) {
        f34h = z;
    }

    public static void setContext(Context context) {
        f27a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f30d)) {
                f30d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f29c)) {
                f29c = Utils.getMainProcessName(context);
            }
            if (f35i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f35i = defaultSharedPreferences;
                f32f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.m289e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f30d, "TargetProcess", f29c);
        }
    }

    public static void setCurrentProcess(String str) {
        f30d = str;
    }

    public static void setEnv(ENV env) {
        f28b = env;
    }

    public static void setTargetProcess(String str) {
        f29c = str;
    }

    public static void setTtid(String str) {
        f31e = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("@");
                String str2 = null;
                String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
                String substring2 = str.substring(indexOf + 1);
                int lastIndexOf = substring2.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring3 = substring2.substring(0, lastIndexOf);
                    str2 = substring2.substring(lastIndexOf + 1);
                    substring2 = substring3;
                }
                C0185a.m243a(substring2, str2, substring);
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f32f;
        if (str2 == null || !str2.equals(str)) {
            f32f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f35i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        String str2 = f33g;
        if (str2 == null || !str2.equals(str)) {
            f33g = str;
        }
    }
}
