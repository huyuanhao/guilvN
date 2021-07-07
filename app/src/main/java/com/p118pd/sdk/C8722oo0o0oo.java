package com.p118pd.sdk;

import com.jinhui365.template.TemplateApplication;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;

/* renamed from: com.pd.sdk.oo0o0oo  reason: case insensitive filesystem */
public class C8722oo0o0oo implements AbstractC8672oo0OoOOo {
    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public String OooO00o(String str, String str2, String str3) {
        return str;
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO00o(String str, String str2, Map<String, String> map, MultipartBody.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", str2);
        hashMap.put("desc", "b_post_multi");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str3 = "";
            String str4 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str3;
            String str5 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str3;
            if (OooO00o.containsKey("useS")) {
                str3 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0o0(str4, str5, C8720oo0o0oOO.OooO00o(map), str3));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public String OooO0O0(String str, String str2, String str3) {
        return str2;
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO0O0(String str, String str2, String str3, FormBody.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "b_post");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0o(str5, str6, C8720oo0o0oOO.OooO00o(str3), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public String OooO0OO(String str, String str2, String str3) {
        return str3;
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO0OO(String str, String str2, String str3, FormBody.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", str2);
        hashMap.put("desc", "b_post");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0o0(str5, str6, C8720oo0o0oOO.OooO00o(str3), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO0Oo(String str, String str2, String str3, Map<String, String> map, HttpUrl.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "d_get");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO00o(str5, str6, C8720oo0o0oOO.OooO00o(map), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO0O0(String str, String str2, String str3, Map<String, String> map, HttpUrl.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "d_get");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0O0(str5, str6, C8720oo0o0oOO.OooO00o(map), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO00o(String str, String str2, String str3, FormBody.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "b_post");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0o0(str5, str6, C8720oo0o0oOO.OooO00o(str3), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO0OO(String str, String str2, String str3, Map<String, String> map, HttpUrl.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "d_get");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0O0(str5, str6, C8720oo0o0oOO.OooO00o(map), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8672oo0OoOOo
    public boolean OooO00o(String str, String str2, String str3, Map<String, String> map, HttpUrl.Builder builder) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", str2);
        hashMap.put("desc", "d_get");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        try {
            Map<String, Object> OooO00o = C8720oo0o0oOO.m20343OooO00o(str);
            String str4 = "";
            String str5 = OooO00o.containsKey("k") ? (String) OooO00o.get("k") : str4;
            String str6 = OooO00o.containsKey(C3617o.f9366at) ? (String) OooO00o.get(C3617o.f9366at) : str4;
            if (OooO00o.containsKey("useS")) {
                str4 = (String) OooO00o.get("useS");
            }
            C8720oo0o0oOO.OooO00o(builder, TemplateApplication.OooO00o().m15113OooO00o().OooO0o0(str5, str6, C8720oo0o0oOO.OooO00o(map), str4));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
