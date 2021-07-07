package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import com.megvii.meglive_sdk.p096b.C1516c;
import com.megvii.meglive_sdk.p096b.C1517d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.f.g */
public final class C1565g {
    /* renamed from: a */
    public static String m2630a(Context context) {
        return (String) C1585z.m2695b(context, "megvii_liveness_bizToken", "");
    }

    /* renamed from: b */
    public static long m2632b(Context context) {
        return ((Long) C1585z.m2695b(context, "megvii_liveness_expiretime", 0L)).longValue();
    }

    /* renamed from: c */
    public static C1517d m2634c(Context context) {
        String str = (String) C1585z.m2695b(context, "megvii_sls_config", "");
        if (!"".equals(str)) {
            C1517d dVar = new C1517d();
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar.f2143c = jSONObject.optString("endpoint", "");
                dVar.f2141a = jSONObject.optString("key", "");
                dVar.f2144d = jSONObject.optString("project", "");
                dVar.f2145e = jSONObject.optString("logstore", "");
                dVar.f2142b = jSONObject.optString("secret", "");
                return dVar;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C1516c m2635d(Context context) {
        String str = (String) C1585z.m2695b(context, "megvii_liveness_config", "");
        C1516c cVar = new C1516c();
        if (!"".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                cVar.f2115a = jSONObject.optInt("liveness_type");
                cVar.f2116b = jSONObject.optInt("liveness_action_count");
                cVar.f2117c = jSONObject.optInt("liveness_timeout");
                JSONArray jSONArray = jSONObject.getJSONArray("liveness_action_queue");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int[] iArr = new int[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        iArr[i] = jSONArray.getInt(i);
                    }
                    cVar.f2118d = iArr;
                }
                cVar.f2119e = jSONObject.optInt("still_record_time");
                cVar.f2120f = jSONObject.optInt("still_fps");
                cVar.f2131q = (float) jSONObject.optDouble("face_eye_occlusion");
                cVar.f2138x = (float) jSONObject.optDouble("face_max_size_ratio");
                cVar.f2132r = (float) jSONObject.optDouble("face_mouth_occlusion");
                cVar.f2114B = (float) jSONObject.optDouble("face_center_rectY");
                cVar.f2113A = (float) jSONObject.optDouble("face_center_rectX");
                cVar.f2130p = (float) jSONObject.optDouble("face_max_offset_scale");
                cVar.f2136v = (float) jSONObject.optDouble("face_min_brightness");
                cVar.f2140z = (float) jSONObject.optDouble("face_gaussian_blur");
                cVar.f2135u = (float) jSONObject.optDouble("face_max_brightness");
                cVar.f2139y = (float) jSONObject.optDouble("face_motion_blur");
                cVar.f2137w = (float) jSONObject.optDouble("face_min_size_ratio");
                cVar.f2133s = (float) jSONObject.optDouble("face_yaw");
                cVar.f2134t = (float) jSONObject.optDouble("face_pitch");
                JSONArray optJSONArray = jSONObject.optJSONArray("flash_sequence");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    String[] strArr = new String[optJSONArray.length()];
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        strArr[i2] = optJSONArray.getString(i2);
                    }
                    cVar.f2121g = strArr;
                }
                cVar.f2122h = jSONObject.optInt("flash_frame_count");
                cVar.f2123i = jSONObject.optInt("flash_lack_frame_count");
                cVar.f2124j = jSONObject.optString("timestamp");
                String optString = jSONObject.optString("light_detection_colors");
                double optDouble = jSONObject.optDouble("light_detection_threshold");
                int optInt = jSONObject.optInt("liveness_action_count");
                double optDouble2 = jSONObject.optDouble("ev_threshold_high");
                double optDouble3 = jSONObject.optDouble("ev_threshold_low");
                int optInt2 = jSONObject.optInt("flash_liveness_timeout");
                cVar.f2127m = (float) optDouble2;
                cVar.f2128n = (float) optDouble3;
                cVar.f2116b = optInt;
                cVar.f2126l = (float) optDouble;
                cVar.f2125k = optString;
                cVar.f2129o = optInt2;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public static String m2636e(Context context) {
        return (String) C1585z.m2695b(context, "megvii_liveness_config", "");
    }

    /* renamed from: f */
    public static int m2637f(Context context) {
        return ((Integer) C1585z.m2695b(context, "megvii_liveness_option_code", 0)).intValue();
    }

    /* renamed from: g */
    public static int m2638g(Context context) {
        return ((Integer) C1585z.m2695b(context, "megvii_liveness_platform", 0)).intValue();
    }

    /* renamed from: h */
    public static Map<String, Object> m2639h(Context context) {
        HashMap hashMap = new HashMap();
        String str = (String) C1585z.m2695b(context, "megvii_liveness_bundle_id", "");
        hashMap.put("bundleId", str);
        if (!"".equals(str)) {
            hashMap.put("expireTime", Long.valueOf(((Long) C1585z.m2695b(context, str, 0L)).longValue() + 604800000));
        }
        return hashMap;
    }

    /* renamed from: i */
    public static String m2640i(Context context) {
        return (String) C1585z.m2695b(context, "megvii_liveness_language", "");
    }

    /* renamed from: a */
    public static void m2631a(Context context, int i) {
        C1585z.m2694a(context, "megvii_liveness_option_code", Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m2633b(Context context, int i) {
        C1585z.m2694a(context, "megvii_liveness_platform", Integer.valueOf(i));
    }
}
