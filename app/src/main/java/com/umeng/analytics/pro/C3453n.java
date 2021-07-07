package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.n */
public class C3453n {

    /* renamed from: a */
    public static final int f8762a = 0;

    /* renamed from: b */
    public static final int f8763b = 1;

    /* renamed from: c */
    public static final int f8764c = 2;

    /* renamed from: d */
    public static final int f8765d = 3;

    /* renamed from: e */
    public final long f8766e;

    /* renamed from: com.umeng.analytics.pro.n$a */
    public static class C3455a {

        /* renamed from: a */
        public static final C3453n f8767a = new C3453n();
    }

    /* renamed from: a */
    public static C3453n m8858a() {
        return C3455a.f8767a;
    }

    /* renamed from: c */
    private JSONArray m8861c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3466u.m8916a().mo38796d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3416b.f8489p, currentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void mo38763b(JSONObject jSONObject, Context context) {
        int a = mo38761a(context);
        if (a == 1) {
            if (jSONObject.has(C3416b.f8427K)) {
                jSONObject.remove(C3416b.f8427K);
            }
            if (jSONObject.has(C3416b.f8487n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(C3416b.f8487n);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(C3416b.f8466ar)) {
                            jSONObject2.remove(C3416b.f8466ar);
                        }
                        if (jSONObject2.has(C3416b.f8467as)) {
                            jSONObject2.remove(C3416b.f8467as);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C3437g.m8754a(context).mo38705a(false, true);
        } else if (a == 2) {
            if (jSONObject.has(C3416b.f8427K)) {
                jSONObject.remove(C3416b.f8427K);
            }
            if (jSONObject.has(C3416b.f8487n)) {
                jSONObject.remove(C3416b.f8487n);
            }
            try {
                jSONObject.put(C3416b.f8487n, m8861c());
            } catch (Exception unused2) {
            }
            C3437g.m8754a(context).mo38705a(false, true);
        } else if (a == 3) {
            if (jSONObject.has(C3416b.f8427K)) {
                jSONObject.remove(C3416b.f8427K);
            }
            jSONObject.remove(C3416b.f8487n);
            C3437g.m8754a(context).mo38705a(false, true);
        }
    }

    public C3453n() {
        this.f8766e = 60000;
    }

    /* renamed from: a */
    public int mo38761a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: a */
    private void m8859a(JSONObject jSONObject, boolean z) {
        if (!z && jSONObject.has(C3416b.f8487n)) {
            jSONObject.remove(C3416b.f8487n);
        }
        if (jSONObject.has(C3416b.f8427K)) {
            jSONObject.remove(C3416b.f8427K);
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has(C3416b.f8434R)) {
            jSONObject.remove(C3416b.f8434R);
        }
        if (jSONObject.has(C3416b.f8435S)) {
            jSONObject.remove(C3416b.f8435S);
        }
        if (jSONObject.has(C3416b.f8427K)) {
            jSONObject.remove(C3416b.f8427K);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* renamed from: a */
    public void mo38762a(JSONObject jSONObject, Context context) {
        int a = mo38761a(context);
        if (a == 1) {
            m8859a(jSONObject, true);
            C3437g.m8754a(context).mo38711b(false, true);
        } else if (a == 2) {
            jSONObject.remove(C3416b.f8487n);
            try {
                jSONObject.put(C3416b.f8487n, m8860b());
            } catch (Exception unused) {
            }
            m8859a(jSONObject, true);
            C3437g.m8754a(context).mo38711b(false, true);
        } else if (a == 3) {
            m8859a(jSONObject, false);
            C3437g.m8754a(context).mo38711b(false, true);
        }
    }

    /* renamed from: b */
    private JSONArray m8860b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3466u.m8916a().mo38788a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3416b.f8489p, currentTimeMillis);
            jSONObject.put(C3416b.f8490q, currentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
