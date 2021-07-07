package com.p118pd.sdk;

import android.content.Context;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00Oo0O  reason: case insensitive filesystem */
public class C8548oo00Oo0O {
    public static Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21667OooO00o = new Object();

    public static void OooO00o(Context context) {
        OooO00o = context;
    }

    public static void OooO00o(Context context, String str, long j, LinkedHashMap<String, String> linkedHashMap, String str2, String str3, long j2, String str4) {
        C8525oo00O0O.OooO00o(new C8507oo000Oo(context, str4, str2, C8525oo00O0O.OooO00o(str, j, linkedHashMap, str3).toString(), j2));
    }

    public static void OooO00o(C8532oo00O0oo oo00o0oo, String str) {
        if (oo00o0oo != null && oo00o0oo.m20202OooO00o()) {
            OooO00o(OooO00o, oo00o0oo.m20201OooO00o(), oo00o0oo.OooO0O0(), null, "$AppOnPause", "OnPause", oo00o0oo.OooO00o(), str);
        }
    }

    public static void OooO00o(C8535oo00OO00 oo00oo00, String str) {
        if (OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/V1Server", "onEvent null context");
            return;
        }
        String OooO00o2 = oo00oo00.m20203OooO00o();
        String OooO0O0 = oo00oo00.OooO0O0();
        Long OooO00o3 = oo00oo00.OooO00o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", OooO0O0);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/V1Server", "onEvent(): JSONException");
        }
        C8525oo00O0O.OooO00o(new C8507oo000Oo(OooO00o, str, OooO00o2, jSONObject.toString(), OooO00o3.longValue()));
    }

    public static void OooO00o(String str) {
        C8511oo000o0.OooO00o().OooO00o(str, 0);
    }

    public static void OooO0O0(C8532oo00O0oo oo00o0oo, String str) {
        if (oo00o0oo != null && oo00o0oo.m20202OooO00o()) {
            OooO00o(OooO00o, oo00o0oo.m20201OooO00o(), 0, null, "$AppOnResume", "OnResume", oo00o0oo.OooO00o(), str);
        }
    }

    public static void OooO0O0(String str) {
        if (OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "You must execute Builder.create() before you execute this method.");
            return;
        }
        synchronized (f21667OooO00o) {
            if (AbstractC8531oo00O0oO.m20200OooO00o(OooO00o)) {
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/V1Server", "cached data by BISDK has already handled.");
                return;
            }
            AbstractC8531oo00O0oO.OooO00o(OooO00o);
            C8525oo00O0O.OooO00o(new C8528oo00O0Oo(OooO00o, str));
        }
    }
}
