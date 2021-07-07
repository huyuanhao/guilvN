package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000o0  reason: case insensitive filesystem */
public class C8511oo000o0 {
    public static C8511oo000o0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<String, Long> f21643OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21644OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21645OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8502oo000O0o f21646OooO00o = new C8502oo000O0o();

    public static C8511oo000o0 OooO00o() {
        return OooO0O0();
    }

    public static void OooO00o(String str, Context context, String str2, long j, LinkedHashMap<String, String> linkedHashMap, String str3, String str4) {
        C8525oo00O0O.OooO00o(new C8507oo000Oo(context, str, str3, C8525oo00O0O.OooO00o(str2, j, linkedHashMap, str4).toString(), System.currentTimeMillis()));
    }

    public static void OooO00o(String str, Context context, String str2, LinkedHashMap<String, String> linkedHashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = f21643OooO00o.containsKey(str) ? f21643OooO00o.get(str).longValue() : 0;
        OooO00o(str, context, str2, longValue == 0 ? 0 : currentTimeMillis - longValue, linkedHashMap, "$AppOnPause", "OnPause");
    }

    public static synchronized C8511oo000o0 OooO0O0() {
        C8511oo000o0 oo000o0;
        synchronized (C8511oo000o0.class) {
            if (OooO00o == null) {
                OooO00o = new C8511oo000o0();
            }
            oo000o0 = OooO00o;
        }
        return oo000o0;
    }

    private void OooO0O0(Context context) {
        String OooO0O0 = AbstractC8475oOoooO0O.OooO0O0(context);
        String OooO00o2 = AbstractC8521oo00O00.OooO00o(context);
        AbstractC8521oo00O00.m20193OooO00o(context, OooO0O0);
        AbstractC8453oOooOoOO.OooO0o0(OooO0O0);
        AbstractC8453oOooOoOO.OooO0o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8502oo000O0o m20183OooO00o() {
        return this.f21646OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20184OooO00o() {
        Context context = this.f21645OooO00o;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onFirstRun() SDK was not init.");
            return;
        }
        JSONObject OooO00o2 = C8520oo000ooO.m20189OooO00o(context);
        if (OooO00o2 != null) {
            C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21645OooO00o, "_instance_ex_tag", "$AppFirstStart", OooO00o2.toString(), System.currentTimeMillis()));
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onFirstRun() getInfoJson is null,The end of the event ");
        }
    }

    public void OooO00o(Context context) {
        this.f21645OooO00o = context;
        OooO0O0(context);
        C8525oo00O0O.OooO00o(new C8516oo000oO0(context));
    }

    public void OooO00o(String str, int i) {
        OooO00o(str, this.f21645OooO00o, AbstractC8526oo00O0O0.OooO00o(i), AbstractC8453oOooOoOO.OooO0o());
    }

    public void OooO00o(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        JSONObject jSONObject = linkedHashMap == null ? new JSONObject() : C8525oo00O0O.OooO00o(linkedHashMap);
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = AbstractC8526oo00O0O0.OooO00o("yyyy-MM-dd", currentTimeMillis);
        }
        C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21645OooO00o, str, i, str2, jSONObject.toString(), currentTimeMillis));
    }

    public void OooO00o(String str, Context context) {
        Context context2;
        if (context == null || (context2 = this.f21645OooO00o) == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onPause's mContext is null or SDK was not init.");
            return;
        }
        OooO00o(str, context2, context.getClass().getCanonicalName(), (LinkedHashMap<String, String>) null);
        f21643OooO00o.put(str, 0L);
    }

    public void OooO00o(String str, Context context, String str2, String str3) {
        if (context == null || this.f21645OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onReport() null context or SDK was not init.");
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "onReport: Before calling runtaskhandler()");
        C8525oo00O0O.OooO00o(new C8508oo000OoO(context, str, str2, str3));
    }

    public void OooO00o(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        Context context2;
        if (context == null || (context2 = this.f21645OooO00o) == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onPause null context or SDK was not init.");
            return;
        }
        OooO00o(str, context2, context.getClass().getCanonicalName(), linkedHashMap);
        f21643OooO00o.put(str, 0L);
    }

    public void OooO00o(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f21644OooO00o > 30000) {
            AbstractC8536oo00OO0O.OooO00o("HiAnalyticsEventServer", "begin to call onReport!");
            this.f21644OooO00o = currentTimeMillis;
            OooO00o(str, this.f21645OooO00o, str2, AbstractC8453oOooOoOO.OooO0o());
            return;
        }
        AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "autoReport timeout. interval < 30s ");
    }

    public void OooO00o(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21645OooO00o, str, str2, jSONObject.toString(), System.currentTimeMillis()));
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onEvent():JSON structure Exception!");
        }
    }

    public void OooO00o(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        Context context = this.f21645OooO00o;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onPause null context or SDK was not init.");
            return;
        }
        OooO00o(str, context, str2, linkedHashMap);
        f21643OooO00o.put(str, 0L);
    }

    public void OooO00o(boolean z) {
        Context context = this.f21645OooO00o;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onEventCrashInit() SDK was not init.");
        } else if (z) {
            C8505oo000OOO.OooO00o(context).OooO00o();
        } else {
            C8505oo000OOO.OooO00o(context).OooO0O0();
        }
    }

    public void OooO0O0(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        new C8513oo000o0O(str, AbstractC8526oo00O0O0.OooO00o(i), str2, (linkedHashMap == null ? new JSONObject() : C8525oo00O0O.OooO00o(linkedHashMap)).toString(), this.f21645OooO00o).OooO00o();
    }

    public void OooO0O0(String str, Context context) {
        if (context == null || this.f21645OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onResume's mContext is null or SDK was not init.");
            return;
        }
        f21643OooO00o.put(str, Long.valueOf(System.currentTimeMillis()));
        OooO00o(str, this.f21645OooO00o, context.getClass().getCanonicalName(), 0, null, "$AppOnResume", "OnResume");
    }

    public void OooO0O0(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        Context context2;
        f21643OooO00o.put(str, Long.valueOf(System.currentTimeMillis()));
        if (context == null || (context2 = this.f21645OooO00o) == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onResume() null context or SDK was not init.");
        } else {
            OooO00o(str, context2, context.getClass().getCanonicalName(), 0, linkedHashMap, "$AppOnResume", "OnResume");
        }
    }

    public void OooO0O0(String str, String str2) {
        Context context = this.f21645OooO00o;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onStartApp() SDK was not init.");
            return;
        }
        JSONObject OooO00o2 = C8520oo000ooO.OooO00o(context, str, str2);
        if (OooO00o2 != null) {
            C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21645OooO00o, "_instance_ex_tag", "$AppOnStart", OooO00o2.toString(), System.currentTimeMillis()));
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onStartApp() getInfoJson is null,The end of the event ");
        }
    }

    public void OooO0O0(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        f21643OooO00o.put(str, Long.valueOf(System.currentTimeMillis()));
        OooO00o(str, this.f21645OooO00o, str2, 0, linkedHashMap, "$AppOnResume", "OnResume");
    }

    public void OooO0OO(String str, String str2) {
        if (this.f21645OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onAppUpgrade() SDK was not init.");
            return;
        }
        JSONObject OooO00o2 = C8520oo000ooO.m20190OooO00o(str, str2);
        if (OooO00o2 != null) {
            C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21645OooO00o, "_instance_ex_tag", "$AppOnUpdate", OooO00o2.toString(), System.currentTimeMillis()));
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsEventServer", "onAppUpgrade() getInfoJson is null,The end of the event ");
        }
    }
}
