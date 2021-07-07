package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.accs.client.a */
public class C3103a {
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;

    /* renamed from: a */
    public static int f6871a;

    /* renamed from: b */
    public static String f6872b;

    /* renamed from: c */
    public static String f6873c;

    /* renamed from: d */
    public static String f6874d;

    /* renamed from: e */
    public static String f6875e;

    /* renamed from: f */
    public static IProcessName f6876f;

    /* renamed from: g */
    public static AtomicInteger f6877g = new AtomicInteger(-1);

    /* renamed from: h */
    public static volatile C3103a f6878h;

    /* renamed from: i */
    public static Context f6879i;

    /* renamed from: j */
    public ActivityManager f6880j;

    /* renamed from: k */
    public ConnectivityManager f6881k;

    public C3103a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        } else if (f6879i == null) {
            f6879i = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static C3103a m7295a(Context context) {
        if (f6878h == null) {
            synchronized (C3103a.class) {
                if (f6878h == null) {
                    f6878h = new C3103a(context);
                }
            }
        }
        return f6878h;
    }

    /* renamed from: c */
    public static boolean m7297c() {
        return f6877g.intValue() == 0;
    }

    /* renamed from: b */
    public ConnectivityManager mo37526b() {
        if (this.f6881k == null) {
            this.f6881k = (ConnectivityManager) f6879i.getSystemService("connectivity");
        }
        return this.f6881k;
    }

    /* renamed from: a */
    public ActivityManager mo37525a() {
        if (this.f6880j == null) {
            this.f6880j = (ActivityManager) f6879i.getSystemService(C5982OoooOoO.OooO0o0);
        }
        return this.f6880j;
    }

    /* renamed from: a */
    public static String m7296a(String str) {
        String str2;
        if (TextUtils.isEmpty(f6872b)) {
            str2 = str + ".TaobaoIntentService";
        } else {
            str2 = f6872b;
        }
        ALog.m7597d("AdapterGlobalClientInfo", "getAgooCustomServiceName", "serviceName", str2);
        return str2;
    }
}
