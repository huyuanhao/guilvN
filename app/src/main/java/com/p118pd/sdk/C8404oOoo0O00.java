package com.p118pd.sdk;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOoo0O00  reason: case insensitive filesystem */
public class C8404oOoo0O00 {
    public static final String OooO = "eventID";
    public static final String OooO0o = "globalID";
    public static final String OooO0oO = "taskID";
    public static final String OooO0oo = "appPackage";
    public static final String OooOO0 = "property";
    public static final String OooOO0O = "messageType";
    public static final String OooOO0o = "eventTime";
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21521OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21522OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o0;

    public C8404oOoo0O00() {
        this.OooO00o = 4096;
        this.f21521OooO00o = System.currentTimeMillis();
    }

    public C8404oOoo0O00(int i, String str, String str2, String str3) {
        this(i, str, null, null, str2, str3);
    }

    public C8404oOoo0O00(int i, String str, String str2, String str3, String str4, String str5) {
        this.OooO00o = 4096;
        this.f21521OooO00o = System.currentTimeMillis();
        OooO0O0(i);
        m20072OooO00o(str);
        OooO0OO(str2);
        OooO0o0(str3);
        OooO0O0(str4);
        OooO0Oo(str5);
    }

    public C8404oOoo0O00(String str, String str2) {
        this(4096, str, null, null, str2, "");
    }

    public C8404oOoo0O00(String str, String str2, String str3) {
        this(4096, str, null, null, str2, str3);
    }

    public static C8404oOoo0O00 OooO00o(String str) {
        C8404oOoo0O00 oooo0o00 = new C8404oOoo0O00();
        try {
            JSONObject jSONObject = new JSONObject(str);
            oooo0o00.OooO0O0(jSONObject.optInt("messageType", 0));
            oooo0o00.m20072OooO00o(jSONObject.optString("appPackage"));
            oooo0o00.OooO0O0(jSONObject.optString("eventID"));
            oooo0o00.OooO0OO(jSONObject.optString("globalID", ""));
            oooo0o00.OooO0o0(jSONObject.optString("taskID", ""));
            oooo0o00.OooO0Oo(jSONObject.optString(OooOO0, ""));
            oooo0o00.OooO00o(jSONObject.optLong(OooOO0o, System.currentTimeMillis()));
            return oooo0o00;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20070OooO00o() {
        return this.f21521OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20071OooO00o() {
        return this.f21522OooO00o;
    }

    public void OooO00o(int i) {
        this.OooO0Oo = String.valueOf(i);
    }

    public void OooO00o(long j) {
        this.f21521OooO00o = j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20072OooO00o(String str) {
        this.f21522OooO00o = str;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0O0(int i) {
        this.OooO00o = i;
    }

    public void OooO0O0(String str) {
        this.OooO0O0 = str;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }

    public void OooO0OO(String str) {
        this.OooO0OO = str;
    }

    public String OooO0Oo() {
        return this.OooO0o0;
    }

    public void OooO0Oo(String str) {
        this.OooO0o0 = str;
    }

    public String OooO0o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("messageType", Integer.valueOf(this.OooO00o));
            jSONObject.putOpt("eventID", this.OooO0O0);
            jSONObject.putOpt("appPackage", this.f21522OooO00o);
            jSONObject.putOpt(OooOO0o, Long.valueOf(this.f21521OooO00o));
            if (!TextUtils.isEmpty(this.OooO0OO)) {
                jSONObject.putOpt("globalID", this.OooO0OO);
            }
            if (!TextUtils.isEmpty(this.OooO0Oo)) {
                jSONObject.putOpt("taskID", this.OooO0Oo);
            }
            if (!TextUtils.isEmpty(this.OooO0o0)) {
                jSONObject.putOpt(OooOO0, this.OooO0o0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String OooO0o0() {
        return this.OooO0Oo;
    }

    public void OooO0o0(String str) {
        this.OooO0Oo = str;
    }
}
