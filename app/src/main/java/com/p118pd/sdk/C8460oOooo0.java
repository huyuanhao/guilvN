package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOooo0  reason: case insensitive filesystem */
public final class C8460oOooo0 {
    public static C8460oOooo0 OooO00o = new C8460oOooo0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21580OooO00o = 86400000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21581OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8579oo00ooO0 f21582OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f21583OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f21584OooO00o = Executors.newSingleThreadExecutor();

    public static C8460oOooo0 OooO00o() {
        return OooO00o;
    }

    private void OooO00o(C8458oOooOooo oooooooo) {
        C8588oo0O0000 oo0o0000 = new C8588oo0O0000("ABTesting");
        oo0o0000.OooO0OO(new C8573oo00oo(oooooooo.m20113OooO00o()));
        C8582oo00oooO.OooO00o().OooO00o(this.f21581OooO00o);
        C8583oo00oooo.OooO00o().OooO00o(this.f21581OooO00o);
        C8588oo0O0000 OooO00o2 = C8582oo00oooO.OooO00o().OooO00o("ABTesting", oo0o0000);
        if (OooO00o2 != null) {
            oo0o0000 = OooO00o2;
        }
        this.f21582OooO00o = oo0o0000;
        this.f21580OooO00o = ((long) oooooooo.OooO00o().OooO00o()) * 60000;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20114OooO00o() {
        long longValue = ((Long) C8592oo0O00O0.OooO00o(C8592oo0O00O0.OooO00o(this.f21581OooO00o, "abtest"), "expdata_refresh_time", (Object) -1L)).longValue() + this.f21580OooO00o;
        boolean z = longValue == 0 || longValue < Long.valueOf(System.currentTimeMillis()).longValue();
        AbstractC8536oo00OO0O.OooO0O0("ABTestManager", z ? "Achieving Request Cycle" : "Not reaching the request cycle");
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20115OooO00o(C8458oOooOooo oooooooo) {
        String str;
        if (oooooooo == null) {
            str = "ABTestConfig is null,initialization failed";
        } else if (TextUtils.isEmpty(oooooooo.OooO00o().OooO0O0())) {
            str = "URL error ,initialization failed";
        } else if (TextUtils.isEmpty(oooooooo.OooO00o().OooO0OO())) {
            str = "userId error,initialization failed";
        } else if (TextUtils.isEmpty(oooooooo.OooO00o().m20117OooO00o())) {
            str = "secretKey error,initialization failed";
        } else if (oooooooo.m20113OooO00o() != null) {
            return true;
        } else {
            str = "HiAnalytics config is null,initialization failed";
        }
        AbstractC8536oo00OO0O.OooO0Oo("ABTestManager", str);
        return false;
    }

    private void OooO0OO() {
        if (m20114OooO00o()) {
            try {
                this.f21584OooO00o.execute(new RunnableC8467oOooo0OO(this.f21581OooO00o));
            } catch (Exception unused) {
                AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "startSyncTask : This exception was not catch,Exception has happened in thread!");
            }
        } else {
            this.f21584OooO00o.execute(new RunnableC8465oOooo0O(this.f21581OooO00o));
        }
    }

    private void OooO0Oo() {
        if (!C8463oOooo00O.OooO00o().m20121OooO0O0()) {
            C8463oOooo00O.OooO00o().OooO0O0(true);
            if (m20114OooO00o()) {
                AbstractC8536oo00OO0O.OooO0O0("ABTestManager", "syncDataTask(): requesting network...");
                this.f21584OooO00o.execute(new RunnableC8467oOooo0OO(this.f21581OooO00o));
                return;
            }
            C8463oOooo00O.OooO00o().OooO0O0(false);
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("ABTestManager", "Already requesting network, quit.");
    }

    public String OooO00o(String str) {
        if (!C8463oOooo00O.OooO00o().m20120OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "ABTest sdk is not initialized");
            return "";
        }
        String OooO00o2 = C8463oOooo00O.OooO00o().OooO00o(str);
        OooO0Oo();
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20116OooO00o() {
        if (!C8463oOooo00O.OooO00o().m20120OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "onReport : ABTest sdk is not initialized");
            return;
        }
        AbstractC8579oo00ooO0 oo00ooo0 = this.f21582OooO00o;
        if (oo00ooo0 == null) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "instance is null");
        } else {
            oo00ooo0.onReport(0);
        }
    }

    public void OooO00o(int i) {
        if (!C8463oOooo00O.OooO00o().m20120OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "setSyncInterval : ABTest sdk is not initialized");
        } else {
            this.f21580OooO00o = ((long) i) * 60000;
        }
    }

    public void OooO00o(Context context, C8458oOooOooo oooooooo) {
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0Oo("ABTestManager", "context is null,initialization failed!");
        } else if (context.getApplicationContext() == null) {
            AbstractC8536oo00OO0O.OooO0Oo("ABTestManager", "context.getApplicationContext() is null,initialization failed!");
        } else if (m20115OooO00o(oooooooo)) {
            synchronized (this.f21583OooO00o) {
                if (this.f21581OooO00o != null) {
                    AbstractC8536oo00OO0O.OooO0O0("ABTestManager", "SDK has been initialized");
                    return;
                }
                this.f21581OooO00o = context.getApplicationContext();
                OooO00o(oooooooo);
                C8463oOooo00O.OooO00o().OooO00o(oooooooo.OooO00o());
                OooO0OO();
            }
        }
    }

    public void OooO00o(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        if (!C8463oOooo00O.OooO00o().m20120OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "ABTest sdk is not initialized");
        } else if (this.f21582OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "onEvent : instance is null");
        } else {
            if (linkedHashMap == null) {
                AbstractC8536oo00OO0O.OooO0O0("ABTestManager", "onEvent: mapValue is empty!");
                linkedHashMap = new LinkedHashMap<>();
            }
            String OooO0O0 = C8463oOooo00O.OooO00o().OooO0O0(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("groupId", OooO0O0);
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "json exception from getGroupId");
            }
            linkedHashMap.put("experiment", jSONObject.toString());
            String OooO0O02 = C8463oOooo00O.OooO00o().OooO0O0();
            if (!OooO0O02.equals(linkedHashMap.get("userId"))) {
                linkedHashMap.put("userId", OooO0O02);
            }
            this.f21582OooO00o.OooO0OO(str2, linkedHashMap);
        }
    }

    public void OooO0O0() {
        if (!C8463oOooo00O.OooO00o().m20120OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("ABTestManager", "syncExpParameters: ABTest sdk is not initialized");
        } else {
            this.f21584OooO00o.execute(new RunnableC8467oOooo0OO(this.f21581OooO00o));
        }
    }
}
