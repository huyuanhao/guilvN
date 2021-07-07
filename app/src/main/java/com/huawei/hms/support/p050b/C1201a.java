package com.huawei.hms.support.p050b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.AbstractC8593oo0O00OO;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.support.b.a */
public class C1201a {

    /* renamed from: a */
    public static final Object f1303a = new Object();

    /* renamed from: b */
    public static C1201a f1304b;

    /* renamed from: a */
    public static C1201a m1307a() {
        C1201a aVar;
        synchronized (f1303a) {
            if (f1304b == null) {
                f1304b = new C1201a();
            }
            aVar = f1304b;
        }
        return aVar;
    }

    /* renamed from: b */
    public void mo15708b(Context context, String str, String str2) {
        if (context != null && AbstractC8593oo0O00OO.m20240OooO00o()) {
            AbstractC8593oo0O00OO.OooO00o(context, str, str2);
        }
    }

    /* renamed from: b */
    public boolean mo15709b() {
        if (C1141j.m1094a()) {
            return false;
        }
        C1202a.m1318b("HiAnalyticsUtil", "not ChinaROM ");
        return true;
    }

    /* renamed from: a */
    public void mo15707a(Context context, String str, Map<String, String> map) {
        String a = m1309a(map);
        if (!TextUtils.isEmpty(a)) {
            mo15708b(context, str, a);
        }
    }

    /* renamed from: a */
    public void mo15706a(Context context, String str, String str2) {
        if (!m1307a().mo15709b() && context != null) {
            mo15708b(context, str, m1308a(context, str2));
        }
    }

    /* renamed from: a */
    private String m1308a(Context context, String str) {
        String packageName = context.getPackageName();
        return "01|" + "" + "|" + packageName + "|" + C1141j.m1090a(context) + "|" + HuaweiApiAvailability.HMS_SDK_VERSION_CODE + "|" + str;
    }

    /* renamed from: a */
    private String m1309a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            C1202a.m1320d("HiAnalyticsUtil", "AnalyticsHelper create json exception" + e.getMessage());
        }
        return jSONObject.toString();
    }
}
