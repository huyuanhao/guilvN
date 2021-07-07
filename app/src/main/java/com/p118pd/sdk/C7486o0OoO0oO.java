package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.analytics.pro.C3416b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0OoO0oO  reason: case insensitive filesystem */
public final class C7486o0OoO0oO {
    public static final String OooO = "scheme_pay";
    public static C7486o0OoO0oO OooO00o = null;
    public static final String OooO0O0 = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final int OooO0OO = 3500;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f20311OooO0OO = "alipay_cashier_dynamic_config";
    public static final int OooO0Oo = 10;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f20312OooO0Oo = "timeout";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final boolean f20313OooO0Oo = true;
    public static final int OooO0o = 20000;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f20314OooO0o = "tbreturl";
    public static final int OooO0o0 = 1000;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f20315OooO0o0 = "st_sdk_config";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final boolean f20316OooO0o0 = true;
    public static final String OooO0oO = "launchAppSwitch";
    public static final String OooO0oo = "configQueryInterval";
    public static final String OooOO0 = "scheme_pay_2";
    public static final String OooOO0O = "intercept_batch";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20317OooO00o = 3500;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20318OooO00o = OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<OooO00o> f20319OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20320OooO00o = true;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f20321OooO0O0 = 10;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20322OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f20323OooO0OO = false;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19116OooO0O0() {
        return this.f20322OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19115OooO0O0() {
        return this.f20321OooO0O0;
    }

    /* renamed from: com.pd.sdk.o0OoO0oO$OooO00o */
    public static final class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f20324OooO00o;
        public final String OooO0O0;

        public OooO00o(String str, int i, String str2) {
            this.f20324OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = str2;
        }

        public static OooO00o OooO00o(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new OooO00o(jSONObject.optString(C3416b.f8452ad), jSONObject.optInt(DispatchConstants.VERSION, 0), jSONObject.optString("pk"));
        }

        public String toString() {
            return String.valueOf(OooO00o(this));
        }

        public static List<OooO00o> OooO00o(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                OooO00o OooO00o2 = OooO00o(jSONArray.optJSONObject(i));
                if (OooO00o2 != null) {
                    arrayList.add(OooO00o2);
                }
            }
            return arrayList;
        }

        public static JSONObject OooO00o(OooO00o oooO00o) {
            if (oooO00o == null) {
                return null;
            }
            try {
                return new JSONObject().put(C3416b.f8452ad, oooO00o.f20324OooO00o).put(DispatchConstants.VERSION, oooO00o.OooO00o).put("pk", oooO00o.OooO0O0);
            } catch (JSONException e) {
                C7620o0oOOOoo.m19257OooO00o((Throwable) e);
                return null;
            }
        }

        public static JSONArray OooO00o(List<OooO00o> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (OooO00o oooO00o : list) {
                jSONArray.put(OooO00o(oooO00o));
            }
            return jSONArray;
        }
    }

    /* access modifiers changed from: private */
    public void OooO0O0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f20312OooO0Oo, m19111OooO00o());
            jSONObject.put(f20314OooO0o, m19112OooO00o());
            jSONObject.put(OooO0oo, m19115OooO0O0());
            jSONObject.put(OooO0oO, OooO00o.OooO00o(m19113OooO00o()));
            jSONObject.put(OooOO0, m19114OooO00o());
            jSONObject.put(OooOO0O, m19116OooO0O0());
            C7524o0Ooo0oO.m19175OooO00o(C7515o0Ooo00.OooO00o().m19156OooO00o(), f20311OooO0OO, jSONObject.toString());
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19111OooO00o() {
        int i = this.f20317OooO00o;
        if (i < 1000 || i > 20000) {
            C7620o0oOOOoo.OooO0O0("", "DynamicConfig::getJumpTimeout(default) >3500");
            return 3500;
        }
        C7620o0oOOOoo.OooO0O0("", "DynamicConfig::getJumpTimeout >" + this.f20317OooO00o);
        return this.f20317OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19114OooO00o() {
        return this.f20320OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19112OooO00o() {
        return this.f20318OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<OooO00o> m19113OooO00o() {
        return this.f20319OooO00o;
    }

    public void OooO00o(boolean z) {
        this.f20323OooO0OO = z;
    }

    public static C7486o0OoO0oO OooO00o() {
        if (OooO00o == null) {
            C7486o0OoO0oO o0ooo0oo = new C7486o0OoO0oO();
            OooO00o = o0ooo0oo;
            o0ooo0oo.m19110OooO00o();
        }
        return OooO00o;
    }

    /* access modifiers changed from: private */
    public void OooO0O0(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(f20315OooO0o0);
                if (optJSONObject != null) {
                    this.f20317OooO00o = optJSONObject.optInt(f20312OooO0Oo, 3500);
                    this.f20318OooO00o = optJSONObject.optString(f20314OooO0o, OooO0O0).trim();
                    this.f20321OooO0O0 = optJSONObject.optInt(OooO0oo, 10);
                    this.f20319OooO00o = OooO00o.OooO00o(optJSONObject.optJSONArray(OooO0oO));
                    this.f20320OooO00o = optJSONObject.optBoolean(OooOO0, true);
                    this.f20322OooO0O0 = optJSONObject.optBoolean(OooOO0O, true);
                    return;
                }
                C7620o0oOOOoo.OooO0Oo(C7494o0OoOOOo.OooO00o, "config is null");
            } catch (Throwable th) {
                C7620o0oOOOoo.m19257OooO00o(th);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m19110OooO00o() {
        OooO00o(C7524o0Ooo0oO.OooO00o(C7515o0Ooo00.OooO00o().m19156OooO00o(), f20311OooO0OO, (String) null));
    }

    private void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f20317OooO00o = jSONObject.optInt(f20312OooO0Oo, 3500);
                this.f20318OooO00o = jSONObject.optString(f20314OooO0o, OooO0O0).trim();
                this.f20321OooO0O0 = jSONObject.optInt(OooO0oo, 10);
                this.f20319OooO00o = OooO00o.OooO00o(jSONObject.optJSONArray(OooO0oO));
                this.f20320OooO00o = jSONObject.optBoolean(OooOO0, true);
                this.f20322OooO0O0 = jSONObject.optBoolean(OooOO0O, true);
            } catch (Throwable th) {
                C7620o0oOOOoo.m19257OooO00o(th);
            }
        }
    }

    public void OooO00o(Context context) {
        new Thread(new RunnableC7487o0OoO0oo(this, context)).start();
    }
}
