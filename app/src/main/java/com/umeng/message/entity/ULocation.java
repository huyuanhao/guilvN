package com.umeng.message.entity;

import com.umeng.socialize.handler.UMSSOHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class ULocation {

    /* renamed from: a */
    public String f10155a;

    /* renamed from: b */
    public String f10156b;

    /* renamed from: c */
    public String f10157c;

    /* renamed from: d */
    public String f10158d;

    /* renamed from: e */
    public String f10159e;

    /* renamed from: f */
    public String f10160f;

    /* renamed from: g */
    public String f10161g;

    /* renamed from: h */
    public String f10162h;

    public ULocation(JSONObject jSONObject) {
        try {
            this.f10155a = jSONObject.getString("cenx");
            this.f10156b = jSONObject.getString("ceny");
            JSONObject jSONObject2 = jSONObject.getJSONObject("revergeo");
            this.f10157c = jSONObject2.getString("country");
            this.f10158d = jSONObject2.getString(UMSSOHandler.PROVINCE);
            this.f10159e = jSONObject2.getString(UMSSOHandler.CITY);
            this.f10160f = jSONObject2.getString("district");
            this.f10161g = jSONObject2.getString("road");
            this.f10162h = jSONObject2.getString("street");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getCity() {
        return this.f10159e;
    }

    public String getCountry() {
        return this.f10157c;
    }

    public String getDistrict() {
        return this.f10160f;
    }

    public String getLatitude() {
        return this.f10156b;
    }

    public String getLongitude() {
        return this.f10155a;
    }

    public String getProvince() {
        return this.f10158d;
    }

    public String getRoad() {
        return this.f10161g;
    }

    public String getStreet() {
        return this.f10162h;
    }
}
