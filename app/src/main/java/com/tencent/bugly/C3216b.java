package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.C3265b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.proguard.AbstractC3306ad;
import com.tencent.bugly.proguard.C3303ac;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3314ak;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.b */
public class C3216b {

    /* renamed from: a */
    public static boolean f7322a = true;

    /* renamed from: b */
    public static List<AbstractC3215a> f7323b = new ArrayList();

    /* renamed from: c */
    public static boolean f7324c;

    /* renamed from: d */
    public static C3307ae f7325d;

    /* renamed from: e */
    public static boolean f7326e;

    /* renamed from: a */
    public static boolean m7744a(C3269a aVar) {
        List<String> list = aVar.f7697u;
        aVar.getClass();
        return list != null && list.contains("bugly");
    }

    /* renamed from: a */
    public static synchronized void m7739a(Context context) {
        synchronized (C3216b.class) {
            m7740a(context, (BuglyStrategy) null);
        }
    }

    /* renamed from: a */
    public static synchronized void m7740a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (C3216b.class) {
            if (f7326e) {
                C3321an.m8356d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str = C3321an.f8051b;
            } else {
                C3269a a = C3269a.m7965a(context);
                if (m7744a(a)) {
                    f7322a = false;
                    return;
                }
                String f = a.mo38161f();
                if (f == null) {
                    String str2 = C3321an.f8051b;
                } else {
                    m7741a(context, f, a.f7620A, buglyStrategy);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m7741a(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        synchronized (C3216b.class) {
            if (f7326e) {
                C3321an.m8356d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str2 = C3321an.f8051b;
            } else if (str == null) {
                String str3 = C3321an.f8051b;
            } else {
                f7326e = true;
                if (z) {
                    f7324c = true;
                    C3321an.f8052c = true;
                    C3321an.m8356d("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
                    C3321an.m8357e("--------------------------------------------------------------------------------------------", new Object[0]);
                    C3321an.m8356d("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
                    C3321an.m8356d("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
                    C3321an.m8356d("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
                    C3321an.m8356d("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
                    C3321an.m8357e("--------------------------------------------------------------------------------------------", new Object[0]);
                    C3321an.m8352b("[init] Open debug mode of Bugly.", new Object[0]);
                }
                C3321an.m8349a("[init] Bugly version: v%s", "2.6.5");
                C3321an.m8349a(" crash report start initializing...", new Object[0]);
                C3321an.m8352b("[init] Bugly start initializing...", new Object[0]);
                C3321an.m8349a("[init] Bugly complete version: v%s", "2.6.5(1.3.7)");
                Context a = C3325ap.m8380a(context);
                C3269a a2 = C3269a.m7965a(a);
                a2.mo38177t();
                C3322ao.m8362a(a);
                f7325d = C3307ae.m8250a(a, f7323b);
                C3314ak.m8298a(a);
                C3272a a3 = C3272a.m8070a(a, f7323b);
                C3303ac a4 = C3303ac.m8230a(a);
                if (m7744a(a2)) {
                    f7322a = false;
                    return;
                }
                a2.mo38146a(str);
                C3321an.m8349a("[param] Set APP ID:%s", str);
                m7742a(buglyStrategy, a2);
                C3265b.m7927a(a, buglyStrategy);
                for (int i = 0; i < f7323b.size(); i++) {
                    try {
                        if (a4.mo38335a(f7323b.get(i).f7321id)) {
                            f7323b.get(i).init(a, z, buglyStrategy);
                        }
                    } catch (Throwable th) {
                        if (!C3321an.m8350a(th)) {
                            th.printStackTrace();
                        }
                    }
                }
                a3.mo38190a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0);
                C3321an.m8352b("[init] Bugly initialization finished.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m7742a(BuglyStrategy buglyStrategy, C3269a aVar) {
        byte[] bArr;
        if (buglyStrategy != null) {
            String appVersion = buglyStrategy.getAppVersion();
            if (!TextUtils.isEmpty(appVersion)) {
                if (appVersion.length() > 100) {
                    String substring = appVersion.substring(0, 100);
                    C3321an.m8356d("appVersion %s length is over limit %d substring to %s", appVersion, 100, substring);
                    appVersion = substring;
                }
                aVar.f7692p = appVersion;
                C3321an.m8349a("[param] Set App version: %s", buglyStrategy.getAppVersion());
            }
            try {
                if (buglyStrategy.isReplaceOldChannel()) {
                    String appChannel = buglyStrategy.getAppChannel();
                    if (!TextUtils.isEmpty(appChannel)) {
                        if (appChannel.length() > 100) {
                            String substring2 = appChannel.substring(0, 100);
                            C3321an.m8356d("appChannel %s length is over limit %d substring to %s", appChannel, 100, substring2);
                            appChannel = substring2;
                        }
                        f7325d.mo38348a(556, "app_channel", appChannel.getBytes(), (AbstractC3306ad) null, false);
                        aVar.f7694r = appChannel;
                    }
                } else {
                    Map<String, byte[]> a = f7325d.mo38345a(556, (AbstractC3306ad) null, true);
                    if (!(a == null || (bArr = a.get("app_channel")) == null)) {
                        aVar.f7694r = new String(bArr);
                    }
                }
                C3321an.m8349a("[param] Set App channel: %s", aVar.f7694r);
            } catch (Exception e) {
                if (f7324c) {
                    e.printStackTrace();
                }
            }
            String appPackageName = buglyStrategy.getAppPackageName();
            if (!TextUtils.isEmpty(appPackageName)) {
                if (appPackageName.length() > 100) {
                    String substring3 = appPackageName.substring(0, 100);
                    C3321an.m8356d("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, substring3);
                    appPackageName = substring3;
                }
                aVar.f7680d = appPackageName;
                C3321an.m8349a("[param] Set App package: %s", buglyStrategy.getAppPackageName());
            }
            String deviceID = buglyStrategy.getDeviceID();
            if (deviceID != null) {
                if (deviceID.length() > 100) {
                    String substring4 = deviceID.substring(0, 100);
                    C3321an.m8356d("deviceId %s length is over limit %d substring to %s", deviceID, 100, substring4);
                    deviceID = substring4;
                }
                aVar.mo38155c(deviceID);
                C3321an.m8349a("[param] Set device ID: %s", deviceID);
            }
            aVar.f7684h = buglyStrategy.isUploadProcess();
            C3322ao.f8053a = buglyStrategy.isBuglyLogUpload();
        }
    }

    /* renamed from: a */
    public static synchronized void m7743a(AbstractC3215a aVar) {
        synchronized (C3216b.class) {
            if (!f7323b.contains(aVar)) {
                f7323b.add(aVar);
            }
        }
    }
}
