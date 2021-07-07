package com.p118pd.sdk;

import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.ParcelableRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OoOoO  reason: case insensitive filesystem */
public class C7503o0OoOoO {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Request f20339OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RequestStatistic f20340OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ParcelableRequest f20341OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20342OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f20343OooO00o;
    public int OooO0O0 = 0;
    public int OooO0OO = 0;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public C7503o0OoOoO(ParcelableRequest parcelableRequest, int i, boolean z) {
        if (parcelableRequest != null) {
            this.f20341OooO00o = parcelableRequest;
            this.OooO0o = i;
            this.f20343OooO00o = z;
            this.f20342OooO00o = o0OOO0OO.OooO00o(parcelableRequest.o0OO00O, i == 0 ? "HTTP" : "DGRD");
            int i2 = parcelableRequest.o0ooOO0;
            this.OooO0Oo = i2 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i2;
            int i3 = parcelableRequest.o0ooOOo;
            this.OooO0o0 = i3 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i3;
            int i4 = parcelableRequest.o00oO0O;
            this.OooO0O0 = (i4 < 0 || i4 > 3) ? 2 : i4;
            HttpUrl OooO0O02 = OooO0O0();
            RequestStatistic requestStatistic = new RequestStatistic(OooO0O02.host(), String.valueOf(parcelableRequest.o0Oo0oo));
            this.f20340OooO00o = requestStatistic;
            requestStatistic.url = OooO0O02.simpleUrlString();
            this.f20339OooO00o = OooO00o(OooO0O02);
            return;
        }
        throw new IllegalArgumentException("request is null");
    }

    private HttpUrl OooO0O0() {
        HttpUrl parse = HttpUrl.parse(this.f20341OooO00o.f14723o0ooOOo);
        if (parse != null) {
            if (!C7348o0O0oo.OooO()) {
                parse.downgradeSchemeAndLock();
            } else if ("false".equalsIgnoreCase(this.f20341OooO00o.OooO00o(C7383o0OOO0O.OooO0o))) {
                parse.lockScheme();
            }
            return parse;
        }
        throw new IllegalArgumentException("url is invalid. url=" + this.f20341OooO00o.f14723o0ooOOo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Request m19127OooO00o() {
        return this.f20339OooO00o;
    }

    public boolean OooO0OO() {
        return C7348o0O0oo.OooO0o0() && !"false".equalsIgnoreCase(this.f20341OooO00o.OooO00o(C7383o0OOO0O.OooO0oO)) && (C7348o0O0oo.m18855OooO00o() || this.OooO0OO == 0);
    }

    public boolean OooO0Oo() {
        return !"false".equalsIgnoreCase(this.f20341OooO00o.OooO00o(C7383o0OOO0O.OooO0Oo));
    }

    public boolean OooO0o0() {
        return "true".equals(this.f20341OooO00o.OooO00o(C7383o0OOO0O.OooO0oo));
    }

    public void OooO00o(Request request) {
        this.f20339OooO00o = request;
    }

    private Request OooO00o(HttpUrl httpUrl) {
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.f20341OooO00o.o0OOO0o).setBody(this.f20341OooO00o.OooO00o).setReadTimeout(this.OooO0o0).setConnectTimeout(this.OooO0Oo).setRedirectEnable(this.f20341OooO00o.f14722OooO0O0).setRedirectTimes(this.OooO00o).setBizId(this.f20341OooO00o.o0Oo0oo).setSeq(this.f20342OooO00o).setRequestStatistic(this.f20340OooO00o);
        requestStatistic.setParams(this.f20341OooO00o.OooO0O0);
        String str = this.f20341OooO00o.o0ooOoO;
        if (str != null) {
            requestStatistic.setCharset(str);
        }
        requestStatistic.setHeaders(m19126OooO00o(httpUrl));
        return requestStatistic.build();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19134OooO0O0() {
        return this.OooO0OO < this.OooO0O0;
    }

    public int OooO00o() {
        return this.OooO0o0 * (this.OooO0O0 + 1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19133OooO00o() {
        return this.f20343OooO00o;
    }

    public String OooO00o(String str) {
        return this.f20341OooO00o.OooO00o(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public HttpUrl m19128OooO00o() {
        return this.f20339OooO00o.getHttpUrl();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19129OooO00o() {
        return this.f20339OooO00o.getUrlString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m19130OooO00o() {
        return this.f20339OooO00o.getHeaders();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Map<String, String> m19126OooO00o(HttpUrl httpUrl) {
        String host = httpUrl.host();
        boolean z = !C0209c.m281a(host);
        if (host.length() > 2 && host.charAt(0) == '[' && host.charAt(host.length() - 1) == ']' && C0209c.m282b(host.substring(1, host.length() - 1))) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f20341OooO00o.f14721OooO00o;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!HttpConstant.HOST.equalsIgnoreCase(key) && !":host".equalsIgnoreCase(key)) {
                    boolean equalsIgnoreCase = "true".equalsIgnoreCase(this.f20341OooO00o.OooO00o(C7383o0OOO0O.OooO0o0));
                    if (!"Cookie".equalsIgnoreCase(key) || equalsIgnoreCase) {
                        hashMap.put(key, entry.getValue());
                    }
                } else if (!z) {
                    hashMap.put(HttpConstant.HOST, entry.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19131OooO00o() {
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        this.f20340OooO00o.retryTimes = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19132OooO00o(HttpUrl httpUrl) {
        ALog.m290i("anet.RequestConfig", "redirect", this.f20342OooO00o, "to url", httpUrl.toString());
        this.OooO00o++;
        this.f20340OooO00o.url = httpUrl.simpleUrlString();
        this.f20339OooO00o = OooO00o(httpUrl);
    }
}
