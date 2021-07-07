package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.proguard.AbstractC3306ad;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import java.util.Map;

public class Bugly {

    /* renamed from: a */
    public static boolean f7300a = false;
    public static Context applicationContext = null;
    public static boolean enable = true;

    public static synchronized String getAppChannel() {
        byte[] bArr;
        synchronized (Bugly.class) {
            C3269a b = C3269a.m7966b();
            if (b == null) {
                return null;
            }
            if (TextUtils.isEmpty(b.f7694r)) {
                C3307ae a = C3307ae.m8249a();
                if (a == null) {
                    return b.f7694r;
                }
                Map<String, byte[]> a2 = a.mo38345a(556, (AbstractC3306ad) null, true);
                if (!(a2 == null || (bArr = a2.get("app_channel")) == null)) {
                    return new String(bArr);
                }
            }
            return b.f7694r;
        }
    }

    public static void init(Context context, String str, boolean z) {
        init(context, str, z, null);
    }

    public static void putUserData(Context context, String str, String str2) {
        CrashReport.putUserData(context, str, str2);
    }

    public static void setAppChannel(Context context, String str) {
        CrashReport.setAppChannel(context, str);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
        CrashReport.setIsDevelopmentDevice(context, z);
    }

    public static void setUserId(Context context, String str) {
        CrashReport.setUserId(context, str);
    }

    public static void setUserTag(Context context, int i) {
        CrashReport.setUserSceneTag(context, i);
    }

    public static synchronized void init(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        synchronized (Bugly.class) {
            if (!f7300a) {
                f7300a = true;
                Context a = C3325ap.m8380a(context);
                applicationContext = a;
                if (a == null) {
                    String str2 = C3321an.f8051b;
                    return;
                }
                C3216b.m7743a(CrashModule.getInstance());
                C3216b.m7743a(Beta.getInstance());
                C3216b.f7322a = enable;
                C3216b.m7741a(applicationContext, str, z, buglyStrategy);
            }
        }
    }
}
