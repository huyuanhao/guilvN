package com.megvii.meglive_sdk.p096b;

import com.p118pd.sdk.C7486o0OoO0oO;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.b.a */
public final class C1512a {

    /* renamed from: a */
    public static int f2087a;

    /* renamed from: b */
    public static final String[] f2088b = {"fail_photo", "fail_read_ev"};

    /* renamed from: c */
    public static final String[] f2089c = {"no_fail", "no_face_found", "pitch_too_big", "yaw_too_big", "face_area_too_small", "face_too_dark", "face_too_bright", "face_width_too_small", "face_width_too_big", "face_too_blurry", "face_out_of_rect", "eye_occlusion", "mouth_occlusion"};

    /* renamed from: d */
    public static final String[] f2090d = {"no_fail", "no_face_found", "pitch_too_big", "yaw_too_big", "face_area_too_small", "face_too_dark", "face_too_bright", "face_width_too_small", "face_width_too_big", "face_too_blurry", "face_out_of_rect", "eye_occlusion", "mouth_occlusion", "need_keeping"};

    /* renamed from: e */
    public static final String[] f2091e = {"face_none", "other_action", "incontinuous_image", C7486o0OoO0oO.f20312OooO0Oo, "no_face_found", "no_face_sometimes", "face_lost", "action_too_fast", "face_occlusion", "mask", "face_aimless", "go_to_background"};

    /* renamed from: f */
    public static final String[] f2092f = {"FaceIDFlashLiveFailedTypeNone", "FaceIDFlashLiveFailedTypeActionTimeout", "FaceIDFlashLiveFailedTypeFlashTimeout", "FaceIDFlashLiveFailedTypeFlashFailed", "FaceIDFlashLiveFailedTypeActionFailed", "FaceIDFlashLiveFailedTypeSDKInitFailed", "FaceIDFlashLiveFailedTypeUserCanceled"};

    /* renamed from: g */
    public static C1512a f2093g = new C1512a();

    /* renamed from: h */
    public static String f2094h = "";

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.megvii.meglive_sdk.b.a$a */
    public static final class EnumC1513a extends Enum<EnumC1513a> {

        /* renamed from: a */
        public static final int f2095a = 1;

        /* renamed from: b */
        public static final int f2096b = 2;

        /* renamed from: c */
        public static final int f2097c = 3;

        /* renamed from: d */
        public static final int f2098d = 4;

        /* renamed from: e */
        public static final int f2099e = 5;

        /* renamed from: f */
        public static final int f2100f = 6;

        /* renamed from: g */
        public static final int f2101g = 7;

        /* renamed from: h */
        public static final int f2102h = 8;

        /* renamed from: i */
        public static final int f2103i = 9;

        /* renamed from: j */
        public static final int f2104j = 10;

        /* renamed from: k */
        public static final int f2105k = 11;

        /* renamed from: l */
        public static final /* synthetic */ int[] f2106l = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.megvii.meglive_sdk.b.a$b */
    public static final class EnumC1514b extends Enum<EnumC1514b> {

        /* renamed from: a */
        public static final int f2107a = 1;

        /* renamed from: b */
        public static final int f2108b = 2;

        /* renamed from: c */
        public static final int f2109c = 3;

        /* renamed from: d */
        public static final /* synthetic */ int[] f2110d = {1, 2, 3};
    }

    /* renamed from: a */
    public static C1512a m2287a(String str) {
        f2094h = str;
        return f2093g;
    }

    /* renamed from: a */
    public static JSONObject m2291a(Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject(map);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("properties", jSONObject);
            jSONObject2.put("time", System.currentTimeMillis());
            jSONObject2.put("type", "profile_set");
            jSONObject2.put("project", f2094h);
            jSONObject2.put("event_id", UUID.randomUUID().toString());
            jSONObject2.put("event", "set_header");
            return jSONObject2;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m2288a(String str, int i, int i2, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", UUID.randomUUID().toString());
            jSONObject.put("type", "track");
            jSONObject.put("project", f2094h);
            jSONObject.put("time", System.currentTimeMillis());
            String str4 = str + "_" + (i2 + 1);
            if (i == 1) {
                str3 = str4 + "_blink";
            } else if (i == 2) {
                str3 = str4 + "_mouth";
            } else if (i == 3) {
                str3 = str4 + "_shake";
            } else if (i == 4) {
                str3 = str4 + "_nod";
            } else {
                str3 = str4 + "_else";
            }
            jSONObject.put("event", str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("biz_token", str2);
            jSONObject2.put("liveness", 2);
            jSONObject2.put("try_times", f2087a);
            jSONObject.put("properties", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m2289a(String str, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "track");
            jSONObject.put("project", f2094h);
            jSONObject.put("event_id", UUID.randomUUID().toString());
            jSONObject.put("time", System.currentTimeMillis());
            jSONObject.put("event", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("liveness", i);
            jSONObject2.put("biz_token", str2);
            jSONObject2.put("try_times", f2087a);
            jSONObject.put("properties", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m2290a(String str, String str2, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "track");
            jSONObject.put("project", f2094h);
            jSONObject.put("event_id", UUID.randomUUID().toString());
            jSONObject.put("time", System.currentTimeMillis());
            jSONObject.put("event", str + Constants.COLON_SEPARATOR + f2090d[i2]);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("biz_token", str2);
            jSONObject2.put("liveness", i);
            jSONObject2.put("try_times", f2087a);
            jSONObject.put("properties", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
