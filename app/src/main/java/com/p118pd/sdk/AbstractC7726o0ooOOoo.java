package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C7494o0OoOOOo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0ooOOoo  reason: case insensitive filesystem */
public abstract class AbstractC7726o0ooOOoo {
    public static final String OooO = "api_name";
    public static final String OooO00o = "msp-gzip";
    public static final String OooO0O0 = "Msp-Param";
    public static final String OooO0OO = "Operation-Type";
    public static final String OooO0Oo = "content-type";
    public static final String OooO0o = "AppId";
    public static final String OooO0o0 = "Version";
    public static final String OooO0oO = "des-mode";
    public static final String OooO0oo = "namespace";
    public static final String OooOO0 = "api_version";
    public static final String OooOO0O = "data";
    public static final String OooOO0o = "params";
    public static final String OooOOO = "device";
    public static final String OooOOO0 = "public_key";
    public static final String OooOOOO = "action";
    public static final String OooOOOo = "type";
    public static final String OooOOo0 = "method";

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20701OooO00o = true;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20702OooO0O0 = true;

    public String OooO00o() {
        return "4.9.0";
    }

    public Map<String, String> OooO00o(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(OooO00o, String.valueOf(z));
        hashMap.put(OooO0OO, "alipay.msp.cashier.dispatch.bytes");
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put(OooO0o0, "2.0");
        hashMap.put(OooO0o, "TAOBAO");
        hashMap.put(OooO0O0, C7496o0OoOOo0.OooO00o(str));
        hashMap.put(OooO0oO, "CBC");
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract JSONObject m19371OooO00o() throws JSONException;

    public String OooO0O0() throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put(OooO, "com.alipay.mcpay");
        hashMap.put(OooOO0, OooO00o());
        return OooO00o(hashMap, new HashMap<>());
    }

    public static JSONObject OooO00o(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(OooOOo0, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String OooO00o(String str, JSONObject jSONObject) {
        C7515o0Ooo00 OooO00o2 = C7515o0Ooo00.OooO00o();
        C7518o0Ooo00o OooO00o3 = C7518o0Ooo00o.OooO00o(OooO00o2.m19156OooO00o());
        JSONObject OooO00o4 = C7519o0Ooo0O.OooO00o(new JSONObject(), jSONObject);
        try {
            OooO00o4.put("tid", OooO00o3.m19163OooO00o());
            OooO00o4.put(C7483o0OoO0Oo.OooO0O0, OooO00o2.m19157OooO00o().OooO00o(OooO00o3));
            OooO00o4.put(C7483o0OoO0Oo.OooO0o0, C7531o0Oooo0o.m19197OooO00o(OooO00o2.m19156OooO00o(), C7528o0OooOoo.f20379OooO00o));
            OooO00o4.put(C7483o0OoO0Oo.OooO0o, C7531o0Oooo0o.m19196OooO00o(OooO00o2.m19156OooO00o()));
            OooO00o4.put(C7483o0OoO0Oo.OooO0Oo, str);
            OooO00o4.put(C7483o0OoO0Oo.OooO0oo, C7722o0ooOOO0.OooO0Oo);
            OooO00o4.put("utdid", OooO00o2.m19158OooO00o());
            OooO00o4.put(C7483o0OoO0Oo.OooOO0, OooO00o3.m19166OooO0O0());
            OooO00o4.put("pa", OooO00o2.m19157OooO00o().OooO00o(OooO00o2.m19156OooO00o()));
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
        }
        return OooO00o4.toString();
    }

    public static boolean OooO00o(C7494o0OoOOOo.OooO0O0 oooO0O0) {
        return Boolean.valueOf(OooO00o(oooO0O0, OooO00o)).booleanValue();
    }

    public static String OooO00o(C7494o0OoOOOo.OooO0O0 oooO0O0, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (oooO0O0 == null || str == null || (map = oooO0O0.f20334OooO00o) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
    }

    public String OooO00o(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    private boolean OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String optString = jSONObject.getJSONObject("params").optString(OooOOO0, null);
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            C7515o0Ooo00.OooO00o().m19157OooO00o().OooO00o(optString);
            return true;
        } catch (JSONException e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            return false;
        }
    }

    public C7495o0OoOOo OooO00o(Context context) throws Throwable {
        return OooO00o(context, "");
    }

    public C7495o0OoOOo OooO00o(Context context, String str) throws Throwable {
        return OooO00o(context, str, C7530o0Oooo0.OooO00o(context));
    }

    public C7495o0OoOOo OooO00o(Context context, String str, String str2) throws Throwable {
        return OooO00o(context, str, str2, true);
    }

    public C7495o0OoOOo OooO00o(Context context, String str, String str2, boolean z) throws Throwable {
        C7620o0oOOOoo.OooO0O0("", "PacketTask::request url >" + str2);
        C7500o0OoOo00 o0oooo00 = new C7500o0OoOo00(this.f20702OooO0O0);
        C7495o0OoOOo o0ooooo = new C7495o0OoOOo(OooO0O0(), OooO00o(str, m19371OooO00o()));
        Map<String, String> OooO00o2 = OooO00o(false, str);
        C7501o0OoOo0O OooO00o3 = o0oooo00.OooO00o(o0ooooo, this.f20701OooO00o, OooO00o2.get("iSr"));
        C7494o0OoOOOo.OooO0O0 OooO00o4 = C7494o0OoOOOo.OooO00o(context, new C7494o0OoOOOo.OooO00o(str2, OooO00o(OooO00o3.OooO00o(), str), OooO00o3.m19125OooO00o()));
        if (OooO00o4 != null) {
            C7495o0OoOOo OooO00o5 = o0oooo00.OooO00o(new C7501o0OoOo0O(OooO00o(OooO00o4), OooO00o4.f20335OooO00o), OooO00o2.get("iSr"));
            return (OooO00o5 == null || !OooO00o(OooO00o5.OooO00o()) || !z) ? OooO00o5 : OooO00o(context, str, str2, false);
        }
        throw new RuntimeException("Response is null.");
    }
}
