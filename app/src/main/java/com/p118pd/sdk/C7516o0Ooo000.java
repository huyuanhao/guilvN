package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0Ooo000  reason: case insensitive filesystem */
public class C7516o0Ooo000 {
    public static final String OooO = "ty";
    public static final String OooO0OO = "\"&";
    public static final String OooO0Oo = "&";
    public static final String OooO0o = "bizcontext=";
    public static final String OooO0o0 = "bizcontext=\"";
    public static final String OooO0oO = "\"";
    public static final String OooO0oo = "appkey";
    public static final String OooOO0 = "sv";
    public static final String OooOO0O = "an";
    public static final String OooOO0o = "setting";
    public static final String OooOOO = "sdk_start_time";
    public static final String OooOOO0 = "av";
    public static final String OooOOOO = "UTF-8";
    public Context OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20361OooO00o = "";
    public String OooO0O0 = "";

    public C7516o0Ooo000(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f20361OooO00o = packageInfo.versionName;
            this.OooO0O0 = packageInfo.packageName;
            this.OooO00o = context.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    private String OooO0O0(String str) {
        try {
            String OooO00o2 = OooO00o(str, "&", OooO0o);
            if (TextUtils.isEmpty(OooO00o2)) {
                return str + "&" + OooO0O0(OooO0o, "");
            }
            int indexOf = str.indexOf(OooO00o2);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + OooO00o2.length());
            return substring + OooO00o(OooO00o2, OooO0o, "", true) + substring2;
        } catch (Throwable unused) {
            return str;
        }
    }

    private String OooO0OO(String str) {
        try {
            String OooO00o2 = OooO00o(str, OooO0OO, OooO0o0);
            if (TextUtils.isEmpty(OooO00o2)) {
                return str + "&" + OooO0O0(OooO0o0, "\"");
            }
            if (!OooO00o2.endsWith("\"")) {
                OooO00o2 = OooO00o2 + "\"";
            }
            int indexOf = str.indexOf(OooO00o2);
            return str.substring(0, indexOf) + OooO00o(OooO00o2, OooO0o0, "\"", false) + str.substring(indexOf + OooO00o2.length());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19159OooO00o(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (OooO00o(str)) {
            return OooO0O0(str);
        }
        return OooO0OO(str);
    }

    private boolean OooO00o(String str) {
        return !str.contains(OooO0OO);
    }

    private String OooO00o(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    private String OooO0O0(String str, String str2) throws JSONException, UnsupportedEncodingException {
        String OooO00o2 = OooO00o("", "");
        return str + OooO00o2 + str2;
    }

    public String OooO00o(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", C7722o0ooOOO0.OooO0Oo);
            jSONObject.put(OooO, "and_lite");
            jSONObject.put(OooOO0, "h.a.3.6.8");
            if (!this.OooO0O0.contains(OooOO0o) || !C7531o0Oooo0o.m19200OooO0O0(this.OooO00o)) {
                jSONObject.put(OooOO0O, this.OooO0O0);
            }
            jSONObject.put(OooOOO0, this.f20361OooO00o);
            jSONObject.put(OooOOO, System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
            return "";
        }
    }

    private String OooO00o(String str, String str2, String str3, boolean z) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z2 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() < 2 || !substring2.startsWith("\"") || !substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2);
        } else {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z2 = true;
        }
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", C7722o0ooOOO0.OooO0Oo);
        }
        if (!jSONObject.has(OooO)) {
            jSONObject.put(OooO, "and_lite");
        }
        if (!jSONObject.has(OooOO0)) {
            jSONObject.put(OooOO0, "h.a.3.6.8");
        }
        if (!jSONObject.has(OooOO0O) && (!this.OooO0O0.contains(OooOO0o) || !C7531o0Oooo0o.m19200OooO0O0(this.OooO00o))) {
            jSONObject.put(OooOO0O, this.OooO0O0);
        }
        if (!jSONObject.has(OooOOO0)) {
            jSONObject.put(OooOOO0, this.f20361OooO00o);
        }
        if (!jSONObject.has(OooOOO)) {
            jSONObject.put(OooOOO, System.currentTimeMillis());
        }
        String jSONObject2 = jSONObject.toString();
        if (z2) {
            jSONObject2 = "\"" + jSONObject2 + "\"";
        }
        return str2 + jSONObject2 + str3;
    }
}
