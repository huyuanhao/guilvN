package com.p118pd.sdk;

import android.content.Context;
import com.learnium.RNDeviceInfo.JHDeviceManager;
import com.learnium.RNDeviceInfo.netInfo.NetInfoManager;
import com.rxhui.android_log_sdk.DesensitizationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogLevel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.pd.sdk.ooOO0oOO  reason: case insensitive filesystem */
public class C8917ooOO0oOO {
    public static final String OooO0O0 = "duration";
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LogCategory f22149OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LogLevel f22150OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22151OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22152OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f22153OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Map<String, String> f22154OooO0O0;
    public Map<String, C8906ooOO0Oo> OooO0OO;

    public C8917ooOO0oOO(LogCategory logCategory, String str, long j, long j2, Map<String, String> map, LogLevel logLevel, Map<String, String> map2, Map<String, C8906ooOO0Oo> map3) {
        if (map3 == null) {
            this.OooO0OO = C8908ooOO0OoO.OooO00o().m20548OooO00o();
        } else {
            this.OooO0OO = map3;
        }
        this.f22149OooO00o = logCategory;
        this.f22151OooO00o = str;
        this.OooO00o = j;
        this.f22153OooO0O0 = j2;
        this.f22152OooO00o = map;
        this.f22150OooO00o = logLevel;
        this.f22154OooO0O0 = map2;
    }

    public String OooO00o(Context context) {
        JSONObject jSONObject = new JSONObject();
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        try {
            jSONObject.put("id", C8741oo0oOo0.m20357OooO00o(logParamsManager.OooO0Oo()));
            jSONObject.put("category", this.f22149OooO00o.getValue());
            jSONObject.put(C8912ooOO0o0.OooO0O0, this.f22150OooO00o.getValue());
            jSONObject.put("name", this.f22151OooO00o);
            jSONObject.put(C8912ooOO0o0.OooOO0, C8741oo0oOo0.OooO00o(JHDeviceManager.getDeviceAvailableMemory(context)));
            jSONObject.put(C8912ooOO0o0.OooOO0o, C8741oo0oOo0.OooO00o(JHDeviceManager.getAppCurrentMemory(context)));
            jSONObject.put(C8912ooOO0o0.OooOOoo, NetInfoManager.getInstance().getCarrier(context));
            jSONObject.put(C8912ooOO0o0.OooOo00, NetInfoManager.getInstance().getIpType(context));
            jSONObject.put(C8912ooOO0o0.OooOo0, NetInfoManager.getInstance().getIpAddress());
            jSONObject.put("country", NetInfoManager.getInstance().getCountry());
            jSONObject.put(C8912ooOO0o0.OooOo0o, NetInfoManager.getInstance().getArea());
            jSONObject.put("uid", logParamsManager.OooOO0());
            jSONObject.put(C8912ooOO0o0.Oooo0, logParamsManager.OooO());
            jSONObject.put(C8912ooOO0o0.Oooo0O0, logParamsManager.OooO0oO());
            jSONObject.put(C8912ooOO0o0.Oooo0o, this.OooO00o);
            jSONObject.put(C8912ooOO0o0.Oooo0oO, C8743oo0oOo0O.OooO00o(this.OooO00o, "yyyy.MM.dd HH:mm:ss"));
            jSONObject.put(C8912ooOO0o0.Oooo0OO, this.f22153OooO0O0);
            jSONObject.put(C8912ooOO0o0.Oooo0o0, C8743oo0oOo0O.OooO00o(this.f22153OooO0O0, "yyyy.MM.dd HH:mm:ss"));
            jSONObject.put(C8912ooOO0o0.Oooo, logParamsManager.OooO0O0(this.f22153OooO0O0));
            jSONObject.put(C8912ooOO0o0.OoooO00, logParamsManager.OooO00o());
            jSONObject.put(C8912ooOO0o0.OoooO0, logParamsManager.OooO00o(this.f22153OooO0O0));
            jSONObject.put(C8912ooOO0o0.OoooO0O, logParamsManager.OooO0oo());
            jSONObject.put(C8912ooOO0o0.OoooO, OooO00o(logParamsManager.m20562OooO0O0(), C8908ooOO0OoO.OooO00o().m20548OooO00o()));
            jSONObject.put(C8912ooOO0o0.OoooOO0, logParamsManager.m20561OooO0O0());
            jSONObject.put(C8912ooOO0o0.o000oOoO, OooO00o(logParamsManager.m20558OooO00o(), C8908ooOO0OoO.OooO00o().m20548OooO00o()));
            if (this.f22152OooO00o != null && !this.f22152OooO00o.isEmpty()) {
                for (String str : this.f22152OooO00o.keySet()) {
                    jSONObject.put(str, this.f22152OooO00o.get(str));
                }
            }
            if (this.f22154OooO0O0 != null) {
                jSONObject.put("data", OooO00o(this.f22154OooO0O0, this.OooO0OO));
            }
        } catch (JSONException unused) {
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str2 = LogCollectorManager.TAG;
            }
        } catch (Exception unused2) {
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str3 = LogCollectorManager.TAG;
            }
        }
        return jSONObject.toString();
    }

    private JSONObject OooO00o(Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        Object obj;
        HashMap hashMap = new HashMap();
        if (map == null) {
            return new JSONObject(hashMap);
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            try {
                boolean OooO00o2 = m20568OooO00o((Object) str2);
                Object obj2 = str2;
                if (OooO00o2) {
                    obj2 = new JSONTokener(str2).nextValue();
                }
                if (map2.containsKey(str)) {
                    obj = OooO00o(obj2, map2.get(str));
                } else {
                    obj = OooO00o(obj2);
                }
                if (str.equals("duration")) {
                    hashMap.put(str, Integer.valueOf(C8741oo0oOo0.m20357OooO00o(obj + "")));
                } else {
                    hashMap.put(str, obj + "");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return new JSONObject(hashMap);
    }

    private Object OooO00o(Object obj) {
        Object obj2;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj3 = null;
                try {
                    obj3 = jSONObject.get(next);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.OooO0OO.containsKey(next)) {
                    obj2 = OooO00o(obj3, this.OooO0OO.get(next));
                } else {
                    obj2 = OooO00o(obj3);
                }
                try {
                    jSONObject.put(next, obj2);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return jSONObject;
        } else if (!(obj instanceof JSONArray)) {
            return obj;
        } else {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray2.length(); i++) {
                try {
                    Object obj4 = jSONArray2.get(i);
                    if (m20568OooO00o(obj4)) {
                        obj4 = new JSONTokener((String) obj4).nextValue();
                    }
                    jSONArray.put(i, OooO00o(obj4));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20568OooO00o(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            return C8741oo0oOo0.OooO0Oo(str) && (str.startsWith("{") || str.startsWith("["));
        }
    }

    private Object OooO00o(Object obj, C8906ooOO0Oo oooo0oo) {
        if (oooo0oo != null && oooo0oo.m20542OooO00o() == DesensitizationType.STAR) {
            String str = (String) obj;
            return C8938ooOOOO00.OooO00o(str, oooo0oo.OooO0OO(), str.length() - oooo0oo.OooO00o(), oooo0oo.OooO0O0());
        } else if (obj instanceof JSONObject) {
            return "OBJECT";
        } else {
            if (obj instanceof JSONArray) {
                return "ARRAY";
            }
            return C8741oo0oOo0.OooO0Oo(String.valueOf(obj)) ? "STRING" : obj;
        }
    }
}
