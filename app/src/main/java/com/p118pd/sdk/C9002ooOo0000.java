package com.p118pd.sdk;

import com.rxhui.data.core.HttpDelegate;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.ooOo0000  reason: case insensitive filesystem */
public class C9002ooOo0000 implements Interceptor {
    public static final String OooO00o = "CommonParamsInterceptor";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8962ooOOo f22307OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8977ooOOoO0O f22308OooO00o;

    public C9002ooOo0000() {
    }

    private C9001ooOo000 OooO0O0(Request request) {
        HttpUrl url = request.url();
        HttpUrl.Builder newBuilder = url.newBuilder();
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < url.querySize(); i++) {
            hashMap.put(url.queryParameterName(i), url.queryParameterValue(i));
            newBuilder.removeAllQueryParameters(url.queryParameterName(i));
        }
        AbstractC8977ooOOoO0O oooooo0o = this.f22308OooO00o;
        if (oooooo0o != null) {
            hashMap = oooooo0o.OooO00o(hashMap);
        }
        for (String str : hashMap.keySet()) {
            String str2 = hashMap.get(str);
            if (str2 == null) {
                str2 = "";
            }
            if (str2.contains("{")) {
                newBuilder.addEncodedQueryParameter(str, URLEncoder.encode(hashMap.get(str)));
            } else {
                newBuilder.addQueryParameter(str, str2);
            }
        }
        return new C9001ooOo000(request.newBuilder().url(newBuilder.build()).build(), HttpDelegate.HttpMethod.GET, hashMap);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8977ooOOoO0O m20666OooO00o() {
        return this.f22308OooO00o;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        RequestBody body;
        Request request = chain.request();
        C9001ooOo000 oooo000 = new C9001ooOo000();
        if (request.method().equals("GET")) {
            oooo000 = OooO0O0(request);
            request = oooo000.m20664OooO00o();
        } else if (request.method().equals("POST") && (body = request.body()) != null && (body instanceof FormBody)) {
            oooo000 = OooO00o(request);
            request = oooo000.m20664OooO00o();
        }
        try {
            Response proceed = chain.proceed(request);
            MediaType contentType = proceed.body().contentType();
            String string = (proceed == null || proceed.body() == null) ? null : proceed.body().string();
            if (this.f22307OooO00o != null) {
                this.f22307OooO00o.OooO00o(oooo000.OooO00o().toString(), oooo000.m20663OooO00o(), proceed.receivedResponseAtMillis() - proceed.sentRequestAtMillis(), proceed.code(), request.url().toString(), string);
            }
            return proceed.newBuilder().body(ResponseBody.create(contentType, string)).build();
        } catch (IOException e) {
            this.f22307OooO00o.OooO00o(e, oooo000.OooO00o().toString(), oooo000.m20663OooO00o(), request.url().toString());
            return null;
        }
    }

    public C9002ooOo0000(AbstractC8977ooOOoO0O oooooo0o, AbstractC8962ooOOo ooooo) {
        this.f22308OooO00o = oooooo0o;
        this.f22307OooO00o = ooooo;
    }

    public void OooO00o(AbstractC8977ooOOoO0O oooooo0o) {
        this.f22308OooO00o = oooooo0o;
    }

    public AbstractC8962ooOOo OooO00o() {
        return this.f22307OooO00o;
    }

    public void OooO00o(AbstractC8962ooOOo ooooo) {
        this.f22307OooO00o = ooooo;
    }

    private C9001ooOo000 OooO00o(Request request) {
        request.url();
        Request.Builder newBuilder = request.newBuilder();
        FormBody formBody = (FormBody) request.body();
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < formBody.size(); i++) {
            hashMap.put(formBody.name(i), formBody.value(i));
        }
        AbstractC8977ooOOoO0O oooooo0o = this.f22308OooO00o;
        if (oooooo0o != null) {
            hashMap = oooooo0o.OooO00o(hashMap);
        }
        FormBody.Builder builder = new FormBody.Builder();
        for (String str : hashMap.keySet()) {
            builder.add(str, hashMap.get(str) == null ? "" : hashMap.get(str));
        }
        return new C9001ooOo000(newBuilder.post(builder.build()).build(), HttpDelegate.HttpMethod.GET, hashMap);
    }
}
