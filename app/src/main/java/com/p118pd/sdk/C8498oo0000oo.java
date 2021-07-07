package com.p118pd.sdk;

import android.text.TextUtils;
import com.umeng.analytics.pro.C3416b;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0000oo  reason: case insensitive filesystem */
public class C8498oo0000oo {
    public C8491oo0000O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8487oo000 f21629OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8500oo000O0 f21630OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21631OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8492oo0000O0[] f21632OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C8498oo0000oo(String str, String str2, String str3) {
        this.f21631OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
    }

    public JSONObject OooO00o() {
        String str;
        if (this.f21632OooO00o == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (this.f21629OooO00o != null) {
                jSONObject.put("header", this.f21629OooO00o.m20169OooO00o());
            }
            if (!(this.f21630OooO00o == null || this.OooO00o == null)) {
                JSONObject OooO00o2 = this.OooO00o.OooO00o();
                OooO00o2.put("properties", this.f21630OooO00o.OooO00o());
                String OooO0o = AbstractC8454oOooOoOo.OooO0o(this.OooO0O0, this.OooO0OO);
                if (!TextUtils.isEmpty(OooO0o)) {
                    OooO00o2.put("events_global_properties", new JSONObject(OooO0o));
                } else {
                    OooO00o2.put("events_global_properties", "");
                }
                jSONObject2.put("events_common", OooO00o2);
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f21632OooO00o.length; i++) {
                jSONArray.put(this.f21632OooO00o[i].OooO0O0());
            }
            jSONObject2.put(C3416b.f8463ao, jSONArray);
            byte[] OooO00o3 = C8523oo00O00O.OooO00o(jSONObject2.toString().getBytes("UTF-8"));
            byte[] OooO00o4 = AbstractC8486oo00.OooO00o();
            jSONObject.put("event", AbstractC8486oo00.OooO00o(OooO00o4, AbstractC8486oo00.OooO00o(this.f21631OooO00o, OooO00o4, OooO00o3)));
        } catch (JSONException unused) {
            str = "event upload data - toJsonObj(): JSON Exception has happen";
            AbstractC8536oo00OO0O.OooO0OO("UploadData", str);
            return jSONObject;
        } catch (UnsupportedEncodingException unused2) {
            str = "getBitZip(): Unsupported coding : utf-8";
            AbstractC8536oo00OO0O.OooO0OO("UploadData", str);
            return jSONObject;
        }
        return jSONObject;
    }

    public void OooO00o(C8491oo0000O oo0000o) {
        this.OooO00o = oo0000o;
    }

    public void OooO00o(C8487oo000 oo000) {
        this.f21629OooO00o = oo000;
    }

    public void OooO00o(C8500oo000O0 oo000o0) {
        this.f21630OooO00o = oo000o0;
    }

    public void OooO00o(List<C8492oo0000O0> list) {
        this.f21632OooO00o = list == null ? null : (C8492oo0000O0[]) list.toArray(new C8492oo0000O0[list.size()]);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8492oo0000O0[] m20178OooO00o() {
        C8492oo0000O0[] oo0000o0Arr = this.f21632OooO00o;
        if (oo0000o0Arr == null) {
            return new C8492oo0000O0[0];
        }
        C8492oo0000O0[] oo0000o0Arr2 = new C8492oo0000O0[oo0000o0Arr.length];
        System.arraycopy(oo0000o0Arr, 0, oo0000o0Arr2, 0, oo0000o0Arr.length);
        return oo0000o0Arr2;
    }
}
