package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.template.TemplateApplication;
import com.jinhui365.util.util.gson.GsonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o0OO0  reason: case insensitive filesystem */
public class C8706oo0o0OO0 {
    public static C8706oo0o0OO0 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21865OooO00o = "production";
    public static final String OooO0O0 = "staging";
    public static final String OooO0OO = "local";
    public static final String OooO0Oo = "template";
    public static final String OooO0o = "web_url";
    public static final String OooO0o0 = "http_urls";
    public static final String OooO0oO = "rn_debug_mode";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21866OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, Object> f21867OooO00o;

    public static C8706oo0o0OO0 OooO00o() {
        if (OooO00o == null) {
            synchronized (C8706oo0o0OO0.class) {
                if (OooO00o == null) {
                    OooO00o = new C8706oo0o0OO0();
                }
            }
        }
        return OooO00o;
    }

    public Map<String, Object> OooO() {
        Map<String, Object> map = (Map) m20327OooO00o().get("weChat");
        return map == null ? new HashMap() : map;
    }

    public String OooO0O0(Context context) {
        return C8742oo0oOo00.m20365OooO00o(context, "JENKINS_BUILD_NUMBER");
    }

    public String OooO0OO(Context context) {
        return C8742oo0oOo00.m20365OooO00o(context, "JENKINS_BUILD_URL");
    }

    public Map<String, Object> OooO0Oo() {
        String str;
        Map<String, Object> OooO0o02 = OooO0o0();
        Iterator<String> it = OooO0o02.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "httpClient";
                break;
            }
            str = it.next();
            Map map = (Map) OooO0o02.get(str);
            if (map.containsKey("isDefault") && ((Boolean) map.get("isDefault")).booleanValue()) {
                break;
            }
        }
        if (OooO0o02.containsKey(str)) {
            return (Map) OooO0o02.get(str);
        }
        return new HashMap();
    }

    public Map<String, Object> OooO0o() {
        Map<String, Object> map = (Map) m20327OooO00o().get("logger");
        return map == null ? new HashMap() : map;
    }

    public Map<String, Object> OooO0o0() {
        Map<String, Object> OooO00o2 = C8724oo0o0ooO.OooO00o((Map) m20327OooO00o().get("httpConfig"), TemplateApplication.OooO00o().m15114OooO00o());
        Map jsonToMap = GsonUtil.jsonToMap(C8643oo0OOo00.OooO00o(this.f21866OooO00o, OooO0Oo, OooO0o0, "{}"), String.class, String.class);
        if (jsonToMap != null && !jsonToMap.isEmpty()) {
            for (String str : jsonToMap.keySet()) {
                String str2 = (String) jsonToMap.get(str);
                if (C8741oo0oOo0.OooO0Oo(str2) && OooO00o2.containsKey(str)) {
                    Map map = (Map) OooO00o2.get(str);
                    if (map.containsKey("baseURL")) {
                        map.put("baseURL", str2);
                    }
                }
            }
        }
        return OooO00o2;
    }

    public Map<String, Object> OooO0oO() {
        Map<String, Object> map = (Map) m20327OooO00o().get("push");
        return map == null ? new HashMap() : map;
    }

    public Map<String, Object> OooO0oo() {
        Map<String, Object> map = (Map) m20327OooO00o().get("support");
        if (map == null) {
            map = new HashMap<>();
        }
        int OooO00o2 = C8643oo0OOo00.OooO00o(this.f21866OooO00o, OooO0Oo, OooO0oO, -1);
        if (-1 != OooO00o2) {
            boolean z = true;
            if (1 != OooO00o2) {
                z = false;
            }
            map.put("rnDebug", Boolean.valueOf(z));
        }
        return map;
    }

    public void OooO0O0(Map<String, Object> map) {
        Map map2 = (Map) m20327OooO00o().get("extension");
        if (map2 == null) {
            map2 = new HashMap();
        }
        map2.put("hotAppConfig", map);
    }

    public Map<String, Object> OooO0OO() {
        Map map = (Map) m20327OooO00o().get("extension");
        if (map == null || !map.containsKey("hotAppConfig")) {
            return new HashMap();
        }
        return (Map) map.get("hotAppConfig");
    }

    public Map<String, Object> OooO0O0() {
        Map<String, Object> map = (Map) m20327OooO00o().get("codeOptions");
        return map == null ? new HashMap() : map;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20328OooO00o(Context context) {
        this.f21866OooO00o = context;
        String OooO00o2 = C8640oo0OOOoo.OooO00o(context, "config/config.json");
        this.f21867OooO00o = C8724oo0o0ooO.OooO00o(GsonUtil.jsonToMap(OooO00o2, String.class, Object.class), GsonUtil.jsonToMap(C8640oo0OOOoo.OooO00o(context, "config/config-" + OooO00o(context) + ".json"), String.class, Object.class));
        String OooO00o3 = C8643oo0OOo00.OooO00o(context, OooO0Oo, OooO0o, "");
        if (C8741oo0oOo0.OooO0Oo(OooO00o3)) {
            this.f21867OooO00o.put("mobileUrl", OooO00o3);
        }
    }

    public String OooO00o(Context context) {
        return C8742oo0oOo00.m20365OooO00o(context, "APP_ENV");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, Object> m20327OooO00o() {
        return this.f21867OooO00o;
    }

    public void OooO00o(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.f21867OooO00o.put("codeOptions", map);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m20326OooO00o() {
        ArrayList arrayList = new ArrayList();
        Map<String, Object> OooO0o02 = OooO0o0();
        for (String str : OooO0o02.keySet()) {
            Map map = (Map) OooO0o02.get(str);
            if (map != null && map.containsKey("useEncrypt") && ((Boolean) map.get("useEncrypt")).booleanValue()) {
                arrayList.add((String) map.get("baseURL"));
            }
        }
        return arrayList;
    }

    public void OooO00o(Map<String, Object> map, String str, int i) {
        C8643oo0OOo00.m20264OooO00o(this.f21866OooO00o, OooO0Oo, OooO0o0, GsonUtil.toJson(map));
        C8643oo0OOo00.m20264OooO00o(this.f21866OooO00o, OooO0Oo, OooO0o, str);
        C8643oo0OOo00.m20262OooO00o(this.f21866OooO00o, OooO0Oo, OooO0oO, i);
    }
}
