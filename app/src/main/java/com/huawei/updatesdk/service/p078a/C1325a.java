package com.huawei.updatesdk.service.p078a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.huawei.updatesdk.service.a.a */
public final class C1325a {

    /* renamed from: a */
    public static final Object f1580a = new Object();

    /* renamed from: b */
    public static C1325a f1581b;

    /* renamed from: c */
    public C1326b f1582c;

    /* renamed from: d */
    public String f1583d;

    public C1325a(Context context) {
        this.f1582c = C1326b.m1885a("DeviceSessionUpdateSDK_V1", context);
    }

    /* renamed from: a */
    public static C1325a m1873a() {
        C1325a aVar;
        synchronized (f1580a) {
            if (f1581b == null) {
                f1581b = new C1325a(C1294a.m1650a().mo15900b());
            }
            aVar = f1581b;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo16061a(long j) {
        this.f1582c.mo16072a("updatesdk.signtime", j);
    }

    /* renamed from: a */
    public void mo16062a(String str) {
        this.f1582c.mo16073a("updatesdk.signkey", str);
    }

    /* renamed from: b */
    public long mo16063b() {
        return this.f1582c.mo16074b("updatesdk.signtime", 0);
    }

    /* renamed from: b */
    public void mo16064b(long j) {
        this.f1582c.mo16072a("updatesdk.lastCheckDate", j);
    }

    /* renamed from: b */
    public void mo16065b(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo16061a(mo16071g());
        }
        this.f1582c.mo16073a("appstore.client.sign.param", str);
    }

    /* renamed from: c */
    public String mo16066c() {
        return this.f1582c.mo16075b("updatesdk.signkey", "");
    }

    /* renamed from: c */
    public void mo16067c(String str) {
        this.f1583d = str;
    }

    /* renamed from: d */
    public String mo16068d() {
        return this.f1582c.mo16075b("appstore.client.sign.param", "");
    }

    /* renamed from: e */
    public long mo16069e() {
        return this.f1582c.mo16074b("updatesdk.lastCheckDate", 0);
    }

    /* renamed from: f */
    public String mo16070f() {
        return this.f1583d;
    }

    /* renamed from: g */
    public long mo16071g() {
        try {
            return Long.parseLong(new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date()));
        } catch (NumberFormatException e) {
            C1278a.m1584d("DeviceSession", "get date error: " + e.toString());
            return 0;
        }
    }
}
