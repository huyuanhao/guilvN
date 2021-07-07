package com.p118pd.sdk;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.p032h.AbstractC1099c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000oO  reason: case insensitive filesystem */
public final class C8515oo000oO implements AbstractC8514oo000o0o {
    public static C8515oo000oO OooO00o;

    public static AbstractC8514oo000o0o OooO00o() {
        return OooO0O0();
    }

    private Map<String, String> OooO00o(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", AbstractC8453oOooOoOO.OooO0o0());
        hashMap.put("App-Ver", AbstractC8453oOooOoOO.OooO0o());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.1.4.301");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str);
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "sendData RequestId : %s", str2);
        hashMap.put("Request-Id", str2);
        return hashMap;
    }

    public static synchronized AbstractC8514oo000o0o OooO0O0() {
        C8515oo000oO oo000oo;
        synchronized (C8515oo000oO.class) {
            if (OooO00o == null) {
                OooO00o = new C8515oo000oO();
            }
            oo000oo = OooO00o;
        }
        return oo000oo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.p118pd.sdk.AbstractC8514oo000o0o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(byte[] r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8515oo000oO.OooO00o(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.p118pd.sdk.AbstractC8514oo000o0o
    /* renamed from: a */
    public String mo30713a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isoCode", str);
            C8544oo00OOoo OooO00o2 = AbstractC1099c.OooO00o("{url}/getServerInfo".replace("{url}", "https://metrics.data.hicloud.com:6447"), jSONObject.toString());
            C8501oo000O0O oo000o0o = new C8501oo000O0O();
            oo000o0o.OooO00o(OooO00o2.m20207OooO00o());
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "get server add response err code: %s", oo000o0o.OooO00o());
            return oo000o0o.OooO0O0();
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("NetHandler", "getUploadServerAddr(): JSON structure Exception!");
            return "";
        }
    }
}
