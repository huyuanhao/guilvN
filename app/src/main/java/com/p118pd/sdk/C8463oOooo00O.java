package com.p118pd.sdk;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOooo00O  reason: case insensitive filesystem */
public class C8463oOooo00O {
    public static C8463oOooo00O OooO00o = new C8463oOooo00O();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8462oOooo000 f21586OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ConcurrentHashMap<String, C8464oOooo00o> f21587OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile boolean f21588OooO00o = false;
    public volatile boolean OooO0O0 = false;

    public static C8463oOooo00O OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20118OooO00o() {
        C8462oOooo000 ooooo000 = this.f21586OooO00o;
        if (ooooo000 != null) {
            return ooooo000.OooO0O0();
        }
        AbstractC8536oo00OO0O.OooO0O0("ABDataCenter", "getABServerURL(): ABDataCenter needs init first");
        return "";
    }

    public String OooO00o(String str) {
        ConcurrentHashMap<String, C8464oOooo00o> concurrentHashMap = this.f21587OooO00o;
        if (concurrentHashMap == null) {
            AbstractC8536oo00OO0O.OooO0OO("ABDataCenter", "getParamValue(): Experiment data is empty.");
            return "";
        } else if (concurrentHashMap.get(str) != null) {
            return this.f21587OooO00o.get(str).OooO00o();
        } else {
            AbstractC8536oo00OO0O.OooO0OO("ABDataCenter", "getParamValue() : No corresponding value was found.");
            return "";
        }
    }

    public void OooO00o(C8462oOooo000 ooooo000) {
        this.f21586OooO00o = ooooo000;
        this.OooO0O0 = false;
        this.f21588OooO00o = false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20119OooO00o(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("parameters");
        C8464oOooo00o[] ooooo00oArr = new C8464oOooo00o[jSONArray.length()];
        ConcurrentHashMap<String, C8464oOooo00o> concurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("groupId");
            String string2 = jSONObject.getString("key");
            ooooo00oArr[i] = new C8464oOooo00o(jSONObject.getString("value"), string);
            concurrentHashMap.put(string2, ooooo00oArr[i]);
        }
        this.f21587OooO00o = concurrentHashMap;
    }

    public synchronized void OooO00o(boolean z) {
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m20120OooO00o() {
        return this.OooO0O0;
    }

    public String OooO0O0() {
        C8462oOooo000 ooooo000 = this.f21586OooO00o;
        if (ooooo000 != null) {
            return ooooo000.OooO0OO();
        }
        AbstractC8536oo00OO0O.OooO0O0("ABDataCenter", "getUserID(): ABDataCenter needs init first");
        return "";
    }

    public String OooO0O0(String str) {
        String str2;
        ConcurrentHashMap<String, C8464oOooo00o> concurrentHashMap = this.f21587OooO00o;
        if (concurrentHashMap == null) {
            AbstractC8536oo00OO0O.OooO0OO("ABDataCenter", "getGroupID(): Experiment data is empty.");
            return "";
        }
        if (concurrentHashMap.get(str) == null) {
            str2 = "getGroupID: Not found getGroupId from expParamKey";
        } else {
            String OooO0O02 = this.f21587OooO00o.get(str).OooO0O0();
            if (OooO0O02 != null) {
                return OooO0O02;
            }
            str2 = "getGroupID: groupId is null";
        }
        AbstractC8536oo00OO0O.OooO0O0("ABDataCenter", str2);
        return "";
    }

    public synchronized void OooO0O0(boolean z) {
        this.f21588OooO00o = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized boolean m20121OooO0O0() {
        return this.f21588OooO00o;
    }

    public String OooO0OO() {
        C8462oOooo000 ooooo000 = this.f21586OooO00o;
        if (ooooo000 != null) {
            return ooooo000.m20117OooO00o();
        }
        AbstractC8536oo00OO0O.OooO0O0("ABDataCenter", "getSecretKey(): ABDataCenter needs init first");
        return "";
    }
}
