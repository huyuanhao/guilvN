package com.p118pd.sdk;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00O0o  reason: case insensitive filesystem */
public class C8529oo00O0o implements AbstractC8527oo00O0OO {
    private long OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str) * 1000;
        } catch (NumberFormatException unused) {
            AbstractC8536oo00OO0O.OooO0OO("V1LifeCycleAdapter", "failed to bisdk convertDuration.");
            return -1;
        }
    }

    private void OooO00o(String str, String str2) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length == 3) {
            String str3 = split[0];
            String str4 = split[1];
            String str5 = split[2];
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                long longValue = AbstractC8531oo00O0oO.OooO00o(str4).longValue();
                long OooO00o = OooO00o(str5);
                if (longValue > 0 && OooO00o >= 0) {
                    C8548oo00Oo0O.OooO0O0(new C8532oo00O0oo(str3, longValue), str2);
                    C8548oo00Oo0O.OooO00o(new C8532oo00O0oo(str3, longValue + OooO00o, OooO00o), str2);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: a */
    public void mo30720a(String str) {
        C8548oo00Oo0O.OooO00o(str);
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: a */
    public void mo30721a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            for (String str3 : str.split(C7522o0Ooo0o.OooO0O0)) {
                OooO00o(str3, str2);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: b */
    public void mo30722b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("termination");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            if (jSONObject.has("b")) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray("b");
                                if (jSONArray2 != null) {
                                    int length2 = jSONArray2.length();
                                    for (int i2 = 0; i2 < length2; i2++) {
                                        OooO00o(jSONArray2.getString(i2), str2);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0Oo("V1LifeCycleAdapter", "Exception occurred in parsing file data.");
            }
        }
    }
}
