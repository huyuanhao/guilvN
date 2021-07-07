package com.megvii.meglive_sdk.p106f;

import android.os.Build;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.netease.nis.captcha.Captcha;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.f.h */
public final class C1566h {
    /* renamed from: a */
    public static String m2642a(int i, int i2, int[] iArr, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_token", C1565g.m2630a(C1525e.m2307a().f2160a));
            C1571m.m2656b("delta biztoken", C1565g.m2630a(C1525e.m2307a().f2160a));
            jSONObject.put("log", "");
            jSONObject.put("bid", C1525e.m2307a().f2160a.getPackageName());
            jSONObject.put("liveness_type", C1565g.m2635d(C1525e.m2307a().f2160a).f2115a);
            jSONObject.put("liveness_config", C1565g.m2636e(C1525e.m2307a().f2160a));
            jSONObject.put("liveness_result", i == 0 ? 2000 : Captcha.NO_NETWORK);
            jSONObject.put("liveness_failure_reason", i2);
            jSONObject.put("sdk_version", "MegLiveStill 3.3.1A");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("systemName", "Android");
            jSONObject2.put("systemVersion", Build.VERSION.RELEASE);
            jSONObject2.put("deviceName", Build.FINGERPRINT);
            jSONObject2.put("deviceModel", Build.MODEL);
            jSONObject.put("user_info", jSONObject2);
            if (iArr != null && iArr.length > 0) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    jSONArray.put(i4, iArr[i4]);
                }
                jSONObject3.put("retry_count", i3);
                jSONObject3.put("last_liveness_action", jSONArray);
                jSONObject.put("liveness_client_config", jSONObject3);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m2641a(int i, int i2, float f, String str, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_token", C1565g.m2630a(C1525e.m2307a().f2160a));
            C1571m.m2656b("delta biztoken", C1565g.m2630a(C1525e.m2307a().f2160a));
            jSONObject.put("log", "");
            jSONObject.put("bid", C1525e.m2307a().f2160a.getPackageName());
            jSONObject.put("liveness_type", C1565g.m2635d(C1525e.m2307a().f2160a).f2115a);
            jSONObject.put("liveness_config", C1565g.m2636e(C1525e.m2307a().f2160a));
            jSONObject.put("liveness_result", i == 0 ? 2000 : Captcha.NO_NETWORK);
            jSONObject.put("ev", (double) f);
            jSONObject.put("last_flash_sequence", str);
            jSONObject.put("last_flash_sequence_index", i3);
            jSONObject.put("liveness_failure_reason", i2);
            jSONObject.put("sdk_version", "MegLiveStill 3.3.1A");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("systemName", "Android");
            jSONObject2.put("systemVersion", Build.VERSION.RELEASE);
            jSONObject2.put("deviceName", Build.FINGERPRINT);
            jSONObject2.put("deviceModel", Build.MODEL);
            jSONObject.put("user_info", jSONObject2);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
