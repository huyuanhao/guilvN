package com.p118pd.sdk;

import com.jinhui365.template.TemplateApplication;
import com.p118pd.sdk.C9048ooOoOOOo;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o0oOo  reason: case insensitive filesystem */
public class C8721oo0o0oOo implements C9048ooOoOOOo.OooO0O0 {
    public static String OooO00o = "timestamp";

    @Override // com.p118pd.sdk.C9048ooOoOOOo.OooO0O0
    public String OooO00o(String str, String str2) {
        return str2;
    }

    @Override // com.p118pd.sdk.C9048ooOoOOOo.OooO0O0
    public Map<String, String> OooO00o(String str, String str2, String str3, String str4, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("params", str2);
        hashMap.put("desc", "e_native");
        LogCollectorManager.sharedInstance().recordDebug(C8720oo0o0oOO.OooO0o, true, (Map<String, String>) hashMap);
        map.put(OooO00o, str4);
        C8720oo0o0oOO.OooO00o(map, TemplateApplication.OooO00o().m15113OooO00o().OooO0o0(str2, str3, C8720oo0o0oOO.OooO00o(map), C8720oo0o0oOO.OooO0oO));
        return map;
    }
}
