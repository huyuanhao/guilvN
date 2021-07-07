package com.p118pd.sdk;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooO000O0  reason: case insensitive filesystem */
public final class C8798ooO000O0 {
    public static final String OooO00o(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("MODEL", Build.MODEL);
            if (z) {
                jSONObject.put("GOOGLE_PLAY_SERVICE", C8841ooO0OOoO.OooO00o());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
