package com.megvii.apo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.megvii.apo.util.C1492b;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1494d;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1496f;
import com.megvii.apo.util.C1500j;
import com.megvii.apo.util.C1501k;
import com.umeng.message.MsgConstant;
import java.util.Map;

/* renamed from: com.megvii.apo.n */
public final class C1487n extends AbstractC1486m {
    public C1487n(Context context) {
        super(context);
    }

    /* renamed from: b */
    private String m2237b() {
        try {
            PackageInfo packageInfo = this.f1983a.getPackageManager().getPackageInfo(this.f1983a.getPackageName(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.versionCode);
            return sb.toString();
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }

    /* renamed from: c */
    private String m2238c() {
        try {
            return this.f1983a.getPackageManager().getPackageInfo(this.f1983a.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        String str;
        Object obj;
        if (C1500j.f2052g == 1) {
            try {
                String str2 = (String) C1501k.m2275b(this.f1983a, "p_z_d", "");
                if (TextUtils.isEmpty(str2)) {
                    str2 = C1492b.m2251a();
                    C1501k.m2274a(this.f1983a, "p_z_d", str2);
                }
                map.put("101000001", str2);
                map.put("101000002", Build.BRAND);
                map.put("101000003", Build.MODEL);
                map.put("101000004", "Android_" + Build.VERSION.RELEASE);
                int a = C1496f.m2259a(this.f1983a);
                if (a != 1) {
                    str = a != 2 ? a != 3 ? a != 4 ? "" : "4G" : "3G" : "2G";
                } else {
                    str = "WIFI";
                }
                map.put("101000005", str);
                if (!mo16961a(MsgConstant.PERMISSION_ACCESS_WIFI_STATE)) {
                    obj = "";
                } else {
                    obj = String.valueOf(AbstractC1486m.m2232a(((WifiManager) this.f1983a.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress()));
                }
                map.put("101000006", obj);
                map.put("101000007", C1493c.m2253a("iwYV0WxGEEDoRuNyvd0xYQ==") + "_1.0");
                map.put("101000008", "");
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                map.put("101000009", sb.toString());
                map.put("101000010", this.f1983a.getPackageName());
                map.put("101000011", m2237b());
                map.put("101000012", m2238c());
                map.put("101000013", this.f1983a.getPackageName());
                map.put("101000014", "0");
                String b = C1494d.m2256b();
                if (TextUtils.isEmpty(b)) {
                    b = C1492b.m2251a();
                    C1494d.m2254a(b);
                }
                map.put("101000015", b);
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
