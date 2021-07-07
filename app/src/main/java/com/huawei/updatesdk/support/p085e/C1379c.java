package com.huawei.updatesdk.support.p085e;

import android.os.SystemProperties;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.socialize.common.SocializeConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.support.e.c */
public final class C1379c {

    /* renamed from: a */
    public static final Map<Integer, String> f1675a;

    /* renamed from: d */
    public static C1379c f1676d = new C1379c();

    /* renamed from: b */
    public int f1677b = 0;

    /* renamed from: c */
    public String f1678c = "";

    static {
        HashMap hashMap = new HashMap();
        f1675a = hashMap;
        hashMap.put(1, "1.0");
        f1675a.put(2, "1.5");
        f1675a.put(3, "1.6");
        f1675a.put(4, "2.0");
        f1675a.put(5, "2.0");
        f1675a.put(6, "2.3");
        f1675a.put(7, SocializeConstants.PROTOCOL_VERSON);
        f1675a.put(8, "3.0.5");
        f1675a.put(8, "3.1");
        f1675a.put(9, "4.0");
        f1675a.put(10, "4.1");
        f1675a.put(11, DispatchConstants.VER_CODE);
        f1675a.put(12, "5.1");
    }

    public C1379c() {
        int d = m2073d();
        this.f1677b = d;
        if (d == 0) {
            this.f1677b = m2074e();
        }
        this.f1678c = m2075f();
        C1278a.m1580a("EMUISupportUtil", "emuiVersion:" + this.f1677b + ",emuiVersionName:" + this.f1678c);
    }

    /* renamed from: a */
    public static C1379c m2071a() {
        return f1676d;
    }

    /* renamed from: a */
    private String m2072a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                return split[1];
            }
        }
        return "";
    }

    /* renamed from: d */
    private int m2073d() {
        return SystemProperties.getInt(DeviceConfig.KEY_EMUI_VERSION_CODE, 0);
    }

    /* renamed from: e */
    private int m2074e() {
        String a = m2072a(SystemProperties.get("ro.build.version.emui", ""));
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : f1675a.entrySet()) {
            if (a.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    /* renamed from: f */
    private String m2075f() {
        String str = f1675a.get(Integer.valueOf(this.f1677b));
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public int mo16208b() {
        return this.f1677b;
    }

    /* renamed from: c */
    public String mo16209c() {
        return this.f1678c;
    }
}
