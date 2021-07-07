package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.m */
public class C3452m {
    /* renamed from: a */
    public static JSONObject m8857a(Context context, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!jSONObject.has("content")) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("content");
            if (jSONObject3.has("analytics")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("analytics");
                if (jSONObject4.has(C3416b.f8434R)) {
                    jSONObject4.remove(C3416b.f8434R);
                }
                if (jSONObject4.has(C3416b.f8435S)) {
                    jSONObject4.remove(C3416b.f8435S);
                }
                if (jSONObject4.has("error")) {
                    jSONObject4.remove("error");
                }
                jSONObject3.put("analytics", jSONObject4);
            }
            jSONObject2.put("content", jSONObject3);
            if (jSONObject.has("header")) {
                jSONObject2.put("header", jSONObject.getJSONObject("header"));
            }
            if (m8856a(jSONObject2) <= j) {
                return jSONObject2;
            }
            C3437g.m8754a(context).mo38720i();
            C3437g.m8754a(context).mo38719h();
            C3437g.m8754a(context).mo38711b(true, false);
            C3437g.m8754a(context).mo38702a();
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static long m8856a(JSONObject jSONObject) {
        return (long) jSONObject.toString().getBytes().length;
    }

    /* renamed from: a */
    public static long m8855a(JSONArray jSONArray) {
        return (long) jSONArray.toString().getBytes().length;
    }
}
