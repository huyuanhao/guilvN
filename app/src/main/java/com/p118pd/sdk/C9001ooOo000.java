package com.p118pd.sdk;

import com.rxhui.data.core.HttpDelegate;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import okhttp3.Request;

/* renamed from: com.pd.sdk.ooOo000  reason: case insensitive filesystem */
public class C9001ooOo000 {
    public HttpDelegate.HttpMethod OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22305OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Request f22306OooO00o;

    public C9001ooOo000() {
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Request m20664OooO00o() {
        return this.f22306OooO00o;
    }

    public C9001ooOo000(Request request, HttpDelegate.HttpMethod httpMethod, Map<String, String> map) {
        this.f22306OooO00o = request;
        this.OooO00o = httpMethod;
        this.f22305OooO00o = map;
    }

    public void OooO00o(Request request) {
        this.f22306OooO00o = request;
    }

    public HttpDelegate.HttpMethod OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(HttpDelegate.HttpMethod httpMethod) {
        this.OooO00o = httpMethod;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m20663OooO00o() {
        return this.f22305OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20662OooO00o() {
        return OooO00o((Map) this.f22305OooO00o);
    }

    public String OooO00o(Map map) {
        if (map == null || map.isEmpty() || map.size() == 0) {
            return "{}";
        }
        String str = "{";
        for (Map.Entry entry : map.entrySet()) {
            str = (str + "'" + entry.getKey() + "':") + "'" + entry.getValue() + "',";
        }
        return str.substring(0, str.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)) + C7522o0Ooo0o.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20665OooO00o(Map<String, String> map) {
        this.f22305OooO00o = map;
    }
}
