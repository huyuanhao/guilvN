package com.alipay.apmobilesecuritysdk.p023e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p021c.C0383a;
import com.alipay.apmobilesecuritysdk.p024f.C0400a;
import com.p118pd.sdk.C7559o0o00OOo;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.d */
public final class C0394d {
    /* renamed from: a */
    public static C0393c m765a(String str) {
        try {
            if (C7559o0o00OOo.m19210OooO00o(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0393c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            C0383a.m744a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m766a() {
        synchronized (C0394d.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m767a(Context context) {
        synchronized (C0394d.class) {
            C0400a.m824a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            C0400a.m825a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    /* renamed from: a */
    public static synchronized void m768a(Context context, C0393c cVar) {
        synchronized (C0394d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f874a);
                jSONObject.put("deviceInfoHash", cVar.f875b);
                jSONObject.put("timestamp", cVar.f876c);
                jSONObject.put("tid", cVar.f877d);
                jSONObject.put("utdid", cVar.f878e);
                String jSONObject2 = jSONObject.toString();
                C0400a.m824a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                C0400a.m825a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e) {
                C0383a.m744a(e);
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0393c m769b() {
        synchronized (C0394d.class) {
            String a = C0400a.m823a("wxcasxx_v4", "key_wxcasxx_v4");
            if (C7559o0o00OOo.m19210OooO00o(a)) {
                return null;
            }
            return m765a(a);
        }
    }

    /* renamed from: b */
    public static synchronized C0393c m770b(Context context) {
        C0393c a;
        synchronized (C0394d.class) {
            String a2 = C0400a.m822a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C7559o0o00OOo.m19210OooO00o(a2)) {
                a2 = C0400a.m823a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a = m765a(a2);
        }
        return a;
    }

    /* renamed from: c */
    public static synchronized C0393c m771c(Context context) {
        synchronized (C0394d.class) {
            String a = C0400a.m822a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C7559o0o00OOo.m19210OooO00o(a)) {
                return null;
            }
            return m765a(a);
        }
    }
}
