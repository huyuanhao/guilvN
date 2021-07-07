package com.alipay.apmobilesecuritysdk.p023e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p021c.C0383a;
import com.alipay.apmobilesecuritysdk.p024f.C0400a;
import com.p118pd.sdk.C7559o0o00OOo;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.a */
public final class C0391a {
    /* renamed from: a */
    public static C0392b m758a(String str) {
        try {
            if (C7559o0o00OOo.m19210OooO00o(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0392b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            C0383a.m744a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m759a() {
        synchronized (C0391a.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m760a(Context context) {
        synchronized (C0391a.class) {
            C0400a.m824a(context, "vkeyid_profiles_v3", "deviceid", "");
            C0400a.m825a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    /* renamed from: a */
    public static synchronized void m761a(Context context, C0392b bVar) {
        synchronized (C0391a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f871a);
                jSONObject.put("deviceInfoHash", bVar.f872b);
                jSONObject.put("timestamp", bVar.f873c);
                String jSONObject2 = jSONObject.toString();
                C0400a.m824a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                C0400a.m825a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e) {
                C0383a.m744a(e);
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0392b m762b() {
        synchronized (C0391a.class) {
            String a = C0400a.m823a("wxcasxx_v3", "wxcasxx");
            if (C7559o0o00OOo.m19210OooO00o(a)) {
                return null;
            }
            return m758a(a);
        }
    }

    /* renamed from: b */
    public static synchronized C0392b m763b(Context context) {
        C0392b a;
        synchronized (C0391a.class) {
            String a2 = C0400a.m822a(context, "vkeyid_profiles_v3", "deviceid");
            if (C7559o0o00OOo.m19210OooO00o(a2)) {
                a2 = C0400a.m823a("wxcasxx_v3", "wxcasxx");
            }
            a = m758a(a2);
        }
        return a;
    }

    /* renamed from: c */
    public static synchronized C0392b m764c(Context context) {
        synchronized (C0391a.class) {
            String a = C0400a.m822a(context, "vkeyid_profiles_v3", "deviceid");
            if (C7559o0o00OOo.m19210OooO00o(a)) {
                return null;
            }
            return m758a(a);
        }
    }
}
