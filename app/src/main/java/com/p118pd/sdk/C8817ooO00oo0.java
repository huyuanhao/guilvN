package com.p118pd.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooO00oo0  reason: case insensitive filesystem */
public class C8817ooO00oo0 {
    public static final String OooO0OO = "name";
    public static final String OooO0Oo = "token";
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22021OooO00o;
    public String OooO0O0;

    public C8817ooO00oo0(int i, String str, String str2) {
        this.OooO00o = i;
        this.f22021OooO00o = str2;
        this.OooO0O0 = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20452OooO00o() {
        return this.OooO00o != 0 && !TextUtils.isEmpty(this.f22021OooO00o) && !TextUtils.isEmpty(this.OooO0O0);
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C8817ooO00oo0 ooo00oo0 = (C8817ooO00oo0) obj;
        if (this.OooO00o != ooo00oo0.OooO00o || !this.f22021OooO00o.equals(ooo00oo0.f22021OooO00o) || !this.OooO0O0.equals(ooo00oo0.OooO0O0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (!m20452OooO00o()) {
            return -1;
        }
        return this.f22021OooO00o.hashCode() + this.OooO0O0.hashCode() + this.OooO00o;
    }

    public String toString() {
        return "type " + this.OooO00o + " tokenName " + this.OooO0O0 + " token " + this.f22021OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20450OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20451OooO00o() {
        return this.f22021OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20449OooO00o(C8817ooO00oo0 ooo00oo0) {
        C8770oo0ooOOo.m20407OooO00o(OooO00o(ooo00oo0));
    }

    public static C8817ooO00oo0 OooO00o() {
        return OooO00o(C8770oo0ooOOo.m20405OooO00o());
    }

    public static String OooO00o(C8817ooO00oo0 ooo00oo0) {
        if (ooo00oo0 != null && ooo00oo0.m20452OooO00o()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", ooo00oo0.OooO0O0);
                jSONObject.put("token", ooo00oo0.f22021OooO00o);
                return ooo00oo0.OooO00o + "+" + jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return "";
    }

    public static C8817ooO00oo0 OooO00o(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(43)) == -1) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            int i = indexOf + 1;
            if (i == str.length()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str.substring(i));
            return new C8817ooO00oo0(parseInt, jSONObject.getString("name"), jSONObject.getString("token"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
